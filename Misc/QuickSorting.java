import java.util.*;

class QuickSort {
    int partition(int intArray[], int low, int high) {
        int pi = intArray[high];
        int i = (low-1);
        for (int j=low; j<high; j++) {

            if (intArray[j] <= pi) {
                i++;

                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }


        int temp = intArray[i+1];
        intArray[i+1] = intArray[high];
        intArray[high] = temp;

        return i+1;
    }



    void quick_sort(int intArray[], int low, int high) {
        if (low < high) {

            int pi = partition(intArray, low, high);


            quick_sort(intArray, low, pi-1);
            quick_sort(intArray, pi+1, high);
        }
    }
}

class QuickSorting {
    public static void main(String args[]) {
        //initialize a numeric array, intArray
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of array elements: ");
        int n=sc.nextInt();

        int intArray[] = new int[n];
        System.out.println("Enter array elements: ");

        for(int i=0;i<n;i++)
        {
            intArray[i]= sc.nextInt();
        }

//        int intArray[] = {4,-1,6,8,0,5,-3};
//        int n = intArray.length;
        //print the original array
        System.out.println("Original Array: " + Arrays.toString(intArray));
        //call quick_sort routine using QuickSort object
        QuickSort obj = new QuickSort();
        obj.quick_sort(intArray, 0, n-1);
        //print the sorted array
        System.out.println("\nSorted Array: " + Arrays.toString(intArray));
    }
}