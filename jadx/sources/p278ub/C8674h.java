package p278ub;

import com.google.zxing.C5755e;
import java.nio.charset.StandardCharsets;

/* renamed from: ub.h */
final class C8674h {

    /* renamed from: a */
    private final String f24475a;

    /* renamed from: b */
    private C8678l f24476b;

    /* renamed from: c */
    private final StringBuilder f24477c;

    /* renamed from: d */
    int f24478d;

    /* renamed from: e */
    private int f24479e;

    /* renamed from: f */
    private C8677k f24480f;

    /* renamed from: g */
    private int f24481g;

    C8674h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f24475a = sb.toString();
        this.f24476b = C8678l.FORCE_NONE;
        this.f24477c = new StringBuilder(str.length());
        this.f24479e = -1;
    }

    /* renamed from: h */
    private int m32347h() {
        return this.f24475a.length() - this.f24481g;
    }

    /* renamed from: a */
    public int mo24032a() {
        return this.f24477c.length();
    }

    /* renamed from: b */
    public StringBuilder mo24033b() {
        return this.f24477c;
    }

    /* renamed from: c */
    public char mo24034c() {
        return this.f24475a.charAt(this.f24478d);
    }

    /* renamed from: d */
    public String mo24035d() {
        return this.f24475a;
    }

    /* renamed from: e */
    public int mo24036e() {
        return this.f24479e;
    }

    /* renamed from: f */
    public int mo24037f() {
        return m32347h() - this.f24478d;
    }

    /* renamed from: g */
    public C8677k mo24038g() {
        return this.f24480f;
    }

    /* renamed from: i */
    public boolean mo24039i() {
        return this.f24478d < m32347h();
    }

    /* renamed from: j */
    public void mo24040j() {
        this.f24479e = -1;
    }

    /* renamed from: k */
    public void mo24041k() {
        this.f24480f = null;
    }

    /* renamed from: l */
    public void mo24042l(C5755e eVar, C5755e eVar2) {
    }

    /* renamed from: m */
    public void mo24043m(int i) {
        this.f24481g = i;
    }

    /* renamed from: n */
    public void mo24044n(C8678l lVar) {
        this.f24476b = lVar;
    }

    /* renamed from: o */
    public void mo24045o(int i) {
        this.f24479e = i;
    }

    /* renamed from: p */
    public void mo24046p() {
        mo24047q(mo24032a());
    }

    /* renamed from: q */
    public void mo24047q(int i) {
        C8677k kVar = this.f24480f;
        if (kVar == null || i > kVar.mo24050a()) {
            this.f24480f = C8677k.m32385l(i, this.f24476b, (C5755e) null, (C5755e) null, true);
        }
    }

    /* renamed from: r */
    public void mo24048r(char c) {
        this.f24477c.append(c);
    }

    /* renamed from: s */
    public void mo24049s(String str) {
        this.f24477c.append(str);
    }
}
