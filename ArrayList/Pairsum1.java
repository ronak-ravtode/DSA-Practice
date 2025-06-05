import java.util.ArrayList;

public class Pairsum1 {
    public static void PairSum(ArrayList<Integer> list,int i,int j,int target){
        while(i<j){
            if(list.get(i)+list.get(j)==target){
                System.out.println("("+i+", "+j+")");
            }
            if(list.get(i)+list.get(j)<target) i++;
            else j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        PairSum(list,0,list.size()-1,5);
    }
}