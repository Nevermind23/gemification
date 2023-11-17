package gf1;

import ef1.C40796d1;
import java.util.concurrent.CancellationException;

/* renamed from: gf1.k */
abstract /* synthetic */ class C41107k {
    /* renamed from: a */
    public static final void m119161a(C41115s sVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C40796d1.m118280a("Channel was consumed, consumer had failed", th);
            }
        }
        sVar.mo95504a(cancellationException);
    }
}
