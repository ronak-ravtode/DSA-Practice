public class TowerOfHanoi {
    public static void StepForPowerOfHanoi(int n,char s,char h,char d){
        if(n==1){
            System.out.println(s+"->"+d);
            return; 
        }
        StepForPowerOfHanoi(n-1, s, d, h);
        System.out.println(s+"->"+d);
        StepForPowerOfHanoi(n-1, h, s, d);   
    }
    public static void main(String[] args) {
        StepForPowerOfHanoi(3,'A','B','C');
    }
}
