package p161lb;

import java.util.LinkedList;
import p200ob.C7507a;

/* renamed from: lb.f */
final class C7041f {

    /* renamed from: e */
    static final C7041f f20961e = new C7041f(C7042g.f20966b, 0, 0, 0);

    /* renamed from: a */
    private final int f20962a;

    /* renamed from: b */
    private final C7042g f20963b;

    /* renamed from: c */
    private final int f20964c;

    /* renamed from: d */
    private final int f20965d;

    private C7041f(C7042g gVar, int i, int i2, int i3) {
        this.f20963b = gVar;
        this.f20962a = i;
        this.f20964c = i2;
        this.f20965d = i3;
    }

    /* renamed from: b */
    private static int m27267b(C7041f fVar) {
        int i = fVar.f20964c;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7041f mo21257a(int i) {
        int i2;
        C7042g gVar = this.f20963b;
        int i3 = this.f20962a;
        int i4 = this.f20965d;
        if (i3 == 4 || i3 == 2) {
            int i5 = C7038d.f20954c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVar = gVar.mo21267a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f20964c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else if (i8 == 62) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        C7041f fVar = new C7041f(gVar, i3, i8 + 1, i4 + i2);
        if (fVar.f20964c == 2078) {
            return fVar.mo21258c(i + 1);
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7041f mo21258c(int i) {
        int i2 = this.f20964c;
        if (i2 == 0) {
            return this;
        }
        return new C7041f(this.f20963b.mo21268b(i - i2, i2), this.f20962a, 0, this.f20965d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo21259d() {
        return this.f20964c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo21260e() {
        return this.f20965d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo21261f() {
        return this.f20962a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo21262g(C7041f fVar) {
        int i = this.f20965d + (C7038d.f20954c[this.f20962a][fVar.f20962a] >> 16);
        int i2 = this.f20964c;
        int i3 = fVar.f20964c;
        if (i2 < i3) {
            i += m27267b(fVar) - m27267b(this);
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        if (i <= fVar.f20965d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C7041f mo21263h(int i, int i2) {
        int i3;
        int i4 = this.f20965d;
        C7042g gVar = this.f20963b;
        int i5 = this.f20962a;
        if (i != i5) {
            int i6 = C7038d.f20954c[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            gVar = gVar.mo21267a(i7, i8);
            i4 += i8;
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new C7041f(gVar.mo21267a(i2, i3), i, 0, i4 + i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7041f mo21264i(int i, int i2) {
        int i3;
        C7042g gVar = this.f20963b;
        int i4 = this.f20962a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new C7041f(gVar.mo21267a(C7038d.f20956e[i4][i], i3).mo21267a(i2, 5), this.f20962a, 0, this.f20965d + i3 + 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C7507a mo21265j(byte[] bArr) {
        LinkedList<C7042g> linkedList = new LinkedList<>();
        for (C7042g gVar = mo21258c(bArr.length).f20963b; gVar != null; gVar = gVar.mo21269d()) {
            linkedList.addFirst(gVar);
        }
        C7507a aVar = new C7507a();
        for (C7042g c : linkedList) {
            c.mo21251c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C7038d.f20953b[this.f20962a], Integer.valueOf(this.f20965d), Integer.valueOf(this.f20964c)});
    }
}
