package ie1;

import he1.C41224m;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import je1.C41412d;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.q0 */
abstract class C41342q0 extends C41340p0 {
    /* renamed from: c */
    public static Map m119918c(Map map) {
        C41536l.m120489i(map, "builder");
        return ((C41412d) map).mo96099l();
    }

    /* renamed from: d */
    public static Map m119919d() {
        return new C41412d();
    }

    /* renamed from: e */
    public static Map m119920e(int i) {
        return new C41412d(i);
    }

    /* renamed from: f */
    public static int m119921f(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: g */
    public static Map m119922g(C41224m mVar) {
        C41536l.m120489i(mVar, "pair");
        Map singletonMap = Collections.singletonMap(mVar.mo95678e(), mVar.mo95680f());
        C41536l.m120488h(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: h */
    public static final Map m119923h(Map map) {
        C41536l.m120489i(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C41536l.m120488h(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: i */
    public static SortedMap m119924i(Map map) {
        C41536l.m120489i(map, "<this>");
        return new TreeMap(map);
    }
}
