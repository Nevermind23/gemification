package je1;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: je1.c */
public abstract class C41411c {
    /* renamed from: d */
    public static final Object[] m120147d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: e */
    public static final Object[] m120148e(Object[] objArr, int i) {
        C41536l.m120489i(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i);
        C41536l.m120488h(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: f */
    public static final void m120149f(Object[] objArr, int i) {
        C41536l.m120489i(objArr, "<this>");
        objArr[i] = null;
    }

    /* renamed from: g */
    public static final void m120150g(Object[] objArr, int i, int i2) {
        C41536l.m120489i(objArr, "<this>");
        while (i < i2) {
            m120149f(objArr, i);
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m120151h(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C41536l.m120484d(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final int m120152i(Object[] objArr, int i, int i2) {
        int i3;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = objArr[i + i5];
            int i6 = i4 * 31;
            if (obj != null) {
                i3 = obj.hashCode();
            } else {
                i3 = 0;
            }
            i4 = i6 + i3;
        }
        return i4;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final String m120153j(Object[] objArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[i + i3]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "sb.toString()");
        return sb2;
    }
}
