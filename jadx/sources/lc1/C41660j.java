package lc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10212q;
import ba1.C10220y;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41217g;
import he1.C41222k;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mc1.C41705b;
import mc1.C41711d;
import mc1.C41716f;
import mc1.C41728h;
import nh1.C41806a;
import p217q2.C7833e;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.network.ApiException;
import p420fh.C12902d;
import p420fh.C12910e;
import sso.queery.SetupSecurityParametersQuery;
import sso.type.AuthElementType;
import ua1.C28682t0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: lc1.j */
public final class C41660j extends Fragment implements C41185v.C41186a, C41728h.C41729a, C41716f.C41717a, C41705b.C41706a {

    /* renamed from: l */
    public static final C41661a f97907l = new C41661a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f97908d = C41219i.m119469a(C41222k.SYNCHRONIZED, new C41662b(this, (C41806a) null, (C43064a) null));

    /* renamed from: e */
    private final C41217g f97909e = C41219i.m119469a(C41222k.NONE, new C41664d(this, (C41806a) null, (C43064a) null, new C41663c(this), (C43064a) null));

    /* renamed from: f */
    private C28682t0 f97910f;

    /* renamed from: g */
    private boolean f97911g = C10146d0.C10159c.m37143b().getPassCodeEnabled$sso_client_release();

    /* renamed from: h */
    private boolean f97912h = C10146d0.C10159c.m37143b().getBiometricEnabled$sso_client_release();

    /* renamed from: i */
    private boolean f97913i = m120869n1().contains(AuthElementType.TRUSTED_DEVICE);

    /* renamed from: j */
    private String f97914j;

    /* renamed from: k */
    private String f97915k;

    /* renamed from: lc1.j$a */
    public static final class C41661a {
        private C41661a() {
        }

        public /* synthetic */ C41661a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41660j mo96467a() {
            return new C41660j();
        }
    }

