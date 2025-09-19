class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

 void init(){
// Define a variable for each situation in the challenges below. Assign a value to each variable.
// Display the value of each variable to the console.

/*  Challenge 1:    
    1) student's age 
    2) number of people that live with you
    3) number of items in a cart 
*/
   int student_age = 17;
   System.out.println("Student's age is "+ student_age);
   int ppl_live = 3;
   System.out.println("I live with " + ppl_live + " people");
   int cartnum = 4;
   System.out.println("There are " + cartnum + " items in a cart");



/*  Challenge 2:
    1) temperature 
    2) student's GPA
    3) growth rate of your investment
*/
   double temp = 35.6;
   double gpa = 98;
   double grow = 45;
   System.out.println("The temperature is " + temp + " degrees Fahrenheit.");
   System.out.println("That beautiful student's gpa is " + gpa);
   System.out.println("The growth rate of my mighty investment is " + grow + "%.");

/*  Challenge 3:
    1) Student's last name 
    2) student's first initial
    3) description of an item 
*/
   String last = "Winchester";
   String initial = "D";
   String desc = "exquisitely exotic, fantabulously incredible";
   System.out.println("This is Sam and Dean " + last + ".");
   System.out.println("His name starts with a " + initial + ".");
   System.out.println("This table is " + desc + " and I would love to purchase it.");

/*  Challenge 4:
    1) the status whether lights are on
    2) the status whether the game is over
    3) the status whether the battery is charging
*/
    boolean lightOn = true;
    boolean isGameOver = false;
    boolean battery = false;
    System.out.println("The lights are on, that is " + lightOn + ".");
    System.out.println("Is it " + isGameOver + " that the game is over so soon?");
    System.out.println("That is " + battery + ", your battery is not charging.");
    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}
