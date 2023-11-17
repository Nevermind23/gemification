package p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import b41.C31128a;
import b41.C31132b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ie0.C25185e;
import ie0.C25190j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg0.C25988g0;
import lg0.C25992i0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.WatchList;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.C24015a;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p434gh.C15278a;
import ue0.C28738m;
import ue1.C43064a;
import ue1.C43075l;
import xg0.C29767a;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d */
public final class C23824d extends C25992i0 implements C24015a.C24016a {

    /* renamed from: K */
    public static final C23825a f61974K = new C23825a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28738m f61975G;

    /* renamed from: H */
    private final C41217g f61976H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C23825a.C23826a f61977I;

    /* renamed from: J */
    private final C41217g f61978J = C41219i.m119470b(new C23837i(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$a */
    public static final class C23825a {

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$a$a */
        public interface C23826a {
            /* renamed from: K */
            void mo60706K(String str, C15278a aVar);
        }

        private C23825a() {
        }

        public /* synthetic */ C23825a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C23824d mo60791a(String str, List list, List list2, C23826a aVar) {
            C41536l.m120489i(str, "ticker");
            C41536l.m120489i(list, "currentWatchLists");
            C41536l.m120489i(list2, "watchLists");
            C41536l.m120489i(aVar, "watchListChangeListener");
            C23824d dVar = new C23824d();
            dVar.f61977I = aVar;
            Bundle bundle = new Bundle();
            bundle.putString("KEY_SHARE_SYMBOL", str);
            bundle.putParcelableArray("KEY_WATCH_LIST", (Parcelable[]) list2.toArray(new WatchList[0]));
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BigDecimal) it.next()).toString());
            }
            bundle.putStringArray("KEY_CURRENT_WATCHLISTS", (String[]) arrayList.toArray(new String[0]));
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$b */
    static final class C23827b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C23824d f61979d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$b$a */
        static final class C23828a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C23824d f61980d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23828a(C23824d dVar) {
                super(1);
                this.f61980d = dVar;
            }

            /* renamed from: a */
            public final void mo60793a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C23825a.C23826a g2 = this.f61980d.f61977I;
                if (g2 != null) {
                    String string = this.f61980d.getString(C25190j.gt_watchlist_change_symbol_success_message);
                    C41536l.m120488h(string, "getString(R.string.gt_wa…e_symbol_success_message)");
                    g2.mo60706K(string, C15278a.POSITIVE);
                }
                this.f61980d.m76969i2().f73374e.setLoading(false);
                this.f61980d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60793a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$b$b */
        static final class C23829b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C23824d f61981d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23829b(C23824d dVar) {
                super(1);
                this.f61981d = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C23825a.C23826a g2 = this.f61981d.f61977I;
                if (g2 != null) {
                    String string = this.f61981d.getString(C25190j.gt_watchlist_change_symbol_failure_message);
                    C41536l.m120488h(string, "getString(R.string.gt_wa…e_symbol_failure_message)");
                    g2.mo60706K(string, C15278a.NEGATIVE);
                }
                C1505h requireActivity = this.f61981d.requireActivity();
                C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
                ((C35388f2) requireActivity).mo74709H1(th);
                this.f61981d.m76969i2().f73374e.setLoading(false);
                this.f61981d.mo4577k1();
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$b$c */
        static final class C23830c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C23824d f61982d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23830c(C23824d dVar) {
                super(1);
                this.f61982d = dVar;
            }

