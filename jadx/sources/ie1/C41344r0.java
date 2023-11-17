package ie1;

import he1.C41224m;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.r0 */
abstract class C41344r0 extends C41342q0 {
    /* renamed from: j */
    public static Map m119928j() {
        C41307b0 b0Var = C41307b0.f97362d;
        C41536l.m120487g(b0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return b0Var;
    }

    /* renamed from: k */
    public static Object m119929k(Map map, Object obj) {
        C41536l.m120489i(map, "<this>");
        return C41340p0.m119901a(map, obj);
    }

    /* renamed from: l */
    public static HashMap m119930l(C41224m... mVarArr) {
        C41536l.m120489i(mVarArr, "pairs");
        HashMap hashMap = new HashMap(C41342q0.m119921f(mVarArr.length));
        m119938t(hashMap, mVarArr);
        return hashMap;
    }

    /* renamed from: m */
    public static Map m119931m(C41224m... mVarArr) {
        C41536l.m120489i(mVarArr, "pairs");
        if (mVarArr.length > 0) {
            return m119942x(mVarArr, new LinkedHashMap(C41342q0.m119921f(mVarArr.length)));
        }
        return m119928j();
    }

    /* renamed from: n */
    public static Map m119932n(Map map, Object obj) {
        C41536l.m120489i(map, "<this>");
        Map y = m119943y(map);
        y.remove(obj);
        return m119934p(y);
    }

    /* renamed from: o */
    public static Map m119933o(C41224m... mVarArr) {
        C41536l.m120489i(mVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C41342q0.m119921f(mVarArr.length));
        m119938t(linkedHashMap, mVarArr);
        return linkedHashMap;
    }

    /* renamed from: p */
    public static final Map m119934p(Map map) {
        C41536l.m120489i(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m119928j();
        }
        if (size != 1) {
            return map;
        }
        return C41342q0.m119923h(map);
    }

    /* renamed from: q */
    public static Map m119935q(Map map, C41224m mVar) {
        C41536l.m120489i(map, "<this>");
        C41536l.m120489i(mVar, "pair");
        if (map.isEmpty()) {
            return C41342q0.m119922g(mVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(mVar.mo95678e(), mVar.mo95680f());
        return linkedHashMap;
    }

    /* renamed from: r */
    public static Map m119936r(Map map, Map map2) {
        C41536l.m120489i(map, "<this>");
        C41536l.m120489i(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: s */
    public static final void m119937s(Map map, Iterable iterable) {
        C41536l.m120489i(map, "<this>");
        C41536l.m120489i(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C41224m mVar = (C41224m) it.next();
            map.put(mVar.mo95675a(), mVar.mo95676b());
        }
    }

    /* renamed from: t */
    public static final void m119938t(Map map, C41224m[] mVarArr) {
        C41536l.m120489i(map, "<this>");
        C41536l.m120489i(mVarArr, "pairs");
        for (C41224m mVar : mVarArr) {
            map.put(mVar.mo95675a(), mVar.mo95676b());
        }
    }

    /* renamed from: u */
    public static Map m119939u(Iterable iterable) {
        Object obj;
        C41536l.m120489i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m119934p(m119940v(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m119928j();
        }
        if (size != 1) {
            return m119940v(iterable, new LinkedHashMap(C41342q0.m119921f(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C41342q0.m119922g((C41224m) obj);
    }

    /* renamed from: v */
    public static final Map m119940v(Iterable iterable, Map map) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(map, "destination");
        m119937s(map, iterable);
        return map;
    }

    /* renamed from: w */
    public static Map m119941w(Map map) {
        C41536l.m120489i(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m119928j();
        }
        if (size != 1) {
            return m119943y(map);
        }
        return C41342q0.m119923h(map);
    }

    /* renamed from: x */
    public static final Map m119942x(C41224m[] mVarArr, Map map) {
        C41536l.m120489i(mVarArr, "<this>");
        C41536l.m120489i(map, "destination");
        m119938t(map, mVarArr);
        return map;
    }

    /* renamed from: y */
    public static Map m119943y(Map map) {
        C41536l.m120489i(map, "<this>");
        return new LinkedHashMap(map);
    }
}
