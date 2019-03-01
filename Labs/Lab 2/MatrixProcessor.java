import java.util.*;
import java.io.*;
public class MatrixProcessor {
  public static void main(String[] args)throws IOException{
    int[][] array = populateArray();
    getRowTotal(array,3);
    getColTotal(array,1);
    System.out.println("Sum: " + getSum(array));
    System.out.printf("AVG: %.02f \n", getAVG(array));
    System.out.println("Diagnol Product");
    int [] ar = getDiagonalsProduct(array);
    for(int i = 0; i < ar.length;i++){
      System.out.print(ar[i] + "\t");
    }
    System.out.println();
    System.out.println("SmallestVector ");
    for(int i = 0; i < getSmallestVector(array).length;i++){
      System.out.print(getSmallestVector(array)[i] + "  \t");
    }
    System.out.println();
    System.out.println("Largest Vector ");
    for(int i = 0; i < getLargestVector(array).length;i++){
      System.out.print(getLargestVector(array)[i] + " \t");
    }
  }
  public static int[][] populateArray()throws IOException{
    Scanner scanner = new Scanner(new File("matrixA.txt"));
    String line = scanner.nextLine();
    String token[] = line.split(" ");
    int[][] ar = new int[Integer.parseInt(token[0])][Integer.parseInt(token[1])];
    for(int i = 0; i < ar.length;i++){
      for(int j = 0; j < ar[i].length;j++){
        ar[i][j] = scanner.nextInt();
        System.out.print(ar[i][j] + "\t");
      }
      System.out.println();
      if(scanner.hasNextLine()){
        scanner.nextLine();
      }
    }
    scanner.close();
    return ar;
  }
  //Get Row
  public static void getRowTotal(int[][] array, int r){
    int total = 0;
    for(int i = 0;i < array[0].length;i++){
      total += array[(r-1)][(i)];
    }
    System.out.println("The total sum of row " + r + " is " + total);
  }
  //Get Column
  public static void getColTotal(int[][] array, int c){
    int total = 0;
    for(int i = 0;i < array.length;i++){
      total += array[i][(c-1)];
    }
    System.out.println("The total sum of colums " + c + " is " + total);
  }
  //Sum
  public static int getSum(int[][] array){
    int sum = 0;
    for(int i = 0; i < array.length;i++){
      for(int j = 0;j < array[0].length;j++){
        sum += array[i][j];
      }
    }
    return sum;
  }
  public static double getAVG(int[][] array){
    int num = 0;
    for(int i = 0; i < array.length;i++){
      for(int j = 0;j < array[0].length;j++){
        num++;
      }
    }
    return (double)(getSum(array))/num;
  }
  public static int[] getDiagonalsProduct(int[][] array){
    int left = 1;
    int right = 1;
    int[] leftDiag = new int[array[0].length];
    int[] rightDiag = new int[array[0].length];
    int[] product = new int[array[0].length];
    for(int i = 0; i < leftDiag.length;i++){
      leftDiag[i] = array[i][i];
      left = leftDiag[i] * left;
    }
    int k = 0;
    for(int i = rightDiag.length-1;i >= 0;i--){
      rightDiag[i] = array[k++][i];
      right = rightDiag[i] * right;
    }
    product[0] = left;
    product[1] = right;
    product[2] = (left * right);
    return product;
  }
  //Largest Vector
   public static int[] getLargestVector(int[][] array){
    int[] rows = findTheLargestPerRow(array);
    int[] col = findTheLargestPerCol(array);
    int largest;
    int[][] rowTimesCol = new int[col.length][rows.length];
    int[] product = new int[rowTimesCol.length];
    for(int i = 0; i < rowTimesCol.length;i++){
      largest = Integer.MIN_VALUE;
      for(int j = 0; j <= col.length;j++){
        rowTimesCol[i][j] = (col[i]) * (rows[j]);
        if(largest < rowTimesCol[i][j]){
          largest = rowTimesCol[i][j];
        }
     }
      product[i] = largest;
    }
    return product;
  }
  //Get Largest Row
  public static int[] findTheLargestPerRow(int[][] array){
    int largest; 
    int[] largestRows = new int[array.length];
    for(int i = 0; i < array.length;i++){
      largest = -99999;
      for(int j = 0; j < array[i].length;j++){
        if(largest < array[i][j]){
          largest = array[i][j];
        }
      }
      largestRows[i] = largest;
    }
    return largestRows;
  }
  //Get Largest Col
  public static int[] findTheLargestPerCol(int[][] array){
    int largest; 
    int[] largestCol = new int[array[0].length];
    for(int i = 0; i < array[0].length;i++){
      largest = array[0][i];
      for(int j = 0; j < array.length;j++){
        if(largest < array[j][i]){
          largest = array[j][i];
        }
      }
      largestCol[i] = largest;
    }
    return largestCol;
  }
  //Smalles Vector
  public static int[] getSmallestVector(int[][] array){
    int[] rows = findTheSmallestPerRow(array);
    int[] col = findTheSmallestPerCol(array);
    int smallest;
    int[][] rowTimesCol = new int[col.length][rows.length];
    int[] product = new int[rowTimesCol.length];
    for(int i = 0; i < rowTimesCol.length;i++){
      smallest = Integer.MAX_VALUE;
      for(int j = 0; j <= col.length;j++){
        rowTimesCol[i][j] = (col[i]) * (rows[j]);
        if(smallest > rowTimesCol[i][j]){
          smallest = rowTimesCol[i][j];
        }
      }
      product[i] = smallest;
    }
    return product;
  }
  //Get Smallest per Row
  public static int[] findTheSmallestPerRow(int[][] array){
    int smallest; 
    int[] smallestRows = new int[array.length];
    for(int i = 0; i < array.length;i++){
      smallest = array[0][0];
      for(int j = 0; j < array[i].length;j++){
        if(smallest > array[i][j]){
          smallest = array[i][j];
        }
      }
      smallestRows[i] = smallest;
    }
    return smallestRows;
  }
  //Get Smallest per Col
  public static int[] findTheSmallestPerCol(int[][] array){
    int smallest; 
    int[] smallestCol = new int[array[0].length];
    for(int i = 0; i < array[0].length;i++){
      smallest = array[0][i];
      for(int j = 0; j < array.length;j++){
        if(smallest > array[j][i]){
          smallest = array[j][i];
        }
      }
      smallestCol[i] = smallest;
    }
    return smallestCol;
  }
}