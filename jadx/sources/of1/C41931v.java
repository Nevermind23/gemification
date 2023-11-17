package of1;

import cf1.C40419j;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import dg1.C40672b;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe1.C42193c;
import pf1.C42194a;
import pf1.C42197d;
import ze1.C43417c;

/* renamed from: of1.v */
public final class C41931v {

    /* renamed from: k */
    public static final C41934b f98552k = new C41934b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final char[] f98553l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f98554a;

    /* renamed from: b */
    private final String f98555b;

    /* renamed from: c */
    private final String f98556c;

    /* renamed from: d */
    private final String f98557d;

    /* renamed from: e */
    private final int f98558e;

    /* renamed from: f */
    private final List f98559f;

    /* renamed from: g */
    private final List f98560g;

    /* renamed from: h */
    private final String f98561h;

    /* renamed from: i */
    private final String f98562i;

    /* renamed from: j */
    private final boolean f98563j;

    /* renamed from: of1.v$a */
    public static final class C41932a {

        /* renamed from: i */
        public static final C41933a f98564i = new C41933a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private String f98565a;

        /* renamed from: b */
        private String f98566b = "";

        /* renamed from: c */
        private String f98567c = "";

        /* renamed from: d */
        private String f98568d;

        /* renamed from: e */
        private int f98569e = -1;

        /* renamed from: f */
        private final List f98570f;

        /* renamed from: g */
        private List f98571g;

        /* renamed from: h */
        private String f98572h;

        /* renamed from: of1.v$a$a */
        public static final class C41933a {
            private C41933a() {
            }

