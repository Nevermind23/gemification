package p341ge.bog.mobilebank.model.payment;

import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.payment.PaymentProviderConfiguration */
public class PaymentProviderConfiguration {
    public String additionalData;
    public String channel;
    public List<PaymentProviderConfiguration> children;
    public String commission;
    public String debtServiceId;
    public boolean hasDebt;

    /* renamed from: id */
    public long f81344id;
    public boolean isDDAllowed;
    public boolean isTemplateAccessAllowed;
    public String logo;
    public String oldLogo;
    private Integer orderId;
    public Integer orderingNumber;
    public PaymentProviderConfiguration parent;
    public long parentID;
    public Double payAmountLimit;
    public String paymentServiceId;
    String providerName;
    public String serviceCategory;
    public String serviceConfig;
    PaymentServiceConfig serviceConfigJson;
    public String serviceId;
    public String serviceName;
    public String serviceType;

    public void addChild(PaymentProviderConfiguration paymentProviderConfiguration) {
        if (this.children == null) {
            this.children = new ArrayList();
        }
        this.children.add(paymentProviderConfiguration);
    }

    public String getAdditionalData() {
        return this.additionalData;
    }

    public String getChannel() {
        return this.channel;
    }

    public List<PaymentProviderConfiguration> getChildren() {
        return this.children;
    }

    public String getCommission() {
        return this.commission;
    }

    public String getDebtServiceId() {
        return this.debtServiceId;
    }

    public long getId() {
        return this.f81344id;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getOldLogo() {
        String str = this.oldLogo;
        if (str != null) {
            return str;
        }
        return this.logo;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public PaymentProviderConfiguration getParent() {
        return this.parent;
    }

    public String getPaymentServiceId() {
        return this.paymentServiceId;
    }

    public String getProviderName() {
        String str = this.providerName;
        return str == null ? this.serviceName : str;
    }

    public PaymentProviderConfiguration getRootParent() {
        PaymentProviderConfiguration paymentProviderConfiguration = this;
        while (paymentProviderConfiguration.getParent() != null) {
            paymentProviderConfiguration = paymentProviderConfiguration.getParent();
        }
        return paymentProviderConfiguration;
    }

    public String getServiceCategory() {
        return this.serviceCategory;
    }

    public String getServiceConfig() {
        return this.serviceConfig;
    }

    public PaymentServiceConfig getServiceConfigJson() {
        return this.serviceConfigJson;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public boolean isDDAllowed() {
        return this.isDDAllowed;
    }

    public boolean isHasDebt() {
        return this.hasDebt;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setCommission(String str) {
        this.commission = str;
    }

    public void setDDAllowed(boolean z) {
        this.isDDAllowed = z;
    }

    public void setId(long j) {
        this.f81344id = j;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public void setOldLogo(String str) {
        this.oldLogo = str;
    }

    public void setOrderId(Integer num) {
        this.orderId = num;
    }

    public void setParent(PaymentProviderConfiguration paymentProviderConfiguration) {
        this.parent = paymentProviderConfiguration;
    }

    public void setServiceConfig(String str) {
        this.serviceConfig = str;
    }

    public void setServiceConfigJson(PaymentServiceConfig paymentServiceConfig) {
        this.serviceConfigJson = paymentServiceConfig;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }

    public boolean shouldApplyTint() {
        return getParent() == null;
    }

    public String toString() {
        return getServiceId();
    }
}
