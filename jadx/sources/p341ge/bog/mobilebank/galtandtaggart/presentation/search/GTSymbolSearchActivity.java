package p341ge.bog.mobilebank.galtandtaggart.presentation.search;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import de1.C40640a;
import ed1.C40732a;
import ed1.C40741h;
import ee1.C40765a;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import ie0.C25190j;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jg0.C25447j;
import jg0.C25454q;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37113i;
import o31.C37600h;
import p163m0.C7047a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.search.C23753a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p366bk.C10320i;
import p420fh.C12902d;
import p420fh.C12910e;
import p434gh.C15278a;
import ue0.C28719d0;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import xe0.C29759q;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity */
public final class GTSymbolSearchActivity extends C30772sa {

    /* renamed from: O */
    public static final C23733a f61808O = new C23733a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C28719d0 f61809F;

    /* renamed from: G */
    private final C41204a f61810G = new C41204a();

    /* renamed from: H */
    private final C40765a f61811H;

    /* renamed from: I */
    private final C40741h f61812I;

    /* renamed from: J */
    private final C41217g f61813J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public String f61814K;

    /* renamed from: L */
    private final C41217g f61815L;

    /* renamed from: M */
    private final C41217g f61816M;

    /* renamed from: N */
    private final C41217g f61817N;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$a */
    public static final class C23733a {
        private C23733a() {
        }

