public class Lab3{
  public static void main(String[] args){
    star(4);
    System.out.println();
    reverse("hello",0);
    System.out.println();
    System.out.println("# of vowels: " + vowels("Hello",0,0));
    int[] array = {1,3,5,8,10,9,7,5};
    System.out.println(sum(array,0));
    System.out.println(power(2,2));
    System.out.println(multiply(7,4));
    //palindrone("hello","olleh",0);
    System.out.println(maxElement(array,0));
    alphabeticalJoint("apple","bee",0);
    System.out.println();
    binary(32);
  }
  public static void star(int n){
    if(n > 0){
      stars(n);
      star(n-1);
      stars(n);
    }
  }
  private static void stars(int n){
    if(n == 0)
      System.out.println();
    else{
      System.out.print("* ");
    stars(n-1);
    }
  }
  public static int vowels(String s,int n,int c){
    s = s.toLowerCase();
    if(n >= s.length())
      return c;
    else if(s.charAt(n) == 'a' || s.charAt(n) == 'e' || s.charAt(n) == 'i' || s.charAt(n) == 'o' 
              || s.charAt(n) == 'u')
      c++;
    return vowels(s,n+1,c);
  }
  public static int sum(int[] array,int n){
    if(n >= array.length)
      return 0;
    else
      return array[n] + sum(array,n+1);
  }
  public static void reverse(String s,int n){
    if(n >= s.length())
      return ;
    else
      reverse(s,n+1);
    System.out.print(s.charAt(n));
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
  public static void palindrone(String s1, String s2,int n){
    if(n > s1.length())
      return ;
    else if(s1.charAt(n) == palindrone(s2,n).charAt(n))
      palindrone(s1,s2,n+1);
    else
      System.out.println("Doesn't Match");
  }
  private static String palindrone(String s2,int n){
    if(n >= s2.length())
      return "";
    else
      reverse(s2,n+1);
    return "" + s2.charAt(n);
  }
  public static int maxElement(int[] array,int n){
    if(n == array.length-1)
      return array[n];
    else if(array[n] > array[n+1])
      array[n+1] = array[n];
    return maxElement(array,n+1);
  }
  public static int multiply(int x,int y){
    if(y == 0)
      return 0;
    else
      return x + multiply(x,y-1);
  }
  public static String alphabeticalJoint(String s1, String s2,int n){
    if(s1.substring(1) == null)
      return s2.substring(1);
    else if (s2.substring(1) == null)
      return s1.substring(1);
    else if(s1.charAt(0) > s2.charAt(0))
      return s2.charAt(0) + s1.charAt(0) + alphabeticalJoint(s1.substring(1),s2.substring(1),n+1);
    else if(s1.charAt(0) == s2.charAt(0) || s1.charAt(0) < s2.charAt(0))
      return s1.charAt(0) + "" + s2.charAt(0) + alphabeticalJoint(s1.substring(1),s2.substring(1),n+1);
    return alphabeticalJoint(s1.substring(1),s2.substring(1),n+1);
  }
  public static void binary(int n){
    if(n == 0)
      return ;
    else 
      binary(n/2);
    System.out.print(n%2);
  }
}