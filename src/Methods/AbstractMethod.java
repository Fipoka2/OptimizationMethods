package Methods;

/**
 * Created by Dmitry on 19.04.2017.
 */
public abstract class AbstractMethod implements OptimisationMethod
{
    private double leftEdge;
    private double rightEdge;
    private double eps;

    public AbstractMethod(double leftEdge, double rightEdge, double eps)
    {
        this.leftEdge = leftEdge;
        this.rightEdge = rightEdge;
        this.eps = eps;
    }

    public double getLeftEdge()
    {
        return leftEdge;
    }

    public void setLeftEdge(double leftEdge)
    {
        this.leftEdge = leftEdge;
    }

    public double getRightEdge()
    {
        return rightEdge;
    }

    public void setRightEdge(double rightEdge)
    {
        this.rightEdge = rightEdge;
    }

    public double getEps()
    {
        return eps;
    }

    public void setEps(double eps)
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
        return Math.pow(x, 5) + 4 * Math.pow(x, 3) + 4 * x - 3;
    }

}
