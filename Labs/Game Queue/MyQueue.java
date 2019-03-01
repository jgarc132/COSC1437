public class MyQueue{
  
  private class Node{
    Player p;
    Node next;
    
  public Node(Player p){
    this(p,null);
  }
  public Node(Player p, Node next){
    this.p = p;
    this.next = next;
   }
  }
  
  Node front;
  Node rear;
  int size;
  
  public MyQueue(){
    front = null;
    rear = null;
  }
  
  public boolean isEmpty(){
    return front == null;
  }
  public void enqueue(Player x){
    if(rear != null){
      rear.next = new Node(x, null);
      rear = rear.next;
      size++;
    }
    else{
      rear = new Node(x,null);
      front = rear;
      size++;
    }
  }
  public void setSize(int size){
    this.size = size;
  }
  public int size(){
    return this.size;
  }
  public Player peek() throws EmptyQueueException{
    if(isEmpty())
      throw new EmptyQueueException("Queue is Empty: Peek");
    return front.p;
  }
  public Player dequeue() throws EmptyQueueException{
    if(isEmpty())
      throw new EmptyQueueException("Queue is Empty:Dequeue");
    else{
      Player tmp = front.p;
      front = front.next;
      if(front == null)rear = null;
      size--;
      return tmp;
    }
  }  
}