package Methods;

/**
 * Created by Dmitry on 18.04.2017.
 */
public class NewtonMethodImpl extends AbstractMethod implements OptimisationMethod
{
    public NewtonMethodImpl(double leftEdge, double rightEdge, double eps)
    {
        super(leftEdge, rightEdge, eps);
    }

    private double f1(double x)
    {
        //Первая производная Левой части Исходного Уравнения
        return 5 * Math.pow(x, 4) - 12 * Math.pow(x, 2) + 4;

    }
    private double f2(double x)
    {
        //Вторая производная Левой части Исходного Уравнения
        return 20 * Math.pow(x, 3) - 24 * x;
    }

    @Override
    public void calculate()
    {
        double a = this.getLeftEdge();
        double b = this.getRightEdge();
        double x_m;
        double x = a + (b - a) / 2;
        int count = 0;
        double xk = x;
        do
        {
            count++;
            xk = xk - (f1(xk) / f2(xk));

        }
        while (f1(xk) > this.getEps());
        x_m = xk;
        System.out.println("Parabolas method");
        message(count,x_m);
    }
}
