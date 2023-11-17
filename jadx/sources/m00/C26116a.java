package m00;

import kotlin.jvm.internal.C41536l;
import ld0.C25950a;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;

/* renamed from: m00.a */
public final class C26116a {
    /* renamed from: a */
    public final C25950a mo65027a(PreContractEntity preContractEntity) {
        C41536l.m120489i(preContractEntity, "preContractEntity");
        return new C25950a(preContractEntity.getTemplateId(), preContractEntity.getContractType(), preContractEntity.getDictionaryKeyId(), preContractEntity.getChannelCode(), preContractEntity.getLanguageCode(), preContractEntity.getContractTemplate(), preContractEntity.getTemplateDesc());
    }
}
