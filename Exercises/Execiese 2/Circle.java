public class Circle extends Shape {
    //Create properties for class circle
    public double radius;


    //Create empty constructor for class circle
    public Circle() {
    }

    //Create constructor for class circle
    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    //override method calculate area for circle
    @Override
    public double CalculateArea(double radius, double unused) {
        double area = Math.pow(radius,2) * Math.PI; //formula for calculate area of circle
        return area;
    }

    //override method calculate perimeter for circle
    @Override
    public double CalculatePmeter(double radius, double unused, double unused2) {
        double pmeter = 2 * radius * Math.PI; //formula for calculate perimeter of circle
        return pmeter;
    }



    /**
     *
     * get radius of circle
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set radius of circle
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{radius = " + radius + "}";
    }
}
