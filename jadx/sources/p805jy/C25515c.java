package p805jy;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import g91.C32343x;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.leadapplication.presentation.activity.LeadApplicationResultActivity;
import p341ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p90.C27360l7;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: jy.c */
public final class C25515c extends C25513a {

    /* renamed from: N */
    public static final C25516a f65187N = new C25516a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private final C41217g f65188K;

    /* renamed from: L */
    private C27360l7 f65189L;

    /* renamed from: M */
    private final C41217g f65190M = C41219i.m119470b(new C25523h(this));

    /* renamed from: jy.c$a */
    public static final class C25516a {
        private C25516a() {
        }

        public /* synthetic */ C25516a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25515c mo64064a(OfferInfo offerInfo) {
            C41536l.m120489i(offerInfo, "offer");
            C25515c cVar = new C25515c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("OFFER_ARG", offerInfo)));
            return cVar;
        }
    }

    /* renamed from: jy.c$b */
    /* synthetic */ class C25517b extends C41535k implements C43075l {
        C25517b(Object obj) {
            super(1, obj, C25515c.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo64065b(boolean z) {
            ((C25515c) this.receiver).m80698m2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64065b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: jy.c$c */
    /* synthetic */ class C25518c extends C41535k implements C43075l {
        C25518c(Object obj) {
            super(1, obj, C25515c.class, "setupViews", "setupViews(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo64066b(boolean z) {
            ((C25515c) this.receiver).m80700o2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64066b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: jy.c$d */
    static final class C25519d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25515c f65191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25519d(C25515c cVar) {
            super(1);
            this.f65191d = cVar;
        }

        /* renamed from: a */
        public final void mo64067a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f65191d.m80700o2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64067a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: jy.c$e */
    /* synthetic */ class C25520e extends C41535k implements C43075l {
        C25520e(Object obj) {
            super(1, obj, C25515c.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo64068b(boolean z) {
            ((C25515c) this.receiver).m80698m2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64068b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: jy.c$f */
    /* synthetic */ class C25521f extends C41535k implements C43075l {
        C25521f(Object obj) {
            super(1, obj, C25515c.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo64069b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C25515c) this.receiver).handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64069b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: jy.c$g */
    static final class C25522g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25515c f65192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25522g(C25515c cVar) {
            super(1);
            this.f65192d = cVar;
        }

        /* renamed from: a */
        public final void mo64070a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f65192d.m80699n2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64070a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: jy.c$h */
    static final class C25523h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25515c f65193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25523h(C25515c cVar) {
            super(0);
            this.f65193d = cVar;
        }

        /* renamed from: b */
        public final OfferInfo invoke() {
            Parcelable parcelable = this.f65193d.requireArguments().getParcelable("OFFER_ARG");
            C41536l.m120486f(parcelable);
            return (OfferInfo) parcelable;
        }
    }

    /* renamed from: jy.c$i */
    public static final class C25524i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f65194d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25524i(Fragment fragment) {
            super(0);
            this.f65194d = fragment;
        }

        public final Fragment invoke() {
            return this.f65194d;
        }
    }

    /* renamed from: jy.c$j */
    public static final class C25525j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f65195d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25525j(C43064a aVar) {
            super(0);
            this.f65195d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f65195d.invoke();
        }
    }

    /* renamed from: jy.c$k */
    public static final class C25526k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f65196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25526k(C41217g gVar) {
            super(0);
            this.f65196d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f65196d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: jy.c$l */
    public static final class C25527l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f65197d;

        /* renamed from: e */
        final /* synthetic */ C41217g f65198e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25527l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f65197d = aVar;
            this.f65198e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f65197d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f65198e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: jy.c$m */
    public static final class C25528m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f65199d;

        /* renamed from: e */
        final /* synthetic */ C41217g f65200e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25528m(Fragment fragment, C41217g gVar) {
            super(0);
            this.f65199d = fragment;
            this.f65200e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f65200e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f65199d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C25515c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C25525j(new C25524i(this)));
        this.f65188K = C1514j0.m5374c(this, C41520a0.m120436b(LeadApplicationActionSheetViewModel.class), new C25526k(a), new C25527l((C43064a) null, a), new C25528m(this, a));
    }

    /* renamed from: i2 */
    private final C27360l7 m80694i2() {
        C27360l7 l7Var = this.f65189L;
        C41536l.m120486f(l7Var);
        return l7Var;
    }

    /* renamed from: j2 */
    private final String m80695j2(boolean z) {
        OfferProductCode productCode = m80696k2().getProductCode();
        if (C41536l.m120484d(productCode, OfferProductCode.C21019ML.f56477f)) {
            if (z) {
                return C32343x.m95388F("offers.ML.action.sheet.info.text", new Object[0]);
            }
            return C32343x.m95388F("offers.ML.action.sheet.appl.already.exsts", new Object[0]);
        } else if (!C41536l.m120484d(productCode, OfferProductCode.C21025SL.f56480f)) {
            return "";
        } else {
            if (z) {
                return C32343x.m95388F("offers.SL.action.sheet.info.text", new Object[0]);
            }
            return C32343x.m95388F("offers.SL.action.sheet.appl.already.exists", new Object[0]);
        }
    }

    /* renamed from: k2 */
    private final OfferInfo m80696k2() {
        return (OfferInfo) this.f65190M.getValue();
    }

    /* renamed from: l2 */
    private final LeadApplicationActionSheetViewModel m80697l2() {
        return (LeadApplicationActionSheetViewModel) this.f65188K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m80698m2(boolean z) {
        CardView cardView = m80694i2().f69256g;
        C41536l.m120488h(cardView, "binding.progressBar");
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final void m80699n2() {
        LeadApplicationResultActivity.C21113a aVar = LeadApplicationResultActivity.f56673G;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo52368a(requireContext);
        mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m80700o2(boolean z) {
        C27360l7 i2 = m80694i2();
        i2.f69255f.setText(m80695j2(z));
        if (z) {
            i2.f69254e.setButtonText(C32343x.m95388F("offers.ML.SL.action.sheet.request.call.button", new Object[0]));
            i2.f69254e.setOnClickListener(new C25514b(this));
            return;
        }
        Button button = i2.f69254e;
        C41536l.m120488h(button, "contactBankerButton");
        C32343x.m95455i0(button);
    }

    private final void observeData() {
        C21484c.m69411c(m80697l2().mo52373rw(), this, new C25518c(this), new C25517b(this), new C25519d(this));
        C21484c.m69411c(m80697l2().mo52371mw(), this, new C25522g(this), new C25520e(this), new C25521f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m80701p2(C25515c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m80697l2().mo52370k0();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f65189L = C27360l7.m84750d(layoutInflater, viewGroup, true);
        String productName = m80696k2().getProductName();
        if (productName == null) {
            productName = "";
        }
        mo26370a2(productName);
        observeData();
        m80697l2().mo52372nw(m80696k2());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        C1533o.m5445b(this, "UnknownOfferActionSheet_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("UnknownOfferActionSheet_DISMISS_KEY", Boolean.TRUE)));
        super.onDismiss(dialogInterface);
    }
}
