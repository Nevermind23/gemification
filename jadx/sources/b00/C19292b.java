package b00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p016os.C0908e;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10318g;
import p90.C27400q2;
import ue1.C43064a;

/* renamed from: b00.b */
public final class C19292b extends C19296d {

    /* renamed from: M */
    public static final C19293a f53510M = new C19293a((DefaultConstructorMarker) null);

    /* renamed from: N */
    private static final int f53511N = C10318g.applications_status_rejected;

    /* renamed from: K */
    private C27400q2 f53512K;

    /* renamed from: L */
    private final C41217g f53513L = C41219i.m119470b(new C19294b(this));

    /* renamed from: b00.b$a */
    public static final class C19293a {
        private C19293a() {
        }

        public /* synthetic */ C19293a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19292b mo47524a(String str) {
            C19292b bVar = new C19292b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_REJECT_REASON", str)));
            return bVar;
        }
    }

    /* renamed from: b00.b$b */
    static final class C19294b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19292b f53514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19294b(C19292b bVar) {
            super(0);
            this.f53514d = bVar;
        }

        public final String invoke() {
            return this.f53514d.requireArguments().getString("EXTRA_REJECT_REASON");
        }
    }

    /* renamed from: f2 */
    private final C27400q2 m64755f2() {
        C27400q2 q2Var = this.f53512K;
        C41536l.m120486f(q2Var);
        return q2Var;
    }

    /* renamed from: g2 */
    private final String m64756g2() {
        return (String) this.f53513L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m64757h2(C19292b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53512K = C27400q2.m84903d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F("credit.application.CL.status.R.action.sheet.header", new Object[0]));
        TextView textView = m64755f2().f69588f;
        String g2 = m64756g2();
        if (g2 == null || (str = C32343x.m95388F(g2, new Object[0])) == null) {
            str = C32343x.m95388F("credit.application.CL.result.screen.status.R.main.text", new Object[0]);
        }
        textView.setText(str);
        ImageView imageView = m64755f2().f69589g;
        int i = f53511N;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        imageView.setColorFilter(C32343x.m95418U(i, requireContext));
        Button button = m64755f2().f69587e;
        button.setButtonText(C32343x.m95388F("credit.application.CL.status.R.action.sheet.button", new Object[0]));
        button.setOnClickListener(new C19291a(this));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53512K = null;
    }
}
