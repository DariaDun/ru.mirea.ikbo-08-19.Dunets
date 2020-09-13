package Ball;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(40, 25);
        System.out.println(b1);
        b1.Speed(6);
        System.out.println(b1);
    }
}
