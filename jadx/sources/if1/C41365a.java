package if1;

import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C41598g;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: if1.a */
public abstract class C41365a {
    /* renamed from: a */
    private static final void m120049a(Continuation continuation, Throwable th) {
        C41225n.C41226a aVar = C41225n.f97210d;
        continuation.mo94382h(C41225n.m119478a(C41228o.m119482a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m120050b(Continuation continuation, Continuation continuation2) {
        try {
            Continuation b = C41790c.m121154b(continuation);
            C41225n.C41226a aVar = C41225n.f97210d;
            C41598g.m120674c(b, C41225n.m119478a(C41238w.f97225a), (C43075l) null, 2, (Object) null);
        } catch (Throwable th) {
            m120049a(continuation2, th);
        }
    }

    /* renamed from: c */
    public static final void m120051c(C43079p pVar, Object obj, Continuation continuation, C43075l lVar) {
        try {
            Continuation b = C41790c.m121154b(C41790c.m121153a(pVar, obj, continuation));
            C41225n.C41226a aVar = C41225n.f97210d;
            C41598g.m120673b(b, C41225n.m119478a(C41238w.f97225a), lVar);
        } catch (Throwable th) {
            m120049a(continuation, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m120052d(C43079p pVar, Object obj, Continuation continuation, C43075l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        m120051c(pVar, obj, continuation, lVar);
    }
}
