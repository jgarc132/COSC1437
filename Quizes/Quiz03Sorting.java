public class Quiz03Sorting{
  public static void main(String[] args){
    int[] a = {1,2,3,4,6,7,8};
    int[] b = {1,2,3,4,5,6,8,9};
    System.out.println(find(a));
  }
  public static int find(int[] array){
    int sum = 0;
    for(int i = 0;i <= array.length;i++)
      sum += i+1;
    for(int i = 0; i < array.length;i++)
      sum -= array[i]; 
    return sum;
  }
}