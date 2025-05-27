public class RemoveDuplicateInString {
    public static void RemoveDuplicate(String str,StringBuilder sb,int i,boolean map[]){
        if(i==str.length()){
            System.out.println(sb);
            return;
        }
        char curr=str.charAt(i);
        if(map[curr-'a']==true) RemoveDuplicate(str, sb, i+1, map);
        else{
            map[curr-'a']=true;
            RemoveDuplicate(str, sb.append(curr), i+1, map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        RemoveDuplicate(str,new StringBuilder(""),0,new boolean[26]);
    }
}