            public /* synthetic */ C41933a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public final int m121684e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(C41934b.m121688b(C41931v.f98552k, str, i, i2, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    boolean z = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z = true;
                    }
                    if (z) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public final int m121685f(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } while (str.charAt(i) == ']');
                    } else if (charAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public final int m121686g(String str, int i, int i2) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C41536l.m120491k(charAt, 97) < 0 || C41536l.m120491k(charAt, 122) > 0) && (C41536l.m120491k(charAt, 65) < 0 || C41536l.m120491k(charAt, 90) > 0)) {
                    return -1;
                }
                int i3 = i + 1;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    boolean z6 = false;
                    if ('a' > charAt2 || charAt2 >= '{') {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z && ('A' > charAt2 || charAt2 >= '[')) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 && ('0' > charAt2 || charAt2 >= ':')) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3 && charAt2 != '+') {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z4 && charAt2 != '-') {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z5 || charAt2 == '.') {
                        z6 = true;
                    }
                    if (z6) {
                        i3 = i4;
                    } else if (charAt2 == ':') {
                        return i3;
                    } else {
                        return -1;
                    }
                }
                return -1;
            }

            /* access modifiers changed from: private */
            /* renamed from: h */
            public final int m121687h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i = i4;
                }
                return i3;
            }
        }

        public C41932a() {
            ArrayList arrayList = new ArrayList();
            this.f98570f = arrayList;
            arrayList.add("");
        }

        /* renamed from: B */
        private final void m121642B(String str, int i, int i2) {
            boolean z;
            if (i != i2) {
                char charAt = str.charAt(i);
                if (charAt == '/' || charAt == '\\') {
                    this.f98570f.clear();
                    this.f98570f.add("");
                    i++;
                } else {
                    List list = this.f98570f;
                    list.set(list.size() - 1, "");
                }
                while (true) {
                    int i3 = i;
                    while (true) {
                        if (i3 < i2) {
                            i = C42197d.m122551q(str, "/\\", i3, i2);
                            if (i < i2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            m121647w(str, i3, i, z, true);
                            if (z) {
                                i3 = i + 1;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private final int m121643d() {
            int i = this.f98569e;
            if (i != -1) {
                return i;
            }
            C41934b bVar = C41931v.f98552k;
            String str = this.f98565a;
            C41536l.m120486f(str);
            return bVar.mo97001c(str);
        }

        /* renamed from: q */
        private final boolean m121644q(String str) {
            if (C41536l.m120484d(str, ".") || C40439w.m117115s(str, "%2e", true)) {
                return true;
            }
            return false;
        }

        /* renamed from: r */
        private final boolean m121645r(String str) {
            if (C41536l.m120484d(str, "..") || C40439w.m117115s(str, "%2e.", true) || C40439w.m117115s(str, ".%2e", true) || C40439w.m117115s(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        private final void m121646u() {
            boolean z;
            List list = this.f98570f;
            if (((String) list.remove(list.size() - 1)).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(!this.f98570f.isEmpty())) {
                this.f98570f.add("");
                return;
            }
            List list2 = this.f98570f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: w */
        private final void m121647w(String str, int i, int i2, boolean z, boolean z2) {
            boolean z3;
            String b = C41934b.m121688b(C41931v.f98552k, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, (Charset) null, 240, (Object) null);
            if (!m121644q(b)) {
                if (m121645r(b)) {
                    m121646u();
                    return;
                }
                List list = this.f98570f;
                if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    List list2 = this.f98570f;
                    list2.set(list2.size() - 1, b);
                } else {
                    this.f98570f.add(b);
                }
                if (z) {
                    this.f98570f.add("");
                }
            }
        }

        /* renamed from: z */
        private final void m121648z(String str) {
            List list = this.f98571g;
            C41536l.m120486f(list);
            int size = list.size() - 2;
            int c = C42193c.m122497c(size, 0, -2);
            if (c <= size) {
                while (true) {
                    int i = size - 2;
                    List list2 = this.f98571g;
                    C41536l.m120486f(list2);
                    if (C41536l.m120484d(str, list2.get(size))) {
                        List list3 = this.f98571g;
                        C41536l.m120486f(list3);
                        list3.remove(size + 1);
                        List list4 = this.f98571g;
                        C41536l.m120486f(list4);
                        list4.remove(size);
                        List list5 = this.f98571g;
                        C41536l.m120486f(list5);
                        if (list5.isEmpty()) {
                            this.f98571g = null;
                            return;
                        }
                    }
                    if (size != c) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: A */
        public final C41932a mo96968A(String str) {
            C41536l.m120489i(str, "name");
            if (mo96988k() == null) {
                return this;
            }
            m121648z(C41934b.m121688b(C41931v.f98552k, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null));
            return this;
        }

        /* renamed from: C */
        public final C41932a mo96969C(String str) {
            C41536l.m120489i(str, "scheme");
            if (C40439w.m117115s(str, "http", true)) {
                mo96977K("http");
            } else if (C40439w.m117115s(str, "https", true)) {
                mo96977K("https");
            } else {
                throw new IllegalArgumentException(C41536l.m120497q("unexpected scheme: ", str));
            }
            return this;
        }

        /* renamed from: D */
        public final void mo96970D(String str) {
            this.f98572h = str;
        }

        /* renamed from: E */
        public final void mo96971E(String str) {
            C41536l.m120489i(str, "<set-?>");
            this.f98567c = str;
        }

        /* renamed from: F */
        public final void mo96972F(List list) {
            this.f98571g = list;
        }

        /* renamed from: G */
        public final void mo96973G(String str) {
            C41536l.m120489i(str, "<set-?>");
            this.f98566b = str;
        }

        /* renamed from: H */
        public final void mo96974H(String str) {
            this.f98568d = str;
        }

        /* renamed from: I */
        public final void mo96975I(int i) {
            this.f98569e = i;
        }

        /* renamed from: J */
        public final C41932a mo96976J(String str, String str2) {
            C41536l.m120489i(str, "name");
            mo96968A(str);
            mo96980b(str, str2);
            return this;
        }

        /* renamed from: K */
        public final void mo96977K(String str) {
            this.f98565a = str;
        }

        /* renamed from: L */
        public final C41932a mo96978L(String str) {
            C41536l.m120489i(str, "username");
            mo96973G(C41934b.m121688b(C41931v.f98552k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null));
            return this;
        }

        /* renamed from: a */
        public final C41932a mo96979a(String str, String str2) {
            String str3;
            C41536l.m120489i(str, "encodedName");
            if (mo96988k() == null) {
                mo96972F(new ArrayList());
            }
            List k = mo96988k();
            C41536l.m120486f(k);
            C41934b bVar = C41931v.f98552k;
            k.add(C41934b.m121688b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null));
            List k2 = mo96988k();
            C41536l.m120486f(k2);
            if (str2 == null) {
                str3 = null;
            } else {
                str3 = C41934b.m121688b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null);
            }
            k2.add(str3);
            return this;
        }

        /* renamed from: b */
        public final C41932a mo96980b(String str, String str2) {
            String str3;
            C41536l.m120489i(str, "name");
            if (mo96988k() == null) {
                mo96972F(new ArrayList());
            }
            List k = mo96988k();
            C41536l.m120486f(k);
            C41934b bVar = C41931v.f98552k;
            k.add(C41934b.m121688b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null));
            List k2 = mo96988k();
            C41536l.m120486f(k2);
            if (str2 == null) {
                str3 = null;
            } else {
                str3 = C41934b.m121688b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null);
            }
            k2.add(str3);
            return this;
        }

        /* renamed from: c */
        public final C41931v mo96981c() {
            ArrayList arrayList;
            String str;
            String str2;
            String str3 = this.f98565a;
            if (str3 != null) {
                C41934b bVar = C41931v.f98552k;
                String h = C41934b.m121690h(bVar, this.f98566b, 0, 0, false, 7, (Object) null);
                String h2 = C41934b.m121690h(bVar, this.f98567c, 0, 0, false, 7, (Object) null);
                String str4 = this.f98568d;
                if (str4 != null) {
                    int d = m121643d();
                    List<String> list = this.f98570f;
                    ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
                    for (String h3 : list) {
                        arrayList2.add(C41934b.m121690h(C41931v.f98552k, h3, 0, 0, false, 7, (Object) null));
                    }
                    List<String> list2 = this.f98571g;
                    if (list2 == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(C41343r.m119925u(list2, 10));
                        for (String str5 : list2) {
                            if (str5 == null) {
                                str2 = null;
                            } else {
                                str2 = C41934b.m121690h(C41931v.f98552k, str5, 0, 0, true, 3, (Object) null);
                            }
                            arrayList.add(str2);
                        }
                    }
                    String str6 = this.f98572h;
                    if (str6 == null) {
                        str = null;
                    } else {
                        str = C41934b.m121690h(C41931v.f98552k, str6, 0, 0, false, 7, (Object) null);
                    }
                    return new C41931v(str3, h, h2, str4, d, arrayList2, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: e */
        public final C41932a mo96982e(String str) {
            C41536l.m120489i(str, "encodedPath");
            if (C40439w.m117109H(str, C11110u2.f31950c, false, 2, (Object) null)) {
                m121642B(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(C41536l.m120497q("unexpected encodedPath: ", str).toString());
        }

        /* renamed from: f */
        public final C41932a mo96983f(String str) {
            List list = null;
            if (str != null) {
                C41934b bVar = C41931v.f98552k;
                String b = C41934b.m121688b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211, (Object) null);
                if (b != null) {
                    list = bVar.mo97006j(b);
                }
            }
            mo96972F(list);
            return this;
        }

        /* renamed from: g */
        public final C41932a mo96984g(String str) {
            mo96970D(str == null ? null : C41934b.m121688b(C41931v.f98552k, str, 0, 0, "", false, false, false, true, (Charset) null, 187, (Object) null));
            return this;
        }

        /* renamed from: h */
        public final String mo96985h() {
            return this.f98572h;
        }

        /* renamed from: i */
        public final String mo96986i() {
            return this.f98567c;
        }

        /* renamed from: j */
        public final List mo96987j() {
            return this.f98570f;
        }

        /* renamed from: k */
        public final List mo96988k() {
            return this.f98571g;
        }

        /* renamed from: l */
        public final String mo96989l() {
            return this.f98566b;
        }

        /* renamed from: m */
        public final String mo96990m() {
            return this.f98568d;
        }

        /* renamed from: n */
        public final int mo96991n() {
            return this.f98569e;
        }

        /* renamed from: o */
        public final String mo96992o() {
            return this.f98565a;
        }

        /* renamed from: p */
        public final C41932a mo96993p(String str) {
            C41536l.m120489i(str, "host");
            String e = C42194a.m122505e(C41934b.m121690h(C41931v.f98552k, str, 0, 0, false, 7, (Object) null));
            if (e != null) {
                mo96974H(e);
                return this;
            }
            throw new IllegalArgumentException(C41536l.m120497q("unexpected host: ", str));
        }

        /* renamed from: s */
        public final C41932a mo96994s(C41931v vVar, String str) {
            int i;
            int q;
            char c;
            int i2;
            String str2;
            boolean z;
            boolean z2;
            int i3;
            boolean z3;
            String str3;
            int i4;
            boolean z4;
            String str4 = str;
            C41536l.m120489i(str4, "input");
            int A = C42197d.m122507A(str4, 0, 0, 3, (Object) null);
            int C = C42197d.m122509C(str4, A, 0, 2, (Object) null);
            C41933a aVar = f98564i;
            int c2 = aVar.m121686g(str4, A, C);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z5 = true;
            char c3 = 65535;
            if (c2 != -1) {
                if (C40439w.m117106E(str4, "https:", A, true)) {
                    this.f98565a = "https";
                    A += 6;
                } else if (C40439w.m117106E(str4, "http:", A, true)) {
                    this.f98565a = "http";
                    A += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, c2);
                    C41536l.m120488h(substring, str5);
                    sb.append(substring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (vVar != null) {
                this.f98565a = vVar.mo96964t();
            } else {
                if (str.length() > 6) {
                    str4 = C41536l.m120497q(C40445z.m117194Y0(str4, 6), "...");
                }
                throw new IllegalArgumentException(C41536l.m120497q("Expected URL scheme 'http' or 'https' but no scheme was found for ", str4));
            }
            int d = aVar.m121687h(str4, A, C);
            char c4 = '?';
            char c5 = '#';
            if (d >= 2 || vVar == null || !C41536l.m120484d(vVar.mo96964t(), this.f98565a)) {
                int i5 = A + d;
                boolean z6 = false;
                boolean z7 = false;
                while (true) {
                    q = C42197d.m122551q(str4, "@/\\?#", i5, C);
                    if (q != C) {
                        c = str4.charAt(q);
                    } else {
                        c = c3;
                    }
                    if (c == c3 || c == c5 || c == '/' || c == '\\' || c == c4) {
                        boolean z8 = z5;
                        String str6 = str5;
                        i = C;
                        int i6 = q;
                        C41933a aVar2 = f98564i;
                        int b = aVar2.m121685f(str4, i5, i6);
                        int i7 = b + 1;
                    } else if (c == '@') {
                        if (!z6) {
                            int p = C42197d.m122550p(str4, ':', i5, q);
                            C41934b bVar = C41931v.f98552k;
                            String str7 = "%40";
                            int i8 = q;
                            int i9 = p;
                            z3 = z5;
                            i3 = C;
                            String str8 = str5;
                            String b2 = C41934b.m121688b(bVar, str, i5, p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                            if (z7) {
                                b2 = this.f98566b + str7 + b2;
                            }
                            this.f98566b = b2;
                            int i12 = i8;
                            int i13 = i9;
                            if (i13 != i12) {
                                this.f98567c = C41934b.m121688b(bVar, str, i13 + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                z4 = z3;
                            } else {
                                z4 = z6;
                            }
                            z6 = z4;
                            str3 = str8;
                            z7 = z3;
                            i4 = i12;
                        } else {
                            z3 = z5;
                            i3 = C;
                            String str9 = str5;
                            int i14 = q;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f98567c);
                            sb2.append("%40");
                            StringBuilder sb3 = sb2;
                            str3 = str9;
                            i4 = i14;
                            sb3.append(C41934b.m121688b(C41931v.f98552k, str, i5, i14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                            this.f98567c = sb3.toString();
                        }
                        i5 = i4 + 1;
                        str5 = str3;
                        z5 = z3;
                        C = i3;
                        c5 = '#';
                        c4 = '?';
                        c3 = 65535;
                    }
                }
                boolean z82 = z5;
                String str62 = str5;
                i = C;
                int i62 = q;
                C41933a aVar22 = f98564i;
                int b3 = aVar22.m121685f(str4, i5, i62);
                int i72 = b3 + 1;
                if (i72 < i62) {
                    i2 = i5;
                    this.f98568d = C42194a.m122505e(C41934b.m121690h(C41931v.f98552k, str, i5, b3, false, 4, (Object) null));
                    int a = aVar22.m121684e(str4, i72, i62);
                    this.f98569e = a;
                    if (a != -1) {
                        z2 = z82;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str2 = str62;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i72, i62);
                        C41536l.m120488h(substring2, str62);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str62;
                    C41934b bVar2 = C41931v.f98552k;
                    this.f98568d = C42194a.m122505e(C41934b.m121690h(bVar2, str, i2, b3, false, 4, (Object) null));
                    String str10 = this.f98565a;
                    C41536l.m120486f(str10);
                    this.f98569e = bVar2.mo97001c(str10);
                }
                if (this.f98568d != null) {
                    z = z82;
                } else {
                    z = false;
                }
                if (z) {
                    A = i62;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, b3);
                    C41536l.m120488h(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.f98566b = vVar.mo96952g();
                this.f98567c = vVar.mo96947c();
                this.f98568d = vVar.mo96954i();
                this.f98569e = vVar.mo96959o();
                this.f98570f.clear();
                this.f98570f.addAll(vVar.mo96949e());
                if (A == C || str4.charAt(A) == '#') {
                    mo96983f(vVar.mo96951f());
                }
                i = C;
            }
            int i15 = i;
            int q2 = C42197d.m122551q(str4, "?#", A, i15);
            m121642B(str4, A, q2);
            if (q2 < i15 && str4.charAt(q2) == '?') {
                int p2 = C42197d.m122550p(str4, '#', q2, i15);
                C41934b bVar3 = C41931v.f98552k;
                this.f98571g = bVar3.mo97006j(C41934b.m121688b(bVar3, str, q2 + 1, p2, " \"'<>#", true, false, true, false, (Charset) null, 208, (Object) null));
                q2 = p2;
            }
            if (q2 < i15 && str4.charAt(q2) == '#') {
                this.f98572h = C41934b.m121688b(C41931v.f98552k, str, q2 + 1, i15, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        /* renamed from: t */
        public final C41932a mo96995t(String str) {
            C41536l.m120489i(str, "password");
            mo96971E(C41934b.m121688b(C41931v.f98552k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null));
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
            if (r1 != false) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
            if (r1 != r2.mo97001c(r3)) goto L_0x00b7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.mo96992o()
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = r6.mo96992o()
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x001d
            L_0x0018:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x001d:
                java.lang.String r1 = r6.mo96989l()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x002b
                r1 = r2
                goto L_0x002c
            L_0x002b:
                r1 = r3
            L_0x002c:
                r4 = 58
                if (r1 != 0) goto L_0x003f
                java.lang.String r1 = r6.mo96986i()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x003c
                r1 = r2
                goto L_0x003d
            L_0x003c:
                r1 = r3
            L_0x003d:
                if (r1 == 0) goto L_0x0063
            L_0x003f:
                java.lang.String r1 = r6.mo96989l()
                r0.append(r1)
                java.lang.String r1 = r6.mo96986i()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r2 = r3
            L_0x0052:
                if (r2 == 0) goto L_0x005e
                r0.append(r4)
                java.lang.String r1 = r6.mo96986i()
                r0.append(r1)
            L_0x005e:
                r1 = 64
                r0.append(r1)
            L_0x0063:
                java.lang.String r1 = r6.mo96990m()
                if (r1 == 0) goto L_0x0091
                java.lang.String r1 = r6.mo96990m()
                kotlin.jvm.internal.C41536l.m120486f(r1)
                r2 = 2
                r5 = 0
                boolean r1 = cf1.C40440x.m117137L(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L_0x008a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.mo96990m()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0091
            L_0x008a:
                java.lang.String r1 = r6.mo96990m()
                r0.append(r1)
            L_0x0091:
                int r1 = r6.mo96991n()
                r2 = -1
                if (r1 != r2) goto L_0x009e
                java.lang.String r1 = r6.mo96992o()
                if (r1 == 0) goto L_0x00bd
            L_0x009e:
                int r1 = r6.m121643d()
                java.lang.String r2 = r6.mo96992o()
                if (r2 == 0) goto L_0x00b7
                of1.v$b r2 = of1.C41931v.f98552k
                java.lang.String r3 = r6.mo96992o()
                kotlin.jvm.internal.C41536l.m120486f(r3)
                int r2 = r2.mo97001c(r3)
                if (r1 == r2) goto L_0x00bd
            L_0x00b7:
                r0.append(r4)
                r0.append(r1)
            L_0x00bd:
                of1.v$b r1 = of1.C41931v.f98552k
                java.util.List r2 = r6.mo96987j()
                r1.mo97005i(r2, r0)
                java.util.List r2 = r6.mo96988k()
                if (r2 == 0) goto L_0x00db
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.mo96988k()
                kotlin.jvm.internal.C41536l.m120486f(r2)
                r1.mo97007k(r2, r0)
            L_0x00db:
                java.lang.String r1 = r6.mo96985h()
                if (r1 == 0) goto L_0x00ed
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.mo96985h()
                r0.append(r1)
            L_0x00ed:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: of1.C41931v.C41932a.toString():java.lang.String");
        }

        /* renamed from: v */
        public final C41932a mo96997v(int i) {
            boolean z = false;
            if (1 <= i && i < 65536) {
                z = true;
            }
            if (z) {
                mo96975I(i);
                return this;
            }
            throw new IllegalArgumentException(C41536l.m120497q("unexpected port: ", Integer.valueOf(i)).toString());
        }

        /* renamed from: x */
        public final C41932a mo96998x(String str) {
            List list = null;
            if (str != null) {
                C41934b bVar = C41931v.f98552k;
                String b = C41934b.m121688b(bVar, str, 0, 0, " \"'<>#", false, false, true, false, (Charset) null, 219, (Object) null);
                if (b != null) {
                    list = bVar.mo97006j(b);
                }
            }
            mo96972F(list);
            return this;
        }

        /* renamed from: y */
        public final C41932a mo96999y() {
            String str;
            String str2;
            String m = mo96990m();
            String str3 = null;
            if (m == null) {
                str = null;
            } else {
                str = new C40419j("[\"<>^`{|}]").mo94490g(m, "");
            }
            mo96974H(str);
            int size = mo96987j().size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                mo96987j().set(i2, C41934b.m121688b(C41931v.f98552k, (String) mo96987j().get(i2), 0, 0, "[]", true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List k = mo96988k();
            if (k != null) {
                int size2 = k.size();
                while (i < size2) {
                    int i3 = i + 1;
                    String str4 = (String) k.get(i);
                    if (str4 == null) {
                        str2 = null;
                    } else {
                        str2 = C41934b.m121688b(C41931v.f98552k, str4, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195, (Object) null);
                    }
                    k.set(i, str2);
                    i = i3;
                }
            }
            String h = mo96985h();
            if (h != null) {
                str3 = C41934b.m121688b(C41931v.f98552k, h, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163, (Object) null);
            }
            mo96970D(str3);
            return this;
        }
    }

    /* renamed from: of1.v$b */
    public static final class C41934b {
        private C41934b() {
        }

        public /* synthetic */ C41934b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m121688b(C41934b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4 = i3;
            return bVar.mo97000a(str, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? str.length() : i2, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        /* renamed from: e */
        private final boolean m121689e(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 >= i2 || str.charAt(i) != '%' || C42197d.m122514H(str.charAt(i + 1)) == -1 || C42197d.m122514H(str.charAt(i3)) == -1) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public static /* synthetic */ String m121690h(C41934b bVar, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return bVar.mo97004g(str, i, i2, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
            if (m121689e(r1, r5, r2) == false) goto L_0x006c;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m121691l(dg1.C40672b r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00b9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x0028
                r8 = 9
                if (r7 == r8) goto L_0x0023
                r8 = 10
                if (r7 == r8) goto L_0x0023
                r8 = 12
                if (r7 == r8) goto L_0x0023
                r8 = 13
                if (r7 != r8) goto L_0x0028
            L_0x0023:
                r8 = r14
                r12 = r19
                goto L_0x00b2
            L_0x0028:
                r8 = 43
                if (r7 != r8) goto L_0x0039
                if (r22 == 0) goto L_0x0039
                if (r20 == 0) goto L_0x0033
                java.lang.String r8 = "+"
                goto L_0x0035
            L_0x0033:
                java.lang.String r8 = "%2B"
            L_0x0035:
                r15.mo94728d0(r8)
                goto L_0x0023
            L_0x0039:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x0069
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x0069
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x0049
                if (r23 == 0) goto L_0x0069
            L_0x0049:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = cf1.C40440x.m117137L(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x0067
                if (r7 != r9) goto L_0x0062
                if (r20 == 0) goto L_0x0067
                if (r21 == 0) goto L_0x0062
                r8 = r14
                boolean r10 = r14.m121689e(r1, r5, r2)
                if (r10 != 0) goto L_0x0063
                goto L_0x006c
            L_0x0062:
                r8 = r14
            L_0x0063:
                r15.mo94702G1(r7)
                goto L_0x00b2
            L_0x0067:
                r8 = r14
                goto L_0x006c
            L_0x0069:
                r8 = r14
                r12 = r19
            L_0x006c:
                if (r6 != 0) goto L_0x0073
                dg1.b r6 = new dg1.b
                r6.<init>()
            L_0x0073:
                if (r3 == 0) goto L_0x0087
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r3, r10)
                if (r10 == 0) goto L_0x007e
                goto L_0x0087
            L_0x007e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.mo94775z1(r1, r5, r10, r3)
                goto L_0x008a
            L_0x0087:
                r6.mo94702G1(r7)
            L_0x008a:
                boolean r10 = r6.mo94714Q0()
                if (r10 != 0) goto L_0x00b2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.mo94715R0(r9)
                char[] r11 = of1.C41931v.f98553l
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.mo94715R0(r11)
                char[] r11 = of1.C41931v.f98553l
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.mo94715R0(r10)
                goto L_0x008a
            L_0x00b2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00b9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: of1.C41931v.C41934b.m121691l(dg1.b, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: m */
        private final void m121692m(C40672b bVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int H = C42197d.m122514H(str.charAt(i + 1));
                    int H2 = C42197d.m122514H(str.charAt(i3));
                    if (!(H == -1 || H2 == -1)) {
                        bVar.mo94715R0((H << 4) + H2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                } else if (codePointAt == 43 && z) {
                    bVar.mo94715R0(32);
                    i++;
                }
                bVar.mo94702G1(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }

        /* renamed from: a */
        public final String mo97000a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            String str3 = str;
            int i3 = i2;
            String str4 = str2;
            C41536l.m120489i(str, "<this>");
            C41536l.m120489i(str4, "encodeSet");
            int i4 = i;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !C40440x.m117137L(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!m121689e(str, i4, i3)) {
                                    C40672b bVar = new C40672b();
                                    int i5 = i;
                                    bVar.mo94740l0(str, i, i4);
                                    m121691l(bVar, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return bVar.mo94746o1();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i4 += Character.charCount(codePointAt);
                                } else {
                                    C40672b bVar2 = new C40672b();
                                    int i52 = i;
                                    bVar2.mo94740l0(str, i, i4);
                                    m121691l(bVar2, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return bVar2.mo94746o1();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i4 += Character.charCount(codePointAt);
                }
                C40672b bVar22 = new C40672b();
                int i522 = i;
                bVar22.mo94740l0(str, i, i4);
                m121691l(bVar22, str, i4, i2, str2, z, z2, z3, z4, charset);
                return bVar22.mo94746o1();
            }
            int i6 = i;
            String substring = str.substring(i, i2);
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: c */
        public final int mo97001c(String str) {
            C41536l.m120489i(str, "scheme");
            if (C41536l.m120484d(str, "http")) {
                return 80;
            }
            if (C41536l.m120484d(str, "https")) {
                return 443;
            }
            return -1;
        }

        /* renamed from: d */
        public final C41931v mo97002d(String str) {
            C41536l.m120489i(str, "<this>");
            return new C41932a().mo96994s((C41931v) null, str).mo96981c();
        }

        /* renamed from: f */
        public final C41931v mo97003f(String str) {
            C41536l.m120489i(str, "<this>");
            try {
                return mo97002d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String mo97004g(String str, int i, int i2, boolean z) {
            C41536l.m120489i(str, "<this>");
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C40672b bVar = new C40672b();
                    bVar.mo94740l0(str, i, i3);
                    m121692m(bVar, str, i3, i2, z);
                    return bVar.mo94746o1();
                }
                i3 = i4;
            }
            String substring = str.substring(i, i2);
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: i */
        public final void mo97005i(List list, StringBuilder sb) {
            C41536l.m120489i(list, "<this>");
            C41536l.m120489i(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) list.get(i));
            }
        }

        /* renamed from: j */
        public final List mo97006j(String str) {
            C41536l.m120489i(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int W = C40440x.m117155W(str, '&', i, false, 4, (Object) null);
                if (W == -1) {
                    W = str.length();
                }
                int i2 = W;
                int W2 = C40440x.m117155W(str, '=', i, false, 4, (Object) null);
                if (W2 == -1 || W2 > i2) {
                    String substring = str.substring(i, i2);
                    C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, W2);
                    C41536l.m120488h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(W2 + 1, i2);
                    C41536l.m120488h(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void mo97007k(List list, StringBuilder sb) {
            C41536l.m120489i(list, "<this>");
            C41536l.m120489i(sb, "out");
            C43417c m = C43429k.m124594m(C43429k.m124596o(0, list.size()), 2);
            int j = m.mo102109j();
            int l = m.mo102110l();
            int n = m.mo102111n();
            if ((n > 0 && j <= l) || (n < 0 && l <= j)) {
                while (true) {
                    int i = j + n;
                    String str = (String) list.get(j);
                    String str2 = (String) list.get(j + 1);
                    if (j > 0) {
                        sb.append('&');
                    }
                    sb.append(str);
                    if (str2 != null) {
                        sb.append('=');
                        sb.append(str2);
                    }
                    if (j != l) {
                        j = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public C41931v(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6) {
        C41536l.m120489i(str, "scheme");
        C41536l.m120489i(str2, "username");
        C41536l.m120489i(str3, "password");
        C41536l.m120489i(str4, "host");
        C41536l.m120489i(list, "pathSegments");
        C41536l.m120489i(str6, C11769i.C11770a.f34149l);
        this.f98554a = str;
        this.f98555b = str2;
        this.f98556c = str3;
        this.f98557d = str4;
        this.f98558e = i;
        this.f98559f = list;
        this.f98560g = list2;
        this.f98561h = str5;
        this.f98562i = str6;
        this.f98563j = C41536l.m120484d(str, "https");
    }

    /* renamed from: h */
    public static final C41931v m121621h(String str) {
        return f98552k.mo97002d(str);
    }

    /* renamed from: m */
    public static final C41931v m121622m(String str) {
        return f98552k.mo97003f(str);
    }

    /* renamed from: b */
    public final String mo96946b() {
        if (this.f98561h == null) {
            return null;
        }
        String substring = this.f98562i.substring(C40440x.m117155W(this.f98562i, '#', 0, false, 6, (Object) null) + 1);
        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c */
    public final String mo96947c() {
        boolean z;
        if (this.f98556c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String substring = this.f98562i.substring(C40440x.m117155W(this.f98562i, ':', this.f98554a.length() + 3, false, 4, (Object) null) + 1, C40440x.m117155W(this.f98562i, '@', 0, false, 6, (Object) null));
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public final String mo96948d() {
        int W = C40440x.m117155W(this.f98562i, '/', this.f98554a.length() + 3, false, 4, (Object) null);
        String str = this.f98562i;
        String substring = this.f98562i.substring(W, C42197d.m122551q(str, "?#", W, str.length()));
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public final List mo96949e() {
        int W = C40440x.m117155W(this.f98562i, '/', this.f98554a.length() + 3, false, 4, (Object) null);
        String str = this.f98562i;
        int q = C42197d.m122551q(str, "?#", W, str.length());
        ArrayList arrayList = new ArrayList();
        while (W < q) {
            int i = W + 1;
            int p = C42197d.m122550p(this.f98562i, '/', i, q);
            String substring = this.f98562i.substring(i, p);
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            W = p;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C41931v) && C41536l.m120484d(((C41931v) obj).f98562i, this.f98562i);
    }

    /* renamed from: f */
    public final String mo96951f() {
        if (this.f98560g == null) {
            return null;
        }
        int W = C40440x.m117155W(this.f98562i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f98562i;
        String substring = this.f98562i.substring(W, C42197d.m122550p(str, '#', W, str.length()));
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g */
    public final String mo96952g() {
        boolean z;
        if (this.f98555b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        int length = this.f98554a.length() + 3;
        String str = this.f98562i;
        String substring = this.f98562i.substring(length, C42197d.m122551q(str, ":@", length, str.length()));
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f98562i.hashCode();
    }

    /* renamed from: i */
    public final String mo96954i() {
        return this.f98557d;
    }

    /* renamed from: j */
    public final boolean mo96955j() {
        return this.f98563j;
    }

    /* renamed from: k */
    public final C41932a mo96956k() {
        int i;
        C41932a aVar = new C41932a();
        aVar.mo96977K(this.f98554a);
        aVar.mo96973G(mo96952g());
        aVar.mo96971E(mo96947c());
        aVar.mo96974H(this.f98557d);
        if (this.f98558e != f98552k.mo97001c(this.f98554a)) {
            i = this.f98558e;
        } else {
            i = -1;
        }
        aVar.mo96975I(i);
        aVar.mo96987j().clear();
        aVar.mo96987j().addAll(mo96949e());
        aVar.mo96983f(mo96951f());
        aVar.mo96970D(mo96946b());
        return aVar;
    }

    /* renamed from: l */
    public final C41932a mo96957l(String str) {
        C41536l.m120489i(str, "link");
        try {
            return new C41932a().mo96994s(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public final List mo96958n() {
        return this.f98559f;
    }

    /* renamed from: o */
    public final int mo96959o() {
        return this.f98558e;
    }

    /* renamed from: p */
    public final String mo96960p() {
        if (this.f98560g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f98552k.mo97007k(this.f98560g, sb);
        return sb.toString();
    }

    /* renamed from: q */
    public final String mo96961q(String str) {
        C41536l.m120489i(str, "name");
        List list = this.f98560g;
        if (list == null) {
            return null;
        }
        C43417c m = C43429k.m124594m(C43429k.m124596o(0, list.size()), 2);
        int j = m.mo102109j();
        int l = m.mo102110l();
        int n = m.mo102111n();
        if ((n > 0 && j <= l) || (n < 0 && l <= j)) {
            while (true) {
                int i = j + n;
                if (C41536l.m120484d(str, this.f98560g.get(j))) {
                    return (String) this.f98560g.get(j + 1);
                }
                if (j == l) {
                    break;
                }
                j = i;
            }
        }
        return null;
    }

    /* renamed from: r */
    public final String mo96962r() {
        C41932a l = mo96957l("/...");
        C41536l.m120486f(l);
        return l.mo96978L("").mo96995t("").mo96981c().toString();
    }

    /* renamed from: s */
    public final C41931v mo96963s(String str) {
        C41536l.m120489i(str, "link");
        C41932a l = mo96957l(str);
        if (l == null) {
            return null;
        }
        return l.mo96981c();
    }

    /* renamed from: t */
    public final String mo96964t() {
        return this.f98554a;
    }

    public String toString() {
        return this.f98562i;
    }

    /* renamed from: u */
    public final URI mo96966u() {
        String aVar = mo96956k().mo96999y().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new C40419j("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").mo94490g(aVar, ""));
                C41536l.m120488h(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: v */
    public final URL mo96967v() {
        try {
            return new URL(this.f98562i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
