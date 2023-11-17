package p159l9;

import org.json.JSONObject;
import p068e9.C6104r;
import p159l9.C7018d;

/* renamed from: l9.l */
class C7029l implements C7025h {
    C7029l() {
    }

    /* renamed from: b */
    private static C7018d.C7019a m27205b(JSONObject jSONObject) {
        return new C7018d.C7019a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* renamed from: c */
    private static C7018d.C7020b m27206c(JSONObject jSONObject) {
        return new C7018d.C7020b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m27207d(C6104r rVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return rVar.mo19626a() + (j * 1000);
    }

    /* renamed from: a */
    public C7018d mo21230a(C6104r rVar, JSONObject jSONObject) {
        C7018d.C7020b bVar;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        double optDouble = jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject2.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject2.has("session")) {
            bVar = m27206c(jSONObject2.getJSONObject("session"));
        } else {
            bVar = m27206c(new JSONObject());
        }
        return new C7018d(m27207d(rVar, (long) optInt2, jSONObject2), bVar, m27205b(jSONObject2.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
