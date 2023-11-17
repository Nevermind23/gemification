package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.y2 */
class C11219y2 extends C11044p0<String> {

    /* renamed from: g */
    private final String f32300g;

    /* renamed from: com.medallia.digital.mobilesdk.y2$a */
    class C11220a implements C10812f6.C10813a {
        C11220a() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10735b4.m39113e("LivingLens GetUrlMediaClient - success");
            C11219y2.this.f31743d.mo27797a(b6Var.mo28125b());
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C11219y2.this.mo28877b(z5Var);
        }
    }

    C11219y2(C10812f6 f6Var, C11063q0 q0Var, C10796e6<String> e6Var) {
        super(f6Var, q0Var, e6Var);
        this.f32300g = q0Var.mo28933e();
        mo28876a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        return new C11161w1(C10859h4.C10860a.LL_GET_PRESIGNED_URL_ERROR);
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
        this.f31740a.mo28310a(this.f32300g, this.f31741b.mo28931c(), (HashMap<String, String>) null, new C11220a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10859h4 mo28255d() {
        if (!TextUtils.isEmpty(this.f32300g)) {
            return null;
        }
        C10859h4.C10860a aVar = C10859h4.C10860a.LL_GET_PRESIGNED_URL_ERROR;
        C10735b4.m39111c(aVar.toString());
        return new C11161w1(aVar);
    }
}
