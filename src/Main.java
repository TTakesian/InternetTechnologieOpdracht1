import java.util.ArrayList;
import java.util.Random;

public class Main {
    private Random random;
    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        Opdracht1(10);
        Opdracht2(10);
        Opdracht3(10);
    }

    /**
     * This function will create an array filled with random numbers, each number is unique and there are no doubles.
     * When generating a random number, the function loops through the array to check if that number already exist, if so
     * then it will repeat the process until there is a generated number that doesn't exist in the array
     * @param n The given array length
     */
    void Opdracht1(int n){
        ArrayList<Integer> a = new ArrayList<>();
        int number;
        for (int i = 0; i < n-1; i++) {
            number = (int) (Math.random() * ((n)));
            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) == number) {
                    i--;
                }else {
                    a.add(i);
                }
            }
        }
    }

    /**
     * This function will create an array filled with random numbers, each number will be unique and
     * there are no doubles. There is an extra array that is used to check if the random generated number
     * already exists in the array, if so then it will try to generate a random number again and repeat the
     * same process until the random generated number is unique
     * @param n The given array length
     */
    void Opdracht2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> used = new ArrayList<>();
        for(int i = 0; i < n - 1; i++){
            used.add(false);
        }
        for(int i = 0; i < n - 1 ;i++){
            boolean done = false;
            while(!done) {
                int number = (int) (Math.random() * ((n)));
                int index = number - 1;
                if(number ==0){
                    index = 0;
                }
                if(!used.get(index)){
                    used.set(index, true);
                    list.add(number);
                    done = true;
                }
            }
            System.out.print(i);
        }
        System.out.print("done");
    }

    /**
     * This function will create an array and fill it with numbers, when adding each number
     * the added number will be swaped with another position where this position will be lower than its
     * index value and higher than the index value of 0(eg. we add 5, 5 will be swapped with a position between 0 and 5)
     * @param n The given array length
     */
    void Opdracht3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            if(list.size() == 0){
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
        for (Integer integer : list){
            System.out.println(integer);
        }
    }
}
