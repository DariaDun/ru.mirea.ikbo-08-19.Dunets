package Prk5;
import java.lang.*;
public class Pazvr{
    public static int recursion(int n, int i) {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 ); }
    public static void main(String[ ] args) {
        System.out.println(recursion(7584, 0));}
}
