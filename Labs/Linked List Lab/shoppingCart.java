public class shoppingCart{
  private class Order{
    String name;
    double price;
    int quantity;
    Order next;
    
  public Order(String name,double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.next = null;
  }
  public Order(String line){
   for(int i = 0;i <= 2;i++){
      String token[] = line.split("\t");
      this.name = token[0];
      this.price = Double.parseDouble(token[1]);
      this.quantity = Integer.parseInt(token[2]);
    }
    this.next = null;
   }
  }
  Order first;
  Order last;
  public shoppingCart(){
    this.first  = null;
    this.last = null;
  }
  
  public boolean isEmpty(){
    return first == null;
  }
  // how do i make an add that adds an order i made this class to figure it out but got morec confused
  public void add(Order e){
    if(isEmpty()){
      first = new Order(e);
      last = first;
    }else{
      last.next = new Order(e);
      last = last.next;
    }
  }
  public void print(){
    Order dummy = first;
    while(dummy != null){
      System.out.println(dummy.value);
      dummy = dummy.next;
    }
  }
}