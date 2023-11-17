package p341ge.bog.mobilebank.eventbus;

import java.util.ArrayList;
import java.util.List;
import jg1.C41438c;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ContractEntity;
import p341ge.bog.mobilebank.model.Beneficiary;
import p341ge.bog.mobilebank.model.BogCountry;
import p341ge.bog.mobilebank.model.CashBackStatementWrapper;
import p341ge.bog.mobilebank.model.DepLoanAgreement;
import p341ge.bog.mobilebank.model.FeatureFeedback;
import p341ge.bog.mobilebank.model.InTransferDetail;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.account.AccountDebitLoveWrapper;
import p341ge.bog.mobilebank.model.account.OperationResponse;
import p341ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper;
import p341ge.bog.mobilebank.model.bonus.ScoolCardStatementItem;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentAccount;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBankList;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;
import p341ge.bog.mobilebank.model.loans.history.LoanHistoryWrapper;
import p341ge.bog.mobilebank.model.loans.schedule.LoanScheduleWrapper;
import p341ge.bog.mobilebank.model.map.MapObject;
import p341ge.bog.mobilebank.model.map.MapObjectDetail;
import p341ge.bog.mobilebank.model.map.MapRegion;
import p341ge.bog.mobilebank.model.notification.NotificationCount;
import p341ge.bog.mobilebank.model.notification.NotificationList;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationsRequest;
import p341ge.bog.mobilebank.model.payment.BonusProvider;
import p341ge.bog.mobilebank.model.payment.LastOperation;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentDetail;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.SelectedPayment;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.model.statement.AccountReportId;
import p341ge.bog.mobilebank.model.statement.AccountStatementWrapper;
import p341ge.bog.mobilebank.model.statement.CasStatementWrapper;
import p341ge.bog.mobilebank.model.template.CarCTParkResponse;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.rest.manager.BankApiManager;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.eventbus.NetworkListener */
public interface NetworkListener {
    void ScoolStatementResponse(long j, BankApiResponse<ArrayList<ScoolCardStatementItem>> bankApiResponse);

    void accountReportIDResponse(int i, long j, boolean z, BankApiResponse<AccountReportId> bankApiResponse);

    void accountStatementResponse(AccountReportId accountReportId, BankApiResponse<AccountStatementWrapper> bankApiResponse);

    void bonusStatementResponse(String str, BankApiResponse<BonusStatementDetailsWrapper> bankApiResponse);

    void casStatementResponse(long j, BankApiResponse<CasStatementWrapper> bankApiResponse);

    void ctPark6MonthsResponse(BankApiResponse<PaymentDebtResponse> bankApiResponse, long j, PaymentProviderConfiguration paymentProviderConfiguration);

    void ctParkPenaltiesResponse(BankApiResponse<CarCTParkResponse> bankApiResponse, long j, PaymentProviderConfiguration paymentProviderConfiguration);

    void debtResponse(BankApiResponse<PaymentDebtResponse> bankApiResponse, long j);

    void deleteTemplateGroupResponse(BankApiResponse<Object> bankApiResponse, long j);

    void deleteTemplateResponse(BankApiResponse<Object> bankApiResponse, long j);

    void deleteTransferTemplateResponse(BankApiResponse<Object> bankApiResponse, long j);

    void lastOperationResponse(String str, BankApiResponse<LastOperation> bankApiResponse);

    void lastOperationsResponse(long j, Long l, int i, BankApiResponse<ArrayList<LastOperation>> bankApiResponse);

    void lastOperationsResponse(Long l, BankApiResponse<List<LastOperation>> bankApiResponse);

    void mapObjectDetailsResponse(MapObject mapObject, BankApiResponse<ArrayList<MapObjectDetail>> bankApiResponse);

    void mapObjectStatusResponse(MapObject mapObject, BankApiResponse<String> bankApiResponse);

    void mapObjectsResponse(BankApiResponse<List<MapObject>> bankApiResponse);

    void mapRegionsLoaded(BankApiResponse<ArrayList<MapRegion>> bankApiResponse);

    void modifyTemplateGroupLinkResponse(BankApiResponse<Void> bankApiResponse, String str, long j, String str2);

    void modifyTemplateGroupResponse(BankApiResponse<TemplateGroup> bankApiResponse);

    void modifyTemplateResponse(BankApiResponse<TemplateBasketItem> bankApiResponse, TemplateBasketItem templateBasketItem, Long l);

