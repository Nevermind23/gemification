package hd1;

import kd1.C41499d;
import ld1.C41669a;
import ld1.C41692b;

/* renamed from: hd1.c */
public abstract class C41206c {
    /* renamed from: a */
    public static C41205b m119453a() {
        return C41499d.INSTANCE;
    }

    /* renamed from: b */
    public static C41205b m119454b() {
        return m119455c(C41669a.f97936b);
    }

    /* renamed from: c */
    public static C41205b m119455c(Runnable runnable) {
        C41692b.m120934e(runnable, "run is null");
        return new C41208e(runnable);
    }
}
