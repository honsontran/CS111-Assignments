public class Poly {
   public static void main (String[] args) {
      System.out.println("Enter the first root:");
      int a = IO.readInt();
      System.out.println("Enter the second root:");
      int b = IO.readInt();
      System.out.println("Enter the third root:");
      int c = IO.readInt();
      
      System.out.println("The polynomial is:");
      
      System.out.println("x^3 + " + (-(a + b + c)) + "x^2 + " + 
         (a * b + c * a + c * b) + "x + " + (-(c * a * b)));
   }
}