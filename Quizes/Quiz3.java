public class Quiz3{
  public static void main(String[] args){
    System.out.println(count0ccurrences("array",'a'));
    printEvenCharacters("murcielago",0);
    int[] array = {3,5,-2,7,3,-1,0};
    //System.out.println(findMax(array,0));
  }
  public static int method1(int x,int y){
    if(y < 1)
      return 0;
    else
      return x + method1(x,--y);
  }
  public static int count0ccurrences(String s,char c){
    if(s.length() < 0)
      return 1;
    else
      return (int)(s.charAt(s.length())) + count0ccurrences(s,c);
  }
  public static int findMax(int[] array,int a){
    if(array.length < 0)
      return 0;
    else if(array[a++] <= array[array.length])
      return array[a];
    else
      return array[a];
  }
  public static void printEvenCharacters(String s,int i){
    if(i < s.length()){
      if(i%2 == 0){
        System.out.println(i);
      printEvenCharacters(s,i+1);
      }
    }
  }
}
