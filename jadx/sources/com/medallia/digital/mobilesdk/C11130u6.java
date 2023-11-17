package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import com.medallia.digital.mobilesdk.C10998m4;
import com.medallia.digital.mobilesdk.C11244z5;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.u6 */
class C11130u6 extends C11044p0<Void> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f31998g;

    /* renamed from: h */
    private final JSONObject f31999h;

    /* renamed from: com.medallia.digital.mobilesdk.u6$a */
    class C11131a implements C10812f6.C10813a {
        C11131a() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10735b4.m39113e(C11130u6.this.f31998g ? "Analytics V2 was submitted successfully" : "Analytics was submitted successfully");
            C10796e6<T> e6Var = C11130u6.this.f31743d;
            if (e6Var != null) {
                e6Var.mo27797a(null);
            }
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C11130u6.this.mo28877b(z5Var);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u6$b */
    class C11132b implements C10812f6.C10813a {
        C11132b() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10735b4.m39113e(C11130u6.this.f31998g ? "Analytics V2 was submitted successfully" : "Analytics was submitted successfully");
            C10796e6<T> e6Var = C11130u6.this.f31743d;
            if (e6Var != null) {
                e6Var.mo27797a(null);
            }
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C11130u6.this.mo28877b(z5Var);
        }
    }

    C11130u6(C10812f6 f6Var, C11063q0 q0Var, JSONObject jSONObject, C10796e6<Void> e6Var) {
        super(f6Var, q0Var, e6Var);
        this.f31999h = jSONObject;
        this.f31998g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        C11161w1 w1Var = C11244z5.C11245a.NO_CONNECTION.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.AUTH_NETWORK_ERROR) : C11244z5.C11245a.TIMEOUT.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.SUBMIT_ANALYTICS_ERROR) : new C11161w1(C10859h4.C10860a.SUBMIT_ANALYTICS_ERROR);
        C10735b4.m39111c(w1Var.getMessage());
        return w1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28254b() {
        C10735b4.m39109b(this.f31998g ? "Submit Analytics V2 started" : "Submit Analytics started");
        C10859h4 d = mo28255d();
        if (d != null) {
            C10796e6<T> e6Var = this.f31743d;
            if (e6Var != null) {
                e6Var.mo27796a(d);
            }
        } else if (this.f31741b.mo28932d() != null) {
            this.f31740a.mo28308a(this.f31741b.mo28932d(), this.f31741b.mo28933e(), (HashMap<String, String>) null, this.f31741b.mo28930b(), this.f31999h, (C10812f6.C10813a) new C11131a());
        } else {
            this.f31740a.mo28314b(this.f31741b.mo28933e(), (HashMap<String, String>) null, mo28873a(C10998m4.C11001c.ACCESS_TOKEN), this.f31999h, new C11132b());
        }
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
            C10859h4.C10860a aVar2 = C10859h4.C10860a.SUBMIT_ANALYTICS_EMPTY_ENDPOINT;
            C10735b4.m39111c(aVar2.toString());
            return new C10859h4(aVar2);
        }
    }

    C11130u6(C10812f6 f6Var, C11063q0 q0Var, JSONObject jSONObject, C10796e6<Void> e6Var, boolean z) {
        super(f6Var, q0Var, e6Var);
        this.f31999h = jSONObject;
        this.f31998g = z;
    }
}
