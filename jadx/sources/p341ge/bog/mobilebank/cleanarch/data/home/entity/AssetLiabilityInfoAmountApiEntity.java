package p341ge.bog.mobilebank.cleanarch.data.home.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityInfoAmountApiEntity */
public final class AssetLiabilityInfoAmountApiEntity {
    private final BigDecimal amount;
    private final String ccy;

    /* renamed from: id */
    private final long f56449id;
    private final long orderNo;

    public AssetLiabilityInfoAmountApiEntity(long j, String str, long j2, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(bigDecimal, "amount");
        this.f56449id = j;
        this.ccy = str;
        this.orderNo = j2;
        this.amount = bigDecimal;
    }

    public static /* synthetic */ AssetLiabilityInfoAmountApiEntity copy$default(AssetLiabilityInfoAmountApiEntity assetLiabilityInfoAmountApiEntity, long j, String str, long j2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            j = assetLiabilityInfoAmountApiEntity.f56449id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = assetLiabilityInfoAmountApiEntity.ccy;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = assetLiabilityInfoAmountApiEntity.orderNo;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            bigDecimal = assetLiabilityInfoAmountApiEntity.amount;
        }
        return assetLiabilityInfoAmountApiEntity.copy(j3, str2, j4, bigDecimal);
    }

    public final long component1() {
        return this.f56449id;
    }

    public final String component2() {
        return this.ccy;
    }

    public final long component3() {
        return this.orderNo;
    }

    public final BigDecimal component4() {
        return this.amount;
    }

    public final AssetLiabilityInfoAmountApiEntity copy(long j, String str, long j2, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(bigDecimal, "amount");
        return new AssetLiabilityInfoAmountApiEntity(j, str, j2, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetLiabilityInfoAmountApiEntity)) {
            return false;
        }
        AssetLiabilityInfoAmountApiEntity assetLiabilityInfoAmountApiEntity = (AssetLiabilityInfoAmountApiEntity) obj;
        return this.f56449id == assetLiabilityInfoAmountApiEntity.f56449id && C41536l.m120484d(this.ccy, assetLiabilityInfoAmountApiEntity.ccy) && this.orderNo == assetLiabilityInfoAmountApiEntity.orderNo && C41536l.m120484d(this.amount, assetLiabilityInfoAmountApiEntity.amount);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getId() {
        return this.f56449id;
    }

    public final long getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        return (((((C7397t.m28148a(this.f56449id) * 31) + this.ccy.hashCode()) * 31) + C7397t.m28148a(this.orderNo)) * 31) + this.amount.hashCode();
    }

    public String toString() {
        long j = this.f56449id;
        String str = this.ccy;
        long j2 = this.orderNo;
        BigDecimal bigDecimal = this.amount;
        return "AssetLiabilityInfoAmountApiEntity(id=" + j + ", ccy=" + str + ", orderNo=" + j2 + ", amount=" + bigDecimal + ")";
    }
}
