package p154l4;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: l4.a */
public class C6880a {

    /* renamed from: a */
    private final String f20604a;

    /* renamed from: b */
    private final C6882b f20605b;

    /* renamed from: c */
    private final C6881a f20606c;

    /* renamed from: d */
    private final String f20607d;

    /* renamed from: e */
    private final List f20608e;

    /* renamed from: f */
    private final List f20609f;

    /* renamed from: g */
    private final String f20610g;

    /* renamed from: h */
    private final String f20611h;

    /* renamed from: i */
    private final String f20612i;

    /* renamed from: l4.a$a */
    public enum C6881a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: l4.a$b */
    public enum C6882b {
        MANUAL,
        INFERENCE
    }

    public C6880a(String str, C6882b bVar, C6881a aVar, String str2, List list, List list2, String str3, String str4, String str5) {
        this.f20604a = str;
        this.f20605b = bVar;
        this.f20606c = aVar;
        this.f20607d = str2;
        this.f20608e = list;
        this.f20609f = list2;
        this.f20610g = str3;
        this.f20611h = str4;
        this.f20612i = str5;
    }

    /* renamed from: c */
    public static C6880a m26720c(JSONObject jSONObject) {
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        Locale locale = Locale.ENGLISH;
        C6882b valueOf = C6882b.valueOf(string2.toUpperCase(locale));
        C6881a valueOf2 = C6881a.valueOf(jSONObject.getString("event_type").toUpperCase(locale));
        String string3 = jSONObject.getString(C11772k.C11773a.f34185q);
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C6884c(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C6883b(optJSONArray.getJSONObject(i2)));
            }
        }
        return new C6880a(string, valueOf, valueOf2, string3, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m26721f(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r1 >= r2) goto L_0x001e
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            l4.a r3 = m26720c(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r0.add(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p154l4.C6880a.m26721f(org.json.JSONArray):java.util.List");
    }

    /* renamed from: a */
    public String mo20973a() {
        return this.f20612i;
    }

    /* renamed from: b */
    public String mo20974b() {
        return this.f20604a;
    }

    /* renamed from: d */
    public List mo20975d() {
        return Collections.unmodifiableList(this.f20609f);
    }

    /* renamed from: e */
    public List mo20976e() {
        return Collections.unmodifiableList(this.f20608e);
    }
}
