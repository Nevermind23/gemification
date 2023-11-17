package p341ge.bog.mobilebank.loans.presentation.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0152h;
import androidx.core.p016os.C0908e;
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
import androidx.recyclerview.widget.RecyclerView;
import cs0.C31397b;
import es0.C31772c;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import is0.C36497d;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import lr0.C37130e;
import lr0.C37133h;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p202p0.C7589q;
import p228r0.C8034d;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.details.C32597e;
import p341ge.bog.mobilebank.loans.presentation.details.C32618h;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel;
import p341ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusData;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData;
import p341ge.bog.mobilebank.loans.presentation.renameloan.model.RenameLoanData;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.shared.products.presentation.LinearLayoutManagerAccurateOffset;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import pr0.C37949d0;
import ue1.C43064a;
import ue1.C43075l;
import ur0.C39068a;
import vr0.C39438a;
import wr0.C39644d;
import wr0.C39667l;
import wr0.C39670n;
import yr0.C40047a;

/* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment */
public final class LoanDetailsFragment extends C32594b implements C39670n {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C37949d0 f80225i;

    /* renamed from: j */
    public C32618h.C32620b f80226j;

    /* renamed from: k */
    private final C41217g f80227k = C41219i.m119470b(new C32575a(this));

    /* renamed from: l */
    private final C41217g f80228l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C39644d f80229m;

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$a */
    static final class C32575a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanDetailsFragment f80230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32575a(LoanDetailsFragment loanDetailsFragment) {
            super(0);
            this.f80230d = loanDetailsFragment;
        }

