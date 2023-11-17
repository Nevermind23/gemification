package p341ge.bog.mobilebank.stories.presentation.activity;

import android.content.Context;
import p000a.C0001b;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.stories.presentation.activity.a */
public abstract class C34798a extends C35388f2 {

    /* renamed from: F */
    private boolean f84054F = false;

    /* renamed from: ge.bog.mobilebank.stories.presentation.activity.a$a */
    class C34799a implements C0001b {
        C34799a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34798a.this.mo37460R0();
        }
    }

    C34798a() {
        m102241O0();
    }

    /* renamed from: O0 */
    private void m102241O0() {
        addOnContextAvailableListener(new C34799a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84054F) {
            this.f84054F = true;
            ((C34805g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32456b0((StoryGroupActivity) C18157e.m62250a(this));
        }
    }
}
