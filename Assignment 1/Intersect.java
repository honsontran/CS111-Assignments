public class Intersect {
   public static void main (String[] args) {
      System.out.println("Enter the constant d:");
      int d = IO.readInt();
      System.out.println("Enter the constant f:");
      int f = IO.readInt();
      System.out.println("Enter the constant g:");
      int g = IO.readInt();
      System.out.println("Enter the constant m:");
      int m = IO.readInt();
      System.out.println("Enter the constant b:");
      int b = IO.readInt();

    /*Here is the conceptual math:
      y = dx^2 + fx + g            --- Equation 1 Quadratic
      y = mx + b                   --- Equation 2 Linear
      mx + b = dx^2 + fx + g       --- Set the two equations equal to each other
      
      x^2 * (d) + x * ( f - m )  +  ( g - b ) --- Zero the equation
      
      Now that you have your new Quadratic function, set them to the traditional A, B, and C.
    */
    
      int A = d;
      int B =  f - m;
      int C =  g - b;
      
      double x1 = - B + Math.sqrt(  B^2  -  4 * A * C ) / (2 * A);
      double x2 = - B - Math.sqrt(  B^2  -  4 * A * C ) / (2 * A);

      double y1 = m * x1 + b;
      double y2 = m * x1 + b; 
      
    //Calculate the vertex and discriminant
      double t = -(f - m) / (2.0 * d);
      double u = t * t - (g - b) / (double) d;

    // Possibility 1, if "A" is 0, then both of the equations are linear.
      if (d == 0) { // if they both have the same slope..
          if (f == m) {
             if (g == b) // if both functions have the same y-intercept..
                  // they lie on top of each other.
                  System.out.println("These two equations intersect forever :D!");
             else // if they have the same y-intercept
                System.out.println("These two functions are parallel and don't intersect.");
          }
            
          else { // if they have different slopes..
              double x = (b - g) / (double) (f - m);
              double y = m * x + b;
              System.out.println("The intersection is: (" + x + "," + y + ")");
          }
      }
        
      else if (u < 0) // if discriminant is less than 0, there are no REAL solutions.
          System.out.println("none");
          
      // if discriminant is 0, there is only 1 real solution
      else if (u == 0) {
          double x = t;
          double y = m * x + b;
          System.out.println("The intersection is: (" + x + "," + y + ")");
      }
      
      // if the discriminant is more than 0, there are 2 real solutions.
      else {
          // Quadratic Equation right here :D
          x1 = t + Math.sqrt(u);
          x2 = t - Math.sqrt(u);
          y1 = m * x1 + b;
          y2 = m * x2 + b;
          System.out.println("The intersections are: (" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
      }
   }
}