        /* renamed from: b */
        public final LoansFlow.Details invoke() {
            Bundle arguments = this.f80230d.getArguments();
            LoansFlow.Details details = arguments != null ? (LoansFlow.Details) arguments.getParcelable(this.f80230d.getString(C37133h.loans_flow_extra)) : null;
            C41536l.m120486f(details);
            return details;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$b */
    public static final class C32576b extends C0152h {

        /* renamed from: d */
        final /* synthetic */ C32618h f80231d;

        /* renamed from: e */
        final /* synthetic */ LoanDetailsFragment f80232e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32576b(C32618h hVar, LoanDetailsFragment loanDetailsFragment) {
            super(true);
            this.f80231d = hVar;
            this.f80232e = loanDetailsFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            this.f80231d.mo74175l();
            mo365f(false);
            C1505h activity = this.f80232e.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$c */
    public static final class C32577c extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ LoanDetailsFragment f80233a;

        C32577c(LoanDetailsFragment loanDetailsFragment) {
            this.f80233a = loanDetailsFragment;
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5740e(recyclerView, i, i2);
            this.f80233a.m96279J1();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$d */
    static final class C32578d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanDetailsFragment f80234d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32578d(LoanDetailsFragment loanDetailsFragment) {
            super(1);
            this.f80234d = loanDetailsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96310c(LoanDetailsFragment loanDetailsFragment) {
            RecyclerView recyclerView;
            C41536l.m120489i(loanDetailsFragment, "this$0");
            C37949d0 l1 = loanDetailsFragment.f80225i;
            if (l1 != null && (recyclerView = l1.f91107e) != null) {
                recyclerView.mo5257E0();
                loanDetailsFragment.m96279J1();
            }
        }

        /* renamed from: b */
        public final void mo74076b(List list) {
            C39644d j1 = this.f80234d.f80229m;
            if (j1 == null) {
                C41536l.m120506z("adapter");
                j1 = null;
            }
            j1.mo6030j(list, new C32595c(this.f80234d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74076b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$e */
    static final class C32579e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanDetailsFragment f80235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32579e(LoanDetailsFragment loanDetailsFragment) {
            super(1);
            this.f80235d = loanDetailsFragment;
        }

        /* renamed from: a */
        public final void mo74077a(C32597e eVar) {
            C41536l.m120489i(eVar, "actionButtonEvent");
            if (eVar instanceof C32597e.C32604g) {
                this.f80235d.m96277H1(((C32597e.C32604g) eVar).mo74112a());
            } else if (eVar instanceof C32597e.C32602e) {
                C40047a.C40052e eVar2 = C40047a.C40052e.f95181d;
                C10463g F = C36546y.m108282F();
                C41536l.m120488h(F, "getAnalytics()");
                eVar2.mo93924c(F);
                this.f80235d.m96276G1(((C32597e.C32602e) eVar).mo74109a());
            } else if (eVar instanceof C32597e.C32601d) {
                this.f80235d.m96274E1(((C32597e.C32601d) eVar).mo74108a());
            } else if (eVar instanceof C32597e.C32600c) {
                this.f80235d.m96273D1(((C32597e.C32600c) eVar).mo74107a());
            } else if (eVar instanceof C32597e.C32599b) {
                this.f80235d.m96278I1(((C32597e.C32599b) eVar).mo74106a());
            } else if (eVar instanceof C32597e.C32598a) {
                C40047a.C40054g gVar = C40047a.C40054g.f95183d;
                C10463g F2 = C36546y.m108282F();
                C41536l.m120488h(F2, "getAnalytics()");
                gVar.mo93924c(F2);
                this.f80235d.m96294v1(((C32597e.C32598a) eVar).mo74105a());
            } else if (eVar instanceof C32597e.C32603f) {
                C32597e.C32603f fVar = (C32597e.C32603f) eVar;
                this.f80235d.m96275F1(fVar.mo74110a(), fVar.mo74111b());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74077a((C32597e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$f */
    static final class C32580f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80236a;

        C32580f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80236a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80236a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80236a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$g */
    public static final class C32581g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32581g(Fragment fragment) {
            super(0);
            this.f80237d = fragment;
        }

        public final Fragment invoke() {
            return this.f80237d;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$h */
    public static final class C32582h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32582h(C43064a aVar) {
            super(0);
            this.f80238d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f80238d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$i */
    public static final class C32583i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f80239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32583i(C41217g gVar) {
            super(0);
            this.f80239d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f80239d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$j */
    public static final class C32584j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80240d;

        /* renamed from: e */
        final /* synthetic */ C41217g f80241e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32584j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f80240d = aVar;
            this.f80241e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80240d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f80241e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$k */
    static final class C32585k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanDetailsFragment f80242d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment$k$a */
        static final class C32586a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LoanDetailsFragment f80243d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32586a(LoanDetailsFragment loanDetailsFragment) {
                super(0);
                this.f80243d = loanDetailsFragment;
            }

            /* renamed from: b */
            public final C32618h invoke() {
                C32618h.C32620b A1 = this.f80243d.mo74067A1();
                LoansFlow.Details k1 = this.f80243d.m96296y1();
                C41536l.m120488h(k1, "extraData");
                return A1.mo32817a(k1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32585k(LoanDetailsFragment loanDetailsFragment) {
            super(0);
            this.f80242d = loanDetailsFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C32586a(this.f80242d));
        }
    }

    public LoanDetailsFragment() {
        C32585k kVar = new C32585k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C32582h(new C32581g(this)));
        this.f80228l = C1514j0.m5374c(this, C41520a0.m120436b(C32618h.class), new C32583i(a), new C32584j((C43064a) null, a), kVar);
    }

    /* renamed from: B1 */
    private final void m96271B1() {
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C32576b(m96297z1(), this));
    }

    /* renamed from: C1 */
    private final void m96272C1() {
        C35388f2 f2Var;
        C37949d0 x1 = m96295x1();
        C1505h activity = getActivity();
        if (activity instanceof C35388f2) {
            f2Var = (C35388f2) activity;
        } else {
            f2Var = null;
        }
        if (f2Var != null) {
            f2Var.mo86429X1("");
        }
        C39644d dVar = new C39644d(this);
        this.f80229m = dVar;
        x1.f91107e.setAdapter(dVar);
        RecyclerView recyclerView = x1.f91107e;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        recyclerView.setLayoutManager(new LinearLayoutManagerAccurateOffset(requireContext));
        x1.f91107e.setItemAnimator((RecyclerView.C1742m) null);
        x1.f91107e.mo5351j(new C39667l());
        x1.f91107e.mo5363n(new C32577c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final void m96273D1(InstallmentReversalCancelData installmentReversalCancelData) {
        C31772c.f78388O.mo72216a(installmentReversalCancelData).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m96274E1(LoanInstallmentStatusData loanInstallmentStatusData) {
        C31397b.f77944N.mo71770a(loanInstallmentStatusData).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final void m96275F1(RenameLoanData renameLoanData, String str) {
        C36497d.f88000Q.mo89296a(renameLoanData, str).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final void m96276G1(LoansFlow.PawnLoanPayment pawnLoanPayment) {
        C8034d.m30522a(this).mo22118M(C37130e.action_loanDetailsFragment_to_pawnLoanFragment, C0908e.m3336b(C41233s.m119492a(getString(C37133h.loans_flow_extra), pawnLoanPayment)));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m96277H1(LoansFlow.Repayment repayment) {
        C8034d.m30522a(this).mo22118M(C37130e.action_loanDetailsFragment_to_repaymentFragment, C0908e.m3336b(C41233s.m119492a(getString(C37133h.loans_flow_extra), repayment)));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m96278I1(HistoryScheduleDataModel historyScheduleDataModel) {
        C8034d.m30522a(this).mo22118M(C37130e.action_loanDetailsFragment_to_loansHistoryGraphicsFragment, C0908e.m3336b(C41233s.m119492a(getString(C37133h.arg_history_schedule_data), historyScheduleDataModel)));
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m96279J1() {
        C39068a aVar;
        boolean canScrollVertically = m96295x1().f91107e.canScrollVertically(-1);
        C7589q B = C8034d.m30522a(this).mo22111B();
        boolean z = false;
        if (B != null && B.mo22214w() == C37130e.loanDetailsFragment) {
            z = true;
        }
        if (z) {
            C1505h activity = getActivity();
            if (activity instanceof C39068a) {
                aVar = (C39068a) activity;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.mo74019j0(canScrollVertically);
            }
        }
    }

    private final void observeData() {
        C32618h z1 = m96297z1();
        z1.mo74177qw().mo4819k(getViewLifecycleOwner(), new C32580f(new C32578d(this)));
        LiveData pw = z1.mo74176pw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(pw, viewLifecycleOwner, new C32579e(this));
    }

    /* renamed from: t1 */
    private final void m96292t1() {
        getChildFragmentManager().mo4367F1("INPUT_REQUEST_KEY", getViewLifecycleOwner(), new C39438a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m96293u1(LoanDetailsFragment loanDetailsFragment, String str, Bundle bundle) {
        C41536l.m120489i(loanDetailsFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        C40047a.C40049b bVar = C40047a.C40049b.f95178d;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        bVar.mo93924c(F);
        C1505h requireActivity = loanDetailsFragment.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12910e.m48797o(requireActivity, C32343x.m95388F("text.loans.change.name.success", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
        String string = bundle.getString("INPUT_KEY", "");
        C32618h z1 = loanDetailsFragment.m96297z1();
        C41536l.m120488h(string, "loanName");
        z1.mo74173Gw(string);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m96294v1(C41224m mVar) {
        C32303f.m95196g((String) mVar.mo95678e(), this, (String) mVar.mo95680f(), "application/pdf");
    }

    /* renamed from: x1 */
    private final C37949d0 m96295x1() {
        C37949d0 d0Var = this.f80225i;
        C41536l.m120486f(d0Var);
        return d0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final LoansFlow.Details m96296y1() {
        return (LoansFlow.Details) this.f80227k.getValue();
    }

    /* renamed from: z1 */
    private final C32618h m96297z1() {
        return (C32618h) this.f80228l.getValue();
    }

    /* renamed from: A1 */
    public final C32618h.C32620b mo74067A1() {
        C32618h.C32620b bVar = this.f80226j;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    /* renamed from: I */
    public void mo74068I() {
        C40047a.C40055h hVar = C40047a.C40055h.f95184d;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        hVar.mo93924c(F);
        m96297z1().mo74182zw();
    }

    /* renamed from: Q0 */
    public void mo74069Q0(long j, int i) {
        m96297z1().mo74174Q0(j, i);
    }

    /* renamed from: X */
    public void mo74070X() {
        m96297z1().mo74179ww();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80225i = C37949d0.m111540d(layoutInflater, viewGroup, false);
        RecyclerView c = m96295x1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80225i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m96272C1();
        observeData();
        m96292t1();
        m96271B1();
    }

    /* renamed from: r */
    public void mo74071r(C32587a aVar) {
        C41536l.m120489i(aVar, "actionButton");
        m96297z1().mo74178vw(aVar);
    }

    /* renamed from: t */
    public void mo74072t(String str) {
        C41536l.m120489i(str, "loanName");
        m96297z1().mo74181yw(str);
    }

    /* renamed from: w0 */
    public void mo74073w0() {
        C40047a.C40050c cVar = C40047a.C40050c.f95179d;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        cVar.mo93924c(F);
        m96297z1().mo74180xw();
    }

    /* renamed from: w1 */
    public void mo74074w1() {
        m96297z1().mo74172Fw();
    }
}
