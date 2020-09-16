package Prk3;
import java.awt.* ;
import java.lang.* ;
import java.math.* ;
public class Circle extends Shape {
    protected double radius;
    public Circle() {
        this.Filled = false;
        this.Color = "Blue";
        this.radius = 1.1D; }
    public Circle(double radius) {
        this.Filled = false;
        this.Color = "Blue";
        this.radius = radius; }
    public Circle(String color, boolean filled, double radius) {
        this.Filled = filled;
        this.Color = color;
        this.radius = radius; }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.141592653589D * this.radius * this.radius;
    }
    public double getPerimeter() {
        return 6.283185307179D * this.radius;
    }
    public String toString() {
        return super.toString();
    }
}
