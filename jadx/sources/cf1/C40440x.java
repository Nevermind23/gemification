package cf1;

import bf1.C40342g;
import he1.C41224m;
import he1.C41233s;
import ie1.C41330k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import ue1.C43079p;
import ze1.C43417c;
import ze1.C43420e;

/* renamed from: cf1.x */
abstract class C40440x extends C40439w {

    /* renamed from: cf1.x$a */
    static final class C40441a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ char[] f96040d;

        /* renamed from: e */
        final /* synthetic */ boolean f96041e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40441a(char[] cArr, boolean z) {
            super(2);
            this.f96040d = cArr;
            this.f96041e = z;
        }

        /* renamed from: a */
        public final C41224m mo94501a(CharSequence charSequence, int i) {
            C41536l.m120489i(charSequence, "$this$$receiver");
            int Y = C40440x.m117157Y(charSequence, this.f96040d, i, this.f96041e);
            if (Y < 0) {
                return null;
            }
            return C41233s.m119492a(Integer.valueOf(Y), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo94501a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: cf1.x$b */
    static final class C40442b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ List f96042d;

        /* renamed from: e */
        final /* synthetic */ boolean f96043e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40442b(List list, boolean z) {
            super(2);
            this.f96042d = list;
            this.f96043e = z;
        }

        /* renamed from: a */
        public final C41224m mo94502a(CharSequence charSequence, int i) {
            C41536l.m120489i(charSequence, "$this$$receiver");
            C41224m I = C40440x.m117145P(charSequence, this.f96042d, i, this.f96043e, false);
            if (I != null) {
                return C41233s.m119492a(I.mo95678e(), Integer.valueOf(((String) I.mo95680f()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo94502a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: cf1.x$c */
    static final class C40443c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CharSequence f96044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40443c(CharSequence charSequence) {
            super(1);
            this.f96044d = charSequence;
        }

        /* renamed from: a */
        public final String invoke(C43420e eVar) {
            C41536l.m120489i(eVar, "it");
            return C40440x.m117127E0(this.f96044d, eVar);
        }
    }

    /* renamed from: A0 */
    public static final boolean m117123A0(CharSequence charSequence, char c, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C40406c.m116979d(charSequence.charAt(0), c, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: B0 */
    public static final boolean m117124B0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C40439w.m117109H((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m117171m0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: C0 */
    public static /* synthetic */ boolean m117125C0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m117123A0(charSequence, c, z);
    }

    /* renamed from: D0 */
    public static /* synthetic */ boolean m117126D0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m117124B0(charSequence, charSequence2, z);
    }

    /* renamed from: E0 */
    public static final String m117127E0(CharSequence charSequence, C43420e eVar) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(eVar, "range");
        return charSequence.subSequence(eVar.mo102098b().intValue(), eVar.mo102100i().intValue() + 1).toString();
    }

    /* renamed from: F0 */
    public static final String m117128F0(String str, char c, String str2) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "missingDelimiterValue");
        int W = m117155W(str, c, 0, false, 6, (Object) null);
        if (W == -1) {
            return str2;
        }
        String substring = str.substring(W + 1, str.length());
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: G0 */
    public static final String m117129G0(String str, String str2, String str3) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "delimiter");
        C41536l.m120489i(str3, "missingDelimiterValue");
        int X = m117156X(str, str2, 0, false, 6, (Object) null);
        if (X == -1) {
            return str3;
        }
        String substring = str.substring(X + str2.length(), str.length());
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: H0 */
    public static /* synthetic */ String m117130H0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m117128F0(str, c, str2);
    }

    /* renamed from: I0 */
    public static /* synthetic */ String m117132I0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m117129G0(str, str2, str3);
    }

    /* renamed from: J */
    public static final boolean m117133J(CharSequence charSequence, char c, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        if (m117155W(charSequence, c, 0, z, 2, (Object) null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J0 */
    public static final String m117134J0(String str, char c, String str2) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "missingDelimiterValue");
        int b0 = m117160b0(str, c, 0, false, 6, (Object) null);
        if (b0 == -1) {
            return str2;
        }
        String substring = str.substring(b0 + 1, str.length());
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: K */
    public static boolean m117135K(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m117156X(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m117154V(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    public static /* synthetic */ String m117136K0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m117134J0(str, c, str2);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m117137L(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m117133J(charSequence, c, z);
    }

    /* renamed from: L0 */
    public static final String m117138L0(String str, char c, String str2) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "missingDelimiterValue");
        int W = m117155W(str, c, 0, false, 6, (Object) null);
        if (W == -1) {
            return str2;
        }
        String substring = str.substring(0, W);
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m117139M(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m117135K(charSequence, charSequence2, z);
    }

    /* renamed from: M0 */
    public static final String m117140M0(String str, String str2, String str3) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "delimiter");
        C41536l.m120489i(str3, "missingDelimiterValue");
        int X = m117156X(str, str2, 0, false, 6, (Object) null);
        if (X == -1) {
            return str3;
        }
        String substring = str.substring(0, X);
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: N */
    public static final boolean m117141N(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C40439w.m117114r((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m117171m0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: N0 */
    public static /* synthetic */ String m117142N0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m117138L0(str, c, str2);
    }

    /* renamed from: O */
    public static /* synthetic */ boolean m117143O(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m117141N(charSequence, charSequence2, z);
    }

    /* renamed from: O0 */
    public static /* synthetic */ String m117144O0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m117140M0(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static final C41224m m117145P(CharSequence charSequence, Collection collection, int i, boolean z, boolean z2) {
        C43417c cVar;
        Object obj;
        Object obj2;
        int i2;
        if (z || collection.size() != 1) {
            if (!z2) {
                cVar = new C43420e(C43429k.m124585d(i, 0), charSequence.length());
            } else {
                cVar = C43429k.m124592k(C43429k.m124588g(i, m117149R(charSequence)), 0);
            }
            if (charSequence instanceof String) {
                int j = cVar.mo102109j();
                int l = cVar.mo102110l();
                int n = cVar.mo102111n();
                if ((n > 0 && j <= l) || (n < 0 && l <= j)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C40439w.m117119w(str, 0, (String) charSequence, j, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (j == l) {
                                break;
                            }
                            j += n;
                        } else {
                            return C41233s.m119492a(Integer.valueOf(j), str2);
                        }
                    }
                }
            } else {
                int j2 = cVar.mo102109j();
                int l2 = cVar.mo102110l();
                int n2 = cVar.mo102111n();
                if ((n2 > 0 && j2 <= l2) || (n2 < 0 && l2 <= j2)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (m117171m0(str3, 0, charSequence, j2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (j2 == l2) {
                                break;
                            }
                            j2 += n2;
                        } else {
                            return C41233s.m119492a(Integer.valueOf(j2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C41358y.m120026p0(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i3 = i;
        if (!z2) {
            i2 = m117156X(charSequence2, str6, i3, false, 4, (Object) null);
        } else {
            i2 = m117161c0(charSequence2, str6, i3, false, 4, (Object) null);
        }
        if (i2 < 0) {
            return null;
        }
        return C41233s.m119492a(Integer.valueOf(i2), str5);
    }

    /* renamed from: P0 */
    public static CharSequence m117146P0(CharSequence charSequence) {
        int i;
        C41536l.m120489i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean c = C40405b.m116978c(charSequence.charAt(i));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: Q */
    public static final C43420e m117147Q(CharSequence charSequence) {
        C41536l.m120489i(charSequence, "<this>");
        return new C43420e(0, charSequence.length() - 1);
    }

    /* renamed from: Q0 */
    public static CharSequence m117148Q0(CharSequence charSequence) {
        C41536l.m120489i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C40405b.m116978c(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    /* renamed from: R */
    public static int m117149R(CharSequence charSequence) {
        C41536l.m120489i(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: R0 */
    public static CharSequence m117150R0(CharSequence charSequence) {
        C41536l.m120489i(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C40405b.m116978c(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* renamed from: S */
    public static final int m117151S(CharSequence charSequence, char c, int i, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m117157Y(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: T */
    public static final int m117152T(CharSequence charSequence, String str, int i, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m117154V(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: U */
    private static final int m117153U(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C43417c cVar;
        if (!z2) {
            cVar = new C43420e(C43429k.m124585d(i, 0), C43429k.m124588g(i2, charSequence.length()));
        } else {
            cVar = C43429k.m124592k(C43429k.m124588g(i, m117149R(charSequence)), C43429k.m124585d(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int j = cVar.mo102109j();
            int l = cVar.mo102110l();
            int n = cVar.mo102111n();
            if ((n <= 0 || j > l) && (n >= 0 || l > j)) {
                return -1;
            }
            while (true) {
                if (m117171m0(charSequence2, 0, charSequence, j, charSequence2.length(), z)) {
                    return j;
                }
                if (j == l) {
                    return -1;
                }
                j += n;
            }
        } else {
            int j2 = cVar.mo102109j();
            int l2 = cVar.mo102110l();
            int n2 = cVar.mo102111n();
            if ((n2 <= 0 || j2 > l2) && (n2 >= 0 || l2 > j2)) {
                return -1;
            }
            while (true) {
                if (C40439w.m117119w((String) charSequence2, 0, (String) charSequence, j2, charSequence2.length(), z)) {
                    return j2;
                }
                if (j2 == l2) {
                    return -1;
                }
                j2 += n2;
            }
        }
    }

    /* renamed from: V */
    static /* synthetic */ int m117154V(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m117153U(charSequence, charSequence2, i, i2, z, z2);
    }

    /* renamed from: W */
    public static /* synthetic */ int m117155W(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m117151S(charSequence, c, i, z);
    }

    /* renamed from: X */
    public static /* synthetic */ int m117156X(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m117152T(charSequence, str, i, z);
    }

    /* renamed from: Y */
    public static final int m117157Y(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C41330k0 o = new C43420e(C43429k.m124585d(i, 0), m117149R(charSequence)).iterator();
            while (o.hasNext()) {
                int nextInt = o.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C40406c.m116979d(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C41333m.m119783J(cArr), i);
    }

    /* renamed from: Z */
    public static final int m117158Z(CharSequence charSequence, char c, int i, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m117162d0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a0 */
    public static final int m117159a0(CharSequence charSequence, String str, int i, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m117153U(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: b0 */
    public static /* synthetic */ int m117160b0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m117149R(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m117158Z(charSequence, c, i, z);
    }

    /* renamed from: c0 */
    public static /* synthetic */ int m117161c0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m117149R(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m117159a0(charSequence, str, i, z);
    }

    /* renamed from: d0 */
    public static final int m117162d0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int g = C43429k.m124588g(i, m117149R(charSequence)); -1 < g; g--) {
                char charAt = charSequence.charAt(g);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C40406c.m116979d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return g;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C41333m.m119783J(cArr), i);
    }

    /* renamed from: e0 */
    public static final C40342g m117163e0(CharSequence charSequence) {
        C41536l.m120489i(charSequence, "<this>");
        return m117184z0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: f0 */
    public static final List m117164f0(CharSequence charSequence) {
        C41536l.m120489i(charSequence, "<this>");
        return C40355o.m116850A(m117163e0(charSequence));
    }

    /* renamed from: g0 */
    public static final CharSequence m117165g0(CharSequence charSequence, int i, char c) {
        C41536l.m120489i(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            C41330k0 o = new C43420e(1, i - charSequence.length()).iterator();
            while (o.hasNext()) {
                o.nextInt();
                sb.append(c);
            }
            sb.append(charSequence);
            return sb;
        }
    }

    /* renamed from: h0 */
    public static String m117166h0(String str, int i, char c) {
        C41536l.m120489i(str, "<this>");
        return m117165g0(str, i, c).toString();
    }

    /* renamed from: i0 */
    private static final C40342g m117167i0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m117177s0(i2);
        return new C40408e(charSequence, i, i2, new C40441a(cArr, z));
    }

    /* renamed from: j0 */
    private static final C40342g m117168j0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m117177s0(i2);
        return new C40408e(charSequence, i, i2, new C40442b(C41331l.m119759c(strArr), z));
    }

    /* renamed from: k0 */
    static /* synthetic */ C40342g m117169k0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m117167i0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: l0 */
    static /* synthetic */ C40342g m117170l0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m117168j0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: m0 */
    public static final boolean m117171m0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C40406c.m116979d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n0 */
    public static String m117172n0(String str, CharSequence charSequence) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(charSequence, "prefix");
        if (!m117126D0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: o0 */
    public static String m117173o0(String str, CharSequence charSequence) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(charSequence, "suffix");
        if (!m117143O(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: p0 */
    public static String m117174p0(String str, CharSequence charSequence) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(charSequence, "delimiter");
        return m117175q0(str, charSequence, charSequence);
    }

    /* renamed from: q0 */
    public static final String m117175q0(String str, CharSequence charSequence, CharSequence charSequence2) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(charSequence, "prefix");
        C41536l.m120489i(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !m117126D0(str, charSequence, false, 2, (Object) null) || !m117143O(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: r0 */
    public static final CharSequence m117176r0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            C41536l.m120488h(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            C41536l.m120488h(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* renamed from: s0 */
    public static final void m117177s0(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: t0 */
    public static final List m117178t0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(cArr, "delimiters");
        if (cArr.length == 1) {
            return m117180v0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C43420e> j = C40355o.m116852j(m117169k0(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C41343r.m119925u(j, 10));
        for (C43420e E0 : j) {
            arrayList.add(m117127E0(charSequence, E0));
        }
        return arrayList;
    }

    /* renamed from: u0 */
    public static final List m117179u0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m117180v0(charSequence, str, z, i);
            }
        }
        Iterable<C43420e> j = C40355o.m116852j(m117170l0(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C41343r.m119925u(j, 10));
        for (C43420e E0 : j) {
            arrayList.add(m117127E0(charSequence, E0));
        }
        return arrayList;
    }

    /* renamed from: v0 */
    private static final List m117180v0(CharSequence charSequence, String str, boolean z, int i) {
        boolean z2;
        m117177s0(i);
        int i2 = 0;
        int T = m117152T(charSequence, str, 0, z);
        if (T == -1 || i == 1) {
            return C41339p.m119900e(charSequence.toString());
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2) {
            i3 = C43429k.m124588g(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, T).toString());
            i2 = str.length() + T;
            if ((z2 && arrayList.size() == i - 1) || (T = m117152T(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, T).toString());
            i2 = str.length() + T;
            break;
        } while ((T = m117152T(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: w0 */
    public static /* synthetic */ List m117181w0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m117178t0(charSequence, cArr, z, i);
    }

    /* renamed from: x0 */
    public static /* synthetic */ List m117182x0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m117179u0(charSequence, strArr, z, i);
    }

    /* renamed from: y0 */
    public static final C40342g m117183y0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C41536l.m120489i(charSequence, "<this>");
        C41536l.m120489i(strArr, "delimiters");
        return C40355o.m116863u(m117170l0(charSequence, strArr, 0, z, i, 2, (Object) null), new C40443c(charSequence));
    }

    /* renamed from: z0 */
    public static /* synthetic */ C40342g m117184z0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m117183y0(charSequence, strArr, z, i);
    }
}
