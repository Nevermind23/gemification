package p341ge.bog.mobilebank.p2p.presentation.send;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
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
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import ba1.C10146d0;
import bw0.C31210c;
import ew0.C31846a;
import g91.C32303f;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hw0.C36243a;
import hw0.C36244b;
import hw0.C36245c;
import hw0.C36246d;
import hw0.C36247e;
import hw0.C36248f;
import hw0.C36250h;
import i91.C36370c;
import java.util.HashMap;
import java.util.List;
import jw0.C36804a;
import jw0.C36805b;
import jw0.C36806c;
import jw0.C36807d;
import jw0.C36808e;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37603j;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.p2p.domain.model.MoneyTransferResponse;
import p341ge.bog.mobilebank.p2p.presentation.send.C33536c;
import p341ge.bog.mobilebank.p2p.presentation.send.model.TransferDetailsParams;
import p420fh.C12902d;
import p420fh.C12910e;
import p547oi.C17199a;
import p547oi.C17201b;
import u31.C39010b;
import ue1.C43064a;
import ue1.C43075l;
import uv0.C39106c;
import y31.C40019a;
import yv0.C40078c;
import yv0.C40083h;
import yv0.C40084i;

/* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment */
public final class P2PSendFragment extends C33534a implements C41185v.C41186a {

    /* renamed from: l */
    public static final C33489a f81725l = new C33489a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C40078c f81726g;

    /* renamed from: h */
    private final C41217g f81727h;

    /* renamed from: i */
    private final C41217g f81728i = C41219i.m119470b(new C33490b(this));

    /* renamed from: j */
    private View f81729j;

    /* renamed from: k */
    private View f81730k;

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$a */
    public static final class C33489a {
        private C33489a() {
        }

        public /* synthetic */ C33489a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$b */
    static final class C33490b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81731d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$b$a */
        static final class C33491a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PSendFragment f81732d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33491a(P2PSendFragment p2PSendFragment) {
                super(1);
                this.f81732d = p2PSendFragment;
            }

