package p341ge.bog.mobilebank.shared.payments.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.shared.payments.data.model.PaymentConfigDetailsApiModel */
public final class PaymentConfigDetailsApiModel {
    private final String additionalData;
    private final Object bonusProductTypes;
    private final String categoryColor;
    private final String categoryIconColor;
    private final String categoryType;
    private final String channel;
    private final String commission;
    private final String debtServiceId;
    private final boolean hasDebt;

    /* renamed from: id */
    private final long f83751id;
    private final boolean isCarTemplateAllowed;
    private final boolean isTemplateAccessAllowed;
    private final String logo;
    private final Integer orderId;
    private final int orderingNumber;
    private final Double payAmountLimit;
    private final String paymentServiceId;
    private final String serviceCategory;
    private final Object serviceConfig;
    private final PaymentServiceConfigJsonApiModel serviceConfigJson;
    private final String serviceId;
    private final String serviceName;
    private final String serviceType;

    public PaymentConfigDetailsApiModel(long j, String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, Object obj2, Double d, boolean z, boolean z2, boolean z3, Integer num, String str11, String str12, String str13, PaymentServiceConfigJsonApiModel paymentServiceConfigJsonApiModel) {
        String str14 = str7;
        String str15 = str8;
        PaymentServiceConfigJsonApiModel paymentServiceConfigJsonApiModel2 = paymentServiceConfigJsonApiModel;
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str3, "serviceType");
        C41536l.m120489i(str14, "serviceName");
        C41536l.m120489i(str15, "channel");
        C41536l.m120489i(paymentServiceConfigJsonApiModel2, "serviceConfigJson");
        this.f83751id = j;
        this.serviceId = str;
        this.paymentServiceId = str2;
        this.serviceType = str3;
        this.serviceConfig = obj;
        this.debtServiceId = str4;
        this.commission = str5;
        this.serviceCategory = str6;
        this.serviceName = str14;
        this.channel = str15;
        this.orderingNumber = i;
        this.logo = str9;
        this.additionalData = str10;
        this.bonusProductTypes = obj2;
        this.payAmountLimit = d;
        this.isTemplateAccessAllowed = z;
        this.isCarTemplateAllowed = z2;
        this.hasDebt = z3;
        this.orderId = num;
        this.categoryColor = str11;
        this.categoryIconColor = str12;
        this.categoryType = str13;
        this.serviceConfigJson = paymentServiceConfigJsonApiModel2;
    }

    public static /* synthetic */ PaymentConfigDetailsApiModel copy$default(PaymentConfigDetailsApiModel paymentConfigDetailsApiModel, long j, String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, Object obj2, Double d, boolean z, boolean z2, boolean z3, Integer num, String str11, String str12, String str13, PaymentServiceConfigJsonApiModel paymentServiceConfigJsonApiModel, int i2, Object obj3) {
        PaymentConfigDetailsApiModel paymentConfigDetailsApiModel2 = paymentConfigDetailsApiModel;
        int i3 = i2;
        return paymentConfigDetailsApiModel.copy((i3 & 1) != 0 ? paymentConfigDetailsApiModel2.f83751id : j, (i3 & 2) != 0 ? paymentConfigDetailsApiModel2.serviceId : str, (i3 & 4) != 0 ? paymentConfigDetailsApiModel2.paymentServiceId : str2, (i3 & 8) != 0 ? paymentConfigDetailsApiModel2.serviceType : str3, (i3 & 16) != 0 ? paymentConfigDetailsApiModel2.serviceConfig : obj, (i3 & 32) != 0 ? paymentConfigDetailsApiModel2.debtServiceId : str4, (i3 & 64) != 0 ? paymentConfigDetailsApiModel2.commission : str5, (i3 & 128) != 0 ? paymentConfigDetailsApiModel2.serviceCategory : str6, (i3 & C11398b.f33139r) != 0 ? paymentConfigDetailsApiModel2.serviceName : str7, (i3 & C11398b.f33140s) != 0 ? paymentConfigDetailsApiModel2.channel : str8, (i3 & C11398b.f33141t) != 0 ? paymentConfigDetailsApiModel2.orderingNumber : i, (i3 & C11398b.f33142u) != 0 ? paymentConfigDetailsApiModel2.logo : str9, (i3 & C11398b.f33143v) != 0 ? paymentConfigDetailsApiModel2.additionalData : str10, (i3 & 8192) != 0 ? paymentConfigDetailsApiModel2.bonusProductTypes : obj2, (i3 & 16384) != 0 ? paymentConfigDetailsApiModel2.payAmountLimit : d, (i3 & 32768) != 0 ? paymentConfigDetailsApiModel2.isTemplateAccessAllowed : z, (i3 & 65536) != 0 ? paymentConfigDetailsApiModel2.isCarTemplateAllowed : z2, (i3 & 131072) != 0 ? paymentConfigDetailsApiModel2.hasDebt : z3, (i3 & 262144) != 0 ? paymentConfigDetailsApiModel2.orderId : num, (i3 & 524288) != 0 ? paymentConfigDetailsApiModel2.categoryColor : str11, (i3 & 1048576) != 0 ? paymentConfigDetailsApiModel2.categoryIconColor : str12, (i3 & 2097152) != 0 ? paymentConfigDetailsApiModel2.categoryType : str13, (i3 & 4194304) != 0 ? paymentConfigDetailsApiModel2.serviceConfigJson : paymentServiceConfigJsonApiModel);
    }

    public final long component1() {
        return this.f83751id;
    }

    public final String component10() {
        return this.channel;
    }

    public final int component11() {
        return this.orderingNumber;
    }

    public final String component12() {
        return this.logo;
    }

    public final String component13() {
        return this.additionalData;
    }

    public final Object component14() {
        return this.bonusProductTypes;
    }

    public final Double component15() {
        return this.payAmountLimit;
    }

    public final boolean component16() {
        return this.isTemplateAccessAllowed;
    }

    public final boolean component17() {
        return this.isCarTemplateAllowed;
    }

    public final boolean component18() {
        return this.hasDebt;
    }

    public final Integer component19() {
        return this.orderId;
    }

    public final String component2() {
        return this.serviceId;
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

    public final PaymentServiceConfigJsonApiModel component23() {
        return this.serviceConfigJson;
    }

    public final String component3() {
        return this.paymentServiceId;
    }

    public final String component4() {
        return this.serviceType;
    }

    public final Object component5() {
        return this.serviceConfig;
    }

    public final String component6() {
        return this.debtServiceId;
    }

    public final String component7() {
        return this.commission;
    }

    public final String component8() {
        return this.serviceCategory;
    }

    public final String component9() {
        return this.serviceName;
    }

    public final PaymentConfigDetailsApiModel copy(long j, String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, Object obj2, Double d, boolean z, boolean z2, boolean z3, Integer num, String str11, String str12, String str13, PaymentServiceConfigJsonApiModel paymentServiceConfigJsonApiModel) {
        long j2 = j;
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str3, "serviceType");
        C41536l.m120489i(str7, "serviceName");
        C41536l.m120489i(str8, "channel");
        C41536l.m120489i(paymentServiceConfigJsonApiModel, "serviceConfigJson");
        return new PaymentConfigDetailsApiModel(j, str, str2, str3, obj, str4, str5, str6, str7, str8, i, str9, str10, obj2, d, z, z2, z3, num, str11, str12, str13, paymentServiceConfigJsonApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentConfigDetailsApiModel)) {
            return false;
        }
        PaymentConfigDetailsApiModel paymentConfigDetailsApiModel = (PaymentConfigDetailsApiModel) obj;
        return this.f83751id == paymentConfigDetailsApiModel.f83751id && C41536l.m120484d(this.serviceId, paymentConfigDetailsApiModel.serviceId) && C41536l.m120484d(this.paymentServiceId, paymentConfigDetailsApiModel.paymentServiceId) && C41536l.m120484d(this.serviceType, paymentConfigDetailsApiModel.serviceType) && C41536l.m120484d(this.serviceConfig, paymentConfigDetailsApiModel.serviceConfig) && C41536l.m120484d(this.debtServiceId, paymentConfigDetailsApiModel.debtServiceId) && C41536l.m120484d(this.commission, paymentConfigDetailsApiModel.commission) && C41536l.m120484d(this.serviceCategory, paymentConfigDetailsApiModel.serviceCategory) && C41536l.m120484d(this.serviceName, paymentConfigDetailsApiModel.serviceName) && C41536l.m120484d(this.channel, paymentConfigDetailsApiModel.channel) && this.orderingNumber == paymentConfigDetailsApiModel.orderingNumber && C41536l.m120484d(this.logo, paymentConfigDetailsApiModel.logo) && C41536l.m120484d(this.additionalData, paymentConfigDetailsApiModel.additionalData) && C41536l.m120484d(this.bonusProductTypes, paymentConfigDetailsApiModel.bonusProductTypes) && C41536l.m120484d(this.payAmountLimit, paymentConfigDetailsApiModel.payAmountLimit) && this.isTemplateAccessAllowed == paymentConfigDetailsApiModel.isTemplateAccessAllowed && this.isCarTemplateAllowed == paymentConfigDetailsApiModel.isCarTemplateAllowed && this.hasDebt == paymentConfigDetailsApiModel.hasDebt && C41536l.m120484d(this.orderId, paymentConfigDetailsApiModel.orderId) && C41536l.m120484d(this.categoryColor, paymentConfigDetailsApiModel.categoryColor) && C41536l.m120484d(this.categoryIconColor, paymentConfigDetailsApiModel.categoryIconColor) && C41536l.m120484d(this.categoryType, paymentConfigDetailsApiModel.categoryType) && C41536l.m120484d(this.serviceConfigJson, paymentConfigDetailsApiModel.serviceConfigJson);
    }

    public final String getAdditionalData() {
        return this.additionalData;
    }

    public final Object getBonusProductTypes() {
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

    public final String getDebtServiceId() {
        return this.debtServiceId;
    }

    public final boolean getHasDebt() {
        return this.hasDebt;
    }

    public final long getId() {
        return this.f83751id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Integer getOrderId() {
        return this.orderId;
    }

    public final int getOrderingNumber() {
        return this.orderingNumber;
    }

    public final Double getPayAmountLimit() {
        return this.payAmountLimit;
    }

    public final String getPaymentServiceId() {
        return this.paymentServiceId;
    }

    public final String getServiceCategory() {
        return this.serviceCategory;
    }

    public final Object getServiceConfig() {
        return this.serviceConfig;
    }

    public final PaymentServiceConfigJsonApiModel getServiceConfigJson() {
        return this.serviceConfigJson;
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

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f83751id) * 31) + this.serviceId.hashCode()) * 31;
        String str = this.paymentServiceId;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.serviceType.hashCode()) * 31;
        Object obj = this.serviceConfig;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.debtServiceId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.commission;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceCategory;
        int hashCode5 = (((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.serviceName.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.orderingNumber) * 31;
        String str5 = this.logo;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.additionalData;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj2 = this.bonusProductTypes;
        int hashCode8 = (hashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Double d = this.payAmountLimit;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        boolean z = this.isTemplateAccessAllowed;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isCarTemplateAllowed;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.hasDebt;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Integer num = this.orderId;
        int hashCode10 = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.categoryColor;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.categoryIconColor;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.categoryType;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return ((hashCode12 + i) * 31) + this.serviceConfigJson.hashCode();
    }

    public final boolean isCarTemplateAllowed() {
        return this.isCarTemplateAllowed;
    }

    public final boolean isTemplateAccessAllowed() {
        return this.isTemplateAccessAllowed;
    }

    public String toString() {
        long j = this.f83751id;
        String str = this.serviceId;
        String str2 = this.paymentServiceId;
        String str3 = this.serviceType;
        Object obj = this.serviceConfig;
        String str4 = this.debtServiceId;
        String str5 = this.commission;
        String str6 = this.serviceCategory;
        String str7 = this.serviceName;
        String str8 = this.channel;
        int i = this.orderingNumber;
        String str9 = this.logo;
        String str10 = this.additionalData;
        Object obj2 = this.bonusProductTypes;
        Double d = this.payAmountLimit;
        boolean z = this.isTemplateAccessAllowed;
        boolean z2 = this.isCarTemplateAllowed;
        boolean z3 = this.hasDebt;
        Integer num = this.orderId;
        String str11 = this.categoryColor;
        String str12 = this.categoryIconColor;
        String str13 = this.categoryType;
        PaymentServiceConfigJsonApiModel paymentServiceConfigJsonApiModel = this.serviceConfigJson;
        return "PaymentConfigDetailsApiModel(id=" + j + ", serviceId=" + str + ", paymentServiceId=" + str2 + ", serviceType=" + str3 + ", serviceConfig=" + obj + ", debtServiceId=" + str4 + ", commission=" + str5 + ", serviceCategory=" + str6 + ", serviceName=" + str7 + ", channel=" + str8 + ", orderingNumber=" + i + ", logo=" + str9 + ", additionalData=" + str10 + ", bonusProductTypes=" + obj2 + ", payAmountLimit=" + d + ", isTemplateAccessAllowed=" + z + ", isCarTemplateAllowed=" + z2 + ", hasDebt=" + z3 + ", orderId=" + num + ", categoryColor=" + str11 + ", categoryIconColor=" + str12 + ", categoryType=" + str13 + ", serviceConfigJson=" + paymentServiceConfigJsonApiModel + ")";
    }
}
