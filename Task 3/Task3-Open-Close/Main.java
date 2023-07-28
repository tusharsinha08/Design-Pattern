public class Main {
    public static void main(String[] args) {
        Shape shape ;
        shape = new Circle(2.2);
        shape.calculateArea();
        shape.display();

        shape = new Rectangle(5, 8);
        shape.display();
    }
}
