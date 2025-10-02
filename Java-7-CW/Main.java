class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  // For each problem below, prompt the user for the input values for each variable in the formula.
    
  /*
    Problem 1: Translate the formula from eq1.png.
  */
 double x = 4.1;
 double A = 6.7;
 double Z = Math.pow(A, 2*x+1);
 System.out.println("Answer for the mighty question 1: " + Z);


    
  /*
    Problem 2: Translate the formula from eq2.png.
  */
 double f = 7.8;
 double Y = 2*f/Math.sin(Math.toRadians(3*f));
System.out.println("Answer for the mighty question 2: " + Y);
    
    /*
    Problem 3: Translate the formula from eq3.png.
  */
 double g = 2.1;
 double B = Math.abs(Math.pow(g,2)+1);
  System.out.println("Answer for the mighty question 3: " + B);

  }

  
}