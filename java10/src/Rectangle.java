public class Rectangle implements Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void getArea() {
        System.out.println("Dien tich hinh cn:" + width*height);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Chu vi hinh cn:" + (width+height));
    }
}
