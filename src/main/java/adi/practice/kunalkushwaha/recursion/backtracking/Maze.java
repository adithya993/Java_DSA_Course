package adi.practice.kunalkushwaha.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(countPaths(3,3));
        //printPaths("",3,3);
        //System.out.println(retListPaths("",3,3));
        //System.out.println(retListPathsDiagAlsoIncluded("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        //System.out.println(retListPathsDiagAlsoIncludedWithObstacles("", board,0,0));
        //System.out.println(retListPathsAllPath("", board,0,0));
        //System.out.println(retListPathsAllPathWithObstacles("", board,0,0));
        int[][] pathArr = new int[board.length][board[0].length];
        allPathsPrint("", board,0,0, pathArr,1);
    }

    public static int countPaths(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int downCount = countPaths(row - 1, col);
        int rightCount = countPaths(row, col - 1);
        return downCount + rightCount;
    }

    public static void printPaths(String path, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }
        if(row > 1){
            printPaths(path+"D",row - 1, col);
        }
        if(col > 1){
            printPaths(path+"R",row, col - 1);
        }
    }

    public static List<String> retListPaths(String path, int row, int col){
        if(row == 1 && col == 1){
            List<String> pathFin = new ArrayList<>();
            pathFin.add(path);
            return pathFin;
        }
        List<String> paths = new ArrayList<>();
        if(row > 1){
            paths.addAll(retListPaths(path+"D",row - 1, col));
        }
        if(col > 1){
            paths.addAll(retListPaths(path+"R",row, col - 1));
        }

        return paths;
    }

    public static List<String> retListPathsDiagAlsoIncluded(String path, int row, int col){
        if(row == 1 && col == 1){
            List<String> pathFin = new ArrayList<>();
            pathFin.add(path);
            return pathFin;
        }
        List<String> paths = new ArrayList<>();
        if(row > 1 && col > 1){
            paths.addAll(retListPathsDiagAlsoIncluded(path+"D",row - 1, col - 1));
        }
        if(row > 1){
            paths.addAll(retListPathsDiagAlsoIncluded(path+"V",row - 1, col));
        }
        if(col > 1){
            paths.addAll(retListPathsDiagAlsoIncluded(path+"H",row, col - 1));
        }
        return paths;
    }

    public static List<String> retListPathsDiagAlsoIncludedWithObstacles(String path, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            List<String> pathFin = new ArrayList<>();
            pathFin.add(path);
            return pathFin;
        }

        if(!maze[row][col]){
            return new ArrayList<>();
        }
        List<String> paths = new ArrayList<>();
        if(row < maze.length - 1 && col < maze[0].length - 1){
            paths.addAll(retListPathsDiagAlsoIncludedWithObstacles(path+"D", maze,row + 1, col + 1));
        }
        if(row < maze.length - 1){
            paths.addAll(retListPathsDiagAlsoIncludedWithObstacles(path+"V", maze,row + 1, col));
        }
        if(col < maze[0].length - 1){
            paths.addAll(retListPathsDiagAlsoIncludedWithObstacles(path+"H", maze, row, col + 1));
        }
        return paths;
    }

    public static List<String> retListPathsAllPath(String path, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            List<String> pathFin = new ArrayList<>();
            pathFin.add(path);
            return pathFin;
        }

        if(!maze[row][col]){
            return new ArrayList<>();
        }

        //added backtracking logic (BL)
        //BL in cur path add flag for visited nodes
        //flag helps us in not traversing the visited indexes again
        maze[row][col] = false;


        List<String> paths = new ArrayList<>();
        /*if(row < maze.length - 1 && col < maze[0].length - 1){
            paths.addAll(retListPathsAllPathWithObstacles(path+"S", maze,row + 1, col + 1));
        }*/
        if(row < maze.length - 1){
            paths.addAll(retListPathsAllPath(path+"D", maze,row + 1, col));
        }
        if(col < maze[0].length - 1){
            paths.addAll(retListPathsAllPath(path+"R", maze, row, col + 1));
        }
        if(row > 0){
            paths.addAll(retListPathsAllPath(path+"U", maze,row - 1, col));
        }
        if(col > 0){
            paths.addAll(retListPathsAllPath(path+"L", maze, row, col - 1));
        }

        //BL remove flag when returning back from recursion
        maze[row][col] = true;

        return paths;
    }

    public static List<String> retListPathsAllPathWithObstacles(String path, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            List<String> pathFin = new ArrayList<>();
            pathFin.add(path);
            return pathFin;
        }

        if(!maze[row][col]){
            return new ArrayList<>();
        }

        //added backtracking logic (BL)
        //BL in cur path add flag for visited nodes
        //flag helps us in not traversing the visited indexes again
        maze[row][col] = false;


        List<String> paths = new ArrayList<>();
        /*if(row < maze.length - 1 && col < maze[0].length - 1){
            paths.addAll(retListPathsAllPathWithObstacles(path+"S", maze,row + 1, col + 1));
        }*/
        if(row < maze.length - 1){
            paths.addAll(retListPathsAllPathWithObstacles(path+"D", maze,row + 1, col));
        }
        if(col < maze[0].length - 1){
            paths.addAll(retListPathsAllPathWithObstacles(path+"R", maze, row, col + 1));
        }
        if(row > 0){
            paths.addAll(retListPathsAllPathWithObstacles(path+"U", maze,row - 1, col));
        }
        if(col > 0){
            paths.addAll(retListPathsAllPathWithObstacles(path+"L", maze, row, col - 1));
        }

        //BL remove flag when returning back from recursion
        maze[row][col] = true;

        return paths;
    }

    public static void allPathsPrint(String path, boolean[][] maze, int row, int col, int[][] pathArr, int step){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            pathArr[row][col] = step;
            System.out.println(path);
            for(int[] arr : pathArr){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }

        //added backtracking logic (BL)
        //BL in cur path add flag for visited nodes
        //flag helps us in not traversing the visited indexes again
        maze[row][col] = false;
        pathArr[row][col] = step;

        if(row < maze.length - 1){
            allPathsPrint(path+"D", maze,row + 1, col, pathArr, step + 1);
        }
        if(col < maze[0].length - 1){
            allPathsPrint(path+"R", maze, row, col + 1, pathArr, step + 1);
        }
        if(row > 0){
            allPathsPrint(path+"U", maze,row - 1, col, pathArr, step + 1);
        }
        if(col > 0){
            allPathsPrint(path+"L", maze, row, col - 1, pathArr, step + 1);
        }

        //BL remove flag when returning back from recursion
        maze[row][col] = true;
        pathArr[row][col] = 0;
    }
}
