package y11;

import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b31.C31118g;
import b41.C31128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.shared.accountselector.presentation.C34628e;
import p341ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;
import z11.C40139a;

/* renamed from: y11.d */
public final class C39992d extends C34628e {

    /* renamed from: Q */
    public static final C39994b f94982Q = new C39994b((DefaultConstructorMarker) null);

    /* renamed from: K */
    private String f94983K = C32343x.m95388F("applications.deposits.fields.deposit.source.acc", new Object[0]);

    /* renamed from: L */
    private int f94984L = C18368l.m62762k(TextTypeView.SEPARATOR_FULL);

    /* renamed from: M */
    private C31118g f94985M;

    /* renamed from: N */
    private final C41217g f94986N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C40012m f94987O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C39993a f94988P;

    /* renamed from: y11.d$a */
    public interface C39993a {
        /* renamed from: P */
        void mo57031P(TransferAccountItem transferAccountItem);
    }

    /* renamed from: y11.d$b */
    public static final class C39994b {
        private C39994b() {
        }

        public /* synthetic */ C39994b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39992d mo93826a(C40139a aVar, String str, Long l, C39989a aVar2) {
            C41536l.m120489i(aVar, "accountType");
            C41536l.m120489i(str, "mainCurrency");
            C39992d dVar = new C39992d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARGS_ACCOUNT_TYPE", aVar), C41233s.m119492a("ARGS_MAIN_CURRENCY", str), C41233s.m119492a("ARGS_SELECTED_ACCOUNT_ID", l), C41233s.m119492a("ARGS_ACCOUNT_FILTER", aVar2)));
            return dVar;
        }
    }

    /* renamed from: y11.d$c */
    static final class C39995c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39992d f94989d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39995c(C39992d dVar) {
            super(1);
            this.f94989d = dVar;
        }

        /* renamed from: a */
        public final void mo93827a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f94989d.m115928p2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f94989d.m115928p2(false);
                this.f94989d.f94987O.mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f94989d.m115928p2(false);
                CardView cardView = this.f94989d.m115923k2().f77340h;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f94989d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93827a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: y11.d$d */
    static final class C39996d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39992d f94990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39996d(C39992d dVar) {
            super(1);
            this.f94990d = dVar;
        }

        /* renamed from: a */
        public final void mo93828a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                C39992d dVar = this.f94990d;
                dVar.f94987O.mo93834o(l.longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93828a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: y11.d$e */
    static final class C39997e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39992d f94991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39997e(C39992d dVar) {
            super(1);
            this.f94991d = dVar;
        }

        /* renamed from: a */
        public final void mo93829a(TransferAccountItem transferAccountItem) {
            C39993a g2 = this.f94991d.f94988P;
            if (g2 != null) {
                C41536l.m120488h(transferAccountItem, "account");
                g2.mo57031P(transferAccountItem);
            }
            this.f94991d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93829a((TransferAccountItem) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: y11.d$f */
    static final class C39998f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f94992a;

        C39998f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f94992a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f94992a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f94992a.invoke(obj);
        }
    }

    /* renamed from: y11.d$g */
    public static final class C39999g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f94993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39999g(Fragment fragment) {
            super(0);
            this.f94993d = fragment;
        }

        public final Fragment invoke() {
            return this.f94993d;
        }
    }

