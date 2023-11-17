package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.NotFoundException;
import p200ob.C7507a;

/* renamed from: xb.a0 */
public final class C18657a0 extends C18683y {

    /* renamed from: j */
    private static final int[] f52264j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    static final int[][] f52265k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    private final int[] f52266i = new int[4];

    /* renamed from: t */
    public static String m63218t(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    /* renamed from: u */
    private static void m63219u(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f52265k[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.m23155a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo46488i(String str) {
        return super.mo46488i(m63218t(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int[] mo46489l(C7507a aVar, int i) {
        return C18683y.m63317o(aVar, i, true, f52264j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo46490m(C7507a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f52266i;
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
        m63219u(sb, i2);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C5751a mo46491r() {
        return C5751a.UPC_E;
    }
}
