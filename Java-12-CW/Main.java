class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   System.out.println(collegeCredit("ERTNMEEE"));
   System.out.println(getCounselor("BBC"));
   System.out.println(imageType("gamey.jpeg"));

    
  }
/*
Problem 1:
Write a function collegeCredit() that accepts a course code and if a course gets college credit return true otherwise return false. If the 6th letter of the course code is "E" or "M" then it is a college credit course.
*/
boolean collegeCredit(String code){
  if (code.substring(5,6).equals("M") ||
  code.substring(5,6).equals("E")){
    return true;}
  else
    return false;
  } 



/*
Problem 2:
Write a function getCounselor() that accepts a student's official class code and returns their guidance counselor based on the either the first or the middle character of the official class code being:
B-Berrouet
C-Chu
D-Dinn
E-Eyzengart
F-Flores
G-Gibson
*/
String getCounselor(String classc){
  if (classc.substring(0,1).equals("B") || classc.substring(1,2).equals("B")){
    return "Berrouet";}
  else if (classc.substring(0,1).equals("C") || classc.substring(1,2).equals("C")){
    return "Chu";}
  else if (classc.substring(0,1).equals("D") || classc.substring(1,2).equals("D")){
    return "Dinn";}
  else if (classc.substring(0,1).equals("E") || classc.substring(1,2).equals("E")){
    return "Eyzengart";}
  else if (classc.substring(0,1).equals("F") || classc.substring(1,2).equals("F")){
    return "Flores";}
  else if (classc.substring(0,1).equals("G") || classc.substring(1,2).equals("G")){
    return "Gibson ";}
  else return null;
}

/*  
Problem 3:
Write a function imageType() that accepts an image filename and returns the image type based on the file extension.

JPEG or JPG - Joint Photographic Experts Group
PNG - Portable Network Graphics
GIF - Graphics Interchange Format
PDF - Portable Document Format(not an image type)
*/ 
String imageType(String filename){
  int period = filename.indexOf(".");
  if (filename.substring(period+1).equalsIgnoreCase("jpg") || filename.substring(period).equalsIgnoreCase("jpeg") ){
    return "Joint Photographic Experts Group";
  }
  else if (filename.substring(period+1).equalsIgnoreCase("png")){
    return "Portable Network Graphics";
  }
  else if (filename.substring(period+1).equalsIgnoreCase("gif")){
    return "Graphics Interchange Format";
  }
  else if (filename.substring(period+1).equalsIgnoreCase("pdf")){
    return "Portable Document Format (Which is not an image type, boohoo)";
  }
  else return null;

}
 
  
}