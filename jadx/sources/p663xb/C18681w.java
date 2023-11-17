package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5764m;
import com.google.zxing.C5765n;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;
import p200ob.C7507a;

/* renamed from: xb.w */
final class C18681w {

    /* renamed from: c */
    private static final int[] f52309c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f52310a = new int[4];

    /* renamed from: b */
    private final StringBuilder f52311b = new StringBuilder();

    C18681w() {
    }

    /* renamed from: a */
    private int m63308a(C7507a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f52310a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l = aVar.mo21961l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < l; i3++) {
            int k = C18683y.m63316k(aVar, iArr2, i, C18683y.f52319h);
            sb.append((char) ((k % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (k >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.mo21960k(aVar.mo21959j(i));
            }
        }
        if (sb.length() == 5) {
            if (m63310d(sb.toString()) == m63309c(i2)) {
                return i;
            }
            throw NotFoundException.m23155a();
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: c */
    private static int m63309c(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f52309c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: d */
    private static int m63310d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r5.equals("90000") == false) goto L_0x001d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m63311e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L_0x004d
            r2 = 53
            if (r1 == r2) goto L_0x004a
            r2 = 57
            java.lang.String r4 = ""
            if (r1 == r2) goto L_0x0015
            goto L_0x004f
        L_0x0015:
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case 54118329: goto L_0x0035;
                case 54395376: goto L_0x002a;
                case 54395377: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r2
            goto L_0x003e
        L_0x001f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 2
            goto L_0x003e
        L_0x002a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r0 = r3
            goto L_0x003e
        L_0x0035:
            java.lang.String r1 = "90000"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x003e
            goto L_0x001d
        L_0x003e:
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x004f
        L_0x0042:
            java.lang.String r5 = "0.00"
            return r5
        L_0x0045:
            java.lang.String r5 = "Used"
            return r5
        L_0x0048:
            r5 = 0
            return r5
        L_0x004a:
            java.lang.String r4 = "$"
            goto L_0x004f
        L_0x004d:
            java.lang.String r4 = "£"
        L_0x004f:
            java.lang.String r5 = r5.substring(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L_0x006e
            java.lang.String r1 = "0"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0072
        L_0x006e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x0072:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p663xb.C18681w.m63311e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static Map m63312f(String str) {
        String e;
        if (str.length() != 5 || (e = m63311e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5765n.class);
        enumMap.put(C5765n.SUGGESTED_PRICE, e);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5764m mo46498b(int i, C7507a aVar, int[] iArr) {
        StringBuilder sb = this.f52311b;
        sb.setLength(0);
        int a = m63308a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map f = m63312f(sb2);
        float f2 = (float) i;
        C5764m mVar = new C5764m(sb2, (byte[]) null, new C5766o[]{new C5766o(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new C5766o((float) a, f2)}, C5751a.UPC_EAN_EXTENSION);
        if (f != null) {
            mVar.mo18898g(f);
        }
        return mVar;
    }
}
