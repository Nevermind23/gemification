package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.PurchasedPassApiModel */
public final class PurchasedPassApiModel {
    private final String deviceName;
    private final String deviceType;
    private final long endDate;
    private final boolean isPhysicalDevice;
    private final String lastFour;
    private final String passTitle;
    private final int price;
    private final long startDate;
    private final String status;
    private final String successDictionaryKey;
    private final String typeId;

    public PurchasedPassApiModel(String str, String str2, int i, String str3, String str4, long j, long j2, boolean z, String str5, String str6, String str7) {
        C41536l.m120489i(str, "typeId");
        C41536l.m120489i(str2, "passTitle");
        C41536l.m120489i(str3, "deviceType");
        C41536l.m120489i(str4, "deviceName");
        C41536l.m120489i(str5, "lastFour");
        C41536l.m120489i(str6, "status");
        this.typeId = str;
        this.passTitle = str2;
        this.price = i;
        this.deviceType = str3;
        this.deviceName = str4;
        this.startDate = j;
        this.endDate = j2;
        this.isPhysicalDevice = z;
        this.lastFour = str5;
        this.status = str6;
        this.successDictionaryKey = str7;
    }

    public static /* synthetic */ PurchasedPassApiModel copy$default(PurchasedPassApiModel purchasedPassApiModel, String str, String str2, int i, String str3, String str4, long j, long j2, boolean z, String str5, String str6, String str7, int i2, Object obj) {
        PurchasedPassApiModel purchasedPassApiModel2 = purchasedPassApiModel;
        int i3 = i2;
        return purchasedPassApiModel.copy((i3 & 1) != 0 ? purchasedPassApiModel2.typeId : str, (i3 & 2) != 0 ? purchasedPassApiModel2.passTitle : str2, (i3 & 4) != 0 ? purchasedPassApiModel2.price : i, (i3 & 8) != 0 ? purchasedPassApiModel2.deviceType : str3, (i3 & 16) != 0 ? purchasedPassApiModel2.deviceName : str4, (i3 & 32) != 0 ? purchasedPassApiModel2.startDate : j, (i3 & 64) != 0 ? purchasedPassApiModel2.endDate : j2, (i3 & 128) != 0 ? purchasedPassApiModel2.isPhysicalDevice : z, (i3 & C11398b.f33139r) != 0 ? purchasedPassApiModel2.lastFour : str5, (i3 & C11398b.f33140s) != 0 ? purchasedPassApiModel2.status : str6, (i3 & C11398b.f33141t) != 0 ? purchasedPassApiModel2.successDictionaryKey : str7);
    }

    public final String component1() {
        return this.typeId;
    }

    public final String component10() {
        return this.status;
    }

    public final String component11() {
        return this.successDictionaryKey;
    }

    public final String component2() {
        return this.passTitle;
    }

    public final int component3() {
        return this.price;
    }

    public final String component4() {
        return this.deviceType;
    }

    public final String component5() {
        return this.deviceName;
    }

    public final long component6() {
        return this.startDate;
    }

    public final long component7() {
        return this.endDate;
    }

    public final boolean component8() {
        return this.isPhysicalDevice;
    }

    public final String component9() {
        return this.lastFour;
    }

    public final PurchasedPassApiModel copy(String str, String str2, int i, String str3, String str4, long j, long j2, boolean z, String str5, String str6, String str7) {
        String str8 = str;
        C41536l.m120489i(str8, "typeId");
        String str9 = str2;
        C41536l.m120489i(str9, "passTitle");
        String str10 = str3;
        C41536l.m120489i(str10, "deviceType");
        String str11 = str4;
        C41536l.m120489i(str11, "deviceName");
        String str12 = str5;
        C41536l.m120489i(str12, "lastFour");
        String str13 = str6;
        C41536l.m120489i(str13, "status");
        return new PurchasedPassApiModel(str8, str9, i, str10, str11, j, j2, z, str12, str13, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasedPassApiModel)) {
            return false;
        }
        PurchasedPassApiModel purchasedPassApiModel = (PurchasedPassApiModel) obj;
        return C41536l.m120484d(this.typeId, purchasedPassApiModel.typeId) && C41536l.m120484d(this.passTitle, purchasedPassApiModel.passTitle) && this.price == purchasedPassApiModel.price && C41536l.m120484d(this.deviceType, purchasedPassApiModel.deviceType) && C41536l.m120484d(this.deviceName, purchasedPassApiModel.deviceName) && this.startDate == purchasedPassApiModel.startDate && this.endDate == purchasedPassApiModel.endDate && this.isPhysicalDevice == purchasedPassApiModel.isPhysicalDevice && C41536l.m120484d(this.lastFour, purchasedPassApiModel.lastFour) && C41536l.m120484d(this.status, purchasedPassApiModel.status) && C41536l.m120484d(this.successDictionaryKey, purchasedPassApiModel.successDictionaryKey);
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getPassTitle() {
        return this.passTitle;
    }

    public final int getPrice() {
        return this.price;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSuccessDictionaryKey() {
        return this.successDictionaryKey;
    }

    public final String getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.typeId.hashCode() * 31) + this.passTitle.hashCode()) * 31) + this.price) * 31) + this.deviceType.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + C7397t.m28148a(this.startDate)) * 31) + C7397t.m28148a(this.endDate)) * 31;
        boolean z = this.isPhysicalDevice;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((hashCode + (z ? 1 : 0)) * 31) + this.lastFour.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str = this.successDictionaryKey;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isPhysicalDevice() {
        return this.isPhysicalDevice;
    }

    public String toString() {
        String str = this.typeId;
        String str2 = this.passTitle;
        int i = this.price;
        String str3 = this.deviceType;
        String str4 = this.deviceName;
        long j = this.startDate;
        long j2 = this.endDate;
        boolean z = this.isPhysicalDevice;
        String str5 = this.lastFour;
        String str6 = this.status;
        String str7 = this.successDictionaryKey;
        return "PurchasedPassApiModel(typeId=" + str + ", passTitle=" + str2 + ", price=" + i + ", deviceType=" + str3 + ", deviceName=" + str4 + ", startDate=" + j + ", endDate=" + j2 + ", isPhysicalDevice=" + z + ", lastFour=" + str5 + ", status=" + str6 + ", successDictionaryKey=" + str7 + ")";
    }
}
