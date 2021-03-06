package lab10;

import org.junit.Test;
public class testSelectionSort1 {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort1() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort x=new SelectionSort();
        arr=x.basicSelectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	assert(arr[i]==Sortedarr[i]);
        }
    }

    public void testNegative(){

      int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort x=new SelectionSort();
        arr=x.basicSelectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	assert(arr[i]==Sortedarr[i]);
        }
        
    }

    public void testMixed(){

      int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -8;
        Sortedarr[2] = -2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 9;

        SelectionSort x=new SelectionSort();
        arr=x.basicSelectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	assert(arr[i]==Sortedarr[i]);
        }
    }

    public void testDuplicates(){

      int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -10;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -10;
        Sortedarr[2] = 7;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;

        SelectionSort x=new SelectionSort();
        arr=x.basicSelectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	assert(arr[i]==Sortedarr[i]);
        }
    }
}
