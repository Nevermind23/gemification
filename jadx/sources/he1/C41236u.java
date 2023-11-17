package he1;

import java.util.Collection;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: he1.u */
public abstract class C41236u implements Collection, C43151a {
    /* renamed from: b */
    public static int[] m119494b(int i) {
        return m119495c(new int[i]);
    }

    /* renamed from: c */
    public static int[] m119495c(int[] iArr) {
        C41536l.m120489i(iArr, "storage");
        return iArr;
    }

    /* renamed from: i */
    public static final int m119496i(int[] iArr, int i) {
        return C41234t.m119493a(iArr[i]);
    }

    /* renamed from: j */
    public static int m119497j(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: l */
    public static final void m119498l(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }
}
