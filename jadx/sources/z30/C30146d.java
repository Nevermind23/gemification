package z30;

import a40.C19167a;
import a40.C19168b;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import d50.C19909b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.NoDataView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.FilterActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.Filter;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import r40.C27917c;
import t40.C28304a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import y30.C29903a;
import z30.C30181g;

/* renamed from: z30.d */
public final class C30146d extends C35651n1 implements C21507e {

    /* renamed from: u */
    public static final C30147a f76007u = new C30147a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f76008d = C41219i.m119470b(new C30173z(this));

    /* renamed from: e */
    private final C41217g f76009e = C41219i.m119470b(new C30166s(this));

    /* renamed from: f */
    private final C41217g f76010f = C41219i.m119470b(new C30150c(this));

    /* renamed from: g */
    private final C41217g f76011g = C41219i.m119470b(new C30157j(this));

    /* renamed from: h */
    private final Handler f76012h = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f76013i = true;

    /* renamed from: j */
    private final C41217g f76014j;

    /* renamed from: k */
    private C30148b f76015k;

    /* renamed from: l */
    private boolean f76016l;

    /* renamed from: m */
    private C19168b f76017m;

    /* renamed from: n */
    private final C29903a f76018n;

    /* renamed from: o */
    private final List f76019o;

    /* renamed from: p */
    private boolean f76020p;

    /* renamed from: q */
    private boolean f76021q;

    /* renamed from: r */
    private boolean f76022r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public SwipeRefreshLayout.C1862j f76023s;

    /* renamed from: t */
    private final Runnable f76024t;

    /* renamed from: z30.d$a */
    public static final class C30147a {
        private C30147a() {
        }

        public /* synthetic */ C30147a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C30146d mo70511a() {
            return new C30146d();
        }

        /* renamed from: b */
        public final C30146d mo70512b(FilterValue.Calendar calendar, FilterValue.MultiSelect multiSelect, FilterValue.SingleSelect singleSelect) {
            C30146d dVar = new C30146d();
            Bundle bundle = new Bundle();
            bundle.putParcelable("FILTER_CALENDAR", calendar);
            bundle.putParcelable("FILTER_ACCOUNTS", multiSelect);
            bundle.putParcelable("FILTER_CATEGORY", singleSelect);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* renamed from: z30.d$b */
    public enum C30148b {
        EXPENSES(0),
        INCOME(1);
        

        /* renamed from: e */
        public static final C30149a f76025e = null;

        /* renamed from: d */
        private final int f76029d;

        /* renamed from: z30.d$b$a */
        public static final class C30149a {
            private C30149a() {
            }

            public /* synthetic */ C30149a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C30148b mo70514a(int i) {
                for (C30148b bVar : C30148b.values()) {
                    if (bVar.mo70513b() == i) {
                        return bVar;
                    }
                }
                return null;
            }
        }

        static {
            f76025e = new C30149a((DefaultConstructorMarker) null);
        }

        private C30148b(int i) {
            this.f76029d = i;
        }

        /* renamed from: b */
        public final int mo70513b() {
            return this.f76029d;
        }
    }

    /* renamed from: z30.d$c */
    static final class C30150c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30146d f76030d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30150c(C30146d dVar) {
            super(0);
            this.f76030d = dVar;
        }

        /* renamed from: b */
        public final ExtendedFloatingActionButton invoke() {
            return (ExtendedFloatingActionButton) this.f76030d.findView(C10322k.filterFab);
        }
    }

    /* renamed from: z30.d$d */
    static final class C30151d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30146d f76031d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30151d(C30146d dVar) {
            super(1);
            this.f76031d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m91247c(C30146d dVar, C30148b bVar) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(bVar, "$it");
            dVar.mo70508c2(bVar);
        }

