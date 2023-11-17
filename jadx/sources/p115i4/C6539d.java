package p115i4;

import android.content.Context;
import com.facebook.C2626d;
import java.util.HashMap;
import java.util.Set;
import p297w4.C8765a;

/* renamed from: i4.d */
class C6539d {

    /* renamed from: a */
    private final HashMap f19979a = new HashMap();

    /* renamed from: e */
    private synchronized C6568o m25817e(C6530a aVar) {
        C6568o oVar;
        oVar = (C6568o) this.f19979a.get(aVar);
        if (oVar == null) {
            Context e = C2626d.m10134e();
            oVar = new C6568o(C8765a.m32617h(e), C6549g.m25845c(e));
        }
        this.f19979a.put(aVar, oVar);
        return oVar;
    }

    /* renamed from: a */
    public synchronized void mo20518a(C6530a aVar, C6535c cVar) {
        m25817e(aVar).mo20558a(cVar);
    }

    /* renamed from: b */
    public synchronized void mo20519b(C6565n nVar) {
        if (nVar != null) {
            for (C6530a aVar : nVar.mo20557c()) {
                C6568o e = m25817e(aVar);
                for (C6535c a : nVar.mo20556b(aVar)) {
                    e.mo20558a(a);
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized C6568o mo20520c(C6530a aVar) {
        return (C6568o) this.f19979a.get(aVar);
    }

    /* renamed from: d */
    public synchronized int mo20521d() {
        int i;
        i = 0;
        for (C6568o c : this.f19979a.values()) {
            i += c.mo20560c();
        }
        return i;
    }

    /* renamed from: f */
    public synchronized Set mo20522f() {
        return this.f19979a.keySet();
    }
}
