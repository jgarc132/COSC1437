public class MyLinkedList {
  private class Node{
    int value;
    Node next;
    public Node(int value){
      this(value,null);
    }
    public Node(int value,Node next){
      this.value = value;
      this.next = next;
    }
  }
  Node first;
  Node last;
  public boolean contains(int value){
    Node dummy = first;
    while(dummy != null){
      if(dummy.value == value)
        return true;
      dummy = dummy.next;
    }
    return false;
  }
  public int get(int value){
    Node dummy = first;
    if(value == 0)
      return dummy.value;
    for(int i = 1; i < value;i++){
      dummy = dummy.next;
    }
    return dummy.next.value;
  }
  public boolean isEmpty(){
    return first == null;
  }
  public void add(int value){
    if(isEmpty()){
      first = new Node(value);
      last = first;
    }else{
      last.next = new Node(value);
      last = last.next;
    }
  }
  public void print(){
    Node dummy = first;
    while(dummy != null){
      System.out.println(dummy.value);
      dummy = dummy.next;
    }
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
  public int getNumberOfOccurrences(int target){
    int occurrences = 0;
    Node dummy = first;
    while(dummy != null){
      if(target == dummy.value){
        occurrences++;
        dummy = dummy.next;
      }else{
        dummy = dummy.next;
      } 
    }
    return occurrences;
  }
  
  public void addToMiddle(int target){
    int middle = (size()/2);
    int count = 0;
    Node dummy = first;
    while(count < middle){
        dummy = dummy.next;
        count++;
      }
        dummy.next = new Node(target,dummy.next);
  }
  public MyLinkedList createAndReverse(MyLinkedList list){
    return createAndReverse(first,new MyLinkedList());
  }
  private MyLinkedList createAndReverse(Node dummy, MyLinkedList newList){
    if(dummy != null){
      createAndReverse(dummy.next,newList);
      newList.add(dummy.value);
    }
    return newList;
  }
  public static void main(String[] args){
    MyLinkedList list = new MyLinkedList();
    for(int i = 0; i <= 10;i++){
      list.add(i);
      list.add(5);
    }
    System.out.println("Occurences: " + list.getNumberOfOccurrences(5));
    list.print();
    list.addToMiddle(100);
    list.print();
    System.out.println("New Linked List: ");
    list.createAndReverse(list).print(); 
  }
}