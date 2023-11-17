package p442gp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4956a;
import g91.C32343x;
import g91.C32355x0;
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
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.model.StatisticsData;
import p341ge.bog.mobilebank.model.Client;
import p356ao.C10110b;
import p393di.C12130a;
import p393di.C12131b;
import p413eo.C12741f;
import p442gp.C15439k;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: gp.d */
public final class C15418d extends C15415a {

    /* renamed from: Q */
    public static final C15419a f43820Q = new C15419a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C12741f f43821K;

    /* renamed from: L */
    public C15439k.C15442b f43822L;

    /* renamed from: M */
    public Client f43823M;

    /* renamed from: N */
    private final C41217g f43824N = C41219i.m119470b(new C15430i(this));

    /* renamed from: O */
    private final C41217g f43825O;

    /* renamed from: P */
    private final C41217g f43826P;

    /* renamed from: gp.d$a */
    public static final class C15419a {
        private C15419a() {
        }

        public /* synthetic */ C15419a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15418d mo42512a(StatisticsData statisticsData) {
            C41536l.m120489i(statisticsData, "data");
            C15418d dVar = new C15418d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_STATISTICS_DATA", statisticsData)));
            return dVar;
        }
    }

    /* renamed from: gp.d$b */
    static final class C15420b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15418d f43827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15420b(C15418d dVar) {
            super(0);
            this.f43827d = dVar;
        }

