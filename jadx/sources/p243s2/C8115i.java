package p243s2;

import java.io.Serializable;

/* renamed from: s2.i */
public abstract class C8115i implements Serializable {
    private static final long serialVersionUID = 0;

    C8115i() {
    }

    /* renamed from: a */
    public static C8115i m30668a() {
        return C8101a.m30644k();
    }

    /* renamed from: d */
    public static C8115i m30669d(Object obj) {
        if (obj == null) {
            return m30668a();
        }
        return new C8116j(obj);
    }

    /* renamed from: h */
    public static C8115i m30670h(Object obj) {
        return new C8116j(C8140s.m30753a(obj));
    }

    /* renamed from: b */
    public abstract C8115i mo23276b(C8102b bVar);

    /* renamed from: c */
    public abstract C8115i mo23277c(C8105e eVar);

    /* renamed from: e */
    public abstract Object mo23278e();

    /* renamed from: f */
    public abstract boolean mo23280f();

    /* renamed from: g */
    public abstract C8115i mo23281g(C8105e eVar);

    /* renamed from: i */
    public abstract Object mo23283i();
}
