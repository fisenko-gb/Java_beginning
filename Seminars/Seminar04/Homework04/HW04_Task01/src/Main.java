public class Main {
    public static void main(String[] args) {

        int[] t_array = {7, 6, 3, 1, 3 , 2, 1};
        System.out.println("Исходный массив: ");
        print_array(t_array);
        System.out.println("Отсортированный массив: ");
        quickSort(t_array,0, t_array.length - 1);
        print_array(t_array);

    }
    public static void print_array(int[] t_array){
        for (int j : t_array) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
    public static void quickSort(int[] t_array, int leftLimit, int rightLimit) {
        int temp_leftLimit = leftLimit;
        int temp_rightLimit = rightLimit;
        int current = t_array[(temp_leftLimit + temp_rightLimit) / 2];
        do {
            while (t_array[temp_leftLimit] < current) {
                temp_leftLimit++;
            }

            while (t_array[temp_rightLimit] > current) {
                temp_rightLimit--;
            }

            if (temp_leftLimit <= temp_rightLimit) {

                if (temp_leftLimit < temp_rightLimit) {
                    int tmp = t_array[temp_leftLimit];
                    t_array[temp_leftLimit] = t_array[temp_rightLimit];
                    t_array[temp_rightLimit] = tmp;
                }

                temp_leftLimit++;
                temp_rightLimit--;
            }
        } while (temp_leftLimit <= temp_rightLimit);


        if (temp_leftLimit < rightLimit) {
            quickSort(t_array, temp_leftLimit, rightLimit);
        }
        if (leftLimit < temp_rightLimit) {
            quickSort(t_array, leftLimit, temp_rightLimit);
        }
    }
}