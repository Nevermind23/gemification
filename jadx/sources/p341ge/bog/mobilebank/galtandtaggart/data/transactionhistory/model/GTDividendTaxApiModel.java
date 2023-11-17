package p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTDividendTaxApiModel */
public final class GTDividendTaxApiModel {
    private final String rate;
    private final String type;

    public GTDividendTaxApiModel(String str, String str2) {
        this.rate = str;
        this.type = str2;
    }

    public static /* synthetic */ GTDividendTaxApiModel copy$default(GTDividendTaxApiModel gTDividendTaxApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gTDividendTaxApiModel.rate;
        }
        if ((i & 2) != 0) {
            str2 = gTDividendTaxApiModel.type;
        }
        return gTDividendTaxApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.rate;
    }

    public final String component2() {
        return this.type;
    }

    public final GTDividendTaxApiModel copy(String str, String str2) {
        return new GTDividendTaxApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTDividendTaxApiModel)) {
            return false;
        }
        GTDividendTaxApiModel gTDividendTaxApiModel = (GTDividendTaxApiModel) obj;
        return C41536l.m120484d(this.rate, gTDividendTaxApiModel.rate) && C41536l.m120484d(this.type, gTDividendTaxApiModel.type);
    }

    public final String getRate() {
        return this.rate;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.rate;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.rate;
        String str2 = this.type;
        return "GTDividendTaxApiModel(rate=" + str + ", type=" + str2 + ")";
    }
}
