package p341ge.bog.mobilebank.cleanarch.identityverification.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.identityverification.data.entity.VerificationProcessDataEntity */
public final class VerificationProcessDataEntity {
    private final String country;

    /* renamed from: ip */
    private final String f56546ip;
    private final String merchantLogoId;
    private final String merchantName;

    /* renamed from: os */
    private final String f56547os;
    private final String serviceName;
    private final String terminalId;
    private final String userAgent;

    public VerificationProcessDataEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.merchantLogoId = str;
        this.merchantName = str2;
        this.f56546ip = str3;
        this.userAgent = str4;
        this.f56547os = str5;
        this.country = str6;
        this.serviceName = str7;
        this.terminalId = str8;
    }

    public static /* synthetic */ VerificationProcessDataEntity copy$default(VerificationProcessDataEntity verificationProcessDataEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        VerificationProcessDataEntity verificationProcessDataEntity2 = verificationProcessDataEntity;
        int i2 = i;
        return verificationProcessDataEntity.copy((i2 & 1) != 0 ? verificationProcessDataEntity2.merchantLogoId : str, (i2 & 2) != 0 ? verificationProcessDataEntity2.merchantName : str2, (i2 & 4) != 0 ? verificationProcessDataEntity2.f56546ip : str3, (i2 & 8) != 0 ? verificationProcessDataEntity2.userAgent : str4, (i2 & 16) != 0 ? verificationProcessDataEntity2.f56547os : str5, (i2 & 32) != 0 ? verificationProcessDataEntity2.country : str6, (i2 & 64) != 0 ? verificationProcessDataEntity2.serviceName : str7, (i2 & 128) != 0 ? verificationProcessDataEntity2.terminalId : str8);
    }

    public final String component1() {
        return this.merchantLogoId;
    }

    public final String component2() {
        return this.merchantName;
    }

    public final String component3() {
        return this.f56546ip;
    }

    public final String component4() {
        return this.userAgent;
    }

    public final String component5() {
        return this.f56547os;
    }

    public final String component6() {
        return this.country;
    }

    public final String component7() {
        return this.serviceName;
    }

    public final String component8() {
        return this.terminalId;
    }

    public final VerificationProcessDataEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new VerificationProcessDataEntity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationProcessDataEntity)) {
            return false;
        }
        VerificationProcessDataEntity verificationProcessDataEntity = (VerificationProcessDataEntity) obj;
        return C41536l.m120484d(this.merchantLogoId, verificationProcessDataEntity.merchantLogoId) && C41536l.m120484d(this.merchantName, verificationProcessDataEntity.merchantName) && C41536l.m120484d(this.f56546ip, verificationProcessDataEntity.f56546ip) && C41536l.m120484d(this.userAgent, verificationProcessDataEntity.userAgent) && C41536l.m120484d(this.f56547os, verificationProcessDataEntity.f56547os) && C41536l.m120484d(this.country, verificationProcessDataEntity.country) && C41536l.m120484d(this.serviceName, verificationProcessDataEntity.serviceName) && C41536l.m120484d(this.terminalId, verificationProcessDataEntity.terminalId);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getIp() {
        return this.f56546ip;
    }

    public final String getMerchantLogoId() {
        return this.merchantLogoId;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getOs() {
        return this.f56547os;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final String getTerminalId() {
        return this.terminalId;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        String str = this.merchantLogoId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56546ip;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userAgent;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f56547os;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.serviceName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.terminalId;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.merchantLogoId;
        String str2 = this.merchantName;
        String str3 = this.f56546ip;
        String str4 = this.userAgent;
        String str5 = this.f56547os;
        String str6 = this.country;
        String str7 = this.serviceName;
        String str8 = this.terminalId;
        return "VerificationProcessDataEntity(merchantLogoId=" + str + ", merchantName=" + str2 + ", ip=" + str3 + ", userAgent=" + str4 + ", os=" + str5 + ", country=" + str6 + ", serviceName=" + str7 + ", terminalId=" + str8 + ")";
    }
}
