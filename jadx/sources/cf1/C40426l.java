package cf1;

/* renamed from: cf1.l */
public enum C40426l {
    IGNORE_CASE(2, 0, 2, (int) null),
    MULTILINE(8, 0, 2, (int) null),
    LITERAL(16, 0, 2, (int) null),
    UNIX_LINES(1, 0, 2, (int) null),
    COMMENTS(4, 0, 2, (int) null),
    DOT_MATCHES_ALL(32, 0, 2, (int) null),
    CANON_EQ(128, 0, 2, (int) null);
    

    /* renamed from: d */
    private final int f96034d;

    /* renamed from: e */
    private final int f96035e;

    private C40426l(int i, int i2) {
        this.f96034d = i;
        this.f96035e = i2;
    }

    /* renamed from: b */
    public int mo94498b() {
        return this.f96034d;
    }
}
