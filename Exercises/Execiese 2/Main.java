public class Main {
    public static void main(String[] args) {
        //create new object for each shape
        Triangle triangle = new Triangle("red","t1",13,14,10.2,15);
        Rectangle rectangle = new Rectangle("blue","r1",14.3,9.2);
        Circle circle = new Circle("purple","c1",5.6);
        Square square = new Square("yellow","s1",17);

        //Use method to get area of triangle
        double t1Area = triangle.CalculateArea(triangle.getBase(), triangle.getHeight());
        System.out.println("Area of triangle is " + t1Area);
        //Use method to get perimeter of triangle
        double t1Perimeter = triangle.CalculatePmeter(triangle.getSide1(), triangle.getSide2(), triangle.getBase());
        System.out.println("Perimeter of triangle is " + t1Perimeter);
        System.out.println("--------------------------------------------------------------------------");

        //Use method to get area of rectangle
        double r1Area = rectangle.CalculateArea(rectangle.getWidth(), rectangle.length);
        System.out.println("Area of rectangle is " + r1Area);
        //Use method to get perimeter of rectangle
        double r1Perimeter = rectangle.CalculatePmeter(rectangle.getWidth(), rectangle.getLength(), 0);
        System.out.println("Perimeter of rectangle is " + r1Perimeter);
        System.out.println("--------------------------------------------------------------------------");

        //Use method to get area of circle
        double c1Area = circle.CalculateArea(circle.getRadius(), 0);
        System.out.println("Area of circle is " + c1Area);
        //Use method to get perimeter of circle
        double c1Perimeter = circle.CalculatePmeter(circle.getRadius(), 0, 0);
        System.out.println("Perimeter of circle is " + c1Perimeter);
        System.out.println("--------------------------------------------------------------------------");

        //Use method to get area of square
        double s1Area = square.CalculateArea(square.getSide(), 0);
        System.out.println("Area of square is " + s1Area);
        //Use method to get perimeter of square
        double s1Perimeter = square.CalculatePmeter(square.getSide(), 0, 0);
        System.out.println("Perimeter of square is " + s1Perimeter);


    }
}