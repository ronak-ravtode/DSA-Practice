public class FriendsPairing {
    public static int PairFriendsWays(int n){
        if(n==1 || n==2) return n;
        return PairFriendsWays(n-1) + (n-1) * PairFriendsWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println(PairFriendsWays(3));
    }
}
