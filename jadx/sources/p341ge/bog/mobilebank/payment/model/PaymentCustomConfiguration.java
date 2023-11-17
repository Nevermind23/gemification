package p341ge.bog.mobilebank.payment.model;

import g91.C32315k0;
import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import r90.C27950a;

@Parcel
/* renamed from: ge.bog.mobilebank.payment.model.PaymentCustomConfiguration */
public class PaymentCustomConfiguration {
    PaymentProviderConfiguration baseConfiguration;
    String bonusType;
    long companyId;
    String debtServiceId;
    String defaultCarNumber;
    String defaultPersonalNumber;
    String defaultTicketNumber;
    boolean isCompany;
    boolean isMobile;
    boolean isTemplate;
    String logoUrl;
    String name;
    List<PaymentCustomParameter> parameters;
    String pointAmount = "";
    ArrayList<TemplateBasketItem> resultListItems;
    PaymentsServiceConfigInputOption selectedPackageConfig;
    int selectedPackageIndex = -1;
    String serviceId;

    public PaymentProviderConfiguration getBaseConfiguration() {
        return this.baseConfiguration;
    }

    public String getBonusType() {
        return this.bonusType;
    }

    public long getCompanyId() {
        return this.companyId;
    }

    public PaymentCustomParameter getCustomParamByKey(String str) {
        for (PaymentCustomParameter next : getParameters()) {
            if (str.equals(next.getId())) {
                return next;
            }
        }
        return null;
    }

    public int getCustomParamCountByKey(String str) {
        int i = 0;
        for (PaymentCustomParameter id : getParameters()) {
            if (str.equals(id.getId())) {
                i++;
            }
        }
        return i;
    }

    public String getDebtServiceId() {
        return this.debtServiceId;
    }

    public String getDefaultCarNumber() {
        return this.defaultCarNumber;
    }

    public String getDefaultPersonalNumber() {
        return this.defaultPersonalNumber;
    }

    public String getDefaultTicketNumber() {
        return this.defaultTicketNumber;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getName() {
        return this.name;
    }

    public List<PaymentCustomParameter> getParameters() {
        return this.parameters;
    }

    public String getPointAmount() {
        return this.pointAmount;
    }

    public ArrayList<TemplateBasketItem> getResultListItems() {
        return this.resultListItems;
    }

    public PaymentsServiceConfigInputOption getSelectedPackageConfig() {
        return this.selectedPackageConfig;
    }

    public int getSelectedPackageIndex() {
        return this.selectedPackageIndex;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public boolean isCompany() {
        return this.isCompany;
    }

    public boolean isDebtVerifiable() {
        return this.debtServiceId != null;
    }

    public boolean isMobile() {
        return this.isMobile;
    }

    public boolean isTemplate() {
        return this.isTemplate;
    }

    public boolean requiresDebtVerify(int i) {
        int i2 = 0;
        for (PaymentCustomParameter next : this.parameters) {
            if (next.isVisibleInWizard()) {
                i2++;
            }
            if (i2 - 1 == i) {
                return next.isDebtVerifiable();
            }
        }
        return false;
    }

    public void setBaseConfiguration(PaymentProviderConfiguration paymentProviderConfiguration) {
        this.baseConfiguration = paymentProviderConfiguration;
    }

    public void setBonusType(String str) {
        this.bonusType = str;
    }

    public void setCompanyId(long j) {
        this.companyId = j;
    }

    public void setDebtServiceId(String str) {
        this.debtServiceId = str;
    }

    public void setDefaultCarNumber(String str) {
        this.defaultCarNumber = str;
    }

    public void setDefaultPersonalNumber(String str) {
        this.defaultPersonalNumber = str;
    }

    public void setDefaultTicketNumber(String str) {
        this.defaultTicketNumber = str;
    }

    public void setIsCompany(boolean z) {
        this.isCompany = z;
    }

    public void setIsTemplate(boolean z) {
        this.isTemplate = z;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public void setMobile(boolean z) {
        this.isMobile = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParameters(List<PaymentCustomParameter> list) {
        this.parameters = list;
    }

    public void setPointAmount(String str) {
        this.pointAmount = str;
    }

    public void setResultListItems(ArrayList<TemplateBasketItem> arrayList) {
        this.resultListItems = arrayList;
    }

    public void setSelectedPackageConfig(PaymentsServiceConfigInputOption paymentsServiceConfigInputOption) {
        this.selectedPackageConfig = paymentsServiceConfigInputOption;
    }

    public void setSelectedPackageIndex(PaymentServiceConfig paymentServiceConfig, int i) {
        PaymentCustomParameter customParamByKey;
        this.selectedPackageIndex = i;
        List<PaymentCustomParameter> list = this.parameters;
        if (list != null && list.size() > 0 && (customParamByKey = getCustomParamByKey("bog_package_id")) != null) {
            if (i != -1) {
                PaymentsServiceConfigInputOption n = C32315k0.m95265n(paymentServiceConfig, i);
                this.selectedPackageConfig = n;
                customParamByKey.setValue(n.getService());
                customParamByKey.setValueToDisplay(C27950a.m86286c(this.selectedPackageConfig.getValue(), true));
                customParamByKey.setVisibleInForm(true);
                return;
            }
            this.selectedPackageConfig = null;
            customParamByKey.setVisibleInForm(false);
        }
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }
}
