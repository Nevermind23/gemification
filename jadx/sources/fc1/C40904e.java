package fc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.passwordrecovery.C41043s0;
import sso.type.UserContactType;
import ua1.C28662m1;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: fc1.e */
public final class C40904e extends Fragment {

    /* renamed from: h */
    public static final C40905a f96637h = new C40905a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f96638d = C41219i.m119469a(C41222k.NONE, new C40911g(this, (C41806a) null, (C43064a) null, new C40910f(this), (C43064a) null));

    /* renamed from: e */
    private final C41217g f96639e = C41219i.m119469a(C41222k.SYNCHRONIZED, new C40909e(this, (C41806a) null, (C43064a) null));
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C28662m1 f96640f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C40906b f96641g;

    /* renamed from: fc1.e$a */
    public static final class C40905a {
        private C40905a() {
        }

        public /* synthetic */ C40905a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40904e mo95303a() {
            return new C40904e();
        }
    }

    /* renamed from: fc1.e$b */
    public interface C40906b {
        /* renamed from: a */
        void mo95297a(String str);
    }

    /* renamed from: fc1.e$c */
    static final class C40907c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40904e f96642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40907c(C40904e eVar) {
            super(0);
            this.f96642d = eVar;
        }

        public final void invoke() {
            C40906b k1 = this.f96642d.f96641g;
            if (k1 != null) {
                C28662m1 j1 = this.f96642d.f96640f;
                if (j1 == null) {
                    C41536l.m120506z("binding");
                    j1 = null;
                }
                k1.mo95297a(j1.f72837h.getInputText());
            }
        }
    }

    /* renamed from: fc1.e$d */
    public static final class C40908d implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C40904e f96643d;

        public C40908d(C40904e eVar) {
            this.f96643d = eVar;
        }

        public void afterTextChanged(Editable editable) {
            C28662m1 j1 = this.f96643d.f96640f;
            C28662m1 m1Var = null;
            if (j1 == null) {
                C41536l.m120506z("binding");
                j1 = null;
            }
            Button button = j1.f72834e;
            C28662m1 j12 = this.f96643d.f96640f;
            if (j12 == null) {
                C41536l.m120506z("binding");
            } else {
                m1Var = j12;
            }
            button.setEnabled(m1Var.f72837h.getTextInput().getText().length() > 5);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: fc1.e$e */
    public static final class C40909e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f96644d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96645e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96646f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40909e(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f96644d = componentCallbacks;
            this.f96645e = aVar;
            this.f96646f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f96644d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f96645e, this.f96646f);
        }
    }

    /* renamed from: fc1.e$f */
    public static final class C40910f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40910f(Fragment fragment) {
            super(0);
            this.f96647d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f96647d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f96647d.requireActivity());
        }
    }

    /* renamed from: fc1.e$g */
    public static final class C40911g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f96648d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96649e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96650f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96651g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96652h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40911g(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96648d = fragment;
            this.f96649e = aVar;
            this.f96650f = aVar2;
            this.f96651g = aVar3;
            this.f96652h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f96648d, this.f96649e, this.f96650f, this.f96651g, C41520a0.m120436b(C41043s0.class), this.f96652h);
        }
    }

    /* renamed from: l1 */
    private final C10146d0.C10172e m118655l1() {
        return (C10146d0.C10172e) this.f96639e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m118656n1(Button button, C40904e eVar, View view) {
        C41536l.m120489i(button, "$this_apply");
        C41536l.m120489i(eVar, "this$0");
        if (button.isEnabled()) {
            C41043s0 m1 = eVar.mo95302m1();
            C28662m1 m1Var = eVar.f96640f;
            if (m1Var == null) {
                C41536l.m120506z("binding");
                m1Var = null;
            }
            m1.mo95436Zx(m1Var.f72837h.getInputText(), eVar.mo95302m1().mo95440ex(), new C40907c(eVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m118657o1(Button button, Boolean bool) {
        C41536l.m120489i(button, "$this_apply");
        C41536l.m120488h(bool, "it");
        button.setLoading(bool.booleanValue());
    }

    /* renamed from: m1 */
    public final C41043s0 mo95302m1() {
        return (C41043s0) this.f96638d.getValue();
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.f96641g = (C40898b) parentFragment;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.passwordrecovery.steps.contacts.ConfirmNumberActionSheet");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28662m1 d = C28662m1.m87760d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, container, false)");
        this.f96640f = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        LinearLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDetach() {
        super.onDetach();
        this.f96641g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        UserContactType userContactType;
        UserContactType userContactType2;
        String str2;
        String str3;
        UserContactType userContactType3;
        UserContactType userContactType4;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C28662m1 m1Var = this.f96640f;
        String str4 = null;
        if (m1Var == null) {
            C41536l.m120506z("binding");
            m1Var = null;
        }
        Button button = m1Var.f72834e;
        C28662m1 m1Var2 = this.f96640f;
        if (m1Var2 == null) {
            C41536l.m120506z("binding");
            m1Var2 = null;
        }
        if (m1Var2.f72837h.getTextInput().getText().length() > 5) {
            z = true;
        } else {
            z = false;
        }
        button.setEnabled(z);
        button.setOnClickListener(new C40902c(button, this));
        mo95302m1().mo95421Bx().mo4819k(getViewLifecycleOwner(), new C40903d(button));
        C28662m1 m1Var3 = this.f96640f;
        if (m1Var3 == null) {
            C41536l.m120506z("binding");
            m1Var3 = null;
        }
        AppCompatTextView appCompatTextView = m1Var3.f72836g;
        UserContact dx = mo95302m1().mo95438dx();
        if (dx != null) {
            str = dx.mo88418a();
        } else {
            str = null;
        }
        appCompatTextView.setText(str);
        C28662m1 m1Var4 = this.f96640f;
        if (m1Var4 == null) {
            C41536l.m120506z("binding");
            m1Var4 = null;
        }
        Input input = m1Var4.f72837h;
        UserContact dx2 = mo95302m1().mo95438dx();
        if (dx2 != null) {
            userContactType = dx2.mo88424f();
        } else {
            userContactType = null;
        }
        UserContactType userContactType5 = UserContactType.PHONE;
        if (userContactType == userContactType5) {
            input.getTextInput().setInputType(3);
        }
        input.getTextInput().addTextChangedListener(new C40908d(this));
        UserContact dx3 = mo95302m1().mo95438dx();
        if (dx3 != null) {
            userContactType2 = dx3.mo88424f();
        } else {
            userContactType2 = null;
        }
        if (userContactType2 == userContactType5) {
            str2 = input.getContext().getString(C10220y.common_text_phone_number);
        } else {
            str2 = input.getContext().getString(C10220y.common_text_email);
        }
        input.setHintText((CharSequence) str2);
        C28662m1 m1Var5 = this.f96640f;
        if (m1Var5 == null) {
            C41536l.m120506z("binding");
            m1Var5 = null;
        }
        PageDescriptionView pageDescriptionView = m1Var5.f72835f;
        if (mo95302m1().mo95448ix()) {
            UserContact dx4 = mo95302m1().mo95438dx();
            if (dx4 != null) {
                userContactType4 = dx4.mo88424f();
            } else {
                userContactType4 = null;
            }
            if (userContactType4 == UserContactType.MAIL) {
                str3 = "text.contact.confirm.finan.mail";
            } else {
                str3 = "text.contact.confirm.finan.phone";
            }
        } else {
            UserContact dx5 = mo95302m1().mo95438dx();
            if (dx5 != null) {
                userContactType3 = dx5.mo88424f();
            } else {
                userContactType3 = null;
            }
            if (userContactType3 == UserContactType.MAIL) {
                str3 = "text.contact.confirm.chosen.mail";
            } else {
                str3 = "text.contact.confirm.chosen.phone";
            }
        }
        C10195g0 g = m118655l1().mo26716g();
        if (g != null) {
            str4 = g.mo26763a(str3, new Object[0]);
        }
        pageDescriptionView.setText(str4);
    }
}
