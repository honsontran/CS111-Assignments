public class Compress {
   
   public static void main(String[] args) {
      System.out.println("Hello! Enter your string for me to compress it: ");
      String original = IO.readString();
      IO.outputStringAnswer(compress(original));
   }
   
   public static String compress (String original) {
      String compressed = "";
      char letter = 0;
      int amount = 1;
      
      for (int k = 0; k < original.length(); k++) { 
         
         if (letter == original.charAt(k)){
            amount = amount + 1;
         }
         
         else {
            compressed = compressed + letter;
            if (amount != 1){
               compressed = compressed + amount;
            }
            letter = original.charAt(k);
            amount = 1;
         }
      }
      compressed = compressed + letter;
      if (amount != 1){
         compressed = compressed + amount;
      }
      return compressed.trim(); 
   }
}