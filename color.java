public class color
{
    private int R, G, B;

    public color()
    {
        R = 0;
        G = 0;
        B = 0;
    }

    public color(int value)
    {
        int i;
        String s = Integer.toBinaryString(value);
        for (i = 8; i <= 15; i++)
            R = R * 10 + toInt(s, i);
        for (i = 16; i <= 23; i++)
            G = G * 10 + toInt(s, i);
        for (i = 24; i <= 31; i++)
            B = B * 10 + toInt(s, i);
        R = toOct(R);
        G = toOct(G);
        B = toOct(B);
    }

    public color(int a, int b, int c)
    {
        R = a;
        G = b;
        B = c;
    }

    private int toInt(String s, int i)
    {
        if (s.charAt(i) == '1') return 1;
        else return 0;
    }

    private int pow(int a, int b)
    {
        int s = 1;
        for (int i = 1; i <= b; i++) s *= a;
        return s;
    }

    private int toOct(int a)
    {
        int tmp = 0;
        for (int i = 0; i <= 7; i++)
            tmp += (a % 2) * pow(2, i);
        return tmp;
    }

    public String getColor()
    {
        return "0xff" + Integer.toHexString(R) + Integer.toHexString(G) + Integer.toHexString(B);
    }

    public int getR()
    {
        return R;
    }

    public int getG()
    {
        return G;
    }

    public int getB()
    {
        return B;
    }

    public int[] getColorRGB()
    {
        int[] a = new int[3];
        a[0] = R;
        a[1] = G;
        a[2] = B;
        return a;
    }

    public static void main(String[] args)
    {
        String s = Integer.toBinaryString(0xff00ff00);
        System.out.println(s);
        System.out.println(s.charAt(7));
        System.out.println(Integer.toHexString(255));
        color x = new color(0xff00ff00);
        return;
    }
}
