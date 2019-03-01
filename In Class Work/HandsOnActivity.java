public class HandsOnActivity{
  public static void main(String[] args){
    System.out.println(insertDot("applebees"));
    int[] a = {3,4,5,6};
    int[] b = {3,7,3,9};
    System.out.println(repeatedElements(a,b,3));
  }
  public static String insertDot(String s){
      return insertDot(s,0);
  }
  private static String insertDot(String s, int counter){
    if(counter >= s.length())
      return "";
    else
      return s.charAt(counter) + "."+ insertDot(s,counter+1);
  }
  public static  int repeatedElements(int[] a, int[] b,int n){
    return repeatedElements(a,b,n,0,0);
  }
  private static int repeatedElements(int[] a, int[] b, int n, int c,int o){
    if(c >= a.length || c >= b.length)
      return o; 
    else if(n == a[c])
      o++;
    else if(n == b[c])
      o++;
     return repeatedElements(a,b,n,c+1,o);
  }
}