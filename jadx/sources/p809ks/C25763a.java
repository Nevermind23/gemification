package p809ks;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.creditinfo.entity.CreditInfoContractEntity;
import p710av.C19278a;

/* renamed from: ks.a */
public final class C25763a {
    /* renamed from: a */
    public final C19278a mo64346a(CreditInfoContractEntity creditInfoContractEntity) {
        C41536l.m120489i(creditInfoContractEntity, "entity");
        return new C19278a(creditInfoContractEntity.getId(), creditInfoContractEntity.getContractTypeId(), creditInfoContractEntity.getContractText(), creditInfoContractEntity.getLanguageCode(), creditInfoContractEntity.getInpSysdate(), creditInfoContractEntity.getTemplateVersionId());
    }
}