    /* renamed from: y11.d$h */
    public static final class C40000h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f94994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40000h(C43064a aVar) {
            super(0);
            this.f94994d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f94994d.invoke();
        }
    }

    /* renamed from: y11.d$i */
    public static final class C40001i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f94995d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40001i(C41217g gVar) {
            super(0);
            this.f94995d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f94995d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: y11.d$j */
    public static final class C40002j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f94996d;

        /* renamed from: e */
        final /* synthetic */ C41217g f94997e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40002j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f94996d = aVar;
            this.f94997e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f94996d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f94997e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: y11.d$k */
    public static final class C40003k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f94998d;

        /* renamed from: e */
        final /* synthetic */ C41217g f94999e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40003k(Fragment fragment, C41217g gVar) {
            super(0);
            this.f94998d = fragment;
            this.f94999e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f94999e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f94998d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C39992d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C40000h(new C39999g(this)));
        this.f94986N = C1514j0.m5374c(this, C41520a0.m120436b(DomesticAccountSelectorActionSheetViewModel$ViewModel.class), new C40001i(a), new C40002j((C43064a) null, a), new C40003k(this, a));
        this.f94987O = new C40012m();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C31118g m115923k2() {
        C31118g gVar = this.f94985M;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: l2 */
    private final DomesticAccountSelectorActionSheetViewModel$ViewModel m115924l2() {
        return (DomesticAccountSelectorActionSheetViewModel$ViewModel) this.f94986N.getValue();
    }

    /* renamed from: m2 */
    private final void m115925m2() {
        m115924l2().mo84172vw().mo84168j0().mo4819k(this, new C39998f(new C39995c(this)));
        m115924l2().mo84172vw().mo84166ih().mo4819k(this, new C39998f(new C39996d(this)));
        m115924l2().mo84172vw().mo84165O1().mo4819k(this, new C39998f(new C39997e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m115926n2(C39992d dVar, long j) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m115924l2().mo84171uw().mo84173w8(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m115927o2(C39992d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C21481a.onRefresh$default(dVar.m115924l2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final void m115928p2(boolean z) {
        CardView cardView = m115923k2().f77340h;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        LoadingView loadingView = m115923k2().f77337e;
        C41536l.m120488h(loadingView, "binding.loadingView");
        C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
    }

    /* renamed from: P1 */
    public int mo26363P1() {
        return this.f94984L;
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f94983K;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26367T1(android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r5 = "container"
            kotlin.jvm.internal.C41536l.m120489i(r6, r5)
            android.view.LayoutInflater r5 = r4.getLayoutInflater()
            r0 = 1
            b31.g r5 = b31.C31118g.m92592d(r5, r6, r0)
            r4.f94985M = r5
            r4.m115925m2()
            b31.g r5 = r4.m115923k2()
            androidx.recyclerview.widget.RecyclerView r5 = r5.f77338f
            y11.m r6 = r4.f94987O
            r5.setAdapter(r6)
            y11.m r5 = r4.f94987O
            y11.b r6 = new y11.b
            r6.<init>(r4)
            r5.mo93835p(r6)
            b31.g r5 = r4.m115923k2()
            p90.z7 r5 = r5.f77339g
            android.widget.LinearLayout r5 = r5.mo3946b()
            y11.c r6 = new y11.c
            r6.<init>(r4)
            r5.setOnClickListener(r6)
            android.os.Bundle r5 = r4.requireArguments()
            java.lang.String r6 = "ARGS_ACCOUNT_TYPE"
            java.io.Serializable r6 = r5.getSerializable(r6)
            boolean r0 = r6 instanceof z11.C40139a
            r1 = 0
            if (r0 == 0) goto L_0x0051
            z11.a r6 = (z11.C40139a) r6
            goto L_0x0052
        L_0x0051:
            r6 = r1
        L_0x0052:
            if (r6 != 0) goto L_0x0058
            r4.mo4577k1()
            return
        L_0x0058:
            java.lang.String r0 = "ARGS_MAIN_CURRENCY"
            java.lang.String r0 = r5.getString(r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "GEL"
        L_0x0062:
            java.lang.String r2 = "getString(ARGS_MAIN_CURRENCY) ?: Consts.GEL"
            kotlin.jvm.internal.C41536l.m120488h(r0, r2)
            java.lang.String r2 = "ARGS_ACCOUNT_FILTER"
            java.io.Serializable r2 = r5.getSerializable(r2)
            boolean r3 = r2 instanceof y11.C39989a
            if (r3 == 0) goto L_0x0074
            r1 = r2
            y11.a r1 = (y11.C39989a) r1
        L_0x0074:
            java.lang.String r2 = "ARGS_SELECTED_ACCOUNT_ID"
            long r2 = r5.getLong(r2)
            ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel r5 = r4.m115924l2()
            y11.e r5 = r5.mo84171uw()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.mo84167im(r6, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y11.C39992d.mo26367T1(android.view.LayoutInflater, android.view.ViewGroup):void");
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof C39993a) {
            Fragment parentFragment = getParentFragment();
            C41536l.m120487g(parentFragment, "null cannot be cast to non-null type ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheet.AccountSelectionListener");
            this.f94988P = (C39993a) parentFragment;
        } else if (context instanceof C39993a) {
            this.f94988P = (C39993a) context;
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f94985M = null;
    }

    public void onDetach() {
        this.f94988P = null;
        super.onDetach();
    }
}
