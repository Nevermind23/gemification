package rv0;

import android.view.View;
import p341ge.bog.mobilebank.openbanking.presentation.products.BankProductUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel;
import rv0.C38365p;

/* renamed from: rv0.s */
public final /* synthetic */ class C38372s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C38365p f91962d;

    /* renamed from: e */
    public final /* synthetic */ BankWithProductsUiModel f91963e;

    /* renamed from: f */
    public final /* synthetic */ BankProductUiModel f91964f;

    public /* synthetic */ C38372s(C38365p pVar, BankWithProductsUiModel bankWithProductsUiModel, BankProductUiModel bankProductUiModel) {
        this.f91962d = pVar;
        this.f91963e = bankWithProductsUiModel;
        this.f91964f = bankProductUiModel;
    }

    public final void onClick(View view) {
        C38365p.C38367b.C38368a.m112676h(this.f91962d, this.f91963e, this.f91964f, view);
    }
}
