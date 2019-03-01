public class BinarySearchTree{
  private class BNode{
    int value;
    BNode leftChild;
    BNode rightChild;
    public BNode(int value){
      this(value,null,null);
    }
    public BNode(int value, BNode leftChild, BNode rightChild){
      this.value = value;
      this.leftChild = leftChild;
      this.rightChild = rightChild;
    }
  }
  BNode root;
  
  public boolean isEmpty(){
    return root == null;
  }
  
  public boolean find(int x,BNode temp){
    if(isEmpty())
      return false;
    else if(x == temp.value)
      return true;
    else if(x < temp.value)
      return find(x,temp.leftChild);
    else if(x > temp.value)
      return find(x,temp.rightChild);
    else 
      return false;
  }
   public void add(int x) { 
       root = add(root, new BNode(x)); 
    } 
   private BNode add(BNode current,BNode newNode) { 
        if (current == null) { 
            return newNode; 
        } 
        else if (newNode.value > current.value) 
            current.rightChild = add(current.rightChild,newNode); 
        else if (newNode.value < current.value) 
            current.leftChild = add(current.leftChild, newNode);
        return current; 
    } 
   
  public int size(){return size(root);}
  private int size(BNode root){
    if(root == null)
      return 0;
    else
      return(size(root.leftChild) + 1 + size(root.rightChild));
  }
  
  public int findTotalLeaves(){
    return findTotalLeaves(root);
  }
  private int findTotalLeaves(BNode x){
    if(x == null)
      return 0;
    if(x.leftChild == null && x.rightChild == null)
      return 1;
    else
      return findTotalLeaves(x.leftChild) + findTotalLeaves(x.rightChild);
  }
  
  public int findTotalOfParents(BNode x){
    if(x == null)
      return 0;
    if(x.leftChild != null && x.rightChild != null)
      return 1;
    else
      return findTotalOfParents(x.leftChild) + findTotalOfParents(x.rightChild); 
  }
}


