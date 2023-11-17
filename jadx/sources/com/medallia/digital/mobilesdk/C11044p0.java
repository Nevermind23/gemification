package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10998m4;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.p0 */
abstract class C11044p0<T> {

    /* renamed from: a */
    protected C10812f6 f31740a;

    /* renamed from: b */
    protected C11063q0 f31741b;

    /* renamed from: c */
    protected C11156w f31742c;

    /* renamed from: d */
    protected C10796e6<T> f31743d;

    /* renamed from: e */
    private boolean f31744e = true;

    /* renamed from: f */
    private int f31745f;

    C11044p0(C10812f6 f6Var, C11063q0 q0Var, C10796e6<T> e6Var) {
        this.f31740a = f6Var;
        this.f31741b = q0Var == null ? new C11063q0() : q0Var;
        this.f31742c = new C11156w(f6Var);
        this.f31743d = e6Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C10859h4 mo28253a(C11244z5 z5Var);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HashMap<String, String> mo28873a(C10998m4.C11001c cVar) {
        return this.f31742c.mo29099a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo28254b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28877b(C11244z5 z5Var) {
        int i;
        if (z5Var.mo29259b() != 401 || (i = this.f31745f) >= 2) {
            C10796e6<T> e6Var = this.f31743d;
            if (e6Var != null) {
                e6Var.mo27796a(mo28253a(z5Var));
                return;
            }
            return;
        }
        this.f31745f = i + 1;
        mo28875a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28878c() {
        if (!this.f31744e) {
            mo28254b();
        } else {
            mo28875a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C10859h4 mo28255d();

    /* renamed from: com.medallia.digital.mobilesdk.p0$a */
    class C11045a implements C10796e6<Void> {
        C11045a() {
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C11044p0.this.f31743d.mo27796a(h4Var);
        }

        /* renamed from: a */
        public void mo27797a(Void voidR) {
            C11044p0.this.mo28254b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HashMap<String, String> mo28874a(String str) {
        return this.f31742c.mo29100a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28875a() {
        this.f31742c.mo29101a((C10796e6<Void>) new C11045a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28876a(boolean z) {
        this.f31744e = z;
    }
}
