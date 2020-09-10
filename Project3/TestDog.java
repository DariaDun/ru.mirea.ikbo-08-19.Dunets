package Project3;
import java.lang.*;
public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog ("Pinki",9);
        Dog d2 = new Dog ("Boss",4);
        Dog d3 = new Dog ("Bob");
        d3.setAge(1);
        System.out.print(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
