package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AmexOfferInfoApiEntity */
public final class AmexOfferInfoApiEntity {
    private final AmexOfferAdditionalParams additionalParams;
    private final String description;
    private final String imageUrl;
    private final boolean isActive;
    private final String title;

    public AmexOfferInfoApiEntity(boolean z, String str, String str2, String str3, AmexOfferAdditionalParams amexOfferAdditionalParams) {
        this.isActive = z;
        this.imageUrl = str;
        this.title = str2;
        this.description = str3;
        this.additionalParams = amexOfferAdditionalParams;
    }

    public static /* synthetic */ AmexOfferInfoApiEntity copy$default(AmexOfferInfoApiEntity amexOfferInfoApiEntity, boolean z, String str, String str2, String str3, AmexOfferAdditionalParams amexOfferAdditionalParams, int i, Object obj) {
        if ((i & 1) != 0) {
            z = amexOfferInfoApiEntity.isActive;
        }
        if ((i & 2) != 0) {
            str = amexOfferInfoApiEntity.imageUrl;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = amexOfferInfoApiEntity.title;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = amexOfferInfoApiEntity.description;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            amexOfferAdditionalParams = amexOfferInfoApiEntity.additionalParams;
        }
        return amexOfferInfoApiEntity.copy(z, str4, str5, str6, amexOfferAdditionalParams);
    }

    public final boolean component1() {
        return this.isActive;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final AmexOfferAdditionalParams component5() {
        return this.additionalParams;
    }

    public final AmexOfferInfoApiEntity copy(boolean z, String str, String str2, String str3, AmexOfferAdditionalParams amexOfferAdditionalParams) {
        return new AmexOfferInfoApiEntity(z, str, str2, str3, amexOfferAdditionalParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmexOfferInfoApiEntity)) {
            return false;
        }
        AmexOfferInfoApiEntity amexOfferInfoApiEntity = (AmexOfferInfoApiEntity) obj;
        return this.isActive == amexOfferInfoApiEntity.isActive && C41536l.m120484d(this.imageUrl, amexOfferInfoApiEntity.imageUrl) && C41536l.m120484d(this.title, amexOfferInfoApiEntity.title) && C41536l.m120484d(this.description, amexOfferInfoApiEntity.description) && C41536l.m120484d(this.additionalParams, amexOfferInfoApiEntity.additionalParams);
    }

    public final AmexOfferAdditionalParams getAdditionalParams() {
        return this.additionalParams;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        boolean z = this.isActive;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.imageUrl;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AmexOfferAdditionalParams amexOfferAdditionalParams = this.additionalParams;
        if (amexOfferAdditionalParams != null) {
            i2 = amexOfferAdditionalParams.hashCode();
        }
        return hashCode3 + i2;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        boolean z = this.isActive;
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.description;
        AmexOfferAdditionalParams amexOfferAdditionalParams = this.additionalParams;
        return "AmexOfferInfoApiEntity(isActive=" + z + ", imageUrl=" + str + ", title=" + str2 + ", description=" + str3 + ", additionalParams=" + amexOfferAdditionalParams + ")";
    }
}
