public class StingCompress {
    public static StringBuilder Compress(String str){
        StringBuilder newstr=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            newstr.append(str.charAt(i));
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;                
            }
            if(count>1){
                newstr.append(count.toString());
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="aaaabbbccd";
        System.out.println(Compress(str));
    }
}
