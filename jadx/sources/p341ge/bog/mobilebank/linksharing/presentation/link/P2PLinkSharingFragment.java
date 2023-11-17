package p341ge.bog.mobilebank.linksharing.presentation.link;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import ap0.C10133f;
import g91.C32343x;
import g91.C32359z0;
import h41.C36151a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kp0.C16530a;
import kp0.C16531b;
import kp0.C16535f;
import m41.C37224b;
import p163m0.C7047a;
import p202p0.C7556l;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.linksharing.presentation.link.C15173b;
import p341ge.bog.mobilebank.linksharing.presentation.link.C15178c;
import p341ge.bog.mobilebank.linksharing.presentation.link.C15186d;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment */
public final class P2PLinkSharingFragment extends C15172a {

    /* renamed from: g */
    private C10133f f43458g;

    /* renamed from: h */
    private final C41217g f43459h;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$a */
    static final class C15146a implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43460a;

        C15146a(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43460a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43460a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43460a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$b */
    static final class C15147b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingFragment f43461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15147b(P2PLinkSharingFragment p2PLinkSharingFragment) {
            super(2);
            this.f43461d = p2PLinkSharingFragment;
        }

        /* renamed from: a */
        public final void mo42190a(String str, Bundle bundle) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(bundle, "bundle");
            this.f43461d.m55362n1().mo42197mw().mo42193Hd(bundle.getInt("RESULT_KEY_SELECTED_POSITION"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo42190a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$c */
    static final class C15148c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingFragment f43462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15148c(P2PLinkSharingFragment p2PLinkSharingFragment) {
            super(0);
            this.f43462d = p2PLinkSharingFragment;
        }

        public final void invoke() {
            C7556l a = C8034d.m30522a(this.f43462d);
            C15186d.C15188b bVar = C15186d.f43515a;
            Object f = this.f43462d.m55362n1().mo42198nw().mo42195Y0().mo4814f();
            if (f != null) {
                a.mo22121Q(bVar.mo42232a(((C15178c) f).mo42224b()));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$d */
    static final class C15149d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingFragment f43463d;

        /* renamed from: e */
        final /* synthetic */ C10133f f43464e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15149d(P2PLinkSharingFragment p2PLinkSharingFragment, C10133f fVar) {
            super(0);
            this.f43463d = p2PLinkSharingFragment;
            this.f43464e = fVar;
        }

        public final void invoke() {
            C32359z0.m95583n0(this.f43463d.requireActivity(), String.valueOf(this.f43464e.f28096s.getText()), C32343x.m95388F("text.p2p.link.active.link.title", new Object[0]));
            C32343x.m95395I0(this.f43463d, "P2P_link", (String) null, "P2P_link_share_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$e */
    static final class C15150e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingFragment f43465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15150e(P2PLinkSharingFragment p2PLinkSharingFragment) {
            super(1);
            this.f43465d = p2PLinkSharingFragment;
        }

        /* renamed from: a */
        public final void mo42191a(C15178c cVar) {
            cVar.mo42223a(new C15178c.C15183d.C15184a(this.f43465d.m55361m1()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42191a((C15178c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$f */
    static final class C15151f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingFragment f43466d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15151f(P2PLinkSharingFragment p2PLinkSharingFragment) {
            super(1);
            this.f43466d = p2PLinkSharingFragment;
        }

        /* renamed from: a */
        public final void mo42192a(C15173b bVar) {
            C41536l.m120489i(bVar, "result");
            C1505h requireActivity = this.f43466d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            bVar.mo42214a(new C15173b.C15174a.C15175a(requireActivity));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42192a((C15173b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$g */
    public static final class C15152g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43467d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15152g(Fragment fragment) {
            super(0);
            this.f43467d = fragment;
        }

        public final Fragment invoke() {
            return this.f43467d;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$h */
    public static final class C15153h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15153h(C43064a aVar) {
            super(0);
            this.f43468d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43468d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$i */
    public static final class C15154i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15154i(C41217g gVar) {
            super(0);
            this.f43469d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43469d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$j */
    public static final class C15155j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43470d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43471e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15155j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43470d = aVar;
            this.f43471e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43470d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43471e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment$k */
    public static final class C15156k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43472d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15156k(Fragment fragment, C41217g gVar) {
            super(0);
            this.f43472d = fragment;
            this.f43473e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f43473e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f43472d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public P2PLinkSharingFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C15153h(new C15152g(this)));
        this.f43459h = C1514j0.m5374c(this, C41520a0.m120436b(P2PLinkSharingViewModel$ViewModel.class), new C15154i(a), new C15155j((C43064a) null, a), new C15156k(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final C10133f m55361m1() {
        C10133f fVar = this.f43458g;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final P2PLinkSharingViewModel$ViewModel m55362n1() {
        return (P2PLinkSharingViewModel$ViewModel) this.f43459h.getValue();
    }

    /* renamed from: o1 */
    private final void m55363o1() {
        C1533o.m5446c(this, "REQUEST_KEY_SELECTED_POSITION", new C15147b(this));
        C10133f m1 = m55361m1();
        m1.f28094q.setOnClickListener(new C16530a(this));
        CreditCardSmallPickerView creditCardSmallPickerView = m1.f28092o;
        C41536l.m120488h(creditCardSmallPickerView, "p2pLinkChooseAccount");
        C36151a.m107541b(creditCardSmallPickerView, 0, new C15148c(this), 1, (Object) null);
        m1.f28082e.setOnClickListener(new C16531b(m1, this));
        Button button = m1.f28083f;
        C41536l.m120488h(button, "buttonShare");
        C36151a.m107541b(button, 0, new C15149d(this, m1), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m55364p1(P2PLinkSharingFragment p2PLinkSharingFragment, View view) {
        C41536l.m120489i(p2PLinkSharingFragment, "this$0");
        C21481a.onRefresh$default(p2PLinkSharingFragment.m55362n1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m55365q1(C10133f fVar, P2PLinkSharingFragment p2PLinkSharingFragment, View view) {
        C41536l.m120489i(fVar, "$this_with");
        C41536l.m120489i(p2PLinkSharingFragment, "this$0");
        C32359z0.m95596x(String.valueOf(fVar.f28096s.getText()));
        C1505h requireActivity = p2PLinkSharingFragment.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12910e.m48797o(requireActivity, C32343x.m95388F("text.p2p.link.active.link.copied.successfully", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
        C32343x.m95395I0(p2PLinkSharingFragment, "P2P_link", (String) null, "P2P_link_copy_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: r1 */
    private final void m55366r1() {
        C16535f nw = m55362n1().mo42198nw();
        nw.mo42195Y0().mo4819k(getViewLifecycleOwner(), new C15146a(new C15150e(this)));
        LiveData R6 = nw.mo42194R6();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(R6, viewLifecycleOwner, new C15151f(this));
    }

    /* renamed from: s1 */
    private final void m55367s1() {
        C10133f m1 = m55361m1();
        m1.f28085h.setTitle(C32343x.m95388F("text.p2p.link.receive.acct.title", new Object[0]));
        m1.f28093p.setText(C32343x.m95388F("text.p2p.link.error.page", new Object[0]));
        m1.f28094q.setButtonText(C32343x.m95388F("text.p2p.link.error.page.reload", new Object[0]));
        m1.f28092o.mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("text.p2p.link.choose.account", new Object[0]), ""));
        m1.f28086i.setTitle(C32343x.m95388F("text.p2p.link.active.link.title", new Object[0]));
        m1.f28096s.setTitle(C32343x.m95388F("text.p2p.link.active.link.desc", new Object[0]));
        m1.f28083f.setButtonText(C32343x.m95388F("text.p2p.link.active.link.share.btn", new Object[0]));
        m1.f28088k.setTitleText(C32343x.m95388F("text.p2p.link.nonvalid.link.warning", new Object[0]));
        m1.f28087j.setTitleText(C32343x.m95388F("text.p2p.link.nonactive.acct.warning", new Object[0]));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f43458g = C10133f.m37061d(layoutInflater, viewGroup, false);
        StateView c = m55361m1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f43458g = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m55367s1();
        m55363o1();
        m55366r1();
    }
}
