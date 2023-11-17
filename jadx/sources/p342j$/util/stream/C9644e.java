package p342j$.util.stream;

/* renamed from: j$.util.stream.e */
abstract class C9644e {

    /* renamed from: a */
    protected final int f26365a;

    /* renamed from: b */
    protected int f26366b;

    /* renamed from: c */
    protected int f26367c;

    /* renamed from: d */
    protected long[] f26368d;

    protected C9644e() {
        this.f26365a = 4;
    }

    protected C9644e(int i) {
        if (i >= 0) {
            this.f26365a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i);
    }

    public abstract void clear();

    public final long count() {
        int i = this.f26367c;
        return i == 0 ? (long) this.f26366b : this.f26368d[i] + ((long) this.f26366b);
    }
}
