package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.NotFoundException;
import p200ob.C7507a;

/* renamed from: xb.i */
public final class C18667i extends C18683y {

    /* renamed from: j */
    static final int[] f52287j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f52288i = new int[4];

    /* renamed from: t */
    private static void m63256t(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f52287j[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.m23155a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo46490m(C7507a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f52288i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l = aVar.mo21961l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < l; i3++) {
            int k = C18683y.m63316k(aVar, iArr2, i, C18683y.f52319h);
            sb.append((char) ((k % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (k >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m63256t(sb, i2);
        int i5 = C18683y.m63317o(aVar, i, true, C18683y.f52316e)[1];
        for (int i6 = 0; i6 < 6 && i5 < l; i6++) {
            sb.append((char) (C18683y.m63316k(aVar, iArr2, i5, C18683y.f52318g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5751a mo46491r() {
        return C5751a.EAN_13;
    }
}
