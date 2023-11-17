package p725cr;

import kotlin.jvm.internal.C41536l;
import l41.C37071a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;

/* renamed from: cr.a */
public abstract class C19788a extends C19791d {

    /* renamed from: G */
    public C37071a f54160G;

    /* renamed from: d2 */
    public final C37071a mo48074d2() {
        C37071a aVar = this.f54160G;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("errorHandler");
        return null;
    }

    public void handleError(C21503d.C21504a aVar) {
        C41536l.m120489i(aVar, "response");
        handleError(aVar.mo53706f());
    }

    public void handleError(Throwable th) {
        mo48074d2().mo48350a(th);
    }
}
