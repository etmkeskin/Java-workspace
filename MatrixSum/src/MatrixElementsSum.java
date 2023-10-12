
public class MatrixElementsSum {
	
	public static int solution(int[][] matrix) {
	    int sum = 0;
	    int row = matrix.length;
	    int col = matrix[0].length;
	    
	    
	    for(int i = 0; i < row; i++){
	        for(int j = 0; j < col; j++){
	        	sum += matrix[i][j];
	        }
	    }
	    
	    return sum;

	}
	
	
	public static void main(String[] args) {
		int[][] matrix = {{0, 1, 1, 2},
						  {0, 5, 0, 0},
						  {2, 0, 3, 3}};
		
		int sum = solution(matrix);

		System.out.println(sum);
		
	}

}
