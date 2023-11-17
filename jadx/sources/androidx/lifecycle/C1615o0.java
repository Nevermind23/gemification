package androidx.lifecycle;

import ef1.C40814h0;
import ef1.C40820i2;
import ef1.C40845o1;
import ef1.C40867u0;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.o0 */
public abstract class C1615o0 {
    /* renamed from: a */
    public static final C40814h0 m5662a(C1613n0 n0Var) {
        C41536l.m120489i(n0Var, "<this>");
        C40814h0 h0Var = (C40814h0) n0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (h0Var != null) {
            return h0Var;
        }
        Object tagIfAbsent = n0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C1571d(C40820i2.m118314b((C40845o1) null, 1, (Object) null).mo23741u(C40867u0.m118469c().mo95277Q())));
        C41536l.m120488h(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (C40814h0) tagIfAbsent;
    }
}
