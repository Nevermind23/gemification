package ie1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.l */
abstract class C41331l extends C41329k {
    /* renamed from: c */
    public static List m119759c(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        List a = C41335n.m119804a(objArr);
        C41536l.m120488h(a, "asList(this)");
        return a;
    }

    /* renamed from: d */
    public static byte[] m119760d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C41536l.m120489i(bArr, "<this>");
        C41536l.m120489i(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: e */
    public static Object[] m119761e(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    /* renamed from: f */
    public static /* synthetic */ byte[] m119762f(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m119760d(bArr, bArr2, i, i2, i3);
    }

    /* renamed from: g */
    public static /* synthetic */ Object[] m119763g(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m119761e(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: h */
    public static byte[] m119764h(byte[] bArr, int i, int i2) {
        C41536l.m120489i(bArr, "<this>");
        C41327j.m119757b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C41536l.m120488h(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: i */
    public static Object[] m119765i(Object[] objArr, int i, int i2) {
        C41536l.m120489i(objArr, "<this>");
        C41327j.m119757b(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        C41536l.m120488h(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: j */
    public static void m119766j(int[] iArr, int i, int i2, int i3) {
        C41536l.m120489i(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: k */
    public static void m119767k(Object[] objArr, Object obj, int i, int i2) {
        C41536l.m120489i(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    /* renamed from: l */
    public static /* synthetic */ void m119768l(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m119767k(objArr, obj, i, i2);
    }

    /* renamed from: m */
    public static Object[] m119769m(Object[] objArr, Object obj) {
        C41536l.m120489i(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        C41536l.m120488h(copyOf, "result");
        return copyOf;
    }

    /* renamed from: n */
    public static Object[] m119770n(Object[] objArr, Object[] objArr2) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(objArr2, "elements");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        C41536l.m120488h(copyOf, "result");
        return copyOf;
    }

    /* renamed from: o */
    public static final void m119771o(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* renamed from: p */
    public static final void m119772p(Object[] objArr, Comparator comparator) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* renamed from: q */
    public static final Character[] m119773q(char[] cArr) {
        C41536l.m120489i(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }
}
