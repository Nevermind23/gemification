package cc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10214s;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import ib1.C36382c1;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p149l.C6856b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.sso_client.models.C35947l;
import sso.type.ProcessFlow;
import ua1.C28643g0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: cc1.g */
public final class C31366g extends Fragment {

    /* renamed from: g */
    public static final C31367a f77909g = new C31367a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28643g0 f77910d;

    /* renamed from: e */
    private final C41217g f77911e = C41219i.m119469a(C41222k.NONE, new C31370d(this, (C41806a) null, (C43064a) null, new C31369c(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f77912f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C31368b(this, (C41806a) null, (C43064a) null));

    /* renamed from: cc1.g$a */
    public static final class C31367a {
        private C31367a() {
        }

        public /* synthetic */ C31367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31366g mo71749a() {
            return new C31366g();
        }
    }

    /* renamed from: cc1.g$b */
    public static final class C31368b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f77913d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77914e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77915f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31368b(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f77913d = componentCallbacks;
            this.f77914e = aVar;
            this.f77915f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f77913d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f77914e, this.f77915f);
        }
    }

    /* renamed from: cc1.g$c */
    public static final class C31369c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77916d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31369c(Fragment fragment) {
            super(0);
            this.f77916d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f77916d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f77916d.requireActivity());
        }
    }

    /* renamed from: cc1.g$d */
    public static final class C31370d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77917d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77918e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77919f;

        /* renamed from: g */
        final /* synthetic */ C43064a f77920g;

        /* renamed from: h */
        final /* synthetic */ C43064a f77921h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31370d(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f77917d = fragment;
            this.f77918e = aVar;
            this.f77919f = aVar2;
            this.f77920g = aVar3;
            this.f77921h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f77917d, this.f77918e, this.f77919f, this.f77920g, C41520a0.m120436b(C36382c1.class), this.f77921h);
        }
    }

    /* renamed from: A1 */
    private final void m93265A1() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        dVar.mo35648c2(m93278r1("text.do.document.popup.title"));
        dVar.mo35639Q1(m93278r1("text.do.document.popup.message"));
        dVar.mo35646Z1(m93278r1("text.do.document.popup.button.ok"));
        dVar.mo35642U1(m93278r1("text.do.document.popup.button.cancel"));
        dVar.mo35637O1(Integer.valueOf(C10214s.img_onboarding_infocard_id));
        dVar.mo35645Y1(new C31364e(dVar, this));
        dVar.mo35641T1(new C31365f(dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m93266B1(C13310d dVar, C31366g gVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        gVar.m93276o1();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m93267C1(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: D1 */
    private final void m93268D1() {
        m93277p1().f72740i.setEnabled(m93277p1().f72736e.isChecked());
    }

    /* renamed from: n1 */
    private final void m93275n1() {
        if (m93277p1().f72736e.isChecked()) {
            m93265A1();
        }
    }

    /* renamed from: o1 */
    private final void m93276o1() {
        C28643g0 p1 = m93277p1();
        C36382c1 s1 = m93279s1();
        CharSequence text = p1.f72739h.getText();
        C41536l.m120488h(text, "firstTitleText.text");
        CharSequence text2 = p1.f72738g.getText();
        C41536l.m120488h(text2, "firstTermsText.text");
        CharSequence text3 = p1.f72742k.getText();
        C41536l.m120488h(text3, "secondTitleText.text");
        CharSequence text4 = p1.f72741j.getText();
        C41536l.m120488h(text4, "secondTermsText.text");
        s1.mo89161ex(text, text2, text3, text4, "link.terms.new.client.registration");
    }

    private final void observeData() {
        m93279s1().mo89134Hx().mo4819k(getViewLifecycleOwner(), new C31360a(this));
    }

    /* renamed from: p1 */
    private final C28643g0 m93277p1() {
        C28643g0 g0Var = this.f77910d;
        C41536l.m120486f(g0Var);
        return g0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.mo26763a(r3, new java.lang.Object[0]);
     */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m93278r1(java.lang.String r3) {
        /*
            r2 = this;
            ba1.d0$e r0 = r2.mo71748q1()
            ba1.g0 r0 = r0.mo26716g()
            if (r0 == 0) goto L_0x0015
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.mo26763a(r3, r1)
            if (r0 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r3 = r0
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cc1.C31366g.m93278r1(java.lang.String):java.lang.String");
    }

    /* renamed from: s1 */
    private final C36382c1 m93279s1() {
        return (C36382c1) this.f77911e.getValue();
    }

    /* renamed from: t1 */
    private final void m93280t1() {
        String str;
        C28643g0 p1 = m93277p1();
        p1.f72740i.setEnabled(m93277p1().f72736e.isChecked());
        p1.f72740i.setOnClickListener(new C31361b(this));
        p1.f72736e.setTextClickListener(new C31362c(this));
        p1.f72736e.setOnCheckedChangeListener(new C31363d(this));
        CheckboxView checkboxView = p1.f72736e;
        String string = getString(C10220y.onboarding_terms_checkbox_leading_text);
        C41536l.m120488h(string, "getString(R.string.onboa…ms_checkbox_leading_text)");
        checkboxView.mo35145g(string, getString(C10220y.onboarding_terms_checkbox_clickable_text));
        String str2 = null;
        if (m93279s1().mo89127Bx() == ProcessFlow.REGISTER_NEW_CLIENT) {
            m93277p1().f72739h.setVisibility(0);
            m93277p1().f72738g.setVisibility(0);
            TextView textView = m93277p1().f72738g;
            C10195g0 g = mo71748q1().mo26716g();
            if (g != null) {
                str = g.mo26763a("text.terms.new.client.registration.pricing", new Object[0]);
            } else {
                str = null;
            }
            textView.setText(str);
        }
        TextView textView2 = m93277p1().f72741j;
        C10195g0 g2 = mo71748q1().mo26716g();
        if (g2 != null) {
            str2 = g2.mo26763a("text.terms.new.client.registration", new Object[0]);
        }
        textView2.setText(str2);
        m93268D1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m93281u1(C31366g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m93275n1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m93282v1(C31366g gVar) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m93285z1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m93283x1(C31366g gVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m93268D1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m93284y1(C31366g gVar, C35947l lVar) {
        C41536l.m120489i(gVar, "this$0");
        if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            gVar.m93277p1().f72740i.setLoading(true);
            return;
        }
        gVar.m93277p1().f72740i.setLoading(false);
        gVar.m93268D1();
    }

    /* renamed from: z1 */
    private final void m93285z1() {
        String a;
        C10195g0 g = mo71748q1().mo26716g();
        if (g != null && (a = g.mo26763a("link.terms.new.client.registration", new Object[0])) != null) {
            C6856b a2 = new C6856b.C6857a().mo20931a();
            C41536l.m120488h(a2, "Builder().build()");
            try {
                a2.mo20930a(requireContext(), Uri.parse(a));
            } catch (Exception unused) {
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f77910d = C28643g0.m87676d(layoutInflater);
        ConstraintLayout c = m93277p1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77910d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m93280t1();
    }

    /* renamed from: q1 */
    public final C10146d0.C10172e mo71748q1() {
        return (C10146d0.C10172e) this.f77912f.getValue();
    }
}
