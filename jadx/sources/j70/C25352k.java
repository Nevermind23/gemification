package j70;

import ed1.C40749p;
import ee1.C40767b;
import he1.C41238w;
import k70.C25679c;
import kotlin.jvm.internal.C41536l;

/* renamed from: j70.k */
public final class C25352k implements C25351j {

    /* renamed from: a */
    private final C25679c f64995a;

    /* renamed from: b */
    private final C40767b f64996b;

    public C25352k(C25679c cVar) {
        C41536l.m120489i(cVar, "refreshAllProducts");
        this.f64995a = cVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f64996b = h1;
    }

    /* renamed from: a */
    public final C40749p mo63917a() {
        C40749p c0 = this.f64996b.mo95017c0();
        C41536l.m120488h(c0, "reloadSubject.hide()");
        return c0;
    }

    public void invoke() {
        this.f64996b.onNext(C41238w.f97225a);
        this.f64995a.mo64183a();
    }
}
