package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C11089s6;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.f0 */
class C10802f0 extends C10785e0 {

    /* renamed from: i */
    private static final int f30926i = 6;

    /* renamed from: a */
    private String f30927a;

    /* renamed from: b */
    private Object f30928b;

    /* renamed from: c */
    private ValueType f30929c;

    /* renamed from: d */
    private Lifetime f30930d;

    /* renamed from: e */
    private GroupType f30931e;

    /* renamed from: f */
    private String f30932f;

    /* renamed from: g */
    private long f30933g;

    /* renamed from: h */
    private JSONObject f30934h;

    protected C10802f0() {
    }

    protected C10802f0(Object obj, GroupType groupType, Lifetime lifetime, ValueType valueType, String str) {
        try {
            this.f30932f = C11089s6.m40668b().mo28975a(C11089s6.C11090a.SESSION_ID, "");
            this.f30933g = System.currentTimeMillis();
            this.f30927a = str;
            this.f30928b = obj != null ? obj.toString() : null;
            this.f30929c = valueType;
            this.f30930d = lifetime;
            this.f30931e = groupType;
            m39386k();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: k */
    private void m39386k() {
        JSONObject jSONObject = new JSONObject();
        this.f30934h = jSONObject;
        jSONObject.put("sessionId", C11051p3.m40514a((Object) this.f30932f));
        this.f30934h.put(C11755a.C11756a.f34100b, C11051p3.m40514a(this.f30928b));
        this.f30934h.put("name", C11051p3.m40514a((Object) this.f30927a));
        this.f30934h.put("valueType", C11051p3.m40514a((Object) this.f30929c));
        this.f30934h.put("lifetime", C11051p3.m40514a((Object) this.f30930d));
        this.f30934h.put("groupType", C11051p3.m40514a((Object) this.f30931e));
        this.f30934h.put("timestamp", C11051p3.m40514a((Object) Long.valueOf(this.f30933g)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28275a() {
        return m39385a(Long.valueOf(mo28283h())) + m39385a(mo28281g()) + m39385a(getName()) + "=" + m39385a(mo28284i()) + "\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28276b() {
        return m39385a(C10749b8.m39172b(mo28283h())) + m39385a(Long.valueOf(mo28283h())) + m39385a(mo28281g().substring(0, 6) + "..") + m39385a(getName()) + "=" + m39385a(mo28284i()) + "\n";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo28277c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public JSONObject mo28278d() {
        return this.f30934h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public GroupType mo28279e() {
        return this.f30931e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Lifetime mo28280f() {
        return this.f30930d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo28281g() {
        return this.f30932f;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.UserJourneyData;
    }

    /* access modifiers changed from: protected */
    public String getName() {
        return this.f30927a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public long mo28283h() {
        return this.f30933g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo28284i() {
        return this.f30928b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public ValueType mo28285j() {
        return this.f30929c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28286l() {
        String a = C11089s6.m40668b().mo28975a(C11089s6.C11090a.SESSION_ID, "");
        this.f30932f = a;
        JSONObject jSONObject = this.f30934h;
        if (jSONObject != null) {
            Object obj = a;
            if (a == null) {
                try {
                    obj = JSONObject.NULL;
                } catch (JSONException e) {
                    C10735b4.m39111c(e.getMessage());
                    return;
                }
            }
            jSONObject.put("sessionId", obj);
        }
    }

    public String toString() {
        return "[" + C10749b8.m39170a(this.f30933g) + "]" + this.f30934h.toString();
    }

    protected C10802f0(Object obj, GroupType groupType, Lifetime lifetime, ValueType valueType, String str, long j, String str2) {
        try {
            this.f30932f = str2;
            this.f30933g = j;
            this.f30927a = str;
            this.f30928b = obj != null ? obj.toString() : null;
            this.f30929c = valueType;
            this.f30930d = lifetime;
            this.f30931e = groupType;
            m39386k();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    private String m39385a(Object obj) {
        return "[" + obj + "]";
    }

    protected C10802f0(JSONObject jSONObject, GroupType groupType, Lifetime lifetime, String str) {
        try {
            this.f30932f = C11089s6.m40668b().mo28975a(C11089s6.C11090a.SESSION_ID, "");
            this.f30933g = System.currentTimeMillis();
            this.f30927a = str;
            ValueType valueType = null;
            String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
            this.f30928b = jSONObject2;
            if (jSONObject2 != null) {
                valueType = ValueType.TypeString;
            }
            this.f30929c = valueType;
            this.f30930d = lifetime;
            this.f30931e = groupType;
            m39386k();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
