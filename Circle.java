 // Define the interface
interface Area {
    void area(int radius);
}

// Circle class implements Area
class Circle implements Area {
    Circle() {
        // Default constructor
    }

    public void area(int radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of a circle is: " + result);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(5); // Example: radius = 5
    }
}

