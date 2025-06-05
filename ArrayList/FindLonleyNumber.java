import java.util.ArrayList;
import java.util.Collections;

public class FindLonleyNumber {
    public static ArrayList<Integer> LonelyNumber(ArrayList<Integer> nums){
        Collections.sort(nums);
        int n=nums.size();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(nums.get(i-1)+1<nums.get(i) && nums.get(i)+1<nums.get(i+1)){
                list.add(nums.get(i));
            }
        }
        if(n==1){
            list.add(nums.get(0));
        }
        if(n>1){
            if(nums.get(0)+1<nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(n-2)+1<nums.get(n-1)){
                list.add(nums.get(n-1));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(LonelyNumber(nums));
    }
}
