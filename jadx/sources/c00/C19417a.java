package c00;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b00.C19305k;
import d00.C19813b;
import e00.C20119a;
import e00.C20120b;
import g91.C32343x;
import h00.C24849e;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.C21364a;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.p975ui.activities.CashCoverLoanActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import p642vh.C18368l;
import p759fv.C20559a;
import p90.C27303g;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: c00.a */
public final class C19417a extends C21364a {

    /* renamed from: O */
    public static final C19418a f53640O = new C19418a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C27303g f53641K;

    /* renamed from: L */
    private final C41217g f53642L;

    /* renamed from: M */
    private final C41217g f53643M = C41219i.m119470b(new C19424g(this));

    /* renamed from: N */
    private int f53644N = C18368l.m62762k(TextTypeView.SEPARATOR_FULL);

    /* renamed from: c00.a$a */
    public static final class C19418a {
        private C19418a() {
        }

        public /* synthetic */ C19418a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19417a mo47651a(boolean z) {
            C19417a aVar = new C19417a();
            Bundle bundle = new Bundle();
            bundle.putBoolean("OPENED_FROM_OFFERS", z);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: c00.a$b */
    public /* synthetic */ class C19419b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53645a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                e00.a[] r0 = e00.C20119a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                e00.a r1 = e00.C20119a.DEBIT_CARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                e00.a r1 = e00.C20119a.DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                e00.a r1 = e00.C20119a.DEP_LOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                e00.a r1 = e00.C20119a.CREDIT_APPLICATION     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                e00.a r1 = e00.C20119a.GT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                e00.a r1 = e00.C20119a.CAS_CLIENT_SERVICE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                e00.a r1 = e00.C20119a.INSURANCE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                e00.a r1 = e00.C20119a.BNPL_APPLICATION     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f53645a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c00.C19417a.C19419b.<clinit>():void");
        }
    }

    /* renamed from: c00.a$c */
    static final class C19420c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19417a f53646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19420c(C19417a aVar) {
            super(1);
            this.f53646d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m64930c(C19417a aVar, C20120b bVar) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(bVar, "productType");
            aVar.m64924l2(bVar.mo48546b());
        }

