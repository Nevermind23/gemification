package p105h7;

/* renamed from: h7.j */
public abstract class C6460j {
    /* renamed from: a */
    public static int m25554a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = C6461k.m25560a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = C6461k.m25560a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m25555b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m25559f(i, i2, "index"));
    }

    /* renamed from: c */
    public static void m25556c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m25557d(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C6461k.m25560a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: e */
    public static void m25558e(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m25559f(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m25559f(i2, i3, "end index");
            } else {
                str = C6461k.m25560a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: f */
    private static String m25559f(int i, int i2, String str) {
        if (i < 0) {
            return C6461k.m25560a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C6461k.m25560a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
