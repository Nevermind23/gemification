package kc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1613n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10214s;
import ba1.C10220y;
import cd1.C40393c;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import hc1.C41143c;
import hc1.C41185v;
import hd1.C41205b;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ic1.C41286h;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kc1.C41476h;
import kc1.C41491n;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p217q2.C7833e;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.sso_client.models.C35936d;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.Session;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p363bh.C10275a;
import p363bh.C10277c;
import p420fh.C12902d;
import p420fh.C12910e;
import sso.queery.TrustDeviceQuery;
import sso.type.AuthElementType;
import ua1.C28691x;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: kc1.m */
public final class C41482m extends Fragment implements C41491n.C41494c, C41185v.C41186a, C10275a {

    /* renamed from: m */
    public static final C41483a f97637m = new C41483a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C41205b f97638d;

    /* renamed from: e */
    private final C41217g f97639e;

    /* renamed from: f */
    private final C41217g f97640f;

    /* renamed from: g */
    private C28691x f97641g;

    /* renamed from: h */
    private C41491n f97642h = new C41491n();

    /* renamed from: i */
    private final C41217g f97643i = C41219i.m119469a(C41222k.NONE, new C41490h(this, (C41806a) null, (C43064a) null, new C41489g(this), (C43064a) null));

    /* renamed from: j */
    private int f97644j = -1;

    /* renamed from: k */
    private C10277c f97645k;

    /* renamed from: l */
    private final C41217g f97646l = C41219i.m119470b(new C41484b(this));

    /* renamed from: kc1.m$a */
    public static final class C41483a {
        private C41483a() {
        }

        public /* synthetic */ C41483a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C41482m m120355b(C41483a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return aVar.mo96249a(str);
        }

