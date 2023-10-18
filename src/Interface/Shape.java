package Interface;

public interface Shape {
    double calculateArea();
    void display();

    default void message(){
        System.out.println("Message");
    }

    static void message1(){
        System.out.println("Message");
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle - Radius: " +radius+ " Area " + calculateArea());
    }
}

class InterfaceExample{
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        circle.display();
    }
}