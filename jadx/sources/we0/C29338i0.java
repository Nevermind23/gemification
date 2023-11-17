package we0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p748eu.C20292b;
import p758fu.C20557a;
import t70.C28323a;

/* renamed from: we0.i0 */
public final class C29338i0 {

    /* renamed from: c */
    public static final C29339a f74419c = new C29339a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C20292b f74420a;

    /* renamed from: b */
    private final PreferencesApiManager f74421b;

    /* renamed from: we0.i0$a */
    public static final class C29339a {
        private C29339a() {
        }

        public /* synthetic */ C29339a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C29338i0(C20292b bVar, PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f74420a = bVar;
        this.f74421b = preferencesApiManager;
    }

    /* renamed from: a */
    public final UtmParamsEntity mo69193a() {
        Long l;
        Double c;
        UtmParamsEntity utmParams = this.f74421b.getUtmParams();
        C20557a b = this.f74420a.mo48775b("UTM_PARAMETER_EXPIRATION_IN_HOURS");
        if (b == null || (c = b.mo49086c()) == null) {
            l = null;
        } else {
            l = Long.valueOf((long) c.doubleValue());
        }
        if (!C28323a.m86959a(utmParams, l)) {
            return null;
        }
        return utmParams;
    }
}
