package p134ja;

import java.util.Locale;

/* renamed from: ja.a */
public class C6763a {

    /* renamed from: c */
    private static volatile C6763a f20323c;

    /* renamed from: a */
    private final C6765c f20324a;

    /* renamed from: b */
    private boolean f20325b;

    public C6763a(C6765c cVar) {
        this.f20325b = false;
        this.f20324a = cVar == null ? C6765c.m26386c() : cVar;
    }

    /* renamed from: e */
    public static C6763a m26371e() {
        if (f20323c == null) {
            synchronized (C6763a.class) {
                if (f20323c == null) {
                    f20323c = new C6763a();
                }
            }
        }
        return f20323c;
    }

    /* renamed from: a */
    public void mo20804a(String str) {
        if (this.f20325b) {
            this.f20324a.mo20814a(str);
        }
    }

    /* renamed from: b */
    public void mo20805b(String str, Object... objArr) {
        if (this.f20325b) {
            this.f20324a.mo20814a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: c */
    public void mo20806c(String str) {
        if (this.f20325b) {
            this.f20324a.mo20815b(str);
        }
    }

    /* renamed from: d */
    public void mo20807d(String str, Object... objArr) {
        if (this.f20325b) {
            this.f20324a.mo20815b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: f */
    public void mo20808f(String str) {
        if (this.f20325b) {
            this.f20324a.mo20816d(str);
        }
    }

    /* renamed from: g */
    public void mo20809g(String str, Object... objArr) {
        if (this.f20325b) {
            this.f20324a.mo20816d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: h */
    public boolean mo20810h() {
        return this.f20325b;
    }

    /* renamed from: i */
    public void mo20811i(boolean z) {
        this.f20325b = z;
    }

    /* renamed from: j */
    public void mo20812j(String str) {
        if (this.f20325b) {
            this.f20324a.mo20817e(str);
        }
    }

    /* renamed from: k */
    public void mo20813k(String str, Object... objArr) {
        if (this.f20325b) {
            this.f20324a.mo20817e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private C6763a() {
        this((C6765c) null);
    }
}
