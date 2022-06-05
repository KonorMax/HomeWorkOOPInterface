package HomeWorkOOPInterface;

public class Rectangel implements Figure {
    @Override
    public void Movable(double x) {
        System.out.println("The Rectangel is moved to " + x * 2);
    }

    @Override
    public void Scalable(double x) {
        System.out.println("The Rectangel is enlarged " + x * 2);
    }
}
