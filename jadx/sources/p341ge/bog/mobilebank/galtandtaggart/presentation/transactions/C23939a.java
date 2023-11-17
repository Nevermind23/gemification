package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import og0.C26993a;
import og0.C26994b;
import og0.C26995c;
import p163m0.C7047a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.C23966b;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.model.TransactionsFilterData;
import pg0.C27529b;
import sg0.C28199e;
import tg0.C28384f;
import ue0.C28737l0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a */
public final class C23939a extends C23949b implements C28199e.C28201b {

    /* renamed from: j */
    public static final C23940a f62182j = new C23940a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28737l0 f62183g;

    /* renamed from: h */
    private final C41217g f62184h;

    /* renamed from: i */
    private C27529b f62185i = new C27529b((List) null, new C23941b(this), 1, (DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$a */
    public static final class C23940a {
        private C23940a() {
        }

        public /* synthetic */ C23940a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C23939a mo60913a() {
            return new C23939a();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$b */
    /* synthetic */ class C23941b extends C41535k implements C43075l {
        C23941b(Object obj) {
            super(1, obj, C23939a.class, "transactionClicked", "transactionClicked(Lge/bog/mobilebank/galtandtaggart/presentation/transactions/model/TransactionAdapterModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo60914b(C28384f fVar) {
            C41536l.m120489i(fVar, "p0");
            ((C23939a) this.receiver).m77264y1(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60914b((C28384f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$c */
    static final class C23942c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23939a f62186d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23942c(C23939a aVar) {
            super(1);
            this.f62186d = aVar;
        }

        /* renamed from: a */
        public final void mo60915a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                if (aVar.mo71341b() == 2) {
                    this.f62186d.m77257q1().f73370l.setRefreshing(true);
                } else {
                    this.f62186d.m77248e();
                }
            } else if (aVar instanceof C31128a.C31131c) {
                this.f62186d.m77263x1((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f62186d.m77262v1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60915a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$d */
    static final class C23943d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62187a;

        C23943d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62187a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62187a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62187a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$e */
    public static final class C23944e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62188d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23944e(Fragment fragment) {
            super(0);
            this.f62188d = fragment;
        }

        public final Fragment invoke() {
            return this.f62188d;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$f */
    public static final class C23945f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23945f(C43064a aVar) {
            super(0);
            this.f62189d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62189d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$g */
    public static final class C23946g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23946g(C41217g gVar) {
            super(0);
            this.f62190d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62190d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$h */
    public static final class C23947h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62191d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62192e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23947h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62191d = aVar;
            this.f62192e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62191d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62192e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.a$i */
    public static final class C23948i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62193d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62194e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23948i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f62193d = fragment;
            this.f62194e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f62194e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f62193d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C23939a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C23945f(new C23944e(this)));
        this.f62184h = C1514j0.m5374c(this, C41520a0.m120436b(TransactionHistoryViewModel$ViewModel.class), new C23946g(a), new C23947h((C43064a) null, a), new C23948i(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m77248e() {
        m77257q1().f73372n.mo53597e();
    }

    private final void observeData() {
        m77258r1().mo60903rw().mo60899Si().mo4819k(getViewLifecycleOwner(), new C23943d(new C23942c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C28737l0 m77257q1() {
        C28737l0 l0Var = this.f62183g;
        C41536l.m120486f(l0Var);
        return l0Var;
    }

    /* renamed from: r1 */
    private final TransactionHistoryViewModel$ViewModel m77258r1() {
        return (TransactionHistoryViewModel$ViewModel) this.f62184h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m77259s1(C23939a aVar) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m77258r1().onRefresh(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m77260t1(C23939a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        C28199e.f71540Q.mo67720a(aVar.m77258r1().mo60901pw()).mo4576A1(aVar.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m77261u1(C23939a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        C23966b.f62235R.mo60938c().mo4576A1(aVar.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m77262v1(Throwable th) {
        m77257q1().f73372n.mo53596d();
        handleError(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m77263x1(List list) {
        m77257q1().f73370l.setRefreshing(false);
        if (list.isEmpty()) {
            m77257q1().f73372n.mo53598f();
            if (m77258r1().mo60903rw().mo60900is()) {
                m77257q1().f73368j.setText(C32343x.m95388F("text.gt.no_data_with_filter", new Object[0]));
            } else {
                m77257q1().f73368j.setText(getString(m77258r1().mo60902qw()));
            }
        } else {
            m77257q1().f73372n.mo53595c();
            this.f62185i.mo66846h(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m77264y1(C28384f fVar) {
        GTTransactionDetailActivity.C23951a aVar = GTTransactionDetailActivity.f62199J;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo60918a(requireContext, fVar.mo68011g());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62183g = C28737l0.m88074d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m77257q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62183g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m77257q1().f73369k.setAdapter(this.f62185i);
        m77257q1().f73370l.setOnRefreshListener(new C26993a(this));
        m77257q1().f73365g.setOnClickListener(new C26994b(this));
        m77257q1().f73363e.setOnClickListener(new C26995c(this));
    }

    /* renamed from: p */
    public void mo60912p(TransactionsFilterData transactionsFilterData) {
        C41536l.m120489i(transactionsFilterData, "filterData");
        m77258r1().mo60905tw(transactionsFilterData);
    }
}
