package p964zq;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ContractEntity;
import p871qu.C27865a;

/* renamed from: zq.a */
public final class C30393a {
    /* renamed from: a */
    public final C27865a mo70745a(ContractEntity contractEntity) {
        C41536l.m120489i(contractEntity, "entity");
        return new C27865a(contractEntity.getContractText(), contractEntity.getContractTypeId(), contractEntity.getLanguageCode(), contractEntity.getInpSysdate(), contractEntity.getContractTypeId(), contractEntity.getTemplateVersionId());
    }
}
