package p341ge.bog.mobilebank.cleanarch.data.offer.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.offer.entity.OfferProductApiEntity */
public final class OfferProductApiEntity {
    private final String offerDtl;
    private final String productCode;

    public OfferProductApiEntity(String str, String str2) {
        C41536l.m120489i(str, "productCode");
        this.productCode = str;
        this.offerDtl = str2;
    }

    public static /* synthetic */ OfferProductApiEntity copy$default(OfferProductApiEntity offerProductApiEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerProductApiEntity.productCode;
        }
        if ((i & 2) != 0) {
            str2 = offerProductApiEntity.offerDtl;
        }
        return offerProductApiEntity.copy(str, str2);
    }

    public final String component1() {
        return this.productCode;
    }

    public final String component2() {
        return this.offerDtl;
    }

    public final OfferProductApiEntity copy(String str, String str2) {
        C41536l.m120489i(str, "productCode");
        return new OfferProductApiEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferProductApiEntity)) {
            return false;
        }
        OfferProductApiEntity offerProductApiEntity = (OfferProductApiEntity) obj;
        return C41536l.m120484d(this.productCode, offerProductApiEntity.productCode) && C41536l.m120484d(this.offerDtl, offerProductApiEntity.offerDtl);
    }

    public final String getOfferDtl() {
        return this.offerDtl;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public int hashCode() {
        int hashCode = this.productCode.hashCode() * 31;
        String str = this.offerDtl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.productCode;
        String str2 = this.offerDtl;
        return "OfferProductApiEntity(productCode=" + str + ", offerDtl=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferProductApiEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
