public class NodeTester{
  public static void main(String[] args){
    //Definition of Nodes
    Node n1 = new Node("A");
    Node n2 = new Node("B");
    Node n3 = new Node("C");
    Node n4 = new Node("D");
    Node n5 = new Node("E");
    
    // Connectivity
    n2.next = n1;
    n1.next = n3;
    n3.next = n5;
    n5.next = n4;
    
    //Testing 
    print(n2);
    p(n2);
    size(n2);
    System.out.println(sizeR(n2,0));
  }
  public static void print(Node dummy){
    while(dummy != null){
      System.out.print(dummy.value);
      dummy = dummy.next;
      System.out.print(" -> ");
    }
    System.out.print(dummy + "\n");
  }
  public static void p(Node d){
    if(d == null)
      return ;
    else{
      System.out.print(d.value);
      d = d.next;
    }
    System.out.print(" -> ");
    p(d);
  }
  public static void size(Node f){
    int c = 0;
    while(f != null){
      c++;
      f = f.next;
    }
    System.out.println("\n" + c);
  }
   public static int sizeR(Node f,int c){
    if(f == null)
      return c;
    else
      return(sizeR(f.next,c+1));
  }
}