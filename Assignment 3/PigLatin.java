public class PigLatin {
  
   public static void main(String[] args) {
      System.out.println("Hello! Please type out what you want translated to pig latin: ");
      String original = IO.readString();
      boolean viable = false;
      
       for (int k = 0; k < original.length(); k++){  
         if ((original.charAt(k) >= 65 && original.charAt(k) <= 90) || (original.charAt(k) >= 97 && original.charAt(k) <= 122)){
            viable = true;
         }   
            
         else {
            IO.reportBadInput();
            System.out.println("Sorry, you entered either a string, number, random symbols, or punctuation marks. Please enter again: ");
            original = IO.readString();
            viable = false;
            k--;
         }
      }
      
      if (viable == true) {
         String translated = translate(original);
         IO.outputStringAnswer(translated);
      }  
   }   
   
   public static String translate(String original){
      int length = original.length();
      String translated = " ";
      String firstLetter = Character.toString(original.charAt(0));
      String nonvowel = "ay";
      String chopped = original.substring(1, original.length());
      

         if (original.charAt(0) == 'a' || original.charAt(0) == 'e' || original.charAt(0) == 'i' || original.charAt(0) == 'o' || original.charAt(0) == 'u'|| original.charAt(0) == 'A' || original.charAt(0) == 'E' || original.charAt(0) == 'I' || original.charAt(0) == 'O' || original.charAt(0) == 'U') {
               translated = original + "way";
         }
         
         else {
            translated = chopped + firstLetter + nonvowel;
         }
               
      return translated; 
   }

}
