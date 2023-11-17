package ie1;

import java.util.AbstractList;
import java.util.List;
import ve1.C43154d;

/* renamed from: ie1.e */
public abstract class C41316e extends AbstractList implements List, C43154d {
    protected C41316e() {
    }

    /* renamed from: b */
    public abstract int mo95898b();

    /* renamed from: c */
    public abstract Object mo95899c(int i);

    public final /* bridge */ Object remove(int i) {
        return mo95899c(i);
    }

    public final /* bridge */ int size() {
        return mo95898b();
    }
}
