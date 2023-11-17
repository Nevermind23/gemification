package p640vf;

import java.util.Collections;
import java.util.Map;

/* renamed from: vf.c */
public final class C18328c {

    /* renamed from: a */
    private final Map f51778a;

    private C18328c(int i) {
        this.f51778a = C18326a.m62668b(i);
    }

    /* renamed from: b */
    public static C18328c m62671b(int i) {
        return new C18328c(i);
    }

    /* renamed from: a */
    public Map mo46100a() {
        if (this.f51778a.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.f51778a);
    }

    /* renamed from: c */
    public C18328c mo46101c(Object obj, Object obj2) {
        this.f51778a.put(obj, obj2);
        return this;
    }
}
