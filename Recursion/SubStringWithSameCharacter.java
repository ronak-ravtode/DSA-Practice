public class SubStringWithSameCharacter {
    public static int SubStringEndsWithSameChar(String str,int i,int j){
        if(i>=str.length()) return 0;
        if(j>=str.length()) return SubStringEndsWithSameChar(str, i+1, i+1);
        return (str.charAt(i)==str.charAt(j) ? 1 : 0) + SubStringEndsWithSameChar(str, i, j+1);
    }
    public static void main(String[] args) {
        System.out.println(SubStringEndsWithSameChar("abcab",0,0));
    }
}
