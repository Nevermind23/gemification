package p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod;

import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel;
import xb0.C29736x;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.a */
public final class C23250a extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C29736x f60848d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23250a(C29736x xVar) {
        super(xVar.mo3946b());
        C41536l.m120489i(xVar, "binding");
        this.f60848d = xVar;
    }

    /* renamed from: h */
    public final void mo58168h(DepositPeriodModel depositPeriodModel) {
        String str;
        C41536l.m120489i(depositPeriodModel, "item");
        if (depositPeriodModel instanceof DepositPeriodModel.Deposit) {
            str = String.valueOf(((DepositPeriodModel.Deposit) depositPeriodModel).mo58147d());
        } else if (depositPeriodModel instanceof DepositPeriodModel.Withdrawal) {
            str = C32343x.m95388F(((DepositPeriodModel.Withdrawal) depositPeriodModel).mo58157a(), new Object[0]);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f60848d.mo3946b().setText(str);
    }
}
