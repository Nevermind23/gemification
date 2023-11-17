package if1;

import ef1.C40877w1;
import ef1.C40881y;
import he1.C41225n;
import he1.C41228o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C41592e0;
import kotlinx.coroutines.internal.C41627z;
import me1.C41752f;
import oe1.C41857h;
import ue1.C43079p;

/* renamed from: if1.b */
public abstract class C41366b {
    /* renamed from: a */
    public static final void m120053a(C43079p pVar, Object obj, Continuation continuation) {
        C41752f b;
        Object c;
        Continuation a = C41857h.m121273a(continuation);
        try {
            b = continuation.mo94380b();
            c = C41592e0.m120649c(b, (Object) null);
            Object invoke = ((C43079p) C41527d0.m120459f(pVar, 2)).invoke(obj, a);
            C41592e0.m120647a(b, c);
            if (invoke != C41793d.m121157c()) {
                a.mo94382h(C41225n.m119478a(invoke));
            }
        } catch (Throwable th) {
            C41225n.C41226a aVar = C41225n.f97210d;
            a.mo94382h(C41225n.m119478a(C41228o.m119482a(th)));
        }
    }

    /* renamed from: b */
    public static final Object m120054b(C41627z zVar, Object obj, C43079p pVar) {
        Object obj2;
        try {
            obj2 = ((C43079p) C41527d0.m120459f(pVar, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            obj2 = new C40881y(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj2 == C41793d.m121157c()) {
            return C41793d.m121157c();
        }
        Object n0 = zVar.mo95240n0(obj2);
        if (n0 == C40877w1.f96588b) {
            return C41793d.m121157c();
        }
        if (!(n0 instanceof C40881y)) {
            return C40877w1.m118569h(n0);
        }
        throw ((C40881y) n0).f96602a;
    }
}
