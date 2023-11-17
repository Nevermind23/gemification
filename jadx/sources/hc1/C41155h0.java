package hc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import ba1.C10221z;
import com.facebook.shimmer.ShimmerFrameLayout;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import ia1.C15587a;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p420fh.C12902d;
import p420fh.C12910e;
import sso.type.AuthElementType;
import ua1.C28692x0;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: hc1.h0 */
public final class C41155h0 extends C1483c {

    /* renamed from: C */
    public static final C41157b f97096C = new C41157b((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C41217g f97097A = C41219i.m119470b(new C41161f(this));

    /* renamed from: B */
    private final C41217g f97098B = C41219i.m119470b(new C41163h(this));

    /* renamed from: t */
    private final C41217g f97099t = C41219i.m119469a(C41222k.NONE, new C41168m(this, (C41806a) null, (C43064a) null, new C41169n(this), (C43064a) null));

    /* renamed from: u */
    private final C41217g f97100u = C41219i.m119469a(C41222k.SYNCHRONIZED, new C41167l(this, (C41806a) null, (C43064a) null));

    /* renamed from: v */
    private boolean f97101v;

    /* renamed from: w */
    private boolean f97102w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f97103x = true;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C28692x0 f97104y;

    /* renamed from: z */
    private C41158c f97105z;

    /* renamed from: hc1.h0$a */
    public enum C41156a {
        BIOMETRIC,
        PASSCODE
    }

    /* renamed from: hc1.h0$b */
    public static final class C41157b {
        private C41157b() {
        }

        public /* synthetic */ C41157b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41155h0 mo95607a(C41156a aVar, boolean z) {
            C41536l.m120489i(aVar, "authType");
            C41155h0 h0Var = new C41155h0();
            h0Var.setArguments(C0908e.m3336b(C41233s.m119492a("AUTH_TYPE", aVar), C41233s.m119492a("IS_SKIPPABLE", Boolean.valueOf(z))));
            return h0Var;
        }
    }

    /* renamed from: hc1.h0$c */
    public interface C41158c {
        /* renamed from: q0 */
        void mo95608q0();

        /* renamed from: u */
        void mo95609u(C41159d dVar);

        /* renamed from: u0 */
        boolean mo95610u0(AuthElementType authElementType);
    }

    /* renamed from: hc1.h0$d */
    public static final class C41159d {

        /* renamed from: a */
        private final AuthElementType f97109a;

        /* renamed from: b */
        private final String f97110b;

        public C41159d(AuthElementType authElementType, String str) {
            C41536l.m120489i(authElementType, "authElementType");
            this.f97109a = authElementType;
            this.f97110b = str;
        }

        /* renamed from: a */
        public final AuthElementType mo95611a() {
            return this.f97109a;
        }

        /* renamed from: b */
        public final String mo95612b() {
            return this.f97110b;
        }
    }

    /* renamed from: hc1.h0$e */
    public /* synthetic */ class C41160e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97111a;

        static {
            int[] iArr = new int[C41156a.values().length];
            iArr[C41156a.BIOMETRIC.ordinal()] = 1;
            iArr[C41156a.PASSCODE.ordinal()] = 2;
            f97111a = iArr;
        }
    }

    /* renamed from: hc1.h0$f */
    static final class C41161f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41155h0 f97112d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41161f(C41155h0 h0Var) {
            super(0);
            this.f97112d = h0Var;
        }

        /* renamed from: b */
        public final C41156a invoke() {
            Serializable serializable = this.f97112d.requireArguments().getSerializable("AUTH_TYPE");
            if (serializable != null) {
                return (C41156a) serializable;
            }
            throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.sca_verification.SingleComponentAuthDialog.AuthType");
        }
    }

    /* renamed from: hc1.h0$g */
    public static final class C41162g implements C15587a.C15588a {

        /* renamed from: a */
        final /* synthetic */ C41155h0 f97113a;

        C41162g(C41155h0 h0Var) {
            this.f97113a = h0Var;
        }

        /* renamed from: b */
        public void mo42846b() {
            this.f97113a.f97103x = false;
            this.f97113a.m119309P1();
        }

