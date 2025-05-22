public class FindShortestPath {
    public static float ShortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N') x++;
            else if(str.charAt(i)=='S') x--;
            else if(str.charAt(i)=='E') y++;
            else if(str.charAt(i)=='W') y--;
            else{
                System.out.println("enter valid string");
                break;
            }
        }
        return (float)Math.sqrt((int)x*x+(int)y*y);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(ShortestPath(str));
    }
}
