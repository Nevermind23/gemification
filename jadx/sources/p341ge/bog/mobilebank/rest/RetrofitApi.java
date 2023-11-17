package p341ge.bog.mobilebank.rest;

import com.google.gson.C5490d;
import com.google.gson.Gson;
import g91.C32359z0;
import hd0.C24978b;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import of1.C41872c0;
import of1.C41937x;
import of1.C41939y;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.LimitLoanDecisionEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ContractEntity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferCommissionApiModel;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
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
import p341ge.bog.mobilebank.model.GettingPhoneOwnerPurpose;
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
import p341ge.bog.mobilebank.model.bonus.BonusPrizeList;
import p341ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper;
import p341ge.bog.mobilebank.model.bonus.BonusType;
import p341ge.bog.mobilebank.model.bonus.ScoolCardStatementItem;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.model.datareport.DeviceDataReport;
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
import p341ge.bog.mobilebank.model.notification.ProcessNotificationsRequest;
import p341ge.bog.mobilebank.model.notification.PushHistoryObject;
import p341ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo;
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
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.RetrofitCallback;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import zh1.C43443b;

/* renamed from: ge.bog.mobilebank.rest.RetrofitApi */
public class RetrofitApi extends BankApi {
    private static RetrofitApi instance;
    private static IRetrofitService mBankService;
    private static IRetrofitService mBankServiceForPayments;
    private Gson gson = new Gson();
    private Gson gsonWithExposes = new C5490d().mo18204c().mo18203b();

    public RetrofitApi(IRetrofitService iRetrofitService, IRetrofitService iRetrofitService2) {
        if (mBankService == null) {
            mBankService = iRetrofitService;
            mBankServiceForPayments = iRetrofitService2;
            instance = this;
        }
    }

    public static RetrofitApi getInstance() {
        return instance;
    }

