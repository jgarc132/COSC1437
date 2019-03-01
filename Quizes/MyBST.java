public class MyBST{
  public static void main(String[] args){
    BinarySearchTree  bst = new BinarySearchTree();
    bst.add(7);
    bst.add(5);
    bst.add(2);
    bst.add(10);
    bst.add(12);
    bst.add(14);
    System.out.println(bst.find(5,bst.root));
    System.out.println(bst.size());
    System.out.println(bst.findTotalLeaves());
    System.out.println(bst.findTotalOfParents(bst.root));
    int[] heap1 = {50,30,40,19,20,10,5,2};
    System.out.println(secondLargest(heap1));
    
  }
  
  public static int secondLargest(int[] heap){
    int i = 0;
    int left = (2*i) + 1;
    int right = left+1;
    return heap[left] > heap[right] ? heap[left] : heap[right];
  }
}