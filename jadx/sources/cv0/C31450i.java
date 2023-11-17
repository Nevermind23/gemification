package cv0;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.openbanking.data.model.BankApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.ConsentApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.OpenBankProductApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.TransactionsResultApiModel;

/* renamed from: cv0.i */
public interface C31450i {
    @C40458f(".?serviceId=OPENBANKING_CREATE_CONSENT")
    /* renamed from: S */
    C40762x<ConsentApiModel> mo71800S(@C40472t("aspspId") String str);

    @C40458f(".?serviceId=OPENBANKING_GET_ACCOUNT_TRANSACTIONS")
    /* renamed from: T */
    C40762x<TransactionsResultApiModel> mo71801T(@C40472t("consentId") String str, @C40472t("aspspId") String str2, @C40472t("accountId") String str3, @C40472t("page") int i);

    @C40458f(".?serviceId=OPENBANKING_DELETE_CONSENT")
    /* renamed from: U */
    C40734b mo71802U(@C40472t("aspspId") String str, @C40472t("consentId") String str2);

    @C40458f(".?serviceId=OPENBANKING_GET_FIN_ENTITIES")
    /* renamed from: V */
    C40762x<List<BankApiModel>> mo71803V();

    @C40458f(".?serviceId=OPENBANKING_GET_ACCOUNTS_AND_DETAILS")
    /* renamed from: W */
    C40762x<List<OpenBankProductApiModel>> mo71804W();
}
