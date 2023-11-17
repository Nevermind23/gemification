package p341ge.bog.mobilebank.consumerloanapplication.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import z80.C30249j;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.b */
public abstract class C22611b extends C30772sa {

    /* renamed from: F */
    private boolean f59719F = false;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.b$a */
    class C22612a implements C0001b {
        C22612a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22611b.this.mo37460R0();
        }
    }

    C22611b() {
        m73280O0();
    }

    /* renamed from: O0 */
    private void m73280O0() {
        addOnContextAvailableListener(new C22612a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59719F) {
            this.f59719F = true;
            ((C30249j) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32495n1((AddIncomeActivity) C18157e.m62250a(this));
        }
    }
}
