class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
  double FtoC(double F){
    double Cel = (F - 32) * 5.0/9;
    return Cel;
  }
  //3: Sphere volume
  double sphere(double r){
    double volume = 4/3.0*Math.PI*Math.pow(r,3);
    return volume;
  }
  
  //4: Cone volume
   double cone(double radius, double h){
    double cvolume = Math.PI*Math.pow(radius,2)*(h/3.0);
    return cvolume;}

  //5: Distance between two coordinate points
    double coordinate (double x1, double x2, double y1, double y2){
      double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
      return distance;
    }


  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
    System.out.println("Enter Degrees in Fahrenheit");
    double F = Input.readDouble();
    System.out.println("Temperature in C (Yeah I C you) degrees is " + FtoC(F));
    //3
    System.out.println("Pwetty Please enter the radius of your small sphere");
    double r = Input.readDouble();
    System.out.println("Volume of this massive (or not, depends) sphere is " + sphere(r));
    //4
    System.out.println("Enter radius for your boy");
    double radius = Input.readDouble();
    System.out.println("Enter the height for your boy");
    double h = Input.readDouble();
    System.out.println("Volume of this beautiful cone " + cone(radius,h));
    //5
     System.out.println("Enter x1 for your boy");
    double x1 = Input.readDouble();
    System.out.println("Enter x2 for your boy");
    double x2 = Input.readDouble();
     System.out.println("Enter y1 for your boy");
    double y1 = Input.readDouble();
    System.out.println("Enter y2 for your boy");
    double y2 = Input.readDouble();
    System.out.println("The distance between these mighty points " + coordinate(x1, x2, y1, y2));
    
  }
 
}