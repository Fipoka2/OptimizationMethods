package Methods;

/**
 * Created by Dmitry on 19.04.2017.
 */
public class DichotomyMethodImpl extends AbstractMethod implements OptimisationMethod
{
    public DichotomyMethodImpl(int leftEdge, int rightEdge, double eps)
    {
        super(leftEdge, rightEdge, eps);
    }

    @Override
    public void calculate()
    {
        double a = this.getLeftEdge();
        double b = this.getRightEdge();
        int count = 0;
        double delta = this.getEps() / 2;
        double L = b - a;
        double x_m, x1, x2;
        do
        {
            count++;
            x1 = (b + a - delta) / 2;
            x2 = (b + a + delta) / 2;

            if (getY(x1) < getY(x2))
            {
                b = x2;
            }else
            {
                if (getY(x1) > getY(x2))
                {
                    a = x1;
                }
                else
                {
                    a = 1;
                    b = x2;
                }

            }
            L = b - a;


        }
        while (L > this.getEps());
        x_m = (a + b) / 2;
        System.out.println("Dichotomy Method:");
        message(count,x_m);
    }
}
