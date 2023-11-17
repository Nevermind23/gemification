package p341ge.bog.mobilebank.loanactivation.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.LoanAccountEntity */
public final class LoanAccountEntity {
    private final Long acctKey;
    private final String acctNo;
    private final ExternalFileEntity cardExternalFile;
    @C8664c("pan2")
    private final String cardPan;
    private final ExternalFileEntity externalFile;
    private final String lastFour;
    private final String productDictionaryKey;

    public LoanAccountEntity(String str, String str2, Long l, String str3, String str4, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2) {
        this.productDictionaryKey = str;
        this.lastFour = str2;
        this.acctKey = l;
        this.cardPan = str3;
        this.acctNo = str4;
        this.externalFile = externalFileEntity;
        this.cardExternalFile = externalFileEntity2;
    }

    public static /* synthetic */ LoanAccountEntity copy$default(LoanAccountEntity loanAccountEntity, String str, String str2, Long l, String str3, String str4, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loanAccountEntity.productDictionaryKey;
        }
        if ((i & 2) != 0) {
            str2 = loanAccountEntity.lastFour;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            l = loanAccountEntity.acctKey;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str3 = loanAccountEntity.cardPan;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = loanAccountEntity.acctNo;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            externalFileEntity = loanAccountEntity.externalFile;
        }
        ExternalFileEntity externalFileEntity3 = externalFileEntity;
        if ((i & 64) != 0) {
            externalFileEntity2 = loanAccountEntity.cardExternalFile;
        }
        return loanAccountEntity.copy(str, str5, l2, str6, str7, externalFileEntity3, externalFileEntity2);
    }

    public final String component1() {
        return this.productDictionaryKey;
    }

    public final String component2() {
        return this.lastFour;
    }

    public final Long component3() {
        return this.acctKey;
    }

    public final String component4() {
        return this.cardPan;
    }

    public final String component5() {
        return this.acctNo;
    }

    public final ExternalFileEntity component6() {
        return this.externalFile;
    }

    public final ExternalFileEntity component7() {
        return this.cardExternalFile;
    }

    public final LoanAccountEntity copy(String str, String str2, Long l, String str3, String str4, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2) {
        return new LoanAccountEntity(str, str2, l, str3, str4, externalFileEntity, externalFileEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanAccountEntity)) {
            return false;
        }
        LoanAccountEntity loanAccountEntity = (LoanAccountEntity) obj;
        return C41536l.m120484d(this.productDictionaryKey, loanAccountEntity.productDictionaryKey) && C41536l.m120484d(this.lastFour, loanAccountEntity.lastFour) && C41536l.m120484d(this.acctKey, loanAccountEntity.acctKey) && C41536l.m120484d(this.cardPan, loanAccountEntity.cardPan) && C41536l.m120484d(this.acctNo, loanAccountEntity.acctNo) && C41536l.m120484d(this.externalFile, loanAccountEntity.externalFile) && C41536l.m120484d(this.cardExternalFile, loanAccountEntity.cardExternalFile);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final ExternalFileEntity getCardExternalFile() {
        return this.cardExternalFile;
    }

    public final String getCardPan() {
        return this.cardPan;
    }

    public final ExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public int hashCode() {
        String str = this.productDictionaryKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastFour;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.acctKey;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.cardPan;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acctNo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ExternalFileEntity externalFileEntity = this.externalFile;
        int hashCode6 = (hashCode5 + (externalFileEntity == null ? 0 : externalFileEntity.hashCode())) * 31;
        ExternalFileEntity externalFileEntity2 = this.cardExternalFile;
        if (externalFileEntity2 != null) {
            i = externalFileEntity2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.productDictionaryKey;
        String str2 = this.lastFour;
        Long l = this.acctKey;
        String str3 = this.cardPan;
        String str4 = this.acctNo;
        ExternalFileEntity externalFileEntity = this.externalFile;
        ExternalFileEntity externalFileEntity2 = this.cardExternalFile;
        return "LoanAccountEntity(productDictionaryKey=" + str + ", lastFour=" + str2 + ", acctKey=" + l + ", cardPan=" + str3 + ", acctNo=" + str4 + ", externalFile=" + externalFileEntity + ", cardExternalFile=" + externalFileEntity2 + ")";
    }
}
