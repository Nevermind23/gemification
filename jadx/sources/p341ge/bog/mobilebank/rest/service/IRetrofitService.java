package p341ge.bog.mobilebank.rest.service;

import ci1.C40455c;
import ci1.C40456d;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40464l;
import ci1.C40467o;
import ci1.C40469q;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40762x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import of1.C41939y;
import p341ge.bog.mobilebank.cleanarch.application.data.entity.ApplicationEntity;
import p341ge.bog.mobilebank.cleanarch.application.data.entity.ApplicationTypeEntity;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.LimitLoanDecisionEntity;
import p341ge.bog.mobilebank.cleanarch.contactus.data.model.SoloBankerInfoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.appsettings.entity.AppSettingApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentDataEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ContractEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ProductTypeApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ServiceStatusEntity;
import p341ge.bog.mobilebank.cleanarch.data.contact.entity.ContactAccountApiModel;
import p341ge.bog.mobilebank.cleanarch.data.contact.entity.ContactApiModel;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferDecisionEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditapplicationdetails.entity.CreditApplicationEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditinfo.entity.CreditInfoContractEntity;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.CampaignInfoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.loan.entity.RsApprovalEntity;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestApiModel;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.CreditOfferLimitEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.LoanOfferLimitEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.OfferInfoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.OfferProductApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.p764zk.entity.UmtsCardsApiModel;
import p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.AnalysisApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingExpensesEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingResponseEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.EditBudgetResponseEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity.CashFlowResponse;
import p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarResponse;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryAddResponse;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse;
import p341ge.bog.mobilebank.cleanarch.data.productconfirmation.entity.PendingProductConfirmationEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AmexOfferInfoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardBlockStatusApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardExtraDetailsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardsAndDetailsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.ClientCurrencyApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.referals.entity.ReferalEntity;
import p341ge.bog.mobilebank.cleanarch.data.savinggoal.entity.DepositPurposeResponse;
import p341ge.bog.mobilebank.cleanarch.data.servicecenter.entity.ServiceCenterEntity;
import p341ge.bog.mobilebank.cleanarch.data.smstopush.entitiy.SmsNotificationEntity;
import p341ge.bog.mobilebank.cleanarch.data.studentcard.StudentCardStatusApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountItemApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsAndCurrenciesApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsApiEntity;
import p341ge.bog.mobilebank.cleanarch.identityverification.data.entity.VerificationProcessDataEntity;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusWrapperEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.CasHistoryItemEntity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferApiEntity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferCommissionApiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferTypeApiEntity;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.data.entity.NewLoanAllowedEntity;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.cleanarch.productdescription.data.enitity.ProductDescriptionTextEntity;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.data.entity.MccStateEntity;
import p341ge.bog.mobilebank.cleanarch.qrscanner.data.entity.QrMerchantInfoEntity;
import p341ge.bog.mobilebank.model.AttachmentTypeConst;
import p341ge.bog.mobilebank.model.Beneficiary;
import p341ge.bog.mobilebank.model.BogCountry;
import p341ge.bog.mobilebank.model.BondsWrapper;
import p341ge.bog.mobilebank.model.CashBackStatementWrapper;
import p341ge.bog.mobilebank.model.CcyHistoryWrapper;
import p341ge.bog.mobilebank.model.CcyRatesWrapper;
import p341ge.bog.mobilebank.model.ConvertCurrencyResult;
import p341ge.bog.mobilebank.model.DepLoanAgreement;
import p341ge.bog.mobilebank.model.DepLoanCalculation;
import p341ge.bog.mobilebank.model.DispatchType;
import p341ge.bog.mobilebank.model.FeatureFeedback;
import p341ge.bog.mobilebank.model.FileAttachmentInfo;
import p341ge.bog.mobilebank.model.InTransferDetail;
import p341ge.bog.mobilebank.model.InsuranceType;
import p341ge.bog.mobilebank.model.Merchant;
import p341ge.bog.mobilebank.model.OperationPfmDetails;
import p341ge.bog.mobilebank.model.PaymentVoucher;
import p341ge.bog.mobilebank.model.PensionAccessResult;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.RateWeight;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.TransferNomination;
import p341ge.bog.mobilebank.model.TransferResult;
import p341ge.bog.mobilebank.model.account.AccountDebitLoveWrapper;
import p341ge.bog.mobilebank.model.account.AccountLovContainer;
import p341ge.bog.mobilebank.model.account.AccountOwnerInfoWrapper;
import p341ge.bog.mobilebank.model.account.OperationResponse;
import p341ge.bog.mobilebank.model.account.TransferRate;
import p341ge.bog.mobilebank.model.account.TreasureCodeInfo;
import p341ge.bog.mobilebank.model.bonus.BonusPrize;
import p341ge.bog.mobilebank.model.bonus.BonusPrizeList;
import p341ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper;
import p341ge.bog.mobilebank.model.bonus.ScoolCardStatementItem;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentAccount;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBankList;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;
import p341ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode;
import p341ge.bog.mobilebank.model.loans.history.LoanHistoryWrapper;
import p341ge.bog.mobilebank.model.loans.schedule.LoanScheduleWrapper;
import p341ge.bog.mobilebank.model.map.MapObject;
import p341ge.bog.mobilebank.model.map.MapObjectDetail;
import p341ge.bog.mobilebank.model.map.MapRegion;
import p341ge.bog.mobilebank.model.notification.NotificationCount;
import p341ge.bog.mobilebank.model.notification.NotificationList;
import p341ge.bog.mobilebank.model.notification.PushHistoryObject;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;
import p341ge.bog.mobilebank.model.passwordrules.PasswordRules;
import p341ge.bog.mobilebank.model.payment.BonusProvider;
import p341ge.bog.mobilebank.model.payment.LastOperation;
import p341ge.bog.mobilebank.model.payment.PaymentCommissionEntity;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentDetail;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentResult;
import p341ge.bog.mobilebank.model.payment.SelectedPayment;
import p341ge.bog.mobilebank.model.qrpay.QrPaymentResult;
import p341ge.bog.mobilebank.model.qrpay.ReversalOtpResult;
import p341ge.bog.mobilebank.model.search.SearchDataWrapper;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.model.statement.AccountReportId;
import p341ge.bog.mobilebank.model.statement.AccountStatementWrapper;
import p341ge.bog.mobilebank.model.statement.CasStatementWrapper;
import p341ge.bog.mobilebank.model.template.CarCTParkResponse;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import zh1.C43443b;

/* renamed from: ge.bog.mobilebank.rest.service.IRetrofitService */
public interface IRetrofitService {
    public static final String SERVICE_ID = "serviceId";
    public static final String TERMINAL = "terminal";

