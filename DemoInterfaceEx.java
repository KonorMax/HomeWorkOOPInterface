package HomeWorkOOPInterface;

public class DemoInterfaceEx {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Ellipse ellipse = new Ellipse();
        Rectangel rectangel = new Rectangel();

        circle.Movable(6);
        circle.Scalable(8);
        ellipse.Movable(3);
        ellipse.Scalable(2);
        rectangel.Movable(4);
        rectangel.Scalable(5);
    }
}
