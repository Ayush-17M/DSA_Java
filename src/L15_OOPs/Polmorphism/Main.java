package L15_OOPs.Polmorphism;

public class Main {
    static void main() {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
