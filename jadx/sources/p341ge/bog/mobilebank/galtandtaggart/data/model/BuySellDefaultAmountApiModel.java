package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.BuySellDefaultAmountApiModel */
public final class BuySellDefaultAmountApiModel {
    private final String dictionaryKey;
    private final String lookupValue;

    public BuySellDefaultAmountApiModel() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BuySellDefaultAmountApiModel copy$default(BuySellDefaultAmountApiModel buySellDefaultAmountApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buySellDefaultAmountApiModel.lookupValue;
        }
        if ((i & 2) != 0) {
            str2 = buySellDefaultAmountApiModel.dictionaryKey;
        }
        return buySellDefaultAmountApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.lookupValue;
    }

    public final String component2() {
        return this.dictionaryKey;
    }

    public final BuySellDefaultAmountApiModel copy(String str, String str2) {
        C41536l.m120489i(str, "lookupValue");
        C41536l.m120489i(str2, "dictionaryKey");
        return new BuySellDefaultAmountApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuySellDefaultAmountApiModel)) {
            return false;
        }
        BuySellDefaultAmountApiModel buySellDefaultAmountApiModel = (BuySellDefaultAmountApiModel) obj;
        return C41536l.m120484d(this.lookupValue, buySellDefaultAmountApiModel.lookupValue) && C41536l.m120484d(this.dictionaryKey, buySellDefaultAmountApiModel.dictionaryKey);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getLookupValue() {
        return this.lookupValue;
    }

    public int hashCode() {
        return (this.lookupValue.hashCode() * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        String str = this.lookupValue;
        String str2 = this.dictionaryKey;
        return "BuySellDefaultAmountApiModel(lookupValue=" + str + ", dictionaryKey=" + str2 + ")";
    }

    public BuySellDefaultAmountApiModel(String str, String str2) {
        C41536l.m120489i(str, "lookupValue");
        C41536l.m120489i(str2, "dictionaryKey");
        this.lookupValue = str;
        this.dictionaryKey = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BuySellDefaultAmountApiModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BankApiResponse.SUCCESSFUL_RESPONSE_CODE : str, (i & 2) != 0 ? "" : str2);
    }
}
