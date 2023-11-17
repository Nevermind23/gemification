package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.success;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.C0152h;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import g91.C32303f;
import g91.C32343x;
import gm0.C24763a;
import gm0.C24764b;
import gm0.C24767e;
import gm0.C24768f;
import gm0.C24770h;
import gm0.C24772j;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p380ck.C10463g;
import p420fh.C12902d;
import p434gh.C15278a;
import p478jj.C16203a;
import p759fv.C20559a;
import ue1.C43064a;
import ue1.C43075l;
import ul0.C28877d;
import y71.C40027a;
import y71.C40029c;
import y71.C40034h;
import z71.C40183j;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment */
public final class TravelInsuranceSuccessFragment extends C24628a {

    /* renamed from: m */
    public static final C24610a f63435m = new C24610a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C40183j f63436g;

    /* renamed from: h */
    private final C41217g f63437h = C41219i.m119470b(new C24615f(this));

    /* renamed from: i */
    private final C41217g f63438i = C41219i.m119470b(new C24616g(this));

    /* renamed from: j */
    public C24768f f63439j;

    /* renamed from: k */
    private final C41217g f63440k;

    /* renamed from: l */
    public TargetEnvironment f63441l;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$a */
    public static final class C24610a {
        private C24610a() {
        }

        public /* synthetic */ C24610a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$b */
    private static final class C24611b extends C0152h {

        /* renamed from: d */
        private final C43064a f63442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24611b(C43064a aVar) {
            super(true);
            C41536l.m120489i(aVar, "handleBackPress");
            this.f63442d = aVar;
        }

