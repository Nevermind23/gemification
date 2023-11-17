package p824lx;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.identityverification.data.entity.VerificationProcessDataEntity;
import p854ox.C27093a;

/* renamed from: lx.a */
public final class C26095a {
    /* renamed from: a */
    public final C27093a mo65013a(VerificationProcessDataEntity verificationProcessDataEntity) {
        C41536l.m120489i(verificationProcessDataEntity, "verificationProcessDataEntity");
        return new C27093a(verificationProcessDataEntity.getMerchantLogoId(), verificationProcessDataEntity.getMerchantName(), verificationProcessDataEntity.getIp(), verificationProcessDataEntity.getUserAgent(), verificationProcessDataEntity.getOs(), verificationProcessDataEntity.getCountry(), verificationProcessDataEntity.getServiceName(), verificationProcessDataEntity.getTerminalId());
    }
}
