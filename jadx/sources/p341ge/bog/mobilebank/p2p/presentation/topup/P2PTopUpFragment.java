package p341ge.bog.mobilebank.p2p.presentation.topup;

import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import ew0.C31846a;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import jw0.C36806c;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kw0.C37003a;
import kw0.C37004b;
import kw0.C37005c;
import kw0.C37006d;
import kw0.C37008f;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.p2p.presentation.P2PActivity;
import p341ge.bog.mobilebank.p2p.presentation.topup.C33562c;
import p341ge.bog.mobilebank.p2p.presentation.topup.C33566d;
import p341ge.bog.mobilebank.p2p.presentation.topup.C33568e;
import p420fh.C12902d;
import p420fh.C12910e;
import p547oi.C17199a;
import p547oi.C17201b;
import ue1.C43064a;
import ue1.C43075l;
import uv0.C39105b;
import uv0.C39106c;
import yv0.C40081f;

/* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment */
public final class P2PTopUpFragment extends C33560a {

    /* renamed from: j */
    public static final C33541a f81818j = new C33541a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C40081f f81819g;

    /* renamed from: h */
    public C33568e.C33575e f81820h;

    /* renamed from: i */
    private final C41217g f81821i;

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$a */
    public static final class C33541a {
        private C33541a() {
        }

        public /* synthetic */ C33541a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$b */
    static final class C33542b implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81822a;

