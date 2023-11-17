package p341ge.bog.mobilebank.consumerloanapplication.presentation.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import com.salesforce.marketingcloud.UrlHandler;
import g91.C32343x;
import h00.C24846c;
import h80.C24904k;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import k90.C25686a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l90.C25848a;
import m41.C37224b;
import n90.C26390b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.result.C22700d;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity */
public final class LimitResultActivity extends C22696a {

    /* renamed from: L */
    public static final C22680a f59889L = new C22680a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C24904k f59890G;

    /* renamed from: H */
    public C22700d.C22706d f59891H;

    /* renamed from: I */
    private final C41217g f59892I = C41219i.m119470b(new C22690j(this));

    /* renamed from: J */
    private final C41217g f59893J = new C1617p0(C41520a0.m120436b(C22700d.class), new C22692l(this), new C22694n(this), new C22693m((C43064a) null, this));

    /* renamed from: K */
    private final C41217g f59894K = C41219i.m119470b(new C22681b(this));

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$a */
    public static final class C22680a {
        private C22680a() {
        }

        public /* synthetic */ C22680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ void m73532c(C22680a aVar, Context context, boolean z, String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, int i, Object obj) {
            int i2 = i;
            aVar.mo56219b(context, z, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : bigDecimal, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5);
        }

        /* renamed from: a */
        public final void mo56218a(Context context, ResultData resultData) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(resultData, "resultData");
            Intent putExtra = new Intent(context, LimitResultActivity.class).putExtra("EXTRA_RESULT_DATA", resultData);
            C41536l.m120488h(putExtra, "Intent(context, LimitRes…_RESULT_DATA, resultData)");
            context.startActivity(putExtra);
        }

        /* renamed from: b */
        public final void mo56219b(Context context, boolean z, String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5) {
            Context context2 = context;
            String str6 = str;
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "status");
            C24846c a = C24846c.f63808e.mo63281a(str);
            if (a == null) {
                a = C24846c.ERROR;
            }
            mo56218a(context, new ResultData(z, a, str2, str3, bigDecimal, str4, str5));
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$b */
    static final class C22681b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22681b(LimitResultActivity limitResultActivity) {
            super(0);
            this.f59895d = limitResultActivity;
        }

