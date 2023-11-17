package ka1;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import ce1.C40398b;
import da1.C12033d;
import da1.C12038f;
import dd1.C40578p1;
import dd1.C40630y;
import de1.C40640a;
import ed1.C40734b;
import ei1.C40894a;
import fh1.C40951a;
import gb1.C32383o;
import gd1.C40992a;
import gh1.C41125a;
import ha1.C15458b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.RelatedCompany;
import rc1.C42355a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ka1.h */
public final class C16332h extends C15458b {

    /* renamed from: h */
    private final List f46153h;

    /* renamed from: i */
    private final C40630y f46154i;

    /* renamed from: j */
    private final C1644x f46155j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C32383o f46156k = new C32383o();

    /* renamed from: l */
    private final C12033d f46157l;

    /* renamed from: m */
    private boolean f46158m;

    /* renamed from: ka1.h$a */
    public static final class C16333a implements C41125a {

        /* renamed from: a */
        private final Object f46159a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo43304b() {
            return this.f46159a;
        }
    }

    /* renamed from: ka1.h$b */
    static final class C16334b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16332h f46160d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16334b(C16332h hVar) {
            super(1);
            this.f46160d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f46160d.f46156k.mo4826r(new C35947l.C35949b(th));
        }
    }

    /* renamed from: ka1.h$c */
    static final class C16335c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C16332h f46161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16335c(C16332h hVar) {
            super(0);
            this.f46161d = hVar;
        }

        public final void invoke() {
            this.f46161d.f46156k.mo4826r(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16332h(List list, C40630y yVar) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(list, "companies");
        C41536l.m120489i(yVar, "finishAuthenticationUseCase");
        this.f46153h = list;
        this.f46154i = yVar;
        C1644x xVar = new C1644x();
        this.f46155j = xVar;
        xVar.mo4826r(new C35947l.C35951d(list));
        this.f46157l = new C12033d(new C12038f((List) null, (RelatedCompany) null, 3, (DefaultConstructorMarker) null), (C42355a) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: jw */
    public final void mo43299jw(String str) {
        C41536l.m120489i(str, "clientKey");
        C40734b z = C40630y.m117445d(this.f46154i, str, this.f46158m, C41536l.m120484d(((C10146d0.C10172e) new C16333a().mo43304b()).mo26726q().mo92939a(), "m4B"), false, 8, (Object) null).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "finishAuthenticationUseC…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116971d(z, new C16334b(this), new C16335c(this)));
    }

    /* renamed from: kw */
    public final C12033d mo43300kw() {
        return this.f46157l;
    }

    /* renamed from: lw */
    public final LiveData mo43301lw() {
        return this.f46156k;
    }

    /* renamed from: mw */
    public final LiveData mo43302mw() {
        return this.f46155j;
    }

    /* renamed from: nw */
    public final void mo43303nw(RelatedCompany relatedCompany, boolean z) {
        C41536l.m120489i(relatedCompany, "company");
        this.f46158m = z;
        this.f46157l.mo32130b().mo32139f(relatedCompany);
    }
}
