package nr0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loans.data.model.PawnLoanApiModel;
import tr0.C38790k;

/* renamed from: nr0.e */
public final class C37456e {
    /* renamed from: a */
    public final C38790k mo90588a(PawnLoanApiModel pawnLoanApiModel) {
        C41536l.m120489i(pawnLoanApiModel, "model");
        return new C38790k(pawnLoanApiModel.getErrorMessage(), pawnLoanApiModel.getIntAmount(), pawnLoanApiModel.getPenAmount(), pawnLoanApiModel.getPriAmount());
    }
}
