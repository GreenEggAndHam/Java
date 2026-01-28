class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list = new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // Use the array of students called "students" and the functions from the 'Student' class of the prior lesson to answer the questions listed below:  

    // 1: How many students are passing and how many are failing?
int pass=0;
int fail=0;
for (int i = 0 ; i <students.length;i++){
  if (students[i].gpa >= 65){
    pass++;
  }
  if (students[i].gpa <65){
    fail++;
  }
}
    // 2: What percentage of students are failing?
int percentage = (fail/(pass +fail))*100;

    // 3: How many failing students have "Castro R" as their teacher?
int Cast = 0;
for (int i = 0; i<students.length;i++){
  if (students[i].gpa <65 && students[i].findTeacher("CASTRO R")){
    Cast++;
  }
}
    // 4: How many failing students are not taking a Music course? (Note: Music courses start with "UL")
int Mucis = 0;
for (int i = 0; i < students.length; i++){
    if (students[i].gpa < 65 && students[i].findCourseStartingWith("UL")== false){
      Mucis++;
    }
}
    // 5: Display the IDs of all students taking music, but failing it (music courses start with "UL").

for (int h = 0; h <students.length;h++){
  if(students[h].gpa <65 && students[h].findCourseStartingWith("UL")==true){
    System.out.println(students[h].id);
  }
}
    // 6: How many freshmen and sophomores have a GPA over 90?
int Batman = 0;
int Superman = 0;
for (int i=0;i<students.length;i++){
  if(students[i].gradeLevel==10 && students[i].gpa >90){
    Batman++;
  }
  if(students[i].gradeLevel==9 && students[i].gpa >90){
    Superman++;
  }
}

    // 7: How many students have both of the following teachers: Banu and Porchetta?
int GreenLantern=0;
for (int i = 0; i < students.length;i++){
  if(students[i].findTeacher("BANU") && students[i].findTeacher("PORCHETTA")){
    GreenLantern++;
  }
}
    // 8: How many freshmen, sophomores, juniors and seniors are there?
int Zatanna = 0;
int Constantine=0;
int Fate=0;
int Occult=0;
for (int i = 0; i< students.length;i++){
  if(students[i].gradeLevel==9){
    Zatanna++;
  }
  if(students[i].gradeLevel==10){
    Constantine++;}
  if(students[i].gradeLevel==11){
    Fate++;}
  if(students[i].gradeLevel==12){
    Occult++; 
}

System.out.println("There are " + Zatanna+" freshmen, " + Constantine + " sophomores, "+Fate+" juniors, and " + Occult+" seniors.");
    // 9: For teacher Porchetta's students, display the number of students by grade level.
    
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}