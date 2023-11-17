package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period;

import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import ha0.C24939p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.a */
public final class C22862a extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C24939p f60241d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22862a(C24939p pVar) {
        super(pVar.mo3946b());
        C41536l.m120489i(pVar, "binding");
        this.f60241d = pVar;
    }

    /* renamed from: h */
    public final void mo56989h(DepositPeriodModel depositPeriodModel) {
        String str;
        C41536l.m120489i(depositPeriodModel, "item");
        if (depositPeriodModel instanceof DepositPeriodModel.Deposit) {
            str = String.valueOf(((DepositPeriodModel.Deposit) depositPeriodModel).mo56968a());
        } else if (depositPeriodModel instanceof DepositPeriodModel.Withdrawal) {
            str = C32343x.m95388F(((DepositPeriodModel.Withdrawal) depositPeriodModel).mo56978a(), new Object[0]);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f60241d.mo3946b().setText(str);
    }
}
