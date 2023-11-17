package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.C0152h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import g91.C32303f;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import hm0.C25038a;
import hm0.C25039b;
import hm0.C25040c;
import hm0.C25044f;
import im0.C25233b;
import iu0.C36546y;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.accountpicker.AccountPickerView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.C24646d;
import p380ck.C10463g;
import p420fh.C12902d;
import p434gh.C15278a;
import p759fv.C20559a;
import ue1.C43064a;
import ue1.C43075l;
import y71.C40030d;
import y71.C40034h;
import z11.C40140b;
import z71.C40180g;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment */
public final class InsuranceSummaryFragment extends C24643a implements C41185v.C41186a {

    /* renamed from: k */
    public static final C24629a f63463k = new C24629a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C40180g f63464g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f63465h = true;

    /* renamed from: i */
    public C24646d.C24652d f63466i;

    /* renamed from: j */
    private final C41217g f63467j;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$a */
    public static final class C24629a {
        private C24629a() {
        }

        public /* synthetic */ C24629a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$b */
    public static final class C24630b extends C0152h {

        /* renamed from: d */
        final /* synthetic */ InsuranceSummaryFragment f63468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24630b(InsuranceSummaryFragment insuranceSummaryFragment) {
            super(true);
            this.f63468d = insuranceSummaryFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            if (this.f63468d.f63465h) {
                C8034d.m30522a(this.f63468d).mo22123U();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$c */
    /* synthetic */ class C24631c extends C41519a implements C43075l {
        C24631c(Object obj) {
            super(1, obj, InsuranceSummaryFragment.class, "setupFields", "setupFields(Lge/bog/mobilebank/insurance/travelinsurance/presentation/summary/InsuranceSummaryUiModel;)Lkotlin/Unit;", 8);
        }

        /* renamed from: b */
        public final void mo62816b(C25044f fVar) {
            C41536l.m120489i(fVar, "p0");
            C41238w unused = ((InsuranceSummaryFragment) this.f97690d).m79073C1(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62816b((C25044f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$d */
    static final class C24632d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceSummaryFragment f63469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24632d(InsuranceSummaryFragment insuranceSummaryFragment) {
            super(1);
            this.f63469d = insuranceSummaryFragment;
        }

        /* renamed from: a */
        public final void mo62817a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f63469d.f63465h = false;
                FrameLayout frameLayout = this.f63469d.m79084r1().f95513q;
                C41536l.m120488h(frameLayout, "binding.progress");
                C32343x.m95483r1(frameLayout, true, false, 2, (Object) null);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f63469d.f63465h = true;
                FrameLayout frameLayout2 = this.f63469d.m79084r1().f95513q;
                C41536l.m120488h(frameLayout2, "binding.progress");
                C32343x.m95483r1(frameLayout2, false, false, 2, (Object) null);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f63469d.f63465h = true;
                FrameLayout frameLayout3 = this.f63469d.m79084r1().f95513q;
                C41536l.m120488h(frameLayout3, "binding.progress");
                C32343x.m95483r1(frameLayout3, false, false, 2, (Object) null);
                this.f63469d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62817a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$e */
    static final class C24633e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceSummaryFragment f63470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24633e(InsuranceSummaryFragment insuranceSummaryFragment) {
            super(1);
            this.f63470d = insuranceSummaryFragment;
        }

        /* renamed from: a */
        public final void mo62818a(long j) {
            this.f63470d.m79072B1(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62818a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$f */
    static final class C24634f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceSummaryFragment f63471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24634f(InsuranceSummaryFragment insuranceSummaryFragment) {
            super(1);
            this.f63471d = insuranceSummaryFragment;
        }

        /* renamed from: a */
        public final void mo62819a(C24646d.C24653e eVar) {
            C41536l.m120489i(eVar, "params");
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, eVar.mo62893b(), eVar.mo62892a(), (C41143c) null, 4, (Object) null);
            FragmentManager childFragmentManager = this.f63471d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            e.mo4576A1(childFragmentManager, "SCA_TAG");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62819a((C24646d.C24653e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$g */
    static final class C24635g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceSummaryFragment f63472d;

        /* renamed from: e */
        final /* synthetic */ TravelInsuranceFilledInfo f63473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24635g(InsuranceSummaryFragment insuranceSummaryFragment, TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
            super(1);
            this.f63472d = insuranceSummaryFragment;
            this.f63473e = travelInsuranceFilledInfo;
        }

        /* renamed from: a */
        public final void mo62820a(int i) {
            C8034d.m30522a(this.f63472d).mo22118M(C40030d.action_insuranceSummaryFragment_to_TravelInsuranceSuccessFragment, C0908e.m3336b(C41233s.m119492a(this.f63472d.getString(C40034h.arg_doc_key), Integer.valueOf(i)), C41233s.m119492a(this.f63472d.getString(C40034h.arg_filled_info), this.f63473e)));
            C20559a.C20562c cVar = new C20559a.C20562c(this.f63473e.mo62738w());
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            cVar.mo49091a(F);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62820a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$h */
    static final class C24636h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63474a;

        C24636h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63474a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63474a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63474a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$i */
    public static final class C24637i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24637i(Fragment fragment) {
            super(0);
            this.f63475d = fragment;
        }

        public final Fragment invoke() {
            return this.f63475d;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$j */
    public static final class C24638j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24638j(C43064a aVar) {
            super(0);
            this.f63476d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f63476d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$k */
    public static final class C24639k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f63477d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24639k(C41217g gVar) {
            super(0);
            this.f63477d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f63477d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$l */
    public static final class C24640l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63478d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63479e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24640l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f63478d = aVar;
            this.f63479e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63478d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f63479e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$m */
    static final class C24641m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ InsuranceSummaryFragment f63480d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment$m$a */
        static final class C24642a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ InsuranceSummaryFragment f63481d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24642a(InsuranceSummaryFragment insuranceSummaryFragment) {
                super(0);
                this.f63481d = insuranceSummaryFragment;
            }

            /* renamed from: b */
            public final C24646d invoke() {
                C24646d.C24652d s1 = this.f63481d.mo62815s1();
                Bundle arguments = this.f63481d.getArguments();
                TravelInsuranceFilledInfo travelInsuranceFilledInfo = arguments != null ? (TravelInsuranceFilledInfo) arguments.getParcelable(this.f63481d.getString(C40034h.arg_filled_info)) : null;
                C41536l.m120486f(travelInsuranceFilledInfo);
                return s1.mo32785a(travelInsuranceFilledInfo);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24641m(InsuranceSummaryFragment insuranceSummaryFragment) {
            super(0);
            this.f63480d = insuranceSummaryFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24642a(this.f63480d));
        }
    }

    public InsuranceSummaryFragment() {
        C24641m mVar = new C24641m(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24638j(new C24637i(this)));
        this.f63467j = C1514j0.m5374c(this, C41520a0.m120436b(C24646d.class), new C24639k(a), new C24640l((C43064a) null, a), mVar);
    }

    /* renamed from: A1 */
    private final void m79071A1(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        C24646d t1 = m79085t1();
        t1.mo62879a().mo4819k(getViewLifecycleOwner(), new C24636h(new C24631c(this)));
        t1.mo62883rw().mo4819k(getViewLifecycleOwner(), new C24636h(new C24632d(this)));
        LiveData uw = t1.mo62885uw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(uw, viewLifecycleOwner, new C24633e(this));
        LiveData qw = t1.mo62882qw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(qw, viewLifecycleOwner2, new C24634f(this));
        LiveData sw = t1.mo62884sw();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(sw, viewLifecycleOwner3, new C24635g(this, travelInsuranceFilledInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m79072B1(long j) {
        C25233b.f64819O.mo63756a(Long.valueOf(j)).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final C41238w m79073C1(C25044f fVar) {
        C40180g r1 = m79084r1();
        r1.f95502f.setText(fVar.mo63475c());
        r1.f95509m.setText(fVar.mo63483i());
        r1.f95516t.setText(fVar.mo63487m());
        r1.f95504h.setText(fVar.mo63477e());
        r1.f95512p.setText(fVar.mo63484j());
        r1.f95514r.setText(fVar.mo63485k());
        r1.f95505i.setText(fVar.mo63479f());
        r1.f95508l.setText(fVar.mo63481h());
        r1.f95511o.setText(fVar.mo63480g());
        r1.f95503g.setText(fVar.mo63476d());
        Button button = r1.f95510n.getButton();
        String string = getString(C40034h.summary_btn_pay);
        String j = fVar.mo63484j();
        button.setButtonText(string + " (" + j + ")");
        C40140b l = fVar.mo63486l();
        if (l == null) {
            return null;
        }
        m79074D1(l);
        return C41238w.f97225a;
    }

    /* renamed from: D1 */
    private final void m79074D1(C40140b bVar) {
        C40180g r1 = m79084r1();
        r1.f95501e.setCollapsedHint(bVar.mo94069a().mo34687e());
        AccountPickerView accountPickerView = r1.f95501e;
        C41536l.m120488h(accountPickerView, "accountPicker");
        AccountPickerView.m49453l(accountPickerView, bVar.mo94069a().mo34686d().mo46543a(), bVar.mo94069a().mo34686d().mo46544b().getCurrencyCode(), false, 4, (Object) null);
    }

    /* renamed from: q1 */
    private final void m79083q1() {
        C32303f.m95195f(C32343x.m95388F("link.travel.insurance.general.conditions", new Object[0]), getActivity(), "ხელშეკრულება-terms.docx", "application/msword");
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final C40180g m79084r1() {
        C40180g gVar = this.f63464g;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: t1 */
    private final C24646d m79085t1() {
        return (C24646d) this.f63467j.getValue();
    }

    /* renamed from: u1 */
    private final void m79086u1() {
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C24630b(this));
    }

    /* renamed from: v1 */
    private final void m79087v1() {
        C40180g r1 = m79084r1();
        r1.f95519w.setProgress(50.0f);
        r1.f95507k.setTitle(C32343x.m95388F("text.travel.insurance.screen.policy.preview.policyholder.info", new Object[0]));
        r1.f95505i.setTitle(C32343x.m95388F("text.travel.insurance.screen.policy.preview.policyholder.info.name", new Object[0]));
        r1.f95508l.setTitle(C32343x.m95388F("text.travel.insurance.screen.policy.preview.policyholder.info.surname", new Object[0]));
        r1.f95511o.setTitle(C32343x.m95388F("text.travel.insurance.insured.person.screen.id", new Object[0]));
        r1.f95503g.setTitle(C32343x.m95388F("text.travel.insurance.insured.person.screen.dob", new Object[0]));
        CheckboxView checkboxView = r1.f95517u;
        String string = getString(C40034h.summary_terms_check_leading_text);
        C41536l.m120488h(string, "getString(R.string.summa…terms_check_leading_text)");
        checkboxView.mo35145g(string, getString(C40034h.summary_terms_check_clickable_text));
        r1.f95501e.setExpandedHint(C32343x.m95388F("text.travel.insurance.choose.account", new Object[0]));
        r1.f95501e.setExpandedHint(C32343x.m95388F("text.travel.insurance.choose.account", new Object[0]));
        r1.f95517u.setTextClickListener(new C25038a(this));
        r1.f95501e.setOnClickListener(new C25039b(this));
        r1.f95510n.getButton().setOnClickListener(new C25040c(r1, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m79088x1(InsuranceSummaryFragment insuranceSummaryFragment) {
        C41536l.m120489i(insuranceSummaryFragment, "this$0");
        insuranceSummaryFragment.m79083q1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m79089y1(InsuranceSummaryFragment insuranceSummaryFragment, View view) {
        C41536l.m120489i(insuranceSummaryFragment, "this$0");
        insuranceSummaryFragment.m79085t1().mo62878Og();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m79090z1(C40180g gVar, InsuranceSummaryFragment insuranceSummaryFragment, View view) {
        C41536l.m120489i(gVar, "$this_with");
        C41536l.m120489i(insuranceSummaryFragment, "this$0");
        C20559a.C20572m mVar = C20559a.C20572m.f55608f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        mVar.mo49091a(F);
        if (!gVar.f95517u.isChecked()) {
            gVar.f95517u.setError(true);
        } else {
            insuranceSummaryFragment.m79085t1().mo62887ww();
        }
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (C41536l.m120484d(str4, "SCA_TAG")) {
            m79085t1().mo62880h5(str, str2, str3);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v f0 = C32343x.m95446f0(childFragmentManager, "SCA_TAG");
        if (f0 != null) {
            f0.mo4577k1();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12902d.C12903a aVar = C12902d.f38098b;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
        String string = getString(C40034h.f95125d);
        C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
        e.mo33652k(string, C15278a.NEGATIVE, (C12902d.C12905b) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f63464g = C40180g.m116428d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m79084r1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63464g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        TravelInsuranceFilledInfo travelInsuranceFilledInfo;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(getString(C40034h.summary_header_text));
        Bundle arguments = getArguments();
        if (arguments != null) {
            travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) arguments.getParcelable(getString(C40034h.arg_filled_info));
        } else {
            travelInsuranceFilledInfo = null;
        }
        C41536l.m120486f(travelInsuranceFilledInfo);
        m79086u1();
        m79087v1();
        m79071A1(travelInsuranceFilledInfo);
    }

    /* renamed from: s1 */
    public final C24646d.C24652d mo62815s1() {
        C24646d.C24652d dVar = this.f63466i;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
