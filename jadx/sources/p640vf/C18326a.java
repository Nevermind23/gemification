package p640vf;

import java.util.LinkedHashMap;

/* renamed from: vf.a */
public abstract class C18326a {
    /* renamed from: a */
    private static int m62667a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static LinkedHashMap m62668b(int i) {
        return new LinkedHashMap(m62667a(i));
    }
}
