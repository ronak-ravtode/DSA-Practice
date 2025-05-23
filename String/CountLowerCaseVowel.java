public class CountLowerCaseVowel {
    public static int CountLowercase(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a') count++;
            else if(str.charAt(i)=='e') count++;
            else if(str.charAt(i)=='i') count++;
            else if(str.charAt(i)=='o') count++;
            else if(str.charAt(i)=='u') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Ronak Ravtode";
        System.out.println(CountLowercase(str));
    }
}
