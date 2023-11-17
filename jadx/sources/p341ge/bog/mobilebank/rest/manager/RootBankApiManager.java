package p341ge.bog.mobilebank.rest.manager;

import hd0.C24978b;
import java.io.File;
import java.util.HashMap;
import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.bonus.BonusType;
import p341ge.bog.mobilebank.model.map.MapObject;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationsRequest;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.statement.AccountReportId;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.rest.BankApi;

/* renamed from: ge.bog.mobilebank.rest.manager.RootBankApiManager */
public abstract class RootBankApiManager {
    BankApi mBankApi;
    Client mClient;
    C41438c mEventBus;

    public RootBankApiManager(C41438c cVar, BankApi bankApi, Client client) {
        this.mBankApi = bankApi;
        this.mClient = client;
        this.mEventBus = cVar;
    }

    public abstract void changeClientProductDefault(String str, String str2, boolean z, boolean z2);

    public abstract void changeDeviceLanguage();

    public abstract void createOrUpdateDDPayment(HashMap<String, Object> hashMap, Object obj);

    public abstract void deleteSavedCard(long j);

    public abstract void deleteTemplate(long j);

    public abstract void deleteTemplateGroup(String str, TemplateGroup templateGroup);

    public abstract void deleteTransferTemplate(long j);

    public abstract void getAccountReportId(int i, long j, Long l, Long l2, boolean z);

    public abstract void getAccountStatement(AccountReportId accountReportId, String str, int i, int i2, boolean z);

    public abstract void getAccountsLov(boolean z);

    public abstract void getAgreementTextTemplate(String str, String str2);

    public abstract BankApi getBankApi();

    public abstract void getBonusPrizeHistory(BonusType bonusType);

    public abstract void getBonusStatementByType(int i, int i2, String str, Long l, Long l2, int i3);

    public abstract void getCarPaymentDebt(String str, String str2, String str3, String str4, String str5, PaymentProviderConfiguration paymentProviderConfiguration, long j);

    public abstract void getCcyRates(boolean z);

    public abstract void getCountries();

    public abstract void getCountryCodeBySwift(String str, String str2);

    public abstract void getDDAccounts();

    public abstract void getDDPeriodTypes();

    public abstract void getDDProviders();

    public abstract void getDDSTOList();

    public abstract void getFeatureFeedback();

    public abstract void getLoansSchedule(long j);

    public abstract void getMapObjectDetails(MapObject mapObject);

    public abstract void getMapObjectStatus(MapObject mapObject);

    public abstract void getMapObjects(boolean z);

    public abstract void getMapRegions();

    public abstract void getMerchantsByName(String str, int i, int i2);

    public abstract void getNotificationList();

    public abstract void getOperationDetails(long j, long j2);

    public abstract void getOperations(int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2, int i3, Integer num);

    public abstract void getPaymentDebt(String str, String str2, String str3, PaymentServiceConfig paymentServiceConfig, long j);

    public abstract void getPaymentsLastOperations(String str, Long l, int i, int i2);

    public abstract void getPaymentsProviderConfiguration(String str, String str2, String str3, String str4);

    public abstract void getPaymentsProviderConfigurationForPoints(String str, Object obj);

    public abstract void getPaymentsProviderConfigurationWithVoucher(String str, Object obj, String str2);

    public abstract void getPensionStatus();

    public abstract void getPointValueExchange(String str, String str2, String str3);

    public abstract void getRatesHistory();

    public abstract void getReportingCodes(String str);

    public abstract void getSMSNotificationsList();

    public abstract void getSTOPeriodTypes();

    public abstract void getSavedCards(String str);

    public abstract void getScoolCardStatement(long j, long j2, long j3, Integer num, Integer num2);

    public abstract void getTemplatesBasket(Boolean bool, String str, int i, int i2, int i3, String str2);

    public abstract void getTemplatesByType(String str, int i, int i2, int i3);

    public abstract void getTransferBeneficiaries();

    public abstract void hideClientProduct(String str, String str2, boolean z);

    public abstract void joinBonusProgram();

    public abstract void modifyTemplate(TemplateBasketItem templateBasketItem, File file, Long l, String str);

    public abstract void modifyTemplateGroup(String str, TemplateGroup templateGroup, File file);

    public abstract void orderBonusPrize(HashMap<String, Object> hashMap);

    public abstract void paymentsBatchExecute(String str, String str2, HashMap<String, Object> hashMap);

    public abstract void processNotifications(ProcessNotificationsRequest processNotificationsRequest);

    public abstract void registerReferral(String str, String str2, String str3, String str4, C24978b bVar, C24978b bVar2, C24978b bVar3, C24978b bVar4, C24978b bVar5, C24978b bVar6);

    public abstract void searchData(String str, int i, int i2);

    public abstract void setUsername(String str);

    public abstract void terminateBill(long j, String str);

    public abstract void terminatePayment(long j, String str);

    public abstract void terminateSTO(long j, String str);

    public abstract void updateCardSecurity(long j, String str, String str2, boolean z, HashMap<String, Object> hashMap);

    public abstract void updateTemplatesLink(String str, long j, String str2);
}
