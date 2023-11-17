package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.navigation.fragment.NavHostFragment;
import b41.C31128a;
import b41.C31132b;
import ba1.C10220y;
import da0.C19951e;
import da0.C19953g;
import g91.C32343x;
import ha0.C24928e;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p202p0.C7556l;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepArgs;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import ta0.C28337a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity */
public final class CombinedOfferActivity extends C30772sa {

    /* renamed from: H */
    public static final C22845a f60203H = new C22845a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C24928e f60204F;

    /* renamed from: G */
    private final C41217g f60205G = new C1617p0(C41520a0.m120436b(CombinedOfferViewModel$ViewModel.class), new C22852h(this), new C22851g(this), new C22853i((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$a */
    public static final class C22845a {
        private C22845a() {
        }

        public /* synthetic */ C22845a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56924a(Context context, BigDecimal bigDecimal, String str, String str2, Integer num, Long l, boolean z, Long l2, BigDecimal bigDecimal2, boolean z2, String str3, Long l3, BigDecimal bigDecimal3, int i, BigDecimal bigDecimal4, String str4, String str5) {
            Context context2 = context;
            Long l4 = l2;
            String str6 = str3;
            C41536l.m120489i(context2, "context");
            CombinedOfferModel combinedOfferModel = r1;
            CombinedOfferModel combinedOfferModel2 = new CombinedOfferModel(str2, bigDecimal, l4, str6, str, num, z, bigDecimal2, l, z2, bigDecimal3, l3, i, bigDecimal4, str4, str5);
            Intent intent = new Intent(context2, CombinedOfferActivity.class);
            intent.putExtra("ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity.ARGS_KEY", combinedOfferModel);
            context2.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$b */
    /* synthetic */ class C22846b extends C41535k implements C43075l {
        C22846b(Object obj) {
            super(1, obj, CombinedOfferActivity.class, "onDepositTypesResult", "onDepositTypesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo56925b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CombinedOfferActivity) this.receiver).m74128M2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56925b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$c */
    static final class C22847c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferActivity f60206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22847c(CombinedOfferActivity combinedOfferActivity) {
            super(1);
            this.f60206d = combinedOfferActivity;
        }

        /* renamed from: a */
        public final void mo56926a(List list) {
            this.f60206d.m74129N2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56926a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$d */
    static final class C22848d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferActivity f60207d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22848d(CombinedOfferActivity combinedOfferActivity) {
            super(1);
            this.f60207d = combinedOfferActivity;
        }

        /* renamed from: a */
        public final void mo56927a(List list) {
            C41536l.m120489i(list, "it");
            this.f60207d.m74129N2(false);
            this.f60207d.m74125J2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56927a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$e */
    static final class C22849e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferActivity f60208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22849e(CombinedOfferActivity combinedOfferActivity) {
            super(1);
            this.f60208d = combinedOfferActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            String str;
            C41536l.m120489i(th, "err");
            this.f60208d.m74129N2(false);
            this.f60208d.mo74709H1(th);
            C24928e G2 = this.f60208d.f60204F;
            C24928e eVar = null;
            if (G2 == null) {
                C41536l.m120506z("binding");
                G2 = null;
            }
            FrameLayout frameLayout = G2.f64107e;
            C41536l.m120488h(frameLayout, "binding.errorContainer");
            C32343x.m95447f1(frameLayout);
            C24928e G22 = this.f60208d.f60204F;
            if (G22 == null) {
                C41536l.m120506z("binding");
            } else {
                eVar = G22;
            }
            PageState pageState = eVar.f64111i;
            if (th instanceof ApiError) {
                str = C32343x.m95420V(((ApiError) th).mo84685a().getKey(), C32343x.m95452h0(C10220y.f28366O0, new Object[0]), new Object[0]);
            } else {
                str = th.getMessage();
                if (str == null) {
                    str = C32343x.m95452h0(C10220y.f28366O0, new Object[0]);
                }
            }
            pageState.setTitleText(str);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$f */
    static final class C22850f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60209a;

        C22850f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60209a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60209a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60209a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$g */
    public static final class C22851g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22851g(ComponentActivity componentActivity) {
            super(0);
            this.f60210d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f60210d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$h */
    public static final class C22852h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22852h(ComponentActivity componentActivity) {
            super(0);
            this.f60211d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60211d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity$i */
    public static final class C22853i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60212d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60213e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22853i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60212d = aVar;
            this.f60213e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60212d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60213e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m74125J2(List list) {
        C41238w wVar;
        Object obj;
        String str;
        CombinedOfferModel combinedOfferModel = (CombinedOfferModel) getIntent().getParcelableExtra("ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity.ARGS_KEY");
        Iterator it = list.iterator();
        while (true) {
            wVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String name = ((DepositTypeDetailsUiModel) obj).mo57218e().name();
            if (combinedOfferModel != null) {
                str = combinedOfferModel.mo56941i();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (C41536l.m120484d(name, str)) {
                break;
            }
        }
        DepositTypeDetailsUiModel depositTypeDetailsUiModel = (DepositTypeDetailsUiModel) obj;
        if (depositTypeDetailsUiModel != null) {
            m74130O2(combinedOfferModel, depositTypeDetailsUiModel);
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            finish();
        }
    }

    /* renamed from: K2 */
    private final CombinedOfferViewModel$ViewModel m74126K2() {
        return (CombinedOfferViewModel$ViewModel) this.f60205G.getValue();
    }

    /* renamed from: L2 */
    private final void m74127L2() {
        m74126K2().mo56954jw().mo4819k(this, new C22850f(new C22846b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m74128M2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C22847c(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C22848d(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C22849e(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m74129N2(boolean z) {
        C24928e eVar = this.f60204F;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        FrameLayout frameLayout = eVar.f64108f;
        C41536l.m120488h(frameLayout, "binding.loaderContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: O2 */
    private final void m74130O2(CombinedOfferModel combinedOfferModel, DepositTypeDetailsUiModel depositTypeDetailsUiModel) {
        Fragment j0 = getSupportFragmentManager().mo4415j0(C19951e.f54529j0);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        CombinedOfferFirstStepArgs combinedOfferFirstStepArgs = new CombinedOfferFirstStepArgs(combinedOfferModel, depositTypeDetailsUiModel);
        C7556l k1 = ((NavHostFragment) j0).mo5009k1();
        k1.mo22133k0(k1.mo22114F().mo22243b(C19953g.combined_offer_nav_graph), C0908e.m3336b(C41233s.m119492a("first_step_args", combinedOfferFirstStepArgs)));
    }

    /* renamed from: P2 */
    private final void m74131P2() {
        C24928e eVar = this.f60204F;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        eVar.f64110h.setOnClickListener(new C28337a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m74132Q2(CombinedOfferActivity combinedOfferActivity, View view) {
        C41536l.m120489i(combinedOfferActivity, "this$0");
        C24928e eVar = combinedOfferActivity.f60204F;
        if (eVar == null) {
            C41536l.m120506z("binding");
            eVar = null;
        }
        FrameLayout frameLayout = eVar.f64107e;
        C41536l.m120488h(frameLayout, "binding.errorContainer");
        C32343x.m95455i0(frameLayout);
        C21481a.onRefresh$default(combinedOfferActivity.m74126K2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C24928e d = C24928e.m79690d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f60204F = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m74131P2();
        m74127L2();
    }
}
