package Ball;
import java.lang.*;
public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    private double speed = 0 ;
    public Ball(double x, double y){
        this.x = x; this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setSpeed (double speed) { this.speed = speed; }
    public void setXY(double x, double y){ this.x = x; this.y = y; }
    public void move( double xDisp, double yDisp){ x+=xDisp; y+=yDisp; }
    public void Speed(double t){speed = ((x+y)/t);}
    public String toString() { return "Ball ("+this.x+", "+this.y+")."; }
}
