package ie1;

import com.github.mikephil.charting.utils.Utils;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;
import ze1.C43420e;

/* renamed from: ie1.m */
abstract class C41333m extends C41331l {
    /* renamed from: A */
    public static Object m119774A(Object[] objArr, int i) {
        C41536l.m120489i(objArr, "<this>");
        if (i < 0 || i > m119800y(objArr)) {
            return null;
        }
        return objArr[i];
    }

    /* renamed from: B */
    public static final int m119775B(int[] iArr, int i) {
        C41536l.m120489i(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: C */
    public static int m119776C(Object[] objArr, Object obj) {
        C41536l.m120489i(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (C41536l.m120484d(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: D */
    public static final Appendable m119777D(int[] iArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar) {
        C41536l.m120489i(iArr, "<this>");
        C41536l.m120489i(appendable, "buffer");
        C41536l.m120489i(charSequence, "separator");
        C41536l.m120489i(charSequence2, "prefix");
        C41536l.m120489i(charSequence3, "postfix");
        C41536l.m120489i(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Integer.valueOf(i3)));
            } else {
                appendable.append(String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: E */
    public static final Appendable m119778E(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(appendable, "buffer");
        C41536l.m120489i(charSequence, "separator");
        C41536l.m120489i(charSequence2, "prefix");
        C41536l.m120489i(charSequence3, "postfix");
        C41536l.m120489i(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C40429o.m117087a(appendable, obj, lVar);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: F */
    public static final String m119779F(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar) {
        C41536l.m120489i(iArr, "<this>");
        C41536l.m120489i(charSequence, "separator");
        C41536l.m120489i(charSequence2, "prefix");
        C41536l.m120489i(charSequence3, "postfix");
        C41536l.m120489i(charSequence4, "truncated");
        String sb = ((StringBuilder) m119777D(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C41536l.m120488h(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: G */
    public static final String m119780G(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(charSequence, "separator");
        C41536l.m120489i(charSequence2, "prefix");
        C41536l.m120489i(charSequence3, "postfix");
        C41536l.m120489i(charSequence4, "truncated");
        String sb = ((StringBuilder) m119778E(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C41536l.m120488h(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: H */
    public static /* synthetic */ String m119781H(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m119779F(iArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    /* renamed from: I */
    public static /* synthetic */ String m119782I(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m119780G(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    /* renamed from: J */
    public static char m119783J(char[] cArr) {
        C41536l.m120489i(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: K */
    public static Object m119784K(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* renamed from: L */
    public static List m119785L(char[] cArr) {
        C41536l.m120489i(cArr, "<this>");
        Character[] q = C41331l.m119773q(cArr);
        C41331l.m119771o((Comparable[]) q);
        return C41331l.m119759c(q);
    }

    /* renamed from: M */
    public static float m119786M(float[] fArr) {
        C41536l.m120489i(fArr, "<this>");
        float f = Utils.FLOAT_EPSILON;
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    /* renamed from: N */
    public static Collection m119787N(Object[] objArr, Collection collection) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(collection, "destination");
        for (Object add : objArr) {
            collection.add(add);
        }
        return collection;
    }

    /* renamed from: O */
    public static List m119788O(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C41341q.m119907j();
        }
        if (length != 1) {
            return m119790Q(objArr);
        }
        return C41339p.m119900e(objArr[0]);
    }

    /* renamed from: P */
    public static List m119789P(int[] iArr) {
        C41536l.m120489i(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: Q */
    public static List m119790Q(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        return new ArrayList(C41341q.m119904g(objArr));
    }

    /* renamed from: R */
    public static Set m119791R(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C41357x0.m119985e();
        }
        if (length != 1) {
            return (Set) m119787N(objArr, new LinkedHashSet(C41342q0.m119921f(objArr.length)));
        }
        return C41355w0.m119981d(objArr[0]);
    }

    /* renamed from: S */
    public static List m119792S(Object[] objArr, Object[] objArr2) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(objArr2, "other");
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C41233s.m119492a(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    /* renamed from: r */
    public static boolean m119793r(int[] iArr, int i) {
        C41536l.m120489i(iArr, "<this>");
        if (m119775B(iArr, i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m119794s(Object[] objArr, Object obj) {
        C41536l.m120489i(objArr, "<this>");
        if (m119776C(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static List m119795t(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        return (List) m119796u(objArr, new ArrayList());
    }

    /* renamed from: u */
    public static final Collection m119796u(Object[] objArr, Collection collection) {
        C41536l.m120489i(objArr, "<this>");
        C41536l.m120489i(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* renamed from: v */
    public static Object m119797v(Object[] objArr) {
        boolean z;
        C41536l.m120489i(objArr, "<this>");
        if (objArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: w */
    public static C43420e m119798w(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        return new C43420e(0, m119800y(objArr));
    }

    /* renamed from: x */
    public static final int m119799x(int[] iArr) {
        C41536l.m120489i(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: y */
    public static int m119800y(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: z */
    public static Integer m119801z(int[] iArr, int i) {
        C41536l.m120489i(iArr, "<this>");
        if (i < 0 || i > m119799x(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }
}
