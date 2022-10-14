public class Main {
    public static void main(String[] args) {

        byte a = 1;
        byte b = 7;
        byte c = 2;
        byte d = 1;
        int rez_temp = a;

        String rezult = null;

        while (rez_temp <= b){
            rez_temp = multiply(rez_temp, c);
            rezult = rezult + "k1";

            if (rez_temp == b){
                break;
            }

            rez_temp = addition(rez_temp, d);
            rezult = rezult + "k2";
            if (rez_temp == b){
                break;
            }
        }



        System.out.println(rezult);

    }

    public static int multiply(int a, int c){
        return a * c;
    }

    public static int addition(int a, int c){
        return a + c;
    }
}