package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.m */
public final class C5764m {

    /* renamed from: a */
    private final String f18197a;

    /* renamed from: b */
    private final byte[] f18198b;

    /* renamed from: c */
    private final int f18199c;

    /* renamed from: d */
    private C5766o[] f18200d;

    /* renamed from: e */
    private final C5751a f18201e;

    /* renamed from: f */
    private Map f18202f;

    /* renamed from: g */
    private final long f18203g;

    public C5764m(String str, byte[] bArr, C5766o[] oVarArr, C5751a aVar) {
        this(str, bArr, oVarArr, aVar, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void mo18892a(C5766o[] oVarArr) {
        C5766o[] oVarArr2 = this.f18200d;
        if (oVarArr2 == null) {
            this.f18200d = oVarArr;
        } else if (oVarArr != null && oVarArr.length > 0) {
            C5766o[] oVarArr3 = new C5766o[(oVarArr2.length + oVarArr.length)];
            System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
            System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
            this.f18200d = oVarArr3;
        }
    }

    /* renamed from: b */
    public C5751a mo18893b() {
        return this.f18201e;
    }

    /* renamed from: c */
    public byte[] mo18894c() {
        return this.f18198b;
    }

    /* renamed from: d */
    public Map mo18895d() {
        return this.f18202f;
    }

    /* renamed from: e */
    public C5766o[] mo18896e() {
        return this.f18200d;
    }

    /* renamed from: f */
    public String mo18897f() {
        return this.f18197a;
    }

    /* renamed from: g */
    public void mo18898g(Map map) {
        if (map != null) {
            Map map2 = this.f18202f;
            if (map2 == null) {
                this.f18202f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void mo18899h(C5765n nVar, Object obj) {
        if (this.f18202f == null) {
            this.f18202f = new EnumMap(C5765n.class);
        }
        this.f18202f.put(nVar, obj);
    }

    public String toString() {
        return this.f18197a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5764m(String str, byte[] bArr, C5766o[] oVarArr, C5751a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, oVarArr, aVar, j);
    }

    public C5764m(String str, byte[] bArr, int i, C5766o[] oVarArr, C5751a aVar, long j) {
        this.f18197a = str;
        this.f18198b = bArr;
        this.f18199c = i;
        this.f18200d = oVarArr;
        this.f18201e = aVar;
        this.f18202f = null;
        this.f18203g = j;
    }
}
