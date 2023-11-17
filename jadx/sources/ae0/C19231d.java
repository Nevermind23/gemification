package ae0;

import ed1.C40762x;
import hd1.C41205b;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;
import xd0.C29742a;
import yd0.C29991a;
import yd0.C30003b;
import yd0.C30004c;
import zd0.C30289a;

/* renamed from: ae0.d */
public final class C19231d implements C29742a {

    /* renamed from: a */
    private final C30289a f53455a;

    /* renamed from: ae0.d$a */
    static final class C19232a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29991a.C29994c f53456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19232a(C29991a.C29994c cVar) {
            super(1);
            this.f53456d = cVar;
        }

        /* renamed from: a */
        public final void mo47471a(C41205b bVar) {
            C36546y.m108282F().mo27152s("Year_end_campaign", this.f53456d.mo70293b(), this.f53456d.mo70292a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47471a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ae0.d$b */
    static final class C19233b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29991a.C29994c f53457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19233b(C29991a.C29994c cVar) {
            super(1);
            this.f53457d = cVar;
        }

        /* renamed from: a */
        public final void mo47472a(C30003b bVar) {
            if (bVar.mo70300c()) {
                C29991a c = this.f53457d.mo70297c(bVar.mo70302e());
                C36546y.m108282F().mo27152s("Year_end_campaign", c.mo70293b(), c.mo70292a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47472a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    public C19231d(C30289a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f53455a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m64675e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m64676f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C30003b m64677g(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C30003b(false, (Long) null, (C30004c) null, false, false, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public C40762x mo47470a(C29991a.C29994c cVar) {
        C41536l.m120489i(cVar, "result");
        C40762x D = this.f53455a.mo68441a().mo95083l(new C19228a(new C19232a(cVar))).mo95084m(new C19229b(new C19233b(cVar))).mo95065D(new C19230c());
        C41536l.m120488h(D, "result: ConversionLogDat…{ EndYearCampaignInfo() }");
        return D;
    }
}
