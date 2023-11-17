package q11;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.DarkModeType;

/* renamed from: q11.b */
public final class C38102b {

    /* renamed from: a */
    private final PreferencesApiManager f91513a;

    public C38102b(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f91513a = preferencesApiManager;
    }

    /* renamed from: a */
    public final DarkModeType mo91528a() {
        DarkModeType darkModeType = this.f91513a.getDarkModeType();
        C41536l.m120488h(darkModeType, "preferencesApiManager.darkModeType");
        return darkModeType;
    }
}
