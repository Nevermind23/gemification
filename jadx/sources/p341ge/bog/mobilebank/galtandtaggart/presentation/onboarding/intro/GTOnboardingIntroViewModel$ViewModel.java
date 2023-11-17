package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro;

import androidx.lifecycle.C1644x;
import bg0.C19378a;
import bg0.C19381d;
import bg0.C19382e;
import g31.C32054a;
import g41.C32081a;
import hd1.C41204a;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p380ck.C10463g;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroViewModel$ViewModel */
public final class GTOnboardingIntroViewModel$ViewModel extends C21481a implements C19381d, C19382e {

    /* renamed from: d */
    private final C20292b f61588d;

    /* renamed from: e */
    private final C19381d f61589e = this;

    /* renamed from: f */
    private final C19382e f61590f = this;

    /* renamed from: g */
    private final C1644x f61591g = new C1644x(m76331dw());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTOnboardingIntroViewModel$ViewModel(C20292b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        this.f61588d = bVar;
    }

    /* renamed from: dw */
    private final List m76331dw() {
        StringSource stringSource;
        String d;
        C20557a b = this.f61588d.mo48775b("GT_BOG_INVESTMENTS_URL");
        if (b == null || (d = b.mo49087d()) == null || (stringSource = C34646b.m101748b(d, new Object[0])) == null) {
            stringSource = C34646b.m101749c("");
        }
        return C19378a.f53611a.mo47600a(stringSource);
    }

    /* renamed from: G1 */
    public void mo47602G1() {
        C32054a.C32076v vVar = C32054a.C32076v.f78917f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(vVar, F, " ", " ");
    }

    /* renamed from: ew */
    public final C19381d mo60484ew() {
        return this.f61589e;
    }

    /* renamed from: fw */
    public C1644x mo47603n3() {
        return this.f61591g;
    }

    /* renamed from: gw */
    public final C19382e mo60486gw() {
        return this.f61590f;
    }
}
