package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.LookupApiModel */
public final class LookupApiModel {
    private final String dictionaryKey;
    private final Integer dictionaryKeyId;
    private final String dictionaryValue;
    private final String dictionaryValueEn;

    /* renamed from: id */
    private final long f62392id;
    private final String lookupName;
    private final String lookupValue;
    private final Integer orderNumber;

    public LookupApiModel(long j, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(str2, "lookupName");
        C41536l.m120489i(str3, "lookupValue");
        this.f62392id = j;
        this.dictionaryKey = str;
        this.lookupName = str2;
        this.lookupValue = str3;
        this.orderNumber = num;
        this.dictionaryKeyId = num2;
        this.dictionaryValue = str4;
        this.dictionaryValueEn = str5;
    }

    public static /* synthetic */ LookupApiModel copy$default(LookupApiModel lookupApiModel, long j, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, int i, Object obj) {
        LookupApiModel lookupApiModel2 = lookupApiModel;
        int i2 = i;
        return lookupApiModel.copy((i2 & 1) != 0 ? lookupApiModel2.f62392id : j, (i2 & 2) != 0 ? lookupApiModel2.dictionaryKey : str, (i2 & 4) != 0 ? lookupApiModel2.lookupName : str2, (i2 & 8) != 0 ? lookupApiModel2.lookupValue : str3, (i2 & 16) != 0 ? lookupApiModel2.orderNumber : num, (i2 & 32) != 0 ? lookupApiModel2.dictionaryKeyId : num2, (i2 & 64) != 0 ? lookupApiModel2.dictionaryValue : str4, (i2 & 128) != 0 ? lookupApiModel2.dictionaryValueEn : str5);
    }

    public final long component1() {
        return this.f62392id;
    }

    public final String component2() {
        return this.dictionaryKey;
    }

    public final String component3() {
        return this.lookupName;
    }

    public final String component4() {
        return this.lookupValue;
    }

    public final Integer component5() {
        return this.orderNumber;
    }

    public final Integer component6() {
        return this.dictionaryKeyId;
    }

    public final String component7() {
        return this.dictionaryValue;
    }

    public final String component8() {
        return this.dictionaryValueEn;
    }

    public final LookupApiModel copy(long j, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(str2, "lookupName");
        String str6 = str3;
        C41536l.m120489i(str6, "lookupValue");
        return new LookupApiModel(j, str, str2, str6, num, num2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LookupApiModel)) {
            return false;
        }
        LookupApiModel lookupApiModel = (LookupApiModel) obj;
        return this.f62392id == lookupApiModel.f62392id && C41536l.m120484d(this.dictionaryKey, lookupApiModel.dictionaryKey) && C41536l.m120484d(this.lookupName, lookupApiModel.lookupName) && C41536l.m120484d(this.lookupValue, lookupApiModel.lookupValue) && C41536l.m120484d(this.orderNumber, lookupApiModel.orderNumber) && C41536l.m120484d(this.dictionaryKeyId, lookupApiModel.dictionaryKeyId) && C41536l.m120484d(this.dictionaryValue, lookupApiModel.dictionaryValue) && C41536l.m120484d(this.dictionaryValueEn, lookupApiModel.dictionaryValueEn);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final Integer getDictionaryKeyId() {
        return this.dictionaryKeyId;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final String getDictionaryValueEn() {
        return this.dictionaryValueEn;
    }

    public final long getId() {
        return this.f62392id;
    }

    public final String getLookupName() {
        return this.lookupName;
    }

    public final String getLookupValue() {
        return this.lookupValue;
    }

    public final Integer getOrderNumber() {
        return this.orderNumber;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f62392id) * 31) + this.dictionaryKey.hashCode()) * 31) + this.lookupName.hashCode()) * 31) + this.lookupValue.hashCode()) * 31;
        Integer num = this.orderNumber;
        int i = 0;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dictionaryKeyId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.dictionaryValue;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dictionaryValueEn;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.f62392id;
        String str = this.dictionaryKey;
        String str2 = this.lookupName;
        String str3 = this.lookupValue;
        Integer num = this.orderNumber;
        Integer num2 = this.dictionaryKeyId;
        String str4 = this.dictionaryValue;
        String str5 = this.dictionaryValueEn;
        return "LookupApiModel(id=" + j + ", dictionaryKey=" + str + ", lookupName=" + str2 + ", lookupValue=" + str3 + ", orderNumber=" + num + ", dictionaryKeyId=" + num2 + ", dictionaryValue=" + str4 + ", dictionaryValueEn=" + str5 + ")";
    }
}
