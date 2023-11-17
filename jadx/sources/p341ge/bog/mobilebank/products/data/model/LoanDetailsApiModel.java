package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoanDetailsApiModel */
public final class LoanDetailsApiModel {
    private final LoanInvoiceWrapperApiModel invoice;
    private final LndDetailsApiModel lndDetails;
    private final long loanKey;
    private final PlnDetailsApiModel plnDetails;
    private final LoanScheduleApiModel schedule;

    public LoanDetailsApiModel(long j, LndDetailsApiModel lndDetailsApiModel, PlnDetailsApiModel plnDetailsApiModel, LoanScheduleApiModel loanScheduleApiModel, LoanInvoiceWrapperApiModel loanInvoiceWrapperApiModel) {
        this.loanKey = j;
        this.lndDetails = lndDetailsApiModel;
        this.plnDetails = plnDetailsApiModel;
        this.schedule = loanScheduleApiModel;
        this.invoice = loanInvoiceWrapperApiModel;
    }

    public static /* synthetic */ LoanDetailsApiModel copy$default(LoanDetailsApiModel loanDetailsApiModel, long j, LndDetailsApiModel lndDetailsApiModel, PlnDetailsApiModel plnDetailsApiModel, LoanScheduleApiModel loanScheduleApiModel, LoanInvoiceWrapperApiModel loanInvoiceWrapperApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            j = loanDetailsApiModel.loanKey;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            lndDetailsApiModel = loanDetailsApiModel.lndDetails;
        }
        LndDetailsApiModel lndDetailsApiModel2 = lndDetailsApiModel;
        if ((i & 4) != 0) {
            plnDetailsApiModel = loanDetailsApiModel.plnDetails;
        }
        PlnDetailsApiModel plnDetailsApiModel2 = plnDetailsApiModel;
        if ((i & 8) != 0) {
            loanScheduleApiModel = loanDetailsApiModel.schedule;
        }
        LoanScheduleApiModel loanScheduleApiModel2 = loanScheduleApiModel;
        if ((i & 16) != 0) {
            loanInvoiceWrapperApiModel = loanDetailsApiModel.invoice;
        }
        return loanDetailsApiModel.copy(j2, lndDetailsApiModel2, plnDetailsApiModel2, loanScheduleApiModel2, loanInvoiceWrapperApiModel);
    }

    public final long component1() {
        return this.loanKey;
    }

    public final LndDetailsApiModel component2() {
        return this.lndDetails;
    }

    public final PlnDetailsApiModel component3() {
        return this.plnDetails;
    }

    public final LoanScheduleApiModel component4() {
        return this.schedule;
    }

    public final LoanInvoiceWrapperApiModel component5() {
        return this.invoice;
    }

    public final LoanDetailsApiModel copy(long j, LndDetailsApiModel lndDetailsApiModel, PlnDetailsApiModel plnDetailsApiModel, LoanScheduleApiModel loanScheduleApiModel, LoanInvoiceWrapperApiModel loanInvoiceWrapperApiModel) {
        return new LoanDetailsApiModel(j, lndDetailsApiModel, plnDetailsApiModel, loanScheduleApiModel, loanInvoiceWrapperApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanDetailsApiModel)) {
            return false;
        }
        LoanDetailsApiModel loanDetailsApiModel = (LoanDetailsApiModel) obj;
        return this.loanKey == loanDetailsApiModel.loanKey && C41536l.m120484d(this.lndDetails, loanDetailsApiModel.lndDetails) && C41536l.m120484d(this.plnDetails, loanDetailsApiModel.plnDetails) && C41536l.m120484d(this.schedule, loanDetailsApiModel.schedule) && C41536l.m120484d(this.invoice, loanDetailsApiModel.invoice);
    }

    public final LoanInvoiceWrapperApiModel getInvoice() {
        return this.invoice;
    }

    public final LndDetailsApiModel getLndDetails() {
        return this.lndDetails;
    }

    public final long getLoanKey() {
        return this.loanKey;
    }

    public final PlnDetailsApiModel getPlnDetails() {
        return this.plnDetails;
    }

    public final LoanScheduleApiModel getSchedule() {
        return this.schedule;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.loanKey) * 31;
        LndDetailsApiModel lndDetailsApiModel = this.lndDetails;
        int i = 0;
        int hashCode = (a + (lndDetailsApiModel == null ? 0 : lndDetailsApiModel.hashCode())) * 31;
        PlnDetailsApiModel plnDetailsApiModel = this.plnDetails;
        int hashCode2 = (hashCode + (plnDetailsApiModel == null ? 0 : plnDetailsApiModel.hashCode())) * 31;
        LoanScheduleApiModel loanScheduleApiModel = this.schedule;
        int hashCode3 = (hashCode2 + (loanScheduleApiModel == null ? 0 : loanScheduleApiModel.hashCode())) * 31;
        LoanInvoiceWrapperApiModel loanInvoiceWrapperApiModel = this.invoice;
        if (loanInvoiceWrapperApiModel != null) {
            i = loanInvoiceWrapperApiModel.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.loanKey;
        LndDetailsApiModel lndDetailsApiModel = this.lndDetails;
        PlnDetailsApiModel plnDetailsApiModel = this.plnDetails;
        LoanScheduleApiModel loanScheduleApiModel = this.schedule;
        LoanInvoiceWrapperApiModel loanInvoiceWrapperApiModel = this.invoice;
        return "LoanDetailsApiModel(loanKey=" + j + ", lndDetails=" + lndDetailsApiModel + ", plnDetails=" + plnDetailsApiModel + ", schedule=" + loanScheduleApiModel + ", invoice=" + loanInvoiceWrapperApiModel + ")";
    }
}
