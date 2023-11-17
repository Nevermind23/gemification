package dd1;

import androidx.lifecycle.C1644x;
import ed1.C40734b;
import ed1.C40739f;
import kotlin.jvm.internal.C41536l;
import sa1.C28184k;

/* renamed from: dd1.o4 */
public final class C40574o4 {

    /* renamed from: a */
    private final C28184k f96185a;

    /* renamed from: b */
    private final C40536i4 f96186b;

    /* renamed from: c */
    private final C40597s0 f96187c;

    /* renamed from: d */
    private final C40535i3 f96188d;

    /* renamed from: e */
    private final C40614v f96189e;

    /* renamed from: dd1.o4$a */
    public final class C40575a extends Throwable {
        public C40575a() {
        }
    }

    public C40574o4(C28184k kVar, C40536i4 i4Var, C40597s0 s0Var, C40535i3 i3Var, C40614v vVar) {
        C41536l.m120489i(kVar, "appSettingsRepository");
        C41536l.m120489i(i4Var, "unwrapSettingsUseCase");
        C41536l.m120489i(s0Var, "getAuthTokenUseCase");
        C41536l.m120489i(i3Var, "registerDeviceUseCase");
        C41536l.m120489i(vVar, "isDeviceTrustedUseCase");
        this.f96185a = kVar;
        this.f96186b = i4Var;
        this.f96187c = s0Var;
        this.f96188d = i3Var;
        this.f96189e = vVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C40739f m117349c(C40574o4 o4Var, Throwable th) {
        C41536l.m120489i(o4Var, "this$0");
        C41536l.m120489i(th, "it");
        if (o4Var.f96188d.mo94571p()) {
            return C40734b.m117918i();
        }
        throw new C40575a();
    }

    /* renamed from: b */
    public final C40734b mo94595b(C1644x xVar) {
        C41536l.m120489i(xVar, "resetAuthTypes");
        C40734b d = this.f96186b.mo94572a().mo94895d(this.f96187c.mo94610b().mo94884C(new C40568n4(this))).mo94895d(this.f96188d.mo94570h(xVar)).mo94895d(this.f96189e.mo94622b()).mo94895d(this.f96185a.mo67684c());
        C41536l.m120488h(d, "unwrapSettingsUseCase()\n…ository.updateSettings())");
        return d;
    }
}
