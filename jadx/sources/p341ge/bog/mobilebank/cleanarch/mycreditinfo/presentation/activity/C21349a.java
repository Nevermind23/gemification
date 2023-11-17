package p341ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity;

import android.content.Context;
import p000a.C0001b;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity;
import p627uf.C18155c;
import p627uf.C18157e;
import p918uz.C28954a;

/* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.a */
public abstract class C21349a extends ProductDescriptionActivity {

    /* renamed from: I */
    private boolean f57173I = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.a$a */
    class C21350a implements C0001b {
        C21350a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21349a.this.mo37460R0();
        }
    }

    C21349a() {
        m69020O0();
    }

    /* renamed from: O0 */
    private void m69020O0() {
        addOnContextAvailableListener(new C21350a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f57173I) {
            this.f57173I = true;
            ((C28954a) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32528z((MyCreditInfoDescriptionActivity) C18157e.m62250a(this));
        }
    }
}
