public class BST{
  BNode root;
  
  public BST(){
    root = null;
  }
  public String findMin(String s){
    return findMin(s,root);
  }
  private String findMin(String s, BNode r){
    if(r.value.compareTo(s) < 0)
      return findMin(s,r.left);
    else
      return "";
  }
}