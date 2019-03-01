//import java.util.*;
//public class ArrayHeap{
//  private ArrayList<Integer> arrayHeap = new ArrayList<>();
//  private void perculaterUp()
//  {
//    int p = arrayHeap.size()-1;
//    while(p != 0)
//    {
//      int parent = (p-1)/2;
//      if(valueAt(p) >= valueAt(parent))
//      {
//        break;
//      }
//      else
//      {
//        Integer temp = arrayHeap.get(parent);
//        arrayHeap.set(parent, arrayHeap.get(p));
//        arrayHeap.set(p, temp);
//        p = parent;
//      }
//    }
//  }
//  private void perculateDown(){
//    int p = 0;
//    int size = arrayHeap.size();
//    while(2*p + 1 < size){
//      int leftChildPos = 2*p + 1;
//      int rightChildPos = leftChildPos + 1;
//      int minChildPos = leftChildPos;
//      
//      //If theres a right child
//      if(rightChildPos < size){
//        if(valueAt(rightChildPos) < valueAt(leftChildPos)){
//          minChildPos = rightChildPos;
//        }
//      }
//      if(valueAt(p) <= valueAt(minChildPos))
//        break;
//      else{
//        //Swap
//        Integer temp = arrayHeap.get(p);
//        arrayHeap.set(p, arrayHeap.get(minChildPos));
//        arrayHeap.set(minChildPos, temp);
//      }
//      p = minChildPos;
//    }
//  }
//  
//  boolean add(int x){
//    arrayHeap.add(x);
//    perculateUp();
//    return true;
//  }
//  
//  
//  
//  
//  
//  
//  
//  
//  
//  
//  
//  
//  
//  
//}