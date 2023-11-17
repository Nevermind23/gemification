package p341ge.bog.mobilebank.giftcards.presentation.purchase;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.activity.C0152h;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import com.github.mikephil.charting.utils.Utils;
import ee1.C40767b;
import ej0.C20246a;
import ej0.C20247b;
import ej0.C20248c;
import ej0.C20249d;
import ej0.C20250e;
import ej0.C20251f;
import fj0.C20497c;
import g91.C32319m;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41145d;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hi0.C25028a;
import hj0.C25033a;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj0.C26041d;
import m41.C37224b;
import oh0.C27009d;
import oh0.C27010e;
import oh0.C27014i;
import p163m0.C7047a;
import p202p0.C7556l;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.purchase.C24350a;
import p420fh.C12902d;
import p434gh.C15278a;
import th0.C28404i;
import ue1.C43064a;
import ue1.C43075l;
import vh0.C29076b;
import vh0.C29078d;
import xh0.C29790g;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment */
public final class GiftCardsPurchaseFragment extends C24360d implements C41185v.C41186a {

    /* renamed from: j */
    public static final C24326a f62849j = new C24326a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28404i f62850g;

    /* renamed from: h */
    private final C41217g f62851h;

    /* renamed from: i */
    private final C41217g f62852i = C41219i.m119470b(new C24328c(this));

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$a */
    public static final class C24326a {
        private C24326a() {
        }

        public /* synthetic */ C24326a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$b */
    public /* synthetic */ class C24327b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62853a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                xh0.g[] r0 = xh0.C29790g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xh0.g r1 = xh0.C29790g.VALID_DAYS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xh0.g r1 = xh0.C29790g.EXP_DATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xh0.g r1 = xh0.C29790g.UNLIMITED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f62853a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment.C24327b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$c */
    static final class C24328c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseFragment f62854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24328c(GiftCardsPurchaseFragment giftCardsPurchaseFragment) {
            super(0);
            this.f62854d = giftCardsPurchaseFragment;
        }

