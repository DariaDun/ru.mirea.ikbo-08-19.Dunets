package Project2;
import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book ("Bible",987);
        Book b2 = new Book ("Good omens",484);
        Book b3 = new Book ("Romeo and Juliet");
        b3.setPages(1);
        System.out.print(b1);
        b1.intoHumanDeameter();
        b2.intoHumanDeameter();
        b3.intoHumanDeameter();
    }
}
