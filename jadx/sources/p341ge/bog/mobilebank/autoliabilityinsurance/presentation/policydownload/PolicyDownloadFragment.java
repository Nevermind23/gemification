package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import g91.C32303f;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p420fh.C12902d;
import p434gh.C15278a;
import p451hk.C15526d;
import p451hk.C15529g;
import p493kk.C16460n;
import p563pk.C17382l;
import p686yk.C18928a;
import p686yk.C18929b;
import p686yk.C18930c;
import p686yk.C18934g;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment */
public final class PolicyDownloadFragment extends C13687a {

    /* renamed from: l */
    public static final C13674a f40836l = new C13674a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C16460n f40837i;

    /* renamed from: j */
    private final C41217g f40838j;

    /* renamed from: k */
    public TargetEnvironment f40839k;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$a */
    public static final class C13674a {
        private C13674a() {
        }

        public /* synthetic */ C13674a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$b */
    static final class C13675b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDownloadFragment f40840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13675b(PolicyDownloadFragment policyDownloadFragment) {
            super(1);
            this.f40840d = policyDownloadFragment;
        }

        /* renamed from: a */
        public final void mo37561a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f40840d.m51164m1(((C17382l) ((C31128a.C31131c) aVar).mo71340a()).mo44883a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f40840d.m51173x1();
            } else {
                boolean z = aVar instanceof C31128a.C31130b;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37561a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$c */
    static final class C13676c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDownloadFragment f40841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13676c(PolicyDownloadFragment policyDownloadFragment) {
            super(1);
            this.f40841d = policyDownloadFragment;
        }

        /* renamed from: a */
        public final void mo37562a(C30003b bVar) {
            C41536l.m120489i(bVar, "it");
            if (bVar.mo70300c()) {
                Context requireContext = this.f40841d.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                C38125h.m112238c(requireContext).mo91620o(bVar).mo4576A1(this.f40841d.getChildFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37562a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$d */
    static final class C13677d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40842a;

        C13677d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40842a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40842a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40842a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$e */
    public static final class C13678e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13678e(Fragment fragment) {
            super(0);
            this.f40843d = fragment;
        }

        public final Fragment invoke() {
            return this.f40843d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$f */
    public static final class C13679f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13679f(C43064a aVar) {
            super(0);
            this.f40844d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40844d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$g */
    public static final class C13680g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40845d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13680g(C41217g gVar) {
            super(0);
            this.f40845d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40845d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$h */
    public static final class C13681h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40846d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40847e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13681h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40846d = aVar;
            this.f40847e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40846d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40847e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment$i */
    public static final class C13682i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40848d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40849e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13682i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40848d = fragment;
            this.f40849e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40849e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40848d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public PolicyDownloadFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13679f(new C13678e(this)));
        this.f40838j = C1514j0.m5374c(this, C41520a0.m120436b(PolicyDownloadViewModel$ViewModel.class), new C13680g(a), new C13681h((C43064a) null, a), new C13682i(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final void m51164m1(String str) {
        String rbMiddleware = mo37560o1().getRbMiddleware();
        C32303f.m95195f(RetrofitClient.populateUrlWithExtraData(rbMiddleware + "?" + str), requireActivity(), "mtpl-policy.pdf", "application/pdf");
    }

    /* renamed from: n1 */
    private final C16460n m51165n1() {
        C16460n nVar = this.f40837i;
        C41536l.m120486f(nVar);
        return nVar;
    }

    private final void observeData() {
        C18934g ow = m51166p1().mo37568ow();
        ow.mo37566lu().mo4819k(getViewLifecycleOwner(), new C13677d(new C13675b(this)));
        LiveData w7 = ow.mo37571w7();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(w7, viewLifecycleOwner, new C13676c(this));
    }

    /* renamed from: p1 */
    private final PolicyDownloadViewModel$ViewModel m51166p1() {
        return (PolicyDownloadViewModel$ViewModel) this.f40838j.getValue();
    }

    /* renamed from: q1 */
    private final void m51167q1() {
        startActivity(new Intent(requireContext(), MainActivity.class).setFlags(872415232));
        C1505h activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: r1 */
    private final void m51168r1() {
        m51165n1().f46574e.getButton().setOnClickListener(new C18928a(this));
        m51165n1().f46574e.getAdditionalButton().setOnClickListener(new C18929b(this));
        m51165n1().f46575f.setOnClickListener(new C18930c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m51169s1(PolicyDownloadFragment policyDownloadFragment, View view) {
        C41536l.m120489i(policyDownloadFragment, "this$0");
        C8034d.m30522a(policyDownloadFragment).mo22117L(C15526d.action_policyDownloadFragment_to_insuranceDetailFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m51170t1(PolicyDownloadFragment policyDownloadFragment, View view) {
        C41536l.m120489i(policyDownloadFragment, "this$0");
        policyDownloadFragment.m51167q1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m51171u1(PolicyDownloadFragment policyDownloadFragment, View view) {
        C41536l.m120489i(policyDownloadFragment, "this$0");
        policyDownloadFragment.m51166p1().mo37567nw().mo37565Lk();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
    /* JADX WARNING: type inference failed for: r12v1, types: [ge.bog.designsystem.components.pagestate.PageStateType$Warning] */
    /* JADX WARNING: type inference failed for: r4v9, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m51172v1() {
        /*
            r19 = this;
            r0 = r19
            kk.n r1 = r19.m51165n1()
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r1 = r1.f46577h
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "rbc.ins.policy.result.warning"
            java.lang.String r3 = g91.C32343x.m95388F(r4, r3)
            r1.setTitleText(r3)
            android.os.Bundle r1 = r19.getArguments()
            if (r1 == 0) goto L_0x0021
            java.lang.String r3 = "PAYMENT_RESULT_ARG"
            boolean r1 = r1.getBoolean(r3, r2)
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            kk.n r3 = r19.m51165n1()
            ge.bog.designsystem.components.pagestate.PageState r3 = r3.f46576g
            if (r1 == 0) goto L_0x0038
            ge.bog.designsystem.components.pagestate.PageStateType$Success r11 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0047
        L_0x0038:
            ge.bog.designsystem.components.pagestate.PageStateType$Warning r11 = new ge.bog.designsystem.components.pagestate.PageStateType$Warning
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 15
            r18 = 0
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0047:
            r3.setPageStateType(r11)
            kk.n r3 = r19.m51165n1()
            ge.bog.designsystem.components.pagestate.PageState r3 = r3.f46576g
            if (r1 == 0) goto L_0x005b
            java.lang.String r4 = "rbc.ins.policy.result.success"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r4 = g91.C32343x.m95388F(r4, r5)
            goto L_0x0061
        L_0x005b:
            int r4 = p451hk.C15529g.policy_download_page_state_title
            java.lang.String r4 = r0.getString(r4)
        L_0x0061:
            r3.setTitleText(r4)
            kk.n r3 = r19.m51165n1()
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r3 = r3.f46577h
            java.lang.String r4 = "binding.policyDownloadFeedback"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            r4 = 1
            r1 = r1 ^ r4
            r5 = 2
            r6 = 0
            g91.C32343x.m95483r1(r3, r1, r2, r5, r6)
            kk.n r1 = r19.m51165n1()
            ge.bog.designsystem.components.smallsteps.SmallStepsView r1 = r1.f46575f
            java.lang.String r3 = "rbc.ins.active.policy.desc.2"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r2 = g91.C32343x.m95388F(r3, r2)
            r1.setTitle(r2)
            android.content.Context r2 = r19.requireContext()
            int r3 = p451hk.C15525c.icons_48_general_doc_pdf
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r1.setLeftIcon((android.graphics.drawable.Drawable) r2)
            int r2 = p451hk.C15523a.f44039a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setLeftIconTint((java.lang.Integer) r2)
            kk.n r1 = r19.m51165n1()
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r1 = r1.f46574e
            int r2 = p451hk.C15529g.policy_download_button_secondary
            java.lang.String r2 = r0.getString(r2)
            r1.setAdditionalText(r2)
            kk.n r1 = r19.m51165n1()
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r1 = r1.f46574e
            ge.bog.designsystem.components.buttons.Button r1 = r1.getButton()
            r1.setEnabled(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment.m51172v1():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m51173x1() {
        C12902d.C12903a aVar = C12902d.f38098b;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
        String string = getString(C15529g.f44090o);
        C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
        e.mo33652k(string, C15278a.NEGATIVE, (C12902d.C12905b) null);
    }

    /* renamed from: o1 */
    public final TargetEnvironment mo37560o1() {
        TargetEnvironment targetEnvironment = this.f40839k;
        if (targetEnvironment != null) {
            return targetEnvironment;
        }
        C41536l.m120506z("environment");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40837i = C16460n.m58646d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m51165n1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40837i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m51172v1();
        m51168r1();
        observeData();
    }
}
