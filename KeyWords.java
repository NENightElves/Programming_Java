import sun.nio.cs.ext.JIS_X_0201;

import java.lang.reflect.Array;
import java.time.OffsetDateTime;
import java.time.chrono.IsoChronology;
import java.util.Arrays;
import java.util.Collections;

public class KeyWords
{
    public static void main(String args[])
    {
        int i, j, m;
        String x;
        String[] s = {"abstract", "boolean", "break", "byte", "case", "catch", "char", "class", "default", "continue", "do", "double", "else", "extends", "false", "final", "finally", "float", "for", "if", "implements", "import", "instanceof", "int", "interface", "long", "native new", "null", "package", "private", "protected", "public", "return", "short", "static", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "true", "void", "volatile", "while"};
        Arrays.sort(s);
        x = "";

        for (i = 0; i <= s.length - 2; i++)
            for (j = i + 1; j <= s.length - 1; j++)
                if (s[i].compareTo(s[j]) > 0)
                {
                    x = s[i];
                    s[i] = s[j];
                    s[j] = x;
                }

        x = "catch";
        for (i = 0; i <= s.length - 1; i++)
            if (s[i].equals(x))
            {
                System.out.println(i);
                break;
            }
        if (i == s.length) System.out.println("Not Found!");

        x = "catch";
        i = 0;
        j = s.length - 1;
        while (i <= j)
        {
            m = (i + j) / 2;
            if (x == s[m])
            {
                System.out.println(m);
                break;
            } else if (s[m].compareTo(x) < 0)
            {
                j = m - 1;
            } else
            {
                i = m + 1;
            }
        }
        if (i > j) System.out.println("Not Found!");
        x = "";
    }
}