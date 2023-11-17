package p278ub;

/* renamed from: ub.n */
final class C8680n extends C8669c {
    C8680n() {
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
            mo24024c(c, sb);
            if (sb.length() % 3 == 0) {
                C8669c.m32324g(hVar, sb);
                if (C8676j.m32381n(hVar.mo24035d(), hVar.f24478d, mo24025e()) != mo24025e()) {
                    hVar.mo24045o(0);
                    break;
                }
            }
        }
        mo24026f(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24024c(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C8676j.m32372e(c);
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* renamed from: e */
    public int mo24025e() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24026f(C8674h hVar, StringBuilder sb) {
        hVar.mo24046p();
        int a = hVar.mo24038g().mo24050a() - hVar.mo24032a();
        hVar.f24478d -= sb.length();
        if (hVar.mo24037f() > 1 || a > 1 || hVar.mo24037f() != a) {
            hVar.mo24048r(254);
        }
        if (hVar.mo24036e() < 0) {
            hVar.mo24045o(0);
        }
    }
}
