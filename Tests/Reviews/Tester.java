import java.util.*;
public class Tester {
  public static void main(String[] args)throws EmptyStackException{
    Scanner uI = new Scanner(System.in);
    System.out.println("Please Enter the size of your Stack");
    MyStack userStack = new MyStack(uI.nextInt());
    while(userStack.isEmpty() || (userStack.isFull() == false)){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter new String for Stack");
      String nString = s.nextLine();
      userStack.push(nString);
    }
    while(!userStack.isEmpty())
      System.out.println(userStack.pop());
  }
}