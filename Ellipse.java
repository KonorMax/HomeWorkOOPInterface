package HomeWorkOOPInterface;

public class Ellipse implements Figure {
    @Override
    public void Movable(double x) {
        System.out.println("The Ellipse is moved to " + x * 2);
    }

    @Override
    public void Scalable(double x) {
        System.out.println("The Ellipse is enlarged " + x * 2);
    }
}
