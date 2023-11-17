package androidx.core.util;

/* renamed from: androidx.core.util.f */
public class C1006f implements C1005e {

    /* renamed from: a */
    private final Object[] f3644a;

    /* renamed from: b */
    private int f3645b;

    public C1006f(int i) {
        if (i > 0) {
            this.f3644a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m3519c(Object obj) {
        for (int i = 0; i < this.f3645b; i++) {
            if (this.f3644a[i] == obj) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3439a(Object obj) {
        if (!m3519c(obj)) {
            int i = this.f3645b;
            Object[] objArr = this.f3644a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = obj;
            this.f3645b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public Object mo3440b() {
        int i = this.f3645b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f3644a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f3645b = i - 1;
        return obj;
    }
}
