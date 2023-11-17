package je0;

import ci1.C40458f;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40762x;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsApiEntity;
import p341ge.bog.mobilebank.galtandtaggart.data.model.AccountConfirmFilesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.AccountStatementFilesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.BuySellDefaultAmountApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.CalculateTradeDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.CashDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.CheckGTClosableApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.GTMarketInfoApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.IdentomatStatusApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioClientApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioHistorySummeryApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.PortfolioOverviewApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ProductTypeApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.SearchSymbolResultApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolMetaDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolOnlineDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolOnlineMinimizedDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.SymbolHistoryDataContainerApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.TradeOrderResultApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListCreateResultApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.model.WatchListSymbolsDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.mail.model.AddEmailResponseApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.termsandconditions.model.DisclosureTypesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.OnboardingListOfValuesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.ReviewDataApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTTransactionHistoryApiModel;

/* renamed from: je0.w0 */
public interface C25429w0 {
    @C40458f(".?serviceId=GT_GET_WATCHLIST_SYMBOLS_DATA")
    /* renamed from: A0 */
    C40762x<WatchListSymbolsDataApiModel> mo63978A0(@C40472t("watchlistId") BigDecimal bigDecimal);

    @C40458f(".?serviceId=GT_GET_CLIENT_PORTFOLIO")
    /* renamed from: A1 */
    C40762x<PortfolioClientApiModel> mo63979A1();

    @C40458f(".?serviceId=GT_GET_SYMBOL_PRICE_HISTORY")
    /* renamed from: B0 */
    C40762x<SymbolHistoryDataContainerApiModel> mo63980B0(@C40472t("symbol") String str, @C40472t("startDate") String str2, @C40472t("endDate") String str3, @C40472t("days") Integer num, @C40472t("compression") int i);

    @C40458f(".?serviceId=GT_ONBOARDING_UPLOAD_DOCUMENT_DATA")
    /* renamed from: B1 */
    C40734b mo63981B1(@C40472t("token") String str);

    @C40458f(".?serviceId=GT_GET_ACCOUNT_STATEMENT_FILES")
    /* renamed from: C1 */
    C40762x<AccountStatementFilesApiModel> mo63982C1(@C40472t("from") long j, @C40472t("to") Long l, @C40472t("period") String str);

    @C40458f(".?serviceId=GT_GET_MARKET_INFO")
    /* renamed from: D1 */
    C40762x<GTMarketInfoApiModel> mo63983D1();

    @C40458f(".?serviceId=GT_ONBOARDING_SUBMIT_DATA ")
    /* renamed from: E */
    C40734b mo63984E();

    @C40458f(".?serviceId=GT_ONBOARDING_GET_REVIEW_DATA")
    /* renamed from: E1 */
    C40762x<ReviewDataApiModel> mo63985E1(@C40472t("acceptedDisclosureTypes") String str, @C40472t("status") String str2, @C40472t("company") String str3, @C40472t("type") String str4, @C40472t("position") String str5, @C40472t("broker") Integer num, @C40472t("directorOfName") String str6, @C40472t("directorOfSymbol") String str7, @C40472t("fundingSources") String str8, @C40472t("annualIncome") Integer num2, @C40472t("token") String str9);

