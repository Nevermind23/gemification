package kotlinx.coroutines.scheduling;

import ef1.C40793d0;
import ef1.C40801e1;
import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.C41586b0;
import me1.C41752f;
import me1.C41758g;

/* renamed from: kotlinx.coroutines.scheduling.b */
public final class C41633b extends C40801e1 implements Executor {

    /* renamed from: g */
    public static final C41633b f97865g = new C41633b();

    /* renamed from: h */
    private static final C40793d0 f97866h = C41644m.f97885f.mo95151y(C41590d0.m120644d("kotlinx.coroutines.io.parallelism", C43429k.m124585d(64, C41586b0.m120625a()), 0, 0, 12, (Object) null));

    private C41633b() {
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        mo95148h(C41758g.f98029d, runnable);
    }

    /* renamed from: h */
    public void mo95148h(C41752f fVar, Runnable runnable) {
        f97866h.mo95148h(fVar, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
