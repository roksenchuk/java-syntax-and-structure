package objects;

public class Rectangle {
    // length field
    private double length;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    // width field
    private double width;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    // default constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }
    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // calculate perimeter method
    double calculatePerimeter() {
        return 2 * length + 2 * width;
    }
    // calculate area method
    double calculateArea() {
        return length * width;
    }
}