        /* renamed from: b */
        public final C25848a invoke() {
            return new C25848a(this.f59895d.m73524M2().mo56246uw());
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$c */
    static final class C22682c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59896d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22682c(LimitResultActivity limitResultActivity) {
            super(1);
            this.f59896d = limitResultActivity;
        }

        /* renamed from: a */
        public final void mo56221a(C31128a aVar) {
            C24904k kVar = null;
            if (aVar instanceof C31128a.C31130b) {
                C24904k G2 = this.f59896d.f59890G;
                if (G2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    kVar = G2;
                }
                FrameLayout frameLayout = kVar.f64000f;
                C41536l.m120488h(frameLayout, "binding.progressBarContainer");
                C32343x.m95447f1(frameLayout);
            } else if (aVar instanceof C31128a.C31131c) {
                C24904k G22 = this.f59896d.f59890G;
                if (G22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    kVar = G22;
                }
                FrameLayout frameLayout2 = kVar.f64000f;
                C41536l.m120488h(frameLayout2, "binding.progressBarContainer");
                C32343x.m95455i0(frameLayout2);
            } else if (aVar instanceof C31128a.C31129a) {
                C24904k G23 = this.f59896d.f59890G;
                if (G23 == null) {
                    C41536l.m120506z("binding");
                    G23 = null;
                }
                CardView cardView = G23.f64003i;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                C24904k G24 = this.f59896d.f59890G;
                if (G24 == null) {
                    C41536l.m120506z("binding");
                } else {
                    kVar = G24;
                }
                FrameLayout frameLayout3 = kVar.f64000f;
                C41536l.m120488h(frameLayout3, "binding.progressBarContainer");
                C32343x.m95455i0(frameLayout3);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56221a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$d */
    static final class C22683d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22683d(LimitResultActivity limitResultActivity) {
            super(1);
            this.f59897d = limitResultActivity;
        }

        /* renamed from: a */
        public final void mo56222a(OfferInfo offerInfo) {
            C41536l.m120489i(offerInfo, "offer");
            OfferNavigatorActivity.f58469H.mo54606a(this.f59897d, offerInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56222a((OfferInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$e */
    static final class C22684e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59898d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$e$a */
        public /* synthetic */ class C22685a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f59899a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    n90.b[] r0 = n90.C26390b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    n90.b r1 = n90.C26390b.OPEN_OFFERS     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    n90.b r1 = n90.C26390b.RETURN_HOME     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f59899a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity.C22684e.C22685a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22684e(LimitResultActivity limitResultActivity) {
            super(1);
            this.f59898d = limitResultActivity;
        }

        /* renamed from: a */
        public final void mo56223a(C26390b bVar) {
            C41536l.m120489i(bVar, UrlHandler.ACTION);
            int i = C22685a.f59899a[bVar.ordinal()];
            if (i == 1) {
                OffersAndApplicationsActivity.C21371b.m69137b(OffersAndApplicationsActivity.f57206M, this.f59898d, false, 2, (Object) null);
                this.f59898d.finish();
            } else if (i == 2) {
                this.f59898d.m73527P2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56223a((C26390b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$f */
    static final class C22686f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22686f(LimitResultActivity limitResultActivity) {
            super(1);
            this.f59900d = limitResultActivity;
        }

        /* renamed from: a */
        public final void mo56224a(OfferInfo offerInfo) {
            C41536l.m120489i(offerInfo, "offerInfo");
            OfferNavigatorActivity.f58469H.mo54606a(this.f59900d, offerInfo);
            this.f59900d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56224a((OfferInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$g */
    static final class C22687g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59901d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22687g(LimitResultActivity limitResultActivity) {
            super(1);
            this.f59901d = limitResultActivity;
        }

        /* renamed from: a */
        public final void mo56225a(ResultData resultData) {
            C41536l.m120489i(resultData, "resultData");
            ClientIncomesActivity.f59691O.mo56004b(this.f59901d, resultData.mo56204b(), resultData.mo56207e(), resultData.mo56205d(), resultData.mo56203a(), resultData.mo56210h());
            this.f59901d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56225a((ResultData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$h */
    static final class C22688h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59902d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22688h(LimitResultActivity limitResultActivity) {
            super(1);
            this.f59902d = limitResultActivity;
        }

        /* renamed from: a */
        public final void mo56226a(C41224m mVar) {
            C25848a F2 = this.f59902d.m73523J2();
            C41536l.m120488h(mVar, "adapterData");
            F2.mo64635l(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56226a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$i */
    static final class C22689i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22689i(LimitResultActivity limitResultActivity) {
            super(1);
            this.f59903d = limitResultActivity;
        }

        /* renamed from: a */
        public final void mo56227a(Application application) {
            C41536l.m120489i(application, "application");
            DocumentsUploadActivity.C22617a aVar = DocumentsUploadActivity.f59725N;
            LimitResultActivity limitResultActivity = this.f59903d;
            aVar.mo56021a(limitResultActivity, application, limitResultActivity.mo56217L2().mo56210h());
            this.f59903d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56227a((Application) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$j */
    static final class C22690j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59904d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22690j(LimitResultActivity limitResultActivity) {
            super(0);
            this.f59904d = limitResultActivity;
        }

        /* renamed from: b */
        public final ResultData invoke() {
            Parcelable parcelableExtra = this.f59904d.getIntent().getParcelableExtra("EXTRA_RESULT_DATA");
            C41536l.m120486f(parcelableExtra);
            return (ResultData) parcelableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$k */
    static final class C22691k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59905a;

        C22691k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59905a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59905a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59905a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$l */
    public static final class C22692l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59906d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22692l(ComponentActivity componentActivity) {
            super(0);
            this.f59906d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59906d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$m */
    public static final class C22693m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59907d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59908e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22693m(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59907d = aVar;
            this.f59908e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59907d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59908e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$n */
    static final class C22694n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LimitResultActivity f59909d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity$n$a */
        static final class C22695a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ LimitResultActivity f59910d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22695a(LimitResultActivity limitResultActivity) {
                super(0);
                this.f59910d = limitResultActivity;
            }

            /* renamed from: b */
            public final C22700d invoke() {
                return this.f59910d.mo56216K2().mo32544a(this.f59910d.mo56217L2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22694n(LimitResultActivity limitResultActivity) {
            super(0);
            this.f59909d = limitResultActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22695a(this.f59909d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final C25848a m73523J2() {
        return (C25848a) this.f59894K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final C22700d m73524M2() {
        return (C22700d) this.f59893J.getValue();
    }

    /* renamed from: N2 */
    private final void m73525N2() {
        m73524M2().mo56250xw().mo56239Y8().mo4819k(this, new C22691k(new C22682c(this)));
        C37224b.m109963b(m73524M2().mo56250xw().mo56249xq(), this, new C22683d(this));
        C37224b.m109963b(m73524M2().mo56250xw().mo56235Km(), this, new C22684e(this));
        C37224b.m109963b(m73524M2().mo56250xw().mo56241mc(), this, new C22686f(this));
        C37224b.m109963b(m73524M2().mo56250xw().mo56238Ul(), this, new C22687g(this));
        m73524M2().mo56250xw().mo56240ce().mo4819k(this, new C22691k(new C22688h(this)));
        C37224b.m109963b(m73524M2().mo56250xw().mo56234Ik(), this, new C22689i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m73526O2(LimitResultActivity limitResultActivity, View view) {
        C41536l.m120489i(limitResultActivity, "this$0");
        C24904k kVar = limitResultActivity.f59890G;
        if (kVar == null) {
            C41536l.m120506z("binding");
            kVar = null;
        }
        CardView cardView = kVar.f64003i;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        limitResultActivity.m73524M2().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m73527P2() {
        Intent flags = new Intent(this, MainActivity.class).setFlags(872415232);
        C41536l.m120488h(flags, "Intent(this, MainActivit…_SINGLE_TOP\n            )");
        startActivity(flags);
        finish();
    }

    /* renamed from: K2 */
    public final C22700d.C22706d mo56216K2() {
        C22700d.C22706d dVar = this.f59891H;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: L2 */
    public final ResultData mo56217L2() {
        return (ResultData) this.f59892I.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C24904k d = C24904k.m79599d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f59890G = d;
        C24904k kVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m73525N2();
        C24904k kVar2 = this.f59890G;
        if (kVar2 == null) {
            C41536l.m120506z("binding");
            kVar2 = null;
        }
        kVar2.f64002h.mo3946b().setOnClickListener(new C25686a(this));
        C24904k kVar3 = this.f59890G;
        if (kVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            kVar = kVar3;
        }
        kVar.f64001g.setAdapter(m73523J2());
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        if (mo56217L2().mo56210h()) {
            return C32343x.m95388F("CLA.main.header", new Object[0]);
        }
        return C32343x.m95388F("CML.main.header", new Object[0]);
    }
}
