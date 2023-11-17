package t51;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o51.C37649f;
import org.parceler.C42035e;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity;
import p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager;
import p341ge.bog.mobilebank.statements.presentation.OperationFilter;
import p341ge.bog.mobilebank.statements.presentation.landing.StatementsViewModel$ViewModel;
import p341ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity;
import q31.C38122f;
import q31.C38125h;
import r51.C38286b;
import t51.C38660f;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: t51.x */
public final class C38686x extends C38668i {

    /* renamed from: o */
    public static final C38687a f92575o = new C38687a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C37649f f92576i;

    /* renamed from: j */
    private final C41217g f92577j = C1514j0.m5374c(this, C41520a0.m120436b(StatementsViewModel$ViewModel.class), new C38698l(this), new C38699m((C43064a) null, this), new C38700n(this));

    /* renamed from: k */
    private C38672m f92578k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public OperationFilter f92579l;

    /* renamed from: m */
    private final C0173b f92580m;

    /* renamed from: n */
    private final C38696j f92581n;

    /* renamed from: t51.x$a */
    public static final class C38687a {
        private C38687a() {
        }

        public /* synthetic */ C38687a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38686x mo92336a(Long l) {
            C38686x xVar = new C38686x();
            xVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_ACCT_KEY", l)));
            return xVar;
        }
    }

    /* renamed from: t51.x$b */
    static final class C38688b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38686x f92582d;

        /* renamed from: e */
        final /* synthetic */ C37649f f92583e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38688b(C38686x xVar, C37649f fVar) {
            super(1);
            this.f92582d = xVar;
            this.f92583e = fVar;
        }

