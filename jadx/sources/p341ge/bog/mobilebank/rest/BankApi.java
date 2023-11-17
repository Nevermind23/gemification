package p341ge.bog.mobilebank.rest;

import hd0.C24978b;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.rest.BankApi */
public abstract class BankApi {
    static final String ACCOUNTS_GET_MY_OPERATIONS = "ACCOUNTS_GET_MY_OPERATIONS_WITH_DETAILS_AND_PFM";
    public static final String ACCOUNTS_GET_REQUISITES_PDF = "ACCOUNTS_GET_REQUISITES_PDF";
    public static final String ACCOUNTS_GET_STATEMENT_EXCEL = "ACCOUNTS_GET_STATEMENT_XLS";
    public static final String ACCOUNTS_GET_STATEMENT_PDF = "ACCOUNTS_GET_STATEMENT_PDF";
    public static final String APPLICATIONS_CREATE_SOLO_APPLICATION = "APPLICATIONS_CREATE_SOLO_APPLICATION";
    public static final String APPLICATIONS_RBS_GET_RESPONSE_HTML = "APPLICATIONS_RBS_GET_RESPONSE_HTML";
    public static final String APPLICATIONS_RBS_PROCESS_RBS_RESPONSE = "APPLICATIONS_RBS_PROCESS_RBS_RESPONSE";
    public static final String APPLICATIONS_RBS_REJECT_RESPONSE = "APPLICATIONS_RBS_REJECT_RESPONSE";
    public static final String BONDS_GET_AGREEMENT_PDF = "BONDS_GET_AGREEMENT_PDF";
    static final String BONUSES_BUY_TCC_FROM_BNS_POINTS = "BONUSES_BUY_TCC_FROM_BNS_POINTS";
    public static final String BONUSES_CREATE_PRIZE_ORDERS = "BONUSES_CREATE_PRIZE_ORDERS";
    public static final String BONUSES_GET_BONUS_STATEMENT_PDF = "BONUSES_GET_BONUS_STATEMENT_PDF";
    public static final String BONUSES_GET_BONUS_STATEMENT_XLS = "BONUSES_GET_BONUS_STATEMENT_XLS";
    public static final String BONUSES_GET_CASHBACK_STATEMENT_PDF = "BONUSES_GET_CASHBACK_STATEMENT_PDF";
    public static final String BONUSES_GET_CASHBACK_STATEMENT_XLS = "BONUSES_GET_CASHBACK_STATEMENT_XLS";
    static final String BONUSES_GET_CATEGORIES = "BONUSES_GET_CATEGORIES";
    static final String BONUSES_GET_CLIENT_PRIZE_LIST = "BONUSES_GET_CLIENT_PRIZE_LIST";
    static final String BONUSES_GET_PAY_PROVIDERS = "BONUSES_GET_PAY_PROVIDERS";
    static final String BONUSES_GET_PRIZE_DETAILS = "BONUSES_GET_PRIZE_DETAILS";
    static final String BONUSES_GET_PRIZE_LIST = "BONUSES_GET_PRIZE_LIST";
    public static final String BONUSES_GET_VOUCHER_PDF = "BONUSES_GET_VOUCHER_PDF";
    static final String BONUSES_REGISTER_CLIENT = "BONUSES_REGISTER_CLIENT";
    public static final String BONUSES_TRANSFER_PLUS_POINTS = "BONUSES_TRANSFER_PLUS_POINTS";
    public static final String CARDS_ACTIVATE_CARD = "CARDS_ACTIVATE_CARD";
    public static final String CARDS_GET_CARDS_FOR_LOAN_OFFER = "CARDS_GET_CARDS_FOR_LOAN_OFFER";
    static final String CARDS_GET_EXPRESS_CARDS = "CARDS_GET_EXPRESS_CARDS";
    public static final String CARDS_GET_VIRTUAL_CARD_DETAILS = "CARDS_GET_VIRTUAL_CARD_DETAILS";
    static final String CARDS_IS_BANK_CARD = "CARDS_IS_BANK_CARD";
    public static final String CAS_GET_STATEMENT_PDF = "CAS_GET_STATEMENT_PDF";
    public static final String CAS_GET_STATEMENT_XLS = "CAS_GET_STATEMENT_XLS";
    static final String CCY_GET_OFFICIAL_AND_COMMERCIAL_RATES = "CCY_GET_OFFICIAL_AND_COMMERCIAL_RATES";
    static final String CLIENTS_GET_CLIENT_INITIALS_BY_PIN = "CLIENTS_GET_CLIENT_INITIALS_BY_PIN";
    static final String CLIENTS_SET_PRODUCT_ATTACHMENT = "CLIENTS_SET_PRODUCT_ATTACHMENT";
    static final String COLLECTOR_GET_BENEFICIAR_INFO_AND_ACCOUNTS = "COLLECTOR_GET_BENEFICIAR_INFO_AND_ACCOUNTS";
    static final String COLLECTOR_GET_MY_OPERATION_DETAILS = "COLLECTOR_GET_MY_OPERATION_DETAILS_AND_PFM";
    public static final String COLLECTOR_GET_MY_OPERATION_PDF = "COLLECTOR_GET_MY_OPERATION_DETAILS_PDF";
    static final String COLLECTOR_GET_OWNER_AND_ACCOUNT_INFO = "COLLECTOR_GET_OWNER_AND_ACCOUNT_INFO";
    static final String COLLECTOR_GET_OWNER_INFO_AND_MASKED_ACCOUNTS_BY_PIN = "COLLECTOR_GET_OWNER_INFO_AND_MASKED_ACCOUNTS_BY_PIN";
    public static final String COLLECTOR_MODIFY_TEMPLATE_GROUP = "COLLECTOR_MODIFY_TEMPLATE_GROUP";
    static final String COMMON_ADD_FILE_ATTACHMENT = "COMMON_ADD_FILE_ATTACHMENT";
    static final String COMMON_CALC_COMMERCIAL_RATE_AMOUNT = "COMMON_CALC_COMMERCIAL_RATE_AMOUNT";
    static final String COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT = "COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT";
    static final String COMMON_CHANGE_CLIENT_PRODUCT_HIDE = "COMMON_CHANGE_CLIENT_PRODUCT_HIDE";
    public static final String COMMON_CHANGE_DEVICE_LANGUAGE = "COMMON_CHANGE_DEVICE_LANGUAGE";
    public static final String COMMON_DELETE_CLIENT_CARD = "COMMON_DELETE_CLIENT_CARD";
    public static final String COMMON_GET_CLIENT_CARDS = "CARDS_GET_PAYMENT_AND_EXTERNAL_CARDS";
    public static final String COMMON_GET_COMMERCIAL_RATE_AMOUNT = "COMMON_GET_COMMERCIAL_RATE_AMOUNT_NEW";
    public static final String COMMON_GET_CONTRACT = "COMMON_GET_CONTRACT";
    static final String COMMON_GET_COUNTRIES = "COMMON_GET_COUNTRIES";
    public static final String COMMON_GET_EXT_SERVICE_STATUS = "COMMON_GET_EXT_SERVICE_STATUS";
    static final String COMMON_GET_FEATURE_FEEDBACK = "COMMON_GET_FEATURE_FEEDBACK";
    static final String COMMON_GET_FILE_ATTACHMENT_INFO = "COMMON_GET_FILE_ATTACHMENT_INFO";
    public static final String COMMON_GET_LOOKUP_DATA = "COMMON_GET_LOOKUP_DATA";
    public static final String COMMON_GET_SC_OBJECTS = "COMMON_GET_SC_OBJECTS";
    static final String COMMON_GET_SC_OBJECT_SCHEDULE = "COMMON_GET_SC_OBJECT_SCHEDULE";
    public static final String COMMON_GET_SC_ROUTES = "COMMON_GET_SC_ROUTES";
    static final String COMMON_GET_SERVICE_OPERATION_ID = "COMMON_GET_SERVICE_OPERATION_ID";
    public static final String COMMON_LOAD_MOBILE_DATA = "COMMON_LOAD_MOBILE_DATA";
    public static final String COMMON_PING_SESSION = "COMMON_PING_SESSION";
    static final String COMMON_REGISTER_REFERRAL = "COMMON_REGISTER_REFERRAL";
    public static final String COMMON_SET_CLIENT_CARD = "COMMON_SET_CLIENT_CARD";
    static final String COMMON_SET_FEATURE_FEEDBACK = "COMMON_SET_FEATURE_FEEDBACK";
    public static final String COMMON_SET_RBC_CUSTOMER_FLAG = "COMMON_SET_RBC_CUSTOMER_FLAG";
    public static final String CREDIT_INFO_REGISTER_USER = "CLIENTS_REGISTER_CREDIT_INFO_USER";
    public static final String DEBITS_BETWEEM_OWN_ACCOUNTS = "DEBITS_BETWEEM_OWN_ACCOUNTS";
    public static final String DEBITS_CREATE_AGREEMENT = "DEBITS_CREATE_AGREEMENT";
    static final String DEBITS_GET_CARD_DEBITS_AND_ACCOUNTS_LOV = "DEBITS_GET_CARD_DEBITS_AND_ACCOUNTS_LOV";
    static final String DEBITS_GET_DEBIT_PAYMENTS_AND_DETAILS = "DEBITS_GET_DEBIT_PAYMENTS_AND_DETAILS";
    public static final String DEBITS_GET_PROVIDERS_AND_SERVICES = "DEBITS_GET_PROVIDERS_AND_SERVICES";
    public static final String DEPOSITS_GET_AGREEMENT_PDF = "DEPOSITS_GET_AGREEMENT_PDF";
    static final String DEPOSITS_SET_NAME = "DEPOSITS_SET_NAME";
    static final String GT_GET_AGREEMENTS_AND_DETAILS = "GT_GET_AGREEMENTS_AND_DETAILS";
    public static final String IDENTITY_GET_PASS_POLICY_RULES = "IDENTITY_GET_PASS_POLICY_RULES";
    public static final String IDENTITY_GET_TURNOVER_TYPES = "IDENTITY_GET_TURNOVER_TYPES";
    public static final String IDENTITY_TRUST_DEVICE = "IDENTITY_TRUST_DEVICE";
    static final String LOANS_DEP_CHECK_CALCULATION = "LOANS_DEP_CHECK_CALCULATION";
    public static final String LOANS_DEP_CREATE_NEW = "LOANS_DEP_CREATE_NEW";
    static final String LOANS_DEP_GET_AGREEMENTS = "LOANS_DEP_GET_AGREEMENTS";
    static final String LOANS_DEP_GET_CALCULATION = "LOANS_DEP_GET_CALCULATION";
    public static final String LOANS_GET_AGREEMENT_PDF = "LOANS_GET_AGREEMENT_PDF";
    static final String LOANS_GET_CASH_COVER_PRE_CONTRACT_TEMPLATE = "LOANS_GET_CASH_COVER_PRE_CONTRACT_TEMPLATE";
    static final String LOANS_GET_LND_REPAYMENTS = "LOANS_GET_LND_REPAYMENTS";
    public static final String LOANS_GET_LND_REPAYMENTS_PDF = "LOANS_GET_LND_REPAYMENTS_PDF";
    static final String LOANS_GET_LND_SCHEDULE = "LOANS_GET_LND_SCHEDULE";
    public static final String LOANS_GET_LND_SCHEDULE_PDF = "LOANS_GET_LND_SCHEDULE_PDF";
    static final String LOANS_GET_LOANS_WITH_DETAILS = "LOANS_GET_LOANS_WITH_DETAILS";
    public static final String LOANS_GET_PLN_AGREEMENT_PDF = "LOANS_GET_PLN_AGREEMENT_PDF";
    static final String LOANS_GET_PLN_REPAYMENTS = "LOANS_GET_PLN_REPAYMENTS";
    public static final String LOANS_GET_PLN_REPAYMENTS_PDF = "LOANS_GET_PLN_REPAYMENTS_PDF";
    public static final String LOANS_RESEND_MESSAGE = "LOANS_RESEND_MESSAGE";
    static final String NOTIF_BATCH_PROCESS_NOTIFICATION = "NOTIF_BATCH_PROCESS_NOTIFICATION";
    static final String NOTIF_GET_CUSTOMER_NOTIFICATIONS_AND_DETAILS = "NOTIF_GET_CUSTOMER_NOTIFICATIONS_AND_DETAILS";
    static final String NOTIF_GET_CUSTOMER_UNREAD_NOTIF_COUNT = "NOTIF_GET_CUSTOMER_UNREAD_NOTIF_COUNT_V2";
    public static final String OFFERS_CHECK_LIMIT_LOAN_DECISION = "OFFERS_CHECK_LIMIT_LOAN_DECISION";
    public static final String OFFERS_GET_LIMIT_LOAN_DECISION = "OFFERS_GET_LIMIT_LOAN_DECISION";
    public static final String OFFERS_GET_LND_PRE_CONTRACT_TEMPLATE = "OFFERS_GET_LND_PRE_CONTRACT_TEMPLATE";
    public static final String OFFERS_PROCESS_CARD_REGISTRATION = "OFFERS_PROCESS_CARD_REGISTRATION";
    public static final String OFFERS_PROCESS_LOAN_REGISTRATION = "OFFERS_PROCESS_LOAN_REGISTRATION";
    public static final String OPERATION_KEY_CREATE = "CREATE";
    static final String OPERATION_KEY_DELETE = "DELETE";
    public static final String OPERATION_KEY_REMOVE_IMAGE = "REMOVE_IMAGE";
    public static final String PAYMENTS_BATCH_EXECUTE = "PAYMENTS_BATCH_EXECUTE_NEW";
    public static final String PAYMENTS_CALCULATE_COMMISSION = "PAYMENTS_CALCULATE_COMMISSION";
    public static final String PAYMENTS_GET_COMMISSIONS = "PAYMENTS_GET_COMMISSIONS";
    static final String PAYMENTS_GET_MERCHANTS_AND_PROVIDERS = "PAYMENTS_GET_MERCHANTS_AND_PROVIDERS";
    public static final String PAYMENTS_GET_PAYMENT_HISTORY_PDF = "PAYMENTS_GET_PAYMENT_HISTORY_PDF";
    public static final String PAYMENTS_GET_PROVIDER_CONFIGURATIONS_IF_CHANGED = "COLLECTOR_GET_PROVIDER_CONFIGURATIONS_BY_CHANNELS";
    static final String PENSION_GET_ACCESS_STATUS = "PENSION_GET_ACCESS_STATUS";
    static final String PENSION_GET_TOTAL_AMOUNT = "PENSION_GET_TOTAL_AMOUNT";
    static final String PENSION_SEND_DATA_ACCESS_APPROVE = "PENSION_SEND_DATA_ACCESS_APPROVE";
    static final String QRPAY_CREATE_PAYMENT = "QRPAY_CREATE_PAYMENT";
    static final String QRPAY_REVERSE_TRANSACTION = "QRPAY_REVERSE_TRANSACTION";
    static final String QRPAY_SEND_SMS_FOR_REVERSE = "QRPAY_SEND_SMS_FOR_REVERSE";
    static final String SCOOLCARD_GET_SCHOOL_CARD_STATEMENT = "SCOOLCARDS_GET_STATEMENT";
    public static final String SCOOL_GET_STATEMENT_PDF = "SCOOLCARDS_GET_STATEMENT_PDF";
    public static final String SCOOL_GET_STATEMENT_XLS = "SCOOLCARDS_GET_STATEMENT_XLS";
    public static final String SERVICE_BLOCK_CARD = "CARDS_BLOCK_CARD";
    static final String SERVICE_BONUSES_GET_CASHBACK_STATEMENT = "BONUSES_GET_CASHBACK_STATEMENT";
    static final String SERVICE_BONUSES_GET_MONEYBOX_ACCOUNTS = "CAS_GET_ACCOUNTS_LOV";
    static final String SERVICE_BONUSES_GET_MONEYBOX_DEPOSITS = "CAS_GET_AVAILABLE_DEPOSITS";
    static final String SERVICE_BONUSES_GET_MONEYBOX_TARIFF = "CAS_GET_TARIFFS";
    static final String SERVICE_BONUSES_GET_STATEMENT = "BONUSES_GET_BONUS_STATEMENT";
    static final String SERVICE_BONUSES_MONEYBOX_CLOSE = "CAS_CLOSE";
    static final String SERVICE_BONUSES_MONEYBOX_REGISTER_EDIT = "CAS_REGISTER_EDIT";
    public static final String SERVICE_CARDS_CREATE_OR_UPDATE_SECURITY = "CARDS_CREATE_OR_UPDATE_SECURITY";
    public static final String SERVICE_CARDS_DELETE_SECURITY = "CARDS_DELETE_SECURITY";
    static final String SERVICE_CARDS_GET_INSURANCE_TYPES = "CARDS_GET_INSURANCE_TYPES";
    public static final String SERVICE_CARDS_REGISTER_INSURANCE = "CARDS_REGISTER_INSURANCE";
    public static final String SERVICE_CARDS_REMOVE_INSURANCE = "CARDS_REMOVE_INSURANCE";
    public static final String SERVICE_CCY_GET_RATES_HISTORY = "CCY_GET_RATES_HISTORY_DEFAULT";
    static final String SERVICE_CHANGE_ACCOUNT_NAME = "ACCOUNTS_CHANGE_ALL_NAMES_BY_MAIN_ACCT_KEY";
    static final String SERVICE_CHANGE_LOAN_NAME = "LOANS_SET_LND_NAME";
    static final String SERVICE_CHANGE_PLN_NAME = "LOANS_SET_PLN_NAME";
    public static final String SERVICE_CLIENTS_TRUST_OR_UNTRUST_CONNECTION = "CLIENTS_TRUST_OR_UNTRUST_CONNECTION";
    public static final String SERVICE_COLLECTOR_GET_TEMPLATES_AND_CONFIG = "COLLECTOR_GET_TEMPLATES_AND_CONFIG";
    public static final String SERVICE_COMMON_TRIGGER_LOGIN_CHANGES = "COMMON_TRIGGER_LOGIN_CHANGES";
    public static final String SERVICE_DEBITS_CREATE_NEW_PAYMENT = "DEBITS_CREATE_NEW_PAYMENT_BY_PROVIDER";
    static final String SERVICE_DEBITS_DELETE_AGREEMENT = "DEBITS_DELETE_AGREEMENT";
    static final String SERVICE_DEBITS_GET_ACCOUNTS_LOV = "DEBITS_GET_ACCOUNTS_LOV";
    static final String SERVICE_DEBITS_GET_PERIODS = "DEBITS_GET_PERIODS";
    static final String SERVICE_DEBITS_GET_STO_PERIOD_TYPES = "DEBITS_GET_STO_PERIOD_TYPES";
    public static final String SERVICE_DEBITS_PAYMENT_WITHIN_BANK = "DEBITS_PAYMENT_WITHIN_BANK";
    public static final String SERVICE_DEBITS_PAYMENT_WITHIN_GEORGIA = "DEBITS_PAYMENT_WITHIN_GEORGIA";
    static final String SERVICE_DEBITS_STO_TERMINATE_ORDER = "DEBITS_STO_TERMINATE_ORDER";
    static final String SERVICE_DEBITS_TERMINATE_PAYMENT = "DEBITS_TERMINATE_PAYMENT";
    public static final String SERVICE_FINANCES_CALENDAR_DATA_MAKE_CHARGE_FEE = "FINANCES_CALENDAR_DATA_MAKE_CHARGE_FEE";
    public static final String SERVICE_FINANCES_GET_CALENDAR_DATA_LIST = "FINANCES_GET_CALENDAR_DATA_BY_TYPE_NEW";
    public static final String SERVICE_FINANCES_GET_COMMISSION_ACCOUNTS_LOV = "FINANCES_GET_COMMISSION_ACCOUNTS_LOV";
    static final String SERVICE_GET_ACCOUNT_REPORT_ID = "ACCOUNTS_GET_REPORT_ID";
    static final String SERVICE_GET_ACCOUNT_STATEMENT = "ACCOUNTS_GET_STATEMENT";
    static final String SERVICE_GET_CAS_STATEMENT = "CAS_GET_STATEMENT";
    static final String SERVICE_GET_DEPOSITS_REPORT_ID = "DEPOSITS_GET_REPORT_ID";
    static final String SERVICE_GET_LOANS_REPORT_ID = "LOANS_GET_REPORT_ID";
    public static final String SERVICE_GET_SELECTED_PAYMENTS = "PAYMENTS_GET_DEFAULT_PROVIDERS";
    static final String SERVICE_GET_TEMPLATES_BY_TYPE = "TEMPLATES_GET_TEMPLATES";
    static final String SERVICE_GET_VOUCHERS = "BONUSES_GET_VOUCHERS";
    static final String SERVICE_IDENTITY_SET_USERNAME = "IDENTITY_SET_USERNAME";
    public static final String SERVICE_OFFERS_IDENTIFY_CREDITOR = "OFFERS_IDENTIFY_CREDITOR";
    public static final String SERVICE_PAYMENTS_EXECUTE = "PAYMENTS_EXECUTE";
    static final String SERVICE_PAYMENTS_GET_PROVIDER_CONFIGURATIONS = "PAYMENTS_GET_PROVIDER_CONFIGURATIONS";
    public static final String SERVICE_PAYMENTS_LAST_OPERATIONS = "PAYMENTS_GET_PAYMENT_HISTORY_AND_PFM";
    public static final String SERVICE_PFM_TRANSACTION_DATA = "PFM_TRANSACTION_DATA";
    public static final String SERVICE_SEARCH_DATA = "SEARCH_DATA_AND_PFM";
    public static final String SERVICE_TRANSFERS_BETWEEN_OWN_ACCOUNTS = "TRANSFERS_BETWEEM_OWN_ACCOUNTS_NEW";
    static final String SERVICE_TRANSFERS_GET_DISPATCH_TYPES = "TRANSFERS_GET_DISPATCH_TYPES";
    public static final String SERVICE_TRANSFERS_WITHIN_BANK = "TRANSFERS_WITHIN_BANK_NEW";
    public static final String SERVICE_TRANSFERS_WITHIN_GEORGIA = "TRANSFERS_WITHIN_GEORGIA_NEW";
    public static final String SERVICE_UNBLOCK_CARD = "CARDS_UNBLOCK_CARD";
    public static final String SMSNOTIFS_GET_NOTIFICATION_HIERARCHY = "SMSNOTIFS_GET_NOTIFICATION_HIERARCHY";
    public static final String SMSNOTIFS_GET_NOTIFICATION_SETS = "SMSNOTIFS_GET_NOTIFICATION_SETS";
    static final String SMSNOTIFS_GET_PUSH_NOTIFICATION_HISTORY = "SMSNOTIFS_GET_PUSH_NOTIFICATION_HISTORY_V2";
    static final String SMSNOTIFS_MAKE_ACTION = "SMSNOTIFS_MAKE_ACTION";
    public static final String SMSNOTIFS_SAVE_NOTIFICATION_SETS = "SMSNOTIFS_SAVE_NOTIFICATION_SETS";
    public static final String TEMPLATES_DELETE_TEMPLATE = "TEMPLATES_DELETE_TEMPLATE";
    public static final String TEMPLATES_MIGRATE_TEMPLATES = "TEMPLATES_MIGRATE_TEMPLATES";
    public static final String TEMPLATES_MODIFY_TEMPLATE = "PAYMENTS_MODIFY_TEMPLATE";
    public static final String TEMPLATES_UPDATE_TEMPLATE_GROUP_LINK = "TEMPLATES_UPDATE_TEMPLATE_GROUP_LINKS";
    static final String TERMINAL_MONITORING_GET_OBJECT_STATUS = "TERMINAL_MONITORING_GET_OBJECT_STATUS";
    static final String TRANSFERS_CALC_COMMERCIAL_RATE = "COMMON_CALC_COMMERCIAL_RATE";
    static final String TRANSFERS_CHECK_CADASTRE_CODE = "TRANSFERS_CHECK_CADASTRE_CODE";
    public static final String TRANSFERS_FOREIGN_NEW = "TRANSFERS_FOREIGN_NEW";
    static final String TRANSFERS_GET_ACCOUNTS_LOV_DETAILS = "TRANSFERS_GET_ACCOUNTS_LOV_DETAILS";
    static final String TRANSFERS_GET_COMMISSION_PARAMETERS = "TRANSFERS_GET_COMMISSION_PARAMETERS";
    static final String TRANSFERS_GET_COUNTRY_CODE_BY_SWIFT = "TRANSFERS_GET_COUNTRY_CODE_BY_SWIFT";
    static final String TRANSFERS_GET_DOC_TYPE_NOMINATIONS = "TRANSFERS_GET_DOC_TYPE_NOMINATIONS";
    static final String TRANSFERS_GET_RECENT_BENEFICIARIES = "TRANSFERS_GET_RECENT_BENEFICIARIES";
    static final String TRANSFERS_GET_REPORTING_CODES = "TRANSFERS_GET_REPORTING_CODES";
    static final String TRANSFERS_GET_SWIFTS_BY_KEYWORD = "TRANSFERS_GET_SWIFTS_BY_KEYWORD";
    static final String TRANSFERS_GET_TRANSFER_DEFAULT_NOMINATION = "TRANSFERS_GET_TRANSFER_DEFAULT_NOMINATION";
    public static final String TRANSFERS_GET_TRANSFER_DETAILS_PDF = "TRANSFERS_GET_TRANSFER_DETAILS_PDF";
    static final String TRANSFERS_GET_TREASURE_CODE_INFO = "TRANSFERS_GET_TREASURE_CODE_INFO";
    static final String TRANSFERS_MAX_INVOICE_COUNT = "TRANSFERS_MAX_INVOICE_COUNT";
    static final String TRANSFERS_MODIFY_TEMPLATE = "TEMPLATES_MODIFY_TEMPLATE";
    public static final String TRANSFERS_WITHIN_BUDGET = "TRANSFERS_WITHIN_BUDGET_NEW";

