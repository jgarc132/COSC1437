public class MyLinkedList{
  private class Node{
    Player value;
    Node next;
    Node prev;    
  public Node(Player value){
    this(value,null,null);
  }
  public Node(Player value, Node next, Node prev){
    this.value = value;
    this.next = next;
    this.prev = prev;
   }
  }
  //MyLinkedList Fields
  Node first;
  Node last;
  
  public MyLinkedList(){
    this.first  = null;
    this.last = null;
  }
  
  public boolean isEmpty(){
    return first == null;
  }
  
  public void add(Player value){
    if(isEmpty()){
      last = new Node(value);
      first = last;
    }else{
      last.next = new Node(value,null,last);
      last = last.next;
    }
  }
  public void printNext(){
    System.out.print(last.value.getUsrName());
  }
  public Player getNext(){
    return last.value;
  }
  public void remove(Player value){
    if(isEmpty())
      return ;
    Node target = first;
    while(target != null && !value.equals(target.value))
      target = target.next;
    if(target == null)
      return ;
    Node pred = target.prev;
    Node succ = target.next;
    
    if(pred == null)
      first = succ;
    else
     pred.next = succ;
    
    if(succ == null)
      last = pred;
    else
      succ.prev = pred;
    return ;
  }
  public int size(){
    Node dummy = first;
    int size = 0;
    while(dummy != null){
      size++;
      dummy = dummy.next;
    }
    return size;
  }
}