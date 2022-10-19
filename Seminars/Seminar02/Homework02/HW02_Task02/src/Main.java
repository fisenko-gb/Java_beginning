// Реализовать алгоритм сортировки вставками

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 10, 1, 3, 7, -3, 18, 6};
        print_array(arr);
        arr = sort_insert(arr);
        print_array(arr);
    }

    static int[] sort_insert(int[] ar){
        for (int i = 1; i < ar.length; i++){
            int k = i;
            while (k != 0 && ar[k-1] > ar[k]){
                int temp = ar[k-1];
                ar[k-1] = ar[k];
                ar[k] = temp;
                k -= 1;
            }
        }
        return ar;
    }

    static void print_array(int [] ar){
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
    }
}