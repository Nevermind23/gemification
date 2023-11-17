package fj0;

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
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel;
import th0.C28388a;
import ue1.C43064a;
import ue1.C43075l;
import z11.C40140b;

/* renamed from: fj0.c */
public final class C20497c extends C20510e {

    /* renamed from: O */
    public static final C20498a f55503O = new C20498a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C28388a f55504K;

    /* renamed from: L */
    private final C41217g f55505L;

    /* renamed from: M */
    private final C41217g f55506M = C41219i.m119470b(new C20503e(this));

    /* renamed from: N */
    private final C41217g f55507N = C41219i.m119470b(new C20499b(this));

    /* renamed from: fj0.c$a */
    public static final class C20498a {
        private C20498a() {
        }

        public /* synthetic */ C20498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20497c mo49039a(Long l) {
            C20497c cVar = new C20497c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARGS_SELECTED_ACCOUNT_ID", l)));
            return cVar;
        }
    }

    /* renamed from: fj0.c$b */
    static final class C20499b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20497c f55508d;

        /* renamed from: fj0.c$b$a */
        static final class C20500a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20497c f55509d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20500a(C20497c cVar) {
                super(1);
                this.f55509d = cVar;
            }

            /* renamed from: a */
            public final void mo49041a(C40140b bVar) {
                C41536l.m120489i(bVar, "account");
                this.f55509d.m66725k2().mo62044w8(bVar.mo94070b());
                this.f55509d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49041a((C40140b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20499b(C20497c cVar) {
            super(0);
            this.f55508d = cVar;
        }

        /* renamed from: b */
        public final C20495b invoke() {
            return new C20495b(this.f55508d.m66724j2(), new C20500a(this.f55508d));
        }
    }

    /* renamed from: fj0.c$c */
    static final class C20501c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ StateView f55510d;

        /* renamed from: e */
        final /* synthetic */ C20497c f55511e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20501c(StateView stateView, C20497c cVar) {
            super(1);
            this.f55510d = stateView;
            this.f55511e = cVar;
        }

        /* renamed from: a */
        public final void mo49042a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f55510d.mo53597e();
            } else if (aVar instanceof C31128a.C31131c) {
                this.f55510d.mo53595c();
                this.f55511e.m66722h2().mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f55510d.mo53596d();
                this.f55511e.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49042a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: fj0.c$d */
    static final class C20502d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f55512a;

        C20502d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f55512a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f55512a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f55512a.invoke(obj);
        }
    }

    /* renamed from: fj0.c$e */
    static final class C20503e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20497c f55513d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20503e(C20497c cVar) {
            super(0);
            this.f55513d = cVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f55513d.getArguments();
            if (arguments != null) {
                return Long.valueOf(arguments.getLong("ARGS_SELECTED_ACCOUNT_ID"));
            }
            return null;
        }
    }

    /* renamed from: fj0.c$f */
    public static final class C20504f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f55514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20504f(C43064a aVar) {
            super(0);
            this.f55514d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f55514d.invoke();
        }
    }

    /* renamed from: fj0.c$g */
    public static final class C20505g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f55515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20505g(C41217g gVar) {
            super(0);
            this.f55515d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f55515d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: fj0.c$h */
    public static final class C20506h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f55516d;

        /* renamed from: e */
        final /* synthetic */ C41217g f55517e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20506h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f55516d = aVar;
            this.f55517e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f55516d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f55517e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: fj0.c$i */
    public static final class C20507i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f55518d;

        /* renamed from: e */
        final /* synthetic */ C41217g f55519e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20507i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f55518d = fragment;
            this.f55519e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f55519e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f55518d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: fj0.c$j */
    static final class C20508j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20497c f55520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20508j(C20497c cVar) {
            super(0);
            this.f55520d = cVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f55520d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C20497c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C20504f(new C20508j(this)));
        this.f55505L = C1514j0.m5374c(this, C41520a0.m120436b(GiftCardsPurchaseViewModel$ViewModel.class), new C20505g(a), new C20506h((C43064a) null, a), new C20507i(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C20495b m66722h2() {
        return (C20495b) this.f55507N.getValue();
    }

    /* renamed from: i2 */
    private final C28388a m66723i2() {
        C28388a aVar = this.f55504K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final Long m66724j2() {
        return (Long) this.f55506M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final GiftCardsPurchaseViewModel$ViewModel m66725k2() {
        return (GiftCardsPurchaseViewModel$ViewModel) this.f55505L.getValue();
    }

    private final void observeData() {
        m66725k2().mo62038qw().mo4819k(getViewLifecycleOwner(), new C20502d(new C20501c(m66723i2().f71974i, this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f55504K = C28388a.m87073d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f55504K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(C32343x.m95388F("giftcard.application.payment.method.sheet.title", new Object[0]));
        m66723i2().f71971f.setAdapter(m66722h2());
        observeData();
    }
}
