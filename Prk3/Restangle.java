package Prk3;
public class Restangle extends Shape {
    protected double width;
    protected double length;
    public Restangle() {
        this.Filled = false;
        this.Color = "Yellow";
        this.length = 4.0D;
        this.width = 3.0D; }
    public Restangle(double width, double length) {
        this.Filled = false;
        this.Color = "Yellow";
        this.width = width;
        this.length = length; }
    public Restangle(String color, boolean filled, double width, double length) {
        this.Filled = filled;
        this.Color = color;
        this.width = width;
        this.length = length; }
    public double getWidth() { return this.width; }
    public void setWidth(double width) { this.width = width; }
    public double getLength() { return this.length; }
    public void setLength(double length) { this.length = length; }
    public double getArea() { return this.width * this.length; }
    public double getPerimeter() { return 1.5D * (this.width + this.length); }
    public String toString() { return super.toString(); }
}