        /* renamed from: b */
        public final void mo70516b(C30148b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f76031d.m91188J1().post(new C30174e(this.f76031d, bVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70516b((C30148b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$e */
    static final class C30152e extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C30146d f76032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30152e(C30146d dVar) {
            super(2);
            this.f76032d = dVar;
        }

        /* renamed from: a */
        public final void mo70517a(AnalysisChildModel analysisChildModel, boolean z) {
            C41536l.m120489i(analysisChildModel, "analysisChild");
            this.f76032d.m91199W1(analysisChildModel, z, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo70517a((AnalysisChildModel) obj, ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$f */
    /* synthetic */ class C30153f extends C41535k implements C43064a {
        C30153f(Object obj) {
            super(0, obj, C30146d.class, "resetFilter", "resetFilter()V", 0);
        }

        /* renamed from: b */
        public final void mo70518b() {
            ((C30146d) this.receiver).m91202d2();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo70518b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$g */
    static final class C30154g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30146d f76033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30154g(C30146d dVar) {
            super(0);
            this.f76033d = dVar;
        }

        public final void invoke() {
            C28304a aVar = C28304a.f71822a;
            C1505h requireActivity = this.f76033d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            aVar.mo67958a(requireActivity, C27917c.ANALYSIS);
        }
    }

    /* renamed from: z30.d$h */
    static final class C30155h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30146d f76034d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30155h(C30146d dVar) {
            super(1);
            this.f76034d = dVar;
        }

        /* renamed from: a */
        public final void mo70519a(FilterValue.Calendar calendar) {
            C41536l.m120489i(calendar, "it");
            this.f76034d.m91185C1().mo54815Vw(calendar);
            this.f76034d.m91185C1().mo54825zw(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70519a((FilterValue.Calendar) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$i */
    static final class C30156i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30146d f76035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30156i(C30146d dVar) {
            super(0);
            this.f76035d = dVar;
        }

        public final void invoke() {
            this.f76035d.f76023s.mo6203v();
        }
    }

    /* renamed from: z30.d$j */
    static final class C30157j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30146d f76036d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30157j(C30146d dVar) {
            super(0);
            this.f76036d = dVar;
        }

        /* renamed from: b */
        public final NoDataView invoke() {
            return (NoDataView) this.f76036d.findView(C10322k.noDataView);
        }
    }

    /* renamed from: z30.d$k */
    /* synthetic */ class C30158k extends C41535k implements C43075l {
        C30158k(Object obj) {
            super(1, obj, C30146d.class, "onAnalysisSuccess", "onAnalysisSuccess(Lge/bog/mobilebank/cleanarch/presentation/pfm/analysis/model/AnalysisModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo70521b(C19168b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C30146d) this.receiver).m91194Q1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70521b((C19168b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$l */
    /* synthetic */ class C30159l extends C41535k implements C43075l {
        C30159l(Object obj) {
            super(1, obj, C30146d.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo70522b(boolean z) {
            ((C30146d) this.receiver).m91200Y1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70522b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$m */
    /* synthetic */ class C30160m extends C41535k implements C43075l {
        C30160m(Object obj) {
            super(1, obj, C30146d.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo70523b(C21503d.C21504a aVar) {
            ((C30146d) this.receiver).handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70523b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$n */
    /* synthetic */ class C30161n implements C1645y, C41532h {
        C30161n() {
        }

        /* renamed from: a */
        public final void onChanged(C19909b bVar) {
            C41536l.m120489i(bVar, "p0");
            C30146d.this.m91198V1(bVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(1, C30146d.this, C30146d.class, "onCategoryChanged", "onCategoryChanged(Lge/bog/mobilebank/cleanarch/presentation/pfm/transactioncategories/model/TransactionPropertyUpdateEventType;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: z30.d$o */
    /* synthetic */ class C30162o implements C1645y, C41532h {
        C30162o() {
        }

        /* renamed from: a */
        public final void onChanged(C19909b bVar) {
            C41536l.m120489i(bVar, "p0");
            C30146d.this.m91195R1(bVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(1, C30146d.this, C30146d.class, "onAnalyticsUpdated", "onAnalyticsUpdated(Lge/bog/mobilebank/cleanarch/presentation/pfm/transactioncategories/model/TransactionPropertyUpdateEventType;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: z30.d$p */
    /* synthetic */ class C30163p extends C41535k implements C43075l {
        C30163p(Object obj) {
            super(1, obj, C30146d.class, "onBudgetingPercentageResponse", "onBudgetingPercentageResponse(I)V", 0);
        }

        /* renamed from: b */
        public final void mo70530b(int i) {
            ((C30146d) this.receiver).m91197U1(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70530b(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$q */
    /* synthetic */ class C30164q extends C41535k implements C43075l {
        C30164q(Object obj) {
            super(1, obj, C30146d.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo70531b(boolean z) {
            ((C30146d) this.receiver).m91200Y1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70531b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$r */
    /* synthetic */ class C30165r extends C41535k implements C43075l {
        C30165r(Object obj) {
            super(1, obj, C30146d.class, "onBudgetingPercentageError", "onBudgetingPercentageError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo70532b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C30146d) this.receiver).m91196T1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70532b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.d$s */
    static final class C30166s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30146d f76039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30166s(C30146d dVar) {
            super(0);
            this.f76039d = dVar;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f76039d.findView(C10322k.f28709Ar);
        }
    }

    /* renamed from: z30.d$t */
    public static final class C30167t extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ C30146d f76040a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f76041b;

        /* renamed from: c */
        final /* synthetic */ LinearLayoutManager f76042c;

        C30167t(C30146d dVar, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
            this.f76040a = dVar;
            this.f76041b = recyclerView;
            this.f76042c = linearLayoutManager;
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5740e(recyclerView, i, i2);
            if (i2 > 0 && !this.f76040a.m91186H1().mo16313D() && this.f76040a.f76013i) {
                this.f76041b.getHandler().removeCallbacks(this.f76040a.mo70502G1());
                this.f76040a.m91186H1().mo16311B();
                this.f76041b.getHandler().postDelayed(this.f76040a.mo70502G1(), 1000);
                this.f76040a.f76013i = false;
            }
            if (this.f76042c.mo5215j2() == 0 && this.f76042c.mo5686k0() > 2) {
                this.f76040a.f76013i = true;
            }
            if (this.f76042c.mo5215j2() != 0 && this.f76042c.mo5221o2() == this.f76042c.mo5686k0() - 1 && this.f76042c.mo5686k0() > 2) {
                this.f76041b.getHandler().removeCallbacks(this.f76040a.mo70502G1());
                this.f76040a.m91186H1().mo16312C();
                this.f76040a.m91186H1().mo16315K();
            } else if (!this.f76040a.m91186H1().isShown()) {
                this.f76040a.m91186H1().mo16314J();
            }
        }
    }

    /* renamed from: z30.d$u */
    public static final class C30168u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f76043d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30168u(Fragment fragment) {
            super(0);
            this.f76043d = fragment;
        }

        public final Fragment invoke() {
            return this.f76043d;
        }
    }

    /* renamed from: z30.d$v */
    public static final class C30169v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f76044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30169v(C43064a aVar) {
            super(0);
            this.f76044d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f76044d.invoke();
        }
    }

    /* renamed from: z30.d$w */
    public static final class C30170w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f76045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30170w(C41217g gVar) {
            super(0);
            this.f76045d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f76045d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: z30.d$x */
    public static final class C30171x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f76046d;

        /* renamed from: e */
        final /* synthetic */ C41217g f76047e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30171x(C43064a aVar, C41217g gVar) {
            super(0);
            this.f76046d = aVar;
            this.f76047e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f76046d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f76047e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: z30.d$y */
    public static final class C30172y extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f76048d;

        /* renamed from: e */
        final /* synthetic */ C41217g f76049e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30172y(Fragment fragment, C41217g gVar) {
            super(0);
            this.f76048d = fragment;
            this.f76049e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f76049e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f76048d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: z30.d$z */
    static final class C30173z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30146d f76050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30173z(C30146d dVar) {
            super(0);
            this.f76050d = dVar;
        }

        /* renamed from: b */
        public final BogSwipeRefreshLayout invoke() {
            return (BogSwipeRefreshLayout) this.f76050d.findView(C10322k.swipeToRefresh);
        }
    }

    public C30146d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C30169v(new C30168u(this)));
        this.f76014j = C1514j0.m5374c(this, C41520a0.m120436b(AnalysisViewModel.class), new C30170w(a), new C30171x((C43064a) null, a), new C30172y(this, a));
        this.f76015k = C30148b.EXPENSES;
        this.f76018n = new C29903a();
        this.f76019o = C41341q.m119910m("expenses", "incomes");
        this.f76020p = true;
        this.f76021q = true;
        this.f76023s = new C30144b(this);
        this.f76024t = new C30145c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m91184B1(C30146d dVar) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m91186H1().mo16315K();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final AnalysisViewModel m91185C1() {
        return (AnalysisViewModel) this.f76014j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final ExtendedFloatingActionButton m91186H1() {
        Object value = this.f76010f.getValue();
        C41536l.m120488h(value, "<get-filterFab>(...)");
        return (ExtendedFloatingActionButton) value;
    }

    /* renamed from: I1 */
    private final NoDataView m91187I1() {
        Object value = this.f76011g.getValue();
        C41536l.m120488h(value, "<get-noDataView>(...)");
        return (NoDataView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final RecyclerView m91188J1() {
        Object value = this.f76009e.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: K1 */
    private final BogSwipeRefreshLayout m91189K1() {
        Object value = this.f76008d.getValue();
        C41536l.m120488h(value, "<get-swipeToRefresh>(...)");
        return (BogSwipeRefreshLayout) value;
    }

    /* renamed from: L1 */
    private final void m91190L1() {
        C19167a a;
        List a2;
        AnalysisChildModel analysisChildModel;
        Object obj;
        boolean z;
        if (m91185C1().mo54808Ow() != null) {
            FilterValue.SingleSelect Ow = m91185C1().mo54808Ow();
            if (Ow != null) {
                long a3 = Ow.mo53836a();
                C19168b bVar = this.f76017m;
                if (bVar != null && (a = bVar.mo47397a()) != null && (a2 = a.mo47392a()) != null) {
                    Iterator it = a2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AnalysisChildModel analysisChildModel2 = (AnalysisChildModel) it.next();
                        if (analysisChildModel2.mo54781f() != a3) {
                            List d = analysisChildModel2.mo54777d();
                            if (d != null) {
                                Iterator it2 = d.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (((AnalysisChildModel) obj).mo54781f() == a3) {
                                        z = true;
                                        continue;
                                    } else {
                                        z = false;
                                        continue;
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                                analysisChildModel = (AnalysisChildModel) obj;
                                continue;
                            } else {
                                analysisChildModel = null;
                                continue;
                            }
                            if (analysisChildModel != null) {
                                mo70507b2(analysisChildModel2, analysisChildModel.mo54781f(), false, false);
                                this.f76020p = false;
                                this.f76021q = false;
                                this.f76022r = false;
                                break;
                            }
                        } else {
                            m91199W1(analysisChildModel2, false, false);
                            this.f76020p = false;
                            this.f76021q = true;
                            this.f76022r = false;
                            break;
                        }
                    }
                }
                m91185C1().mo54816Ww((FilterValue.SingleSelect) null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: N1 */
    private final void m91191N1() {
        m91186H1().mo16315K();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        m91188J1().setLayoutManager(linearLayoutManager);
        m91188J1().setHasFixedSize(true);
        m91188J1().setAdapter(this.f76018n);
        m91205h2(m91188J1(), linearLayoutManager);
        this.f76018n.mo70187R(new C30151d(this));
        this.f76018n.mo70184O(new C30152e(this));
        this.f76018n.mo70186Q(new C30153f(this));
        this.f76018n.mo70185P(new C30154g(this));
        this.f76018n.mo70183N(new C30155h(this));
        m91187I1().mo53658d(new C30156i(this));
        m91189K1().setOnRefreshListener(this.f76023s);
        m91186H1().setOnClickListener(new C30143a(this));
        if (m91185C1().mo54808Ow() != null) {
            this.f76018n.mo70190U(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m91192O1(C30146d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C36546y.m108282F().mo27152s("pfm_analysis", "", "open_filter");
        FilterActivity.C21508a aVar = FilterActivity.f57491O;
        C1505h requireActivity = dVar.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        aVar.mo53714a(dVar, requireActivity, dVar.m91204g2(), "pfm_analysis");
    }

    /* renamed from: P1 */
    private final boolean m91193P1() {
        return getChildFragmentManager().mo4432r0() == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final void m91194Q1(C19168b bVar) {
        this.f76017m = bVar;
        mo70508c2(this.f76015k);
        m91187I1().setVisibility(8);
        m91190L1();
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public final void m91195R1(C19909b bVar) {
        this.f76023s.mo6203v();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final void m91196T1(C21503d.C21504a aVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m91197U1(int i) {
        this.f76018n.mo70188S(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m91198V1(C19909b bVar) {
        this.f76023s.mo6203v();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public final void m91199W1(AnalysisChildModel analysisChildModel, boolean z, boolean z2) {
        List a;
        String str;
        if (z2) {
            C10463g F = C36546y.m108282F();
            String valueOf = String.valueOf(analysisChildModel.mo54781f());
            if (z) {
                str = "select_category_on_pie_chart";
            } else {
                str = "select_category_in_list";
            }
            F.mo27152s("pfm_analysis", valueOf, str);
        }
        if (analysisChildModel.mo54777d() == null || analysisChildModel.mo54777d().isEmpty()) {
            C19167a aVar = null;
            if (this.f76015k == C30148b.EXPENSES) {
                C19168b bVar = this.f76017m;
                if (bVar != null) {
                    aVar = bVar.mo47397a();
                }
            } else {
                C19168b bVar2 = this.f76017m;
                if (bVar2 != null) {
                    aVar = bVar2.mo47398b();
                }
            }
            if (aVar != null && (a = aVar.mo47392a()) != null) {
                m91208j2(new AnalysisChildModel(a, analysisChildModel.mo54779e(), analysisChildModel.mo54781f(), analysisChildModel.mo54782g(), aVar.mo47393b()), analysisChildModel.mo54781f());
                return;
            }
            return;
        }
        m91210k2(analysisChildModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m91200Y1(boolean z) {
        m91186H1().setEnabled(!z);
        m91189K1().setRefreshing(z);
    }

    /* renamed from: a2 */
    private final void m91201a2() {
        if (m91185C1().mo54810Qw()) {
            m91202d2();
            m91185C1().mo54818Yw(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public final void m91202d2() {
        m91185C1().mo54812Sw();
    }

    /* renamed from: e2 */
    private final void m91203e2() {
        m91188J1().mo5425x1(0);
    }

    /* renamed from: g2 */
    private final ArrayList m91204g2() {
        return C41341q.m119903f(new Filter.CalendarFilterModel("FILTER_CALENDAR", getString(C10328q.operation_details_title_date), m91185C1().mo54806Mw(), m91185C1().mo54805Lw()), new Filter.AccountsSelectModel("FILTER_ACCOUNTS", getString(C10328q.f28938S4), m91185C1().mo54824yw(), m91185C1().mo54823xw(), m91185C1().mo54821bx()));
    }

    /* renamed from: h2 */
    private final void m91205h2(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        recyclerView.mo5363n(new C30167t(this, recyclerView, linearLayoutManager));
    }

    /* renamed from: j2 */
    private final void m91208j2(AnalysisChildModel analysisChildModel, long j) {
        C30181g.C30182a aVar = C30181g.f76063m;
        FilterValue.Calendar Mw = m91185C1().mo54806Mw();
        long d = m91185C1().mo54806Mw().mo53804d();
        Long a = m91185C1().mo54806Mw().mo53802a();
        C41536l.m120486f(a);
        getChildFragmentManager().mo4428p().mo4631b(C10322k.fragmentContainer, aVar.mo70539a(analysisChildModel, j, Mw, d, a.longValue(), m91185C1().mo54820ax())).mo4636g((String) null).mo4515i();
        m91203e2();
    }

    /* renamed from: k2 */
    private final void m91210k2(AnalysisChildModel analysisChildModel) {
        getChildFragmentManager().mo4428p().mo4631b(C10322k.fragmentContainer, C30175f.f76053h.mo70536a(analysisChildModel, m91185C1().mo54806Mw())).mo4636g((String) null).mo4515i();
        m91203e2();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m91212l2(C30146d dVar) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m91185C1().mo54825zw(true);
        dVar.m91185C1().mo54822uw();
        dVar.m91185C1().mo54803Fw();
    }

    /* renamed from: D1 */
    public final boolean mo70499D1() {
        return this.f76020p;
    }

    /* renamed from: E1 */
    public final boolean mo70500E1() {
        return this.f76021q;
    }

    /* renamed from: F1 */
    public final boolean mo70501F1() {
        return this.f76022r;
    }

    /* renamed from: G1 */
    public final Runnable mo70502G1() {
        return this.f76024t;
    }

    /* renamed from: M1 */
    public final void mo70503M1() {
        if (m91193P1()) {
            m91201a2();
        }
    }

    /* renamed from: S1 */
    public final void mo70504S1() {
        if (getChildFragmentManager().mo4432r0() > 0) {
            getChildFragmentManager().mo4409g1();
            mo70503M1();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$SingleSelect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: X1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70505X1(java.util.HashMap r5) {
        /*
            r4 = this;
            java.lang.String r0 = "filtersMap"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "FILTER_CALENDAR"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r1 = "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.Calendar"
            kotlin.jvm.internal.C41536l.m120487g(r0, r1)
            ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$Calendar r0 = (p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.Calendar) r0
            java.lang.String r1 = "FILTER_ACCOUNTS"
            java.lang.Object r1 = r5.get(r1)
            boolean r2 = r1 instanceof p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.MultiSelect
            r3 = 0
            if (r2 == 0) goto L_0x0020
            ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$MultiSelect r1 = (p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.MultiSelect) r1
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            java.lang.String r2 = "FILTER_CATEGORY"
            java.lang.Object r5 = r5.get(r2)
            boolean r2 = r5 instanceof p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.SingleSelect
            if (r2 == 0) goto L_0x002e
            r3 = r5
            ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$SingleSelect r3 = (p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.SingleSelect) r3
        L_0x002e:
            ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel r5 = r4.m91185C1()
            r5.mo54815Vw(r0)
            if (r1 == 0) goto L_0x003e
            ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel r5 = r4.m91185C1()
            r5.mo54814Uw(r1)
        L_0x003e:
            if (r3 == 0) goto L_0x0047
            ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel r5 = r4.m91185C1()
            r5.mo54816Ww(r3)
        L_0x0047:
            ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel r5 = r4.m91185C1()
            r0 = 1
            r5.mo54825zw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z30.C30146d.mo70505X1(java.util.HashMap):void");
    }

    /* renamed from: Z1 */
    public final void mo70506Z1(AccountOperation accountOperation) {
        C41536l.m120489i(accountOperation, "item");
        m91185C1().mo54818Yw(true);
    }

    /* renamed from: b2 */
    public final void mo70507b2(AnalysisChildModel analysisChildModel, long j, boolean z, boolean z2) {
        String str;
        C41536l.m120489i(analysisChildModel, "parentCategory");
        if (z2) {
            C10463g F = C36546y.m108282F();
            String valueOf = String.valueOf(j);
            if (z) {
                str = "select_subcategory_on_pie_chart";
            } else {
                str = "select_subcategory_in_list";
            }
            F.mo27152s("pfm_analysis", valueOf, str);
        }
        m91208j2(analysisChildModel, j);
    }

    /* renamed from: b3 */
    public void mo41971b3() {
        this.f76016l = true;
        getChildFragmentManager().mo4413i1((String) null, 1);
        if (m91185C1().mo54811Rw()) {
            m91202d2();
        }
    }

    /* renamed from: c2 */
    public final void mo70508c2(C30148b bVar) {
        boolean z;
        C19167a b;
        C19167a a;
        C41536l.m120489i(bVar, "tabType");
        this.f76015k = bVar;
        C36546y.m108282F().mo27152s("pfm_analysis", (String) this.f76019o.get(this.f76015k.mo70513b()), "select_tab");
        if (!m91185C1().mo54811Rw() || !m91185C1().mo54809Pw()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (bVar == C30148b.EXPENSES) {
            C19168b bVar2 = this.f76017m;
            if (bVar2 != null && (a = bVar2.mo47397a()) != null) {
                C29903a aVar = this.f76018n;
                String string = getString(C10328q.expenses);
                C41536l.m120488h(string, "getString(R.string.expenses)");
                aVar.mo70181K(string, a, m91185C1().mo54806Mw(), true, z2);
                return;
            }
            return;
        }
        C19168b bVar3 = this.f76017m;
        if (bVar3 != null && (b = bVar3.mo47398b()) != null) {
            C29903a aVar2 = this.f76018n;
            String string2 = getString(C10328q.income);
            C41536l.m120488h(string2, "getString(R.string.income)");
            aVar2.mo70181K(string2, b, m91185C1().mo54806Mw(), false, z2);
        }
    }

    /* renamed from: d3 */
    public void mo41972d3() {
        this.f76016l = false;
    }

    /* renamed from: f2 */
    public final void mo70509f2(C30148b bVar) {
        C41536l.m120489i(bVar, "tabType");
        this.f76018n.mo70189T(bVar);
    }

    public void handleError(C21503d.C21504a aVar) {
        if (this.f76016l) {
            super.handleError(aVar);
        }
        m91187I1().setVisibility(0);
    }

    /* renamed from: i2 */
    public final void mo70510i2(boolean z) {
        this.f76018n.mo70190U(z);
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_analysis;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializable;
        super.onActivityResult(i, i2, intent);
        if (i == 10025 && i2 == -1) {
            if (intent != null) {
                serializable = intent.getSerializableExtra("FILTER_COLLECTED_VALUES");
            } else {
                serializable = null;
            }
            C41536l.m120487g(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue> }");
            mo70505X1((HashMap) serializable);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f76012h.removeCallbacks(this.f76024t);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            FilterValue.Calendar calendar = (FilterValue.Calendar) arguments.getParcelable("FILTER_CALENDAR");
            if (calendar != null) {
                AnalysisViewModel C1 = m91185C1();
                C41536l.m120488h(calendar, "it");
                C1.mo54815Vw(calendar);
            }
            FilterValue.MultiSelect multiSelect = (FilterValue.MultiSelect) arguments.getParcelable("FILTER_ACCOUNTS");
            if (multiSelect != null) {
                AnalysisViewModel C12 = m91185C1();
                C41536l.m120488h(multiSelect, "it");
                C12.mo54814Uw(multiSelect);
            }
            FilterValue.SingleSelect singleSelect = (FilterValue.SingleSelect) arguments.getParcelable("FILTER_CATEGORY");
            if (singleSelect != null) {
                m91185C1().mo54816Ww(singleSelect);
            }
        }
        C1644x Dw = m91185C1().mo54801Dw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C21484c.m69411c(Dw, viewLifecycleOwner, new C30158k(this), new C30159l(this), new C30160m(this));
        m91185C1().mo54807Nw().mo4819k(getViewLifecycleOwner(), new C30161n());
        m91185C1().mo54802Ew().mo4819k(getViewLifecycleOwner(), new C30162o());
        LiveData Kw = m91185C1().mo54804Kw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C21484c.m69411c(Kw, viewLifecycleOwner2, new C30163p(this), new C30164q(this), new C30165r(this));
        m91191N1();
        m91185C1().mo54822uw();
        m91185C1().mo54825zw(false);
        m91185C1().mo54803Fw();
    }
}
