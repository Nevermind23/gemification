package ie1;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: ie1.p0 */
abstract class C41340p0 {
    /* renamed from: a */
    public static Object m119901a(Map map, Object obj) {
        C41536l.m120489i(map, "<this>");
        if (map instanceof C41334m0) {
            return ((C41334m0) map).mo95960k(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* renamed from: b */
    public static Map m119902b(Map map, C43075l lVar) {
        C41536l.m120489i(map, "<this>");
        C41536l.m120489i(lVar, "defaultValue");
        if (map instanceof C41334m0) {
            return m119902b(((C41334m0) map).mo95959g(), lVar);
        }
        return new C41336n0(map, lVar);
    }
}
