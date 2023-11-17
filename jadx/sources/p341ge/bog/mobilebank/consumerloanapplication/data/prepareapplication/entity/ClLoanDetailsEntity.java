package p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.ClLoanDetailsEntity */
public final class ClLoanDetailsEntity {
    private final BigDecimal amount;
    private final String applicationId;
    private final String applicationStatus;
    private final String currency;
    private final String resultCodeDictionaryKey;

    public ClLoanDetailsEntity(BigDecimal bigDecimal, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str3, "applicationStatus");
        this.amount = bigDecimal;
        this.currency = str;
        this.resultCodeDictionaryKey = str2;
        this.applicationStatus = str3;
        this.applicationId = str4;
    }

    public static /* synthetic */ ClLoanDetailsEntity copy$default(ClLoanDetailsEntity clLoanDetailsEntity, BigDecimal bigDecimal, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = clLoanDetailsEntity.amount;
        }
        if ((i & 2) != 0) {
            str = clLoanDetailsEntity.currency;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = clLoanDetailsEntity.resultCodeDictionaryKey;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = clLoanDetailsEntity.applicationStatus;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = clLoanDetailsEntity.applicationId;
        }
        return clLoanDetailsEntity.copy(bigDecimal, str5, str6, str7, str4);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final String component3() {
        return this.resultCodeDictionaryKey;
    }

    public final String component4() {
        return this.applicationStatus;
    }

    public final String component5() {
        return this.applicationId;
    }

    public final ClLoanDetailsEntity copy(BigDecimal bigDecimal, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str3, "applicationStatus");
        return new ClLoanDetailsEntity(bigDecimal, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClLoanDetailsEntity)) {
            return false;
        }
        ClLoanDetailsEntity clLoanDetailsEntity = (ClLoanDetailsEntity) obj;
        return C41536l.m120484d(this.amount, clLoanDetailsEntity.amount) && C41536l.m120484d(this.currency, clLoanDetailsEntity.currency) && C41536l.m120484d(this.resultCodeDictionaryKey, clLoanDetailsEntity.resultCodeDictionaryKey) && C41536l.m120484d(this.applicationStatus, clLoanDetailsEntity.applicationStatus) && C41536l.m120484d(this.applicationId, clLoanDetailsEntity.applicationId);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getApplicationStatus() {
        return this.applicationStatus;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getResultCodeDictionaryKey() {
        return this.resultCodeDictionaryKey;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resultCodeDictionaryKey;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.applicationStatus.hashCode()) * 31;
        String str3 = this.applicationId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.currency;
        String str2 = this.resultCodeDictionaryKey;
        String str3 = this.applicationStatus;
        String str4 = this.applicationId;
        return "ClLoanDetailsEntity(amount=" + bigDecimal + ", currency=" + str + ", resultCodeDictionaryKey=" + str2 + ", applicationStatus=" + str3 + ", applicationId=" + str4 + ")";
    }
}
