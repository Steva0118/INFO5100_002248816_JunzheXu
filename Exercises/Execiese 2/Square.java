import java.lang.invoke.MethodHandle;

public class Square extends Shape{
    //Create properties for class square
    public double side;

    //Create empty constructor for class square
    public Square() {
    }

    //Create constructor for class square
    public Square(String color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    //override method calculate area for square
    @Override
    public double CalculateArea(double side, double unused) {
        double area = Math.pow(side,2); //formula for calculate area of square
        return area;
    }

    //override method calculate perimeter for square
    @Override
    public double CalculatePmeter(double side, double unused, double unused2) {
        double pmeter = side * 4; //formula for calculate perimeter of square
        return pmeter;
    }

    /**
     * get side
     * @return side
     */
    public double getSide() {
        return side;
    }

    /**
     * set side
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    public String toString() {
        return "Square{side = " + side + "}";
    }
}