            /* renamed from: a */
            public final void mo60795a(C41238w wVar) {
                this.f61982d.m76969i2().f73374e.setLoading(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60795a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23827b(C23824d dVar) {
            super(1);
            this.f61979d = dVar;
        }

        /* renamed from: a */
        public final void mo60792a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C23828a(this.f61979d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23829b(this.f61979d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23830c(this.f61979d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60792a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$c */
    static final class C23831c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61983a;

        C23831c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61983a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61983a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61983a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$d */
    public static final class C23832d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f61984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23832d(Fragment fragment) {
            super(0);
            this.f61984d = fragment;
        }

        public final Fragment invoke() {
            return this.f61984d;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$e */
    public static final class C23833e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23833e(C43064a aVar) {
            super(0);
            this.f61985d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f61985d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$f */
    public static final class C23834f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f61986d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23834f(C41217g gVar) {
            super(0);
            this.f61986d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f61986d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$g */
    public static final class C23835g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61987d;

        /* renamed from: e */
        final /* synthetic */ C41217g f61988e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23835g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f61987d = aVar;
            this.f61988e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61987d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f61988e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$h */
    public static final class C23836h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f61989d;

        /* renamed from: e */
        final /* synthetic */ C41217g f61990e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23836h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f61989d = fragment;
            this.f61990e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f61990e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f61989d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.d$i */
    static final class C23837i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C23824d f61991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23837i(C23824d dVar) {
            super(0);
            this.f61991d = dVar;
        }

        /* renamed from: b */
        public final C24015a invoke() {
            C24015a aVar = new C24015a(this.f61991d.m76970j2());
            aVar.mo61021p(this.f61991d);
            return aVar;
        }
    }

    public C23824d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C23833e(new C23832d(this)));
        this.f61976H = C1514j0.m5374c(this, C41520a0.m120436b(GTWatchListDetailsViewModel$ViewModel.class), new C23834f(a), new C23835g((C43064a) null, a), new C23836h(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C28738m m76969i2() {
        C28738m mVar = this.f61975G;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final List m76970j2() {
        String[] stringArray;
        Bundle arguments = getArguments();
        if (!(arguments == null || (stringArray = arguments.getStringArray("KEY_CURRENT_WATCHLISTS")) == null)) {
            ArrayList arrayList = new ArrayList(stringArray.length);
            for (String str : stringArray) {
                C41536l.m120488h(str, "it");
                arrayList.add(new BigDecimal(str));
            }
            List B0 = C41358y.m119991B0(arrayList);
            if (B0 != null) {
                return B0;
            }
        }
        return new ArrayList();
    }

    /* renamed from: k2 */
    private final GTWatchListDetailsViewModel$ViewModel m76971k2() {
        return (GTWatchListDetailsViewModel$ViewModel) this.f61976H.getValue();
    }

    /* renamed from: l2 */
    private final C24015a m76972l2() {
        return (C24015a) this.f61978J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m76973m2(C23824d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        String string = dVar.requireArguments().getString("KEY_SHARE_SYMBOL", "");
        List B0 = C41358y.m119991B0(dVar.m76972l2().mo61017l());
        List j2 = dVar.m76970j2();
        j2.removeAll(B0);
        C29767a mw = dVar.m76971k2().mo60977mw();
        C41536l.m120488h(string, "symbol");
        B0.removeAll(dVar.m76970j2());
        C41238w wVar = C41238w.f97225a;
        mw.mo60982wv(string, j2, B0);
    }

    /* renamed from: K0 */
    public void mo60789K0(WatchList watchList) {
        C41536l.m120489i(watchList, "watchList");
    }

    /* renamed from: M0 */
    public void mo60790M0(WatchList watchList) {
        C41536l.m120489i(watchList, "watchList");
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f61975G = C28738m.m88078d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Parcelable[] parcelableArr;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(getString(C25190j.gt_select_watchlist));
        m76969i2().f73375f.setLayoutManager(new LinearLayoutManager(getContext()));
        m76969i2().f73375f.setAdapter(m76972l2());
        m76969i2().f73375f.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C25185e.f64662u)));
        C24015a l2 = m76972l2();
        Bundle arguments = getArguments();
        if (arguments != null) {
            parcelableArr = arguments.getParcelableArray("KEY_WATCH_LIST");
        } else {
            parcelableArr = null;
        }
        C41536l.m120487g(parcelableArr, "null cannot be cast to non-null type kotlin.Array<ge.bog.mobilebank.galtandtaggart.domain.model.WatchList>");
        l2.mo6029i(C41333m.m119788O((WatchList[]) parcelableArr));
        m76969i2().f73374e.setOnClickListener(new C25988g0(this));
        m76971k2().mo60979nw().mo60974U().mo4819k(this, new C23831c(new C23827b(this)));
    }
}
