package z30;

import android.os.Bundle;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisTransactionViewModel;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10322k;
import p366bk.C10324m;
import r40.C27917c;
import t40.C28304a;
import ue1.C43064a;
import ue1.C43075l;
import y30.C29918e;

/* renamed from: z30.g */
public final class C30181g extends C35651n1 {

    /* renamed from: m */
    public static final C30182a f76063m = new C30182a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f76064d = C41219i.m119470b(new C30190i(this));

    /* renamed from: e */
    private final C41217g f76065e;

    /* renamed from: f */
    private C29918e f76066f;

    /* renamed from: g */
    private FilterValue.Calendar f76067g;

    /* renamed from: h */
    private AnalysisChildModel f76068h;

    /* renamed from: i */
    private long f76069i;

    /* renamed from: j */
    private long f76070j;

    /* renamed from: k */
    private long f76071k;

    /* renamed from: l */
    private ArrayList f76072l;

    /* renamed from: z30.g$a */
    public static final class C30182a {
        private C30182a() {
        }

        public /* synthetic */ C30182a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C30181g mo70539a(AnalysisChildModel analysisChildModel, long j, FilterValue.Calendar calendar, long j2, long j3, ArrayList arrayList) {
            C41536l.m120489i(analysisChildModel, "parentCategory");
            C41536l.m120489i(calendar, "calendarValue");
            C41536l.m120489i(arrayList, "accounts");
            C30181g gVar = new C30181g();
            Bundle bundle = new Bundle();
            bundle.putParcelable("PARENT_CATEGORY", analysisChildModel);
            bundle.putLong("SELECTED_CATEGORY_ID", j);
            bundle.putParcelable("CALENDAR_VALUE", calendar);
            bundle.putLong("START_DATE", j2);
            bundle.putLong("END_DATE", j3);
            bundle.putSerializable("ACCOUNTS", arrayList);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    /* renamed from: z30.g$b */
    static final class C30183b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30146d f76073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30183b(C30146d dVar) {
            super(0);
            this.f76073d = dVar;
        }

        public final void invoke() {
            C30146d dVar = this.f76073d;
            if (dVar != null) {
                dVar.mo70504S1();
            }
        }
    }

    /* renamed from: z30.g$c */
    static final class C30184c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30181g f76074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30184c(C30181g gVar) {
            super(0);
            this.f76074d = gVar;
        }

        public final void invoke() {
            this.f76074d.m91281q1().mo54791lw();
        }
    }

    /* renamed from: z30.g$d */
    static final class C30185d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30181g f76075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30185d(C30181g gVar) {
            super(1);
            this.f76075d = gVar;
        }

