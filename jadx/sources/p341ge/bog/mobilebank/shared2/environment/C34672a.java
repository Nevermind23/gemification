package p341ge.bog.mobilebank.shared2.environment;

import e51.C31663a;
import he1.C41233s;
import i41.C36347a;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared2.environment.a */
public final class C34672a {
    /* renamed from: a */
    public final C34676e mo84655a() {
        return new C34676e(C41344r0.m119931m(C41233s.m119492a(EnvironmentType.PRODUCTION, C36347a.f87725c), C41233s.m119492a(EnvironmentType.PRE_PRODUCTION, C36347a.f87724b), C41233s.m119492a(EnvironmentType.TEST, C36347a.f87727e), C41233s.m119492a(EnvironmentType.X8_TEST, C36347a.f87728f), C41233s.m119492a(EnvironmentType.DEVELOPMENT, C36347a.f87723a), C41233s.m119492a(EnvironmentType.STAGING, C36347a.f87726d)));
    }

    /* renamed from: b */
    public final TargetEnvironment mo84656b(C31663a aVar, C34676e eVar) {
        C41536l.m120489i(aVar, "appPreferences");
        C41536l.m120489i(eVar, "environments");
        EnvironmentType d = aVar.mo72089d();
        if (d == null) {
            d = C34673b.f83817a;
        }
        return new TargetEnvironment(d, (Map) C41344r0.m119929k(eVar, d));
    }
}
