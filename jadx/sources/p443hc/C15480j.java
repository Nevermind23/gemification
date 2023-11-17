package p443hc;

import com.google.zxing.FormatException;
import p200ob.C7508b;

/* renamed from: hc.j */
public final class C15480j {

    /* renamed from: e */
    private static final int[] f43923e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C15480j[] f43924f = m55987b();

    /* renamed from: a */
    private final int f43925a;

    /* renamed from: b */
    private final int[] f43926b;

    /* renamed from: c */
    private final C15482b[] f43927c;

    /* renamed from: d */
    private final int f43928d;

    /* renamed from: hc.j$a */
    public static final class C15481a {

        /* renamed from: a */
        private final int f43929a;

        /* renamed from: b */
        private final int f43930b;

        C15481a(int i, int i2) {
            this.f43929a = i;
            this.f43930b = i2;
        }

        /* renamed from: a */
        public int mo42574a() {
            return this.f43929a;
        }

        /* renamed from: b */
        public int mo42575b() {
            return this.f43930b;
        }
    }

    /* renamed from: hc.j$b */
    public static final class C15482b {

        /* renamed from: a */
        private final int f43931a;

        /* renamed from: b */
        private final C15481a[] f43932b;

        C15482b(int i, C15481a... aVarArr) {
            this.f43931a = i;
            this.f43932b = aVarArr;
        }

        /* renamed from: a */
        public C15481a[] mo42576a() {
            return this.f43932b;
        }

        /* renamed from: b */
        public int mo42577b() {
            return this.f43931a;
        }

