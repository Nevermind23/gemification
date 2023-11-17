package zh1;

import dg1.C40672b;
import dg1.C40677c;
import java.util.regex.Pattern;
import of1.C41869b0;
import of1.C41872c0;
import of1.C41921s;
import of1.C41928u;
import of1.C41931v;
import of1.C41937x;
import of1.C41939y;

/* renamed from: zh1.t */
final class C43506t {

    /* renamed from: l */
    private static final char[] f101418l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    private static final Pattern f101419m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f101420a;

    /* renamed from: b */
    private final C41931v f101421b;

    /* renamed from: c */
    private String f101422c;

    /* renamed from: d */
    private C41931v.C41932a f101423d;

    /* renamed from: e */
    private final C41869b0.C41870a f101424e = new C41869b0.C41870a();

    /* renamed from: f */
    private final C41928u.C41929a f101425f;

    /* renamed from: g */
    private C41937x f101426g;

    /* renamed from: h */
    private final boolean f101427h;

    /* renamed from: i */
    private C41939y.C41940a f101428i;

    /* renamed from: j */
    private C41921s.C41922a f101429j;

    /* renamed from: k */
    private C41872c0 f101430k;

    /* renamed from: zh1.t$a */
    private static class C43507a extends C41872c0 {

        /* renamed from: b */
        private final C41872c0 f101431b;

        /* renamed from: c */
        private final C41937x f101432c;

        C43507a(C41872c0 c0Var, C41937x xVar) {
            this.f101431b = c0Var;
            this.f101432c = xVar;
        }

        /* renamed from: a */
        public long mo21298a() {
            return this.f101431b.mo21298a();
        }

        /* renamed from: b */
        public C41937x mo21299b() {
            return this.f101432c;
        }

        /* renamed from: j */
        public void mo21300j(C40677c cVar) {
            this.f101431b.mo21300j(cVar);
        }
    }

    C43506t(String str, C41931v vVar, String str2, C41928u uVar, C41937x xVar, boolean z, boolean z2, boolean z3) {
        this.f101420a = str;
        this.f101421b = vVar;
        this.f101422c = str2;
        this.f101426g = xVar;
        this.f101427h = z;
        if (uVar != null) {
            this.f101425f = uVar.mo96931j();
        } else {
            this.f101425f = new C41928u.C41929a();
        }
        if (z2) {
            this.f101429j = new C41921s.C41922a();
        } else if (z3) {
            C41939y.C41940a aVar = new C41939y.C41940a();
            this.f101428i = aVar;
            aVar.mo97026e(C41939y.f98585l);
        }
    }

    /* renamed from: i */
    private static String m124747i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C40672b bVar = new C40672b();
                bVar.mo94740l0(str, 0, i);
                m124748j(bVar, str, i, length, z);
                return bVar.mo94746o1();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: j */
    private static void m124748j(C40672b bVar, String str, int i, int i2, boolean z) {
        C40672b bVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (bVar2 == null) {
                        bVar2 = new C40672b();
                    }
                    bVar2.mo94702G1(codePointAt);
                    while (!bVar2.mo94714Q0()) {
                        byte readByte = bVar2.readByte() & 255;
                        bVar.mo94715R0(37);
                        char[] cArr = f101418l;
                        bVar.mo94715R0(cArr[(readByte >> 4) & 15]);
                        bVar.mo94715R0(cArr[readByte & 15]);
                    }
                } else {
                    bVar.mo94702G1(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo102201a(String str, String str2, boolean z) {
        if (z) {
            this.f101429j.mo96913b(str, str2);
        } else {
            this.f101429j.mo96912a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo102202b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f101426g = C41937x.m121708e(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else {
            this.f101425f.mo96936a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo102203c(C41928u uVar) {
        this.f101425f.mo96937b(uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo102204d(C41928u uVar, C41872c0 c0Var) {
        this.f101428i.mo97023b(uVar, c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo102205e(C41939y.C41942c cVar) {
        this.f101428i.mo97024c(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo102206f(String str, String str2, boolean z) {
        if (this.f101422c != null) {
            String i = m124747i(str2, z);
            String str3 = this.f101422c;
            String replace = str3.replace("{" + str + "}", i);
            if (!f101419m.matcher(replace).matches()) {
                this.f101422c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo102207g(String str, String str2, boolean z) {
        String str3 = this.f101422c;
        if (str3 != null) {
            C41931v.C41932a l = this.f101421b.mo96957l(str3);
            this.f101423d = l;
            if (l != null) {
                this.f101422c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f101421b + ", Relative: " + this.f101422c);
            }
        }
        if (z) {
            this.f101423d.mo96979a(str, str2);
        } else {
            this.f101423d.mo96980b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo102208h(Class cls, Object obj) {
        this.f101424e.mo96703u(cls, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C41869b0.C41870a mo102209k() {
        C41931v vVar;
        C41931v.C41932a aVar = this.f101423d;
        if (aVar != null) {
            vVar = aVar.mo96981c();
        } else {
            vVar = this.f101421b.mo96963s(this.f101422c);
            if (vVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f101421b + ", Relative: " + this.f101422c);
            }
        }
        C43507a aVar2 = this.f101430k;
        if (aVar2 == null) {
            C41921s.C41922a aVar3 = this.f101429j;
            if (aVar3 != null) {
                aVar2 = aVar3.mo96914c();
            } else {
                C41939y.C41940a aVar4 = this.f101428i;
                if (aVar4 != null) {
                    aVar2 = aVar4.mo97025d();
                } else if (this.f101427h) {
                    aVar2 = C41872c0.m121334g((C41937x) null, new byte[0]);
                }
            }
        }
        C41937x xVar = this.f101426g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new C43507a(aVar2, xVar);
            } else {
                this.f101425f.mo96936a("Content-Type", xVar.toString());
            }
        }
        return this.f101424e.mo96706x(vVar).mo96692j(this.f101425f.mo96941f()).mo96693k(this.f101420a, aVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo102210l(C41872c0 c0Var) {
        this.f101430k = c0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo102211m(Object obj) {
        this.f101422c = obj.toString();
    }
}
