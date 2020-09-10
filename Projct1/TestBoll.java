package Projct1;
import java.lang.*;
public class TestBoll {
        public static void main(String[] args){
            Boll b1 = new Boll ("bleu",45);
            Boll b2 = new Boll ("red",13);
            Boll b3 = new Boll ("purple");
            b3.setDeameter(1);
            System.out.print(b1);
            b1.intoHumanDeameter();
            b2.intoHumanDeameter();
            b3.intoHumanDeameter();
        }
}
