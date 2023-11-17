package q11;

import ee1.C40767b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.DarkModeType;

/* renamed from: q11.h */
public final class C38108h {

    /* renamed from: a */
    private final PreferencesApiManager f91520a;

    /* renamed from: b */
    private final C40767b f91521b;

    public C38108h(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f91520a = preferencesApiManager;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<DarkModeType>()");
        this.f91521b = h1;
    }

    /* renamed from: a */
    public final C40767b mo91532a() {
        return this.f91521b;
    }

    /* renamed from: b */
    public final void mo91533b(DarkModeType darkModeType) {
        C41536l.m120489i(darkModeType, "mode");
        this.f91520a.setDarkModeType(darkModeType);
        this.f91521b.onNext(darkModeType);
    }
}
