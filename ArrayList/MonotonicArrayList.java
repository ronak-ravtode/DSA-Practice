import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)) dec=false;
            if(list.get(i)>list.get(i+1)) inc=false;
        }
        return inc||dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(isMonotonic(list));
    }
}
