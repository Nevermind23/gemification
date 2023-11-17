package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.LoyaltyListAction;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27362m0;
import p928vy.C29183a;
import p928vy.C29184b;
import p939wy.C29593a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity */
public final class LoyaltyListActivity extends C21133a {

    /* renamed from: K */
    public static final C21122a f56693K = new C21122a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f56694G;

    /* renamed from: H */
    private final C41217g f56695H = new C1617p0(C41520a0.m120436b(LoyaltyListViewModel.class), new C21131j(this), new C21130i(this), new C21132k((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f56696I = C41219i.m119470b(new C21123b(this));

    /* renamed from: J */
    private final C41217g f56697J = C41219i.m119470b(new C21128g(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$a */
    public static final class C21122a {
        private C21122a() {
        }

        public /* synthetic */ C21122a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m68369b(C21122a aVar, Context context, int i, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = -1;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            aVar.mo52676a(context, i, str);
        }

        /* renamed from: a */
        public final void mo52676a(Context context, int i, String str) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, LoyaltyListActivity.class);
            intent.putExtra("OPEN_PRODUCT", i);
            intent.putExtra("FILTER_CATEGORY", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$b */
    static final class C21123b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoyaltyListActivity f56698d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21123b(LoyaltyListActivity loyaltyListActivity) {
            super(0);
            this.f56698d = loyaltyListActivity;
        }

        /* renamed from: b */
        public final C29593a invoke() {
            Client N2 = this.f56698d.mo52675N2();
            FragmentManager supportFragmentManager = this.f56698d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            return new C29593a(N2, supportFragmentManager);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$c */
    /* synthetic */ class C21124c extends C41535k implements C43075l {
        C21124c(Object obj) {
            super(1, obj, LoyaltyListActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo52678b(boolean z) {
            ((LoyaltyListActivity) this.receiver).m68361P2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52678b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$d */
    /* synthetic */ class C21125d extends C41535k implements C43075l {
        C21125d(Object obj) {
            super(1, obj, LoyaltyListActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo52679b(C21503d.C21504a aVar) {
            ((LoyaltyListActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52679b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$e */
    static final class C21126e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoyaltyListActivity f56699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21126e(LoyaltyListActivity loyaltyListActivity) {
            super(1);
            this.f56699d = loyaltyListActivity;
        }

        /* renamed from: a */
        public final void mo52680a(C37223a aVar) {
            LoyaltyListAction loyaltyListAction = (LoyaltyListAction) aVar.mo90296a();
            if (loyaltyListAction != null) {
                this.f56699d.m68362Q2(loyaltyListAction);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52680a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$f */
    /* synthetic */ class C21127f extends C41535k implements C43075l {
        C21127f(Object obj) {
            super(1, obj, C29593a.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo52681b(List list) {
            ((C29593a) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52681b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$g */
    static final class C21128g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoyaltyListActivity f56700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21128g(LoyaltyListActivity loyaltyListActivity) {
            super(0);
            this.f56700d = loyaltyListActivity;
        }

        /* renamed from: b */
        public final C27362m0 invoke() {
            return C27362m0.m84758a(this.f56700d.findViewById(C10322k.loyalty_list_root));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$h */
    static final class C21129h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f56701a;

        C21129h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f56701a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f56701a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f56701a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$i */
    public static final class C21130i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21130i(ComponentActivity componentActivity) {
            super(0);
            this.f56702d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f56702d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$j */
    public static final class C21131j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21131j(ComponentActivity componentActivity) {
            super(0);
            this.f56703d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f56703d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity$k */
    public static final class C21132k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56704d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f56705e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21132k(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f56704d = aVar;
            this.f56705e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56704d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f56705e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: I2 */
    private final void m68355I2() {
        m68359M2().f69263e.f68328f.mo3946b().setOnClickListener(new C29183a(this));
        m68359M2().f69271m.setOnRefreshListener(new C29184b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m68356J2(LoyaltyListActivity loyaltyListActivity, View view) {
        C41536l.m120489i(loyaltyListActivity, "this$0");
        loyaltyListActivity.m68359M2().f69264f.setVisibility(8);
        loyaltyListActivity.m68360O2().mo52876tw(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m68357K2(LoyaltyListActivity loyaltyListActivity) {
        C41536l.m120489i(loyaltyListActivity, "this$0");
        loyaltyListActivity.m68360O2().mo52876tw(true);
    }

    /* renamed from: L2 */
    private final C29593a m68358L2() {
        return (C29593a) this.f56696I.getValue();
    }

    /* renamed from: M2 */
    private final C27362m0 m68359M2() {
        return (C27362m0) this.f56697J.getValue();
    }

    /* renamed from: O2 */
    private final LoyaltyListViewModel m68360O2() {
        return (LoyaltyListViewModel) this.f56695H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m68361P2(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
        m68359M2().f69271m.setRefreshing(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final void m68362Q2(LoyaltyListAction loyaltyListAction) {
        if (loyaltyListAction instanceof LoyaltyListAction.OpenProduct) {
            Intent intent = new Intent(this, ProductDetailedActivity.class);
            LoyaltyListAction.OpenProduct openProduct = (LoyaltyListAction.OpenProduct) loyaltyListAction;
            intent.putExtras(C0908e.m3336b(C41233s.m119492a("PRODUCT_TYPE_KEY", Integer.valueOf(openProduct.mo52833b())), C41233s.m119492a(ProductDetailedActivity.f85313M0, openProduct.mo52832a())));
            startActivity(intent);
        }
        finish();
    }

    /* renamed from: l1 */
    private final void m68363l1() {
        C21484c.m69412d(m68360O2().mo52872nw(), this, (C43075l) null, new C21124c(this), new C21125d(this), 2, (Object) null);
        m68360O2().mo52874pw().mo4819k(this, new C21129h(new C21126e(this)));
        m68360O2().mo52873ow().mo4819k(this, new C21129h(new C21127f(m68358L2())));
    }

    /* renamed from: G1 */
    public void mo52674G1(C21503d.C21504a aVar) {
        super.mo52674G1(aVar);
        m68359M2().f69264f.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_loyalty_list_2;
    }

    /* renamed from: N2 */
    public final Client mo52675N2() {
        Client client = this.f56694G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m68359M2().f69270l.setAdapter(m68358L2());
        int intExtra = getIntent().getIntExtra("OPEN_PRODUCT", -1);
        String stringExtra = getIntent().getStringExtra("FILTER_CATEGORY");
        if (intExtra != -1) {
            m68360O2().mo52875rw(intExtra, stringExtra);
        }
        m68363l1();
        m68355I2();
        LoyaltyListViewModel.m68480uw(m68360O2(), false, 1, (Object) null);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.header_text_loyalty);
        C41536l.m120488h(string, "getString(R.string.header_text_loyalty)");
        return string;
    }
}
