package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints;

import a81.C30772sa;
import android.content.Context;
import et0.C31802e;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.d */
public abstract class C32947d extends C30772sa {

    /* renamed from: F */
    private boolean f80820F = false;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.d$a */
    class C32948a implements C0001b {
        C32948a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32947d.this.mo37460R0();
        }
    }

    C32947d() {
        m97219O0();
    }

    /* renamed from: O0 */
    private void m97219O0() {
        addOnContextAvailableListener(new C32948a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80820F) {
            this.f80820F = true;
            ((C31802e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32519w((ExchangeMrPointsToPlusActivity) C18157e.m62250a(this));
        }
    }
}
