package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.p7 */
public final class C4349p7 extends C4298m7 {
    public C4349p7() {
        super(4);
    }

    /* renamed from: a */
    public final C4349p7 mo13457a(Object... objArr) {
        C4468w7.m17094b(objArr, 15);
        int i = this.f13466b + 15;
        Object[] objArr2 = this.f13465a;
        int length = objArr2.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f13465a = Arrays.copyOf(objArr2, i2);
            this.f13467c = false;
        } else if (this.f13467c) {
            this.f13465a = (Object[]) objArr2.clone();
            this.f13467c = false;
        }
        System.arraycopy(objArr, 0, this.f13465a, this.f13466b, 15);
        this.f13466b += 15;
        return this;
    }

    /* renamed from: b */
    public final C4417t7 mo13458b() {
        this.f13467c = true;
        return C4417t7.m16742l(this.f13465a, this.f13466b);
    }
}