    @C40458f(".")
    C40762x<BankApiResponse<ContactAccountApiModel>> addAccountToContact(@C40472t("serviceId") String str, @C40472t("id") long j, @C40472t("acctNo") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<TransactionCategoryAddResponse>> addTransactionCategory(@C40472t("serviceId") String str, @C40472t("name") String str2, @C40472t("parentCatId") Long l);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<Integer>> attachFile(@C40472t("serviceId") String str, @C40455c("attachmentBase64") String str2, @C40472t("attachmentName") String str3, @C40472t("attachmentExtension") String str4, @C40472t("attachmentType") AttachmentTypeConst attachmentTypeConst);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> bannerClicked(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> buyTCCWithPoints(@C40472t("serviceId") String str, @C40472t("md5") String str2, @C40472t("amount") String str3, @C40472t("bonusType") String str4, @C40472t("productType") String str5);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> changeAccountVisibility(@C40472t("serviceId") String str, @C40472t("productGroup") String str2, @C40472t("productKey") String str3, @C40472t("hide") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> changeAcctName(@C40472t("serviceId") String str, @C40472t("acctKey") long j, @C40472t("newName") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> changeAcctNameSingle(@C40472t("serviceId") String str, @C40472t("acctKey") long j, @C40472t("newName") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> changeCardName(@C40472t("serviceId") String str, @C40472t("cardId") long j, @C40472t("cardName") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> changeClientProductDefault(@C40472t("serviceId") String str, @C40472t("productGroup") String str2, @C40472t("productKey") String str3, @C40472t("default") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> changeDeviceLanguage(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> changeProductDefaultState(@C40472t("serviceId") String str, @C40472t("productGroup") String str2, @C40472t("productKey") String str3, @C40472t("default") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> changeTransactionComputability(@C40472t("serviceId") String str, @C40472t("id") Long l, @C40472t("catId") Long l2, @C40472t("computable") int i, @C40472t("operationDate") Long l3);

    @C40458f(".")
    C43443b<BankApiResponse<String>> checkCadastralCode(@C40472t("serviceId") String str, @C40472t("cadastreCode") String str2);

    @C40457e
    @C40467o(".?terminal=123")
    C40762x<BankApiResponse<CreditOfferDecisionEntity>> checkCreditCardOfferDecision(@C40472t("serviceId") String str, @C40472t("operationType") String str2, @C40472t("decNo") String str3, @C40472t("decisionScheme") String str4, @C40472t("cardLimit") String str5, @C40455c("refinanceInfo") String str6, @C40472t("templCode") String str7);

    @C40458f(".")
    C43443b<BankApiResponse<DepLoanCalculation>> checkDepLoanCalculation(@C40472t("serviceId") String str, @C40472t("agreeKey") long j, @C40472t("amount") String str2, @C40472t("ccy") String str3, @C40472t("cardPan") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<Boolean>> checkIsBOGCard(@C40472t("serviceId") String str, @C40472t("cardNumber") String str2);

    @C40457e
    @C40467o(".")
    C40762x<BankApiResponse<LimitLoanDecisionEntity>> checkLimitLoanDecision(@C40472t("serviceId") String str, @C40472t("decNo") long j, @C40472t("decisionScheme") String str2, @C40472t("cardPan") String str3, @C40472t("operationType") String str4, @C40472t("loanCcy") String str5, @C40472t("loanTerm") String str6, @C40472t("payDay") String str7, @C40472t("insIncFlag") String str8, @C40455c("refinanceInfo") String str9, @C40472t("loanAmount") double d, @C40472t("keepAmount") Double d2, @C40472t("providerId") String str10, @C40472t("terminal") String str11);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<LimitLoanDecisionEntity>> checkLimitLoanDecision(@C40472t("serviceId") String str, @C40472t("decNo") long j, @C40472t("decisionScheme") String str2, @C40472t("cardPan") String str3, @C40472t("operationType") String str4, @C40472t("loanCcy") String str5, @C40472t("loanTerm") String str6, @C40472t("payDay") String str7, @C40472t("insIncFlag") String str8, @C40455c("refinanceInfo") String str9, @C40472t("loanAmount") BigDecimal bigDecimal, @C40472t("keepAmount") BigDecimal bigDecimal2, @C40472t("terminal") String str10);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> completeMoneyRequest(@C40472t("serviceId") String str, @C40472t("requestId") long j, @C40472t("status") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> confirmPendingProduct(@C40472t("serviceId") String str, @C40472t("responseDetId") Long l, @C40472t("responseKey") String str2, @C40472t("oneTimePassword") String str3, @C40472t("otpServiceId") String str4);

    @C40458f(".?requestDirection=LENDER")
    C40762x<BankApiResponse<MoneyRequestApiModel>> confirmReceivingMoney(@C40472t("serviceId") String str, @C40472t("requestId") long j, @C40472t("participantId") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<ConvertCurrencyResult>> convertCcy(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("ccyFrom") String str3, @C40472t("ccyTo") String str4, @C40472t("amountFrom") String str5, @C40472t("amountTo") String str6);

    @C40467o(".")
    C40762x<BankApiResponse<EditBudgetResponseEntity>> createAndUpdateBudget(@C40472t("serviceId") String str, @C40472t("updatedBudgets") String str2, @C40472t("createdBudgets") String str3);

    @C40457e
    @C40467o(".")
    C40762x<BankApiResponse<String>> createMoneyRequest(@C40472t("serviceId") String str, @C40455c("requestType") String str2, @C40455c("requestDescription") String str3, @C40455c("acctNo") String str4, @C40455c("acctKey") Long l, @C40455c("amount") Double d, @C40455c("participants") String str5, @C40455c("operationsToSplit") String str6, @C40455c("additionalOperations") String str7);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> createSavingGoal(@C40472t("serviceId") String str, @C40472t("name") String str2, @C40472t("amount") BigDecimal bigDecimal, @C40472t("startingAmount") BigDecimal bigDecimal2, @C40472t("startDate") String str3, @C40472t("endDate") String str4, @C40472t("sgcId") Long l, @C40472t("accountId") Long l2, @C40472t("agreeKey") Long l3);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> creditInfoRegisterUser(@C40472t("serviceId") String str, @C40472t("customerId") Long l, @C40472t("mailAddress") String str2);

    @C40458f(".?requestDirection=BORROWER")
    C40762x<BankApiResponse<Object>> declineRequest(@C40472t("serviceId") String str, @C40472t("requestId") long j);

    @C40467o(".")
    C40762x<BankApiResponse<Object>> deleteBudget(@C40472t("serviceId") String str, @C40472t("deletedBudgets") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Map<String, String>>> deleteContactAccount(@C40472t("serviceId") String str, @C40472t("id") long j, @C40472t("oldAcctNo") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> deleteProductImage(@C40472t("serviceId") String str, @C40472t("productId") long j, @C40472t("productKey") long j2, @C40472t("attachmentTypes") String str2, @C40472t("operationType") String str3);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> deleteProductImageSingle(@C40472t("serviceId") String str, @C40472t("productId") long j, @C40472t("productKey") long j2, @C40472t("attachmentTypes") String str2, @C40472t("operationType") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> deleteSavedCard(@C40472t("serviceId") String str, @C40472t("extCardId") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> deleteSavingGoal(@C40472t("serviceId") String str, @C40472t("id") Long l);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> deleteTemplate(@C40472t("serviceId") String str, @C40472t("templateId") long j);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<Object>> deleteTemplateGroup(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40455c("templateGroup") String str3, @C40472t("operationKey") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> disableUserTokens(@C40472t("serviceId") String str, @C40472t("disableOtherDevices") int i);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> disableUserTokens(@C40472t("serviceId") String str, @C40472t("deviceReference") String str2, @C40472t("deviceIdentifier") String str3, @C40472t("disableOtherDevices") int i);

    @C40458f(".")
    C40762x<BankApiResponse<ContactApiModel>> editContact(@C40472t("serviceId") String str, @C40472t("id") long j, @C40472t("fullName") String str2, @C40472t("nickName") String str3, @C40472t("phoneNumber") String str4, @C40472t("status") String str5, @C40472t("deleteImage") Integer num, @C40472t("deleteLinkName") Integer num2, @C40472t("deletePhoneNumber") Integer num3);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> editSavingGoal(@C40472t("serviceId") String str, @C40472t("id") Long l, @C40472t("name") String str2, @C40472t("amount") BigDecimal bigDecimal, @C40472t("startDate") String str3, @C40472t("endDate") String str4, @C40472t("sgcId") Long l2, @C40472t("accountId") Long l3, @C40472t("agreeKey") Long l4);

    @C40458f(".")
    C40762x<BankApiResponse<TransactionCategoryAddResponse>> editTransactionCategory(@C40472t("serviceId") String str, @C40472t("name") String str2, @C40472t("parentCatId") Long l, @C40472t("id") Long l2);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<PaymentDebtResponse>> executePayment(@C40472t("serviceId") String str, @C40455c("requestId") String str2, @C40472t("essServiceId") String str3, @C40455c("essParameters") String str4);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<PaymentDebtResponse>> executePayment(@C40473u HashMap<String, Object> hashMap, @C40455c("requestId") String str, @C40455c("essParameters") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> favoriteContact(@C40472t("serviceId") String str, @C40472t("route") String str2, @C40472t("contact") String str3, @C40472t("isFinancial") String str4);

    @C40458f(".")
    C40762x<BankApiResponse<MoneyTransferApiEntity>> findMoneyTransfer(@C40472t("serviceId") String str, @C40472t("mtSystemName") String str2, @C40472t("transferNumber") String str3, @C40472t("transferCurrency") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<List<BogCountry>>> foreignTransferGetCountries(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<List<ReportingCode>>> foreignTransferGetReportingCodes(@C40472t("serviceId") String str, @C40472t("countryCode") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<AccountDebitLoveWrapper>> getAccountLovDebits(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<OperationResponse>> getAccountOperations(@C40472t("serviceId") String str, @C40472t("mainAcctKey") Long l, @C40472t("acctKeys") Long l2, @C40472t("cardIds") Long l3, @C40472t("startDate") Long l4, @C40472t("endDate") Long l5, @C40472t("entryGroupNameId") Long l6, @C40472t("merchantClientId") String str2, @C40472t("essServiceId") String str3, @C40472t("from") int i, @C40472t("count") int i2, @C40472t("useLastOperationsMode") Integer num);

    @C40458f(".")
    C43443b<BankApiResponse<AccountReportId>> getAccountReportId(@C40472t("serviceId") String str, @C40472t("acctKey") Long l, @C40472t("agreeKey") Long l2, @C40472t("loanKey") Long l3, @C40472t("startDate") Long l4, @C40472t("endDate") Long l5);

    @C40458f(".")
    C43443b<BankApiResponse<AccountStatementWrapper>> getAccountStatement(@C40472t("serviceId") String str, @C40472t("acctKey") long j, @C40472t("reportId") long j2, @C40472t("searchWord") String str2, @C40472t("from") long j3, @C40472t("count") long j4);

    @C40458f(".")
    C40762x<BankApiResponse<AccountsApiEntity>> getAccountsAndDetails(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<AccountLovContainer>> getAccountsLov(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<AccountOwnerInfoWrapper>> getAcctOwnerInfo(@C40472t("serviceId") String str, @C40472t("pinOrAcctNo") String str2, @C40472t("ccy") String str3, @C40472t("isAcctNo") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<AccountOwnerInfoWrapper>> getAcctOwnerInfoWithPhone(@C40472t("serviceId") String str, @C40472t("benefIdentifType") String str2, @C40472t("ccy") String str3, @C40472t("benefIdentifier") String str4, @C40472t("phonePurposeKey") String str5);

    @C40458f(".")
    C43443b<BankApiResponse<ContractEntity>> getAgreementTextTemplate(@C40472t("serviceId") String str, @C40472t("contractType") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<AnalysisApiEntity>> getAnalysis(@C40472t("serviceId") String str, @C40472t("fromDate") String str2, @C40472t("toDate") String str3, @C40472t("accountIds") String str4);

    @C40458f(".")
    C40762x<BankApiResponse<List<AppSettingApiEntity>>> getAppSettingsExternal(@C40472t("serviceId") String str, @C40472t("clientSegment") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<List<AppSettingApiEntity>>> getAppSettingsInternal(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<List<ApplicationTypeEntity>>> getApplicationTypes(@C40472t("serviceId") String str, @C40472t("mode") String str2);

    @C40458f(".?terminalId=123123")
    C40762x<BankApiResponse<List<ApplicationEntity>>> getApplications(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<AssetLiabilityApiEntity>> getAssetLiabilityDetails(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<BondsWrapper>> getBonds(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<BonusPrizeList>> getBonusPrizeHistory(@C40472t("serviceId") String str, @C40472t("bonusType") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<BonusPrizeList>> getBonusPrizeList(@C40472t("serviceId") String str, @C40472t("bonusType") String str2, @C40472t("prizeCostMin") Integer num, @C40472t("prizeCostMax") Integer num2, @C40472t("categoryId") Integer num3, @C40472t("from") Integer num4, @C40472t("count") Integer num5, @C40472t("my") int i);

    @C40458f(".")
    C43443b<BankApiResponse<BonusStatementDetailsWrapper>> getBonusStatementByType(@C40472t("serviceId") String str, @C40472t("from") int i, @C40472t("count") int i2, @C40472t("bonusType") String str2, @C40472t("startDate") Long l, @C40472t("endDate") Long l2, @C40472t("extras") int i3);

    @C40458f(".")
    C43443b<BankApiResponse<BonusWrapperEntity>> getBonuses(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BonusWrapperEntity> getBonusesAndCashback(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<BudgetingResponseEntity>> getBudgetingData(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<BudgetingExpensesEntity>> getBudgetingHistory(@C40472t("serviceId") String str, @C40472t("fromDate") String str2, @C40472t("toDate") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<CarCTParkResponse>> getCTParkPaymentDebt(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("essServiceId") String str3, @C40472t("essParameters") String str4, @C40472t("serviceName") String str5);

    @C40458f(".")
    C40762x<BankApiResponse<CampaignInfoApiEntity>> getCampaignInfo(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<CardBlockStatusApiEntity>> getCardBlockStatus(@C40472t("serviceId") String str, @C40472t("cardId") long j);

    @C40458f(".")
    C40762x<BankApiResponse<AmexOfferInfoApiEntity>> getCardCampaignOfferInfo(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<CardExtraDetailsApiEntity>> getCardDetails(@C40473u Map<String, Object> map);

    @C40458f(".")
    C43443b<BankApiResponse<InsuranceType[]>> getCardInsuranceTypes(@C40472t("serviceId") String str, @C40472t("subProductCode") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<CardsAndDetailsApiEntity>> getCardsAndDetails(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<List<LoanOfferCard>>> getCardsForLoanOffer(@C40472t("serviceId") String str, @C40472t("ccy") String str2);

    @C40458f(".")
    C40762x<List<CasHistoryItemEntity>> getCasHistory(@C40472t("serviceId") String str, @C40472t("clientServiceId") long j);

    @C40458f(".")
    C43443b<BankApiResponse<CasStatementWrapper>> getCasStatement(@C40472t("serviceId") String str, @C40472t("clientServiceId") long j, @C40472t("startDate") long j2, @C40472t("endDate") long j3, @C40472t("from") long j4, @C40472t("count") long j5);

    @C40458f(".")
    C43443b<BankApiResponse<PreContractEntity>> getCashCoverLoanPreContract(@C40472t("serviceId") String str, @C40472t("spreadRate") Double d, @C40472t("irr") Double d2, @C40472t("comisAmount") BigDecimal bigDecimal, @C40472t("withAmount") BigDecimal bigDecimal2, @C40472t("amount") BigDecimal bigDecimal3, @C40472t("maturityDate") Long l, @C40472t("payDate") Long l2, @C40472t("payCount") int i, @C40472t("amountAfterCommissionFee") BigDecimal bigDecimal4, @C40472t("priOver") Double d3, @C40472t("prePenalty") Double d4, @C40472t("agreeAcctNo") String str2, @C40472t("secAmount") BigDecimal bigDecimal5, @C40472t("ccy") String str3, @C40472t("depositType") String str4, @C40472t("depMaturityDate") Long l3, @C40472t("prodType") String str5);

    @C40458f(".")
    C40762x<BankApiResponse<CashFlowResponse>> getCashFlow(@C40472t("serviceId") String str, @C40472t("monthOfYear") String str2, @C40472t("pastMonths") int i, @C40472t("futureMonths") int i2);

    @C40458f(".")
    C43443b<BankApiResponse<CashBackStatementWrapper>> getCashbackStatement(@C40472t("serviceId") String str, @C40472t("startDate") Long l, @C40472t("endDate") Long l2, @C40472t("from") int i, @C40472t("count") int i2, @C40472t("extras") int i3);

    @C40458f(".")
    C43443b<BankApiResponse<CcyRatesWrapper>> getCcyRates(@C40472t("serviceId") String str, @C40472t("all") int i);

    @C40458f(".")
    C40762x<BankApiResponse<List<ClientCurrencyApiEntity>>> getClientCurencies(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<String>> getClientNameByIdNumber(@C40472t("serviceId") String str, @C40472t("pin") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<List<PaymentsCard>>> getCommissionAccounts(@C40472t("serviceId") String str, @C40472t("langCode") String str2, @C40472t("ccy") String str3);

    @C40458f(".")
    C40762x<BankApiResponse<List<ContactApiModel>>> getContacts(@C40472t("serviceId") String str, @C40472t("from") Long l, @C40472t("count") Long l2);

    @C40458f(".")
    C40762x<BankApiResponse<ContractEntity>> getContract(@C40472t("serviceId") String str, @C40472t("contractType") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<ContractEntity>> getContract(@C40472t("serviceId") String str, @C40473u Map<String, Object> map);

    @C40458f(".")
    C43443b<BankApiResponse<TransferCountryCode>> getCountryCodeBySwift(@C40472t("serviceId") String str, @C40472t("swift") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<CreditApplicationEntity>> getCreditApplicationDetails(@C40472t("serviceId") String str, @C40472t("appId") Long l);

    @C40458f(".?terminal=123")
    C40762x<BankApiResponse<CreditOfferDecisionEntity>> getCreditCardOfferDecision(@C40472t("serviceId") String str, @C40472t("limitId") String str2, @C40472t("operationType") String str3);

    @C40458f(".")
    C40762x<BankApiResponse<PreContractEntity>> getCreditCardOfferPreContractTemplate(@C40472t("serviceId") String str, @C40472t("terminal") String str2, @C40472t("decNo") Long l, @C40472t("decisionScheme") String str3, @C40472t("operationType") String str4, @C40472t("cardLimit") String str5, @C40472t("templCode") String str6, @C40472t("cardCcy") String str7, @C40472t("refinanceInfo") String str8, @C40472t("prodType") String str9);

    @C40458f(".")
    C40762x<BankApiResponse<CreditInfoContractEntity>> getCreditInfoContract(@C40472t("serviceId") String str, @C40472t("contractType") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<DDPaymentAccount>>> getDDAccounts(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<STOPeriodType>>> getDDPeriodTypes(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<DDProviderItem>>> getDDProviders(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<DDSTO>>> getDDSTOList(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<List<DepLoanAgreement>>> getDepLoanAgreements(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<DepLoanCalculation>> getDepLoanCalculation(@C40472t("serviceId") String str, @C40472t("agreeKey") long j, @C40472t("ccy") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<DepositPurposeResponse>> getDepositPurposesNew(@C40472t("serviceId") String str, @C40472t("prodType") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<String>> getDomesticTransferNominations(@C40472t("serviceId") String str, @C40472t("acctNo") String str2, @C40472t("benefAcctNo") String str3, @C40472t("docType") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<PaymentsCard>>> getExpressCards(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<BonusProvider>>> getExpressProviders(@C40472t("serviceId") String str, @C40472t("bonusType") String str2, @C40472t("productType") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<List<FeatureFeedback>>> getFeatureFeedback(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<FileAttachmentInfo>> getFileAttachmentInfo(@C40472t("serviceId") String str, @C40472t("attachmentType") AttachmentTypeConst attachmentTypeConst);

    @C40458f(".")
    C40762x<BankApiResponse<FinancialCalendarResponse>> getFinancialCalendar(@C40472t("serviceId") String str, @C40472t("startStr") String str2, @C40472t("endStr") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<ForeignBankList>> getForeignBankList(@C40472t("serviceId") String str, @C40472t("keyword") String str2, @C40472t("from") int i, @C40472t("count") int i2);

    @C40458f(".")
    C43443b<BankApiResponse<Integer>> getForeignTransferMaxInvoiceCount(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<List<InTransferDetail>>> getInTransferDetails(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("docKey") Long l, @C40472t("paymentId") String str3, @C40472t("printFormType") String str4, @C40472t("pfmId") Long l2, @C40472t("entryId") Long l3, @C40472t("operationDate") Long l4);

    @C40458f(".")
    C43443b<BankApiResponse<LimitLoanDecisionEntity>> getLimitLoanDecision(@C40472t("serviceId") String str, @C40472t("limitId") String str2, @C40472t("operationType") String str3, @C40472t("terminal") String str4);

    @C40458f(".?terminal=123")
    C40762x<BankApiResponse<List<LoanOfferLimitEntity>>> getLimitLoanList(@C40472t("serviceId") String str, @C40472t("limitId") String str2);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<PreContractEntity>> getLndOfferPrecontractTemplate(@C40472t("serviceId") String str, @C40472t("terminal") String str2, @C40472t("decNo") String str3, @C40472t("decisionScheme") String str4, @C40472t("cardPan") String str5, @C40472t("operationType") String str6, @C40472t("loanCcy") String str7, @C40472t("loanTerm") String str8, @C40472t("payDay") String str9, @C40472t("insIncFlag") String str10, @C40455c("refinanceInfo") String str11, @C40472t("loanAmount") BigDecimal bigDecimal, @C40472t("keepAmount") BigDecimal bigDecimal2, @C40472t("prodType") String str12, @C40472t("limitCategory") String str13);

    @C40458f(".")
    C40762x<BankApiResponse<List<LoanOfferCard>>> getLoanOfferCards(@C40472t("serviceId") String str, @C40472t("ccy") String str2);

    @C40457e
    @C40467o(".")
    C40762x<BankApiResponse<PreContractEntity>> getLoanOfferPreContractTemplate(@C40472t("serviceId") String str, @C40472t("terminal") String str2, @C40472t("decNo") String str3, @C40472t("decisionScheme") String str4, @C40472t("cardPan") String str5, @C40472t("operationType") String str6, @C40472t("loanCcy") String str7, @C40472t("loanTerm") String str8, @C40472t("payDay") String str9, @C40472t("insIncFlag") String str10, @C40455c("refinanceInfo") String str11, @C40472t("loanAmount") BigDecimal bigDecimal, @C40472t("keepAmount") BigDecimal bigDecimal2, @C40472t("prodType") String str12, @C40472t("limitCategory") String str13, @C40472t("conditionDays ") int i, @C40472t("drawAmount") double d, @C40472t("drawAmount2") double d2, @C40472t("providerId") String str14);

    @C40458f(".")
    C43443b<BankApiResponse<LoanHistoryWrapper>> getLoansHistory(@C40472t("serviceId") String str, @C40472t("loanKey") long j);

    @C40458f(".")
    C43443b<BankApiResponse<LoanScheduleWrapper>> getLoansSchedule(@C40472t("serviceId") String str, @C40472t("loanKey") long j);

    @C40458f(".")
    C40762x<BankApiResponse<ProductDescriptionTextEntity>> getLookUpTexts(@C40472t("serviceId") String str, @C40472t("lookupName") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<MapObjectDetail>>> getMapObjectDetails(@C40472t("serviceId") String str, @C40472t("objectName") String str2, @C40472t("objectKey") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<String>> getMapObjectStatus(@C40472t("serviceId") String str, @C40472t("objectName") String str2, @C40472t("objectKey") String str3, @C40472t("objectType") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<List<MapObject>>> getMapObjects(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<MapRegion>>> getMapRegions(@C40472t("serviceId") String str, @C40472t("parentId") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<List<MccStateEntity>>> getMccStates(@C40472t("serviceId") String str, @C40472t("cardId") long j);

    @C40458f(".?terminal=123")
    C40762x<BankApiResponse<QrMerchantInfoEntity>> getMerchantInfo(@C40472t("serviceId") String str, @C40472t("qrId") String str2, @C40472t("qrVersion") String str3, @C40472t("qrType") String str4, @C40472t("paymentType") String str5, @C40472t("qrStandard") String str6);

    @C40458f(".")
    C43443b<BankApiResponse<List<Merchant>>> getMerchantsByName(@C40472t("serviceId") String str, @C40472t("objectName") String str2, @C40472t("from") int i, @C40472t("count") int i2);

    @C40458f(".")
    C40762x<BankApiResponse<List<MoneyRequestApiModel>>> getMoneyRequests(@C40472t("serviceId") String str);

    @C40458f(".?includeLogos=1")
    C40762x<BankApiResponse<List<MoneyTransferTypeApiEntity>>> getMoneyTransferTypes(@C40472t("serviceId") String str);

    @C40458f(".?forSending=0")
    C40762x<BankApiResponse<TransferAccountsAndCurrenciesApiEntity>> getMoneyTransfersAccountsAndCurrenciesDetails(@C40472t("serviceId") String str, @C40472t("amount") double d, @C40472t("ccy") String str2, @C40472t("countryCode") String str3);

    @C40458f(".?forSending=0")
    C40762x<BankApiResponse<List<TransferAccountItemApiEntity>>> getMoneyTransfersAccountsAndDetails(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<BonusPrize>> getMrPrizeDetails(@C40472t("serviceId") String str, @C40472t("prizeNo") long j);

    @C40458f(".")
    C43443b<BankApiResponse<NotificationList>> getNotificationList(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<NotificationCount>> getNotificationsCount(@C40472t("serviceId") String str, @C40472t("fcmTokenId") String str2);

    @C40458f(".?terminal=123")
    C40762x<BankApiResponse<List<CreditOfferLimitEntity>>> getOfferCardList(@C40472t("serviceId") String str, @C40472t("limitId") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<LimitLoanDecisionEntity>> getOfferLimitLoanDecision(@C40472t("serviceId") String str, @C40472t("limitId") String str2, @C40472t("operationType") String str3, @C40472t("terminal") String str4);

    @C40458f(".")
    C40762x<BankApiResponse<List<OfferProductApiEntity>>> getOfferProducts(@C40472t("serviceId") String str);

    @C40458f(".?terminalId=123")
    C40762x<BankApiResponse<List<OfferInfoApiEntity>>> getOffers(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<OperationResponse>> getOperationDetails(@C40472t("serviceId") String str, @C40472t("entryId") String str2, @C40472t("docKey") long j);

    @C40458f(".")
    C43443b<BankApiResponse<OperationPfmDetails>> getOperationPfmDetails(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("docKey") Long l, @C40472t("paymentId") String str3, @C40472t("printFormType") String str4, @C40472t("pfmId") Long l2, @C40472t("entryId") Long l3, @C40472t("operationDate") Long l4);

    @C40458f(".")
    C43443b<BankApiResponse<List<OperationPfmDetails>>> getOperationPfmDetailsList(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("docKey") Long l, @C40472t("paymentId") String str3, @C40472t("printFormType") String str4, @C40472t("pfmId") Long l2, @C40472t("entryId") Long l3, @C40472t("operationDate") Long l4);

    @C40458f(".")
    C43443b<BankApiResponse<TransferHistoryItem>> getOutTransferDetails(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("docKey") Long l, @C40472t("paymentId") String str3, @C40472t("printFormType") String str4, @C40472t("pfmId") Long l2, @C40472t("entryId") Long l3, @C40472t("operationDate") Long l4);

    @C40458f(".")
    C43443b<BankApiResponse<PasswordRules>> getPasswordRules(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<List<PaymentDetail>>> getPaymentDetails(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("docKey") Long l, @C40472t("paymentId") String str3, @C40472t("printFormType") String str4, @C40472t("pfmId") Long l2, @C40472t("entryId") Long l3, @C40472t("operationDate") Long l4);

    @C40458f(".")
    C43443b<BankApiResponse<Long>> getPaymentRequestId(@C40472t("serviceId") String str, @C40472t("serviceKey") String str2);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<PaymentCommissionEntity>> getPaymentsCommissions(@C40455c("requestId") String str, @C40456d HashMap<String, Object> hashMap);

    @C40458f(".")
    C43443b<BankApiResponse<LastOperation>> getPaymentsLastOperation(@C40472t("serviceId") String str, @C40472t("paymentId") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<LastOperation>>> getPaymentsLastOperations(@C40472t("serviceId") String str, @C40472t("fromDate") long j, @C40472t("endDate") Long l, @C40472t("from") int i, @C40472t("count") int i2);

    @C40458f(".")
    C43443b<BankApiResponse<List<LastOperation>>> getPaymentsLastOperations(@C40472t("serviceId") String str, @C40472t("fromDate") Long l, @C40472t("from") int i, @C40472t("count") int i2);

    @C40458f(".")
    C43443b<BankApiResponse<List<PaymentProviderConfiguration>>> getPaymentsProviderConfiguration(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("essServiceId") String str3, @C40472t("categoryId") String str4, @C40472t("essResponseDataType") String str5);

    @C40458f(".")
    C40762x<BankApiResponse<List<PendingProductConfirmationEntity>>> getPendingProductConfirmationsReactive(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<String>> getPendingProductContract(@C40472t("serviceId") String str, @C40472t("responseDetId") long j);

    @C40458f(".")
    C43443b<BankApiResponse<PensionStatusResult>> getPensionStatus(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<List<ProductTypeApiEntity>>> getProductTypeList(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<PushHistoryObject>> getPushNotificationList(@C40472t("serviceId") String str, @C40472t("recipientId") String str2, @C40472t("from") int i, @C40472t("count") int i2);

    @C40458f(".")
    C43443b<BankApiResponse<CcyHistoryWrapper>> getRatesHistory(@C40472t("serviceId") String str, @C40472t("startDate") long j, @C40472t("endDate") long j2);

    @C40458f(".")
    C40762x<BankApiResponse<ReferalEntity>> getReferralInfo(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<SMSContact>>> getSMSNotificationsList(@C40472t("serviceId") String str, @C40472t("messageMode") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<STOPeriodType>>> getSTOPeriodTypes(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<PaymentsCard>>> getSavedCards(@C40472t("serviceId") String str, @C40472t("providerIds") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<ScoolCardStatementItem>>> getScoolCardStatement(@C40472t("serviceId") String str, @C40472t("childClientKey") long j, @C40472t("startDate") long j2, @C40472t("endDate") long j3, @C40472t("from") Integer num, @C40472t("count") Integer num2);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<SelectedPayment>>> getSelectedPayments(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<ServiceCenterEntity>> getServiceCenters(@C40472t("serviceId") String str, @C40472t("bankLine") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<List<ServiceStatusEntity>>> getServiceStatus(@C40472t("serviceId") String str, @C40472t("serviceKey") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<List<SmsNotificationEntity>>> getSmsNotifications(@C40472t("serviceId") String str, @C40472t("messageMode") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<SoloBankerInfoApiEntity>> getSoloBankerInfo(@C40472t("serviceId") String str, @C40472t("customerId") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<StudentCardStatusApiEntity>> getStudentCardStatus(@C40472t("serviceId") String str);

    @C40458f(".?includeRecentProviders=1")
    C43443b<BankApiResponse<TemplateBasketItemsWithPaymentConfig>> getTemplatesBasket(@C40472t("templateGroupTypes") String str, @C40472t("templateTypes") String str2, @C40472t("offset") int i, @C40472t("limit") int i2, @C40472t("fullData") int i3, @C40472t("templateDataType") String str3, @C40472t("serviceId") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<TemplateBasketItem>>> getTemplatesByType(@C40472t("serviceId") String str, @C40472t("templateTypes") String str2, @C40472t("offset") int i, @C40472t("limit") int i2, @C40472t("fullData") int i3);

    @C40458f(".")
    C40762x<BankApiResponse<TransactionCategoryResponse>> getTransactionCategories(@C40472t("serviceId") String str, @C40472t("hashCode") long j);

    @C40458f(".")
    C40762x<BankApiResponse<TransferAccountsApiEntity>> getTransferAccounts(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<Beneficiary>>> getTransferBeneficiaries(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<MoneyTransferCommissionApiModel>> getTransferCommission(@C40472t("serviceId") String str, @C40472t("acctKey") String str2, @C40472t("amount") String str3, @C40472t("ccy") String str4, @C40472t("benefAcctNo") String str5, @C40472t("benefAcctKey") String str6, @C40472t("dispatchType") String str7, @C40472t("transferType") String str8, @C40472t("benefSwift") String str9);

    @C40458f(".")
    C43443b<BankApiResponse<TransferHistoryItem>> getTransferDetailsPfm(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("docKey") Long l, @C40472t("paymentId") String str3, @C40472t("printFormType") String str4, @C40472t("pfmId") Long l2, @C40472t("entryId") Long l3, @C40472t("operationDate") Long l4);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<TransferNomination>>> getTransferNominations(@C40472t("serviceId") String str, @C40472t("docType") String str2, @C40472t("srcCcy") String str3, @C40472t("ccy") String str4, @C40472t("benefAcctNo") String str5, @C40472t("benefAcctKey") String str6);

    @C40458f(".")
    C43443b<BankApiResponse<TreasureCodeInfo>> getTreasureOwnerInfo(@C40472t("serviceId") String str, @C40472t("treasureCode") String str2, @C40472t("ccy") String str3, @C40472t("isAcctNo") String str4);

    @C40458f(".")
    C40762x<BankApiResponse<UmtsCardsApiModel>> getUmtsCards(@C40472t("serviceId") String str, @C40472t("mtSystemName") String str2, @C40472t("forSending") Long l);

    @C40458f(".")
    C40762x<BankApiResponse<UpcomingPaymentDataEntity>> getUpcomingPayments(@C40472t("serviceId") String str, @C40472t("defaultDays") int i, @C40472t("recordType") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<ClientInfoWrapper>> getUserInfo(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<UserRestrictions>> getUserRestrictedServices(@C40472t("serviceId") String str, @C40472t("birthDate") Long l);

    @C40458f(".")
    C43443b<BankApiResponse<List<LastOperation>>> getUtilityPaymentDetails(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("docKey") Long l, @C40472t("paymentId") String str3, @C40472t("printFormType") String str4, @C40472t("pfmId") Long l2, @C40472t("entryId") Long l3, @C40472t("operationDate") Long l4);

    @C40458f(".")
    C43443b<BankApiResponse<PaymentVoucher[]>> getVouchers(@C40472t("serviceId") String str, @C40472t("providerCode") String str2, @C40472t("requestId") String str3, @C40472t("bonusType") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> hideClientProduct(@C40472t("serviceId") String str, @C40472t("productGroup") String str2, @C40472t("productKey") String str3, @C40472t("hide") String str4);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> identifyCreditor(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<VerificationProcessDataEntity>> identityVerificationProcessData(@C40472t("serviceId") String str, @C40472t("operationReference") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<NewLoanAllowedEntity>> isNewApplicationAllowed(@C40472t("serviceId") String str, @C40472t("applicationType") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> joinBonusProgram(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> loadMobileData(@C40472t("serviceId") String str, @C40472t("data") String str2);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<Object>> loginWithOTP(@C40472t("serviceId") String str, @C40455c("oneTimePassword") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<List<LookupEntity>>> lookup(@C40472t("serviceId") String str, @C40472t("lookupName") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> makePushNotificationAction(@C40472t("serviceId") String str, @C40472t("messageId") String str2, @C40472t("actionType") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<TemplateBasketItem>> modifyTemplate(@C40472t("serviceId") String str, @C40472t("template") String str2, @C40472t("templateGroupId") Long l, @C40472t("operationKey") String str3);

    @C40464l
    @C40467o(".")
    C43443b<BankApiResponse<TemplateBasketItem>> modifyTemplate(@C40472t("serviceId") String str, @C40472t("template") String str2, @C40472t("attachmentTypes") String str3, @C40469q C41939y.C41942c cVar, @C40472t("templateGroupId") Long l, @C40472t("operationKey") String str4);

    @C40458f(".")
    C43443b<BankApiResponse<TemplateGroup>> modifyTemplateGroup(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("templateGroup") String str3, @C40472t("operationKey") String str4);

    @C40464l
    @C40467o(".")
    C43443b<BankApiResponse<TemplateGroup>> modifyTemplateGroup(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("templateGroup") String str3, @C40472t("operationKey") String str4, @C40472t("attachmentTypes") String str5, @C40469q C41939y.C41942c cVar);

    @C40458f(".")
    C43443b<BankApiResponse<Boolean>> modifyTransferTemplate(@C40472t("serviceId") String str, @C40472t("template") String str2, @C40472t("operationKey") String str3);

    @C40464l
    @C40467o(".")
    C43443b<BankApiResponse<Boolean>> modifyTransferTemplate(@C40472t("serviceId") String str, @C40472t("template") String str2, @C40472t("operationKey") String str3, @C40472t("attachmentTypes") String str4, @C40469q C41939y.C41942c cVar);

    @C40458f(".")
    C43443b<BankApiResponse<List<String>>> orderMrPrize(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> payCommissions(@C40472t("serviceId") String str, @C40472t("amount") BigDecimal bigDecimal, @C40472t("acctKey") Long l);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<PaymentResult>> paymentsBatchExecute(@C40455c("requestId") String str, @C40456d HashMap<String, Object> hashMap);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<Map<String, String>>> processLoanRegistration(@C40456d HashMap<String, Object> hashMap);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> processNotifications(@C40472t("serviceId") String str, @C40472t("json") String str2);

    @C40458f(".?terminal=123")
    C43443b<BankApiResponse<QrPaymentResult>> qrPay(@C40472t("serviceId") String str, @C40472t("qrId") String str2, @C40472t("qrVersion") String str3, @C40472t("qrType") String str4, @C40472t("cardId") String str5, @C40472t("amount") String str6, @C40472t("ccy") String str7, @C40472t("latitude") Double d, @C40472t("longitude") Double d2, @C40472t("altitude") Double d3, @C40472t("qrStandard") String str8);

    @C40458f(".?terminal=123")
    C43443b<BankApiResponse<Object>> qrPayReverseTransaction(@C40472t("serviceId") String str, @C40472t("docKey") String str2, @C40472t("confirmRequestId") String str3, @C40472t("confirmationCode") String str4);

    @C40458f(".?terminal=123")
    C43443b<BankApiResponse<ReversalOtpResult>> qrPaySendOtpForReversal(@C40472t("serviceId") String str, @C40472t("docKey") String str2);

    @C40457e
    @C40467o(".")
    C40762x<BankApiResponse<Map<String, String>>> registerLoan(@C40456d HashMap<String, Object> hashMap);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> registerReferral(@C40472t("serviceId") String str, @C40472t("pin") String str2, @C40472t("contact") String str3, @C40472t("firstName") String str4, @C40472t("lastName") String str5, @C40472t("deposit") String str6, @C40472t("loan") String str7, @C40472t("creditCard") String str8, @C40472t("ipo") String str9, @C40472t("solo") String str10, @C40472t("soloClub") String str11);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> removeBanner(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<PensionAccessResult>> removePensionAccess(@C40472t("serviceId") String str, @C40472t("isGrant") int i);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> removeTransactionCategory(@C40472t("serviceId") String str, @C40472t("id") Long l);

    @C40458f(".")
    C40734b requestAddCustomerNotification(@C40472t("serviceId") String str, @C40472t("customerId") String str2, @C40472t("rbcParameterName") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<String>> resetAppData(@C40472t("serviceId") String str);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> reverseLoan(@C40472t("serviceId") String str, @C40472t("applicationType") String str2, @C40472t("productType") String str3, @C40472t("loanKey") long j, @C40472t("reversalReason") String str4);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<Object>> saveSMSNotifs(@C40473u HashMap<String, Object> hashMap, @C40455c("notificationSets") String str);

    @C40458f(".")
    C43443b<BankApiResponse<SearchDataWrapper>> searchData(@C40472t("serviceId") String str, @C40472t("searchString") String str2, @C40472t("customerType") String str3, @C40472t("from") int i, @C40472t("to") int i2);

    @C40458f(".")
    C40762x<Object> sendLeadApplication(@C40472t("serviceId") String str, @C40472t("applicationType") String str2, @C40472t("product") String str3, @C40472t("subProduct") String str4, @C40472t("loanAmount") String str5, @C40472t("loanCurrency") String str6);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> sendPensionAccess(@C40472t("serviceId") String str, @C40472t("isGrant") int i);

    @C40457e
    @C40467o(".")
    C40762x<BankApiResponse<RsApprovalEntity>> sendRsApproval(@C40472t("serviceId") String str, @C40472t("applicationType") String str2, @C40472t("product") String str3, @C40472t("subProduct") String str4, @C40472t("approveForRSCustomerInfo") Boolean bool, @C40455c("approveForRSCustomerInfoDocument") String str5);

    @C40457e
    @C40467o(".")
    C40762x<BankApiResponse<Object>> sendSoloApplication(@C40472t("serviceId") String str, @C40472t("phone") String str2, @C40472t("email") String str3, @C40472t("workplace") String str4, @C40472t("income") String str5, @C40472t("commissionPayment") String str6, @C40472t("serviceCenterKey") String str7, @C40472t("serviceCenterDesc") String str8, @C40472t("status") String str9, @C40472t("depositAmount") Long l, @C40455c("preContractText") String str10);

    @C40467o(".")
    C40762x<Object> sendStatusPopupClickedLog(@C40472t("serviceId") String str);

    @C40464l
    @C40467o(".?attachmentTypes=IMAGE")
    C40762x<BankApiResponse<ContactApiModel>> setContactProfilePicture(@C40472t("serviceId") String str, @C40472t("id") long j, @C40469q C41939y.C41942c cVar);

    @C40458f(".")
    C43443b<BankApiResponse<String>> setCustomerFlag(@C40472t("serviceId") String str, @C40472t("flag") String str2, @C40472t("flagType") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> setDepositName(@C40472t("serviceId") String str, @C40472t("agreeKey") long j, @C40472t("name") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<ContactAccountApiModel>> setFavoriteContact(@C40472t("serviceId") String str, @C40472t("id") long j, @C40472t("oldAcctNo") String str2, @C40472t("isDefault") int i);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> setFeatureFeedback(@C40472t("serviceId") String str, @C40472t("feedbackId") long j, @C40472t("actionType") String str2, @C40472t("score") Integer num, @C40472t("comment") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<Void>> setLoanName(@C40472t("serviceId") String str, @C40472t("loanKey") long j, @C40472t("loanName") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> setReferalCode(@C40472t("serviceId") String str, @C40472t("promoCode") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<Long>> setSavedCard(@C40472t("serviceId") String str, @C40472t("pan2") String str2, @C40472t("lastFour") String str3, @C40472t("cardData") String str4, @C40472t("merchantId") String str5, @C40472t("cardClass") String str6, @C40472t("expDate") String str7);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<Object>> setUsername(@C40472t("serviceId") String str, @C40455c("userName") String str2, @C40455c("oneTimePassword") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> terminateBill(@C40472t("serviceId") String str, @C40472t("billPayCardId") long j, @C40472t("productCode") String str2, @C40472t("phoneNumber") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> terminatePayment(@C40472t("serviceId") String str, @C40472t("paymentId") long j, @C40472t("productCode") String str2);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> terminateSTO(@C40472t("serviceId") String str, @C40472t("documentId") long j, @C40472t("productCode") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> transactionData(@C40472t("serviceId") String str, @C40472t("id") Long l, @C40472t("catId") Long l2, @C40472t("operationDate") Long l3);

    @C40458f(".")
    C43443b<BankApiResponse<TransferResult>> transferBetweenOwnAccounts(@C40472t("serviceId") String str, @C40472t("srcAcctKey") String str2, @C40472t("dstAcctKey") String str3, @C40472t("amount") String str4, @C40472t("ccy") String str5, @C40472t("nomination") String str6, @C40472t("srcCcy") String str7, @C40472t("dstCcy") String str8, @C40472t("rate") String str9, @C40472t("serviceOperationId") String str10);

    @C40458f(".")
    C43443b<BankApiResponse<TransferResult>> transferInForeignBank(@C40473u HashMap<String, Object> hashMap, @C40472t("serviceOperationId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<TransferResult>> transferWithinBank(@C40473u HashMap<String, Object> hashMap, @C40472t("serviceOperationId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<TransferResult>> transferWithinGeorgia(@C40473u HashMap<String, Object> hashMap, @C40472t("serviceOperationId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<RateWeight>> transfersGetCommRate(@C40472t("serviceId") String str, @C40472t("ccyFrom") String str2, @C40472t("ccyTo") String str3);

    @C40458f(".")
    C43443b<BankApiResponse<TransferRate>> transfersGetCommRateAmount(@C40472t("serviceId") String str, @C40472t("ccyFrom") String str2, @C40472t("ccyTo") String str3, @C40472t("amount") String str4, @C40472t("rate") String str5);

    @C40458f(".")
    C43443b<BankApiResponse<ArrayList<DispatchType>>> transfersGetDispatchTypes(@C40472t("serviceId") String str, @C40472t("ccy") String str2);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> triggerLoginChanges(@C40472t("serviceId") String str);

    @C40458f(".")
    C43443b<BankApiResponse<Void>> updateTemplateGroupLink(@C40472t("serviceId") String str, @C40472t("requestId") String str2, @C40472t("templateGroupId") long j, @C40472t("templateIds") String str3, @C40472t("operationKey") String str4);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<Object>> upload(@C40472t("serviceId") String str, @C40455c("attachmentBase64") String str2, @C40472t("attachmentName") String str3, @C40472t("attachmentExtension") String str4);

    @C40464l
    @C40467o(".")
    C43443b<BankApiResponse<Object>> uploadProductImage(@C40472t("serviceId") String str, @C40472t("productId") long j, @C40472t("productKey") long j2, @C40472t("attachmentTypes") String str2, @C40472t("operationType") String str3, @C40469q C41939y.C41942c cVar);

    @C40464l
    @C40467o(".")
    C40762x<BankApiResponse<Object>> uploadProductImageSingle(@C40472t("serviceId") String str, @C40472t("productId") long j, @C40472t("productKey") long j2, @C40472t("attachmentTypes") String str2, @C40472t("operationType") String str3, @C40469q C41939y.C41942c cVar);

    @C40458f(".")
    C43443b<BankApiResponse<Object>> useOtpForAction(@C40473u HashMap<String, Object> hashMap);

    @C40457e
    @C40467o(".")
    C43443b<BankApiResponse<Object>> useOtpForActionPost(@C40456d HashMap<String, Object> hashMap);

    @C40458f(".")
    C40762x<BankApiResponse<HashMap<String, String>>> useOtpForActionSingle(@C40473u HashMap<String, Object> hashMap);

    @C40457e
    @C40467o(".")
    C40762x<BankApiResponse<Object>> useOtpForActionSinglePost(@C40456d HashMap<String, Object> hashMap);

    @C40458f(".")
    C43443b<BankApiResponse<String>> useOtpForActionString(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> validateCardLastDigits(@C40472t("serviceId") String str, @C40472t("pan2") String str2, @C40472t("lastFour") String str3);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> validateFavoriteContact(@C40472t("serviceId") String str, @C40472t("route") String str2, @C40472t("contact") String str3, @C40472t("confirmationCode") String str4);

    @C40458f(".")
    C40762x<BankApiResponse<Object>> verifyIdentity(@C40472t("serviceId") String str, @C40472t("operationReference") String str2, @C40472t("isVerificationAfterLogin") Boolean bool, @C40472t("authElements") String str3, @C40472t("qrType") String str4, @C40472t("scaOperationId") String str5, @C40472t("scaOperationReference") String str6, @C40472t("scaAuthCode") String str7);
}
