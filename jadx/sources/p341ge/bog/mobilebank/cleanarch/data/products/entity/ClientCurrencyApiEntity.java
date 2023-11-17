package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.ClientCurrencyApiEntity */
public final class ClientCurrencyApiEntity {
    private final String CCY;
    private final String dictionaryKeyId;
    private final String dictionaryValue;
    private final int orderNo;

    public ClientCurrencyApiEntity(String str, int i, String str2, String str3) {
        C41536l.m120489i(str, "CCY");
        C41536l.m120489i(str3, "dictionaryValue");
        this.CCY = str;
        this.orderNo = i;
        this.dictionaryKeyId = str2;
        this.dictionaryValue = str3;
    }

    public static /* synthetic */ ClientCurrencyApiEntity copy$default(ClientCurrencyApiEntity clientCurrencyApiEntity, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = clientCurrencyApiEntity.CCY;
        }
        if ((i2 & 2) != 0) {
            i = clientCurrencyApiEntity.orderNo;
        }
        if ((i2 & 4) != 0) {
            str2 = clientCurrencyApiEntity.dictionaryKeyId;
        }
        if ((i2 & 8) != 0) {
            str3 = clientCurrencyApiEntity.dictionaryValue;
        }
        return clientCurrencyApiEntity.copy(str, i, str2, str3);
    }

    public final String component1() {
        return this.CCY;
    }

    public final int component2() {
        return this.orderNo;
    }

    public final String component3() {
        return this.dictionaryKeyId;
    }

    public final String component4() {
        return this.dictionaryValue;
    }

    public final ClientCurrencyApiEntity copy(String str, int i, String str2, String str3) {
        C41536l.m120489i(str, "CCY");
        C41536l.m120489i(str3, "dictionaryValue");
        return new ClientCurrencyApiEntity(str, i, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientCurrencyApiEntity)) {
            return false;
        }
        ClientCurrencyApiEntity clientCurrencyApiEntity = (ClientCurrencyApiEntity) obj;
        return C41536l.m120484d(this.CCY, clientCurrencyApiEntity.CCY) && this.orderNo == clientCurrencyApiEntity.orderNo && C41536l.m120484d(this.dictionaryKeyId, clientCurrencyApiEntity.dictionaryKeyId) && C41536l.m120484d(this.dictionaryValue, clientCurrencyApiEntity.dictionaryValue);
    }

    public final String getCCY() {
        return this.CCY;
    }

    public final String getDictionaryKeyId() {
        return this.dictionaryKeyId;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final int getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        int hashCode = ((this.CCY.hashCode() * 31) + this.orderNo) * 31;
        String str = this.dictionaryKeyId;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dictionaryValue.hashCode();
    }

    public String toString() {
        String str = this.CCY;
        int i = this.orderNo;
        String str2 = this.dictionaryKeyId;
        String str3 = this.dictionaryValue;
        return "ClientCurrencyApiEntity(CCY=" + str + ", orderNo=" + i + ", dictionaryKeyId=" + str2 + ", dictionaryValue=" + str3 + ")";
    }
}
