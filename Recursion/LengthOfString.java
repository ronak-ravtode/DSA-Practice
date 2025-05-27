public class LengthOfString {
    public static int Length(String str){
        if(str.length()==0){
            return 0;
        }
        return Length(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(Length("ronak"));
    }
}
