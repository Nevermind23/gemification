package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.z1 */
class C11236z1<T> implements C10756c1 {

    /* renamed from: a */
    private String f32578a;

    /* renamed from: b */
    private MDEngagementType f32579b;

    /* renamed from: c */
    private C11133u7<T> f32580c;

    public C11236z1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("engagementId") && !jSONObject.isNull("engagementId")) {
                this.f32578a = jSONObject.getString("engagementId");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.f32579b = MDEngagementType.fromString(jSONObject.getString("type"));
            }
            if (jSONObject.has("criteria") && !jSONObject.isNull("criteria")) {
                this.f32580c = ModelFactory.getInstance().getTriggerChildContract(jSONObject.getJSONObject("criteria"));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo29242a() {
        return this.f32578a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11133u7<T> mo29243b() {
        return this.f32580c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public MDEngagementType mo29244c() {
        return this.f32579b;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"engagementId\":");
            sb.append(C11051p3.m40518c(this.f32578a));
            sb.append(",\"type\":");
            MDEngagementType mDEngagementType = this.f32579b;
            sb.append(C11051p3.m40518c(mDEngagementType != null ? mDEngagementType.toString() : null));
            sb.append(",\"triggers\":");
            sb.append(this.f32580c.toJsonString());
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
