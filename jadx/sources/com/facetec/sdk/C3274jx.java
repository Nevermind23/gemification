package com.facetec.sdk;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facetec.sdk.jx */
public final class C3274jx {

    /* renamed from: d */
    private static final char[] f10730d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final int f10731a;

    /* renamed from: b */
    final String f10732b;

    /* renamed from: c */
    public final List<String> f10733c;

    /* renamed from: e */
    final String f10734e;

    /* renamed from: f */
    private final String f10735f;

    /* renamed from: g */
    private final String f10736g;

    /* renamed from: h */
    private final String f10737h;

    /* renamed from: i */
    private final List<String> f10738i;

    /* renamed from: j */
    private final String f10739j;

    /* renamed from: com.facetec.sdk.jx$c */
    public static final class C3275c {

        /* renamed from: a */
        int f10740a = -1;

        /* renamed from: b */
        String f10741b;

        /* renamed from: c */
        String f10742c = "";

        /* renamed from: d */
        String f10743d = "";

        /* renamed from: e */
        String f10744e;

        /* renamed from: f */
        List<String> f10745f;

        /* renamed from: h */
        final List<String> f10746h;

        /* renamed from: j */
        String f10747j;

        public C3275c() {
            ArrayList arrayList = new ArrayList();
            this.f10746h = arrayList;
            arrayList.add("");
        }

