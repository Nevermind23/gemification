package p342j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p342j$.util.C9371P;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.util.stream.U */
final class C9600U extends CountedCompleter {

    /* renamed from: h */
    public static final /* synthetic */ int f26282h = 0;

    /* renamed from: a */
    private final C9735w0 f26283a;

    /* renamed from: b */
    private C9371P f26284b;

    /* renamed from: c */
    private final long f26285c;

    /* renamed from: d */
    private final ConcurrentHashMap f26286d;

    /* renamed from: e */
    private final C9657g2 f26287e;

    /* renamed from: f */
    private final C9600U f26288f;

    /* renamed from: g */
    private C9539F0 f26289g;

    C9600U(C9600U u, C9371P p, C9600U u2) {
        super(u);
        this.f26283a = u.f26283a;
        this.f26284b = p;
        this.f26285c = u.f26285c;
        this.f26286d = u.f26286d;
        this.f26287e = u.f26287e;
        this.f26288f = u2;
    }

    protected C9600U(C9735w0 w0Var, C9371P p, C9657g2 g2Var) {
        super((CountedCompleter) null);
        this.f26283a = w0Var;
        this.f26284b = p;
        this.f26285c = C9649f.m35495f(p.estimateSize());
        this.f26286d = new ConcurrentHashMap(Math.max(16, C9649f.f26374g << 1));
        this.f26287e = g2Var;
        this.f26288f = null;
    }

    public final void compute() {
        C9371P trySplit;
        C9371P p = this.f26284b;
        long j = this.f26285c;
        boolean z = false;
        C9600U u = this;
        while (p.estimateSize() > j && (trySplit = p.trySplit()) != null) {
            C9600U u2 = new C9600U(u, trySplit, u.f26288f);
            C9600U u3 = new C9600U(u, p, u2);
            u.addToPendingCount(1);
            u3.addToPendingCount(1);
            u.f26286d.put(u2, u3);
            if (u.f26288f != null) {
                u2.addToPendingCount(1);
                if (u.f26286d.replace(u.f26288f, u, u2)) {
                    u.addToPendingCount(-1);
                } else {
                    u2.addToPendingCount(-1);
                }
            }
            if (z) {
                p = trySplit;
                u = u2;
                u2 = u3;
            } else {
                u = u3;
            }
            z = !z;
            u2.fork();
        }
        if (u.getPendingCount() > 0) {
            C9629b bVar = new C9629b(15);
            C9735w0 w0Var = u.f26283a;
            C9514A0 r1 = w0Var.mo25730r1(w0Var.mo26034a1(p), bVar);
            u.f26283a.mo26037w1(p, r1);
            u.f26289g = r1.mo25682b();
            u.f26284b = null;
        }
        u.tryComplete();
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C9539F0 f0 = this.f26289g;
        if (f0 != null) {
            f0.mo25794a(this.f26287e);
            this.f26289g = null;
        } else {
            C9371P p = this.f26284b;
            if (p != null) {
                this.f26283a.mo26037w1(p, this.f26287e);
                this.f26284b = null;
            }
        }
        C9600U u = (C9600U) this.f26286d.remove(this);
        if (u != null) {
            u.tryComplete();
        }
    }
}
