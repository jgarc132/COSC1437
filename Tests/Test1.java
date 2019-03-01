public class Test1{
  public static void main(String[] args){
    int[][] array = {{1,2,3},
                     {8,4,5},
                     {5,11,8}};
    System.out.println("\t" + array[2][2]);
    System.out.println(getAVG(array));
    printSmallestPerRow(array);
    printLargestPerColumn(array);
    System.out.println();
    System.out.println(vowels("hello",0,0));
    int[] array2 = {5,1,2,3,4,5,6,7,8,9};
    System.out.println("Max " + findMax(array2,0,-999999999));
    System.out.println(counter("hello",'l',0,0));
    printBackwards("hello",0);
  }
  public static double getAVG(int[][] array){
    int sum = 0;
    int count = 0;
    for(int i = 0; i < array.length;i++){
      for(int j = 0; j < array[0].length;j++){
        sum += array[i][j];
        count++;
      }
    }
    return sum/count;
  }
  public static void printSmallestPerRow(int[][] array){
    int smallest;
    for(int i = 0; i < array.length;i++){
      smallest = 999999999;
      for(int j = 0; j < array[0].length;j++){
        if(smallest > array[i][j]){
          smallest = array[i][j];
        }
      }
      System.out.println(smallest);
    }
  }
  public static void printLargestPerColumn(int[][] array){
    int largest;
    for(int j = 0; j < array[0].length;j++){
      largest = -999999999;
      for(int i = 0; i < array.length;i++){
        if(largest < array[i][j])
          largest = array[i][j];
      }
      System.out.print("Row " + (j+1) + ": " + largest+ "\t");
    }
  }
  public static int vowels(String s,int count,int vowel){
    s = s.toLowerCase();
    if(count >= s.length())
      return vowel;
    else if(s.charAt(count) == 'a' || s.charAt(count) == 'e'
              || s.charAt(count) == 'i'|| s.charAt(count) == 'o'|| s.charAt(count) == 'u'){
      vowel++;
    }
       vowels(s,count+1,vowel);
    return vowels(s,count+1,vowel);
  }
  public static int findMax(int[] array,int count,int largest){
    if(count >= array.length)
      return largest;
    else if(array[count] > largest){
      largest = array[count];
    }
      findMax(array,count+1,largest);
    return findMax(array,count+1,largest);
  }
  public static int counter(String s,char c,int count,int appearence){
    if (count >= s.length())
      return appearence;
    else if(s.charAt(count) == c){
      appearence++;
    }
      counter(s,c,count+1,appearence);
    return counter(s,c,count+1,appearence);
  }
  public static void printBackwards(String s, int count){
    if(count >= s.length())
     return ;
    else 
      printBackwards(s,count+1);
      System.out.print(s.charAt(count));
  }
}