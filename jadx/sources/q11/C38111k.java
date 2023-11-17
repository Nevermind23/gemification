package q11;

import ed1.C40734b;
import he1.C41238w;
import j51.C36735g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import l11.C37060b;
import l11.C37063e;
import m11.C37202b;
import m11.C37203c;
import m51.C37228a;
import o11.C37585a;
import ue1.C43075l;

/* renamed from: q11.k */
public final class C38111k implements C37063e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C36735g f91523a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C37060b f91524b;

    /* renamed from: c */
    private final C37585a f91525c;

    /* renamed from: q11.k$a */
    static final class C38112a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38111k f91526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38112a(C38111k kVar) {
            super(1);
            this.f91526d = kVar;
        }

        /* renamed from: a */
        public final void mo91534a(C37203c cVar) {
            C37228a a = this.f91526d.f91523a.mo89562a();
            if (a != null) {
                a.mo90305b();
                this.f91526d.f91524b.mo89977a(cVar.mo90266a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91534a((C37203c) obj);
            return C41238w.f97225a;
        }
    }

    public C38111k(C36735g gVar, C37060b bVar, C37585a aVar) {
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(bVar, "savePreLoginBackground");
        C41536l.m120489i(aVar, "repository");
        this.f91523a = gVar;
        this.f91524b = bVar;
        this.f91525c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C37203c m111968f(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C37203c((C37202b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m111969g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo89979a(boolean z) {
        C40734b y = this.f91525c.mo89054l3(z).mo95065D(new C38109i()).mo95084m(new C38110j(new C38112a(this))).mo95092y();
        C41536l.m120488h(y, "override operator fun in…        }.ignoreElement()");
        return y;
    }
}
