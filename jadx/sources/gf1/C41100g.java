package gf1;

import ef1.C40777a;
import ef1.C40871v1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobCancellationException;
import me1.C41752f;

/* renamed from: gf1.g */
public abstract class C41100g extends C40777a implements C41098f {

    /* renamed from: f */
    private final C41098f f97024f;

    public C41100g(C41752f fVar, C41098f fVar2, boolean z, boolean z2) {
        super(fVar, z, z2);
        this.f97024f = fVar2;
    }

    /* renamed from: A */
    public Object mo95514A(Object obj, Continuation continuation) {
        return this.f97024f.mo95514A(obj, continuation);
    }

    /* renamed from: J */
    public void mo95234J(Throwable th) {
        CancellationException D0 = C40871v1.m118480D0(this, th, (String) null, 1, (Object) null);
        this.f97024f.mo95504a(D0);
        mo95232H(D0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public final C41098f mo95534O0() {
        return this.f97024f;
    }

    /* renamed from: a */
    public final void mo95211a(CancellationException cancellationException) {
        if (!mo95238h0()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(mo95127M(), (Throwable) null, this);
            }
            mo95234J(cancellationException);
        }
    }

    /* renamed from: j */
    public Object mo95505j(Continuation continuation) {
        Object j = this.f97024f.mo95505j(continuation);
        Object unused = C41793d.m121157c();
        return j;
    }

    /* renamed from: z */
    public boolean mo95527z(Throwable th) {
        return this.f97024f.mo95527z(th);
    }
}