    @C40458f(".")
    /* renamed from: F0 */
    C40734b mo63986F0(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=GT_GET_BUY_SELL_DEFAULT_AMOUNTS")
    /* renamed from: F1 */
    C40762x<List<BuySellDefaultAmountApiModel>> mo63987F1(@C40472t("operationType") String str);

    @C40458f(".?serviceId=GT_GET_SYMBOL_ONLINE_DATA_MINIMIZED")
    /* renamed from: G0 */
    C40762x<ShareSymbolOnlineMinimizedDataApiModel> mo63988G0(@C40472t("symbol") String str);

    @C40458f(".?serviceId=GT_TRADE_SECURITY_ORDER")
    /* renamed from: G1 */
    C40762x<TradeOrderResultApiModel> mo63989G1(@C40472t("orderType") String str, @C40472t("symbol") String str2, @C40472t("side") String str3, @C40472t("preventQueuing") int i, @C40472t("amountCash") Double d, @C40472t("ccy") String str4, @C40472t("quantity") Double d2, @C40472t("timeInForce") String str5, @C40472t("opUniqueId") int i2, @C40472t("UTMMedium") String str6, @C40472t("UTMSource") String str7, @C40472t("UTMCampaign") String str8);

    @C40458f(".?serviceId=GT_DELETE_WATCHLIST")
    /* renamed from: H */
    C40734b mo63990H(@C40472t("watchlistId") BigDecimal bigDecimal);

    @C40458f(".?serviceId=GT_CHECK_ACCOUNT_CLOSABLE")
    /* renamed from: H0 */
    C40762x<List<CheckGTClosableApiModel>> mo63991H0();

    @C40458f(".?serviceId=COMMON_GET_IDENTOMAT_SESSION_TOKEN")
    /* renamed from: H1 */
    C40762x<HashMap<String, String>> mo63992H1(@C40472t("documentTypeId") int i, @C40472t("documentTypePassport") int i2, @C40472t("documentTypeResidenceLicense") int i3);

    @C40458f(".?serviceId=GT_CREATE_WATCHLIST")
    /* renamed from: I */
    C40762x<WatchListCreateResultApiModel> mo63993I(@C40472t("name") String str);

    @C40458f(".?serviceId=GT_GET_ACCOUNT_CONFIRM_FILES")
    /* renamed from: I1 */
    C40762x<AccountConfirmFilesApiModel> mo63994I1(@C40472t("from") long j, @C40472t("to") Long l, @C40472t("period") String str);

    @C40458f(".?serviceId=GT_CALC_TRADE_DATA")
    /* renamed from: J */
    C40762x<CalculateTradeDataApiModel> mo63995J(@C40472t("symbol") String str, @C40472t("side") String str2, @C40472t("amount") Double d, @C40472t("ccy") String str3, @C40472t("quantity") Double d2, @C40472t("opUniqueId") int i);

    @C40458f(".?serviceId=GT_GET_COMBINED_STATEMENT")
    /* renamed from: J1 */
    C40762x<GTTransactionHistoryApiModel> mo63996J1(@C40472t("from") String str, @C40472t("to") String str2, @C40472t("lastOperations") Integer num);

    @C40458f(".?serviceId=GT_GET_SYMBOL_ONLINE_DATA")
    /* renamed from: K1 */
    C40762x<ShareSymbolOnlineDataApiModel> mo63997K1(@C40472t("symbol") String str);

    @C40458f(".?serviceId=GT_GET_CLIENT_PORTFOLIO_HISTORY")
    /* renamed from: L1 */
    C40762x<PortfolioHistorySummeryApiModel> mo63998L1(@C40472t("from") String str, @C40472t("to") String str2, @C40472t("period") String str3);

    @C40458f(".?serviceId=GT_ONBOARDING_GET_LOVS_AND_PREDEFINED_ANSWERS")
    /* renamed from: c */
    C40762x<OnboardingListOfValuesApiModel> mo63999c();

    @C40458f(".?serviceId=GT_GET_CLIENT_PORTFOLIO_OVERVIEW_INFO")
    C40762x<PortfolioOverviewApiModel> getPortfolioOverview();

    @C40458f(".?serviceId=CLIENTS_GET_PRODUCT_TYPES")
    C40762x<List<ProductTypeApiModel>> getProductTypesList();

    @C40458f(".?serviceId=GT_ONBOARDING_GET_DISCLOSURE_TYPES")
    /* renamed from: n */
    C40762x<DisclosureTypesApiModel> mo64002n();

    @C40458f(".?serviceId=GT_CANCEL_ORDER ")
    /* renamed from: s1 */
    C40734b mo64003s1(@C40472t("orderId") String str);

    @C40458f(".?serviceId=GT_ONBOARDING_ADD_EMAIL_REQUEST")
    /* renamed from: t1 */
    C40762x<AddEmailResponseApiModel> mo64004t1(@C40472t("mailAddress") String str);

    @C40458f(".?serviceId=GT_EDIT_WATCHLIST")
    /* renamed from: u1 */
    C40734b mo64005u1(@C40472t("name") String str, @C40472t("watchlistId") BigDecimal bigDecimal);

    @C40458f(".?serviceId=GT_CLOSE_ACCOUNT")
    /* renamed from: v0 */
    C40734b mo64006v0();

    @C40458f(".?serviceId=GT_SYMBOL_WATCHLISTS_CHANGE")
    /* renamed from: v1 */
    C40734b mo64007v1(@C40472t("removeWatchlistIds") String str, @C40472t("addedWatchlistIds") String str2, @C40472t("symbol") String str3);

    @C40458f(".?serviceId=GT_GET_WATCHLISTS")
    /* renamed from: w */
    C40762x<WatchListDataApiModel> mo64008w();

    @C40458f(".?serviceId=GT_GET_CLIENT_CASH_DATA")
    /* renamed from: w0 */
    C40762x<CashDataApiModel> mo64009w0();

    @C40458f(".?serviceId=GT_ONBOARDING_VALIDATE_EMAIL_AND_AGREE_ON_CONDITIONS")
    /* renamed from: w1 */
    C40734b mo64010w1(@C40472t("mailAddress") String str, @C40472t("oneTimePassword") String str2, @C40472t("acceptedDisclosureTypes") String str3, @C40472t("otpRequestId") String str4, @C40472t("UTMMedium") String str5, @C40472t("UTMSource") String str6, @C40472t("UTMCampaign") String str7);

    @C40458f(".?serviceId=GT_ONBOARDING_PRECHECK")
    /* renamed from: x0 */
    C40734b mo64011x0();

    @C40458f(".?serviceId=GT_GET_SYMBOL_METADATA")
    /* renamed from: x1 */
    C40762x<ShareSymbolMetaDataApiModel> mo64012x1(@C40472t("symbol") String str);

    @C40458f(".?serviceId=TRANSFERS_GET_ACCOUNTS_LOV_DETAILS_GALT")
    /* renamed from: y0 */
    C40762x<TransferAccountsApiEntity> mo64013y0();

    @C40458f(".?serviceId=GT_SEARCH_SYMBOL")
    /* renamed from: y1 */
    C40762x<SearchSymbolResultApiModel> mo64014y1(@C40472t("searchString") String str, @C40472t("offset") int i, @C40472t("limit") int i2);

    @C40458f(".?serviceId=GT_GET_KYC_INFO")
    /* renamed from: z0 */
    C40762x<IdentomatStatusApiModel> mo64015z0();

    @C40458f(".?serviceId=COMMON_GET_SERVICE_OPERATION_ID")
    /* renamed from: z1 */
    C40762x<String> mo64016z1(@C40472t("serviceKey") String str);
}
