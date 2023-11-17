package p801ju;

import ba1.C10146d0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p653wf.C18582k;

/* renamed from: ju.b */
public final class C25486b implements C18582k {

    /* renamed from: a */
    private final PreferencesApiManager f65150a;

    public C25486b(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f65150a = preferencesApiManager;
    }

    /* renamed from: a */
    public String mo46432a() {
        return this.f65150a.getFcmToken();
    }

    /* renamed from: b */
    public String mo46433b() {
        DeviceIdentifier g = C10146d0.C10148b.m37109g();
        if (g != null) {
            return g.getExtCustomerId();
        }
        return null;
    }
}
