import java.util.Scanner;

public class Smith
{
    static boolean IsPrime(int x)
    {
        for (int i = 2; i <= Math.floor(Math.sqrt(x)); i++)
            if (x % i == 0) return false;
        return true;
    }

    public static void main(String[] args)
    {
        int i;
        int n;
        int tmp;
        int sum;
        for (n = 1; n <= 400; n++)
        {
            tmp = n;
            sum = 0;
            for (i = 2; tmp != 1; i++)
            {
                if (!IsPrime(i)) continue;
                while (tmp % i == 0)
                {
                    sum += i;
                    tmp /= i;
                }
            }
            tmp = n;
            while (tmp > 0)
            {
                sum -= tmp % 10;
                tmp /= 10;
            }
            if (sum == 0) System.out.println(n);
        }
    }
}
