package ic1;

import ah1.C40314b;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1613n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10214s;
import ba1.C10220y;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ic1.C41269a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jc1.C41387f;
import kc1.C41482m;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mc1.C41705b;
import mc1.C41716f;
import mc1.C41728h;
import nh1.C41806a;
import p217q2.C7833e;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35955o;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.Session;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p420fh.C12902d;
import p420fh.C12910e;
import sso.queery.SetupSecurityParametersQuery;
import sso.type.AuthElementType;
import ua1.C28667o0;
import ue1.C43064a;
import ue1.C43075l;
import yg1.C43399a;

/* renamed from: ic1.g */
public final class C41280g extends Fragment implements C41269a.C41271b, C41185v.C41186a, C41728h.C41729a, C41716f.C41717a, C41705b.C41706a {

    /* renamed from: m */
    public static final C41281a f97303m = new C41281a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28667o0 f97304d;

    /* renamed from: e */
    private final C41217g f97305e = C41219i.m119469a(C41222k.NONE, new C41285e(this, (C41806a) null, (C43064a) null, new C41284d(this), (C43064a) null));

    /* renamed from: f */
    private C41269a f97306f;

    /* renamed from: g */
    private ArrayList f97307g = new ArrayList();

    /* renamed from: h */
    private boolean f97308h = C10146d0.C10159c.m37143b().getPassCodeEnabled$sso_client_release();

    /* renamed from: i */
    private boolean f97309i = C10146d0.C10159c.m37143b().getBiometricEnabled$sso_client_release();

    /* renamed from: j */
    private boolean f97310j = m119594j1().contains(AuthElementType.TRUSTED_DEVICE);

    /* renamed from: k */
    private String f97311k;

    /* renamed from: l */
    private String f97312l;

    /* renamed from: ic1.g$a */
    public static final class C41281a {
        private C41281a() {
        }

        public /* synthetic */ C41281a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41280g mo95745a() {
            return new C41280g();
        }
    }

    /* renamed from: ic1.g$b */
    static final class C41282b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41282b f97313d = new C41282b();

