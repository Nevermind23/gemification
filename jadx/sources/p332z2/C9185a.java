package p332z2;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p204p2.C7664a;
import p204p2.C7671c;
import p217q2.C7841h;
import p217q2.C7842i;
import p243s2.C8140s;

/* renamed from: z2.a */
public final class C9185a {

    /* renamed from: a */
    private final Map f25534a = new HashMap();

    /* renamed from: b */
    private final Map f25535b = new HashMap();

    /* renamed from: c */
    private final Map f25536c = new HashMap();

    /* renamed from: d */
    private final Map f25537d = new HashMap();

    /* renamed from: e */
    private final AtomicInteger f25538e = new AtomicInteger();

    /* renamed from: a */
    private Set m33938a(Map map, C7841h hVar) {
        Set set;
        C8140s.m30754b(hVar, "operationName == null");
        synchronized (map) {
            Set set2 = (Set) map.get(hVar);
            if (set2 != null) {
                set = new HashSet(set2);
            } else {
                set = Collections.emptySet();
            }
        }
        return set;
    }

    /* renamed from: c */
    private void m33939c() {
        this.f25538e.decrementAndGet();
    }

    /* renamed from: d */
    private void m33940d(Map map, C7841h hVar, Object obj) {
        synchronized (map) {
            Set set = (Set) map.get(hVar);
            if (set == null) {
                set = new HashSet();
                map.put(hVar, set);
            }
            set.add(obj);
        }
    }

    /* renamed from: g */
    private void m33941g(Map map, C7841h hVar, Object obj) {
        synchronized (map) {
            Set set = (Set) map.get(hVar);
            if (set == null || !set.remove(obj)) {
                throw new AssertionError("Call wasn't registered before");
            } else if (set.isEmpty()) {
                map.remove(hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set mo24787b(C7841h hVar) {
        return m33938a(this.f25537d, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo24788e(C7664a aVar) {
        C8140s.m30754b(aVar, "call == null");
        if (aVar.mo22366a() instanceof C7842i) {
            mo24789f((C7671c) aVar);
            return;
        }
        throw new IllegalArgumentException("Unknown call type");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24789f(C7671c cVar) {
        C8140s.m30754b(cVar, "apolloQueryCall == null");
        m33940d(this.f25535b, cVar.mo22366a().name(), cVar);
        this.f25538e.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo24790h(C7664a aVar) {
        C8140s.m30754b(aVar, "call == null");
        if (aVar.mo22366a() instanceof C7842i) {
            mo24791i((C7671c) aVar);
            return;
        }
        throw new IllegalArgumentException("Unknown call type");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo24791i(C7671c cVar) {
        C8140s.m30754b(cVar, "apolloQueryCall == null");
        m33941g(this.f25535b, cVar.mo22366a().name(), cVar);
        m33939c();
    }
}
