package p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1200m3;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import ap0.C10131d;
import ba1.C10145d;
import g91.C32343x;
import h41.C36151a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37224b;
import mp0.C16894f;
import mp0.C16895g;
import p163m0.C7047a;
import p202p0.C7556l;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.C15252c;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.C15257d;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.C15259e;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel;
import p341ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment */
public final class P2PLinkGenerationFragment extends C15251b {

    /* renamed from: g */
    private C10131d f43562g;

    /* renamed from: h */
    private final C41217g f43563h;

    /* renamed from: i */
    public C15252c f43564i;

    /* renamed from: j */
    public C15252c.C15254b f43565j;

    /* renamed from: k */
    public KeyboardVisibility f43566k;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$a */
    /* synthetic */ class C15223a extends C41535k implements C43075l {
        C15223a(Object obj) {
            super(1, obj, P2PLinkGenerationFragment.class, "setUiData", "setUiData(Lge/bog/mobilebank/linksharing/presentation/p2p_link_generation/P2PLinkGenerationViewModel$ViewModel$P2PLinkGenerationUiState;)V", 0);
        }

        /* renamed from: b */
        public final void mo42262b(P2PLinkGenerationViewModel$ViewModel.C15239a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((P2PLinkGenerationFragment) this.receiver).m55507x1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42262b((P2PLinkGenerationViewModel$ViewModel.C15239a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$b */
    /* synthetic */ class C15224b extends C41519a implements C43075l {
        C15224b(Object obj) {
            super(1, obj, C12910e.class, "showNegativeFeedBack", "showNegativeFeedBack(Landroid/app/Activity;Ljava/lang/String;Lge/bog/designsystem/components/bannerfeedback/FeedbackManager$Duration;Z)V", 1);
        }

        /* renamed from: b */
        public final void mo42263b(String str) {
            C41536l.m120489i(str, "p0");
            C1505h hVar = (C1505h) this.f97690d;
            C41536l.m120488h(hVar, "requireActivity()::showNegativeFeedBack");
            C12910e.m48790h(hVar, str, (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42263b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$c */
    static final class C15225c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationFragment f43567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15225c(P2PLinkGenerationFragment p2PLinkGenerationFragment) {
            super(1);
            this.f43567d = p2PLinkGenerationFragment;
        }

        /* renamed from: a */
        public final void mo42264a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f43567d).mo22121Q(C15259e.f43634a.mo42322b());
            C1505h requireActivity = this.f43567d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C12910e.m48797o(requireActivity, C32343x.m95388F("text.p2p.link.active.link.created.successfully", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42264a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$d */
    static final class C15226d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationFragment f43568d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$d$a */
        static final class C15227a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkGenerationFragment f43569d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15227a(P2PLinkGenerationFragment p2PLinkGenerationFragment) {
                super(1);
                this.f43569d = p2PLinkGenerationFragment;
            }

            /* renamed from: a */
            public final void mo42266a(C15257d dVar) {
                C41536l.m120489i(dVar, "dialog");
                this.f43569d.m55502r1().mo42274Bw();
                dVar.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42266a((C15257d) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15226d(P2PLinkGenerationFragment p2PLinkGenerationFragment) {
            super(1);
            this.f43568d = p2PLinkGenerationFragment;
        }

        /* renamed from: a */
        public final void mo42265a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C1505h requireActivity = this.f43568d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            View requireView = this.f43568d.requireView();
            C41536l.m120488h(requireView, "requireView()");
            C10145d.m37091e(requireActivity, requireView);
            C15257d.C15258a aVar = C15257d.f43631A;
            FragmentManager childFragmentManager = this.f43568d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            aVar.mo42317b(childFragmentManager, C40440x.m117146P0(this.f43568d.m55501n1().f28068k.getInputText()).toString(), new C15227a(this.f43568d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42265a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$e */
    static final class C15228e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43570a;

        C15228e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43570a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43570a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43570a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$f */
    static final class C15229f extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationFragment f43571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15229f(P2PLinkGenerationFragment p2PLinkGenerationFragment) {
            super(2);
            this.f43571d = p2PLinkGenerationFragment;
        }

        /* renamed from: a */
        public final void mo42269a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "bundle");
            this.f43571d.m55502r1().mo42280tw().mo42276D8(bundle.getInt("RESULT_KEY_SELECTED_POSITION"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo42269a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$g */
    static final class C15230g extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C10131d f43572d;

        /* renamed from: e */
        final /* synthetic */ P2PLinkGenerationFragment f43573e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15230g(C10131d dVar, P2PLinkGenerationFragment p2PLinkGenerationFragment) {
            super(2);
            this.f43572d = dVar;
            this.f43573e = p2PLinkGenerationFragment;
        }

        /* renamed from: a */
        public final void mo42270a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "<anonymous parameter 1>");
            if (this.f43572d.f28068k.getTextInput().isFocused()) {
                C1200m3.m4285a(this.f43573e.requireActivity().getWindow(), this.f43572d.f28068k.getTextInput()).mo3544f(WindowInsetsCompat.C1048m.m3907b());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo42270a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$h */
    static final class C15231h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationFragment f43574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15231h(P2PLinkGenerationFragment p2PLinkGenerationFragment) {
            super(0);
            this.f43574d = p2PLinkGenerationFragment;
        }

        public final void invoke() {
            C32343x.m95395I0(this.f43574d, "P2P_link", (String) null, "P2P_link_choose_specific_card", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
            C7556l a = C8034d.m30522a(this.f43574d);
            C15259e.C15261b bVar = C15259e.f43634a;
            P2PLinkGenerationViewModel$ViewModel.C15239a aVar = (P2PLinkGenerationViewModel$ViewModel.C15239a) this.f43574d.m55502r1().mo42283ww().mo42277Mj().mo4814f();
            Integer valueOf = aVar != null ? Integer.valueOf(aVar.mo42296i()) : null;
            if (valueOf != null) {
                a.mo22121Q(bVar.mo42321a(valueOf.intValue()));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$i */
    static final class C15232i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C10131d f43575d;

        /* renamed from: e */
        final /* synthetic */ P2PLinkGenerationFragment f43576e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15232i(C10131d dVar, P2PLinkGenerationFragment p2PLinkGenerationFragment) {
            super(0);
            this.f43575d = dVar;
            this.f43576e = p2PLinkGenerationFragment;
        }

        public final void invoke() {
            if (C40439w.m117118v(this.f43575d.f28068k.getInputText())) {
                this.f43575d.f28068k.mo35920c();
                this.f43575d.f28068k.setInfoText(C32343x.m95388F("text.p2p.link.customize.link.empty.error", new Object[0]));
            }
            if (!this.f43575d.f28064g.isChecked()) {
                this.f43575d.f28064g.setError(true);
                return;
            }
            C32343x.m95395I0(this.f43576e, "P2P_link", (String) null, "P2P_link_save_name_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
            this.f43576e.m55502r1().mo42275Cw();
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$j */
    public static final class C15233j implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationFragment f43577d;

        /* renamed from: e */
        final /* synthetic */ C10131d f43578e;

        public C15233j(P2PLinkGenerationFragment p2PLinkGenerationFragment, C10131d dVar) {
            this.f43577d = p2PLinkGenerationFragment;
            this.f43578e = dVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f43577d.m55502r1().mo42280tw().mo42278Xr(this.f43578e.f28068k.getInputText());
            C15252c o1 = this.f43577d.mo42259o1();
            P2PLinkGenerationViewModel$ViewModel.C15239a aVar = (P2PLinkGenerationViewModel$ViewModel.C15239a) this.f43577d.m55502r1().mo42283ww().mo42277Mj().mo4814f();
            if (aVar != null) {
                Input input = this.f43578e.f28068k;
                C41536l.m120488h(input, "inputNickname");
                o1.mo42313a(input, aVar.mo42289d());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$k */
    public static final class C15234k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15234k(Fragment fragment) {
            super(0);
            this.f43579d = fragment;
        }

        public final Fragment invoke() {
            return this.f43579d;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$l */
    public static final class C15235l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15235l(C43064a aVar) {
            super(0);
            this.f43580d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43580d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$m */
    public static final class C15236m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15236m(C41217g gVar) {
            super(0);
            this.f43581d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43581d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$n */
    public static final class C15237n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43582d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43583e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15237n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43582d = aVar;
            this.f43583e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43582d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43583e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment$o */
    public static final class C15238o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43584d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43585e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15238o(Fragment fragment, C41217g gVar) {
            super(0);
            this.f43584d = fragment;
            this.f43585e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f43585e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f43584d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public P2PLinkGenerationFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C15235l(new C15234k(this)));
        this.f43563h = C1514j0.m5374c(this, C41520a0.m120436b(P2PLinkGenerationViewModel$ViewModel.class), new C15236m(a), new C15237n((C43064a) null, a), new C15238o(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final C10131d m55501n1() {
        C10131d dVar = this.f43562g;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final P2PLinkGenerationViewModel$ViewModel m55502r1() {
        return (P2PLinkGenerationViewModel$ViewModel) this.f43563h.getValue();
    }

    /* renamed from: s1 */
    private final void m55503s1() {
        C15263g ww = m55502r1().mo42283ww();
        ww.mo42277Mj().mo4819k(getViewLifecycleOwner(), new C15228e(new C15223a(this)));
        LiveData z9 = ww.mo42286z9();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C37224b.m109963b(z9, viewLifecycleOwner, new C15224b(requireActivity));
        LiveData Yj = ww.mo42279Yj();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Yj, viewLifecycleOwner2, new C15225c(this));
        C1644x uw = m55502r1().mo42281uw();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(uw, viewLifecycleOwner3, new C15226d(this));
    }

    /* renamed from: t1 */
    private final void m55504t1() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C32343x.m95388F("text.p2p.link.customize.link.conditions", new Object[0])));
        PackageManager packageManager = requireActivity().getPackageManager();
        if (packageManager != null && intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
        }
    }

    /* renamed from: u1 */
    private final void m55505u1() {
        C10131d n1 = m55501n1();
        C1533o.m5446c(this, "REQUEST_KEY_SELECTED_POSITION", new C15229f(this));
        C1533o.m5446c(this, "RESULT_KEY_DIALOG_CLOSE", new C15230g(n1, this));
        CreditCardSmallPickerView creditCardSmallPickerView = n1.f28063f;
        C41536l.m120488h(creditCardSmallPickerView, "cardPickerAccount");
        C36151a.m107541b(creditCardSmallPickerView, 0, new C15231h(this), 1, (Object) null);
        n1.f28064g.setTextClickListener(new C16895g(this));
        n1.f28068k.getTextInput().addTextChangedListener(new C15233j(this, n1));
        Button button = n1.f28062e;
        C41536l.m120488h(button, "btnGenerate");
        C36151a.m107541b(button, 0, new C15232i(n1, this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m55506v1(P2PLinkGenerationFragment p2PLinkGenerationFragment) {
        C41536l.m120489i(p2PLinkGenerationFragment, "this$0");
        p2PLinkGenerationFragment.m55504t1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m55507x1(P2PLinkGenerationViewModel$ViewModel.C15239a aVar) {
        boolean z;
        C10131d n1 = m55501n1();
        n1.f28063f.setCreditCard(aVar.mo42294h());
        n1.f28071n.setStatusList(aVar.mo42297j());
        Input input = n1.f28068k;
        if (!C41536l.m120484d(input.getInputText(), aVar.mo42292f())) {
            input.setInputText(aVar.mo42292f());
        }
        C15252c o1 = mo42259o1();
        Input input2 = n1.f28068k;
        C41536l.m120488h(input2, "inputNickname");
        o1.mo42314b(input2, aVar);
        if (aVar.mo42298k()) {
            input.mo35921d();
        } else {
            if (aVar.mo42293g().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                input.mo35920c();
            } else {
                input.mo35919b();
            }
        }
        n1.f28063f.setTitleText(aVar.mo42288c());
        n1.f28062e.setLoading(aVar.mo42290e());
        m55501n1().f28068k.setEnabled(!aVar.mo42290e());
    }

    /* renamed from: y1 */
    private final void m55508y1() {
        C10131d n1 = m55501n1();
        KeyboardVisibility p1 = mo42260p1();
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        p1.mo84598a(requireActivity, viewLifecycleOwner, new C16894f(n1));
        n1.f28063f.mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("text.p2p.link.choose.account", new Object[0]), C32343x.m95388F("text.p2p.link.choosed.account", new Object[0])));
        n1.f28068k.setInfoText(mo42261q1().mo42315a(C32343x.m95388F("text.p2p.link.customize.link.nickname.exp", new Object[0])));
        n1.f28066i.setTitle(C32343x.m95388F("text.p2p.link.receive.acct.title", new Object[0]));
        n1.f28067j.setTitle(C32343x.m95388F("text.p2p.link.customize.link.title", new Object[0]));
        n1.f28067j.setText(C32343x.m95388F("text.p2p.link.customize.link.desc", new Object[0]));
        n1.f28068k.setHintText((CharSequence) C32343x.m95388F("text.p2p.link.customize.link.enter.nickname", new Object[0]));
        n1.f28071n.setTitle(C32343x.m95388F("text.p2p.link.customize.link.validation.title", new Object[0]));
        n1.f28064g.mo35145g(C32343x.m95388F("text.p2p.link.customize.link.egree.to.contitions", new Object[0]), C32343x.m95388F("text.p2p.link.customize.link.terms.colored.part", new Object[0]));
        n1.f28070m.mo53595c();
        n1.f28068k.getTextInput().setImeOptions(6);
        n1.f28062e.setButtonText(C32343x.m95388F("text.p2p.link.customize.link.save.btn", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m55509z1(C10131d dVar, boolean z) {
        C41536l.m120489i(dVar, "$this_with");
        if (z) {
            dVar.f28065h.fullScroll(130);
            dVar.f28068k.requestFocus();
        }
    }

    /* renamed from: o1 */
    public final C15252c mo42259o1() {
        C15252c cVar = this.f43564i;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("inputStateHandler");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f43562g = C10131d.m37053d(layoutInflater, viewGroup, false);
        StateView c = m55501n1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f43562g = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m55508y1();
        m55505u1();
        m55503s1();
    }

    public void onViewStateRestored(Bundle bundle) {
        String f;
        String obj;
        boolean z;
        super.onViewStateRestored(bundle);
        P2PLinkGenerationViewModel$ViewModel.C15239a aVar = (P2PLinkGenerationViewModel$ViewModel.C15239a) m55502r1().mo42283ww().mo42277Mj().mo4814f();
        boolean z2 = false;
        if (!(aVar == null || (f = aVar.mo42292f()) == null || (obj = C40440x.m117146P0(f).toString()) == null)) {
            if (obj.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            m55501n1().f28068k.setInputText("");
        }
    }

    /* renamed from: p1 */
    public final KeyboardVisibility mo42260p1() {
        KeyboardVisibility keyboardVisibility = this.f43566k;
        if (keyboardVisibility != null) {
            return keyboardVisibility;
        }
        C41536l.m120506z("keyboardVisibility");
        return null;
    }

    /* renamed from: q1 */
    public final C15252c.C15254b mo42261q1() {
        C15252c.C15254b bVar = this.f43565j;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("textFormatter");
        return null;
    }
}
