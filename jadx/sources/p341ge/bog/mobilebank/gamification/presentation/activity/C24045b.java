package p341ge.bog.mobilebank.gamification.presentation.activity;

import android.content.Context;
import mh0.C26231c;
import p000a.C0001b;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.gamification.presentation.activity.b */
public abstract class C24045b extends C35388f2 {

    /* renamed from: F */
    private boolean f62375F = false;

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.b$a */
    class C24046a implements C0001b {
        C24046a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C24045b.this.mo37460R0();
        }
    }

    C24045b() {
        m77540O0();
    }

    /* renamed from: O0 */
    private void m77540O0() {
        addOnContextAvailableListener(new C24046a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f62375F) {
            this.f62375F = true;
            ((C26231c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32426R0((GamificationActivity) C18157e.m62250a(this));
        }
    }
}
