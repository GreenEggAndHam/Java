class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // #1
int[] batman = {2,5,7,3};
print(avgDistribution(batman));
    // #2
String[] Superman = {"Diana","Ted","Jaime","Michael","Oliver","Hal"};
print(findStudent(Superman));

    
  }

/*
Problem 1:
Write a fn avgDistribution() that accepts an array of integers and performs the following steps:
Step 1: Find the average of the numbers using the fn avgArray() below.
Step 2: Compute the sum of the following: the square of the difference of each integer and the average, i.e.,  (x-avg)^2. 
Step 3: Take the square root of the sum and return this result.

Note: To test this function, create an array of numbers in the init funtion.
*/
double avgDistribution(int[] bruce){
int sum = 0;
double abg = avgArray(bruce);
for(int x=0; x <= bruce.length-1;x++){
 sum+=Math.pow(bruce[x]-abg,2);
}
return Math.sqrt(sum); 
}
  

/*
  Problem 2:
  Write a fn findStudent() that accepts an array of student names and the name of one student you are looking for in the array. Return true if you find that student in the array; otherwise return false.

  Note: To test this function, create an array of student names in the init function.
*/
boolean findStudent(String[] Kal, String name){
for (int x=0;x<Kal.length;x++){
if (Kal[x].equals(name)){
  return true;
}
}
return false;
}
  

  // Fn to return average of array elements
  double avgArray(int[] n){    
    return sumArray(n)/n.length;
  }
  // Fn to return sum of array elements
  int sumArray(int[] n){
    int sum=0;
    for(int x=0; x<=n.length-1; x++){
      sum+=n[x];
    }
    return sum;
  }

}