        /* renamed from: c */
        public int mo42578c() {
            int i = 0;
            for (C15481a a : this.f43932b) {
                i += a.mo42574a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo42579d() {
            return this.f43931a * mo42578c();
        }
    }

    private C15480j(int i, int[] iArr, C15482b... bVarArr) {
        this.f43925a = i;
        this.f43926b = iArr;
        this.f43927c = bVarArr;
        int b = bVarArr[0].mo42577b();
        int i2 = 0;
        for (C15481a aVar : bVarArr[0].mo42576a()) {
            i2 += aVar.mo42574a() * (aVar.mo42575b() + b);
        }
        this.f43928d = i2;
    }

    /* renamed from: b */
    private static C15480j[] m55987b() {
        return new C15480j[]{new C15480j(1, new int[0], new C15482b(7, new C15481a(1, 19)), new C15482b(10, new C15481a(1, 16)), new C15482b(13, new C15481a(1, 13)), new C15482b(17, new C15481a(1, 9))), new C15480j(2, new int[]{6, 18}, new C15482b(10, new C15481a(1, 34)), new C15482b(16, new C15481a(1, 28)), new C15482b(22, new C15481a(1, 22)), new C15482b(28, new C15481a(1, 16))), new C15480j(3, new int[]{6, 22}, new C15482b(15, new C15481a(1, 55)), new C15482b(26, new C15481a(1, 44)), new C15482b(18, new C15481a(2, 17)), new C15482b(22, new C15481a(2, 13))), new C15480j(4, new int[]{6, 26}, new C15482b(20, new C15481a(1, 80)), new C15482b(18, new C15481a(2, 32)), new C15482b(26, new C15481a(2, 24)), new C15482b(16, new C15481a(4, 9))), new C15480j(5, new int[]{6, 30}, new C15482b(26, new C15481a(1, 108)), new C15482b(24, new C15481a(2, 43)), new C15482b(18, new C15481a(2, 15), new C15481a(2, 16)), new C15482b(22, new C15481a(2, 11), new C15481a(2, 12))), new C15480j(6, new int[]{6, 34}, new C15482b(18, new C15481a(2, 68)), new C15482b(16, new C15481a(4, 27)), new C15482b(24, new C15481a(4, 19)), new C15482b(28, new C15481a(4, 15))), new C15480j(7, new int[]{6, 22, 38}, new C15482b(20, new C15481a(2, 78)), new C15482b(18, new C15481a(4, 31)), new C15482b(18, new C15481a(2, 14), new C15481a(4, 15)), new C15482b(26, new C15481a(4, 13), new C15481a(1, 14))), new C15480j(8, new int[]{6, 24, 42}, new C15482b(24, new C15481a(2, 97)), new C15482b(22, new C15481a(2, 38), new C15481a(2, 39)), new C15482b(22, new C15481a(4, 18), new C15481a(2, 19)), new C15482b(26, new C15481a(4, 14), new C15481a(2, 15))), new C15480j(9, new int[]{6, 26, 46}, new C15482b(30, new C15481a(2, 116)), new C15482b(22, new C15481a(3, 36), new C15481a(2, 37)), new C15482b(20, new C15481a(4, 16), new C15481a(4, 17)), new C15482b(24, new C15481a(4, 12), new C15481a(4, 13))), new C15480j(10, new int[]{6, 28, 50}, new C15482b(18, new C15481a(2, 68), new C15481a(2, 69)), new C15482b(26, new C15481a(4, 43), new C15481a(1, 44)), new C15482b(24, new C15481a(6, 19), new C15481a(2, 20)), new C15482b(28, new C15481a(6, 15), new C15481a(2, 16))), new C15480j(11, new int[]{6, 30, 54}, new C15482b(20, new C15481a(4, 81)), new C15482b(30, new C15481a(1, 50), new C15481a(4, 51)), new C15482b(28, new C15481a(4, 22), new C15481a(4, 23)), new C15482b(24, new C15481a(3, 12), new C15481a(8, 13))), new C15480j(12, new int[]{6, 32, 58}, new C15482b(24, new C15481a(2, 92), new C15481a(2, 93)), new C15482b(22, new C15481a(6, 36), new C15481a(2, 37)), new C15482b(26, new C15481a(4, 20), new C15481a(6, 21)), new C15482b(28, new C15481a(7, 14), new C15481a(4, 15))), new C15480j(13, new int[]{6, 34, 62}, new C15482b(26, new C15481a(4, 107)), new C15482b(22, new C15481a(8, 37), new C15481a(1, 38)), new C15482b(24, new C15481a(8, 20), new C15481a(4, 21)), new C15482b(22, new C15481a(12, 11), new C15481a(4, 12))), new C15480j(14, new int[]{6, 26, 46, 66}, new C15482b(30, new C15481a(3, 115), new C15481a(1, 116)), new C15482b(24, new C15481a(4, 40), new C15481a(5, 41)), new C15482b(20, new C15481a(11, 16), new C15481a(5, 17)), new C15482b(24, new C15481a(11, 12), new C15481a(5, 13))), new C15480j(15, new int[]{6, 26, 48, 70}, new C15482b(22, new C15481a(5, 87), new C15481a(1, 88)), new C15482b(24, new C15481a(5, 41), new C15481a(5, 42)), new C15482b(30, new C15481a(5, 24), new C15481a(7, 25)), new C15482b(24, new C15481a(11, 12), new C15481a(7, 13))), new C15480j(16, new int[]{6, 26, 50, 74}, new C15482b(24, new C15481a(5, 98), new C15481a(1, 99)), new C15482b(28, new C15481a(7, 45), new C15481a(3, 46)), new C15482b(24, new C15481a(15, 19), new C15481a(2, 20)), new C15482b(30, new C15481a(3, 15), new C15481a(13, 16))), new C15480j(17, new int[]{6, 30, 54, 78}, new C15482b(28, new C15481a(1, 107), new C15481a(5, 108)), new C15482b(28, new C15481a(10, 46), new C15481a(1, 47)), new C15482b(28, new C15481a(1, 22), new C15481a(15, 23)), new C15482b(28, new C15481a(2, 14), new C15481a(17, 15))), new C15480j(18, new int[]{6, 30, 56, 82}, new C15482b(30, new C15481a(5, 120), new C15481a(1, 121)), new C15482b(26, new C15481a(9, 43), new C15481a(4, 44)), new C15482b(28, new C15481a(17, 22), new C15481a(1, 23)), new C15482b(28, new C15481a(2, 14), new C15481a(19, 15))), new C15480j(19, new int[]{6, 30, 58, 86}, new C15482b(28, new C15481a(3, 113), new C15481a(4, 114)), new C15482b(26, new C15481a(3, 44), new C15481a(11, 45)), new C15482b(26, new C15481a(17, 21), new C15481a(4, 22)), new C15482b(26, new C15481a(9, 13), new C15481a(16, 14))), new C15480j(20, new int[]{6, 34, 62, 90}, new C15482b(28, new C15481a(3, 107), new C15481a(5, 108)), new C15482b(26, new C15481a(3, 41), new C15481a(13, 42)), new C15482b(30, new C15481a(15, 24), new C15481a(5, 25)), new C15482b(28, new C15481a(15, 15), new C15481a(10, 16))), new C15480j(21, new int[]{6, 28, 50, 72, 94}, new C15482b(28, new C15481a(4, 116), new C15481a(4, 117)), new C15482b(26, new C15481a(17, 42)), new C15482b(28, new C15481a(17, 22), new C15481a(6, 23)), new C15482b(30, new C15481a(19, 16), new C15481a(6, 17))), new C15480j(22, new int[]{6, 26, 50, 74, 98}, new C15482b(28, new C15481a(2, 111), new C15481a(7, 112)), new C15482b(28, new C15481a(17, 46)), new C15482b(30, new C15481a(7, 24), new C15481a(16, 25)), new C15482b(24, new C15481a(34, 13))), new C15480j(23, new int[]{6, 30, 54, 78, 102}, new C15482b(30, new C15481a(4, 121), new C15481a(5, 122)), new C15482b(28, new C15481a(4, 47), new C15481a(14, 48)), new C15482b(30, new C15481a(11, 24), new C15481a(14, 25)), new C15482b(30, new C15481a(16, 15), new C15481a(14, 16))), new C15480j(24, new int[]{6, 28, 54, 80, 106}, new C15482b(30, new C15481a(6, 117), new C15481a(4, 118)), new C15482b(28, new C15481a(6, 45), new C15481a(14, 46)), new C15482b(30, new C15481a(11, 24), new C15481a(16, 25)), new C15482b(30, new C15481a(30, 16), new C15481a(2, 17))), new C15480j(25, new int[]{6, 32, 58, 84, 110}, new C15482b(26, new C15481a(8, 106), new C15481a(4, 107)), new C15482b(28, new C15481a(8, 47), new C15481a(13, 48)), new C15482b(30, new C15481a(7, 24), new C15481a(22, 25)), new C15482b(30, new C15481a(22, 15), new C15481a(13, 16))), new C15480j(26, new int[]{6, 30, 58, 86, 114}, new C15482b(28, new C15481a(10, 114), new C15481a(2, 115)), new C15482b(28, new C15481a(19, 46), new C15481a(4, 47)), new C15482b(28, new C15481a(28, 22), new C15481a(6, 23)), new C15482b(30, new C15481a(33, 16), new C15481a(4, 17))), new C15480j(27, new int[]{6, 34, 62, 90, 118}, new C15482b(30, new C15481a(8, 122), new C15481a(4, 123)), new C15482b(28, new C15481a(22, 45), new C15481a(3, 46)), new C15482b(30, new C15481a(8, 23), new C15481a(26, 24)), new C15482b(30, new C15481a(12, 15), new C15481a(28, 16))), new C15480j(28, new int[]{6, 26, 50, 74, 98, 122}, new C15482b(30, new C15481a(3, 117), new C15481a(10, 118)), new C15482b(28, new C15481a(3, 45), new C15481a(23, 46)), new C15482b(30, new C15481a(4, 24), new C15481a(31, 25)), new C15482b(30, new C15481a(11, 15), new C15481a(31, 16))), new C15480j(29, new int[]{6, 30, 54, 78, 102, 126}, new C15482b(30, new C15481a(7, 116), new C15481a(7, 117)), new C15482b(28, new C15481a(21, 45), new C15481a(7, 46)), new C15482b(30, new C15481a(1, 23), new C15481a(37, 24)), new C15482b(30, new C15481a(19, 15), new C15481a(26, 16))), new C15480j(30, new int[]{6, 26, 52, 78, 104, 130}, new C15482b(30, new C15481a(5, 115), new C15481a(10, 116)), new C15482b(28, new C15481a(19, 47), new C15481a(10, 48)), new C15482b(30, new C15481a(15, 24), new C15481a(25, 25)), new C15482b(30, new C15481a(23, 15), new C15481a(25, 16))), new C15480j(31, new int[]{6, 30, 56, 82, 108, 134}, new C15482b(30, new C15481a(13, 115), new C15481a(3, 116)), new C15482b(28, new C15481a(2, 46), new C15481a(29, 47)), new C15482b(30, new C15481a(42, 24), new C15481a(1, 25)), new C15482b(30, new C15481a(23, 15), new C15481a(28, 16))), new C15480j(32, new int[]{6, 34, 60, 86, 112, 138}, new C15482b(30, new C15481a(17, 115)), new C15482b(28, new C15481a(10, 46), new C15481a(23, 47)), new C15482b(30, new C15481a(10, 24), new C15481a(35, 25)), new C15482b(30, new C15481a(19, 15), new C15481a(35, 16))), new C15480j(33, new int[]{6, 30, 58, 86, 114, 142}, new C15482b(30, new C15481a(17, 115), new C15481a(1, 116)), new C15482b(28, new C15481a(14, 46), new C15481a(21, 47)), new C15482b(30, new C15481a(29, 24), new C15481a(19, 25)), new C15482b(30, new C15481a(11, 15), new C15481a(46, 16))), new C15480j(34, new int[]{6, 34, 62, 90, 118, 146}, new C15482b(30, new C15481a(13, 115), new C15481a(6, 116)), new C15482b(28, new C15481a(14, 46), new C15481a(23, 47)), new C15482b(30, new C15481a(44, 24), new C15481a(7, 25)), new C15482b(30, new C15481a(59, 16), new C15481a(1, 17))), new C15480j(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C15482b(30, new C15481a(12, 121), new C15481a(7, 122)), new C15482b(28, new C15481a(12, 47), new C15481a(26, 48)), new C15482b(30, new C15481a(39, 24), new C15481a(14, 25)), new C15482b(30, new C15481a(22, 15), new C15481a(41, 16))), new C15480j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C15482b(30, new C15481a(6, 121), new C15481a(14, 122)), new C15482b(28, new C15481a(6, 47), new C15481a(34, 48)), new C15482b(30, new C15481a(46, 24), new C15481a(10, 25)), new C15482b(30, new C15481a(2, 15), new C15481a(64, 16))), new C15480j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C15482b(30, new C15481a(17, 122), new C15481a(4, 123)), new C15482b(28, new C15481a(29, 46), new C15481a(14, 47)), new C15482b(30, new C15481a(49, 24), new C15481a(10, 25)), new C15482b(30, new C15481a(24, 15), new C15481a(46, 16))), new C15480j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C15482b(30, new C15481a(4, 122), new C15481a(18, 123)), new C15482b(28, new C15481a(13, 46), new C15481a(32, 47)), new C15482b(30, new C15481a(48, 24), new C15481a(14, 25)), new C15482b(30, new C15481a(42, 15), new C15481a(32, 16))), new C15480j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C15482b(30, new C15481a(20, 117), new C15481a(4, 118)), new C15482b(28, new C15481a(40, 47), new C15481a(7, 48)), new C15482b(30, new C15481a(43, 24), new C15481a(22, 25)), new C15482b(30, new C15481a(10, 15), new C15481a(67, 16))), new C15480j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C15482b(30, new C15481a(19, 118), new C15481a(6, 119)), new C15482b(28, new C15481a(18, 47), new C15481a(31, 48)), new C15482b(30, new C15481a(34, 24), new C15481a(34, 25)), new C15482b(30, new C15481a(20, 15), new C15481a(61, 16)))};
    }

    /* renamed from: c */
    static C15480j m55988c(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = f43923e;
            if (i3 < iArr.length) {
                int i5 = iArr[i3];
                if (i5 == i) {
                    return m55990i(i3 + 7);
                }
                int e = C15477g.m55980e(i, i5);
                if (e < i2) {
                    i4 = i3 + 7;
                    i2 = e;
                }
                i3++;
            } else if (i2 <= 3) {
                return m55990i(i4);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C15480j m55989g(int i) {
        if (i % 4 == 1) {
            try {
                return m55990i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw FormatException.m23153a();
            }
        } else {
            throw FormatException.m23153a();
        }
    }

    /* renamed from: i */
    public static C15480j m55990i(int i) {
        if (i > 0 && i <= 40) {
            return f43924f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7508b mo42567a() {
        int e = mo42569e();
        C7508b bVar = new C7508b(e);
        bVar.mo21985o(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo21985o(i, 0, 8, 9);
        bVar.mo21985o(0, i, 9, 8);
        int length = this.f43926b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f43926b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo21985o(this.f43926b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo21985o(6, 9, 1, i5);
        bVar.mo21985o(9, 6, i5, 1);
        if (this.f43925a > 6) {
            int i6 = e - 11;
            bVar.mo21985o(i6, 0, 3, 6);
            bVar.mo21985o(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo42568d() {
        return this.f43926b;
    }

    /* renamed from: e */
    public int mo42569e() {
        return (this.f43925a * 4) + 17;
    }

    /* renamed from: f */
    public C15482b mo42570f(C15476f fVar) {
        return this.f43927c[fVar.ordinal()];
    }

    /* renamed from: h */
    public int mo42571h() {
        return this.f43928d;
    }

    /* renamed from: j */
    public int mo42572j() {
        return this.f43925a;
    }

    public String toString() {
        return String.valueOf(this.f43925a);
    }
}
