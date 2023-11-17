package p341ge.bog.mobilebank.linksharing.presentation.help;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ap0.C10130c;
import g91.C32343x;
import jp0.C16323a;
import kotlin.jvm.internal.C41536l;
import p228r0.C8034d;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.help.P2PHelpFragment */
public final class P2PHelpFragment extends C15142a {

    /* renamed from: g */
    private C10130c f43449g;

    /* renamed from: j1 */
    private final C10130c m55352j1() {
        C10130c cVar = this.f43449g;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m55353k1(P2PHelpFragment p2PHelpFragment, View view) {
        C41536l.m120489i(p2PHelpFragment, "this$0");
        C8034d.m30522a(p2PHelpFragment).mo22122S();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f43449g = C10130c.m37049d(layoutInflater, viewGroup, false);
        LinearLayout c = m55352j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f43449g = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C10130c j1 = m55352j1();
        super.onViewCreated(view, bundle);
        j1.f28056e.setOnClickListener(new C16323a(this));
        j1.f28057f.setTitle(C32343x.m95388F("text.p2p.link.about.title", new Object[0]));
        j1.f28058g.setText(C32343x.m95388F("text.p2p.link.about.bullet1", new Object[0]));
        j1.f28059h.setText(C32343x.m95388F("text.p2p.link.about.bullet2", new Object[0]));
        j1.f28060i.setText(C32343x.m95388F("text.p2p.link.about.bullet3", new Object[0]));
        j1.f28056e.setButtonText(C32343x.m95388F("text.p2p.link.about.close.btn", new Object[0]));
    }
}
