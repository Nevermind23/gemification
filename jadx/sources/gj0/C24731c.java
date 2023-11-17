package gj0;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import ee1.C40767b;
import g91.C32286a1;
import g91.C32343x;
import gj0.C24754h;
import gj0.C24759j;
import hd1.C41204a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hj0.C25033a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import oh0.C27006a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.received.C24362a;
import p341ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel;
import p642vh.C18368l;
import th0.C28394d;
import ue1.C43064a;
import ue1.C43075l;
import xh0.C29789f;

/* renamed from: gj0.c */
public final class C24731c extends C24362a {

    /* renamed from: R */
    public static final C24732a f63613R = new C24732a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C28394d f63614K;

    /* renamed from: L */
    public C24759j.C24760a f63615L;

    /* renamed from: M */
    private final C41217g f63616M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C41204a f63617N = new C41204a();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C40767b f63618O;

    /* renamed from: P */
    private final C41217g f63619P;

    /* renamed from: Q */
    private final C41217g f63620Q;

    /* renamed from: gj0.c$a */
    public static final class C24732a {
        private C24732a() {
        }

        public /* synthetic */ C24732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C24731c m79311b(C24732a aVar, List list, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo63123a(list, z);
        }

        /* renamed from: a */
        public final C24731c mo63123a(List list, boolean z) {
            C41536l.m120489i(list, "receivedCards");
            C24731c cVar = new C24731c();
            C41224m[] mVarArr = new C41224m[2];
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C24757i.m79335b((C29789f) it.next()));
            }
            mVarArr[0] = C41233s.m119492a("ARGS_RECEIVED_GIFT_CARDS", arrayList);
            mVarArr[1] = C41233s.m119492a("ARGS_FROM_DETAILS", Boolean.valueOf(z));
            cVar.setArguments(C0908e.m3336b(mVarArr));
            return cVar;
        }
    }

    /* renamed from: gj0.c$b */
    static final class C24733b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24731c f63621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24733b(C24731c cVar) {
            super(0);
            this.f63621d = cVar;
        }

        /* renamed from: b */
        public final C24750g invoke() {
            return new C24750g(this.f63621d.f63618O, this.f63621d.f63617N);
        }
    }

    /* renamed from: gj0.c$c */
    static final class C24734c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24731c f63622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24734c(C24731c cVar) {
            super(0);
            this.f63622d = cVar;
        }

        /* renamed from: b */
        public final C25033a invoke() {
            SensorManager sensorManager;
            Object systemService = this.f63622d.requireContext().getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                sensorManager = (SensorManager) systemService;
            } else {
                sensorManager = null;
            }
            return new C25033a(sensorManager, (GyroAnimationView) null, this.f63622d.f63618O, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: gj0.c$d */
    static final class C24735d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24731c f63623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24735d(C24731c cVar) {
            super(1);
            this.f63623d = cVar;
        }

        /* renamed from: a */
        public final void mo63126a(List list) {
            this.f63623d.m79300n2().mo6029i(list);
            this.f63623d.m79305t2(list.size());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63126a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gj0.c$e */
    static final class C24736e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24731c f63624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24736e(C24731c cVar) {
            super(1);
            this.f63624d = cVar;
        }

        /* renamed from: a */
        public final void mo63127a(ReceivedGiftCardUiModel receivedGiftCardUiModel) {
            this.f63624d.m79301o2().f71994e.setTitle(receivedGiftCardUiModel.mo62066g());
            this.f63624d.m79301o2().f71994e.setText(receivedGiftCardUiModel.mo62069i());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63127a((ReceivedGiftCardUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gj0.c$f */
    /* synthetic */ class C24737f extends C41519a implements C43075l {
        C24737f(Object obj) {
            super(1, obj, C32343x.class, "toggleVisibility", "toggleVisibility(Landroid/view/View;ZZ)V", 1);
        }

        /* renamed from: b */
        public final void mo63128b(boolean z) {
            Button button = (Button) this.f97690d;
            C41536l.m120488h(button, "binding.detailsBtn::toggleVisibility");
            C32343x.m95483r1(button, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63128b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: gj0.c$g */
    /* synthetic */ class C24738g extends C41535k implements C43075l {
        C24738g(Object obj) {
            super(1, obj, C24731c.class, "handleEvents", "handleEvents(Lge/bog/mobilebank/giftcards/presentation/received/ReceivedGiftCardUiEvent;)V", 0);
        }

        /* renamed from: b */
        public final void mo63129b(C24754h hVar) {
            C41536l.m120489i(hVar, "p0");
            ((C24731c) this.receiver).m79304s2(hVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63129b((C24754h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gj0.c$h */
    static final class C24739h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63625a;

        C24739h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63625a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63625a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63625a.invoke(obj);
        }
    }

    /* renamed from: gj0.c$i */
    public static final class C24740i extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ C24731c f63626a;

        C24740i(C24731c cVar) {
            this.f63626a = cVar;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.f63626a.m79303r2().mo63149ew().mo63154kw(i);
        }
    }

    /* renamed from: gj0.c$j */
    public static final class C24741j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24741j(Fragment fragment) {
            super(0);
            this.f63627d = fragment;
        }

        public final Fragment invoke() {
            return this.f63627d;
        }
    }

    /* renamed from: gj0.c$k */
    public static final class C24742k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24742k(C43064a aVar) {
            super(0);
            this.f63628d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f63628d.invoke();
        }
    }

    /* renamed from: gj0.c$l */
    public static final class C24743l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f63629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24743l(C41217g gVar) {
            super(0);
            this.f63629d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f63629d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: gj0.c$m */
    public static final class C24744m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63630d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63631e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24744m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f63630d = aVar;
            this.f63631e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63630d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f63631e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: gj0.c$n */
    static final class C24745n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24731c f63632d;

        /* renamed from: gj0.c$n$a */
        static final class C24746a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C24731c f63633d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24746a(C24731c cVar) {
                super(0);
                this.f63633d = cVar;
            }

            /* renamed from: b */
            public final C24759j invoke() {
                List list;
                boolean z;
                C24759j.C24760a p2 = this.f63633d.mo63122p2();
                Bundle arguments = this.f63633d.getArguments();
                if (arguments != null) {
                    list = arguments.getParcelableArrayList("ARGS_RECEIVED_GIFT_CARDS");
                } else {
                    list = null;
                }
                if (list == null) {
                    list = C41341q.m119907j();
                }
                Bundle arguments2 = this.f63633d.getArguments();
                if (arguments2 != null) {
                    z = arguments2.getBoolean("ARGS_FROM_DETAILS");
                } else {
                    z = false;
                }
                return p2.mo32837a(list, z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24745n(C24731c cVar) {
            super(0);
            this.f63632d = cVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C24746a(this.f63632d));
        }
    }

    public C24731c() {
        C24745n nVar = new C24745n(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24742k(new C24741j(this)));
        this.f63616M = C1514j0.m5374c(this, C41520a0.m120436b(C24759j.class), new C24743l(a), new C24744m((C43064a) null, a), nVar);
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create()");
        this.f63618O = h1;
        this.f63619P = C41219i.m119470b(new C24734c(this));
        this.f63620Q = C41219i.m119470b(new C24733b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final C24750g m79300n2() {
        return (C24750g) this.f63620Q.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final C28394d m79301o2() {
        C28394d dVar = this.f63614K;
        C41536l.m120486f(dVar);
        return dVar;
    }

    private final void observeData() {
        C24759j r2 = m79303r2();
        r2.mo63155s().mo4819k(getViewLifecycleOwner(), new C24739h(new C24735d(this)));
        r2.mo63151gw().mo4819k(getViewLifecycleOwner(), new C24739h(new C24736e(this)));
        LiveData dw = r2.mo63148dw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        Button button = m79301o2().f71995f;
        C41536l.m120488h(button, "binding.detailsBtn");
        dw.mo4819k(viewLifecycleOwner, new C24739h(new C24737f(button)));
        LiveData fw = r2.mo63150fw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(fw, viewLifecycleOwner2, new C24738g(this));
    }

    /* renamed from: q2 */
    private final C25033a m79302q2() {
        return (C25033a) this.f63619P.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final C24759j m79303r2() {
        return (C24759j) this.f63616M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m79304s2(C24754h hVar) {
        if (hVar instanceof C24754h.C24755a) {
            GiftCardsActivity.C24064a aVar = GiftCardsActivity.f62414H;
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            aVar.mo61584a(requireContext, new GiftCardsFlow.GiftCardDetails(false, ((C24754h.C24755a) hVar).mo63139a(), 1, (DefaultConstructorMarker) null));
        } else if (hVar instanceof C24754h.C24756b) {
            GiftCardsActivity.C24064a aVar2 = GiftCardsActivity.f62414H;
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            aVar2.mo61584a(requireContext2, new GiftCardsFlow.GiftCardIntroduction(false, false, ((C24754h.C24756b) hVar).mo63143a(), 3, (DefaultConstructorMarker) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m79305t2(int i) {
        C28394d o2 = m79301o2();
        o2.f71996g.setCurrentItem(0);
        ScrollingPagerIndicator scrollingPagerIndicator = o2.f71997h;
        ViewPager2 viewPager2 = m79301o2().f71996g;
        C41536l.m120488h(viewPager2, "binding.pager");
        scrollingPagerIndicator.mo53672c(viewPager2);
        ScrollingPagerIndicator scrollingPagerIndicator2 = o2.f71997h;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        scrollingPagerIndicator2.setSelectedDotColor(C18368l.m62755d(requireContext, C27006a.f67777a));
        ScrollingPagerIndicator scrollingPagerIndicator3 = o2.f71997h;
        C41536l.m120488h(scrollingPagerIndicator3, "scrollingIndicator");
        boolean z = true;
        if (i <= 1) {
            z = false;
        }
        C32343x.m95483r1(scrollingPagerIndicator3, z, false, 2, (Object) null);
    }

    /* renamed from: u2 */
    private final void m79306u2() {
        C28394d o2 = m79301o2();
        mo26370a2(C32343x.m95388F("giftcard.owner.popup.header", new Object[0]));
        o2.f71995f.setButtonText(C32343x.m95388F("giftcard.owner.popup.redirect.button", new Object[0]));
        o2.f71996g.setAdapter(m79300n2());
        o2.f71996g.mo6603h(new C24740i(this));
        o2.f71995f.setOnClickListener(new C24729a(this, o2));
        mo26361N1().setOnClickListener(new C24730b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m79307v2(C24731c cVar, C28394d dVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(dVar, "$this_with");
        cVar.m79303r2().mo63149ew().mo63153jw(dVar.f71996g.getCurrentItem());
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m79308w2(C24731c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m79303r2().mo63149ew().mo63152iw();
        cVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f63614K = C28394d.m87097d(layoutInflater, viewGroup, true);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f63617N.dispose();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63614K = null;
    }

    public void onPause() {
        super.onPause();
        m79302q2().mo63464b();
    }

    public void onResume() {
        super.onResume();
        m79302q2().mo63463a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo4586v1(false);
        m79306u2();
        observeData();
    }

    /* renamed from: p2 */
    public final C24759j.C24760a mo63122p2() {
        C24759j.C24760a aVar = this.f63615L;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
