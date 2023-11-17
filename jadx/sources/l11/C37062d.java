package l11;

import ed1.C40734b;
import j31.C36725a;
import kotlin.jvm.internal.C41536l;
import m11.C37202b;
import o11.C37585a;

/* renamed from: l11.d */
public final class C37062d {

    /* renamed from: a */
    private final C37585a f89213a;

    /* renamed from: b */
    private final C37060b f89214b;

    public C37062d(C37585a aVar, C37060b bVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(bVar, "savePreLoginBackground");
        this.f89213a = aVar;
        this.f89214b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m109586c(C37062d dVar, C36725a aVar) {
        C37202b bVar;
        C41536l.m120489i(dVar, "this$0");
        C37060b bVar2 = dVar.f89214b;
        if (aVar != null) {
            bVar = new C37202b(String.valueOf(aVar.mo89541d()), aVar.mo89542e(), aVar.mo89540c());
        } else {
            bVar = null;
        }
        bVar2.mo89977a(bVar);
    }

    /* renamed from: b */
    public final C40734b mo89978b(C36725a aVar) {
        C40734b o = this.f89213a.mo89053c3(aVar != null ? aVar.mo89540c() : null).mo94902o(new C37061c(this, aVar));
        C41536l.m120488h(o, "repository.setPreLoginIm…\n            })\n        }");
        return o;
    }
}
