package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import ef1.C40839n;
import he1.C41225n;
import he1.C41228o;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
public final class C1556xfdb59cc4 implements C1606m {

    /* renamed from: d */
    final /* synthetic */ C1593j.C1598b f4550d;

    /* renamed from: e */
    final /* synthetic */ C1593j f4551e;

    /* renamed from: f */
    final /* synthetic */ C40839n f4552f;

    /* renamed from: g */
    final /* synthetic */ C43064a f4553g;

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        Object obj;
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        if (aVar == C1593j.C1594a.Companion.mo4913c(this.f4550d)) {
            this.f4551e.mo4909d(this);
            C40839n nVar = this.f4552f;
            C43064a aVar2 = this.f4553g;
            try {
                C41225n.C41226a aVar3 = C41225n.f97210d;
                obj = C41225n.m119478a(aVar2.invoke());
            } catch (Throwable th) {
                C41225n.C41226a aVar4 = C41225n.f97210d;
                obj = C41225n.m119478a(C41228o.m119482a(th));
            }
            nVar.mo94382h(obj);
        } else if (aVar == C1593j.C1594a.ON_DESTROY) {
            this.f4551e.mo4909d(this);
            C40839n nVar2 = this.f4552f;
            C41225n.C41226a aVar5 = C41225n.f97210d;
            nVar2.mo94382h(C41225n.m119478a(C41228o.m119482a(new LifecycleDestroyedException())));
        }
    }
}
