package p278ub;

/* renamed from: ub.f */
final class C8672f implements C8673g {
    C8672f() {
    }

    /* renamed from: b */
    private static void m32341b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C8676j.m32372e(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: c */
    private static String m32342c(CharSequence charSequence) {
        char c;
        char c2;
        int length = charSequence.length();
        if (length != 0) {
            char c3 = 0;
            char charAt = charSequence.charAt(0);
            if (length >= 2) {
                c = charSequence.charAt(1);
            } else {
                c = 0;
            }
            if (length >= 3) {
                c2 = charSequence.charAt(2);
            } else {
                c2 = 0;
            }
            if (length >= 4) {
                c3 = charSequence.charAt(3);
            }
            int i = (charAt << 18) + (c << 12) + (c2 << 6) + c3;
            char c4 = (char) ((i >> 8) & C11051p3.f31759c);
            char c5 = (char) (i & C11051p3.f31759c);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i >> 16) & C11051p3.f31759c));
            if (length >= 2) {
                sb.append(c4);
            }
            if (length >= 3) {
                sb.append(c5);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    private static void m32343e(C8674h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.mo24046p();
                    int a = hVar.mo24038g().mo24050a() - hVar.mo24032a();
                    int f = hVar.mo24037f();
                    if (f > a) {
                        hVar.mo24047q(hVar.mo24032a() + 1);
                        a = hVar.mo24038g().mo24050a() - hVar.mo24032a();
                    }
                    if (f <= a && a <= 2) {
                        hVar.mo24045o(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String c = m32342c(charSequence);
                    if (!(!hVar.mo24039i()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.mo24047q(hVar.mo24032a() + i);
                        if (hVar.mo24038g().mo24050a() - hVar.mo24032a() >= 3) {
                            hVar.mo24047q(hVar.mo24032a() + c.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.mo24041k();
                        hVar.f24478d -= i;
                    } else {
                        hVar.mo24049s(c);
                    }
                    hVar.mo24045o(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.mo24045o(0);
        }
    }

    /* renamed from: a */
    public void mo24021a(C8674h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo24039i()) {
                break;
            }
            m32341b(hVar.mo24034c(), sb);
            hVar.f24478d++;
            if (sb.length() >= 4) {
                hVar.mo24049s(m32342c(sb));
                sb.delete(0, 4);
                if (C8676j.m32381n(hVar.mo24035d(), hVar.f24478d, mo24031d()) != mo24031d()) {
                    hVar.mo24045o(0);
                    break;
                }
            }
        }
        sb.append(31);
        m32343e(hVar, sb);
    }

    /* renamed from: d */
    public int mo24031d() {
        return 4;
    }
}
