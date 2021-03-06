package Methods;

/**
 * Created by Dmitry on 19.04.2017.
 */
public class GoldenSectionImpl extends AbstractMethod implements OptimisationMethod
{
    public GoldenSectionImpl(double leftEdge, double rightEdge, double eps)
    {
        super(leftEdge, rightEdge, eps);
    }

    @Override
    public void calculate()
    {
        int count = 0;
        double x_m, x1, x2;
        double a = this.getLeftEdge();
        double b = this.getRightEdge();
        double L = b - a;
        double alfa = (Math.sqrt(5) - 1) / 2;
        double alfa1 = 1 - alfa;
        x1 = a + alfa1 * (b - a);
        x2 = a + alfa * (b - a);
        do
        {
            count++;
            if (getY(x1) < getY(x2))
            {
                b = x2; x2 = x1;
                x1 = a + alfa1 * (b - a);
            }
            else
            {
                if (getY(x1) > getY(x2))
                {
                    a = x1; x1 = x2;
                    x2 = a + alfa * (b - a);
                }
                else
                {
                    b = x2; a = x1;
                    x1 = a + alfa1 * (b - a);
                    x2 = a + alfa * (b - a);
                }
            }
            L = b - a;
        }

        while (L >= this.getEps());
        x_m = (a + b) / 2;
        message(count, x_m);
    }
}
