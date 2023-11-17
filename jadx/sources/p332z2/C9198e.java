package p332z2;

import p217q2.C7836g;
import p243s2.C8120m;
import p243s2.C8140s;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: z2.e */
public final class C9198e {

    /* renamed from: a */
    private final ConcurrentHashMap f25614a = new ConcurrentHashMap();

    /* renamed from: a */
    public C8120m mo24837a(C7836g gVar) {
        C8140s.m30754b(gVar, "operation == null");
        Class<?> cls = gVar.getClass();
        C8120m mVar = (C8120m) this.f25614a.get(cls);
        if (mVar != null) {
            return mVar;
        }
        this.f25614a.putIfAbsent(cls, gVar.responseFieldMapper());
        return (C8120m) this.f25614a.get(cls);
    }
}
