package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.r5 */
class C11077r5 extends C11044p0<String> {

    /* renamed from: g */
    private final C11173w4 f31843g;

    /* renamed from: h */
    private final C11099t4 f31844h;

    /* renamed from: i */
    private final C11148v4 f31845i;

    /* renamed from: j */
    private String f31846j;

    /* renamed from: com.medallia.digital.mobilesdk.r5$a */
    class C11078a implements C10812f6.C10813a {
        C11078a() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10735b4.m39109b("LivingLens ProcessMediaClient - success");
            C11077r5.this.f31743d.mo27797a(b6Var.mo28125b());
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C11077r5.this.mo28877b(z5Var);
        }
    }

    C11077r5(C10812f6 f6Var, C11063q0 q0Var, C11173w4 w4Var, C11099t4 t4Var, C11148v4 v4Var, C10796e6<String> e6Var) {
        super(f6Var, q0Var, e6Var);
        this.f31843g = w4Var;
        this.f31844h = t4Var;
        this.f31845i = v4Var;
        mo28876a(false);
    }

    /* renamed from: e */
    private JSONObject m40633e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", new JSONObject().put("id", "").put("type", "media-capture-upload").put(C11772k.C11773a.f34176h, m40634f()));
            C10735b4.m39113e("LivingLens Media Object: " + jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            C10735b4.m39111c("LivingLens Can not create Media Object To Process " + e.getMessage());
            return null;
        }
    }

    /* renamed from: f */
    private JSONObject m40634f() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject put = jSONObject.put("clientId", this.f31844h.mo29005b()).put("apiKey", this.f31844h.mo29004a());
            put.put("title", this.f31843g.mo29137c() + "-" + this.f31843g.getFormId() + " sent at: " + this.f31843g.mo29144h()).put("mediaType", C10721a5.m39052d(this.f31843g.mo29141f())).put("thirdPartySource", "Medallia").put("thirdPartyMediaId", this.f31845i.mo29086a()).put("languageCode", C11221y3.m41127d().mo29219e()).put("countryCode", C11221y3.m41127d().mo29209a()).put("description", "Android Digital SDK Media Capture").put("namedFilters", m40636h());
            jSONObject.put("metadata", m40635g());
        } catch (Exception e) {
            C10735b4.m39111c("LivingLens " + e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: g */
    private JSONObject m40635g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("respondentId", this.f31843g.mo29135b()).put("questionId", "");
        } catch (Exception e) {
            C10735b4.m39111c("LivingLens Can not getMetaDataObject" + e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: h */
    private JSONArray m40636h() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> e = this.f31844h.mo29008e();
        if (e != null) {
            try {
                String str = "empty";
                if (e.contains(C11086s3.f31867a)) {
                    jSONArray.put(new JSONObject().put("group", C11086s3.f31867a).put("filters", new JSONArray().put(!this.f31843g.getFormId().isEmpty() ? this.f31843g.getFormId() : str)));
                }
                if (e.contains(C11086s3.f31868b)) {
                    jSONArray.put(new JSONObject().put("group", C11086s3.f31868b).put("filters", new JSONArray().put(!this.f31843g.getFormId().isEmpty() ? this.f31843g.mo29137c() : str)));
                }
                if (e.contains(C11086s3.f31869c)) {
                    jSONArray.put(new JSONObject().put("group", C11086s3.f31869c).put("filters", new JSONArray().put(!this.f31843g.mo29133a().isEmpty() ? this.f31843g.mo29133a() : str)));
                }
                if (e.contains(C11086s3.f31870d)) {
                    jSONArray.put(new JSONObject().put("group", C11086s3.f31870d).put("filters", new JSONArray().put(!this.f31843g.mo29138d().isEmpty() ? this.f31843g.mo29138d() : str)));
                }
                if (e.contains(C11086s3.f31871e)) {
                    JSONObject put = new JSONObject().put("group", C11086s3.f31871e);
                    JSONArray jSONArray2 = new JSONArray();
                    if (!this.f31843g.mo29135b().isEmpty()) {
                        str = this.f31843g.mo29135b();
                    }
                    jSONArray.put(put.put("filters", jSONArray2.put(str)));
                }
            } catch (Exception e2) {
                C10735b4.m39111c("LivingLens " + e2.getMessage());
            }
        }
        return jSONArray;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        return new C11161w1(C10859h4.C10860a.LL_PROCESSING_MEDIA_ERROR);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28254b() {
        C11099t4 t4Var = this.f31844h;
        if (!(t4Var == null || t4Var.mo29005b() == null || this.f31844h.mo29007d() == null || this.f31844h.mo29004a() == null || this.f31844h.mo29006c() == null || this.f31844h.mo29011h() == null)) {
            this.f31846j = this.f31844h.mo29007d() + this.f31844h.mo29006c() + this.f31844h.mo29005b() + this.f31844h.mo29011h();
        }
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
            this.f31740a.mo28314b(this.f31846j, (HashMap<String, String>) null, (HashMap<String, String>) null, m40633e(), new C11078a());
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10859h4 mo28255d() {
        if (TextUtils.isEmpty(this.f31846j)) {
            C10859h4.C10860a aVar = C10859h4.C10860a.LL_PROCESSING_MEDIA_END_POINT;
            C10735b4.m39111c(aVar.toString());
            return new C11161w1(aVar);
        } else if (this.f31843g != null && this.f31844h != null && this.f31845i != null) {
            return null;
        } else {
            C10859h4.C10860a aVar2 = C10859h4.C10860a.LL_EMPTY_MEDIA_DATA_OBJECT;
            C10735b4.m39111c(aVar2.toString());
            return new C11161w1(aVar2);
        }
    }
}
