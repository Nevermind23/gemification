package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import com.medallia.digital.mobilesdk.C10998m4;
import com.medallia.digital.mobilesdk.C11244z5;
import java.io.File;

/* renamed from: com.medallia.digital.mobilesdk.x2 */
class C11200x2 extends C11044p0<File> {

    /* renamed from: g */
    private final boolean f32233g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f32234h;

    /* renamed from: com.medallia.digital.mobilesdk.x2$a */
    class C11201a implements C10812f6.C10813a {
        C11201a() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10735b4.m39113e("getResource - success");
            File a = C10930k2.m39972a(C11200x2.this.f32234h, b6Var.mo28124a());
            C10796e6<T> e6Var = C11200x2.this.f31743d;
            if (e6Var != null) {
                e6Var.mo27797a(a);
            }
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C11200x2.this.mo28877b(z5Var);
        }
    }

    C11200x2(C10812f6 f6Var, C11063q0 q0Var, String str, C10796e6<File> e6Var, boolean z) {
        super(f6Var, q0Var, e6Var);
        this.f32234h = str;
        this.f32233g = z;
        mo28876a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        C11161w1 w1Var = C11244z5.C11245a.NO_CONNECTION.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.AUTH_NETWORK_ERROR) : C11244z5.C11245a.TIMEOUT.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.GET_RESOURCE_TIMEOUT) : new C11161w1(C10859h4.C10860a.GET_RESOURCE_ERROR);
        C10735b4.m39111c(w1Var.getMessage());
        return w1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28254b() {
        C10859h4 d = mo28255d();
        if (d != null) {
            C10796e6<T> e6Var = this.f31743d;
            if (e6Var != null) {
                e6Var.mo27796a(d);
                return;
            }
            return;
        }
        this.f31740a.mo28309a(C11051p3.m40516a(this.f31741b.mo28933e(), true), this.f32233g ? mo28873a(C10998m4.C11001c.ACCESS_TOKEN) : null, (C10812f6.C10813a) new C11201a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10859h4 mo28255d() {
        if (C10718a3.m39038c().mo28069a() == null) {
            C10859h4.C10860a aVar = C10859h4.C10860a.ACCESS_TOKEN_EMPTY;
            C10735b4.m39111c(aVar.toString());
            return new C11161w1(aVar);
        } else if (!TextUtils.isEmpty(this.f31741b.mo28933e())) {
            return null;
        } else {
            C10859h4.C10860a aVar2 = C10859h4.C10860a.RESOURCE_EMPTY_ENDPOINT;
            C10735b4.m39111c(aVar2.toString());
            return new C11161w1(aVar2);
        }
    }
}
