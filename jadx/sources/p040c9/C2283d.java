package p040c9;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p027b9.C2184f;
import p055d9.C5854a;
import p055d9.C5855b;

/* renamed from: c9.d */
public class C2283d implements C2281b, C5855b {

    /* renamed from: a */
    private C5854a f7087a;

    /* renamed from: c */
    private static String m8748c(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo121a(C5854a aVar) {
        this.f7087a = aVar;
        C2184f.m8346f().mo7089b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    /* renamed from: b */
    public void mo7325b(String str, Bundle bundle) {
        C5854a aVar = this.f7087a;
        if (aVar != null) {
            try {
                aVar.mo19069a("$A$:" + m8748c(str, bundle));
            } catch (JSONException unused) {
                C2184f.m8346f().mo7097k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
