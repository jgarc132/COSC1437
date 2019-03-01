public class Quiz1{
  public static void main(String[] args){
    double[] a = {11.7,222.0,11.8,2.24,-7.1};
    double[] b = {11.7,222.0,667.8,2.24,-7.1};
    print(a);
    printReverse(a);
    System.out.println("Largest: " + getMax(b));
    System.out.println("Sum: " + getSum(a));
    System.out.println("Equals? " + equals(a,a));
    System.out.println("Equals? " + equals(a,b));
    
  }
  public static double getMax(double[] array){
    double max = -999;
    for(int i = 0;i < array.length;i++){
      if(max < array[i])
        max = array[i];
    }
    return max;
  }
  public static double getSum(double[] array){
    double sum = 0;
    for(int i = 0;i < array.length;i++){
      sum += array[i];
    }
    return sum;
  }
  public static void print(double[] array){
    for(int i = 0;i < array.length;i++){
      System.out.println(array[i]);
    }
  }
  public static void printReverse(double[] array){
    for(int i = array.length-1;i >= 0;i--){
      System.out.println(array[i]);
    }
  }
  public static boolean equals(double[] array1 , double[] array2){
    boolean same = false;
    boolean notSame = false;
    if(array1.length == array2.length){
      same = true;
      notSame = true;
      for(int i = 0; i < array1.length;i++){
        if(array1[i] == array2[i]){
          same = true;
        }else{
          notSame = false;
        }
      }
    }
    return notSame;
  }
}