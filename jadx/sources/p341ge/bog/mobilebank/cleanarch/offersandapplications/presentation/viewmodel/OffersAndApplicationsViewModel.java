package p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.salesforce.marketingcloud.C11398b;
import ed1.C40749p;
import g00.C20588a;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import i00.C25081a;
import i00.C25082b;
import i00.C25083c;
import i00.C25084d;
import i00.C25085e;
import i00.C25086f;
import i00.C25087g;
import i00.C25088h;
import i00.C25089i;
import i00.C25090j;
import i00.C25091k;
import i00.C25092l;
import i00.C25093m;
import i00.C25094n;
import i00.C25095o;
import j50.C25333a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.StatusEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p380ck.C10464h;
import p710av.C19278a;
import p719bu.C19411a;
import p842nv.C26615g;
import p897tp.C28474a;
import p930wp.C29557b;
import p930wp.C29560c;
import p951xz.C29877a;
import p951xz.C29878b;
import p962yz.C30124a;
import p968zu.C30408a;
import p968zu.C30409b;
import pc0.C27494a;
import ue1.C43075l;
import ue1.C43081r;

/* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel */
public final class OffersAndApplicationsViewModel extends C21481a {

    /* renamed from: d */
    private final C26615g f57251d;

    /* renamed from: e */
    private final C29560c f57252e;

    /* renamed from: f */
    private final C29877a f57253f;

    /* renamed from: g */
    private final C29557b f57254g;

    /* renamed from: h */
    private final C29878b f57255h;

    /* renamed from: i */
    private final C30409b f57256i;

    /* renamed from: j */
    private final C30408a f57257j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C25333a f57258k;

    /* renamed from: l */
    private final C27494a f57259l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f57260m = new C1644x();

    /* renamed from: n */
    private final C1644x f57261n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f57262o = new C1644x();

    /* renamed from: p */
    private final C1644x f57263p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f57264q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1644x f57265r = new C1644x();

    /* renamed from: s */
    private C20588a f57266s;

