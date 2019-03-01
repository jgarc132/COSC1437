public class MyLinkedListI{
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
  public Node sortedMerge(Node a, Node b){
    Node result = null;
    if(a == null)
      return b;
    if(b == null)
      return a;
    if(a.value <= b.value)
    {
      result = a;
      result.next = sortedMerge(a.next,b);
    }else{
      result = b;
      result.next = sortedMerge(a,b.next);
    }
    return result;
  }
  public Node mergeSort(Node h){
    if(h == null || h.next == null)
      return h;
    Node middle = getMiddle(h);
    Node nextMiddle = middle.next;
    middle.next = null;
    Node left = mergeSort(h);
    Node right = mergeSort(nextMiddle);
    Node sortedList = sortedMerge(left,right);
    return sortedList;
  }
  public Node getMiddle(Node h){
    if(h == null)
      return h;
    Node fastPTR = h.next;
    Node slowPTR = h;
    while(fastPTR != null){
      fastPTR = fastPTR.next;
      if(fastPTR != null)
      {
        slowPTR = slowPTR.next;
        fastPTR = fastPTR.next;
      }
    }
    return slowPTR;
  }
}