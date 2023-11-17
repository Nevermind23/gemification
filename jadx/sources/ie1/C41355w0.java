package ie1;

import java.util.Collections;
import java.util.Set;
import je1.C41426j;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.w0 */
abstract class C41355w0 {
    /* renamed from: a */
    public static Set m119978a(Set set) {
        C41536l.m120489i(set, "builder");
        return ((C41426j) set).mo96165c();
    }

    /* renamed from: b */
    public static Set m119979b() {
        return new C41426j();
    }

    /* renamed from: c */
    public static Set m119980c(int i) {
        return new C41426j(i);
    }

    /* renamed from: d */
    public static Set m119981d(Object obj) {
        Set singleton = Collections.singleton(obj);
        C41536l.m120488h(singleton, "singleton(element)");
        return singleton;
    }
}
