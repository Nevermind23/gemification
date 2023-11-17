package p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTDividendApiModel */
public final class GTDividendApiModel {
    private final String amountPerShare;
    private final String taxCode;
    private final String type;

    public GTDividendApiModel(String str, String str2, String str3) {
        this.type = str;
        this.amountPerShare = str2;
        this.taxCode = str3;
    }

    public static /* synthetic */ GTDividendApiModel copy$default(GTDividendApiModel gTDividendApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gTDividendApiModel.type;
        }
        if ((i & 2) != 0) {
            str2 = gTDividendApiModel.amountPerShare;
        }
        if ((i & 4) != 0) {
            str3 = gTDividendApiModel.taxCode;
        }
        return gTDividendApiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.amountPerShare;
    }

    public final String component3() {
        return this.taxCode;
    }

    public final GTDividendApiModel copy(String str, String str2, String str3) {
        return new GTDividendApiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTDividendApiModel)) {
            return false;
        }
        GTDividendApiModel gTDividendApiModel = (GTDividendApiModel) obj;
        return C41536l.m120484d(this.type, gTDividendApiModel.type) && C41536l.m120484d(this.amountPerShare, gTDividendApiModel.amountPerShare) && C41536l.m120484d(this.taxCode, gTDividendApiModel.taxCode);
    }

    public final String getAmountPerShare() {
        return this.amountPerShare;
    }

    public final String getTaxCode() {
        return this.taxCode;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amountPerShare;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taxCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.amountPerShare;
        String str3 = this.taxCode;
        return "GTDividendApiModel(type=" + str + ", amountPerShare=" + str2 + ", taxCode=" + str3 + ")";
    }
}
