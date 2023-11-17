package p342j$.util.stream;

/* renamed from: j$.util.stream.H0 */
abstract class C9549H0 implements C9539F0 {

    /* renamed from: a */
    protected final C9539F0 f26210a;

    /* renamed from: b */
    protected final C9539F0 f26211b;

    /* renamed from: c */
    private final long f26212c;

    C9549H0(C9539F0 f0, C9539F0 f02) {
        this.f26210a = f0;
        this.f26211b = f02;
        this.f26212c = f0.count() + f02.count();
    }

    /* renamed from: c */
    public final C9539F0 m35018c(int i) {
        if (i == 0) {
            return this.f26210a;
        }
        if (i == 1) {
            return this.f26211b;
        }
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return this.f26212c;
    }

    /* renamed from: t */
    public final int mo25797t() {
        return 2;
    }
}
