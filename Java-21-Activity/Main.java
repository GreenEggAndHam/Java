class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
// menu():
menu();
    
  }
/* Challenge 1:  Allowance Plan A or B ?
  Plan A: You get $5 on day 1 and no more. 
  Plan B: You get a penny on day 1. On each following day thereafter, you double the value from the previous day. 
  How many days will it take for the amount in plan B to equal or exceed that of plan A?
  Write a function allowance1() that solves the problem.
*/
void allowance1(){
  int numofdays=1;
  int zePlan=1;
  while(zePlan < 500){
    print ("Day" + numofdays+ ": "+zePlan);
    zePlan *= 2;
    numofdays++;
  }
  print("Your amazingly labubu penny plan will exceed $5 in " +numofdays+" days. Value is: " + zePlan);
}


/* Challenge 2:  Allowance Plan 1 or 2 ?  
  Plan-1 : Start with $1000. Add $100 each day to the previous day's balance.
  Plan-2 : Start with 1 penny. Add double that the next day. For each day after that, the amount added the previous day is doubled and added to the balance.

  Write a function allowance2() that will display the daily value in each plan as you determine how many days it will take for Plan2 to be better than Plan1.
*/
void allowance2(){
  int awww1= 1000;
  double awww2 =0.01;
  double amt = 0.01;
  int day = 1;
  print (" Day        Plan-1           Plan-2");
  print (" ---        ------           ------");
  print(day+ "       $ "+awww1+"          $"+awww2);
  while (awww1>awww2){
    awww1 += 100;


    amt *=2;
    awww2 += amt; 

  }
}
  

  
/*
    Challenge 3:
    Write a function addTwoNumbers() that generates two random integers (between -10 and 10), and then asks the user to enter the sum of those two numbers. Allow the user to keep trying until they get it correct.
*/
void addTwoNumbers(){
  int n1= randInt (-10,10);
  int n2 = randInt(-10,10);
  int ans =-50;
  print("What is "+n1+" + "+n2+" = ?");
  while (n1+n2 != ans){
    ans = Input.readInt();
    if (n1+n2==ans)
     print("Correct!");
    else
     print("Incorrect, try again.");
  }
}

/*
    Challenge 4:
    Write a function GCF() that accepts two integers, calculates and returns the GCF (greatest common factor) of the two integers. (For e.g, GCF of 12 and 18 is 6.)
*/
int GCF(int n1, int n2){
  int divisor = Math.min(n1,n2);
  while (!(n1%divisor==0 && n2%divisor==0)){
    divisor--;
  }
  printt("GCF of " +n1 + " and "+n2+" is");
  return divisor;
}

/*
    Challenge 5:
    Write a function securityCode() that receives a security code. Ask the user to enter their code. Check to see if the user's entry matches the security code. If it does, display "Access granted!". If not, keep asking for the code.
*/
void securityCode(String code){
  String sCode="";
  while (!sCode.equals(code)){
    print("Enter your amazing security code for me: ");
    sCode=Input.readString();
  }
  print("Congrats! You shall pass!");
}

/*
    Challenge 6:
    Write a function menu() that allows a user to choose 1 of 5 functions present above. Also include a 6th choice to exit out of the menu.
    Example:
    Menu: make your choice
    1 - Allowance plan A or B ?
    2 - Allowance plan 1 or 2 ?
    3 - Addition game
    4 - GCF of two integers
    5 - Security Code
    6 - Exit Menu
*/
void menu(){
  int pick = 0;
  while(pick !=6){
    print("\n\nMenu: take your pick!");
    print("1 ... Allowance plan A or B?");
    print ("2 ... Allowance plan 1 or 2?");
    print("3 ... Addition game");
    print ("4 ... GCF of two numbers");
    print ("5 ... Security Code");
    print ("6... Leave the merry menu");
    pick = Input.readInt();
    if (pick == 1){
      allowance1();
    }
    else if (pick == 2){
      allowance2();
    }
    else if (pick == 3){
      addTwoNumbers();
    }
    else if (pick == 4){
      print ("Enter first integer for me please");
      int n1 = Input.readInt();
      print ("Enter second integer for me please");
      int n2 = Input.readInt();
      GCF( n1,n2 );
    }
    else if(pick == 5){
      print ("Write the secret code here");
      String secret = Input.readString();
      securityCode(secret);
    }

  }
}
  
  
  int randInt(int lower, int upper){
    int range = upper - lower +1 ;
    return (int)(Math.random()*range) +lower;
  }

}