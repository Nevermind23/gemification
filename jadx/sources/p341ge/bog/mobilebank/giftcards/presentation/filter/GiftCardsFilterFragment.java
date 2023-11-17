package p341ge.bog.mobilebank.giftcards.presentation.filter;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0152h;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import com.google.android.flexbox.FlexboxLayout;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import oh0.C27008c;
import oh0.C27009d;
import oh0.C27010e;
import oh0.C27014i;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.bigchips.BigChips;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.filter.C24227c;
import si0.C28228a;
import si0.C28229b;
import si0.C28230c;
import si0.C28231d;
import th0.C28412m;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment */
public final class GiftCardsFilterFragment extends C24232d {

    /* renamed from: k */
    public static final C24211a f62664k = new C24211a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28412m f62665g;

    /* renamed from: h */
    private final C41217g f62666h = C41219i.m119470b(new C24212b(this));

    /* renamed from: i */
    public C24227c.C24231c f62667i;

    /* renamed from: j */
    private final C41217g f62668j;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$a */
    public static final class C24211a {
        private C24211a() {
        }

        public /* synthetic */ C24211a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$b */
    static final class C24212b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilterFragment f62669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24212b(GiftCardsFilterFragment giftCardsFilterFragment) {
            super(0);
            this.f62669d = giftCardsFilterFragment;
        }

