package p342j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p342j$.util.C9371P;
import p342j$.util.concurrent.ConcurrentHashMap;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.r */
final class C9709r extends C9610W1 {
    C9709r(C9634c cVar, int i) {
        super(cVar, i);
    }

    /* renamed from: P1 */
    static C9558J0 m35718P1(C9634c cVar, C9371P p) {
        C9566L0 l0 = new C9566L0(14);
        C9566L0 l02 = new C9566L0(15);
        return new C9558J0((Collection) new C9736w1(C9611W2.REFERENCE, new C9566L0(16), l02, l0, 3).mo25752X(cVar, p));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public final C9539F0 mo25684H1(C9371P p, C9431J j, C9634c cVar) {
        if (C9607V2.DISTINCT.mo26013f(cVar.mo26036g1())) {
            return cVar.mo26039y1(p, false, j);
        }
        if (C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return m35718P1(cVar, p);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new C9592S(new C9694o(0, atomicBoolean, concurrentHashMap), false).mo25752X(cVar, p);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add((Object) null);
            keySet = hashSet;
        }
        return new C9558J0(keySet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public final C9371P mo26029I1(C9634c cVar, C9371P p) {
        return C9607V2.DISTINCT.mo26013f(cVar.mo26036g1()) ? cVar.mo26031O1(p) : C9607V2.ORDERED.mo26013f(cVar.mo26036g1()) ? m35718P1(cVar, p).spliterator() : new C9648e3(cVar.mo26031O1(p));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        g2Var.getClass();
        return C9607V2.DISTINCT.mo26013f(i) ? g2Var : C9607V2.SORTED.mo26013f(i) ? new C9699p(g2Var) : new C9704q(this, g2Var);
    }
}
