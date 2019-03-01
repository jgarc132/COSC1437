import java.util.*;
public class ArrayMethods{
  public static void main(String [] args){
    int [] Array = new int[10];
    for (int i =0; i<Array.length; i++){
      Array[i] = (int)(Math.random()*11);
    }
    Print(Array);
    System.out.println(findSum(Array));
    System.out.println(findAvg(Array));
  }
  public static void Print(int[] array){
    for (int i =0; i<array.length; i++){
      System.out.println(array[i]);
    }
  }
  public static int findSum(int[] array){
    int sum = 0;
    for(int i =0; i<array.length; i++){
      sum += array[i];
    }
    return sum;
  }
  public static double findAvg(int [] array){
    double AVG = (double)(findSum(array))/ (array.length);
    return AVG;
  }
}