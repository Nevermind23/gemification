package p341ge.bog.mobilebank.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.PaymentDataObject */
public class PaymentDataObject {
    String amount;
    String commission;
    ArrayList<KeyValue> parameters;
    String processStatus;
    String serviceId;
    String templateId;
    String templateName;

    public PaymentDataObject() {
    }

    public PaymentDataObject copy() {
        return new PaymentDataObject(this.serviceId, this.amount, this.commission, this.processStatus, this.templateName, this.templateId, this.parameters);
    }

    public String getAmount() {
        if (!TextUtils.isEmpty(this.amount)) {
            return this.amount;
        }
        Iterator<KeyValue> it = this.parameters.iterator();
        while (it.hasNext()) {
            KeyValue next = it.next();
            if (next.getKey().equals("amount")) {
                return next.getValue();
            }
        }
        return null;
    }

    public String getAmountFromKeyValues() {
        Iterator<KeyValue> it = this.parameters.iterator();
        String str = null;
        while (it.hasNext()) {
            KeyValue next = it.next();
            if (next.getKey().equals("amount")) {
                str = next.getValue();
            }
        }
        return str;
    }

    public String getCommission() {
        return this.commission;
    }

    public String getCommissionFromKeyValues() {
        Iterator<KeyValue> it = this.parameters.iterator();
        String str = null;
        while (it.hasNext()) {
            KeyValue next = it.next();
            if (next.getKey().equals("commission")) {
                str = next.getValue();
            }
        }
        return str;
    }

    public PaymentExecuteEssObject getInternalExecutor() {
        return new PaymentExecuteEssObject(this.serviceId, this.templateName, this.templateId, this.processStatus, this.parameters);
    }

    public ArrayList<KeyValue> getParameters() {
        return this.parameters;
    }

    public String getProcessStatus() {
        return this.processStatus;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setCommission(String str) {
        this.commission = str;
    }

    public void setCommissionForKeyValues(String str) {
        Iterator<KeyValue> it = this.parameters.iterator();
        while (it.hasNext()) {
            KeyValue next = it.next();
            if (next.getKey().equals("commission")) {
                next.setValue(str);
            }
        }
    }

    public void setParameters(ArrayList<KeyValue> arrayList) {
        this.parameters = arrayList;
    }

    public void setProcessStatus(String str) {
        this.processStatus = str;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public PaymentDataObject(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<KeyValue> arrayList) {
        this.serviceId = str;
        this.amount = str2;
        this.commission = str3;
        this.processStatus = str4;
        this.templateName = str5;
        this.parameters = arrayList;
        this.templateId = str6;
    }
}
