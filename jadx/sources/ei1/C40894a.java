package ei1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ei1.a */
public abstract class C40894a {

    /* renamed from: a */
    private static final C40896b[] f96617a;

    /* renamed from: b */
    private static final List f96618b = new ArrayList();

    /* renamed from: c */
    static volatile C40896b[] f96619c;

    /* renamed from: d */
    private static final C40896b f96620d = new C40895a();

    /* renamed from: ei1.a$a */
    static class C40895a extends C40896b {
        C40895a() {
        }

        /* renamed from: a */
        public void mo95295a(Throwable th) {
            for (C40896b a : C40894a.f96619c) {
                a.mo95295a(th);
            }
        }

        /* renamed from: b */
        public void mo95296b(String str, Object... objArr) {
            for (C40896b b : C40894a.f96619c) {
                b.mo95296b(str, objArr);
            }
        }
    }

    /* renamed from: ei1.a$b */
    public static abstract class C40896b {

        /* renamed from: a */
        final ThreadLocal f96621a = new ThreadLocal();

        /* renamed from: a */
        public abstract void mo95295a(Throwable th);

        /* renamed from: b */
        public abstract void mo95296b(String str, Object... objArr);
    }

    static {
        C40896b[] bVarArr = new C40896b[0];
        f96617a = bVarArr;
        f96619c = bVarArr;
    }

    /* renamed from: a */
    public static void m118635a(Throwable th) {
        f96620d.mo95295a(th);
    }

    /* renamed from: b */
    public static C40896b m118636b(String str) {
        for (C40896b bVar : f96619c) {
            bVar.f96621a.set(str);
        }
        return f96620d;
    }
}
