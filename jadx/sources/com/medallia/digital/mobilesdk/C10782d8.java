package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.d8 */
class C10782d8 extends C11044p0<String> {

    /* renamed from: g */
    private final C11173w4 f30877g;

    /* renamed from: h */
    private final C11148v4 f30878h;

    /* renamed from: com.medallia.digital.mobilesdk.d8$a */
    class C10783a implements C10812f6.C10813a {
        C10783a() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10735b4.m39109b("LivingLens UploadMediaClient - success");
            C10782d8.this.f31743d.mo27797a(b6Var.mo28125b());
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C10782d8.this.mo28877b(z5Var);
        }
    }

    C10782d8(C10812f6 f6Var, C11063q0 q0Var, C10796e6<String> e6Var, C11148v4 v4Var, C11173w4 w4Var) {
        super(f6Var, q0Var, e6Var);
        this.f30877g = w4Var;
        this.f30878h = v4Var;
        mo28876a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        return new C11161w1(C10859h4.C10860a.LL_UPLOADING_MEDIA_ERROR);
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
        try {
            this.f31740a.mo28312a(this.f30878h.mo29087b(), (HashMap<String, String>) null, (HashMap<String, String>) null, (JSONObject) null, this.f30877g.mo29139e(), (C10812f6.C10813a) new C10783a());
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10859h4 mo28255d() {
        if (TextUtils.isEmpty(this.f30878h.mo29087b())) {
            C10859h4.C10860a aVar = C10859h4.C10860a.LL_GET_PRESIGNED_URL_ERROR;
            C10735b4.m39111c(aVar.toString());
            return new C11161w1(aVar);
        } else if (this.f30877g != null) {
            return null;
        } else {
            C10859h4.C10860a aVar2 = C10859h4.C10860a.LL_UPLOADING_MEDIA_ERROR;
            C10735b4.m39111c(aVar2.toString());
            return new C11161w1(aVar2);
        }
    }
}
