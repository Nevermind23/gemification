package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11209y1;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.g6 */
class C10840g6 implements C10756c1 {

    /* renamed from: a */
    private C11209y1.C11214e f31031a;

    /* renamed from: b */
    private String f31032b;

    protected C10840g6(JSONObject jSONObject) {
        try {
            if (jSONObject.has(C11755a.C11756a.f34100b) && !jSONObject.isNull(C11755a.C11756a.f34100b)) {
                this.f31032b = jSONObject.getString(C11755a.C11756a.f34100b);
            }
            if (jSONObject.has("ruleConversion") && !jSONObject.isNull("ruleConversion")) {
                this.f31031a = C11209y1.C11214e.m41114a(jSONObject.getString("ruleConversion"));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11209y1.C11214e mo28356a() {
        return this.f31031a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28357b() {
        return this.f31032b;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"value\":");
            sb.append(C11051p3.m40518c(this.f31032b));
            sb.append(",\"ruleConversion\":");
            C11209y1.C11214e eVar = this.f31031a;
            sb.append(C11051p3.m40518c(eVar != null ? eVar.toString() : null));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
