package p341ge.bog.mobilebank.linksharing.presentation.chooseaccount;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import ap0.C10129b;
import g91.C32343x;
import gp0.C15445a;
import gp0.C15453h;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import hp0.C15586b;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p202p0.C7542g;
import p380ck.C10464h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment */
public final class ChooseAccountDialogFragment extends C15453h {

    /* renamed from: K */
    public static final C15129a f43429K = new C15129a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C10129b f43430G;

    /* renamed from: H */
    private final C41217g f43431H;

    /* renamed from: I */
    private final C7542g f43432I = new C7542g(C41520a0.m120436b(C15445a.class), new C15134e(this));

    /* renamed from: J */
    private final C41217g f43433J = C41219i.m119470b(new C15130b(this));

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$a */
    public static final class C15129a {
        private C15129a() {
        }

        public /* synthetic */ C15129a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$b */
    static final class C15130b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChooseAccountDialogFragment f43434d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$b$a */
        static final class C15131a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ChooseAccountDialogFragment f43435d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15131a(ChooseAccountDialogFragment chooseAccountDialogFragment) {
                super(1);
                this.f43435d = chooseAccountDialogFragment;
            }

            /* renamed from: a */
            public final void mo42160a(int i) {
                C1533o.m5445b(this.f43435d, "REQUEST_KEY_SELECTED_POSITION", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_POSITION", Integer.valueOf(i))));
                C32343x.m95395I0(this.f43435d, "P2P_link", (String) null, "P2P_link_choose_card_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
                this.f43435d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42160a(((Number) obj).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15130b(ChooseAccountDialogFragment chooseAccountDialogFragment) {
            super(0);
            this.f43434d = chooseAccountDialogFragment;
        }

        /* renamed from: b */
        public final C15586b invoke() {
            return new C15586b(this.f43434d.m55334g2().mo42529a(), new C15131a(this.f43434d));
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$c */
    static final class C15132c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ChooseAccountDialogFragment f43436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15132c(ChooseAccountDialogFragment chooseAccountDialogFragment) {
            super(1);
            this.f43436d = chooseAccountDialogFragment;
        }

        /* renamed from: a */
        public final void mo42161a(List list) {
            this.f43436d.m55333f2().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42161a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$d */
    static final class C15133d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43437a;

        C15133d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43437a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43437a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43437a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$e */
    public static final class C15134e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43438d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15134e(Fragment fragment) {
            super(0);
            this.f43438d = fragment;
        }

        /* renamed from: b */
        public final Bundle invoke() {
            Bundle arguments = this.f43438d.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f43438d + " has null arguments");
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$f */
    public static final class C15135f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15135f(Fragment fragment) {
            super(0);
            this.f43439d = fragment;
        }

        public final Fragment invoke() {
            return this.f43439d;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$g */
    public static final class C15136g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15136g(C43064a aVar) {
            super(0);
            this.f43440d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43440d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$h */
    public static final class C15137h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15137h(C41217g gVar) {
            super(0);
            this.f43441d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43441d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$i */
    public static final class C15138i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43442d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43443e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15138i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43442d = aVar;
            this.f43443e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43442d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43443e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment$j */
    public static final class C15139j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43444d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43445e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15139j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f43444d = fragment;
            this.f43445e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f43445e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f43444d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ChooseAccountDialogFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C15136g(new C15135f(this)));
        this.f43431H = C1514j0.m5374c(this, C41520a0.m120436b(ChooseAccountViewModel$ViewModel.class), new C15137h(a), new C15138i((C43064a) null, a), new C15139j(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final C15586b m55333f2() {
        return (C15586b) this.f43433J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C15445a m55334g2() {
        return (C15445a) this.f43432I.getValue();
    }

    /* renamed from: h2 */
    private final C10129b m55335h2() {
        C10129b bVar = this.f43430G;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: i2 */
    private final ChooseAccountViewModel$ViewModel m55336i2() {
        return (ChooseAccountViewModel$ViewModel) this.f43431H.getValue();
    }

    /* renamed from: j2 */
    private final void m55337j2() {
        mo26370a2(C32343x.m95388F("text.p2p.link.choose.acct.actionsheet", new Object[0]));
        m55335h2().f28054e.setAdapter(m55333f2());
    }

    private final void observeData() {
        m55336i2().mo42167iw().mo42165g().mo4819k(getViewLifecycleOwner(), new C15133d(new C15132c(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f43430G = C10129b.m37045d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        Window window;
        this.f43430G = null;
        C1533o.m5445b(this, "RESULT_KEY_DIALOG_CLOSE", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_DIALOG_CLOSE", Boolean.TRUE)));
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setSoftInputMode(0);
        }
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setSoftInputMode(48);
        }
        m55337j2();
        observeData();
    }
}
