package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.g */
public class C5447g {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Date f17388g = new Date(0);

    /* renamed from: a */
    private JSONObject f17389a;

    /* renamed from: b */
    private JSONObject f17390b;

    /* renamed from: c */
    private Date f17391c;

    /* renamed from: d */
    private JSONArray f17392d;

    /* renamed from: e */
    private JSONObject f17393e;

    /* renamed from: f */
    private long f17394f;

    /* renamed from: com.google.firebase.remoteconfig.internal.g$b */
    public static class C5449b {

        /* renamed from: a */
        private JSONObject f17395a;

        /* renamed from: b */
        private Date f17396b;

        /* renamed from: c */
        private JSONArray f17397c;

        /* renamed from: d */
        private JSONObject f17398d;

        /* renamed from: e */
        private long f17399e;

        /* renamed from: a */
        public C5447g mo18097a() {
            return new C5447g(this.f17395a, this.f17396b, this.f17397c, this.f17398d, this.f17399e);
        }

        /* renamed from: b */
        public C5449b mo18098b(JSONObject jSONObject) {
            try {
                this.f17395a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: c */
        public C5449b mo18099c(JSONArray jSONArray) {
            try {
                this.f17397c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C5449b mo18100d(Date date) {
            this.f17396b = date;
            return this;
        }

        /* renamed from: e */
        public C5449b mo18101e(JSONObject jSONObject) {
            try {
                this.f17398d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: f */
        public C5449b mo18102f(long j) {
            this.f17399e = j;
            return this;
        }

        private C5449b() {
            this.f17395a = new JSONObject();
            this.f17396b = C5447g.f17388g;
            this.f17397c = new JSONArray();
            this.f17398d = new JSONObject();
            this.f17399e = 0;
        }
    }

    /* renamed from: b */
    static C5447g m21662b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C5447g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    /* renamed from: c */
    private static C5447g m21663c(JSONObject jSONObject) {
        return m21662b(new JSONObject(jSONObject.toString()));
    }

    /* renamed from: j */
    public static C5449b m21664j() {
        return new C5449b();
    }

    /* renamed from: d */
    public JSONArray mo18088d() {
        return this.f17392d;
    }

    /* renamed from: e */
    public Set mo18089e(C5447g gVar) {
        JSONObject f = m21663c(gVar.f17389a).mo18091f();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = mo18091f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!gVar.mo18091f().has(next)) {
                hashSet.add(next);
            } else if (!mo18091f().get(next).equals(gVar.mo18091f().get(next))) {
                hashSet.add(next);
            } else if ((mo18093h().has(next) && !gVar.mo18093h().has(next)) || (!mo18093h().has(next) && gVar.mo18093h().has(next))) {
                hashSet.add(next);
            } else if (!mo18093h().has(next) || !gVar.mo18093h().has(next) || mo18093h().getJSONObject(next).toString().equals(gVar.mo18093h().getJSONObject(next).toString())) {
                f.remove(next);
            } else {
                hashSet.add(next);
            }
        }
        Iterator<String> keys2 = f.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5447g)) {
            return false;
        }
        return this.f17389a.toString().equals(((C5447g) obj).toString());
    }

    /* renamed from: f */
    public JSONObject mo18091f() {
        return this.f17390b;
    }

    /* renamed from: g */
    public Date mo18092g() {
        return this.f17391c;
    }

    /* renamed from: h */
    public JSONObject mo18093h() {
        return this.f17393e;
    }

    public int hashCode() {
        return this.f17389a.hashCode();
    }

    /* renamed from: i */
    public long mo18095i() {
        return this.f17394f;
    }

    public String toString() {
        return this.f17389a.toString();
    }

    private C5447g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.f17390b = jSONObject;
        this.f17391c = date;
        this.f17392d = jSONArray;
        this.f17393e = jSONObject2;
        this.f17394f = j;
        this.f17389a = jSONObject3;
    }
}
