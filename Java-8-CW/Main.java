class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  // define the functions
void madlib(String adj, String noun, String verb){
System.out.println("Hello there. The "+adj + noun + verb);


};

double areaSq( double side){
  double area= side*side;
  return area;
};

double areaCi(double radius){
  double barea = Math.pow(Math.PI*radius,2);
  return barea;
};
  void init(){
    madlib("Hilarious ", "Rocket ", "Skyrockets ");

    double asq = areaSq(15);
    System.out.println("the area of the square is " + asq);

    double asc = areaCi(3);
    System.out.println("the area of the mighty circle is "+ asc);

  }
 
  
}
