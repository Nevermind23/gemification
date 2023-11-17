package p341ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import de1.C40640a;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p883rw.C28110b;
import p883rw.C28111c;
import p893sw.C28279b;
import s50.C28144a;
import s50.C28145b;
import s50.C28146c;
import s50.C28147d;
import s50.C28148e;
import s50.C28149f;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel */
public final class ReferalsViewModel extends C21481a {

    /* renamed from: d */
    private final C28110b f59238d;

    /* renamed from: e */
    private final C28111c f59239e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f59240f = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f59241g = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel$a */
    static final class C22361a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsViewModel f59242d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22361a(ReferalsViewModel referalsViewModel) {
            super(1);
            this.f59242d = referalsViewModel;
        }

        /* renamed from: a */
        public final void mo55296a(C41205b bVar) {
            C21484c.m69417i(this.f59242d.f59241g, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55296a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel$b */
    static final class C22362b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsViewModel f59243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22362b(ReferalsViewModel referalsViewModel) {
            super(1);
            this.f59243d = referalsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59243d.f59241g, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel$c */
    static final class C22363c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsViewModel f59244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22363c(ReferalsViewModel referalsViewModel) {
            super(1);
            this.f59244d = referalsViewModel;
        }

        /* renamed from: a */
        public final void mo55298a(C41205b bVar) {
            C21484c.m69417i(this.f59244d.f59240f, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55298a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel$d */
    static final class C22364d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsViewModel f59245d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22364d(ReferalsViewModel referalsViewModel) {
            super(1);
            this.f59245d = referalsViewModel;
        }

        /* renamed from: a */
        public final void mo55299a(C28279b bVar) {
            C1644x jw = this.f59245d.f59240f;
            C41536l.m120488h(bVar, "it");
            C21484c.m69418j(jw, bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55299a((C28279b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel$e */
    static final class C22365e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReferalsViewModel f59246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22365e(ReferalsViewModel referalsViewModel) {
            super(1);
            this.f59246d = referalsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59246d.f59240f, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReferalsViewModel(C28110b bVar, C28111c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getReferalUserInfo");
        C41536l.m120489i(cVar, "setReferalPromoCode");
        this.f59238d = bVar;
        this.f59239e = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m72486mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m72487nw(ReferalsViewModel referalsViewModel, String str) {
        ReferalsViewModel referalsViewModel2 = referalsViewModel;
        C41536l.m120489i(referalsViewModel2, "this$0");
        C41536l.m120489i(str, "$promoCode");
        C1644x xVar = referalsViewModel2.f59241g;
        Object f = referalsViewModel2.f59240f.mo4814f();
        C41536l.m120486f(f);
        Object a = ((C21503d) f).mo53701a();
        C41536l.m120486f(a);
        C21484c.m69418j(xVar, C28279b.m86910b((C28279b) a, (Boolean) null, (Boolean) null, (BigDecimal) null, (String) null, (String) null, (Integer) null, str, (BigDecimal) null, (String) null, (BigDecimal) null, (String) null, (String) null, (String) null, (String) null, 16319, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m72488ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m72489sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m72490tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m72491uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: lw */
    public final void mo55292lw(String str) {
        C41536l.m120489i(str, "promoCode");
        C41205b G = this.f59239e.mo67646a(str).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a()).mo94904r(new C28147d(new C22361a(this))).mo94888G(new C28148e(this, str), new C28149f(new C22362b(this)));
        C41536l.m120488h(G, "fun activatePromoCode(pr…       })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: pw */
    public final LiveData mo55293pw() {
        return this.f59240f;
    }

    /* renamed from: qw */
    public final LiveData mo55294qw() {
        return this.f59241g;
    }

    /* renamed from: rw */
    public final void mo55295rw() {
        C41205b I = this.f59238d.mo67645a().mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C28144a(new C22363c(this))).mo95070I(new C28145b(new C22364d(this)), new C28146c(new C22365e(this)));
        C41536l.m120488h(I, "fun loadData() {\n       …      })\n        )\n\n    }");
        addDisposable(I);
    }
}
