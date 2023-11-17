package p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiModel */
public final class PaymentConfigApiModel {
    @C8664c("additionalData")
    private final String additionalData;
    @C8664c("bonusProductTypes")
    private final String bonusProductTypes;
    @C8664c("categoryColor")
    private final String categoryColor;
    @C8664c("categoryIconColor")
    private final String categoryIconColor;
    @C8664c("categoryType")
    private final String categoryType;
    @C8664c("channel")
    private final String channel;
    @C8664c("commission")
    private final String commission;
    @C8664c("ddEnabled")
    private final YesNoApiEntity ddEnabled;
    @C8664c("debtServiceId")
    private final String debtServiceId;
    @C8664c("hasDebt")
    private final boolean hasDebt;
    @C8664c("id")

    /* renamed from: id */
    private final long f81972id;
    @C8664c("isCarTemplateAllowed")
    private final boolean isCarTemplateAllowed;
    @C8664c("isDDAllowed")
    private final boolean isDDAllowed;
    @C8664c("isTemplateAccessAllowed")
    private final boolean isTemplateAccessAllowed;
    @C8664c("logo")
    private final String logo;
    @C8664c("oldLogo")
    private final String oldLogo;
    @C8664c("orderingNumber")
    private final Integer orderingNumber;
    @C8664c("payAmountLimit")
    private final Double payAmountLimit;
    @C8664c("paymentServiceId")
    private final String paymentServiceId;
    @C8664c("searchKeysDictionaryKey")
    private final String searchKeysDictionaryKey;
    @C8664c("serviceCategory")
    private final String serviceCategory;
    @C8664c("serviceId")
    private final String serviceId;
    @C8664c("serviceName")
    private final String serviceName;
    @C8664c("serviceType")
    private final String serviceType;
    @C8664c("templateAllowed")
    private final boolean templateAllowed;

