package androidx.core.util;

/* renamed from: androidx.core.util.g */
public class C1007g extends C1006f {

    /* renamed from: c */
    private final Object f3646c = new Object();

    public C1007g(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo3439a(Object obj) {
        boolean a;
        synchronized (this.f3646c) {
            a = super.mo3439a(obj);
        }
        return a;
    }

    /* renamed from: b */
    public Object mo3440b() {
        Object b;
        synchronized (this.f3646c) {
            b = super.mo3440b();
        }
        return b;
    }
}
