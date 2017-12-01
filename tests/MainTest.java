import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    /**
     * Checks if the right array size comes out of algorithm1
     * @throws Exception
     */
    @Test
    public void algorithm1Size() throws Exception {
        int n = 15;
        int[] list = Main.algorithm1(n);
        assert n == list.length;
    }

    /**
     * Checks if the the array comming out of algorithm1 doesnt contain any duplicates
     * @throws Exception
     */
    @Test
    public void algorithm1Duplicates() throws Exception {
        int n = 15;
        int[] list = Main.algorithm1(n);
        boolean doubleFound = false;
        for(int i =0; i < list.length; i++){
            int compare = list[i];
            for(int j = 0; j < list.length; j++){
                if(j != i){
                    if(compare == list[j]){
                        doubleFound = true;
                        break;
                    }
                }
            }
        }
        assert !doubleFound;
    }

    /**
     * Creates 2 arrays using algorithm1 and checks if they are the same
     * @throws Exception
     */
    @Test
    public void algorithm1Same() throws Exception {
        int n = 15;
        int[] list = Main.algorithm1(n);
        int[] list2 = Main.algorithm1(n);
        boolean same = true;
        //Check if both arrays are the same
        for(int i =0; i < list.length; i++){
            if(list[i] != list2[i]){
                same = false;
                break;
            }
        }
        assert !same;
    }


    /**
     * Creates 1 array with algorithm1 and checks if it is not sorted from 1 to n;
     * @throws Exception
     */
    @Test
    public void algorithm1Sorted() throws Exception {
        int n = 15;
        int[] list = Main.algorithm1(n);
        boolean passed = false;
        for(int i =0; i < list.length; i++){
            if(i != list[i]){
                passed = true;
                break;
            }
        }
        assert passed;
    }

    /**
     * Checks if the right array size comes out of algorithm2
     * @throws Exception
     */
    @Test
    public void algorithm2Size() throws Exception {
        int n = 15;
        int[] list = Main.algorithm2(n);
        assert n == list.length;
    }

    /**
     * Checks if the the array comming out of algorithm2 doesnt contain any duplicates
     * @throws Exception
     */
    @Test
    public void algorithm2Duplicates() throws Exception {
        int n = 15;
        int[] list = Main.algorithm2(n);
        boolean doubleFound = false;
        for(int i =0; i < list.length; i++){
            int compare = list[i];
            for(int j = 0; j < list.length; j++){
                if(j != i){
                    if(compare == list[j]){
                        doubleFound = true;
                        break;
                    }
                }
            }
        }
        assert !doubleFound;
    }

    /**
     * Creates 2 arrays using algorithm2 and checks if they are the same
     * @throws Exception
     */
    @Test
    public void algorithm2Same() throws Exception {
        int n = 15;
        int[] list = Main.algorithm2(n);
        int[] list2 = Main.algorithm2(n);
        boolean same = true;
        //Check if both arrays are the same
        for(int i =0; i < list.length; i++){
            if(list[i] != list2[i]){
                same = false;
                break;
            }
        }
        assert !same;
    }

    /**
     * Creates 1 array with algorithm2 and checks if it is not sorted from 1 to n;
     * @throws Exception
     */
    @Test
    public void algorithm2Sorted() throws Exception {
        int n = 15;
        int[] list = Main.algorithm1(n);
        boolean passed = false;
        for(int i =0; i < list.length; i++){
            if(i != list[i]){
                passed = true;
                break;
            }
        }
        assert passed;
    }

    /**
     * Checks if the right array size comes out of algorithm3
     * @throws Exception
     */
    @Test
    public void algorithm3Size() throws Exception {
        int n = 15;
        int[] list = Main.algorithm3(n);
        assert n == list.length;
    }

    /**
     * Checks if the the array comming out of algorithm3 doesnt contain any duplicates
     * @throws Exception
     */
    @Test
    public void algorithm3Duplicates() throws Exception {
        int n = 15;
        int[] list = Main.algorithm3(n);
        boolean doubleFound = false;
        for(int i =0; i < list.length; i++){
            int compare = list[i];
            for(int j = 0; j < list.length; j++){
                if(j != i){
                    if(compare == list[j]){
                        doubleFound = true;
                        break;
                    }
                }
            }
        }
        assert !doubleFound;
    }

    /**
     * Creates 2 arrays using algorithm3 and checks if they are the same
     * @throws Exception
     */
    @Test
    public void algorithm3Same() throws Exception {
        int n = 15;
        int[] list = Main.algorithm3(n);
        int[] list2 = Main.algorithm3(n);
        boolean same = true;
        //Check if both arrays are the same
        for(int i =0; i < list.length; i++){
            if(list[i] != list2[i]){
                same = false;
                break;
            }
        }
        assert !same;
    }

    /**
     * Creates 1 array with algorithm3 and checks if it is not sorted from 1 to n;
     * @throws Exception
     */
    @Test
    public void algorithm3Sorted() throws Exception {
        int n = 15;
        int[] list = Main.algorithm3(n);
        boolean passed = false;
        for(int i =0; i < list.length; i++){
            if(i != list[i]){
                passed = true;
                break;
            }
        }
        assert passed;
    }


}