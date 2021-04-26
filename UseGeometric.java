package geometricFigure;

public class UseGeometric {
    public static void main(String[] args)
    {
        Square square = new Square(8,8, "Square");
        System.out.println(square.toString());
        Triangle triangle = new Triangle(7,7, "Triangle");
        System.out.println(triangle.toString());
        Square square1 = new Square(15,15, "Square");
        System.out.println(square1.toString());
        Triangle triangle1 = new Triangle(21,21, "Triangle");
        System.out.println(triangle1.toString());
    }
}
