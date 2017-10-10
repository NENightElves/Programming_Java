public class SpiralMatrix_formula
{
    public static void main(String[] args)
    {
        int[] x = new int[1000];
        int[] n = new int[1000];
        int[][] a = new int[1000][1000];
        //a为存取矩阵的数组，n为基础数字，x为基础减数
        int i, j;
        int nn = 4;
        int tmp;
        //生成基础数字
        n[1] = 0;
        tmp = nn + 1;
        for (i = 2; i <= nn / 2; i++)
        {
            tmp -= 2;
            n[i] = tmp * 4;
            n[i] += n[i - 1];
        }
        for (i = 1; i <= nn / 2; i++)
        {
            n[i] = n[i] - i - i + 1;
        }
        //生成减数
        tmp = nn;
        for (i = 1; i <= nn / 2; i++)
        {
            x[i] = tmp + tmp;
            tmp--;
        }
        //
        for (i = 1; i <= nn / 2; i++)
            for (j = i; j <= nn - i + 1; j++)
            {
                a[j][i] = n[i] - i - j + x[i] + x[i];
                a[i][j] = n[i] + i + j;
            }
        for (i = nn; i >= nn / 2 + 1; i--)
            for (j = nn - i + 1; j <= i; j++)
            {
                a[i][j] = n[nn - i + 1] + i - j + x[nn - i + 1];
                a[j][i] = n[nn - i + 1] + i + j;
            }
        if (nn % 2 == 1) a[(nn + 1) / 2][(nn + 1) / 2] = nn * nn;
        for (i = 1; i <= nn; i++)
        {
            for (j = 1; j <= nn; j++)
            {
                System.out.print(a[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

}
