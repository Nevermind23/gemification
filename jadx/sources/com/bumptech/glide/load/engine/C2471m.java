package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;
import p089g4.C6223k;
import p166m3.C7083e;
import p166m3.C7088h;

/* renamed from: com.bumptech.glide.load.engine.m */
class C2471m implements C7083e {

    /* renamed from: b */
    private final Object f7842b;

    /* renamed from: c */
    private final int f7843c;

    /* renamed from: d */
    private final int f7844d;

    /* renamed from: e */
    private final Class f7845e;

    /* renamed from: f */
    private final Class f7846f;

    /* renamed from: g */
    private final C7083e f7847g;

    /* renamed from: h */
    private final Map f7848h;

    /* renamed from: i */
    private final C7088h f7849i;

    /* renamed from: j */
    private int f7850j;

    C2471m(Object obj, C7083e eVar, int i, int i2, Map map, Class cls, Class cls2, C7088h hVar) {
        this.f7842b = C6223k.m24730d(obj);
        this.f7847g = (C7083e) C6223k.m24731e(eVar, "Signature must not be null");
        this.f7843c = i;
        this.f7844d = i2;
        this.f7848h = (Map) C6223k.m24730d(map);
        this.f7845e = (Class) C6223k.m24731e(cls, "Resource class must not be null");
        this.f7846f = (Class) C6223k.m24731e(cls2, "Transcode class must not be null");
        this.f7849i = (C7088h) C6223k.m24730d(hVar);
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2471m)) {
            return false;
        }
        C2471m mVar = (C2471m) obj;
        if (!this.f7842b.equals(mVar.f7842b) || !this.f7847g.equals(mVar.f7847g) || this.f7844d != mVar.f7844d || this.f7843c != mVar.f7843c || !this.f7848h.equals(mVar.f7848h) || !this.f7845e.equals(mVar.f7845e) || !this.f7846f.equals(mVar.f7846f) || !this.f7849i.equals(mVar.f7849i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f7850j == 0) {
            int hashCode = this.f7842b.hashCode();
            this.f7850j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f7847g.hashCode()) * 31) + this.f7843c) * 31) + this.f7844d;
            this.f7850j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f7848h.hashCode();
            this.f7850j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f7845e.hashCode();
            this.f7850j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f7846f.hashCode();
            this.f7850j = hashCode5;
            this.f7850j = (hashCode5 * 31) + this.f7849i.hashCode();
        }
        return this.f7850j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f7842b + ", width=" + this.f7843c + ", height=" + this.f7844d + ", resourceClass=" + this.f7845e + ", transcodeClass=" + this.f7846f + ", signature=" + this.f7847g + ", hashCode=" + this.f7850j + ", transformations=" + this.f7848h + ", options=" + this.f7849i + '}';
    }
}
