package tm0;

import ed1.C40762x;
import he1.C41238w;
import java.util.HashMap;
import k70.C25679c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import qm0.C27851a;
import rm0.C28054b;
import rm0.C28060h;
import sm0.C28251c;
import ue1.C43075l;

/* renamed from: tm0.b */
public final class C28467b implements C28054b {

    /* renamed from: a */
    private final C27851a f72269a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25679c f72270b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C28060h f72271c;

    /* renamed from: tm0.b$a */
    static final class C28468a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28467b f72272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28468a(C28467b bVar) {
            super(1);
            this.f72272d = bVar;
        }

        /* renamed from: a */
        public final void mo68092a(C28251c cVar) {
            this.f72272d.f72270b.mo64183a();
            this.f72272d.f72271c.mo67602a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68092a((C28251c) obj);
            return C41238w.f97225a;
        }
    }

    public C28467b(C27851a aVar, C25679c cVar, C28060h hVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(cVar, "refreshAllProducts");
        C41536l.m120489i(hVar, "updateJuniorRequestStatus");
        this.f72269a = aVar;
        this.f72270b = cVar;
        this.f72271c = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m87301e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo67597a(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x m = this.f72269a.mo65831T1(hashMap).mo95084m(new C28466a(new C28468a(this)));
        C41536l.m120488h(m, "override operator fun in…estStatus()\n            }");
        return m;
    }
}
