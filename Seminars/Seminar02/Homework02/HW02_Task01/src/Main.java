// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class Main {
    public static void main(String[] args) {
        get_game_algorim('A', 'B', 'C', 3);
    }

    static void get_game_algorim(char A, char B, char C, int n) {
        if(n > 0) {
            get_game_algorim(A, C, B,n-1);
            System.out.println("Переложить с " + A + " на " + B);
            get_game_algorim(C, B, A,n-1);
        }
    }
}