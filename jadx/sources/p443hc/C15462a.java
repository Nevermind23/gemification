package p443hc;

import com.google.zxing.FormatException;
import p200ob.C7508b;

/* renamed from: hc.a */
final class C15462a {

    /* renamed from: a */
    private final C7508b f43881a;

    /* renamed from: b */
    private C15480j f43882b;

    /* renamed from: c */
    private C15477g f43883c;

    /* renamed from: d */
    private boolean f43884d;

    C15462a(C7508b bVar) {
        int h = bVar.mo21978h();
        if (h < 21 || (h & 3) != 1) {
            throw FormatException.m23153a();
        }
        this.f43881a = bVar;
    }

    /* renamed from: a */
    private int m55945a(int i, int i2, int i3) {
        return this.f43884d ? this.f43881a.mo21974e(i2, i) : this.f43881a.mo21974e(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo42548b() {
        int i = 0;
        while (i < this.f43881a.mo21982l()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f43881a.mo21978h(); i3++) {
                if (this.f43881a.mo21974e(i, i3) != this.f43881a.mo21974e(i3, i)) {
                    this.f43881a.mo21973d(i3, i);
                    this.f43881a.mo21973d(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo42549c() {
        int i;
        C15477g d = mo42550d();
        C15480j e = mo42551e();
        C15464c cVar = C15464c.values()[d.mo42560c()];
        int h = this.f43881a.mo21978h();
        cVar.mo42557b(this.f43881a, h);
        C7508b a = e.mo42567a();
        byte[] bArr = new byte[e.mo42571h()];
        int i2 = h - 1;
        boolean z = true;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            for (int i7 = 0; i7 < h; i7++) {
                if (z) {
                    i = i2 - i7;
                } else {
                    i = i7;
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (!a.mo21974e(i9, i)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f43881a.mo21974e(i9, i)) {
                            i6 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i4] = (byte) i6;
                            i4++;
                            i5 = 0;
                            i6 = 0;
                        }
                    }
                }
            }
            z = !z;
            i3 -= 2;
        }
        if (i4 == e.mo42571h()) {
            return bArr;
        }
        throw FormatException.m23153a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C15477g mo42550d() {
        C15477g gVar = this.f43883c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m55945a(i3, 8, i2);
        }
        int a = m55945a(8, 7, m55945a(8, 8, m55945a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m55945a(8, i4, a);
        }
        int h = this.f43881a.mo21978h();
        int i5 = h - 7;
        for (int i6 = h - 1; i6 >= i5; i6--) {
            i = m55945a(8, i6, i);
        }
        for (int i7 = h - 8; i7 < h; i7++) {
            i = m55945a(i7, 8, i);
        }
        C15477g a2 = C15477g.m55978a(a, i);
        this.f43883c = a2;
        if (a2 != null) {
            return a2;
        }
        throw FormatException.m23153a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C15480j mo42551e() {
        C15480j jVar = this.f43882b;
        if (jVar != null) {
            return jVar;
        }
        int h = this.f43881a.mo21978h();
        int i = (h - 17) / 4;
        if (i <= 6) {
            return C15480j.m55990i(i);
        }
        int i2 = h - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = h - 9; i6 >= i2; i6--) {
                i4 = m55945a(i6, i5, i4);
            }
        }
        C15480j c = C15480j.m55988c(i4);
        if (c == null || c.mo42569e() != h) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = h - 9; i8 >= i2; i8--) {
                    i3 = m55945a(i7, i8, i3);
                }
            }
            C15480j c2 = C15480j.m55988c(i3);
            if (c2 == null || c2.mo42569e() != h) {
                throw FormatException.m23153a();
            }
            this.f43882b = c2;
            return c2;
        }
        this.f43882b = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo42552f() {
        if (this.f43883c != null) {
            C15464c.values()[this.f43883c.mo42560c()].mo42557b(this.f43881a, this.f43881a.mo21978h());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo42553g(boolean z) {
        this.f43882b = null;
        this.f43883c = null;
        this.f43884d = z;
    }
}
