package e41;

import ad1.C40281a;
import ba1.C10146d0;
import com.google.gson.C5494h;
import com.google.gson.Gson;
import hd1.C41205b;
import kd1.C41496a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: e41.b */
public final class C31658b {

    /* renamed from: b */
    public static final C31659a f78246b = new C31659a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C20292b f78247a;

    /* renamed from: e41.b$a */
    public static final class C31659a {
        private C31659a() {
        }

        public /* synthetic */ C31659a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C31658b(C20292b bVar) {
        C41536l.m120489i(bVar, "getAppSettingsByNameUseCase");
        this.f78247a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m93793c(C40281a aVar) {
        C41536l.m120489i(aVar, "$cancellable");
        aVar.cancel();
    }

    /* renamed from: d */
    private final boolean m93794d(String str) {
        C5494h b;
        C20557a a = this.f78247a.mo48774a("TMX_FORM_SETTINGS");
        if (!(a == null || (b = a.mo49085b()) == null)) {
            try {
                Object g = new Gson().mo18165g(b, TMXFlags.class);
                C41536l.m120488h(g, "{\n            Gson().fro…gs::class.java)\n        }");
                return C31662d.m93797a((TMXFlags) g, str);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C41205b mo72084b(String str) {
        C40281a aVar;
        C41536l.m120489i(str, "tmxFlagKey");
        if (m93794d(str)) {
            aVar = C10146d0.C10177h.m37233b();
        } else {
            aVar = C31660c.m93796a();
        }
        return new C41496a(new C31657a(aVar));
    }
}
