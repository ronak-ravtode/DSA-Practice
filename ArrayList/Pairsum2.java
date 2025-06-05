import java.util.ArrayList;

public class Pairsum2 {
    public static void PairSum(ArrayList<Integer> list,int lp,int rp,int target){
        int n=list.size();
        int pivot=-1;
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                pivot=i;
            }
        }
        lp=(pivot+1)%n;
        rp=pivot;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println("("+lp+", "+rp+")");
            }
            if(list.get(lp)+list.get(rp)<target) lp=(lp+1)%n;
            else rp=(rp+n-1)%n;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        PairSum(list,0,list.size()-1,16);
    }
}
