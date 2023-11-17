package sa1;

import ed1.C40734b;
import ed1.C40739f;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35934b;

/* renamed from: sa1.m */
public final class C28186m implements C28184k {

    /* renamed from: a */
    private final C28172a f71532a;

    /* renamed from: b */
    private final C28181h f71533b;

    public C28186m(C28172a aVar, C28181h hVar) {
        C41536l.m120489i(aVar, "appSettingsLocalDataSource");
        C41536l.m120489i(hVar, "appSettingsRemoteDataSource");
        this.f71532a = aVar;
        this.f71533b = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40739f m86645e(C28186m mVar, List list) {
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(list, "it");
        return mVar.f71532a.mo67678c(list);
    }

    /* renamed from: a */
    public String mo67682a(String str) {
        C41536l.m120489i(str, "key");
        C35934b a = this.f71532a.mo67676a(str);
        if (a != null) {
            return a.mo88464b();
        }
        return null;
    }

    /* renamed from: b */
    public C40734b mo67683b() {
        return this.f71532a.mo67677b();
    }

    /* renamed from: c */
    public C40734b mo67684c() {
        C40734b s = this.f71533b.mo67681a().mo95088s(new C28185l(this));
        C41536l.m120488h(s, "appSettingsRemoteDataSou…Source.saveSettings(it) }");
        return s;
    }
}
