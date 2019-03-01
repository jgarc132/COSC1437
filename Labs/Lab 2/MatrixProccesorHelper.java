public class MatrixProccesorHelper{
  public static void main(String[] args){
    int [] smallRows = {2,4,6,8};
    int [] smallCol = {8,6,4,2};
    populateArray(smallRows,smallCol);
    
  }
  public static void populateArray(int[] row , int[] col){
    int[][] array3 = new int[row.length][col.length];
    for(int i = 0; i < array3.length;i++){
      for(int j = 0; j < array3[0].length;j++){
       array3[i][j] = (row[i] * col[j]);
       System.out.println(array3[i][j]);
      }
    }
  }
}