        /* renamed from: b */
        public final C15443l invoke() {
            return new C15443l(this.f43827d.mo42510l2().getUserInfo().isSolo());
        }
    }

    /* renamed from: gp.d$c */
    static final class C15421c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15418d f43828d;

        /* renamed from: gp.d$c$a */
        static final class C15422a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C15418d f43829d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15422a(C15418d dVar) {
                super(1);
                this.f43829d = dVar;
            }

            /* renamed from: a */
            public final void mo42515a(List list) {
                C41536l.m120489i(list, "transactions");
                this.f43829d.m55890k2().f37717l.mo53595c();
                this.f43829d.m55889j2().mo6029i(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42515a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: gp.d$c$b */
        static final class C15423b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C15418d f43830d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15423b(C15418d dVar) {
                super(1);
                this.f43830d = dVar;
            }

            /* renamed from: a */
            public final void mo42516a(List list) {
                this.f43830d.m55890k2().f37717l.mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42516a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: gp.d$c$c */
        static final class C15424c extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C15418d f43831d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15424c(C15418d dVar) {
                super(2);
                this.f43831d = dVar;
            }

            /* renamed from: a */
            public final void mo42517a(Throwable th, List list) {
                C41536l.m120489i(th, "<anonymous parameter 0>");
                this.f43831d.m55890k2().f37717l.mo53596d();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo42517a((Throwable) obj, (List) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15421c(C15418d dVar) {
            super(1);
            this.f43828d = dVar;
        }

        /* renamed from: a */
        public final void mo42514a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C15422a(this.f43828d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C15423b(this.f43828d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C15424c(this.f43828d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42514a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gp.d$d */
    static final class C15425d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43832a;

        C15425d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43832a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43832a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43832a.invoke(obj);
        }
    }

    /* renamed from: gp.d$e */
    public static final class C15426e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f43833d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15426e(Fragment fragment) {
            super(0);
            this.f43833d = fragment;
        }

        public final Fragment invoke() {
            return this.f43833d;
        }
    }

    /* renamed from: gp.d$f */
    public static final class C15427f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43834d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15427f(C43064a aVar) {
            super(0);
            this.f43834d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f43834d.invoke();
        }
    }

    /* renamed from: gp.d$g */
    public static final class C15428g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f43835d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15428g(C41217g gVar) {
            super(0);
            this.f43835d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f43835d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: gp.d$h */
    public static final class C15429h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43836d;

        /* renamed from: e */
        final /* synthetic */ C41217g f43837e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15429h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f43836d = aVar;
            this.f43837e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43836d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f43837e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: gp.d$i */
    static final class C15430i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15418d f43838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15430i(C15418d dVar) {
            super(0);
            this.f43838d = dVar;
        }

        /* renamed from: b */
        public final StatisticsData invoke() {
            Bundle arguments = this.f43838d.getArguments();
            StatisticsData statisticsData = arguments != null ? (StatisticsData) arguments.getParcelable("EXTRA_STATISTICS_DATA") : null;
            C41536l.m120486f(statisticsData);
            return statisticsData;
        }
    }

    /* renamed from: gp.d$j */
    static final class C15431j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15418d f43839d;

        /* renamed from: gp.d$j$a */
        static final class C15432a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C15418d f43840d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15432a(C15418d dVar) {
                super(0);
                this.f43840d = dVar;
            }

            /* renamed from: b */
            public final C15439k invoke() {
                return this.f43840d.mo42511m2().mo32778a(this.f43840d.m55892o2().mo41160d());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15431j(C15418d dVar) {
            super(0);
            this.f43839d = dVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C15432a(this.f43839d));
        }
    }

    public C15418d() {
        C15431j jVar = new C15431j(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C15427f(new C15426e(this)));
        this.f43825O = C1514j0.m5374c(this, C41520a0.m120436b(C15439k.class), new C15428g(a), new C15429h((C43064a) null, a), jVar);
        this.f43826P = C41219i.m119470b(new C15420b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final C15443l m55889j2() {
        return (C15443l) this.f43826P.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C12741f m55890k2() {
        C12741f fVar = this.f43821K;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: n2 */
    private final int m55891n2() {
        if (m55892o2().mo41162e()) {
            return C10110b.color_brand_solo_pr_solid_df_500;
        }
        return C10110b.f27905n;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final StatisticsData m55892o2() {
        return (StatisticsData) this.f43824N.getValue();
    }

    /* renamed from: p2 */
    private final C15439k m55893p2() {
        return (C15439k) this.f43825O.getValue();
    }

    /* renamed from: q2 */
    private final void m55894q2() {
        m55893p2().mo42523fw().mo42522a6().mo4819k(getViewLifecycleOwner(), new C15425d(new C15421c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m55895r2(C15418d dVar, DialogInterface dialogInterface) {
        C41536l.m120489i(dVar, "this$0");
        View requireView = dVar.requireView();
        C41536l.m120488h(requireView, "requireView()");
        ViewGroup.LayoutParams layoutParams = requireView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dVar.getResources().getDisplayMetrics().heightPixels - C32355x0.m95522m(dVar.getContext());
            requireView.setLayoutParams(layoutParams);
            ViewParent parent = dVar.m55890k2().mo3946b().getParent();
            C41536l.m120487g(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                view.setLayoutParams(layoutParams2);
                C41536l.m120487g(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetBehavior n = ((C4956a) dialogInterface).mo15614n();
                n.mo15579I0(3);
                n.mo15578H0(true);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* renamed from: s2 */
    private final void m55896s2(Number number, Number number2, String str) {
        String str2;
        String str3 = str;
        boolean z = false;
        String F = C32343x.m95388F("my.package.page.statistics.Asheet.isLeft", new Object[0]);
        C12130a aVar = new C12130a(number.doubleValue(), str3);
        List e = C41339p.m119900e(new C12131b((String) null, C32343x.m95388F("my.package.page.statistics.Asheet.isLeft", new Object[0]), new C12130a(number.doubleValue() - number2.doubleValue(), str3), m55891n2(), C41341q.m119907j(), (C12131b) null, (String) null, 64, (DefaultConstructorMarker) null));
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            str2 = number2.toString();
        } else {
            str2 = C32343x.m95406O(number2.toString(), str3);
        }
        m55890k2().f37712g.setData(new C12131b((String) null, F, aVar, -1, e, (C12131b) null, str2));
    }

    /* renamed from: t2 */
    private final void m55897t2() {
        String str;
        mo26370a2(C32343x.m95388F("my.package.page.statistics.Asheet.header", new Object[0]));
        m55890k2().f37711f.setText(C32343x.m95388F("my.package.page.statistics.Asheet.explanatory", new Object[0]));
        m55890k2().f37714i.setAdapter(m55889j2());
        Number b = m55892o2().mo41159b();
        Number a = m55892o2().mo41158a();
        if (m55892o2().mo41162e()) {
            str = "";
        } else {
            str = "GEL";
        }
        m55896s2(b, a, str);
        m55890k2().f37715j.mo3946b().setOnClickListener(new C15417c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m55898u2(C15418d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m55893p2().onRefresh(6);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f43821K = C12741f.m48358d(layoutInflater, viewGroup, true);
    }

    /* renamed from: l2 */
    public final Client mo42510l2() {
        Client client = this.f43823M;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: m2 */
    public final C15439k.C15442b mo42511m2() {
        C15439k.C15442b bVar = this.f43822L;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        this.f43821K = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m55894q2();
        m55897t2();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C4956a aVar;
        Dialog q1 = super.mo710q1(bundle);
        if (q1 instanceof C4956a) {
            aVar = (C4956a) q1;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.setOnShowListener(new C15416b(this));
        }
        return q1;
    }
}
