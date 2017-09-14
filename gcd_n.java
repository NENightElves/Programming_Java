import java.util.Scanner;

public class gcd_n
{
    static int gcd(int m, int n)
    {
        int tmp;
        if (n < m)
        {
            tmp = n;
            n = m;
            m = tmp;
        }
        while (m % n != 0)
        {
            tmp = m % n;
            m = n;
            n = tmp;
        }
        return n;
    }

    public static void main(String[] args)
    {
        int[] a = new int[100];
        int n, i;
        int res;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n < 2) return;
        for (i = 1; i <= n; i++)
            a[i] = in.nextInt();
        res = gcd(a[1], a[2]);
        for (i = 3; i <= n; i++)
            res = gcd(a[i], res);
        System.out.println(res);
    }
}
