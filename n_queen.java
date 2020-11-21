import java.util.HashSet;
import java.util.Set;

public class n_queen {
    static int[][] board;
    static Set<Integer> ROW=new HashSet<>();
    static Set<Integer> COLUMN=new HashSet<>();
    static Set<Integer> DIAGONAL=new HashSet<>();


    static boolean check(int i,int j)
    {
        if(ROW.contains(i)||COLUMN.contains(j)||DIAGONAL.contains(j-i))
            return false;
        else
            return true;
    }
    static boolean method(int n,int row,int column)
    {
            if(column>=n)
                return true;

            for(int j=0;j<n;j++)
            {
                if(check(j,column))
                {
                    board[j][column]=1;
                    ROW.add(j);
                    COLUMN.add(column);
                    DIAGONAL.add(column-j);
                    if(method(n,j,column+1))
                    {
                        if(column==0)
                            print(n);
                        return true;
                    }
                    else
                    {
                        board[j][column]=0;
                        ROW.remove(j);
                        COLUMN.remove(column);
                        DIAGONAL.remove(column-j);
                    }
                }
            }
            return false;

    }
    static void print(int n)
    {
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        board=new int[8][8];
        if(method(8,0,0))
        {
            print(8);
        }
        else
        {
            System.out.println("NOPE!!");
        }

    }
}
