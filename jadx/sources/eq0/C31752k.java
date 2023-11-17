package eq0;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import eq0.C31738a;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p642vh.C18368l;
import sp0.C38484c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: eq0.k */
public final class C31752k extends C31750i {

    /* renamed from: Q */
    public static final C31753a f78339Q = new C31753a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private int f78340K = C18368l.m62762k(TextTypeView.SEPARATOR_FULL);

    /* renamed from: L */
    private C38484c f78341L;

    /* renamed from: M */
    public C31742c f78342M;

    /* renamed from: N */
    private final C41217g f78343N = C41219i.m119470b(new C31756c(this));

    /* renamed from: O */
    private final C41217g f78344O;

    /* renamed from: P */
    private final C41217g f78345P;

    /* renamed from: eq0.k$a */
    public static final class C31753a {
        private C31753a() {
        }

        public /* synthetic */ C31753a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31752k mo72188a(LoanAccountSelectorData loanAccountSelectorData) {
            C41536l.m120489i(loanAccountSelectorData, "data");
            C31752k kVar = new C31752k();
            kVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_SELECTOR_DATA", loanAccountSelectorData)));
            return kVar;
        }
    }

    /* renamed from: eq0.k$b */
    static final class C31754b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31752k f78346d;

        /* renamed from: eq0.k$b$a */
        /* synthetic */ class C31755a implements C31738a.C31739a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C31743d f78347a;

            C31755a(C31743d dVar) {
                this.f78347a = dVar;
            }

            /* renamed from: a */
            public final void mo72177a(LoanAccountListItem loanAccountListItem) {
                C41536l.m120489i(loanAccountListItem, "p0");
                this.f78347a.mo72179k2(loanAccountListItem);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C31738a.C31739a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f78347a, C31743d.class, "onAccountSelected", "onAccountSelected(Lge/bog/mobilebank/loanactivation/presentation/activation/model/form/account/LoanAccountListItem;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31754b(C31752k kVar) {
            super(0);
            this.f78346d = kVar;
        }

        /* renamed from: b */
        public final C31738a invoke() {
            return new C31738a(new C31755a(this.f78346d.m93950o2().mo72182iw()));
        }
    }

    /* renamed from: eq0.k$c */
    static final class C31756c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31752k f78348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31756c(C31752k kVar) {
            super(0);
            this.f78348d = kVar;
        }

        /* renamed from: b */
        public final LoanAccountSelectorData invoke() {
            Parcelable parcelable = this.f78348d.requireArguments().getParcelable("EXTRA_SELECTOR_DATA");
            C41536l.m120486f(parcelable);
            return (LoanAccountSelectorData) parcelable;
        }
    }

    /* renamed from: eq0.k$d */
    static final class C31757d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31752k f78349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31757d(C31752k kVar) {
            super(1);
            this.f78349d = kVar;
        }

        /* renamed from: a */
        public final void mo72193a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f78349d.m93952q2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f78349d.m93952q2(false);
                this.f78349d.m93947k2().mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f78349d.m93952q2(false);
                CardView cardView = this.f78349d.m93948l2().f92177h;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f78349d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72193a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eq0.k$e */
    static final class C31758e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31752k f78350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31758e(C31752k kVar) {
            super(1);
            this.f78350d = kVar;
        }

        /* renamed from: a */
        public final void mo72194a(LoanAccountListItem loanAccountListItem) {
            C41536l.m120489i(loanAccountListItem, "account");
            C1533o.m5445b(this.f78350d, "REQUEST_KEY_ACCOUNT_SELECTED", C0908e.m3336b(C41233s.m119492a("REQUEST_KEY_ACCOUNT_SELECTED", loanAccountListItem)));
            this.f78350d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72194a((LoanAccountListItem) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eq0.k$f */
    static final class C31759f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f78351a;

        C31759f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f78351a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f78351a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f78351a.invoke(obj);
        }
    }

    /* renamed from: eq0.k$g */
    public static final class C31760g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f78352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31760g(Fragment fragment) {
            super(0);
            this.f78352d = fragment;
        }

        public final Fragment invoke() {
            return this.f78352d;
        }
    }

    /* renamed from: eq0.k$h */
    public static final class C31761h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31761h(C43064a aVar) {
            super(0);
            this.f78353d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f78353d.invoke();
        }
    }

    /* renamed from: eq0.k$i */
    public static final class C31762i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f78354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31762i(C41217g gVar) {
            super(0);
            this.f78354d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f78354d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: eq0.k$j */
    public static final class C31763j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78355d;

        /* renamed from: e */
        final /* synthetic */ C41217g f78356e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31763j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f78355d = aVar;
            this.f78356e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f78355d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f78356e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: eq0.k$k */
    static final class C31764k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31752k f78357d;

        /* renamed from: eq0.k$k$a */
        static final class C31765a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C31752k f78358d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31765a(C31752k kVar) {
                super(0);
                this.f78358d = kVar;
            }

            /* renamed from: b */
            public final C31747h invoke() {
                return this.f78358d.mo72187n2().mo32808a(this.f78358d.m93949m2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31764k(C31752k kVar) {
            super(0);
            this.f78357d = kVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C31765a(this.f78357d));
        }
    }

    public C31752k() {
        C31764k kVar = new C31764k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C31761h(new C31760g(this)));
        this.f78344O = C1514j0.m5374c(this, C41520a0.m120436b(C31747h.class), new C31762i(a), new C31763j((C43064a) null, a), kVar);
        this.f78345P = C41219i.m119470b(new C31754b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C31738a m93947k2() {
        return (C31738a) this.f78345P.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final C38484c m93948l2() {
        C38484c cVar = this.f78341L;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final LoanAccountSelectorData m93949m2() {
        return (LoanAccountSelectorData) this.f78343N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final C31747h m93950o2() {
        return (C31747h) this.f78344O.getValue();
    }

    /* renamed from: p2 */
    private final void m93951p2() {
        m93950o2().mo72183jw().mo72180g().mo4819k(this, new C31759f(new C31757d(this)));
        C37224b.m109963b(m93950o2().mo72183jw().mo72181qi(), this, new C31758e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m93952q2(boolean z) {
        CardView cardView = m93948l2().f92177h;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        LoadingView loadingView = m93948l2().f92174e;
        C41536l.m120488h(loadingView, "binding.loadingView");
        C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m93953r2(C31752k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        C21481a.onRefresh$default(kVar.m93950o2(), 0, 1, (Object) null);
    }

    /* renamed from: P1 */
    public int mo26363P1() {
        return this.f78340K;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78341L = C38484c.m112949d(getLayoutInflater(), viewGroup, true);
    }

    /* renamed from: n2 */
    public final C31742c mo72187n2() {
        C31742c cVar = this.f78342M;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f78341L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m93951p2();
        mo26370a2(C32343x.m95388F(m93949m2().mo73223b().mo90086b(), new Object[0]));
        m93948l2().f92175f.setAdapter(m93947k2());
        m93948l2().f92176g.mo3946b().setOnClickListener(new C31751j(this));
    }
}
