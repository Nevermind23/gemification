package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoansWrapperApiModel */
public final class LoansWrapperApiModel {
    private final AmountApiModel cosignerSummary;
    private final List<LoanDetailsApiModel> details;
    private final List<LoanApiModel> loans;
    private final AmountApiModel summary;

    public LoansWrapperApiModel(AmountApiModel amountApiModel, AmountApiModel amountApiModel2, List<LoanApiModel> list, List<LoanDetailsApiModel> list2) {
        C41536l.m120489i(amountApiModel, "summary");
        C41536l.m120489i(list, "loans");
        C41536l.m120489i(list2, "details");
        this.summary = amountApiModel;
        this.cosignerSummary = amountApiModel2;
        this.loans = list;
        this.details = list2;
    }

    public final AmountApiModel getCosignerSummary() {
        return this.cosignerSummary;
    }

    public final List<LoanDetailsApiModel> getDetails() {
        return this.details;
    }

    public final List<LoanApiModel> getLoans() {
        return this.loans;
    }

    public final AmountApiModel getSummary() {
        return this.summary;
    }
}
