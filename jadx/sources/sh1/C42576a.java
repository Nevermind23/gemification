package sh1;

import af1.C40296c;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p342j$.util.concurrent.ConcurrentHashMap;
import te1.C42994a;

/* renamed from: sh1.a */
public abstract class C42576a {

    /* renamed from: a */
    private static final Map f100185a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final String m123264a(C40296c cVar) {
        C41536l.m120489i(cVar, "$this$getFullName");
        String str = (String) f100185a.get(cVar);
        if (str != null) {
            return str;
        }
        return m123265b(cVar);
    }

    /* renamed from: b */
    public static final String m123265b(C40296c cVar) {
        C41536l.m120489i(cVar, "$this$saveCache");
        String name = C42994a.m123348a(cVar).getName();
        Map map = f100185a;
        C41536l.m120488h(name, "name");
        map.put(cVar, name);
        return name;
    }
}
