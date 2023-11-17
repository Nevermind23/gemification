package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.ActiveCardApiModel */
public final class ActiveCardApiModel {
    private final String cardClass;
    private final String cardClassCode;
    private final long cardId;
    private final CardBackgroundApiModel cardLargeBackground;
    private final String cardName;
    private final String cardNameDictionaryKey;
    private final long clientKey;
    private final long expDate;
    private final String lastFour;
    @C8664c(alternate = {"activePass"}, value = "passDevices")
    private final List<PassDeviceApiModel> passDevices;
    private final String subProductCode;

    public ActiveCardApiModel(long j, long j2, String str, String str2, String str3, String str4, long j3, String str5, String str6, CardBackgroundApiModel cardBackgroundApiModel, List<PassDeviceApiModel> list) {
        C41536l.m120489i(str, "cardClassCode");
        C41536l.m120489i(str2, "cardClass");
        C41536l.m120489i(str3, "lastFour");
        C41536l.m120489i(str4, "subProductCode");
        C41536l.m120489i(cardBackgroundApiModel, "cardLargeBackground");
        C41536l.m120489i(list, "passDevices");
        this.clientKey = j;
        this.cardId = j2;
        this.cardClassCode = str;
        this.cardClass = str2;
        this.lastFour = str3;
        this.subProductCode = str4;
        this.expDate = j3;
        this.cardName = str5;
        this.cardNameDictionaryKey = str6;
        this.cardLargeBackground = cardBackgroundApiModel;
        this.passDevices = list;
    }

    public static /* synthetic */ ActiveCardApiModel copy$default(ActiveCardApiModel activeCardApiModel, long j, long j2, String str, String str2, String str3, String str4, long j3, String str5, String str6, CardBackgroundApiModel cardBackgroundApiModel, List list, int i, Object obj) {
        ActiveCardApiModel activeCardApiModel2 = activeCardApiModel;
        int i2 = i;
        return activeCardApiModel.copy((i2 & 1) != 0 ? activeCardApiModel2.clientKey : j, (i2 & 2) != 0 ? activeCardApiModel2.cardId : j2, (i2 & 4) != 0 ? activeCardApiModel2.cardClassCode : str, (i2 & 8) != 0 ? activeCardApiModel2.cardClass : str2, (i2 & 16) != 0 ? activeCardApiModel2.lastFour : str3, (i2 & 32) != 0 ? activeCardApiModel2.subProductCode : str4, (i2 & 64) != 0 ? activeCardApiModel2.expDate : j3, (i2 & 128) != 0 ? activeCardApiModel2.cardName : str5, (i2 & C11398b.f33139r) != 0 ? activeCardApiModel2.cardNameDictionaryKey : str6, (i2 & C11398b.f33140s) != 0 ? activeCardApiModel2.cardLargeBackground : cardBackgroundApiModel, (i2 & C11398b.f33141t) != 0 ? activeCardApiModel2.passDevices : list);
    }

    public final long component1() {
        return this.clientKey;
    }

    public final CardBackgroundApiModel component10() {
        return this.cardLargeBackground;
    }

    public final List<PassDeviceApiModel> component11() {
        return this.passDevices;
    }

    public final long component2() {
        return this.cardId;
    }

    public final String component3() {
        return this.cardClassCode;
    }

    public final String component4() {
        return this.cardClass;
    }

    public final String component5() {
        return this.lastFour;
    }

    public final String component6() {
        return this.subProductCode;
    }

    public final long component7() {
        return this.expDate;
    }

    public final String component8() {
        return this.cardName;
    }

    public final String component9() {
        return this.cardNameDictionaryKey;
    }

    public final ActiveCardApiModel copy(long j, long j2, String str, String str2, String str3, String str4, long j3, String str5, String str6, CardBackgroundApiModel cardBackgroundApiModel, List<PassDeviceApiModel> list) {
        String str7 = str;
        C41536l.m120489i(str7, "cardClassCode");
        String str8 = str2;
        C41536l.m120489i(str8, "cardClass");
        String str9 = str3;
        C41536l.m120489i(str9, "lastFour");
        String str10 = str4;
        C41536l.m120489i(str10, "subProductCode");
        CardBackgroundApiModel cardBackgroundApiModel2 = cardBackgroundApiModel;
        C41536l.m120489i(cardBackgroundApiModel2, "cardLargeBackground");
        List<PassDeviceApiModel> list2 = list;
        C41536l.m120489i(list2, "passDevices");
        return new ActiveCardApiModel(j, j2, str7, str8, str9, str10, j3, str5, str6, cardBackgroundApiModel2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveCardApiModel)) {
            return false;
        }
        ActiveCardApiModel activeCardApiModel = (ActiveCardApiModel) obj;
        return this.clientKey == activeCardApiModel.clientKey && this.cardId == activeCardApiModel.cardId && C41536l.m120484d(this.cardClassCode, activeCardApiModel.cardClassCode) && C41536l.m120484d(this.cardClass, activeCardApiModel.cardClass) && C41536l.m120484d(this.lastFour, activeCardApiModel.lastFour) && C41536l.m120484d(this.subProductCode, activeCardApiModel.subProductCode) && this.expDate == activeCardApiModel.expDate && C41536l.m120484d(this.cardName, activeCardApiModel.cardName) && C41536l.m120484d(this.cardNameDictionaryKey, activeCardApiModel.cardNameDictionaryKey) && C41536l.m120484d(this.cardLargeBackground, activeCardApiModel.cardLargeBackground) && C41536l.m120484d(this.passDevices, activeCardApiModel.passDevices);
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardClassCode() {
        return this.cardClassCode;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final CardBackgroundApiModel getCardLargeBackground() {
        return this.cardLargeBackground;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCardNameDictionaryKey() {
        return this.cardNameDictionaryKey;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getExpDate() {
        return this.expDate;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final List<PassDeviceApiModel> getPassDevices() {
        return this.passDevices;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = ((((((((((((C7397t.m28148a(this.clientKey) * 31) + C7397t.m28148a(this.cardId)) * 31) + this.cardClassCode.hashCode()) * 31) + this.cardClass.hashCode()) * 31) + this.lastFour.hashCode()) * 31) + this.subProductCode.hashCode()) * 31) + C7397t.m28148a(this.expDate)) * 31;
        String str = this.cardName;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardNameDictionaryKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.cardLargeBackground.hashCode()) * 31) + this.passDevices.hashCode();
    }

    public String toString() {
        long j = this.clientKey;
        long j2 = this.cardId;
        String str = this.cardClassCode;
        String str2 = this.cardClass;
        String str3 = this.lastFour;
        String str4 = this.subProductCode;
        long j3 = this.expDate;
        String str5 = this.cardName;
        String str6 = this.cardNameDictionaryKey;
        CardBackgroundApiModel cardBackgroundApiModel = this.cardLargeBackground;
        List<PassDeviceApiModel> list = this.passDevices;
        return "ActiveCardApiModel(clientKey=" + j + ", cardId=" + j2 + ", cardClassCode=" + str + ", cardClass=" + str2 + ", lastFour=" + str3 + ", subProductCode=" + str4 + ", expDate=" + j3 + ", cardName=" + str5 + ", cardNameDictionaryKey=" + str6 + ", cardLargeBackground=" + cardBackgroundApiModel + ", passDevices=" + list + ")";
    }
}
