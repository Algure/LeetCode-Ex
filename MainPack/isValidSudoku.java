	
import java.util.*

public class LeetCodes {
  public boolean isValidSudoku(char[][] board) {
		 ArrayList()
	        int[][] bdex=new int[][] {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
	        HashSet<Character> colSet=new HashSet<Character>();
	        HashSet<Character> rowSet=new HashSet<Character>();
	        HashSet<Character> boxSet=new HashSet<Character>();
	        int bRow=0,bCol=0;
	        for(int i=0;i<9;i++) {
	        	for(int j=0; j<9; j++) {
	        		if(board[i][j]!='.'&&!rowSet.contains(board[i][j])) {
	        			rowSet.add(board[i][j]);
	        		}else if(board[i][j]!='.'&&rowSet.contains(board[i][j])) {
	        			return false;
	        		}
	        		
	        		if(board[j][i]!='.'&&!colSet.contains(board[j][i])) {
	        			colSet.add(board[j][i]);
	        		}else if(board[j][i]!='.'&&colSet.contains(board[j][i])) {
	        			return false;
	        		}

	                if(i%3==0 && j%3==0){
	                	for(int k=0;k<9;k++) {
		                    bRow=bdex[k][0]+i;
		                    bCol=bdex[k][1]+j;
		                    if(board[bRow][bCol]!='.'&&!boxSet.contains(board[bRow][bCol])) {
		                        boxSet.add(board[bRow][bCol]);
		                    }else if(board[bRow][bCol]!='.'&&boxSet.contains(board[bRow][bCol])) {
		                        return false;
		                    }
	                	}
	                }
		        	boxSet.clear();
	        	}
	        	colSet.clear();
	        	rowSet.clear();
	        }
	        return true;
	    }
 }
