package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusAccountEntity */
public final class BonusAccountEntity {
    private final long acctKey;
    private final String acctName;
    private final String acctNo;
    private final BigDecimal availableAmount;
    private final String ccy;
    private transient boolean isSelected;

    public BonusAccountEntity() {
        this(0, (String) null, (BigDecimal) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public BonusAccountEntity(long j, String str, BigDecimal bigDecimal, String str2, String str3) {
        this.acctKey = j;
        this.acctName = str;
        this.availableAmount = bigDecimal;
        this.ccy = str2;
        this.acctNo = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BonusAccountEntity(long j, String str, BigDecimal bigDecimal, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
