package oe1;

import kotlin.coroutines.Continuation;
import me1.C41752f;
import me1.C41758g;

/* renamed from: oe1.j */
public abstract class C41860j extends C41850a {
    public C41860j(Continuation continuation) {
        super(continuation);
        boolean z;
        if (continuation != null) {
            if (continuation.mo94380b() == C41758g.f98029d) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    /* renamed from: b */
    public C41752f mo94380b() {
        return C41758g.f98029d;
    }
}
