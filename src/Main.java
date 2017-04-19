import java.util.Scanner;

import Methods.DichotomyMethodImpl;
import Methods.GoldenSectionImpl;
import Methods.NewtonMethodImpl;
import Methods.OptimisationMethod;
import Methods.ParabolasMethodImpl;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        double eps;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the left edge: ");
        a =  sc.nextInt();
        System.out.println("enter the right edge: ");
        b = sc.nextInt();
        System.out.println("enter eps: ");
        eps = sc.nextDouble();
        boolean rep = true;
        while (rep)
        {
            System.out.println("Выберите численный метод одномерной минимизации функции: ");
            System.out.println("1. Метод деления отрезка пополам ");
            System.out.println("2. Метод <<золотого сечения>>");
            System.out.println("3. Метод парабол");
            System.out.println("4. Метод Ньютона");
            System.out.println("5. Выход");
            int n = sc.nextInt();

            OptimisationMethod method;
            switch (n)
            {
                case 1:
                    method = new DichotomyMethodImpl(a,b,eps);
                    method.calculate();
                    break;

                case 2:
                    method = new GoldenSectionImpl(a,b,eps);
                    method.calculate();
                    break;

                case 3:
                    method = new ParabolasMethodImpl(a,b,eps);
                    method.calculate();
                    break;

                case 4:
                    method = new NewtonMethodImpl(a,b,eps);
                    method.calculate();
                    break;

                case 5:
                    rep = false;
                    break;
            }
        }

    }
}
