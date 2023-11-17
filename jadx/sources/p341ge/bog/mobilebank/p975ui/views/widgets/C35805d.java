package p341ge.bog.mobilebank.p975ui.views.widgets;

import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.d */
public final /* synthetic */ class C35805d implements C13310d.C13311a {

    /* renamed from: a */
    public final /* synthetic */ AccountItemView f86513a;

    /* renamed from: b */
    public final /* synthetic */ CreditCardAccount f86514b;

    public /* synthetic */ C35805d(AccountItemView accountItemView, CreditCardAccount creditCardAccount) {
        this.f86513a = accountItemView;
        this.f86514b = creditCardAccount;
    }

    /* renamed from: a */
    public final void mo33448a(Button button) {
        this.f86513a.lambda$setCreditCard$3(this.f86514b, button);
    }
}
