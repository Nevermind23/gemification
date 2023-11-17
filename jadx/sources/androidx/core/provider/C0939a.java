package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C0947f;
import androidx.core.provider.C0953g;

/* renamed from: androidx.core.provider.a */
class C0939a {

    /* renamed from: a */
    private final C0953g.C0956c f3555a;

    /* renamed from: b */
    private final Handler f3556b;

    /* renamed from: androidx.core.provider.a$a */
    class C0940a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0953g.C0956c f3557d;

        /* renamed from: e */
        final /* synthetic */ Typeface f3558e;

        C0940a(C0953g.C0956c cVar, Typeface typeface) {
            this.f3557d = cVar;
            this.f3558e = typeface;
        }

        public void run() {
            this.f3557d.mo3330b(this.f3558e);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    class C0941b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0953g.C0956c f3560d;

        /* renamed from: e */
        final /* synthetic */ int f3561e;

        C0941b(C0953g.C0956c cVar, int i) {
            this.f3560d = cVar;
            this.f3561e = i;
        }

        public void run() {
            this.f3560d.mo3329a(this.f3561e);
        }
    }

    C0939a(C0953g.C0956c cVar, Handler handler) {
        this.f3555a = cVar;
        this.f3556b = handler;
    }

    /* renamed from: a */
    private void m3388a(int i) {
        this.f3556b.post(new C0941b(this.f3555a, i));
    }

    /* renamed from: c */
    private void m3389c(Typeface typeface) {
        this.f3556b.post(new C0940a(this.f3555a, typeface));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3382b(C0947f.C0952e eVar) {
        if (eVar.mo3399a()) {
            m3389c(eVar.f3584a);
        } else {
            m3388a(eVar.f3585b);
        }
    }
}
