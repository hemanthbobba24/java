import java.util.*;
public class Eightqueens {

	
	    
	 
	   // print the final solution matrix 
	    static void printSolution(int board[][],int n)
	    {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++)
	            {
	            	if(board[i][j]!=0)
	            	{
	                   int m=(n*i)+j;
	                System.out.print(" " +m+ " ");
	                        
	            	}
	            	else
	            	{
	            		System.out.print(" * ");
	            	}
	            }
	            System.out.println();
	        }
	    }
	 
	    // function to check whether the position is safe or not 
	    static boolean isSafe(int board[][], int row, int col, int o)
	    {
	        int i, j;
	        for (i = 0; i < col; i++)
	            if (board[row][i] == 1)
	                return false;
	 
	        
	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
	            if (board[i][j] == 1)
	                return false;
	             
	        for (i = row, j = col; j >= 0 && i < o; i++, j--)
	            if (board[i][j] == 1)
	                return false;
	 
	        return true;
	    }
	 
	    // The function that solves the problem using backtracking 
	    public static boolean solveNQueen(int chess[][], int col,int k)
	    {
	        if (col >= k)
	            return true;
	        int l=k;
	 
	        for (int i = 0; i < k; i++) {
	            //if it is safe to place the queen at position i,col -> place it
	            if (isSafe(chess, i, col,l)) {
	                chess[i][col] = 1;
	 
	                if (solveNQueen(chess, col + 1,l))
	                    return true;
	 
	                //backtrack if the above condition is false
	                chess[i][col] = 0;
	            }
	        }
	        return false;
	    }
	 
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	    	 int n=sc.nextInt();
	        int chess[][]=new int[n][n];
	        for(int i=0;i<n;i++)
	        {
	        	for(int j=0;j<n;j++)
	        		chess[i][j]=0;
	        }
	 
	        if (!solveNQueen(chess, 0,n)) {
	            System.out.print("Solution does not exist");
	            return;
	        }
	 
	        printSolution(chess,n);
	        
	    }
	}