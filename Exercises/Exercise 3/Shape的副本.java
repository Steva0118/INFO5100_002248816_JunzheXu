public abstract class Shape {
    //Create properties for class shape
    static String color;
    static String name;


    //Create empty constructor for class shape
    public Shape() {
    }

    //Create constructor for class shape
    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    //Abstract Method to calculate area
    public abstract double CalculateArea(double parameterA, double parameterB);

    //Abstract Method to calculate perimeter
    public abstract double CalculatePmeter(double parameterA,double parameterB, double parameterC);


    /**
     * Get color
     * @return color
     */
    public static String getColor() {
        return color;
    }

    /**
     * Set color
     * @param color
     */
    public static void setColor(String color) {
        Shape.color = color;
    }

    /**
     * Get name
     * @return name
     */
    public static String getName() {
        return name;
    }

    /**
     * Set name
     * @param name
     */
    public static void setName(String name) {
        Shape.name = name;
    }


    public String toString() {
        return "Shape{color = " + color + ", name = " + name + "}";
    }
}
