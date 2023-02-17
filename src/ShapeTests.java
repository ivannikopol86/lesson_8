public class ShapeTests {


    public static void main(String[] args) {
        Printer printer = new Printer();
        Triangle triangle = new Triangle();
        Point point = new Point();


        printer.useName(triangle);
        printer.useName(point);


    }
}