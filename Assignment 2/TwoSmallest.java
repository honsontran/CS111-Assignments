public class TwoSmallest{
   public static void main(String[] args) {
      double num = Double.POSITIVE_INFINITY;
      double first;
      double second;
      
      System.out.println("Enter a terminating value: ");
      double stop = IO.readInt();
      
      first = Double.POSITIVE_INFINITY;
      second = Double.POSITIVE_INFINITY;
      
      while (num != stop) {
         for (int x = 1; x == 1; x++) {
            num = IO.readDouble();
            if (num == stop) {
               IO.reportBadInput();
               x--;
            }
         }
         num = IO.readDouble();
         if (num < first) {
             second = first;
             first = num;
         }
            
         else if (num < second) {
             second = num;
         }
      }
      
      IO.outputDoubleAnswer(first);
      IO.outputDoubleAnswer(second);
   }
}

