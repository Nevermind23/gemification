package sy0;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import java.util.HashMap;
import od0.C26941b;
import qd0.C27774a;

/* renamed from: sy0.b */
public interface C38606b extends C26941b, C27774a {
    C40734b activateClientChannel(long j, long j2);

    C40734b changeAccountName(long j, String str);

    C40734b changeCardName(long j, String str);

    C40734b changeProductDefault(String str, String str2, String str3);

    C40734b changeProductVisibility(String str, String str2, String str3);

    C40762x checkChildMBankActive(long j);

    C40734b confirmClientDocument(String str, String str2, String str3, String str4, String str5);

    C40762x createClientUser(long j);

    C40762x deactivateAccount(long j);

    C40762x getAccountReportId(long j, long j2, long j3);

    C40749p getAccountsAndDetails(boolean z);

    C40749p getAgreementsAndDetails(boolean z);

    C40762x getCardBlockStatus(long j);

    C40762x getCardExtraDetails(HashMap hashMap);

    C40749p getCardsAndDetails(boolean z);

    C40749p getClosableAccounts(boolean z);

    C40762x getCommonProductTypes();

    C40762x getContract(String str);

    C40762x getContract(String str, long j);

    C40749p getCreditCardAccountsAndDetails(boolean z);

    C40762x getExtServiceStatus(String str);

    C40749p getGTDetails(boolean z);

    C40749p getLegacyCreditCardAccountsAndDetails(boolean z);

    C40749p getLegacyDepositsAndBondsWithDetails(boolean z);

    C40749p getLegacyLoansWithDetails(boolean z);

    C40749p getLegacyPensionAmount(boolean z);

    C40762x getLiabilitiesOverdueDetails();

    C40749p getLoansWithDetails(boolean z);

    C40762x getPensionAmount();

    C40762x getPensionStatus();

    C40749p getProductTypes(boolean z);

    C40762x getStatements(long j, int i, int i2, long j2, long j3);

    void hideCardsInsuranceBanner(long j);

    boolean isCardsInsuranceBannerHidden(long j);

    void refreshAccountsAndDetails();

    void refreshAgreementDetails();

    void refreshCardsAndDetails();

    void refreshDepositsAndBonds();

    void refreshLoansWithDetails();

    void refreshProductTypes();

    C40734b sendClientContractConfirmation(String str, String str2, long j);

    C40734b sendPensionAccess(boolean z);

    C40734b toggleCardBlock(HashMap hashMap);

    C40734b useScaForAction(HashMap hashMap);

    C40762x validateAccountBeforeDeactivation(long j);

    C40734b validateClientConfirmation(String str, String str2, long j, String str3);
}
