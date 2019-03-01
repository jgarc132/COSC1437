import java.util.*;
import java.io.*;
public class FileArray{
  public static void main(String[] args)throws IOException{
    Scanner sc = new Scanner(new File("numbers.txt"));
    int[] file= new int [sc.nextInt()];
    for (int i=0; i < file.length; i++){
      file[i] = sc.nextInt();
    } 
    System.out.println(findSum(file));
    System.out.println(findAvg(file));
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