    void onAccountLovDebits(BankApiResponse<AccountDebitLoveWrapper> bankApiResponse);

    void onAgreementTextTemplate(BankApiResponse<ContractEntity> bankApiResponse, String str);

    void onCardSecurityResponse(long j, String str, String str2, boolean z, BankApiResponse<Object> bankApiResponse);

    void onCashbackStatement(BankApiResponse<CashBackStatementWrapper> bankApiResponse);

    void onChangeDeviceLanguage(boolean z);

    void onCountries(BankApiResponse<List<BogCountry>> bankApiResponse);

    void onCountryCodeBySwift(String str, String str2, BankApiResponse<ForeignBankList> bankApiResponse);

    void onDDAccounts(BankApiResponse<ArrayList<DDPaymentAccount>> bankApiResponse);

    void onDDPeriodTypes(BankApiResponse<ArrayList<STOPeriodType>> bankApiResponse);

    void onDDProviders(BankApiResponse<ArrayList<DDProviderItem>> bankApiResponse);

    void onDDSTOList(BankApiResponse<ArrayList<DDSTO>> bankApiResponse);

    void onDeleteSavedCard(long j, BankApiResponse<Object> bankApiResponse);

    void onDepLoanAgreementsResponse(BankApiResponse<List<DepLoanAgreement>> bankApiResponse);

    void onExpressProviders(String str, String str2, BankApiResponse<ArrayList<BonusProvider>> bankApiResponse);

    void onFeatureFeedback(BankApiResponse<List<FeatureFeedback>> bankApiResponse);

    void onInTransferDetails(long j, String str, String str2, BankApiResponse<List<InTransferDetail>> bankApiResponse);

    void onLoanHistoryResponse(BankApiResponse<LoanHistoryWrapper> bankApiResponse, boolean z);

    void onLoanScheduleResponse(long j, BankApiResponse<LoanScheduleWrapper> bankApiResponse);

    void onNotificationListResponse(BankApiResponse<NotificationList> bankApiResponse);

    void onNotificationsCount(BankApiResponse<NotificationCount> bankApiResponse);

    void onNotificationsProcessResponse(ProcessNotificationsRequest processNotificationsRequest, BankApiResponse<Object> bankApiResponse);

    void onOperationDetails(long j, long j2, BankApiResponse<OperationResponse> bankApiResponse);

    void onOperationsResponse(int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2, BankApiResponse<OperationResponse> bankApiResponse);

    void onOutTransferDetails(long j, String str, String str2, BankApiResponse<TransferHistoryItem> bankApiResponse);

    void onPaymentCardsResponse(BankApiResponse<ArrayList<PaymentsCard>> bankApiResponse, String str);

    void onPaymentDetails(long j, String str, String str2, BankApiResponse<List<PaymentDetail>> bankApiResponse);

    void onPensionStatus(BankApiResponse<PensionStatusResult> bankApiResponse);

    void onReportingCodes(BankApiResponse<List<ReportingCode>> bankApiResponse);

    void onSMSNotificationsList(BankApiResponse<ArrayList<SMSContact>> bankApiResponse);

    void onSTOPeriodTypes(BankApiResponse<ArrayList<STOPeriodType>> bankApiResponse);

    void onSelectedPayments(BankApiResponse<ArrayList<SelectedPayment>> bankApiResponse);

    void onTerminateBill(long j, BankApiResponse<Object> bankApiResponse);

    void onTerminatePayment(long j, BankApiResponse<Object> bankApiResponse);

    void onTerminateSTO(long j, BankApiResponse<Object> bankApiResponse);

    void onTransferBeneficiaries(BankApiResponse<ArrayList<Beneficiary>> bankApiResponse);

    void onTransferDetailsPfm(String str, BankApiResponse<TransferHistoryItem> bankApiResponse);

    void onUploadImage(int i, long j, BankApiResponse<Object> bankApiResponse);

    void onUtilityPaymentDetails(long j, String str, String str2, BankApiResponse<List<LastOperation>> bankApiResponse);

    void paymentProviderConfigurationResponse(BankApiResponse<List<PaymentProviderConfiguration>> bankApiResponse, String str);

    void setBankApiManager(BankApiManager bankApiManager, C41438c cVar);

    void templateByTypeResponse(BankApiResponse<ArrayList<TemplateBasketItem>> bankApiResponse);

    void templatesBasketResponse(BankApiResponse<TemplateBasketItemsWithPaymentConfig> bankApiResponse);

    void updateClientProducts();
}
