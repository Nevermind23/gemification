package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.OverdueProductInfoApiModel */
public final class OverdueProductInfoApiModel {
    private final String ccy;

    /* renamed from: id */
    private final int f82306id;
    private final double overdueAmount;
    private final String productCode;

    public OverdueProductInfoApiModel(int i, String str, String str2, double d) {
        C41536l.m120489i(str, "productCode");
        C41536l.m120489i(str2, "ccy");
        this.f82306id = i;
        this.productCode = str;
        this.ccy = str2;
        this.overdueAmount = d;
    }

    public static /* synthetic */ OverdueProductInfoApiModel copy$default(OverdueProductInfoApiModel overdueProductInfoApiModel, int i, String str, String str2, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = overdueProductInfoApiModel.f82306id;
        }
        if ((i2 & 2) != 0) {
            str = overdueProductInfoApiModel.productCode;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = overdueProductInfoApiModel.ccy;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            d = overdueProductInfoApiModel.overdueAmount;
        }
        return overdueProductInfoApiModel.copy(i, str3, str4, d);
    }

    public final int component1() {
        return this.f82306id;
    }

    public final String component2() {
        return this.productCode;
    }

    public final String component3() {
        return this.ccy;
    }

    public final double component4() {
        return this.overdueAmount;
    }

    public final OverdueProductInfoApiModel copy(int i, String str, String str2, double d) {
        C41536l.m120489i(str, "productCode");
        C41536l.m120489i(str2, "ccy");
        return new OverdueProductInfoApiModel(i, str, str2, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverdueProductInfoApiModel)) {
            return false;
        }
        OverdueProductInfoApiModel overdueProductInfoApiModel = (OverdueProductInfoApiModel) obj;
        return this.f82306id == overdueProductInfoApiModel.f82306id && C41536l.m120484d(this.productCode, overdueProductInfoApiModel.productCode) && C41536l.m120484d(this.ccy, overdueProductInfoApiModel.ccy) && Double.compare(this.overdueAmount, overdueProductInfoApiModel.overdueAmount) == 0;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final int getId() {
        return this.f82306id;
    }

    public final double getOverdueAmount() {
        return this.overdueAmount;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public int hashCode() {
        return (((((this.f82306id * 31) + this.productCode.hashCode()) * 31) + this.ccy.hashCode()) * 31) + Double.doubleToLongBits(this.overdueAmount);
    }

    public String toString() {
        int i = this.f82306id;
        String str = this.productCode;
        String str2 = this.ccy;
        double d = this.overdueAmount;
        return "OverdueProductInfoApiModel(id=" + i + ", productCode=" + str + ", ccy=" + str2 + ", overdueAmount=" + d + ")";
    }
}
