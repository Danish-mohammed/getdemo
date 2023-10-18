package Abstract;

public abstract class Shape {
    public abstract double calculateArea();
    public abstract void display();
    public void message(){
        System.out.println("Abstract class");
    }
}

class Circle extends Shape{
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

class AbstractExample{
    public static void main(String[] args) {
        Circle object = new Circle(5);
        object.display();
    }
}
