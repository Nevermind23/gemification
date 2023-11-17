package yg0;

import android.content.Context;
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
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.edit.GTEditWatchListViewModel$ViewModel;
import p434gh.C15278a;
import ue0.C28730i;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: yg0.e */
public final class C30036e extends C30055l {

    /* renamed from: M */
    public static final C30037a f75865M = new C30037a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28730i f75866G;

    /* renamed from: H */
    private final C41217g f75867H;

    /* renamed from: I */
    private final C41217g f75868I = C41219i.m119470b(new C30047k(this));

    /* renamed from: J */
    private final C41217g f75869J = C41219i.m119470b(new C30048l(this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C30039c f75870K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C30038b f75871L;

    /* renamed from: yg0.e$a */
    public static final class C30037a {
        private C30037a() {
        }

        public /* synthetic */ C30037a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C30036e mo70332a(BigDecimal bigDecimal, String str, C30039c cVar, C30038b bVar) {
            C41536l.m120489i(bigDecimal, "watchListId");
            C41536l.m120489i(str, "watchListName");
            C41536l.m120489i(cVar, "editWatchListListener");
            C41536l.m120489i(bVar, "deleteWatchListListener");
            C30036e eVar = new C30036e();
            eVar.setArguments(C0908e.m3336b(C41233s.m119492a("watchlist_id", bigDecimal), C41233s.m119492a("watchlist_name", str)));
            eVar.f75870K = cVar;
            eVar.f75871L = bVar;
            return eVar;
        }
    }

    /* renamed from: yg0.e$b */
    public interface C30038b {
        /* renamed from: d0 */
        void mo61025d0(String str, C15278a aVar);
    }

    /* renamed from: yg0.e$c */
    public interface C30039c {
        /* renamed from: v0 */
        void mo61026v0(BigDecimal bigDecimal, String str);
    }

    /* renamed from: yg0.e$d */
    static final class C30040d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30036e f75872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30040d(C30036e eVar) {
            super(1);
            this.f75872d = eVar;
        }

        /* renamed from: a */
        public final void mo70333a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                C30038b h2 = this.f75872d.f75871L;
                if (h2 != null) {
                    String string = this.f75872d.getString(C25190j.gt_edit_watchlist_delete_success_message);
                    C41536l.m120488h(string, "getString(R.string.gt_ed…t_delete_success_message)");
                    h2.mo61025d0(string, C15278a.POSITIVE);
                }
                this.f75872d.mo4577k1();
            } else if (aVar instanceof C31128a.C31129a) {
                C30038b h22 = this.f75872d.f75871L;
                if (h22 != null) {
                    String string2 = this.f75872d.getString(C25190j.gt_edit_watchlist_delete_error_message);
                    C41536l.m120488h(string2, "getString(R.string.gt_ed…ist_delete_error_message)");
                    h22.mo61025d0(string2, C15278a.NEGATIVE);
                }
                this.f75872d.mo4577k1();
            } else {
                boolean z = aVar instanceof C31128a.C31130b;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70333a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yg0.e$e */
    static final class C30041e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f75873a;

        C30041e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f75873a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f75873a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f75873a.invoke(obj);
        }
    }

    /* renamed from: yg0.e$f */
    public static final class C30042f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f75874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30042f(Fragment fragment) {
            super(0);
            this.f75874d = fragment;
        }

        public final Fragment invoke() {
            return this.f75874d;
        }
    }

    /* renamed from: yg0.e$g */
    public static final class C30043g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f75875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30043g(C43064a aVar) {
            super(0);
            this.f75875d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f75875d.invoke();
        }
    }

    /* renamed from: yg0.e$h */
    public static final class C30044h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f75876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30044h(C41217g gVar) {
            super(0);
            this.f75876d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f75876d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: yg0.e$i */
    public static final class C30045i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f75877d;

        /* renamed from: e */
        final /* synthetic */ C41217g f75878e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30045i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f75877d = aVar;
            this.f75878e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f75877d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f75878e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: yg0.e$j */
    public static final class C30046j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f75879d;

        /* renamed from: e */
        final /* synthetic */ C41217g f75880e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30046j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f75879d = fragment;
            this.f75880e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f75880e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f75879d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: yg0.e$k */
    static final class C30047k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30036e f75881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30047k(C30036e eVar) {
            super(0);
            this.f75881d = eVar;
        }

        /* renamed from: b */
        public final BigDecimal invoke() {
            Serializable serializable = this.f75881d.requireArguments().getSerializable("watchlist_id");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type java.math.BigDecimal");
            return (BigDecimal) serializable;
        }
    }

    /* renamed from: yg0.e$l */
    static final class C30048l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30036e f75882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30048l(C30036e eVar) {
            super(0);
            this.f75882d = eVar;
        }

        public final String invoke() {
            Serializable serializable = this.f75882d.requireArguments().getSerializable("watchlist_name");
            C41536l.m120487g(serializable, "null cannot be cast to non-null type kotlin.String");
            return (String) serializable;
        }
    }

    public C30036e() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C30043g(new C30042f(this)));
        this.f75867H = C1514j0.m5374c(this, C41520a0.m120436b(GTEditWatchListViewModel$ViewModel.class), new C30044h(a), new C30045i((C43064a) null, a), new C30046j(this, a));
    }

    /* renamed from: k2 */
    private final C28730i m91004k2() {
        C28730i iVar = this.f75866G;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* renamed from: l2 */
    private final GTEditWatchListViewModel$ViewModel m91005l2() {
        return (GTEditWatchListViewModel$ViewModel) this.f75867H.getValue();
    }

    /* renamed from: m2 */
    private final BigDecimal m91006m2() {
        return (BigDecimal) this.f75868I.getValue();
    }

    /* renamed from: n2 */
    private final String m91007n2() {
        return (String) this.f75869J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m91008o2(C30036e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C30039c cVar = eVar.f75870K;
        if (cVar != null) {
            cVar.mo61026v0(eVar.m91006m2(), eVar.m91007n2());
        }
        eVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m91009p2(C30036e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m91010q2();
    }

    /* renamed from: q2 */
    private final void m91010q2() {
        C13310d dVar = new C13310d();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "this@GTEditWatchListActionSheet.requireContext()");
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(requireContext.getString(C25190j.gt_delete_watchlist_dialog_title));
        dVar.mo35639Q1(requireContext.getString(C25190j.gt_delete_watchlist_dialog_header));
        dVar.mo35646Z1(requireContext.getString(C25190j.gt_delete_watchlist_dialog_button_positive));
        dVar.mo35642U1(requireContext.getString(C25190j.gt_delete_watchlist_dialog_button_negative));
        dVar.mo35645Y1(new C30034c(this, dVar));
        dVar.mo35641T1(new C30035d(dVar, this));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m91011r2(C30036e eVar, C13310d dVar, Button button) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        eVar.m91005l2().mo61008hw().mo61006H(eVar.m91006m2());
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m91012s2(C13310d dVar, C30036e eVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        eVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f75866G = C28730i.m88043d(layoutInflater, viewGroup, true);
        C28730i k2 = m91004k2();
        k2.f73289f.setOnClickListener(new C30032a(this));
        k2.f73288e.setOnClickListener(new C30033b(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(getString(C25190j.gt_edit_watchlist_title));
        m91005l2().mo61009iw().mo61010ra().mo4819k(getViewLifecycleOwner(), new C30041e(new C30040d(this)));
    }
}
