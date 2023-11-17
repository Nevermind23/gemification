package kotlinx.coroutines.internal;

import ef1.C40883y1;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: kotlinx.coroutines.internal.t */
public abstract class C41620t {

    /* renamed from: a */
    private static final boolean f97830a = true;

    /* renamed from: a */
    private static final C41621u m120755a(Throwable th, String str) {
        if (f97830a) {
            return new C41621u(th, str);
        }
        if (th != null) {
            throw th;
        }
        m120758d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    static /* synthetic */ C41621u m120756b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m120755a(th, str);
    }

    /* renamed from: c */
    public static final boolean m120757c(C40883y1 y1Var) {
        return y1Var.mo95277Q() instanceof C41621u;
    }

    /* renamed from: d */
    public static final Void m120758d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final C40883y1 m120759e(C41618r rVar, List list) {
        try {
            return rVar.mo95334b(list);
        } catch (Throwable th) {
            return m120755a(th, rVar.mo95333a());
        }
    }
}
