package im0;

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
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import jm0.C25478b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.C24646d;
import ue1.C43064a;
import ue1.C43075l;
import z11.C40140b;
import z71.C40174a;

/* renamed from: im0.b */
public final class C25233b extends C25232a {

    /* renamed from: O */
    public static final C25234a f64819O = new C25234a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C40174a f64820K;

    /* renamed from: L */
    private final C41217g f64821L;

    /* renamed from: M */
    private final C41217g f64822M = C41219i.m119470b(new C25239e(this));

    /* renamed from: N */
    private final C41217g f64823N = C41219i.m119470b(new C25235b(this));

    /* renamed from: im0.b$a */
    public static final class C25234a {
        private C25234a() {
        }

        public /* synthetic */ C25234a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25233b mo63756a(Long l) {
            C25233b bVar = new C25233b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARGS_SELECTED_ACCOUNT_ID", l)));
            return bVar;
        }
    }

    /* renamed from: im0.b$b */
    static final class C25235b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25233b f64824d;

        /* renamed from: im0.b$b$a */
        static final class C25236a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25233b f64825d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25236a(C25233b bVar) {
                super(1);
                this.f64825d = bVar;
            }

            /* renamed from: a */
            public final void mo63758a(C40140b bVar) {
                C41536l.m120489i(bVar, "account");
                this.f64825d.m80331k2().mo62886vw(bVar);
                this.f64825d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo63758a((C40140b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25235b(C25233b bVar) {
            super(0);
            this.f64824d = bVar;
        }

        /* renamed from: b */
        public final C25478b invoke() {
            return new C25478b(this.f64824d.m80330j2(), new C25236a(this.f64824d));
        }
    }

    /* renamed from: im0.b$c */
    static final class C25237c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StateView f64826d;

        /* renamed from: e */
        final /* synthetic */ C25233b f64827e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25237c(StateView stateView, C25233b bVar) {
            super(1);
            this.f64826d = stateView;
            this.f64827e = bVar;
        }

        /* renamed from: a */
        public final void mo63759a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f64826d.mo53597e();
            } else if (aVar instanceof C31128a.C31131c) {
                this.f64826d.mo53595c();
                this.f64827e.m80328h2().mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f64826d.mo53596d();
                this.f64827e.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63759a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: im0.b$d */
    static final class C25238d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f64828a;

        C25238d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f64828a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f64828a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f64828a.invoke(obj);
        }
    }

    /* renamed from: im0.b$e */
    static final class C25239e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25233b f64829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25239e(C25233b bVar) {
            super(0);
            this.f64829d = bVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f64829d.getArguments();
            if (arguments != null) {
                return Long.valueOf(arguments.getLong("ARGS_SELECTED_ACCOUNT_ID"));
            }
            return null;
        }
    }

    /* renamed from: im0.b$f */
    public static final class C25240f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f64830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25240f(C43064a aVar) {
            super(0);
            this.f64830d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f64830d.invoke();
        }
    }

    /* renamed from: im0.b$g */
    public static final class C25241g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f64831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25241g(C41217g gVar) {
            super(0);
            this.f64831d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f64831d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: im0.b$h */
    public static final class C25242h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f64832d;

        /* renamed from: e */
        final /* synthetic */ C41217g f64833e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25242h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f64832d = aVar;
            this.f64833e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f64832d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f64833e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: im0.b$i */
    public static final class C25243i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f64834d;

        /* renamed from: e */
        final /* synthetic */ C41217g f64835e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25243i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f64834d = fragment;
            this.f64835e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f64835e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f64834d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: im0.b$j */
    static final class C25244j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25233b f64836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25244j(C25233b bVar) {
            super(0);
            this.f64836d = bVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f64836d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C25233b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C25240f(new C25244j(this)));
        this.f64821L = C1514j0.m5374c(this, C41520a0.m120436b(C24646d.class), new C25241g(a), new C25242h((C43064a) null, a), new C25243i(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C25478b m80328h2() {
        return (C25478b) this.f64823N.getValue();
    }

    /* renamed from: i2 */
    private final C40174a m80329i2() {
        C40174a aVar = this.f64820K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final Long m80330j2() {
        return (Long) this.f64822M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C24646d m80331k2() {
        return (C24646d) this.f64821L.getValue();
    }

    private final void observeData() {
        m80331k2().mo62881pw().mo4819k(getViewLifecycleOwner(), new C25238d(new C25237c(m80329i2().f95452i, this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f64820K = C40174a.m116403d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f64820K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(C32343x.m95388F("text.travel.insurance.choose.account", new Object[0]));
        m80329i2().f95449f.setAdapter(m80328h2());
        observeData();
    }
}
