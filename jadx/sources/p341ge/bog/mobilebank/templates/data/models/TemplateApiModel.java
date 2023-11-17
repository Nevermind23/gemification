package p341ge.bog.mobilebank.templates.data.models;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.templates.data.models.TemplateApiModel */
public final class TemplateApiModel {
    private final String additionalData;
    private final String benefProfilePicture;
    private final String channel;
    private final String customerId;
    private final String extCustomerId;

    /* renamed from: id */
    private final Long f84121id;
    private final String logo;
    private final String logoEn;
    private final String logoGe;
    private final Long modificationDate;
    private final String serviceId;
    private final String templateId;
    private final String templateImage;
    private final String templateName;
    private final Long templateOrder;
    private final List<TemplateParametersApiModel> templateParameters;
    private final String templateType;

    public TemplateApiModel() {
        this((String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (List) null, (String) null, (String) null, (String) null, (Long) null, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TemplateApiModel copy$default(TemplateApiModel templateApiModel, String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l2, String str10, List list, String str11, String str12, String str13, Long l3, int i, Object obj) {
        TemplateApiModel templateApiModel2 = templateApiModel;
        int i2 = i;
        return templateApiModel.copy((i2 & 1) != 0 ? templateApiModel2.logo : str, (i2 & 2) != 0 ? templateApiModel2.benefProfilePicture : str2, (i2 & 4) != 0 ? templateApiModel2.f84121id : l, (i2 & 8) != 0 ? templateApiModel2.channel : str3, (i2 & 16) != 0 ? templateApiModel2.customerId : str4, (i2 & 32) != 0 ? templateApiModel2.extCustomerId : str5, (i2 & 64) != 0 ? templateApiModel2.templateId : str6, (i2 & 128) != 0 ? templateApiModel2.templateName : str7, (i2 & C11398b.f33139r) != 0 ? templateApiModel2.templateType : str8, (i2 & C11398b.f33140s) != 0 ? templateApiModel2.serviceId : str9, (i2 & C11398b.f33141t) != 0 ? templateApiModel2.modificationDate : l2, (i2 & C11398b.f33142u) != 0 ? templateApiModel2.additionalData : str10, (i2 & C11398b.f33143v) != 0 ? templateApiModel2.templateParameters : list, (i2 & 8192) != 0 ? templateApiModel2.logoGe : str11, (i2 & 16384) != 0 ? templateApiModel2.logoEn : str12, (i2 & 32768) != 0 ? templateApiModel2.templateImage : str13, (i2 & 65536) != 0 ? templateApiModel2.templateOrder : l3);
    }

    public final String component1() {
        return this.logo;
    }

    public final String component10() {
        return this.serviceId;
    }

    public final Long component11() {
        return this.modificationDate;
    }

    public final String component12() {
        return this.additionalData;
    }

    public final List<TemplateParametersApiModel> component13() {
        return this.templateParameters;
    }

    public final String component14() {
        return this.logoGe;
    }

    public final String component15() {
        return this.logoEn;
    }

    public final String component16() {
        return this.templateImage;
    }

    public final Long component17() {
        return this.templateOrder;
    }

    public final String component2() {
        return this.benefProfilePicture;
    }

    public final Long component3() {
        return this.f84121id;
    }

    public final String component4() {
        return this.channel;
    }

    public final String component5() {
        return this.customerId;
    }

    public final String component6() {
        return this.extCustomerId;
    }

    public final String component7() {
        return this.templateId;
    }

    public final String component8() {
        return this.templateName;
    }

    public final String component9() {
        return this.templateType;
    }

    public final TemplateApiModel copy(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l2, String str10, List<TemplateParametersApiModel> list, String str11, String str12, String str13, Long l3) {
        return new TemplateApiModel(str, str2, l, str3, str4, str5, str6, str7, str8, str9, l2, str10, list, str11, str12, str13, l3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateApiModel)) {
            return false;
        }
        TemplateApiModel templateApiModel = (TemplateApiModel) obj;
        return C41536l.m120484d(this.logo, templateApiModel.logo) && C41536l.m120484d(this.benefProfilePicture, templateApiModel.benefProfilePicture) && C41536l.m120484d(this.f84121id, templateApiModel.f84121id) && C41536l.m120484d(this.channel, templateApiModel.channel) && C41536l.m120484d(this.customerId, templateApiModel.customerId) && C41536l.m120484d(this.extCustomerId, templateApiModel.extCustomerId) && C41536l.m120484d(this.templateId, templateApiModel.templateId) && C41536l.m120484d(this.templateName, templateApiModel.templateName) && C41536l.m120484d(this.templateType, templateApiModel.templateType) && C41536l.m120484d(this.serviceId, templateApiModel.serviceId) && C41536l.m120484d(this.modificationDate, templateApiModel.modificationDate) && C41536l.m120484d(this.additionalData, templateApiModel.additionalData) && C41536l.m120484d(this.templateParameters, templateApiModel.templateParameters) && C41536l.m120484d(this.logoGe, templateApiModel.logoGe) && C41536l.m120484d(this.logoEn, templateApiModel.logoEn) && C41536l.m120484d(this.templateImage, templateApiModel.templateImage) && C41536l.m120484d(this.templateOrder, templateApiModel.templateOrder);
    }

    public final String getAdditionalData() {
        return this.additionalData;
    }

    public final String getBenefProfilePicture() {
        return this.benefProfilePicture;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getExtCustomerId() {
        return this.extCustomerId;
    }

    public final Long getId() {
        return this.f84121id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getLogoEn() {
        return this.logoEn;
    }

    public final String getLogoGe() {
        return this.logoGe;
    }

    public final Long getModificationDate() {
        return this.modificationDate;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateImage() {
        return this.templateImage;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final Long getTemplateOrder() {
        return this.templateOrder;
    }

    public final List<TemplateParametersApiModel> getTemplateParameters() {
        return this.templateParameters;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public int hashCode() {
        String str = this.logo;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.benefProfilePicture;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f84121id;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.channel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extCustomerId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.templateId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.templateName;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.templateType;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.serviceId;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l2 = this.modificationDate;
        int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str10 = this.additionalData;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<TemplateParametersApiModel> list = this.templateParameters;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str11 = this.logoGe;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.logoEn;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.templateImage;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l3 = this.templateOrder;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode16 + i;
    }

    public String toString() {
        String str = this.logo;
        String str2 = this.benefProfilePicture;
        Long l = this.f84121id;
        String str3 = this.channel;
        String str4 = this.customerId;
        String str5 = this.extCustomerId;
        String str6 = this.templateId;
        String str7 = this.templateName;
        String str8 = this.templateType;
        String str9 = this.serviceId;
        Long l2 = this.modificationDate;
        String str10 = this.additionalData;
        List<TemplateParametersApiModel> list = this.templateParameters;
        String str11 = this.logoGe;
        String str12 = this.logoEn;
        String str13 = this.templateImage;
        Long l3 = this.templateOrder;
        return "TemplateApiModel(logo=" + str + ", benefProfilePicture=" + str2 + ", id=" + l + ", channel=" + str3 + ", customerId=" + str4 + ", extCustomerId=" + str5 + ", templateId=" + str6 + ", templateName=" + str7 + ", templateType=" + str8 + ", serviceId=" + str9 + ", modificationDate=" + l2 + ", additionalData=" + str10 + ", templateParameters=" + list + ", logoGe=" + str11 + ", logoEn=" + str12 + ", templateImage=" + str13 + ", templateOrder=" + l3 + ")";
    }

    public TemplateApiModel(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l2, String str10, List<TemplateParametersApiModel> list, String str11, String str12, String str13, Long l3) {
        this.logo = str;
        this.benefProfilePicture = str2;
        this.f84121id = l;
        this.channel = str3;
        this.customerId = str4;
        this.extCustomerId = str5;
        this.templateId = str6;
        this.templateName = str7;
        this.templateType = str8;
        this.serviceId = str9;
        this.modificationDate = l2;
        this.additionalData = str10;
        this.templateParameters = list;
        this.logoGe = str11;
        this.logoEn = str12;
        this.templateImage = str13;
        this.templateOrder = l3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TemplateApiModel(java.lang.String r19, java.lang.String r20, java.lang.Long r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Long r29, java.lang.String r30, java.util.List r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.Long r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r23
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r24
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r25
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r26
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r27
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r28
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r29
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r30
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r31
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r32
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r33
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r34
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r35
        L_0x0090:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.templates.data.models.TemplateApiModel.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
