package ie1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.x */
abstract class C41356x extends C41354w {
    /* renamed from: J */
    public static List m119982J(Iterable iterable, Class cls) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(cls, "klass");
        return (List) m119983K(iterable, new ArrayList(), cls);
    }

    /* renamed from: K */
    public static final Collection m119983K(Iterable iterable, Collection collection, Class cls) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(collection, "destination");
        C41536l.m120489i(cls, "klass");
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                collection.add(next);
            }
        }
        return collection;
    }

    /* renamed from: L */
    public static final void m119984L(List list) {
        C41536l.m120489i(list, "<this>");
        Collections.reverse(list);
    }
}
