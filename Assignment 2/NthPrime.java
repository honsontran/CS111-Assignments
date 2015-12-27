public class NthPrime {
   public static void main(String[] args) {
		System.out.println("Enter value n to find the nth prime number:");
		int n = IO.readInt();
		
      while (n < 1) {
			IO.reportBadInput();
			System.out.println("You cannot have the 0th prime number. Enter again:");
			n = IO.readInt();
		}
      
 		int number, count, x;
		number = 1;
		count = 0;
      
		while (count < n){
         number = number + 1;
			for (x = 2; x <= number; x++){
      		if (number % x == 0) {
					break;
				}
	      }
     
			if (x == number){				
				count = count + 1;
			}
      }

      IO.outputIntAnswer(number);
	}
}
