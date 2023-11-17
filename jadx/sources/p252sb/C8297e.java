package p252sb;

import com.google.zxing.FormatException;

/* renamed from: sb.e */
public final class C8297e {

    /* renamed from: h */
    private static final C8297e[] f23505h = m31168a();

    /* renamed from: a */
    private final int f23506a;

    /* renamed from: b */
    private final int f23507b;

    /* renamed from: c */
    private final int f23508c;

    /* renamed from: d */
    private final int f23509d;

    /* renamed from: e */
    private final int f23510e;

    /* renamed from: f */
    private final C8300c f23511f;

    /* renamed from: g */
    private final int f23512g;

    /* renamed from: sb.e$b */
    static final class C8299b {

        /* renamed from: a */
        private final int f23513a;

        /* renamed from: b */
        private final int f23514b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo23464a() {
            return this.f23513a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo23465b() {
            return this.f23514b;
        }

        private C8299b(int i, int i2) {
            this.f23513a = i;
            this.f23514b = i2;
        }
    }

    private C8297e(int i, int i2, int i3, int i4, int i5, C8300c cVar) {
        this.f23506a = i;
        this.f23507b = i2;
        this.f23508c = i3;
        this.f23509d = i4;
        this.f23510e = i5;
        this.f23511f = cVar;
        int b = cVar.mo23467b();
        int i6 = 0;
        for (C8299b bVar : cVar.mo23466a()) {
            i6 += bVar.mo23464a() * (bVar.mo23465b() + b);
        }
        this.f23512g = i6;
    }

    /* renamed from: a */
    private static C8297e[] m31168a() {
        return new C8297e[]{new C8297e(1, 10, 10, 8, 8, new C8300c(5, new C8299b(1, 3))), new C8297e(2, 12, 12, 10, 10, new C8300c(7, new C8299b(1, 5))), new C8297e(3, 14, 14, 12, 12, new C8300c(10, new C8299b(1, 8))), new C8297e(4, 16, 16, 14, 14, new C8300c(12, new C8299b(1, 12))), new C8297e(5, 18, 18, 16, 16, new C8300c(14, new C8299b(1, 18))), new C8297e(6, 20, 20, 18, 18, new C8300c(18, new C8299b(1, 22))), new C8297e(7, 22, 22, 20, 20, new C8300c(20, new C8299b(1, 30))), new C8297e(8, 24, 24, 22, 22, new C8300c(24, new C8299b(1, 36))), new C8297e(9, 26, 26, 24, 24, new C8300c(28, new C8299b(1, 44))), new C8297e(10, 32, 32, 14, 14, new C8300c(36, new C8299b(1, 62))), new C8297e(11, 36, 36, 16, 16, new C8300c(42, new C8299b(1, 86))), new C8297e(12, 40, 40, 18, 18, new C8300c(48, new C8299b(1, 114))), new C8297e(13, 44, 44, 20, 20, new C8300c(56, new C8299b(1, 144))), new C8297e(14, 48, 48, 22, 22, new C8300c(68, new C8299b(1, 174))), new C8297e(15, 52, 52, 24, 24, new C8300c(42, new C8299b(2, 102))), new C8297e(16, 64, 64, 14, 14, new C8300c(56, new C8299b(2, 140))), new C8297e(17, 72, 72, 16, 16, new C8300c(36, new C8299b(4, 92))), new C8297e(18, 80, 80, 18, 18, new C8300c(48, new C8299b(4, 114))), new C8297e(19, 88, 88, 20, 20, new C8300c(56, new C8299b(4, 144))), new C8297e(20, 96, 96, 22, 22, new C8300c(68, new C8299b(4, 174))), new C8297e(21, 104, 104, 24, 24, new C8300c(56, new C8299b(6, 136))), new C8297e(22, 120, 120, 18, 18, new C8300c(68, new C8299b(6, 175))), new C8297e(23, 132, 132, 20, 20, new C8300c(62, new C8299b(8, 163))), new C8297e(24, 144, 144, 22, 22, new C8300c(62, new C8299b(8, 156), new C8299b(2, 155))), new C8297e(25, 8, 18, 6, 16, new C8300c(7, new C8299b(1, 5))), new C8297e(26, 8, 32, 6, 14, new C8300c(11, new C8299b(1, 10))), new C8297e(27, 12, 26, 10, 24, new C8300c(14, new C8299b(1, 16))), new C8297e(28, 12, 36, 10, 16, new C8300c(18, new C8299b(1, 22))), new C8297e(29, 16, 36, 14, 16, new C8300c(24, new C8299b(1, 32))), new C8297e(30, 16, 48, 14, 22, new C8300c(28, new C8299b(1, 49)))};
    }

    /* renamed from: h */
    public static C8297e m31169h(int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C8297e eVar : f23505h) {
                if (eVar.f23507b == i && eVar.f23508c == i2) {
                    return eVar;
                }
            }
            throw FormatException.m23153a();
        }
        throw FormatException.m23153a();
    }

    /* renamed from: b */
    public int mo23456b() {
        return this.f23510e;
    }

    /* renamed from: c */
    public int mo23457c() {
        return this.f23509d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C8300c mo23458d() {
        return this.f23511f;
    }

    /* renamed from: e */
    public int mo23459e() {
        return this.f23508c;
    }

    /* renamed from: f */
    public int mo23460f() {
        return this.f23507b;
    }

    /* renamed from: g */
    public int mo23461g() {
        return this.f23512g;
    }

    /* renamed from: i */
    public int mo23462i() {
        return this.f23506a;
    }

    public String toString() {
        return String.valueOf(this.f23506a);
    }

    /* renamed from: sb.e$c */
    static final class C8300c {

        /* renamed from: a */
        private final int f23515a;

        /* renamed from: b */
        private final C8299b[] f23516b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C8299b[] mo23466a() {
            return this.f23516b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo23467b() {
            return this.f23515a;
        }

        private C8300c(int i, C8299b bVar) {
            this.f23515a = i;
            this.f23516b = new C8299b[]{bVar};
        }

        private C8300c(int i, C8299b bVar, C8299b bVar2) {
            this.f23515a = i;
            this.f23516b = new C8299b[]{bVar, bVar2};
        }
    }
}
