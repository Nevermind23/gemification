package p341ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import cf1.C40407d;
import com.salesforce.marketingcloud.C11398b;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l30.C25803a;
import m30.C26124a;
import m30.C26125b;
import m30.C26126c;
import m30.C26127d;
import m30.C26128e;
import m30.C26129f;
import m30.C26130g;
import m30.C26131h;
import m30.C26132i;
import m30.C26133j;
import m30.C26134k;
import m30.C26135l;
import m30.C26136m;
import m30.C26137n;
import m30.C26138o;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.StatusEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.LoanOfferLimitUiModel;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p710av.C19278a;
import p748eu.C20292b;
import p758fu.C20557a;
import p842nv.C26608a;
import p842nv.C26609b;
import p902tu.C28512c;
import p913uu.C28940f;
import p968zu.C30408a;
import p968zu.C30409b;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel */
public final class OfferNavigatorViewModel extends C21481a {

    /* renamed from: F */
    public static final C21989a f58503F = new C21989a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C1644x f58504A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C19278a f58505B;

    /* renamed from: C */
    private final List f58506C;

    /* renamed from: D */
    private final List f58507D;

    /* renamed from: E */
    private final List f58508E;

    /* renamed from: d */
    private final C28512c f58509d;

    /* renamed from: e */
    private final C30409b f58510e;

    /* renamed from: f */
    private final C30408a f58511f;

    /* renamed from: g */
    private final C26608a f58512g;

    /* renamed from: h */
    private final C26609b f58513h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C25803a f58514i;

    /* renamed from: j */
    private final C27494a f58515j;

    /* renamed from: k */
    private final C20292b f58516k;

    /* renamed from: l */
    private OfferInfo f58517l;

    /* renamed from: m */
    private String f58518m;

    /* renamed from: n */
    private boolean f58519n;

    /* renamed from: o */
    private final C1644x f58520o = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f58521p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1644x f58522q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1644x f58523r = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f58524s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f58525t = new C1644x();

    /* renamed from: u */
    private final C1644x f58526u = new C1644x();

    /* renamed from: v */
    private final C1644x f58527v = new C1644x();

    /* renamed from: w */
    private final C1644x f58528w;

    /* renamed from: x */
    private final LiveData f58529x;

    /* renamed from: y */
    private final C1644x f58530y;

    /* renamed from: z */
    private final LiveData f58531z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$a */
    public static final class C21989a {
        private C21989a() {
        }

        public /* synthetic */ C21989a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$b */
    public static final class C21990b {

        /* renamed from: a */
        private final OfferInfo f58532a;

        /* renamed from: b */
        private final List f58533b;

        public C21990b(OfferInfo offerInfo, List list) {
            C41536l.m120489i(offerInfo, "offerInfo");
            C41536l.m120489i(list, "creditOffers");
            this.f58532a = offerInfo;
            this.f58533b = list;
        }

        /* renamed from: a */
        public final List mo54672a() {
            return this.f58533b;
        }

