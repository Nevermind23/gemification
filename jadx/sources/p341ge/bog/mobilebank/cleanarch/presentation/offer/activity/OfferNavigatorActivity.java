package p341ge.bog.mobilebank.cleanarch.presentation.offer.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b00.C19300h;
import g91.C32297d;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import i30.C25113b;
import i30.C25114c;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import o00.C26656a;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.LoanOfferLimitUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.offers.ExpressLoanDetailsActivity;
import p341ge.bog.mobilebank.p975ui.activities.offers.OfferNotAvailableActivity;
import p366bk.C10322k;
import p366bk.C10324m;
import p805jy.C25515c;
import p90.C27479z0;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import w00.C29189a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity */
public final class OfferNavigatorActivity extends C29189a implements C26656a, C41185v.C41186a {

    /* renamed from: H */
    public static final C21963a f58469H = new C21963a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f58470F = new C1617p0(C41520a0.m120436b(OfferNavigatorViewModel.class), new C21985w(this), new C21984v(this), new C21986x((C43064a) null, this));

    /* renamed from: G */
    private C27479z0 f58471G;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a */
    public static final class C21963a {
        private C21963a() {
        }

        public /* synthetic */ C21963a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54606a(Activity activity, OfferInfo offerInfo) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(offerInfo, "offerInfo");
            Intent intent = new Intent(activity, OfferNavigatorActivity.class);
            intent.putExtra("OFFER_INFO", offerInfo);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }

