class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

	//3: create 3 new item objects
	CartItem buh = new CartItem("Jug of Milk",6.33,3,true);
	CartItem me = new CartItem("Muenster Cheese",15.99,10,true);
  CartItem deep = new CartItem("Coca-Cola 2-liter", 2.34,1,false);
	//4: display name & original price of items that are on sale
  print("The Items that are on sale are:");
  if(buh.onSale == true){
	print(buh.itemName+", down from its price of  "+buh.itemPrice);}
  if (me.onSale==true){
  print(me.itemName+ ", down from its price of "+me.itemPrice);}
  if(deep.onSale==true){
    print(deep.itemName+ ", down from its price of "+deep.itemPrice);
  }
	
	//5: subtotal (for all quantities of all items in cart, using discounted prices)
	double hader = buh.getPrice();
  double hafer = me.getPrice();
  double hamer = deep.getPrice();

	
	// display subtotal, tax and total
    double subtotal =  hader+hafer+hamer;
    print("The mighty Subtotal is " + subtotal);
    double total = subtotal*1.08875;
    print("The mighty tax is 8.875%");
    print("The fantabulous total is....🥁..." + total+ "!!!!" );
  }

}



// 