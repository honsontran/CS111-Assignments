import java.io.*; //importing input/output to use BufferedReader
import java.util.ArrayList;

public class MatrixDriver {
	
    public static void main(String args[]) {
    	enterInputs();
    }
    
    public static void enterInputs() {
    	//Ask for string, input string, use method readTextFile to set to first matrix.
    	System.out.println("Enter name of file containing first matrix: ");
    	String input1 = IO.readString();
    	double[][] first = readTextFile(input1);

    	//Ask for info for the second matrix.
    	System.out.println("Enter name of file containing second matrix: ");
    	String input2 = IO.readString();   	
        double[][] second = readTextFile(input2);  
           
        double[][] product = MatrixOps.multiply(first , second);
        
        if (product != null) {
        	System.out.println("Product Matrix:");
        	output(product);
        }
    }
    
    public static void output(double[][] input){
        for(int x = 0; x < input.length; x++){
            for(int y = 0; y < input[0].length; y++){
            	System.out.print(input[x][y] + "\t");
            }
            System.out.println();
        }
    }
    
    public static double[][] readTextFile(String filename) {
    	String line;
    	ArrayList<double[]> matrix = new ArrayList<double[]>();
    	
    	try {
	    	InputStream file = new FileInputStream(filename);
	    	InputStreamReader isr = new InputStreamReader(file);
	    	BufferedReader br = new BufferedReader(isr);
	    	
	    	while((line = br.readLine()) != null){ 
	    		String[] lineArr = line.split("\t");
	    		double[] doubleArr = new double[lineArr.length];
	    		
	    		for (int i = 0; i < lineArr.length; i++) {
	    			doubleArr[i] = Double.parseDouble(lineArr[i]);
	    		}
	    		matrix.add(doubleArr);
	    	}
	    	br.close();
    	} catch (Exception e){
    		return null;
    	}
    	double[][] ret = new double[matrix.size()][];
    	for (int i = 0; i < matrix.size(); i++){
    		ret[i] = matrix.get(i);
    	}
    	return ret;
    }
}
