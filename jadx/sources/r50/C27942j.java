package r50;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0214c;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1533o;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10328q;
import p90.C27481z2;
import ue1.C43064a;

/* renamed from: r50.j */
public final class C27942j extends C1483c {

    /* renamed from: v */
    public static final C27943a f71144v = new C27943a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private C27481z2 f71145t;

    /* renamed from: u */
    private final C41217g f71146u = C41219i.m119470b(new C27944b(this));

    /* renamed from: r50.j$a */
    public static final class C27943a {
        private C27943a() {
        }

        public /* synthetic */ C27943a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27942j mo67510a(boolean z) {
            C27942j jVar = new C27942j();
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_PASSIVE", z);
            jVar.setArguments(bundle);
            return jVar;
        }
    }

    /* renamed from: r50.j$b */
    static final class C27944b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27942j f71147d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27944b(C27942j jVar) {
            super(0);
            this.f71147d = jVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f71147d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("KEY_IS_PASSIVE") : false);
        }
    }

    /* renamed from: D1 */
    private final C27481z2 m86258D1() {
        C27481z2 z2Var = this.f71145t;
        C41536l.m120486f(z2Var);
        return z2Var;
    }

    /* renamed from: E1 */
    private final boolean m86259E1() {
        return ((Boolean) this.f71146u.getValue()).booleanValue();
    }

    /* renamed from: F1 */
    public static final C27942j m86260F1(boolean z) {
        return f71144v.mo67510a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m86261G1(C27942j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m86262H1(C27942j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C1533o.m5445b(jVar, "REQUEST_KEY_REFERRALS_POPUP", C0908e.m3336b(C41233s.m119492a("RESULT_YES", Boolean.TRUE)));
        jVar.mo4577k1();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f71145t = null;
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        C41536l.m120488h(layoutInflater, "requireActivity().layoutInflater");
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        this.f71145t = C27481z2.m85230d(layoutInflater);
        C27481z2 D1 = m86258D1();
        if (m86259E1()) {
            D1.f70341j.setText(getString(C10328q.referrals_pop_up_passive_header));
            D1.f70338g.setText(getString(C10328q.referrals_pop_up_passive_desc));
            D1.f70340i.setText(getString(C10328q.referrals_pop_up_passive_no_button_text));
            D1.f70342k.setText(getString(C10328q.referrals_pop_up_passive_yes_button_text));
        } else {
            D1.f70341j.setText(getString(C10328q.referrals_pop_up_header));
            D1.f70338g.setText(getString(C10328q.referrals_pop_up_desc));
            D1.f70340i.setText(getString(C10328q.later));
            D1.f70342k.setText(getString(C10328q.referrals_pop_up_share_code));
        }
        D1.f70336e.setOnClickListener(new C27940h(this));
        D1.f70337f.setOnClickListener(new C27941i(this));
        aVar.setView((View) m86258D1().mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        create.setCanceledOnTouchOutside(false);
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        return create;
    }
}
