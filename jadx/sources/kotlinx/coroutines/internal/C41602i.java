package kotlinx.coroutines.internal;

import he1.C41225n;
import he1.C41228o;

/* renamed from: kotlinx.coroutines.internal.i */
public abstract class C41602i {

    /* renamed from: a */
    private static final boolean f97800a;

    static {
        Object obj;
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            obj = C41225n.m119478a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = C41225n.m119478a(C41228o.m119482a(th));
        }
        f97800a = C41225n.m119481d(obj);
    }

    /* renamed from: a */
    public static final boolean m120694a() {
        return f97800a;
    }
}
