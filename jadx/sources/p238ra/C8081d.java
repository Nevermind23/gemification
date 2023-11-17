package p238ra;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ra.d */
public class C8081d {

    /* renamed from: b */
    private static volatile C8081d f23243b;

    /* renamed from: a */
    private final Set f23244a = new HashSet();

    C8081d() {
    }

    /* renamed from: a */
    public static C8081d m30608a() {
        C8081d dVar = f23243b;
        if (dVar == null) {
            synchronized (C8081d.class) {
                dVar = f23243b;
                if (dVar == null) {
                    dVar = new C8081d();
                    f23243b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set mo23266b() {
        Set unmodifiableSet;
        synchronized (this.f23244a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f23244a);
        }
        return unmodifiableSet;
    }
}
