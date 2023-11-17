package vg0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import ie0.C25190j;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.changename.GTChangeWatchListNameViewModel$ViewModel;
import p434gh.C15278a;
import ue0.C28712b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: vg0.b */
public final class C29056b extends C29074i {

    /* renamed from: L */
    public static final C29058b f74039L = new C29058b((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28712b f74040G;

    /* renamed from: H */
    private final C41217g f74041H;

    /* renamed from: I */
    private final C41217g f74042I = C41219i.m119470b(new C29066j(this));

    /* renamed from: J */
    private final C41217g f74043J = C41219i.m119470b(new C29067k(this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C29057a f74044K;

    /* renamed from: vg0.b$a */
    public interface C29057a {
        /* renamed from: W */
        void mo61024W(String str, C15278a aVar);
    }

    /* renamed from: vg0.b$b */
    public static final class C29058b {
        private C29058b() {
        }

        public /* synthetic */ C29058b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29056b mo68920a(BigDecimal bigDecimal, String str, C29057a aVar) {
            C41536l.m120489i(bigDecimal, "watchListId");
            C41536l.m120489i(str, "watchListName");
            C41536l.m120489i(aVar, "changeWatchListNameListener");
            C29056b bVar = new C29056b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("watchlist_id", bigDecimal), C41233s.m119492a("watchlist_name", str)));
            bVar.f74044K = aVar;
            return bVar;
        }
    }

    /* renamed from: vg0.b$c */
    static final class C29059c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29056b f74045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29059c(C29056b bVar) {
            super(1);
            this.f74045d = bVar;
        }

        /* renamed from: a */
        public final void mo68921a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                C29057a e2 = this.f74045d.f74044K;
                if (e2 != null) {
                    String string = this.f74045d.getString(C25190j.gt_change_watchlist_name_success_message);
                    C41536l.m120488h(string, "getString(R.string.gt_ch…ist_name_success_message)");
                    e2.mo61024W(string, C15278a.POSITIVE);
                }
                this.f74045d.mo4577k1();
            } else if (aVar instanceof C31128a.C31129a) {
                C29057a e22 = this.f74045d.f74044K;
                if (e22 != null) {
                    String string2 = this.f74045d.getString(C25190j.gt_change_watchlist_name_error_message);
                    C41536l.m120488h(string2, "getString(R.string.gt_ch…hlist_name_error_message)");
                    e22.mo61024W(string2, C15278a.NEGATIVE);
                }
                this.f74045d.mo4577k1();
            } else {
                boolean z = aVar instanceof C31128a.C31130b;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68921a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vg0.b$d */
    static final class C29060d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74046a;

        C29060d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74046a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74046a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74046a.invoke(obj);
        }
    }

    /* renamed from: vg0.b$e */
    public static final class C29061e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74047d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29061e(Fragment fragment) {
            super(0);
            this.f74047d = fragment;
        }

        public final Fragment invoke() {
            return this.f74047d;
        }
    }

    /* renamed from: vg0.b$f */
    public static final class C29062f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74048d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29062f(C43064a aVar) {
            super(0);
            this.f74048d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f74048d.invoke();
        }
    }

    /* renamed from: vg0.b$g */
    public static final class C29063g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f74049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29063g(C41217g gVar) {
            super(0);
            this.f74049d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f74049d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: vg0.b$h */
    public static final class C29064h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74050d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74051e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29064h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f74050d = aVar;
            this.f74051e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f74050d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f74051e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: vg0.b$i */
    public static final class C29065i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74052d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74053e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29065i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f74052d = fragment;
            this.f74053e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f74053e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f74052d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: vg0.b$j */
    static final class C29066j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29056b f74054d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29066j(C29056b bVar) {
            super(0);
            this.f74054d = bVar;
        }

        /* renamed from: b */
        public final BigDecimal invoke() {
            Serializable serializable = this.f74054d.requireArguments().getSerializable("watchlist_id");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type java.math.BigDecimal");
            return (BigDecimal) serializable;
        }
    }

    /* renamed from: vg0.b$k */
    static final class C29067k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29056b f74055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29067k(C29056b bVar) {
            super(0);
            this.f74055d = bVar;
        }

        public final String invoke() {
            Serializable serializable = this.f74055d.requireArguments().getSerializable("watchlist_name");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type kotlin.String");
            return (String) serializable;
        }
    }

    public C29056b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C29062f(new C29061e(this)));
        this.f74041H = C1514j0.m5374c(this, C41520a0.m120436b(GTChangeWatchListNameViewModel$ViewModel.class), new C29063g(a), new C29064h((C43064a) null, a), new C29065i(this, a));
    }

    /* renamed from: g2 */
    private final C28712b m88893g2() {
        C28712b bVar = this.f74040G;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: h2 */
    private final GTChangeWatchListNameViewModel$ViewModel m88894h2() {
        return (GTChangeWatchListNameViewModel$ViewModel) this.f74041H.getValue();
    }

    /* renamed from: i2 */
    private final BigDecimal m88895i2() {
        return (BigDecimal) this.f74042I.getValue();
    }

    /* renamed from: j2 */
    private final String m88896j2() {
        return (String) this.f74043J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m88897k2(C29056b bVar, C28712b bVar2, View view) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(bVar2, "$this_with");
        bVar.m88894h2().mo60958hw().mo60961u0(bVar.m88895i2(), bVar2.f73134f.getRawText());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f74040G = C28712b.m87965d(layoutInflater, viewGroup, true);
        C28712b g2 = m88893g2();
        g2.f73133e.setOnClickListener(new C29055a(this, g2));
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(getString(C25190j.gt_change_watchlist_name_title));
        m88893g2().f73134f.getTextInput().append(m88896j2());
        m88894h2().mo60959iw().mo60960l4().mo4819k(getViewLifecycleOwner(), new C29060d(new C29059c(this)));
    }
}
