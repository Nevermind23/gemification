package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
public final class C4103b {

    /* renamed from: a */
    private String f13149a;

    /* renamed from: b */
    private final long f13150b;

    /* renamed from: c */
    private final Map f13151c;

    public C4103b(String str, long j, Map map) {
        this.f13149a = str;
        this.f13150b = j;
        HashMap hashMap = new HashMap();
        this.f13151c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo12879a() {
        return this.f13150b;
    }

    /* renamed from: b */
    public final C4103b clone() {
        return new C4103b(this.f13149a, this.f13150b, new HashMap(this.f13151c));
    }

    /* renamed from: c */
    public final Object mo12881c(String str) {
        if (this.f13151c.containsKey(str)) {
            return this.f13151c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo12883d() {
        return this.f13149a;
    }

    /* renamed from: e */
    public final Map mo12884e() {
        return this.f13151c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4103b)) {
            return false;
        }
        C4103b bVar = (C4103b) obj;
        if (this.f13150b == bVar.f13150b && this.f13149a.equals(bVar.f13149a)) {
            return this.f13151c.equals(bVar.f13151c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo12886f(String str) {
        this.f13149a = str;
    }

    /* renamed from: g */
    public final void mo12887g(String str, Object obj) {
        if (obj == null) {
            this.f13151c.remove(str);
        } else {
            this.f13151c.put(str, obj);
        }
    }

    public final int hashCode() {
        long j = this.f13150b;
        return (((this.f13149a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f13151c.hashCode();
    }

    public final String toString() {
        String str = this.f13149a;
        long j = this.f13150b;
        String obj = this.f13151c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
