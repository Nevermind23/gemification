package p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import mi0.C26233a;
import mi0.C26234b;
import o31.C37588a0;
import oh0.C27014i;
import oj0.C27022b;
import oj0.C27024d;
import p163m0.C7047a;
import p202p0.C7556l;
import p228r0.C8034d;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription.C24393b;
import p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription.C24399e;
import p642vh.C18338b0;
import pj0.C27550a;
import th0.C28420q;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment */
public final class TermsAndConditionsFragment extends C24392a {

    /* renamed from: i */
    public C24399e.C24400a f62955i;

    /* renamed from: j */
    private final C41217g f62956j;

    /* renamed from: k */
    private final C41217g f62957k;

    /* renamed from: l */
    private final C41217g f62958l;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$a */
    /* synthetic */ class C24378a extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C24378a f62959d = new C24378a();

        C24378a() {
            super(3, C28420q.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/giftcards/databinding/FragmentGiftCardsTermsAndConditionsBinding;", 0);
        }

        /* renamed from: b */
        public final C28420q mo62087b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C28420q.m87202d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo62087b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$b */
    static final class C24379b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TermsAndConditionsFragment f62960d;

        /* renamed from: e */
        final /* synthetic */ C28420q f62961e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24379b(TermsAndConditionsFragment termsAndConditionsFragment, C28420q qVar) {
            super(1);
            this.f62960d = termsAndConditionsFragment;
            this.f62961e = qVar;
        }

        /* renamed from: a */
        public final void mo62088a(C27024d dVar) {
            this.f62960d.m78379o1().mo6029i(dVar.mo66258e());
            this.f62961e.f72187e.setButtonText(C32343x.m95388F(dVar.mo66256c(), new Object[0]));
            this.f62961e.f72189g.setCurrentItem(dVar.mo66257d());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62088a((C27024d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$c */
    static final class C24380c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TermsAndConditionsFragment f62962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24380c(TermsAndConditionsFragment termsAndConditionsFragment) {
            super(1);
            this.f62962d = termsAndConditionsFragment;
        }

        /* renamed from: a */
        public final void mo62089a(C24395c cVar) {
            C41536l.m120489i(cVar, "event");
            C7556l a = C8034d.m30522a(this.f62962d);
            String string = this.f62962d.getString(C27014i.gift_cards_flow_extra);
            C41536l.m120488h(string, "getString(R.string.gift_cards_flow_extra)");
            cVar.mo62099a(a, string);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62089a((C24395c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$d */
    static final class C24381d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TermsAndConditionsFragment f62963d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$d$a */
        /* synthetic */ class C24382a implements C24393b.C24394a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C24399e f62964a;

            C24382a(C24399e eVar) {
                this.f62964a = eVar;
            }

            /* renamed from: Q */
            public final void mo62091Q(int i) {
                this.f62964a.mo62100Q(i);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C24393b.C24394a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f62964a, C24399e.class, "onPageSelected", "onPageSelected(I)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24381d(TermsAndConditionsFragment termsAndConditionsFragment) {
            super(0);
            this.f62963d = termsAndConditionsFragment;
        }

        /* renamed from: b */
        public final C24393b invoke() {
            return new C24393b(new C24382a(this.f62963d.m78380p1()));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$e */
    static final class C24383e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62965a;

        C24383e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62965a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62965a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62965a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$f */
    static final class C24384f extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C24384f f62966d = new C24384f();

        C24384f() {
            super(0);
        }

        /* renamed from: b */
        public final C26233a invoke() {
            return new C26233a(C41339p.m119900e(new C27550a()), (C26234b) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$g */
    public static final class C24385g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62967d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$g$a */
        public static final class C24386a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C43064a f62968d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24386a(C43064a aVar) {
                super(0);
                this.f62968d = aVar;
            }

            /* renamed from: b */
            public final C1613n0 invoke() {
                return (C1613n0) this.f62968d.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24385g(C43064a aVar) {
            super(0);
            this.f62967d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24386a(this.f62967d));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$h */
    public static final class C24387h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24387h(Fragment fragment) {
            super(0);
            this.f62969d = fragment;
        }

        public final Fragment invoke() {
            return this.f62969d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$i */
    public static final class C24388i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62970d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24388i(C43064a aVar) {
            super(0);
            this.f62970d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62970d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$j */
    public static final class C24389j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62971d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24389j(C41217g gVar) {
            super(0);
            this.f62971d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62971d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$k */
    public static final class C24390k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62972d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62973e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24390k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62972d = aVar;
            this.f62973e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62972d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62973e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment$l */
    static final class C24391l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TermsAndConditionsFragment f62974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24391l(TermsAndConditionsFragment termsAndConditionsFragment) {
            super(0);
            this.f62974d = termsAndConditionsFragment;
        }

        /* renamed from: b */
        public final C24399e invoke() {
            C24399e.C24400a m1 = this.f62974d.mo62086m1();
            TermsAndConditionsFragment termsAndConditionsFragment = this.f62974d;
            String string = termsAndConditionsFragment.getString(C27014i.gift_cards_flow_extra);
            C41536l.m120488h(string, "getString(R.string.gift_cards_flow_extra)");
            return m1.mo32839a((GiftCardsFlow.GiftCardIntroduction) C32343x.m95419U0(termsAndConditionsFragment, string));
        }
    }

    public TermsAndConditionsFragment() {
        super(C24378a.f62959d);
        C37588a0 a0Var = C37588a0.f90326a;
        C24385g gVar = new C24385g(new C24391l(this));
        C24387h hVar = new C24387h(this);
        C41222k kVar = C41222k.NONE;
        C41217g a = C41219i.m119469a(kVar, new C24388i(hVar));
        this.f62956j = C1514j0.m5374c(this, C41520a0.m120436b(C24399e.class), new C24389j(a), new C24390k((C43064a) null, a), gVar);
        this.f62957k = C41219i.m119469a(kVar, C24384f.f62966d);
        this.f62958l = C41219i.m119469a(kVar, new C24381d(this));
    }

    /* renamed from: n1 */
    private final C24393b m78378n1() {
        return (C24393b) this.f62958l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public final C26233a m78379o1() {
        return (C26233a) this.f62957k.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C24399e m78380p1() {
        return (C24399e) this.f62956j.getValue();
    }

    /* renamed from: q1 */
    private final void m78381q1() {
        C28420q qVar = (C28420q) mo64933i1();
        qVar.f72189g.mo6603h(m78378n1());
        qVar.f72187e.setOnClickListener(new C27022b(this, qVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m78382r1(TermsAndConditionsFragment termsAndConditionsFragment, C28420q qVar, View view) {
        C41536l.m120489i(termsAndConditionsFragment, "this$0");
        C41536l.m120489i(qVar, "$this_with");
        termsAndConditionsFragment.m78380p1().mo62103gw(qVar.f72189g.getCurrentItem());
    }

    /* renamed from: s1 */
    private final void m78383s1() {
        m78380p1().mo62102fw().mo4819k(getViewLifecycleOwner(), new C24383e(new C24379b(this, (C28420q) mo64933i1())));
        LiveData ew = m78380p1().mo62101ew();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(ew, viewLifecycleOwner, new C24380c(this));
    }

    /* renamed from: t1 */
    private final C18338b0 m78384t1() {
        ((C28420q) mo64933i1()).f72189g.setAdapter(m78379o1());
        C18338b0.C18341c cVar = new C18338b0.C18341c(0, false, 3, (DefaultConstructorMarker) null);
        ViewPager2 viewPager2 = ((C28420q) mo64933i1()).f72189g;
        C41536l.m120488h(viewPager2, "binding.giftCardIntroSliderContainer");
        FrameLayout frameLayout = ((C28420q) mo64933i1()).f72190h;
        C41536l.m120488h(frameLayout, "binding.giftCardScrollingIndicator");
        return cVar.mo46116a(viewPager2, frameLayout);
    }

    /* renamed from: m1 */
    public final C24399e.C24400a mo62086m1() {
        C24399e.C24400a aVar = this.f62955i;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        ((C28420q) mo64933i1()).f72189g.mo6614p(m78378n1());
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("giftcard.terms.of.use.title", new Object[0]));
        m78384t1();
        m78381q1();
        m78383s1();
    }
}
