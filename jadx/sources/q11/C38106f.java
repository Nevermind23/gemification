package q11;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import v41.C39200a;

/* renamed from: q11.f */
public final class C38106f implements C39200a {

    /* renamed from: a */
    private final PreferencesApiManager f91517a;

    public C38106f(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferences");
        this.f91517a = preferencesApiManager;
    }

    public boolean invoke() {
        return this.f91517a.isHttpRequestsLoggingEnabled();
    }
}
