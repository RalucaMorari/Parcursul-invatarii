package PRINCIPIILE.OOP.EX1.ShapesArea;

public class Circle implements Shape {
    double area = 0;
    double pi = 2.14;
    double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }



    @Override
    public void computeArea() {
        area = pi * radius * radius;
        System.out.println(area);

    }
}
