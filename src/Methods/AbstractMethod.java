package Methods;

/**
 * Created by Dmitry on 19.04.2017.
 */
public abstract class AbstractMethod implements OptimisationMethod
{
    private int leftEdge;
    private int rightEdge;
    private double eps;

    public AbstractMethod(int leftEdge, int rightEdge, double eps)
    {
        this.leftEdge = leftEdge;
        this.rightEdge = rightEdge;
        this.eps = eps;
    }

    public int getLeftEdge()
    {
        return leftEdge;
    }

    public void setLeftEdge(int leftEdge)
    {
        this.leftEdge = leftEdge;
    }

    public int getRightEdge()
    {
        return rightEdge;
    }

    public void setRightEdge(int rightEdge)
    {
        this.rightEdge = rightEdge;
    }

    public double getEps()
    {
        return eps;
    }

    public void setEps(int eps)
    {
        this.eps = eps;
    }
    public void message(int iterationCount, double min){
        System.out.println("Number of iterations is " + iterationCount);
        System.out.println("Minimum value is " + min);
    }
    public double getY(double x)
    {
        //исходная формула
        return Math.pow(x, 5) + 2 * Math.pow(x, 3) - 2 * x - 1;
    }

}
