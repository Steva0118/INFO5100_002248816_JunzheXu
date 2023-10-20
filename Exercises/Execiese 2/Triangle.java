public class Triangle extends Shape {

    //Create properties for class triangle
    public double base;
    public double side1;
    public double side2;
    public double height;

    //Create constructor for class triangle
    public Triangle(String color, String name, double side1, double side2, double base, double height) {
        super(color, name);
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    //Create empty constructor for class triangle
    public Triangle() {
    }

    //override method calculate area for triangle
    @Override
    public double CalculateArea(double base, double height) {
        double area = (base * height)/2; //formula for calculate area of triangle
        return area;
    }

    //override method calculate perimeter for triangle
    @Override
    public double CalculatePmeter(double side1,double side2, double base) {
        double pmeter = side1 + side2 + base; //formula for calculate perimeter of triangle
        return pmeter;
    }

    /**
     * get side1
     * @return side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * set side1
     * @param
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * get side2
     * @return side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * set side2
     * @param
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }


    /**
     * get base
     * @return base
     */
    public double getBase() {
        return base;
    }

    /**
     * set base
     * @param base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * get height
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * set height
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

}