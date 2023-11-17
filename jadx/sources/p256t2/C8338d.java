package p256t2;

import kotlin.jvm.internal.C41536l;

/* renamed from: t2.d */
public final class C8338d {

    /* renamed from: a */
    public static final C8338d f23735a = new C8338d();

    private C8338d() {
    }

    /* renamed from: a */
    public final String mo23506a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        C41536l.m120490j(iArr, "stack");
        C41536l.m120490j(strArr, "pathNames");
        C41536l.m120490j(iArr2, "pathIndices");
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        String sb2 = sb.toString();
        C41536l.m120485e(sb2, "result.toString()");
        return sb2;
    }
}
