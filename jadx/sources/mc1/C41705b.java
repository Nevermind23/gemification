package mc1;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10214s;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import ia1.C15587a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p349ah.C9860d;
import p420fh.C12902d;
import p420fh.C12910e;
import ua1.C28679s0;
import ue1.C43064a;
import wg1.C43241a;

/* renamed from: mc1.b */
public final class C41705b extends C9860d {

    /* renamed from: E */
    public static final C41707b f97967E = new C41707b((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28679s0 f97968B;

    /* renamed from: C */
    private final C41217g f97969C = C41219i.m119469a(C41222k.SYNCHRONIZED, new C41709d(this, (C41806a) null, (C43064a) null));

    /* renamed from: D */
    private C41706a f97970D;

    /* renamed from: mc1.b$a */
    public interface C41706a {
        /* renamed from: F */
        void mo95742F();
    }

    /* renamed from: mc1.b$b */
    public static final class C41707b {
        private C41707b() {
        }

        public /* synthetic */ C41707b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41705b mo96510a() {
            return new C41705b();
        }
    }

    /* renamed from: mc1.b$c */
    public static final class C41708c implements C15587a.C15588a {

        /* renamed from: a */
        final /* synthetic */ C41705b f97971a;

        C41708c(C41705b bVar) {
            this.f97971a = bVar;
        }

        /* renamed from: b */
        public void mo42846b() {
        }

        /* renamed from: c */
        public void mo42847c(Throwable th, Integer num) {
            boolean z;
            C10195g0 g;
            String a;
            C41536l.m120489i(th, "throwable");
            if (this.f97971a.getActivity() != null) {
                String a2 = C15587a.f44276a.mo42843a(num);
                if (a2 == null || C40439w.m117118v(a2)) {
                    z = true;
                } else {
                    z = false;
                }
                String str = "Biometric Auth Failed";
                if (!(z || (g = this.f97971a.m120963i2().mo26716g()) == null || (a = g.mo26763a(a2, new Object[0])) == null)) {
                    str = a;
                }
                C1505h requireActivity = this.f97971a.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        /* renamed from: d */
        public void mo42848d() {
            String str;
            String a;
            if (this.f97971a.getActivity() != null) {
                String string = this.f97971a.getString(C10220y.security_settings_biometrics_not_enabled_info_feedback);
                C41536l.m120488h(string, "getString(R.string.secur…ot_enabled_info_feedback)");
                C10195g0 g = this.f97971a.m120963i2().mo26716g();
                if (g == null || (a = g.mo26763a("error.andr.biomet.error_no_biometrics", new Object[0])) == null) {
                    str = string;
                } else {
                    str = a;
                }
                C1505h requireActivity = this.f97971a.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
            }
            this.f97971a.mo4577k1();
        }

        public void onSuccess() {
            C41706a h2 = this.f97971a.mo96508h2();
            if (h2 != null) {
                h2.mo95742F();
            }
            this.f97971a.mo4577k1();
        }
    }

    /* renamed from: mc1.b$d */
    public static final class C41709d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97972d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97973e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97974f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41709d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97972d = componentCallbacks;
            this.f97973e = aVar;
            this.f97974f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97972d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f97973e, this.f97974f);
        }
    }

    /* renamed from: f2 */
    private final void m120961f2() {
        C15587a.f44276a.mo42845c(this, new C41708c(this));
    }

    /* renamed from: g2 */
    private final C28679s0 m120962g2() {
        C28679s0 s0Var = this.f97968B;
        C41536l.m120486f(s0Var);
        return s0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C10146d0.C10172e m120963i2() {
        return (C10146d0.C10172e) this.f97969C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m120964j2(C41705b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m120961f2();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f97968B = C28679s0.m87832d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C10220y.setup_security_parameters_biometry_page_title));
    }

    /* renamed from: h2 */
    public final C41706a mo96508h2() {
        return this.f97970D;
    }

    /* renamed from: k2 */
    public final void mo96509k2(C41706a aVar) {
        this.f97970D = aVar;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m120962g2().f72922e.setOnClickListener(new C41704a(this));
        PageDescriptionView pageDescriptionView = m120962g2().f72924g;
        C10195g0 g = m120963i2().mo26716g();
        if (g == null || (str = g.mo26763a("text.biometrics.suggestion", new Object[0])) == null) {
            str = getString(C10220y.setup_security_parameters_biometrics_page_description_text);
        }
        pageDescriptionView.setText(str);
        PageDescriptionView pageDescriptionView2 = m120962g2().f72924g;
        C10195g0 g2 = m120963i2().mo26716g();
        if (g2 == null || (str2 = g2.mo26763a("text.biometrics.suggestion.header", new Object[0])) == null) {
            str2 = getString(C10220y.setup_security_parameters_biometrics_page_description_title);
        }
        pageDescriptionView2.setTitle(str2);
        m120962g2().f72924g.setDrawableSrc(Integer.valueOf(C10214s.icons_48_security_fingerprint));
    }
}