        /* renamed from: a */
        public final C41482m mo96249a(String str) {
            C41482m mVar = new C41482m();
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString(C11772k.C11773a.f34184p, str);
                mVar.setArguments(bundle);
            }
            return mVar;
        }
    }

    /* renamed from: kc1.m$b */
    static final class C41484b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41482m f97647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41484b(C41482m mVar) {
            super(0);
            this.f97647d = mVar;
        }

        public final String invoke() {
            Bundle arguments = this.f97647d.getArguments();
            if (arguments != null) {
                return arguments.getString(C11772k.C11773a.f34184p);
            }
            return null;
        }
    }

    /* renamed from: kc1.m$c */
    static final class C41485c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41485c f97648d = new C41485c();

        C41485c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo96250a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120041m(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.TRUSTED_DEVICE));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo96250a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: kc1.m$d */
    static final class C41486d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41486d f97649d = new C41486d();

        C41486d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo96251a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120038j(session.getAvailableAuthTypes$sso_client_release(), C41357x0.m119989i(AuthElementType.TRUSTED_DEVICE, AuthElementType.PASSCODE, AuthElementType.BIOMETRY)));
            session.setBiometricToken$sso_client_release((String) null);
            session.setPassCodeToken$sso_client_release((String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo96251a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: kc1.m$e */
    public static final class C41487e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97650d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97651e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97652f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41487e(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97650d = componentCallbacks;
            this.f97651e = aVar;
            this.f97652f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97650d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f97651e, this.f97652f);
        }
    }

    /* renamed from: kc1.m$f */
    public static final class C41488f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97653d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97654e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97655f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41488f(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97653d = componentCallbacks;
            this.f97654e = aVar;
            this.f97655f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97653d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40393c.class), this.f97654e, this.f97655f);
        }
    }

    /* renamed from: kc1.m$g */
    public static final class C41489g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41489g(Fragment fragment) {
            super(0);
            this.f97656d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f97656d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f97656d.requireActivity());
        }
    }

    /* renamed from: kc1.m$h */
    public static final class C41490h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97657d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97658e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97659f;

        /* renamed from: g */
        final /* synthetic */ C43064a f97660g;

        /* renamed from: h */
        final /* synthetic */ C43064a f97661h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41490h(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f97657d = fragment;
            this.f97658e = aVar;
            this.f97659f = aVar2;
            this.f97660g = aVar3;
            this.f97661h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f97657d, this.f97658e, this.f97659f, this.f97660g, C41520a0.m120436b(C41286h.class), this.f97661h);
        }
    }

    public C41482m() {
        C41222k kVar = C41222k.SYNCHRONIZED;
        this.f97639e = C41219i.m119469a(kVar, new C41487e(this, (C41806a) null, (C43064a) null));
        this.f97640f = C41219i.m119469a(kVar, new C41488f(this, (C41806a) null, (C43064a) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m120330A1(C41482m mVar, View view) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m120347x1();
    }

    /* renamed from: B1 */
    private final void m120331B1() {
        boolean z;
        String processReference$sso_client_release;
        boolean z2;
        C41205b bVar;
        C41205b bVar2 = this.f97638d;
        if (bVar2 != null) {
            C41536l.m120486f(bVar2);
            if (!bVar2.isDisposed() && (bVar = this.f97638d) != null) {
                bVar.dispose();
            }
        }
        this.f97638d = m120340p1().mo94454b(TMXFlags.TMX_FLAG_TRUST_KEY);
        String uw = m120341q1().mo95765uw();
        if (uw == null || C40439w.m117118v(uw)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && m120341q1().mo95764tw() != null && (processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release()) != null) {
            String uw2 = m120341q1().mo95765uw();
            C41536l.m120486f(uw2);
            Map valueMap = new TrustDeviceQuery(uw2, C7833e.f22754c.mo22769c((Object) null), true, (C7833e) null, (C7833e) null, processReference$sso_client_release, (C7833e) null, 88, (DefaultConstructorMarker) null).variables().valueMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : valueMap.entrySet()) {
                if (entry.getValue() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            HashMap hashMap = new HashMap(linkedHashMap);
            hashMap.put("tmxSessionId", C10146d0.C10177h.m37232a());
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, "DeviceManagementServices.trustDevice", hashMap, (C41143c) null, 4, (Object) null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            e.mo4576A1(childFragmentManager, (String) null);
        }
    }

    /* renamed from: l1 */
    private final C28691x m120336l1() {
        C28691x xVar = this.f97641g;
        C41536l.m120486f(xVar);
        return xVar;
    }

    /* renamed from: m1 */
    private final C10146d0.C10172e m120337m1() {
        return (C10146d0.C10172e) this.f97639e.getValue();
    }

    /* renamed from: n1 */
    private final String m120338n1() {
        return (String) this.f97646l.getValue();
    }

    /* renamed from: o1 */
    private final C41185v m120339o1() {
        Fragment k0 = getChildFragmentManager().mo4418k0("ScaVerificationDialogFragment");
        if (k0 instanceof C41185v) {
            return (C41185v) k0;
        }
        return null;
    }

    /* renamed from: p1 */
    private final C40393c m120340p1() {
        return (C40393c) this.f97640f.getValue();
    }

    /* renamed from: q1 */
    private final C41286h m120341q1() {
        return (C41286h) this.f97643i.getValue();
    }

    /* renamed from: r1 */
    private final void m120342r1() {
        m120341q1().mo95762rw();
        m120341q1().mo95763sw().mo4819k(getViewLifecycleOwner(), new C41479j(this));
        m120341q1().mo95750Aw().mo4819k(getViewLifecycleOwner(), new C41480k(this));
        m120341q1().mo95751Bw().mo4819k(getViewLifecycleOwner(), new C41481l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m120343s1(C41482m mVar, List list) {
        C41536l.m120489i(mVar, "this$0");
        mVar.f97642h.mo96255h(mVar);
        mVar.f97642h.mo96254g(mVar.m120341q1().mo95766vw());
        RecyclerView recyclerView = mVar.m120336l1().f73035g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(mVar.f97642h);
        Drawable e = C0767a.m2895e(recyclerView.getContext(), C10214s.f28277I);
        if (e != null) {
            int i = 0;
            recyclerView.mo5351j(new C13364a(e, false, false));
            try {
                Iterator it = mVar.m120341q1().mo95766vw().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C41536l.m120484d(((C41463a) it.next()).mo96221d(), new BigDecimal(mVar.m120338n1()))) {
                        break;
                    } else {
                        i++;
                    }
                }
                recyclerView.mo5425x1(i);
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m120344t1(C41482m mVar, C35947l lVar) {
        C41536l.m120489i(mVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            ((C41463a) mVar.m120341q1().mo95766vw().get(mVar.f97644j)).mo96225g(true);
            mVar.f97642h.notifyItemChanged(mVar.f97644j);
            if (((C41463a) mVar.m120341q1().mo95766vw().get(mVar.f97644j)).mo96222e()) {
                C35962r.m107005c(C10146d0.C10159c.m37143b(), C41485c.f97648d);
            }
        } else if (lVar instanceof C35947l.C35949b) {
            C41536l.m120488h(lVar, "response");
            mVar.m120346v1((C35947l.C35949b) lVar, "1");
        } else {
            boolean z = lVar instanceof C35947l.C35950c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m120345u1(C41482m mVar, C35947l lVar) {
        C41536l.m120489i(mVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            ((C41463a) mVar.m120341q1().mo95766vw().get(mVar.f97644j)).mo96225g(false);
            mVar.f97642h.notifyItemChanged(mVar.f97644j);
            if (((C41463a) mVar.m120341q1().mo95766vw().get(mVar.f97644j)).mo96222e()) {
                C35962r.m107005c(C10146d0.C10159c.m37143b(), C41486d.f97649d);
            }
        } else if (lVar instanceof C35947l.C35949b) {
            C41536l.m120488h(lVar, "response");
            mVar.m120346v1((C35947l.C35949b) lVar, AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
        } else {
            boolean z = lVar instanceof C35947l.C35950c;
        }
    }

    /* renamed from: v1 */
    private final void m120346v1(C35947l.C35949b bVar, String str) {
        ApiException apiException;
        Throwable a = bVar.mo88517a();
        String str2 = null;
        if (a instanceof ApiException) {
            apiException = (ApiException) a;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            str2 = apiException.getErrorMessage();
        }
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        if (str2 == null) {
            str2 = getString(C10220y.common_text_service_error) + ' ' + str;
        }
        C12910e.m48790h(requireActivity, str2, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: x1 */
    private final void m120347x1() {
        C41476h hVar = new C41476h();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C10277c a = hVar.mo96242a(requireContext);
        this.f97645k = a;
        if (a == null) {
            C41536l.m120506z("currDialogView");
            a = null;
        }
        a.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: B0 */
    public void mo96246B0(int i) {
        this.f97644j = i;
        if (!m120341q1().mo95754Ew()) {
            return;
        }
        if (((C41463a) m120341q1().mo95766vw().get(i)).mo96224f()) {
            C41476h hVar = new C41476h();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C10277c b = hVar.mo96243b(requireContext);
            this.f97645k = b;
            if (b == null) {
                C41536l.m120506z("currDialogView");
                b = null;
            }
            b.mo4576A1(getChildFragmentManager(), (String) null);
            return;
        }
        C41476h hVar2 = new C41476h();
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        C10277c c = hVar2.mo96244c(requireContext2);
        this.f97645k = c;
        if (c == null) {
            C41536l.m120506z("currDialogView");
            c = null;
        }
        c.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41185v o1 = m120339o1();
        if (o1 != null) {
            o1.mo4577k1();
        }
        C41286h q1 = m120341q1();
        String uw = m120341q1().mo95765uw();
        C41536l.m120486f(uw);
        Long tw = m120341q1().mo95764tw();
        C41536l.m120486f(tw);
        q1.mo95757Hw(uw, new BigDecimal(tw.longValue()), true, str, str2, str3);
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
        this.f97641g = C28691x.m87883d(layoutInflater, viewGroup, false);
        LayerView c = m120336l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroy() {
        C41205b bVar = this.f97638d;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97641g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m120342r1();
        m120336l1().f73033e.setTitle(getString(C10220y.customer_devices_action_sheet_title));
        m120336l1().f73034f.setOnClickListener(new C41478i(this));
        AppCompatTextView appCompatTextView = m120336l1().f73036h;
        C10195g0 g = m120337m1().mo26716g();
        if (g == null || (str = g.mo26763a("text.device.actions.explainer", new Object[0])) == null) {
            str = getString(C10220y.customer_devices_action_sheet_subtitle);
        }
        appCompatTextView.setText(str);
    }

    /* renamed from: y0 */
    public void mo26876y0(Enum enumR) {
        C41536l.m120489i(enumR, UrlHandler.ACTION);
        C10277c cVar = null;
        if (enumR == C41476h.C41477a.f97627d) {
            mo96247y1(this.f97644j);
        } else if (enumR == C41476h.C41477a.UN_TRUST) {
            mo96248z1(this.f97644j);
        } else if (!(enumR == C41476h.C41477a.LEAVE_ALL || enumR == C41476h.C41477a.LEAVE_ONE || enumR != C41476h.C41477a.f97631h)) {
            C1493e0 p = requireActivity().getSupportFragmentManager().mo4428p();
            View view = getView();
            if (view != null) {
                ViewParent parent = ((ViewGroup) view).getParent();
                if (parent != null) {
                    p.mo4640s(((View) parent).getId(), C41467e.f97608g.mo96232a(), (String) null).mo4636g((String) null).mo4515i();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        C10277c cVar2 = this.f97645k;
        if (cVar2 == null) {
            C41536l.m120506z("currDialogView");
        } else {
            cVar = cVar2;
        }
        cVar.mo4577k1();
    }

    /* renamed from: y1 */
    public void mo96247y1(int i) {
        this.f97644j = i;
        if (((C41463a) m120341q1().mo95766vw().get(i)).mo96222e()) {
            m120331B1();
        }
    }

    /* renamed from: z1 */
    public void mo96248z1(int i) {
        C35936d dVar;
        this.f97644j = i;
        List list = (List) m120341q1().mo95763sw().mo4814f();
        if (list != null) {
            dVar = (C35936d) list.get(i);
        } else {
            dVar = null;
        }
        C41536l.m120486f(dVar);
        BigDecimal d = dVar.mo88479d();
        if (d != null) {
            C41286h q1 = m120341q1();
            String bigDecimal = d.toString();
            C41536l.m120488h(bigDecimal, "refId.toString()");
            q1.mo95758Iw(bigDecimal);
        }
    }
}
