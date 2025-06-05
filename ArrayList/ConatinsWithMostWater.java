import java.util.ArrayList;

public class ConatinsWithMostWater {
    public static int ContainMostWater(ArrayList<Integer> list,int i,int j){
        int maxWater=0;
        while(i<j){
            int water=(j-i) * Math.min(list.get(i),list.get(j));
            maxWater=Math.max(maxWater,water);
            if(list.get(i)<list.get(j)) i++;
            else j--;
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(ContainMostWater(list,0,list.size()-1));
    }
}
