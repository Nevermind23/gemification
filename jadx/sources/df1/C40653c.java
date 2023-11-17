package df1;

/* renamed from: df1.c */
public abstract class C40653c {

    /* renamed from: a */
    private static final boolean f96281a = false;

    /* renamed from: b */
    private static final ThreadLocal[] f96282b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal();
        }
        f96282b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m117496a() {
        return f96281a;
    }
}
