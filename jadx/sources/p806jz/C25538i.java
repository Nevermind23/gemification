package p806jz;

import android.widget.CompoundButton;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity;

/* renamed from: jz.i */
public final /* synthetic */ class C25538i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MoneyTransferDetailsActivity f65209a;

    public /* synthetic */ C25538i(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
        this.f65209a = moneyTransferDetailsActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        MoneyTransferDetailsActivity.m68665v3(this.f65209a, compoundButton, z);
    }
}
