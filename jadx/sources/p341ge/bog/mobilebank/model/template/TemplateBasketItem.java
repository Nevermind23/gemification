package p341ge.bog.mobilebank.model.template;

import g91.C32299e;
import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;
import p277ua.C8662a;
import p341ge.bog.mobilebank.eventbus.events.TemplateDebtEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.rest.model.BogUrlHelper;
import r90.C27950a;

@Parcel
/* renamed from: ge.bog.mobilebank.model.template.TemplateBasketItem */
public class TemplateBasketItem {
    static long tempIdl;
    @C8662a
    String additionalData;
    public String benefProfilePicture;
    boolean canGetDebt;
    @C8662a
    String channel;
    @C8662a
    String customerId;
    int debtAmount;
    @C8662a

    /* renamed from: id */
    Long f81377id;
    boolean isCTPark1Week;
    boolean isCTParkItem;
    boolean isEditable;
    boolean isUserPaying;
    @C8662a
    String logo;
    String modificationDate;
    boolean removeImage;
    @C8662a
    String serviceId;
    TemplateDebtEvent templateDebtEvent;
    @C8662a
    String templateId;
    String templateImage;
    @C8662a
    String templateName;
    private Integer templateOrder;
    @C8662a
    List<TemplateBasketParameter> templateParameters;
    @C8662a
    String templateType;

    public TemplateBasketItem() {
    }

    public boolean canGetDebt() {
        return this.canGetDebt;
    }

    public String getAdditionalData() {
        return this.additionalData;
    }

