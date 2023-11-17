package p341ge.bog.mobilebank.products.data;

import ci1.C40455c;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.model.DepositBondsContainer;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.products.data.model.AccountReportIdApiModel;
import p341ge.bog.mobilebank.products.data.model.AccountsAndDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.BondsWrapperApiModel;
import p341ge.bog.mobilebank.products.data.model.CardBlockStatusApiModel;
import p341ge.bog.mobilebank.products.data.model.CardExtraDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.CardsAndDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.CheckChildMBankActiveApiModel;
import p341ge.bog.mobilebank.products.data.model.ClosableAccountEntity;
import p341ge.bog.mobilebank.products.data.model.ContractApiModel;
import p341ge.bog.mobilebank.products.data.model.CreateClientUserApiModel;
import p341ge.bog.mobilebank.products.data.model.DeactivationAccountEntity;
import p341ge.bog.mobilebank.products.data.model.DepositBondsContainerApiModel;
import p341ge.bog.mobilebank.products.data.model.DepositsWrapperApiModel;
import p341ge.bog.mobilebank.products.data.model.ExtServiceStatusApiModel;
import p341ge.bog.mobilebank.products.data.model.LiabilityOverdueInfoApiModel;
import p341ge.bog.mobilebank.products.data.model.PensionStatusApiModel;
import p341ge.bog.mobilebank.products.data.model.PortfolioOverviewApiModel;
import p341ge.bog.mobilebank.products.data.model.ProductTypeApiModel;
import p341ge.bog.mobilebank.products.data.model.StatementsWrapperApiModel;
import p341ge.bog.mobilebank.products.data.model.addproduct.CommonGetProductTypeApiModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.products.data.ProductsService */
public interface ProductsService {
    public static final String ACCOUNTS_CHANGE_ALL_NAMES_BY_MAIN_ACCT_KEY = "ACCOUNTS_CHANGE_ALL_NAMES_BY_MAIN_ACCT_KEY";
    public static final String ACCOUNTS_CHECK_ACCOUNT_FOR_CLOSE = "ACCOUNTS_CHECK_ACCOUNT_FOR_CLOSE";
    public static final String ACCOUNTS_CLOSE_ACCOUNT = "ACCOUNTS_CLOSE_ACCOUNT";
    public static final String ACCOUNTS_GET_ACCOUNTS_AND_DETAILS = "ACCOUNTS_GET_ACCOUNTS_AND_DETAILS";
    public static final String ACCOUNTS_GET_POTENTIAL_CLOSE_ACCOUNTS = "ACCOUNTS_GET_POTENTIAL_CLOSE_ACCOUNTS";
    public static final String ACCOUNTS_GET_REPORT_ID = "ACCOUNTS_GET_REPORT_ID";
    public static final String ACCOUNTS_GET_STATEMENT = "ACCOUNTS_GET_STATEMENT";
    public static final String CARDS_GET_CARDS_AND_DETAILS = "CARDS_GET_CARDS_AND_DETAILS";
    public static final String CARDS_GET_CREDITCARD_ACCOUNTS_AND_DETAILS = "CARDS_GET_CREDITCARD_ACCOUNTS_AND_DETAILS";
    public static final String CARDS_IS_CARD_BLOCKED = "CARDS_IS_CARD_BLOCKED";
    public static final String CARDS_REGISTER_INSURANCE = "CARDS_REGISTER_INSURANCE";
    public static final String CARDS_REMOVE_INSURANCE = "CARDS_REMOVE_INSURANCE";
    public static final String CARDS_SET_CARD_NAME = "CARDS_SET_CARD_NAME";
    public static final String CLIENTS_ACTIVATE_CHANNEL = "CLIENTS_ACTIVATE_CHANNEL";
    public static final String CLIENTS_CHILD_MBANK_CHECK_ACTIVE_USER = "CLIENTS_CHILD_MBANK_CHECK_ACTIVE_USER";
    public static final String CLIENTS_CREATE_USER = "CLIENTS_CREATE_USER";
    public static final String CLIENTS_DOCUMENT_CONFIRMATION_V2 = "CLIENTS_DOCUMENT_CONFIRMATION_V2";
    public static final String CLIENTS_GET_PRODUCT_TYPES = "CLIENTS_GET_PRODUCT_TYPES";
    public static final String CLIENTS_SEND_CLIENT_CONTACT_CONFIRMATION = "CLIENTS_SEND_CLIENT_CONTACT_CONFIRMATION";
    public static final String CLIENTS_VALIDATE_CLIENT_CONTACT_CONFIRMATION = "CLIENTS_VALIDATE_CLIENT_CONTACT_CONFIRMATION";
    public static final String COLLECTOR_GET_DEPOSITS_AND_BONDS_DETAILS = "COLLECTOR_GET_DEPOSITS_AND_BONDS_DETAILS";
    public static final String COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT = "COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT";
    public static final String COMMON_CHANGE_CLIENT_PRODUCT_HIDE = "COMMON_CHANGE_CLIENT_PRODUCT_HIDE";
    public static final String COMMON_GET_CONTRACT = "COMMON_GET_CONTRACT";
    public static final String COMMON_GET_EXT_SERVICE_STATUS = "COMMON_GET_EXT_SERVICE_STATUS";
    public static final String COMMON_GET_PRODUCT_TYPES = "COMMON_GET_PRODUCT_TYPES";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String DEPOSITS_GET_DEPOSITS_WITH_DETAILS = "DEPOSITS_GET_DEPOSITS_WITH_DETAILS";
    public static final String GT_GET_AGREEMENTS_AND_DETAILS = "GT_GET_AGREEMENTS_AND_DETAILS";
    public static final String GT_GET_CLIENT_PORTFOLIO_OVERVIEW_INFO = "GT_GET_CLIENT_PORTFOLIO_OVERVIEW_INFO";
    public static final String LOANS_GET_COLL_OVERDUE_DETAILS = "LOANS_GET_COLL_OVERDUE_DETAILS";
    public static final String LOANS_GET_LOANS_WITH_DETAILS = "LOANS_GET_LOANS_WITH_DETAILS";
    public static final String PENSION_GET_ACCESS_STATUS = "PENSION_GET_ACCESS_STATUS";
    public static final String PENSION_GET_TOTAL_AMOUNT = "PENSION_GET_TOTAL_AMOUNT";
    public static final String PENSION_SEND_DATA_ACCESS_APPROVE = "PENSION_SEND_DATA_ACCESS_APPROVE";

