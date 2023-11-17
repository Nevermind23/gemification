package p341ge.bog.mobilebank.giftcards.presentation.nomination;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import vh0.C29078d;
import wh0.C29393c;
import wh0.C29398f;
import wh0.C29404k;
import wh0.C29415v;
import yi0.C30071e;
import yi0.C30072f;
import yi0.C30073g;
import yi0.C30074h;
import yi0.C30075i;
import yi0.C30076j;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel */
public final class GiftCardsNominationViewModel$ViewModel extends C21481a implements C24295a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29393c f62784d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29415v f62785e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29398f f62786f;

    /* renamed from: g */
    private C24295a f62787g = this;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f62788h = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f62789i = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f62790j = new C1644x();

    /* renamed from: k */
    private final C40767b f62791k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f62792l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C30071e f62793m;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel$a */
    static final class C24288a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29404k f62794d;

        /* renamed from: e */
        final /* synthetic */ C30072f f62795e;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel$a$a */
        static final class C24289a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C30072f f62796d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24289a(C30072f fVar) {
                super(1);
                this.f62796d = fVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                return this.f62796d.mo70348a(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24288a(C29404k kVar, C30072f fVar) {
            super(1);
            this.f62794d = kVar;
            this.f62795e = fVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x A = this.f62794d.mo69244a("GIFTCARD_GREETING_CARD_TEXT_TEMPLATE").mo95062A(new C24297b(new C24289a(this.f62795e)));
            C41536l.m120488h(A, "mapper: GiftCardsNominat…  .map { mapper.map(it) }");
            return C31270e.m92880i(A, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel$b */
    static final class C24290b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsNominationViewModel$ViewModel f62797d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel$b$a */
        static final class C24291a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsNominationViewModel$ViewModel f62798d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24291a(GiftCardsNominationViewModel$ViewModel giftCardsNominationViewModel$ViewModel) {
                super(1);
                this.f62798d = giftCardsNominationViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo61973a(List list) {
                boolean z;
                C29078d a = this.f62798d.f62786f.mo69239a();
                GiftCardsNominationViewModel$ViewModel giftCardsNominationViewModel$ViewModel = this.f62798d;
                if (a.mo68951p().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    giftCardsNominationViewModel$ViewModel.f62793m = new C30071e(a.mo68951p(), a.mo68950o());
                    giftCardsNominationViewModel$ViewModel.f62792l.mo4823o(giftCardsNominationViewModel$ViewModel.f62793m);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61973a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24290b(GiftCardsNominationViewModel$ViewModel giftCardsNominationViewModel$ViewModel) {
            super(1);
            this.f62797d = giftCardsNominationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo61972a(C31128a aVar) {
            this.f62797d.f62788h.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C24291a(this.f62797d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61972a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel$c */
    static final class C24292c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsNominationViewModel$ViewModel f62799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24292c(GiftCardsNominationViewModel$ViewModel giftCardsNominationViewModel$ViewModel) {
            super(1);
            this.f62799d = giftCardsNominationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92880i(this.f62799d.f62784d.mo69235e(C40440x.m117146P0(this.f62799d.f62793m.mo70344b()).toString()), 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel$d */
    static final class C24293d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsNominationViewModel$ViewModel f62800d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel$d$a */
        static final class C24294a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsNominationViewModel$ViewModel f62801d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24294a(GiftCardsNominationViewModel$ViewModel giftCardsNominationViewModel$ViewModel) {
                super(1);
                this.f62801d = giftCardsNominationViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo61976a(boolean z) {
                this.f62801d.f62785e.mo69255a(C40440x.m117146P0(this.f62801d.f62793m.mo70344b()).toString(), this.f62801d.f62793m.mo70343a());
                C37224b.m109962a(this.f62801d.f62790j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61976a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24293d(GiftCardsNominationViewModel$ViewModel giftCardsNominationViewModel$ViewModel) {
            super(1);
            this.f62800d = giftCardsNominationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo61975a(C31128a aVar) {
            this.f62800d.f62789i.mo4823o(aVar);
            C41536l.m120488h(aVar, "data");
            C31132b.m92648j(aVar, (int[]) null, new C24294a(this.f62800d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61975a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftCardsNominationViewModel$ViewModel(C29404k kVar, C29393c cVar, C29415v vVar, C29398f fVar, C30072f fVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(kVar, "getNominationTemplates");
        C41536l.m120489i(cVar, "checkGiftCardNomination");
        C41536l.m120489i(vVar, "saveNominationTextUseCase");
        C41536l.m120489i(fVar, "getDraftPurchaseModel");
        C41536l.m120489i(fVar2, "mapper");
        this.f62784d = cVar;
        this.f62785e = vVar;
        this.f62786f = fVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f62791k = h1;
        this.f62792l = new C1644x();
        this.f62793m = new C30071e((String) null, false, 3, (DefaultConstructorMarker) null);
        C40749p L0 = onInit().mo94989L0(new C30073g(new C24288a(kVar, fVar2)));
        C41536l.m120488h(L0, "onInit().switchMap {\n   …le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C30074h(new C24290b(this)));
        C41536l.m120488h(F0, "onInit().switchMap {\n   …      }\n                }");
        bindToLifecycle(F0);
        m78173ww();
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m78162hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m78163iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ww */
    private final void m78173ww() {
        C40749p L0 = this.f62791k.mo94989L0(new C30075i(new C24292c(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C30076j(new C24293d(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final C40754t m78174xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m78175yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: F9 */
    public void mo61962F9() {
        C37224b.m109962a(this.f62790j);
    }

    /* renamed from: Jj */
    public void mo61963Jj(String str, boolean z) {
        C41536l.m120489i(str, "inputText");
        C30071e eVar = new C30071e(str, z);
        this.f62793m = eVar;
        this.f62792l.mo4823o(eVar);
    }

    /* renamed from: jn */
    public LiveData mo61964jn() {
        return this.f62788h;
    }

    /* renamed from: r */
    public void mo61965r() {
        this.f62791k.onNext(C41238w.f97225a);
    }

    /* renamed from: sw */
    public LiveData mo61966sw() {
        return this.f62789i;
    }

    /* renamed from: tw */
    public final C24295a mo61967tw() {
        return this.f62787g;
    }

    /* renamed from: uw */
    public LiveData mo61968uw() {
        return this.f62792l;
    }

    /* renamed from: vw */
    public LiveData mo61969vw() {
        return this.f62790j;
    }
}
