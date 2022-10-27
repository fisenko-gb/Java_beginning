import java.util.ArrayList;

public class Main {
    static int[][] pole;
    static int number_steps = 1;
    static Сoordinates T_starta = new Сoordinates();
    static Сoordinates T_finish = new Сoordinates();
    static ArrayList<Сoordinates> queue = new ArrayList<Сoordinates>();
    static ArrayList<Сoordinates> copy_queue = new ArrayList<Сoordinates>();
    public static void main(String[] args) {
        int num_start = -5;
        int num_finish = -7;
        int num_wall = -1;
        pole = get_matrix(); // создаем лабиринт

        print_matrix(pole, num_start, num_finish, num_wall);

        wave(num_start, num_finish, num_wall); // запускаем волновой алгоритм

        System.out.println();

        print_matrix(pole, num_start, num_finish, num_wall);
    }
    static int[][] get_matrix(){
        int[][] pole = new int[][]{
                {0, 0,  0,  0,  0, -1,  0, 0, 0, 0},
                {0, 0, -1,  0,  0, -1,  0, 0, 0, 0},
                {0, 0, -1, -1,  0,  0,  0, 0, 0, 0},
                {0, 0, -1, -1, -1, -1,  0, 0, 0, 0},
                {0, -5, -1, -1, -1,  0,  0, 0, -7, 0},
                {0, 0, -1, -1, -1, -1, -1, 0, 0, 0},
                {0, 0, -1, -1, -1,  0,  0, 0, 0, 0},
                {0, 0, -1, -1,  0,  0,  0, 0, 0, 0},
                {0, 0, -1,  0,  0,  -1, 0, 0, 0, 0},
                {0, 0,  0,  0,  0,  -1, 0, 0, 0, 0}
        };
        return pole;
    }
    static void print_matrix(int[][] arr, int start, int finish, int wall){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == 0){
                    System.out.printf("▒▒▒");
                } else if (arr[i][j] == wall) {
                    System.out.printf("███");
                } else if (arr[i][j] == finish) {
                    System.out.printf("╳╳╳");
                } else if (arr[i][j] == start) {
                    System.out.printf("╪╪╪");

                } else {
                    System.out.printf("%d ", arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    static void wave(int start, int finish, int wall){
        int k, m;
        find_point(T_starta, start);
        find_point(T_finish, finish);

        queue.add(T_starta);

        while (queue.size() != 0){ // пока в очереди есть элементы
            copy_queue.clear(); // очищаем копию очереди
            copy_queue.addAll(0, queue); // копируем очередь с координатами в копию
            queue.clear(); // очищаем очередь для новых координат
            for (int i = 0; i < copy_queue.size(); i++){ // обходим каждую точку из копии очереди и проверяем ее соседей

                Сoordinates Temp_point = copy_queue.get(i);
                k = Temp_point.i;
                m = Temp_point.j;

                if (k > 0){
                    step_left(k, m);
                }
                if (k < pole.length-1){
                    step_right(k, m);
                }
                if (m > 0){
                    step_up(k, m);
                }
                if (m < pole[m].length-1){
                    step_down(k, m);
                }
            }
            number_steps += 1;
        }
    }
    static void find_point(Сoordinates N_point, int number){
        boolean flag = true;
        for (int i = 0; i < pole.length; i++){
            if (flag){
                for (int j = 0; j < pole[i].length; j++) {
                    if (pole[i][j] == number) {
                        N_point.i = i;
                        N_point.j = j;
                        flag = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
    }
    static void step_left(int i, int j){
        if (pole[i - 1][j] == 0) {// идем налево
            pole[i - 1][j] = number_steps;
            queue.add(new Сoordinates(i-1,j));
        }
    }
    static void step_right(int i, int j){
        if (pole[i + 1][j] == 0) {// идем направо
            pole[i + 1][j] = number_steps;
            queue.add(new Сoordinates(i+1,j));
        }
    }
    static void step_up(int i, int j){
        if (pole[i][j - 1] == 0) {// идем вверх
            pole[i][j - 1] = number_steps;
            queue.add(new Сoordinates(i,j-1));
        }
    }
    static void step_down(int i, int j){
        if (pole[i][j+1] == 0) {// идем вниз
            pole[i][j+1] = number_steps;
            queue.add(new Сoordinates(i,j+1));
        }
    }
}

class Сoordinates{
    int i, j;
    Сoordinates()
    {
        this.i = -1;
        this.j = -1;
    }
    Сoordinates(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
}