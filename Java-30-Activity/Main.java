class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
    Car Batmobile = new Car("Dodge","Charger","black",1973,40000);
    Car Baby = new Car("Chevrolet","Impala","black",1967,46250);
    // display brand, model and value of each car
    print(Batmobile.brand);
    print(Batmobile.color);
    print(Baby.model);
    print(Baby.value);
    print(Baby.year);

    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");
    print("Baby");
    print("Batmobile");

	// Make BMW honk
	print("\nUsing car functions(behavior):");	
    Batmobile.honk();
    Baby.honk();
    
  }

}