package p341ge.bog.mobilebank.cleanarch.data.home.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityDetailApiEntity */
public final class AssetLiabilityDetailApiEntity {
    private final BigDecimal amountBase;
    private final String dictionaryKey;
    private final String productType;

    public AssetLiabilityDetailApiEntity(String str, BigDecimal bigDecimal, String str2) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(bigDecimal, "amountBase");
        C41536l.m120489i(str2, "dictionaryKey");
        this.productType = str;
        this.amountBase = bigDecimal;
        this.dictionaryKey = str2;
    }

    public static /* synthetic */ AssetLiabilityDetailApiEntity copy$default(AssetLiabilityDetailApiEntity assetLiabilityDetailApiEntity, String str, BigDecimal bigDecimal, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetLiabilityDetailApiEntity.productType;
        }
        if ((i & 2) != 0) {
            bigDecimal = assetLiabilityDetailApiEntity.amountBase;
        }
        if ((i & 4) != 0) {
            str2 = assetLiabilityDetailApiEntity.dictionaryKey;
        }
        return assetLiabilityDetailApiEntity.copy(str, bigDecimal, str2);
    }

    public final String component1() {
        return this.productType;
    }

    public final BigDecimal component2() {
        return this.amountBase;
    }

    public final String component3() {
        return this.dictionaryKey;
    }

    public final AssetLiabilityDetailApiEntity copy(String str, BigDecimal bigDecimal, String str2) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(bigDecimal, "amountBase");
        C41536l.m120489i(str2, "dictionaryKey");
        return new AssetLiabilityDetailApiEntity(str, bigDecimal, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetLiabilityDetailApiEntity)) {
            return false;
        }
        AssetLiabilityDetailApiEntity assetLiabilityDetailApiEntity = (AssetLiabilityDetailApiEntity) obj;
        return C41536l.m120484d(this.productType, assetLiabilityDetailApiEntity.productType) && C41536l.m120484d(this.amountBase, assetLiabilityDetailApiEntity.amountBase) && C41536l.m120484d(this.dictionaryKey, assetLiabilityDetailApiEntity.dictionaryKey);
    }

    public final BigDecimal getAmountBase() {
        return this.amountBase;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        return (((this.productType.hashCode() * 31) + this.amountBase.hashCode()) * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        String str = this.productType;
        BigDecimal bigDecimal = this.amountBase;
        String str2 = this.dictionaryKey;
        return "AssetLiabilityDetailApiEntity(productType=" + str + ", amountBase=" + bigDecimal + ", dictionaryKey=" + str2 + ")";
    }
}
