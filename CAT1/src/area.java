interface Shape {
    float area();

    float volume();

    void shapeName();
}

class Point implements Shape {
    float area;
    float radius;
    float height;
    String shape;

    public float area() {
        return 0;
    }

    public void shapeName() {
        System.out.println("This is a " + shape);
    }

    public float volume() {
        return 0;
    }
}

class Circle extends Point {
    String shape = "Circle";

    public float area() {
        return (float) (Math.PI * radius * radius);
    }

    public void shapeName() {
        System.out.println("This is a " + shape);
    }
}

class Cylinder extends Circle {
    String shape = "Cylinder";

    public float area() {
        return (float) (Math.PI * radius * height);
    }

    public float volume() {
        return (float) (Math.PI * this.radius * this.radius * this.height);
    }

    public void shapeName() {
        System.out.println("This is a " + shape);
    }
}

public class area {
    public static void main(String[] args) {
        Point arr[] = { new Circle(), new Cylinder() };
        arr[0].shapeName();
        arr[0].radius = 12.2f;
        System.out.println("Radius = " + arr[0].radius + " Area = " + arr[0].area());
        arr[1].shapeName();
        arr[1].radius = 13.2f;
        arr[1].height = 5.2f;
        System.out.println("Radius = " + arr[1].radius + " Height = " + arr[1].height + " Area = " +
                arr[1].area() + " Volume = " + arr[1].volume());
    }
}