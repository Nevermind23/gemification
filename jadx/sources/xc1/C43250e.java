package xc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10214s;
import ca1.C10379a;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.SessionUserInfo;
import qc1.C42253o0;
import ua1.C28661m0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: xc1.e */
public final class C43250e extends Fragment {

    /* renamed from: d */
    private C28661m0 f100998d;

    /* renamed from: e */
    private final C41217g f100999e = C41219i.m119469a(C41222k.SYNCHRONIZED, new C43253c(this, (C41806a) null, (C43064a) null));

    /* renamed from: f */
    private final C41217g f101000f = C41219i.m119469a(C41222k.NONE, new C43255e(this, (C41806a) null, (C43064a) null, new C43254d(this), (C43064a) null));

    /* renamed from: xc1.e$a */
    static final class C43251a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43250e f101001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43251a(C43250e eVar) {
            super(0);
            this.f101001d = eVar;
        }

        public final void invoke() {
            this.f101001d.m124199o1().mo97711Cw();
        }
    }

    /* renamed from: xc1.e$b */
    public static final class C43252b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C43250e f101002d;

        public C43252b(C43250e eVar) {
            this.f101002d = eVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f101002d.m124204t1();
        }
    }

    /* renamed from: xc1.e$c */
    public static final class C43253c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f101003d;

        /* renamed from: e */
        final /* synthetic */ C41806a f101004e;

        /* renamed from: f */
        final /* synthetic */ C43064a f101005f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43253c(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f101003d = componentCallbacks;
            this.f101004e = aVar;
            this.f101005f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f101003d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f101004e, this.f101005f);
        }
    }

    /* renamed from: xc1.e$d */
    public static final class C43254d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f101006d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43254d(Fragment fragment) {
            super(0);
            this.f101006d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f101006d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f101006d.requireActivity());
        }
    }

    /* renamed from: xc1.e$e */
    public static final class C43255e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f101007d;

        /* renamed from: e */
        final /* synthetic */ C41806a f101008e;

        /* renamed from: f */
        final /* synthetic */ C43064a f101009f;

        /* renamed from: g */
        final /* synthetic */ C43064a f101010g;

        /* renamed from: h */
        final /* synthetic */ C43064a f101011h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43255e(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f101007d = fragment;
            this.f101008e = aVar;
            this.f101009f = aVar2;
            this.f101010g = aVar3;
            this.f101011h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f101007d, this.f101008e, this.f101009f, this.f101010g, C41520a0.m120436b(C42253o0.class), this.f101011h);
        }
    }

    /* renamed from: n1 */
    private final C10146d0.C10172e m124198n1() {
        return (C10146d0.C10172e) this.f100999e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public final C42253o0 m124199o1() {
        return (C42253o0) this.f101000f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m124200p1(C43250e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m124199o1().mo97738lx();
        C10379a b = eVar.m124198n1().mo26711b();
        if (b != null) {
            C10379a.C10380a.m37703a(b, "Digital Onboarding", "click_recovery", (String) null, (Bundle) null, (C10379a.C10381b) null, 28, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m124201q1(C43250e eVar, C35947l lVar) {
        C41536l.m120489i(eVar, "this$0");
        C28661m0 m0Var = eVar.f100998d;
        if (m0Var == null) {
            C41536l.m120506z("binding");
            m0Var = null;
        }
        m0Var.f72831l.setLoading(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m124202r1(C43250e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C28661m0 m0Var = eVar.f100998d;
        C28661m0 m0Var2 = null;
        if (m0Var == null) {
            C41536l.m120506z("binding");
            m0Var = null;
        }
        m0Var.f72831l.setLoading(true);
        C42253o0 o1 = eVar.m124199o1();
        C28661m0 m0Var3 = eVar.f100998d;
        if (m0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            m0Var2 = m0Var3;
        }
        o1.mo97745vx(m0Var2.f72828i.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m124203s1(C43250e eVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(eVar, "this$0");
        C28661m0 m0Var = eVar.f100998d;
        if (m0Var == null) {
            C41536l.m120506z("binding");
            m0Var = null;
        }
        ButtonListView buttonListView = m0Var.f72830k;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (!(sessionUserInfo == null || (avatarUrl = sessionUserInfo.getAvatarUrl()) == null)) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
        buttonListView.setOnButtonClicked(new C43251a(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m124204t1() {
        C28661m0 m0Var = this.f100998d;
        C28661m0 m0Var2 = null;
        if (m0Var == null) {
            C41536l.m120506z("binding");
            m0Var = null;
        }
        Button button = m0Var.f72831l;
        C28661m0 m0Var3 = this.f100998d;
        if (m0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            m0Var2 = m0Var3;
        }
        button.setEnabled(!C40439w.m117118v(m0Var2.f72828i.getInputText()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28661m0 d = C28661m0.m87755d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f100998d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ScrollView c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onPause() {
        C28661m0 m0Var = this.f100998d;
        if (m0Var == null) {
            C41536l.m120506z("binding");
            m0Var = null;
        }
        m0Var.f72828i.getTextInput().clearFocus();
        super.onPause();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C28661m0 m0Var = this.f100998d;
        C28661m0 m0Var2 = null;
        if (m0Var == null) {
            C41536l.m120506z("binding");
            m0Var = null;
        }
        Input input = m0Var.f72828i;
        input.getTextInput().setInputType(129);
        input.getTextInput().addTextChangedListener(new C43252b(this));
        input.requestFocus();
        C41536l.m120488h(input, "");
        C10145d.m37092f(input);
        C28661m0 m0Var3 = this.f100998d;
        if (m0Var3 == null) {
            C41536l.m120506z("binding");
            m0Var3 = null;
        }
        m0Var3.f72825f.setOnClickListener(new C43246a(this));
        m124199o1().mo42544x0().mo4819k(getViewLifecycleOwner(), new C43247b(this));
        C28661m0 m0Var4 = this.f100998d;
        if (m0Var4 == null) {
            C41536l.m120506z("binding");
            m0Var4 = null;
        }
        m0Var4.f72831l.setOnClickListener(new C43248c(this));
        C28661m0 m0Var5 = this.f100998d;
        if (m0Var5 == null) {
            C41536l.m120506z("binding");
        } else {
            m0Var2 = m0Var5;
        }
        ButtonListView buttonListView = m0Var2.f72830k;
        C41536l.m120488h(buttonListView, "");
        ButtonListView.m49639n(buttonListView, (Integer) null, C0767a.m2895e(buttonListView.getContext(), C10214s.f28278a), (String) null, 5, (Object) null);
        m124199o1().mo97721Mw().mo4819k(getViewLifecycleOwner(), new C43249d(this));
        m124204t1();
    }
}