    /* renamed from: lc1.j$b */
    public static final class C41662b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97916d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97917e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97918f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41662b(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97916d = componentCallbacks;
            this.f97917e = aVar;
            this.f97918f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97916d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f97917e, this.f97918f);
        }
    }

    /* renamed from: lc1.j$c */
    public static final class C41663c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97919d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41663c(Fragment fragment) {
            super(0);
            this.f97919d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f97919d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: lc1.j$d */
    public static final class C41664d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97920d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97921e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97922f;

        /* renamed from: g */
        final /* synthetic */ C43064a f97923g;

        /* renamed from: h */
        final /* synthetic */ C43064a f97924h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41664d(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f97920d = fragment;
            this.f97921e = aVar;
            this.f97922f = aVar2;
            this.f97923g = aVar3;
            this.f97924h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f97920d, this.f97921e, this.f97922f, this.f97923g, C41520a0.m120436b(C41665k.class), this.f97924h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m120856A1(C41660j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.f97915k = "TRUSTED_DEVICE_TYPE";
        jVar.m120868m1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m120857B1(C41660j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.f97915k = "PASSCODE_DEVICE_TYPE";
        jVar.m120868m1();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m120858C1(C41660j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.f97915k = "BIOMETRICS_DEVICE_TYPE";
        jVar.m120868m1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m120859D1(C41660j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        if (jVar.f97913i == jVar.m120873r1().mo96475rw() && jVar.f97912h == jVar.m120873r1().mo96470lw() && jVar.f97911g == jVar.m120873r1().mo96472nw()) {
            C1505h requireActivity = jVar.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C12910e.m48787e(requireActivity, "No Changes to Save", (C12902d.C12905b) null, false, 6, (Object) null);
            return;
        }
        jVar.m120862G1();
    }

    /* renamed from: E1 */
    private final void m120860E1() {
        m120873r1().mo96474pw().mo4819k(getViewLifecycleOwner(), new C41655e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m120861F1(C41660j jVar, C35947l lVar) {
        C41536l.m120489i(jVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            jVar.m120874s1(C41711d.f97976f.mo96512a());
        } else if (lVar instanceof C35947l.C35949b) {
            C41536l.m120488h(lVar, "result");
            jVar.m120875t1((C35947l.C35949b) lVar);
        } else {
            boolean z = lVar instanceof C35947l.C35950c;
        }
    }

    /* renamed from: G1 */
    private final void m120862G1() {
        boolean z;
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            Map valueMap = new SetupSecurityParametersQuery(this.f97912h, (C7833e) null, (C7833e) null, C10145d.m37088b(this.f97914j), processReference$sso_client_release, (C7833e) null, 38, (DefaultConstructorMarker) null).variables().valueMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : valueMap.entrySet()) {
                if (entry.getValue() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            HashMap hashMap = new HashMap(linkedHashMap);
            hashMap.put("tmxSessionId", C10146d0.C10177h.m37232a());
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, "LoginServices.setupSecurityParameters", hashMap, (C41143c) null, 4, (Object) null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            e.mo4576A1(childFragmentManager, (String) null);
        }
    }

    /* renamed from: m1 */
    private final void m120868m1() {
        String str = this.f97915k;
        if (str != null) {
            String str2 = null;
            if (str == null) {
                C41536l.m120506z("finalStep");
                str = null;
            }
            if (!C41536l.m120484d(str, "TRUSTED_DEVICE_TYPE")) {
                String str3 = this.f97915k;
                if (str3 == null) {
                    C41536l.m120506z("finalStep");
                    str3 = null;
                }
                if (!C41536l.m120484d(str3, "PASSCODE_DEVICE_TYPE")) {
                    String str4 = this.f97915k;
                    if (str4 == null) {
                        C41536l.m120506z("finalStep");
                    } else {
                        str2 = str4;
                    }
                    if (!C41536l.m120484d(str2, "BIOMETRICS_DEVICE_TYPE")) {
                        return;
                    }
                    if (!this.f97913i) {
                        C41728h a = C41728h.f98009E.mo96524a();
                        a.mo96523h2(this);
                        a.mo4576A1(getChildFragmentManager(), "TRUSTED_DEVICE_TYPE");
                    } else if (!this.f97911g) {
                        C41716f a2 = C41716f.f97987G.mo96516a();
                        a2.mo96515m2(this);
                        a2.mo4576A1(getChildFragmentManager(), "PASSCODE_DEVICE_TYPE");
                    } else if (!this.f97912h) {
                        C41705b a3 = C41705b.f97967E.mo96510a();
                        a3.mo96509k2(this);
                        a3.mo4576A1(getChildFragmentManager(), "BIOMETRICS_DEVICE_TYPE");
                    }
                } else if (!this.f97913i) {
                    C41728h a4 = C41728h.f98009E.mo96524a();
                    a4.mo96523h2(this);
                    a4.mo4576A1(getChildFragmentManager(), "TRUSTED_DEVICE_TYPE");
                } else if (!this.f97911g) {
                    C41716f a5 = C41716f.f97987G.mo96516a();
                    a5.mo96515m2(this);
                    a5.mo4576A1(getChildFragmentManager(), "PASSCODE_DEVICE_TYPE");
                }
            } else if (!this.f97913i) {
                C41728h a6 = C41728h.f98009E.mo96524a();
                a6.mo96523h2(this);
                a6.mo4576A1(getChildFragmentManager(), "TRUSTED_DEVICE_TYPE");
            }
        }
    }

    /* renamed from: n1 */
    private final Set m120869n1() {
        return C10146d0.C10159c.m37143b().getAvailableAuthTypes$sso_client_release();
    }

    /* renamed from: o1 */
    private final C28682t0 m120870o1() {
        C28682t0 t0Var = this.f97910f;
        C41536l.m120486f(t0Var);
        return t0Var;
    }

    /* renamed from: p1 */
    private final C10146d0.C10172e m120871p1() {
        return (C10146d0.C10172e) this.f97908d.getValue();
    }

    /* renamed from: q1 */
    private final C41185v m120872q1() {
        Fragment k0 = getChildFragmentManager().mo4418k0("ScaVerificationDialogFragment");
        if (k0 instanceof C41185v) {
            return (C41185v) k0;
        }
        return null;
    }

    /* renamed from: r1 */
    private final C41665k m120873r1() {
        return (C41665k) this.f97909e.getValue();
    }

    /* renamed from: s1 */
    private final void m120874s1(Fragment fragment) {
        C1493e0 p = requireActivity().getSupportFragmentManager().mo4428p();
        View view = getView();
        if (view != null) {
            ViewParent parent = ((ViewGroup) view).getParent();
            if (parent != null) {
                p.mo4639r(((View) parent).getId(), fragment).mo4515i();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: t1 */
    private final void m120875t1(C35947l.C35949b bVar) {
        ApiException apiException;
        Throwable a = bVar.mo88517a();
        String str = null;
        if (a instanceof ApiException) {
            apiException = (ApiException) a;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            str = apiException.getErrorMessage();
        }
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        if (str == null) {
            str = getString(C10220y.common_text_service_error);
            C41536l.m120488h(str, "getString(R.string.common_text_service_error)");
        }
        C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: u1 */
    private final void m120876u1() {
        if (!this.f97912h) {
            this.f97915k = "BIOMETRICS_DEVICE_TYPE";
        } else if (!this.f97911g) {
            this.f97915k = "PASSCODE_DEVICE_TYPE";
        } else if (!this.f97913i) {
            this.f97915k = "TRUSTED_DEVICE_TYPE";
        }
    }

    /* renamed from: v1 */
    private final void m120877v1(AppCompatImageView appCompatImageView, LayerView layerView, boolean z) {
        Drawable drawable;
        if (z) {
            appCompatImageView.setVisibility(0);
            Context context = getContext();
            if (context != null) {
                drawable = C0767a.m2895e(context, C10212q.f28273g);
            } else {
                drawable = null;
            }
            layerView.setBackground(drawable);
        }
    }

    /* renamed from: x1 */
    private final void m120878x1() {
        String str;
        PageDescriptionView pageDescriptionView = m120870o1().f72944h;
        C10195g0 g = m120871p1().mo26716g();
        if (g == null || (str = g.mo26763a("text.simple.auth.suggestion.2", new Object[0])) == null) {
            str = getString(C10220y.setup_security_parameters_page_description_text);
        }
        pageDescriptionView.setText(str);
    }

    /* renamed from: y1 */
    private final void m120879y1() {
        AppCompatImageView appCompatImageView = m120870o1().f72945i;
        C41536l.m120488h(appCompatImageView, "binding.passcodeCheckImageView");
        LayerView layerView = m120870o1().f72946j;
        C41536l.m120488h(layerView, "binding.passcodeLayerView");
        m120877v1(appCompatImageView, layerView, this.f97911g);
        AppCompatImageView appCompatImageView2 = m120870o1().f72941e;
        C41536l.m120488h(appCompatImageView2, "binding.biometricCheckImageView");
        LayerView layerView2 = m120870o1().f72942f;
        C41536l.m120488h(layerView2, "binding.biometricLayerView");
        m120877v1(appCompatImageView2, layerView2, this.f97912h);
        AppCompatImageView appCompatImageView3 = m120870o1().f72948l;
        C41536l.m120488h(appCompatImageView3, "binding.trustedDeviceCheckImageView");
        LayerView layerView3 = m120870o1().f72949m;
        C41536l.m120488h(layerView3, "binding.trustedDeviceLayerView");
        m120877v1(appCompatImageView3, layerView3, this.f97913i);
    }

    /* renamed from: z1 */
    private final void m120880z1() {
        m120870o1().f72949m.setOnClickListener(new C41656f(this));
        m120870o1().f72946j.setOnClickListener(new C41657g(this));
        m120870o1().f72942f.setOnClickListener(new C41658h(this));
        m120870o1().f72947k.setOnClickListener(new C41659i(this));
    }

    /* renamed from: F */
    public void mo95742F() {
        this.f97912h = true;
        AppCompatImageView appCompatImageView = m120870o1().f72941e;
        C41536l.m120488h(appCompatImageView, "binding.biometricCheckImageView");
        LayerView layerView = m120870o1().f72942f;
        C41536l.m120488h(layerView, "binding.biometricLayerView");
        m120877v1(appCompatImageView, layerView, this.f97912h);
        m120868m1();
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41185v q1 = m120872q1();
        if (q1 != null) {
            q1.mo4577k1();
        }
        m120873r1().mo96477tw(this.f97912h, str, str2, this.f97914j, str3);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f97910f = C28682t0.m87844d(layoutInflater);
        ConstraintLayout c = m120870o1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97910f = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m120878x1();
        m120876u1();
        m120860E1();
        m120879y1();
        m120873r1().mo96478vw();
        m120868m1();
        m120880z1();
    }

    /* renamed from: s0 */
    public void mo95743s0(boolean z, String str) {
        C41536l.m120489i(str, "passcode");
        if (z) {
            this.f97914j = str;
            this.f97911g = true;
            AppCompatImageView appCompatImageView = m120870o1().f72945i;
            C41536l.m120488h(appCompatImageView, "binding.passcodeCheckImageView");
            LayerView layerView = m120870o1().f72946j;
            C41536l.m120488h(layerView, "binding.passcodeLayerView");
            m120877v1(appCompatImageView, layerView, this.f97911g);
            m120868m1();
        }
    }

    /* renamed from: v */
    public void mo95744v() {
        this.f97913i = true;
        AppCompatImageView appCompatImageView = m120870o1().f72948l;
        C41536l.m120488h(appCompatImageView, "binding.trustedDeviceCheckImageView");
        LayerView layerView = m120870o1().f72949m;
        C41536l.m120488h(layerView, "binding.trustedDeviceLayerView");
        m120877v1(appCompatImageView, layerView, this.f97913i);
        m120868m1();
    }
}
