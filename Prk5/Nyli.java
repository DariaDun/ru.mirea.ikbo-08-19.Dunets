package Prk5;
import java.lang.*;
public class Nyli {
        public static int recursion(int n, int e) {
            if (n > e + 1) {
                return 0; }
            if (n == 0 || e == 0) {
                return 1; }
            return recursion( n,e - 1) + recursion(n - 1,e - 1); }
        public static void main(String[] args) {
            System.out.println(recursion(7, 10));
        }
    }