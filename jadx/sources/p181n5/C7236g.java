package p181n5;

/* renamed from: n5.g */
public abstract class C7236g {

    /* renamed from: n5.g$a */
    public enum C7237a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static C7236g m27826a() {
        return new C7230b(C7237a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C7236g m27827d() {
        return new C7230b(C7237a.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static C7236g m27828e(long j) {
        return new C7230b(C7237a.OK, j);
    }

    /* renamed from: f */
    public static C7236g m27829f() {
        return new C7230b(C7237a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo21598b();

    /* renamed from: c */
    public abstract C7237a mo21599c();
}
