package eg1;

import dg1.C40704w;
import kotlin.jvm.internal.C41536l;

/* renamed from: eg1.c */
public abstract class C40892c {
    /* renamed from: a */
    public static final int m118631a(int[] iArr, int i, int i2, int i3) {
        C41536l.m120489i(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m118632b(C40704w wVar, int i) {
        C41536l.m120489i(wVar, "<this>");
        int a = m118631a(wVar.mo94867H(), i + 1, 0, wVar.mo94868I().length);
        if (a >= 0) {
            return a;
        }
        return ~a;
    }
}
