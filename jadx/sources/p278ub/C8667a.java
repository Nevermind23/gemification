package p278ub;

/* renamed from: ub.a */
final class C8667a implements C8673g {
    C8667a() {
    }

    /* renamed from: b */
    private static char m32316b(char c, char c2) {
        if (C8676j.m32373f(c) && C8676j.m32373f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    /* renamed from: a */
    public void mo24021a(C8674h hVar) {
        if (C8676j.m32368a(hVar.mo24035d(), hVar.f24478d) >= 2) {
            hVar.mo24048r(m32316b(hVar.mo24035d().charAt(hVar.f24478d), hVar.mo24035d().charAt(hVar.f24478d + 1)));
            hVar.f24478d += 2;
            return;
        }
        char c = hVar.mo24034c();
        int n = C8676j.m32381n(hVar.mo24035d(), hVar.f24478d, mo24022c());
        if (n != mo24022c()) {
            if (n == 1) {
                hVar.mo24048r(230);
                hVar.mo24045o(1);
            } else if (n == 2) {
                hVar.mo24048r(239);
                hVar.mo24045o(2);
            } else if (n == 3) {
                hVar.mo24048r(238);
                hVar.mo24045o(3);
            } else if (n == 4) {
                hVar.mo24048r(240);
                hVar.mo24045o(4);
            } else if (n == 5) {
                hVar.mo24048r(231);
                hVar.mo24045o(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n)));
            }
        } else if (C8676j.m32374g(c)) {
            hVar.mo24048r(235);
            hVar.mo24048r((char) ((c - 128) + 1));
            hVar.f24478d++;
        } else {
            hVar.mo24048r((char) (c + 1));
            hVar.f24478d++;
        }
    }

    /* renamed from: c */
    public int mo24022c() {
        return 0;
    }
}
