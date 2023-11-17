package p342j$.util;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import p342j$.util.function.Consumer;
import p342j$.util.stream.Stream;

/* renamed from: j$.util.Collection$-EL  reason: invalid class name */
public final /* synthetic */ class Collection$EL {
    /* renamed from: a */
    public static void m34569a(Collection collection, Consumer consumer) {
        if (collection instanceof C9383b) {
            ((C9383b) collection).mo24915a(consumer);
            return;
        }
        consumer.getClass();
        for (Object accept : collection) {
            consumer.accept(accept);
        }
    }

    /* renamed from: b */
    public static C9371P m34570b(Collection collection) {
        if (collection instanceof C9383b) {
            return ((C9383b) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            linkedHashSet.getClass();
            return new C9386c0(linkedHashSet, 17);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C9356A(sortedSet, sortedSet);
        } else if (collection instanceof Set) {
            Set set = (Set) collection;
            set.getClass();
            return new C9386c0(set, 1);
        } else if (collection instanceof List) {
            List list = (List) collection;
            list.getClass();
            return new C9386c0(list, 16);
        } else {
            collection.getClass();
            return new C9386c0(collection, 0);
        }
    }

    public static /* synthetic */ Stream stream(Collection collection) {
        return collection instanceof C9383b ? ((C9383b) collection).stream() : C9381a.m34655o(collection);
    }
}
