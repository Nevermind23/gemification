package zc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ca1.C10379a;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.sso_client.models.C35947l;
import qc1.C42253o0;
import ua1.C28696z0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: zc1.e */
public final class C43408e extends Fragment {

    /* renamed from: d */
    private final C41217g f101259d = C41219i.m119469a(C41222k.SYNCHRONIZED, new C43410b(this, (C41806a) null, (C43064a) null));

    /* renamed from: e */
    private C28696z0 f101260e;

    /* renamed from: f */
    private final C41217g f101261f = C41219i.m119469a(C41222k.NONE, new C43412d(this, (C41806a) null, (C43064a) null, new C43411c(this), (C43064a) null));

    /* renamed from: zc1.e$a */
    public static final class C43409a implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C43408e f101262d;

        public C43409a(C43408e eVar) {
            this.f101262d = eVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f101262d.m124523s1();
        }
    }

    /* renamed from: zc1.e$b */
    public static final class C43410b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f101263d;

        /* renamed from: e */
        final /* synthetic */ C41806a f101264e;

        /* renamed from: f */
        final /* synthetic */ C43064a f101265f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43410b(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f101263d = componentCallbacks;
            this.f101264e = aVar;
            this.f101265f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f101263d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f101264e, this.f101265f);
        }
    }

    /* renamed from: zc1.e$c */
    public static final class C43411c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f101266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43411c(Fragment fragment) {
            super(0);
            this.f101266d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f101266d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f101266d.requireActivity());
        }
    }

    /* renamed from: zc1.e$d */
    public static final class C43412d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f101267d;

        /* renamed from: e */
        final /* synthetic */ C41806a f101268e;

        /* renamed from: f */
        final /* synthetic */ C43064a f101269f;

        /* renamed from: g */
        final /* synthetic */ C43064a f101270g;

        /* renamed from: h */
        final /* synthetic */ C43064a f101271h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43412d(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f101267d = fragment;
            this.f101268e = aVar;
            this.f101269f = aVar2;
            this.f101270g = aVar3;
            this.f101271h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f101267d, this.f101268e, this.f101269f, this.f101270g, C41520a0.m120436b(C42253o0.class), this.f101271h);
        }
    }

    /* renamed from: m1 */
    private final C10146d0.C10172e m124517m1() {
        return (C10146d0.C10172e) this.f101259d.getValue();
    }

    /* renamed from: n1 */
    private final C42253o0 m124518n1() {
        return (C42253o0) this.f101261f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m124519o1(C43408e eVar, C35947l lVar) {
        C41536l.m120489i(eVar, "this$0");
        C28696z0 z0Var = eVar.f101260e;
        if (z0Var == null) {
            C41536l.m120506z("binding");
            z0Var = null;
        }
        z0Var.f73080p.setLoading(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m124520p1(C43408e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C28696z0 z0Var = eVar.f101260e;
        C28696z0 z0Var2 = null;
        if (z0Var == null) {
            C41536l.m120506z("binding");
            z0Var = null;
        }
        z0Var.f73080p.setLoading(true);
        C42253o0 n1 = eVar.m124518n1();
        C28696z0 z0Var3 = eVar.f101260e;
        if (z0Var3 == null) {
            C41536l.m120506z("binding");
            z0Var3 = null;
        }
        String inputText = z0Var3.f73082r.getInputText();
        C28696z0 z0Var4 = eVar.f101260e;
        if (z0Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            z0Var2 = z0Var4;
        }
        n1.mo97747xx(inputText, z0Var2.f73079o.isChecked());
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m124521q1(C43408e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C42253o0.m122707zx(eVar.m124518n1(), false, 1, (Object) null);
        C10379a b = eVar.m124517m1().mo26711b();
        if (b != null) {
            C10379a.C10380a.m37703a(b, "Digital Onboarding", "click_registration", (String) null, (Bundle) null, (C10379a.C10381b) null, 28, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m124522r1(C43408e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m124518n1().mo97738lx();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m124523s1() {
        C28696z0 z0Var = this.f101260e;
        C28696z0 z0Var2 = null;
        if (z0Var == null) {
            C41536l.m120506z("binding");
            z0Var = null;
        }
        Button button = z0Var.f73080p;
        C28696z0 z0Var3 = this.f101260e;
        if (z0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            z0Var2 = z0Var3;
        }
        button.setEnabled(!C40439w.m117118v(z0Var2.f73082r.getInputText()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28696z0 d = C28696z0.m87905d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f101260e = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onPause() {
        C28696z0 z0Var = this.f101260e;
        if (z0Var == null) {
            C41536l.m120506z("binding");
            z0Var = null;
        }
        z0Var.f73082r.getTextInput().clearFocus();
        super.onPause();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m124518n1().mo42544x0().mo4819k(getViewLifecycleOwner(), new C43404a(this));
        C28696z0 z0Var = this.f101260e;
        C28696z0 z0Var2 = null;
        if (z0Var == null) {
            C41536l.m120506z("binding");
            z0Var = null;
        }
        z0Var.f73080p.setOnClickListener(new C43405b(this));
        C28696z0 z0Var3 = this.f101260e;
        if (z0Var3 == null) {
            C41536l.m120506z("binding");
            z0Var3 = null;
        }
        z0Var3.f73079o.setChecked(true);
        C28696z0 z0Var4 = this.f101260e;
        if (z0Var4 == null) {
            C41536l.m120506z("binding");
            z0Var4 = null;
        }
        z0Var4.f73076l.setOnClickListener(new C43406c(this));
        C28696z0 z0Var5 = this.f101260e;
        if (z0Var5 == null) {
            C41536l.m120506z("binding");
            z0Var5 = null;
        }
        z0Var5.f73071g.setOnClickListener(new C43407d(this));
        C28696z0 z0Var6 = this.f101260e;
        if (z0Var6 == null) {
            C41536l.m120506z("binding");
        } else {
            z0Var2 = z0Var6;
        }
        z0Var2.f73082r.getTextInput().addTextChangedListener(new C43409a(this));
        m124523s1();
    }
}