    public PaymentConfigApiModel(boolean z, boolean z2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, Double d, boolean z3, boolean z4, boolean z5, String str10, String str11, String str12, String str13, String str14, String str15, YesNoApiEntity yesNoApiEntity, String str16) {
        String str17 = str7;
        String str18 = str8;
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str3, "serviceType");
        C41536l.m120489i(str17, "serviceName");
        C41536l.m120489i(str18, "channel");
        this.isDDAllowed = z;
        this.templateAllowed = z2;
        this.f81972id = j;
        this.serviceId = str;
        this.paymentServiceId = str2;
        this.serviceType = str3;
        this.debtServiceId = str4;
        this.commission = str5;
        this.serviceCategory = str6;
        this.serviceName = str17;
        this.channel = str18;
        this.orderingNumber = num;
        this.logo = str9;
        this.payAmountLimit = d;
        this.isTemplateAccessAllowed = z3;
        this.isCarTemplateAllowed = z4;
        this.hasDebt = z5;
        this.additionalData = str10;
        this.bonusProductTypes = str11;
        this.categoryColor = str12;
        this.categoryIconColor = str13;
        this.categoryType = str14;
        this.oldLogo = str15;
        this.ddEnabled = yesNoApiEntity;
        this.searchKeysDictionaryKey = str16;
    }

    public static /* synthetic */ PaymentConfigApiModel copy$default(PaymentConfigApiModel paymentConfigApiModel, boolean z, boolean z2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, Double d, boolean z3, boolean z4, boolean z5, String str10, String str11, String str12, String str13, String str14, String str15, YesNoApiEntity yesNoApiEntity, String str16, int i, Object obj) {
        PaymentConfigApiModel paymentConfigApiModel2 = paymentConfigApiModel;
        int i2 = i;
        return paymentConfigApiModel.copy((i2 & 1) != 0 ? paymentConfigApiModel2.isDDAllowed : z, (i2 & 2) != 0 ? paymentConfigApiModel2.templateAllowed : z2, (i2 & 4) != 0 ? paymentConfigApiModel2.f81972id : j, (i2 & 8) != 0 ? paymentConfigApiModel2.serviceId : str, (i2 & 16) != 0 ? paymentConfigApiModel2.paymentServiceId : str2, (i2 & 32) != 0 ? paymentConfigApiModel2.serviceType : str3, (i2 & 64) != 0 ? paymentConfigApiModel2.debtServiceId : str4, (i2 & 128) != 0 ? paymentConfigApiModel2.commission : str5, (i2 & C11398b.f33139r) != 0 ? paymentConfigApiModel2.serviceCategory : str6, (i2 & C11398b.f33140s) != 0 ? paymentConfigApiModel2.serviceName : str7, (i2 & C11398b.f33141t) != 0 ? paymentConfigApiModel2.channel : str8, (i2 & C11398b.f33142u) != 0 ? paymentConfigApiModel2.orderingNumber : num, (i2 & C11398b.f33143v) != 0 ? paymentConfigApiModel2.logo : str9, (i2 & 8192) != 0 ? paymentConfigApiModel2.payAmountLimit : d, (i2 & 16384) != 0 ? paymentConfigApiModel2.isTemplateAccessAllowed : z3, (i2 & 32768) != 0 ? paymentConfigApiModel2.isCarTemplateAllowed : z4, (i2 & 65536) != 0 ? paymentConfigApiModel2.hasDebt : z5, (i2 & 131072) != 0 ? paymentConfigApiModel2.additionalData : str10, (i2 & 262144) != 0 ? paymentConfigApiModel2.bonusProductTypes : str11, (i2 & 524288) != 0 ? paymentConfigApiModel2.categoryColor : str12, (i2 & 1048576) != 0 ? paymentConfigApiModel2.categoryIconColor : str13, (i2 & 2097152) != 0 ? paymentConfigApiModel2.categoryType : str14, (i2 & 4194304) != 0 ? paymentConfigApiModel2.oldLogo : str15, (i2 & 8388608) != 0 ? paymentConfigApiModel2.ddEnabled : yesNoApiEntity, (i2 & 16777216) != 0 ? paymentConfigApiModel2.searchKeysDictionaryKey : str16);
    }

    public final boolean component1() {
        return this.isDDAllowed;
    }

    public final String component10() {
        return this.serviceName;
    }

    public final String component11() {
        return this.channel;
    }

    public final Integer component12() {
        return this.orderingNumber;
    }

    public final String component13() {
        return this.logo;
    }

    public final Double component14() {
        return this.payAmountLimit;
    }

    public final boolean component15() {
        return this.isTemplateAccessAllowed;
    }

    public final boolean component16() {
        return this.isCarTemplateAllowed;
    }

    public final boolean component17() {
        return this.hasDebt;
    }

    public final String component18() {
        return this.additionalData;
    }

    public final String component19() {
        return this.bonusProductTypes;
    }

    public final boolean component2() {
        return this.templateAllowed;
    }

    public final String component20() {
        return this.categoryColor;
    }

    public final String component21() {
        return this.categoryIconColor;
    }

    public final String component22() {
        return this.categoryType;
    }

    public final String component23() {
        return this.oldLogo;
    }

    public final YesNoApiEntity component24() {
        return this.ddEnabled;
    }

    public final String component25() {
        return this.searchKeysDictionaryKey;
    }

    public final long component3() {
        return this.f81972id;
    }

    public final String component4() {
        return this.serviceId;
    }

    public final String component5() {
        return this.paymentServiceId;
    }

    public final String component6() {
        return this.serviceType;
    }

    public final String component7() {
        return this.debtServiceId;
    }

    public final String component8() {
        return this.commission;
    }

    public final String component9() {
        return this.serviceCategory;
    }

    public final PaymentConfigApiModel copy(boolean z, boolean z2, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, Double d, boolean z3, boolean z4, boolean z5, String str10, String str11, String str12, String str13, String str14, String str15, YesNoApiEntity yesNoApiEntity, String str16) {
        boolean z6 = z;
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str3, "serviceType");
        C41536l.m120489i(str7, "serviceName");
        C41536l.m120489i(str8, "channel");
        return new PaymentConfigApiModel(z, z2, j, str, str2, str3, str4, str5, str6, str7, str8, num, str9, d, z3, z4, z5, str10, str11, str12, str13, str14, str15, yesNoApiEntity, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentConfigApiModel)) {
            return false;
        }
        PaymentConfigApiModel paymentConfigApiModel = (PaymentConfigApiModel) obj;
        return this.isDDAllowed == paymentConfigApiModel.isDDAllowed && this.templateAllowed == paymentConfigApiModel.templateAllowed && this.f81972id == paymentConfigApiModel.f81972id && C41536l.m120484d(this.serviceId, paymentConfigApiModel.serviceId) && C41536l.m120484d(this.paymentServiceId, paymentConfigApiModel.paymentServiceId) && C41536l.m120484d(this.serviceType, paymentConfigApiModel.serviceType) && C41536l.m120484d(this.debtServiceId, paymentConfigApiModel.debtServiceId) && C41536l.m120484d(this.commission, paymentConfigApiModel.commission) && C41536l.m120484d(this.serviceCategory, paymentConfigApiModel.serviceCategory) && C41536l.m120484d(this.serviceName, paymentConfigApiModel.serviceName) && C41536l.m120484d(this.channel, paymentConfigApiModel.channel) && C41536l.m120484d(this.orderingNumber, paymentConfigApiModel.orderingNumber) && C41536l.m120484d(this.logo, paymentConfigApiModel.logo) && C41536l.m120484d(this.payAmountLimit, paymentConfigApiModel.payAmountLimit) && this.isTemplateAccessAllowed == paymentConfigApiModel.isTemplateAccessAllowed && this.isCarTemplateAllowed == paymentConfigApiModel.isCarTemplateAllowed && this.hasDebt == paymentConfigApiModel.hasDebt && C41536l.m120484d(this.additionalData, paymentConfigApiModel.additionalData) && C41536l.m120484d(this.bonusProductTypes, paymentConfigApiModel.bonusProductTypes) && C41536l.m120484d(this.categoryColor, paymentConfigApiModel.categoryColor) && C41536l.m120484d(this.categoryIconColor, paymentConfigApiModel.categoryIconColor) && C41536l.m120484d(this.categoryType, paymentConfigApiModel.categoryType) && C41536l.m120484d(this.oldLogo, paymentConfigApiModel.oldLogo) && this.ddEnabled == paymentConfigApiModel.ddEnabled && C41536l.m120484d(this.searchKeysDictionaryKey, paymentConfigApiModel.searchKeysDictionaryKey);
    }

    public final String getAdditionalData() {
        return this.additionalData;
    }

    public final String getBonusProductTypes() {
        return this.bonusProductTypes;
    }

    public final String getCategoryColor() {
        return this.categoryColor;
    }

    public final String getCategoryIconColor() {
        return this.categoryIconColor;
    }

    public final String getCategoryType() {
        return this.categoryType;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getCommission() {
        return this.commission;
    }

    public final YesNoApiEntity getDdEnabled() {
        return this.ddEnabled;
    }

    public final String getDebtServiceId() {
        return this.debtServiceId;
    }

    public final boolean getHasDebt() {
        return this.hasDebt;
    }

    public final long getId() {
        return this.f81972id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getOldLogo() {
        return this.oldLogo;
    }

    public final Integer getOrderingNumber() {
        return this.orderingNumber;
    }

    public final Double getPayAmountLimit() {
        return this.payAmountLimit;
    }

    public final String getPaymentServiceId() {
        return this.paymentServiceId;
    }

    public final String getSearchKeysDictionaryKey() {
        return this.searchKeysDictionaryKey;
    }

    public final String getServiceCategory() {
        return this.serviceCategory;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    public final boolean getTemplateAllowed() {
        return this.templateAllowed;
    }

    public int hashCode() {
        boolean z = this.isDDAllowed;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.templateAllowed;
        if (z3) {
            z3 = true;
        }
        int a = (((((i + (z3 ? 1 : 0)) * 31) + C7397t.m28148a(this.f81972id)) * 31) + this.serviceId.hashCode()) * 31;
        String str = this.paymentServiceId;
        int i2 = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.serviceType.hashCode()) * 31;
        String str2 = this.debtServiceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.commission;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceCategory;
        int hashCode4 = (((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.serviceName.hashCode()) * 31) + this.channel.hashCode()) * 31;
        Integer num = this.orderingNumber;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.logo;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.payAmountLimit;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        boolean z4 = this.isTemplateAccessAllowed;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode7 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isCarTemplateAllowed;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.hasDebt;
        if (!z6) {
            z2 = z6;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        String str6 = this.additionalData;
        int hashCode8 = (i5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bonusProductTypes;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.categoryColor;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.categoryIconColor;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.categoryType;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.oldLogo;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.ddEnabled;
        int hashCode14 = (hashCode13 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str12 = this.searchKeysDictionaryKey;
        if (str12 != null) {
            i2 = str12.hashCode();
        }
        return hashCode14 + i2;
    }

    public final boolean isCarTemplateAllowed() {
        return this.isCarTemplateAllowed;
    }

    public final boolean isDDAllowed() {
        return this.isDDAllowed;
    }

    public final boolean isTemplateAccessAllowed() {
        return this.isTemplateAccessAllowed;
    }

    public String toString() {
        boolean z = this.isDDAllowed;
        boolean z2 = this.templateAllowed;
        long j = this.f81972id;
        String str = this.serviceId;
        String str2 = this.paymentServiceId;
        String str3 = this.serviceType;
        String str4 = this.debtServiceId;
        String str5 = this.commission;
        String str6 = this.serviceCategory;
        String str7 = this.serviceName;
        String str8 = this.channel;
        Integer num = this.orderingNumber;
        String str9 = this.logo;
        Double d = this.payAmountLimit;
        boolean z3 = this.isTemplateAccessAllowed;
        boolean z4 = this.isCarTemplateAllowed;
        boolean z5 = this.hasDebt;
        String str10 = this.additionalData;
        String str11 = this.bonusProductTypes;
        String str12 = this.categoryColor;
        String str13 = this.categoryIconColor;
        String str14 = this.categoryType;
        String str15 = this.oldLogo;
        YesNoApiEntity yesNoApiEntity = this.ddEnabled;
        String str16 = this.searchKeysDictionaryKey;
        return "PaymentConfigApiModel(isDDAllowed=" + z + ", templateAllowed=" + z2 + ", id=" + j + ", serviceId=" + str + ", paymentServiceId=" + str2 + ", serviceType=" + str3 + ", debtServiceId=" + str4 + ", commission=" + str5 + ", serviceCategory=" + str6 + ", serviceName=" + str7 + ", channel=" + str8 + ", orderingNumber=" + num + ", logo=" + str9 + ", payAmountLimit=" + d + ", isTemplateAccessAllowed=" + z3 + ", isCarTemplateAllowed=" + z4 + ", hasDebt=" + z5 + ", additionalData=" + str10 + ", bonusProductTypes=" + str11 + ", categoryColor=" + str12 + ", categoryIconColor=" + str13 + ", categoryType=" + str14 + ", oldLogo=" + str15 + ", ddEnabled=" + yesNoApiEntity + ", searchKeysDictionaryKey=" + str16 + ")";
    }
}
