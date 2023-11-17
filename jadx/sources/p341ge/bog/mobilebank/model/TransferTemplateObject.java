package p341ge.bog.mobilebank.model;

import java.util.ArrayList;
import org.parceler.Parcel;
import p277ua.C8662a;
import p341ge.bog.mobilebank.model.template.TemplateBasketParameter;

@Parcel
/* renamed from: ge.bog.mobilebank.model.TransferTemplateObject */
public class TransferTemplateObject {
    @C8662a
    String amount;
    @C8662a

    /* renamed from: id */
    Long f81294id;
    @C8662a
    String operationKey;
    @C8662a
    String templateName;
    @C8662a
    ArrayList<TemplateBasketParameter> templateParameters;
    @C8662a
    String templateType;

    public TransferTemplateObject() {
    }

    public void addTemplateParam(String str, String str2, long j) {
        if (this.templateParameters == null) {
            this.templateParameters = new ArrayList<>();
        }
        TemplateBasketParameter templateBasketParameter = new TemplateBasketParameter();
        templateBasketParameter.setParameterIndex(0);
        templateBasketParameter.setParameterType("M");
        templateBasketParameter.setParameterKey(str);
        templateBasketParameter.setParameterValue(str2);
        if (j > -1) {
            templateBasketParameter.setId(Long.valueOf(j));
        }
        this.templateParameters.add(templateBasketParameter);
    }

    public String getAmount() {
        return this.amount;
    }

    public Long getId() {
        return this.f81294id;
    }

    public String getOperationKey() {
        return this.operationKey;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public ArrayList<TemplateBasketParameter> getTemplateParameters() {
        return this.templateParameters;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setId(Long l) {
        this.f81294id = l;
    }

    public void setOperationKey(String str) {
        this.operationKey = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTemplateType(String str) {
        this.templateType = str;
    }

    public TransferTemplateObject(ArrayList<TemplateBasketParameter> arrayList, String str, String str2, String str3) {
        this.templateParameters = arrayList;
        this.templateName = str;
        this.amount = str2;
        this.templateType = str3;
    }
}
