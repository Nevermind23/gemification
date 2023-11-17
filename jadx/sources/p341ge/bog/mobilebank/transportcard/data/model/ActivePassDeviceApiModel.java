package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.ActivePassDeviceApiModel */
public final class ActivePassDeviceApiModel {
    private final List<ActivePassApiModel> activePass;
    private final long cardId;
    private final CardBackgroundApiModel cardLargeBackground;
    private final CardBackgroundApiModel cardSmallBackground;
    private final String deviceId;
    private final String deviceName;
    private final String deviceStatus;
    private final String deviceStatusDescription;
    private final String deviceType;
    private final long expDate;
    private final boolean isPhysicalCard;
    private final String lastFour;
    private final String status;

    public ActivePassDeviceApiModel(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, CardBackgroundApiModel cardBackgroundApiModel, CardBackgroundApiModel cardBackgroundApiModel2, List<ActivePassApiModel> list) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        CardBackgroundApiModel cardBackgroundApiModel3 = cardBackgroundApiModel;
        CardBackgroundApiModel cardBackgroundApiModel4 = cardBackgroundApiModel2;
        List<ActivePassApiModel> list2 = list;
        C41536l.m120489i(str8, "lastFour");
        C41536l.m120489i(str9, "deviceType");
        C41536l.m120489i(str10, "deviceId");
        C41536l.m120489i(str11, "deviceName");
        C41536l.m120489i(str12, "status");
        C41536l.m120489i(str13, "deviceStatus");
        C41536l.m120489i(cardBackgroundApiModel3, "cardLargeBackground");
        C41536l.m120489i(cardBackgroundApiModel4, "cardSmallBackground");
        C41536l.m120489i(list2, "activePass");
        this.cardId = j;
        this.expDate = j2;
        this.lastFour = str8;
        this.deviceType = str9;
        this.deviceId = str10;
        this.deviceName = str11;
        this.status = str12;
        this.deviceStatus = str13;
        this.isPhysicalCard = z;
        this.deviceStatusDescription = str7;
        this.cardLargeBackground = cardBackgroundApiModel3;
        this.cardSmallBackground = cardBackgroundApiModel4;
        this.activePass = list2;
    }

    public static /* synthetic */ ActivePassDeviceApiModel copy$default(ActivePassDeviceApiModel activePassDeviceApiModel, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, CardBackgroundApiModel cardBackgroundApiModel, CardBackgroundApiModel cardBackgroundApiModel2, List list, int i, Object obj) {
        ActivePassDeviceApiModel activePassDeviceApiModel2 = activePassDeviceApiModel;
        int i2 = i;
        return activePassDeviceApiModel.copy((i2 & 1) != 0 ? activePassDeviceApiModel2.cardId : j, (i2 & 2) != 0 ? activePassDeviceApiModel2.expDate : j2, (i2 & 4) != 0 ? activePassDeviceApiModel2.lastFour : str, (i2 & 8) != 0 ? activePassDeviceApiModel2.deviceType : str2, (i2 & 16) != 0 ? activePassDeviceApiModel2.deviceId : str3, (i2 & 32) != 0 ? activePassDeviceApiModel2.deviceName : str4, (i2 & 64) != 0 ? activePassDeviceApiModel2.status : str5, (i2 & 128) != 0 ? activePassDeviceApiModel2.deviceStatus : str6, (i2 & C11398b.f33139r) != 0 ? activePassDeviceApiModel2.isPhysicalCard : z, (i2 & C11398b.f33140s) != 0 ? activePassDeviceApiModel2.deviceStatusDescription : str7, (i2 & C11398b.f33141t) != 0 ? activePassDeviceApiModel2.cardLargeBackground : cardBackgroundApiModel, (i2 & C11398b.f33142u) != 0 ? activePassDeviceApiModel2.cardSmallBackground : cardBackgroundApiModel2, (i2 & C11398b.f33143v) != 0 ? activePassDeviceApiModel2.activePass : list);
    }

    public final long component1() {
        return this.cardId;
    }

    public final String component10() {
        return this.deviceStatusDescription;
    }

    public final CardBackgroundApiModel component11() {
        return this.cardLargeBackground;
    }

    public final CardBackgroundApiModel component12() {
        return this.cardSmallBackground;
    }

    public final List<ActivePassApiModel> component13() {
        return this.activePass;
    }

    public final long component2() {
        return this.expDate;
    }

    public final String component3() {
        return this.lastFour;
    }

    public final String component4() {
        return this.deviceType;
    }

    public final String component5() {
        return this.deviceId;
    }

    public final String component6() {
        return this.deviceName;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.deviceStatus;
    }

    public final boolean component9() {
        return this.isPhysicalCard;
    }

    public final ActivePassDeviceApiModel copy(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, CardBackgroundApiModel cardBackgroundApiModel, CardBackgroundApiModel cardBackgroundApiModel2, List<ActivePassApiModel> list) {
        String str8 = str;
        C41536l.m120489i(str8, "lastFour");
        String str9 = str2;
        C41536l.m120489i(str9, "deviceType");
        String str10 = str3;
        C41536l.m120489i(str10, "deviceId");
        String str11 = str4;
        C41536l.m120489i(str11, "deviceName");
        String str12 = str5;
        C41536l.m120489i(str12, "status");
        String str13 = str6;
        C41536l.m120489i(str13, "deviceStatus");
        CardBackgroundApiModel cardBackgroundApiModel3 = cardBackgroundApiModel;
        C41536l.m120489i(cardBackgroundApiModel3, "cardLargeBackground");
        CardBackgroundApiModel cardBackgroundApiModel4 = cardBackgroundApiModel2;
        C41536l.m120489i(cardBackgroundApiModel4, "cardSmallBackground");
        C41536l.m120489i(list, "activePass");
        return new ActivePassDeviceApiModel(j, j2, str8, str9, str10, str11, str12, str13, z, str7, cardBackgroundApiModel3, cardBackgroundApiModel4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivePassDeviceApiModel)) {
            return false;
        }
        ActivePassDeviceApiModel activePassDeviceApiModel = (ActivePassDeviceApiModel) obj;
        return this.cardId == activePassDeviceApiModel.cardId && this.expDate == activePassDeviceApiModel.expDate && C41536l.m120484d(this.lastFour, activePassDeviceApiModel.lastFour) && C41536l.m120484d(this.deviceType, activePassDeviceApiModel.deviceType) && C41536l.m120484d(this.deviceId, activePassDeviceApiModel.deviceId) && C41536l.m120484d(this.deviceName, activePassDeviceApiModel.deviceName) && C41536l.m120484d(this.status, activePassDeviceApiModel.status) && C41536l.m120484d(this.deviceStatus, activePassDeviceApiModel.deviceStatus) && this.isPhysicalCard == activePassDeviceApiModel.isPhysicalCard && C41536l.m120484d(this.deviceStatusDescription, activePassDeviceApiModel.deviceStatusDescription) && C41536l.m120484d(this.cardLargeBackground, activePassDeviceApiModel.cardLargeBackground) && C41536l.m120484d(this.cardSmallBackground, activePassDeviceApiModel.cardSmallBackground) && C41536l.m120484d(this.activePass, activePassDeviceApiModel.activePass);
    }

    public final List<ActivePassApiModel> getActivePass() {
        return this.activePass;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final CardBackgroundApiModel getCardLargeBackground() {
        return this.cardLargeBackground;
    }

    public final CardBackgroundApiModel getCardSmallBackground() {
        return this.cardSmallBackground;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceStatus() {
        return this.deviceStatus;
    }

    public final String getDeviceStatusDescription() {
        return this.deviceStatusDescription;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final long getExpDate() {
        return this.expDate;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a = ((((((((((((((C7397t.m28148a(this.cardId) * 31) + C7397t.m28148a(this.expDate)) * 31) + this.lastFour.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + this.status.hashCode()) * 31) + this.deviceStatus.hashCode()) * 31;
        boolean z = this.isPhysicalCard;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.deviceStatusDescription;
        return ((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.cardLargeBackground.hashCode()) * 31) + this.cardSmallBackground.hashCode()) * 31) + this.activePass.hashCode();
    }

    public final boolean isPhysicalCard() {
        return this.isPhysicalCard;
    }

    public String toString() {
        long j = this.cardId;
        long j2 = this.expDate;
        String str = this.lastFour;
        String str2 = this.deviceType;
        String str3 = this.deviceId;
        String str4 = this.deviceName;
        String str5 = this.status;
        String str6 = this.deviceStatus;
        boolean z = this.isPhysicalCard;
        String str7 = this.deviceStatusDescription;
        CardBackgroundApiModel cardBackgroundApiModel = this.cardLargeBackground;
        CardBackgroundApiModel cardBackgroundApiModel2 = this.cardSmallBackground;
        List<ActivePassApiModel> list = this.activePass;
        return "ActivePassDeviceApiModel(cardId=" + j + ", expDate=" + j2 + ", lastFour=" + str + ", deviceType=" + str2 + ", deviceId=" + str3 + ", deviceName=" + str4 + ", status=" + str5 + ", deviceStatus=" + str6 + ", isPhysicalCard=" + z + ", deviceStatusDescription=" + str7 + ", cardLargeBackground=" + cardBackgroundApiModel + ", cardSmallBackground=" + cardBackgroundApiModel2 + ", activePass=" + list + ")";
    }
}
