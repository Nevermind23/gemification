package p337z7;

import java.util.concurrent.ExecutionException;

/* renamed from: z7.n */
final class C9237n implements C9236m {

    /* renamed from: a */
    private final Object f25665a = new Object();

    /* renamed from: b */
    private final int f25666b;

    /* renamed from: c */
    private final C9230h0 f25667c;

    /* renamed from: d */
    private int f25668d;

    /* renamed from: e */
    private int f25669e;

    /* renamed from: f */
    private int f25670f;

    /* renamed from: g */
    private Exception f25671g;

    /* renamed from: h */
    private boolean f25672h;

    public C9237n(int i, C9230h0 h0Var) {
        this.f25666b = i;
        this.f25667c = h0Var;
    }

    /* renamed from: c */
    private final void m34125c() {
        if (this.f25668d + this.f25669e + this.f25670f != this.f25666b) {
            return;
        }
        if (this.f25671g != null) {
            C9230h0 h0Var = this.f25667c;
            int i = this.f25669e;
            int i2 = this.f25666b;
            h0Var.mo24889u(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f25671g));
        } else if (this.f25672h) {
            this.f25667c.mo24891w();
        } else {
            this.f25667c.mo24890v((Object) null);
        }
    }

    /* renamed from: a */
    public final void mo17635a(Object obj) {
        synchronized (this.f25665a) {
            this.f25668d++;
            m34125c();
        }
    }

    /* renamed from: b */
    public final void mo18086b() {
        synchronized (this.f25665a) {
            this.f25670f++;
            this.f25672h = true;
            m34125c();
        }
    }

    public final void onFailure(Exception exc) {
        synchronized (this.f25665a) {
            this.f25669e++;
            this.f25671g = exc;
            m34125c();
        }
    }
}
