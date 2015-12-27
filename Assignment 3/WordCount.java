public class WordCount {
   
   public static void main (String[] args) {
      System.out.println("Hello! Please enter your sentence here: ");
      String original = IO.readString();
      System.out.println("Alright, now enter the minimum amount of letters to be counted toward your total for each word: ");
      int min = IO.readInt();
      int wordCount = countWords(original, min);
      IO.outputIntAnswer(wordCount);
   }
   
   public static int countWords(String original, int minLength){
      int wordCount = 0;
      
      String[] wordArray = original.split("\\s+");

      for (int k = 0; k < wordArray.length; k++) {
         if (checkSymbols(wordArray[k]) >= minLength){
           wordCount++;
         }
      }
      return wordCount;
         
   
   }
   
   public static int checkSymbols (String word) {
      int wordLength = word.length();
            
      for (int i = 0; i < word.length(); i++) {
         if ((word.charAt(i) <= 65) || (word.charAt(i) >= 91 && word.charAt(i) <= 97) || (word.charAt(i) >= 122)) {
               wordLength = wordLength - 1;
         }
      }
      return wordLength;
   }
}