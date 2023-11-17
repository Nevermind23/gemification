package p395dk;

import dagger.hilt.android.internal.managers.C12063d;
import dagger.hilt.android.internal.managers.C12065f;
import iu0.C36546y;
import p341ge.bog.mobilebank.app.MbankApp;
import p614tf.C17956a;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: dk.r */
public abstract class C12305r extends C36546y implements C18155c {

    /* renamed from: D */
    private boolean f36959D = false;

    /* renamed from: E */
    private final C12063d f36960E = new C12063d(new C12306a());

    /* renamed from: dk.r$a */
    class C12306a implements C12065f {
        C12306a() {
        }

        public Object get() {
            return C12142b.m44519a().mo32577a(new C17956a(C12305r.this)).mo32578b();
        }
    }

    public final Object generatedComponent() {
        return mo32902y0().generatedComponent();
    }

    public void onCreate() {
        mo32903z0();
        super.onCreate();
    }

    /* renamed from: y0 */
    public final C12063d mo32902y0() {
        return this.f36960E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public void mo32903z0() {
        if (!this.f36959D) {
            this.f36959D = true;
            ((C12307s) generatedComponent()).mo32856f((MbankApp) C18157e.m62250a(this));
        }
    }
}
