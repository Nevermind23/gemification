package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.j1 */
class C0457j1 {

    /* renamed from: a */
    private int f2137a = 0;

    /* renamed from: b */
    private int f2138b = 0;

    /* renamed from: c */
    private int f2139c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2140d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2141e = 0;

    /* renamed from: f */
    private int f2142f = 0;

    /* renamed from: g */
    private boolean f2143g = false;

    /* renamed from: h */
    private boolean f2144h = false;

    C0457j1() {
    }

    /* renamed from: a */
    public int mo2175a() {
        return this.f2143g ? this.f2137a : this.f2138b;
    }

    /* renamed from: b */
    public int mo2176b() {
        return this.f2137a;
    }

    /* renamed from: c */
    public int mo2177c() {
        return this.f2138b;
    }

    /* renamed from: d */
    public int mo2178d() {
        return this.f2143g ? this.f2138b : this.f2137a;
    }

    /* renamed from: e */
    public void mo2179e(int i, int i2) {
        this.f2144h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2141e = i;
            this.f2137a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2142f = i2;
            this.f2138b = i2;
        }
    }

    /* renamed from: f */
    public void mo2180f(boolean z) {
        if (z != this.f2143g) {
            this.f2143g = z;
            if (!this.f2144h) {
                this.f2137a = this.f2141e;
                this.f2138b = this.f2142f;
            } else if (z) {
                int i = this.f2140d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f2141e;
                }
                this.f2137a = i;
                int i2 = this.f2139c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f2142f;
                }
                this.f2138b = i2;
            } else {
                int i3 = this.f2139c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f2141e;
                }
                this.f2137a = i3;
                int i4 = this.f2140d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f2142f;
                }
                this.f2138b = i4;
            }
        }
    }

    /* renamed from: g */
    public void mo2181g(int i, int i2) {
        this.f2139c = i;
        this.f2140d = i2;
        this.f2144h = true;
        if (this.f2143g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2137a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2138b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2137a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2138b = i2;
        }
    }
}
