package Methods;

/**
 * Created by Dmitry on 18.04.2017.
 */
public interface OptimisationMethod
{
    void calculate();
    void message(int iterationCount, double min);
    double getY(double x);
}