        C33542b(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81822a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81822a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81822a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$c */
    public static final class C33543c implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpFragment f81823d;

        public C33543c(P2PTopUpFragment p2PTopUpFragment) {
            this.f81823d = p2PTopUpFragment;
        }

        public void afterTextChanged(Editable editable) {
            C33568e n1 = this.f81823d.m98485r1();
            String inputText = this.f81823d.m98484q1().f95290j.getInputText();
            String h = C32303f.m95197h("GEL");
            C41536l.m120488h(h, "getCcyLogo(\n            …GEL\n                    )");
            n1.mo79572xw(C40440x.m117146P0(C40439w.m117103B(inputText, h, "", false, 4, (Object) null)).toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$d */
    static final class C33544d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpFragment f81824d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$d$a */
        static final class C33545a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PTopUpFragment f81825d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33545a(P2PTopUpFragment p2PTopUpFragment) {
                super(1);
                this.f81825d = p2PTopUpFragment;
            }

            /* renamed from: a */
            public final void mo79534a(List list) {
                C41536l.m120489i(list, "cards");
                this.f81825d.m98484q1().f95295o.mo53595c();
                this.f81825d.m98484q1().f95290j.requestFocus();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79534a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$d$b */
        static final class C33546b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PTopUpFragment f81826d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33546b(P2PTopUpFragment p2PTopUpFragment) {
                super(1);
                this.f81826d = p2PTopUpFragment;
            }

            /* renamed from: a */
            public final void mo79535a(List list) {
                this.f81826d.m98484q1().f95295o.mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79535a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$d$c */
        static final class C33547c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PTopUpFragment f81827d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33547c(P2PTopUpFragment p2PTopUpFragment) {
                super(1);
                this.f81827d = p2PTopUpFragment;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f81827d.m98484q1().f95295o.mo53596d();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33544d(P2PTopUpFragment p2PTopUpFragment) {
            super(1);
            this.f81824d = p2PTopUpFragment;
        }

        /* renamed from: a */
        public final void mo79533a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C33545a(this.f81824d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C33546b(this.f81824d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33547c(this.f81824d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79533a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$e */
    static final class C33548e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpFragment f81828d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33548e(P2PTopUpFragment p2PTopUpFragment) {
            super(1);
            this.f81828d = p2PTopUpFragment;
        }

        /* renamed from: a */
        public final void mo79537a(C33562c cVar) {
            if (cVar instanceof C33562c.C33565c) {
                this.f81828d.m98484q1().f95290j.mo35919b();
                this.f81828d.m98484q1().f95290j.setInfoText("");
            } else if (cVar instanceof C33562c.C33564b) {
                this.f81828d.m98484q1().f95290j.mo35920c();
                Input input = this.f81828d.m98484q1().f95290j;
                String F = C32343x.m95388F("text.p2p.payment.oneTimeAmount.error", new Object[0]);
                int a = ((C33562c.C33564b) cVar).mo79556a();
                String h = C32303f.m95197h("GEL");
                input.setInfoText(F + " " + a + "  " + h);
            } else if (cVar instanceof C33562c.C33563a) {
                this.f81828d.m98484q1().f95290j.mo35920c();
                this.f81828d.m98484q1().f95290j.setInfoText(C32343x.m95388F("text.p2p.payment.emptyAmount.error", new Object[0]));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79537a((C33562c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$f */
    static final class C33549f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpFragment f81829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33549f(P2PTopUpFragment p2PTopUpFragment) {
            super(1);
            this.f81829d = p2PTopUpFragment;
        }

        /* renamed from: a */
        public final void mo79538a(C36806c cVar) {
            P2PTopUpFragment p2PTopUpFragment = this.f81829d;
            C41536l.m120488h(cVar, "it");
            p2PTopUpFragment.m98487u1(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79538a((C36806c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$g */
    static final class C33550g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpFragment f81830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33550g(P2PTopUpFragment p2PTopUpFragment) {
            super(1);
            this.f81830d = p2PTopUpFragment;
        }

        /* renamed from: a */
        public final void mo79539a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            this.f81830d.m98486t1();
            C31846a.f78554L.mo72287a(((Number) mVar.mo95675a()).intValue(), (String) mVar.mo95676b()).mo4576A1(this.f81830d.getChildFragmentManager(), "");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79539a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$h */
    static final class C33551h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpFragment f81831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33551h(P2PTopUpFragment p2PTopUpFragment) {
            super(1);
            this.f81831d = p2PTopUpFragment;
        }

        /* renamed from: a */
        public final void mo79540a(P2PTopUpViewModel$TopUpState p2PTopUpViewModel$TopUpState) {
            C41536l.m120489i(p2PTopUpViewModel$TopUpState, "it");
            C8034d.m30522a(this.f81831d).mo22118M(C39106c.action_p2PTopUpFragment_to_p2PTopUpWebViewFragment, C0908e.m3336b(C41233s.m119492a("TOP_UP_STATE", p2PTopUpViewModel$TopUpState)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79540a((P2PTopUpViewModel$TopUpState) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$i */
    static final class C33552i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpFragment f81832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33552i(P2PTopUpFragment p2PTopUpFragment) {
            super(1);
            this.f81832d = p2PTopUpFragment;
        }

        /* renamed from: a */
        public final void mo79541a(String str) {
            C1505h requireActivity = this.f81832d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C41536l.m120488h(str, "it");
            C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79541a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$j */
    public static final class C33553j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81833d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33553j(Fragment fragment) {
            super(0);
            this.f81833d = fragment;
        }

        public final Fragment invoke() {
            return this.f81833d;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$k */
    public static final class C33554k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81834d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33554k(C43064a aVar) {
            super(0);
            this.f81834d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f81834d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$l */
    public static final class C33555l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f81835d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33555l(C41217g gVar) {
            super(0);
            this.f81835d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f81835d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$m */
    public static final class C33556m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81836d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81837e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33556m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f81836d = aVar;
            this.f81837e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81836d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f81837e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$n */
    static final class C33557n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpFragment f81838d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment$n$a */
        static final class C33558a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ P2PTopUpFragment f81839d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33558a(P2PTopUpFragment p2PTopUpFragment) {
                super(0);
                this.f81839d = p2PTopUpFragment;
            }

            /* renamed from: b */
            public final C33568e invoke() {
                String str;
                C33568e.C33575e s1 = this.f81839d.mo79527s1();
                Bundle arguments = this.f81839d.getArguments();
                if (arguments != null) {
                    str = arguments.getString("P2P_TOP_UP_ACCT_NO");
                } else {
                    str = null;
                }
                return s1.mo32842a(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33557n(P2PTopUpFragment p2PTopUpFragment) {
            super(0);
            this.f81838d = p2PTopUpFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C33558a(this.f81838d));
        }
    }

    public P2PTopUpFragment() {
        C33557n nVar = new C33557n(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C33554k(new C33553j(this)));
        this.f81821i = C1514j0.m5374c(this, C41520a0.m120436b(C33568e.class), new C33555l(a), new C33556m((C43064a) null, a), nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m98473A1(P2PTopUpFragment p2PTopUpFragment, View view) {
        C41536l.m120489i(p2PTopUpFragment, "this$0");
        p2PTopUpFragment.m98485r1().mo79559Du();
    }

    /* renamed from: B1 */
    private final void m98474B1() {
        C37008f ww = m98485r1().mo79571ww();
        ww.mo79566s().mo4819k(getViewLifecycleOwner(), new C33542b(new C33544d(this)));
        ww.mo79574zr().mo4819k(getViewLifecycleOwner(), new C33542b(new C33548e(this)));
        ww.mo79561c2().mo4819k(getViewLifecycleOwner(), new C33542b(new C33549f(this)));
        LiveData m1 = ww.mo79563m1();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(m1, viewLifecycleOwner, new C33550g(this));
        LiveData z5 = ww.mo79573z5();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(z5, viewLifecycleOwner2, new C33551h(this));
        ww.mo79562d2().mo4819k(getViewLifecycleOwner(), new C33542b(new C33552i(this)));
    }

    /* renamed from: C1 */
    private final void m98475C1() {
        C40081f q1 = m98484q1();
        q1.f95292l.mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("text.p2p.payment.choose.dst.act", new Object[0]), ""));
        q1.f95291k.getButton().setButtonText(C32343x.m95388F("text.p2p.payment.topup.addFunds.btn", new Object[0]));
        Input input = q1.f95290j;
        String h = C32303f.m95197h("GEL");
        input.setSuffix(" " + h);
        input.setFilters(new C17201b[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null)});
        q1.f95293m.setTitle(C32343x.m95388F("text.p2p.payment.destination.title", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C40081f m98484q1() {
        C40081f fVar = this.f81819g;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final C33568e m98485r1() {
        return (C33568e) this.f81821i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m98486t1() {
        IBinder iBinder;
        Object systemService = requireContext().getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = getView();
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m98487u1(C36806c cVar) {
        C40081f q1 = m98484q1();
        q1.f95292l.setCreditCard(cVar.mo89708d());
        q1.f95292l.setTitleText(cVar.mo89711f());
    }

    /* renamed from: v1 */
    private final void m98488v1() {
        m98484q1().f95294n.setOnClickListener(new C37003a(this));
        m98484q1().f95290j.getTextInput().addTextChangedListener(new C33543c(this));
        m98484q1().f95292l.setOnClickListener(new C37004b(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_SELECTED_POSITION", this, new C37005c(this));
        m98484q1().f95291k.setOnClickListener(new C37006d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m98489x1(P2PTopUpFragment p2PTopUpFragment, View view) {
        C41536l.m120489i(p2PTopUpFragment, "this$0");
        C21481a.onRefresh$default(p2PTopUpFragment.m98485r1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m98490y1(P2PTopUpFragment p2PTopUpFragment, View view) {
        C41536l.m120489i(p2PTopUpFragment, "this$0");
        C33566d.C33567a.m98512a(p2PTopUpFragment.m98485r1(), (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m98491z1(P2PTopUpFragment p2PTopUpFragment, String str, Bundle bundle) {
        C41536l.m120489i(p2PTopUpFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        p2PTopUpFragment.m98485r1().mo79560Z2(bundle.getInt("RESULT_KEY_SELECTED_POSITION"));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f81819g = C40081f.m116130d(layoutInflater, viewGroup, false);
        StateView c = m98484q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f81819g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        P2PActivity p2PActivity;
        ToolbarView toolbarView;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C1505h requireActivity = requireActivity();
        if (requireActivity instanceof P2PActivity) {
            p2PActivity = (P2PActivity) requireActivity;
        } else {
            p2PActivity = null;
        }
        if (!(p2PActivity == null || (toolbarView = p2PActivity.f85671t) == null)) {
            toolbarView.setNavigationIcon(C39105b.f93245a);
        }
        refreshHeaderText(C32343x.m95388F("text.p2p.payment.topup.title", new Object[0]));
        m98475C1();
        m98474B1();
        m98488v1();
    }

    /* renamed from: s1 */
    public final C33568e.C33575e mo79527s1() {
        C33568e.C33575e eVar = this.f81820h;
        if (eVar != null) {
            return eVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }
}
