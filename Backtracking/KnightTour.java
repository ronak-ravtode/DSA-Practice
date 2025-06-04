public class KnightTour {
    static int N=8;
    static int board[][]=new int[N][N];

    static int dx[]={2,1,-1,-2,-2,-1,1,2};
    static int dy[]={1,2,2,1,-1,-2,-2,-1};

    public static boolean solve(int x,int y,int move){
        if(move==N*N) return true;

        for(int i=0;i<8;i++){
            int nextX=x+dx[i];
            int nextY=y+dy[i];

            if(isSafe(nextX,nextY)){
                board[nextX][nextY]=move;
                if(solve(nextX, nextY, move+1)) return true;
                board[nextX][nextY]=-1;
            }
        }
        return false;
    }

    public static boolean isSafe(int x,int y){
        return x>=0 && y>=0 && x<N && y<N && board[x][y]==-1;
    }
    
    public static void printBoard(){
        for(int row[]:board){
            for(int cell: row){
                System.out.printf("%2d ",cell);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=-1;
            }
        }
        board[0][0]=0;
        if(solve(0,0,1)){
            System.out.println("Solution is exist");
            printBoard();
        }
        else System.out.println("Soution doesn't exist");
    }
}
