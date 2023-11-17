package p341ge.bog.mobilebank.cleanarch.presentation.pushnotification;

import android.content.Context;
import o50.C26752s;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import w00.C29189a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.a */
public abstract class C22338a extends C29189a {

    /* renamed from: F */
    private boolean f59208F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.a$a */
    class C22339a implements C0001b {
        C22339a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22338a.this.mo37460R0();
        }
    }

    C22338a() {
        m72437O0();
    }

    /* renamed from: O0 */
    private void m72437O0() {
        addOnContextAvailableListener(new C22339a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59208F) {
            this.f59208F = true;
            ((C26752s) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32400I1((PushNotificationHandlerActivity) C18157e.m62250a(this));
        }
    }
}
