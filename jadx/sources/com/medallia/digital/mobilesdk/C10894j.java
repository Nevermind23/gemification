package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.j */
class C10894j {

    /* renamed from: a */
    private boolean f31272a;

    /* renamed from: b */
    private boolean f31273b;

    /* renamed from: c */
    private C10819g f31274c;

    /* renamed from: d */
    private Integer f31275d;

    /* renamed from: e */
    private Integer f31276e;

    /* renamed from: f */
    private boolean f31277f;

    /* renamed from: g */
    private Integer f31278g;

    C10894j(JSONObject jSONObject) {
        try {
            if (jSONObject.has("analyticsV2Enabled") && !jSONObject.isNull("analyticsV2Enabled")) {
                this.f31272a = jSONObject.getBoolean("analyticsV2Enabled");
            }
            if (jSONObject.has("sendUserJourneyEnabled") && !jSONObject.isNull("sendUserJourneyEnabled")) {
                this.f31273b = jSONObject.getBoolean("sendUserJourneyEnabled");
            }
            if (jSONObject.has("analyticsEndpointConfigurationContract") && !jSONObject.isNull("analyticsEndpointConfigurationContract")) {
                this.f31274c = new C10819g(jSONObject.getJSONObject("analyticsEndpointConfigurationContract"));
            }
            if (jSONObject.has("maxRecordsToSubmit") && !jSONObject.isNull("maxRecordsToSubmit")) {
                this.f31275d = Integer.valueOf(jSONObject.getInt("maxRecordsToSubmit"));
            }
            if (jSONObject.has("maxRecursiveSubmits") && !jSONObject.isNull("maxRecursiveSubmits")) {
                this.f31276e = Integer.valueOf(jSONObject.getInt("maxRecursiveSubmits"));
            }
            if (jSONObject.has("isSamplingEnabled") && !jSONObject.isNull("isSamplingEnabled")) {
                this.f31277f = jSONObject.getBoolean("isSamplingEnabled");
            }
            if (jSONObject.has("samplePercent") && !jSONObject.isNull("samplePercent")) {
                this.f31278g = Integer.valueOf(jSONObject.getInt("samplePercent"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10819g mo28499a() {
        return this.f31274c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Integer mo28500b() {
        return this.f31275d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Integer mo28501c() {
        return this.f31276e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo28502d() {
        return this.f31278g.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo28503e() {
        return this.f31272a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo28504f() {
        return this.f31277f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo28505g() {
        return this.f31273b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo28506h() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"analyticsV2Enabled\":");
            sb.append(this.f31272a);
            sb.append(",\"sendUserJourneyEnabled\":");
            sb.append(this.f31273b);
            sb.append(",\"analyticsEndpointConfigurationContract\":");
            C10819g gVar = this.f31274c;
            sb.append(gVar == null ? "null" : gVar.mo28325d());
            sb.append(",\"maxRecordsToSubmit\":");
            sb.append(this.f31275d);
            sb.append(",\"maxRecursiveSubmits\":");
            sb.append(this.f31276e);
            sb.append(",\"isSamplingEnabled\":");
            sb.append(this.f31277f);
            sb.append(",\"samplePercent\":");
            sb.append(this.f31278g);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    C10894j(boolean z, boolean z2) {
        this.f31272a = z;
        this.f31273b = z2;
    }
}
