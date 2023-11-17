package p212pa;

/* renamed from: pa.k */
public enum C7789k {
    TERABYTES(1099511627776L) {
    },
    GIGABYTES(1073741824) {
    },
    MEGABYTES(1048576) {
    },
    KILOBYTES(1024) {
    },
    BYTES(1) {
    };
    

    /* renamed from: d */
    long f22518d;

    /* renamed from: a */
    public long mo22550a(long j) {
        return (j * this.f22518d) / KILOBYTES.f22518d;
    }

    private C7789k(long j) {
        this.f22518d = j;
    }
}
