import java.lang.*;
public class Quiz4{
  public static void main(String[] args){
    int[] array = {-1,-1,-1,-1,-1,-1,-1,-1};
    populateRandom(array,3,6,0);
    for(int i = 0;i< array.length;i++){
      System.out.print(array[i] + "\t");
    }
    System.out.println();
    System.out.println(power(2,3));
  }
  public static void populateRandom(int[] a,int start,int end,int random){
    if(start > end)
      return;
    else if(start < end)
      random = (int)(Math.random()*11);
      a[start] = random;
     populateRandom(a,start+1,end,random);
  }
  public static int power(int x ,int y){
   if(y >= 0)
    if(x == 0)
      return 1;
    else if(y == 1)
      return x;
    else if (y > 1)
      return x * power(x,y-1);
     else 
      return 0;
   else if(y < 0)
     return 1/power(x,-y);
    return power(x,y-1);
  }
}