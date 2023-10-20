public class Rectangle extends Shape{
    //Create properties for class rectangle
    public double length;
    public double width;

    //Create empty constructor for class
    public Rectangle() {
    }

    //Create empty constructor for class rectangle
    public Rectangle(String color, String name, double length, double width) {
        super(color, name);
        this.length = length;
        this.width = width;
    }

    //override method calculate area for rectangle
    @Override
    public double CalculateArea(double width, double length) {
        double area = width * length; //formula for calculate area of rectangle
        return area;
    }

    //override method calculate perimeter for rectangle
    @Override
    public double CalculatePmeter(double width, double length, double unused) {
        double pmeter = (width * 2) + (length * 2);//formula for calculate perimeter of rectangle
        return pmeter;
    }

    /**
     * get length
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * set length
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * get width
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * set width
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle{length = " + length + ", width = " + width + "}";
    }
}
