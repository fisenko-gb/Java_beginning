import java.util.ArrayList;

public class Main {

    static void myadd (ArrayList<Integer> t_array, int item){

        t_array.add(item);

    }
    static void myremove(ArrayList<Integer> t_array){
        t_array.remove(0);
    }
    public static void main(String[] args) {

        ArrayList<Integer> t_array = new ArrayList<Integer>();

        myadd(t_array, 2);
        System.out.println(t_array);
        myadd(t_array, 12);
        System.out.println(t_array);
        myadd(t_array,1);
        System.out.println(t_array);

        myremove(t_array);
        System.out.println(t_array);
        myremove(t_array);
        System.out.println(t_array);

        myadd(t_array, 14);
        System.out.println(t_array);

    }
}