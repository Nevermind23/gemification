package bc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10220y;
import ca1.C10379a;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import ib1.C36382c1;
import ib1.C36427d1;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.model.payment.UpcomingPayment;
import p341ge.bog.sso_client.models.C35947l;
import ua1.C28640f0;
import ub1.C39052c;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: bc1.f */
public final class C31162f extends Fragment {

    /* renamed from: h */
    public static final C31163a f77418h = new C31163a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28640f0 f77419d;

    /* renamed from: e */
    private final C41217g f77420e = C41219i.m119469a(C41222k.NONE, new C31168f(this, (C41806a) null, (C43064a) null, new C31167e(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f77421f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C31166d(this, (C41806a) null, (C43064a) null));

    /* renamed from: g */
    private final C41217g f77422g = C41219i.m119470b(new C31165c(this));

    /* renamed from: bc1.f$a */
    public static final class C31163a {
        private C31163a() {
        }

        public /* synthetic */ C31163a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31162f mo71370a(boolean z) {
            C31162f fVar = new C31162f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("from_recover_password", Boolean.valueOf(z))));
            return fVar;
        }
    }

    /* renamed from: bc1.f$b */
    public static final class C31164b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C31162f f77423d;

        public C31164b(C31162f fVar) {
            this.f77423d = fVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f77423d.m92678A1();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: bc1.f$c */
    static final class C31165c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31162f f77424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31165c(C31162f fVar) {
            super(0);
            this.f77424d = fVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f77424d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("from_recover_password") : false);
        }
    }

    /* renamed from: bc1.f$d */
    public static final class C31166d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f77425d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77426e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77427f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31166d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f77425d = componentCallbacks;
            this.f77426e = aVar;
            this.f77427f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f77425d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f77426e, this.f77427f);
        }
    }

    /* renamed from: bc1.f$e */
    public static final class C31167e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31167e(Fragment fragment) {
            super(0);
            this.f77428d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f77428d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f77428d.requireActivity());
        }
    }

    /* renamed from: bc1.f$f */
    public static final class C31168f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77429d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77430e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77431f;

        /* renamed from: g */
        final /* synthetic */ C43064a f77432g;

        /* renamed from: h */
        final /* synthetic */ C43064a f77433h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31168f(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f77429d = fragment;
            this.f77430e = aVar;
            this.f77431f = aVar2;
            this.f77432g = aVar3;
            this.f77433h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f77429d, this.f77430e, this.f77431f, this.f77432g, C41520a0.m120436b(C36382c1.class), this.f77433h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m92678A1() {
        Button button = m92690s1().f72726e;
        Editable text = m92690s1().f72727f.getTextInput().getText();
        C41536l.m120488h(text, "binding.pinInput.textInput.text");
        button.setEnabled(text.length() > 0);
    }

    /* renamed from: n1 */
    private final void m92685n1() {
        m92690s1().f72726e.setOnClickListener(new C31157a(this));
        EditText textInput = m92690s1().f72727f.getTextInput();
        textInput.addTextChangedListener(new C31164b(this));
        textInput.requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m92686o1(C31162f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m92693v1().mo89167hy(fVar.m92690s1().f72727f.getTextInput().getText().toString(), fVar.m92692u1());
    }

    /* renamed from: p1 */
    private final void m92687p1() {
        C36427d1 Ax = m92693v1().mo89123Ax();
        Ax.mo89129Dv().mo4819k(getViewLifecycleOwner(), new C31158b(this));
        Ax.mo89169je().mo4819k(getViewLifecycleOwner(), new C31159c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m92688q1(C31162f fVar, C35947l lVar) {
        C41536l.m120489i(fVar, "this$0");
        if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            fVar.m92690s1().f72726e.setLoading(true);
        } else {
            fVar.m92690s1().f72726e.setLoading(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m92689r1(C31162f fVar, Boolean bool) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120488h(bool, "showPopup");
        if (bool.booleanValue()) {
            fVar.m92694x1();
            fVar.m92693v1().mo89205yx().mo89178n6();
        }
    }

    /* renamed from: s1 */
    private final C28640f0 m92690s1() {
        C28640f0 f0Var = this.f77419d;
        C41536l.m120486f(f0Var);
        return f0Var;
    }

    /* renamed from: t1 */
    private final C10146d0.C10172e m92691t1() {
        return (C10146d0.C10172e) this.f77421f.getValue();
    }

    /* renamed from: u1 */
    private final boolean m92692u1() {
        return ((Boolean) this.f77422g.getValue()).booleanValue();
    }

    /* renamed from: v1 */
    private final C36382c1 m92693v1() {
        return (C36382c1) this.f77420e.getValue();
    }

    /* renamed from: x1 */
    private final void m92694x1() {
        C13310d c = new C39052c().mo92742c(C13310d.C13312b.TITLE_TWO_BUTTON, C10145d.m37090d("text.existing.customer.popup.header", C10220y.onboarding_pin_dialog_title, getContext(), m92691t1()), C10145d.m37090d("text.existing.customer.popup.message", C10220y.onboarding_pin_dialog_text, getContext(), m92691t1()), (Integer) null, (Integer) null, C10145d.m37090d("text.existing.customer.popup.cancel", C10220y.onboarding_pin_no_dialog_button_text, getContext(), m92691t1()), C10145d.m37090d("text.existing.customer.popup.ok", C10220y.onboarding_pin_yes_dialog_button_text, getContext(), m92691t1()));
        c.mo35645Y1(new C31160d(this, c));
        c.mo35641T1(new C31161e(this, c));
        C1505h activity = getActivity();
        if (activity != null) {
            ConstraintLayout c2 = m92690s1().mo3946b();
            C41536l.m120488h(c2, "binding.root");
            C10145d.m37091e(activity, c2);
        }
        c.mo4576A1(getChildFragmentManager(), (String) null);
        m92693v1().mo89171jy();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m92695y1(C31162f fVar, C13310d dVar, Button button) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(dVar, "$dialog");
        C41536l.m120489i(button, "it");
        fVar.m92693v1().mo89176mx();
        dVar.mo4577k1();
        C10379a b = fVar.m92691t1().mo26711b();
        if (b != null) {
            C10379a.C10380a.m37703a(b, "Digital Onboarding", "redirect_to_recovery", UpcomingPayment.PROD_GROUP_TYPE_CREDIT_CARD_BILL, (Bundle) null, (C10379a.C10381b) null, 24, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m92696z1(C31162f fVar, C13310d dVar, Button button) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(dVar, "$dialog");
        C41536l.m120489i(button, "it");
        fVar.m92693v1().mo89202wy();
        dVar.mo4577k1();
        C10379a b = fVar.m92691t1().mo26711b();
        if (b != null) {
            C10379a.C10380a.m37703a(b, "Digital Onboarding", "redirect_to_recovery", "ID", (Bundle) null, (C10379a.C10381b) null, 24, (Object) null);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f77419d = C28640f0.m87662d(layoutInflater);
        ConstraintLayout c = m92690s1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77419d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m92690s1().f72728g.setText(C10145d.m37090d("text.do.enter.pin.number", C10220y.onboarding_enter_pin, requireContext(), m92691t1()));
        m92687p1();
        m92685n1();
        m92678A1();
    }
}
