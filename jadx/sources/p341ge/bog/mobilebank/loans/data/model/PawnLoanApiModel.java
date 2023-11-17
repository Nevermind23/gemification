package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.PawnLoanApiModel */
public final class PawnLoanApiModel {
    private final String errorMessage;
    private final BigDecimal intAmount;
    private final BigDecimal penAmount;
    private final BigDecimal priAmount;

    public PawnLoanApiModel(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.errorMessage = str;
        this.intAmount = bigDecimal;
        this.penAmount = bigDecimal2;
        this.priAmount = bigDecimal3;
    }

    public static /* synthetic */ PawnLoanApiModel copy$default(PawnLoanApiModel pawnLoanApiModel, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pawnLoanApiModel.errorMessage;
        }
        if ((i & 2) != 0) {
            bigDecimal = pawnLoanApiModel.intAmount;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = pawnLoanApiModel.penAmount;
        }
        if ((i & 8) != 0) {
            bigDecimal3 = pawnLoanApiModel.priAmount;
        }
        return pawnLoanApiModel.copy(str, bigDecimal, bigDecimal2, bigDecimal3);
    }

    public final String component1() {
        return this.errorMessage;
    }

    public final BigDecimal component2() {
        return this.intAmount;
    }

    public final BigDecimal component3() {
        return this.penAmount;
    }

    public final BigDecimal component4() {
        return this.priAmount;
    }

    public final PawnLoanApiModel copy(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        return new PawnLoanApiModel(str, bigDecimal, bigDecimal2, bigDecimal3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PawnLoanApiModel)) {
            return false;
        }
        PawnLoanApiModel pawnLoanApiModel = (PawnLoanApiModel) obj;
        return C41536l.m120484d(this.errorMessage, pawnLoanApiModel.errorMessage) && C41536l.m120484d(this.intAmount, pawnLoanApiModel.intAmount) && C41536l.m120484d(this.penAmount, pawnLoanApiModel.penAmount) && C41536l.m120484d(this.priAmount, pawnLoanApiModel.priAmount);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final BigDecimal getIntAmount() {
        return this.intAmount;
    }

    public final BigDecimal getPenAmount() {
        return this.penAmount;
    }

    public final BigDecimal getPriAmount() {
        return this.priAmount;
    }

    public int hashCode() {
        String str = this.errorMessage;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.intAmount;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.penAmount;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.priAmount;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.errorMessage;
        BigDecimal bigDecimal = this.intAmount;
        BigDecimal bigDecimal2 = this.penAmount;
        BigDecimal bigDecimal3 = this.priAmount;
        return "PawnLoanApiModel(errorMessage=" + str + ", intAmount=" + bigDecimal + ", penAmount=" + bigDecimal2 + ", priAmount=" + bigDecimal3 + ")";
    }
}
