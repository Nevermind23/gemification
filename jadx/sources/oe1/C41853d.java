package oe1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import me1.C41748d;
import me1.C41752f;

/* renamed from: oe1.d */
public abstract class C41853d extends C41850a {

    /* renamed from: e */
    private final C41752f f98231e;

    /* renamed from: f */
    private transient Continuation f98232f;

    public C41853d(Continuation continuation, C41752f fVar) {
        super(continuation);
        this.f98231e = fVar;
    }

    /* renamed from: b */
    public C41752f mo94380b() {
        C41752f fVar = this.f98231e;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo96645k() {
        Continuation continuation = this.f98232f;
        if (!(continuation == null || continuation == this)) {
            C41752f.C41755b c = mo94380b().mo23736c(C41748d.f98026f3);
            C41536l.m120486f(c);
            ((C41748d) c).mo95146d(continuation);
        }
        this.f98232f = C41852c.f98230d;
    }

    /* renamed from: m */
    public final Continuation mo96648m() {
        Continuation continuation = this.f98232f;
        if (continuation == null) {
            C41748d dVar = (C41748d) mo94380b().mo23736c(C41748d.f98026f3);
            if (dVar == null || (continuation = dVar.mo95147f(this)) == null) {
                continuation = this;
            }
            this.f98232f = continuation;
        }
        return continuation;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C41853d(Continuation continuation) {
        this(continuation, continuation != null ? continuation.mo94380b() : null);
    }
}
