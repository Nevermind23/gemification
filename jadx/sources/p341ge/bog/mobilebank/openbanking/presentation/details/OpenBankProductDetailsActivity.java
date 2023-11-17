package p341ge.bog.mobilebank.openbanking.presentation.details;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ev0.C31823e;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.openbanking.presentation.ProductUiModel;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.OpenBankProductDetailsActivity */
public final class OpenBankProductDetailsActivity extends C30772sa {

    /* renamed from: H */
    public static final C33386a f81548H = new C33386a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C31823e f81549F;

    /* renamed from: G */
    private final C41217g f81550G = C41219i.m119470b(new C33387b(this));

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.OpenBankProductDetailsActivity$a */
    public static final class C33386a {
        private C33386a() {
        }

        public /* synthetic */ C33386a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo79204a(Context context, ProductUiModel productUiModel) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(productUiModel, "selectedProduct");
            context.startActivity(new Intent(context, OpenBankProductDetailsActivity.class).putExtra("PRODUCT_ARG", productUiModel));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.OpenBankProductDetailsActivity$b */
    static final class C33387b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OpenBankProductDetailsActivity f81551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33387b(OpenBankProductDetailsActivity openBankProductDetailsActivity) {
            super(0);
            this.f81551d = openBankProductDetailsActivity;
        }

        /* renamed from: b */
        public final ProductUiModel invoke() {
            Intent intent = this.f81551d.getIntent();
            if (intent != null) {
                return (ProductUiModel) intent.getParcelableExtra("PRODUCT_ARG");
            }
            return null;
        }
    }

    /* renamed from: E2 */
    public final ProductUiModel mo79203E2() {
        return (ProductUiModel) this.f81550G.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C31823e d = C31823e.m94080d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f81549F = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
    }
}
