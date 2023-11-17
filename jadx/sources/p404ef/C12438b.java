package p404ef;

/* renamed from: ef.b */
public final class C12438b implements C12437a {

    /* renamed from: a */
    private final long f37106a;

    /* renamed from: b */
    private final long f37107b;

    public C12438b(long j, long j2) {
        boolean z;
        this.f37106a = j;
        this.f37107b = j2;
        boolean z2 = true;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(j2 <= 0 ? false : z2)) {
                throw new IllegalArgumentException(("maxDurationMillis, " + j2 + ", must be positive").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("initialDurationMillis, " + j + ", must be positive").toString());
    }

    /* renamed from: a */
    public long mo33049a(int i) {
        return (long) Math.min((double) this.f37107b, ((double) this.f37106a) * Math.pow(2.0d, (double) i));
    }
}
