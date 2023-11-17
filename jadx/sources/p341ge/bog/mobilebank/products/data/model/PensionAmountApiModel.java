package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.PensionAmountApiModel */
public final class PensionAmountApiModel {
    private final BigDecimal contribution;
    private final String customerId;
    private final boolean isMember;
    private final BigDecimal profit;
    private final BigDecimal totalSaving;
    private final boolean validationStatus;

    public PensionAmountApiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str, boolean z2, BigDecimal bigDecimal3) {
        this.totalSaving = bigDecimal;
        this.contribution = bigDecimal2;
        this.isMember = z;
        this.customerId = str;
        this.validationStatus = z2;
        this.profit = bigDecimal3;
    }

    public static /* synthetic */ PensionAmountApiModel copy$default(PensionAmountApiModel pensionAmountApiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str, boolean z2, BigDecimal bigDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = pensionAmountApiModel.totalSaving;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = pensionAmountApiModel.contribution;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        if ((i & 4) != 0) {
            z = pensionAmountApiModel.isMember;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str = pensionAmountApiModel.customerId;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z2 = pensionAmountApiModel.validationStatus;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            bigDecimal3 = pensionAmountApiModel.profit;
        }
        return pensionAmountApiModel.copy(bigDecimal, bigDecimal4, z3, str2, z4, bigDecimal3);
    }

    public final BigDecimal component1() {
        return this.totalSaving;
    }

    public final BigDecimal component2() {
        return this.contribution;
    }

    public final boolean component3() {
        return this.isMember;
    }

    public final String component4() {
        return this.customerId;
    }

    public final boolean component5() {
        return this.validationStatus;
    }

    public final BigDecimal component6() {
        return this.profit;
    }

    public final PensionAmountApiModel copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str, boolean z2, BigDecimal bigDecimal3) {
        return new PensionAmountApiModel(bigDecimal, bigDecimal2, z, str, z2, bigDecimal3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PensionAmountApiModel)) {
            return false;
        }
        PensionAmountApiModel pensionAmountApiModel = (PensionAmountApiModel) obj;
        return C41536l.m120484d(this.totalSaving, pensionAmountApiModel.totalSaving) && C41536l.m120484d(this.contribution, pensionAmountApiModel.contribution) && this.isMember == pensionAmountApiModel.isMember && C41536l.m120484d(this.customerId, pensionAmountApiModel.customerId) && this.validationStatus == pensionAmountApiModel.validationStatus && C41536l.m120484d(this.profit, pensionAmountApiModel.profit);
    }

    public final BigDecimal getContribution() {
        return this.contribution;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final BigDecimal getProfit() {
        return this.profit;
    }

    public final BigDecimal getTotalSaving() {
        return this.totalSaving;
    }

    public final boolean getValidationStatus() {
        return this.validationStatus;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.totalSaving;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.contribution;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        boolean z = this.isMember;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str = this.customerId;
        int hashCode3 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.validationStatus;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode3 + (z2 ? 1 : 0)) * 31;
        BigDecimal bigDecimal3 = this.profit;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return i3 + i;
    }

    public final boolean isMember() {
        return this.isMember;
    }

    public String toString() {
        BigDecimal bigDecimal = this.totalSaving;
        BigDecimal bigDecimal2 = this.contribution;
        boolean z = this.isMember;
        String str = this.customerId;
        boolean z2 = this.validationStatus;
        BigDecimal bigDecimal3 = this.profit;
        return "PensionAmountApiModel(totalSaving=" + bigDecimal + ", contribution=" + bigDecimal2 + ", isMember=" + z + ", customerId=" + str + ", validationStatus=" + z2 + ", profit=" + bigDecimal3 + ")";
    }
}
