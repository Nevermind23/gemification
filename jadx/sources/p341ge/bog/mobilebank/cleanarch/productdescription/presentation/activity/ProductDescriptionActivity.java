package p341ge.bog.mobilebank.cleanarch.productdescription.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32343x;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionDetailsUiModel;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionUiModel;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel.ProductDescriptionViewModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.DetailsViewItem;
import p366bk.C10322k;
import p366bk.C10324m;
import p90.C27381o1;
import q60.C27683a;
import q60.C27684b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity */
public abstract class ProductDescriptionActivity extends C30772sa {

    /* renamed from: H */
    public static final C22491a f59490H = new C22491a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C27381o1 f59491F;

    /* renamed from: G */
    private final C41217g f59492G = new C1617p0(C41520a0.m120436b(ProductDescriptionViewModel.class), new C22496f(this), new C22495e(this), new C22497g((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity$a */
    public static final class C22491a {
        private C22491a() {
        }

        public /* synthetic */ C22491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity$b */
    /* synthetic */ class C22492b extends C41535k implements C43075l {
        C22492b(Object obj) {
            super(1, obj, ProductDescriptionActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55532b(boolean z) {
            ((ProductDescriptionActivity) this.receiver).mo55531T2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55532b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity$c */
    /* synthetic */ class C22493c extends C41535k implements C43075l {
        C22493c(Object obj) {
            super(1, obj, ProductDescriptionActivity.class, "onSuccess", "onSuccess(Lge/bog/mobilebank/cleanarch/productdescription/presentation/model/ProductDescriptionUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo55533b(ProductDescriptionUiModel productDescriptionUiModel) {
            C41536l.m120489i(productDescriptionUiModel, "p0");
            ((ProductDescriptionActivity) this.receiver).m72917U2(productDescriptionUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55533b((ProductDescriptionUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity$d */
    /* synthetic */ class C22494d extends C41535k implements C43075l {
        C22494d(Object obj) {
            super(1, obj, ProductDescriptionActivity.class, "onError", "onError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo55534b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ProductDescriptionActivity) this.receiver).m72916S2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55534b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity$e */
    public static final class C22495e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22495e(ComponentActivity componentActivity) {
            super(0);
            this.f59493d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59493d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity$f */
    public static final class C22496f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22496f(ComponentActivity componentActivity) {
            super(0);
            this.f59494d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59494d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.activity.ProductDescriptionActivity$g */
    public static final class C22497g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59495d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59496e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22497g(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59495d = aVar;
            this.f59496e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59495d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59496e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: J2 */
    public static /* synthetic */ void m72910J2(ProductDescriptionActivity productDescriptionActivity, String str, String str2, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                f = 16.0f;
            }
            if ((i & 8) != 0) {
                f2 = 14.0f;
            }
            productDescriptionActivity.mo55528I2(str, str2, f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addDetailsItem");
    }

    /* renamed from: M2 */
    private final void m72911M2(ProductDescriptionUiModel productDescriptionUiModel) {
        String f = productDescriptionUiModel.mo55552f();
        C27381o1 o1Var = null;
        if (f != null) {
            C27381o1 o1Var2 = this.f59491F;
            if (o1Var2 == null) {
                C41536l.m120506z("binding");
                o1Var2 = null;
            }
            o1Var2.f69443n.setVisibility(0);
            C27381o1 o1Var3 = this.f59491F;
            if (o1Var3 == null) {
                C41536l.m120506z("binding");
                o1Var3 = null;
            }
            o1Var3.f69440k.setVisibility(0);
            C27381o1 o1Var4 = this.f59491F;
            if (o1Var4 == null) {
                C41536l.m120506z("binding");
                o1Var4 = null;
            }
            o1Var4.f69443n.setText(C32343x.m95388F(f, new Object[0]));
        }
        String b = productDescriptionUiModel.mo55547b();
        if (b != null) {
            C27381o1 o1Var5 = this.f59491F;
            if (o1Var5 == null) {
                C41536l.m120506z("binding");
                o1Var5 = null;
            }
            o1Var5.f69436g.setVisibility(0);
            C27381o1 o1Var6 = this.f59491F;
            if (o1Var6 == null) {
                C41536l.m120506z("binding");
                o1Var6 = null;
            }
            o1Var6.f69441l.setVisibility(0);
            C27381o1 o1Var7 = this.f59491F;
            if (o1Var7 == null) {
                C41536l.m120506z("binding");
                o1Var7 = null;
            }
            o1Var7.f69436g.setText(C32343x.m95388F(b, new Object[0]));
        }
        String d = productDescriptionUiModel.mo55548d();
        if (d != null) {
            C27381o1 o1Var8 = this.f59491F;
            if (o1Var8 == null) {
                C41536l.m120506z("binding");
                o1Var8 = null;
            }
            o1Var8.f69438i.setVisibility(0);
            C27381o1 o1Var9 = this.f59491F;
            if (o1Var9 == null) {
                C41536l.m120506z("binding");
                o1Var9 = null;
            }
            o1Var9.f69441l.setVisibility(0);
            C27381o1 o1Var10 = this.f59491F;
            if (o1Var10 == null) {
                C41536l.m120506z("binding");
                o1Var10 = null;
            }
            o1Var10.f69438i.setText(C32343x.m95388F(d, new Object[0]));
        }
        String a = productDescriptionUiModel.mo55546a();
        if (a != null) {
            C2394j y = C2379b.m9210t(getApplicationContext()).mo7757y(a);
            C27381o1 o1Var11 = this.f59491F;
            if (o1Var11 == null) {
                C41536l.m120506z("binding");
                o1Var11 = null;
            }
            y.mo7718L0(o1Var11.f69437h);
            C27381o1 o1Var12 = this.f59491F;
            if (o1Var12 == null) {
                C41536l.m120506z("binding");
                o1Var12 = null;
            }
            o1Var12.f69437h.setVisibility(0);
            C27381o1 o1Var13 = this.f59491F;
            if (o1Var13 == null) {
                C41536l.m120506z("binding");
            } else {
                o1Var = o1Var13;
            }
            o1Var.f69437h.invalidate();
        }
        for (ProductDescriptionDetailsUiModel productDescriptionDetailsUiModel : productDescriptionUiModel.mo55550e()) {
            if (productDescriptionDetailsUiModel.mo55535a() != null) {
                m72910J2(this, C32343x.m95388F(productDescriptionDetailsUiModel.mo55535a(), new Object[0]), C32343x.m95388F(productDescriptionDetailsUiModel.mo55536b(), new Object[0]), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 12, (Object) null);
            }
        }
    }

    /* renamed from: N2 */
    private final void m72912N2() {
        C21484c.m69411c(mo55529L2().mo55563qw(), this, new C22493c(this), new C22492b(this), new C22494d(this));
    }

    /* renamed from: P2 */
    public static /* synthetic */ void m72913P2(ProductDescriptionActivity productDescriptionActivity, String str, C43075l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = C32343x.m95388F("offers.become.solo.terms.page.button.continue", new Object[0]);
            }
            productDescriptionActivity.mo55530O2(str, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onContinueButtonClick");
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m72914Q2(C43075l lVar, View view) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m72915R2(ProductDescriptionActivity productDescriptionActivity, View view) {
        C41536l.m120489i(productDescriptionActivity, "this$0");
        C27381o1 o1Var = productDescriptionActivity.f59491F;
        if (o1Var == null) {
            C41536l.m120506z("binding");
            o1Var = null;
        }
        o1Var.f69446q.setVisibility(8);
        productDescriptionActivity.mo55529L2().mo55562lw(productDescriptionActivity.mo49588K2());
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m72916S2(C21503d.C21504a aVar) {
        mo52674G1(aVar);
        C27381o1 o1Var = this.f59491F;
        if (o1Var == null) {
            C41536l.m120506z("binding");
            o1Var = null;
        }
        o1Var.f69446q.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m72917U2(ProductDescriptionUiModel productDescriptionUiModel) {
        m72911M2(productDescriptionUiModel);
    }

    /* renamed from: I2 */
    public final void mo55528I2(String str, String str2, float f, float f2) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        Context applicationContext = getApplicationContext();
        C41536l.m120488h(applicationContext, "applicationContext");
        DetailsViewItem detailsViewItem = new DetailsViewItem(applicationContext, (AttributeSet) null, 0, 4, (DefaultConstructorMarker) null);
        if (!C40439w.m117118v(str)) {
            detailsViewItem.addKey(str, f);
        }
        if (!C40439w.m117118v(str2)) {
            detailsViewItem.addValue(str2, f2);
        }
        C27381o1 o1Var = this.f59491F;
        if (o1Var == null) {
            C41536l.m120506z("binding");
            o1Var = null;
        }
        o1Var.f69439j.addView(detailsViewItem);
    }

    /* renamed from: K2 */
    public abstract String mo49588K2();

    /* access modifiers changed from: protected */
    /* renamed from: L2 */
    public final ProductDescriptionViewModel mo55529L2() {
        return (ProductDescriptionViewModel) this.f59492G.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_product_description;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27381o1 a = C27381o1.m84829a(findViewById(C10322k.product_details_content));
        C41536l.m120488h(a, "bind(findViewById(R.id.product_details_content))");
        this.f59491F = a;
        mo55529L2().mo55562lw(mo49588K2());
        m72912N2();
        C27381o1 o1Var = this.f59491F;
        if (o1Var == null) {
            C41536l.m120506z("binding");
            o1Var = null;
        }
        o1Var.f69445p.mo3946b().setOnClickListener(new C27684b(this));
    }

    /* renamed from: O2 */
    public final void mo55530O2(String str, C43075l lVar) {
        C41536l.m120489i(str, "btnText");
        C41536l.m120489i(lVar, UrlHandler.ACTION);
        C27381o1 o1Var = this.f59491F;
        C27381o1 o1Var2 = null;
        if (o1Var == null) {
            C41536l.m120506z("binding");
            o1Var = null;
        }
        o1Var.f69435f.setText(str);
        C27381o1 o1Var3 = this.f59491F;
        if (o1Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            o1Var2 = o1Var3;
        }
        o1Var2.f69435f.setOnClickListener(new C27683a(lVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public final void mo55531T2(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }
}
