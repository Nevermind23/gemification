package he1;

import he1.C41225n;
import kotlin.jvm.internal.C41536l;

/* renamed from: he1.o */
public abstract class C41228o {
    /* renamed from: a */
    public static final Object m119482a(Throwable th) {
        C41536l.m120489i(th, "exception");
        return new C41225n.C41227b(th);
    }

    /* renamed from: b */
    public static final void m119483b(Object obj) {
        if (obj instanceof C41225n.C41227b) {
            throw ((C41225n.C41227b) obj).f97211d;
        }
    }
}
