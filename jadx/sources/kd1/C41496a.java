package kd1;

import ae1.C40293a;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41398e;

/* renamed from: kd1.a */
public final class C41496a extends AtomicReference implements C41205b {
    private static final long serialVersionUID = 5718521705281392066L;

    public C41496a(C41398e eVar) {
        super(eVar);
    }

    public void dispose() {
        C41398e eVar;
        if (get() != null && (eVar = (C41398e) getAndSet((Object) null)) != null) {
            try {
                eVar.cancel();
            } catch (Exception e) {
                C41300a.m119661b(e);
                C40293a.m116722s(e);
            }
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }
}
