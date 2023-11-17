package p391dg;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import ge1.C41084a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p163m0.C7047a;

/* renamed from: dg.q */
public final class C12127q implements C1620q0.C1624b {

    /* renamed from: a */
    private final Map f35630a;

    public C12127q(Map map) {
        C41536l.m120489i(map, "creators");
        this.f35630a = map;
    }

    /* renamed from: a */
    public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
        return C1630r0.m5685b(this, cls, aVar);
    }

    /* renamed from: b */
    public C1613n0 mo4804b(Class cls) {
        C41536l.m120489i(cls, "modelClass");
        C41084a aVar = (C41084a) this.f35630a.get(cls);
        if (aVar == null) {
            Iterator it = this.f35630a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                C41084a aVar2 = (C41084a) entry.getValue();
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar != null) {
            try {
                Object obj = aVar.get();
                if (obj != null) {
                    return (C1613n0) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type T of ge.bog.chat.di.ViewModelFactory.create");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("unknown model class " + cls);
        }
    }
}
