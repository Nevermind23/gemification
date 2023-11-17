package androidx.lifecycle;

import ef1.C40820i2;
import ef1.C40845o1;
import ef1.C40867u0;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.o */
public abstract class C1614o {
    /* renamed from: a */
    public static final C1600k m5661a(C1593j jVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C41536l.m120489i(jVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) jVar.mo4908c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(jVar, C40820i2.m118314b((C40845o1) null, 1, (Object) null).mo23741u(C40867u0.m118469c().mo95277Q()));
        } while (!C1612n.m5659a(jVar.mo4908c(), (Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.mo4810f();
        return lifecycleCoroutineScopeImpl;
    }
}
