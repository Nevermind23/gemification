package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m8 */
final class C4299m8 extends C4350p8 {

    /* renamed from: i */
    private final int f13468i;

    C4299m8(byte[] bArr, int i, int i2) {
        super(bArr);
        C4418t8.m16749r(0, i2, bArr.length);
        this.f13468i = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final int mo13352A() {
        return 0;
    }

    /* renamed from: b */
    public final byte mo13353b(int i) {
        int i2 = this.f13468i;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f13585h[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte mo13354c(int i) {
        return this.f13585h[i];
    }

    /* renamed from: g */
    public final int mo13355g() {
        return this.f13468i;
    }
}
