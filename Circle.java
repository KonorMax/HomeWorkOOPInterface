package HomeWorkOOPInterface;

public class Circle implements Figure {
    @Override
    public void Movable(double x) {
        System.out.println("The Circle is moved to " + x * 2);

    }

    @Override
    public void Scalable(double x) {
        System.out.println("The Circle is enlarged " + x * 2);

    }
}
