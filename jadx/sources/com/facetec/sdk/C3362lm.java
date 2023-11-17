package com.facetec.sdk;

/* renamed from: com.facetec.sdk.lm */
public final class C3362lm {

    /* renamed from: a */
    public static final C3435mq f11051a = C3435mq.m13741b(":");

    /* renamed from: b */
    public static final C3435mq f11052b = C3435mq.m13741b(":scheme");

    /* renamed from: c */
    public static final C3435mq f11053c = C3435mq.m13741b(":path");

    /* renamed from: d */
    public static final C3435mq f11054d = C3435mq.m13741b(":method");

    /* renamed from: e */
    public static final C3435mq f11055e = C3435mq.m13741b(":status");

    /* renamed from: g */
    public static final C3435mq f11056g = C3435mq.m13741b(":authority");

    /* renamed from: f */
    public final C3435mq f11057f;

    /* renamed from: i */
    public final C3435mq f11058i;

    /* renamed from: j */
    final int f11059j;

    /* renamed from: com.facetec.sdk.lm$d */
    interface C3363d {
    }

    public C3362lm(String str, String str2) {
        this(C3435mq.m13741b(str), C3435mq.m13741b(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3362lm) {
            C3362lm lmVar = (C3362lm) obj;
            if (!this.f11057f.equals(lmVar.f11057f) || !this.f11058i.equals(lmVar.f11058i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11057f.hashCode() + 527) * 31) + this.f11058i.hashCode();
    }

    public final String toString() {
        return C3303ki.m13262d("%s: %s", this.f11057f.mo9903e(), this.f11058i.mo9903e());
    }

    public C3362lm(C3435mq mqVar, String str) {
        this(mqVar, C3435mq.m13741b(str));
    }

    public C3362lm(C3435mq mqVar, C3435mq mqVar2) {
        this.f11057f = mqVar;
        this.f11058i = mqVar2;
        this.f11059j = mqVar.mo9906g() + 32 + mqVar2.mo9906g();
    }
}