    private void getLoanOfferPreContractTemplate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<LimitLoanRefinanceInfo> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str11, String str12, RestCallback<BankApiResponse<PreContractEntity>> restCallback) {
        String str13;
        List<LimitLoanRefinanceInfo> list2 = list;
        RestCallback<BankApiResponse<PreContractEntity>> restCallback2 = restCallback;
        if (list2 == null) {
            str13 = "";
        } else {
            str13 = this.gson.mo18181w(list2);
        }
        C43443b<BankApiResponse<PreContractEntity>> lndOfferPrecontractTemplate = mBankService.getLndOfferPrecontractTemplate(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str13, bigDecimal, bigDecimal2, str11, str12);
        restCallback2.setCall(lndOfferPrecontractTemplate);
        lndOfferPrecontractTemplate.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void attachFile(String str, String str2, String str3, AttachmentTypeConst attachmentTypeConst, RestCallback<BankApiResponse<Integer>> restCallback) {
        C43443b<BankApiResponse<Integer>> attachFile = mBankService.attachFile("COMMON_ADD_FILE_ATTACHMENT", str, str2, str3, attachmentTypeConst);
        restCallback.setCall(attachFile);
        attachFile.mo102158i(new RetrofitCallback(restCallback));
    }

    public void buyTCCWithPoints(String str, String str2, String str3, String str4, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> buyTCCWithPoints = mBankService.buyTCCWithPoints("BONUSES_BUY_TCC_FROM_BNS_POINTS", str, str2, str3, str4);
        restCallback.setCall(buyTCCWithPoints);
        buyTCCWithPoints.mo102158i(new RetrofitCallback(restCallback));
    }

    public void changeAcctName(long j, String str, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> changeAcctName = mBankService.changeAcctName("ACCOUNTS_CHANGE_ALL_NAMES_BY_MAIN_ACCT_KEY", j, str);
        restCallback.setCall(changeAcctName);
        changeAcctName.mo102158i(new RetrofitCallback(restCallback));
    }

    public void changeClientProductDefault(String str, String str2, String str3, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> changeClientProductDefault = mBankService.changeClientProductDefault("COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT", str, str2, str3);
        restCallback.setCall(changeClientProductDefault);
        changeClientProductDefault.mo102158i(new RetrofitCallback(restCallback));
    }

    public void changeDeviceLanguage(RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> changeDeviceLanguage = mBankService.changeDeviceLanguage(BankApi.COMMON_CHANGE_DEVICE_LANGUAGE);
        restCallback.setCall(changeDeviceLanguage);
        changeDeviceLanguage.mo102158i(new RetrofitCallback(restCallback));
    }

    public void changeTransactionComputability(Long l, Long l2, int i, Long l3, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> changeTransactionComputability = mBankService.changeTransactionComputability(BankApi.SERVICE_PFM_TRANSACTION_DATA, l, l2, i, l3);
        restCallback.setCall(changeTransactionComputability);
        changeTransactionComputability.mo102158i(new RetrofitCallback(restCallback));
    }

    public void checkCadastralCode(String str, RestCallback<BankApiResponse<String>> restCallback) {
        C43443b<BankApiResponse<String>> checkCadastralCode = mBankService.checkCadastralCode("TRANSFERS_CHECK_CADASTRE_CODE", str);
        restCallback.setCall(checkCadastralCode);
        checkCadastralCode.mo102158i(new RetrofitCallback(restCallback));
    }

    public void checkDepLoanCalculation(Long l, String str, String str2, String str3, RestCallback<BankApiResponse<DepLoanCalculation>> restCallback) {
        C43443b<BankApiResponse<DepLoanCalculation>> checkDepLoanCalculation = mBankService.checkDepLoanCalculation("LOANS_DEP_CHECK_CALCULATION", l.longValue(), str, str2, str3);
        restCallback.setCall(checkDepLoanCalculation);
        checkDepLoanCalculation.mo102158i(new RetrofitCallback(restCallback));
    }

    public void checkIsBOGCard(String str, RestCallback<BankApiResponse<Boolean>> restCallback) {
        C43443b<BankApiResponse<Boolean>> checkIsBOGCard = mBankService.checkIsBOGCard("CARDS_IS_BANK_CARD", str);
        restCallback.setCall(checkIsBOGCard);
        checkIsBOGCard.mo102158i(new RetrofitCallback(restCallback));
    }

    public void checkLimitLoanDecision(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<LimitLoanRefinanceInfo> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str8, RestCallback<BankApiResponse<LimitLoanDecisionEntity>> restCallback) {
        String str9;
        List<LimitLoanRefinanceInfo> list2 = list;
        RestCallback<BankApiResponse<LimitLoanDecisionEntity>> restCallback2 = restCallback;
        if (list2 == null) {
            str9 = "";
        } else {
            str9 = this.gson.mo18181w(list2);
        }
        C43443b<BankApiResponse<LimitLoanDecisionEntity>> checkLimitLoanDecision = mBankService.checkLimitLoanDecision(BankApi.OFFERS_CHECK_LIMIT_LOAN_DECISION, j, str, str2, str3, str4, str5, str6, str7, str9, bigDecimal, bigDecimal2, str8);
        restCallback2.setCall(checkLimitLoanDecision);
        checkLimitLoanDecision.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void convertCurrency(String str, String str2, String str3, String str4, RestCallback<BankApiResponse<ConvertCurrencyResult>> restCallback) {
        C43443b<BankApiResponse<ConvertCurrencyResult>> convertCcy = mBankService.convertCcy(BankApi.COMMON_GET_COMMERCIAL_RATE_AMOUNT, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, str, str2, str3, str4);
        restCallback.setCall(convertCcy);
        convertCcy.mo102158i(new RetrofitCallback(restCallback));
    }

    public void deleteSavedCard(String str, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> deleteSavedCard = mBankService.deleteSavedCard(BankApi.COMMON_DELETE_CLIENT_CARD, str);
        restCallback.setCall(deleteSavedCard);
        deleteSavedCard.mo102158i(new RetrofitCallback(restCallback));
    }

    public void deleteTemplate(long j, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> deleteTemplate = mBankService.deleteTemplate(BankApi.TEMPLATES_DELETE_TEMPLATE, j);
        restCallback.setCall(deleteTemplate);
        deleteTemplate.mo102158i(new RetrofitCallback(restCallback));
    }

    public void deleteTemplateGroup(String str, TemplateGroup templateGroup, RestCallback<BankApiResponse<Object>> restCallback) {
        templateGroup.setStatus("D");
        String w = this.gsonWithExposes.mo18181w(templateGroup);
        C32359z0.m95575j0(w);
        C43443b<BankApiResponse<Object>> deleteTemplateGroup = mBankService.deleteTemplateGroup(BankApi.COLLECTOR_MODIFY_TEMPLATE_GROUP, str, w, "DELETE");
        restCallback.setCall(deleteTemplateGroup);
        deleteTemplateGroup.mo102158i(new RetrofitCallback(restCallback));
    }

    public void foreignTransferGetCountries(RestCallback<BankApiResponse<List<BogCountry>>> restCallback) {
        C43443b<BankApiResponse<List<BogCountry>>> foreignTransferGetCountries = mBankService.foreignTransferGetCountries("COMMON_GET_COUNTRIES");
        restCallback.setCall(foreignTransferGetCountries);
        foreignTransferGetCountries.mo102158i(new RetrofitCallback(restCallback));
    }

    public void foreignTransferGetReportingCodes(String str, RestCallback<BankApiResponse<List<ReportingCode>>> restCallback) {
        C43443b<BankApiResponse<List<ReportingCode>>> foreignTransferGetReportingCodes = mBankService.foreignTransferGetReportingCodes("TRANSFERS_GET_REPORTING_CODES", str);
        restCallback.setCall(foreignTransferGetReportingCodes);
        foreignTransferGetReportingCodes.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getAccountLovDebits(RestCallback<BankApiResponse<AccountDebitLoveWrapper>> restCallback) {
        C43443b<BankApiResponse<AccountDebitLoveWrapper>> accountLovDebits = mBankService.getAccountLovDebits("DEBITS_GET_CARD_DEBITS_AND_ACCOUNTS_LOV");
        restCallback.setCall(accountLovDebits);
        accountLovDebits.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getAccountOperations(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i, int i2, Integer num, RestCallback<BankApiResponse<OperationResponse>> restCallback) {
        RestCallback<BankApiResponse<OperationResponse>> restCallback2 = restCallback;
        C43443b<BankApiResponse<OperationResponse>> accountOperations = mBankService.getAccountOperations("ACCOUNTS_GET_MY_OPERATIONS_WITH_DETAILS_AND_PFM", l, l2, l3, l4, l5, l6, str, str2, i, i2, num);
        restCallback2.setCall(accountOperations);
        accountOperations.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getAccountReportId(Long l, Long l2, Long l3, Long l4, Long l5, RestCallback<BankApiResponse<AccountReportId>> restCallback) {
        String str;
        if (l3 != null) {
            str = "LOANS_GET_REPORT_ID";
        } else if (l2 != null) {
            str = "DEPOSITS_GET_REPORT_ID";
        } else {
            str = "ACCOUNTS_GET_REPORT_ID";
        }
        C43443b<BankApiResponse<AccountReportId>> accountReportId = mBankService.getAccountReportId(str, l, l2, l3, l4, l5);
        restCallback.setCall(accountReportId);
        accountReportId.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getAccountStatement(long j, long j2, String str, int i, int i2, RestCallback<BankApiResponse<AccountStatementWrapper>> restCallback) {
        RestCallback<BankApiResponse<AccountStatementWrapper>> restCallback2 = restCallback;
        C43443b<BankApiResponse<AccountStatementWrapper>> accountStatement = mBankService.getAccountStatement("ACCOUNTS_GET_STATEMENT", j, j2, str, (long) i, (long) i2);
        restCallback2.setCall(accountStatement);
        accountStatement.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getAccountsLov(RestCallback<BankApiResponse<AccountLovContainer>> restCallback) {
        C43443b<BankApiResponse<AccountLovContainer>> accountsLov = mBankService.getAccountsLov("TRANSFERS_GET_ACCOUNTS_LOV_DETAILS");
        restCallback.setCall(accountsLov);
        accountsLov.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getAcctOwnerInfo(String str, String str2, String str3, RestCallback<BankApiResponse<AccountOwnerInfoWrapper>> restCallback) {
        C43443b<BankApiResponse<AccountOwnerInfoWrapper>> acctOwnerInfo = mBankService.getAcctOwnerInfo("COLLECTOR_GET_OWNER_AND_ACCOUNT_INFO", str, str2, str3);
        restCallback.setCall(acctOwnerInfo);
        acctOwnerInfo.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getAcctOwnerInfoMasked(String str, String str2, String str3, RestCallback<BankApiResponse<AccountOwnerInfoWrapper>> restCallback) {
        C43443b<BankApiResponse<AccountOwnerInfoWrapper>> acctOwnerInfo = mBankService.getAcctOwnerInfo("COLLECTOR_GET_OWNER_INFO_AND_MASKED_ACCOUNTS_BY_PIN", str, str2, str3);
        restCallback.setCall(acctOwnerInfo);
        acctOwnerInfo.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getAcctOwnerInfoMaskedWithPhone(String str, String str2, RestCallback<BankApiResponse<AccountOwnerInfoWrapper>> restCallback) {
        getAcctOwnerInfoMaskedWithPhone(str, str2, (GettingPhoneOwnerPurpose) null, restCallback);
    }

    public void getAgreementTextTemplate(String str, RestCallback<BankApiResponse<ContractEntity>> restCallback) {
        C43443b<BankApiResponse<ContractEntity>> agreementTextTemplate = mBankService.getAgreementTextTemplate("COMMON_GET_CONTRACT", str);
        restCallback.setCall(agreementTextTemplate);
        agreementTextTemplate.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getBonds(RestCallback<BankApiResponse<BondsWrapper>> restCallback) {
        C43443b<BankApiResponse<BondsWrapper>> bonds = mBankService.getBonds("GT_GET_AGREEMENTS_AND_DETAILS");
        restCallback.setCall(bonds);
        bonds.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getBonusPrizeHistory(BonusType bonusType, RestCallback<BankApiResponse<BonusPrizeList>> restCallback) {
        C43443b<BankApiResponse<BonusPrizeList>> bonusPrizeHistory = mBankService.getBonusPrizeHistory("BONUSES_GET_CLIENT_PRIZE_LIST", bonusType.name());
        restCallback.setCall(bonusPrizeHistory);
        bonusPrizeHistory.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getBonusStatementByType(int i, int i2, String str, Long l, Long l2, int i3, RestCallback<BankApiResponse<BonusStatementDetailsWrapper>> restCallback) {
        C43443b<BankApiResponse<BonusStatementDetailsWrapper>> bonusStatementByType = mBankService.getBonusStatementByType("BONUSES_GET_BONUS_STATEMENT", i, i2, str, l, l2, i3);
        restCallback.setCall(bonusStatementByType);
        bonusStatementByType.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getCTParkPaymentDebt(String str, String str2, String str3, String str4, String str5, RestCallback<BankApiResponse<CarCTParkResponse>> restCallback) {
        C43443b<BankApiResponse<CarCTParkResponse>> cTParkPaymentDebt = mBankService.getCTParkPaymentDebt(str, str3, str4, str5, str2);
        restCallback.setCall(cTParkPaymentDebt);
        cTParkPaymentDebt.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getCardInsuranceTypes(String str, RestCallback<BankApiResponse<InsuranceType[]>> restCallback) {
        C43443b<BankApiResponse<InsuranceType[]>> cardInsuranceTypes = mBankService.getCardInsuranceTypes("CARDS_GET_INSURANCE_TYPES", str);
        restCallback.setCall(cardInsuranceTypes);
        cardInsuranceTypes.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getCardsForLoanOffer(String str, RestCallback<BankApiResponse<List<LoanOfferCard>>> restCallback) {
        C43443b<BankApiResponse<List<LoanOfferCard>>> cardsForLoanOffer = mBankService.getCardsForLoanOffer(BankApi.CARDS_GET_CARDS_FOR_LOAN_OFFER, str);
        restCallback.setCall(cardsForLoanOffer);
        cardsForLoanOffer.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getCasStatement(long j, Long l, Long l2, int i, int i2, RestCallback<BankApiResponse<CasStatementWrapper>> restCallback) {
        RestCallback<BankApiResponse<CasStatementWrapper>> restCallback2 = restCallback;
        long j2 = j;
        C43443b<BankApiResponse<CasStatementWrapper>> casStatement = mBankService.getCasStatement("CAS_GET_STATEMENT", j2, l.longValue(), l2.longValue(), (long) i, (long) i2);
        restCallback2.setCall(casStatement);
        casStatement.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getCashCoverLoanPreContract(Double d, Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l, Long l2, int i, BigDecimal bigDecimal4, Double d3, Double d4, String str, BigDecimal bigDecimal5, String str2, String str3, Long l3, String str4, RestCallback<BankApiResponse<PreContractEntity>> restCallback) {
        RestCallback<BankApiResponse<PreContractEntity>> restCallback2 = restCallback;
        C43443b<BankApiResponse<PreContractEntity>> cashCoverLoanPreContract = mBankService.getCashCoverLoanPreContract("LOANS_GET_CASH_COVER_PRE_CONTRACT_TEMPLATE", d, d2, bigDecimal, bigDecimal2, bigDecimal3, l, l2, i, bigDecimal4, d3, d4, str, bigDecimal5, str2, str3, l3, str4);
        restCallback2.setCall(cashCoverLoanPreContract);
        cashCoverLoanPreContract.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getCashbackStatement(Long l, Long l2, int i, int i2, int i3, RestCallback<BankApiResponse<CashBackStatementWrapper>> restCallback) {
        C43443b<BankApiResponse<CashBackStatementWrapper>> cashbackStatement = mBankService.getCashbackStatement("BONUSES_GET_CASHBACK_STATEMENT", l, l2, i, i2, i3);
        restCallback.setCall(cashbackStatement);
        cashbackStatement.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getCcyRates(RestCallback<BankApiResponse<CcyRatesWrapper>> restCallback) {
        C43443b<BankApiResponse<CcyRatesWrapper>> ccyRates = mBankService.getCcyRates("CCY_GET_OFFICIAL_AND_COMMERCIAL_RATES", 1);
        restCallback.setCall(ccyRates);
        ccyRates.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getCountryCodeBySwift(String str, RestCallback<BankApiResponse<TransferCountryCode>> restCallback) {
        C43443b<BankApiResponse<TransferCountryCode>> countryCodeBySwift = mBankService.getCountryCodeBySwift("TRANSFERS_GET_COUNTRY_CODE_BY_SWIFT", str);
        restCallback.setCall(countryCodeBySwift);
        countryCodeBySwift.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getDDAccounts(RestCallback<BankApiResponse<ArrayList<DDPaymentAccount>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<DDPaymentAccount>>> dDAccounts = mBankService.getDDAccounts("DEBITS_GET_ACCOUNTS_LOV");
        restCallback.setCall(dDAccounts);
        dDAccounts.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getDDPeriodTypes(RestCallback<BankApiResponse<ArrayList<STOPeriodType>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<STOPeriodType>>> dDPeriodTypes = mBankService.getDDPeriodTypes("DEBITS_GET_PERIODS");
        restCallback.setCall(dDPeriodTypes);
        dDPeriodTypes.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getDDProviders(RestCallback<BankApiResponse<ArrayList<DDProviderItem>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<DDProviderItem>>> dDProviders = mBankService.getDDProviders(BankApi.DEBITS_GET_PROVIDERS_AND_SERVICES);
        restCallback.setCall(dDProviders);
        dDProviders.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getDDSTOList(RestCallback<BankApiResponse<ArrayList<DDSTO>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<DDSTO>>> dDSTOList = mBankService.getDDSTOList("DEBITS_GET_DEBIT_PAYMENTS_AND_DETAILS");
        restCallback.setCall(dDSTOList);
        dDSTOList.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getDepLoanAgreements(RestCallback<BankApiResponse<List<DepLoanAgreement>>> restCallback) {
        C43443b<BankApiResponse<List<DepLoanAgreement>>> depLoanAgreements = mBankService.getDepLoanAgreements("LOANS_DEP_GET_AGREEMENTS");
        restCallback.setCall(depLoanAgreements);
        depLoanAgreements.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getDepLoanCalculation(Long l, String str, RestCallback<BankApiResponse<DepLoanCalculation>> restCallback) {
        C43443b<BankApiResponse<DepLoanCalculation>> depLoanCalculation = mBankService.getDepLoanCalculation("LOANS_DEP_GET_CALCULATION", l.longValue(), str);
        restCallback.setCall(depLoanCalculation);
        depLoanCalculation.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getDomesticTransferNominations(String str, String str2, String str3, RestCallback<BankApiResponse<String>> restCallback) {
        C43443b<BankApiResponse<String>> domesticTransferNominations = mBankService.getDomesticTransferNominations("TRANSFERS_GET_TRANSFER_DEFAULT_NOMINATION", str, str2, str3);
        restCallback.setCall(domesticTransferNominations);
        domesticTransferNominations.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getExpressCards(RestCallback<BankApiResponse<ArrayList<PaymentsCard>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<PaymentsCard>>> expressCards = mBankService.getExpressCards("CARDS_GET_EXPRESS_CARDS");
        restCallback.setCall(expressCards);
        expressCards.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getExpressProviders(String str, String str2, RestCallback<BankApiResponse<ArrayList<BonusProvider>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<BonusProvider>>> expressProviders = mBankService.getExpressProviders("BONUSES_GET_PAY_PROVIDERS", str, str2);
        restCallback.setCall(expressProviders);
        expressProviders.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getFeatureFeedback(RestCallback<BankApiResponse<List<FeatureFeedback>>> restCallback) {
        C43443b<BankApiResponse<List<FeatureFeedback>>> featureFeedback = mBankService.getFeatureFeedback("COMMON_GET_FEATURE_FEEDBACK");
        restCallback.setCall(featureFeedback);
        featureFeedback.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getFileAttachmentInfo(AttachmentTypeConst attachmentTypeConst, RestCallback<BankApiResponse<FileAttachmentInfo>> restCallback) {
        C43443b<BankApiResponse<FileAttachmentInfo>> fileAttachmentInfo = mBankService.getFileAttachmentInfo("COMMON_GET_FILE_ATTACHMENT_INFO", attachmentTypeConst);
        restCallback.setCall(fileAttachmentInfo);
        fileAttachmentInfo.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getForeignBankList(String str, int i, int i2, RestCallback<BankApiResponse<ForeignBankList>> restCallback) {
        C43443b<BankApiResponse<ForeignBankList>> foreignBankList = mBankService.getForeignBankList("TRANSFERS_GET_SWIFTS_BY_KEYWORD", str, i, i2);
        restCallback.setCall(foreignBankList);
        foreignBankList.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getInTransferDetails(long j, String str, String str2, Long l, Long l2, Long l3, RestCallback<BankApiResponse<List<InTransferDetail>>> restCallback) {
        RestCallback<BankApiResponse<List<InTransferDetail>>> restCallback2 = restCallback;
        C43443b<BankApiResponse<List<InTransferDetail>>> inTransferDetails = mBankService.getInTransferDetails("COLLECTOR_GET_MY_OPERATION_DETAILS_AND_PFM", C32359z0.m95554Y(), Long.valueOf(j), str, str2, l, l2, l3);
        restCallback2.setCall(inTransferDetails);
        inTransferDetails.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getLimitLoanDecision(String str, String str2, String str3, RestCallback<BankApiResponse<LimitLoanDecisionEntity>> restCallback) {
        C43443b<BankApiResponse<LimitLoanDecisionEntity>> limitLoanDecision = mBankService.getLimitLoanDecision(BankApi.OFFERS_GET_LIMIT_LOAN_DECISION, str, str2, str3);
        restCallback.setCall(limitLoanDecision);
        limitLoanDecision.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getLndOfferPreContractTemplate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<LimitLoanRefinanceInfo> list, BigDecimal bigDecimal, String str10, String str11, RestCallback<BankApiResponse<PreContractEntity>> restCallback) {
        getLoanOfferPreContractTemplate(BankApi.OFFERS_GET_LND_PRE_CONTRACT_TEMPLATE, str, str2, str3, str4, str5, str6, str7, str8, str9, list, bigDecimal, (BigDecimal) null, str10, str11, restCallback);
    }

    public void getLoanHistory(long j, boolean z, RestCallback<BankApiResponse<LoanHistoryWrapper>> restCallback) {
        String str;
        IRetrofitService iRetrofitService = mBankService;
        if (z) {
            str = "LOANS_GET_PLN_REPAYMENTS";
        } else {
            str = "LOANS_GET_LND_REPAYMENTS";
        }
        C43443b<BankApiResponse<LoanHistoryWrapper>> loansHistory = iRetrofitService.getLoansHistory(str, j);
        restCallback.setCall(loansHistory);
        loansHistory.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getLoanSchedules(long j, RestCallback<BankApiResponse<LoanScheduleWrapper>> restCallback) {
        C43443b<BankApiResponse<LoanScheduleWrapper>> loansSchedule = mBankService.getLoansSchedule("LOANS_GET_LND_SCHEDULE", j);
        restCallback.setCall(loansSchedule);
        loansSchedule.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getMapObjectDetails(String str, String str2, RestCallback<BankApiResponse<ArrayList<MapObjectDetail>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<MapObjectDetail>>> mapObjectDetails = mBankService.getMapObjectDetails("COMMON_GET_SC_OBJECT_SCHEDULE", str, str2);
        restCallback.setCall(mapObjectDetails);
        mapObjectDetails.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getMapObjectStatus(String str, String str2, String str3, RestCallback<BankApiResponse<String>> restCallback) {
        C43443b<BankApiResponse<String>> mapObjectStatus = mBankService.getMapObjectStatus("TERMINAL_MONITORING_GET_OBJECT_STATUS", str, str2, str3);
        restCallback.setCall(mapObjectStatus);
        mapObjectStatus.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getMapObjects(RestCallback<BankApiResponse<List<MapObject>>> restCallback) {
        C43443b<BankApiResponse<List<MapObject>>> mapObjects = mBankService.getMapObjects(BankApi.COMMON_GET_SC_OBJECTS);
        restCallback.setCall(mapObjects);
        mapObjects.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getMapRegions(RestCallback<BankApiResponse<ArrayList<MapRegion>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<MapRegion>>> mapRegions = mBankService.getMapRegions(BankApi.COMMON_GET_SC_ROUTES, BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
        restCallback.setCall(mapRegions);
        mapRegions.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getMaxInvoiceCount(RestCallback<BankApiResponse<Integer>> restCallback) {
        C43443b<BankApiResponse<Integer>> foreignTransferMaxInvoiceCount = mBankService.getForeignTransferMaxInvoiceCount("TRANSFERS_MAX_INVOICE_COUNT");
        restCallback.setCall(foreignTransferMaxInvoiceCount);
        foreignTransferMaxInvoiceCount.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getMerchantsByName(String str, int i, int i2, RestCallback<BankApiResponse<List<Merchant>>> restCallback) {
        C43443b<BankApiResponse<List<Merchant>>> merchantsByName = mBankService.getMerchantsByName("PAYMENTS_GET_MERCHANTS_AND_PROVIDERS", str, i, i2);
        restCallback.setCall(merchantsByName);
        merchantsByName.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getNotificationList(RestCallback<BankApiResponse<NotificationList>> restCallback) {
        C43443b<BankApiResponse<NotificationList>> notificationList = mBankService.getNotificationList("NOTIF_GET_CUSTOMER_NOTIFICATIONS_AND_DETAILS");
        restCallback.setCall(notificationList);
        notificationList.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getNotificationsCount(String str, RestCallback<BankApiResponse<NotificationCount>> restCallback) {
        C43443b<BankApiResponse<NotificationCount>> notificationsCount = mBankService.getNotificationsCount("NOTIF_GET_CUSTOMER_UNREAD_NOTIF_COUNT_V2", str);
        restCallback.setCall(notificationsCount);
        notificationsCount.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getOperationDetails(long j, long j2, RestCallback<BankApiResponse<OperationResponse>> restCallback) {
        String str;
        if (j > 0) {
            str = String.valueOf(j);
        } else {
            str = "";
        }
        C43443b<BankApiResponse<OperationResponse>> operationDetails = mBankService.getOperationDetails("ACCOUNTS_GET_MY_OPERATIONS_WITH_DETAILS_AND_PFM", str, j2);
        restCallback.setCall(operationDetails);
        operationDetails.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getOperationPfmDetails(Long l, String str, String str2, Long l2, Long l3, Long l4, RestCallback<BankApiResponse<OperationPfmDetails>> restCallback) {
        RestCallback<BankApiResponse<OperationPfmDetails>> restCallback2 = restCallback;
        C43443b<BankApiResponse<OperationPfmDetails>> operationPfmDetails = mBankService.getOperationPfmDetails("COLLECTOR_GET_MY_OPERATION_DETAILS_AND_PFM", C32359z0.m95554Y(), l, str, str2, l2, l3, l4);
        restCallback2.setCall(operationPfmDetails);
        operationPfmDetails.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getOperationPfmDetailsList(Long l, String str, String str2, Long l2, Long l3, Long l4, RestCallback<BankApiResponse<List<OperationPfmDetails>>> restCallback) {
        RestCallback<BankApiResponse<List<OperationPfmDetails>>> restCallback2 = restCallback;
        C43443b<BankApiResponse<List<OperationPfmDetails>>> operationPfmDetailsList = mBankService.getOperationPfmDetailsList("COLLECTOR_GET_MY_OPERATION_DETAILS_AND_PFM", C32359z0.m95554Y(), l, str, str2, l2, l3, l4);
        restCallback2.setCall(operationPfmDetailsList);
        operationPfmDetailsList.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getOutTransferDetails(long j, String str, String str2, Long l, Long l2, Long l3, RestCallback<BankApiResponse<TransferHistoryItem>> restCallback) {
        RestCallback<BankApiResponse<TransferHistoryItem>> restCallback2 = restCallback;
        C43443b<BankApiResponse<TransferHistoryItem>> outTransferDetails = mBankService.getOutTransferDetails("COLLECTOR_GET_MY_OPERATION_DETAILS_AND_PFM", C32359z0.m95554Y(), Long.valueOf(j), str, str2, l, l2, l3);
        restCallback2.setCall(outTransferDetails);
        outTransferDetails.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getPasswordRules(RestCallback<BankApiResponse<PasswordRules>> restCallback) {
        C43443b<BankApiResponse<PasswordRules>> passwordRules = mBankService.getPasswordRules(BankApi.IDENTITY_GET_PASS_POLICY_RULES);
        restCallback.setCall(passwordRules);
        passwordRules.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPaymentDebt(String str, String str2, String str3, RestCallback<BankApiResponse<PaymentDebtResponse>> restCallback) {
        C43443b<BankApiResponse<PaymentDebtResponse>> executePayment = mBankService.executePayment(BankApi.SERVICE_PAYMENTS_EXECUTE, str, str2, str3);
        restCallback.setCall(executePayment);
        executePayment.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPaymentDetails(long j, String str, String str2, Long l, Long l2, Long l3, RestCallback<BankApiResponse<List<PaymentDetail>>> restCallback) {
        RestCallback<BankApiResponse<List<PaymentDetail>>> restCallback2 = restCallback;
        C43443b<BankApiResponse<List<PaymentDetail>>> paymentDetails = mBankService.getPaymentDetails("COLLECTOR_GET_MY_OPERATION_DETAILS_AND_PFM", C32359z0.m95554Y(), Long.valueOf(j), str, str2, l, l2, l3);
        restCallback2.setCall(paymentDetails);
        paymentDetails.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getPaymentRequestId(String str, RestCallback<BankApiResponse<Long>> restCallback) {
        C43443b<BankApiResponse<Long>> paymentRequestId = mBankService.getPaymentRequestId("COMMON_GET_SERVICE_OPERATION_ID", str);
        restCallback.setCall(paymentRequestId);
        paymentRequestId.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPaymentsCommissions(String str, HashMap<String, Object> hashMap, RestCallback<BankApiResponse<PaymentCommissionEntity>> restCallback) {
        C43443b<BankApiResponse<PaymentCommissionEntity>> paymentsCommissions = mBankService.getPaymentsCommissions(str, hashMap);
        restCallback.setCall(paymentsCommissions);
        paymentsCommissions.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPaymentsLastOperationWithEssId(String str, RestCallback<BankApiResponse<LastOperation>> restCallback) {
        C43443b<BankApiResponse<LastOperation>> paymentsLastOperation = mBankService.getPaymentsLastOperation(BankApi.SERVICE_PAYMENTS_LAST_OPERATIONS, str);
        restCallback.setCall(paymentsLastOperation);
        paymentsLastOperation.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPaymentsLastOperations(Long l, int i, int i2, boolean z, RestCallback<BankApiResponse<List<LastOperation>>> restCallback) {
        C43443b<BankApiResponse<List<LastOperation>>> paymentsLastOperations = mBankService.getPaymentsLastOperations(z ? BankApi.SERVICE_PAYMENTS_LAST_OPERATIONS : null, l, i, i2);
        restCallback.setCall(paymentsLastOperations);
        paymentsLastOperations.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPaymentsProviderConfiguration(String str, String str2, String str3, String str4, RestCallback<BankApiResponse<List<PaymentProviderConfiguration>>> restCallback) {
        C43443b<BankApiResponse<List<PaymentProviderConfiguration>>> paymentsProviderConfiguration = mBankService.getPaymentsProviderConfiguration("PAYMENTS_GET_PROVIDER_CONFIGURATIONS", str4, str3, str, str2);
        restCallback.setCall(paymentsProviderConfiguration);
        paymentsProviderConfiguration.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPensionStatus(RestCallback<BankApiResponse<PensionStatusResult>> restCallback) {
        C43443b<BankApiResponse<PensionStatusResult>> pensionStatus = mBankService.getPensionStatus("PENSION_GET_ACCESS_STATUS");
        restCallback.setCall(pensionStatus);
        pensionStatus.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPushNotifications(String str, int i, int i2, RestCallback<BankApiResponse<PushHistoryObject>> restCallback) {
        C43443b<BankApiResponse<PushHistoryObject>> pushNotificationList = mBankService.getPushNotificationList("SMSNOTIFS_GET_PUSH_NOTIFICATION_HISTORY_V2", str, i, i2);
        restCallback.setCall(pushNotificationList);
        pushNotificationList.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getRatesHistory(long j, long j2, RestCallback<BankApiResponse<CcyHistoryWrapper>> restCallback) {
        C43443b<BankApiResponse<CcyHistoryWrapper>> ratesHistory = mBankService.getRatesHistory(BankApi.SERVICE_CCY_GET_RATES_HISTORY, j, j2);
        restCallback.setCall(ratesHistory);
        ratesHistory.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getSMSNotificationsList(RestCallback<BankApiResponse<ArrayList<SMSContact>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<SMSContact>>> sMSNotificationsList = mBankService.getSMSNotificationsList(BankApi.SMSNOTIFS_GET_NOTIFICATION_HIERARCHY, "ALL");
        restCallback.setCall(sMSNotificationsList);
        sMSNotificationsList.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getSTOPeriodTypes(RestCallback<BankApiResponse<ArrayList<STOPeriodType>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<STOPeriodType>>> sTOPeriodTypes = mBankService.getSTOPeriodTypes("DEBITS_GET_STO_PERIOD_TYPES");
        restCallback.setCall(sTOPeriodTypes);
        sTOPeriodTypes.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getSavedCards(String str, RestCallback<BankApiResponse<ArrayList<PaymentsCard>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<PaymentsCard>>> savedCards = mBankService.getSavedCards(BankApi.COMMON_GET_CLIENT_CARDS, str);
        restCallback.setCall(savedCards);
        savedCards.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getScoolCardStatement(long j, long j2, long j3, Integer num, Integer num2, RestCallback<BankApiResponse<ArrayList<ScoolCardStatementItem>>> restCallback) {
        RestCallback<BankApiResponse<ArrayList<ScoolCardStatementItem>>> restCallback2 = restCallback;
        C43443b<BankApiResponse<ArrayList<ScoolCardStatementItem>>> scoolCardStatement = mBankService.getScoolCardStatement("SCOOLCARDS_GET_STATEMENT", j, j2, j3, num, num2);
        restCallback2.setCall(scoolCardStatement);
        scoolCardStatement.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getSelectedPayments(RestCallback<BankApiResponse<ArrayList<SelectedPayment>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<SelectedPayment>>> selectedPayments = mBankService.getSelectedPayments(BankApi.SERVICE_GET_SELECTED_PAYMENTS);
        restCallback.setCall(selectedPayments);
        selectedPayments.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getTemplatesBasket(Boolean bool, String str, int i, int i2, int i3, String str2, RestCallback<BankApiResponse<TemplateBasketItemsWithPaymentConfig>> restCallback) {
        if (bool.booleanValue()) {
            C43443b<BankApiResponse<TemplateBasketItemsWithPaymentConfig>> templatesBasket = mBankService.getTemplatesBasket("", str, i, i2, i3, str2, BankApi.SERVICE_COLLECTOR_GET_TEMPLATES_AND_CONFIG);
            restCallback.setCall(templatesBasket);
            templatesBasket.mo102158i(new RetrofitCallback(restCallback));
        }
    }

    public void getTemplatesByType(String str, int i, int i2, int i3, RestCallback<BankApiResponse<ArrayList<TemplateBasketItem>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<TemplateBasketItem>>> templatesByType = mBankService.getTemplatesByType("TEMPLATES_GET_TEMPLATES", str, i, i2, i3);
        restCallback.setCall(templatesByType);
        templatesByType.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getTransferBeneficiaries(RestCallback<BankApiResponse<ArrayList<Beneficiary>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<Beneficiary>>> transferBeneficiaries = mBankService.getTransferBeneficiaries("TRANSFERS_GET_RECENT_BENEFICIARIES");
        restCallback.setCall(transferBeneficiaries);
        transferBeneficiaries.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getTransferCommission(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RestCallback<BankApiResponse<MoneyTransferCommissionApiModel>> restCallback) {
        RestCallback<BankApiResponse<MoneyTransferCommissionApiModel>> restCallback2 = restCallback;
        C43443b<BankApiResponse<MoneyTransferCommissionApiModel>> transferCommission = mBankService.getTransferCommission("TRANSFERS_GET_COMMISSION_PARAMETERS", str, str2, str3, str4, str5, str6, str7, str8);
        restCallback2.setCall(transferCommission);
        transferCommission.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getTransferDetailsPfm(String str, String str2, Long l, Long l2, String str3, Long l3, RestCallback<BankApiResponse<TransferHistoryItem>> restCallback) {
        RestCallback<BankApiResponse<TransferHistoryItem>> restCallback2 = restCallback;
        C43443b<BankApiResponse<TransferHistoryItem>> transferDetailsPfm = mBankService.getTransferDetailsPfm("COLLECTOR_GET_MY_OPERATION_DETAILS_AND_PFM", C32359z0.m95554Y(), Long.valueOf(Long.parseLong(str)), str2, str3, l, (Long) null, l3);
        restCallback2.setCall(transferDetailsPfm);
        transferDetailsPfm.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getTransferNominations(String str, String str2, String str3, String str4, String str5, RestCallback<BankApiResponse<ArrayList<TransferNomination>>> restCallback) {
        if (str4 != null) {
            str4 = str4.toUpperCase();
        }
        C43443b<BankApiResponse<ArrayList<TransferNomination>>> transferNominations = mBankService.getTransferNominations("TRANSFERS_GET_DOC_TYPE_NOMINATIONS", str, str2, str3, str4, str5);
        restCallback.setCall(transferNominations);
        transferNominations.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getTreasureOwnerInfo(String str, String str2, String str3, RestCallback<BankApiResponse<TreasureCodeInfo>> restCallback) {
        C43443b<BankApiResponse<TreasureCodeInfo>> treasureOwnerInfo = mBankService.getTreasureOwnerInfo("TRANSFERS_GET_TREASURE_CODE_INFO", str, str2, str3);
        restCallback.setCall(treasureOwnerInfo);
        treasureOwnerInfo.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getUtilityPaymentDetails(long j, String str, String str2, Long l, Long l2, Long l3, RestCallback<BankApiResponse<List<LastOperation>>> restCallback) {
        RestCallback<BankApiResponse<List<LastOperation>>> restCallback2 = restCallback;
        C43443b<BankApiResponse<List<LastOperation>>> utilityPaymentDetails = mBankService.getUtilityPaymentDetails("COLLECTOR_GET_MY_OPERATION_DETAILS_AND_PFM", C32359z0.m95554Y(), Long.valueOf(j), str, str2, l, l2, l3);
        restCallback2.setCall(utilityPaymentDetails);
        utilityPaymentDetails.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void getVouchers(String str, String str2, String str3, RestCallback<BankApiResponse<PaymentVoucher[]>> restCallback) {
        C43443b<BankApiResponse<PaymentVoucher[]>> vouchers = mBankService.getVouchers("BONUSES_GET_VOUCHERS", str, str2, str3);
        restCallback.setCall(vouchers);
        vouchers.mo102158i(new RetrofitCallback(restCallback));
    }

    public void hideClientProduct(String str, String str2, String str3, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> hideClientProduct = mBankService.hideClientProduct("COMMON_CHANGE_CLIENT_PRODUCT_HIDE", str, str2, str3);
        restCallback.setCall(hideClientProduct);
        hideClientProduct.mo102158i(new RetrofitCallback(restCallback));
    }

    public void joinBonusProgram(RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> joinBonusProgram = mBankService.joinBonusProgram("BONUSES_REGISTER_CLIENT");
        restCallback.setCall(joinBonusProgram);
        joinBonusProgram.mo102158i(new RetrofitCallback(restCallback));
    }

    public void loadMobileData(DeviceDataReport deviceDataReport, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> loadMobileData = mBankService.loadMobileData(BankApi.COMMON_LOAD_MOBILE_DATA, this.gson.mo18181w(deviceDataReport));
        restCallback.setCall(loadMobileData);
        loadMobileData.mo102158i(new RetrofitCallback(restCallback));
    }

    public void makePushNotificationAction(RestCallback<BankApiResponse<Object>> restCallback, String str, String str2) {
        C43443b<BankApiResponse<Object>> makePushNotificationAction = mBankService.makePushNotificationAction("SMSNOTIFS_MAKE_ACTION", str, str2);
        restCallback.setCall(makePushNotificationAction);
        makePushNotificationAction.mo102158i(new RetrofitCallback(restCallback));
    }

    public void modifyTemplate(String str, File file, boolean z, String str2, RestCallback<BankApiResponse<Boolean>> restCallback) {
        C43443b<BankApiResponse<Boolean>> bVar;
        String str3 = z ? "TEMPLATES_MODIFY_TEMPLATE" : BankApi.TEMPLATES_MODIFY_TEMPLATE;
        C41939y.C41942c b = file != null ? C41939y.C41942c.m121727b("image.jpg", file.getName(), C41872c0.m121330c(file, C41937x.m121709g("multipart/form-data"))) : null;
        if (b != null) {
            bVar = mBankService.modifyTransferTemplate(str3, str, str2, "TEMPLATE_PHOTO", b);
        } else {
            bVar = mBankService.modifyTransferTemplate(str3, str, str2);
        }
        restCallback.setCall(bVar);
        bVar.mo102158i(new RetrofitCallback(restCallback));
    }

    public void modifyTemplateGroup(String str, TemplateGroup templateGroup, File file, RestCallback<BankApiResponse<TemplateGroup>> restCallback) {
        C41939y.C41942c cVar;
        C43443b<BankApiResponse<TemplateGroup>> bVar;
        String w = this.gsonWithExposes.mo18181w(templateGroup);
        C32359z0.m95575j0(w);
        if (file != null) {
            cVar = C41939y.C41942c.m121727b("image.jpg", file.getName(), C41872c0.m121330c(file, C41937x.m121709g("multipart/form-data")));
        } else {
            cVar = null;
        }
        C41939y.C41942c cVar2 = cVar;
        if (cVar2 != null) {
            bVar = mBankService.modifyTemplateGroup(BankApi.COLLECTOR_MODIFY_TEMPLATE_GROUP, str, w, templateGroup.getOperationKey(), "TEMPLATE_PHOTO", cVar2);
        } else {
            bVar = mBankService.modifyTemplateGroup(BankApi.COLLECTOR_MODIFY_TEMPLATE_GROUP, str, w, templateGroup.getOperationKey());
        }
        restCallback.setCall(bVar);
        bVar.mo102158i(new RetrofitCallback(restCallback));
    }

    public void orderBonusPrize(HashMap<String, Object> hashMap, RestCallback<BankApiResponse<List<String>>> restCallback) {
        C43443b<BankApiResponse<List<String>>> orderMrPrize = mBankService.orderMrPrize(hashMap);
        restCallback.setCall(orderMrPrize);
        orderMrPrize.mo102158i(new RetrofitCallback(restCallback));
    }

    public void paymentsBatchExecute(String str, String str2, HashMap<String, Object> hashMap, RestCallback<BankApiResponse<PaymentResult>> restCallback) {
        C43443b<BankApiResponse<PaymentResult>> paymentsBatchExecute = mBankServiceForPayments.paymentsBatchExecute(str2, hashMap);
        restCallback.setCall(paymentsBatchExecute);
        paymentsBatchExecute.mo102158i(new RetrofitCallback(restCallback));
    }

    public void paymentsExecute(String str, String str2, String str3, RestCallback<BankApiResponse<PaymentDebtResponse>> restCallback) {
        C43443b<BankApiResponse<PaymentDebtResponse>> executePayment = mBankService.executePayment(BankApi.SERVICE_PAYMENTS_EXECUTE, str, str2, str3);
        restCallback.setCall(executePayment);
        executePayment.mo102158i(new RetrofitCallback(restCallback));
    }

    public void processLoanRegistrion(HashMap<String, Object> hashMap, RestCallback<BankApiResponse<Map<String, String>>> restCallback) {
        C43443b<BankApiResponse<Map<String, String>>> processLoanRegistration = mBankService.processLoanRegistration(hashMap);
        restCallback.setCall(processLoanRegistration);
        processLoanRegistration.mo102158i(new RetrofitCallback(restCallback));
    }

    public void processNotifications(ProcessNotificationsRequest processNotificationsRequest, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> processNotifications = mBankService.processNotifications("NOTIF_BATCH_PROCESS_NOTIFICATION", this.gsonWithExposes.mo18181w(processNotificationsRequest));
        restCallback.setCall(processNotifications);
        processNotifications.mo102158i(new RetrofitCallback(restCallback));
    }

    public void qrPay(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, Double d3, RestCallback<BankApiResponse<QrPaymentResult>> restCallback) {
        RestCallback<BankApiResponse<QrPaymentResult>> restCallback2 = restCallback;
        C43443b<BankApiResponse<QrPaymentResult>> qrPay = mBankService.qrPay("QRPAY_CREATE_PAYMENT", str, str2, str3, str5, str6, str7, d, d2, d3, str4);
        restCallback2.setCall(qrPay);
        qrPay.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void qrPayReverseTransaction(String str, String str2, String str3, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> qrPayReverseTransaction = mBankService.qrPayReverseTransaction("QRPAY_REVERSE_TRANSACTION", str, str2, str3);
        restCallback.setCall(qrPayReverseTransaction);
        qrPayReverseTransaction.mo102158i(new RetrofitCallback(restCallback));
    }

    public void qrPaySendOtpForReversal(String str, RestCallback<BankApiResponse<ReversalOtpResult>> restCallback) {
        C43443b<BankApiResponse<ReversalOtpResult>> qrPaySendOtpForReversal = mBankService.qrPaySendOtpForReversal("QRPAY_SEND_SMS_FOR_REVERSE", str);
        restCallback.setCall(qrPaySendOtpForReversal);
        qrPaySendOtpForReversal.mo102158i(new RetrofitCallback(restCallback));
    }

    public void registerReferral(String str, String str2, String str3, String str4, C24978b bVar, C24978b bVar2, C24978b bVar3, C24978b bVar4, C24978b bVar5, C24978b bVar6, RestCallback<BankApiResponse<Object>> restCallback) {
        RestCallback<BankApiResponse<Object>> restCallback2 = restCallback;
        C43443b<BankApiResponse<Object>> registerReferral = mBankService.registerReferral("COMMON_REGISTER_REFERRAL", str, str2, str3, str4, bVar.mo63391e(), bVar2.mo63391e(), bVar3.mo63391e(), bVar4.mo63391e(), bVar5.mo63391e(), bVar6.mo63391e());
        restCallback2.setCall(registerReferral);
        registerReferral.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void removePensionAccess(RestCallback<BankApiResponse<PensionAccessResult>> restCallback) {
        C43443b<BankApiResponse<PensionAccessResult>> removePensionAccess = mBankService.removePensionAccess("PENSION_SEND_DATA_ACCESS_APPROVE", 0);
        restCallback.setCall(removePensionAccess);
        removePensionAccess.mo102158i(new RetrofitCallback(restCallback));
    }

    public void saveSMSNotifs(HashMap<String, Object> hashMap, String str, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> saveSMSNotifs = mBankService.saveSMSNotifs(hashMap, str);
        restCallback.setCall(saveSMSNotifs);
        saveSMSNotifs.mo102158i(new RetrofitCallback(restCallback));
    }

    public void searchData(String str, int i, int i2, RestCallback<BankApiResponse<SearchDataWrapper>> restCallback) {
        C43443b<BankApiResponse<SearchDataWrapper>> searchData = mBankService.searchData(BankApi.SERVICE_SEARCH_DATA, str, "RB", i, i2);
        restCallback.setCall(searchData);
        searchData.mo102158i(new RetrofitCallback(restCallback));
    }

    public void sendPensionAccess(int i, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> sendPensionAccess = mBankService.sendPensionAccess("PENSION_SEND_DATA_ACCESS_APPROVE", i);
        restCallback.setCall(sendPensionAccess);
        sendPensionAccess.mo102158i(new RetrofitCallback(restCallback));
    }

    public void setCustomerFlag(String str, String str2, RestCallback<BankApiResponse<String>> restCallback) {
        C43443b<BankApiResponse<String>> customerFlag = mBankService.setCustomerFlag(BankApi.COMMON_SET_RBC_CUSTOMER_FLAG, str, str2);
        restCallback.setCall(customerFlag);
        customerFlag.mo102158i(new RetrofitCallback(restCallback));
    }

    public void setDepositName(long j, String str, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> depositName = mBankService.setDepositName("DEPOSITS_SET_NAME", j, str);
        restCallback.setCall(depositName);
        depositName.mo102158i(new RetrofitCallback(restCallback));
    }

    public void setFeatureFeedback(long j, String str, Integer num, String str2, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> featureFeedback = mBankService.setFeatureFeedback("COMMON_SET_FEATURE_FEEDBACK", j, str, num, str2);
        restCallback.setCall(featureFeedback);
        featureFeedback.mo102158i(new RetrofitCallback(restCallback));
    }

    public void setLoanName(String str, long j, String str2, RestCallback<BankApiResponse<Void>> restCallback) {
        String str3;
        IRetrofitService iRetrofitService = mBankService;
        if (str2.equals("PLN")) {
            str3 = "LOANS_SET_PLN_NAME";
        } else {
            str3 = "LOANS_SET_LND_NAME";
        }
        C43443b<BankApiResponse<Void>> loanName = iRetrofitService.setLoanName(str3, j, str);
        restCallback.setCall(loanName);
        loanName.mo102158i(new RetrofitCallback(restCallback));
    }

    public void setSavedCard(String str, String str2, String str3, String str4, String str5, String str6, RestCallback<BankApiResponse<Long>> restCallback) {
        C43443b<BankApiResponse<Long>> savedCard = mBankService.setSavedCard(BankApi.COMMON_SET_CLIENT_CARD, str, str2, str3, str4, str5, str6);
        restCallback.setCall(savedCard);
        savedCard.mo102158i(new RetrofitCallback(restCallback));
    }

    public void setUsername(String str, String str2, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> username = mBankService.setUsername("IDENTITY_SET_USERNAME", str, str2);
        restCallback.setCall(username);
        username.mo102158i(new RetrofitCallback(restCallback));
    }

    public void terminateBill(long j, String str, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> terminateBill = mBankService.terminateBill("DEBITS_DELETE_AGREEMENT", j, str, "");
        restCallback.setCall(terminateBill);
        terminateBill.mo102158i(new RetrofitCallback(restCallback));
    }

    public void terminatePayment(long j, String str, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> terminatePayment = mBankService.terminatePayment("DEBITS_TERMINATE_PAYMENT", j, str);
        restCallback.setCall(terminatePayment);
        terminatePayment.mo102158i(new RetrofitCallback(restCallback));
    }

    public void terminateSTO(long j, String str, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> terminateSTO = mBankService.terminateSTO("DEBITS_STO_TERMINATE_ORDER", j, str);
        restCallback.setCall(terminateSTO);
        terminateSTO.mo102158i(new RetrofitCallback(restCallback));
    }

    public void transferBetweenOwnAccounts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RestCallback<BankApiResponse<TransferResult>> restCallback) {
        RestCallback<BankApiResponse<TransferResult>> restCallback2 = restCallback;
        C43443b<BankApiResponse<TransferResult>> transferBetweenOwnAccounts = mBankService.transferBetweenOwnAccounts(BankApi.SERVICE_TRANSFERS_BETWEEN_OWN_ACCOUNTS, str, str2, str3, str4, str5, str6, str7, str8, str9);
        restCallback2.setCall(transferBetweenOwnAccounts);
        transferBetweenOwnAccounts.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void transferInForeignBank(HashMap<String, Object> hashMap, String str, RestCallback<BankApiResponse<TransferResult>> restCallback) {
        C43443b<BankApiResponse<TransferResult>> transferInForeignBank = mBankService.transferInForeignBank(hashMap, str);
        restCallback.setCall(transferInForeignBank);
        transferInForeignBank.mo102158i(new RetrofitCallback(restCallback));
    }

    public void transferWithinBank(HashMap<String, Object> hashMap, String str, RestCallback<BankApiResponse<TransferResult>> restCallback) {
        C43443b<BankApiResponse<TransferResult>> transferWithinBank = mBankService.transferWithinBank(hashMap, str);
        restCallback.setCall(transferWithinBank);
        transferWithinBank.mo102158i(new RetrofitCallback(restCallback));
    }

    public void transferWithinGeorgia(HashMap<String, Object> hashMap, String str, RestCallback<BankApiResponse<TransferResult>> restCallback) {
        C43443b<BankApiResponse<TransferResult>> transferWithinGeorgia = mBankService.transferWithinGeorgia(hashMap, str);
        restCallback.setCall(transferWithinGeorgia);
        transferWithinGeorgia.mo102158i(new RetrofitCallback(restCallback));
    }

    public void transfersGetCommRate(String str, String str2, RestCallback<BankApiResponse<RateWeight>> restCallback) {
        C43443b<BankApiResponse<RateWeight>> transfersGetCommRate = mBankService.transfersGetCommRate("COMMON_CALC_COMMERCIAL_RATE", str, str2);
        restCallback.setCall(transfersGetCommRate);
        transfersGetCommRate.mo102158i(new RetrofitCallback(restCallback));
    }

    public void transfersGetCommRateAmount(String str, String str2, String str3, String str4, RestCallback<BankApiResponse<TransferRate>> restCallback) {
        C43443b<BankApiResponse<TransferRate>> transfersGetCommRateAmount = mBankService.transfersGetCommRateAmount("COMMON_CALC_COMMERCIAL_RATE_AMOUNT", str, str2, str3, str4);
        restCallback.setCall(transfersGetCommRateAmount);
        transfersGetCommRateAmount.mo102158i(new RetrofitCallback(restCallback));
    }

    public void transfersGetDispatchTypes(String str, RestCallback<BankApiResponse<ArrayList<DispatchType>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<DispatchType>>> transfersGetDispatchTypes = mBankService.transfersGetDispatchTypes("TRANSFERS_GET_DISPATCH_TYPES", str);
        restCallback.setCall(transfersGetDispatchTypes);
        transfersGetDispatchTypes.mo102158i(new RetrofitCallback(restCallback));
    }

    public void updateTemplateGroupLink(long j, String str, String str2, RestCallback<BankApiResponse<Void>> restCallback) {
        C43443b<BankApiResponse<Void>> updateTemplateGroupLink = mBankService.updateTemplateGroupLink(BankApi.TEMPLATES_UPDATE_TEMPLATE_GROUP_LINK, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, j, str, str2);
        restCallback.setCall(updateTemplateGroupLink);
        updateTemplateGroupLink.mo102158i(new RetrofitCallback(restCallback));
    }

    public void uploadProductImage(long j, long j2, File file, String str, RestCallback<BankApiResponse<Object>> restCallback) {
        File file2 = file;
        RestCallback<BankApiResponse<Object>> restCallback2 = restCallback;
        if (file2 != null) {
            C43443b<BankApiResponse<Object>> uploadProductImage = mBankService.uploadProductImage("CLIENTS_SET_PRODUCT_ATTACHMENT", j, j2, "TEMPLATE_PHOTO", "CREATE", C41939y.C41942c.m121727b("image.jpg", file.getName(), C41872c0.m121330c(file2, C41937x.m121709g("multipart/form-data"))));
            restCallback2.setCall(uploadProductImage);
            uploadProductImage.mo102158i(new RetrofitCallback(restCallback2));
            return;
        }
        C43443b<BankApiResponse<Object>> deleteProductImage = mBankService.deleteProductImage("CLIENTS_SET_PRODUCT_ATTACHMENT", j, j2, "TEMPLATE_PHOTO", str);
        restCallback2.setCall(deleteProductImage);
        deleteProductImage.mo102158i(new RetrofitCallback(restCallback2));
    }

    public void useOtpForAction(HashMap<String, Object> hashMap, RestCallback<BankApiResponse<Object>> restCallback) {
        C43443b<BankApiResponse<Object>> useOtpForActionPost = mBankService.useOtpForActionPost(hashMap);
        restCallback.setCall(useOtpForActionPost);
        useOtpForActionPost.mo102158i(new RetrofitCallback(restCallback));
    }

    public void useOtpForActionString(HashMap<String, Object> hashMap, RestCallback<BankApiResponse<String>> restCallback) {
        C43443b<BankApiResponse<String>> useOtpForActionString = mBankService.useOtpForActionString(hashMap);
        restCallback.setCall(useOtpForActionString);
        useOtpForActionString.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getAcctOwnerInfoMaskedWithPhone(String str, String str2, GettingPhoneOwnerPurpose gettingPhoneOwnerPurpose, RestCallback<BankApiResponse<AccountOwnerInfoWrapper>> restCallback) {
        C43443b<BankApiResponse<AccountOwnerInfoWrapper>> acctOwnerInfoWithPhone = mBankService.getAcctOwnerInfoWithPhone("COLLECTOR_GET_BENEFICIAR_INFO_AND_ACCOUNTS", "PHONE", str2, str, gettingPhoneOwnerPurpose != null ? gettingPhoneOwnerPurpose.name() : null);
        restCallback.setCall(acctOwnerInfoWithPhone);
        acctOwnerInfoWithPhone.mo102158i(new RetrofitCallback(restCallback));
    }

    public void getPaymentsLastOperations(long j, Long l, int i, int i2, boolean z, RestCallback<BankApiResponse<ArrayList<LastOperation>>> restCallback) {
        C43443b<BankApiResponse<ArrayList<LastOperation>>> paymentsLastOperations = mBankService.getPaymentsLastOperations(z ? BankApi.SERVICE_PAYMENTS_LAST_OPERATIONS : null, j, l, i, i2);
        restCallback.setCall(paymentsLastOperations);
        paymentsLastOperations.mo102158i(new RetrofitCallback(restCallback));
    }

    public void paymentsExecute(HashMap<String, Object> hashMap, String str, String str2, RestCallback<BankApiResponse<PaymentDebtResponse>> restCallback) {
        C43443b<BankApiResponse<PaymentDebtResponse>> executePayment = mBankService.executePayment(hashMap, str, str2);
        restCallback.setCall(executePayment);
        executePayment.mo102158i(new RetrofitCallback(restCallback));
    }

    public void modifyTemplate(String str, Long l, File file, String str2, RestCallback<BankApiResponse<TemplateBasketItem>> restCallback) {
        C41939y.C41942c cVar;
        C43443b<BankApiResponse<TemplateBasketItem>> bVar;
        if (file != null) {
            cVar = C41939y.C41942c.m121727b("image.jpg", file.getName(), C41872c0.m121330c(file, C41937x.m121709g("multipart/form-data")));
        } else {
            cVar = null;
        }
        C41939y.C41942c cVar2 = cVar;
        if (cVar2 != null) {
            bVar = mBankService.modifyTemplate(BankApi.TEMPLATES_MODIFY_TEMPLATE, str, "TEMPLATE_PHOTO", cVar2, l, str2);
        } else {
            bVar = mBankService.modifyTemplate(BankApi.TEMPLATES_MODIFY_TEMPLATE, str, l, str2);
        }
        restCallback.setCall(bVar);
        bVar.mo102158i(new RetrofitCallback(restCallback));
    }
}
