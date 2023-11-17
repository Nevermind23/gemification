package p341ge.bog.mobilebank.cleanarch.data.offer.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.offer.entity.LoanOfferLimitEntity */
public final class LoanOfferLimitEntity {
    private final String infoDictionaryKey;
    private final String infoDictionaryKeyValue;
    private final String limitCategory;
    private final BigDecimal loanAmount;
    private final String loanCcy;
    private final String operationType;
    private final String titleDictionaryKey;
    private final String titleDictionaryKeyValue;

    public LoanOfferLimitEntity(String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "operationType");
        C41536l.m120489i(str2, "limitCategory");
        C41536l.m120489i(str3, "loanCcy");
        C41536l.m120489i(bigDecimal, "loanAmount");
        this.operationType = str;
        this.limitCategory = str2;
        this.loanCcy = str3;
        this.loanAmount = bigDecimal;
        this.titleDictionaryKey = str4;
        this.titleDictionaryKeyValue = str5;
        this.infoDictionaryKey = str6;
        this.infoDictionaryKeyValue = str7;
    }

    public static /* synthetic */ LoanOfferLimitEntity copy$default(LoanOfferLimitEntity loanOfferLimitEntity, String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, String str6, String str7, int i, Object obj) {
        LoanOfferLimitEntity loanOfferLimitEntity2 = loanOfferLimitEntity;
        int i2 = i;
        return loanOfferLimitEntity.copy((i2 & 1) != 0 ? loanOfferLimitEntity2.operationType : str, (i2 & 2) != 0 ? loanOfferLimitEntity2.limitCategory : str2, (i2 & 4) != 0 ? loanOfferLimitEntity2.loanCcy : str3, (i2 & 8) != 0 ? loanOfferLimitEntity2.loanAmount : bigDecimal, (i2 & 16) != 0 ? loanOfferLimitEntity2.titleDictionaryKey : str4, (i2 & 32) != 0 ? loanOfferLimitEntity2.titleDictionaryKeyValue : str5, (i2 & 64) != 0 ? loanOfferLimitEntity2.infoDictionaryKey : str6, (i2 & 128) != 0 ? loanOfferLimitEntity2.infoDictionaryKeyValue : str7);
    }

    public final String component1() {
        return this.operationType;
    }

    public final String component2() {
        return this.limitCategory;
    }

    public final String component3() {
        return this.loanCcy;
    }

    public final BigDecimal component4() {
        return this.loanAmount;
    }

    public final String component5() {
        return this.titleDictionaryKey;
    }

    public final String component6() {
        return this.titleDictionaryKeyValue;
    }

    public final String component7() {
        return this.infoDictionaryKey;
    }

    public final String component8() {
        return this.infoDictionaryKeyValue;
    }

    public final LoanOfferLimitEntity copy(String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "operationType");
        C41536l.m120489i(str2, "limitCategory");
        C41536l.m120489i(str3, "loanCcy");
        C41536l.m120489i(bigDecimal, "loanAmount");
        return new LoanOfferLimitEntity(str, str2, str3, bigDecimal, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanOfferLimitEntity)) {
            return false;
        }
        LoanOfferLimitEntity loanOfferLimitEntity = (LoanOfferLimitEntity) obj;
        return C41536l.m120484d(this.operationType, loanOfferLimitEntity.operationType) && C41536l.m120484d(this.limitCategory, loanOfferLimitEntity.limitCategory) && C41536l.m120484d(this.loanCcy, loanOfferLimitEntity.loanCcy) && C41536l.m120484d(this.loanAmount, loanOfferLimitEntity.loanAmount) && C41536l.m120484d(this.titleDictionaryKey, loanOfferLimitEntity.titleDictionaryKey) && C41536l.m120484d(this.titleDictionaryKeyValue, loanOfferLimitEntity.titleDictionaryKeyValue) && C41536l.m120484d(this.infoDictionaryKey, loanOfferLimitEntity.infoDictionaryKey) && C41536l.m120484d(this.infoDictionaryKeyValue, loanOfferLimitEntity.infoDictionaryKeyValue);
    }

    public final String getInfoDictionaryKey() {
        return this.infoDictionaryKey;
    }

    public final String getInfoDictionaryKeyValue() {
        return this.infoDictionaryKeyValue;
    }

    public final String getLimitCategory() {
        return this.limitCategory;
    }

    public final BigDecimal getLoanAmount() {
        return this.loanAmount;
    }

    public final String getLoanCcy() {
        return this.loanCcy;
    }

    public final String getOperationType() {
        return this.operationType;
    }

    public final String getTitleDictionaryKey() {
        return this.titleDictionaryKey;
    }

    public final String getTitleDictionaryKeyValue() {
        return this.titleDictionaryKeyValue;
    }

    public int hashCode() {
        int hashCode = ((((((this.operationType.hashCode() * 31) + this.limitCategory.hashCode()) * 31) + this.loanCcy.hashCode()) * 31) + this.loanAmount.hashCode()) * 31;
        String str = this.titleDictionaryKey;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleDictionaryKeyValue;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.infoDictionaryKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.infoDictionaryKeyValue;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.operationType;
        String str2 = this.limitCategory;
        String str3 = this.loanCcy;
        BigDecimal bigDecimal = this.loanAmount;
        String str4 = this.titleDictionaryKey;
        String str5 = this.titleDictionaryKeyValue;
        String str6 = this.infoDictionaryKey;
        String str7 = this.infoDictionaryKeyValue;
        return "LoanOfferLimitEntity(operationType=" + str + ", limitCategory=" + str2 + ", loanCcy=" + str3 + ", loanAmount=" + bigDecimal + ", titleDictionaryKey=" + str4 + ", titleDictionaryKeyValue=" + str5 + ", infoDictionaryKey=" + str6 + ", infoDictionaryKeyValue=" + str7 + ")";
    }
}
