package p341ge.bog.mobilebank.cleanarch.precontract.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity */
public final class PreContractEntity {
    private final String channelCode;
    private final String contractTemplate;
    private final String contractType;
    private final String dictionaryKeyId;
    private final String languageCode;
    private final String templateDesc;
    private final int templateId;

    public PreContractEntity(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "contractType");
        C41536l.m120489i(str3, "channelCode");
        C41536l.m120489i(str4, "languageCode");
        C41536l.m120489i(str5, "contractTemplate");
        this.templateId = i;
        this.contractType = str;
        this.dictionaryKeyId = str2;
        this.channelCode = str3;
        this.languageCode = str4;
        this.contractTemplate = str5;
        this.templateDesc = str6;
    }

    public static /* synthetic */ PreContractEntity copy$default(PreContractEntity preContractEntity, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = preContractEntity.templateId;
        }
        if ((i2 & 2) != 0) {
            str = preContractEntity.contractType;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = preContractEntity.dictionaryKeyId;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = preContractEntity.channelCode;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = preContractEntity.languageCode;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = preContractEntity.contractTemplate;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = preContractEntity.templateDesc;
        }
        return preContractEntity.copy(i, str7, str8, str9, str10, str11, str6);
    }

    public final int component1() {
        return this.templateId;
    }

    public final String component2() {
        return this.contractType;
    }

    public final String component3() {
        return this.dictionaryKeyId;
    }

    public final String component4() {
        return this.channelCode;
    }

    public final String component5() {
        return this.languageCode;
    }

    public final String component6() {
        return this.contractTemplate;
    }

    public final String component7() {
        return this.templateDesc;
    }

    public final PreContractEntity copy(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "contractType");
        C41536l.m120489i(str3, "channelCode");
        C41536l.m120489i(str4, "languageCode");
        C41536l.m120489i(str5, "contractTemplate");
        return new PreContractEntity(i, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreContractEntity)) {
            return false;
        }
        PreContractEntity preContractEntity = (PreContractEntity) obj;
        return this.templateId == preContractEntity.templateId && C41536l.m120484d(this.contractType, preContractEntity.contractType) && C41536l.m120484d(this.dictionaryKeyId, preContractEntity.dictionaryKeyId) && C41536l.m120484d(this.channelCode, preContractEntity.channelCode) && C41536l.m120484d(this.languageCode, preContractEntity.languageCode) && C41536l.m120484d(this.contractTemplate, preContractEntity.contractTemplate) && C41536l.m120484d(this.templateDesc, preContractEntity.templateDesc);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getContractTemplate() {
        return this.contractTemplate;
    }

    public final String getContractType() {
        return this.contractType;
    }

    public final String getDictionaryKeyId() {
        return this.dictionaryKeyId;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getTemplateDesc() {
        return this.templateDesc;
    }

    public final int getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        int hashCode = ((this.templateId * 31) + this.contractType.hashCode()) * 31;
        String str = this.dictionaryKeyId;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.channelCode.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.contractTemplate.hashCode()) * 31;
        String str2 = this.templateDesc;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        int i = this.templateId;
        String str = this.contractType;
        String str2 = this.dictionaryKeyId;
        String str3 = this.channelCode;
        String str4 = this.languageCode;
        String str5 = this.contractTemplate;
        String str6 = this.templateDesc;
        return "PreContractEntity(templateId=" + i + ", contractType=" + str + ", dictionaryKeyId=" + str2 + ", channelCode=" + str3 + ", languageCode=" + str4 + ", contractTemplate=" + str5 + ", templateDesc=" + str6 + ")";
    }
}
