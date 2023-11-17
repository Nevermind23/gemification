package com.google.protobuf;

/* renamed from: com.google.protobuf.u0 */
final class C5726u0 implements C5659f0 {

    /* renamed from: a */
    private final C5677h0 f18093a;

    /* renamed from: b */
    private final String f18094b;

    /* renamed from: c */
    private final Object[] f18095c;

    /* renamed from: d */
    private final int f18096d;

    C5726u0(C5677h0 h0Var, String str, Object[] objArr) {
        this.f18093a = h0Var;
        this.f18094b = str;
        this.f18095c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f18096d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f18096d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo18632a() {
        return (this.f18096d & 2) == 2;
    }

    /* renamed from: b */
    public C5677h0 mo18633b() {
        return this.f18093a;
    }

    /* renamed from: c */
    public C5715r0 mo18634c() {
        return (this.f18096d & 1) == 1 ? C5715r0.PROTO2 : C5715r0.PROTO3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo18800d() {
        return this.f18095c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo18801e() {
        return this.f18094b;
    }
}
