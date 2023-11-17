package dd1;

import ba1.C10146d0;
import ed1.C40734b;
import he1.C41225n;
import he1.C41228o;
import kotlin.jvm.internal.C41536l;
import qa1.C27714f;

/* renamed from: dd1.g2 */
public final class C40521g2 {

    /* renamed from: a */
    private final C27714f f96110a;

    public C40521g2(C27714f fVar) {
        C41536l.m120489i(fVar, "loginRepository");
        this.f96110a = fVar;
    }

    /* renamed from: a */
    public final C40734b mo94560a() {
        Object obj;
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
            if (processReference$sso_client_release != null) {
                obj = C41225n.m119478a(this.f96110a.mo67285x(processReference$sso_client_release).mo94882A());
                if (C41225n.m119479b(obj) != null) {
                    obj = C40734b.m117918i();
                }
                C41536l.m120488h(obj, "runCatching {\n          …able.complete()\n        }");
                return (C40734b) obj;
            }
            throw new IllegalArgumentException("Invalid processReference".toString());
        } catch (Throwable th) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = C41225n.m119478a(C41228o.m119482a(th));
        }
    }
}