        /* renamed from: b */
        public final void mo54607b(Activity activity, OfferInfo offerInfo, String str) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(offerInfo, "offerInfo");
            C41536l.m120489i(str, "operationType");
            Intent intent = new Intent(activity, OfferNavigatorActivity.class);
            intent.putExtra("OFFER_INFO", offerInfo);
            intent.putExtra("OPERATION_TYPE", str);
            intent.putExtra("OPEN_SPECIFIC_OFFER", true);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$b */
    public /* synthetic */ class C21964b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58472a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$d[] r0 = p341ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel.C21992d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$d r1 = p341ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel.C21992d.CONSUMER_LOAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel$d r1 = p341ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel.C21992d.EXPRESS_LOAN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f58472a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.C21964b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$c */
    /* synthetic */ class C21965c extends C41535k implements C43075l {
        C21965c(Object obj) {
            super(1, obj, OfferNavigatorActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54608b(boolean z) {
            ((OfferNavigatorActivity) this.receiver).m71129b3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54608b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$d */
    static final class C21966d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21966d(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58473d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54609a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f58473d.m71124W2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54609a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$e */
    /* synthetic */ class C21967e extends C41535k implements C43075l {
        C21967e(Object obj) {
            super(1, obj, OfferNavigatorActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54610b(boolean z) {
            ((OfferNavigatorActivity) this.receiver).m71129b3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54610b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$f */
    static final class C21968f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21968f(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58474d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54611a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f58474d.m71124W2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54611a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$g */
    static final class C21969g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21969g(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58475d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54612a(C37223a aVar) {
            OfferNavigatorViewModel.C21991c cVar = (OfferNavigatorViewModel.C21991c) aVar.mo90296a();
            if (cVar != null) {
                this.f58475d.m71132e3(cVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54612a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$h */
    static final class C21970h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21970h(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58476d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54613a(C37223a aVar) {
            OfferNavigatorViewModel.C21990b bVar = (OfferNavigatorViewModel.C21990b) aVar.mo90296a();
            if (bVar != null) {
                this.f58476d.m71130c3(bVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54613a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$i */
    static final class C21971i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58477d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21971i(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58477d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54614a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f58477d.m71128a3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54614a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$j */
    static final class C21972j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58478d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21972j(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58478d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54615a(C37223a aVar) {
            OfferInfo offerInfo = (OfferInfo) aVar.mo90296a();
            if (offerInfo != null) {
                this.f58478d.m71131d3(offerInfo);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54615a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$k */
    static final class C21973k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21973k(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58479d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54616a(C37223a aVar) {
            String str;
            OfferInfo offerInfo = (OfferInfo) aVar.mo90296a();
            if (offerInfo != null) {
                OfferNavigatorActivity offerNavigatorActivity = this.f58479d;
                C38122f c = C38125h.m112238c(offerNavigatorActivity);
                String a = offerInfo.getProductCode().mo51954a();
                OfferProductType productType = offerInfo.getProductType();
                if (productType != null) {
                    str = productType.mo52056a();
                } else {
                    str = null;
                }
                c.mo91599d0(offerNavigatorActivity, a, str);
                offerNavigatorActivity.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54616a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$l */
    static final class C21974l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21974l(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58480d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54617a(C37223a aVar) {
            OfferInfo offerInfo = (OfferInfo) aVar.mo90296a();
            if (offerInfo != null) {
                this.f58480d.m71134g3(offerInfo);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54617a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$m */
    /* synthetic */ class C21975m extends C41535k implements C43075l {
        C21975m(Object obj) {
            super(1, obj, OfferNavigatorActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54618b(boolean z) {
            ((OfferNavigatorActivity) this.receiver).m71129b3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54618b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$n */
    static final class C21976n extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21976n f58481d = new C21976n();

        C21976n() {
            super(1);
        }

        /* renamed from: a */
        public final void mo54619a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54619a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$o */
    /* synthetic */ class C21977o extends C41535k implements C43075l {
        C21977o(Object obj) {
            super(1, obj, OfferNavigatorActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54620b(boolean z) {
            ((OfferNavigatorActivity) this.receiver).m71129b3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54620b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$p */
    /* synthetic */ class C21978p extends C41535k implements C43075l {
        C21978p(Object obj) {
            super(1, obj, OfferNavigatorActivity.class, "openPreContract", "openPreContract(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo54621b(String str) {
            C41536l.m120489i(str, "p0");
            ((OfferNavigatorActivity) this.receiver).m71133f3(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54621b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$q */
    static final class C21979q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21979q(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58482d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54622a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f58482d.m71124W2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54622a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$r */
    /* synthetic */ class C21980r extends C41535k implements C43075l {
        C21980r(Object obj) {
            super(1, obj, OfferNavigatorActivity.class, "onCriConfirmationLoading", "onCriConfirmationLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54623b(boolean z) {
            ((OfferNavigatorActivity) this.receiver).m71126Y2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54623b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$s */
    /* synthetic */ class C21981s extends C41535k implements C43075l {
        C21981s(Object obj) {
            super(1, obj, OfferNavigatorActivity.class, "onCriConfirmationError", "onCriConfirmationError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo54624b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OfferNavigatorActivity) this.receiver).m71125X2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54624b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$t */
    static final class C21982t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OfferNavigatorActivity f58483d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21982t(OfferNavigatorActivity offerNavigatorActivity) {
            super(1);
            this.f58483d = offerNavigatorActivity;
        }

        /* renamed from: a */
        public final void mo54625a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f58483d.m71127Z2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54625a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$u */
    static final class C21983u implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58484a;

        C21983u(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58484a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58484a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58484a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$v */
    public static final class C21984v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21984v(ComponentActivity componentActivity) {
            super(0);
            this.f58485d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58485d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$w */
    public static final class C21985w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58486d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21985w(ComponentActivity componentActivity) {
            super(0);
            this.f58486d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58486d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$x */
    public static final class C21986x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58487d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58488e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21986x(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58487d = aVar;
            this.f58488e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58487d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58488e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: O2 */
    private final void m71116O2(Bundle bundle, String str) {
        if (bundle.getBoolean(str)) {
            finish();
        }
    }

    /* renamed from: P2 */
    private final C27113k m71117P2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: Q2 */
    private final C41185v m71118Q2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: R2 */
    private final OfferNavigatorViewModel m71119R2() {
        return (OfferNavigatorViewModel) this.f58470F.getValue();
    }

    /* renamed from: S2 */
    private final void m71120S2() {
        m71119R2().mo54670mx().mo4819k(this, new C21983u(new C21974l(this)));
        C21484c.m69412d(m71119R2().mo54660Rw(), this, (C43075l) null, new C21975m(this), C21976n.f58481d, 2, (Object) null);
        C21484c.m69411c(m71119R2().mo54658Pw(), this, new C21978p(this), new C21977o(this), new C21979q(this));
        C21484c.m69411c(m71119R2().mo54662Xw(), this, new C21982t(this), new C21980r(this), new C21981s(this));
        C21484c.m69412d(m71119R2().mo54666cx(), this, (C43075l) null, new C21965c(this), new C21966d(this), 2, (Object) null);
        C21484c.m69412d(m71119R2().mo54661Sw(), this, (C43075l) null, new C21967e(this), new C21968f(this), 2, (Object) null);
        m71119R2().mo54665bx().mo4819k(this, new C21983u(new C21969g(this)));
        m71119R2().mo54659Qw().mo4819k(this, new C21983u(new C21970h(this)));
        m71119R2().mo54663Zw().mo4819k(this, new C21983u(new C21971i(this)));
        m71119R2().mo54664ax().mo4819k(this, new C21983u(new C21972j(this)));
        m71119R2().mo54668jx().mo4819k(this, new C21983u(new C21973k(this)));
    }

    /* renamed from: T2 */
    private final void m71121T2() {
        getSupportFragmentManager().mo4367F1("UnknownOfferActionSheet_REQUEST_KEY", this, new C25113b(this));
        getSupportFragmentManager().mo4367F1("InstallmentActionSheet_REQUEST_KEY", this, new C25114c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m71122U2(OfferNavigatorActivity offerNavigatorActivity, String str, Bundle bundle) {
        C41536l.m120489i(offerNavigatorActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        offerNavigatorActivity.m71116O2(bundle, "UnknownOfferActionSheet_DISMISS_KEY");
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m71123V2(OfferNavigatorActivity offerNavigatorActivity, String str, Bundle bundle) {
        C41536l.m120489i(offerNavigatorActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        offerNavigatorActivity.m71116O2(bundle, "InstallmentActionSheet_DISMISS_KEY");
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m71124W2(String str) {
        OfferNotAvailableActivity.m105310E2(this, str);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m71125X2(C21503d.C21504a aVar) {
        if (aVar.mo53708h()) {
            C41185v Q2 = m71118Q2();
            if (Q2 != null) {
                Q2.mo95634K2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
                return;
            }
            return;
        }
        C41185v Q22 = m71118Q2();
        if (Q22 != null) {
            Q22.mo4577k1();
        }
        C27113k P2 = m71117P2();
        if (P2 != null) {
            P2.mo4577k1();
        }
        mo52674G1(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m71126Y2(boolean z) {
        C41185v Q2 = m71118Q2();
        if (Q2 != null) {
            Q2.mo95635L2(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m71127Z2() {
        C41185v Q2 = m71118Q2();
        if (Q2 != null) {
            Q2.mo4577k1();
        }
        C27113k P2 = m71117P2();
        if (P2 != null) {
            P2.mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m71128a3() {
        C32297d.m95153a(this);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m71129b3(boolean z) {
        C27479z0 z0Var = this.f58471G;
        if (z0Var == null) {
            C41536l.m120506z("binding");
            z0Var = null;
        }
        z0Var.f70324e.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m71130c3(OfferNavigatorViewModel.C21990b bVar) {
        if (bVar.mo54672a().size() == 1) {
            CreditOfferApplicationActivity.f57807L.mo54011a(this, (CreditOfferLimitUiModel) C41358y.m120007W(bVar.mo54672a()), bVar.mo54673b().getOfferNo());
        } else {
            CreditOfferListActivity.f58451J.mo54595b(this, bVar.mo54673b(), new ArrayList(bVar.mo54672a()));
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m71131d3(OfferInfo offerInfo) {
        C27479z0 z0Var = this.f58471G;
        if (z0Var == null) {
            C41536l.m120506z("binding");
            z0Var = null;
        }
        z0Var.f70325f.setBackgroundColor(C0767a.m2893c(this, 17170445));
        C27479z0 z0Var2 = this.f58471G;
        if (z0Var2 == null) {
            C41536l.m120506z("binding");
            z0Var2 = null;
        }
        z0Var2.f70324e.setVisibility(8);
        C19300h.f53525M.mo47526a(offerInfo.getProductName()).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m71132e3(OfferNavigatorViewModel.C21991c cVar) {
        if (cVar.mo54674a().size() == 1) {
            LoanOfferLimitUiModel loanOfferLimitUiModel = (LoanOfferLimitUiModel) C41358y.m120007W(cVar.mo54674a());
            int i = C21964b.f58472a[cVar.mo54675b().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ExpressLoanDetailsActivity.f85735W.mo86474a(this, cVar.mo54676c().getOfferNo(), loanOfferLimitUiModel.mo54646e().mo66359b(), loanOfferLimitUiModel.mo54648f().mo51954a(), loanOfferLimitUiModel.mo54649g());
                }
            } else if (cVar.mo54677d()) {
                C38125h.m112238c(this).mo91543C0(this, cVar.mo54676c().getOfferNo(), loanOfferLimitUiModel.mo54646e().mo66359b(), cVar.mo54676c().getProductCode());
            } else {
                ConsumerLoanDetailsActivity.f56186o0.mo49769a(this, cVar.mo54676c().getOfferNo(), loanOfferLimitUiModel.mo54646e(), loanOfferLimitUiModel.mo54648f(), loanOfferLimitUiModel.mo54649g(), cVar.mo54676c().getRequestedAmount());
            }
        } else if (cVar.mo54675b() != OfferNavigatorViewModel.C21992d.CONSUMER_LOAN || !cVar.mo54677d()) {
            LoanOfferListActivity.f58461J.mo54599a(this, cVar.mo54676c(), new ArrayList(cVar.mo54674a()));
        } else {
            C38125h.m112238c(this).mo91598d(this, new ArrayList(cVar.mo54674a()), cVar.mo54676c().getOfferNo(), cVar.mo54676c().getProductName(), cVar.mo54676c().getEffectiveInterestRate(), cVar.mo54676c().getProductCode());
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m71133f3(String str) {
        C27113k c = C27113k.C27114a.m84066c(C27113k.f68083P, str, true, (String) null, (ArrayList) null, (Summary) null, (String) null, 60, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m71134g3(OfferInfo offerInfo) {
        C27479z0 z0Var = this.f58471G;
        if (z0Var == null) {
            C41536l.m120506z("binding");
            z0Var = null;
        }
        z0Var.f70325f.setBackgroundColor(C0767a.m2893c(this, 17170445));
        C27479z0 z0Var2 = this.f58471G;
        if (z0Var2 == null) {
            C41536l.m120506z("binding");
            z0Var2 = null;
        }
        z0Var2.f70324e.setVisibility(8);
        C25515c.f65187N.mo64064a(offerInfo).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: h3 */
    private final void m71135h3() {
        C38125h.m112238c(this).mo91558K(this);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_offer_navigator;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m71119R2().mo54657Dw(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("OFFER_INFO");
        C41536l.m120486f(parcelableExtra);
        OfferInfo offerInfo = (OfferInfo) parcelableExtra;
        if (offerInfo.getOfferScheme() == OfferInfo.C20999b.BNPL) {
            m71135h3();
            return;
        }
        super.mo37451O1(bundle);
        C27479z0 a = C27479z0.m85223a(findViewById(C10322k.f28864lt));
        C41536l.m120488h(a, "bind(findViewById(R.id.root))");
        this.f58471G = a;
        m71120S2();
        m71121T2();
        m71119R2().mo54671nx(offerInfo, getIntent().getStringExtra("OPERATION_TYPE"), getIntent().getBooleanExtra("OPEN_SPECIFIC_OFFER", false));
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C27113k P2 = m71117P2();
        if (P2 != null) {
            P2.mo66413u2(str);
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        C27113k P2 = m71117P2();
        if (P2 != null) {
            P2.mo66414v2(z);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: m */
    public void mo39137m() {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, "CLIENTS_CONFIRMATION_ON_CREDIT_INFO", m71119R2().mo54667ix(OfferNavigatorViewModel.m71210lx(m71119R2(), (String) null, (String) null, (String) null, false, 7, (Object) null)), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }
}
