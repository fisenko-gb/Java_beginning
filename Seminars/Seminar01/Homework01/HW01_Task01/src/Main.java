// Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        scan.close();

        int rez = triangular_numbers(number);

        System.out.println("Число " + rez + ", является " + number + "-м треугольным");
    }

    public static int triangular_numbers(int n) {
        if(n==1)
        return 1;
    else
        return( n + triangular_numbers(n-1) );
    }
}