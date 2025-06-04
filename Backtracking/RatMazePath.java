public class RatMazePath {
    public static boolean SolveMaze(int maze[][]){
        int n=maze.length;
        int ans[][]=new int[n][n];
        if(solveMazeUtil(maze,0,0,ans)==false){
            System.out.println("Solution doesn't exist");
            return false;
        }
        PrintPath(ans);
        return true;
    }
    public static boolean solveMazeUtil(int maze[][],int i,int j,int ans[][]){
        if(i==maze.length-1 && j==maze.length-1 && maze[i][j]==1){
            ans[i][j]=1;
            return true;
        }
        if(isSafe(maze,i,j)){
            if(ans[i][j]==1){
                return false;
            }
            ans[i][j]=1;
            if(solveMazeUtil(maze, i+1, j, ans)) return true;
            if(solveMazeUtil(maze, i, j+1, ans)) return true;
            ans[i][j]=0;
            return false;
        }
        return false;
    }
    public static boolean isSafe(int maze[][],int i,int j){
        return i>=0 && j>=0 && i<maze.length && j<maze[0].length && maze[i][j]==1;
    }
    public static void PrintPath(int maze[][]){
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] ={
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1},
        };
        int n=maze.length;
        SolveMaze(maze);
    }
}
