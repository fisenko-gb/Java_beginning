public class Main {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 7;
        int d1 = 3;
        int d2 = 1;

        String rez1 = var_1(n1, n2, d1, d2);
        String rez2 = var_2(n1, n2, d1, d2);

        if(rez1 == "" && rez2 == "") {
            System.out.println("Не возможно..");
        }else if(rez1 != "" && rez1.length() < rez2.length()) {
            System.out.println(rez1);
        }else{
            System.out.println(rez2);
        }
    }

    static String var_1(int n1, int n2,int d1, int d2) {

        String rez = "";
        int rez_umn = n1;
        int temp_umn = n1;
        while (temp_umn <= n2) {
            temp_umn *= d1;
            if (temp_umn <= n2) {
                rez_umn = temp_umn;
                rez += "k1,";
            }
        }


        if (rez_umn == n2) {
            return rez;
        }

        int rez_sl = rez_umn;
        while (rez_sl < n2) {
            rez_sl += d2;
            rez += "k2,";
        }

        if (rez_sl != n2) {
            return "";
        }
        else{
                return rez;
            }
        }

    static String var_2(int n1, int n2,int d1, int d2) {

        String rez = "";
        n1 += d2;
        rez += "k2,";
        //rez
        int rez_umn = n1;
        int temp_umn = n1;
        while (temp_umn <= n2) {
            temp_umn *= d1;
            if (temp_umn <= n2) {
                rez_umn = temp_umn;
                rez += "k1,";
            }
        }

        if (rez_umn == n2){
            return rez;
        }

        int rez_sl = rez_umn;
        while (rez_sl < n2) {
            rez_sl += d2;
            rez += "k2,";
        }

        if (rez_sl != n2) {
            return "";
        }else{
            return rez;
        }
    }
}

