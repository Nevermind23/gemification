package p341ge.bog.mobilebank.products.data.mapper;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.model.ContractApiModel;
import xy0.C39945i;

/* renamed from: ge.bog.mobilebank.products.data.mapper.ContractApiModelMapper */
public final class ContractApiModelMapper {
    public final C39945i convert(ContractApiModel contractApiModel) {
        C41536l.m120489i(contractApiModel, "contractApiModel");
        return new C39945i(contractApiModel.getContractText(), contractApiModel.getId(), contractApiModel.getLanguageCode(), contractApiModel.getInpSysdate(), contractApiModel.getContractTypeId(), contractApiModel.getTemplateVersionId());
    }
}
