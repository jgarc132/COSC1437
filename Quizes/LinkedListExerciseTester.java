public class LinkedListExerciseTester{
  public static void main(String[] args){
    MyLinkedList listA = new MyLinkedList();
    MyLinkedList listB = new MyLinkedList();
    listA.add(1);
    listA.add(2);
    listA.add(3);
    listB.add(2);
    listB.add(3);
    listB.add(4);
//    listA.print();
//    listB.print();
    MyLinkedList listC = intersection(listA,listB);
    MyLinkedList listD = union(listA,listB);
    MyLinkedList listE = difference(listA,listB);
//    listC.print();
//    listD.print();
//    listE.print();
  }
  public static MyLinkedList union(MyLinkedList listA, MyLinkedList listB){
    MyLinkedList listC = new MyLinkedList();
    for(int i = 0; i < listA.size();i++){
      int value = listA.get(i);
      int value2 = listB.get(i);
      listC.add(value);
      if(!listA.contains(value2))
        listC.add(value2);
    }
    return listC;
  }
  public static MyLinkedList intersection(MyLinkedList listA,MyLinkedList listB){
    MyLinkedList listC = new MyLinkedList();
    for(int i = 0; i < listA.size();i++){
      int value = listB.get(i);
      if(listA.contains(value))
        listC.add(value);
    }
    return listC;
  }
  public static MyLinkedList difference(MyLinkedList listA, MyLinkedList listB){
    MyLinkedList listC = new MyLinkedList();
    for(int i = 0; i < listA.size();i++){
      int value2 = listB.get(i);
      int value = listA.get(i);
      if(!listA.contains(value2))
        listC.add(value2);
      if(!listB.contains(value))
        listC.add(value);
    }
    return listC;
  }
}