        /* renamed from: a */
        public final void mo92337a(String str) {
            boolean z;
            C41536l.m120489i(str, "it");
            this.f92582d.m113358L1().mo84829yw().mo84818Y1(str);
            LinearLayout linearLayout = this.f92583e.f90480k;
            C41536l.m120488h(linearLayout, "filters");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(linearLayout, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92337a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: t51.x$c */
    static final class C38689c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38686x f92584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38689c(C38686x xVar) {
            super(1);
            this.f92584d = xVar;
        }

        /* renamed from: a */
        public final void mo92338a(List list) {
            C38686x xVar = this.f92584d;
            C41536l.m120488h(list, "it");
            xVar.m113360N1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92338a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: t51.x$d */
    static final class C38690d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38686x f92585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38690d(C38686x xVar) {
            super(1);
            this.f92585d = xVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C38686x xVar = this.f92585d;
            C41536l.m120488h(th, "it");
            xVar.m113359M1(th);
        }
    }

    /* renamed from: t51.x$e */
    static final class C38691e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38686x f92586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38691e(C38686x xVar) {
            super(1);
            this.f92586d = xVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            SwipeRefreshLayout swipeRefreshLayout = this.f92586d.m113357K1().f90486q;
            C41536l.m120488h(bool, "isLoading");
            swipeRefreshLayout.setRefreshing(bool.booleanValue());
        }
    }

    /* renamed from: t51.x$f */
    static final class C38692f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38686x f92587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38692f(C38686x xVar) {
            super(1);
            this.f92587d = xVar;
        }

        /* renamed from: a */
        public final void mo92341a(C41224m mVar) {
            this.f92587d.m113357K1().f90484o.setBottomTitle(C32303f.m95203n(((BigDecimal) mVar.mo95675a()).abs(), "GEL"));
            this.f92587d.m113357K1().f90482m.setBottomTitle(C32303f.m95203n(((BigDecimal) mVar.mo95676b()).abs(), "GEL"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92341a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: t51.x$g */
    static final class C38693g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38686x f92588d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38693g(C38686x xVar) {
            super(1);
            this.f92588d = xVar;
        }

        /* renamed from: a */
        public final void mo92342a(C41232r rVar) {
            long longValue = ((Number) rVar.mo95688a()).longValue();
            long longValue2 = ((Number) rVar.mo95689b()).longValue();
            Integer num = (Integer) rVar.mo95690c();
            C38686x xVar = this.f92588d;
            OperationFilter s1 = this.f92588d.f92579l;
            OperationFilter operationFilter = null;
            if (s1 == null) {
                C41536l.m120506z("filterParameters");
                s1 = null;
            }
            List a = s1.mo84790a();
            OperationFilter s12 = this.f92588d.f92579l;
            if (s12 == null) {
                C41536l.m120506z("filterParameters");
                s12 = null;
            }
            List b = s12.mo84791b();
            OperationFilter s13 = this.f92588d.f92579l;
            if (s13 == null) {
                C41536l.m120506z("filterParameters");
                s13 = null;
            }
            List d = s13.mo84792d();
            OperationFilter s14 = this.f92588d.f92579l;
            if (s14 == null) {
                C41536l.m120506z("filterParameters");
                s14 = null;
            }
            String k = s14.mo84802k();
            OperationFilter s15 = this.f92588d.f92579l;
            if (s15 == null) {
                C41536l.m120506z("filterParameters");
                s15 = null;
            }
            BigDecimal i = s15.mo84800i();
            OperationFilter s16 = this.f92588d.f92579l;
            if (s16 == null) {
                C41536l.m120506z("filterParameters");
                s16 = null;
            }
            BigDecimal h = s16.mo84798h();
            OperationFilter s17 = this.f92588d.f92579l;
            if (s17 == null) {
                C41536l.m120506z("filterParameters");
                s17 = null;
            }
            List e = s17.mo84794e();
            OperationFilter s18 = this.f92588d.f92579l;
            if (s18 == null) {
                C41536l.m120506z("filterParameters");
            } else {
                operationFilter = s18;
            }
            OperationFilter operationFilter2 = r2;
            OperationFilter operationFilter3 = new OperationFilter(longValue, longValue2, a, b, d, k, i, h, e, num, operationFilter.mo84797g());
            xVar.f92579l = operationFilter2;
            this.f92588d.m113357K1().f90474e.setStartTimestamp(longValue);
            this.f92588d.m113357K1().f90474e.setEndTimestamp(longValue2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92342a((C41232r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: t51.x$h */
    static final class C38694h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38686x f92589d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38694h(C38686x xVar) {
            super(1);
            this.f92589d = xVar;
        }

        /* renamed from: a */
        public final void mo92343a(Integer num) {
            boolean z;
            NotificationBadgeView notificationBadgeView = this.f92589d.m113357K1().f90478i;
            C41536l.m120488h(notificationBadgeView, "binding.filterBadge");
            C41536l.m120488h(num, "it");
            boolean z2 = true;
            if (num.intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(notificationBadgeView, z, false, 2, (Object) null);
            this.f92589d.m113357K1().f90478i.setBadge(new NotificationBadgeView.BadgeType.Number(num.intValue()));
            Button button = this.f92589d.m113357K1().f90475f;
            C41536l.m120488h(button, "binding.deleteButton");
            if (num.intValue() <= 0) {
                z2 = false;
            }
            C32343x.m95483r1(button, z2, false, 2, (Object) null);
            if (num.intValue() == 0) {
                C38686x xVar = this.f92589d;
                xVar.f92579l = xVar.m113358L1().mo84826ww();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92343a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: t51.x$i */
    /* synthetic */ class C38695i extends C41535k implements C43075l {
        C38695i(Object obj) {
            super(1, obj, C38686x.class, "statementClicked", "statementClicked(Lge/bog/mobilebank/model/account/AccountOperation;)V", 0);
        }

        /* renamed from: b */
        public final void mo92344b(AccountOperation accountOperation) {
            C41536l.m120489i(accountOperation, "p0");
            ((C38686x) this.receiver).m113362P1(accountOperation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92344b((AccountOperation) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: t51.x$j */
    public static final class C38696j extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ C38686x f92590a;

        C38696j(C38686x xVar) {
            this.f92590a = xVar;
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5739d(recyclerView, i);
            if (!recyclerView.canScrollVertically(1) && i == 0) {
                this.f92590a.m113358L1().mo84829yw().mo84822o1();
            }
        }
    }

    /* renamed from: t51.x$k */
    static final class C38697k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f92591a;

        C38697k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f92591a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f92591a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f92591a.invoke(obj);
        }
    }

    /* renamed from: t51.x$l */
    public static final class C38698l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38698l(Fragment fragment) {
            super(0);
            this.f92592d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f92592d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: t51.x$m */
    public static final class C38699m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f92593d;

        /* renamed from: e */
        final /* synthetic */ Fragment f92594e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38699m(C43064a aVar, Fragment fragment) {
            super(0);
            this.f92593d = aVar;
            this.f92594e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f92593d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f92594e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: t51.x$n */
    public static final class C38700n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38700n(Fragment fragment) {
            super(0);
            this.f92595d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f92595d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public C38686x() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C38685w(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…lterParameters)\n        }");
        this.f92580m = registerForActivityResult;
        this.f92581n = new C38696j(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m113347A1(C37649f fVar, C38686x xVar, View view) {
        C41536l.m120489i(fVar, "$this_with");
        C41536l.m120489i(xVar, "this$0");
        TextGroupView textGroupView = fVar.f90484o;
        C41536l.m120488h(textGroupView, "positiveButton");
        C32343x.m95474o1(textGroupView);
        if (fVar.f90484o.mo36844a() && fVar.f90482m.mo36844a()) {
            TextGroupView textGroupView2 = fVar.f90482m;
            C41536l.m120488h(textGroupView2, "negativeButton");
            C32343x.m95474o1(textGroupView2);
        }
        xVar.m113358L1().mo84829yw().mo84817U5(fVar.f90484o.mo36844a(), fVar.f90482m.mo36844a());
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m113348B1(C38686x xVar) {
        C41536l.m120489i(xVar, "this$0");
        xVar.m113358L1().mo84829yw().mo84819c();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m113349C1(C38686x xVar, String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        C41536l.m120489i(xVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle2, "bundle");
        C38286b bVar = C38286b.f91793a;
        long j = bundle2.getLong("PARAM_KEY_START_DATE", bVar.mo91843f(1));
        long j2 = bundle2.getLong("PARAM_KEY_END_DATE", bVar.mo91840c());
        xVar.m113358L1().mo84829yw().mo84825wh(new OperationFilter(j, j2, (List) null, (List) null, (List) null, (String) null, (BigDecimal) null, (BigDecimal) null, (List) null, Integer.valueOf(bundle2.getInt("PARAM_KEY_MONTHS")), (List) null, 1532, (DefaultConstructorMarker) null));
        xVar.m113357K1().f90474e.setStartTimestamp(j);
        xVar.m113357K1().f90474e.setEndTimestamp(j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m113350D1(C38686x xVar, View view) {
        Long l;
        Long l2;
        Integer num;
        C41536l.m120489i(xVar, "this$0");
        C38660f.C38661a aVar = C38660f.f92525R;
        C41232r rVar = (C41232r) xVar.m113358L1().mo84821fc().mo4814f();
        if (rVar != null) {
            l = (Long) rVar.mo95691d();
        } else {
            l = null;
        }
        C41232r rVar2 = (C41232r) xVar.m113358L1().mo84821fc().mo4814f();
        if (rVar2 != null) {
            l2 = (Long) rVar2.mo95692e();
        } else {
            l2 = null;
        }
        C41232r rVar3 = (C41232r) xVar.m113358L1().mo84821fc().mo4814f();
        if (rVar3 != null) {
            num = (Integer) rVar3.mo95694f();
        } else {
            num = null;
        }
        aVar.mo92307c(l, l2, num).mo4576A1(xVar.getParentFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m113351E1(C38686x xVar, View view) {
        C41536l.m120489i(xVar, "this$0");
        C0173b bVar = xVar.f92580m;
        Intent intent = new Intent(xVar.getActivity(), StatementsFilterActivity.class);
        OperationFilter operationFilter = xVar.f92579l;
        if (operationFilter == null) {
            C41536l.m120506z("filterParameters");
            operationFilter = null;
        }
        intent.putExtra("KEY_PARAMS", operationFilter);
        bVar.mo404a(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m113352F1(C38686x xVar, View view) {
        C41536l.m120489i(xVar, "this$0");
        Context requireContext = xVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        FragmentManager parentFragmentManager = xVar.getParentFragmentManager();
        C41536l.m120488h(parentFragmentManager, "parentFragmentManager");
        C38122f.C38123a.m112213i(c, parentFragmentManager, (String) null, 0, true, Long.valueOf(xVar.m113357K1().f90474e.getStartTimestamp()), Long.valueOf(xVar.m113357K1().f90474e.getEndTimestamp()), true, false, false, (String) null, 902, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m113353G1(C38686x xVar, View view) {
        C41536l.m120489i(xVar, "this$0");
        xVar.m113358L1().mo84829yw().mo84827xc();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m113354H1(C38686x xVar, View view) {
        C41536l.m120489i(xVar, "this$0");
        xVar.m113358L1().mo84829yw().mo84819c();
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m113355I1(C37649f fVar, C38686x xVar, View view) {
        C41536l.m120489i(fVar, "$this_with");
        C41536l.m120489i(xVar, "this$0");
        TextGroupView textGroupView = fVar.f90482m;
        C41536l.m120488h(textGroupView, "negativeButton");
        C32343x.m95474o1(textGroupView);
        if (fVar.f90482m.mo36844a() && fVar.f90484o.mo36844a()) {
            TextGroupView textGroupView2 = fVar.f90484o;
            C41536l.m120488h(textGroupView2, "positiveButton");
            C32343x.m95474o1(textGroupView2);
        }
        xVar.m113358L1().mo84829yw().mo84817U5(fVar.f90484o.mo36844a(), fVar.f90482m.mo36844a());
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m113356J1(C38686x xVar, ActivityResult activityResult) {
        OperationFilter operationFilter;
        long j;
        long j2;
        List list;
        List list2;
        List list3;
        String str;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        List list4;
        Integer num;
        List list5;
        C38686x xVar2 = xVar;
        C41536l.m120489i(xVar2, "this$0");
        OperationFilter operationFilter2 = null;
        if (activityResult.mo371b() == -1) {
            Intent a = activityResult.mo370a();
            if (a != null) {
                operationFilter = (OperationFilter) a.getParcelableExtra("KEY_PARAMS");
            } else {
                operationFilter = null;
            }
            if (operationFilter != null) {
                j = operationFilter.mo84803l();
            } else {
                j = C38286b.f91793a.mo91843f(1);
            }
            long j3 = j;
            if (operationFilter != null) {
                j2 = operationFilter.mo84796f();
            } else {
                j2 = C38286b.f91793a.mo91840c();
            }
            if (operationFilter != null) {
                list = operationFilter.mo84790a();
            } else {
                list = null;
            }
            if (operationFilter != null) {
                list2 = operationFilter.mo84791b();
            } else {
                list2 = null;
            }
            if (operationFilter != null) {
                list3 = operationFilter.mo84792d();
            } else {
                list3 = null;
            }
            if (operationFilter != null) {
                str = operationFilter.mo84802k();
            } else {
                str = null;
            }
            if (operationFilter != null) {
                bigDecimal = operationFilter.mo84800i();
            } else {
                bigDecimal = null;
            }
            if (operationFilter != null) {
                bigDecimal2 = operationFilter.mo84798h();
            } else {
                bigDecimal2 = null;
            }
            if (operationFilter != null) {
                list4 = operationFilter.mo84794e();
            } else {
                list4 = null;
            }
            if (operationFilter != null) {
                num = operationFilter.mo84801j();
            } else {
                num = null;
            }
            if (operationFilter != null) {
                list5 = operationFilter.mo84797g();
            } else {
                list5 = null;
            }
            xVar2.f92579l = new OperationFilter(j3, j2, list, list2, list3, str, bigDecimal, bigDecimal2, list4, num, list5);
        } else if (activityResult.mo371b() == 0) {
            xVar2.f92579l = xVar.m113358L1().mo84826ww();
        }
        C38702z yw = xVar.m113358L1().mo84829yw();
        OperationFilter operationFilter3 = xVar2.f92579l;
        if (operationFilter3 == null) {
            C41536l.m120506z("filterParameters");
        } else {
            operationFilter2 = operationFilter3;
        }
        yw.mo84825wh(operationFilter2);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final C37649f m113357K1() {
        C37649f fVar = this.f92576i;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final StatementsViewModel$ViewModel m113358L1() {
        return (StatementsViewModel$ViewModel) this.f92577j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m113359M1(Throwable th) {
        C1505h requireActivity = requireActivity();
        C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
        ((C35388f2) requireActivity).mo74709H1(th);
        LinearLayout linearLayout = m113357K1().f90481l;
        C41536l.m120488h(linearLayout, "binding.loadingFailed");
        C32343x.m95483r1(linearLayout, true, false, 2, (Object) null);
        LinearLayout linearLayout2 = m113357K1().f90483n;
        C41536l.m120488h(linearLayout2, "binding.noItemsFound");
        C32343x.m95483r1(linearLayout2, false, false, 2, (Object) null);
        RecyclerView recyclerView = m113357K1().f90485p;
        C41536l.m120488h(recyclerView, "binding.recyclerView");
        C32343x.m95483r1(recyclerView, false, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m113360N1(List list) {
        LinearLayout linearLayout = m113357K1().f90481l;
        C41536l.m120488h(linearLayout, "binding.loadingFailed");
        C38672m mVar = null;
        C32343x.m95483r1(linearLayout, false, false, 2, (Object) null);
        LinearLayout linearLayout2 = m113357K1().f90483n;
        C41536l.m120488h(linearLayout2, "binding.noItemsFound");
        C32343x.m95483r1(linearLayout2, list.isEmpty(), false, 2, (Object) null);
        RecyclerView recyclerView = m113357K1().f90485p;
        C41536l.m120488h(recyclerView, "binding.recyclerView");
        C32343x.m95483r1(recyclerView, !list.isEmpty(), false, 2, (Object) null);
        C38672m mVar2 = this.f92578k;
        if (mVar2 == null) {
            C41536l.m120506z("adapter");
        } else {
            mVar = mVar2;
        }
        mVar.mo92327f(list);
    }

    /* renamed from: O1 */
    private final void m113361O1() {
        C37649f K1 = m113357K1();
        K1.f90485p.setLayoutManager(new StickyHeaderLinearLayoutManager(getContext(), 0, false, 6, (DefaultConstructorMarker) null));
        RecyclerView recyclerView = K1.f90485p;
        C38672m mVar = this.f92578k;
        if (mVar == null) {
            C41536l.m120506z("adapter");
            mVar = null;
        }
        recyclerView.setAdapter(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final void m113362P1(AccountOperation accountOperation) {
        C36546y.m108282F().mo27152s("statement", accountOperation.getPrintFormType(), "open_transaction");
        Intent intent = new Intent(getActivity(), OperationDetailsActivity.class);
        intent.putExtra("PAYMENT_OPERATION_TYPE", 30);
        intent.putExtra("PAYMENT_DETAILS_OBJECT", C42035e.m122121c(accountOperation));
        startActivity(intent);
    }

    private final void observeData() {
        m113358L1().mo84811Bw().mo84816Sr().mo4819k(getViewLifecycleOwner(), new C38697k(new C38689c(this)));
        m113358L1().mo84811Bw().mo84823v1().mo4819k(getViewLifecycleOwner(), new C38697k(new C38690d(this)));
        m113358L1().mo84811Bw().mo84820d0().mo4819k(getViewLifecycleOwner(), new C38697k(new C38691e(this)));
        m113358L1().mo84811Bw().mo84814F6().mo4819k(getViewLifecycleOwner(), new C38697k(new C38692f(this)));
        m113358L1().mo84811Bw().mo84821fc().mo4819k(getViewLifecycleOwner(), new C38697k(new C38693g(this)));
        m113358L1().mo84811Bw().mo84815O4().mo4819k(getViewLifecycleOwner(), new C38697k(new C38694h(this)));
    }

    /* renamed from: z1 */
    private final void m113380z1() {
        C37649f K1 = m113357K1();
        K1.f90487r.setOnTextChangeListener(new C38688b(this, K1));
        getParentFragmentManager().mo4367F1("REQUEST_DATES", requireActivity(), new C38676n(this));
        K1.f90474e.setOnClickListener(new C38677o(this));
        K1.f90479j.setOnClickListener(new C38678p(this));
        K1.f90476g.setOnClickListener(new C38679q(this));
        K1.f90475f.setOnClickListener(new C38680r(this));
        K1.f90477h.setOnClickListener(new C38681s(this));
        K1.f90482m.setOnClickListener(new C38682t(K1, this));
        K1.f90484o.setOnClickListener(new C38683u(K1, this));
        K1.f90486q.setOnRefreshListener(new C38684v(this));
        K1.f90485p.mo5363n(this.f92581n);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f92576i = C37649f.m110690d(layoutInflater, viewGroup, false);
        LinearLayout c = m113357K1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f92576i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        this.f92579l = m113358L1().mo84826ww();
        C38695i iVar = new C38695i(this);
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        this.f92578k = new C38672m(iVar, requireActivity);
        m113361O1();
        m113380z1();
        observeData();
        long j = requireArguments().getLong("PARAM_ACCT_KEY", -1);
        if (j != -1) {
            C38702z yw = m113358L1().mo84829yw();
            OperationFilter operationFilter = this.f92579l;
            OperationFilter operationFilter2 = null;
            if (operationFilter == null) {
                C41536l.m120506z("filterParameters");
                operationFilter = null;
            }
            long l = operationFilter.mo84803l();
            OperationFilter operationFilter3 = this.f92579l;
            if (operationFilter3 == null) {
                C41536l.m120506z("filterParameters");
            } else {
                operationFilter2 = operationFilter3;
            }
            long f = operationFilter2.mo84796f();
            long j2 = l;
            long j3 = f;
            List e = C41339p.m119900e(Long.valueOf(j));
            OperationFilter operationFilter4 = r4;
            OperationFilter operationFilter5 = new OperationFilter(j2, j3, e, (List) null, (List) null, (String) null, (BigDecimal) null, (BigDecimal) null, (List) null, (Integer) null, (List) null, 2040, (DefaultConstructorMarker) null);
            yw.mo84825wh(operationFilter4);
        }
        m113358L1().mo84829yw().mo84822o1();
    }
}
