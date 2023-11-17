package p341ge.bog.mobilebank.model;

import java.util.ArrayList;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.PaymentExecuteEssObject */
public class PaymentExecuteEssObject {
    String codeStatus;
    String error;
    String errorDictionaryKey;
    ArrayList<KeyValue> essParameters;
    String essServiceId;
    String paymentCommission;
    String status;
    String templateId;
    String templateName;

    public PaymentExecuteEssObject() {
    }

    public String getCodeStatus() {
        return this.codeStatus;
    }

    public String getError() {
        return this.error;
    }

    public String getErrorDictionaryKey() {
        return this.errorDictionaryKey;
    }

    public ArrayList<KeyValue> getEssParameters() {
        return this.essParameters;
    }

    public String getEssServiceId() {
        return this.essServiceId;
    }

    public String getPaymentCommission() {
        return this.paymentCommission;
    }

    public PaymentDataObject getPaymentDataObject() {
        PaymentDataObject paymentDataObject = new PaymentDataObject();
        paymentDataObject.setParameters(this.essParameters);
        return paymentDataObject;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setCodeStatus(String str) {
        this.codeStatus = str;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setErrorDictionaryKey(String str) {
        this.errorDictionaryKey = str;
    }

    public void setEssParameters(ArrayList<KeyValue> arrayList) {
        this.essParameters = arrayList;
    }

    public void setEssServiceId(String str) {
        this.essServiceId = str;
    }

    public void setPaymentCommission(String str) {
        this.paymentCommission = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public PaymentExecuteEssObject(String str, String str2, String str3, String str4, ArrayList<KeyValue> arrayList) {
        this.essServiceId = str;
        this.templateName = str2;
        this.status = str4;
        this.essParameters = arrayList;
        this.templateId = str3;
    }
}
