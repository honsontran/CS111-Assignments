public class Scores {
   
   public static void main (String[] args) {
   System.out.println("How many judges?");
   int judge = IO.readInt();  
      if (judge < 0) {
         System.out.println("You can't have negative judges.");
         IO.reportBadInput();
         judge = IO.readInt();
      }
      if (judge < 3) {
         System.out.println("The highest and lowest scores will be taken out. You need 3 or more judges/scores to proceed.");
         IO.reportBadInput();
         judge = IO.readInt();
      }
   double min = 10.0;
   double max = 0.0;
   double score = 0;
   double total = 0;
   double average = 0;
   
   for (int x = 1; x <= judge; x++) {
      System.out.println("Enter score for judge #" + x);
      score = IO.readDouble();
      
      if (score < 0 || score > 10) {
         IO.reportBadInput();
         x--;
      }

      
      if (score >= 0 && score <= 10) {
         if (score < min) {
            min = score;
         }
         if (score > max) {
            max = score;
         }
      total = total + score;

      }
   }
   total = total - max - min;
   average = total/(judge-2);
   IO.outputDoubleAnswer(average);   
   
   }
}  