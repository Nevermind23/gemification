package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v8 */
final class C4452v8 extends C4485x8 {

    /* renamed from: b */
    private final byte[] f13762b;

    /* renamed from: c */
    private int f13763c;

    /* renamed from: d */
    private int f13764d;

    /* renamed from: e */
    private int f13765e = Integer.MAX_VALUE;

    /* synthetic */ C4452v8(byte[] bArr, int i, int i2, boolean z, C4435u8 u8Var) {
        super((C4469w8) null);
        this.f13762b = bArr;
        this.f13763c = 0;
    }

    /* renamed from: c */
    public final int mo13779c(int i) {
        int i2 = this.f13765e;
        this.f13765e = 0;
        int i3 = this.f13763c + this.f13764d;
        this.f13763c = i3;
        if (i3 > 0) {
            this.f13764d = i3;
            this.f13763c = i3 - i3;
        } else {
            this.f13764d = 0;
        }
        return i2;
    }
}