    /* renamed from: t */
    private List f57267t = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C19278a f57268u;

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$a */
    static final class C21407a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21407a(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57269d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53460a(C41238w wVar) {
            this.f57269d.f57265r.mo4823o(new C37223a(C41238w.f97225a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53460a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$b */
    static final class C21408b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21408b(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57270d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53461a(C41238w wVar) {
            OffersAndApplicationsViewModel.m69178Qw(this.f57270d, true, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53461a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$c */
    static final class C21409c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57271d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21409c(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57271d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53462a(C41205b bVar) {
            C21484c.m69417i(this.f57271d.f57262o, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53462a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$d */
    static final class C21410d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21410d(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57272d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53463a(C19278a aVar) {
            this.f57272d.f57268u = aVar;
            C21484c.m69418j(this.f57272d.f57262o, aVar.mo47499a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53463a((C19278a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$e */
    static final class C21411e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21411e(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57273d = offersAndApplicationsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57273d.f57262o, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$f */
    static final class C21412f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21412f(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57274d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53465a(List list) {
            OffersAndApplicationsViewModel offersAndApplicationsViewModel = this.f57274d;
            C41536l.m120488h(list, "it");
            offersAndApplicationsViewModel.mo53457cx(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53465a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$g */
    static final class C21413g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21413g f57275d = new C21413g();

        C21413g() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$h */
    static final class C21414h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21414h f57276d = new C21414h();

        C21414h() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return C41341q.m119907j();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$i */
    static final class C21415i extends C41537m implements C43081r {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21415i(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(4);
            this.f57277d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final C20588a invoke(List list, List list2, C30124a aVar, List list3) {
            C41536l.m120489i(list, "offers");
            C41536l.m120489i(list2, "applications");
            C41536l.m120489i(aVar, "criStatus");
            C41536l.m120489i(list3, "pendingProducts");
            if (!aVar.mo70424b()) {
                list = C41341q.m119907j();
            }
            return new C20588a(list, list2, aVar, this.f57277d.f57258k.mo63905a(list3), new ArrayList());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$j */
    static final class C21416j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21416j(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57278d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53469a(C41205b bVar) {
            C21484c.m69417i(this.f57278d.f57260m, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53469a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$k */
    static final class C21417k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21417k(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57279d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53470a(C20588a aVar) {
            this.f57279d.mo53458dx(aVar);
            C1644x xw = this.f57279d.f57260m;
            C41536l.m120488h(aVar, "data");
            C21484c.m69418j(xw, aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53470a((C20588a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$l */
    static final class C21418l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21418l(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57280d = offersAndApplicationsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57280d.f57260m, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$m */
    static final class C21419m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21419m(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57281d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53472a(C41205b bVar) {
            C21484c.m69417i(this.f57281d.f57264q, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53472a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$n */
    static final class C21420n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21420n(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57282d = offersAndApplicationsViewModel;
        }

        /* renamed from: a */
        public final void mo53473a(StatusEntity statusEntity) {
            C1644x vw = this.f57282d.f57264q;
            C41536l.m120488h(statusEntity, "it");
            C21484c.m69418j(vw, statusEntity);
            OffersAndApplicationsViewModel.m69178Qw(this.f57282d, false, true, 1, (Object) null);
            C32343x.m95397J0(this.f57282d, "offers_and_applications", (String) null, "did_accept_sca", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
            this.f57282d.m69184Xw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53473a((StatusEntity) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel$o */
    static final class C21421o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsViewModel f57283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21421o(OffersAndApplicationsViewModel offersAndApplicationsViewModel) {
            super(1);
            this.f57283d = offersAndApplicationsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57283d.f57264q, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffersAndApplicationsViewModel(C19411a aVar, C26615g gVar, C29560c cVar, C29877a aVar2, C29557b bVar, C29878b bVar2, C30409b bVar3, C30408a aVar3, C25333a aVar4, C27494a aVar5, C28474a aVar6) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "eventPoster");
        C41536l.m120489i(gVar, "getOffers");
        C41536l.m120489i(cVar, "getApplications");
        C41536l.m120489i(aVar2, "getCreditInfoPermissionStatus");
        C41536l.m120489i(bVar, "getApplicationTypes");
        C41536l.m120489i(bVar2, "getPendingProductConfirmations");
        C41536l.m120489i(bVar3, "getCreditInfoContractForOffer");
        C41536l.m120489i(aVar3, "confirmCri");
        C41536l.m120489i(aVar4, "pendingProductConfirmationUiMapper");
        C41536l.m120489i(aVar5, "otpParamsMapBuilder");
        C41536l.m120489i(aVar6, "applicationEventPoster");
        this.f57251d = gVar;
        this.f57252e = cVar;
        this.f57253f = aVar2;
        this.f57254g = bVar;
        this.f57255h = bVar2;
        this.f57256i = bVar3;
        this.f57257j = aVar3;
        this.f57258k = aVar4;
        this.f57259l = aVar5;
        C41205b F0 = aVar.mo47641a().mo95027o0(C40992a.m118827a()).mo94981F0(new C25089i(new C21407a(this)));
        C41536l.m120488h(F0, "eventPoster.getObservabl….postValue(Event(Unit)) }");
        addDisposable(F0);
        C41205b F02 = aVar6.mo68095a().mo94981F0(new C25090j(new C21408b(this)));
        C41536l.m120488h(F02, "applicationEventPoster.g…ta(init = true)\n        }");
        addDisposable(F02);
        m69184Xw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m69171Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m69172Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m69173Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final void m69174Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m69175Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Mw */
    private final CreditInfoRepositoryImpl.ConfirmCriParams m69176Mw(boolean z, boolean z2, String str, String str2, String str3) {
        String str4;
        StatusEntity statusEntity;
        String str5;
        C19278a aVar;
        if (!z || (aVar = this.f57268u) == null || (str4 = aVar.mo47499a()) == null) {
            str4 = "";
        }
        if (z2) {
            statusEntity = StatusEntity.ACTIVE;
        } else {
            statusEntity = StatusEntity.INACTIVE;
        }
        String value = statusEntity.getValue();
        C19278a aVar2 = this.f57268u;
        if (aVar2 == null || (str5 = aVar2.mo47500b()) == null) {
            str5 = "";
        }
        return new CreditInfoRepositoryImpl.ConfirmCriParams(str4, value, "CREDIT_INFO_GET_CUSTOMER_INFO_OFFER", "", str5, str, str2, str3, (String) null, C11398b.f33139r, (DefaultConstructorMarker) null);
    }

    /* renamed from: Nw */
    static /* synthetic */ CreditInfoRepositoryImpl.ConfirmCriParams m69177Nw(OffersAndApplicationsViewModel offersAndApplicationsViewModel, boolean z, boolean z2, String str, String str2, String str3, int i, Object obj) {
        return offersAndApplicationsViewModel.m69176Mw(z, z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    /* renamed from: Qw */
    public static /* synthetic */ void m69178Qw(OffersAndApplicationsViewModel offersAndApplicationsViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        offersAndApplicationsViewModel.mo53454Pw(z, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final List m69179Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final C20588a m69180Sw(C43081r rVar, Object obj, Object obj2, Object obj3, Object obj4) {
        C41536l.m120489i(rVar, "$tmp0");
        return (C20588a) rVar.invoke(obj, obj2, obj3, obj4);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final void m69181Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m69182Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public static final void m69183Vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public final void m69184Xw() {
        StatusEntity statusEntity;
        C30124a c;
        C20588a aVar = this.f57266s;
        boolean z = false;
        if (!(aVar == null || (c = aVar.mo49127c()) == null || !c.mo70424b())) {
            z = true;
        }
        if (z) {
            statusEntity = StatusEntity.INACTIVE;
        } else {
            statusEntity = StatusEntity.ACTIVE;
        }
        C32343x.m95397J0(this, "offers_and_applications", "status_is_" + statusEntity.getValue(), "offers_and_applications_loaded", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public static final void m69185Zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final void m69186ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m69187bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m69203sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public final void mo53445Aw() {
        C41205b I = this.f57256i.mo70751a().mo95063B(C40992a.m118827a()).mo95083l(new C25081a(new C21409c(this))).mo95070I(new C25087g(new C21410d(this)), new C25088h(new C21411e(this)));
        C41536l.m120488h(I, "fun creditInfoConfirmati…       })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: Ew */
    public final void mo53446Ew(boolean z) {
        this.f57263p.mo4823o(C32343x.m95466m(this.f57259l.mo66809a(m69177Nw(this, false, z, (String) null, (String) null, (String) null, 28, (Object) null))));
        if (z) {
            C32343x.m95397J0(this, "offers_and_applications", (String) null, "did_accept_precontract", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
            return;
        }
        C32343x.m95397J0(this, "offers_and_applications", (String) null, "toggle_popup_yes_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: Fw */
    public final void mo53447Fw() {
        C41205b G0 = this.f57254g.mo69402b().mo95027o0(C40992a.m118827a()).mo94983G0(new C25085e(new C21412f(this)), new C25086f(C21413g.f57275d));
        C41536l.m120488h(G0, "fun fetchApplicationType… .bindToLifecycle()\n    }");
        bindToLifecycle(G0);
    }

    /* renamed from: Iw */
    public final List mo53448Iw() {
        return this.f57267t;
    }

    /* renamed from: Jw */
    public final LiveData mo53449Jw() {
        return this.f57263p;
    }

    /* renamed from: Kw */
    public final LiveData mo53450Kw() {
        return this.f57262o;
    }

    /* renamed from: Lw */
    public final LiveData mo53451Lw() {
        return this.f57264q;
    }

    /* renamed from: Mf */
    public final LiveData mo53452Mf() {
        return this.f57265r;
    }

    /* renamed from: Ow */
    public final C20588a mo53453Ow() {
        return this.f57266s;
    }

    /* renamed from: Pw */
    public final void mo53454Pw(boolean z, boolean z2) {
        C41205b G0 = C40749p.m118035b1(C26615g.m83078c(this.f57251d, z2, false, 2, (Object) null).mo95035t0(new C25094n(C21414h.f57276d)), this.f57252e.mo69404a(z).mo95075O(), this.f57253f.mo70149a(true), this.f57255h.mo70150a().mo95075O(), new C25095o(new C21415i(this))).mo95027o0(C40992a.m118827a()).mo94980F(new C25082b(new C21416j(this))).mo94983G0(new C25083c(new C21417k(this)), new C25084d(new C21418l(this)));
        C41536l.m120488h(G0, "fun getInitialData(init:…).bindToLifecycle()\n    }");
        bindToLifecycle(G0);
    }

    /* renamed from: Ww */
    public final LiveData mo53455Ww() {
        return this.f57261n;
    }

    /* renamed from: Yw */
    public final void mo53456Yw(boolean z, String str, String str2, String str3) {
        C41205b I = this.f57257j.mo70750a(this.f57259l.mo66809a(m69176Mw(true, z, str, str2, str3))).mo95063B(C40992a.m118827a()).mo95083l(new C25091k(new C21419m(this))).mo95070I(new C25092l(new C21420n(this)), new C25093m(new C21421o(this)));
        C41536l.m120488h(I, "fun sendClientsConfirmat…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: cx */
    public final void mo53457cx(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f57267t = list;
    }

    /* renamed from: dx */
    public final void mo53458dx(C20588a aVar) {
        this.f57266s = aVar;
    }

    /* renamed from: v9 */
    public final LiveData mo53459v9() {
        return this.f57260m;
    }
}
