public class MatrixOps{
	
    public static double[][] multiply(double[][] A, double[][] B){
    	int column = A[0].length; 
        int row = B.length;

        double s1[][] = new double[A.length][B[0].length];
         
        if(column != row){
        	invalid();
        }
        
        for (int i = 0; i < A.length; i++){
        	for (int j = 0; j < B[0].length; j++){
        		for (int k = 0; k < A[0].length; k++) {
        			s1[i][j] += A[i][k]*B[k][j];
        		}
        	}
    	}
        return s1;
    }
   
    public static void invalid(){
    	IO.reportBadInput();
    	System.out.println("Matrix cannot be multiplied, please give 2 multiplyable matrixes.");
    	MatrixDriver.enterInputs();
    }
    
}