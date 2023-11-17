package p919vp;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.application.data.entity.ApplicationEntity;
import p341ge.bog.mobilebank.cleanarch.application.data.entity.CreditAppLoanDetailsEntity;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.model.CardApplicationDetails;
import p341ge.bog.mobilebank.model.deposits.DepositAppDetails;

/* renamed from: vp.a */
public final class C29130a {
    /* renamed from: a */
    public final CreditAppLoanDetails mo68984a(CreditAppLoanDetailsEntity creditAppLoanDetailsEntity) {
        C41536l.m120489i(creditAppLoanDetailsEntity, "creditAppLoanDetailsEntity");
        return new CreditAppLoanDetails(creditAppLoanDetailsEntity.getLoanStatusKey(), creditAppLoanDetailsEntity.getResultCodeDictionaryKey(), creditAppLoanDetailsEntity.getAmount(), creditAppLoanDetailsEntity.getCurrency(), creditAppLoanDetailsEntity.getTerm(), creditAppLoanDetailsEntity.getCondition());
    }

    /* renamed from: b */
    public final Application mo68985b(ApplicationEntity applicationEntity) {
        CreditAppLoanDetails creditAppLoanDetails;
        C41536l.m120489i(applicationEntity, "applicationEntity");
        long appId = applicationEntity.getAppId();
        String valueOf = String.valueOf(applicationEntity.getAppType());
        String valueOf2 = String.valueOf(applicationEntity.getStatus());
        long resultCode = applicationEntity.getResultCode();
        long clientKey = applicationEntity.getClientKey();
        Long expDate = applicationEntity.getExpDate();
        String valueOf3 = String.valueOf(applicationEntity.getProdType());
        long createDate = applicationEntity.getCreateDate();
        String valueOf4 = String.valueOf(applicationEntity.getDictionaryKey());
        DepositAppDetails depositDetails = applicationEntity.getDepositDetails();
        CardApplicationDetails cardDetails = applicationEntity.getCardDetails();
        CreditAppLoanDetailsEntity loanDetails = applicationEntity.getLoanDetails();
        if (loanDetails != null) {
            creditAppLoanDetails = mo68984a(loanDetails);
        } else {
            creditAppLoanDetails = null;
        }
        return new Application(appId, valueOf, valueOf2, resultCode, clientKey, expDate, valueOf3, createDate, valueOf4, depositDetails, cardDetails, creditAppLoanDetails);
    }
}
