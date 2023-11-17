package p341ge.bog.mobilebank.cleanarch.data.appsettings.entity;

import androidx.annotation.Keep;
import com.google.gson.C5494h;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.appsettings.entity.AppSettingApiEntity */
public final class AppSettingApiEntity {
    private final Boolean booleanSettings;
    private final String channelCode;
    private final Long customerId;
    private final String customerType;

    /* renamed from: id */
    private final long f56397id;
    private final C5494h jsonSettings;
    private final String settingsDesc;
    private final String settingsName;
    private final Double settingsNumberValue;
    private final String settingsValue;

    public AppSettingApiEntity(long j, Long l, String str, Double d, String str2, String str3, String str4, C5494h hVar, Boolean bool, String str5) {
        this.f56397id = j;
        this.customerId = l;
        this.settingsName = str;
        this.settingsNumberValue = d;
        this.settingsDesc = str2;
        this.channelCode = str3;
        this.customerType = str4;
        this.jsonSettings = hVar;
        this.booleanSettings = bool;
        this.settingsValue = str5;
    }

    public static /* synthetic */ AppSettingApiEntity copy$default(AppSettingApiEntity appSettingApiEntity, long j, Long l, String str, Double d, String str2, String str3, String str4, C5494h hVar, Boolean bool, String str5, int i, Object obj) {
        AppSettingApiEntity appSettingApiEntity2 = appSettingApiEntity;
        int i2 = i;
        return appSettingApiEntity.copy((i2 & 1) != 0 ? appSettingApiEntity2.f56397id : j, (i2 & 2) != 0 ? appSettingApiEntity2.customerId : l, (i2 & 4) != 0 ? appSettingApiEntity2.settingsName : str, (i2 & 8) != 0 ? appSettingApiEntity2.settingsNumberValue : d, (i2 & 16) != 0 ? appSettingApiEntity2.settingsDesc : str2, (i2 & 32) != 0 ? appSettingApiEntity2.channelCode : str3, (i2 & 64) != 0 ? appSettingApiEntity2.customerType : str4, (i2 & 128) != 0 ? appSettingApiEntity2.jsonSettings : hVar, (i2 & C11398b.f33139r) != 0 ? appSettingApiEntity2.booleanSettings : bool, (i2 & C11398b.f33140s) != 0 ? appSettingApiEntity2.settingsValue : str5);
    }

    public final long component1() {
        return this.f56397id;
    }

    public final String component10() {
        return this.settingsValue;
    }

    public final Long component2() {
        return this.customerId;
    }

    public final String component3() {
        return this.settingsName;
    }

    public final Double component4() {
        return this.settingsNumberValue;
    }

    public final String component5() {
        return this.settingsDesc;
    }

    public final String component6() {
        return this.channelCode;
    }

    public final String component7() {
        return this.customerType;
    }

    public final C5494h component8() {
        return this.jsonSettings;
    }

    public final Boolean component9() {
        return this.booleanSettings;
    }

    public final AppSettingApiEntity copy(long j, Long l, String str, Double d, String str2, String str3, String str4, C5494h hVar, Boolean bool, String str5) {
        return new AppSettingApiEntity(j, l, str, d, str2, str3, str4, hVar, bool, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSettingApiEntity)) {
            return false;
        }
        AppSettingApiEntity appSettingApiEntity = (AppSettingApiEntity) obj;
        return this.f56397id == appSettingApiEntity.f56397id && C41536l.m120484d(this.customerId, appSettingApiEntity.customerId) && C41536l.m120484d(this.settingsName, appSettingApiEntity.settingsName) && C41536l.m120484d(this.settingsNumberValue, appSettingApiEntity.settingsNumberValue) && C41536l.m120484d(this.settingsDesc, appSettingApiEntity.settingsDesc) && C41536l.m120484d(this.channelCode, appSettingApiEntity.channelCode) && C41536l.m120484d(this.customerType, appSettingApiEntity.customerType) && C41536l.m120484d(this.jsonSettings, appSettingApiEntity.jsonSettings) && C41536l.m120484d(this.booleanSettings, appSettingApiEntity.booleanSettings) && C41536l.m120484d(this.settingsValue, appSettingApiEntity.settingsValue);
    }

    public final Boolean getBooleanSettings() {
        return this.booleanSettings;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final Long getCustomerId() {
        return this.customerId;
    }

    public final String getCustomerType() {
        return this.customerType;
    }

    public final long getId() {
        return this.f56397id;
    }

    public final C5494h getJsonSettings() {
        return this.jsonSettings;
    }

    public final String getSettingsDesc() {
        return this.settingsDesc;
    }

    public final String getSettingsName() {
        return this.settingsName;
    }

    public final Double getSettingsNumberValue() {
        return this.settingsNumberValue;
    }

    public final String getSettingsValue() {
        return this.settingsValue;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f56397id) * 31;
        Long l = this.customerId;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.settingsName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.settingsNumberValue;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.settingsDesc;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerType;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C5494h hVar = this.jsonSettings;
        int hashCode7 = (hashCode6 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Boolean bool = this.booleanSettings;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.settingsValue;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        long j = this.f56397id;
        Long l = this.customerId;
        String str = this.settingsName;
        Double d = this.settingsNumberValue;
        String str2 = this.settingsDesc;
        String str3 = this.channelCode;
        String str4 = this.customerType;
        C5494h hVar = this.jsonSettings;
        Boolean bool = this.booleanSettings;
        String str5 = this.settingsValue;
        return "AppSettingApiEntity(id=" + j + ", customerId=" + l + ", settingsName=" + str + ", settingsNumberValue=" + d + ", settingsDesc=" + str2 + ", channelCode=" + str3 + ", customerType=" + str4 + ", jsonSettings=" + hVar + ", booleanSettings=" + bool + ", settingsValue=" + str5 + ")";
    }
}