    public abstract void attachFile(String str, String str2, String str3, AttachmentTypeConst attachmentTypeConst, RestCallback<BankApiResponse<Integer>> restCallback);

    public abstract void buyTCCWithPoints(String str, String str2, String str3, String str4, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void changeAcctName(long j, String str, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void changeClientProductDefault(String str, String str2, String str3, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void changeDeviceLanguage(RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void changeTransactionComputability(Long l, Long l2, int i, Long l3, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void checkCadastralCode(String str, RestCallback<BankApiResponse<String>> restCallback);

    public abstract void checkDepLoanCalculation(Long l, String str, String str2, String str3, RestCallback<BankApiResponse<DepLoanCalculation>> restCallback);

    public abstract void checkIsBOGCard(String str, RestCallback<BankApiResponse<Boolean>> restCallback);

    public abstract void checkLimitLoanDecision(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<LimitLoanRefinanceInfo> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str8, RestCallback<BankApiResponse<LimitLoanDecisionEntity>> restCallback);

    public abstract void convertCurrency(String str, String str2, String str3, String str4, RestCallback<BankApiResponse<ConvertCurrencyResult>> restCallback);

    public abstract void deleteSavedCard(String str, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void deleteTemplate(long j, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void deleteTemplateGroup(String str, TemplateGroup templateGroup, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void foreignTransferGetCountries(RestCallback<BankApiResponse<List<BogCountry>>> restCallback);

    public abstract void foreignTransferGetReportingCodes(String str, RestCallback<BankApiResponse<List<ReportingCode>>> restCallback);

    public abstract void getAccountLovDebits(RestCallback<BankApiResponse<AccountDebitLoveWrapper>> restCallback);

    public abstract void getAccountOperations(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i, int i2, Integer num, RestCallback<BankApiResponse<OperationResponse>> restCallback);

    public abstract void getAccountReportId(Long l, Long l2, Long l3, Long l4, Long l5, RestCallback<BankApiResponse<AccountReportId>> restCallback);

    public abstract void getAccountStatement(long j, long j2, String str, int i, int i2, RestCallback<BankApiResponse<AccountStatementWrapper>> restCallback);

    public abstract void getAccountsLov(RestCallback<BankApiResponse<AccountLovContainer>> restCallback);

    public abstract void getAcctOwnerInfo(String str, String str2, String str3, RestCallback<BankApiResponse<AccountOwnerInfoWrapper>> restCallback);

    public abstract void getAcctOwnerInfoMasked(String str, String str2, String str3, RestCallback<BankApiResponse<AccountOwnerInfoWrapper>> restCallback);

    public abstract void getAcctOwnerInfoMaskedWithPhone(String str, String str2, GettingPhoneOwnerPurpose gettingPhoneOwnerPurpose, RestCallback<BankApiResponse<AccountOwnerInfoWrapper>> restCallback);

    public abstract void getAcctOwnerInfoMaskedWithPhone(String str, String str2, RestCallback<BankApiResponse<AccountOwnerInfoWrapper>> restCallback);

    public abstract void getAgreementTextTemplate(String str, RestCallback<BankApiResponse<ContractEntity>> restCallback);

    public abstract void getBonds(RestCallback<BankApiResponse<BondsWrapper>> restCallback);

    public abstract void getBonusPrizeHistory(BonusType bonusType, RestCallback<BankApiResponse<BonusPrizeList>> restCallback);

    public abstract void getBonusStatementByType(int i, int i2, String str, Long l, Long l2, int i3, RestCallback<BankApiResponse<BonusStatementDetailsWrapper>> restCallback);

    public abstract void getCTParkPaymentDebt(String str, String str2, String str3, String str4, String str5, RestCallback<BankApiResponse<CarCTParkResponse>> restCallback);

    public abstract void getCardInsuranceTypes(String str, RestCallback<BankApiResponse<InsuranceType[]>> restCallback);

    public abstract void getCardsForLoanOffer(String str, RestCallback<BankApiResponse<List<LoanOfferCard>>> restCallback);

    public abstract void getCasStatement(long j, Long l, Long l2, int i, int i2, RestCallback<BankApiResponse<CasStatementWrapper>> restCallback);

    public abstract void getCashCoverLoanPreContract(Double d, Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Long l, Long l2, int i, BigDecimal bigDecimal4, Double d3, Double d4, String str, BigDecimal bigDecimal5, String str2, String str3, Long l3, String str4, RestCallback<BankApiResponse<PreContractEntity>> restCallback);

    public abstract void getCashbackStatement(Long l, Long l2, int i, int i2, int i3, RestCallback<BankApiResponse<CashBackStatementWrapper>> restCallback);

    public abstract void getCcyRates(RestCallback<BankApiResponse<CcyRatesWrapper>> restCallback);

    public abstract void getCountryCodeBySwift(String str, RestCallback<BankApiResponse<TransferCountryCode>> restCallback);

    public abstract void getDDAccounts(RestCallback<BankApiResponse<ArrayList<DDPaymentAccount>>> restCallback);

    public abstract void getDDPeriodTypes(RestCallback<BankApiResponse<ArrayList<STOPeriodType>>> restCallback);

    public abstract void getDDProviders(RestCallback<BankApiResponse<ArrayList<DDProviderItem>>> restCallback);

    public abstract void getDDSTOList(RestCallback<BankApiResponse<ArrayList<DDSTO>>> restCallback);

    public abstract void getDepLoanAgreements(RestCallback<BankApiResponse<List<DepLoanAgreement>>> restCallback);

    public abstract void getDepLoanCalculation(Long l, String str, RestCallback<BankApiResponse<DepLoanCalculation>> restCallback);

    public abstract void getDomesticTransferNominations(String str, String str2, String str3, RestCallback<BankApiResponse<String>> restCallback);

    public abstract void getExpressCards(RestCallback<BankApiResponse<ArrayList<PaymentsCard>>> restCallback);

    public abstract void getExpressProviders(String str, String str2, RestCallback<BankApiResponse<ArrayList<BonusProvider>>> restCallback);

    public abstract void getFeatureFeedback(RestCallback<BankApiResponse<List<FeatureFeedback>>> restCallback);

    public abstract void getFileAttachmentInfo(AttachmentTypeConst attachmentTypeConst, RestCallback<BankApiResponse<FileAttachmentInfo>> restCallback);

    public abstract void getForeignBankList(String str, int i, int i2, RestCallback<BankApiResponse<ForeignBankList>> restCallback);

    public abstract void getInTransferDetails(long j, String str, String str2, Long l, Long l2, Long l3, RestCallback<BankApiResponse<List<InTransferDetail>>> restCallback);

    public abstract void getLimitLoanDecision(String str, String str2, String str3, RestCallback<BankApiResponse<LimitLoanDecisionEntity>> restCallback);

    public abstract void getLndOfferPreContractTemplate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<LimitLoanRefinanceInfo> list, BigDecimal bigDecimal, String str10, String str11, RestCallback<BankApiResponse<PreContractEntity>> restCallback);

    public abstract void getLoanHistory(long j, boolean z, RestCallback<BankApiResponse<LoanHistoryWrapper>> restCallback);

    public abstract void getLoanSchedules(long j, RestCallback<BankApiResponse<LoanScheduleWrapper>> restCallback);

    public abstract void getMapObjectDetails(String str, String str2, RestCallback<BankApiResponse<ArrayList<MapObjectDetail>>> restCallback);

    public abstract void getMapObjectStatus(String str, String str2, String str3, RestCallback<BankApiResponse<String>> restCallback);

    public abstract void getMapObjects(RestCallback<BankApiResponse<List<MapObject>>> restCallback);

    public abstract void getMapRegions(RestCallback<BankApiResponse<ArrayList<MapRegion>>> restCallback);

    public abstract void getMaxInvoiceCount(RestCallback<BankApiResponse<Integer>> restCallback);

    public abstract void getMerchantsByName(String str, int i, int i2, RestCallback<BankApiResponse<List<Merchant>>> restCallback);

    public abstract void getNotificationList(RestCallback<BankApiResponse<NotificationList>> restCallback);

    public abstract void getNotificationsCount(String str, RestCallback<BankApiResponse<NotificationCount>> restCallback);

    public abstract void getOperationDetails(long j, long j2, RestCallback<BankApiResponse<OperationResponse>> restCallback);

    public abstract void getOperationPfmDetails(Long l, String str, String str2, Long l2, Long l3, Long l4, RestCallback<BankApiResponse<OperationPfmDetails>> restCallback);

    public abstract void getOperationPfmDetailsList(Long l, String str, String str2, Long l2, Long l3, Long l4, RestCallback<BankApiResponse<List<OperationPfmDetails>>> restCallback);

    public abstract void getOutTransferDetails(long j, String str, String str2, Long l, Long l2, Long l3, RestCallback<BankApiResponse<TransferHistoryItem>> restCallback);

    public abstract void getPasswordRules(RestCallback<BankApiResponse<PasswordRules>> restCallback);

    public abstract void getPaymentDebt(String str, String str2, String str3, RestCallback<BankApiResponse<PaymentDebtResponse>> restCallback);

    public abstract void getPaymentDetails(long j, String str, String str2, Long l, Long l2, Long l3, RestCallback<BankApiResponse<List<PaymentDetail>>> restCallback);

    public abstract void getPaymentRequestId(String str, RestCallback<BankApiResponse<Long>> restCallback);

    public abstract void getPaymentsCommissions(String str, HashMap<String, Object> hashMap, RestCallback<BankApiResponse<PaymentCommissionEntity>> restCallback);

    public abstract void getPaymentsLastOperationWithEssId(String str, RestCallback<BankApiResponse<LastOperation>> restCallback);

    public abstract void getPaymentsLastOperations(long j, Long l, int i, int i2, boolean z, RestCallback<BankApiResponse<ArrayList<LastOperation>>> restCallback);

    public abstract void getPaymentsLastOperations(Long l, int i, int i2, boolean z, RestCallback<BankApiResponse<List<LastOperation>>> restCallback);

    public abstract void getPaymentsProviderConfiguration(String str, String str2, String str3, String str4, RestCallback<BankApiResponse<List<PaymentProviderConfiguration>>> restCallback);

    public abstract void getPensionStatus(RestCallback<BankApiResponse<PensionStatusResult>> restCallback);

    public abstract void getPushNotifications(String str, int i, int i2, RestCallback<BankApiResponse<PushHistoryObject>> restCallback);

    public abstract void getRatesHistory(long j, long j2, RestCallback<BankApiResponse<CcyHistoryWrapper>> restCallback);

    public abstract void getSMSNotificationsList(RestCallback<BankApiResponse<ArrayList<SMSContact>>> restCallback);

    public abstract void getSTOPeriodTypes(RestCallback<BankApiResponse<ArrayList<STOPeriodType>>> restCallback);

    public abstract void getSavedCards(String str, RestCallback<BankApiResponse<ArrayList<PaymentsCard>>> restCallback);

    public abstract void getScoolCardStatement(long j, long j2, long j3, Integer num, Integer num2, RestCallback<BankApiResponse<ArrayList<ScoolCardStatementItem>>> restCallback);

    public abstract void getSelectedPayments(RestCallback<BankApiResponse<ArrayList<SelectedPayment>>> restCallback);

    public abstract void getTemplatesBasket(Boolean bool, String str, int i, int i2, int i3, String str2, RestCallback<BankApiResponse<TemplateBasketItemsWithPaymentConfig>> restCallback);

    public abstract void getTemplatesByType(String str, int i, int i2, int i3, RestCallback<BankApiResponse<ArrayList<TemplateBasketItem>>> restCallback);

    public abstract void getTransferBeneficiaries(RestCallback<BankApiResponse<ArrayList<Beneficiary>>> restCallback);

    public abstract void getTransferCommission(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, RestCallback<BankApiResponse<MoneyTransferCommissionApiModel>> restCallback);

    public abstract void getTransferDetailsPfm(String str, String str2, Long l, Long l2, String str3, Long l3, RestCallback<BankApiResponse<TransferHistoryItem>> restCallback);

    public abstract void getTransferNominations(String str, String str2, String str3, String str4, String str5, RestCallback<BankApiResponse<ArrayList<TransferNomination>>> restCallback);

    public abstract void getTreasureOwnerInfo(String str, String str2, String str3, RestCallback<BankApiResponse<TreasureCodeInfo>> restCallback);

    public abstract void getUtilityPaymentDetails(long j, String str, String str2, Long l, Long l2, Long l3, RestCallback<BankApiResponse<List<LastOperation>>> restCallback);

    public abstract void getVouchers(String str, String str2, String str3, RestCallback<BankApiResponse<PaymentVoucher[]>> restCallback);

    public abstract void hideClientProduct(String str, String str2, String str3, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void joinBonusProgram(RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void loadMobileData(DeviceDataReport deviceDataReport, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void makePushNotificationAction(RestCallback<BankApiResponse<Object>> restCallback, String str, String str2);

    public abstract void modifyTemplate(String str, File file, boolean z, String str2, RestCallback<BankApiResponse<Boolean>> restCallback);

    public abstract void modifyTemplate(String str, Long l, File file, String str2, RestCallback<BankApiResponse<TemplateBasketItem>> restCallback);

    public abstract void modifyTemplateGroup(String str, TemplateGroup templateGroup, File file, RestCallback<BankApiResponse<TemplateGroup>> restCallback);

    public abstract void orderBonusPrize(HashMap<String, Object> hashMap, RestCallback<BankApiResponse<List<String>>> restCallback);

    public abstract void paymentsBatchExecute(String str, String str2, HashMap<String, Object> hashMap, RestCallback<BankApiResponse<PaymentResult>> restCallback);

    public abstract void paymentsExecute(String str, String str2, String str3, RestCallback<BankApiResponse<PaymentDebtResponse>> restCallback);

    public abstract void paymentsExecute(HashMap<String, Object> hashMap, String str, String str2, RestCallback<BankApiResponse<PaymentDebtResponse>> restCallback);

    public abstract void processLoanRegistrion(HashMap<String, Object> hashMap, RestCallback<BankApiResponse<Map<String, String>>> restCallback);

    public abstract void processNotifications(ProcessNotificationsRequest processNotificationsRequest, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void qrPay(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, Double d3, RestCallback<BankApiResponse<QrPaymentResult>> restCallback);

    public abstract void qrPayReverseTransaction(String str, String str2, String str3, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void qrPaySendOtpForReversal(String str, RestCallback<BankApiResponse<ReversalOtpResult>> restCallback);

    public abstract void registerReferral(String str, String str2, String str3, String str4, C24978b bVar, C24978b bVar2, C24978b bVar3, C24978b bVar4, C24978b bVar5, C24978b bVar6, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void removePensionAccess(RestCallback<BankApiResponse<PensionAccessResult>> restCallback);

    public abstract void saveSMSNotifs(HashMap<String, Object> hashMap, String str, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void searchData(String str, int i, int i2, RestCallback<BankApiResponse<SearchDataWrapper>> restCallback);

    public abstract void sendPensionAccess(int i, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void setCustomerFlag(String str, String str2, RestCallback<BankApiResponse<String>> restCallback);

    public abstract void setDepositName(long j, String str, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void setFeatureFeedback(long j, String str, Integer num, String str2, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void setLoanName(String str, long j, String str2, RestCallback<BankApiResponse<Void>> restCallback);

    public abstract void setSavedCard(String str, String str2, String str3, String str4, String str5, String str6, RestCallback<BankApiResponse<Long>> restCallback);

    public abstract void setUsername(String str, String str2, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void terminateBill(long j, String str, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void terminatePayment(long j, String str, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void terminateSTO(long j, String str, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void transferBetweenOwnAccounts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RestCallback<BankApiResponse<TransferResult>> restCallback);

    public abstract void transferInForeignBank(HashMap<String, Object> hashMap, String str, RestCallback<BankApiResponse<TransferResult>> restCallback);

    public abstract void transferWithinBank(HashMap<String, Object> hashMap, String str, RestCallback<BankApiResponse<TransferResult>> restCallback);

    public abstract void transferWithinGeorgia(HashMap<String, Object> hashMap, String str, RestCallback<BankApiResponse<TransferResult>> restCallback);

    public abstract void transfersGetCommRate(String str, String str2, RestCallback<BankApiResponse<RateWeight>> restCallback);

    public abstract void transfersGetCommRateAmount(String str, String str2, String str3, String str4, RestCallback<BankApiResponse<TransferRate>> restCallback);

    public abstract void transfersGetDispatchTypes(String str, RestCallback<BankApiResponse<ArrayList<DispatchType>>> restCallback);

    public abstract void updateTemplateGroupLink(long j, String str, String str2, RestCallback<BankApiResponse<Void>> restCallback);

    public abstract void uploadProductImage(long j, long j2, File file, String str, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void useOtpForAction(HashMap<String, Object> hashMap, RestCallback<BankApiResponse<Object>> restCallback);

    public abstract void useOtpForActionString(HashMap<String, Object> hashMap, RestCallback<BankApiResponse<String>> restCallback);
}