        /* renamed from: b */
        public final OfferInfo mo54673b() {
            return this.f58532a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$c */
    public static final class C21991c {

        /* renamed from: a */
        private final C21992d f58534a;

        /* renamed from: b */
        private final OfferInfo f58535b;

        /* renamed from: c */
        private final List f58536c;

        /* renamed from: d */
        private final boolean f58537d;

        public C21991c(C21992d dVar, OfferInfo offerInfo, List list, boolean z) {
            C41536l.m120489i(dVar, "loanType");
            C41536l.m120489i(offerInfo, "offerInfo");
            C41536l.m120489i(list, "loanOffers");
            this.f58534a = dVar;
            this.f58535b = offerInfo;
            this.f58536c = list;
            this.f58537d = z;
        }

        /* renamed from: a */
        public final List mo54674a() {
            return this.f58536c;
        }

        /* renamed from: b */
        public final C21992d mo54675b() {
            return this.f58534a;
        }

        /* renamed from: c */
        public final OfferInfo mo54676c() {
            return this.f58535b;
        }

        /* renamed from: d */
        public final boolean mo54677d() {
            return this.f58537d;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$d */
    public enum C21992d {
        CONSUMER_LOAN,
        EXPRESS_LOAN
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$e */
    static final class C21993e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21993e(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58541d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54678a(C41205b bVar) {
            C21484c.m69417i(this.f58541d.f58523r, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54678a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$f */
    static final class C21994f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58542d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21994f(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58542d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54679a(StatusEntity statusEntity) {
            C21484c.m69418j(this.f58542d.f58523r, C41238w.f97225a);
            this.f58542d.m71205hx();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54679a((StatusEntity) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$g */
    static final class C21995g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21995g(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58543d = offerNavigatorViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58543d.f58523r, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$h */
    static final class C21996h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58544d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21996h(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58544d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54681a(C41205b bVar) {
            C21484c.m69417i(this.f58544d.f58521p, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54681a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$i */
    static final class C21997i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21997i(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58545d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54682a(C28940f fVar) {
            this.f58545d.m71214ox(fVar.mo68772f());
            C1644x vw = this.f58545d.f58521p;
            C41536l.m120488h(fVar, "it");
            C21484c.m69418j(vw, fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54682a((C28940f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$j */
    static final class C21998j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21998j(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58546d = offerNavigatorViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f58546d.m71214ox((Integer) null);
            C21484c.m69415g(this.f58546d.f58521p, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$k */
    static final class C21999k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21999k(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58547d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54684a(C41205b bVar) {
            C21484c.m69417i(this.f58547d.f58522q, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54684a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$l */
    static final class C22000l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22000l(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58548d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54685a(C19278a aVar) {
            this.f58548d.f58505B = aVar;
            C21484c.m69418j(this.f58548d.f58522q, aVar.mo47499a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54685a((C19278a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$m */
    static final class C22001m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22001m(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58549d = offerNavigatorViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58549d.f58522q, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$n */
    static final class C22002n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22002n(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58550d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54687a(C41205b bVar) {
            C21484c.m69417i(this.f58550d.f58525t, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54687a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$o */
    static final class C22003o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22003o(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58551d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54688a(List list) {
            C25803a tw = this.f58551d.f58514i;
            C41536l.m120488h(list, "it");
            List e = tw.mo64441e(list);
            C21484c.m69418j(this.f58551d.f58525t, e);
            this.f58551d.m71216px(e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54688a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$p */
    static final class C22004p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58552d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22004p(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58552d = offerNavigatorViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58552d.f58525t, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$q */
    static final class C22005q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58553d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22005q(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58553d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54690a(C41205b bVar) {
            C21484c.m69417i(this.f58553d.f58524s, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54690a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$r */
    static final class C22006r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22006r(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58554d = offerNavigatorViewModel;
        }

        /* renamed from: a */
        public final void mo54691a(List list) {
            C25803a tw = this.f58554d.f58514i;
            C41536l.m120488h(list, "it");
            List f = tw.mo64442f(list);
            C21484c.m69418j(this.f58554d.f58524s, f);
            this.f58554d.m71220rx(f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54691a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$s */
    static final class C22007s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorViewModel f58555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22007s(OfferNavigatorViewModel offerNavigatorViewModel) {
            super(1);
            this.f58555d = offerNavigatorViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58555d.f58524s, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfferNavigatorViewModel(C28512c cVar, C30409b bVar, C30408a aVar, C26608a aVar2, C26609b bVar2, C25803a aVar3, C27494a aVar4, C20292b bVar3) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "getCreditOfferDecision");
        C41536l.m120489i(bVar, "getCreditInfoContractForOffer");
        C41536l.m120489i(aVar, "confirmCri");
        C41536l.m120489i(aVar2, "geLoanOfferList");
        C41536l.m120489i(bVar2, "getCreditOfferList");
        C41536l.m120489i(aVar3, "offersDataMapper");
        C41536l.m120489i(aVar4, "otpParamsMapBuilder");
        C41536l.m120489i(bVar3, "getAppSettingByName");
        this.f58509d = cVar;
        this.f58510e = bVar;
        this.f58511f = aVar;
        this.f58512g = aVar2;
        this.f58513h = bVar2;
        this.f58514i = aVar3;
        this.f58515j = aVar4;
        this.f58516k = bVar3;
        C1644x xVar = new C1644x();
        this.f58528w = xVar;
        this.f58529x = xVar;
        C1644x xVar2 = new C1644x();
        this.f58530y = xVar2;
        this.f58531z = xVar2;
        this.f58504A = new C1644x();
        this.f58506C = C41341q.m119910m(OfferProductCode.C21012EL.f56473f, OfferProductCode.C21002BA.f56468f, OfferProductCode.C21004BE.f56469f, OfferProductCode.C21008CL.f56471f, OfferProductCode.C21023RL.f56479f);
        this.f58507D = C41341q.m119910m(OfferProductCode.C21000AC.f56467f, OfferProductCode.C21010EC.f56472f, OfferProductCode.C21017LC.f56476f);
        this.f58508E = C41341q.m119910m(OfferProductCode.C21019ML.f56477f, OfferProductCode.C21025SL.f56480f);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m71180Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final void m71181Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final void m71182Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Hw */
    private final void m71183Hw(String str, String str2) {
        if (str2 != null) {
            C41205b I = this.f58509d.mo68109b(str, str2).mo95063B(C40992a.m118827a()).mo95083l(new C26138o(new C21996h(this))).mo95070I(new C26125b(new C21997i(this)), new C26126c(new C21998j(this)));
            C41536l.m120488h(I, "private fun getCreditDec…).bindToLifecycle()\n    }");
            bindToLifecycle(I);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m71184Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m71185Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public static final void m71186Kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Lw */
    private final void m71187Lw() {
        C41205b I = this.f58510e.mo70751a().mo95063B(C40992a.m118827a()).mo95083l(new C26127d(new C21999k(this))).mo95070I(new C26128e(new C22000l(this)), new C26129f(new C22001m(this)));
        C41536l.m120488h(I, "private fun getCreditInf…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final void m71188Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m71189Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final void m71190Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Tw */
    private final void m71191Tw(String str) {
        C41205b I = this.f58513h.mo65865a(str).mo95063B(C40992a.m118827a()).mo95083l(new C26135l(new C22002n(this))).mo95070I(new C26136m(new C22003o(this)), new C26137n(new C22004p(this)));
        C41536l.m120488h(I, "private fun getCreditOff…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m71192Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public static final void m71193Vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final void m71194Ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Yw */
    private final void m71195Yw() {
        OfferInfo offerInfo = this.f58517l;
        OfferInfo offerInfo2 = null;
        if (offerInfo == null) {
            C41536l.m120506z("offerInfo");
            offerInfo = null;
        }
        OfferProductCode productCode = offerInfo.getProductCode();
        if (this.f58506C.contains(productCode)) {
            m71205hx();
        } else if (this.f58507D.contains(productCode)) {
            OfferInfo offerInfo3 = this.f58517l;
            if (offerInfo3 == null) {
                C41536l.m120506z("offerInfo");
                offerInfo3 = null;
            }
            String offerNo = offerInfo3.getOfferNo();
            OfferInfo offerInfo4 = this.f58517l;
            if (offerInfo4 == null) {
                C41536l.m120506z("offerInfo");
            } else {
                offerInfo2 = offerInfo4;
            }
            m71183Hw(offerNo, offerInfo2.getOperType());
        } else if (this.f58508E.contains(productCode)) {
            C1644x xVar = this.f58504A;
            OfferInfo offerInfo5 = this.f58517l;
            if (offerInfo5 == null) {
                C41536l.m120506z("offerInfo");
            } else {
                offerInfo2 = offerInfo5;
            }
            C37224b.m109965d(xVar, offerInfo2);
        } else if (C41536l.m120484d(productCode, OfferProductCode.C21021PL.f56478f)) {
            C1644x xVar2 = this.f58530y;
            OfferInfo offerInfo6 = this.f58517l;
            if (offerInfo6 == null) {
                C41536l.m120506z("offerInfo");
            } else {
                offerInfo2 = offerInfo6;
            }
            xVar2.mo4823o(C32343x.m95466m(offerInfo2));
        } else {
            C1644x xVar3 = this.f58520o;
            OfferInfo offerInfo7 = this.f58517l;
            if (offerInfo7 == null) {
                C41536l.m120506z("offerInfo");
            } else {
                offerInfo2 = offerInfo7;
            }
            xVar3.mo4823o(C32343x.m95466m(offerInfo2));
        }
    }

    /* renamed from: dx */
    private final void m71197dx(String str) {
        C41205b I = this.f58512g.mo65864a(str).mo95063B(C40992a.m118827a()).mo95083l(new C26132i(new C22005q(this))).mo95070I(new C26133j(new C22006r(this)), new C26134k(new C22007s(this)));
        C41536l.m120488h(I, "private fun getLoanOffer…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public static final void m71199ex(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fx */
    public static final void m71201fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gx */
    public static final void m71203gx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hx */
    public final void m71205hx() {
        OfferInfo offerInfo = this.f58517l;
        OfferInfo offerInfo2 = null;
        if (offerInfo == null) {
            C41536l.m120506z("offerInfo");
            offerInfo = null;
        }
        OfferProductCode productCode = offerInfo.getProductCode();
        if (this.f58506C.contains(productCode)) {
            OfferInfo offerInfo3 = this.f58517l;
            if (offerInfo3 == null) {
                C41536l.m120506z("offerInfo");
            } else {
                offerInfo2 = offerInfo3;
            }
            m71197dx(offerInfo2.getOfferNo());
        } else if (this.f58507D.contains(productCode)) {
            OfferInfo offerInfo4 = this.f58517l;
            if (offerInfo4 == null) {
                C41536l.m120506z("offerInfo");
            } else {
                offerInfo2 = offerInfo4;
            }
            m71191Tw(offerInfo2.getOfferNo());
        } else {
            this.f58528w.mo4823o(C32343x.m95466m(C41238w.f97225a));
        }
    }

    /* renamed from: lx */
    public static /* synthetic */ CreditInfoRepositoryImpl.ConfirmCriParams m71210lx(OfferNavigatorViewModel offerNavigatorViewModel, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return offerNavigatorViewModel.mo54669kx(str, str2, str3, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: ox */
    public final void m71214ox(Integer num) {
        if (num == null || num.intValue() != -110) {
            m71205hx();
        } else {
            m71187Lw();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: px */
    public final void m71216px(List list) {
        Object obj;
        if (list.isEmpty()) {
            m71218qx();
            return;
        }
        OfferInfo offerInfo = null;
        if (this.f58519n) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((CreditOfferLimitUiModel) obj).mo54632e().mo68796b(), this.f58518m)) {
                    break;
                }
            }
            CreditOfferLimitUiModel creditOfferLimitUiModel = (CreditOfferLimitUiModel) obj;
            if (creditOfferLimitUiModel == null || (list = C41339p.m119900e(creditOfferLimitUiModel)) == null) {
                m71218qx();
                return;
            }
        }
        C1644x xVar = this.f58527v;
        OfferInfo offerInfo2 = this.f58517l;
        if (offerInfo2 == null) {
            C41536l.m120506z("offerInfo");
        } else {
            offerInfo = offerInfo2;
        }
        xVar.mo4823o(C32343x.m95466m(new C21990b(offerInfo, list)));
    }

    /* renamed from: qx */
    private final void m71218qx() {
        this.f58528w.mo4823o(C32343x.m95466m(C41238w.f97225a));
    }

    /* access modifiers changed from: private */
    /* renamed from: rx */
    public final void m71220rx(List list) {
        C21992d dVar;
        boolean z;
        Boolean a;
        Object obj;
        boolean z2;
        boolean z3;
        if (list.isEmpty()) {
            m71218qx();
            return;
        }
        OfferInfo offerInfo = this.f58517l;
        OfferInfo offerInfo2 = null;
        if (offerInfo == null) {
            C41536l.m120506z("offerInfo");
            offerInfo = null;
        }
        OfferProductCode productCode = offerInfo.getProductCode();
        if (C41536l.m120484d(productCode, OfferProductCode.C21012EL.f56473f)) {
            dVar = C21992d.EXPRESS_LOAN;
        } else {
            boolean z4 = true;
            if (C41536l.m120484d(productCode, OfferProductCode.C21002BA.f56468f)) {
                z2 = true;
            } else {
                z2 = C41536l.m120484d(productCode, OfferProductCode.C21004BE.f56469f);
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = C41536l.m120484d(productCode, OfferProductCode.C21008CL.f56471f);
            }
            if (!z3) {
                z4 = C41536l.m120484d(productCode, OfferProductCode.C21023RL.f56479f);
            }
            if (z4) {
                dVar = C21992d.CONSUMER_LOAN;
            } else {
                m71218qx();
                return;
            }
        }
        if (this.f58519n) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((LoanOfferLimitUiModel) obj).mo54646e().mo66359b(), this.f58518m)) {
                    break;
                }
            }
            LoanOfferLimitUiModel loanOfferLimitUiModel = (LoanOfferLimitUiModel) obj;
            if (loanOfferLimitUiModel == null || (list = C41339p.m119900e(loanOfferLimitUiModel)) == null) {
                m71218qx();
                return;
            }
        }
        C20557a b = this.f58516k.mo48775b("LOAN_ACTIVATION_REDESIGN_ENABLED");
        if (b == null || (a = b.mo49084a()) == null) {
            z = false;
        } else {
            z = a.booleanValue();
        }
        C1644x xVar = this.f58526u;
        OfferInfo offerInfo3 = this.f58517l;
        if (offerInfo3 == null) {
            C41536l.m120506z("offerInfo");
        } else {
            offerInfo2 = offerInfo3;
        }
        xVar.mo4823o(C32343x.m95466m(new C21991c(dVar, offerInfo2, list, z)));
    }

    /* renamed from: Dw */
    public final void mo54657Dw(String str, String str2, String str3) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "otp");
        C41536l.m120489i(str3, "otpRequestId");
        if (this.f58505B != null) {
            C41205b I = this.f58511f.mo70750a(mo54667ix(mo54669kx(str, str2, str3, true))).mo95063B(C40992a.m118827a()).mo95083l(new C26124a(new C21993e(this))).mo95070I(new C26130g(new C21994f(this)), new C26131h(new C21995g(this)));
            C41536l.m120488h(I, "fun confirmCRI(operation…).bindToLifecycle()\n    }");
            bindToLifecycle(I);
        }
    }

    /* renamed from: Pw */
    public final LiveData mo54658Pw() {
        return this.f58522q;
    }

    /* renamed from: Qw */
    public final LiveData mo54659Qw() {
        return this.f58527v;
    }

    /* renamed from: Rw */
    public final LiveData mo54660Rw() {
        return this.f58521p;
    }

    /* renamed from: Sw */
    public final LiveData mo54661Sw() {
        return this.f58525t;
    }

    /* renamed from: Xw */
    public final LiveData mo54662Xw() {
        return this.f58523r;
    }

    /* renamed from: Zw */
    public final LiveData mo54663Zw() {
        return this.f58529x;
    }

    /* renamed from: ax */
    public final LiveData mo54664ax() {
        return this.f58531z;
    }

    /* renamed from: bx */
    public final LiveData mo54665bx() {
        return this.f58526u;
    }

    /* renamed from: cx */
    public final LiveData mo54666cx() {
        return this.f58524s;
    }

    /* renamed from: ix */
    public final HashMap mo54667ix(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f58515j.mo66809a(otpParams);
    }

    /* renamed from: jx */
    public final LiveData mo54668jx() {
        return this.f58504A;
    }

    /* renamed from: kx */
    public final CreditInfoRepositoryImpl.ConfirmCriParams mo54669kx(String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        String str6;
        String b;
        String a;
        C19278a aVar = this.f58505B;
        if (aVar == null || (a = aVar.mo47499a()) == null) {
            str4 = null;
        } else {
            byte[] bytes = a.getBytes(C40407d.f95989b);
            C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
            str4 = C32359z0.m95597y(bytes);
        }
        if (z) {
            C41536l.m120486f(str4);
            str5 = str4;
        } else {
            str5 = "";
        }
        C19278a aVar2 = this.f58505B;
        if (aVar2 == null || (b = aVar2.mo47500b()) == null) {
            str6 = "";
        } else {
            str6 = b;
        }
        return new CreditInfoRepositoryImpl.ConfirmCriParams(str5, PensionStatusResult.STATUS_ACTIVE, "CREDIT_INFO_GET_CUSTOMER_INFO_OFFER", "", str6, str, str2, str3, (String) null, C11398b.f33139r, (DefaultConstructorMarker) null);
    }

    /* renamed from: mx */
    public final LiveData mo54670mx() {
        return this.f58520o;
    }

    /* renamed from: nx */
    public final void mo54671nx(OfferInfo offerInfo, String str, boolean z) {
        C41536l.m120489i(offerInfo, "offerInfo");
        this.f58517l = offerInfo;
        this.f58518m = str;
        this.f58519n = z;
        m71195Yw();
    }
}
