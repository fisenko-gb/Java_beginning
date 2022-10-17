// Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class Main {
    public static void main(String[] args) {
        int arr[] = {17, 22, 3, 11, 1, 55, 4};
        System.out.print("Исходный массив: ");
        printArr(arr);

        int rez[] = heap_sort(arr);
        System.out.print("Отсортированный массив: ");
        printArr(arr);
    }

    public static int[] heap_sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            regrouping(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            regrouping(arr, i, 0);
        }
        return arr;
    }

    public static void regrouping(int arr[], int n, int i)
    {
        int max = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[max])
            max = left;

        if (right < n && arr[right] > arr[max])
            max = right;

        if (max != i)
        {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;

            regrouping(arr, n, max);
        }
    }
    static void printArr(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}