        /* renamed from: c */
        public void mo42847c(Throwable th, Integer num) {
            String str;
            Integer num2 = num;
            C41536l.m120489i(th, "throwable");
            boolean z = true;
            if (C41358y.m119999O(C41341q.m119910m(7, 9), num2)) {
                if (this.f97113a.getActivity() != null) {
                    String a = C15587a.f44276a.mo42843a(num2);
                    if (a != null && !C40439w.m117118v(a)) {
                        z = false;
                    }
                    if (!z) {
                        C10195g0 g = this.f97113a.m119313T1().mo26716g();
                        if (g != null) {
                            str = g.mo26763a(a, new Object[0]);
                        } else {
                            str = null;
                        }
                        String str2 = str;
                        if (str2 != null) {
                            C1505h requireActivity = this.f97113a.requireActivity();
                            C41536l.m120488h(requireActivity, "requireActivity()");
                            C12910e.m48790h(requireActivity, str2, (C12902d.C12905b) null, false, 6, (Object) null);
                        } else {
                            String message = th.getMessage();
                            if (message != null) {
                                C12910e.m48792j(this.f97113a, message, (C12902d.C12905b) null, false, 6, (Object) null);
                            }
                        }
                    } else {
                        C12910e.m48792j(this.f97113a, "Biometric Auth Failed", (C12902d.C12905b) null, false, 6, (Object) null);
                    }
                }
                this.f97113a.m119312S1().f73048o.setVisibility(8);
                if (this.f97113a.f97103x) {
                    this.f97113a.m119318Y1();
                }
            } else {
                this.f97113a.f97103x = false;
            }
            if (this.f97113a.f97104y != null) {
                TransitionManager.beginDelayedTransition(this.f97113a.m119312S1().mo3946b());
                this.f97113a.m119312S1().f73050q.setVisibility(0);
                this.f97113a.m119312S1().f73049p.setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo42848d() {
            String str;
            String a;
            if (this.f97113a.getActivity() != null) {
                String string = this.f97113a.getString(C10220y.security_settings_biometrics_not_enabled_info_feedback);
                C41536l.m120488h(string, "getString(R.string.secur…ot_enabled_info_feedback)");
                C10195g0 g = this.f97113a.m119313T1().mo26716g();
                if (g == null || (a = g.mo26763a("error.andr.biomet.error_no_biometrics", new Object[0])) == null) {
                    str = string;
                } else {
                    str = a;
                }
                C1505h requireActivity = this.f97113a.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        public void onSuccess() {
            this.f97113a.m119317X1((String) null);
        }
    }

    /* renamed from: hc1.h0$h */
    static final class C41163h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41155h0 f97114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41163h(C41155h0 h0Var) {
            super(0);
            this.f97114d = h0Var;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f97114d.requireArguments().getBoolean("IS_SKIPPABLE"));
        }
    }

    /* renamed from: hc1.h0$i */
    public static final class C41164i implements View.OnLayoutChangeListener {

        /* renamed from: d */
        final /* synthetic */ C41155h0 f97115d;

        public C41164i(C41155h0 h0Var) {
            this.f97115d = h0Var;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C41536l.m120489i(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f97115d.m119310Q1();
        }
    }

    /* renamed from: hc1.h0$j */
    static final class C41165j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28692x0 f97116d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41165j(C28692x0 x0Var) {
            super(1);
            this.f97116d = x0Var;
        }

        /* renamed from: a */
        public final void mo95616a(String str) {
            C41536l.m120489i(str, "it");
            this.f97116d.f73047n.mo36423g(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95616a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hc1.h0$k */
    static final class C41166k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28692x0 f97117d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41166k(C28692x0 x0Var) {
            super(0);
            this.f97117d = x0Var;
        }

        public final void invoke() {
            this.f97117d.f73047n.mo36431i();
        }
    }

    /* renamed from: hc1.h0$l */
    public static final class C41167l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97118d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97119e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97120f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41167l(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97118d = componentCallbacks;
            this.f97119e = aVar;
            this.f97120f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97118d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f97119e, this.f97120f);
        }
    }

    /* renamed from: hc1.h0$m */
    public static final class C41168m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97121d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97122e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97123f;

        /* renamed from: g */
        final /* synthetic */ C43064a f97124g;

        /* renamed from: h */
        final /* synthetic */ C43064a f97125h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41168m(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f97121d = fragment;
            this.f97122e = aVar;
            this.f97123f = aVar2;
            this.f97124g = aVar3;
            this.f97125h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f97121d, this.f97122e, this.f97123f, this.f97124g, C41520a0.m120436b(C41130b0.class), this.f97125h);
        }
    }