        /* renamed from: b */
        public final GiftCardsFlow.Filter invoke() {
            Bundle arguments = this.f62669d.getArguments();
            GiftCardsFlow.Filter filter = arguments != null ? (GiftCardsFlow.Filter) arguments.getParcelable(this.f62669d.getString(C27014i.gift_cards_flow_extra)) : null;
            C41536l.m120486f(filter);
            return filter;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$c */
    public static final class C24213c extends C0152h {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilterFragment f62670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24213c(GiftCardsFilterFragment giftCardsFilterFragment) {
            super(true);
            this.f62670d = giftCardsFilterFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            if (this.f62670d.m77996v1().mo61874kw()) {
                C8034d.m30522a(this.f62670d).mo22123U();
                return;
            }
            C1505h activity = this.f62670d.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$d */
    /* synthetic */ class C24214d extends C41535k implements C43075l {
        C24214d(Object obj) {
            super(1, obj, GiftCardsFilterFragment.class, "setUpFilters", "setUpFilters(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo61864b(List list) {
            C41536l.m120489i(list, "p0");
            ((GiftCardsFilterFragment) this.receiver).m77983A1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61864b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$e */
    /* synthetic */ class C24215e extends C41535k implements C43075l {
        C24215e(Object obj) {
            super(1, obj, GiftCardsFilterFragment.class, "enableButtons", "enableButtons(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo61865b(boolean z) {
            ((GiftCardsFilterFragment) this.receiver).m77993r1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61865b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$f */
    static final class C24216f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilterFragment f62671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24216f(GiftCardsFilterFragment giftCardsFilterFragment) {
            super(1);
            this.f62671d = giftCardsFilterFragment;
        }

        /* renamed from: a */
        public final void mo61866a(Set set) {
            C41536l.m120489i(set, "it");
            C1533o.m5445b(this.f62671d, "FILTER_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("FILTER_RESULT_DATA", new GiftCardsFlow.FilteredOffers(false, set, 1, (DefaultConstructorMarker) null))));
            C8034d.m30522a(this.f62671d).mo22123U();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61866a((Set) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$g */
    static final class C24217g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilterFragment f62672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24217g(GiftCardsFilterFragment giftCardsFilterFragment) {
            super(1);
            this.f62672d = giftCardsFilterFragment;
        }

        /* renamed from: a */
        public final void mo61867a(Set set) {
            C41536l.m120489i(set, "categories");
            C8034d.m30522a(this.f62672d).mo22118M(C27010e.action_giftCardsFilterFragment_to_giftCardsFilteredOffersFragment, C0908e.m3336b(C41233s.m119492a(this.f62672d.getString(C27014i.gift_cards_flow_extra), new GiftCardsFlow.FilteredOffers(false, set))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61867a((Set) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$h */
    static final class C24218h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62673a;

        C24218h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62673a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62673a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62673a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$i */
    public static final class C24219i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62674d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24219i(Fragment fragment) {
            super(0);
            this.f62674d = fragment;
        }

        public final Fragment invoke() {
            return this.f62674d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$j */
    public static final class C24220j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24220j(C43064a aVar) {
            super(0);
            this.f62675d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62675d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$k */
    public static final class C24221k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24221k(C41217g gVar) {
            super(0);
            this.f62676d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62676d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$l */
    public static final class C24222l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62677d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62678e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24222l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62677d = aVar;
            this.f62678e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62677d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62678e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$m */
    static final class C24223m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsFilterFragment f62679d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment$m$a */
        static final class C24224a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ GiftCardsFilterFragment f62680d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24224a(GiftCardsFilterFragment giftCardsFilterFragment) {
                super(0);
                this.f62680d = giftCardsFilterFragment;
            }

            /* renamed from: b */
            public final C24227c invoke() {
                return this.f62680d.mo61862u1().mo32828a(this.f62680d.m77995t1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24223m(GiftCardsFilterFragment giftCardsFilterFragment) {
            super(0);
            this.f62679d = giftCardsFilterFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24224a(this.f62679d));
        }
    }

    public GiftCardsFilterFragment() {
        C24223m mVar = new C24223m(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24220j(new C24219i(this)));
        this.f62668j = C1514j0.m5374c(this, C41520a0.m120436b(C24227c.class), new C24221k(a), new C24222l((C43064a) null, a), mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m77983A1(List list) {
        C28412m s1 = m77994s1();
        if (!list.isEmpty()) {
            LayerView layerView = s1.f72140g;
            C41536l.m120488h(layerView, "categoryFilter");
            C32343x.m95447f1(layerView);
            FlexboxLayout flexboxLayout = s1.f72139f;
            flexboxLayout.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                flexboxLayout.addView(m77991p1((C28228a) it.next()));
            }
        }
    }

    private final void observeData() {
        C24227c v1 = m77996v1();
        v1.mo61873gf().mo4819k(getViewLifecycleOwner(), new C24218h(new C24214d(this)));
        v1.mo61875lw().mo4819k(getViewLifecycleOwner(), new C24218h(new C24215e(this)));
        LiveData nw = v1.mo61877nw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(nw, viewLifecycleOwner, new C24216f(this));
        LiveData mw = v1.mo61876mw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(mw, viewLifecycleOwner2, new C24217g(this));
    }

    /* renamed from: p1 */
    private final View m77991p1(C28228a aVar) {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        BigChips bigChips = new BigChips(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        int dimensionPixelSize = bigChips.getResources().getDimensionPixelSize(C27008c.f67784a);
        bigChips.setTitle(aVar.mo67758e());
        Image c = aVar.mo67756c();
        if (c == null) {
            c = new Image.Resource(C27009d.f67787c, (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        bigChips.setIconImage(c);
        bigChips.setTag(Long.valueOf(aVar.mo67757d()));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(0, 0, dimensionPixelSize, 0);
        bigChips.setLayoutParams(marginLayoutParams);
        bigChips.setActive(aVar.mo67760f());
        bigChips.setOnClickListener(new C28231d(bigChips, this, aVar));
        return bigChips;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m77992q1(BigChips bigChips, GiftCardsFilterFragment giftCardsFilterFragment, C28228a aVar, View view) {
        C41536l.m120489i(bigChips, "$this_apply");
        C41536l.m120489i(giftCardsFilterFragment, "this$0");
        C41536l.m120489i(aVar, "$category");
        bigChips.setActive(!bigChips.getActive());
        giftCardsFilterFragment.m77996v1().mo61872Wf(aVar.mo67757d());
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final void m77993r1(boolean z) {
        C28412m s1 = m77994s1();
        s1.f72142i.setEnabled(z);
        s1.f72143j.setEnabled(z);
    }

    /* renamed from: s1 */
    private final C28412m m77994s1() {
        C28412m mVar = this.f62665g;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final GiftCardsFlow.Filter m77995t1() {
        return (GiftCardsFlow.Filter) this.f62666h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final C24227c m77996v1() {
        return (C24227c) this.f62668j.getValue();
    }

    /* renamed from: x1 */
    private final C41238w m77997x1() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        C28412m s1 = m77994s1();
        s1.f72141h.setTitle(C32343x.m95388F("giftcard.merchant.list.categories.text", new Object[0]));
        s1.f72141h.setText(C32343x.m95388F("giftcard.merchant.filter.categories.title", new Object[0]));
        s1.f72142i.setButtonText(C32343x.m95388F("giftcard.categories.filter.button", new Object[0]));
        s1.f72143j.setButtonText(C32343x.m95388F("giftcard.categories.clear.filter.button", new Object[0]));
        s1.f72142i.setOnClickListener(new C28229b(this));
        s1.f72143j.setOnClickListener(new C28230c(this));
        C1505h activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return null;
        }
        onBackPressedDispatcher.mo342c(getViewLifecycleOwner(), new C24213c(this));
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m77998y1(GiftCardsFilterFragment giftCardsFilterFragment, View view) {
        C41536l.m120489i(giftCardsFilterFragment, "this$0");
        giftCardsFilterFragment.m77996v1().mo61871G();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m77999z1(GiftCardsFilterFragment giftCardsFilterFragment, View view) {
        C41536l.m120489i(giftCardsFilterFragment, "this$0");
        giftCardsFilterFragment.m77996v1().mo61878ow();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62665g = C28412m.m87170d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m77994s1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62665g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("giftcard.merchant.filter.header", new Object[0]));
        m77997x1();
        observeData();
    }

    /* renamed from: u1 */
    public final C24227c.C24231c mo61862u1() {
        C24227c.C24231c cVar = this.f62667i;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
