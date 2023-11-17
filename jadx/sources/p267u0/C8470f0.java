package p267u0;

import ef1.C40845o1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me1.C41748d;
import me1.C41752f;
import ue1.C43079p;

/* renamed from: u0.f0 */
public final class C8470f0 implements C41752f.C41755b {

    /* renamed from: g */
    public static final C8471a f24068g = new C8471a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C40845o1 f24069d;

    /* renamed from: e */
    private final C41748d f24070e;

    /* renamed from: f */
    private final AtomicInteger f24071f = new AtomicInteger(0);

    /* renamed from: u0.f0$a */
    public static final class C8471a implements C41752f.C41757c {
        private C8471a() {
        }

        public /* synthetic */ C8471a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C8470f0(C40845o1 o1Var, C41748d dVar) {
        C41536l.m120489i(o1Var, "transactionThreadControlJob");
        C41536l.m120489i(dVar, "transactionDispatcher");
        this.f24069d = o1Var;
        this.f24070e = dVar;
    }

    /* renamed from: U */
    public Object mo23734U(Object obj, C43079p pVar) {
        return C41752f.C41755b.C41756a.m121040a(this, obj, pVar);
    }

    /* renamed from: b */
    public final void mo23735b() {
        this.f24071f.incrementAndGet();
    }

    /* renamed from: c */
    public C41752f.C41755b mo23736c(C41752f.C41757c cVar) {
        return C41752f.C41755b.C41756a.m121041b(this, cVar);
    }

    /* renamed from: e */
    public final C41748d mo23737e() {
        return this.f24070e;
    }

    /* renamed from: g */
    public final void mo23738g() {
        int decrementAndGet = this.f24071f.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        } else if (decrementAndGet == 0) {
            C40845o1.C40846a.m118414a(this.f24069d, (CancellationException) null, 1, (Object) null);
        }
    }

    public C41752f.C41757c getKey() {
        return f24068g;
    }

    /* renamed from: q */
    public C41752f mo23740q(C41752f.C41757c cVar) {
        return C41752f.C41755b.C41756a.m121042c(this, cVar);
    }

    /* renamed from: u */
    public C41752f mo23741u(C41752f fVar) {
        return C41752f.C41755b.C41756a.m121043d(this, fVar);
    }
}
