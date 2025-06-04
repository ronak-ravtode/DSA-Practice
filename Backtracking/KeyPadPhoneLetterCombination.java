public class KeyPadPhoneLetterCombination {
    final static char L[][]={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public static void letterCombination(String D){
        int length=D.length();
        if(length==0){
            System.out.println("");
            return;
        }
        bfs(0,length,new StringBuilder(),D);
    }
    public static void bfs(int pos,int length,StringBuilder sb,String D){
        if(pos==length){
            System.out.println(sb);
            return;
        }
        char letters[]=L[Character.getNumericValue(D.charAt(pos))];
        for(int i=0;i<letters.length;i++){
            bfs(pos+1, length, new StringBuilder(sb).append(letters[i]), D);
        }
    }
    public static void main(String[] args) {
        letterCombination("23");
    }
}
