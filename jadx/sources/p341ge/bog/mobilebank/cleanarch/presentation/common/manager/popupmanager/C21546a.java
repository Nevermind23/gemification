package p341ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager;

import ed1.C40749p;
import ee1.C40767b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.a */
public final class C21546a {

    /* renamed from: a */
    private final C40767b f57627a;

    /* renamed from: b */
    private final C40767b f57628b;

    public C21546a() {
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<PopupManager.DialogID>()");
        this.f57627a = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Boolean>()");
        this.f57628b = h12;
    }

    /* renamed from: a */
    public final C40749p mo53859a() {
        C40749p c0 = this.f57627a.mo95017c0();
        C41536l.m120488h(c0, "dismissSubject.hide()");
        return c0;
    }

    /* renamed from: b */
    public final C40749p mo53860b() {
        C40749p c0 = this.f57628b.mo95017c0();
        C41536l.m120488h(c0, "hideSubject.hide()");
        return c0;
    }

    /* renamed from: c */
    public final void mo53861c(PopupManager.C21539b bVar) {
        C41536l.m120489i(bVar, "id");
        this.f57627a.onNext(bVar);
    }

    /* renamed from: d */
    public final void mo53862d(boolean z) {
        this.f57628b.onNext(Boolean.valueOf(z));
    }
}
