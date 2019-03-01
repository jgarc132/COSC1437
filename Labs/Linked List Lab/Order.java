public class Order{
  private String productName;
  private double price;
  private int quantity;
  private Order next;
  public Order(String productName, double price, int quantity){
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    this.next = null;
  }
  public Order(String line){
    for(int i = 0;i <= 2;i++){
      String token[] = line.split("\t");
      this.productName = token[0];
      this.price = Double.parseDouble(token[1]);
      this.quantity = Integer.parseInt(token[2]);
    }
    this.next = null;
  }
  public String getProductName(){
    return productName;
  }
  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }
  public Order getNext(){
    return next;
  }
  public void setProductName(String productName){
    this.productName = productName;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  public double getTotalPerOrder(){
    return price*quantity;
  }
  public String toString(){
    return "Order: " + productName + ", a total of $" + price + ". It will deliver soon!";
  }
  public boolean equals(Order newOrder){
    if(productName.equals(newOrder.productName) && price == newOrder.price)
      return true;
    else 
      return false;
  }
}