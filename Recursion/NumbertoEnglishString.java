public class NumbertoEnglishString {
    public static String str[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    public static void NumToString(int n){{
        if(n==0) return;
        NumToString(n/10);
        System.out.print(str[n%10]+" ");
    }}
    public static void main(String[] args) {
        NumToString(1234);
    }
}
