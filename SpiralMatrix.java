import java.util.Scanner;

public class SpiralMatrix
{
    public static void main(String[] args)
    {
        int i, j, x, l, r;
        int n;
        int[][] a = new int[20][20];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        x = 0;
        r = n;
        l = 0;
        for (i = n; i > 0; i -= 2)
        {
            r--;
            l++;
            for (j = l; j <= r; j++) a[l][j] = ++x;
            for (j = l; j <= r; j++) a[j][r + 1] = ++x;
            for (j = r + 1; j >= l + 1; j--) a[r + 1][j] = ++x;
            for (j = r + 1; j >= l + 1; j--) a[j][l] = ++x;
        }
        if (n % 2 == 1) a[(n + 1) / 2][(n + 1) / 2] = n * n;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                System.out.print(a[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
