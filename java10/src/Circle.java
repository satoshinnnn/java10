public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Dien tich hinh tron: " + Math.PI*radius*radius);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Chu vi hinh tron: " + 2*Math.PI*radius);
    }
}
