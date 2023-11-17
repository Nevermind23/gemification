package p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload;

import a81.C30772sa;
import android.content.Context;
import b90.C19348f;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.c */
public abstract class C22642c extends C30772sa {

    /* renamed from: F */
    private boolean f59775F = false;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.c$a */
    class C22643a implements C0001b {
        C22643a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22642c.this.mo37460R0();
        }
    }

    C22642c() {
        m73381O0();
    }

    /* renamed from: O0 */
    private void m73381O0() {
        addOnContextAvailableListener(new C22643a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59775F) {
            this.f59775F = true;
            ((C19348f) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32503q0((DocumentsUploadActivity) C18157e.m62250a(this));
        }
    }
}
