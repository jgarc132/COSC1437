public class BNode{
  String value;
  BNode left,right;
  
  public BNode(String value){
    this.value = value;
    left = right = null;
  }
  public BNode(String value, BNode left, BNode right){
    this.value = value;
    this.left = left;
    this.right = right;
  }
}