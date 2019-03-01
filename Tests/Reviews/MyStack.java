public class MyStack{
  String[] stack;
  int top;
  int size;
  public MyStack(int capacity){
    stack = new String[capacity];
    top = 0;
    size = 0;
  }
  public boolean isEmpty(){
    return top == 0;
  }
  public boolean isFull(){
    return top == stack.length;
  }
  public void ensureCapacity(){
    String[] newStack = new String[stack.length * 2];
    for(int i = 0; i < stack.length;i++){
      newStack[i] = stack[i];
      stack = newStack;
    }
  }
  public void push(String s){
    if(isFull())
      ensureCapacity();
    stack[top] = s;
    top++;
    size++;
  }
  public String pop()throws EmptyStackException{
    if(isEmpty())
      throw new EmptyStackException("Stack is Empty");
     String s = stack[top-1];
     top--;
     size--;
     return s;
  }
  public int size(){
    return size;
  }
  public String peek()throws EmptyStackException{
    if(isEmpty())
      throw new EmptyStackException("Stack is Empty");
    else
      return stack[top-1];
  }
}