package wc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10214s;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ia1.C15587a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.designsystem.components.passcode.PasscodeView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.SessionUserInfo;
import p420fh.C12902d;
import p420fh.C12910e;
import qc1.C42253o0;
import ua1.C28652j0;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: wc1.e */
public final class C43175e extends Fragment {

    /* renamed from: h */
    public static final C43176a f100711h = new C43176a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C28652j0 f100712d;

    /* renamed from: e */
    private final C41217g f100713e = C41219i.m119469a(C41222k.NONE, new C43185j(this, (C41806a) null, (C43064a) null, new C43184i(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f100714f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C43183h(this, (C41806a) null, (C43064a) null));

    /* renamed from: g */
    private final C41217g f100715g = C41219i.m119470b(new C43182g(this));

    /* renamed from: wc1.e$a */
    public static final class C43176a {
        private C43176a() {
        }

        public /* synthetic */ C43176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43175e mo101731a(boolean z) {
            C43175e eVar = new C43175e();
            Bundle bundle = new Bundle();
            bundle.putBoolean("biometric_enabled", z);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    /* renamed from: wc1.e$b */
    static final class C43177b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43175e f100716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43177b(C43175e eVar) {
            super(1);
            this.f100716d = eVar;
        }

        /* renamed from: a */
        public final void mo101732a(String str) {
            C41536l.m120489i(str, "it");
            C42253o0 o1 = this.f100716d.m123855s1();
            o1.mo97743tx(o1.mo97723Ow() + str);
            C28652j0 l1 = this.f100716d.f100712d;
            if (l1 == null) {
                C41536l.m120506z("binding");
                l1 = null;
            }
            l1.f72777g.mo36448h();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo101732a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wc1.e$c */
    static final class C43178c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43175e f100717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43178c(C43175e eVar) {
            super(0);
            this.f100717d = eVar;
        }

        public final void invoke() {
            this.f100717d.m123855s1().mo97743tx(C40445z.m117190U0(this.f100717d.m123855s1().mo97723Ow(), 1));
            C28652j0 l1 = this.f100717d.f100712d;
            if (l1 == null) {
                C41536l.m120506z("binding");
                l1 = null;
            }
            l1.f72777g.mo36450j();
        }
    }

    /* renamed from: wc1.e$d */
    static final class C43179d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43175e f100718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43179d(C43175e eVar) {
            super(0);
            this.f100718d = eVar;
        }

        public final void invoke() {
            this.f100718d.m123860y1(true);
        }
    }

    /* renamed from: wc1.e$e */
    static final class C43180e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43175e f100719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43180e(C43175e eVar) {
            super(0);
            this.f100719d = eVar;
        }

        public final void invoke() {
            this.f100719d.m123855s1().mo97711Cw();
        }
    }

    /* renamed from: wc1.e$f */
    static final class C43181f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43175e f100720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43181f(C43175e eVar) {
            super(1);
            this.f100720d = eVar;
        }

        /* renamed from: a */
        public final void mo101733a(PasscodeView.C13440b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "it");
            C28652j0 l1 = this.f100720d.f100712d;
            if (l1 == null) {
                C41536l.m120506z("binding");
                l1 = null;
            }
            NumericKeyboardView numericKeyboardView = l1.f72776f;
            if (bVar == PasscodeView.C13440b.NORMAL) {
                z = true;
            } else {
                z = false;
            }
            numericKeyboardView.setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo101733a((PasscodeView.C13440b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wc1.e$g */
    static final class C43182g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43175e f100721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43182g(C43175e eVar) {
            super(0);
            this.f100721d = eVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f100721d.requireArguments().getBoolean("biometric_enabled", false));
        }
    }

    /* renamed from: wc1.e$h */
    public static final class C43183h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f100722d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100723e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100724f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43183h(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f100722d = componentCallbacks;
            this.f100723e = aVar;
            this.f100724f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f100722d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f100723e, this.f100724f);
        }
    }

