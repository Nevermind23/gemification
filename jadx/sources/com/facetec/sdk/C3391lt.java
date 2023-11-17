package com.facetec.sdk;

/* renamed from: com.facetec.sdk.lt */
public final class C3391lt {

    /* renamed from: b */
    final int[] f11185b = new int[10];

    /* renamed from: e */
    int f11186e;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo9763b(int i) {
        return this.f11185b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo9764c(int i) {
        return ((1 << i) & this.f11186e) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C3391lt mo9766d(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f11185b;
            if (i < iArr.length) {
                this.f11186e = (1 << i) | this.f11186e;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: b */
    public final int mo9762b() {
        if ((this.f11186e & 128) != 0) {
            return this.f11185b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo9765d() {
        if ((this.f11186e & 2) != 0) {
            return this.f11185b[1];
        }
        return -1;
    }
}
