package p278ub;

/* renamed from: ub.b */
final class C8668b implements C8673g {
    C8668b() {
    }

    /* renamed from: c */
    private static char m32319c(char c, int i) {
        int i2 = c + ((i * 149) % C11051p3.f31759c) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    /* renamed from: a */
    public void mo24021a(C8674h hVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.mo24039i()) {
                break;
            }
            sb.append(hVar.mo24034c());
            hVar.f24478d++;
            if (C8676j.m32381n(hVar.mo24035d(), hVar.f24478d, mo24023b()) != mo24023b()) {
                hVar.mo24045o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = hVar.mo24032a() + length + 1;
        hVar.mo24047q(a);
        if (hVar.mo24038g().mo24050a() - a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (hVar.mo24039i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.mo24048r(m32319c(sb.charAt(i), hVar.mo24032a() + 1));
        }
    }

    /* renamed from: b */
    public int mo24023b() {
        return 5;
    }
}
