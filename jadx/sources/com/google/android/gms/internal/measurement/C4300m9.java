package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.m9 */
public abstract class C4300m9 extends C4129c8 {

    /* renamed from: d */
    private final C4351p9 f13469d;

    /* renamed from: e */
    protected C4351p9 f13470e;

    protected C4300m9(C4351p9 p9Var) {
        this.f13469d = p9Var;
        if (!p9Var.mo13478x()) {
            this.f13470e = p9Var.mo13473l();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: g */
    private static void m16270g(Object obj, Object obj2) {
        C4519za.m17310a().mo13872b(obj.getClass()).mo12993f(obj, obj2);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C4129c8 mo12984e(byte[] bArr, int i, int i2) {
        mo13360k(bArr, 0, i2, C4164e9.f13212c);
        return this;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4129c8 mo12985f(byte[] bArr, int i, int i2, C4164e9 e9Var) {
        mo13360k(bArr, 0, i2, e9Var);
        return this;
    }

    /* renamed from: h */
    public final C4300m9 clone() {
        C4300m9 m9Var = (C4300m9) this.f13469d.mo12903z(5, (Object) null, (Object) null);
        m9Var.f13470e = mo13356R();
        return m9Var;
    }

    /* renamed from: j */
    public final C4300m9 mo13359j(C4351p9 p9Var) {
        if (!this.f13469d.equals(p9Var)) {
            if (!this.f13470e.mo13478x()) {
                mo13364o();
            }
            m16270g(this.f13470e, p9Var);
        }
        return this;
    }

    /* renamed from: k */
    public final C4300m9 mo13360k(byte[] bArr, int i, int i2, C4164e9 e9Var) {
        if (!this.f13470e.mo13478x()) {
            mo13364o();
        }
        try {
            C4519za.m17310a().mo13872b(this.f13470e.getClass()).mo12991d(this.f13470e, bArr, 0, i2, new C4197g8(e9Var));
            return this;
        } catch (zzll e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.m17332f();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C4351p9 mo13361l() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.p9 r0 = r5.mo13356R()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo12903z(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.google.android.gms.internal.measurement.za r3 = com.google.android.gms.internal.measurement.C4519za.m17310a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.cb r3 = r3.mo13872b(r4)
            boolean r3 = r3.mo12995h(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo12903z(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.gms.internal.measurement.zznj r1 = new com.google.android.gms.internal.measurement.zznj
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4300m9.mo13361l():com.google.android.gms.internal.measurement.p9");
    }

    /* renamed from: m */
    public C4351p9 mo13356R() {
        if (!this.f13470e.mo13478x()) {
            return this.f13470e;
        }
        this.f13470e.mo13474t();
        return this.f13470e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo13363n() {
        if (!this.f13470e.mo13478x()) {
            mo13364o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo13364o() {
        C4351p9 l = this.f13469d.mo13473l();
        m16270g(l, this.f13470e);
        this.f13470e = l;
    }
}
