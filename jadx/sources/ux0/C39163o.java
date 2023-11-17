package ux0;

import by0.C31217a;
import ed1.C40749p;
import ee1.C40767b;
import java.util.List;
import jd1.C41407n;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import ue1.C43075l;

/* renamed from: ux0.o */
public final class C39163o {

    /* renamed from: a */
    private final C39162n f93351a;

    /* renamed from: b */
    private final PreferencesApiManager f93352b;

    /* renamed from: c */
    private final C40767b f93353c;

    /* renamed from: ux0.o$a */
    public static final class C39164a implements C41407n {

        /* renamed from: d */
        private final /* synthetic */ C43075l f93354d;

        public C39164a(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f93354d = lVar;
        }

        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.f93354d.invoke(obj)).booleanValue();
        }
    }

    public C39163o(C39162n nVar, PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f93351a = nVar;
        this.f93352b = preferencesApiManager;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ElementEvent>()");
        this.f93353c = h1;
    }

    /* renamed from: a */
    public final C40749p mo92812a() {
        return this.f93353c;
    }

    /* renamed from: b */
    public final C39162n mo92813b() {
        return this.f93351a;
    }

    /* renamed from: c */
    public final boolean mo92814c(boolean z) {
        boolean isPaymentMobilePermissionOffered = this.f93352b.isPaymentMobilePermissionOffered();
        if (z) {
            this.f93352b.setPaymentMobilePermissionOffered();
        }
        return isPaymentMobilePermissionOffered;
    }

    /* renamed from: d */
    public final void mo92815d(List list) {
        C41536l.m120489i(list, "formValues");
        C39162n nVar = this.f93351a;
        if (nVar != null) {
            nVar.mo80265w(list);
        }
    }

    /* renamed from: e */
    public final void mo92816e(C31217a aVar) {
        C41536l.m120489i(aVar, "elementEvent");
        this.f93353c.onNext(aVar);
    }
}
