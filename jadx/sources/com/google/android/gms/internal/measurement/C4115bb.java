package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bb */
final class C4115bb implements C4335oa {

    /* renamed from: a */
    private final C4386ra f13160a;

    /* renamed from: b */
    private final String f13161b;

    /* renamed from: c */
    private final Object[] f13162c;

    /* renamed from: d */
    private final int f13163d;

    C4115bb(C4386ra raVar, String str, Object[] objArr) {
        this.f13160a = raVar;
        this.f13161b = str;
        this.f13162c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f13163d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.f13163d = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final C4386ra mo12951a() {
        return this.f13160a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo12952b() {
        return this.f13161b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo12953c() {
        return this.f13162c;
    }

    /* renamed from: q */
    public final boolean mo12954q() {
        return (this.f13163d & 2) == 2;
    }

    /* renamed from: s */
    public final int mo12955s() {
        return (this.f13163d & 1) == 1 ? 1 : 2;
    }
}
