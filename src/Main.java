import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private Random random;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        /*
        System.out.println("Checking algorithm1");
        arrayChecker(algorithm1(15), algorithm1(15));
        System.out.println("Checking algorithm2");
        arrayChecker(algorithm2(15), algorithm2(15));
        System.out.println("Checking algorithm3");
        arrayChecker(algorithm3(15), algorithm3(15));
        */
        ArrayList<Integer> algo1 = new ArrayList();
        algo1.add(5000);
        algo1.add(10000);
        algo1.add(20000);
        algo1.add(50000);
        algo1.add(100000);
        algo1.add(200000);
        ArrayList<Integer> algo2 = new ArrayList();
        algo2.add(100000);
        algo2.add(200000);
        algo2.add(500000);
        algo2.add(1000000);
        algo2.add(5000000);
        algo2.add(10000000);
        ArrayList<Integer> algo3 = new ArrayList();
        algo3.add(2000000);
        algo3.add(5000000);
        algo3.add(10000000);
        algo3.add(20000000);
        algo3.add(50000000);
        algo3.add(100000000);

        System.out.println("\nOpdracht 1:");
        for (Integer n:algo1){
            long total = 0;
            System.out.println("N="+n+"");
            for (int i = 0; i < 10; i++) {
                long startTime = System.currentTimeMillis();
                algorithm1(n);
                //Add to total
                long duration = (System.currentTimeMillis() - startTime);
                if(i!= 0 || i!= 9) {
                    total += duration;
                }
                //Print out the duration of the whole process
                System.out.println(duration + " milliseconden");

            }
            //Calculate average
            System.out.println("Gemiddeld: "+(total/8) + " milliseconden");
        }

        System.out.println("\nOpdracht 2:");
        for (Integer n:algo2){
            long total = 0;
            System.out.println("N="+n+"");
            for (int i = 0; i < 10; i++) {
                long startTime = System.currentTimeMillis();
                algorithm2(n);
                //Add to total
                long duration = (System.currentTimeMillis() - startTime);
                if(i!= 0 || i!= 9) {
                    total += duration;
                }
                //Print out the duration of the whole process
                System.out.println(duration + " milliseconden");
            }
            //Calculate average
            System.out.println("Gemiddeld: "+(total/8) + " milliseconden");
        }

        System.out.println("\nOpdracht 3:");
        for (Integer n:algo3){
            long total = 0;
            System.out.println("N="+n+"");
            for (int i = 0; i < 10; i++) {
                long startTime = System.currentTimeMillis();
                algorithm3(n);
                long duration = (System.currentTimeMillis() - startTime);
                if(i!= 0 || i!= 9) {
                    total += duration;
                }
                System.out.println(duration + " milliseconden");
            }
            //Calculate average
            System.out.println("Gemiddeld: "+(total/8) + "milliseconden");
        }
    }

    /**
     * This function will create an array filled with random numbers, each number is unique and there are no doubles.
     * When generating a random number, the function loops through the array to check if that number already exist, if so
     * then it will repeat the process until there is a generated number that doesn't exist in the array
     *
     * @param n The given array length
     */
    int[] algorithm1(int n) {
        int[] a = new int[n];
        int number;
        boolean zeroUsed = false;
        //Start timer
        for (int i = 0; i < a.length; i++) {
            number = (int) (Math.random() * ((n)));
            boolean done = false;
            while (!done) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == number) {
                        if (number == 0 && !zeroUsed) {
                            done = true;
                            zeroUsed = true;
                            a[i] = number;
                            j = a.length - 1;
                        } else {
                            j = 0;
                            number = (int) (Math.random() * ((n)));
                        }
                    } else if (j == a.length - 1) {
                        a[i] = number;
                        done = true;
                    }
                }
            }
        }

        return a;
    }

    /**
     * This function will create an array filled with random numbers, each number will be unique and
     * there are no dupplicates. There is an extra array that is used to check if the random generated number
     * already exists in the array, if so then it will try to generate a random number again and repeat the
     * same process until the random generated number is unique
     *
     * @param n The given array length
     */
    int[] algorithm2(int n) {
        int[] list = new int[n];
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            boolean done = false;
            while (!done) {
                int number = (int) (Math.random() * ((n)));
                if (!used[number]) {
                    used[number] = true;
                    list[i] = number;
                    done = true;
                }
            }
        }
        return list;

    }

    /**
     * This function will create an array and fill it with numbers, when adding each number
     * the added number will be swaped with another position where this position will be lower than its
     * index value and higher than the index value of 0(eg. we add 5, 5 will be swapped with a position between 0 and 5)
     *
     * @param n The given array length
     */
    int[] algorithm3(int n) {
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            if(i > 0){
                list[i] = i;
                int fag = i - 1;
                int randomIndex = (int) (Math.random() * ((fag)));
                int index2 = i;
                int waarde = list[randomIndex];
                int waarde2 = list[i];
                list[randomIndex] = waarde2;
                list[index2] = waarde;
            }
        }

        return list;
    }

    private void arrayChecker(int[] list, int[] list2){

        boolean same = true;
        //Check if both arrays are the same
        for(int i =0; i < list.length; i++){
            if(list[i] != list2[i]){
                same = false;
                break;
            }
        }
        if(same){
            System.out.println("Bad algorithm. Both arrays are the same.");
        }
        //Check if the arrays are sorted from 0 to n - 1
        int passed = 0;
        for(int i =0; i < list.length; i++){
           if(i != list[i]){
               passed++;
               break;
           }
        }
        for(int i =0; i < list2.length; i++){
            if(i != list2[i]){
                passed++;
                break;
            }
        }
        if(passed != 2){
            System.out.println("Bad algorithm. array is sorted from 0 to n - 1");
        }
        //Tell the user the Algorithm worked
        if(passed == 2 && !same) {
            System.out.println("Algorithm succeeded. list1:" + Arrays.toString(list) + " list2:" + Arrays.toString(list2));
        }

    }



}
