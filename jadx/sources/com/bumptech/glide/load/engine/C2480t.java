package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p089g4.C6219h;
import p089g4.C6224l;
import p166m3.C7083e;
import p166m3.C7088h;
import p166m3.C7092l;
import p205p3.C7674b;

/* renamed from: com.bumptech.glide.load.engine.t */
final class C2480t implements C7083e {

    /* renamed from: j */
    private static final C6219h f7879j = new C6219h(50);

    /* renamed from: b */
    private final C7674b f7880b;

    /* renamed from: c */
    private final C7083e f7881c;

    /* renamed from: d */
    private final C7083e f7882d;

    /* renamed from: e */
    private final int f7883e;

    /* renamed from: f */
    private final int f7884f;

    /* renamed from: g */
    private final Class f7885g;

    /* renamed from: h */
    private final C7088h f7886h;

    /* renamed from: i */
    private final C7092l f7887i;

    C2480t(C7674b bVar, C7083e eVar, C7083e eVar2, int i, int i2, C7092l lVar, Class cls, C7088h hVar) {
        this.f7880b = bVar;
        this.f7881c = eVar;
        this.f7882d = eVar2;
        this.f7883e = i;
        this.f7884f = i2;
        this.f7887i = lVar;
        this.f7885g = cls;
        this.f7886h = hVar;
    }

    /* renamed from: c */
    private byte[] m9588c() {
        C6219h hVar = f7879j;
        byte[] bArr = (byte[]) hVar.mo19816g(this.f7885g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f7885g.getName().getBytes(C7083e.f21042a);
        hVar.mo19820k(this.f7885g, bytes);
        return bytes;
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f7880b.mo22388d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f7883e).putInt(this.f7884f).array();
        this.f7882d.mo7845b(messageDigest);
        this.f7881c.mo7845b(messageDigest);
        messageDigest.update(bArr);
        C7092l lVar = this.f7887i;
        if (lVar != null) {
            lVar.mo7845b(messageDigest);
        }
        this.f7886h.mo7845b(messageDigest);
        messageDigest.update(m9588c());
        this.f7880b.mo22389e(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2480t)) {
            return false;
        }
        C2480t tVar = (C2480t) obj;
        if (this.f7884f != tVar.f7884f || this.f7883e != tVar.f7883e || !C6224l.m24735d(this.f7887i, tVar.f7887i) || !this.f7885g.equals(tVar.f7885g) || !this.f7881c.equals(tVar.f7881c) || !this.f7882d.equals(tVar.f7882d) || !this.f7886h.equals(tVar.f7886h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f7881c.hashCode() * 31) + this.f7882d.hashCode()) * 31) + this.f7883e) * 31) + this.f7884f;
        C7092l lVar = this.f7887i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f7885g.hashCode()) * 31) + this.f7886h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f7881c + ", signature=" + this.f7882d + ", width=" + this.f7883e + ", height=" + this.f7884f + ", decodedResourceClass=" + this.f7885g + ", transformation='" + this.f7887i + '\'' + ", options=" + this.f7886h + '}';
    }
}
