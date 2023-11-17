package p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.LoanTypeEntity */
public final class LoanTypeEntity {
    private final String defaultSubProduct;
    private final String dictionaryKey;
    private final String loanType;

    public LoanTypeEntity(String str, String str2, String str3) {
        C41536l.m120489i(str, "loanType");
        C41536l.m120489i(str2, "dictionaryKey");
        C41536l.m120489i(str3, "defaultSubProduct");
        this.loanType = str;
        this.dictionaryKey = str2;
        this.defaultSubProduct = str3;
    }

    public static /* synthetic */ LoanTypeEntity copy$default(LoanTypeEntity loanTypeEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loanTypeEntity.loanType;
        }
        if ((i & 2) != 0) {
            str2 = loanTypeEntity.dictionaryKey;
        }
        if ((i & 4) != 0) {
            str3 = loanTypeEntity.defaultSubProduct;
        }
        return loanTypeEntity.copy(str, str2, str3);
    }

    public final String component1() {
        return this.loanType;
    }

    public final String component2() {
        return this.dictionaryKey;
    }

    public final String component3() {
        return this.defaultSubProduct;
    }

    public final LoanTypeEntity copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "loanType");
        C41536l.m120489i(str2, "dictionaryKey");
        C41536l.m120489i(str3, "defaultSubProduct");
        return new LoanTypeEntity(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanTypeEntity)) {
            return false;
        }
        LoanTypeEntity loanTypeEntity = (LoanTypeEntity) obj;
        return C41536l.m120484d(this.loanType, loanTypeEntity.loanType) && C41536l.m120484d(this.dictionaryKey, loanTypeEntity.dictionaryKey) && C41536l.m120484d(this.defaultSubProduct, loanTypeEntity.defaultSubProduct);
    }

    public final String getDefaultSubProduct() {
        return this.defaultSubProduct;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getLoanType() {
        return this.loanType;
    }

    public int hashCode() {
        return (((this.loanType.hashCode() * 31) + this.dictionaryKey.hashCode()) * 31) + this.defaultSubProduct.hashCode();
    }

    public String toString() {
        String str = this.loanType;
        String str2 = this.dictionaryKey;
        String str3 = this.defaultSubProduct;
        return "LoanTypeEntity(loanType=" + str + ", dictionaryKey=" + str2 + ", defaultSubProduct=" + str3 + ")";
    }
}
