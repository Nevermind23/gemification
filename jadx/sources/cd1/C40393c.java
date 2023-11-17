package cd1;

import ad1.C40281a;
import ad1.C40283c;
import ba1.C10146d0;
import com.google.gson.Gson;
import dd1.C40545k1;
import hd1.C41205b;
import kd1.C41496a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;

/* renamed from: cd1.c */
public final class C40393c {

    /* renamed from: b */
    public static final C40394a f95977b = new C40394a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C40545k1 f95978a;

    /* renamed from: cd1.c$a */
    public static final class C40394a {
        private C40394a() {
        }

        public /* synthetic */ C40394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C40393c(C40545k1 k1Var) {
        C41536l.m120489i(k1Var, "getSettingUseCase");
        this.f95978a = k1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m116963c(C40281a aVar) {
        C41536l.m120489i(aVar, "$cancellable");
        aVar.cancel();
    }

    /* renamed from: d */
    private final boolean m116964d(String str) {
        String a = this.f95978a.mo94579a("TMX_FORM_SETTINGS");
        if (a == null) {
            return false;
        }
        try {
            Object l = new Gson().mo18170l(a, TMXFlags.class);
            C41536l.m120488h(l, "{\n            Gson().fro…gs::class.java)\n        }");
            return C40283c.m116682a((TMXFlags) l, str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final C41205b mo94454b(String str) {
        C40281a aVar;
        C41536l.m120489i(str, "tmxFlagKey");
        if (m116964d(str)) {
            aVar = C10146d0.C10177h.m37233b();
        } else {
            aVar = C40395d.m116966a();
        }
        return new C41496a(new C40392b(aVar));
    }
}
