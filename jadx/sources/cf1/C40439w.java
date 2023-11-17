package cf1;

import ie1.C41308c;
import ie1.C41330k0;
import java.util.Comparator;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import ze1.C43420e;

/* renamed from: cf1.w */
abstract class C40439w extends C40438v {
    /* renamed from: A */
    public static /* synthetic */ String m117102A(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m117121y(str, c, c2, z);
    }

    /* renamed from: B */
    public static /* synthetic */ String m117103B(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m117122z(str, str2, str3, z);
    }

    /* renamed from: C */
    public static final String m117104C(String str, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "oldValue");
        C41536l.m120489i(str3, "newValue");
        int X = C40440x.m117156X(str, str2, 0, z, 2, (Object) null);
        if (X < 0) {
            return str;
        }
        return C40440x.m117176r0(str, X, str2.length() + X, str3).toString();
    }

    /* renamed from: D */
    public static /* synthetic */ String m117105D(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m117104C(str, str2, str3, z);
    }

    /* renamed from: E */
    public static boolean m117106E(String str, String str2, int i, boolean z) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m117119w(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: F */
    public static boolean m117107F(String str, String str2, boolean z) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m117119w(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m117108G(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m117106E(str, str2, i, z);
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m117109H(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m117107F(str, str2, z);
    }

    /* renamed from: n */
    public static String m117110n(char[] cArr) {
        C41536l.m120489i(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: o */
    public static String m117111o(char[] cArr, int i, int i2) {
        C41536l.m120489i(cArr, "<this>");
        C41308c.f97363d.mo95861a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    /* renamed from: p */
    public static byte[] m117112p(String str) {
        C41536l.m120489i(str, "<this>");
        byte[] bytes = str.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: q */
    public static final boolean m117113q(String str, String str2, boolean z) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m117119w(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: r */
    public static /* synthetic */ boolean m117114r(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m117113q(str, str2, z);
    }

    /* renamed from: s */
    public static boolean m117115s(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m117116t(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m117115s(str, str2, z);
    }

    /* renamed from: u */
    public static Comparator m117117u(C41524c0 c0Var) {
        C41536l.m120489i(c0Var, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C41536l.m120488h(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m117118v(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            int r0 = r4.length()
            r1 = 1
            if (r0 == 0) goto L_0x0040
            ze1.e r0 = cf1.C40440x.m117147Q(r4)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x0020
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0020
        L_0x001e:
            r4 = r1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001e
            r2 = r0
            ie1.k0 r2 = (ie1.C41330k0) r2
            int r2 = r2.nextInt()
            char r2 = r4.charAt(r2)
            boolean r2 = cf1.C40405b.m116978c(r2)
            if (r2 != 0) goto L_0x0024
            r4 = r3
        L_0x003c:
            if (r4 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r3
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cf1.C40439w.m117118v(java.lang.CharSequence):boolean");
    }

    /* renamed from: w */
    public static final boolean m117119w(String str, int i, String str2, int i2, int i3, boolean z) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: x */
    public static String m117120x(CharSequence charSequence, int i) {
        boolean z;
        C41536l.m120489i(charSequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                C41330k0 o = new C43420e(1, i).iterator();
                while (o.hasNext()) {
                    o.nextInt();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                C41536l.m120488h(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: y */
    public static final String m117121y(String str, char c, char c2, boolean z) {
        C41536l.m120489i(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            C41536l.m120488h(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C40406c.m116979d(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: z */
    public static String m117122z(String str, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "oldValue");
        C41536l.m120489i(str3, "newValue");
        int i = 0;
        int T = C40440x.m117152T(str, str2, 0, z);
        if (T < 0) {
            return str;
        }
        int length = str2.length();
        int d = C43429k.m124585d(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, T);
                sb.append(str3);
                i = T + length;
                if (T >= str.length() || (T = C40440x.m117152T(str, str2, T + d, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    C41536l.m120488h(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, T);
                sb.append(str3);
                i = T + length;
                break;
            } while ((T = C40440x.m117152T(str, str2, T + d, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            C41536l.m120488h(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }
}
