package dx0;

import cx0.C31453a;
import cx0.C31456c;
import he1.C41224m;
import he1.C41233s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: dx0.b */
public final class C31614b {
    /* renamed from: a */
    private final C31456c m93724a(C31453a aVar, Map map) {
        return m93726c(map, aVar, (C31456c) null, 4, (Object) null);
    }

    /* renamed from: b */
    private static final C31456c m93725b(Map map, C31453a aVar, C31456c cVar) {
        Map map2;
        C31456c cVar2 = new C31456c(aVar, cVar);
        List<C31453a> list = (List) map.get(aVar.mo71836s());
        if (list != null) {
            map2 = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(list, 10)), 16));
            for (C31453a aVar2 : list) {
                C41224m a = C41233s.m119492a(Long.valueOf(aVar2.mo71827j()), m93725b(map, aVar2, cVar2));
                map2.put(a.mo95678e(), a.mo95680f());
            }
        } else {
            map2 = C41344r0.m119928j();
        }
        cVar2.mo71850a(map2);
        return cVar2;
    }

    /* renamed from: c */
    static /* synthetic */ C31456c m93726c(Map map, C31453a aVar, C31456c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = null;
        }
        return m93725b(map, aVar, cVar);
    }

    /* renamed from: d */
    public final C31456c mo72027d(List list) {
        C41536l.m120489i(list, "data");
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        C31453a aVar = null;
        while (it.hasNext()) {
            C31453a aVar2 = (C31453a) it.next();
            if (aVar2.mo71835r() != null) {
                String r = aVar2.mo71835r();
                Object obj = hashMap.get(r);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(r, obj);
                }
                ((List) obj).add(aVar2);
            } else if (aVar == null) {
                aVar = aVar2;
            } else {
                throw new IllegalStateException("Given payment tree has more than one root");
            }
        }
        if (aVar != null) {
            return m93724a(aVar, hashMap);
        }
        throw new IllegalStateException("Given payment tree doesn't have a root");
    }
}
