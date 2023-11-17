package p663xb;

import com.google.zxing.C5751a;
import p200ob.C7507a;

/* renamed from: xb.k */
public final class C18669k extends C18683y {

    /* renamed from: i */
    private final int[] f52289i = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo46490m(C7507a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f52289i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l = aVar.mo21961l();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < l; i2++) {
            sb.append((char) (C18683y.m63316k(aVar, iArr2, i, C18683y.f52318g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = C18683y.m63317o(aVar, i, true, C18683y.f52316e)[1];
        for (int i5 = 0; i5 < 4 && i4 < l; i5++) {
            sb.append((char) (C18683y.m63316k(aVar, iArr2, i4, C18683y.f52318g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5751a mo46491r() {
        return C5751a.EAN_8;
    }
}
