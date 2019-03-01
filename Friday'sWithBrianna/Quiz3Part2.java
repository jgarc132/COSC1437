public class Quiz3Part2{
  public static void main(String[] args){
    System.out.println(count("Hello",'o',0));
    int[] array = {1,2,3,4,20,6,7,8,9};
    System.out.println(findMax(array,2));
  }
  public static int count(String s,char c,int i){
    if(i == s.length())
      return 0;
    else if(s.charAt(i) == c)
      return 1 + count(s,c,i+1);
    return count(s,c,i+1);
  }
  public static int findMax(int[] a, int p){
    return findMax(a,p,0);
  }
  private static int findMax(int[] a,int p,int i){
    if(i == a.length)
      return p;
    if(a[i] > a[p])
      return findMax(a, i, (i+1));
    return findMax(a, p, (i+1));
  }
}