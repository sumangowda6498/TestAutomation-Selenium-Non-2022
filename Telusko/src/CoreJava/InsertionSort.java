package CoreJava;

public class InsertionSort {
    void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int j=i-1;
            int temp;


            while (j >= 0 && arr[j] > arr[j+1]) {
                temp=arr[j+1];
                arr[j + 1] = arr[j];
                arr[j]=temp;
                j = j - 1;
            }
        }
    }
/*
void sort(int arr[])
{
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;


        while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
    }
    arr[j + 1] = key;
}
}
*/


    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
}

/*

*procedure insertionSort(A: list of sortable items)
   n = length(A)
   for i = 1 to n - 1 do  i=3
       j = i
       while j > 0 and A[j-1] > A[j] do
           swap(A[j], A[j-1])
           j = j - 1
       end while
   end for
end procedure
*
* 5
* 11
* 12
* 13
* 6
*
*Basically, Insertion sort is efficient for small data values
*
*
*
*
*
*
*
*
*  */