        C41282b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo95746a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setBiometricToken$sso_client_release((String) null);
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120039k(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.BIOMETRY));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95746a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ic1.g$c */
    static final class C41283c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41283c f97314d = new C41283c();

        C41283c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo95747a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setPassCodeToken$sso_client_release((String) null);
            session.setBiometricToken$sso_client_release((String) null);
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120038j(session.getAvailableAuthTypes$sso_client_release(), C41357x0.m119989i(AuthElementType.BIOMETRY, AuthElementType.PASSCODE)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95747a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ic1.g$d */
    public static final class C41284d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41284d(Fragment fragment) {
            super(0);
            this.f97315d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f97315d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: ic1.g$e */
    public static final class C41285e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97316d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97317e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97318f;

        /* renamed from: g */
        final /* synthetic */ C43064a f97319g;

        /* renamed from: h */
        final /* synthetic */ C43064a f97320h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41285e(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f97316d = fragment;
            this.f97317e = aVar;
            this.f97318f = aVar2;
            this.f97319g = aVar3;
            this.f97320h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f97316d, this.f97317e, this.f97318f, this.f97319g, C41520a0.m120436b(C41286h.class), this.f97320h);
        }
    }

    /* renamed from: i1 */
    private final void m119593i1() {
        String str = this.f97312l;
        if (str != null) {
            String str2 = null;
            if (str == null) {
                C41536l.m120506z("finalStep");
                str = null;
            }
            if (!C41536l.m120484d(str, "TRUSTED_DEVICE_TYPE")) {
                String str3 = this.f97312l;
                if (str3 == null) {
                    C41536l.m120506z("finalStep");
                    str3 = null;
                }
                if (!C41536l.m120484d(str3, "PASSCODE_DEVICE_TYPE")) {
                    String str4 = this.f97312l;
                    if (str4 == null) {
                        C41536l.m120506z("finalStep");
                    } else {
                        str2 = str4;
                    }
                    if (!C41536l.m120484d(str2, "BIOMETRICS_DEVICE_TYPE")) {
                        return;
                    }
                    if (!this.f97310j) {
                        C41728h a = C41728h.f98009E.mo96524a();
                        a.mo96523h2(this);
                        a.mo4576A1(getChildFragmentManager(), "TRUSTED_DEVICE_TYPE");
                    } else if (!this.f97308h) {
                        C41716f a2 = C41716f.f97987G.mo96516a();
                        a2.mo96515m2(this);
                        a2.mo4576A1(getChildFragmentManager(), "PASSCODE_DEVICE_TYPE");
                    } else if (!this.f97309i) {
                        C41705b a3 = C41705b.f97967E.mo96510a();
                        a3.mo96509k2(this);
                        a3.mo4576A1(getChildFragmentManager(), "BIOMETRICS_DEVICE_TYPE");
                    } else {
                        m119602r1();
                    }
                } else if (!this.f97310j) {
                    C41728h a4 = C41728h.f98009E.mo96524a();
                    a4.mo96523h2(this);
                    a4.mo4576A1(getChildFragmentManager(), "TRUSTED_DEVICE_TYPE");
                } else if (!this.f97308h) {
                    C41716f a5 = C41716f.f97987G.mo96516a();
                    a5.mo96515m2(this);
                    a5.mo4576A1(getChildFragmentManager(), "PASSCODE_DEVICE_TYPE");
                } else {
                    m119602r1();
                }
            } else if (!this.f97310j) {
                C41728h a6 = C41728h.f98009E.mo96524a();
                a6.mo96523h2(this);
                a6.mo4576A1(getChildFragmentManager(), "TRUSTED_DEVICE_TYPE");
            }
        }
    }

    /* renamed from: j1 */
    private final Set m119594j1() {
        return C10146d0.C10159c.m37143b().getAvailableAuthTypes$sso_client_release();
    }

    /* renamed from: k1 */
    private final C28667o0 m119595k1() {
        C28667o0 o0Var = this.f97304d;
        C41536l.m120486f(o0Var);
        return o0Var;
    }

    /* renamed from: l1 */
    private final C41185v m119596l1() {
        Fragment k0 = getChildFragmentManager().mo4418k0("ScaVerificationDialogFragment");
        if (k0 instanceof C41185v) {
            return (C41185v) k0;
        }
        return null;
    }

    /* renamed from: m1 */
    private final C41286h m119597m1() {
        return (C41286h) this.f97305e.getValue();
    }

    /* renamed from: n1 */
    private final void m119598n1(Fragment fragment) {
        C1493e0 p = requireActivity().getSupportFragmentManager().mo4428p();
        View view = getView();
        if (view != null) {
            ViewParent parent = ((ViewGroup) view).getParent();
            if (parent != null) {
                p.mo4639r(((View) parent).getId(), fragment).mo4636g((String) null).mo4515i();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: o1 */
    private final void m119599o1(C35947l.C35949b bVar) {
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

    /* renamed from: p1 */
    private final void m119600p1() {
        m119597m1().mo95770zw().mo4819k(getViewLifecycleOwner(), new C41279f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m119601q1(C41280g gVar, C35947l lVar) {
        C41536l.m120489i(gVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            gVar.m119604t1();
        } else if (lVar instanceof C35947l.C35949b) {
            C41536l.m120488h(lVar, "result");
            gVar.m119599o1((C35947l.C35949b) lVar);
        } else {
            boolean z = lVar instanceof C35947l.C35950c;
        }
    }

    /* renamed from: r1 */
    private final void m119602r1() {
        String processReference$sso_client_release;
        boolean z;
        if ((this.f97310j != m119597m1().mo95753Dw() || this.f97309i != m119597m1().mo95761qw() || this.f97308h != m119597m1().mo95767ww()) && (processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release()) != null) {
            Map valueMap = new SetupSecurityParametersQuery(this.f97309i, (C7833e) null, (C7833e) null, C10145d.m37088b(this.f97311k), processReference$sso_client_release, (C7833e) null, 38, (DefaultConstructorMarker) null).variables().valueMap();
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

    /* renamed from: s1 */
    private final void m119603s1() {
        m119595k1().f72871e.setTitle(getString(C10220y.f28379Z1));
        C41269a aVar = new C41269a();
        this.f97306f = aVar;
        aVar.mo95733h(this);
        m119595k1().f72872f.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView = m119595k1().f72872f;
        C41269a aVar2 = this.f97306f;
        if (aVar2 == null) {
            C41536l.m120506z("adapter");
            aVar2 = null;
        }
        recyclerView.setAdapter(aVar2);
        m119604t1();
        m119595k1().f72872f.setItemAnimator((RecyclerView.C1742m) null);
        RecyclerView recyclerView2 = m119595k1().f72872f;
        Drawable e = C0767a.m2895e(recyclerView2.getContext(), C10214s.f28277I);
        if (e != null) {
            recyclerView2.mo5351j(new C13364a(e, true, false));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: t1 */
    private final void m119604t1() {
        this.f97307g = C41341q.m119903f(C35955o.C35957b.f86996e, new C35955o.C35959d(m119597m1().mo95767ww(), m119597m1().mo95754Ew()), new C35955o.C35956a(m119597m1().mo95761qw(), m119597m1().mo95754Ew()), C35955o.C35958c.f86997e);
        C41269a aVar = this.f97306f;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        aVar.mo95732g(this.f97307g);
    }

    /* renamed from: F */
    public void mo95742F() {
        this.f97309i = true;
        m119593i1();
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41185v l1 = m119596l1();
        if (l1 != null) {
            l1.mo4577k1();
        }
        m119597m1().mo95755Fw(this.f97309i, str, str2, this.f97311k, str3);
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

    /* renamed from: n0 */
    public void mo95734n0(int i) {
        this.f97310j = m119597m1().mo95753Dw();
        this.f97309i = m119597m1().mo95761qw();
        this.f97308h = m119597m1().mo95767ww();
        if (this.f97307g.get(i) instanceof C35955o.C35956a) {
            if (!m119597m1().mo95761qw()) {
                m119597m1().mo95756Gw(TMXFlags.TMX_FLAG_SEC_PARAMS_KEY);
                this.f97312l = "BIOMETRICS_DEVICE_TYPE";
                m119593i1();
            } else {
                C35962r.m107005c(C10146d0.C10159c.m37143b(), C41282b.f97313d);
            }
            m119604t1();
        } else if (this.f97307g.get(i) instanceof C35955o.C35959d) {
            if (!m119597m1().mo95767ww()) {
                m119597m1().mo95756Gw(TMXFlags.TMX_FLAG_SEC_PARAMS_KEY);
                this.f97312l = "PASSCODE_DEVICE_TYPE";
                m119593i1();
            } else {
                C35962r.m107005c(C10146d0.C10159c.m37143b(), C41283c.f97314d);
            }
            m119604t1();
        } else if (this.f97307g.get(i) instanceof C35955o.C35957b) {
            C41387f.f97440F.mo96035a().mo4576A1(requireActivity().getSupportFragmentManager(), "ChangePassword");
        } else if (this.f97307g.get(i) instanceof C35955o.C35958c) {
            m119598n1(C41482m.C41483a.m120355b(C41482m.f97637m, (String) null, 1, (Object) null));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f97304d = C28667o0.m87781d(layoutInflater, viewGroup, false);
        LinearLayout c = m119595k1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97304d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m119603s1();
        m119600p1();
    }

    /* renamed from: s0 */
    public void mo95743s0(boolean z, String str) {
        C41536l.m120489i(str, "passcode");
        if (z) {
            this.f97311k = str;
            this.f97308h = true;
            m119593i1();
        }
    }

    /* renamed from: v */
    public void mo95744v() {
        this.f97310j = true;
        m119593i1();
    }
}
