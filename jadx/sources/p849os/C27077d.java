package p849os;

import ed1.C40744k;
import ed1.C40745l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p812kv.C25779b;

/* renamed from: os.d */
public final class C27077d implements C27074a {

    /* renamed from: d */
    private final LinkedHashMap f68013d = new LinkedHashMap();

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public static final void m83937b4(C27077d dVar, long j, C40745l lVar) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(lVar, "it");
        C25779b bVar = (C25779b) dVar.f68013d.get(Long.valueOf(j));
        if (bVar != null) {
            lVar.mo94965a(bVar);
        } else {
            lVar.onComplete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public static final void m83938c4(C27077d dVar, C40745l lVar) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(lVar, "it");
        if (!dVar.f68013d.isEmpty()) {
            Collection values = dVar.f68013d.values();
            C41536l.m120488h(values, "requestMap.values");
            lVar.mo94965a(C41358y.m120036z0(values));
            return;
        }
        lVar.onComplete();
    }

    /* renamed from: V3 */
    public C40744k mo66326V3(long j) {
        C40744k g = C40744k.m117997g(new C27075b(this, j));
        C41536l.m120488h(g, "create {\n            val…)\n            }\n        }");
        return g;
    }

    public void clean() {
        this.f68013d.clear();
    }

    public C40744k getAll() {
        C40744k g = C40744k.m117997g(new C27076c(this));
        C41536l.m120488h(g, "create {\n            if …)\n            }\n        }");
        return g;
    }

    /* renamed from: i3 */
    public void mo66328i3(List list) {
        C41536l.m120489i(list, "requests");
        this.f68013d.clear();
        LinkedHashMap linkedHashMap = this.f68013d;
        for (Object next : list) {
            linkedHashMap.put(Long.valueOf(((C25779b) next).mo64385e()), next);
        }
    }
}
