package ls0;

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
import androidx.recyclerview.widget.RecyclerView;
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
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.loans.presentation.repayment.C32745c;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p642vh.C18368l;
import pr0.C37954g;
import ue1.C43064a;
import ue1.C43075l;
import z11.C40140b;

/* renamed from: ls0.d */
public final class C37137d extends C37134a {

    /* renamed from: Q */
    public static final C37138a f89460Q = new C37138a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private String f89461K = C32343x.m95388F("loan.repayment.details.field.account.from.label", new Object[0]);

    /* renamed from: L */
    private int f89462L = C18368l.m62762k(TextTypeView.SEPARATOR_FULL);

    /* renamed from: M */
    private C37954g f89463M;

    /* renamed from: N */
    private final C41217g f89464N;

    /* renamed from: O */
    private final C41217g f89465O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C37148f f89466P;

    /* renamed from: ls0.d$a */
    public static final class C37138a {
        private C37138a() {
        }

        public /* synthetic */ C37138a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37137d mo90119a(Long l) {
            C37137d dVar = new C37137d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARGS_SELECTED_ACCOUNT_ID", l)));
            return dVar;
        }
    }

    /* renamed from: ls0.d$b */
    static final class C37139b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StateView f89467d;

        /* renamed from: e */
        final /* synthetic */ C37137d f89468e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37139b(StateView stateView, C37137d dVar) {
            super(1);
            this.f89467d = stateView;
            this.f89468e = dVar;
        }

        /* renamed from: a */
        public final void mo90120a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f89467d.mo53597e();
            } else if (aVar instanceof C31128a.C31131c) {
                this.f89467d.mo53595c();
                C37148f g2 = this.f89468e.f89466P;
                if (g2 == null) {
                    C41536l.m120506z("adapter");
                    g2 = null;
                }
                g2.mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f89467d.mo53596d();
                this.f89468e.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90120a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ls0.d$c */
    static final class C37140c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f89469a;

        C37140c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f89469a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f89469a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f89469a.invoke(obj);
        }
    }

    /* renamed from: ls0.d$d */
    static final class C37141d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37137d f89470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37141d(C37137d dVar) {
            super(0);
            this.f89470d = dVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f89470d.getArguments();
            if (arguments != null) {
                return Long.valueOf(arguments.getLong("ARGS_SELECTED_ACCOUNT_ID"));
            }
            return null;
        }
    }

    /* renamed from: ls0.d$e */
    public static final class C37142e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f89471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37142e(C43064a aVar) {
            super(0);
            this.f89471d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f89471d.invoke();
        }
    }

    /* renamed from: ls0.d$f */
    public static final class C37143f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f89472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37143f(C41217g gVar) {
            super(0);
            this.f89472d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f89472d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ls0.d$g */
    public static final class C37144g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f89473d;

        /* renamed from: e */
        final /* synthetic */ C41217g f89474e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37144g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f89473d = aVar;
            this.f89474e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f89473d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f89474e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ls0.d$h */
    public static final class C37145h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f89475d;

        /* renamed from: e */
        final /* synthetic */ C41217g f89476e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37145h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f89475d = fragment;
            this.f89476e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f89476e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f89475d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ls0.d$i */
    static final class C37146i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37137d f89477d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37146i(C37137d dVar) {
            super(0);
            this.f89477d = dVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f89477d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C37137d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C37142e(new C37146i(this)));
        this.f89464N = C1514j0.m5374c(this, C41520a0.m120436b(C32745c.class), new C37143f(a), new C37144g((C43064a) null, a), new C37145h(this, a));
        this.f89465O = C41219i.m119470b(new C37141d(this));
    }

    /* renamed from: h2 */
    private final C37954g m109789h2() {
        C37954g gVar = this.f89463M;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: i2 */
    private final Long m109790i2() {
        return (Long) this.f89465O.getValue();
    }

    /* renamed from: j2 */
    private final C32745c m109791j2() {
        return (C32745c) this.f89464N.getValue();
    }

    /* renamed from: k2 */
    private final void m109792k2() {
        m109791j2().mo74422Fw().mo4819k(getViewLifecycleOwner(), new C37140c(new C37139b(m109789h2().f91141i, this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m109793l2(C37137d dVar, C40140b bVar) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(bVar, "selectedAccount");
        dVar.m109791j2().mo74433Rw(bVar);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m109794m2(C37137d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m109791j2().mo74438Yw();
    }

    /* renamed from: P1 */
    public int mo26363P1() {
        return this.f89462L;
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f89461K;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f89463M = C37954g.m111562d(getLayoutInflater(), viewGroup, true);
        this.f89466P = new C37148f(m109790i2(), new C37135b(this));
        RecyclerView recyclerView = m109789h2().f91138f;
        C37148f fVar = this.f89466P;
        if (fVar == null) {
            C41536l.m120506z("adapter");
            fVar = null;
        }
        recyclerView.setAdapter(fVar);
        m109789h2().f91139g.mo3946b().setOnClickListener(new C37136c(this));
        m109792k2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f89463M = null;
    }
}
