package Methods;

// Метод парабол
public class ParabolasMethodImpl extends AbstractMethod implements OptimisationMethod
{
    public ParabolasMethodImpl(int leftEdge, int rightEdge, double eps)
    {
        super(leftEdge, rightEdge, eps);
    }

    @Override
    public void calculate(){
        int count = 0;
        double h = 0.0001;
        double x_m, x1, x2, x3;
        x1 = this.getLeftEdge() + h;
        x3 = this.getRightEdge() - h;
        x2 = this.getLeftEdge() + (this.getRightEdge() - this.getLeftEdge()) / 2;
        double L = x3 - x1;
        do
        {
            count++;
            double w = x2 + (Math.pow((x3 - x2), 2) *
                                  (getY(x1) - getY(x2)) - Math.pow((x2 - x1), 2) * (getY(x3) - getY(x2)))
                    / (2 * ((x3 - x2) * (getY(x1) - getY(x2)) + (x2 - x1) * (getY(x3) - getY(x2))));

            if (w < x2)
            {
                if (getY(w) < getY(x2))
                { x3 = x2; x2 = w; }
                else
                {
                    if (getY(w) > getY(x2))
                        x1 = w;
                    else
                    {
                        if (getY(x1) > getY(x2))
                        { x3 = x2; x2 = w; }
                        else
                        if (getY(x2) > getY(x3))
                            x1 = w;
                    }
                }
            }
            else
            {
                if (w > x2)
                {
                    if (getY(w) < getY(x2))
                    {
                        x1 = x2; x2 = w;
                    }
                    else
                    {
                        if (getY(w) > getY(x2))
                            x3 = w;
                        else
                        {
                            if (getY(x3) > getY(x2))
                            { x1 = x2; x2 = w; }
                            else
                            if (getY(x1) > getY(x2))
                                x3 = w;
                        }
                    }
                }
            }
            L = x3 - x1;

        }
        while (L > this.getEps());
        x_m = x2;
        System.out.println("Parabolas method");
        message(count,x_m);

    }
}
