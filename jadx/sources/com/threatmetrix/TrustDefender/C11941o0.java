package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11969r1;
import p585re.C17589f;

/* renamed from: com.threatmetrix.TrustDefender.o0 */
public class C11941o0 {

    /* renamed from: g */
    private static final C11941o0 f35050g = new C11941o0();

    /* renamed from: a */
    private int f35051a = 0;

    /* renamed from: b */
    private long f35052b = 0;

    /* renamed from: c */
    private long f35053c = 0;

    /* renamed from: d */
    private long f35054d = 0;

    /* renamed from: e */
    private String f35055e = null;

    /* renamed from: f */
    private C17589f f35056f = C17589f.TMX_OK;

    /* renamed from: h */
    public static C11941o0 m43833h() {
        return f35050g;
    }

    /* renamed from: a */
    public void mo31994a(String str, C17589f fVar) {
        this.f35053c = this.f35052b;
        this.f35054d = C11969r1.C11986o.m44002b();
        this.f35055e = str;
        this.f35056f = fVar;
    }

    /* renamed from: b */
    public String mo31995b() {
        return this.f35055e;
    }

    /* renamed from: c */
    public long mo31996c() {
        return this.f35052b;
    }

    /* renamed from: d */
    public long mo31997d() {
        long j = this.f35054d;
        if (j == 0) {
            return 0;
        }
        return j - this.f35053c;
    }

    /* renamed from: e */
    public int mo31998e() {
        return this.f35051a;
    }

    /* renamed from: f */
    public C17589f mo31999f() {
        return this.f35056f;
    }

    /* renamed from: g */
    public long mo32000g() {
        return C11969r1.C11986o.m44002b() - this.f35052b;
    }

    /* renamed from: i */
    public void mo32001i() {
        this.f35051a++;
        this.f35052b = C11969r1.C11986o.m44002b();
    }
}