    /* renamed from: wc1.e$i */
    public static final class C43184i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43184i(Fragment fragment) {
            super(0);
            this.f100725d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f100725d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f100725d.requireActivity());
        }
    }

    /* renamed from: wc1.e$j */
    public static final class C43185j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100726d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100727e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100728f;

        /* renamed from: g */
        final /* synthetic */ C43064a f100729g;

        /* renamed from: h */
        final /* synthetic */ C43064a f100730h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43185j(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f100726d = fragment;
            this.f100727e = aVar;
            this.f100728f = aVar2;
            this.f100729g = aVar3;
            this.f100730h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f100726d, this.f100727e, this.f100728f, this.f100729g, C41520a0.m120436b(C42253o0.class), this.f100730h);
        }
    }

    /* renamed from: wc1.e$k */
    public static final class C43186k implements C15587a.C15588a {

        /* renamed from: a */
        final /* synthetic */ C43175e f100731a;

        C43186k(C43175e eVar) {
            this.f100731a = eVar;
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
            if (this.f100731a.m123854r1()) {
                if (this.f100731a.getActivity() != null) {
                    String a2 = C15587a.f44276a.mo42843a(num);
                    if (a2 == null || C40439w.m117118v(a2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = "Biometric Auth Failed";
                    if (!(z || (g = this.f100731a.m123853q1().mo26716g()) == null || (a = g.mo26763a(a2, new Object[0])) == null)) {
                        str = a;
                    }
                    C1505h requireActivity = this.f100731a.requireActivity();
                    C41536l.m120488h(requireActivity, "requireActivity()");
                    C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
                }
                C28652j0 l1 = this.f100731a.f100712d;
                if (l1 == null) {
                    C41536l.m120506z("binding");
                    l1 = null;
                }
                l1.f72777g.mo36451k();
            }
        }

        /* renamed from: d */
        public void mo42848d() {
            String str;
            String a;
            if (this.f100731a.getActivity() != null) {
                String string = this.f100731a.getString(C10220y.security_settings_biometrics_not_enabled_info_feedback);
                C41536l.m120488h(string, "getString(R.string.secur…ot_enabled_info_feedback)");
                C10195g0 g = this.f100731a.m123853q1().mo26716g();
                if (g == null || (a = g.mo26763a("error.andr.biomet.error_no_biometrics", new Object[0])) == null) {
                    str = string;
                } else {
                    str = a;
                }
                C1505h requireActivity = this.f100731a.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        public void onSuccess() {
            this.f100731a.m123855s1().mo97733Zw();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C10146d0.C10172e m123853q1() {
        return (C10146d0.C10172e) this.f100714f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final boolean m123854r1() {
        return ((Boolean) this.f100715g.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C42253o0 m123855s1() {
        return (C42253o0) this.f100713e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m123856t1(C43175e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m123855s1().mo97715Fw();
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m123857u1(C43175e eVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(eVar, "this$0");
        C28652j0 j0Var = eVar.f100712d;
        if (j0Var == null) {
            C41536l.m120506z("binding");
            j0Var = null;
        }
        ButtonListView buttonListView = j0Var.f72778h;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (!(sessionUserInfo == null || (avatarUrl = sessionUserInfo.getAvatarUrl()) == null)) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
        buttonListView.setOnButtonClicked(new C43180e(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m123858v1(C43175e eVar, C35947l lVar) {
        C41536l.m120489i(eVar, "this$0");
        C28652j0 j0Var = null;
        if (lVar instanceof C35947l.C35951d) {
            C28652j0 j0Var2 = eVar.f100712d;
            if (j0Var2 == null) {
                C41536l.m120506z("binding");
            } else {
                j0Var = j0Var2;
            }
            j0Var.f72777g.mo36453m();
        } else if (lVar instanceof C35947l.C35949b) {
            C28652j0 j0Var3 = eVar.f100712d;
            if (j0Var3 == null) {
                C41536l.m120506z("binding");
            } else {
                j0Var = j0Var3;
            }
            j0Var.f72777g.mo36451k();
        } else if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            C28652j0 j0Var4 = eVar.f100712d;
            if (j0Var4 == null) {
                C41536l.m120506z("binding");
                j0Var4 = null;
            }
            j0Var4.f72777g.mo36452l();
            C28652j0 j0Var5 = eVar.f100712d;
            if (j0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                j0Var = j0Var5;
            }
            j0Var.f72776f.setEnabled(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m123859x1(C43175e eVar, C35947l lVar) {
        C41536l.m120489i(eVar, "this$0");
        C28652j0 j0Var = null;
        if (lVar instanceof C35947l.C35951d) {
            C28652j0 j0Var2 = eVar.f100712d;
            if (j0Var2 == null) {
                C41536l.m120506z("binding");
            } else {
                j0Var = j0Var2;
            }
            j0Var.f72777g.mo36453m();
        } else if (lVar instanceof C35947l.C35949b) {
            if (eVar.getActivity() != null) {
                C12902d.C12903a aVar = C12902d.f38098b;
                C1505h requireActivity = eVar.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12902d.m48765o(C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null), "Invalid biometric credentials", (C12902d.C12905b) null, 2, (Object) null);
            }
            C28652j0 j0Var3 = eVar.f100712d;
            if (j0Var3 == null) {
                C41536l.m120506z("binding");
            } else {
                j0Var = j0Var3;
            }
            j0Var.f72777g.mo36451k();
        } else if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            C28652j0 j0Var4 = eVar.f100712d;
            if (j0Var4 == null) {
                C41536l.m120506z("binding");
                j0Var4 = null;
            }
            j0Var4.f72776f.setEnabled(false);
            C28652j0 j0Var5 = eVar.f100712d;
            if (j0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                j0Var = j0Var5;
            }
            j0Var.f72777g.mo36452l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m123860y1(boolean z) {
        if (m123855s1().mo97731Yw()) {
            C15587a.f44276a.mo42845c(this, new C43186k(this));
        } else if (z && getActivity() != null) {
            C12902d.C12903a aVar = C12902d.f38098b;
            C1505h requireActivity = requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C12902d.m48765o(C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null), "Biometric authentication not enabled", (C12902d.C12905b) null, 2, (Object) null);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28652j0 d = C28652j0.m87714d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f100712d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ScrollView c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C28652j0 j0Var = this.f100712d;
        C28652j0 j0Var2 = null;
        if (j0Var == null) {
            C41536l.m120506z("binding");
            j0Var = null;
        }
        j0Var.f72775e.setOnClickListener(new C43171a(this));
        C28652j0 j0Var3 = this.f100712d;
        if (j0Var3 == null) {
            C41536l.m120506z("binding");
            j0Var3 = null;
        }
        NumericKeyboardView numericKeyboardView = j0Var3.f72776f;
        numericKeyboardView.setNumbersClickedListener(new C43177b(this));
        numericKeyboardView.setBackSpaceClickedListener(new C43178c(this));
        numericKeyboardView.setAdditionalButtonEnabled(m123854r1());
        numericKeyboardView.setAdditionalButtonClickedListener(new C43179d(this));
        C28652j0 j0Var4 = this.f100712d;
        if (j0Var4 == null) {
            C41536l.m120506z("binding");
            j0Var4 = null;
        }
        ButtonListView buttonListView = j0Var4.f72778h;
        C41536l.m120488h(buttonListView, "");
        ButtonListView.m49639n(buttonListView, (Integer) null, C0767a.m2895e(buttonListView.getContext(), C10214s.f28278a), (String) null, 5, (Object) null);
        m123855s1().mo97721Mw().mo4819k(getViewLifecycleOwner(), new C43172b(this));
        m123855s1().mo97727Tw().mo4819k(getViewLifecycleOwner(), new C43173c(this));
        if (m123854r1()) {
            m123855s1().mo97719Jw().mo4819k(getViewLifecycleOwner(), new C43174d(this));
        }
        C28652j0 j0Var5 = this.f100712d;
        if (j0Var5 == null) {
            C41536l.m120506z("binding");
        } else {
            j0Var2 = j0Var5;
        }
        j0Var2.f72777g.setStateChangedListener(new C43181f(this));
        if (m123854r1() && m123855s1().mo97726Sw()) {
            m123860y1(false);
        }
    }
}
