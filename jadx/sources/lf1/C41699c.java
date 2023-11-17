package lf1;

import mf1.C41760b;

/* renamed from: lf1.c */
public abstract class C41699c {
    /* renamed from: a */
    private static String[] m120947a(char c, C41760b bVar) {
        String[] b = m120948b(c);
        if (b == null) {
            return null;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = C41698b.m120946b(b[i], bVar);
        }
        return b;
    }

    /* renamed from: b */
    private static String[] m120948b(char c) {
        return C41695a.m120939c().mo96500b(c);
    }

    /* renamed from: c */
    public static String[] m120949c(char c, C41760b bVar) {
        return m120947a(c, bVar);
    }
}
