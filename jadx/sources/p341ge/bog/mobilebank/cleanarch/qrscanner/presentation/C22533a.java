package p341ge.bog.mobilebank.cleanarch.qrscanner.presentation;

import android.content.Context;
import g70.C20769c;
import p000a.C0001b;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.a */
public abstract class C22533a extends C35388f2 {

    /* renamed from: F */
    private boolean f59588F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.a$a */
    class C22534a implements C0001b {
        C22534a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22533a.this.mo37460R0();
        }
    }

    C22533a() {
        m73062O0();
    }

    /* renamed from: O0 */
    private void m73062O0() {
        addOnContextAvailableListener(new C22534a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59588F) {
            this.f59588F = true;
            ((C20769c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32482j0((QrScannerActivity) C18157e.m62250a(this));
        }
    }
}
