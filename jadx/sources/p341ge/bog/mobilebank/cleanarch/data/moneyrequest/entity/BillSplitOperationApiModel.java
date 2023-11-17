package p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.BillSplitOperationApiModel */
public final class BillSplitOperationApiModel {
    private final double amount;
    private final Boolean canTint;
    private final String description;
    private final String imageUrl;
    private final BillSplitOperationTypeApiModel operationType;

    public BillSplitOperationApiModel(BillSplitOperationTypeApiModel billSplitOperationTypeApiModel, double d, String str, String str2, Boolean bool) {
        C41536l.m120489i(billSplitOperationTypeApiModel, "operationType");
        this.operationType = billSplitOperationTypeApiModel;
        this.amount = d;
        this.description = str;
        this.imageUrl = str2;
        this.canTint = bool;
    }

    public static /* synthetic */ BillSplitOperationApiModel copy$default(BillSplitOperationApiModel billSplitOperationApiModel, BillSplitOperationTypeApiModel billSplitOperationTypeApiModel, double d, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            billSplitOperationTypeApiModel = billSplitOperationApiModel.operationType;
        }
        if ((i & 2) != 0) {
            d = billSplitOperationApiModel.amount;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str = billSplitOperationApiModel.description;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = billSplitOperationApiModel.imageUrl;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = billSplitOperationApiModel.canTint;
        }
        return billSplitOperationApiModel.copy(billSplitOperationTypeApiModel, d2, str3, str4, bool);
    }

    public final BillSplitOperationTypeApiModel component1() {
        return this.operationType;
    }

    public final double component2() {
        return this.amount;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final Boolean component5() {
        return this.canTint;
    }

    public final BillSplitOperationApiModel copy(BillSplitOperationTypeApiModel billSplitOperationTypeApiModel, double d, String str, String str2, Boolean bool) {
        C41536l.m120489i(billSplitOperationTypeApiModel, "operationType");
        return new BillSplitOperationApiModel(billSplitOperationTypeApiModel, d, str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillSplitOperationApiModel)) {
            return false;
        }
        BillSplitOperationApiModel billSplitOperationApiModel = (BillSplitOperationApiModel) obj;
        return this.operationType == billSplitOperationApiModel.operationType && Double.compare(this.amount, billSplitOperationApiModel.amount) == 0 && C41536l.m120484d(this.description, billSplitOperationApiModel.description) && C41536l.m120484d(this.imageUrl, billSplitOperationApiModel.imageUrl) && C41536l.m120484d(this.canTint, billSplitOperationApiModel.canTint);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Boolean getCanTint() {
        return this.canTint;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final BillSplitOperationTypeApiModel getOperationType() {
        return this.operationType;
    }

    public int hashCode() {
        int hashCode = ((this.operationType.hashCode() * 31) + Double.doubleToLongBits(this.amount)) * 31;
        String str = this.description;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.canTint;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BillSplitOperationTypeApiModel billSplitOperationTypeApiModel = this.operationType;
        double d = this.amount;
        String str = this.description;
        String str2 = this.imageUrl;
        Boolean bool = this.canTint;
        return "BillSplitOperationApiModel(operationType=" + billSplitOperationTypeApiModel + ", amount=" + d + ", description=" + str + ", imageUrl=" + str2 + ", canTint=" + bool + ")";
    }
}