        /* renamed from: b */
        public void mo361b() {
            this.f63442d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$c */
    /* synthetic */ class C24612c extends C41535k implements C43075l {
        C24612c(Object obj) {
            super(1, obj, TravelInsuranceSuccessFragment.class, "onPolicyStateResult", "onPolicyStateResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo62804b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((TravelInsuranceSuccessFragment) this.receiver).m79041E1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62804b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$d */
    static final class C24613d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceSuccessFragment f63443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24613d(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            super(1);
            this.f63443d = travelInsuranceSuccessFragment;
        }

        /* renamed from: a */
        public final void mo62805a(C28877d dVar) {
            C41536l.m120489i(dVar, "it");
            this.f63443d.m79056u1(dVar.mo68616a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62805a((C28877d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$e */
    static final class C24614e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceSuccessFragment f63444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24614e(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            super(1);
            this.f63444d = travelInsuranceSuccessFragment;
        }

        /* renamed from: a */
        public final void mo62806a(C24767e eVar) {
            TravelInsuranceSuccessFragment travelInsuranceSuccessFragment = this.f63444d;
            C41536l.m120488h(eVar, "it");
            travelInsuranceSuccessFragment.m79057v1(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62806a((C24767e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$f */
    static final class C24615f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceSuccessFragment f63445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24615f(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            super(0);
            this.f63445d = travelInsuranceSuccessFragment;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Bundle arguments = this.f63445d.getArguments();
            return Integer.valueOf(arguments != null ? arguments.getInt(this.f63445d.getString(C40034h.arg_doc_key)) : -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$g */
    static final class C24616g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceSuccessFragment f63446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24616g(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            super(0);
            this.f63446d = travelInsuranceSuccessFragment;
        }

        /* renamed from: b */
        public final TravelInsuranceFilledInfo invoke() {
            Bundle arguments = this.f63446d.getArguments();
            if (arguments != null) {
                return (TravelInsuranceFilledInfo) arguments.getParcelable(this.f63446d.getString(C40034h.arg_filled_info));
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$h */
    static final class C24617h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceSuccessFragment f63447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24617h(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            super(0);
            this.f63447d = travelInsuranceSuccessFragment;
        }

        public final void invoke() {
            this.f63447d.m79042F1();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$i */
    static final class C24618i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40183j f63448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24618i(C40183j jVar) {
            super(1);
            this.f63448d = jVar;
        }

        /* renamed from: a */
        public final void mo62809a(C28877d dVar) {
            C41536l.m120489i(dVar, "it");
            this.f63448d.f95529g.setState(C16203a.DOWNLOAD);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62809a((C28877d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$j */
    static final class C24619j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40183j f63449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24619j(C40183j jVar) {
            super(1);
            this.f63449d = jVar;
        }

        /* renamed from: a */
        public final void mo62810a(C28877d dVar) {
            this.f63449d.f95529g.setState(C16203a.LOADING);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62810a((C28877d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$k */
    static final class C24620k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40183j f63450d;

        /* renamed from: e */
        final /* synthetic */ TravelInsuranceSuccessFragment f63451e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24620k(C40183j jVar, TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            super(1);
            this.f63450d = jVar;
            this.f63451e = travelInsuranceSuccessFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f63450d.f95529g.setState(C16203a.DOWNLOAD);
            this.f63451e.m79043G1();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$l */
    static final class C24621l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63452a;

        C24621l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63452a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63452a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63452a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$m */
    public static final class C24622m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24622m(Fragment fragment) {
            super(0);
            this.f63453d = fragment;
        }

        public final Fragment invoke() {
            return this.f63453d;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$n */
    public static final class C24623n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24623n(C43064a aVar) {
            super(0);
            this.f63454d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f63454d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$o */
    public static final class C24624o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f63455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24624o(C41217g gVar) {
            super(0);
            this.f63455d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f63455d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$p */
    public static final class C24625p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63456d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63457e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24625p(C43064a aVar, C41217g gVar) {
            super(0);
            this.f63456d = aVar;
            this.f63457e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63456d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f63457e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$q */
    static final class C24626q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceSuccessFragment f63458d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment$q$a */
        static final class C24627a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ TravelInsuranceSuccessFragment f63459d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24627a(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
                super(0);
                this.f63459d = travelInsuranceSuccessFragment;
            }

            /* renamed from: b */
            public final C24772j invoke() {
                return this.f63459d.mo62802A1().mo32782a(this.f63459d.m79059y1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24626q(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            super(0);
            this.f63458d = travelInsuranceSuccessFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24627a(this.f63458d));
        }
    }

    public TravelInsuranceSuccessFragment() {
        C24626q qVar = new C24626q(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24623n(new C24622m(this)));
        this.f63440k = C1514j0.m5374c(this, C41520a0.m120436b(C24772j.class), new C24624o(a), new C24625p((C43064a) null, a), qVar);
    }

    /* renamed from: B1 */
    private final TravelInsuranceFilledInfo m79038B1() {
        return (TravelInsuranceFilledInfo) this.f63438i.getValue();
    }

    /* renamed from: C1 */
    private final C24772j m79039C1() {
        return (C24772j) this.f63440k.getValue();
    }

    /* renamed from: D1 */
    private final void m79040D1() {
        C40183j x1 = m79058x1();
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C24611b(new C24617h(this)));
        m79052q1();
        refreshHeaderText(C32343x.m95388F("text.insurance.product.type.TRI", new Object[0]));
        x1.f95534l.setTitleText(C32343x.m95388F("text.travel.insurance.success.page.text", new Object[0]));
        x1.f95529g.setTitle(getResources().getString(C40034h.download_policy));
        x1.f95529g.setLeftIcon(requireContext().getDrawable(C40029c.ic_pdf_image));
        x1.f95529g.setLeftIconTint(Integer.valueOf(C40027a.f95082a));
        x1.f95527e.setButtonText(C32343x.m95388F("text.travel.insurance.success.return.home.page.button", new Object[0]));
        x1.f95531i.setTitle(C32343x.m95388F("text.travel.insurance.screen.policy.preview.policyholder.info", new Object[0]));
        x1.f95530h.setTitle(C32343x.m95388F("text.travel.insurance.screen.policy.preview.policyholder.info.name", new Object[0]));
        x1.f95532j.setTitle(C32343x.m95388F("text.travel.insurance.screen.policy.preview.policyholder.info.surname", new Object[0]));
        x1.f95535m.setTitle(C32343x.m95388F("text.travel.insurance.insured.person.screen.id", new Object[0]));
        x1.f95528f.setTitle(C32343x.m95388F("text.travel.insurance.insured.person.screen.dob", new Object[0]));
        m79039C1().mo63171ew(m79038B1());
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m79041E1(C31128a aVar) {
        C40183j x1 = m79058x1();
        C31132b.m92648j(aVar, (int[]) null, new C24618i(x1), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C24619j(x1), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C24620k(x1, this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final void m79042F1() {
        startActivity(new Intent(requireContext(), MainActivity.class).setFlags(872415232));
        requireActivity().finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final void m79043G1() {
        C12902d.C12903a aVar = C12902d.f38098b;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
        String string = getString(C40034h.f95125d);
        C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
        e.mo33652k(string, C15278a.NEGATIVE, (C12902d.C12905b) null);
    }

    /* renamed from: q1 */
    private final void m79052q1() {
        m79058x1().f95529g.setOnClickListener(new C24763a(this));
        m79058x1().f95527e.setOnClickListener(new C24764b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m79053r1(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment, View view) {
        C41536l.m120489i(travelInsuranceSuccessFragment, "this$0");
        travelInsuranceSuccessFragment.m79039C1().mo63173iw().mo63167rk();
        C20559a.C20560a aVar = C20559a.C20560a.f55597f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        aVar.mo49091a(F);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m79054s1(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment, View view) {
        C41536l.m120489i(travelInsuranceSuccessFragment, "this$0");
        travelInsuranceSuccessFragment.m79042F1();
    }

    /* renamed from: t1 */
    private final void m79055t1() {
        C24770h jw = m79039C1().mo63174jw();
        jw.mo63168G4().mo4819k(getViewLifecycleOwner(), new C24621l(new C24612c(this)));
        LiveData Sn = jw.mo63169Sn();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Sn, viewLifecycleOwner, new C24613d(this));
        jw.mo63170a().mo4819k(getViewLifecycleOwner(), new C24621l(new C24614e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m79056u1(String str) {
        String rbMiddleware = mo62803z1().getRbMiddleware();
        C32303f.m95195f(RetrofitClient.populateUrlWithExtraData(rbMiddleware + "?" + str), requireActivity(), "Travel Insurance Policy.pdf", "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m79057v1(C24767e eVar) {
        boolean z;
        C40183j x1 = m79058x1();
        LayerView layerView = x1.f95536n;
        C41536l.m120488h(layerView, "personalInfoContainer");
        if (layerView.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LayerView layerView2 = x1.f95536n;
            C41536l.m120488h(layerView2, "personalInfoContainer");
            C32343x.m95407O0(layerView2);
        }
        x1.f95530h.setText(eVar.mo63162c());
        x1.f95532j.setText(eVar.mo63163d());
        x1.f95535m.setText(eVar.mo63161b());
        x1.f95528f.setText(eVar.mo63160a());
    }

    /* renamed from: x1 */
    private final C40183j m79058x1() {
        C40183j jVar = this.f63436g;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final int m79059y1() {
        return ((Number) this.f63437h.getValue()).intValue();
    }

    /* renamed from: A1 */
    public final C24768f mo62802A1() {
        C24768f fVar = this.f63439j;
        if (fVar != null) {
            return fVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f63436g = C40183j.m116440d(layoutInflater, viewGroup, false);
        FrameLayout c = m79058x1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63436g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m79058x1();
        super.onViewCreated(view, bundle);
        m79040D1();
        m79055t1();
    }

    /* renamed from: z1 */
    public final TargetEnvironment mo62803z1() {
        TargetEnvironment targetEnvironment = this.f63441l;
        if (targetEnvironment != null) {
            return targetEnvironment;
        }
        C41536l.m120506z("environment");
        return null;
    }
}
