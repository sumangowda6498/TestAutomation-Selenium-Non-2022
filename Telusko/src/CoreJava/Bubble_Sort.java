package CoreJava;

public class Bubble_Sort {
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

    }
    void printArray(int arr[]){
        int n= arr.length;
        for (int i=0;i<n;++i)
            System.out.println(" "+arr[i]);
    }
    public static void main (String args[])
    {
       Bubble_Sort ob = new Bubble_Sort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.bubbleSort(arr);
        System.out.println("Sorted array using selection sort is");
        ob.printArray(arr);
    }
}
