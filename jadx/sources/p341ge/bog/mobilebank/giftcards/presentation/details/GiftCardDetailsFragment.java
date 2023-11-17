package p341ge.bog.mobilebank.giftcards.presentation.details;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import ed1.C40749p;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import hj0.C25033a;
import ij0.C25219b;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li0.C26028a;
import lj0.C26043e;
import lj0.C26044f;
import m41.C37224b;
import mi0.C26233a;
import mi0.C26234b;
import ni0.C26500a;
import ni0.C26501b;
import ni0.C26503c;
import ni0.C26504d;
import ni0.C26505e;
import ni0.C26506f;
import ni0.C26507g;
import ni0.C26508h;
import ni0.C26509i;
import ni0.C26510j;
import ni0.C26511k;
import ni0.C26512l;
import ni0.C26513m;
import ni0.C26514n;
import ni0.C26515o;
import o31.C37588a0;
import oh0.C27014i;
import oi0.C27015a;
import oi0.C27016b;
import oi0.C27017c;
import oi0.C27018d;
import oi0.C27019e;
import p163m0.C7047a;
import p202p0.C7556l;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationView;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.details.C24193c;
import qj0.C27842a;
import th0.C28400g;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43080q;
import zh0.C30308a;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment */
public final class GiftCardDetailsFragment extends C24209d implements C27019e, C27016b, C27017c, C27018d, C27015a, C27842a {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C41204a f62606i = new C41204a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C40767b f62607j;

    /* renamed from: k */
    private final C41217g f62608k;

    /* renamed from: l */
    public C24193c.C24200c f62609l;

    /* renamed from: m */
    private final C41217g f62610m;

    /* renamed from: n */
    private final C41217g f62611n;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$a */
    /* synthetic */ class C24172a extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C24172a f62612d = new C24172a();

