package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import p166m3.C7083e;

/* renamed from: com.bumptech.glide.load.engine.d */
final class C2441d implements C7083e {

    /* renamed from: b */
    private final C7083e f7701b;

    /* renamed from: c */
    private final C7083e f7702c;

    C2441d(C7083e eVar, C7083e eVar2) {
        this.f7701b = eVar;
        this.f7702c = eVar2;
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        this.f7701b.mo7845b(messageDigest);
        this.f7702c.mo7845b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2441d)) {
            return false;
        }
        C2441d dVar = (C2441d) obj;
        if (!this.f7701b.equals(dVar.f7701b) || !this.f7702c.equals(dVar.f7702c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f7701b.hashCode() * 31) + this.f7702c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f7701b + ", signature=" + this.f7702c + '}';
    }
}
