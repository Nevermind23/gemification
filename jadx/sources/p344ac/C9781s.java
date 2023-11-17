package p344ac;

import com.google.zxing.FormatException;
import p200ob.C7507a;

/* renamed from: ac.s */
final class C9781s {

    /* renamed from: a */
    private final C7507a f26572a;

    /* renamed from: b */
    private final C9774m f26573b = new C9774m();

    /* renamed from: c */
    private final StringBuilder f26574c = new StringBuilder();

    C9781s(C7507a aVar) {
        this.f26572a = aVar;
    }

    /* renamed from: b */
    private C9776n m35957b(int i) {
        char c;
        int f = mo26246f(i, 5);
        if (f == 15) {
            return new C9776n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C9776n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo26246f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C9776n(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f2)));
        }
        return new C9776n(i + 6, c);
    }

    /* renamed from: d */
    private C9776n m35958d(int i) {
        char c;
        int f = mo26246f(i, 5);
        if (f == 15) {
            return new C9776n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C9776n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo26246f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C9776n(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C9776n(i + 7, (char) (f2 + 7));
        }
        switch (mo26246f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.m23153a();
        }
        return new C9776n(i + 8, c);
    }

    /* renamed from: e */
    private C9778p m35959e(int i) {
        int i2 = i + 7;
        if (i2 > this.f26572a.mo21961l()) {
            int f = mo26246f(i, 4);
            if (f == 0) {
                return new C9778p(this.f26572a.mo21961l(), 10, 10);
            }
            return new C9778p(this.f26572a.mo21961l(), f - 1, 10);
        }
        int f2 = mo26246f(i, 7) - 8;
        return new C9778p(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: g */
    static int m35960g(C7507a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo21956g(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m35961h(int i) {
        int i2 = i + 3;
        if (i2 > this.f26572a.mo21961l()) {
            return false;
        }
        while (i < i2) {
            if (this.f26572a.mo21956g(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m35962i(int i) {
        int i2;
        if (i + 1 > this.f26572a.mo21961l()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f26572a.mo21961l()) {
            if (i3 == 2) {
                if (!this.f26572a.mo21956g(i + 2)) {
                    return false;
                }
            } else if (this.f26572a.mo21956g(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m35963j(int i) {
        int i2;
        if (i + 1 > this.f26572a.mo21961l()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f26572a.mo21961l()) {
            if (this.f26572a.mo21956g(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m35964k(int i) {
        int f;
        if (i + 5 > this.f26572a.mo21961l()) {
            return false;
        }
        int f2 = mo26246f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 6 <= this.f26572a.mo21961l() && (f = mo26246f(i, 6)) >= 16 && f < 63) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m35965l(int i) {
        int f;
        if (i + 5 > this.f26572a.mo21961l()) {
            return false;
        }
        int f2 = mo26246f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 7 > this.f26572a.mo21961l()) {
            return false;
        }
        int f3 = mo26246f(i, 7);
        if (f3 >= 64 && f3 < 116) {
            return true;
        }
        if (i + 8 <= this.f26572a.mo21961l() && (f = mo26246f(i, 8)) >= 232 && f < 253) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m35966m(int i) {
        if (i + 7 <= this.f26572a.mo21961l()) {
            int i2 = i;
            while (true) {
                int i3 = i + 3;
                if (i2 >= i3) {
                    return this.f26572a.mo21956g(i3);
                }
                if (this.f26572a.mo21956g(i2)) {
                    return true;
                }
                i2++;
            }
        } else if (i + 4 <= this.f26572a.mo21961l()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    private C9773l m35967n() {
        while (m35964k(this.f26573b.mo26226a())) {
            C9776n b = m35957b(this.f26573b.mo26226a());
            this.f26573b.mo26233h(b.mo26243a());
            if (b.mo26235c()) {
                return new C9773l(new C9777o(this.f26573b.mo26226a(), this.f26574c.toString()), true);
            }
            this.f26574c.append(b.mo26234b());
        }
        if (m35961h(this.f26573b.mo26226a())) {
            this.f26573b.mo26227b(3);
            this.f26573b.mo26232g();
        } else if (m35962i(this.f26573b.mo26226a())) {
            if (this.f26573b.mo26226a() + 5 < this.f26572a.mo21961l()) {
                this.f26573b.mo26227b(5);
            } else {
                this.f26573b.mo26233h(this.f26572a.mo21961l());
            }
            this.f26573b.mo26231f();
        }
        return new C9773l(false);
    }

    /* renamed from: o */
    private C9777o m35968o() {
        boolean z;
        C9773l lVar;
        boolean z2;
        do {
            int a = this.f26573b.mo26226a();
            if (this.f26573b.mo26228c()) {
                lVar = m35967n();
                z = lVar.mo26225b();
            } else if (this.f26573b.mo26229d()) {
                lVar = m35969p();
                z = lVar.mo26225b();
            } else {
                lVar = m35970q();
                z = lVar.mo26225b();
            }
            if (a != this.f26573b.mo26226a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !z) {
                break;
            }
        } while (!z);
        return lVar.mo26224a();
    }

    /* renamed from: p */
    private C9773l m35969p() {
        while (m35965l(this.f26573b.mo26226a())) {
            C9776n d = m35958d(this.f26573b.mo26226a());
            this.f26573b.mo26233h(d.mo26243a());
            if (d.mo26235c()) {
                return new C9773l(new C9777o(this.f26573b.mo26226a(), this.f26574c.toString()), true);
            }
            this.f26574c.append(d.mo26234b());
        }
        if (m35961h(this.f26573b.mo26226a())) {
            this.f26573b.mo26227b(3);
            this.f26573b.mo26232g();
        } else if (m35962i(this.f26573b.mo26226a())) {
            if (this.f26573b.mo26226a() + 5 < this.f26572a.mo21961l()) {
                this.f26573b.mo26227b(5);
            } else {
                this.f26573b.mo26233h(this.f26572a.mo21961l());
            }
            this.f26573b.mo26230e();
        }
        return new C9773l(false);
    }

    /* renamed from: q */
    private C9773l m35970q() {
        C9777o oVar;
        while (m35966m(this.f26573b.mo26226a())) {
            C9778p e = m35959e(this.f26573b.mo26226a());
            this.f26573b.mo26233h(e.mo26243a());
            if (e.mo26241d()) {
                if (e.mo26242e()) {
                    oVar = new C9777o(this.f26573b.mo26226a(), this.f26574c.toString());
                } else {
                    oVar = new C9777o(this.f26573b.mo26226a(), this.f26574c.toString(), e.mo26240c());
                }
                return new C9773l(oVar, true);
            }
            this.f26574c.append(e.mo26239b());
            if (e.mo26242e()) {
                return new C9773l(new C9777o(this.f26573b.mo26226a(), this.f26574c.toString()), true);
            }
            this.f26574c.append(e.mo26240c());
        }
        if (m35963j(this.f26573b.mo26226a())) {
            this.f26573b.mo26230e();
            this.f26573b.mo26227b(4);
        }
        return new C9773l(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo26244a(StringBuilder sb, int i) {
        String str;
        String str2 = null;
        while (true) {
            C9777o c = mo26245c(i, str2);
            String a = C9780r.m35954a(c.mo26236b());
            if (a != null) {
                sb.append(a);
            }
            if (c.mo26238d()) {
                str = String.valueOf(c.mo26237c());
            } else {
                str = null;
            }
            if (i == c.mo26243a()) {
                return sb.toString();
            }
            i = c.mo26243a();
            str2 = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9777o mo26245c(int i, String str) {
        this.f26574c.setLength(0);
        if (str != null) {
            this.f26574c.append(str);
        }
        this.f26573b.mo26233h(i);
        C9777o o = m35968o();
        if (o == null || !o.mo26238d()) {
            return new C9777o(this.f26573b.mo26226a(), this.f26574c.toString());
        }
        return new C9777o(this.f26573b.mo26226a(), this.f26574c.toString(), o.mo26237c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo26246f(int i, int i2) {
        return m35960g(this.f26572a, i, i2);
    }
}
