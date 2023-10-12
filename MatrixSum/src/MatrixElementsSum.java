
public class MatrixElementsSum {
	
	public int solution(int[][] matrix) {
	    int sum = 0;
	    int row = matrix.length;
	    int col = matrix[0].length;
	    
	    int[] colZero = new int[row];
	    
	    for(int i = 0; i < row; i++){
	        for(int j = 0; j < col; j++){
	            if(matrix[i][j] == 0){
	                colZero[i] = j;
	            }
	        }
	    }
	    
	    return sum;

	}
	
	
	public static void main(String[] args) {
		
		
	}

}