    public String getAmount() {
        String str;
        String str2 = null;
        if (getTemplateParameters() != null) {
            str = null;
            for (TemplateBasketParameter next : getTemplateParameters()) {
                if (next.getParameterKey() != null && next.getParameterKey().equals("amount") && next.getParameterValue() != null && !next.getParameterValue().equals("")) {
                    if (PensionStatusResult.STATUS_ACTIVE.equals(next.getParameterType())) {
                        str2 = next.getParameterValue();
                    }
                    str = next.getParameterValue();
                }
            }
        } else {
            str = null;
        }
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public int getDebtAmount() {
        return this.debtAmount;
    }

    public long getId() {
        Long l = this.f81377id;
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    public long getIdForTemplateParam(String str) {
        for (TemplateBasketParameter next : getTemplateParameters()) {
            if (next.getParameterKey().equals(str)) {
                return next.getId().longValue();
            }
        }
        return -1;
    }

    public int getImageRes() {
        return C32299e.m95164b(getParameterValue("benefBic"));
    }

    public String getLogo() {
        return this.logo;
    }

    public String getModificationDate() {
        return this.modificationDate;
    }

    public String getParameterValue(String str, int i) {
        if (getTemplateParameters() == null) {
            return null;
        }
        for (TemplateBasketParameter next : getTemplateParameters()) {
            if (PensionStatusResult.STATUS_ACTIVE.equals(next.getParameterType()) && next.getParameterKey() != null && next.getParameterKey().equals(str) && next.getParameterIndex() == i) {
                return next.getParameterValue();
            }
        }
        return null;
    }

    public String getParameterValueByParameterType(String str) {
        if (getTemplateParameters() == null) {
            return null;
        }
        for (TemplateBasketParameter next : getTemplateParameters()) {
            if (next.getParameterType() != null && next.getParameterType().equals(str)) {
                return next.getParameterValue();
            }
        }
        return null;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public TemplateDebtEvent getTemplateDebtEvent() {
        return this.templateDebtEvent;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateImage(boolean z) {
        if (!z || this.templateImage != null) {
            return this.templateImage;
        }
        return this.benefProfilePicture;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getTemplateNameOrServiceName(Client client) {
        PaymentServiceConfig paymentServiceConfigOfItem;
        String str = this.templateName;
        if (str != null) {
            return str;
        }
        if (client == null || client.getTemplateBasketItemsWithConfig() == null || (paymentServiceConfigOfItem = client.getTemplateBasketItemsWithConfig().getPaymentServiceConfigOfItem(this)) == null) {
            return getParameterValue("recipientName");
        }
        return C27950a.m86286c(paymentServiceConfigOfItem.getName(), true);
    }

    public Integer getTemplateOrder() {
        return this.templateOrder;
    }

    public List<TemplateBasketParameter> getTemplateParameters() {
        return this.templateParameters;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public String getTransferInitials() {
        String parameterValue = getParameterValue("recipientName");
        String str = "";
        if (parameterValue != null && parameterValue.split(" ") != null) {
            int i = 0;
            for (String str2 : parameterValue.split(" ")) {
                i++;
                if (str2.length() > 0) {
                    str = str + str2.substring(0, 1);
                }
                if (i == 2) {
                    break;
                }
            }
        }
        return str;
    }

    public String getValueByKey(String str) {
        if (getTemplateDebtEvent().getPaymentDebt() == null || getTemplateDebtEvent().getPaymentDebt().getParameter() == null) {
            return null;
        }
        for (KeyValue keyValue : getTemplateDebtEvent().getPaymentDebt().getParameter()) {
            if (keyValue.getKey().equals(str)) {
                return keyValue.getValue();
            }
        }
        return null;
    }

    public boolean isCTPark1Week() {
        return this.isCTPark1Week;
    }

    public boolean isCTParkItem() {
        return this.isCTParkItem;
    }

    public boolean isEditable() {
        return this.isEditable;
    }

    public boolean isRemoveImage() {
        return this.removeImage;
    }

    public boolean isTransferTemplate() {
        if (getTemplateType() == null) {
            return false;
        }
        if (getTemplateType().equals("M") || getTemplateType().equals("B") || getTemplateType().equals("F") || getTemplateType().equals("G") || getTemplateType().equals("R")) {
            return true;
        }
        return false;
    }

    public boolean isUserPaying() {
        return true;
    }

    public void setAdditionalData(String str) {
        this.additionalData = str;
    }

    public void setCTParkItem(boolean z) {
        this.isCTParkItem = z;
    }

    public void setCanGetDebt(boolean z) {
        this.canGetDebt = z;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setDebtAmount(int i) {
        this.debtAmount = i;
    }

    public void setEditable(boolean z) {
        this.isEditable = z;
    }

    public void setId(long j) {
        this.f81377id = Long.valueOf(j);
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public void setModificationDate(String str) {
        this.modificationDate = str;
    }

    public void setRemoveImage(boolean z) {
        this.removeImage = z;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }

    public void setTemplateDebtEvent(TemplateDebtEvent templateDebtEvent2) {
        this.templateDebtEvent = templateDebtEvent2;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTemplateImage(String str) {
        this.templateImage = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTemplateOrder(Integer num) {
        this.templateOrder = num;
    }

    public void setTemplateParameters(List<TemplateBasketParameter> list) {
        this.templateParameters = list;
    }

    public void setTemplateType(String str) {
        this.templateType = str;
    }

    public void setUserPaying(boolean z) {
        this.isUserPaying = z;
    }

    public TemplateBasketItem(KeyValue[] keyValueArr, PaymentProviderConfiguration paymentProviderConfiguration, boolean z, boolean z2, boolean z3) {
        if (paymentProviderConfiguration != null) {
            setServiceId(paymentProviderConfiguration.getServiceId());
            setLogo(paymentProviderConfiguration.getLogo());
            setChannel(BogUrlHelper.CHANNEL_MOBILE_EXT);
            setTemplateType("C");
            this.templateParameters = new ArrayList();
            this.isUserPaying = z2;
            this.isCTParkItem = true;
            this.canGetDebt = true;
            if (z3) {
                long j = tempIdl;
                tempIdl = 1 + j;
                setId(j);
            }
            this.isCTPark1Week = z;
            for (KeyValue keyValue : keyValueArr) {
                TemplateBasketParameter templateBasketParameter = new TemplateBasketParameter();
                templateBasketParameter.setParameterKey(keyValue.getKey());
                templateBasketParameter.setParameterValue(keyValue.getValue());
                templateBasketParameter.setParameterType(PensionStatusResult.STATUS_ACTIVE);
                this.templateParameters.add(templateBasketParameter);
            }
            setTemplateDebtEvent(new TemplateDebtEvent());
            getTemplateDebtEvent().setState(20);
            getTemplateDebtEvent().setPaymentDebt(new PaymentDebtResponse());
            getTemplateDebtEvent().getPaymentDebt().setParameter(keyValueArr);
            if (paymentProviderConfiguration.getServiceConfigJson() != null) {
                this.templateName = getParameterValue(paymentProviderConfiguration.getServiceConfigJson().getParameterIdByParamType("M"), 0);
            }
            if (getParameterValue("templateId", 0) != null) {
                setId(Long.parseLong(getParameterValue("templateId", 0)));
            }
        }
    }

    public String getTemplateImage() {
        return getTemplateImage(false);
    }

    public String getParameterValue(String str) {
        if (getTemplateParameters() == null) {
            return null;
        }
        for (TemplateBasketParameter next : getTemplateParameters()) {
            if (next.getParameterKey() != null && next.getParameterKey().equals(str)) {
                return next.getParameterValue();
            }
        }
        return null;
    }
}