        /* renamed from: b */
        public final void mo47652b(List list) {
            boolean z;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f53646d.mo4577k1();
                return;
            }
            LoadingView loadingView = this.f53646d.m64920h2().f68746g;
            C41536l.m120488h(loadingView, "binding.skeletonLoading");
            C32343x.m95483r1(loadingView, false, false, 2, (Object) null);
            RecyclerView recyclerView = this.f53646d.m64920h2().f68745f;
            C19813b bVar = new C19813b();
            C19417a aVar = this.f53646d;
            bVar.mo6029i(list);
            bVar.mo48113o(new C19431b(aVar));
            recyclerView.setAdapter(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47652b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c00.a$d */
    /* synthetic */ class C19421d extends C41535k implements C43075l {
        C19421d(Object obj) {
            super(1, obj, C19417a.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo47653b(boolean z) {
            ((C19417a) this.receiver).mo47650m2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47653b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: c00.a$e */
    /* synthetic */ class C19422e extends C41535k implements C43075l {
        C19422e(Object obj) {
            super(1, obj, C19417a.class, "handleNewLoanClick", "handleNewLoanClick(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo47654b(boolean z) {
            ((C19417a) this.receiver).m64923k2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47654b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: c00.a$f */
    /* synthetic */ class C19423f extends C41535k implements C43075l {
        C19423f(Object obj) {
            super(1, obj, C19417a.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo47655b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C19417a) this.receiver).handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47655b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c00.a$g */
    static final class C19424g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19417a f53647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19424g(C19417a aVar) {
            super(0);
            this.f53647d = aVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f53647d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("OPENED_FROM_OFFERS") : false);
        }
    }

    /* renamed from: c00.a$h */
    static final class C19425h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f53648a;

        C19425h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f53648a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f53648a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f53648a.invoke(obj);
        }
    }

    /* renamed from: c00.a$i */
    public static final class C19426i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53649d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19426i(Fragment fragment) {
            super(0);
            this.f53649d = fragment;
        }

        public final Fragment invoke() {
            return this.f53649d;
        }
    }

    /* renamed from: c00.a$j */
    public static final class C19427j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19427j(C43064a aVar) {
            super(0);
            this.f53650d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f53650d.invoke();
        }
    }

    /* renamed from: c00.a$k */
    public static final class C19428k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f53651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19428k(C41217g gVar) {
            super(0);
            this.f53651d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f53651d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: c00.a$l */
    public static final class C19429l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53652d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53653e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19429l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f53652d = aVar;
            this.f53653e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f53652d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f53653e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: c00.a$m */
    public static final class C19430m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53654d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53655e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19430m(Fragment fragment, C41217g gVar) {
            super(0);
            this.f53654d = fragment;
            this.f53655e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f53655e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f53654d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C19417a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C19427j(new C19426i(this)));
        this.f53642L = C1514j0.m5374c(this, C41520a0.m120436b(NewProductViewModel$ViewModel.class), new C19428k(a), new C19429l((C43064a) null, a), new C19430m(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C27303g m64920h2() {
        C27303g gVar = this.f53641K;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: i2 */
    private final boolean m64921i2() {
        return ((Boolean) this.f53643M.getValue()).booleanValue();
    }

    /* renamed from: j2 */
    private final NewProductViewModel$ViewModel m64922j2() {
        return (NewProductViewModel$ViewModel) this.f53642L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final void m64923k2(boolean z) {
        if (z) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            c.mo91590a(requireContext2);
            mo4577k1();
            return;
        }
        C19305k.f53530L.mo47528a().mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m64924l2(C20119a aVar) {
        String str;
        String str2;
        String str3;
        switch (C19419b.f53645a[aVar.ordinal()]) {
            case 1:
                C36546y.m108282F().mo27152s("applications", "applications_new_application", "open_debit_card_choice");
                Context requireContext = requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                C38122f c = C38125h.m112238c(requireContext);
                C1505h requireActivity = requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                c.mo91597c0(requireActivity);
                break;
            case 2:
                C32343x.m95395I0(this, "applications", "applications_new_application", "open_deposit_choice", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
                Context requireContext2 = requireContext();
                C41536l.m120488h(requireContext2, "requireContext()");
                C38122f c2 = C38125h.m112238c(requireContext2);
                Context requireContext3 = requireContext();
                C41536l.m120488h(requireContext3, "requireContext()");
                C38122f.C38123a.m112225u(c2, requireContext3, (String) null, 2, (Object) null);
                break;
            case 3:
                startActivity(new Intent(requireContext(), CashCoverLoanActivity.class));
                break;
            case 4:
                m64922j2().mo53377ow();
                return;
            case 5:
                Context requireContext4 = requireContext();
                C41536l.m120488h(requireContext4, "requireContext()");
                C38122f c3 = C38125h.m112238c(requireContext4);
                Context requireContext5 = requireContext();
                C41536l.m120488h(requireContext5, "requireContext()");
                C38122f.C38123a.m112226v(c3, requireContext5, (String) null, (String) null, false, 14, (Object) null);
                break;
            case 6:
                if (m64921i2()) {
                    str = "piggy_bank_click_more_menu_offers_and_applications";
                } else {
                    str = "piggy_bank_click_new_product_menu";
                }
                C32343x.m95395I0(this, "piggy_bank", (String) null, str, C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
                Context requireContext6 = requireContext();
                C41536l.m120488h(requireContext6, "requireContext()");
                C38122f c4 = C38125h.m112238c(requireContext6);
                Context requireContext7 = requireContext();
                C41536l.m120488h(requireContext7, "requireContext()");
                c4.mo91642z(requireContext7);
                break;
            case 7:
                C20559a.C20570k kVar = new C20559a.C20570k(m64921i2());
                C10463g F = C36546y.m108282F();
                C41536l.m120488h(F, "getAnalytics()");
                kVar.mo49091a(F);
                Context requireContext8 = requireContext();
                C41536l.m120488h(requireContext8, "requireContext()");
                C38122f c5 = C38125h.m112238c(requireContext8);
                Context requireContext9 = requireContext();
                C41536l.m120488h(requireContext9, "requireContext()");
                C38122f.C38123a.m112227w(c5, requireContext9, (String) null, 2, (Object) null);
                break;
            case 8:
                C10463g F2 = C36546y.m108282F();
                if (m64921i2()) {
                    str2 = "Offers_Page";
                } else {
                    str2 = "Products_page";
                }
                F2.mo27152s("applications", str2, "Request_bnpl_limit");
                C10463g F3 = C36546y.m108282F();
                if (m64921i2()) {
                    str3 = "BNPL_request_limit_offerpage";
                } else {
                    str3 = "BNPL_request_limit_productpage";
                }
                F3.mo27137H(str3, "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
                Context requireContext10 = requireContext();
                C41536l.m120488h(requireContext10, "requireContext()");
                C38122f c6 = C38125h.m112238c(requireContext10);
                C24849e eVar = C24849e.BNPL_LIMIT;
                Context requireContext11 = requireContext();
                C41536l.m120488h(requireContext11, "requireContext()");
                c6.mo91637w0(eVar, requireContext11);
                break;
        }
        mo4577k1();
    }

    private final void observeData() {
        m64922j2().mo53375mw().mo47660t3().mo4819k(this, new C19425h(new C19420c(this)));
        C21484c.m69411c(m64922j2().mo53375mw().mo47661v(), this, new C19422e(this), new C19421d(this), new C19423f(this));
    }

    /* renamed from: P1 */
    public int mo26363P1() {
        return this.f53644N;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53641K = C27303g.m84516d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C10328q.new_product));
        observeData();
    }

    /* renamed from: m2 */
    public final void mo47650m2(boolean z) {
        ProgressBar progressBar = m64920h2().f68744e;
        C41536l.m120488h(progressBar, "binding.circleLoading");
        C32343x.m95483r1(progressBar, z, false, 2, (Object) null);
    }
}
