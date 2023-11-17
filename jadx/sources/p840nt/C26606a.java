package p840nt;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.referals.entity.ReferalEntity;
import p893sw.C28278a;
import p893sw.C28279b;

/* renamed from: nt.a */
public final class C26606a {
    /* renamed from: a */
    public final C28278a mo65858a(ReferalEntity referalEntity) {
        String str;
        C41536l.m120489i(referalEntity, "referalInfoEntity");
        Boolean isActiveClient = referalEntity.isActiveClient();
        Boolean isReferralProgramActive = referalEntity.isReferralProgramActive();
        String myActivatedPromoCode = referalEntity.getMyActivatedPromoCode();
        if (C41536l.m120484d(referalEntity.isActiveClient(), Boolean.TRUE) || referalEntity.getMyActivatedPromoCode() != null) {
            str = referalEntity.getBannerTextForActiveClient();
        } else {
            str = referalEntity.getBannerTextForPassiveClient();
        }
        return new C28278a(isActiveClient, isReferralProgramActive, myActivatedPromoCode, str);
    }

    /* renamed from: b */
    public final C28279b mo65859b(ReferalEntity referalEntity) {
        C41536l.m120489i(referalEntity, "referalInfoEntity");
        return new C28279b(referalEntity.isReferralProgramActive(), referalEntity.isActiveClient(), referalEntity.getBonusAmountForReferring(), referalEntity.getBonusCCYForReferring(), referalEntity.getEarnedPrizeCCYForReferring(), referalEntity.getNumberOfReferredClientsActivated(), referalEntity.getMyActivatedPromoCode(), referalEntity.getBonusAmountForActivation(), referalEntity.getBonusCCYForActivation(), referalEntity.getEarnedPrizeAmountForReferring(), referalEntity.getMyPromoCodeToRefer(), referalEntity.getPromoPageTextForActivation(), referalEntity.getPromoPageTextForReferring(), referalEntity.getPromoPageTextForActivationAfterFillingCode());
    }
}
