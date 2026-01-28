class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog dawg = new Dog("Husky",5,"Terry");
    Dog dahhhhg = new Dog ("Corgi",6,"Murphy");
    Dog three = new Dog("Salchicha",7,"Timmy");

    // display object property values
    print(dawg.age);
    print(dawg.breed);
    print(dawg.name);
    
    // invoke object behaviors(functions)
   dawg.bark();
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}