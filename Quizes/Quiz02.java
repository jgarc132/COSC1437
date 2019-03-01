public class Quiz02{
  public static void main(String[] args){
    
    int[][] array = {{1,2,3},
                     {4,5,6},
                     {7,8,10}};
    int[][] array2 = {{3,2,1},
                      {6,5,4},
                      {9,8,7}};
    System.out.println("Sum is: " + findSum(array));
    System.out.printf("AVG is: %.02f",findAVG(array));
    System.out.print("\nSmallest per row: ");
      findTheSmallestPerRow(array);
    int[][] add = addition(array,array2);
    System.out.println("New Array: ");
    for(int i = 0; i < add.length;i++){
      for(int j = 0; j < add[i].length;j++){
        System.out.print(add[i][j] + "\t");
      }
      System.out.println();
    }
  }
  public static int findSum(int[][] array){
    int sum = 0;
    for(int i = 0; i < array.length;i++){
      for(int j = 0; j < array[i].length;j++){
        sum += array[i][j];
      }
    }
    return sum;
  }
  public static double findAVG(int[][] array){
    int num = 0;
    for(int i = 0; i < array.length;i++){
      for(int j = 0; j < array[i].length;j++){
        num++;
      }
    }
    return (double)findSum(array)/num;
  }
  public static void findTheSmallestPerRow(int[][] array){
    int smallest; 
    for(int i = 0; i < array.length;i++){
      smallest = Integer.MAX_VALUE;
      for(int j = 0; j < array[i].length;j++){
        if(smallest > array[i][j])
          smallest = array[i][j];
      }
      System.out.println(smallest);
    }
  }
  public static int[][] addition(int[][] a, int[][] b){
    int[][] c = new int[a.length][a[0].length];
     for(int i = 0; i < a.length;i++){
      for(int j = 0; j < a[i].length;j++){
       c[i][j] = a[i][j] + b[i][j];
      }
    }
     return c;
  }
}