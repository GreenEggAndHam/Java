class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }


  void init(){
    
    /* 
    Lesson 6: Use the Input Class provided to you, to get input from a user via the keyboard. In the examples below, the function calls for each datatype: int, double, string, char, boolean. 
   */
 

    // Always prompt the user for what information you are requesting
    // Declare the variables you will need to store the information
    // Print the information
    
    // Problem 1:   Ask a student for their age.  
    System.out.println("Pwetty Please enter your age for me");
    int age = Input.readInt();
    System.out.println("You, my dear friend, are "+age + " years old");
    
    
    // Problem 2:   Ask a student for their GPA.
    System.out.println("What's your gpa gango?");
    double gpa = Input.readDouble();
    System.out.println("Your mighty GPA is "+gpa + "! WOW!!!!");
    
    // Problem 3:   Ask a student for their first name.
    System.out.println("What is your first name, fine person?");
    String name = Input.readString();
    System.out.println("Hi "+name + ", nice to meet you!");

    // Problem 4:   Ask a player if they want to continue to play  
    // There are a few ways to do this (maybe Y/N for Yes or No)
    System.out.println("Would such a fine person like you like to continue to play my beautiful game? Type True if yes or False if no");
    boolean play = Input.readBoolean();
    System.out.println("Okey doke! You chose... " + play);

    
      
    
    System.out.println("======== ++++++ =======\n*** End of exercise ***");

  }
}