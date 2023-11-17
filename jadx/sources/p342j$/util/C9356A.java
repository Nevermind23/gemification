package p342j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: j$.util.A */
final class C9356A extends C9386c0 {

    /* renamed from: f */
    final /* synthetic */ SortedSet f25921f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9356A(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f25921f = sortedSet;
    }

    public final Comparator getComparator() {
        return this.f25921f.comparator();
    }
}