        /* renamed from: c */
        private static boolean m13137c(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: e */
        private static boolean m13141e(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: h */
        private static int m13142h(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C3274jx.m13109a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: a */
        public final C3274jx mo9556a() {
            if (this.f10741b == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f10744e != null) {
                return new C3274jx(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* renamed from: b */
        public final C3275c mo9557b(String str) {
            this.f10745f = str != null ? C3274jx.m13110a(C3274jx.m13120e(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final int mo9558d() {
            int i = this.f10740a;
            return i != -1 ? i : C3274jx.m13118e(this.f10741b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f10741b;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f10743d.isEmpty() || !this.f10742c.isEmpty()) {
                sb.append(this.f10743d);
                if (!this.f10742c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f10742c);
                }
                sb.append('@');
            }
            String str2 = this.f10744e;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f10744e);
                    sb.append(']');
                } else {
                    sb.append(this.f10744e);
                }
            }
            if (!(this.f10740a == -1 && this.f10741b == null)) {
                int d = mo9558d();
                String str3 = this.f10741b;
                if (str3 == null || d != C3274jx.m13118e(str3)) {
                    sb.append(':');
                    sb.append(d);
                }
            }
            C3274jx.m13113b(sb, this.f10746h);
            if (this.f10745f != null) {
                sb.append('?');
                C3274jx.m13117d(sb, this.f10745f);
            }
            if (this.f10747j != null) {
                sb.append('#');
                sb.append(this.f10747j);
            }
            return sb.toString();
        }

        /* renamed from: e */
        private void m13140e() {
            List<String> list = this.f10746h;
            if (!list.remove(list.size() - 1).isEmpty() || this.f10746h.isEmpty()) {
                this.f10746h.add("");
                return;
            }
            List<String> list2 = this.f10746h;
            list2.set(list2.size() - 1, "");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final C3275c mo9559d(C3274jx jxVar, String str) {
            int c;
            int i;
            C3274jx jxVar2 = jxVar;
            String str2 = str;
            int e = C3303ki.m13271e(str2, 0, str.length());
            int d = C3303ki.m13261d(str2, e, str.length());
            int e2 = m13139e(str2, e, d);
            if (e2 != -1) {
                if (str.regionMatches(true, e, "https:", 0, 6)) {
                    this.f10741b = "https";
                    e += 6;
                } else if (str.regionMatches(true, e, "http:", 0, 5)) {
                    this.f10741b = "http";
                    e += 5;
                } else {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    sb.append(str2.substring(0, e2));
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (jxVar2 != null) {
                this.f10741b = jxVar2.f10732b;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int c2 = m13136c(str2, e, d);
            char c3 = '?';
            char c4 = '#';
            if (c2 >= 2 || jxVar2 == null || !jxVar2.f10732b.equals(this.f10741b)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = e + c2;
                while (true) {
                    c = C3303ki.m13256c(str2, i2, d, "@/\\?#");
                    char charAt = c != d ? str2.charAt(c) : 65535;
                    if (charAt == 65535 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        int i3 = c;
                        int d2 = m13138d(str2, i2, i3);
                        int i4 = d2 + 1;
                    } else if (charAt == '@') {
                        if (!z) {
                            int a = C3303ki.m13241a(str2, i2, c, ':');
                            int i5 = a;
                            String str3 = "%40";
                            i = c;
                            String a2 = C3274jx.m13109a(str, i2, a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            if (z2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.f10743d);
                                sb2.append(str3);
                                sb2.append(a2);
                                a2 = sb2.toString();
                            }
                            this.f10743d = a2;
                            if (i5 != i) {
                                this.f10742c = C3274jx.m13109a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = c;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f10742c);
                            sb3.append("%40");
                            sb3.append(C3274jx.m13109a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null));
                            this.f10742c = sb3.toString();
                        }
                        i2 = i + 1;
                        c3 = '?';
                        c4 = '#';
                    }
                }
                int i32 = c;
                int d22 = m13138d(str2, i2, i32);
                int i42 = d22 + 1;
                if (i42 < i32) {
                    this.f10744e = m13134b(str2, i2, d22);
                    int h = m13142h(str2, i42, i32);
                    this.f10740a = h;
                    if (h == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        sb4.append(str2.substring(i42, i32));
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    this.f10744e = m13134b(str2, i2, d22);
                    this.f10740a = C3274jx.m13118e(this.f10741b);
                }
                if (this.f10744e != null) {
                    e = i32;
                } else {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    sb5.append(str2.substring(i2, d22));
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                this.f10743d = jxVar.mo9543b();
                this.f10742c = jxVar.mo9542a();
                this.f10744e = jxVar2.f10734e;
                this.f10740a = jxVar2.f10731a;
                this.f10746h.clear();
                this.f10746h.addAll(jxVar.mo9553i());
                if (e == d || str2.charAt(e) == '#') {
                    mo9557b(jxVar.mo9554j());
                }
            }
            int c5 = C3303ki.m13256c(str2, e, d, "?#");
            m13133a(str2, e, c5);
            if (c5 < d && str2.charAt(c5) == '?') {
                int a3 = C3303ki.m13241a(str2, c5, d, '#');
                this.f10745f = C3274jx.m13110a(C3274jx.m13109a(str, c5 + 1, a3, " \"'<>#", true, false, true, true, (Charset) null));
                c5 = a3;
            }
            if (c5 < d && str2.charAt(c5) == '#') {
                this.f10747j = C3274jx.m13109a(str, 1 + c5, d, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        /* renamed from: b */
        private void m13135b(String str, int i, int i2, boolean z) {
            String a = C3274jx.m13109a(str, i, i2, " \"<>^`{}|/\\?#", true, false, false, true, (Charset) null);
            if (!m13141e(a)) {
                if (m13137c(a)) {
                    m13140e();
                    return;
                }
                List<String> list = this.f10746h;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f10746h;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f10746h.add(a);
                }
                if (z) {
                    this.f10746h.add("");
                }
            }
        }

        /* renamed from: c */
        private static int m13136c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: a */
        private void m13133a(String str, int i, int i2) {
            if (i != i2) {
                char charAt = str.charAt(i);
                if (charAt == '/' || charAt == '\\') {
                    this.f10746h.clear();
                    this.f10746h.add("");
                    i++;
                } else {
                    List<String> list = this.f10746h;
                    list.set(list.size() - 1, "");
                }
                while (i < i2) {
                    int c = C3303ki.m13256c(str, i, i2, "/\\");
                    boolean z = c < i2;
                    m13135b(str, i, c, z);
                    if (z) {
                        c++;
                    }
                    i = c;
                }
            }
        }

        /* renamed from: e */
        private static int m13139e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: b */
        static String m13134b(String str, int i, int i2) {
            return C3303ki.m13258c(C3274jx.m13114c(str, i, i2, false));
        }

        /* renamed from: d */
        private static int m13138d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }
    }

    C3274jx(C3275c cVar) {
        List<String> list;
        this.f10732b = cVar.f10741b;
        this.f10737h = m13115c(cVar.f10743d, false);
        this.f10735f = m13115c(cVar.f10742c, false);
        this.f10734e = cVar.f10744e;
        this.f10731a = cVar.mo9558d();
        this.f10738i = m13112b(cVar.f10746h, false);
        List<String> list2 = cVar.f10745f;
        String str = null;
        if (list2 != null) {
            list = m13112b(list2, true);
        } else {
            list = null;
        }
        this.f10733c = list;
        String str2 = cVar.f10747j;
        this.f10736g = str2 != null ? m13115c(str2, false) : str;
        this.f10739j = cVar.toString();
    }

    /* renamed from: d */
    public static void m13117d(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: a */
    public final String mo9542a() {
        if (this.f10735f.isEmpty()) {
            return "";
        }
        int indexOf = this.f10739j.indexOf(64);
        return this.f10739j.substring(this.f10739j.indexOf(58, this.f10732b.length() + 3) + 1, indexOf);
    }

    /* renamed from: b */
    public final String mo9543b() {
        if (this.f10737h.isEmpty()) {
            return "";
        }
        int length = this.f10732b.length() + 3;
        String str = this.f10739j;
        return this.f10739j.substring(length, C3303ki.m13256c(str, length, str.length(), ":@"));
    }

    /* renamed from: c */
    public final boolean mo9544c() {
        return this.f10732b.equals("https");
    }

    /* renamed from: e */
    public final String mo9547e() {
        return this.f10732b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3274jx) && ((C3274jx) obj).f10739j.equals(this.f10739j);
    }

    /* renamed from: f */
    public final String mo9549f() {
        int indexOf = this.f10739j.indexOf(47, this.f10732b.length() + 3);
        String str = this.f10739j;
        return this.f10739j.substring(indexOf, C3303ki.m13256c(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: g */
    public final int mo9550g() {
        return this.f10731a;
    }

    /* renamed from: h */
    public final String mo9551h() {
        return this.f10734e;
    }

    public final int hashCode() {
        return this.f10739j.hashCode();
    }

    /* renamed from: i */
    public final List<String> mo9553i() {
        int indexOf = this.f10739j.indexOf(47, this.f10732b.length() + 3);
        String str = this.f10739j;
        int c = C3303ki.m13256c(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < c) {
            int i = indexOf + 1;
            int a = C3303ki.m13241a(this.f10739j, i, c, '/');
            arrayList.add(this.f10739j.substring(i, a));
            indexOf = a;
        }
        return arrayList;
    }

    /* renamed from: j */
    public final String mo9554j() {
        if (this.f10733c == null) {
            return null;
        }
        int indexOf = this.f10739j.indexOf(63) + 1;
        String str = this.f10739j;
        return this.f10739j.substring(indexOf, C3303ki.m13241a(str, indexOf, str.length(), '#'));
    }

    public final String toString() {
        return this.f10739j;
    }

    /* renamed from: c */
    private static String m13115c(String str, boolean z) {
        return m13114c(str, 0, str.length(), z);
    }

    /* renamed from: e */
    public static int m13118e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: c */
    static String m13114c(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C3431mm mmVar = new C3431mm();
                mmVar.mo9858e(str, i, i3);
                m13116c(mmVar, str, i3, i2, z);
                return mmVar.mo9886o();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: e */
    private static boolean m13121e(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C3303ki.m13247b(str.charAt(i + 1)) == -1 || C3303ki.m13247b(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static List<String> m13110a(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: b */
    static void m13113b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: e */
    static String m13119e(String str, String str2, Charset charset) {
        return m13109a(str, 0, str.length(), str2, false, false, true, true, charset);
    }

    /* renamed from: b */
    public static C3274jx m13111b(String str) {
        return new C3275c().mo9559d((C3274jx) null, str).mo9556a();
    }

    /* renamed from: d */
    public final C3275c mo9545d(String str) {
        try {
            return new C3275c().mo9559d(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static List<String> m13112b(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m13115c(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static void m13116c(C3431mm mmVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int b = C3303ki.m13247b(str.charAt(i + 1));
                int b2 = C3303ki.m13247b(str.charAt(i3));
                if (!(b == -1 || b2 == -1)) {
                    mmVar.mo9870g((b << 4) + b2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                mmVar.mo9870g(32);
                i += Character.charCount(codePointAt);
            }
            mmVar.mo9836a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: e */
    static String m13120e(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m13109a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    /* renamed from: d */
    public final URI mo9546d() {
        String str;
        C3275c cVar = new C3275c();
        cVar.f10741b = this.f10732b;
        cVar.f10743d = mo9543b();
        cVar.f10742c = mo9542a();
        cVar.f10744e = this.f10734e;
        cVar.f10740a = this.f10731a != m13118e(this.f10732b) ? this.f10731a : -1;
        cVar.f10746h.clear();
        cVar.f10746h.addAll(mo9553i());
        cVar.mo9557b(mo9554j());
        if (this.f10736g == null) {
            str = null;
        } else {
            str = this.f10739j.substring(this.f10739j.indexOf(35) + 1);
        }
        cVar.f10747j = str;
        int size = cVar.f10746h.size();
        for (int i = 0; i < size; i++) {
            cVar.f10746h.set(i, m13120e(cVar.f10746h.get(i), "[]", true, true, false, true));
        }
        List<String> list = cVar.f10745f;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = cVar.f10745f.get(i2);
                if (str2 != null) {
                    cVar.f10745f.set(i2, m13120e(str2, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str3 = cVar.f10747j;
        if (str3 != null) {
            cVar.f10747j = m13120e(str3, " \"#<>\\^`{|}", true, true, false, false);
        }
        String obj = cVar.toString();
        try {
            return new URI(obj);
        } catch (URISyntaxException e) {
            try {
                return URI.create(obj.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    static String m13109a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        String str4 = str2;
        Charset charset2 = charset;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str3.codePointAt(i4);
            int i5 = 43;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !m13121e(str3, i4, i3)))) || (codePointAt == 43 && z3)))) {
                C3431mm mmVar = new C3431mm();
                mmVar.mo9858e(str3, i, i4);
                C3431mm mmVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str3.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == i5 && z3) {
                            mmVar.mo9860e(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !m13121e(str3, i4, i3)))))) {
                            if (mmVar2 == null) {
                                mmVar2 = new C3431mm();
                            }
                            if (charset2 == null || charset2.equals(C3303ki.f10843e)) {
                                mmVar2.mo9836a(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i4;
                                if (i4 < 0) {
                                    throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i4)));
                                } else if (charCount < i4) {
                                    StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
                                    sb.append(charCount);
                                    sb.append(" < ");
                                    sb.append(i4);
                                    throw new IllegalArgumentException(sb.toString());
                                } else if (charCount > str.length()) {
                                    StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
                                    sb2.append(charCount);
                                    sb2.append(" > ");
                                    sb2.append(str.length());
                                    throw new IllegalArgumentException(sb2.toString());
                                } else if (charset2.equals(C3460nb.f11312a)) {
                                    mmVar2.mo9858e(str3, i4, charCount);
                                } else {
                                    byte[] bytes = str3.substring(i4, charCount).getBytes(charset2);
                                    mmVar2.mo9854d(bytes, 0, bytes.length);
                                }
                            }
                            while (!mmVar2.mo9864e()) {
                                byte f = mmVar2.mo9866f() & 255;
                                mmVar.mo9870g(37);
                                char[] cArr = f10730d;
                                mmVar.mo9870g((int) cArr[(f >> 4) & 15]);
                                mmVar.mo9870g((int) cArr[f & 15]);
                            }
                        } else {
                            mmVar.mo9836a(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = 43;
                }
                return mmVar.mo9886o();
            }
            i4 += Character.charCount(codePointAt);
        }
        int i6 = i;
        return str.substring(i, i2);
    }
}
