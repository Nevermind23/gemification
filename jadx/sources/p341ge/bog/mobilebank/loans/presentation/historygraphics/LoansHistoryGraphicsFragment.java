package p341ge.bog.mobilebank.loans.presentation.historygraphics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import as0.C31045b;
import bs0.C31182b;
import bs0.C31184c;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37130e;
import lr0.C37133h;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p202p0.C7589q;
import p228r0.C8034d;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32658g;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import pr0.C37951e0;
import ue1.C43064a;
import ue1.C43075l;
import ur0.C39068a;

/* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment */
public final class LoansHistoryGraphicsFragment extends C32642a {

    /* renamed from: l */
    public static final C32627a f80339l = new C32627a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C37951e0 f80340g;

    /* renamed from: h */
    public TargetEnvironment f80341h;

    /* renamed from: i */
    public C32658g.C32666h f80342i;

    /* renamed from: j */
    private final C41217g f80343j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C31045b f80344k = new C31045b(new C32629c(this), new C32630d(this), new C32631e(this));

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$a */
    public static final class C32627a {
        private C32627a() {
        }

        public /* synthetic */ C32627a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$b */
    private final class C32628b extends RecyclerView.C1756u {
        public C32628b() {
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5740e(recyclerView, i, i2);
            LoansHistoryGraphicsFragment.this.m96436u1();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$c */
    static final class C32629c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoansHistoryGraphicsFragment f80346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32629c(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            super(0);
            this.f80346d = loansHistoryGraphicsFragment;
        }

        public final void invoke() {
            this.f80346d.m96433q1().mo74265n7();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$d */
    static final class C32630d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoansHistoryGraphicsFragment f80347d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32630d(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            super(0);
            this.f80347d = loansHistoryGraphicsFragment;
        }

        public final void invoke() {
            this.f80347d.m96433q1().mo74264c();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$e */
    static final class C32631e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoansHistoryGraphicsFragment f80348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32631e(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            super(1);
            this.f80348d = loansHistoryGraphicsFragment;
        }

        /* renamed from: a */
        public final void mo74203a(int i) {
            this.f80348d.m96432o1().f91118e.mo5425x1(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74203a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$f */
    static final class C32632f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80349a;

        C32632f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80349a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80349a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80349a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$g */
    static final class C32633g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoansHistoryGraphicsFragment f80350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32633g(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            super(1);
            this.f80350d = loansHistoryGraphicsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96442c(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            C41536l.m120489i(loansHistoryGraphicsFragment, "this$0");
            loansHistoryGraphicsFragment.m96436u1();
        }

        /* renamed from: b */
        public final void mo74206b(List list) {
            this.f80350d.f80344k.mo6030j(list, new C32646d(this.f80350d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74206b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$h */
    static final class C32634h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoansHistoryGraphicsFragment f80351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32634h(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            super(1);
            this.f80351d = loansHistoryGraphicsFragment;
        }

        /* renamed from: a */
        public final void mo74207a(C31182b bVar) {
            C41536l.m120489i(bVar, "link");
            if (bVar instanceof C31182b.C31183a) {
                C31182b.C31183a aVar = (C31182b.C31183a) bVar;
                this.f80351d.m96431n1(aVar.mo71388b(), aVar.mo71387a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74207a((C31182b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$i */
    static final class C32635i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoansHistoryGraphicsFragment f80352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32635i(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            super(1);
            this.f80352d = loansHistoryGraphicsFragment;
        }

        /* renamed from: a */
        public final void mo74208a(C31184c cVar) {
            this.f80352d.refreshHeaderText(C32343x.m95388F(cVar.mo71392a(), new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74208a((C31184c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$j */
    public static final class C32636j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32636j(Fragment fragment) {
            super(0);
            this.f80353d = fragment;
        }

        public final Fragment invoke() {
            return this.f80353d;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$k */
    public static final class C32637k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32637k(C43064a aVar) {
            super(0);
            this.f80354d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f80354d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$l */
    public static final class C32638l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f80355d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32638l(C41217g gVar) {
            super(0);
            this.f80355d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f80355d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$m */
    public static final class C32639m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80356d;

        /* renamed from: e */
        final /* synthetic */ C41217g f80357e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32639m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f80356d = aVar;
            this.f80357e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80356d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f80357e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$n */
    static final class C32640n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoansHistoryGraphicsFragment f80358d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment$n$a */
        static final class C32641a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LoansHistoryGraphicsFragment f80359d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32641a(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
                super(0);
                this.f80359d = loansHistoryGraphicsFragment;
            }

            /* renamed from: b */
            public final C32658g invoke() {
                HistoryScheduleDataModel historyScheduleDataModel;
                C32658g.C32666h r1 = this.f80359d.mo74202r1();
                Bundle arguments = this.f80359d.getArguments();
                if (arguments != null) {
                    historyScheduleDataModel = (HistoryScheduleDataModel) arguments.getParcelable(this.f80359d.getString(C37133h.arg_history_schedule_data));
                } else {
                    historyScheduleDataModel = null;
                }
                C41536l.m120486f(historyScheduleDataModel);
                return r1.mo32820a(historyScheduleDataModel);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32640n(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            super(0);
            this.f80358d = loansHistoryGraphicsFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C32641a(this.f80358d));
        }
    }

    public LoansHistoryGraphicsFragment() {
        C32640n nVar = new C32640n(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C32637k(new C32636j(this)));
        this.f80343j = C1514j0.m5374c(this, C41520a0.m120436b(C32658g.class), new C32638l(a), new C32639m((C43064a) null, a), nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final void m96431n1(String str, String str2) {
        String rbMiddleware = mo74201p1().getRbMiddleware();
        String populateUrlWithExtraData = RetrofitClient.populateUrlWithExtraData(rbMiddleware + "?" + str);
        C1505h requireActivity = requireActivity();
        String F = C32343x.m95388F(str2, new Object[0]);
        C32303f.m95195f(populateUrlWithExtraData, requireActivity, F + ".pdf", "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public final C37951e0 m96432o1() {
        C37951e0 e0Var = this.f80340g;
        C41536l.m120486f(e0Var);
        return e0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C32658g m96433q1() {
        return (C32658g) this.f80343j.getValue();
    }

    /* renamed from: s1 */
    private final void m96434s1() {
        C37951e0 o1 = m96432o1();
        o1.f91118e.setAdapter(this.f80344k);
        o1.f91118e.mo5363n(new C32628b());
    }

    /* renamed from: t1 */
    private final void m96435t1() {
        C32658g q1 = m96433q1();
        q1.mo74267pw().mo4819k(getViewLifecycleOwner(), new C32632f(new C32633g(this)));
        LiveData ow = q1.mo74266ow();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(ow, viewLifecycleOwner, new C32634h(this));
        q1.mo74263b().mo4819k(getViewLifecycleOwner(), new C32632f(new C32635i(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m96436u1() {
        C39068a aVar;
        boolean canScrollVertically = m96432o1().f91118e.canScrollVertically(-1);
        C7589q B = C8034d.m30522a(this).mo22111B();
        boolean z = false;
        if (B != null && B.mo22214w() == C37130e.loansHistoryGraphicsFragment) {
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80340g = C37951e0.m111549d(layoutInflater, viewGroup, false);
        RecyclerView c = m96432o1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80340g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m96435t1();
        m96434s1();
    }

    /* renamed from: p1 */
    public final TargetEnvironment mo74201p1() {
        TargetEnvironment targetEnvironment = this.f80341h;
        if (targetEnvironment != null) {
            return targetEnvironment;
        }
        C41536l.m120506z("environment");
        return null;
    }

    /* renamed from: r1 */
    public final C32658g.C32666h mo74202r1() {
        C32658g.C32666h hVar = this.f80342i;
        if (hVar != null) {
            return hVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }
}
