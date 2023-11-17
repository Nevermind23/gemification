package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5764m;
import com.google.zxing.C5765n;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;
import p200ob.C7507a;

/* renamed from: xb.v */
final class C18680v {

    /* renamed from: a */
    private final int[] f52307a = new int[4];

    /* renamed from: b */
    private final StringBuilder f52308b = new StringBuilder();

    C18680v() {
    }

    /* renamed from: a */
    private int m63305a(C7507a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f52307a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l = aVar.mo21961l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < l; i3++) {
            int k = C18683y.m63316k(aVar, iArr2, i, C18683y.f52319h);
            sb.append((char) ((k % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (k >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.mo21960k(aVar.mo21959j(i));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.m23155a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw NotFoundException.m23155a();
        }
    }

    /* renamed from: c */
    private static Map m63306c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5765n.class);
        enumMap.put(C5765n.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5764m mo46497b(int i, C7507a aVar, int[] iArr) {
        StringBuilder sb = this.f52308b;
        sb.setLength(0);
        int a = m63305a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map c = m63306c(sb2);
        float f = (float) i;
        C5764m mVar = new C5764m(sb2, (byte[]) null, new C5766o[]{new C5766o(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C5766o((float) a, f)}, C5751a.UPC_EAN_EXTENSION);
        if (c != null) {
            mVar.mo18898g(c);
        }
        return mVar;
    }
}
