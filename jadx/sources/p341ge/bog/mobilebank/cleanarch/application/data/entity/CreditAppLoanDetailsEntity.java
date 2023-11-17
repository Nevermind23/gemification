package p341ge.bog.mobilebank.cleanarch.application.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.application.data.entity.CreditAppLoanDetailsEntity */
public final class CreditAppLoanDetailsEntity {
    private final BigDecimal amount;
    private final String condition;
    private final String currency;
    private final String loanStatusKey;
    private final String resultCodeDictionaryKey;
    private final String term;

    public CreditAppLoanDetailsEntity(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5) {
        this.loanStatusKey = str;
        this.resultCodeDictionaryKey = str2;
        this.amount = bigDecimal;
        this.currency = str3;
        this.term = str4;
        this.condition = str5;
    }

    public static /* synthetic */ CreditAppLoanDetailsEntity copy$default(CreditAppLoanDetailsEntity creditAppLoanDetailsEntity, String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditAppLoanDetailsEntity.loanStatusKey;
        }
        if ((i & 2) != 0) {
            str2 = creditAppLoanDetailsEntity.resultCodeDictionaryKey;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            bigDecimal = creditAppLoanDetailsEntity.amount;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 8) != 0) {
            str3 = creditAppLoanDetailsEntity.currency;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = creditAppLoanDetailsEntity.term;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = creditAppLoanDetailsEntity.condition;
        }
        return creditAppLoanDetailsEntity.copy(str, str6, bigDecimal2, str7, str8, str5);
    }

    public final String component1() {
        return this.loanStatusKey;
    }

    public final String component2() {
        return this.resultCodeDictionaryKey;
    }

    public final BigDecimal component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final String component5() {
        return this.term;
    }

    public final String component6() {
        return this.condition;
    }

    public final CreditAppLoanDetailsEntity copy(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5) {
        return new CreditAppLoanDetailsEntity(str, str2, bigDecimal, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditAppLoanDetailsEntity)) {
            return false;
        }
        CreditAppLoanDetailsEntity creditAppLoanDetailsEntity = (CreditAppLoanDetailsEntity) obj;
        return C41536l.m120484d(this.loanStatusKey, creditAppLoanDetailsEntity.loanStatusKey) && C41536l.m120484d(this.resultCodeDictionaryKey, creditAppLoanDetailsEntity.resultCodeDictionaryKey) && C41536l.m120484d(this.amount, creditAppLoanDetailsEntity.amount) && C41536l.m120484d(this.currency, creditAppLoanDetailsEntity.currency) && C41536l.m120484d(this.term, creditAppLoanDetailsEntity.term) && C41536l.m120484d(this.condition, creditAppLoanDetailsEntity.condition);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLoanStatusKey() {
        return this.loanStatusKey;
    }

    public final String getResultCodeDictionaryKey() {
        return this.resultCodeDictionaryKey;
    }

    public final String getTerm() {
        return this.term;
    }

    public int hashCode() {
        String str = this.loanStatusKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resultCodeDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.term;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.condition;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.loanStatusKey;
        String str2 = this.resultCodeDictionaryKey;
        BigDecimal bigDecimal = this.amount;
        String str3 = this.currency;
        String str4 = this.term;
        String str5 = this.condition;
        return "CreditAppLoanDetailsEntity(loanStatusKey=" + str + ", resultCodeDictionaryKey=" + str2 + ", amount=" + bigDecimal + ", currency=" + str3 + ", term=" + str4 + ", condition=" + str5 + ")";
    }
}
