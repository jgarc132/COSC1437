public class Friday1{
  public static void main(String[] args){
    double[] array = {6.0,2.5,3.6,4.5};
    System.out.println(findMax(array));
  }
  public static double findMax(double[] array){
    double max = array[0];
    for(int i = 1;i < array.length;i++){
      if(max < array[i])
        max = array[i];
    }
    return max;
  }
}