package ie1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import je1.C41409b;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.p */
abstract class C41339p {
    /* renamed from: a */
    public static List m119896a(List list) {
        C41536l.m120489i(list, "builder");
        return ((C41409b) list).mo96070v();
    }

    /* renamed from: b */
    public static final Object[] m119897b(Object[] objArr, boolean z) {
        C41536l.m120489i(objArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z && C41536l.m120484d(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        C41536l.m120488h(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: c */
    public static List m119898c() {
        return new C41409b();
    }

    /* renamed from: d */
    public static List m119899d(int i) {
        return new C41409b(i);
    }

    /* renamed from: e */
    public static List m119900e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C41536l.m120488h(singletonList, "singletonList(element)");
        return singletonList;
    }
}
