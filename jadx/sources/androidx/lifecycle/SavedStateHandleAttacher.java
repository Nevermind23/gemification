package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import kotlin.jvm.internal.C41536l;

public final class SavedStateHandleAttacher implements C1606m {

    /* renamed from: d */
    private final C1589h0 f4546d;

    public SavedStateHandleAttacher(C1589h0 h0Var) {
        C41536l.m120489i(h0Var, "provider");
        this.f4546d = h0Var;
    }

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        boolean z;
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        if (aVar == C1593j.C1594a.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            qVar.getLifecycle().mo4909d(this);
            this.f4546d.mo4903d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
