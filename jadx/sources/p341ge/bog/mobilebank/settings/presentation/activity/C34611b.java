package p341ge.bog.mobilebank.settings.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import t11.C38632m;

/* renamed from: ge.bog.mobilebank.settings.presentation.activity.b */
public abstract class C34611b extends C30772sa {

    /* renamed from: F */
    private boolean f83625F = false;

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.b$a */
    class C34612a implements C0001b {
        C34612a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34611b.this.mo37460R0();
        }
    }

    C34611b() {
        m101582O0();
    }

    /* renamed from: O0 */
    private void m101582O0() {
        addOnContextAvailableListener(new C34612a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f83625F) {
            this.f83625F = true;
            ((C38632m) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32494n0((SettingsActivity) C18157e.m62250a(this));
        }
    }
}
