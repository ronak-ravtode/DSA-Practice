import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="heart";
        String str2="earth";
        System.out.println(isAnagram(str1,str2));
    }
}