        /* renamed from: b */
        public final C25033a invoke() {
            SensorManager sensorManager;
            Object systemService = this.f62854d.requireContext().getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                sensorManager = (SensorManager) systemService;
            } else {
                sensorManager = null;
            }
            return new C25033a(sensorManager, this.f62854d.m78245A1().f72054r, (C40767b) null, 4, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$d */
    public static final class C24329d extends C0152h {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseFragment f62855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24329d(GiftCardsPurchaseFragment giftCardsPurchaseFragment) {
            super(true);
            this.f62855d = giftCardsPurchaseFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            if (!(this.f62855d.m78248D1().mo62041tw().mo4814f() instanceof C31128a.C31130b)) {
                mo365f(false);
                C1505h activity = this.f62855d.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$e */
    /* synthetic */ class C24330e extends C41535k implements C43075l {
        C24330e(Object obj) {
            super(1, obj, GiftCardsPurchaseFragment.class, "setupDetails", "setupDetails(Lge/bog/mobilebank/giftcards/domain/PurchaseModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo62029b(C29078d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((GiftCardsPurchaseFragment) this.receiver).m78261Q1(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62029b((C29078d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$f */
    /* synthetic */ class C24331f extends C41535k implements C43075l {
        C24331f(Object obj) {
            super(1, obj, GiftCardsPurchaseFragment.class, "setupAnimation", "setupAnimation(Lge/bog/mobilebank/giftcards/presentation/chooseanimation/model/AnimationUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo62030b(C25028a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((GiftCardsPurchaseFragment) this.receiver).m78260P1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62030b((C25028a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$g */
    /* synthetic */ class C24332g extends C41535k implements C43075l {
        C24332g(Object obj) {
            super(1, obj, CreditCardSmallPickerView.class, "setCreditCard", "setCreditCard(Lge/bog/designsystem/components/creditcardsmallpicker/CreditCardSmallPickerView$CreditCardSmallPickerModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo62031b(CreditCardSmallPickerView.C13279b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((CreditCardSmallPickerView) this.receiver).setCreditCard(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62031b((CreditCardSmallPickerView.C13279b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$h */
    static final class C24333h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseFragment f62856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24333h(GiftCardsPurchaseFragment giftCardsPurchaseFragment) {
            super(1);
            this.f62856d = giftCardsPurchaseFragment;
        }

        /* renamed from: a */
        public final void mo62032a(C24350a aVar) {
            C41536l.m120489i(aVar, "event");
            if (aVar instanceof C24350a.C24356f) {
                this.f62856d.m78265U1();
            } else if (aVar instanceof C24350a.C24357g) {
                this.f62856d.m78262R1(((C24350a.C24357g) aVar).mo62058a());
            } else if (aVar instanceof C24350a.C24351a) {
                this.f62856d.m78255K1();
            } else if (aVar instanceof C24350a.C24353c) {
                this.f62856d.m78257M1(((C24350a.C24353c) aVar).mo62055a());
            } else if (aVar instanceof C24350a.C24352b) {
                this.f62856d.m78256L1();
            } else if (aVar instanceof C24350a.C24355e) {
                this.f62856d.m78259O1();
            } else if (aVar instanceof C24350a.C24354d) {
                C24350a.C24354d dVar = (C24350a.C24354d) aVar;
                this.f62856d.m78258N1(dVar.mo62057b(), dVar.mo62056a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62032a((C24350a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$i */
    static final class C24334i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseFragment f62857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24334i(GiftCardsPurchaseFragment giftCardsPurchaseFragment) {
            super(1);
            this.f62857d = giftCardsPurchaseFragment;
        }

        /* renamed from: a */
        public final void mo62033a(C31128a aVar) {
            int i;
            boolean z = aVar instanceof C31128a.C31130b;
            this.f62857d.m78245A1().f72062z.getButton().setLoading(z);
            View view = this.f62857d.m78245A1().f72047k;
            C41536l.m120488h(view, "binding.cover");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (aVar instanceof C31128a.C31129a) {
                this.f62857d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62033a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$j */
    static final class C24335j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsPurchaseFragment f62858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24335j(GiftCardsPurchaseFragment giftCardsPurchaseFragment) {
            super(1);
            this.f62858d = giftCardsPurchaseFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            LayerView layerView = this.f62858d.m78245A1().f72046j;
            C41536l.m120488h(layerView, "binding.cardPickerLayerContainer");
            C41536l.m120488h(bool, "isVisible");
            C32343x.m95483r1(layerView, bool.booleanValue(), false, 2, (Object) null);
            FrameLayout frameLayout = this.f62858d.m78245A1().f72038C;
            C41536l.m120488h(frameLayout, "binding.termsCheckLayout");
            C32343x.m95483r1(frameLayout, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$k */
    static final class C24336k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62859a;

        C24336k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62859a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62859a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62859a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$l */
    public static final class C24337l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24337l(Fragment fragment) {
            super(0);
            this.f62860d = fragment;
        }

        public final Fragment invoke() {
            return this.f62860d;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$m */
    public static final class C24338m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24338m(C43064a aVar) {
            super(0);
            this.f62861d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62861d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$n */
    public static final class C24339n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24339n(C41217g gVar) {
            super(0);
            this.f62862d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62862d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$o */
    public static final class C24340o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62863d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62864e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24340o(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62863d = aVar;
            this.f62864e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62863d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62864e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment$p */
    public static final class C24341p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62865d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62866e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24341p(Fragment fragment, C41217g gVar) {
            super(0);
            this.f62865d = fragment;
            this.f62866e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f62866e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f62865d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public GiftCardsPurchaseFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24338m(new C24337l(this)));
        this.f62851h = C1514j0.m5374c(this, C41520a0.m120436b(GiftCardsPurchaseViewModel$ViewModel.class), new C24339n(a), new C24340o((C43064a) null, a), new C24341p(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final C28404i m78245A1() {
        C28404i iVar = this.f62850g;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* renamed from: B1 */
    private final String m78246B1(C29078d dVar) {
        int i;
        C29790g i2 = dVar.mo68944i();
        if (i2 == null) {
            i = -1;
        } else {
            i = C24327b.f62853a[i2.ordinal()];
        }
        if (i == 1) {
            String c = dVar.mo68936c();
            String F = C32343x.m95388F("giftcard.application.summary.page.validity.day", new Object[0]);
            return c + " " + F;
        } else if (i == 2) {
            return C32319m.m95295b(dVar.mo68940f());
        } else {
            if (i != 3) {
                return "";
            }
            return C32343x.m95388F("giftcard.application.summary.page.validity.unlimited", new Object[0]);
        }
    }

    /* renamed from: C1 */
    private final C25033a m78247C1() {
        return (C25033a) this.f62852i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final GiftCardsPurchaseViewModel$ViewModel m78248D1() {
        return (GiftCardsPurchaseViewModel$ViewModel) this.f62851h.getValue();
    }

    /* renamed from: E1 */
    private final void m78249E1() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        C1505h activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.mo342c(getViewLifecycleOwner(), new C24329d(this));
        }
    }

    /* renamed from: F1 */
    private final void m78250F1() {
        C28404i A1 = m78245A1();
        FrameLayout frameLayout = A1.f72043g;
        C41536l.m120488h(frameLayout, "cardAnimationLayout");
        C26041d.m81682c(frameLayout, Utils.FLOAT_EPSILON, 1, (Object) null);
        A1.f72052p.setStatus(InlineFeedback2.C13350a.INFO);
        A1.f72050n.setTitle(C32343x.m95388F("giftcard.application.summary.page.details", new Object[0]));
        A1.f72036A.setTitle(C32343x.m95388F("giftcard.application.summary.page.company", new Object[0]));
        A1.f72058v.setTitle(C32343x.m95388F("giftcard.application.summary.page.recipient.number", new Object[0]));
        A1.f72042f.setTitle(C32343x.m95388F("giftcard.application.summary.page.balance", new Object[0]));
        A1.f72049m.setTitle(C32343x.m95388F("giftcard.application.summary.page.send.date", new Object[0]));
        A1.f72039D.setTitle(C32343x.m95388F("giftcard.application.summary.page.validity", new Object[0]));
        A1.f72052p.setTitle(C32343x.m95388F("giftcard.application.summary.page.inline.feedback.title", new Object[0]));
        A1.f72052p.setDescription(C32343x.m95388F("giftcard.application.summary.page.inline.feedback.text", new Object[0]));
        A1.f72061y.setTitle(C32343x.m95388F("giftcard.giveaway.application.details.owner", new Object[0]));
        A1.f72037B.mo35145g(C32343x.m95388F("giftcard.application.summary.page.checkbox.agree", new Object[0]), C32343x.m95388F("giftcard.application.summary.page.checkbox.terms", new Object[0]));
        A1.f72045i.mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("giftcard.application.payment.method.sheet.title", new Object[0]), C32343x.m95388F("giftcard.application.payment.method.title", new Object[0])));
        A1.f72045i.setOnClickListener(new C20246a(this));
        A1.f72037B.setOnCheckedStateChangeListener(new C20247b(this));
        A1.f72037B.setTextClickListener(new C20248c(this));
        A1.f72062z.getButton().setOnClickListener(new C20249d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m78251G1(GiftCardsPurchaseFragment giftCardsPurchaseFragment, View view) {
        C41536l.m120489i(giftCardsPurchaseFragment, "this$0");
        giftCardsPurchaseFragment.m78248D1().mo62040sw().mo48727Og();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m78252H1(GiftCardsPurchaseFragment giftCardsPurchaseFragment, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(giftCardsPurchaseFragment, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        giftCardsPurchaseFragment.m78248D1().mo62040sw().mo48726K0(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m78253I1(GiftCardsPurchaseFragment giftCardsPurchaseFragment) {
        C41536l.m120489i(giftCardsPurchaseFragment, "this$0");
        giftCardsPurchaseFragment.m78248D1().mo62040sw().mo48728c3();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m78254J1(GiftCardsPurchaseFragment giftCardsPurchaseFragment, View view) {
        C41536l.m120489i(giftCardsPurchaseFragment, "this$0");
        giftCardsPurchaseFragment.m78248D1().mo62040sw().mo48725Ir();
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final void m78255K1() {
        GiftCardsFlow giftCardsFlow;
        Intent intent;
        C7556l a = C8034d.m30522a(this);
        int i = C27010e.action_giftCardsPurchaseFragment_to_giftCardsANimationsFragment;
        C41224m[] mVarArr = new C41224m[1];
        String string = getString(C27014i.gift_cards_flow_extra);
        C1505h activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            giftCardsFlow = null;
        } else {
            giftCardsFlow = (GiftCardsFlow) intent.getParcelableExtra("GIFT_CARDS_FLOW_DATA");
        }
        mVarArr[0] = C41233s.m119492a(string, giftCardsFlow);
        a.mo22118M(i, C0908e.m3336b(mVarArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final void m78256L1() {
        C8034d.m30522a(this).mo22117L(C27010e.action_giftCardsPurchaseFragment_to_giftCardsSuccessFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m78257M1(Long l) {
        C20497c.f55503O.mo49039a(l).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m78258N1(String str, C41145d dVar) {
        C41185v d = C41185v.C41187b.m119422d(C41185v.f97155C, str, dVar, (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        d.mo4576A1(childFragmentManager, "SCA_TAG");
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public final void m78259O1() {
        PackageManager packageManager;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C32343x.m95388F("giftcard.application.summary.page.checkbox.link.url", new Object[0])));
        C1505h activity = getActivity();
        if (activity != null && (packageManager = activity.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [ge.bog.designsystem.components.common.Image] */
    /* JADX WARNING: type inference failed for: r13v2, types: [ge.bog.designsystem.components.common.Image$Url] */
    /* JADX WARNING: type inference failed for: r7v4, types: [ge.bog.designsystem.components.common.Image$Animation$Url] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: P1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m78260P1(hi0.C25028a r24) {
        /*
            r23 = this;
            th0.i r0 = r23.m78245A1()
            ge.bog.designsystem.components.gyroanimation.GyroAnimationView r1 = r0.f72054r
            java.lang.String r2 = "gyroAnimationView"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.util.List r3 = r24.mo63428b()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x001c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r3 = r5
            goto L_0x001d
        L_0x001c:
            r3 = r4
        L_0x001d:
            r3 = r3 ^ r4
            r6 = 8
            if (r3 == 0) goto L_0x0024
            r3 = r5
            goto L_0x0025
        L_0x0024:
            r3 = r6
        L_0x0025:
            r1.setVisibility(r3)
            com.airbnb.lottie.LottieAnimationView r1 = r0.f72044h
            java.lang.String r3 = "cardBackground"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            java.util.List r7 = r24.mo63428b()
            if (r7 == 0) goto L_0x003d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r4 = r5
        L_0x003d:
            if (r4 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r5 = r6
        L_0x0041:
            r1.setVisibility(r5)
            java.util.List r1 = r24.mo63428b()
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L_0x0054
            ge.bog.designsystem.components.gyroanimation.GyroAnimationView r6 = r0.f72054r
            kotlin.jvm.internal.C41536l.m120488h(r6, r2)
            p341ge.bog.designsystem.components.gyroanimation.GyroAnimationView.m50185e(r6, r1, r5, r4, r5)
        L_0x0054:
            java.lang.String r8 = r24.mo63429c()
            if (r8 == 0) goto L_0x0065
            ge.bog.designsystem.components.common.Image$Animation$Url r1 = new ge.bog.designsystem.components.common.Image$Animation$Url
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0084
        L_0x0065:
            ge.bog.designsystem.components.common.Image$Url r1 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r14 = r24.mo63434g()
            ge.bog.designsystem.components.common.Image$Resource r15 = new ge.bog.designsystem.components.common.Image$Resource
            int r2 = oh0.C27009d.f67791j
            r15.<init>(r2, r5, r4, r5)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 124(0x7c, float:1.74E-43)
            r22 = 0
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0084:
            com.airbnb.lottie.LottieAnimationView r2 = r0.f72044h
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            p642vh.C18368l.m62746A(r2, r1, r5, r4, r5)
            android.widget.ImageView r1 = r0.f72055s
            java.lang.String r2 = "merchantLogo"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r7 = r24.mo63435h()
            if (r7 == 0) goto L_0x00a9
            ge.bog.designsystem.components.common.Image$Url r2 = new ge.bog.designsystem.components.common.Image$Url
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 126(0x7e, float:1.77E-43)
            r15 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00aa
        L_0x00a9:
            r2 = r5
        L_0x00aa:
            p642vh.C18368l.m62746A(r1, r2, r5, r4, r5)
            android.widget.TextView r1 = r0.f72041e
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.mo3946b()
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "root.context"
            kotlin.jvm.internal.C41536l.m120488h(r0, r2)
            java.lang.Boolean r2 = r24.mo63437i()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)
            if (r2 == 0) goto L_0x00cb
            int r2 = oh0.C27006a.f67782f
            goto L_0x00cd
        L_0x00cb:
            int r2 = oh0.C27006a.f67778b
        L_0x00cd:
            int r0 = p642vh.C18368l.m62755d(r0, r2)
            r1.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment.m78260P1(hi0.a):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final void m78261Q1(C29078d dVar) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        String str2;
        long j;
        boolean z4;
        C28404i A1 = m78245A1();
        boolean z5 = true;
        if (dVar.mo68945j() == C29076b.PURCHASE) {
            z = true;
        } else {
            z = false;
        }
        TwoLineTextItem twoLineTextItem = A1.f72058v;
        C41536l.m120488h(twoLineTextItem, "numberTwoLineText");
        if (dVar.mo68954s().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = 8;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        twoLineTextItem.setVisibility(i);
        View view = A1.f72056t;
        C41536l.m120488h(view, "numberDivider");
        if (dVar.mo68954s().length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        A1.f72058v.setText(dVar.mo68954s());
        if (z) {
            if (dVar.mo68953r().length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z5 = false;
            }
        }
        View view2 = A1.f72059w;
        C41536l.m120488h(view2, "ownerDivider");
        if (z5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        TwoLineTextItem twoLineTextItem2 = A1.f72061y;
        C41536l.m120488h(twoLineTextItem2, "ownerTwoLineText");
        if (z5) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        twoLineTextItem2.setVisibility(i4);
        A1.f72061y.setText(dVar.mo68953r());
        TwoLineTextItem twoLineTextItem3 = A1.f72039D;
        if (z) {
            str = m78246B1(dVar);
        } else {
            Long e = dVar.mo68938e();
            if (e != null) {
                j = e.longValue();
            } else {
                j = 0;
            }
            str = C32319m.m95295b(j);
        }
        twoLineTextItem3.setText(str);
        A1.f72036A.setText(dVar.mo68949n());
        A1.f72049m.setText(C32319m.m95295b(dVar.mo68940f()));
        TwoLineTextItem twoLineTextItem4 = A1.f72049m;
        C41536l.m120488h(twoLineTextItem4, "dateTwoLineText");
        if (z) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        twoLineTextItem4.setVisibility(i5);
        View view3 = A1.f72048l;
        C41536l.m120488h(view3, "dateDivider");
        if (z) {
            i6 = 0;
        }
        view3.setVisibility(i6);
        Button button = A1.f72062z.getButton();
        if (z) {
            str2 = C32343x.m95388F("giftcard.application.summary.page.buy.button", new Object[0]);
        } else {
            str2 = C32343x.m95388F("giftcard.giveaway.application.send.gift.button", new Object[0]);
        }
        button.setButtonText(str2);
        TwoLineTextItem twoLineTextItem5 = A1.f72042f;
        String str3 = null;
        if (z) {
            String d = dVar.mo68937d();
            if (d != null) {
                str3 = C32343x.m95406O(d, "GEL");
            }
        } else {
            BigDecimal m = dVar.mo68948m();
            if (m != null) {
                str3 = C32343x.m95408P(m, "GEL");
            }
        }
        twoLineTextItem5.setText(str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public final void m78262R1(String str) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        dVar.mo35635M1(new Image.Resource(C27009d.number_information_illustration, (Boolean) null, 2, (DefaultConstructorMarker) null));
        dVar.mo35636N1(PageDescriptionView.C13421b.IMAGE);
        dVar.mo35648c2(str);
        dVar.mo35639Q1(C32343x.m95388F("giftcard.application.phone.number.popup.main.text", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("giftcard.application.phone.number.popup.confirm.button", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("giftcard.application.phone.number.popup.edit.button", new Object[0]));
        dVar.mo35645Y1(new C20250e(dVar, this));
        dVar.mo35641T1(new C20251f(this));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m78263S1(C13310d dVar, GiftCardsPurchaseFragment giftCardsPurchaseFragment, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(giftCardsPurchaseFragment, "this$0");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        giftCardsPurchaseFragment.m78248D1().mo62040sw().mo48729nk();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m78264T1(GiftCardsPurchaseFragment giftCardsPurchaseFragment, Button button) {
        C41536l.m120489i(giftCardsPurchaseFragment, "this$0");
        C41536l.m120489i(button, "it");
        giftCardsPurchaseFragment.m78248D1().mo62046xw();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m78265U1() {
        m78245A1().f72037B.setError(true);
    }

    private final void observeData() {
        GiftCardsPurchaseViewModel$ViewModel D1 = m78248D1();
        D1.mo62042uw().mo4819k(getViewLifecycleOwner(), new C24336k(new C24330e(this)));
        D1.mo62039rw().mo4819k(getViewLifecycleOwner(), new C24336k(new C24331f(this)));
        LiveData vw = D1.mo62043vw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        CreditCardSmallPickerView creditCardSmallPickerView = m78245A1().f72045i;
        C41536l.m120488h(creditCardSmallPickerView, "binding.cardPicker");
        vw.mo4819k(viewLifecycleOwner, new C24336k(new C24332g(creditCardSmallPickerView)));
        LiveData ww = D1.mo62045ww();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(ww, viewLifecycleOwner2, new C24333h(this));
        D1.mo62041tw().mo4819k(getViewLifecycleOwner(), new C24336k(new C24334i(this)));
        D1.mo62037pw().mo4819k(getViewLifecycleOwner(), new C24336k(new C24335j(this)));
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (C41536l.m120484d(str4, "SCA_TAG")) {
            m78248D1().mo62047yw(str, str3, str2);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v f0 = C32343x.m95446f0(childFragmentManager, "SCA_TAG");
        if (f0 != null) {
            f0.mo4577k1();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12902d.C12903a aVar = C12902d.f38098b;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
        String string = getString(C27014i.f67839a);
        C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
        e.mo33652k(string, C15278a.NEGATIVE, (C12902d.C12905b) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62850g = C28404i.m87138d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m78245A1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62850g = null;
    }

    public void onPause() {
        super.onPause();
        m78247C1().mo63464b();
    }

    public void onResume() {
        super.onResume();
        m78247C1().mo63463a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.discovery.page.tab.giftcard", new Object[0]));
        m78250F1();
        m78249E1();
        observeData();
    }
}
