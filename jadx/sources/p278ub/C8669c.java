package p278ub;

import com.salesforce.marketingcloud.C11398b;

/* renamed from: ub.c */
class C8669c implements C8673g {
    C8669c() {
    }

    /* renamed from: b */
    private int m32322b(C8674h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f24478d--;
        int c = mo24024c(hVar.mo24034c(), sb2);
        hVar.mo24041k();
        return c;
    }

    /* renamed from: d */
    private static String m32323d(CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (charAt / C11398b.f33139r), (char) (charAt % C11398b.f33139r)});
    }

    /* renamed from: g */
    static void m32324g(C8674h hVar, StringBuilder sb) {
        hVar.mo24049s(m32323d(sb));
        sb.delete(0, 3);
    }

    /* renamed from: a */
    public void mo24021a(C8674h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo24039i()) {
                break;
            }
            char c = hVar.mo24034c();
            hVar.f24478d++;
            int c2 = mo24024c(c, sb);
            int a = hVar.mo24032a() + ((sb.length() / 3) << 1);
            hVar.mo24047q(a);
            int a2 = hVar.mo24038g().mo24050a() - a;
            if (hVar.mo24039i()) {
                if (sb.length() % 3 == 0 && C8676j.m32381n(hVar.mo24035d(), hVar.f24478d, mo24025e()) != mo24025e()) {
                    hVar.mo24045o(0);
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && a2 != 2) {
                    c2 = m32322b(hVar, sb, sb2, c2);
                }
                while (sb.length() % 3 == 1 && (c2 > 3 || a2 != 1)) {
                    c2 = m32322b(hVar, sb, sb2, c2);
                }
            }
        }
        mo24026f(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24024c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c <= 127) {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return mo24024c((char) (c - 128), sb) + 2;
        }
    }

    /* renamed from: e */
    public int mo24025e() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24026f(C8674h hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = hVar.mo24032a() + ((sb.length() / 3) << 1);
        hVar.mo24047q(a);
        int a2 = hVar.mo24038g().mo24050a() - a;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                m32324g(hVar, sb);
            }
            if (hVar.mo24039i()) {
                hVar.mo24048r(254);
            }
        } else if (a2 == 1 && length == 1) {
            while (sb.length() >= 3) {
                m32324g(hVar, sb);
            }
            if (hVar.mo24039i()) {
                hVar.mo24048r(254);
            }
            hVar.f24478d--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m32324g(hVar, sb);
            }
            if (a2 > 0 || hVar.mo24039i()) {
                hVar.mo24048r(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.mo24045o(0);
    }
}
