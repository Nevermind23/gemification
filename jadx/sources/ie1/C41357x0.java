package ie1;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.x0 */
abstract class C41357x0 extends C41355w0 {
    /* renamed from: e */
    public static Set m119985e() {
        return C41313c0.f97370d;
    }

    /* renamed from: f */
    public static LinkedHashSet m119986f(Object... objArr) {
        C41536l.m120489i(objArr, "elements");
        return (LinkedHashSet) C41333m.m119787N(objArr, new LinkedHashSet(C41342q0.m119921f(objArr.length)));
    }

    /* renamed from: g */
    public static Set m119987g(Object... objArr) {
        C41536l.m120489i(objArr, "elements");
        return (Set) C41333m.m119787N(objArr, new LinkedHashSet(C41342q0.m119921f(objArr.length)));
    }

    /* renamed from: h */
    public static final Set m119988h(Set set) {
        C41536l.m120489i(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return m119985e();
        }
        if (size != 1) {
            return set;
        }
        return C41355w0.m119981d(set.iterator().next());
    }

    /* renamed from: i */
    public static Set m119989i(Object... objArr) {
        C41536l.m120489i(objArr, "elements");
        if (objArr.length > 0) {
            return C41333m.m119791R(objArr);
        }
        return m119985e();
    }
}
