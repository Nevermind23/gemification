package kotlinx.coroutines.flow;

import androidx.concurrent.futures.C0611b;
import ef1.C40843o;
import he1.C41225n;
import he1.C41238w;
import hf1.C41241b;
import hf1.C41242c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import oe1.C41857h;

/* renamed from: kotlinx.coroutines.flow.u */
final class C41582u extends C41242c {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f97769a = AtomicReferenceFieldUpdater.newUpdater(C41582u.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean mo95705a(C41579s sVar) {
        if (this._state != null) {
            return false;
        }
        this._state = C41581t.f97767a;
        return true;
    }

    /* renamed from: d */
    public final Object mo96347d(Continuation continuation) {
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95193C();
        if (!C0611b.m2366a(f97769a, this, C41581t.f97767a, oVar)) {
            C41225n.C41226a aVar = C41225n.f97210d;
            oVar.mo94382h(C41225n.m119478a(C41238w.f97225a));
        }
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        if (x == C41793d.m121157c()) {
            return x;
        }
        return C41238w.f97225a;
    }

    /* renamed from: e */
    public Continuation[] mo95706b(C41579s sVar) {
        this._state = null;
        return C41241b.f97231a;
    }

    /* renamed from: f */
    public final void mo96349f() {
        while (true) {
            Object obj = this._state;
            if (obj != null && obj != C41581t.f97768b) {
                if (obj == C41581t.f97767a) {
                    if (C0611b.m2366a(f97769a, this, obj, C41581t.f97768b)) {
                        return;
                    }
                } else if (C0611b.m2366a(f97769a, this, obj, C41581t.f97767a)) {
                    C41225n.C41226a aVar = C41225n.f97210d;
                    ((C40843o) obj).mo94382h(C41225n.m119478a(C41238w.f97225a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo96350g() {
        Object andSet = f97769a.getAndSet(this, C41581t.f97767a);
        C41536l.m120486f(andSet);
        if (andSet == C41581t.f97768b) {
            return true;
        }
        return false;
    }
}
