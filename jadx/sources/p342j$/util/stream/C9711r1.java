package p342j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p342j$.util.C9371P;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.r1 */
abstract class C9711r1 extends CountedCompleter implements C9657g2 {

    /* renamed from: a */
    protected final C9371P f26465a;

    /* renamed from: b */
    protected final C9735w0 f26466b;

    /* renamed from: c */
    protected final long f26467c;

    /* renamed from: d */
    protected long f26468d;

    /* renamed from: e */
    protected long f26469e;

    /* renamed from: f */
    protected int f26470f;

    /* renamed from: g */
    protected int f26471g;

    C9711r1(int i, C9371P p, C9735w0 w0Var) {
        this.f26465a = p;
        this.f26466b = w0Var;
        this.f26467c = C9649f.m35495f(p.estimateSize());
        this.f26468d = 0;
        this.f26469e = (long) i;
    }

    C9711r1(C9711r1 r1Var, C9371P p, long j, long j2, int i) {
        super(r1Var);
        this.f26465a = p;
        this.f26466b = r1Var.f26466b;
        this.f26467c = r1Var.f26467c;
        this.f26468d = j;
        this.f26469e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= ((long) i)) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", new Object[]{Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)}));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C9711r1 mo26160a(C9371P p, long j, long j2);

    public /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void compute() {
        C9371P trySplit;
        C9371P p = this.f26465a;
        C9711r1 r1Var = this;
        while (p.estimateSize() > r1Var.f26467c && (trySplit = p.trySplit()) != null) {
            r1Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            r1Var.mo26160a(trySplit, r1Var.f26468d, estimateSize).fork();
            r1Var = r1Var.mo26160a(p, r1Var.f26468d + estimateSize, r1Var.f26469e - estimateSize);
        }
        r1Var.f26466b.mo26037w1(p, r1Var);
        r1Var.propagateCompletion();
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        long j2 = this.f26469e;
        if (j <= j2) {
            int i = (int) this.f26468d;
            this.f26470f = i;
            this.f26471g = i + ((int) j2);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