        public /* synthetic */ C23733a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m76686b(C23733a aVar, Context context, C25454q qVar, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 2) != 0) {
                qVar = C25454q.CHART;
            }
            if ((i & 4) != 0) {
                bigDecimal = null;
            }
            aVar.mo60656a(context, qVar, bigDecimal);
        }

        /* renamed from: a */
        public final void mo60656a(Context context, C25454q qVar, BigDecimal bigDecimal) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(qVar, "searchType");
            context.startActivity(new Intent(context, GTSymbolSearchActivity.class).putExtra("search_source", qVar).putExtra("watchlist_id", bigDecimal));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$b */
    private static final class C23734b extends LinearLayoutManager {
        public C23734b(Context context) {
            super(context);
        }

        /* renamed from: i1 */
        public void mo5170i1(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(wVar, "recycler");
            C41536l.m120489i(b0Var, "state");
            try {
                super.mo5170i1(wVar, b0Var);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$c */
    static final class C23735c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23735c(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(0);
            this.f61818d = gTSymbolSearchActivity;
        }

        /* renamed from: b */
        public final C23760g invoke() {
            GTSymbolSearchActivity gTSymbolSearchActivity = this.f61818d;
            return new C23760g(gTSymbolSearchActivity, gTSymbolSearchActivity.m76675S2(), this.f61818d.m76678V2(), this.f61818d.m76679W2());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$d */
    static final class C23736d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23736d(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(1);
            this.f61819d = gTSymbolSearchActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m76692d(List list, GTSymbolSearchActivity gTSymbolSearchActivity) {
            C41536l.m120489i(gTSymbolSearchActivity, "this$0");
            if (list.size() > 1) {
                gTSymbolSearchActivity.m76674R2().mo3946b().postDelayed(new C23759f(gTSymbolSearchActivity), 200);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m76693e(GTSymbolSearchActivity gTSymbolSearchActivity) {
            C41536l.m120489i(gTSymbolSearchActivity, "this$0");
            gTSymbolSearchActivity.m76676T2(0, 15);
        }

        /* renamed from: c */
        public final void mo60658c(List list) {
            C23760g G2 = this.f61819d.m76673Q2();
            C41536l.m120488h(list, "result");
            G2.mo60682r(list, new C23758e(list, this.f61819d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60658c((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$e */
    static final class C23737e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23737e(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(1);
            this.f61820d = gTSymbolSearchActivity;
        }

        /* renamed from: a */
        public final void mo60659a(C41224m mVar) {
            this.f61820d.m76673Q2().mo60678n((String) mVar.mo95678e(), (C31128a) mVar.mo95680f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60659a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$f */
    static final class C23738f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61821d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$f$a */
        static final class C23739a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTSymbolSearchActivity f61822d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23739a(GTSymbolSearchActivity gTSymbolSearchActivity) {
                super(1);
                this.f61822d = gTSymbolSearchActivity;
            }

            /* renamed from: a */
            public final void mo60661a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                GTSymbolSearchActivity gTSymbolSearchActivity = this.f61822d;
                String string = gTSymbolSearchActivity.getString(C25190j.gt_watchlist_change_symbol_success_message);
                C41536l.m120488h(string, "getString(ge.bog.mobileb…e_symbol_success_message)");
                gTSymbolSearchActivity.m76672P2(string, C15278a.POSITIVE);
                this.f61822d.m76673Q2().mo60683t();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60661a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$f$b */
        static final class C23740b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTSymbolSearchActivity f61823d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23740b(GTSymbolSearchActivity gTSymbolSearchActivity) {
                super(1);
                this.f61823d = gTSymbolSearchActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                if (th instanceof ApiError) {
                    ApiError apiError = (ApiError) th;
                    if (C41536l.m120484d(apiError.mo84685a().getError(), "(GALT_TRADING.GENERAL:SYMBOL_ALREADY_ADDED)") || C41536l.m120484d(apiError.mo84685a().getError(), "(GALT_TRADING.GENERAL:SYMBOL_NOT_FOUND)")) {
                        GTSymbolSearchActivity gTSymbolSearchActivity = this.f61823d;
                        String string = gTSymbolSearchActivity.getString(C25190j.gt_watchlist_change_symbol_success_message);
                        C41536l.m120488h(string, "getString(ge.bog.mobileb…e_symbol_success_message)");
                        C12910e.m48797o(gTSymbolSearchActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
                        this.f61823d.m76673Q2().mo60683t();
                        return;
                    }
                }
                GTSymbolSearchActivity gTSymbolSearchActivity2 = this.f61823d;
                String string2 = gTSymbolSearchActivity2.getString(C25190j.gt_watchlist_change_symbol_failure_message);
                C41536l.m120488h(string2, "getString(ge.bog.mobileb…e_symbol_failure_message)");
                C12910e.m48790h(gTSymbolSearchActivity2, string2, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23738f(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(1);
            this.f61821d = gTSymbolSearchActivity;
        }

        /* renamed from: a */
        public final void mo60660a(C31128a aVar) {
            C41536l.m120488h(aVar, "resp");
            C31132b.m92648j(aVar, (int[]) null, new C23739a(this.f61821d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23740b(this.f61821d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60660a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$g */
    static final class C23741g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61824d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23741g(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(1);
            this.f61824d = gTSymbolSearchActivity;
        }

        /* renamed from: a */
        public final void mo60663a(String str) {
            this.f61824d.m76678V2().mo60619uw().mo60615Zt(this.f61824d.f61814K, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60663a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$h */
    static final class C23742h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61825a;

        C23742h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61825a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61825a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61825a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$i */
    static final class C23743i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61826d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23743i(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(0);
            this.f61826d = gTSymbolSearchActivity;
        }

        /* renamed from: b */
        public final C25454q invoke() {
            Intent intent = this.f61826d.getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("search_source") : null;
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.presentation.search.SearchType");
            return (C25454q) serializableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$j */
    public static final class C23744j extends C37600h {

        /* renamed from: b */
        final /* synthetic */ GTSymbolSearchActivity f61827b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23744j(GTSymbolSearchActivity gTSymbolSearchActivity, GTSearchSymbolViewModel$ViewModel gTSearchSymbolViewModel$ViewModel) {
            super(gTSearchSymbolViewModel$ViewModel);
            this.f61827b = gTSymbolSearchActivity;
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5739d(recyclerView, i);
            if (i == 0) {
                GTSymbolSearchActivity.m76677U2(this.f61827b, (Integer) null, (Integer) null, 3, (Object) null);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo60667f() {
            C23753a.C23754a.m76708a(this.f61827b.m76678V2().mo60619uw(), this.f61827b.f61814K, false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$k */
    static final class C23745k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61828d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23745k(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(1);
            this.f61828d = gTSymbolSearchActivity;
        }

        /* renamed from: a */
        public final void mo60668a(String str) {
            C41536l.m120489i(str, "it");
            this.f61828d.f61814K = str;
            this.f61828d.m76682Z2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60668a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$l */
    static final class C23746l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23746l(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(0);
            this.f61829d = gTSymbolSearchActivity;
        }

        public final void invoke() {
            this.f61829d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$m */
    static final class C23747m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23747m(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(1);
            this.f61830d = gTSymbolSearchActivity;
        }

        /* renamed from: a */
        public final void mo60669a(String str) {
            C41536l.m120489i(str, "it");
            GTShareDetailsActivity.f61877N.mo60709a(str, this.f61830d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60669a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$n */
    static final class C23748n extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23748n(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(2);
            this.f61831d = gTSymbolSearchActivity;
        }

        /* renamed from: a */
        public final void mo60670a(GTSearchSymbolViewModel$ViewModel.C23720e.C23722b bVar, C29759q qVar) {
            C41536l.m120489i(bVar, "item");
            C41536l.m120489i(qVar, "symbolState");
            BigDecimal M2 = this.f61831d.m76679W2();
            if (M2 != null) {
                this.f61831d.m76678V2().mo60616a8(M2, bVar.mo60633e(), qVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo60670a((GTSearchSymbolViewModel$ViewModel.C23720e.C23722b) obj, (C29759q) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$o */
    public static final class C23749o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23749o(ComponentActivity componentActivity) {
            super(0);
            this.f61832d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61832d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$p */
    public static final class C23750p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61833d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23750p(ComponentActivity componentActivity) {
            super(0);
            this.f61833d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61833d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$q */
    public static final class C23751q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61834d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61835e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23751q(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61834d = aVar;
            this.f61835e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61834d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61835e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity$r */
    static final class C23752r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTSymbolSearchActivity f61836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23752r(GTSymbolSearchActivity gTSymbolSearchActivity) {
            super(0);
            this.f61836d = gTSymbolSearchActivity;
        }

        /* renamed from: b */
        public final BigDecimal invoke() {
            Intent intent = this.f61836d.getIntent();
            return (BigDecimal) (intent != null ? intent.getSerializableExtra("watchlist_id") : null);
        }
    }

    public GTSymbolSearchActivity() {
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f61811H = h1;
        this.f61812I = h1.mo95005T0(C40732a.LATEST);
        this.f61813J = new C1617p0(C41520a0.m120436b(GTSearchSymbolViewModel$ViewModel.class), new C23750p(this), new C23749o(this), new C23751q((C43064a) null, this));
        this.f61814K = "";
        this.f61815L = C41219i.m119470b(new C23743i(this));
        this.f61816M = C41219i.m119470b(new C23752r(this));
        this.f61817N = C41219i.m119470b(new C23735c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m76672P2(String str, C15278a aVar) {
        C12902d.C12903a.m48771e(C12902d.f38098b, this, false, 2, (Object) null).mo33652k(str, aVar, (C12902d.C12905b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final C23760g m76673Q2() {
        return (C23760g) this.f61817N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final C28719d0 m76674R2() {
        C28719d0 d0Var = this.f61809F;
        C41536l.m120486f(d0Var);
        return d0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final C25454q m76675S2() {
        return (C25454q) this.f61815L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m76676T2(Integer num, Integer num2) {
        int i;
        int i2;
        RecyclerView.C1747p layoutManager = m76674R2().f73165f.getLayoutManager();
        C41536l.m120487g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (num != null) {
            i = num.intValue();
        } else {
            i = linearLayoutManager.mo5219n2();
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = linearLayoutManager.mo5223q2();
        }
        if (i <= i2) {
            while (true) {
                GTSearchSymbolViewModel$ViewModel.C23720e.C23722b j = m76673Q2().mo60674j(i);
                if (j != null && !(j.mo60636h() instanceof C31128a.C31131c)) {
                    m76678V2().mo60619uw().mo60621xt(j.mo60633e());
                }
                if (i != i2) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: U2 */
    static /* synthetic */ void m76677U2(GTSymbolSearchActivity gTSymbolSearchActivity, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        gTSymbolSearchActivity.m76676T2(num, num2);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final GTSearchSymbolViewModel$ViewModel m76678V2() {
        return (GTSearchSymbolViewModel$ViewModel) this.f61813J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final BigDecimal m76679W2() {
        return (BigDecimal) this.f61816M.getValue();
    }

    /* renamed from: X2 */
    private final void m76680X2() {
        m76678V2().mo60620vw().mo60613Sf().mo4819k(this, new C23742h(new C23736d(this)));
        m76678V2().mo60620vw().mo60612J2().mo4819k(this, new C23742h(new C23737e(this)));
        m76678V2().mo60620vw().mo60614U().mo4819k(this, new C23742h(new C23738f(this)));
        this.f61810G.mo95660b(this.f61812I.mo94928g(500, TimeUnit.MILLISECONDS).mo94923G(C40640a.m117458b()).mo94940w(C40992a.m118827a()).mo94920C(new C25447j(new C23741g(this))));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m76681Y2(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m76682Z2() {
        C23760g.m76716s(m76673Q2(), C41341q.m119907j(), (Runnable) null, 2, (Object) null);
        this.f61811H.onNext(this.f61814K);
    }

    /* renamed from: a3 */
    private final void m76683a3() {
        m76682Z2();
        C28719d0 R2 = m76674R2();
        R2.f73165f.setLayoutManager(new C23734b(this));
        R2.f73165f.setAdapter(m76673Q2());
        R2.f73165f.mo5363n(new C23744j(this, m76678V2()));
        R2.f73165f.mo5351j(new C37113i(C0767a.m2895e(this, C10320i.divider)));
        R2.f73166g.setOnTextChangeListener(new C23745k(this));
        R2.f73166g.requestFocus();
        R2.f73166g.setCancelButtonListener(new C23746l(this));
        m76673Q2().mo60680p(new C23747m(this));
        m76673Q2().mo60681q(new C23748n(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        this.f61809F = C28719d0.m87995d(getLayoutInflater());
        setContentView((View) m76674R2().mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m76683a3();
        m76680X2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f61810G.mo95663e();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C25190j.gt_page_title_my_portfolio);
        C41536l.m120488h(string, "getString(ge.bog.mobileb…_page_title_my_portfolio)");
        return string;
    }
}
