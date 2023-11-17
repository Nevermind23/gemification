package p341ge.bog.mobilebank.linksharing.presentation.link;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.C0152h;
import ap0.C10134g;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kp0.C16533d;
import p228r0.C8034d;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p380ck.C10464h;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingIntroFragment */
public final class P2PLinkSharingIntroFragment extends C35651n1 {

    /* renamed from: d */
    private C10134g f43474d;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingIntroFragment$a */
    public static final class C15157a extends C0152h {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingIntroFragment f43475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15157a(P2PLinkSharingIntroFragment p2PLinkSharingIntroFragment) {
            super(true);
            this.f43475d = p2PLinkSharingIntroFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            this.f43475d.requireActivity().finish();
        }
    }

    /* renamed from: j1 */
    private final C10134g m55372j1() {
        C10134g gVar = this.f43474d;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: k1 */
    private final void m55373k1() {
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C15157a(this));
        m55372j1().f28098e.setOnClickListener(new C16533d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m55374l1(P2PLinkSharingIntroFragment p2PLinkSharingIntroFragment, View view) {
        C41536l.m120489i(p2PLinkSharingIntroFragment, "this$0");
        C32343x.m95395I0(p2PLinkSharingIntroFragment, "P2P_link", (String) null, "P2P_link_intro_start_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        C8034d.m30522a(p2PLinkSharingIntroFragment).mo22121Q(C15189e.f43518a.mo42233a());
    }

    /* renamed from: m1 */
    private final void m55375m1() {
        C10134g j1 = m55372j1();
        j1.f28099f.setTitle(C32343x.m95388F("text.p2p.link.intro.header", new Object[0]));
        j1.f28100g.setText(C32343x.m95388F("text.p2p.link.intro.desc.bullet1", new Object[0]));
        j1.f28101h.setText(C32343x.m95388F("text.p2p.link.intro.desc.bullet2", new Object[0]));
        j1.f28102i.setText(C32343x.m95388F("text.p2p.link.intro.desc.bullet3", new Object[0]));
        j1.f28098e.setButtonText(C32343x.m95388F("text.p2p.link.intro.start.btn", new Object[0]));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f43474d = C10134g.m37065d(layoutInflater, viewGroup, false);
        LinearLayout c = m55372j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f43474d = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m55375m1();
        m55373k1();
    }
}
