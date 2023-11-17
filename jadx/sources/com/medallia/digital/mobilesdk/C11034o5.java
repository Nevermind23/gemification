package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.C11017n5;

/* renamed from: com.medallia.digital.mobilesdk.o5 */
abstract class C11034o5<T> extends C11072r0<T> {

    /* renamed from: f */
    private long f31721f;

    /* renamed from: g */
    protected C11095t0 f31722g;

    /* renamed from: h */
    private C11017n5 f31723h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Handler f31724i = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Runnable f31725j = new C11035a();

    /* renamed from: com.medallia.digital.mobilesdk.o5$a */
    class C11035a extends C11033o4 {

        /* renamed from: com.medallia.digital.mobilesdk.o5$a$a */
        class C11036a extends C11033o4 {
            C11036a() {
            }

            /* renamed from: a */
            public void mo27617a() {
                C11034o5 o5Var = C11034o5.this;
                o5Var.mo28117a(o5Var.mo28122j());
                C11034o5.this.f31724i.postDelayed(C11034o5.this.f31725j, C11034o5.this.mo28858k().mo28833a());
            }
        }

        C11035a() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C11004m7.m40304b().mo28763a().execute(new C11036a());
        }
    }

    protected C11034o5(C11017n5 n5Var, C11083s0 s0Var) {
        super(s0Var);
        this.f31723h = n5Var == null ? new C11017n5() : n5Var;
        this.f31722g = new C11095t0();
    }

    /* renamed from: l */
    private boolean m40435l() {
        return System.currentTimeMillis() - this.f31721f >= this.f31723h.mo28833a();
    }

    /* renamed from: o */
    private void m40436o() {
        if (mo28858k().mo28835b() == C11017n5.C11018a.ONCE) {
            mo28117a(mo28122j());
        } else {
            mo28860n();
        }
    }

    /* renamed from: p */
    private void m40437p() {
        this.f31724i.removeCallbacks(this.f31725j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public T mo28122j() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C11017n5 mo28858k() {
        return this.f31723h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28859m() {
        if (mo28952h()) {
            mo28117a(mo28122j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo28860n() {
        if (mo28952h() && this.f31723h.mo28835b() == C11017n5.C11018a.FREQUENCY) {
            m40437p();
            if (m40435l()) {
                this.f31724i.post(this.f31725j);
            } else {
                this.f31724i.postDelayed(this.f31725j, this.f31723h.mo28833a());
            }
            this.f31721f = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo28861q() {
        m40437p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28856a(C11017n5 n5Var) {
        this.f31723h = n5Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28857a(C11095t0 t0Var) {
        this.f31722g = t0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28064a(boolean z) {
        super.mo28064a(z);
        if (z) {
            m40436o();
        } else {
            m40437p();
        }
    }
}
