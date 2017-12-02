import java.util.*;

public class Main {


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            int n = 0;
            System.out.println("Enter the array size");
            boolean correctN = false;
            //Choose the array size
            while (!correctN) {
                try {
                    n = scanner.nextInt();
                    correctN = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Please enter a number");
                    scanner = new Scanner(System.in);
                }
            }
            int algorithmChoice = 0;
            boolean choice = false;
            //Choose the algorithm
            while (!choice) {
                try {
                    System.out.println("Please choose which algorithm you want to use" + "\n"
                            + "1. algorithm1" + "\n"
                            + "2. algorithm2" + "\n"
                            + "3. algorithm3");
                    algorithmChoice = scanner.nextInt();
                    if (algorithmChoice > 0 && algorithmChoice < 4) {
                        choice = true;
                    } else {
                        System.out.println("Please choose a correct algorithm");
                    }
                } catch (InputMismatchException ex) {
                    scanner = new Scanner(System.in);
                    System.out.println("Please enter a number");
                }
            }
            //Check the length
            checkLength(algorithmChoice, n);
            System.out.println("Algorithm done. If you want to continue enter: 1. If you want to stop enter: 0");
            int goOn = -1;
            boolean choiceMade = false;
            //Decide if the user wants to continue
            while (!choiceMade) {
                try {
                    goOn = scanner.nextInt();
                    choiceMade = true;
                } catch (InputMismatchException ex) {
                    scanner = new Scanner(System.in);
                    System.out.println("Please enter a number");
                }
            }
            if (goOn == 0) {
                exit = true;
            }
        }
    }



        /**
         * This function will create an array filled with random numbers, each number is unique and there are no doubles.
         * When generating a random number, the function loops through the array to check if that number already exist, if so
         * then it will repeat the process until there is a generated number that doesn't exist in the array
         *
         * @param n The given array length
         */
        public static int[] algorithm1 ( int n){
            int[] a = new int[n];
            int number;
            boolean zeroUsed = false;
            for (int i = 0; i < a.length; i++) {
                number = (int) (Math.random() * ((n)));
                boolean done = false;
                while (!done) {
                    for (int j = 0; j < a.length; j++) {
                        if (a[j] == number) {
                            if (number == 0 && !zeroUsed) {
                                done = true;
                                //0 can only be used once
                                zeroUsed = true;
                                a[i] = number;
                                j = a.length - 1;
                            } else {
                                number = (int) (Math.random() * ((n)));
                                j = -1;
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
     * Looks for the average length with of given algorithm with given array size
     * @param choice the algorithm that will create the array
     * @param n the array size
     */
    private void checkLength(int choice, int n) {
        long total = 0;
        System.out.println("N=" + n + "");
        for (int i = 0; i < 10; i++) {
            long startTime = System.currentTimeMillis();
            if (choice == 1) {
                algorithm1(n);
            } else if (choice == 2) {
                algorithm2(n);
            } else if (choice == 3) {
                algorithm3(n);
            }
            //Add to total
            long duration = (System.currentTimeMillis() - startTime);
            if (i != 0 && i != 9) {
                total += duration;
            }
            //Print out the duration of the whole process
            System.out.println(duration + " milliseconds");

        }
        //Calculate average
        System.out.println("Average: " + (total / 8) + " milliseconds");


    }

    /**
     * This function will create an array filled with random numbers, each number will be unique and
     * there are no dupplicates. There is an extra array that is used to check if the random generated number
     * already exists in the array, if so then it will try to generate a random number again and repeat the
     * same process until the random generated number is unique
     *
     * @param n The given array length
     */
    public static int[] algorithm2(int n) {
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
    public static int[] algorithm3(int n) {
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            if (i > 0) {
                list[i] = i;
                int max = i - 1;
                int randomIndex = (int) (Math.random() * ((max)));
                int waarde = list[randomIndex];
                int waarde2 = list[i];
                list[randomIndex] = waarde2;
                list[i] = waarde;
            }
        }

        return list;
    }


}