        /* renamed from: a */
        public final void mo70540a(AnalysisChildModel analysisChildModel) {
            C41536l.m120489i(analysisChildModel, "it");
            this.f76075d.m91286v1(analysisChildModel.mo54781f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70540a((AnalysisChildModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.g$e */
    static final class C30186e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30181g f76076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30186e(C30181g gVar) {
            super(0);
            this.f76076d = gVar;
        }

        public final void invoke() {
            C28304a aVar = C28304a.f71822a;
            C1505h requireActivity = this.f76076d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            aVar.mo67958a(requireActivity, C27917c.ANALYSIS);
        }
    }

    /* renamed from: z30.g$f */
    static final class C30187f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30146d f76077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30187f(C30146d dVar) {
            super(1);
            this.f76077d = dVar;
        }

        /* renamed from: a */
        public final void mo70541a(AccountOperation accountOperation) {
            C41536l.m120489i(accountOperation, "operation");
            C30146d dVar = this.f76077d;
            if (dVar != null) {
                dVar.mo70506Z1(accountOperation);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70541a((AccountOperation) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.g$g */
    /* synthetic */ class C30188g extends C41535k implements C43075l {
        C30188g(Object obj) {
            super(1, obj, C30181g.class, "onSuccess", "onSuccess(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo70542b(List list) {
            C41536l.m120489i(list, "p0");
            ((C30181g) this.receiver).m91285u1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70542b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.g$h */
    /* synthetic */ class C30189h extends C41535k implements C43075l {
        C30189h(Object obj) {
            super(1, obj, C30181g.class, "onError", "onError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo70543b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C30181g) this.receiver).m91284t1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70543b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.g$i */
    static final class C30190i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30181g f76078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30190i(C30181g gVar) {
            super(0);
            this.f76078d = gVar;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f76078d.findView(C10322k.f28709Ar);
        }
    }

    /* renamed from: z30.g$j */
    public static final class C30191j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f76079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30191j(Fragment fragment) {
            super(0);
            this.f76079d = fragment;
        }

        public final Fragment invoke() {
            return this.f76079d;
        }
    }

    /* renamed from: z30.g$k */
    public static final class C30192k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f76080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30192k(C43064a aVar) {
            super(0);
            this.f76080d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f76080d.invoke();
        }
    }

    /* renamed from: z30.g$l */
    public static final class C30193l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f76081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30193l(C41217g gVar) {
            super(0);
            this.f76081d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f76081d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: z30.g$m */
    public static final class C30194m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f76082d;

        /* renamed from: e */
        final /* synthetic */ C41217g f76083e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30194m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f76082d = aVar;
            this.f76083e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f76082d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f76083e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: z30.g$n */
    public static final class C30195n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f76084d;

        /* renamed from: e */
        final /* synthetic */ C41217g f76085e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30195n(Fragment fragment, C41217g gVar) {
            super(0);
            this.f76084d = fragment;
            this.f76085e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f76085e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f76084d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C30181g() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C30192k(new C30191j(this)));
        this.f76065e = C1514j0.m5374c(this, C41520a0.m120436b(AnalysisTransactionViewModel.class), new C30193l(a), new C30194m((C43064a) null, a), new C30195n(this, a));
        this.f76069i = -1;
    }

    /* renamed from: n1 */
    private final void m91278n1() {
        m91281q1().mo54791lw();
        C29918e eVar = this.f76066f;
        C29918e eVar2 = null;
        if (eVar == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar = null;
        }
        eVar.mo69498J();
        C29918e eVar3 = this.f76066f;
        if (eVar3 == null) {
            C41536l.m120506z("recyclerAdapter");
        } else {
            eVar2 = eVar3;
        }
        eVar2.mo69509e0();
    }

    /* renamed from: o1 */
    private final AnalysisChildModel m91279o1() {
        String str;
        ArrayList arrayList = new ArrayList();
        AnalysisChildModel analysisChildModel = this.f76068h;
        if (analysisChildModel == null) {
            C41536l.m120506z("parentCategory");
            analysisChildModel = null;
        }
        List<AnalysisChildModel> d = analysisChildModel.mo54777d();
        C41536l.m120486f(d);
        for (AnalysisChildModel analysisChildModel2 : d) {
            if (analysisChildModel2.mo54781f() != this.f76069i) {
                str = "66" + analysisChildModel2.mo54779e();
            } else {
                str = analysisChildModel2.mo54779e();
            }
            arrayList.add(AnalysisChildModel.m71401b(analysisChildModel2, (List) null, C40439w.m117103B(str, "#", "", false, 4, (Object) null), 0, (String) null, (BigDecimal) null, 29, (Object) null));
        }
        AnalysisChildModel analysisChildModel3 = this.f76068h;
        if (analysisChildModel3 == null) {
            C41536l.m120506z("parentCategory");
            analysisChildModel3 = null;
        }
        return AnalysisChildModel.m71401b(analysisChildModel3, arrayList, (String) null, 0, (String) null, (BigDecimal) null, 30, (Object) null);
    }

    /* renamed from: p1 */
    private final RecyclerView m91280p1() {
        Object value = this.f76064d.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final AnalysisTransactionViewModel m91281q1() {
        return (AnalysisTransactionViewModel) this.f76065e.getValue();
    }

    /* renamed from: r1 */
    private final void m91282r1() {
        C30146d dVar;
        boolean z;
        Fragment parentFragment = getParentFragment();
        C29918e eVar = null;
        if (parentFragment instanceof C30146d) {
            dVar = (C30146d) parentFragment;
        } else {
            dVar = null;
        }
        RecyclerView p1 = m91280p1();
        p1.setLayoutManager(new LinearLayoutManager(p1.getContext()));
        boolean z2 = true;
        p1.setHasFixedSize(true);
        C29918e eVar2 = this.f76066f;
        if (eVar2 == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar2 = null;
        }
        p1.setAdapter(eVar2);
        p1.setItemAnimator((RecyclerView.C1742m) null);
        C29918e eVar3 = this.f76066f;
        if (eVar3 == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar3 = null;
        }
        if (dVar != null) {
            z = dVar.mo70500E1();
        } else {
            z = true;
        }
        eVar3.mo70217q0(z);
        C29918e eVar4 = this.f76066f;
        if (eVar4 == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar4 = null;
        }
        if (dVar != null) {
            z2 = dVar.mo70501F1();
        }
        eVar4.mo70214n0(z2);
        C29918e eVar5 = this.f76066f;
        if (eVar5 == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar5 = null;
        }
        eVar5.mo70209i0(new C30183b(dVar));
        C29918e eVar6 = this.f76066f;
        if (eVar6 == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar6 = null;
        }
        eVar6.mo70212l0(new C30184c(this));
        C29918e eVar7 = this.f76066f;
        if (eVar7 == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar7 = null;
        }
        eVar7.mo70210j0(new C30185d(this));
        C29918e eVar8 = this.f76066f;
        if (eVar8 == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar8 = null;
        }
        eVar8.mo70211k0(new C30186e(this));
        C29918e eVar9 = this.f76066f;
        if (eVar9 == null) {
            C41536l.m120506z("recyclerAdapter");
        } else {
            eVar = eVar9;
        }
        eVar.mo70213m0(new C30187f(dVar));
    }

    /* renamed from: s1 */
    private final void m91283s1() {
        C1644x qw = m91281q1().mo54792qw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C21484c.m69412d(qw, viewLifecycleOwner, new C30188g(this), (C43075l) null, new C30189h(this), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m91284t1(C21503d.C21504a aVar) {
        C29918e eVar = this.f76066f;
        if (eVar == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar = null;
        }
        eVar.mo69508d0();
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m91285u1(List list) {
        C29918e eVar = this.f76066f;
        if (eVar == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar = null;
        }
        eVar.mo70208h0(list, m91281q1().mo54793rw());
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m91286v1(long j) {
        AnalysisChildModel analysisChildModel;
        Object obj;
        boolean z;
        boolean z2;
        this.f76069i = j;
        AnalysisChildModel o1 = m91279o1();
        m91281q1().mo54795tw(j);
        AnalysisChildModel analysisChildModel2 = this.f76068h;
        FilterValue.Calendar calendar = null;
        if (analysisChildModel2 == null) {
            C41536l.m120506z("parentCategory");
            analysisChildModel2 = null;
        }
        List d = analysisChildModel2.mo54777d();
        C41536l.m120486f(d);
        Iterator it = d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((AnalysisChildModel) it.next()).mo54781f() == j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i++;
        }
        C29918e eVar = this.f76066f;
        if (eVar == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar = null;
        }
        eVar.mo70215o0(i);
        if (((int) this.f76069i) == 0) {
            C29918e eVar2 = this.f76066f;
            if (eVar2 == null) {
                C41536l.m120506z("recyclerAdapter");
                eVar2 = null;
            }
            eVar2.mo70216p0(false);
        } else {
            C29918e eVar3 = this.f76066f;
            if (eVar3 == null) {
                C41536l.m120506z("recyclerAdapter");
                eVar3 = null;
            }
            eVar3.mo70216p0(true);
        }
        C29918e eVar4 = this.f76066f;
        if (eVar4 == null) {
            C41536l.m120506z("recyclerAdapter");
            eVar4 = null;
        }
        List d2 = o1.mo54777d();
        if (d2 != null) {
            Iterator it2 = d2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((AnalysisChildModel) obj).mo54781f() == j) {
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
        } else {
            analysisChildModel = null;
        }
        C41536l.m120486f(analysisChildModel);
        FilterValue.Calendar calendar2 = this.f76067g;
        if (calendar2 == null) {
            C41536l.m120506z("calendarValue");
        } else {
            calendar = calendar2;
        }
        eVar4.mo70207g0(o1, analysisChildModel, calendar);
        m91278n1();
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_analysis_transactions;
    }

    public void onCreate(Bundle bundle) {
        AnalysisChildModel analysisChildModel;
        Long l;
        FilterValue.Calendar calendar;
        Long l2;
        Long l3;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            analysisChildModel = (AnalysisChildModel) arguments.getParcelable("PARENT_CATEGORY");
        } else {
            analysisChildModel = null;
        }
        C41536l.m120486f(analysisChildModel);
        this.f76068h = analysisChildModel;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            l = Long.valueOf(arguments2.getLong("SELECTED_CATEGORY_ID"));
        } else {
            l = null;
        }
        C41536l.m120486f(l);
        this.f76069i = l.longValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            calendar = (FilterValue.Calendar) arguments3.getParcelable("CALENDAR_VALUE");
        } else {
            calendar = null;
        }
        C41536l.m120486f(calendar);
        this.f76067g = calendar;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            l2 = Long.valueOf(arguments4.getLong("START_DATE"));
        } else {
            l2 = null;
        }
        C41536l.m120486f(l2);
        this.f76070j = l2.longValue();
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            l3 = Long.valueOf(arguments5.getLong("END_DATE"));
        } else {
            l3 = null;
        }
        C41536l.m120486f(l3);
        this.f76071k = l3.longValue();
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            serializable = arguments6.getSerializable("ACCOUNTS");
        }
        C41536l.m120486f(serializable);
        this.f76072l = (ArrayList) serializable;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        this.f76066f = new C29918e(requireActivity);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        AnalysisTransactionViewModel q1 = m91281q1();
        long j = this.f76069i;
        long j2 = this.f76070j;
        long j3 = this.f76071k;
        ArrayList arrayList = this.f76072l;
        if (arrayList == null) {
            C41536l.m120506z("accounts");
            arrayList = null;
        }
        q1.mo54796uw(j, j2, j3, arrayList);
        m91282r1();
        m91283s1();
        m91286v1(this.f76069i);
    }
}
