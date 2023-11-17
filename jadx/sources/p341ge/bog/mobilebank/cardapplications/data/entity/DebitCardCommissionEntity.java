package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardCommissionEntity */
public final class DebitCardCommissionEntity {
    private final BigDecimal comAmount;
    private final String comCcy;
    private final String newAccPackage;

    public DebitCardCommissionEntity(BigDecimal bigDecimal, String str, String str2) {
        C41536l.m120489i(str2, "newAccPackage");
        this.comAmount = bigDecimal;
        this.comCcy = str;
        this.newAccPackage = str2;
    }

    public static /* synthetic */ DebitCardCommissionEntity copy$default(DebitCardCommissionEntity debitCardCommissionEntity, BigDecimal bigDecimal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = debitCardCommissionEntity.comAmount;
        }
        if ((i & 2) != 0) {
            str = debitCardCommissionEntity.comCcy;
        }
        if ((i & 4) != 0) {
            str2 = debitCardCommissionEntity.newAccPackage;
        }
        return debitCardCommissionEntity.copy(bigDecimal, str, str2);
    }

    public final BigDecimal component1() {
        return this.comAmount;
    }

    public final String component2() {
        return this.comCcy;
    }

    public final String component3() {
        return this.newAccPackage;
    }

    public final DebitCardCommissionEntity copy(BigDecimal bigDecimal, String str, String str2) {
        C41536l.m120489i(str2, "newAccPackage");
        return new DebitCardCommissionEntity(bigDecimal, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardCommissionEntity)) {
            return false;
        }
        DebitCardCommissionEntity debitCardCommissionEntity = (DebitCardCommissionEntity) obj;
        return C41536l.m120484d(this.comAmount, debitCardCommissionEntity.comAmount) && C41536l.m120484d(this.comCcy, debitCardCommissionEntity.comCcy) && C41536l.m120484d(this.newAccPackage, debitCardCommissionEntity.newAccPackage);
    }

    public final BigDecimal getComAmount() {
        return this.comAmount;
    }

    public final String getComCcy() {
        return this.comCcy;
    }

    public final String getNewAccPackage() {
        return this.newAccPackage;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.comAmount;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.comCcy;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.newAccPackage.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.comAmount;
        String str = this.comCcy;
        String str2 = this.newAccPackage;
        return "DebitCardCommissionEntity(comAmount=" + bigDecimal + ", comCcy=" + str + ", newAccPackage=" + str2 + ")";
    }
}
