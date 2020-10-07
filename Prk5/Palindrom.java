package Prk5;
import java.lang.*;
public class Palindrom{
    public static void main(String s[]){
      String b = "abba";
        StringBuffer t =  new StringBuffer (b).reverse();
        String str = t.toString();
      if (b.equalsIgnoreCase(str))System.out.println("Yes");
      else System.out.println("No");
    }
}