package p341ge.bog.mobilebank.cleanarch.data.home.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityPointApiEntity */
public final class AssetLiabilityPointApiEntity {
    private final BigDecimal amount;
    private final BigDecimal amountInGel;
    private final String dictionaryKey;
    private final String firstName;
    private final String format;

    /* renamed from: id */
    private final long f56450id;
    private final long orderNo;
    private final String prodType;
    private final boolean scoolcardFlag;

    public AssetLiabilityPointApiEntity(long j, String str, long j2, BigDecimal bigDecimal, String str2, boolean z, String str3, String str4, BigDecimal bigDecimal2) {
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str2, "format");
        C41536l.m120489i(str4, "prodType");
        this.f56450id = j;
        this.dictionaryKey = str;
        this.orderNo = j2;
        this.amount = bigDecimal;
        this.format = str2;
        this.scoolcardFlag = z;
        this.firstName = str3;
        this.prodType = str4;
        this.amountInGel = bigDecimal2;
    }

    public static /* synthetic */ AssetLiabilityPointApiEntity copy$default(AssetLiabilityPointApiEntity assetLiabilityPointApiEntity, long j, String str, long j2, BigDecimal bigDecimal, String str2, boolean z, String str3, String str4, BigDecimal bigDecimal2, int i, Object obj) {
        AssetLiabilityPointApiEntity assetLiabilityPointApiEntity2 = assetLiabilityPointApiEntity;
        int i2 = i;
        return assetLiabilityPointApiEntity.copy((i2 & 1) != 0 ? assetLiabilityPointApiEntity2.f56450id : j, (i2 & 2) != 0 ? assetLiabilityPointApiEntity2.dictionaryKey : str, (i2 & 4) != 0 ? assetLiabilityPointApiEntity2.orderNo : j2, (i2 & 8) != 0 ? assetLiabilityPointApiEntity2.amount : bigDecimal, (i2 & 16) != 0 ? assetLiabilityPointApiEntity2.format : str2, (i2 & 32) != 0 ? assetLiabilityPointApiEntity2.scoolcardFlag : z, (i2 & 64) != 0 ? assetLiabilityPointApiEntity2.firstName : str3, (i2 & 128) != 0 ? assetLiabilityPointApiEntity2.prodType : str4, (i2 & C11398b.f33139r) != 0 ? assetLiabilityPointApiEntity2.amountInGel : bigDecimal2);
    }

    public final long component1() {
        return this.f56450id;
    }

    public final String component2() {
        return this.dictionaryKey;
    }

    public final long component3() {
        return this.orderNo;
    }

    public final BigDecimal component4() {
        return this.amount;
    }

    public final String component5() {
        return this.format;
    }

    public final boolean component6() {
        return this.scoolcardFlag;
    }

    public final String component7() {
        return this.firstName;
    }

    public final String component8() {
        return this.prodType;
    }

    public final BigDecimal component9() {
        return this.amountInGel;
    }

    public final AssetLiabilityPointApiEntity copy(long j, String str, long j2, BigDecimal bigDecimal, String str2, boolean z, String str3, String str4, BigDecimal bigDecimal2) {
        String str5 = str;
        C41536l.m120489i(str5, "dictionaryKey");
        BigDecimal bigDecimal3 = bigDecimal;
        C41536l.m120489i(bigDecimal3, "amount");
        String str6 = str2;
        C41536l.m120489i(str6, "format");
        String str7 = str4;
        C41536l.m120489i(str7, "prodType");
        return new AssetLiabilityPointApiEntity(j, str5, j2, bigDecimal3, str6, z, str3, str7, bigDecimal2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetLiabilityPointApiEntity)) {
            return false;
        }
        AssetLiabilityPointApiEntity assetLiabilityPointApiEntity = (AssetLiabilityPointApiEntity) obj;
        return this.f56450id == assetLiabilityPointApiEntity.f56450id && C41536l.m120484d(this.dictionaryKey, assetLiabilityPointApiEntity.dictionaryKey) && this.orderNo == assetLiabilityPointApiEntity.orderNo && C41536l.m120484d(this.amount, assetLiabilityPointApiEntity.amount) && C41536l.m120484d(this.format, assetLiabilityPointApiEntity.format) && this.scoolcardFlag == assetLiabilityPointApiEntity.scoolcardFlag && C41536l.m120484d(this.firstName, assetLiabilityPointApiEntity.firstName) && C41536l.m120484d(this.prodType, assetLiabilityPointApiEntity.prodType) && C41536l.m120484d(this.amountInGel, assetLiabilityPointApiEntity.amountInGel);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final BigDecimal getAmountInGel() {
        return this.amountInGel;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFormat() {
        return this.format;
    }

    public final long getId() {
        return this.f56450id;
    }

    public final long getOrderNo() {
        return this.orderNo;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final boolean getScoolcardFlag() {
        return this.scoolcardFlag;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f56450id) * 31) + this.dictionaryKey.hashCode()) * 31) + C7397t.m28148a(this.orderNo)) * 31) + this.amount.hashCode()) * 31) + this.format.hashCode()) * 31;
        boolean z = this.scoolcardFlag;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.firstName;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.prodType.hashCode()) * 31;
        BigDecimal bigDecimal = this.amountInGel;
        if (bigDecimal != null) {
            i2 = bigDecimal.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        long j = this.f56450id;
        String str = this.dictionaryKey;
        long j2 = this.orderNo;
        BigDecimal bigDecimal = this.amount;
        String str2 = this.format;
        boolean z = this.scoolcardFlag;
        String str3 = this.firstName;
        String str4 = this.prodType;
        BigDecimal bigDecimal2 = this.amountInGel;
        return "AssetLiabilityPointApiEntity(id=" + j + ", dictionaryKey=" + str + ", orderNo=" + j2 + ", amount=" + bigDecimal + ", format=" + str2 + ", scoolcardFlag=" + z + ", firstName=" + str3 + ", prodType=" + str4 + ", amountInGel=" + bigDecimal2 + ")";
    }
}