    /* renamed from: hc1.h0$n */
    static final class C41169n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41155h0 f97126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41169n(C41155h0 h0Var) {
            super(0);
            this.f97126d = h0Var;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment requireParentFragment = this.f97126d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return aVar.mo102076a(requireParentFragment, this.f97126d.requireParentFragment());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final void m119309P1() {
        if (this.f97104y != null) {
            TransitionManager.beginDelayedTransition(m119312S1().mo3946b());
            m119312S1().f73048o.setVisibility(0);
            m119312S1().f73050q.setVisibility(0);
            m119312S1().f73049p.setVisibility(0);
            mo95606g2(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final void m119310Q1() {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(400);
        autoTransition.addTarget(m119312S1().f73043j);
        TransitionManager.beginDelayedTransition(m119312S1().f73043j, autoTransition);
        ViewGroup.LayoutParams layoutParams = m119312S1().f73043j.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
            bVar.f2534j = -1;
            bVar.f2532i = 0;
            bVar.f2538l = 0;
            bVar.f2497H = 1.0f;
            m119312S1().f73043j.setLayoutParams(bVar);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* renamed from: R1 */
    private final C41156a m119311R1() {
        return (C41156a) this.f97097A.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public final C28692x0 m119312S1() {
        C28692x0 x0Var = this.f97104y;
        C41536l.m120486f(x0Var);
        return x0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final C10146d0.C10172e m119313T1() {
        return (C10146d0.C10172e) this.f97100u.getValue();
    }

    /* renamed from: U1 */
    private final C41130b0 m119314U1() {
        return (C41130b0) this.f97099t.getValue();
    }

    /* renamed from: V1 */
    private final void m119315V1() {
        C15587a.f44276a.mo42845c(this, new C41162g(this));
    }

    /* renamed from: W1 */
    private final boolean m119316W1() {
        return ((Boolean) this.f97098B.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public final void m119317X1(String str) {
        AuthElementType authElementType;
        this.f97101v = true;
        int i = C41160e.f97111a[m119311R1().ordinal()];
        if (i == 1) {
            authElementType = AuthElementType.BIOMETRY;
        } else if (i == 2) {
            authElementType = AuthElementType.PASSCODE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C41158c cVar = this.f97105z;
        if (cVar != null) {
            cVar.mo95609u(new C41159d(authElementType, str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m119318Y1() {
        AuthElementType authElementType;
        this.f97102w = true;
        int i = C41160e.f97111a[m119311R1().ordinal()];
        if (i == 1) {
            authElementType = AuthElementType.BIOMETRY;
        } else if (i == 2) {
            authElementType = AuthElementType.PASSCODE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C41158c cVar = this.f97105z;
        if (cVar != null && cVar.mo95610u0(authElementType)) {
            mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public static final void m119319Z1(C41155h0 h0Var, View view) {
        C41536l.m120489i(h0Var, "this$0");
        C41158c cVar = h0Var.f97105z;
        if (cVar != null) {
            cVar.mo95608q0();
        }
        h0Var.mo4577k1();
    }

    /* renamed from: a2 */
    private final void m119320a2() {
        int i;
        C28692x0 S1 = m119312S1();
        Button button = S1.f73049p;
        if (m119316W1()) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        S1.f73048o.setOnClickListener(new C41151f0(this));
        S1.f73049p.setOnClickListener(new C41153g0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m119321b2(C41155h0 h0Var, View view) {
        C41536l.m120489i(h0Var, "this$0");
        h0Var.m119315V1();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m119322c2(C41155h0 h0Var, View view) {
        C41536l.m120489i(h0Var, "this$0");
        h0Var.m119318Y1();
    }

    /* renamed from: d2 */
    private final void m119323d2() {
        C28692x0 S1 = m119312S1();
        S1.f73045l.setAdditionalButtonEnabled(false);
        S1.f73047n.setUseSystemKeyboard(false);
        S1.f73047n.setShowForgotButton(m119316W1());
        S1.f73045l.setNumbersClickedListener(new C41165j(S1));
        S1.f73045l.setBackSpaceClickedListener(new C41166k(S1));
        S1.f73047n.setInputListener(new C41147d0(this));
        S1.f73047n.setForgotPasswordClickListener(new C41149e0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public static final void m119324e2(C41155h0 h0Var, String str) {
        C41536l.m120489i(h0Var, "this$0");
        C41536l.m120489i(str, "it");
        if (str.length() == 4) {
            h0Var.m119317X1(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m119325f2(C41155h0 h0Var) {
        C41536l.m120489i(h0Var, "this$0");
        h0Var.m119318Y1();
    }

    /* renamed from: g2 */
    public final void mo95606g2(boolean z) {
        if (this.f97104y != null) {
            for (ShimmerFrameLayout shimmerFrameLayout : C41341q.m119910m(m119312S1().f73041h, m119312S1().f73046m)) {
                if (z) {
                    shimmerFrameLayout.mo8654d(true);
                } else {
                    shimmerFrameLayout.mo8652a();
                }
            }
        }
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.f97105z = (C41158c) parentFragment;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.sca_verification.SingleComponentAuthDialog.SingleComponentAuthDialogCallback");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4588y1(0, C10221z.TransparentBottomSheetDialogTheme);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f97104y = C28692x0.m87887d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m119312S1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97104y = null;
    }

    public void onDetach() {
        super.onDetach();
        this.f97105z = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.f97101v && !this.f97102w) {
            m119314U1().mo95574Xw();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m119312S1().f73038e.setTitle(getString(C10220y.sca_verification_confirm_operation));
        m119312S1().f73042i.setOnClickListener(new C41144c0(this));
        int i = C41160e.f97111a[m119311R1().ordinal()];
        if (i == 1) {
            m119320a2();
            m119312S1().f73039f.setVisibility(0);
            m119315V1();
        } else if (i == 2) {
            m119323d2();
            m119312S1().f73044k.setVisibility(0);
        }
        ConstraintLayout c = m119312S1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        if (!ViewCompat.m3579V(c) || c.isLayoutRequested()) {
            c.addOnLayoutChangeListener(new C41164i(this));
        } else {
            m119310Q1();
        }
        for (ShimmerFrameLayout a : C41341q.m119910m(m119312S1().f73041h, m119312S1().f73046m)) {
            a.mo8652a();
        }
    }
}
