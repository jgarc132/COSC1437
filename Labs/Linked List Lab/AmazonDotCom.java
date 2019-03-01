import java.util.*;
import java.io.*;
public class AmazonDotCom{
  public static void main(String[] args)throws IOException{
   Scanner file = new Scanner(new File("orders.txt"));
   while(file.hasNext()){
     
   }
   Order order1 = new Order(file.nextLine());
   System.out.println(order1);
   shoppingCart.add(order1);
   file.close();
  }
}