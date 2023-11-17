package p443hc;

/* renamed from: hc.g */
final class C15477g {

    /* renamed from: c */
    private static final int[][] f43906c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final C15476f f43907a;

    /* renamed from: b */
    private final byte f43908b;

    private C15477g(int i) {
        this.f43907a = C15476f.m55976a((i >> 3) & 3);
        this.f43908b = (byte) (i & 7);
    }

    /* renamed from: a */
    static C15477g m55978a(int i, int i2) {
        C15477g b = m55979b(i, i2);
        if (b != null) {
            return b;
        }
        return m55979b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C15477g m55979b(int i, int i2) {
        int e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : f43906c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C15477g(iArr[1]);
            }
            int e2 = m55980e(i, i5);
            if (e2 < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
            if (i != i2 && (e = m55980e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C15477g(i4);
        }
        return null;
    }

    /* renamed from: e */
    static int m55980e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo42560c() {
        return this.f43908b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C15476f mo42561d() {
        return this.f43907a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C15477g)) {
            return false;
        }
        C15477g gVar = (C15477g) obj;
        if (this.f43907a == gVar.f43907a && this.f43908b == gVar.f43908b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f43907a.ordinal() << 3) | this.f43908b;
    }
}
