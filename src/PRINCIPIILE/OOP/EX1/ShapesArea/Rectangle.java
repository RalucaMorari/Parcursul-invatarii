package PRINCIPIILE.OOP.EX1.ShapesArea;

public class Rectangle implements Shape {

    double area = 0;

    //height (lungime)
    //width (lățime)

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void computeArea() {
        area = height * width;
        System.out.println(area);
    }


}
