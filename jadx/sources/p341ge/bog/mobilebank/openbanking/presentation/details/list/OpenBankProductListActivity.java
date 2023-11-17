package p341ge.bog.mobilebank.openbanking.presentation.details.list;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import ev0.C31821d;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iv0.C36557i;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ov0.C37806b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.ProductUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.details.OpenBankProductDetailsActivity;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity */
public final class OpenBankProductListActivity extends C30772sa {

    /* renamed from: I */
    public static final C33442a f81630I = new C33442a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C31821d f81631F;

    /* renamed from: G */
    private final C41217g f81632G = new C1617p0(C41520a0.m120436b(ProductListViewModel$ViewModel.class), new C33448g(this), new C33447f(this), new C33449h((C43064a) null, this));

    /* renamed from: H */
    private final C41217g f81633H = C41219i.m119470b(new C33446e(this));

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity$a */
    public static final class C33442a {
        private C33442a() {
        }

        public /* synthetic */ C33442a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo79262a(Context context, ProductUiModel productUiModel) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(productUiModel, "selectedProduct");
            context.startActivity(new Intent(context, OpenBankProductListActivity.class).putExtra("PRODUCT_ARG", productUiModel));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity$b */
    static final class C33443b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37806b f81634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33443b(C37806b bVar) {
            super(1);
            this.f81634d = bVar;
        }

        /* renamed from: a */
        public final void mo79263a(List list) {
            C37806b bVar = this.f81634d;
            C41536l.m120488h(list, "it");
            bVar.mo91055h(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79263a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity$c */
    static final class C33444c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBankProductListActivity f81635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33444c(OpenBankProductListActivity openBankProductListActivity) {
            super(1);
            this.f81635d = openBankProductListActivity;
        }

        /* renamed from: a */
        public final void mo79264a(String str) {
            C41536l.m120489i(str, "productId");
            OpenBankProductDetailsActivity.C33386a aVar = OpenBankProductDetailsActivity.f81548H;
            OpenBankProductListActivity openBankProductListActivity = this.f81635d;
            aVar.mo79204a(openBankProductListActivity, ProductUiModel.m97960b(openBankProductListActivity.m98196F2(), (BankUiModel) null, (C36557i) null, (String) null, str, 7, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79264a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity$d */
    static final class C33445d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81636a;

        C33445d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81636a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81636a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81636a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity$e */
    static final class C33446e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OpenBankProductListActivity f81637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33446e(OpenBankProductListActivity openBankProductListActivity) {
            super(0);
            this.f81637d = openBankProductListActivity;
        }

        /* renamed from: b */
        public final ProductUiModel invoke() {
            Intent intent = this.f81637d.getIntent();
            ProductUiModel productUiModel = intent != null ? (ProductUiModel) intent.getParcelableExtra("PRODUCT_ARG") : null;
            C41536l.m120486f(productUiModel);
            return productUiModel;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity$f */
    public static final class C33447f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33447f(ComponentActivity componentActivity) {
            super(0);
            this.f81638d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f81638d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity$g */
    public static final class C33448g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33448g(ComponentActivity componentActivity) {
            super(0);
            this.f81639d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f81639d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity$h */
    public static final class C33449h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81640d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f81641e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33449h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f81640d = aVar;
            this.f81641e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81640d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f81641e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public final ProductUiModel m98196F2() {
        return (ProductUiModel) this.f81633H.getValue();
    }

    /* renamed from: G2 */
    private final ProductListViewModel$ViewModel m98197G2() {
        return (ProductListViewModel$ViewModel) this.f81632G.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C31821d d = C31821d.m94071d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f81631F = d;
        C31821d dVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        C37806b bVar = new C37806b();
        bVar.mo91054g(new C33444c(this));
        C31821d dVar2 = this.f81631F;
        if (dVar2 == null) {
            C41536l.m120506z("binding");
        } else {
            dVar = dVar2;
        }
        dVar.f78473e.setAdapter(bVar);
        m98197G2().mo79269iw().mo79268f2().mo4819k(this, new C33445d(new C33443b(bVar)));
        m98197G2().mo79270jw(m98196F2());
    }
}
