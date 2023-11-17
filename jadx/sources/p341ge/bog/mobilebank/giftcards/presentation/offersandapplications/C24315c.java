package p341ge.bog.mobilebank.giftcards.presentation.offersandapplications;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import hj0.C25034b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.details_sheet.GiftCardDetailsActionSheetUiModel;
import p341ge.bog.mobilebank.giftcards.presentation.offersandapplications.C24321d;
import ue1.C43075l;
import wh0.C29410q;
import zi0.C30311b;
import zi0.C30312c;
import zi0.C30314d;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.c */
public final class C24315c extends C21481a {

    /* renamed from: d */
    private final GiftCardsFlow.GiftCardOffersAndApplicationsDetails f62833d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25034b f62834e;

    /* renamed from: f */
    private final C29410q f62835f;

    /* renamed from: g */
    private final long f62836g;

    /* renamed from: h */
    private final C1644x f62837h;

    /* renamed from: i */
    private final LiveData f62838i;

    /* renamed from: j */
    private final C1644x f62839j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f62840k = new C1644x(Boolean.FALSE);

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.c$a */
    public interface C24316a {
        /* renamed from: a */
        C24315c mo32833a(GiftCardsFlow.GiftCardOffersAndApplicationsDetails giftCardOffersAndApplicationsDetails);
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.c$b */
    static final class C24317b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24315c f62841d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.c$b$a */
        static final class C24318a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24315c f62842d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24318a(C24315c cVar) {
                super(1);
                this.f62842d = cVar;
            }

            /* renamed from: a */
            public final void mo62012a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C24315c cVar = this.f62842d;
                cVar.m78229nw(new C24321d.C24325d(cVar.f62834e.mo63467a("giftcard.giver.resend.link.success.text")));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62012a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.c$b$b */
        static final class C24319b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24315c f62843d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24319b(C24315c cVar) {
                super(1);
                this.f62843d = cVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                this.f62843d.m78229nw(new C24321d.C24324c(th));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24317b(C24315c cVar) {
            super(1);
            this.f62841d = cVar;
        }

        /* renamed from: a */
        public final void mo62011a(C31128a aVar) {
            this.f62841d.f62840k.mo4823o(Boolean.valueOf(aVar instanceof C31128a.C31130b));
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C24318a(this.f62841d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C24319b(this.f62841d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62011a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.c$c */
    static final class C24320c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24320c f62844d = new C24320c();

        C24320c() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C30314d dVar) {
            return dVar.mo70636a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24315c(GiftCardsFlow.GiftCardOffersAndApplicationsDetails giftCardOffersAndApplicationsDetails, C30312c cVar, C25034b bVar, C29410q qVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(giftCardOffersAndApplicationsDetails, "offerDetailsModel");
        C41536l.m120489i(cVar, "stateMapper");
        C41536l.m120489i(bVar, "provideDictValue");
        C41536l.m120489i(qVar, "resendGiftCardUseCase");
        this.f62833d = giftCardOffersAndApplicationsDetails;
        this.f62834e = bVar;
        this.f62835f = qVar;
        this.f62836g = giftCardOffersAndApplicationsDetails.mo61642b().mo61979d();
        C1644x xVar = new C1644x(cVar.mo70630a(giftCardOffersAndApplicationsDetails.mo61642b()));
        this.f62837h = xVar;
        this.f62838i = C1607m0.m5655c(xVar, C24320c.f62844d);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m78228mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public final void m78229nw(C24321d dVar) {
        C37224b.m109966e(this.f62839j, dVar);
    }

    /* renamed from: c3 */
    public void mo62005c3() {
        m78229nw(new C24321d.C24323b(this.f62834e.mo63467a("giftcard.application.summary.page.checkbox.link.url")));
    }

    /* renamed from: hw */
    public LiveData mo62006hw() {
        return this.f62839j;
    }

    /* renamed from: iw */
    public LiveData mo62007iw() {
        return this.f62838i;
    }

    /* renamed from: jw */
    public LiveData mo62008jw() {
        return this.f62840k;
    }

    /* renamed from: kw */
    public void mo62009kw() {
        OffersAndApplicationDetailsUiModel b = this.f62833d.mo61642b();
        m78229nw(new C24321d.C24322a(new GiftCardDetailsActionSheetUiModel(b.mo61983f(), b.mo61985h(), b.mo61977a())));
    }

    /* renamed from: lw */
    public void mo62010lw() {
        C41205b F0 = C31270e.m92878g(C32343x.m95411Q0(this.f62835f.mo69250a(this.f62836g)), -1).mo94981F0(new C30311b(new C24317b(this)));
        C41536l.m120488h(F0, "override fun resendLink(…      }.bindToLifecycle()");
        bindToLifecycle(F0);
    }
}
