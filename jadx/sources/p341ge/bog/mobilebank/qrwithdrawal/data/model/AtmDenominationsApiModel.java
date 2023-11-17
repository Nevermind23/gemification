package p341ge.bog.mobilebank.qrwithdrawal.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.qrwithdrawal.data.model.AtmDenominationsApiModel */
public final class AtmDenominationsApiModel {
    private final int count;
    private final String currency;
    private final int denomination;
    private final int exponent;
    private final int minCount;

    public AtmDenominationsApiModel(int i, String str, int i2, int i3, int i4) {
        C41536l.m120489i(str, "currency");
        this.denomination = i;
        this.currency = str;
        this.count = i2;
        this.minCount = i3;
        this.exponent = i4;
    }

    public static /* synthetic */ AtmDenominationsApiModel copy$default(AtmDenominationsApiModel atmDenominationsApiModel, int i, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = atmDenominationsApiModel.denomination;
        }
        if ((i5 & 2) != 0) {
            str = atmDenominationsApiModel.currency;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i2 = atmDenominationsApiModel.count;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = atmDenominationsApiModel.minCount;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = atmDenominationsApiModel.exponent;
        }
        return atmDenominationsApiModel.copy(i, str2, i6, i7, i4);
    }

    public final int component1() {
        return this.denomination;
    }

    public final String component2() {
        return this.currency;
    }

    public final int component3() {
        return this.count;
    }

    public final int component4() {
        return this.minCount;
    }

    public final int component5() {
        return this.exponent;
    }

    public final AtmDenominationsApiModel copy(int i, String str, int i2, int i3, int i4) {
        C41536l.m120489i(str, "currency");
        return new AtmDenominationsApiModel(i, str, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtmDenominationsApiModel)) {
            return false;
        }
        AtmDenominationsApiModel atmDenominationsApiModel = (AtmDenominationsApiModel) obj;
        return this.denomination == atmDenominationsApiModel.denomination && C41536l.m120484d(this.currency, atmDenominationsApiModel.currency) && this.count == atmDenominationsApiModel.count && this.minCount == atmDenominationsApiModel.minCount && this.exponent == atmDenominationsApiModel.exponent;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getDenomination() {
        return this.denomination;
    }

    public final int getExponent() {
        return this.exponent;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public int hashCode() {
        return (((((((this.denomination * 31) + this.currency.hashCode()) * 31) + this.count) * 31) + this.minCount) * 31) + this.exponent;
    }

    public String toString() {
        int i = this.denomination;
        String str = this.currency;
        int i2 = this.count;
        int i3 = this.minCount;
        int i4 = this.exponent;
        return "AtmDenominationsApiModel(denomination=" + i + ", currency=" + str + ", count=" + i2 + ", minCount=" + i3 + ", exponent=" + i4 + ")";
    }
}