        C24172a() {
            super(3, C28400g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/giftcards/databinding/FragmentGiftCardDetailsBinding;", 0);
        }

        /* renamed from: b */
        public final C28400g mo61797b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C28400g.m87122d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo61797b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$b */
    static final class C24173b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardDetailsFragment f62613d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$b$a */
        public static final class C24174a implements C26234b {

            /* renamed from: a */
            final /* synthetic */ GiftCardDetailsFragment f62614a;

            C24174a(GiftCardDetailsFragment giftCardDetailsFragment) {
                this.f62614a = giftCardDetailsFragment;
            }

            /* renamed from: a */
            public C40749p mo61799a() {
                return this.f62614a.f62607j;
            }

            /* renamed from: b */
            public C41204a mo61800b() {
                return this.f62614a.f62606i;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24173b(GiftCardDetailsFragment giftCardDetailsFragment) {
            super(0);
            this.f62613d = giftCardDetailsFragment;
        }

        /* renamed from: b */
        public final C26233a invoke() {
            return new C26233a(this.f62613d.m77904t1(), new C24174a(this.f62613d));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$c */
    static final class C24175c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardDetailsFragment f62615d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24175c(GiftCardDetailsFragment giftCardDetailsFragment) {
            super(0);
            this.f62615d = giftCardDetailsFragment;
        }

        /* renamed from: b */
        public final C25033a invoke() {
            SensorManager sensorManager;
            Object systemService = this.f62615d.requireContext().getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                sensorManager = (SensorManager) systemService;
            } else {
                sensorManager = null;
            }
            return new C25033a(sensorManager, (GyroAnimationView) null, this.f62615d.f62607j, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$d */
    /* synthetic */ class C24176d extends C41535k implements C43075l {
        C24176d(Object obj) {
            super(1, obj, C26233a.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo61802b(List list) {
            ((C26233a) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61802b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$e */
    static final class C24177e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardDetailsFragment f62616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24177e(GiftCardDetailsFragment giftCardDetailsFragment) {
            super(1);
            this.f62616d = giftCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo61803a(C24186a aVar) {
            C41536l.m120489i(aVar, "event");
            C1505h requireActivity = this.f62616d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C7556l a = C8034d.m30522a(this.f62616d);
            FragmentManager childFragmentManager = this.f62616d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            aVar.mo61808a(requireActivity, a, childFragmentManager);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61803a((C24186a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$f */
    static final class C24178f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62617a;

        C24178f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62617a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62617a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62617a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$g */
    public static final class C24179g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62618d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$g$a */
        public static final class C24180a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C43064a f62619d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24180a(C43064a aVar) {
                super(0);
                this.f62619d = aVar;
            }

            /* renamed from: b */
            public final C1613n0 invoke() {
                return (C1613n0) this.f62619d.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24179g(C43064a aVar) {
            super(0);
            this.f62618d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24180a(this.f62618d));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$h */
    public static final class C24181h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24181h(Fragment fragment) {
            super(0);
            this.f62620d = fragment;
        }

        public final Fragment invoke() {
            return this.f62620d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$i */
    public static final class C24182i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24182i(C43064a aVar) {
            super(0);
            this.f62621d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62621d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$j */
    public static final class C24183j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24183j(C41217g gVar) {
            super(0);
            this.f62622d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62622d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$k */
    public static final class C24184k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62623d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62624e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24184k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62623d = aVar;
            this.f62624e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62623d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62624e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment$l */
    static final class C24185l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardDetailsFragment f62625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24185l(GiftCardDetailsFragment giftCardDetailsFragment) {
            super(0);
            this.f62625d = giftCardDetailsFragment;
        }

        /* renamed from: b */
        public final C24193c invoke() {
            C24193c.C24200c n1 = this.f62625d.mo61795n1();
            GiftCardDetailsFragment giftCardDetailsFragment = this.f62625d;
            String string = giftCardDetailsFragment.getString(C27014i.gift_cards_flow_extra);
            C41536l.m120488h(string, "getString(R.string.gift_cards_flow_extra)");
            return n1.mo32825a((GiftCardsFlow.GiftCardDetails) C32343x.m95419U0(giftCardDetailsFragment, string));
        }
    }

    public GiftCardDetailsFragment() {
        super(C24172a.f62612d);
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create()");
        this.f62607j = h1;
        this.f62608k = C41219i.m119470b(new C24175c(this));
        C37588a0 a0Var = C37588a0.f90326a;
        C24179g gVar = new C24179g(new C24185l(this));
        C24181h hVar = new C24181h(this);
        C41222k kVar = C41222k.NONE;
        C41217g a = C41219i.m119469a(kVar, new C24182i(hVar));
        this.f62610m = C1514j0.m5374c(this, C41520a0.m120436b(C24193c.class), new C24183j(a), new C24184k((C43064a) null, a), gVar);
        this.f62611n = C41219i.m119469a(kVar, new C24173b(this));
    }

    /* renamed from: o1 */
    private final C26233a m77899o1() {
        return (C26233a) this.f62611n.getValue();
    }

    /* renamed from: p1 */
    private final C25033a m77900p1() {
        return (C25033a) this.f62608k.getValue();
    }

    /* renamed from: q1 */
    private final C24193c m77901q1() {
        return (C24193c) this.f62610m.getValue();
    }

    /* renamed from: r1 */
    private final void m77902r1() {
        C24193c q1 = m77901q1();
        q1.mo61834xw().mo4819k(getViewLifecycleOwner(), new C24178f(new C24176d(m77899o1())));
        LiveData uw = q1.mo61833uw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(uw, viewLifecycleOwner, new C24177e(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_CARD_PURPOSE_DISMISS", getViewLifecycleOwner(), new C26028a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m77903s1(GiftCardDetailsFragment giftCardDetailsFragment, String str, Bundle bundle) {
        C41536l.m120489i(giftCardDetailsFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("RESULT_KEY_ACTION_SHEET_DISMISSED"));
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            giftCardDetailsFragment.m77901q1().mo61827Dw();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final List m77904t1() {
        return C41341q.m119910m(new C26500a(C41339p.m119900e(C26505e.f67096a), this), new C26510j(this), new C26507g(this), new C26511k(this), new C26512l(this), new C26501b(this), C26513m.f67102a, C26515o.f67104a, new C25219b(this), C26503c.f67094a, C26514n.f67103a, new C26508h(), C26506f.f67097a, C26504d.f67095a, new C26509i());
    }

    /* renamed from: C0 */
    public void mo61787C0() {
        m77901q1().mo61828Ew();
    }

    /* renamed from: J */
    public void mo61788J(List list) {
        C41536l.m120489i(list, "storesList");
        m77901q1().mo61829Fw(list);
    }

    /* renamed from: R0 */
    public void mo61789R0(int i) {
        m77901q1().mo61826Cw(i);
    }

    /* renamed from: W0 */
    public void mo61790W0(String str) {
        C41536l.m120489i(str, "code");
        m77901q1().mo61824Aw(str);
    }

    /* renamed from: b */
    public void mo61791b() {
        m77901q1().mo61832Iw();
    }

    /* renamed from: c0 */
    public void mo61792c0() {
        m77901q1().mo61830Gw();
    }

    /* renamed from: e0 */
    public void mo61793e0() {
        m77901q1().mo61831Hw();
    }

    /* renamed from: h */
    public void mo61794h() {
        m77901q1().mo61835yw();
    }

    /* renamed from: n1 */
    public final C24193c.C24200c mo61795n1() {
        C24193c.C24200c cVar = this.f62609l;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f62606i.dispose();
    }

    public void onPause() {
        super.onPause();
        m77900p1().mo63464b();
    }

    public void onResume() {
        super.onResume();
        m77900p1().mo63463a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        RecyclerView recyclerView = ((C28400g) mo64933i1()).f72023e;
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.discovery.page.tab.giftcard", new Object[0]));
        recyclerView.setAdapter(m77899o1());
        C1505h activity = getActivity();
        C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.giftcards.presentation.activity.ContentScrollListener");
        recyclerView.mo5363n(new C26043e((C30308a) activity, (C26044f) null, false, 6, (DefaultConstructorMarker) null));
        m77902r1();
    }

    /* renamed from: x0 */
    public void mo61796x0() {
        m77901q1().mo61825Bw();
    }
}
