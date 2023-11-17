package p212pa;

import java.util.NoSuchElementException;

/* renamed from: pa.g */
public final class C7784g {

    /* renamed from: a */
    private final Object f22502a;

    private C7784g() {
        this.f22502a = null;
    }

    /* renamed from: a */
    public static C7784g m29491a() {
        return new C7784g();
    }

    /* renamed from: b */
    public static C7784g m29492b(Object obj) {
        return obj == null ? m29491a() : m29493e(obj);
    }

    /* renamed from: e */
    public static C7784g m29493e(Object obj) {
        return new C7784g(obj);
    }

    /* renamed from: c */
    public Object mo22546c() {
        Object obj = this.f22502a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: d */
    public boolean mo22547d() {
        return this.f22502a != null;
    }

    private C7784g(Object obj) {
        if (obj != null) {
            this.f22502a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
