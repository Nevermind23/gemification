package p737dt;

import d50.C19909b;
import ed1.C40749p;
import ee1.C40767b;
import hd1.C41205b;
import jd1.C41399f;
import kotlin.jvm.internal.C41536l;

/* renamed from: dt.q */
public final class C20100q {

    /* renamed from: a */
    private final C40767b f54723a;

    public C20100q() {
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<TransactionPropertyUpdateEventType>()");
        this.f54723a = h1;
    }

    /* renamed from: a */
    public final C40749p mo48494a() {
        return this.f54723a;
    }

    /* renamed from: b */
    public final void mo48495b(C19909b bVar) {
        C41536l.m120489i(bVar, "eventType");
        this.f54723a.onNext(bVar);
    }

    /* renamed from: c */
    public final C41205b mo48496c(C41399f fVar) {
        C41536l.m120489i(fVar, "consumer");
        C41205b F0 = this.f54723a.mo94981F0(fVar);
        C41536l.m120488h(F0, "subject.subscribe(consumer)");
        return F0;
    }
}
