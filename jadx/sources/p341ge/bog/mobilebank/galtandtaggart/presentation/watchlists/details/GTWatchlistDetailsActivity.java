package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details;

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
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25185e;
import ie0.C25190j;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import jg0.C25454q;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSymbolSearchActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.C24005a;
import p420fh.C12902d;
import p434gh.C15278a;
import ue0.C28733j0;
import ue1.C43064a;
import ue1.C43075l;
import xe0.C29760r;
import xg0.C29776j;
import xg0.C29777k;
import xg0.C29778l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity */
public final class GTWatchlistDetailsActivity extends C24009b implements C24005a.C24006a {

    /* renamed from: L */
    public static final C23989a f62287L = new C23989a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C28733j0 f62288G;

    /* renamed from: H */
    private final C41217g f62289H = new C1617p0(C41520a0.m120436b(GTWatchListDetailsViewModel$ViewModel.class), new C24000g(this), new C23999f(this), new C24001h((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f62290I = C41219i.m119470b(new C24003j(this));

    /* renamed from: J */
    private final C41217g f62291J = C41219i.m119470b(new C24004k(this));

    /* renamed from: K */
    private final C41217g f62292K = C41219i.m119470b(new C24002i(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$a */
    public static final class C23989a {
        private C23989a() {
        }

        public /* synthetic */ C23989a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60988a(Context context, BigDecimal bigDecimal, String str) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(bigDecimal, "watchListId");
            C41536l.m120489i(str, "watchListName");
            context.startActivity(new Intent(context, GTWatchlistDetailsActivity.class).putExtra("watchlist_id", bigDecimal).putExtra("watchlist_name", str));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$b */
    static final class C23990b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTWatchlistDetailsActivity f62293d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$b$a */
        static final class C23991a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTWatchlistDetailsActivity f62294d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23991a(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
                super(1);
                this.f62294d = gTWatchlistDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60990a(List list) {
                C41536l.m120489i(list, "symbols");
                C28733j0 j0Var = null;
                if (list.isEmpty()) {
                    C28733j0 I2 = this.f62294d.f62288G;
                    if (I2 == null) {
                        C41536l.m120506z("binding");
                        I2 = null;
                    }
                    I2.f73319k.setVisibility(8);
                    C28733j0 I22 = this.f62294d.f62288G;
                    if (I22 == null) {
                        C41536l.m120506z("binding");
                        I22 = null;
                    }
                    I22.f73313e.setVisibility(8);
                    C28733j0 I23 = this.f62294d.f62288G;
                    if (I23 == null) {
                        C41536l.m120506z("binding");
                        I23 = null;
                    }
                    I23.f73318j.setVisibility(0);
                } else {
                    C28733j0 I24 = this.f62294d.f62288G;
                    if (I24 == null) {
                        C41536l.m120506z("binding");
                        I24 = null;
                    }
                    I24.f73319k.setVisibility(0);
                    C28733j0 I25 = this.f62294d.f62288G;
                    if (I25 == null) {
                        C41536l.m120506z("binding");
                        I25 = null;
                    }
                    I25.f73313e.setVisibility(0);
                    C28733j0 I26 = this.f62294d.f62288G;
                    if (I26 == null) {
                        C41536l.m120506z("binding");
                        I26 = null;
                    }
                    I26.f73318j.setVisibility(8);
                    this.f62294d.m77411N2().mo6029i(list);
                }
                C28733j0 I27 = this.f62294d.f62288G;
                if (I27 == null) {
                    C41536l.m120506z("binding");
                    I27 = null;
                }
                I27.f73321m.mo53595c();
                C28733j0 I28 = this.f62294d.f62288G;
                if (I28 == null) {
                    C41536l.m120506z("binding");
                } else {
                    j0Var = I28;
                }
                j0Var.f73322n.setRefreshing(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60990a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$b$b */
        static final class C23992b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTWatchlistDetailsActivity f62295d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23992b(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
                super(1);
                this.f62295d = gTWatchlistDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "er");
                C28733j0 I2 = this.f62295d.f62288G;
                C28733j0 j0Var = null;
                if (I2 == null) {
                    C41536l.m120506z("binding");
                    I2 = null;
                }
                I2.f73322n.setRefreshing(false);
                C28733j0 I22 = this.f62295d.f62288G;
                if (I22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    j0Var = I22;
                }
                j0Var.f73321m.mo53595c();
                this.f62295d.mo74709H1(th);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$b$c */
        static final class C23993c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31128a f62296d;

            /* renamed from: e */
            final /* synthetic */ GTWatchlistDetailsActivity f62297e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23993c(C31128a aVar, GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
                super(1);
                this.f62296d = aVar;
                this.f62297e = gTWatchlistDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60992a(List list) {
                C28733j0 j0Var = null;
                if (this.f62296d.mo71341b() != 2) {
                    C28733j0 I2 = this.f62297e.f62288G;
                    if (I2 == null) {
                        C41536l.m120506z("binding");
                    } else {
                        j0Var = I2;
                    }
                    j0Var.f73321m.mo53597e();
                    return;
                }
                C28733j0 I22 = this.f62297e.f62288G;
                if (I22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    j0Var = I22;
                }
                j0Var.f73322n.setRefreshing(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60992a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23990b(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
            super(1);
            this.f62293d = gTWatchlistDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60989a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23991a(this.f62293d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23992b(this.f62293d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23993c(aVar, this.f62293d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60989a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$c */
    static final class C23994c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTWatchlistDetailsActivity f62298d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$c$a */
        static final class C23995a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTWatchlistDetailsActivity f62299d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23995a(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
                super(1);
                this.f62299d = gTWatchlistDetailsActivity;
            }

            /* renamed from: a */
            public final void mo60994a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                GTWatchlistDetailsActivity gTWatchlistDetailsActivity = this.f62299d;
                String string = gTWatchlistDetailsActivity.getString(C25190j.gt_watchlist_change_symbol_success_message);
                C41536l.m120488h(string, "getString(R.string.gt_wa…e_symbol_success_message)");
                gTWatchlistDetailsActivity.m77410M2(string, C15278a.POSITIVE);
                this.f62299d.m77411N2().mo61004q();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60994a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$c$b */
        static final class C23996b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTWatchlistDetailsActivity f62300d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23996b(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
                super(1);
                this.f62300d = gTWatchlistDetailsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                GTWatchlistDetailsActivity gTWatchlistDetailsActivity = this.f62300d;
                String string = gTWatchlistDetailsActivity.getString(C25190j.gt_watchlist_change_symbol_failure_message);
                C41536l.m120488h(string, "getString(R.string.gt_wa…e_symbol_failure_message)");
                gTWatchlistDetailsActivity.m77410M2(string, C15278a.NEGATIVE);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23994c(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
            super(1);
            this.f62298d = gTWatchlistDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60993a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C23995a(this.f62298d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23996b(this.f62298d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60993a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$d */
    static final class C23997d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62301a;

        C23997d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62301a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62301a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62301a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$e */
    static final class C23998e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTWatchlistDetailsActivity f62302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23998e(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
            super(1);
            this.f62302d = gTWatchlistDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60998a(boolean z) {
            if (z) {
                this.f62302d.m77420W2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60998a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$f */
    public static final class C23999f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23999f(ComponentActivity componentActivity) {
            super(0);
            this.f62303d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f62303d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$g */
    public static final class C24000g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24000g(ComponentActivity componentActivity) {
            super(0);
            this.f62304d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f62304d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$h */
    public static final class C24001h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62305d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f62306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24001h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f62305d = aVar;
            this.f62306e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62305d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f62306e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$i */
    static final class C24002i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTWatchlistDetailsActivity f62307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24002i(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
            super(0);
            this.f62307d = gTWatchlistDetailsActivity;
        }

        /* renamed from: b */
        public final C24005a invoke() {
            GTWatchlistDetailsActivity gTWatchlistDetailsActivity = this.f62307d;
            C24005a aVar = new C24005a(gTWatchlistDetailsActivity, gTWatchlistDetailsActivity.m77412O2());
            aVar.mo61003p(this.f62307d);
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$j */
    static final class C24003j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTWatchlistDetailsActivity f62308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24003j(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
            super(0);
            this.f62308d = gTWatchlistDetailsActivity;
        }

        /* renamed from: b */
        public final BigDecimal invoke() {
            Intent intent = this.f62308d.getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("watchlist_id") : null;
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type java.math.BigDecimal");
            return (BigDecimal) serializableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity$k */
    static final class C24004k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTWatchlistDetailsActivity f62309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24004k(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
            super(0);
            this.f62309d = gTWatchlistDetailsActivity;
        }

        public final String invoke() {
            Intent intent = this.f62309d.getIntent();
            String stringExtra = intent != null ? intent.getStringExtra("watchlist_name") : null;
            C41536l.m120487g(stringExtra, "null cannot be cast to non-null type kotlin.String");
            return stringExtra;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m77410M2(String str, C15278a aVar) {
        C12902d.C12903a.m48771e(C12902d.f38098b, this, false, 2, (Object) null).mo33652k(str, aVar, (C12902d.C12905b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final C24005a m77411N2() {
        return (C24005a) this.f62292K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final GTWatchListDetailsViewModel$ViewModel m77412O2() {
        return (GTWatchListDetailsViewModel$ViewModel) this.f62289H.getValue();
    }

    /* renamed from: P2 */
    private final BigDecimal m77413P2() {
        return (BigDecimal) this.f62290I.getValue();
    }

    /* renamed from: Q2 */
    private final String m77414Q2() {
        return (String) this.f62291J.getValue();
    }

    /* renamed from: R2 */
    private final void m77415R2() {
        m77412O2().mo60979nw().mo60978nl().mo4819k(this, new C23997d(new C23990b(this)));
        m77412O2().mo60979nw().mo60974U().mo4819k(this, new C23997d(new C23994c(this)));
    }

    /* renamed from: S2 */
    private final void m77416S2() {
        C28733j0 j0Var = this.f62288G;
        if (j0Var == null) {
            C41536l.m120506z("binding");
            j0Var = null;
        }
        j0Var.f73320l.setOnFocusChangeListener(new C23998e(this));
        j0Var.f73313e.setOnClickListener(new C29776j(this));
        j0Var.f73317i.setOnClickListener(new C29777k(this));
        RecyclerView recyclerView = j0Var.f73319k;
        recyclerView.setAdapter(m77411N2());
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        recyclerView.mo5351j(new C13364a(C0767a.m2895e(this, C25185e.f64662u)));
        j0Var.f73322n.setOnRefreshListener(new C29778l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m77417T2(GTWatchlistDetailsActivity gTWatchlistDetailsActivity, View view) {
        C41536l.m120489i(gTWatchlistDetailsActivity, "this$0");
        gTWatchlistDetailsActivity.m77420W2();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m77418U2(GTWatchlistDetailsActivity gTWatchlistDetailsActivity, View view) {
        C41536l.m120489i(gTWatchlistDetailsActivity, "this$0");
        gTWatchlistDetailsActivity.m77420W2();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m77419V2(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
        C41536l.m120489i(gTWatchlistDetailsActivity, "this$0");
        gTWatchlistDetailsActivity.m77412O2().mo60977mw().mo60972Gm(gTWatchlistDetailsActivity.m77413P2(), 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m77420W2() {
        GTSymbolSearchActivity.f61808O.mo60656a(this, C25454q.STAR, m77413P2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28733j0 d = C28733j0.m88056d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f62288G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m77416S2();
        m77415R2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m77412O2().mo60977mw().mo60972Gm(m77413P2(), 1);
    }

    /* renamed from: s */
    public void mo60986s(C29760r rVar) {
        C41536l.m120489i(rVar, "watchListSymbol");
        m77412O2().mo60977mw().mo60975a8(m77413P2(), rVar.mo69883f(), rVar.mo69881e());
    }

    /* renamed from: y */
    public void mo60987y(C29760r rVar) {
        C41536l.m120489i(rVar, "watchListSymbol");
        GTShareDetailsActivity.f61877N.mo60709a(rVar.mo69883f(), this);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return m77414Q2();
    }
}
