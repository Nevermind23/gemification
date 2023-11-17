package p640vf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: vf.e */
public final class C18330e {

    /* renamed from: a */
    private final List f51779a;

    private C18330e(int i) {
        this.f51779a = new ArrayList(i);
    }

    /* renamed from: c */
    public static C18330e m62678c(int i) {
        return new C18330e(i);
    }

    /* renamed from: a */
    public C18330e mo46102a(Object obj) {
        this.f51779a.add(C18329d.m62676c(obj, "Set contributions cannot be null"));
        return this;
    }

    /* renamed from: b */
    public Set mo46103b() {
        if (this.f51779a.isEmpty()) {
            return Collections.emptySet();
        }
        if (this.f51779a.size() == 1) {
            return Collections.singleton(this.f51779a.get(0));
        }
        return Collections.unmodifiableSet(new HashSet(this.f51779a));
    }
}
