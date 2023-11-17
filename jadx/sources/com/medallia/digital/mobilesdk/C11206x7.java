package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11209y1;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.x7 */
class C11206x7 implements C10756c1 {

    /* renamed from: a */
    private String f32246a;

    /* renamed from: b */
    private C11209y1.C11218i f32247b;

    /* renamed from: c */
    private ArrayList<C10840g6> f32248c;

    protected C11206x7(JSONObject jSONObject) {
        try {
            if (jSONObject.has(C11755a.C11756a.f34100b) && !jSONObject.isNull(C11755a.C11756a.f34100b)) {
                this.f32246a = jSONObject.getString(C11755a.C11756a.f34100b);
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.f32247b = C11209y1.C11218i.m41119a(jSONObject.getString("type"));
            }
            if (jSONObject.has("conversions") && !jSONObject.isNull("conversions")) {
                this.f32248c = ModelFactory.getInstance().getRuleConversionContract(jSONObject.getJSONArray("conversions"));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<C10840g6> mo29199a() {
        return this.f32248c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11209y1.C11218i mo29200b() {
        return this.f32247b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo29201c() {
        return this.f32246a;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"value\":");
            sb.append(C11051p3.m40518c(this.f32246a));
            sb.append(",\"type\":");
            C11209y1.C11218i iVar = this.f32247b;
            sb.append(C11051p3.m40518c(iVar != null ? iVar.toString() : null));
            sb.append(",\"conversions\":");
            sb.append(ModelFactory.getInstance().getRuleConversionsAsJsonString(this.f32248c));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
