package p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity;

import androidx.annotation.Keep;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferCommissionApiModel */
public final class MoneyTransferCommissionApiModel {
    private final Double commissionAnount;
    private final String commissionCcy;
    private final String commissionDescDictionaryKey;

    public MoneyTransferCommissionApiModel() {
        this((Double) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MoneyTransferCommissionApiModel copy$default(MoneyTransferCommissionApiModel moneyTransferCommissionApiModel, Double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = moneyTransferCommissionApiModel.commissionAnount;
        }
        if ((i & 2) != 0) {
            str = moneyTransferCommissionApiModel.commissionCcy;
        }
        if ((i & 4) != 0) {
            str2 = moneyTransferCommissionApiModel.commissionDescDictionaryKey;
        }
        return moneyTransferCommissionApiModel.copy(d, str, str2);
    }

    public final Double component1() {
        return this.commissionAnount;
    }

    public final String component2() {
        return this.commissionCcy;
    }

    public final String component3() {
        return this.commissionDescDictionaryKey;
    }

    public final MoneyTransferCommissionApiModel copy(Double d, String str, String str2) {
        return new MoneyTransferCommissionApiModel(d, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferCommissionApiModel)) {
            return false;
        }
        MoneyTransferCommissionApiModel moneyTransferCommissionApiModel = (MoneyTransferCommissionApiModel) obj;
        return C41536l.m120484d(this.commissionAnount, moneyTransferCommissionApiModel.commissionAnount) && C41536l.m120484d(this.commissionCcy, moneyTransferCommissionApiModel.commissionCcy) && C41536l.m120484d(this.commissionDescDictionaryKey, moneyTransferCommissionApiModel.commissionDescDictionaryKey);
    }

    public final Double getCommissionAnount() {
        return this.commissionAnount;
    }

    public final String getCommissionCcy() {
        return this.commissionCcy;
    }

    public final String getCommissionDescDictionaryKey() {
        return this.commissionDescDictionaryKey;
    }

    public int hashCode() {
        Double d = this.commissionAnount;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.commissionCcy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.commissionDescDictionaryKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Double d = this.commissionAnount;
        String str = this.commissionCcy;
        String str2 = this.commissionDescDictionaryKey;
        return "MoneyTransferCommissionApiModel(commissionAnount=" + d + ", commissionCcy=" + str + ", commissionDescDictionaryKey=" + str2 + ")";
    }

    public MoneyTransferCommissionApiModel(Double d, String str, String str2) {
        this.commissionAnount = d;
        this.commissionCcy = str;
        this.commissionDescDictionaryKey = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyTransferCommissionApiModel(Double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Double.valueOf(Utils.DOUBLE_EPSILON) : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
