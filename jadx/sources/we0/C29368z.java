package we0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: we0.z */
public final class C29368z {

    /* renamed from: b */
    public static final C29369a f74452b = new C29369a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C20292b f74453a;

    /* renamed from: we0.z$a */
    public static final class C29369a {
        private C29369a() {
        }

        public /* synthetic */ C29369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C29368z(C20292b bVar) {
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        this.f74453a = bVar;
    }

    /* renamed from: a */
    public final boolean mo69216a() {
        C20557a a = this.f74453a.mo48774a("IS_GT_TRADING_ALLOWED_ON_CLOSED_MARKET");
        if (a != null) {
            return C41536l.m120484d(a.mo49087d(), "Y");
        }
        return false;
    }
}
