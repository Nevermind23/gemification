package p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity;

import a81.C30772sa;
import android.content.Context;
import j10.C25305s;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.a */
public abstract class C21585a extends C30772sa {

    /* renamed from: F */
    private boolean f57678F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.a$a */
    class C21586a implements C0001b {
        C21586a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21585a.this.mo37460R0();
        }
    }

    C21585a() {
        m69785O0();
    }

    /* renamed from: O0 */
    private void m69785O0() {
        addOnContextAvailableListener(new C21586a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f57678F) {
            this.f57678F = true;
            ((C25305s) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32526y0((ContactDetailsActivity) C18157e.m62250a(this));
        }
    }
}