    /* renamed from: ge.bog.mobilebank.products.data.ProductsService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ACCOUNTS_CHANGE_ALL_NAMES_BY_MAIN_ACCT_KEY = "ACCOUNTS_CHANGE_ALL_NAMES_BY_MAIN_ACCT_KEY";
        public static final String ACCOUNTS_CHECK_ACCOUNT_FOR_CLOSE = "ACCOUNTS_CHECK_ACCOUNT_FOR_CLOSE";
        public static final String ACCOUNTS_CLOSE_ACCOUNT = "ACCOUNTS_CLOSE_ACCOUNT";
        public static final String ACCOUNTS_GET_ACCOUNTS_AND_DETAILS = "ACCOUNTS_GET_ACCOUNTS_AND_DETAILS";
        public static final String ACCOUNTS_GET_POTENTIAL_CLOSE_ACCOUNTS = "ACCOUNTS_GET_POTENTIAL_CLOSE_ACCOUNTS";
        public static final String ACCOUNTS_GET_REPORT_ID = "ACCOUNTS_GET_REPORT_ID";
        public static final String ACCOUNTS_GET_STATEMENT = "ACCOUNTS_GET_STATEMENT";
        public static final String CARDS_GET_CARDS_AND_DETAILS = "CARDS_GET_CARDS_AND_DETAILS";
        public static final String CARDS_GET_CREDITCARD_ACCOUNTS_AND_DETAILS = "CARDS_GET_CREDITCARD_ACCOUNTS_AND_DETAILS";
        public static final String CARDS_IS_CARD_BLOCKED = "CARDS_IS_CARD_BLOCKED";
        public static final String CARDS_REGISTER_INSURANCE = "CARDS_REGISTER_INSURANCE";
        public static final String CARDS_REMOVE_INSURANCE = "CARDS_REMOVE_INSURANCE";
        public static final String CARDS_SET_CARD_NAME = "CARDS_SET_CARD_NAME";
        public static final String CLIENTS_ACTIVATE_CHANNEL = "CLIENTS_ACTIVATE_CHANNEL";
        public static final String CLIENTS_CHILD_MBANK_CHECK_ACTIVE_USER = "CLIENTS_CHILD_MBANK_CHECK_ACTIVE_USER";
        public static final String CLIENTS_CREATE_USER = "CLIENTS_CREATE_USER";
        public static final String CLIENTS_DOCUMENT_CONFIRMATION_V2 = "CLIENTS_DOCUMENT_CONFIRMATION_V2";
        public static final String CLIENTS_GET_PRODUCT_TYPES = "CLIENTS_GET_PRODUCT_TYPES";
        public static final String CLIENTS_SEND_CLIENT_CONTACT_CONFIRMATION = "CLIENTS_SEND_CLIENT_CONTACT_CONFIRMATION";
        public static final String CLIENTS_VALIDATE_CLIENT_CONTACT_CONFIRMATION = "CLIENTS_VALIDATE_CLIENT_CONTACT_CONFIRMATION";
        public static final String COLLECTOR_GET_DEPOSITS_AND_BONDS_DETAILS = "COLLECTOR_GET_DEPOSITS_AND_BONDS_DETAILS";
        public static final String COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT = "COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT";
        public static final String COMMON_CHANGE_CLIENT_PRODUCT_HIDE = "COMMON_CHANGE_CLIENT_PRODUCT_HIDE";
        public static final String COMMON_GET_CONTRACT = "COMMON_GET_CONTRACT";
        public static final String COMMON_GET_EXT_SERVICE_STATUS = "COMMON_GET_EXT_SERVICE_STATUS";
        public static final String COMMON_GET_PRODUCT_TYPES = "COMMON_GET_PRODUCT_TYPES";
        public static final String DEPOSITS_GET_DEPOSITS_WITH_DETAILS = "DEPOSITS_GET_DEPOSITS_WITH_DETAILS";
        public static final String GT_GET_AGREEMENTS_AND_DETAILS = "GT_GET_AGREEMENTS_AND_DETAILS";
        public static final String GT_GET_CLIENT_PORTFOLIO_OVERVIEW_INFO = "GT_GET_CLIENT_PORTFOLIO_OVERVIEW_INFO";
        public static final String LOANS_GET_COLL_OVERDUE_DETAILS = "LOANS_GET_COLL_OVERDUE_DETAILS";
        public static final String LOANS_GET_LOANS_WITH_DETAILS = "LOANS_GET_LOANS_WITH_DETAILS";
        public static final String PENSION_GET_ACCESS_STATUS = "PENSION_GET_ACCESS_STATUS";
        public static final String PENSION_GET_TOTAL_AMOUNT = "PENSION_GET_TOTAL_AMOUNT";
        public static final String PENSION_SEND_DATA_ACCESS_APPROVE = "PENSION_SEND_DATA_ACCESS_APPROVE";

        private Companion() {
        }
    }

    /* renamed from: ge.bog.mobilebank.products.data.ProductsService$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ C40762x getStatements$default(ProductsService productsService, long j, long j2, int i, int i2, long j3, long j4, String str, int i3, Object obj) {
            String str2;
            if (obj == null) {
                if ((i3 & 64) != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                return productsService.getStatements(j, j2, i, i2, j3, j4, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStatements");
        }
    }

    @C40458f(".?serviceId=CLIENTS_ACTIVATE_CHANNEL")
    C40734b activateClientChannel(@C40472t("childClientKey") long j, @C40472t("cbsUser") long j2);

    @C40458f(".?serviceId=ACCOUNTS_CHANGE_ALL_NAMES_BY_MAIN_ACCT_KEY")
    C40734b changeAccountName(@C40472t("acctKey") long j, @C40472t("newName") String str);

    @C40458f(".?serviceId=CARDS_SET_CARD_NAME")
    C40734b changeCardName(@C40472t("cardId") long j, @C40472t("cardName") String str);

    @C40458f(".?serviceId=COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT")
    C40734b changeProductDefault(@C40472t("productGroup") String str, @C40472t("productKey") String str2, @C40472t("default") String str3);

    @C40458f(".?serviceId=COMMON_CHANGE_CLIENT_PRODUCT_HIDE")
    C40734b changeProductVisibility(@C40472t("productGroup") String str, @C40472t("productKey") String str2, @C40472t("hide") String str3);

    @C40458f(".?serviceId=CLIENTS_CHILD_MBANK_CHECK_ACTIVE_USER")
    C40762x<CheckChildMBankActiveApiModel> checkChildMBankActive(@C40472t("cardId") long j);

    @C40457e
    @C40467o(".?serviceId=CLIENTS_DOCUMENT_CONFIRMATION_V2")
    C40734b confirmClientDocument(@C40472t("serviceKey") String str, @C40455c("fileContent") String str2, @C40472t("productReference") String str3, @C40472t("serviceStatus") String str4, @C40472t("clientType") String str5);

    @C40458f(".?serviceId=CLIENTS_CREATE_USER")
    C40762x<CreateClientUserApiModel> createClientUser(@C40472t("childClientKey") long j);

    @C40458f(".?serviceId=ACCOUNTS_CLOSE_ACCOUNT")
    C40762x<DeactivationAccountEntity> deactivateAccount(@C40472t("customerId") long j, @C40472t("acctKey") long j2);

    @C40458f(".?serviceId=ACCOUNTS_GET_REPORT_ID")
    C40762x<BankApiResponse<AccountReportIdApiModel>> getAccountRepordId(@C40472t("acctKey") long j, @C40472t("startDate") long j2, @C40472t("endDate") long j3);

    @C40458f(".?serviceId=ACCOUNTS_GET_ACCOUNTS_AND_DETAILS")
    C40749p<AccountsAndDetailsApiModel> getAccountsAndDetails();

    @C40458f(".?serviceId=GT_GET_AGREEMENTS_AND_DETAILS")
    C40749p<BondsWrapperApiModel> getAgreementsAndDetails();

    @C40458f(".?serviceId=CARDS_IS_CARD_BLOCKED")
    C40762x<CardBlockStatusApiModel> getCardBlockStatus(@C40472t("cardId") long j);

    @C40458f(".")
    C40762x<BankApiResponse<CardExtraDetailsApiModel>> getCardExtraDetails(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=CARDS_GET_CARDS_AND_DETAILS")
    C40749p<CardsAndDetailsApiModel> getCardsAndDetails();

    @C40458f(".?serviceId=ACCOUNTS_GET_POTENTIAL_CLOSE_ACCOUNTS")
    C40749p<List<ClosableAccountEntity>> getClosableAccounts(@C40472t("customerId") long j);

    @C40458f(".?serviceId=COMMON_GET_CONTRACT")
    C40762x<ContractApiModel> getContract(@C40472t("contractType") String str);

    @C40458f(".?serviceId=COMMON_GET_CONTRACT")
    C40762x<ContractApiModel> getContract(@C40472t("contractType") String str, @C40472t("childClientKey") long j);

    @C40458f(".?serviceId=CARDS_GET_CREDITCARD_ACCOUNTS_AND_DETAILS")
    C40749p<CreditCardsWrapper> getCreditCardAccountsAndDetails();

    @C40458f(".?serviceId=COLLECTOR_GET_DEPOSITS_AND_BONDS_DETAILS")
    C40749p<DepositBondsContainerApiModel> getDepositsAndBondsWithDetails();

    @C40458f(".?serviceId=DEPOSITS_GET_DEPOSITS_WITH_DETAILS")
    C40762x<DepositsWrapperApiModel> getDepositsWithDetails();

    @C40458f(".?serviceId=COMMON_GET_EXT_SERVICE_STATUS")
    C40762x<ExtServiceStatusApiModel> getExtServiceStatus(@C40472t("serviceKey") String str);

    @C40458f(".?serviceId=COLLECTOR_GET_DEPOSITS_AND_BONDS_DETAILS")
    C40749p<DepositBondsContainer> getLegacyDepositsAndBondsWithDetails();

    @C40458f(".?serviceId=LOANS_GET_COLL_OVERDUE_DETAILS")
    C40762x<LiabilityOverdueInfoApiModel> getLiabilitiesOverdueDetails();

    @C40458f(".?serviceId=LOANS_GET_LOANS_WITH_DETAILS")
    C40749p<LoansWrapper> getLoansWithDetails();

    @C40458f(".?serviceId=PENSION_GET_TOTAL_AMOUNT")
    C40749p<PensionResult> getPensionAmount();

    @C40458f(".?serviceId=PENSION_GET_ACCESS_STATUS")
    C40762x<PensionStatusApiModel> getPensionStatus();

    @C40458f(".?serviceId=GT_GET_CLIENT_PORTFOLIO_OVERVIEW_INFO")
    C40749p<PortfolioOverviewApiModel> getPortfolioOverview();

    @C40458f("?serviceId=COMMON_GET_PRODUCT_TYPES")
    C40762x<List<CommonGetProductTypeApiModel>> getProductTypes();

    @C40458f(".?serviceId=CLIENTS_GET_PRODUCT_TYPES")
    C40749p<List<ProductTypeApiModel>> getProductTypesList();

    @C40458f(".?serviceId=ACCOUNTS_GET_STATEMENT")
    C40762x<BankApiResponse<StatementsWrapperApiModel>> getStatements(@C40472t("acctKey") long j, @C40472t("reportId") long j2, @C40472t("count") int i, @C40472t("from") int i2, @C40472t("startDate") long j3, @C40472t("endDate") long j4, @C40472t("searchWord") String str);

    @C40458f(".?serviceId=CLIENTS_SEND_CLIENT_CONTACT_CONFIRMATION")
    C40734b sendClientContractConfirmation(@C40472t("route") String str, @C40472t("contact") String str2, @C40472t("childClientKey") long j);

    @C40458f(".?serviceId=PENSION_SEND_DATA_ACCESS_APPROVE")
    C40734b sendPensionAccess(@C40472t("isGrant") int i);

    @C40458f(".")
    C40762x<BankApiResponse<HashMap<String, Object>>> useOtpForActionSingle(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".")
    C40734b useScaForAction(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=ACCOUNTS_CHECK_ACCOUNT_FOR_CLOSE")
    C40762x<DeactivationAccountEntity> validateAccountBeforeDeactivation(@C40472t("customerId") long j, @C40472t("acctKey") long j2);

    @C40458f(".?serviceId=CLIENTS_VALIDATE_CLIENT_CONTACT_CONFIRMATION")
    C40734b validateContractConfirmation(@C40472t("route") String str, @C40472t("contact") String str2, @C40472t("childClientKey") long j, @C40472t("confirmationCode") String str3);
}
