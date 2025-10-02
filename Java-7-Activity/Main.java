
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/* For each of the challenges below:
    a) declare the variables, 
    b) ask the user for the variable values, 
    c) write the specified equation, and 
    d) display the equation value.
*/    
 
//    Challenge 1:  See file Actvy7_Eq1  (done for you)
      System.out.println("Enter the value for x ");
      double x =Input.readDouble();
      double y = Math.pow(x,7);
      System.out.println("Value of y is "+y);   
  
//    Challenge 2:  See file Actvy7_Eq2
      System.out.println("Enter the value for the variable a ");   
      double a =Input.readDouble();
      System.out.println("Enter the value for the variable b");
      double b = Input.readDouble();
      double c = Math.sqrt(a+b);
      System.out.println("The fantabulous answer to Equation 2 is "+c);   
  
//    Challenge 3:  See file Actvy7_Eq3
      System.out.println("Enter the value for the variable g, please");
      double g = Input.readDouble();
      double eq3 = Math.pow(g,2) + 5;
      System.out.println("The fantabulous answer to Equation 3 is "+ eq3);  
  
//    Challenge 4:  See file Actvy7_Eq4
      System.out.println("Enter the value for the variable m ");   
      double m =Input.readDouble();
      System.out.println("Enter the value for the variable n");
      double n = Input.readDouble();
      double k = Math.pow(m,5)/(Math.sqrt(n+1));
      System.out.println("The fantabulous answer to Equation 4 is "+k);

//    Challenge 5:  See file Actvy7_Eq5
      System.out.println("Enter the value for the variable t ");   
      double t =Input.readDouble();
      System.out.println("Enter the value for the variable s");
      double r = Input.readDouble();
      double s = Math.pow(t,5)*(Math.pow(r+2,4));
      System.out.println("The fantabulous answer to Equation 5 is "+s);
  
//    Challenge 6:  See file Actvy7_Eq6
      System.out.println("Enter the value for the variable x2");   
      double x2 =Input.readDouble();
      System.out.println("Enter the value for the variable x1");
      double x1 = Input.readDouble();
      System.out.println("Enter the value for the variable y2 ");   
      double y2 =Input.readDouble();
      System.out.println("Enter the value for the variable y1");
      double y1 = Input.readDouble();
      double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
      System.out.println("The fantabulous answer to Equation 6 is "+d);

//    Challenge 7:  See file Actvy7_Eq7    (HINT: What does the "plus minus: after "-b" mean?)
      System.out.println("Enter the value for the variable b");   
      double bu =Input.readDouble();
      System.out.println("Enter the value for the variable a");
      double ar = Input.readDouble();
      System.out.println("Enter the value for the variable c ");   
      double ca =Input.readDouble();
      double x3 = (-bu + Math.sqrt(Math.pow(bu,2)-4*ar*ca))/2*ar;
      double x4 = (-bu - Math.sqrt(Math.pow(bu,2)-4*ar*ca))/2*ar;
      System.out.println("The fantabulous answer to Equation 7 part 1 is "+ x3);
      System.out.println("The fantabulous answer to Equation 7 part 2 is "+ x4);
    

    // **************************************************
    // ******** Don't write any code below here. ********
    // **************************************************
  }
}