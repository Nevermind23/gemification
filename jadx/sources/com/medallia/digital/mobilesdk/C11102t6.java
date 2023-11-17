package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10895j0;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.t6 */
class C11102t6 extends C10895j0<String> {

    /* renamed from: com.medallia.digital.mobilesdk.t6$a */
    class C11103a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f31938a;

        C11103a(String str) {
            this.f31938a = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10735b4.m39109b("Status: " + C11102t6.this.mo28514h());
            if (C11102t6.this.mo28513g() != null) {
                try {
                    C11102t6.this.mo28513g().mo28086a(new C10739b6(C11102t6.this.mo28514h(), this.f31938a));
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    protected C11102t6(C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, JSONObject jSONObject, int i, C10812f6.C10813a aVar) {
        super(dVar, str, hashMap, jSONObject, i, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo28511b(InputStream inputStream) {
        try {
            return C10988l8.m40230a(inputStream).toString("UTF-8");
        } catch (Exception unused) {
            mo28508a(-44);
            return null;
        }
    }

    protected C11102t6(C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, JSONObject jSONObject, String str2, int i, C10812f6.C10813a aVar) {
        super(dVar, str, hashMap, jSONObject, str2, i, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28509a(String str) {
        C11004m7.m40304b().mo28763a().execute(new C11103a(str));
    }
}
