package p389de;

/* renamed from: de.d */
class C12081d {

    /* renamed from: a */
    private int f35517a;

    /* renamed from: b */
    private long f35518b;

    /* renamed from: c */
    private long f35519c;

    /* renamed from: d */
    private long f35520d;

    C12081d(int i) {
        this.f35517a = i;
    }

    /* renamed from: a */
    static long m44334a(long j, int i) {
        return (j * 1000) / ((long) i);
    }

    /* renamed from: b */
    static long m44335b(long j, int i) {
        return (j * 1000000) / ((long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo32240c(int i) {
        if (this.f35520d == 0) {
            return 0;
        }
        return (int) (this.f35520d / m44335b((long) i, this.f35517a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo32241d(long j) {
        return j - this.f35520d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo32242e(int i) {
        long j = (long) i;
        long b = m44335b(j, this.f35517a);
        long nanoTime = (System.nanoTime() / 1000) - b;
        long j2 = this.f35519c;
        if (j2 == 0) {
            this.f35518b = nanoTime;
        }
        long b2 = this.f35518b + m44335b(j2, this.f35517a);
        long j3 = nanoTime - b2;
        if (j3 >= b * 2) {
            this.f35518b = nanoTime;
            this.f35519c = j;
            this.f35520d = j3;
            return nanoTime;
        }
        this.f35520d = 0;
        this.f35519c += j;
        return b2;
    }
}
