package p342j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p342j$.util.C9371P;

/* renamed from: j$.util.stream.f */
abstract class C9649f extends CountedCompleter {

    /* renamed from: g */
    static final int f26374g = (ForkJoinPool.getCommonPoolParallelism() << 2);

    /* renamed from: a */
    protected final C9735w0 f26375a;

    /* renamed from: b */
    protected C9371P f26376b;

    /* renamed from: c */
    protected long f26377c;

    /* renamed from: d */
    protected C9649f f26378d;

    /* renamed from: e */
    protected C9649f f26379e;

    /* renamed from: f */
    private Object f26380f;

    protected C9649f(C9649f fVar, C9371P p) {
        super(fVar);
        this.f26376b = p;
        this.f26375a = fVar.f26375a;
        this.f26377c = fVar.f26377c;
    }

    protected C9649f(C9735w0 w0Var, C9371P p) {
        super((CountedCompleter) null);
        this.f26375a = w0Var;
        this.f26376b = p;
        this.f26377c = 0;
    }

    /* renamed from: f */
    public static long m35495f(long j) {
        long j2 = j / ((long) f26374g);
        if (j2 > 0) {
            return j2;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo25896a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo26041b() {
        return this.f26380f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C9649f mo26050c() {
        return (C9649f) getCompleter();
    }

    public void compute() {
        C9371P trySplit;
        C9371P p = this.f26376b;
        long estimateSize = p.estimateSize();
        long j = this.f26377c;
        if (j == 0) {
            j = m35495f(estimateSize);
            this.f26377c = j;
        }
        boolean z = false;
        C9649f fVar = this;
        while (estimateSize > j && (trySplit = p.trySplit()) != null) {
            C9649f d = fVar.mo25897d(trySplit);
            fVar.f26378d = d;
            C9649f d2 = fVar.mo25897d(p);
            fVar.f26379e = d2;
            fVar.setPendingCount(1);
            if (z) {
                p = trySplit;
                fVar = d;
                d = d2;
            } else {
                fVar = d2;
            }
            z = !z;
            d.fork();
            estimateSize = p.estimateSize();
        }
        fVar.mo26043e(fVar.mo25896a());
        fVar.tryComplete();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C9649f mo25897d(C9371P p);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo26043e(Object obj) {
        this.f26380f = obj;
    }

    public Object getRawResult() {
        return this.f26380f;
    }

    public void onCompletion(CountedCompleter countedCompleter) {
        this.f26376b = null;
        this.f26379e = null;
        this.f26378d = null;
    }

    /* access modifiers changed from: protected */
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
