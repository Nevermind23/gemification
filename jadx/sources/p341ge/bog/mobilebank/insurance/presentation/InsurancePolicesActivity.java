package p341ge.bog.mobilebank.insurance.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import el0.C20267e;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import il0.C25224a;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import ml0.C26250d;
import ml0.C26252e;
import ml0.C26254g;
import nl0.C26544a;
import nl0.C26545b;
import nl0.C26548e;
import o31.C37588a0;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.insurance.presentation.C24476b;
import p380ck.C10463g;
import p759fv.C20559a;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity */
public final class InsurancePolicesActivity extends C24474a {

    /* renamed from: L */
    public static final C24462a f63149L = new C24462a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C25224a f63150G;

    /* renamed from: H */
    public C26548e f63151H;

    /* renamed from: I */
    private final C41217g f63152I = new C1617p0(C41520a0.m120436b(C24488f.class), new C24470i(this), new C24472k(this), new C24471j((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C24492g f63153J = new C24492g(new C24464c(this), new C24465d(this), new C24466e(this));

    /* renamed from: K */
    private final C0173b f63154K;

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$a */
    public static final class C24462a {
        private C24462a() {
        }

        public /* synthetic */ C24462a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo62454a(Context context, String str) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, InsurancePolicesActivity.class);
            intent.putExtra("LOOK_UP_VALUE", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$b */
    public /* synthetic */ class C24463b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63155a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ml0.d[] r0 = ml0.C26250d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ml0.d r1 = ml0.C26250d.AUTO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ml0.d r1 = ml0.C26250d.TRAVEL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f63155a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity.C24463b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$c */
    /* synthetic */ class C24464c extends C41535k implements C43075l {
        C24464c(Object obj) {
            super(1, obj, InsurancePolicesActivity.class, "openPolicyDetail", "openPolicyDetail(Lge/bog/mobilebank/insurance/presentation/InsurancePolicesViewModel$InsurancePolicyItem;)V", 0);
        }

        /* renamed from: b */
        public final void mo62455b(C24476b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((InsurancePolicesActivity) this.receiver).m78703R2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62455b((C24476b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$d */
    /* synthetic */ class C24465d extends C41535k implements C43075l {
        C24465d(Object obj) {
            super(1, obj, InsurancePolicesActivity.class, "openNewPolicy", "openNewPolicy(Lge/bog/mobilebank/insurance/domain/model/InsuranceProductType;)V", 0);
        }

        /* renamed from: b */
        public final void mo62456b(C26250d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((InsurancePolicesActivity) this.receiver).m78702Q2(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62456b((C26250d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$e */
    /* synthetic */ class C24466e extends C41535k implements C43064a {
        C24466e(Object obj) {
            super(0, obj, InsurancePolicesActivity.class, "reloadPolices", "reloadPolices()V", 0);
        }

        /* renamed from: b */
        public final void mo62457b() {
            ((InsurancePolicesActivity) this.receiver).m78704S2();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo62457b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$f */
    static final class C24467f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsurancePolicesActivity f63156d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24467f(InsurancePolicesActivity insurancePolicesActivity) {
            super(1);
            this.f63156d = insurancePolicesActivity;
        }

        /* renamed from: a */
        public final void mo62458a(C31128a aVar) {
            C25224a aVar2 = null;
            if (aVar instanceof C31128a.C31131c) {
                C25224a H2 = this.f63156d.f63150G;
                if (H2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    aVar2 = H2;
                }
                aVar2.f64796j.mo53595c();
                this.f63156d.f63153J.mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31130b) {
                C25224a H22 = this.f63156d.f63150G;
                if (H22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    aVar2 = H22;
                }
                aVar2.f64796j.mo53597e();
            } else if (aVar instanceof C31128a.C31129a) {
                C25224a H23 = this.f63156d.f63150G;
                if (H23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    aVar2 = H23;
                }
                aVar2.f64796j.mo53596d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62458a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$g */
    static final class C24468g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsurancePolicesActivity f63157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24468g(InsurancePolicesActivity insurancePolicesActivity) {
            super(1);
            this.f63157d = insurancePolicesActivity;
        }

        /* renamed from: a */
        public final void mo62459a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            if (C41536l.m120484d(str, C26250d.TRAVEL.mo65283b())) {
                C38122f.C38123a.m112204E(C38125h.m112238c(this.f63157d), this.f63157d, (C26254g) null, (C0173b) null, 6, (Object) null);
            } else if (C41536l.m120484d(str, C26250d.AUTO.mo65283b())) {
                C38122f.C38123a.m112217m(C38125h.m112238c(this.f63157d), this.f63157d, (C26252e) null, (C0173b) null, 6, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62459a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$h */
    static final class C24469h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63158a;

        C24469h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63158a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63158a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63158a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$i */
    public static final class C24470i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f63159d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24470i(ComponentActivity componentActivity) {
            super(0);
            this.f63159d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f63159d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$j */
    public static final class C24471j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63160d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f63161e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24471j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f63160d = aVar;
            this.f63161e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63160d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f63161e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$k */
    static final class C24472k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ InsurancePolicesActivity f63162d;

        /* renamed from: ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity$k$a */
        static final class C24473a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ InsurancePolicesActivity f63163d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24473a(InsurancePolicesActivity insurancePolicesActivity) {
                super(0);
                this.f63163d = insurancePolicesActivity;
            }

            /* renamed from: b */
            public final C24488f invoke() {
                return this.f63163d.mo62453L2().mo32560a(this.f63163d.getIntent().getStringExtra("LOOK_UP_VALUE"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24472k(InsurancePolicesActivity insurancePolicesActivity) {
            super(0);
            this.f63162d = insurancePolicesActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24473a(this.f63162d));
        }
    }

    public InsurancePolicesActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C26544a(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f63154K = registerForActivityResult;
    }

    /* renamed from: M2 */
    private final C24488f m78698M2() {
        return (C24488f) this.f63152I.getValue();
    }

    /* renamed from: N2 */
    private final void m78699N2() {
        C25224a aVar = this.f63150G;
        C25224a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("binding");
            aVar = null;
        }
        aVar.f64791e.setText(C32343x.m95420V("rbc.ins.policies.loading.error", getString(C20267e.f55172a), new Object[0]));
        C25224a aVar3 = this.f63150G;
        if (aVar3 == null) {
            C41536l.m120506z("binding");
            aVar3 = null;
        }
        aVar3.f64794h.setOnClickListener(new C26545b(this));
        C25224a aVar4 = this.f63150G;
        if (aVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            aVar2 = aVar4;
        }
        aVar2.f64793g.setAdapter(this.f63153J);
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m78700O2(InsurancePolicesActivity insurancePolicesActivity, View view) {
        C41536l.m120489i(insurancePolicesActivity, "this$0");
        insurancePolicesActivity.m78704S2();
    }

    /* renamed from: P2 */
    private final void m78701P2() {
        m78698M2().mo62472lw().mo4819k(this, new C24469h(new C24467f(this)));
        C37224b.m109963b(m78698M2().mo62471kw(), this, new C24468g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final void m78702Q2(C26250d dVar) {
        int i = C24463b.f63155a[dVar.ordinal()];
        if (i == 1) {
            C38122f.C38123a.m112217m(C38125h.m112238c(this), this, (C26252e) null, (C0173b) null, 6, (Object) null);
            C20559a.C20564e eVar = C20559a.C20564e.f55600f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            eVar.mo49091a(F);
        } else if (i == 2) {
            C38122f.C38123a.m112204E(C38125h.m112238c(this), this, (C26254g) null, (C0173b) null, 6, (Object) null);
            C20559a.C20567h hVar = C20559a.C20567h.f55603f;
            C10463g F2 = C36546y.m108282F();
            C41536l.m120488h(F2, "getAnalytics()");
            hVar.mo49091a(F2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m78703R2(C24476b bVar) {
        if (bVar instanceof C24476b.C24477a) {
            C38125h.m112238c(this).mo91570Q(this, ((C24476b.C24477a) bVar).mo62467e(), this.f63154K);
            C20559a.C20565f fVar = C20559a.C20565f.f55601f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            fVar.mo49091a(F);
        } else if (bVar instanceof C24476b.C24478b) {
            C38125h.m112238c(this).mo91614l(this, ((C24476b.C24478b) bVar).mo62468e(), this.f63154K);
            C20559a.C20566g gVar = C20559a.C20566g.f55602f;
            C10463g F2 = C36546y.m108282F();
            C41536l.m120488h(F2, "getAnalytics()");
            gVar.mo49091a(F2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m78704S2() {
        C21481a.onRefresh$default(m78698M2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m78705T2(InsurancePolicesActivity insurancePolicesActivity, ActivityResult activityResult) {
        C41536l.m120489i(insurancePolicesActivity, "this$0");
        if (activityResult.mo371b() == 4) {
            C21481a.onRefresh$default(insurancePolicesActivity.m78698M2(), 0, 1, (Object) null);
        }
    }

    /* renamed from: L2 */
    public final C26548e mo62453L2() {
        C26548e eVar = this.f63151H;
        if (eVar != null) {
            return eVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C25224a d = C25224a.m80293d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f63150G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m78699N2();
        m78701P2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.insurance.product.list.header", new Object[0]);
    }
}
