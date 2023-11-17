package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.ContractApiModel */
public final class ContractApiModel {
    private final String contractText;
    private final String contractTypeId;

    /* renamed from: id */
    private final String f82305id;
    private final String inpSysdate;
    private final String languageCode;
    private final String templateVersionId;

    public ContractApiModel(String str, String str2, String str3, String str4, String str5, String str6) {
        this.contractText = str;
        this.f82305id = str2;
        this.languageCode = str3;
        this.inpSysdate = str4;
        this.contractTypeId = str5;
        this.templateVersionId = str6;
    }

    public final String getContractText() {
        return this.contractText;
    }

    public final String getContractTypeId() {
        return this.contractTypeId;
    }

    public final String getId() {
        return this.f82305id;
    }

    public final String getInpSysdate() {
        return this.inpSysdate;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getTemplateVersionId() {
        return this.templateVersionId;
    }
}
