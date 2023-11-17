package mi0;

import androidx.recyclerview.widget.C1796h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import mj0.C26241e;
import pi0.C27534a;

/* renamed from: mi0.c */
public final class C26236c extends C1796h.C1802f {

    /* renamed from: a */
    private final List f66427a;

    public C26236c(List list) {
        C41536l.m120489i(list, "items");
        this.f66427a = list;
    }

    /* renamed from: g */
    private final C1796h.C1802f m82039g(C27534a aVar) {
        Object obj;
        C1796h.C1802f c;
        Iterator it = this.f66427a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C26241e) obj).mo47490d(aVar)) {
                break;
            }
        }
        C26241e eVar = (C26241e) obj;
        if (eVar != null && (c = eVar.mo47489c()) != null) {
            return c;
        }
        throw new IllegalStateException(("DiffUtil not found for " + aVar).toString());
    }

    /* renamed from: d */
    public boolean mo5976a(C27534a aVar, C27534a aVar2) {
        C41536l.m120489i(aVar, "oldItem");
        C41536l.m120489i(aVar2, "newItem");
        if (aVar.getClass() != aVar2.getClass()) {
            return false;
        }
        return m82039g(aVar).mo5976a(aVar, aVar2);
    }

    /* renamed from: e */
    public boolean mo5977b(C27534a aVar, C27534a aVar2) {
        C41536l.m120489i(aVar, "oldItem");
        C41536l.m120489i(aVar2, "newItem");
        if (aVar.getClass() != aVar2.getClass()) {
            return false;
        }
        return m82039g(aVar).mo5977b(aVar, aVar2);
    }

    /* renamed from: f */
    public Object mo5978c(C27534a aVar, C27534a aVar2) {
        C41536l.m120489i(aVar, "oldItem");
        C41536l.m120489i(aVar2, "newItem");
        if (aVar.getClass() != aVar2.getClass()) {
            return Boolean.FALSE;
        }
        return m82039g(aVar).mo5978c(aVar, aVar2);
    }
}
