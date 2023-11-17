package com.salesforce.marketingcloud.analytics.stats;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.stats.d */
public class C11396d {

    /* renamed from: a */
    final JSONObject f33129a;

    private C11396d(String str) {
        this.f33129a = new JSONObject(str);
    }

    /* renamed from: a */
    public static C11396d m41683a(String str) {
        return new C11396d(str);
    }

    /* renamed from: b */
    static C11396d m41694b(String str, String str2, Date date, String str3, String str4) {
        C11396d dVar = new C11396d(str, str2, date);
        dVar.m41701e(str3);
        dVar.m41696b(str4);
        return dVar;
    }

    /* renamed from: c */
    private void m41698c(String str) {
        this.f33129a.put("buttonId", str);
    }

    /* renamed from: d */
    private void m41700d(String str) {
        this.f33129a.put("id", str);
    }

    /* renamed from: e */
    private void m41701e(String str) {
        this.f33129a.put("messageId", str);
    }

    /* renamed from: f */
    private void m41702f(String str) {
        this.f33129a.put("name", str);
    }

    /* renamed from: g */
    private void m41703g(String str) {
        this.f33129a.put("outcomeType", str);
    }

    /* renamed from: h */
    private void m41704h(String str) {
        this.f33129a.put("triggerId", str);
    }

    private C11396d(String str, String str2, Date date) {
        JSONObject jSONObject = new JSONObject();
        this.f33129a = jSONObject;
        jSONObject.put("applicationId", str);
        jSONObject.put("deviceId", str2);
        jSONObject.put("eventDateUTC", C11824l.m43282a(date));
    }

    /* renamed from: a */
    static C11396d m41684a(String str, String str2, Date date, String str3, String str4) {
        C11396d dVar = new C11396d(str, str2, date);
        dVar.m41701e(str3);
        dVar.m41696b(str4);
        return dVar;
    }

    /* renamed from: b */
    private void m41695b() {
        this.f33129a.put(C11772k.C11773a.f34170b, "Android");
    }

    /* renamed from: c */
    private void m41699c(JSONObject jSONObject) {
        this.f33129a.put("metaData", jSONObject);
    }

    /* renamed from: a */
    static C11396d m41685a(String str, String str2, Date date, String str3, String str4, long j, int i, String str5) {
        C11396d dVar = new C11396d(str, str2, date);
        dVar.m41701e(str3);
        dVar.m41696b(str4);
        dVar.mo29842a(j);
        dVar.m41691a(i);
        dVar.m41698c(str5);
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29843b(int i) {
        this.f33129a.put("timeInApp", i);
    }

    /* renamed from: a */
    static C11396d m41686a(String str, String str2, Date date, String str3, String str4, String str5, String str6) {
        C11396d dVar = new C11396d(str, str2, date);
        dVar.m41701e(str3);
        dVar.m41696b(str4);
        dVar.m41704h(str5);
        dVar.m41703g(str6);
        return dVar;
    }

    /* renamed from: b */
    private void m41696b(String str) {
        if (str != null) {
            this.f33129a.put("activityInstanceId", str);
        }
    }

    /* renamed from: a */
    static C11396d m41687a(String str, String str2, Date date, String str3, String str4, List<String> list) {
        C11396d dVar = new C11396d(str, str2, date);
        dVar.m41701e(str3);
        dVar.m41696b(str4);
        dVar.m41692a(list);
        dVar.m41695b();
        return dVar;
    }

    /* renamed from: b */
    private void m41697b(JSONObject jSONObject) {
        this.f33129a.put("information", new JSONArray().put(jSONObject));
    }

    /* renamed from: a */
    static C11396d m41688a(String str, String str2, Date date, String str3, String str4, JSONObject jSONObject) {
        C11396d dVar = new C11396d(str, str2, date);
        dVar.m41697b(jSONObject);
        dVar.m41695b();
        if (str3 != null) {
            dVar.m41701e(str3);
        }
        if (str4 != null) {
            dVar.m41696b(str4);
        }
        return dVar;
    }

    /* renamed from: a */
    static C11396d m41689a(String str, String str2, Date date, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2) {
        C11396d dVar = new C11396d(str, str2, date);
        dVar.m41700d(str4);
        dVar.m41702f(str3);
        dVar.m41693a(jSONObject);
        dVar.m41699c(jSONObject2);
        return dVar;
    }

    /* renamed from: a */
    static C11396d m41690a(String str, String str2, Date date, JSONObject jSONObject) {
        C11396d dVar = new C11396d(str, str2, date);
        dVar.m41697b(jSONObject);
        dVar.m41695b();
        return dVar;
    }

    /* renamed from: a */
    public String mo29841a() {
        return this.f33129a.toString();
    }

    /* renamed from: a */
    private void m41691a(int i) {
        this.f33129a.put("dismissReason", i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29842a(long j) {
        this.f33129a.put("duration", j);
    }

    /* renamed from: a */
    private void m41692a(List<String> list) {
        this.f33129a.put("reasons", new JSONArray(list));
    }

    /* renamed from: a */
    private void m41693a(JSONObject jSONObject) {
        this.f33129a.put(C11772k.C11773a.f34176h, jSONObject);
    }
}
