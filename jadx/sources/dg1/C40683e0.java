package dg1;

import dg1.C40672b;
import eg1.C40891b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: dg1.e0 */
public abstract class C40683e0 {

    /* renamed from: a */
    private static final C40672b.C40673a f96332a = new C40672b.C40673a();

    /* renamed from: b */
    private static final int f96333b = -1234567890;

    /* renamed from: a */
    public static final boolean m117728a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C41536l.m120489i(bArr, "a");
        C41536l.m120489i(bArr2, "b");
        if (i3 <= 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
            if (i5 >= i3) {
                return true;
            }
            i4 = i5;
        }
    }

    /* renamed from: b */
    public static final void m117729b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final C40672b.C40673a m117730c() {
        return f96332a;
    }

    /* renamed from: d */
    public static final int m117731d(C40681e eVar, int i) {
        C41536l.m120489i(eVar, "<this>");
        if (i == f96333b) {
            return eVar.mo94793B();
        }
        return i;
    }

    /* renamed from: e */
    public static final C40672b.C40673a m117732e(C40672b.C40673a aVar) {
        C41536l.m120489i(aVar, "unsafeCursor");
        if (aVar == f96332a) {
            return new C40672b.C40673a();
        }
        return aVar;
    }

    /* renamed from: f */
    public static final int m117733f(int i) {
        return ((i & C11051p3.f31759c) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: g */
    public static final short m117734g(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: h */
    public static final String m117735h(byte b) {
        return C40439w.m117110n(new char[]{C40891b.m118630f()[(b >> 4) & 15], C40891b.m118630f()[b & 15]});
    }

    /* renamed from: i */
    public static final String m117736i(int i) {
        if (i == 0) {
            return BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        }
        int i2 = 0;
        char[] cArr = {C40891b.m118630f()[(i >> 28) & 15], C40891b.m118630f()[(i >> 24) & 15], C40891b.m118630f()[(i >> 20) & 15], C40891b.m118630f()[(i >> 16) & 15], C40891b.m118630f()[(i >> 12) & 15], C40891b.m118630f()[(i >> 8) & 15], C40891b.m118630f()[(i >> 4) & 15], C40891b.m118630f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return C40439w.m117111o(cArr, i2, 8);
    }
}