            /* renamed from: a */
            public final void mo79438a(C40019a aVar) {
                C41536l.m120489i(aVar, "it");
                this.f81732d.m98315D1().mo79471Gw().mo79486al(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79438a((C40019a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33490b(P2PSendFragment p2PSendFragment) {
            super(0);
            this.f81731d = p2PSendFragment;
        }

        /* renamed from: b */
        public final C39010b invoke() {
            return new C39010b(new C33491a(this.f81731d));
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$c */
    static final class C33492c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33492c(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81733d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79439a(C36804a aVar) {
            P2PSendFragment p2PSendFragment = this.f81733d;
            C41536l.m120488h(aVar, "amountInputState");
            p2PSendFragment.m98317F1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79439a((C36804a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$d */
    static final class C33493d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33493d(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81734d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79440a(C36807d dVar) {
            boolean z;
            if (!C41536l.m120484d(dVar.mo89715c(), C40440x.m117146P0(this.f81734d.m98312A1().f95268p.getInputText()).toString())) {
                this.f81734d.m98312A1().f95268p.setInputText(dVar.mo89715c());
            }
            if (dVar.mo89716d().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f81734d.m98312A1().f95268p.mo35920c();
                this.f81734d.m98312A1().f95268p.setInfoText(dVar.mo89716d());
                return;
            }
            this.f81734d.m98312A1().f95268p.mo35919b();
            this.f81734d.m98312A1().f95268p.setInfoText((CharSequence) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79440a((C36807d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$e */
    static final class C33494e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81735d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33494e(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81735d = p2PSendFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m98359c(int i, String str, P2PSendFragment p2PSendFragment) {
            C41536l.m120489i(str, "$errorText");
            C41536l.m120489i(p2PSendFragment, "this$0");
            C31846a.f78554L.mo72287a(i, str).mo4576A1(p2PSendFragment.getChildFragmentManager(), "");
        }

        /* renamed from: b */
        public final void mo79441b(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            this.f81735d.m98316E1();
            new Handler(Looper.getMainLooper()).postDelayed(new C33535b(((Number) mVar.mo95675a()).intValue(), (String) mVar.mo95676b(), this.f81735d), 200);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79441b((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$f */
    static final class C33495f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33495f(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81736d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79442a(String str) {
            C1505h requireActivity = this.f81736d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C41536l.m120488h(str, "errorFeedback");
            C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79442a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$g */
    static final class C33496g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33496g(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81737d = p2PSendFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            boolean z;
            P2PSendFragment p2PSendFragment = this.f81737d;
            if (!C36370c.m107927h(p2PSendFragment.requireContext())) {
                C41536l.m120488h(bool, "show");
                if (bool.booleanValue()) {
                    z = true;
                    p2PSendFragment.m98332U1(z);
                }
            }
            z = false;
            p2PSendFragment.m98332U1(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$h */
    static final class C33497h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33497h(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81738d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79444a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f81738d.m98312A1().f95273u.mo53595c();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f81738d.m98312A1().f95273u.mo53597e();
            } else if (aVar instanceof C31128a.C31129a) {
                this.f81738d.m98312A1().f95273u.mo53596d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79444a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$i */
    static final class C33498i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33498i(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81739d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79445a(C36806c cVar) {
            P2PSendFragment p2PSendFragment = this.f81739d;
            C41536l.m120488h(cVar, "it");
            p2PSendFragment.m98319H1(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79445a((C36806c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$j */
    static final class C33499j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33499j(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81740d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79446a(C36808e eVar) {
            P2PSendFragment p2PSendFragment = this.f81740d;
            C41536l.m120488h(eVar, "phoneUiState");
            p2PSendFragment.m98328Q1(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79446a((C36808e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$k */
    static final class C33500k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33500k(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81741d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79447a(List list) {
            P2PSendFragment p2PSendFragment = this.f81741d;
            C41536l.m120488h(list, "it");
            p2PSendFragment.m98330S1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79447a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$l */
    static final class C33501l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81742d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33501l(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81742d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79448a(C36805b bVar) {
            P2PSendFragment p2PSendFragment = this.f81742d;
            C41536l.m120488h(bVar, "state");
            p2PSendFragment.m98318G1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79448a((C36805b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$m */
    static final class C33502m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33502m(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81743d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79449a(TransferDetailsParams transferDetailsParams) {
            C41536l.m120489i(transferDetailsParams, "it");
            this.f81743d.m98333V1(transferDetailsParams);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79449a((TransferDetailsParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$n */
    static final class C33503n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33503n(P2PSendFragment p2PSendFragment) {
            super(1);
            this.f81744d = p2PSendFragment;
        }

        /* renamed from: a */
        public final void mo79450a(MoneyTransferResponse moneyTransferResponse) {
            C8034d.m30522a(this.f81744d).mo22118M(C39106c.action_P2PSendFragment_to_p2PSuccessFragment, C0908e.m3336b(C41233s.m119492a("MONEY_TRANSFER_RESPONSE", moneyTransferResponse)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79450a((MoneyTransferResponse) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$o */
    static final class C33504o implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81745a;

        C33504o(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81745a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81745a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81745a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$p */
    public static final class C33505p extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ P2PSendFragment f81746a;

        C33505p(P2PSendFragment p2PSendFragment) {
            this.f81746a = p2PSendFragment;
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5739d(recyclerView, i);
            this.f81746a.m98316E1();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$q */
    public static final class C33506q implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C40078c f81747d;

        /* renamed from: e */
        final /* synthetic */ P2PSendFragment f81748e;

        public C33506q(C40078c cVar, P2PSendFragment p2PSendFragment) {
            this.f81747d = cVar;
            this.f81748e = p2PSendFragment;
        }

        public void afterTextChanged(Editable editable) {
            Object tag = this.f81747d.f95264l.getTag();
            Boolean bool = Boolean.FALSE;
            if (C41536l.m120484d(tag, bool)) {
                this.f81748e.m98313B1(String.valueOf(editable));
                this.f81748e.m98315D1().mo79471Gw().mo79495nb(String.valueOf(editable));
                this.f81747d.f95264l.mo35919b();
                this.f81747d.f95264l.setInfoText((CharSequence) null);
            }
            this.f81747d.f95264l.setTag(bool);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$r */
    public static final class C33507r implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81749d;

        /* renamed from: e */
        final /* synthetic */ C40078c f81750e;

        public C33507r(P2PSendFragment p2PSendFragment, C40078c cVar) {
            this.f81749d = p2PSendFragment;
            this.f81750e = cVar;
        }

        public void afterTextChanged(Editable editable) {
            C33536c Gw = this.f81749d.m98315D1().mo79471Gw();
            String inputText = this.f81750e.f95257e.getInputText();
            String h = C32303f.m95197h("GEL");
            C41536l.m120488h(h, "getCcyLogo(GEL)");
            Gw.mo79487b2(C40440x.m117146P0(C40439w.m117103B(inputText, h, "", false, 4, (Object) null)).toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$s */
    public static final class C33508s implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ P2PSendFragment f81751d;

        /* renamed from: e */
        final /* synthetic */ C40078c f81752e;

        public C33508s(P2PSendFragment p2PSendFragment, C40078c cVar) {
            this.f81751d = p2PSendFragment;
            this.f81752e = cVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f81751d.m98315D1().mo79482Uw(C40440x.m117146P0(this.f81752e.f95268p.getInputText()).toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$t */
    public static final class C33509t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33509t(Fragment fragment) {
            super(0);
            this.f81753d = fragment;
        }

        public final Fragment invoke() {
            return this.f81753d;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$u */
    public static final class C33510u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81754d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33510u(C43064a aVar) {
            super(0);
            this.f81754d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f81754d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$v */
    public static final class C33511v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f81755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33511v(C41217g gVar) {
            super(0);
            this.f81755d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f81755d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$w */
    public static final class C33512w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81756d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33512w(C43064a aVar, C41217g gVar) {
            super(0);
            this.f81756d = aVar;
            this.f81757e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81756d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f81757e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment$x */
    public static final class C33513x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81758d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81759e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33513x(Fragment fragment, C41217g gVar) {
            super(0);
            this.f81758d = fragment;
            this.f81759e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f81759e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f81758d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public P2PSendFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C33510u(new C33509t(this)));
        this.f81727h = C1514j0.m5374c(this, C41520a0.m120436b(P2PSendViewModel$ViewModel.class), new C33511v(a), new C33512w((C43064a) null, a), new C33513x(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final C40078c m98312A1() {
        C40078c cVar = this.f81726g;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m98313B1(String str) {
        C33536c Gw = m98315D1().mo79471Gw();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        Gw.mo79484Yn(C37603j.m110582e(requireContext, str));
    }

    /* renamed from: C1 */
    private final C39010b m98314C1() {
        return (C39010b) this.f81728i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final P2PSendViewModel$ViewModel m98315D1() {
        return (P2PSendViewModel$ViewModel) this.f81727h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m98316E1() {
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
    /* renamed from: F1 */
    public final void m98317F1(C36804a aVar) {
        boolean z;
        C41238w wVar;
        Input input = m98312A1().f95257e;
        if (aVar.mo89694f().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            input.mo35920c();
            input.setInfoText(aVar.mo89694f());
        } else if (aVar.mo89696h()) {
            input.mo35919b();
            input.setInfoText(C32343x.m95388F("text.p2p.payment.send.request.com.packages", new Object[0]));
        } else {
            input.mo35919b();
            C31210c e = aVar.mo89692e();
            if (e != null) {
                input.setInfoText(C32343x.m95388F("text.p2p.payment.send.request.com.title", new Object[0]) + " " + C32343x.m95410Q(e.mo71447a(), e.mo71448b(), false, 2, (Object) null));
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                input.setInfoText((CharSequence) null);
            }
        }
        if (aVar.mo89695g()) {
            input.requestFocus();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final void m98318G1(C36805b bVar) {
        Button button = m98312A1().f95269q.getButton();
        button.setButtonText(bVar.mo89700c());
        button.setLoading(bVar.mo89701d());
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m98319H1(C36806c cVar) {
        C40078c A1 = m98312A1();
        A1.f95258f.setCreditCard(cVar.mo89708d());
        A1.f95258f.setTitleText(cVar.mo89711f());
    }

    /* renamed from: I1 */
    private final void m98320I1() {
        View view;
        Input input = m98312A1().f95264l;
        if (!C36370c.m107927h(requireContext())) {
            view = this.f81729j;
        } else {
            view = this.f81730k;
        }
        input.setEndComponentView(view);
    }

    /* renamed from: J1 */
    private final void m98321J1() {
        getChildFragmentManager().mo4367F1("REQUEST_KEY_SELECTED_POSITION", this, new C36243a(this));
        C40078c A1 = m98312A1();
        A1.f95270r.setOnClickListener(new C36244b(this));
        A1.f95258f.setOnClickListener(new C36245c(this));
        A1.f95264l.setEndComponentClickListener(new C36246d(this));
        A1.f95264l.getTextInput().addTextChangedListener(new C33506q(A1, this));
        A1.f95257e.getTextInput().addTextChangedListener(new C33507r(this, A1));
        A1.f95268p.getTextInput().addTextChangedListener(new C33508s(this, A1));
        A1.f95269q.getButton().setOnClickListener(new C36247e(this));
        A1.f95271s.mo5363n(new C33505p(this));
        A1.f95272t.setOnTouchListener(new C36248f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final boolean m98322K1(P2PSendFragment p2PSendFragment, View view, MotionEvent motionEvent) {
        int i;
        C41536l.m120489i(p2PSendFragment, "this$0");
        List list = (List) p2PSendFragment.m98315D1().mo79476Lw().mo79491kc().mo4814f();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m98323L1(P2PSendFragment p2PSendFragment, View view) {
        C41536l.m120489i(p2PSendFragment, "this$0");
        C21481a.onRefresh$default(p2PSendFragment.m98315D1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m98324M1(P2PSendFragment p2PSendFragment, View view) {
        C41536l.m120489i(p2PSendFragment, "this$0");
        C33536c.C33537a.m98468a(p2PSendFragment.m98315D1(), (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m98325N1(P2PSendFragment p2PSendFragment, View view) {
        C41536l.m120489i(p2PSendFragment, "this$0");
        p2PSendFragment.m98332U1(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m98326O1(P2PSendFragment p2PSendFragment, View view) {
        C41536l.m120489i(p2PSendFragment, "this$0");
        p2PSendFragment.m98315D1().mo79471Gw().mo79467Du();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m98327P1(P2PSendFragment p2PSendFragment, String str, Bundle bundle) {
        C41536l.m120489i(p2PSendFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        p2PSendFragment.m98315D1().mo79485Z2(bundle.getInt("RESULT_KEY_SELECTED_POSITION"));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final void m98328Q1(C36808e eVar) {
        C40078c A1 = m98312A1();
        boolean z = false;
        if (eVar.mo89726h()) {
            A1.f95264l.setInfoText((CharSequence) null);
            A1.f95257e.setVisibility(0);
            A1.f95268p.setVisibility(0);
        } else {
            A1.f95257e.setVisibility(8);
            A1.f95268p.setVisibility(8);
            if (eVar.mo89721d().length() > 0) {
                z = true;
            }
            if (z) {
                A1.f95264l.mo35920c();
            } else {
                A1.f95264l.mo35919b();
            }
            A1.f95264l.setInfoText(eVar.mo89721d());
        }
        if (eVar.mo89722e()) {
            m98329R1(eVar.mo89724f());
        }
    }

    /* renamed from: R1 */
    private final void m98329R1(String str) {
        EditText textInput = m98312A1().f95264l.getTextInput();
        m98312A1().f95264l.setTag(Boolean.TRUE);
        textInput.setText(str);
        textInput.setSelection(str.length(), str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public final void m98330S1(List list) {
        int i;
        EmptyWidget emptyWidget = m98312A1().f95259g;
        int i2 = 0;
        if (!list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        emptyWidget.setVisibility(i);
        RecyclerView recyclerView = m98312A1().f95271s;
        if (!(!list.isEmpty())) {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
        m98314C1().mo6029i(list);
    }

    /* renamed from: T1 */
    private final void m98331T1() {
        this.f81729j = C40083h.m116138d(LayoutInflater.from(requireContext())).mo3946b();
        this.f81730k = C40084i.m116143d(LayoutInflater.from(requireContext())).mo3946b();
        C40078c A1 = m98312A1();
        A1.f95263k.setText(C32343x.m95388F("text.p2p.payment.reload.page", new Object[0]));
        A1.f95270r.setButtonText(C32343x.m95388F("text.p2p.payment.reload.btn", new Object[0]));
        A1.f95260h.setTitle(C32343x.m95388F("text.p2p.payment.send.request.from.title", new Object[0]));
        A1.f95261i.setTitle(C32343x.m95388F("text.p2p.payment.send.request.to.title", new Object[0]));
        A1.f95258f.mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("text.p2p.payment.send.request.sender.card.title", new Object[0]), ""));
        A1.f95264l.setTag(Boolean.FALSE);
        A1.f95264l.setHintText((CharSequence) C32343x.m95388F("text.p2p.payment.send.request.benef.contactID", new Object[0]));
        A1.f95259g.setTitle(C32343x.m95388F("text.p2p.payment.send.request.benef.device.contact", new Object[0]));
        A1.f95271s.setAdapter(m98314C1());
        A1.f95268p.setHintText((CharSequence) C32343x.m95388F("text.p2p.payment.send.request.nomination", new Object[0]));
        A1.f95268p.setInputText(C32343x.m95388F("text.p2p.payment.send.request.default.nomination", new Object[0]));
        Input input = A1.f95257e;
        input.setHintText((CharSequence) C32343x.m95388F("text.p2p.payment.send.request.amount.title", new Object[0]));
        String h = C32303f.m95197h("GEL");
        input.setSuffix(" " + h);
        input.setFilters(new C17201b[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null)});
        m98320I1();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m98332U1(boolean z) {
        if (z) {
            C36370c.m107933n(this, C32343x.m95388F("text.p2p.payment.send.request.contact.access", new Object[0]));
            m98315D1().mo79483Vw(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m98333V1(TransferDetailsParams transferDetailsParams) {
        m98316E1();
        C41185v.C41187b bVar = C41185v.f97155C;
        String serviceId = transferDetailsParams.getServiceId();
        HashMap Kw = m98315D1().mo79475Kw(transferDetailsParams);
        Kw.put("tmxSessionId", C10146d0.C10177h.m37232a());
        C41238w wVar = C41238w.f97225a;
        C41185v e = C41185v.C41187b.m119423e(bVar, serviceId, Kw, (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, "P2P_SCA_TAG");
    }

    private final void observeData() {
        C36250h Lw = m98315D1().mo79476Lw();
        Lw.mo79489d2().mo4819k(getViewLifecycleOwner(), new C33504o(new C33495f(this)));
        Lw.mo79464B3().mo4819k(getViewLifecycleOwner(), new C33504o(new C33496g(this)));
        Lw.mo79492la().mo4819k(getViewLifecycleOwner(), new C33504o(new C33497h(this)));
        Lw.mo79488c2().mo4819k(getViewLifecycleOwner(), new C33504o(new C33498i(this)));
        Lw.mo79494mo().mo4819k(getViewLifecycleOwner(), new C33504o(new C33499j(this)));
        Lw.mo79491kc().mo4819k(getViewLifecycleOwner(), new C33504o(new C33500k(this)));
        Lw.mo79481Q8().mo4819k(getViewLifecycleOwner(), new C33504o(new C33501l(this)));
        LiveData hl = Lw.mo79490hl();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(hl, viewLifecycleOwner, new C33502m(this));
        Lw.mo79498yt().mo4819k(getViewLifecycleOwner(), new C33504o(new C33503n(this)));
        Lw.mo79496np().mo4819k(getViewLifecycleOwner(), new C33504o(new C33492c(this)));
        Lw.mo79479Ob().mo4819k(getViewLifecycleOwner(), new C33504o(new C33493d(this)));
        LiveData m1 = Lw.mo79493m1();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(m1, viewLifecycleOwner2, new C33494e(this));
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (C41536l.m120484d(str4, "P2P_SCA_TAG")) {
            m98315D1().mo79471Gw().mo79497qg(str, str2, str3);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v f0 = C32343x.m95446f0(childFragmentManager, "P2P_SCA_TAG");
        if (f0 != null) {
            f0.mo4577k1();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f81726g = C40078c.m116118d(layoutInflater, viewGroup, false);
        StateView c = m98312A1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f81726g = null;
        this.f81729j = null;
        this.f81730k = null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 9898 && C32303f.m95190a(iArr)) {
            m98320I1();
            m98313B1(m98312A1().f95264l.getInputText());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m98331T1();
        m98321J1();
        observeData();
        m98312A1().f95264l.getTextInput().setText("");
    }
}
