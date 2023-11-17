package p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import ie0.C25184d;
import ig0.C25193a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37621w;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.C23707a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity;
import ue0.C28754u;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity */
public final class GTMyInvestmentsActivity extends C23712d implements C23707a.C23708a {

    /* renamed from: J */
    public static final C23680a f61719J = new C23680a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C28754u f61720G;

    /* renamed from: H */
    private final C41217g f61721H = new C1617p0(C41520a0.m120436b(GTMyInvestmentsViewModel$ViewModel.class), new C23695m(this), new C23694l(this), new C23696n((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f61722I = C41219i.m119470b(new C23681b(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$a */
    public static final class C23680a {
        private C23680a() {
        }

        public /* synthetic */ C23680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60566a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, GTMyInvestmentsActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$b */
    static final class C23681b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23681b(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(0);
            this.f61723d = gTMyInvestmentsActivity;
        }

        /* renamed from: b */
        public final C23707a invoke() {
            C23707a aVar = new C23707a();
            aVar.mo60607p(this.f61723d);
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$c */
    static final class C23682c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61724d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$c$a */
        static final class C23683a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31128a f61725d;

            /* renamed from: e */
            final /* synthetic */ GTMyInvestmentsActivity f61726e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23683a(C31128a aVar, GTMyInvestmentsActivity gTMyInvestmentsActivity) {
                super(1);
                this.f61725d = aVar;
                this.f61726e = gTMyInvestmentsActivity;
            }

            /* renamed from: a */
            public final void mo60569a(List list) {
                C41536l.m120489i(list, "portfolio");
                if (this.f61725d.mo71341b() != 5) {
                    this.f61726e.m76526K2().mo60589yw(list);
                }
                this.f61726e.m76525J2().mo6029i(list);
                C28754u F2 = this.f61726e.f61720G;
                C28754u uVar = null;
                if (F2 == null) {
                    C41536l.m120506z("binding");
                    F2 = null;
                }
                F2.f73471g.setRefreshing(false);
                C28754u F22 = this.f61726e.f61720G;
                if (F22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    uVar = F22;
                }
                uVar.f73473i.mo53595c();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60569a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$c$b */
        static final class C23684b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTMyInvestmentsActivity f61727d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23684b(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
                super(1);
                this.f61727d = gTMyInvestmentsActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "er");
                C28754u F2 = this.f61727d.f61720G;
                C28754u uVar = null;
                if (F2 == null) {
                    C41536l.m120506z("binding");
                    F2 = null;
                }
                F2.f73471g.setRefreshing(false);
                C28754u F22 = this.f61727d.f61720G;
                if (F22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    uVar = F22;
                }
                uVar.f73473i.mo53595c();
                this.f61727d.mo74709H1(th);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$c$c */
        static final class C23685c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C31128a f61728d;

            /* renamed from: e */
            final /* synthetic */ GTMyInvestmentsActivity f61729e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23685c(C31128a aVar, GTMyInvestmentsActivity gTMyInvestmentsActivity) {
                super(1);
                this.f61728d = aVar;
                this.f61729e = gTMyInvestmentsActivity;
            }

            /* renamed from: a */
            public final void mo60571a(List list) {
                if (this.f61728d.mo71341b() != 2) {
                    C28754u F2 = this.f61729e.f61720G;
                    if (F2 == null) {
                        C41536l.m120506z("binding");
                        F2 = null;
                    }
                    F2.f73473i.mo53597e();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60571a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23682c(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(1);
            this.f61724d = gTMyInvestmentsActivity;
        }

        /* renamed from: a */
        public final void mo60568a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23683a(aVar, this.f61724d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23684b(this.f61724d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23685c(aVar, this.f61724d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60568a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$d */
    static final class C23686d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23686d(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(1);
            this.f61730d = gTMyInvestmentsActivity;
        }

        /* renamed from: a */
        public final void mo60572a(C31128a aVar) {
            GTMyInvestmentsActivity gTMyInvestmentsActivity = this.f61730d;
            C41536l.m120488h(aVar, "result");
            gTMyInvestmentsActivity.m76528M2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60572a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$e */
    static final class C23687e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23687e(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(1);
            this.f61731d = gTMyInvestmentsActivity;
        }

        /* renamed from: a */
        public final void mo60573a(C41224m mVar) {
            this.f61731d.m76525J2().mo60606o((String) mVar.mo95678e(), (C31128a) mVar.mo95680f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60573a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$f */
    static final class C23688f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61732d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23688f(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(1);
            this.f61732d = gTMyInvestmentsActivity;
        }

        /* renamed from: a */
        public final void mo60574a(BigDecimal bigDecimal) {
            C41536l.m120489i(bigDecimal, "equity");
            C28754u F2 = this.f61732d.f61720G;
            C28754u uVar = null;
            if (F2 == null) {
                C41536l.m120506z("binding");
                F2 = null;
            }
            F2.f73476l.setText(new Amount(bigDecimal, "USD").toString());
            C28754u F22 = this.f61732d.f61720G;
            if (F22 == null) {
                C41536l.m120506z("binding");
            } else {
                uVar = F22;
            }
            uVar.f73475k.mo53595c();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60574a((BigDecimal) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$g */
    static final class C23689g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23689g(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(1);
            this.f61733d = gTMyInvestmentsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "er");
            C28754u F2 = this.f61733d.f61720G;
            if (F2 == null) {
                C41536l.m120506z("binding");
                F2 = null;
            }
            F2.f73475k.mo53595c();
            this.f61733d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$h */
    static final class C23690h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23690h(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(1);
            this.f61734d = gTMyInvestmentsActivity;
        }

        /* renamed from: a */
        public final void mo60576a(BigDecimal bigDecimal) {
            C28754u F2 = this.f61734d.f61720G;
            if (F2 == null) {
                C41536l.m120506z("binding");
                F2 = null;
            }
            F2.f73475k.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60576a((BigDecimal) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$i */
    static final class C23691i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61735a;

        C23691i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61735a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61735a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61735a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$j */
    static final class C23692j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23692j(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(0);
            this.f61736d = gTMyInvestmentsActivity;
        }

        public final void invoke() {
            C21481a.onRefresh$default(this.f61736d.m76526K2(), 0, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$k */
    static final class C23693k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMyInvestmentsActivity f61737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23693k(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            super(1);
            this.f61737d = gTMyInvestmentsActivity;
        }

        /* renamed from: a */
        public final void mo60579a(String str) {
            C41536l.m120489i(str, "filter");
            this.f61737d.m76526K2().mo60585sw().mo60582Ov(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60579a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$l */
    public static final class C23694l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23694l(ComponentActivity componentActivity) {
            super(0);
            this.f61738d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61738d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$m */
    public static final class C23695m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23695m(ComponentActivity componentActivity) {
            super(0);
            this.f61739d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61739d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity$n */
    public static final class C23696n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61740d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61741e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23696n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61740d = aVar;
            this.f61741e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61740d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61741e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final C23707a m76525J2() {
        return (C23707a) this.f61722I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final GTMyInvestmentsViewModel$ViewModel m76526K2() {
        return (GTMyInvestmentsViewModel$ViewModel) this.f61721H.getValue();
    }

    /* renamed from: L2 */
    private final void m76527L2() {
        m76526K2().mo60586tw().mo60581Mo().mo4819k(this, new C23691i(new C23682c(this)));
        m76526K2().mo60586tw().mo60583k9().mo4819k(this, new C23691i(new C23686d(this)));
        m76526K2().mo60586tw().mo60580J2().mo4819k(this, new C23691i(new C23687e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m76528M2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23688f(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23689g(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C23690h(this), 1, (Object) null);
    }

    /* renamed from: N2 */
    private final void m76529N2() {
        C28754u uVar = this.f61720G;
        if (uVar == null) {
            C41536l.m120506z("binding");
            uVar = null;
        }
        uVar.f73472h.setCancelButtonListener(new C23692j(this));
        uVar.f73472h.setOnTextChangeListener(new C23693k(this));
        uVar.f73470f.setAdapter(m76525J2());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C25184d.f64654a);
        uVar.f73470f.mo5351j(new C37621w(dimensionPixelSize, dimensionPixelSize, 1));
        uVar.f73471g.setOnRefreshListener(new C25193a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m76530O2(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
        C41536l.m120489i(gTMyInvestmentsActivity, "this$0");
        gTMyInvestmentsActivity.m76526K2().onRefresh(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28754u d = C28754u.m88146d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61720G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m76529N2();
        m76527L2();
    }

    /* renamed from: U */
    public void mo60565U(String str) {
        C41536l.m120489i(str, "symbol");
        GTShareDetailsActivity.f61877N.mo60709a(str, this);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.gt.my.assets", new Object[0]);
    }
}
