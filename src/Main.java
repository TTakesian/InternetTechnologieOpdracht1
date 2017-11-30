import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    private Random random;
    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
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
    /*
        System.out.println("\nOpdracht 1:");
        for (Integer n:algo1){
            long total = 0;
            System.out.println("N="+n+"");
            for (int i = 0; i < 10; i++) {
                //Skip first and last try
                if(i!= 0 || i!= 9){
                    //Add to total
                    total += Opdracht1(n);
                }
            }
            //Calculate average
            System.out.println("Gemiddeld: "+(total/8) + " milliseconden");
        }

        System.out.println("\nOpdracht 2:");
        for (Integer n:algo2){
            long total = 0;
            System.out.println("N="+n+"");
            for (int i = 0; i < 10; i++) {
                //Skip first and last try
                if(i!= 0 || i!= 9){
                    //Add to total
                    total += Opdracht2(n);
                }
            }
            //Calculate average
            System.out.println("Gemiddeld: "+(total/8) + " milliseconden");
        }

        System.out.println("\nOpdracht 3:");
        for (Integer n:algo3){
            long total = 0;
            System.out.println("N="+n+"");
            for (int i = 0; i < 10; i++) {
                //Skip first and last try
                if(i!= 0 || i!= 9){
                    //Add to total
                    total += Opdracht3(n);
                }
            }
            //Calculate average
            System.out.println("Gemiddeld: "+(total/8) + "milliseconden");
        }
*/
    Opdracht1(10);
    }

    /**
     * This function will create an array filled with random numbers, each number is unique and there are no doubles.
     * When generating a random number, the function loops through the array to check if that number already exist, if so
     * then it will repeat the process until there is a generated number that doesn't exist in the array
     * @param n The given array length
     */
    long Opdracht1(int n){
        int[] a = new int[n];
        int number;
        //Start timer
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
            number = (int) (Math.random() * ((n)));
            for (int j = 0; j < a.length; j++) {
                if(i==0){
                    a[i] = number;
                    break;
                }else if (a[j] == number) {
                    if(i!=0){
                        i--;
                    }
                }else {
                    a[i] = number;
                    break;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //Count the time spent
        long duration = (System.currentTimeMillis() - startTime);
        //Print out the duration of the whole process
        System.out.println(duration+" milliseconden");
        return duration;
    }

    /**
     * This function will create an array filled with random numbers, each number will be unique and
     * there are no dupplicates. There is an extra array that is used to check if the random generated number
     * already exists in the array, if so then it will try to generate a random number again and repeat the
     * same process until the random generated number is unique
     * @param n The given array length
     */
    long Opdracht2(int n){
        int[] list = new int[n];
        boolean[] used = new boolean[n];
        //Start the timer
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < n;i++){
            boolean done = false;
            while(!done) {
                int number = (int) (Math.random() * ((n)));

                if(!used[number]){
                    used[number] = true;
                    list[i] = number;
                    done = true;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        //Count the time spent
        long duration = (System.currentTimeMillis() - startTime);
        //Print out the duration of the whole process
        System.out.println(duration+" milliseconden");
        return duration;

    }

    /**
     * This function will create an array and fill it with numbers, when adding each number
     * the added number will be swaped with another position where this position will be lower than its
     * index value and higher than the index value of 0(eg. we add 5, 5 will be swapped with a position between 0 and 5)
     * @param n The given array length
     */
    long Opdracht3(int n){
        int[] list = new int[n];
        //Start the timer
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
            if(list[i] == 0){
                list.add(i);
            }else {
                list.add(i);
                int fag = i - 1;
                int randomIndex = (int) (Math.random() * ((fag)));
                int index2 = i;
                int waarde = list.get(randomIndex);
                int waarde2 = list.get(i);
                list.set(randomIndex,waarde2);
                list.set(index2,waarde);
            }
        }
        //Count the time spent
        long duration = (System.currentTimeMillis() - startTime);
        //From milliseconds to seconds
        //duration = duration / 1000;
        //Print out the duration of the whole process
        System.out.println(duration+"milliseconden");
        return duration;

    }
}
