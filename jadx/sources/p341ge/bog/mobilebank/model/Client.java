package p341ge.bog.mobilebank.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import c60.C19509h;
import c60.C19513j;
import com.google.gson.Gson;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import d50.C19909b;
import de1.C40640a;
import ed1.C40754t;
import ed1.C40762x;
import ed1.C40763y;
import g91.C32306g0;
import g91.C32307h;
import g91.C32312j;
import g91.C32315k0;
import g91.C32319m;
import g91.C32338u0;
import g91.C32359z0;
import gd1.C40992a;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import iu0.C36546y;
import j51.C36731c;
import j51.C36733e;
import j70.C25343d;
import j70.C25345e;
import j70.C25346f;
import j70.C25347g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jg1.C41438c;
import k51.C36873a;
import k51.C36874b;
import ky0.C37019f;
import m50.C26146d;
import m51.C37228a;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ContractEntity;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.smstopush.SmsToPushException;
import p341ge.bog.mobilebank.eventbus.NetworkListener;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.eventbus.event.DDAccountsEvent;
import p341ge.bog.mobilebank.eventbus.event.DDPeriodTypesEvent;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.eventbus.events.AccountOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.AccountStatementEvent;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.AllOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.BondsEvent;
import p341ge.bog.mobilebank.eventbus.events.BonusProvidersEvent;
import p341ge.bog.mobilebank.eventbus.events.CTPark6MonthsEvent;
import p341ge.bog.mobilebank.eventbus.events.CTParkPenaltiesEvent;
import p341ge.bog.mobilebank.eventbus.events.CardOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.CardSecurityUpdateEvent;
import p341ge.bog.mobilebank.eventbus.events.ConvertSmsToPushEvent;
import p341ge.bog.mobilebank.eventbus.events.CountriesEvent;
import p341ge.bog.mobilebank.eventbus.events.CountryCodeBySwiftEvent;
import p341ge.bog.mobilebank.eventbus.events.CreditAccountOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.CreditCardsEvent;
import p341ge.bog.mobilebank.eventbus.events.CriResponseEvent;
import p341ge.bog.mobilebank.eventbus.events.DDProvidersListEvent;
import p341ge.bog.mobilebank.eventbus.events.DDSTOListEvent;
import p341ge.bog.mobilebank.eventbus.events.DeleteSavedCardEvent;
import p341ge.bog.mobilebank.eventbus.events.DeleteTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.DeleteTemplateGroupEvent;
import p341ge.bog.mobilebank.eventbus.events.DepLoanAgreementsEvent;
import p341ge.bog.mobilebank.eventbus.events.DepositBondsEvent;
import p341ge.bog.mobilebank.eventbus.events.DepositOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent;
import p341ge.bog.mobilebank.eventbus.events.InTransferDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.LastOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.LoanHistoryEvent;
import p341ge.bog.mobilebank.eventbus.events.LoanScheduleEvent;
import p341ge.bog.mobilebank.eventbus.events.LoansEvent;
import p341ge.bog.mobilebank.eventbus.events.MapObjectDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent;
import p341ge.bog.mobilebank.eventbus.events.MapObjectsEvent;
import p341ge.bog.mobilebank.eventbus.events.MapRegionsEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyNotificationsEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateGroupEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateGroupLinkEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTransferTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.NotificationCountEvent;
import p341ge.bog.mobilebank.eventbus.events.NotificationListEvent;
import p341ge.bog.mobilebank.eventbus.events.OfferLimitDecisionEvent;
import p341ge.bog.mobilebank.eventbus.events.OperationDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.OperationHistoryEvent;
import p341ge.bog.mobilebank.eventbus.events.OutTransferDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentCardsEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentCategoriesDownloadEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.PensionStatusEvent;
import p341ge.bog.mobilebank.eventbus.events.PensionsEvent;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;
import p341ge.bog.mobilebank.eventbus.events.RegistrationAnalyticEvent;
import p341ge.bog.mobilebank.eventbus.events.ReportingCodesEvent;
import p341ge.bog.mobilebank.eventbus.events.SMSNotifListEvent;
import p341ge.bog.mobilebank.eventbus.events.STOPeriodTypesEvent;
import p341ge.bog.mobilebank.eventbus.events.STOTypeListEvent;
import p341ge.bog.mobilebank.eventbus.events.SaveUserNameOrWasSavedBeforeEvent;
import p341ge.bog.mobilebank.eventbus.events.SelectedPaymentsEvent;
import p341ge.bog.mobilebank.eventbus.events.SmsToPushStateEvent;
import p341ge.bog.mobilebank.eventbus.events.TemplateDebtEvent;
import p341ge.bog.mobilebank.eventbus.events.TemplatesAndConfigEvent;
import p341ge.bog.mobilebank.eventbus.events.TerminateDDSTOEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferBeneficiaryEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferDeleteTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferHistoryEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferTemplatesEvent;
import p341ge.bog.mobilebank.eventbus.events.UnAuthorizedAllOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.UtilityPaymentDetailsEvent;
import p341ge.bog.mobilebank.model.account.AccountDebitLoveWrapper;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.AccountLovContainer;
import p341ge.bog.mobilebank.model.account.AccountLoveDebit;
import p341ge.bog.mobilebank.model.account.OperationResponse;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p341ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper;
import p341ge.bog.mobilebank.model.bonus.ScoolCardStatementItem;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.model.credit.BillInfo;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentAccount;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.deposits.DepositDetails;
import p341ge.bog.mobilebank.model.deposits.DepositMaximaWrapper;
import p341ge.bog.mobilebank.model.deposits.DepositsWrapper;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBankList;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.model.loans.history.LoanHistoryWrapper;
import p341ge.bog.mobilebank.model.loans.schedule.LoanScheduleWrapper;
import p341ge.bog.mobilebank.model.map.MapObject;
import p341ge.bog.mobilebank.model.map.MapObjectDetail;
import p341ge.bog.mobilebank.model.map.MapObjectWrapper;
import p341ge.bog.mobilebank.model.map.MapRegion;
import p341ge.bog.mobilebank.model.notification.Notification;
import p341ge.bog.mobilebank.model.notification.NotificationCount;
import p341ge.bog.mobilebank.model.notification.NotificationDetails;
import p341ge.bog.mobilebank.model.notification.NotificationList;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationsRequest;
import p341ge.bog.mobilebank.model.payment.BonusProvider;
import p341ge.bog.mobilebank.model.payment.LastOperation;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentDetail;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.payment.SelectedPayment;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.model.statement.AccountReportId;
import p341ge.bog.mobilebank.model.statement.AccountStatementWrapper;
import p341ge.bog.mobilebank.model.statement.CasStatementWrapper;
import p341ge.bog.mobilebank.model.statement.ScoolStatementWrapper;
import p341ge.bog.mobilebank.model.template.CarCTParkResponse;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin;
import p341ge.bog.mobilebank.rest.manager.BankApiManager;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p530nf.C16919b;
import p729cv.C19799c;
import p729cv.C19803e;
import p729cv.C19804f;
import p737dt.C20100q;
import p748eu.C20292b;
import p750ew.C20300c;
import p758fu.C20557a;
import p843nw.C26625h;
import p843nw.C26633o;
import p863pw.C27631i;
import p863pw.C27637o;
import p875qy.C27872c;
import p885ry.C28113a;
import p951xz.C29882e;
import z90.C30268c;

/* renamed from: ge.bog.mobilebank.model.Client */
public class Client implements NetworkListener {
    public static final int OPERATIONS_GET_QUANTITY = 20;
    public static final int OPERATIONS_NO_PAGINATION_COUNT = 50;
    private AccountLovEvent accountLovEvent;
    private AccountStatementEvent accountStatementEvent;
    private AgreementTemplateEvent agreementTemplateEvent;
    private AllOperationsEvent allOperationsEvent;
    private final Context appContext;
    private BondsEvent bondsEvent;
    private BonusProvidersEvent bonusProvidersEvent;
    private C26633o cardsAndDetailsUseCase;
    public C26146d cardsUIModelDataMapper;
    private final C41204a compositeDisposable = new C41204a();
    private CountriesEvent countriesEvent;
    private Map<String, CountryCodeBySwiftEvent> countryCodeBySwiftEvents = new HashMap();
    private CreditCardsEvent creditCardsEvent;
    private CriResponseEvent criResponseEvent;
    private DDAccountsEvent ddAccountsEvent;
    private DDPeriodTypesEvent ddPeriodTypesEvent;
    private DDProvidersListEvent ddProvidersListEvent;
    private DDSTOListEvent ddstoListEvent;
    private DepLoanAgreementsEvent depLoanAgreementsEvent;
    private DepositBondsEvent depositBondsEvent;
    private FeatureFeedBackEvent featureFeedback;
    private C26625h getAccountsAndDetailsUseCase;
    C20292b getAppSettingByNameUseCase;
    private C36731c getClientMail;
    private C36733e getClientPhone;
    private C37019f getDepositsAndBonds;
    private C25343d getLegacyCreditCardsAndDetails;
    private C25345e getLegacyDepositsAndBondsWithDetails;
    private C25346f getLegacyLoanWithDetails;
    private C25347g getLegacyPensionAmount;
    private C19799c getProductTypeListUseCase;
    private C20300c getTransactionCategoriesUseCase;
    private InTransferDetailsEvent inTransferDetailsEvent;
    private MapObjectDetailsEvent lastMapObjectDetailsEvent;
    private LoanHistoryEvent loanHistoryEvent;
    private LoanScheduleEvent loanScheduleEvent;
    private LoansEvent loansEvent;
    private C37228a loginInfo;
    private C28113a loyaltyListRepository;
    /* access modifiers changed from: private */
    public BankApiManager mBankApiManager;
    private CcyHistoryWrapper mCcyHistoryWrapper;
    private C41438c mEventBus;
    private DeleteTemplateEvent mLastDeleteTemplateEvent;
    private DeleteTemplateGroupEvent mLastDeleteTemplateGroupEvent;
    private ModifyTemplateEvent mLastModifyTemplateEvent;
    private ModifyTemplateGroupEvent mLastModifyTemplateGroupEvent;
    private LastOperationsEvent mLastOperationsEvent;
    private MapObjectsEvent mMapObjectsEvent;
    private PaymentDebtEvent mPaymentDebtEvent;
    private TemplatesAndConfigEvent mTemplatesAndConfigEvent;
    private ClientInfoWrapper mUserInfo;
    private MapObjectStatusEvent mapObjectStatusEvent;
    private MapRegionsEvent mapRegionsEvent;
    private ModifyTemplateGroupLinkEvent modifyTemplateGroupLinkEvent;
    private ModifyTransferTemplateEvent modifyTransferTemplateEvent;
    private NotificationCountEvent notificationCountEvent;
    private NotificationListEvent notificationListEvent;
    private OfferLimitDecisionEvent offerLimitDecisionEvent;
    private OperationDetailsEvent operationDetailsEvent;
    private OperationHistoryEvent operationHistoryEvent;
    private OutTransferDetailsEvent outTransferDetailsEvent;
    private PaymentCardsEvent paymentCardsEvent;
    private PaymentCategoriesDownloadEvent paymentCategoriesDownloadEvent;
    private PaymentDetailsEvent paymentDetailsEvent;
    private PensionStatusEvent pensionStatusEvent;
    private PensionsEvent pensionsEvent;
    private final PreferencesApiManager preferencesApiManager;
    private List<ProductType> productTypes;
    private ProviderConfigurationEvent providerConfigurationEvent;
    private C19803e refreshAssetLiabilityUseCase;
    private C29882e refreshClientInfoPermission;
    private C19804f refreshProductTypeListUseCase;
    protected C30268c refreshSto;
    private RegistrationAnalyticEvent registrationAnalyticEvent;
    private ReportingCodesEvent reportingCodesEvent;
    private SelectedPaymentsEvent selectedPaymentsEvent;
    private SMSNotifListEvent smsNotifListEvent;
    private C19509h smsToPushManager;
    private STOPeriodTypesEvent stoPeriodTypesEvent;
    private STOTypeListEvent stoTypeListEvent;
    private TerminateDDSTOEvent terminateDDSTOEvent;
    private TransferBeneficiaryEvent transferBeneficiaryEvent;
    private TransferDeleteTemplateEvent transferDeleteTemplateEvent;
    private TransferHistoryEvent transferHistoryEvent;
    private TransferTemplatesEvent transfersTemplateEvent;
    private UnAuthorizedAllOperationsEvent unAuthorizedAllOperationsEvent;
    private UserRestrictions userRestrictions;
    private UtilityPaymentDetailsEvent utilityPaymentDetailsEvent;

    /* renamed from: ge.bog.mobilebank.model.Client$ClientEntryPoint */
    interface ClientEntryPoint {
        C26633o cardsAndDetailsUseCase();

        C26625h getAccountsAndDetailsUseCase();

        C36731c getClientFinancialMail();

        C36733e getClientFinancialPhone();

        C37019f getDepositsAndBondsUseCase();

        C25343d getLegacyCreditCardsAndDetails();

        C25345e getLegacyDepositsAndBondsWithDetails();

        C25346f getLegacyLoanWithDetails();

        C25347g getLegacyPensionAmount();

        C27872c getLoyaltyListRepository();

        C19799c getProductTypeListUseCase();

        C20300c getTransactionCategoriesUseCase();

        C19803e refreshAssetLiabilityUseCase();

        C29882e refreshClientInfoPermission();

        C19804f refreshProductTypeListUseCase();

        C19509h smsToPushManager();

        C20100q transactionPropertyUpdateEventPoster();
    }

    public Client(PreferencesApiManager preferencesApiManager2, Context context) {
        this.preferencesApiManager = preferencesApiManager2;
        this.appContext = context;
    }

    private ArrayList<KeyValue> filterEmptyParams(ArrayList<KeyValue> arrayList) {
        ArrayList<KeyValue> arrayList2 = new ArrayList<>();
        Iterator<KeyValue> it = arrayList.iterator();
        while (it.hasNext()) {
            KeyValue next = it.next();
            if (!(next == null || next.getKey() == null || next.getKey().equals("") || next.getValue() == null || next.getValue().equals(""))) {
                next.setValue(next.getValue().trim());
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    private void getSmsToPushNotifications() {
        if (this.smsToPushManager == null || !this.preferencesApiManager.shouldCheckSmsToPush() || !isUserSaved()) {
            SmsToPushStateEvent smsToPushStateEvent = new SmsToPushStateEvent();
            smsToPushStateEvent.setState(40);
            this.mEventBus.mo96184m(smsToPushStateEvent);
            return;
        }
        this.compositeDisposable.mo95660b(this.smsToPushManager.mo47748c().mo95063B(C40992a.m118827a()).mo95083l(new C33241j0(this)).mo95070I(new C33243k0(this), new C33245l0(this)));
    }

    private boolean isUserSaved() {
        SaveUserNameOrWasSavedBeforeEvent saveUserNameOrWasSavedBeforeEvent = (SaveUserNameOrWasSavedBeforeEvent) this.mEventBus.mo96180f(SaveUserNameOrWasSavedBeforeEvent.class);
        if (saveUserNameOrWasSavedBeforeEvent == null || !saveUserNameOrWasSavedBeforeEvent.saveUsernameOrWasSavedBefore) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$convertSmsToPush$38(C41205b bVar) {
        ConvertSmsToPushEvent convertSmsToPushEvent = new ConvertSmsToPushEvent();
        convertSmsToPushEvent.setState(10);
        this.mEventBus.mo96184m(convertSmsToPushEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$convertSmsToPush$39() {
        this.preferencesApiManager.saveCheckSmsToPush(false);
        ConvertSmsToPushEvent convertSmsToPushEvent = new ConvertSmsToPushEvent();
        convertSmsToPushEvent.setState(20);
        this.mEventBus.mo96184m(convertSmsToPushEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$convertSmsToPush$40(Throwable th) {
        ConvertSmsToPushEvent convertSmsToPushEvent = new ConvertSmsToPushEvent();
        if (th instanceof ApiError) {
            BankApiResponse a = ((ApiError) th).mo84685a();
            convertSmsToPushEvent.setState(40);
            convertSmsToPushEvent.setErrorKey(a.getKey());
            convertSmsToPushEvent.setError(a.getError());
        } else {
            convertSmsToPushEvent.setState(30);
        }
        this.mEventBus.mo96184m(convertSmsToPushEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getSmsToPushNotifications$35(C41205b bVar) {
        SmsToPushStateEvent smsToPushStateEvent = new SmsToPushStateEvent();
        smsToPushStateEvent.setState(10);
        this.mEventBus.mo96184m(smsToPushStateEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getSmsToPushNotifications$36(C19513j jVar) {
        SmsToPushStateEvent smsToPushStateEvent = new SmsToPushStateEvent();
        smsToPushStateEvent.setState(20);
        smsToPushStateEvent.smsToPushState = jVar;
        this.mEventBus.mo96184m(smsToPushStateEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getSmsToPushNotifications$37(Throwable th) {
        SmsToPushStateEvent smsToPushStateEvent = new SmsToPushStateEvent();
        if (th instanceof ApiError) {
            BankApiResponse a = ((ApiError) th).mo84685a();
            smsToPushStateEvent.setState(40);
            smsToPushStateEvent.setErrorKey(a.getKey());
            smsToPushStateEvent.setError(a.getError());
        } else if (!(th instanceof SmsToPushException)) {
            smsToPushStateEvent.setState(30);
        } else {
            return;
        }
        this.mEventBus.mo96184m(smsToPushStateEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$lastOperationsResponse$2(BankApiResponse bankApiResponse, List list) {
        C32338u0.m95372c((List) bankApiResponse.getResult(), list);
        this.mEventBus.mo96184m(this.mLastOperationsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$lastOperationsResponse$3(Throwable th) {
        this.mEventBus.mo96184m(this.mLastOperationsEvent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCardSecurityResponse$30(C27637o oVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCardSecurityResponse$31(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreditCardsResponse$26(C27637o oVar) {
        Iterator<CreditCardAccount> it = this.creditCardsEvent.getCreditCardsWrapper().getCardsContainer().getAccounts().iterator();
        while (it.hasNext()) {
            CreditCardAccount next = it.next();
            if (oVar.mo67167a().containsKey(Long.valueOf(next.getAcctKey()))) {
                next.setAccountCreditCards(new ArrayList((Collection) this.cardsUIModelDataMapper.mo65075c(oVar).mo64603a().get(Long.valueOf(next.getAcctKey()))));
            }
        }
        this.mEventBus.mo96184m(this.creditCardsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreditCardsResponse$27(Throwable th) {
        this.mEventBus.mo96184m(this.creditCardsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onDepositBondsResponse$24(C27637o oVar) {
        Iterator<Deposit> it = this.depositBondsEvent.getDepositBonds().getDeposits().getDeposits().iterator();
        while (it.hasNext()) {
            Deposit next = it.next();
            if (oVar.mo67167a().containsKey(Long.valueOf(next.getAccountKey()))) {
                next.setDepositCards(new ArrayList((Collection) this.cardsUIModelDataMapper.mo65075c(oVar).mo64603a().get(Long.valueOf(next.getAccountKey()))));
            }
        }
        this.mEventBus.mo96184m(this.depositBondsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onDepositBondsResponse$25(Throwable th) {
        this.mEventBus.mo96184m(this.depositBondsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoansResponse$6(C27637o oVar) {
        Iterator<Loan> it = this.loansEvent.getLoansWrapper().getLoans().iterator();
        while (it.hasNext()) {
            Loan next = it.next();
            if (next.isMortgage()) {
                next.setLoanCards(C32307h.m95233j(this.loansEvent.getLoansWrapper().getOffsetAccounts(), this.cardsUIModelDataMapper.mo65075c(oVar)));
            } else if (next.hasInstallmentFlag()) {
                next.setLoanCards(C32307h.m95230g(next.getDetails().getDetails(), this.cardsUIModelDataMapper.mo65075c(oVar)));
            }
        }
        this.mEventBus.mo96184m(this.loansEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoansResponse$7(Throwable th) {
        this.mEventBus.mo96184m(this.loansEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onOperationsResponse$28(BankApiResponse bankApiResponse, int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2, List list) {
        C32338u0.m95373d(((OperationResponse) bankApiResponse.getResult()).getMyOperations(), list);
        postOperationsResponse(i, l, l2, l3, l4, l5, l6, str, str2, i2, bankApiResponse);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onOperationsResponse$29(int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2, BankApiResponse bankApiResponse, Throwable th) {
        postOperationsResponse(i, l, l2, l3, l4, l5, l6, str, str2, i2, bankApiResponse);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshAvailableProductsEvent$4(List list) {
        this.productTypes = list;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshAvailableProductsEvent$5(Throwable th) {
        this.productTypes = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestCreditCards$21(C41205b bVar) {
        CreditCardsEvent creditCardsEvent2 = new CreditCardsEvent();
        this.creditCardsEvent = creditCardsEvent2;
        creditCardsEvent2.setState(10);
        this.mEventBus.mo96184m(this.creditCardsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C40754t lambda$requestCreditCards$22(C27637o oVar) {
        return C26186e.m81987e(this.getLegacyCreditCardsAndDetails.mo63910a(false));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestCreditCards$23(Throwable th) {
        this.creditCardsEvent = new CreditCardsEvent();
        C21503d.C21504a aVar = new C21503d.C21504a(th, (Object) null);
        if (aVar.mo53707g()) {
            this.creditCardsEvent.setState(40);
            this.creditCardsEvent.setErrorKey(aVar.mo53705e());
        } else {
            this.creditCardsEvent.setState(30);
        }
        this.mEventBus.mo96184m(this.creditCardsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestDepositBonds$11(C41205b bVar) {
        DepositBondsEvent depositBondsEvent2 = new DepositBondsEvent();
        this.depositBondsEvent = depositBondsEvent2;
        depositBondsEvent2.setState(10);
        this.mEventBus.mo96184m(this.depositBondsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C40754t lambda$requestDepositBonds$12(C27637o oVar) {
        return C26186e.m81987e(this.getLegacyDepositsAndBondsWithDetails.mo63911a(false));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestDepositBonds$14(Throwable th) {
        this.depositBondsEvent = new DepositBondsEvent();
        C21503d.C21504a aVar = new C21503d.C21504a(th, (Object) null);
        if (aVar.mo53707g()) {
            this.depositBondsEvent.setState(40);
            this.depositBondsEvent.setErrorKey(aVar.mo53705e());
        } else {
            this.depositBondsEvent.setState(30);
        }
        this.mEventBus.mo96184m(this.depositBondsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestLoans$10(Throwable th) {
        this.loansEvent = new LoansEvent();
        C21503d.C21504a aVar = new C21503d.C21504a(th, (Object) null);
        if (aVar.mo53707g()) {
            this.loansEvent.setState(40);
            this.loansEvent.setErrorKey(aVar.mo53705e());
        } else {
            this.loansEvent.setState(30);
        }
        this.mEventBus.mo96184m(this.loansEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestLoans$8(C41205b bVar) {
        LoansEvent loansEvent2 = new LoansEvent();
        this.loansEvent = loansEvent2;
        loansEvent2.setState(10);
        this.mEventBus.mo96184m(this.loansEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C40754t lambda$requestLoans$9(C27637o oVar) {
        return C26186e.m81987e(this.getLegacyLoanWithDetails.mo63912a(false));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPensions$0(C41205b bVar) {
        PensionsEvent pensionsEvent2 = new PensionsEvent();
        this.pensionsEvent = pensionsEvent2;
        pensionsEvent2.setState(10);
        this.mEventBus.mo96184m(this.pensionsEvent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPensions$1(Throwable th) {
        this.pensionsEvent = new PensionsEvent();
        C21503d.C21504a aVar = new C21503d.C21504a(th, (Object) null);
        if (aVar.mo53707g()) {
            this.pensionsEvent.setState(40);
            this.pensionsEvent.setErrorKey(aVar.mo53705e());
        } else {
            this.pensionsEvent.setState(30);
        }
        this.mEventBus.mo96184m(this.pensionsEvent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateAvailableProducts$15(C27631i iVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateAvailableProducts$16(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateClientProducts$17(boolean z, List list) {
        this.productTypes = list;
        updateAvailableProducts(z);
        requestAccountLovs(z, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateClientProducts$18(boolean z, Throwable th) {
        this.productTypes = null;
        updateAvailableProducts(z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateClientProducts$19(C27637o oVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateClientProducts$20(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$userLoggedIn$32(C19909b bVar) {
        this.mLastOperationsEvent = null;
        this.allOperationsEvent = null;
        DepositBondsEvent depositBondsEvent2 = this.depositBondsEvent;
        if (depositBondsEvent2 != null) {
            depositBondsEvent2.resetOperations();
        }
        CreditCardsEvent creditCardsEvent2 = this.creditCardsEvent;
        if (creditCardsEvent2 != null) {
            creditCardsEvent2.resetOperations();
        }
    }

    private void postOperationsResponse(int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2, BankApiResponse<OperationResponse> bankApiResponse) {
        CreditCardAccount creditAccountByKey;
        AllOperationsEvent allOperationsEvent2;
        int i3 = i;
        Long l7 = l2;
        String str3 = str;
        String str4 = str2;
        int i4 = i2;
        if (i3 == 1) {
            AccountOperationsEvent accountOperationsEvent = new AccountOperationsEvent();
            accountOperationsEvent.setAcctKey(l.longValue());
            if (bankApiResponse.isNetworkFailure()) {
                accountOperationsEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                accountOperationsEvent.setState(20);
                if (accountOperationsEvent.getOperations().size() == i4) {
                    accountOperationsEvent.getOperations().addAll(bankApiResponse.getResult().getMyOperations());
                }
                accountOperationsEvent.setCanDownloadMore(false);
            } else {
                accountOperationsEvent.setState(40);
                accountOperationsEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(accountOperationsEvent);
        } else if (i3 == 2) {
            CreditCardsEvent creditCardsEvent2 = this.creditCardsEvent;
            if (creditCardsEvent2 != null && creditCardsEvent2.getCreditCardsWrapper() != null && (creditAccountByKey = this.creditCardsEvent.getCreditCardsWrapper().getCreditAccountByKey(l7)) != null) {
                CreditAccountOperationsEvent operationsEvent = creditAccountByKey.getOperationsEvent();
                if (operationsEvent == null) {
                    operationsEvent = new CreditAccountOperationsEvent();
                    operationsEvent.setAcctKey(creditAccountByKey.getAcctKey());
                }
                CreditAccountOperationsEvent creditAccountOperationsEvent = new CreditAccountOperationsEvent();
                creditAccountOperationsEvent.setAcctKey(operationsEvent.getAcctKey());
                creditAccountOperationsEvent.setOperations(operationsEvent.getOperations());
                if (bankApiResponse.isNetworkFailure()) {
                    creditAccountOperationsEvent.setState(30);
                } else if (bankApiResponse.isSuccess()) {
                    creditAccountOperationsEvent.setState(20);
                    if (creditAccountOperationsEvent.getOperations().size() == i4) {
                        creditAccountOperationsEvent.getOperations().addAll(bankApiResponse.getResult().getMyOperations());
                    }
                    creditAccountOperationsEvent.setCanDownloadMore(false);
                } else {
                    creditAccountOperationsEvent.setState(40);
                    creditAccountOperationsEvent.setErrorKey(bankApiResponse.getKey());
                }
                creditAccountByKey.setOperationsEvent(creditAccountOperationsEvent);
                this.mEventBus.mo96184m(creditAccountOperationsEvent);
            }
        } else if (i3 == 6) {
            Long l8 = l3;
            CardOperationsEvent cardOperationsEvent = new CardOperationsEvent();
            cardOperationsEvent.setCardId(l3.longValue());
            if (bankApiResponse.isNetworkFailure()) {
                cardOperationsEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                cardOperationsEvent.setState(20);
                if (cardOperationsEvent.getOperations().size() == i4) {
                    cardOperationsEvent.getOperations().addAll(bankApiResponse.getResult().getMyOperations());
                }
                cardOperationsEvent.setCanDownloadMore(false);
            } else {
                cardOperationsEvent.setState(40);
                cardOperationsEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(cardOperationsEvent);
        } else if (i3 == 12 && (allOperationsEvent2 = this.allOperationsEvent) != null && C32359z0.m95598z(allOperationsEvent2.getAcctKey(), l7) && C32359z0.m95598z(this.allOperationsEvent.getCardId(), l3) && C32359z0.m95598z(Long.valueOf(this.allOperationsEvent.getStartDate()), l4) && C32359z0.m95598z(this.allOperationsEvent.getEndDate(), l5) && C32359z0.m95598z(this.allOperationsEvent.getOperationEntryGroupId(), l6) && C32359z0.m95598z(this.allOperationsEvent.getMerchantClientId(), str3) && C32359z0.m95598z(this.allOperationsEvent.getEssServiceId(), str4)) {
            AllOperationsEvent allOperationsEvent3 = new AllOperationsEvent();
            allOperationsEvent3.setOperations(this.allOperationsEvent.getOperations());
            if (bankApiResponse.isNetworkFailure()) {
                allOperationsEvent3.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                allOperationsEvent3.setState(20);
                if (allOperationsEvent3.getOperations().size() == i4) {
                    allOperationsEvent3.getOperations().addAll(bankApiResponse.getResult().getMyOperations());
                }
                if (bankApiResponse.getResult().getMyOperations().size() < 20) {
                    allOperationsEvent3.setCanDownloadMore(false);
                }
                allOperationsEvent3.setIncomeSum(bankApiResponse.getResult().getIncomeSum());
                allOperationsEvent3.setOutcomeSum(bankApiResponse.getResult().getOutcomeSum());
                allOperationsEvent3.setEndBalance(bankApiResponse.getResult().getEndBalance());
                allOperationsEvent3.setStartBalance(bankApiResponse.getResult().getStartBalance());
            } else {
                allOperationsEvent3.setState(40);
                allOperationsEvent3.setErrorKey(bankApiResponse.getKey());
            }
            allOperationsEvent3.setAcctKey(this.allOperationsEvent.getAcctKey());
            allOperationsEvent3.setCardId(this.allOperationsEvent.getCardId());
            allOperationsEvent3.setOperationEntryGroupId(this.allOperationsEvent.getOperationEntryGroupId());
            allOperationsEvent3.setMerchantClientId(str3);
            allOperationsEvent3.setEssServiceId(str4);
            allOperationsEvent3.setStartDate(this.allOperationsEvent.getStartDate());
            allOperationsEvent3.setEndDate(this.allOperationsEvent.getEndDate());
            allOperationsEvent3.setOperations(this.allOperationsEvent.getOperations());
            this.allOperationsEvent = allOperationsEvent3;
            this.mEventBus.mo96184m(allOperationsEvent3);
        }
    }

    private void refreshAccountStatementEvent() {
        AccountStatementEvent accountStatementEvent2 = new AccountStatementEvent();
        accountStatementEvent2.setItemKey(this.accountStatementEvent.getItemKey());
        accountStatementEvent2.setType(this.accountStatementEvent.getType());
        accountStatementEvent2.setStartDate(this.accountStatementEvent.getStartDate());
        accountStatementEvent2.setDefinetlyAccountsService(this.accountStatementEvent.isDefinetlyAccountsService());
        accountStatementEvent2.setEndDate(this.accountStatementEvent.getEndDate());
        accountStatementEvent2.setReportID(this.accountStatementEvent.getReportID());
        accountStatementEvent2.setCanDownloadMore(this.accountStatementEvent.canDownloadMore());
        accountStatementEvent2.setAccountStatementWrapper(this.accountStatementEvent.getAccountStatementWrapper());
        accountStatementEvent2.setCasStatementWrapper(this.accountStatementEvent.getCasStatementWrapper());
        accountStatementEvent2.setBonusStatementDetailsWrapper(this.accountStatementEvent.getBonusStatementDetailsWrapper());
        accountStatementEvent2.setCashBackStatementWrapper(this.accountStatementEvent.getCashBackStatementWrapper());
        this.accountStatementEvent = accountStatementEvent2;
    }

    private void refreshDDSTOListEvent() {
        if (this.ddstoListEvent != null) {
            DDSTOListEvent dDSTOListEvent = new DDSTOListEvent();
            dDSTOListEvent.setList(this.ddstoListEvent.getList());
            dDSTOListEvent.setState(this.ddstoListEvent.getState());
            dDSTOListEvent.setErrorKey(this.ddstoListEvent.getErrorKey());
            this.ddstoListEvent = dDSTOListEvent;
            return;
        }
        this.ddstoListEvent = new DDSTOListEvent();
    }

    private void refreshTemplateList() {
        TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
        TemplatesAndConfigEvent templatesAndConfigEvent2 = new TemplatesAndConfigEvent();
        this.mTemplatesAndConfigEvent = templatesAndConfigEvent2;
        if (templatesAndConfigEvent != null) {
            templatesAndConfigEvent2.setState(templatesAndConfigEvent.getState());
            this.mTemplatesAndConfigEvent.setTemplatesWithPaymentConfig(templatesAndConfigEvent.getTemplatesWithPaymentConfig());
            this.mTemplatesAndConfigEvent.setErrorKey(templatesAndConfigEvent.getErrorKey());
        }
    }

    private void refreshTransferTemplates() {
        TransferTemplatesEvent transferTemplatesEvent = this.transfersTemplateEvent;
        TransferTemplatesEvent transferTemplatesEvent2 = new TransferTemplatesEvent();
        this.transfersTemplateEvent = transferTemplatesEvent2;
        transferTemplatesEvent2.setTemplates(transferTemplatesEvent.getTemplates());
        this.transfersTemplateEvent.setState(transferTemplatesEvent.getState());
        this.transfersTemplateEvent.setErrorKey(transferTemplatesEvent.getErrorKey());
    }

    private void setMedalliaParameters(ClientInfoWrapper clientInfoWrapper) {
        if (clientInfoWrapper != null && clientInfoWrapper.getClient() != null) {
            UserInfo client = clientInfoWrapper.getClient();
            MedalliaDigital.setCustomParameter("clientKey", getLoginInfo().mo90304a());
            MedalliaDigital.setCustomParameter("nameGeo", client.firstName);
            MedalliaDigital.setCustomParameter("nameEng", client.firstNameInt);
            MedalliaDigital.setCustomParameter("surnameGeo", client.lastName);
            MedalliaDigital.setCustomParameter("surnameEng", client.lastNameInt);
            C20557a a = C36546y.m108285N().mo89311I().mo48774a("MEDALLIA_SERVICE_PARAMETER");
            if (a != null) {
                C32359z0.m95567f0(a.mo49087d());
            }
            MedalliaDigital.setCustomParameter("age", Integer.valueOf(C32319m.m95304k(client.birthDate.longValue())));
            MedalliaDigital.setCustomParameter("sex", client.sex);
            MedalliaDigital.setCustomParameter("segment", client.clientCategory);
            MedalliaDigital.setCustomParameter("language", this.preferencesApiManager.getLanguage());
            if (client.clientCategory != null) {
                MedalliaDigital.setCustomParameter("categoryType", client.categoryType);
            }
            String str = client.loyaltySegment;
            if (str != null) {
                MedalliaDigital.setCustomParameter("internalSegment", str);
            }
            Double d = client.churnRate;
            if (d != null) {
                MedalliaDigital.setCustomParameter("churnProbability", d);
            }
            C24978b bVar = client.isStaff;
            if (bVar != null) {
                MedalliaDigital.setCustomParameter("isStaff", Boolean.valueOf(bVar.mo63390c()));
            }
            C36874b a2 = this.getClientPhone.mo89560a(true);
            if (a2 != null) {
                MedalliaDigital.setCustomParameter("phone1", a2.mo89806a());
            }
            C36874b a3 = this.getClientPhone.mo89560a(false);
            if (a3 != null) {
                MedalliaDigital.setCustomParameter("phone2", a3.mo89806a());
            }
            C36873a a4 = this.getClientMail.mo89558a(true);
            if (a4 != null) {
                MedalliaDigital.setCustomParameter("mail", a4.mo89800b());
            }
        }
    }

    private void setUpCarParametersAndGetDebt(String str, String str2, TemplateGroup templateGroup) {
        PaymentProviderConfiguration paymentProviderConfiguration = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().get(str2);
        String str3 = str;
        String str4 = str2;
        this.mBankApiManager.getCarPaymentDebt(str3, str4, "", paymentProviderConfiguration.getDebtServiceId(), TemplateBasketItemsWithPaymentConfig.getPaymentParamsForCar(paymentProviderConfiguration.getServiceConfigJson(), templateGroup, this.getAppSettingByNameUseCase), paymentProviderConfiguration, templateGroup.getId());
    }

    private void updateAvailableProducts(boolean z) {
        if (hasProduct("ACCOUNT")) {
            this.compositeDisposable.mo95660b(this.getAccountsAndDetailsUseCase.mo65879c(z).mo95027o0(C40992a.m118827a()).mo94983G0(new C33247m0(), new C33249n0()));
        }
        if (hasProduct("PENSION_FUND")) {
            requestPensions(z);
        }
        if (hasProduct("G&T")) {
            requestBonds(z);
        }
        if (hasProduct("CREDITCARDACCOUNT")) {
            requestCreditCards(z);
        }
        if (hasProduct("LOAN")) {
            requestLoans(z);
        }
        if (hasProduct("DEPOSIT")) {
            requestDepositBonds(z);
        }
    }

    public void ScoolStatementResponse(long j, BankApiResponse<ArrayList<ScoolCardStatementItem>> bankApiResponse) {
        if (this.accountStatementEvent.getType() == 15 && this.accountStatementEvent.getItemKey() == j) {
            refreshAccountStatementEvent();
            if (bankApiResponse.isNetworkFailure()) {
                this.accountStatementEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.accountStatementEvent.setState(20);
                ScoolStatementWrapper scoolStatementWrapper = new ScoolStatementWrapper();
                scoolStatementWrapper.setList(bankApiResponse.getResult());
                if (scoolStatementWrapper.getList() == null) {
                    scoolStatementWrapper.setList(new ArrayList());
                }
                if (this.accountStatementEvent.getScoolStatementWrapper() == null || this.accountStatementEvent.getScoolStatementWrapper().getList() == null) {
                    this.accountStatementEvent.setScoolStatementWrapper(scoolStatementWrapper);
                } else {
                    this.accountStatementEvent.getScoolStatementWrapper().getList().addAll(scoolStatementWrapper.getList());
                }
                if (scoolStatementWrapper.getList().size() < 20) {
                    this.accountStatementEvent.setCanDownloadMore(false);
                }
            } else {
                this.accountStatementEvent.setState(40);
                this.accountStatementEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.accountStatementEvent);
        }
    }

    public void accountReportIDResponse(int i, long j, boolean z, BankApiResponse<AccountReportId> bankApiResponse) {
        int i2;
        AccountStatementEvent accountStatementEvent2 = this.accountStatementEvent;
        if (accountStatementEvent2 == null || i != accountStatementEvent2.getType() || j != this.accountStatementEvent.getItemKey()) {
            return;
        }
        if (bankApiResponse.isNetworkFailure()) {
            refreshAccountStatementEvent();
            this.accountStatementEvent.setState(30);
            this.mEventBus.mo96184m(this.accountStatementEvent);
        } else if (bankApiResponse.isSuccess()) {
            this.accountStatementEvent.setReportID(bankApiResponse.getResult());
            BankApiManager bankApiManager = this.mBankApiManager;
            AccountReportId result = bankApiResponse.getResult();
            if (this.accountStatementEvent.getAccountStatementWrapper() == null || this.accountStatementEvent.getAccountStatementWrapper().getStatement() == null) {
                i2 = 0;
            } else {
                i2 = this.accountStatementEvent.getAccountStatementWrapper().getStatement().size();
            }
            bankApiManager.getAccountStatement(result, "", i2, 20, z);
        } else {
            refreshAccountStatementEvent();
            this.accountStatementEvent.setErrorKey(bankApiResponse.getKey());
            this.accountStatementEvent.setState(40);
            this.mEventBus.mo96184m(this.accountStatementEvent);
        }
    }

    public void accountStatementResponse(AccountReportId accountReportId, BankApiResponse<AccountStatementWrapper> bankApiResponse) {
        AccountStatementEvent accountStatementEvent2 = this.accountStatementEvent;
        if (accountStatementEvent2 != null && accountStatementEvent2.getType() != 9 && this.accountStatementEvent.getReportID() != null && this.accountStatementEvent.getReportID().getAcctKey() == accountReportId.getAcctKey() && this.accountStatementEvent.getReportID().getReportId() == accountReportId.getReportId()) {
            refreshAccountStatementEvent();
            if (bankApiResponse.isNetworkFailure()) {
                this.accountStatementEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.accountStatementEvent.setState(20);
                if (bankApiResponse.getResult().getStatement() == null) {
                    bankApiResponse.getResult().setStatement(new ArrayList());
                }
                if (this.accountStatementEvent.getAccountStatementWrapper() == null || this.accountStatementEvent.getAccountStatementWrapper().getStatement() == null) {
                    this.accountStatementEvent.setAccountStatementWrapper(bankApiResponse.getResult());
                } else {
                    this.accountStatementEvent.getAccountStatementWrapper().getStatement().addAll(bankApiResponse.getResult().getStatement());
                }
                if (bankApiResponse.getResult().getStatement().size() < 20) {
                    this.accountStatementEvent.setCanDownloadMore(false);
                }
            } else {
                this.accountStatementEvent.setState(40);
                this.accountStatementEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.accountStatementEvent);
        }
    }

    public void bonusStatementResponse(String str, BankApiResponse<BonusStatementDetailsWrapper> bankApiResponse) {
        AccountStatementEvent accountStatementEvent2 = this.accountStatementEvent;
        if ((accountStatementEvent2 != null && accountStatementEvent2.getType() == 8 && "AMEX".equals(str)) || (this.accountStatementEvent.getType() == 16 && "PLUS".equals(str))) {
            refreshAccountStatementEvent();
            if (bankApiResponse.isNetworkFailure()) {
                this.accountStatementEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.accountStatementEvent.setState(20);
                if (bankApiResponse.getResult().getList() == null) {
                    bankApiResponse.getResult().setList(new ArrayList());
                }
                if (this.accountStatementEvent.getBonusStatementDetailsWrapper() == null || this.accountStatementEvent.getBonusStatementDetailsWrapper().getList() == null) {
                    this.accountStatementEvent.setBonusStatementDetailsWrapper(bankApiResponse.getResult());
                } else {
                    this.accountStatementEvent.getBonusStatementDetailsWrapper().getList().addAll(bankApiResponse.getResult().getList());
                }
                if (bankApiResponse.getResult().getList().size() < 20) {
                    this.accountStatementEvent.setCanDownloadMore(false);
                }
            } else {
                this.accountStatementEvent.setState(40);
                this.accountStatementEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.accountStatementEvent);
        }
    }

    public boolean canJoinToPlusProgram() {
        if (!isAuthorized() || this.productTypes == null || !this.mUserInfo.isSolo() || hasProduct("PLUS")) {
            return false;
        }
        return true;
    }

    public void casStatementResponse(long j, BankApiResponse<CasStatementWrapper> bankApiResponse) {
        AccountStatementEvent accountStatementEvent2 = this.accountStatementEvent;
        if (accountStatementEvent2 != null && accountStatementEvent2.getType() == 9 && this.accountStatementEvent.getItemKey() == j) {
            refreshAccountStatementEvent();
            if (bankApiResponse.isNetworkFailure()) {
                this.accountStatementEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.accountStatementEvent.setState(20);
                if (bankApiResponse.getResult().getList() == null) {
                    bankApiResponse.getResult().setList(new ArrayList());
                }
                if (this.accountStatementEvent.getCasStatementWrapper() == null || this.accountStatementEvent.getCasStatementWrapper().getList() == null) {
                    this.accountStatementEvent.setCasStatementWrapper(bankApiResponse.getResult());
                } else {
                    this.accountStatementEvent.getCasStatementWrapper().getList().addAll(bankApiResponse.getResult().getList());
                }
                if (bankApiResponse.getResult().getList().size() < 20) {
                    this.accountStatementEvent.setCanDownloadMore(false);
                }
            } else {
                this.accountStatementEvent.setState(40);
                this.accountStatementEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.accountStatementEvent);
        }
    }

    public void changeClientProductStateDefault(String str, String str2, boolean z) {
        this.mBankApiManager.changeClientProductDefault(str, str2, z, true);
    }

    public void changeDeviceLanguage() {
        this.preferencesApiManager.setShouldUpdateLanguage(true);
        this.mBankApiManager.changeDeviceLanguage();
    }

    public void checkModifyTemplateGroupLink() {
        ModifyTemplateGroupLinkEvent modifyTemplateGroupLinkEvent2 = this.modifyTemplateGroupLinkEvent;
        if (modifyTemplateGroupLinkEvent2 != null) {
            this.mEventBus.mo96184m(modifyTemplateGroupLinkEvent2);
        }
    }

    public void clearSessionData() {
        this.compositeDisposable.mo95663e();
        setNullToEvents();
        this.mUserInfo = null;
        this.loginInfo = null;
    }

    public void convertSmsToPush(List<SmsNotification> list, String str, String str2, String str3) {
        C19509h hVar = this.smsToPushManager;
        if (hVar != null) {
            this.compositeDisposable.mo95660b(hVar.mo47747b(list, str, str2, str3).mo94904r(new C33248n(this)).mo94888G(new C33252o(this), new C33259p(this)));
        }
    }

    public void ctPark6MonthsResponse(BankApiResponse<PaymentDebtResponse> bankApiResponse, long j, PaymentProviderConfiguration paymentProviderConfiguration) {
        TemplateGroup templateGroupById = getTemplateGroupById(j);
        if (templateGroupById != null) {
            if (bankApiResponse.isNetworkFailure()) {
                bankApiResponse.getNetworkFailure();
                templateGroupById.getCtPark6MonthsEvent().setState(30);
            } else if (bankApiResponse.isSuccess()) {
                templateGroupById.getCtPark6MonthsEvent().setState(20);
                ArrayList arrayList = new ArrayList();
                if (bankApiResponse.getResult().getValueByKey("expirationDate") != null) {
                    arrayList.add(new TemplateBasketItem(bankApiResponse.getResult().getParameter(), paymentProviderConfiguration, true, true, false));
                }
                templateGroupById.getCtPark6MonthsEvent().setCTPark6Months(arrayList);
            } else {
                templateGroupById.getCtPark6MonthsEvent().setState(40);
                templateGroupById.getCtPark6MonthsEvent().setErrorKey(bankApiResponse.getKey());
            }
            refreshTemplateList();
            this.mEventBus.mo96184m(templateGroupById);
            return;
        }
        refreshTemplateList();
    }

    public void ctParkPenaltiesResponse(BankApiResponse<CarCTParkResponse> bankApiResponse, long j, PaymentProviderConfiguration paymentProviderConfiguration) {
        TemplateGroup templateGroupById = getTemplateGroupById(j);
        if (templateGroupById != null) {
            if (bankApiResponse.isNetworkFailure()) {
                bankApiResponse.getNetworkFailure();
                templateGroupById.getCtParkPenaltiesEvent().setState(30);
            } else if (bankApiResponse.isSuccess()) {
                templateGroupById.getCtParkPenaltiesEvent().setState(20);
                ArrayList arrayList = new ArrayList();
                Iterator<KeyValue[]> it = bankApiResponse.getResult().getFines().iterator();
                while (it.hasNext()) {
                    arrayList.add(C32315k0.m95253b(paymentProviderConfiguration, it.next(), true, false));
                }
                Iterator<KeyValue[]> it2 = bankApiResponse.getResult().getIgnoredFines().iterator();
                while (it2.hasNext()) {
                    arrayList.add(C32315k0.m95253b(paymentProviderConfiguration, it2.next(), false, false));
                }
                templateGroupById.getCtParkPenaltiesEvent().setCTParkPenalties(arrayList);
            } else {
                templateGroupById.getCtParkPenaltiesEvent().setState(40);
                templateGroupById.getCtParkPenaltiesEvent().setErrorKey(bankApiResponse.getKey());
            }
            refreshTemplateList();
            this.mEventBus.mo96184m(templateGroupById);
            return;
        }
        refreshTemplateList();
    }

    public void debtResponse(BankApiResponse<PaymentDebtResponse> bankApiResponse, long j) {
        Object obj;
        if (j != -1) {
            TemplateBasketItem templateItemById = getTemplateItemById(j);
            if (templateItemById != null) {
                if (bankApiResponse.isNetworkFailure()) {
                    bankApiResponse.getNetworkFailure();
                    templateItemById.getTemplateDebtEvent().setState(30);
                } else if (bankApiResponse.isSuccess()) {
                    templateItemById.getTemplateDebtEvent().setState(20);
                    templateItemById.getTemplateDebtEvent().setPaymentDebt(bankApiResponse.getResult());
                    templateItemById.setDebtAmount(C32315k0.m95260i(this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().get(templateItemById.getServiceId()).getServiceConfigJson(), bankApiResponse.getResult()));
                } else {
                    templateItemById.getTemplateDebtEvent().setState(40);
                    templateItemById.getTemplateDebtEvent().setErrorKey(bankApiResponse.getKey());
                }
                refreshTemplateList();
                this.mEventBus.mo96184m(templateItemById);
                return;
            }
            return;
        }
        PaymentDebtEvent paymentDebtEvent = this.mPaymentDebtEvent;
        if (paymentDebtEvent != null) {
            obj = paymentDebtEvent.getInstance();
        } else {
            obj = null;
        }
        PaymentDebtEvent paymentDebtEvent2 = new PaymentDebtEvent();
        this.mPaymentDebtEvent = paymentDebtEvent2;
        paymentDebtEvent2.setErrorKey(bankApiResponse.getKey());
        this.mPaymentDebtEvent.setInstance(obj);
        if (bankApiResponse.isNetworkFailure()) {
            this.mPaymentDebtEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.mPaymentDebtEvent.setState(20);
            this.mPaymentDebtEvent.setPaymentDebt(bankApiResponse.getResult());
        } else {
            this.mPaymentDebtEvent.setState(40);
        }
        this.mEventBus.mo96184m(this.mPaymentDebtEvent);
    }

    public void deleteAccountStatement() {
        this.accountStatementEvent = null;
    }

    public void deleteTemplate(boolean z, long j) {
        DeleteTemplateEvent deleteTemplateEvent;
        if (!z && (deleteTemplateEvent = this.mLastDeleteTemplateEvent) != null && deleteTemplateEvent.getTemplateId() == j) {
            this.mEventBus.mo96184m(this.mLastDeleteTemplateEvent);
        } else if (this.mTemplatesAndConfigEvent.getState() == 20) {
            this.mTemplatesAndConfigEvent.setState(10);
            refreshTemplateList();
            DeleteTemplateEvent deleteTemplateEvent2 = new DeleteTemplateEvent();
            this.mLastDeleteTemplateEvent = deleteTemplateEvent2;
            deleteTemplateEvent2.setTemplateId(j);
            this.mLastDeleteTemplateEvent.setState(10);
            this.mEventBus.mo96184m(this.mTemplatesAndConfigEvent);
            this.mEventBus.mo96184m(this.mLastDeleteTemplateEvent);
            this.mBankApiManager.deleteTemplate(j);
        }
    }

    public void deleteTemplateGroup(boolean z, long j) {
        TemplateGroup templateGroup;
        DeleteTemplateGroupEvent deleteTemplateGroupEvent;
        if (!z && (deleteTemplateGroupEvent = this.mLastDeleteTemplateGroupEvent) != null && deleteTemplateGroupEvent.getTemplateId() == j) {
            this.mEventBus.mo96184m(this.mLastDeleteTemplateGroupEvent);
        } else if (this.mTemplatesAndConfigEvent.getState() == 20 && (templateGroup = getTemplateGroup(j)) != null) {
            this.mTemplatesAndConfigEvent.setState(10);
            refreshTemplateList();
            DeleteTemplateGroupEvent deleteTemplateGroupEvent2 = new DeleteTemplateGroupEvent();
            this.mLastDeleteTemplateGroupEvent = deleteTemplateGroupEvent2;
            deleteTemplateGroupEvent2.setTemplateId(j);
            this.mLastDeleteTemplateGroupEvent.setState(10);
            this.mEventBus.mo96184m(this.mLastDeleteTemplateGroupEvent);
            this.mBankApiManager.deleteTemplateGroup(BankApiResponse.SUCCESSFUL_RESPONSE_CODE, templateGroup);
        }
    }

    public void deleteTemplateGroupResponse(BankApiResponse<Object> bankApiResponse, long j) {
        DeleteTemplateGroupEvent deleteTemplateGroupEvent = new DeleteTemplateGroupEvent();
        this.mLastDeleteTemplateGroupEvent = deleteTemplateGroupEvent;
        deleteTemplateGroupEvent.setTemplateId(j);
        if (bankApiResponse.isNetworkFailure()) {
            this.mLastDeleteTemplateGroupEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.mLastDeleteTemplateGroupEvent.setState(20);
            int size = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().get(size).getId() == j) {
                    this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().remove(size);
                    break;
                } else {
                    size--;
                }
            }
        } else {
            this.mLastDeleteTemplateGroupEvent.setState(40);
            this.mLastDeleteTemplateGroupEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mTemplatesAndConfigEvent.setState(20);
        refreshTemplateList();
        this.mEventBus.mo96184m(this.mLastDeleteTemplateGroupEvent);
        this.mEventBus.mo96184m(this.mTemplatesAndConfigEvent);
    }

    public void deleteTemplateResponse(BankApiResponse<Object> bankApiResponse, long j) {
        DeleteTemplateEvent deleteTemplateEvent = new DeleteTemplateEvent();
        this.mLastDeleteTemplateEvent = deleteTemplateEvent;
        deleteTemplateEvent.setTemplateId(j);
        if (bankApiResponse.isNetworkFailure()) {
            this.mLastDeleteTemplateEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.mLastDeleteTemplateEvent.setState(20);
            int size = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates().get(size).getId() == j) {
                    this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates().remove(size);
                    break;
                } else {
                    size--;
                }
            }
            if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups() != null) {
                Iterator<TemplateGroup> it = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().iterator();
                while (it.hasNext()) {
                    TemplateGroup next = it.next();
                    if (next.getTemplates() != null) {
                        int size2 = next.getTemplates().size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (next.getTemplates().get(size2).getId() == j) {
                                next.getTemplates().remove(size2);
                                break;
                            } else {
                                size2--;
                            }
                        }
                    }
                }
            }
        } else {
            this.mLastDeleteTemplateEvent.setState(40);
            this.mLastDeleteTemplateEvent.setErrorKey(bankApiResponse.getKey());
        }
        Iterator<TemplateGroup> it2 = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().iterator();
        while (it2.hasNext()) {
            TemplateGroup next2 = it2.next();
            if (next2.getGroupType().equals("C")) {
                Iterator<TemplateBasketItem> it3 = next2.getCtParkPenaltiesEvent().getCTParkPenalties().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (it3.next().getId() == j) {
                            refreshCarDebt(next2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        this.mTemplatesAndConfigEvent.setState(20);
        refreshTemplateList();
        this.mEventBus.mo96184m(this.mLastDeleteTemplateEvent);
        this.mEventBus.mo96184m(this.mTemplatesAndConfigEvent);
    }

    public void deleteTransferTemplate(boolean z, long j) {
        if (!z && shouldNotRefresh(this.transferDeleteTemplateEvent) && this.transferDeleteTemplateEvent.getTemplateId() == j) {
            this.mEventBus.mo96184m(this.transferDeleteTemplateEvent);
        } else if (this.transfersTemplateEvent.getState() == 20) {
            this.transfersTemplateEvent.setState(10);
            refreshTransferTemplates();
            TransferDeleteTemplateEvent transferDeleteTemplateEvent2 = new TransferDeleteTemplateEvent();
            this.transferDeleteTemplateEvent = transferDeleteTemplateEvent2;
            transferDeleteTemplateEvent2.setTemplateId(j);
            this.transferDeleteTemplateEvent.setState(10);
            this.mEventBus.mo96184m(this.transferDeleteTemplateEvent);
            this.mBankApiManager.deleteTransferTemplate(j);
        }
    }

    public void deleteTransferTemplateResponse(BankApiResponse<Object> bankApiResponse, long j) {
        TransferTemplatesEvent transferTemplatesEvent;
        if (!bankApiResponse.isNetworkFailure() && bankApiResponse.isSuccess() && (transferTemplatesEvent = this.transfersTemplateEvent) != null && transferTemplatesEvent.getTemplates() != null) {
            Iterator<TemplateBasketItem> it = this.transfersTemplateEvent.getTemplates().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TemplateBasketItem next = it.next();
                if (next.getId() == j) {
                    this.transfersTemplateEvent.getTemplates().remove(next);
                    break;
                }
            }
        }
        if (this.transferDeleteTemplateEvent.getTemplateId() == j) {
            if (bankApiResponse.isNetworkFailure()) {
                this.transferDeleteTemplateEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.transferDeleteTemplateEvent.setState(20);
            } else {
                this.transferDeleteTemplateEvent.setState(40);
                this.transferDeleteTemplateEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.transfersTemplateEvent.setState(20);
            refreshTransferTemplates();
            this.mEventBus.mo96184m(this.transferDeleteTemplateEvent);
            this.mEventBus.mo96184m(this.transfersTemplateEvent);
        }
    }

    public void emitOnDepositsSuccess(C40763y yVar) {
        C37019f fVar = this.getDepositsAndBonds;
        if (fVar == null) {
            yVar.mo95093a(Boolean.FALSE);
        } else {
            this.compositeDisposable.mo95660b(C26186e.m81990h(fVar.mo89942a(false)).mo95070I(new C33235g0(yVar), new C33239i0(yVar)));
        }
    }

    public void forceUpdateData() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (Client.this.isAuthorized()) {
                    Client.this.updateClientProducts();
                }
            }
        }, 2000);
    }

    public void getAgreementTemplate(String str) {
        getAgreementTemplate(str, "");
    }

    public int getCardPositionByCardId(long j) {
        int cardPosByCardId;
        CreditCardsEvent creditCardsEvent2 = this.creditCardsEvent;
        if (creditCardsEvent2 == null || creditCardsEvent2.getState() != 20 || (cardPosByCardId = this.creditCardsEvent.getCreditCardsWrapper().getCardPosByCardId(j)) < 0) {
            return -1;
        }
        return cardPosByCardId;
    }

    public CcyHistoryWrapper getCcyHistoryWrapper() {
        return this.mCcyHistoryWrapper;
    }

    public void getCountries() {
        if (shouldNotRefresh(this.countriesEvent)) {
            this.mEventBus.mo96184m(this.countriesEvent);
            return;
        }
        CountriesEvent countriesEvent2 = new CountriesEvent();
        this.countriesEvent = countriesEvent2;
        countriesEvent2.setState(10);
        this.mEventBus.mo96184m(this.countriesEvent);
        this.mBankApiManager.getCountries();
    }

    public void getCountryCodeBySwift(String str, String str2) {
        if (!this.countryCodeBySwiftEvents.containsKey(str2) || !shouldNotRefresh(this.countryCodeBySwiftEvents.get(str2)) || this.countryCodeBySwiftEvents.get(str2) == null || this.countryCodeBySwiftEvents.get(str2).swift == null || !this.countryCodeBySwiftEvents.get(str2).swift.equals(str)) {
            CountryCodeBySwiftEvent countryCodeBySwiftEvent = new CountryCodeBySwiftEvent();
            countryCodeBySwiftEvent.setState(10);
            countryCodeBySwiftEvent.tag = str2;
            this.countryCodeBySwiftEvents.put(str2, countryCodeBySwiftEvent);
            this.mEventBus.mo96184m(countryCodeBySwiftEvent);
            this.mBankApiManager.getCountryCodeBySwift(str, str2);
            return;
        }
        this.mEventBus.mo96184m(this.countryCodeBySwiftEvents.get(str2));
    }

    public CreditCardAccount getCreditAccountByAcctKey(long j) {
        CreditCardsEvent creditCardsEvent2 = this.creditCardsEvent;
        if (creditCardsEvent2 == null || creditCardsEvent2.getState() != 20 || this.creditCardsEvent.getCreditCardsWrapper() == null) {
            return null;
        }
        return this.creditCardsEvent.getCreditCardsWrapper().getCreditAccountByKey(Long.valueOf(j));
    }

    public CreditCardsEvent getCreditsEvent() {
        return this.creditCardsEvent;
    }

    public ArrayList<DDPaymentAccount> getDDPaymentAccounts() {
        ArrayList<DDPaymentAccount> arrayList = new ArrayList<>();
        DDAccountsEvent dDAccountsEvent = this.ddAccountsEvent;
        if (dDAccountsEvent != null) {
            return dDAccountsEvent.ddAccounts;
        }
        return arrayList;
    }

    public ArrayList<STOPeriodType> getDDPeriodTypes() {
        ArrayList<STOPeriodType> arrayList = new ArrayList<>();
        DDPeriodTypesEvent dDPeriodTypesEvent = this.ddPeriodTypesEvent;
        if (dDPeriodTypesEvent != null) {
            return dDPeriodTypesEvent.ddPeriodTypes;
        }
        return arrayList;
    }

    public ArrayList<DDProviderItem> getDDProviders() {
        ArrayList<DDProviderItem> arrayList = new ArrayList<>();
        DDProvidersListEvent dDProvidersListEvent = this.ddProvidersListEvent;
        if (dDProvidersListEvent != null) {
            return dDProvidersListEvent.providerItems;
        }
        return arrayList;
    }

    public DepositBondsEvent getDepositsEvent() {
        return this.depositBondsEvent;
    }

    public LoansEvent getLoansEvent() {
        return this.loansEvent;
    }

    public C37228a getLoginInfo() {
        return this.loginInfo;
    }

    public List<Notification> getNotificationList() {
        NotificationListEvent notificationListEvent2 = this.notificationListEvent;
        if (notificationListEvent2 == null || notificationListEvent2.getNotificationList() == null) {
            return null;
        }
        return this.notificationListEvent.getNotificationList().getNotifications();
    }

    public PaymentProviderConfiguration getPaymentConfigurationByTemplateId(long j) {
        TemplateBasketItem templateItemById = getTemplateItemById(j);
        if (templateItemById == null || !this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().containsKey(templateItemById.getServiceId())) {
            return null;
        }
        return this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().get(templateItemById.getServiceId());
    }

    public long getProductKeyByCardId(long j) {
        CreditCardsEvent creditCardsEvent2 = this.creditCardsEvent;
        if (creditCardsEvent2 == null || creditCardsEvent2.getState() != 20) {
            return -1;
        }
        long acctKeyByCardId = this.creditCardsEvent.getCreditCardsWrapper().getAcctKeyByCardId(j);
        if (acctKeyByCardId > 0) {
            return acctKeyByCardId;
        }
        return -1;
    }

    public RegistrationAnalyticEvent getRegistrationAnalyticEvent() {
        return this.registrationAnalyticEvent;
    }

    public void getReportingCodes(String str) {
        if (shouldNotRefresh(this.reportingCodesEvent)) {
            this.mEventBus.mo96184m(this.reportingCodesEvent);
            return;
        }
        ReportingCodesEvent reportingCodesEvent2 = new ReportingCodesEvent();
        this.reportingCodesEvent = reportingCodesEvent2;
        reportingCodesEvent2.setState(10);
        this.mEventBus.mo96184m(this.reportingCodesEvent);
        this.mBankApiManager.getReportingCodes(str);
    }

    public TemplateBasketItemsWithPaymentConfig getTemplateBasketItemsWithConfig() {
        TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
        if (templatesAndConfigEvent != null) {
            return templatesAndConfigEvent.getTemplatesWithPaymentConfig();
        }
        return null;
    }

    public PaymentProviderConfiguration getTemplateConfigViaTemplateId(String str) {
        if (this.mTemplatesAndConfigEvent != null) {
            try {
                return this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getPaymentProviderConfiguration(getTemplateItemById(Long.valueOf(str).longValue()));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public TemplateBasketItem getTemplateFromCarGroup(long j, String str, String str2) {
        TemplateGroup templateGroupById = getTemplateGroupById(j);
        if (templateGroupById != null) {
            if (str.equals("bog-comp-tbprkpenaltiespin") && templateGroupById.getCtParkPenaltiesEvent() != null) {
                return getTemplateGroupItemByMandatoryValueCheck(templateGroupById.getCtParkPenaltiesEvent().getCTParkPenalties(), str2);
            }
            if (str.equals("bog-comp-tbprk1week")) {
                return getTemplateGroupItemByMandatoryValueCheck(templateGroupById.getCtPark6MonthsEvent().getCTPark6Months(), str2);
            }
        }
        return null;
    }

    public TemplateGroup getTemplateGroup(long j) {
        for (int size = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().size() - 1; size >= 0; size--) {
            if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().get(size).getId() == j) {
                return this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().get(size);
            }
        }
        return null;
    }

    public TemplateGroup getTemplateGroupById(long j) {
        TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
        if (!(templatesAndConfigEvent == null || templatesAndConfigEvent.getTemplatesWithPaymentConfig() == null || this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups() == null)) {
            Iterator<TemplateGroup> it = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().iterator();
            while (it.hasNext()) {
                TemplateGroup next = it.next();
                if (next.getId() == j) {
                    return next;
                }
            }
        }
        return null;
    }

    public TemplateBasketItem getTemplateGroupItemByMandatoryValueCheck(ArrayList<TemplateBasketItem> arrayList, String str) {
        String parameterValue;
        Iterator<TemplateBasketItem> it = arrayList.iterator();
        TemplateBasketItem templateBasketItem = null;
        while (it.hasNext()) {
            TemplateBasketItem next = it.next();
            PaymentProviderConfiguration paymentProviderConfiguration = getTemplateBasketItemsWithConfig().getConfig().get(next.getServiceId());
            if (!(paymentProviderConfiguration == null || paymentProviderConfiguration.getServiceConfigJson() == null || (parameterValue = next.getParameterValue(paymentProviderConfiguration.getServiceConfigJson().getParameterIdByParamType("M"), 0)) == null || !parameterValue.equals(str))) {
                templateBasketItem = next;
            }
        }
        return templateBasketItem;
    }

    public TemplateBasketItem getTemplateItemById(long j) {
        TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
        if (templatesAndConfigEvent == null || templatesAndConfigEvent.getTemplatesWithPaymentConfig() == null || this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates() == null) {
            return null;
        }
        Iterator<TemplateBasketItem> it = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates().iterator();
        while (it.hasNext()) {
            TemplateBasketItem next = it.next();
            if (next != null && next.getId() == j) {
                return next;
            }
        }
        return null;
    }

    public TemplateBasketItem getTransferTemplateItemById(long j) {
        TransferTemplatesEvent transferTemplatesEvent = this.transfersTemplateEvent;
        if (transferTemplatesEvent == null || transferTemplatesEvent.getTemplates() == null) {
            return null;
        }
        Iterator<TemplateBasketItem> it = this.transfersTemplateEvent.getTemplates().iterator();
        while (it.hasNext()) {
            TemplateBasketItem next = it.next();
            if (next != null && next.getId() == j) {
                return next;
            }
        }
        return null;
    }

    public ClientInfoWrapper getUserInfo() {
        return this.mUserInfo;
    }

    public UserRestrictions getUserRestrictions() {
        return this.userRestrictions;
    }

    public boolean hasProduct(String str) {
        List<ProductType> list = this.productTypes;
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (ProductType next : list) {
            if (next.getProduct() != null && next.getProduct().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasProducts() {
        List<ProductType> list = this.productTypes;
        return list != null && list.size() > 0;
    }

    public void hideClientProduct(String str, String str2, boolean z) {
        CreditCardAccount creditCardAccount;
        if (!TextUtils.isEmpty(str2)) {
            long longValue = Long.valueOf(str2).longValue();
            if ("ACCOUNT".equals(str)) {
                CreditCardsEvent creditCardsEvent2 = this.creditCardsEvent;
                if (creditCardsEvent2 == null || creditCardsEvent2.getCreditCardsWrapper() == null) {
                    creditCardAccount = null;
                } else {
                    creditCardAccount = this.creditCardsEvent.getCreditCardsWrapper().getCreditAccountByKey(Long.valueOf(longValue));
                    refreshCreditCardsEvent();
                }
                if (creditCardAccount != null) {
                    creditCardAccount.setHidden(z);
                }
                this.mEventBus.mo96184m(this.creditCardsEvent);
                this.mBankApiManager.hideClientProduct(str, str2, z);
            }
        }
    }

    public boolean isAllDebtsReceived() {
        TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
        if (templatesAndConfigEvent == null || templatesAndConfigEvent.getTemplatesWithPaymentConfig() == null || this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates() == null) {
            return true;
        }
        Iterator<TemplateBasketItem> it = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates().iterator();
        while (it.hasNext()) {
            TemplateBasketItem next = it.next();
            if (next.getTemplateDebtEvent() != null && next.getTemplateDebtEvent().getState() == 10) {
                return false;
            }
        }
        return true;
    }

    public boolean isAuthorized() {
        return (this.mUserInfo == null || this.loginInfo == null) ? false : true;
    }

    public void lastOperationResponse(String str, BankApiResponse<LastOperation> bankApiResponse) {
        OperationHistoryEvent operationHistoryEvent2 = this.operationHistoryEvent;
        if (operationHistoryEvent2 != null && C32359z0.m95598z(operationHistoryEvent2.getEssId(), str)) {
            OperationHistoryEvent operationHistoryEvent3 = new OperationHistoryEvent();
            this.operationHistoryEvent = operationHistoryEvent3;
            operationHistoryEvent3.setEssId(str);
            if (bankApiResponse.isNetworkFailure()) {
                bankApiResponse.getNetworkFailure();
                this.operationHistoryEvent.setState(30);
            } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null || !C32359z0.m95598z(bankApiResponse.getResult().getEssPaymentId(), str)) {
                this.operationHistoryEvent.setState(40);
                this.operationHistoryEvent.setErrorKey(bankApiResponse.getKey());
            } else {
                this.operationHistoryEvent.setState(20);
                this.operationHistoryEvent.setOperationHistory(bankApiResponse.getResult());
            }
            this.mEventBus.mo96184m(this.operationHistoryEvent);
        }
    }

    public void lastOperationsResponse(long j, Long l, int i, BankApiResponse<ArrayList<LastOperation>> bankApiResponse) {
        UnAuthorizedAllOperationsEvent unAuthorizedAllOperationsEvent2;
        if (!isAuthorized() && (unAuthorizedAllOperationsEvent2 = this.unAuthorizedAllOperationsEvent) != null && C32359z0.m95598z(Long.valueOf(unAuthorizedAllOperationsEvent2.getStartDate()), Long.valueOf(j)) && C32359z0.m95598z(this.unAuthorizedAllOperationsEvent.getEndDate(), l)) {
            UnAuthorizedAllOperationsEvent unAuthorizedAllOperationsEvent3 = new UnAuthorizedAllOperationsEvent();
            unAuthorizedAllOperationsEvent3.setOperations(this.unAuthorizedAllOperationsEvent.getLastOperations());
            if (bankApiResponse.isNetworkFailure()) {
                unAuthorizedAllOperationsEvent3.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                unAuthorizedAllOperationsEvent3.setState(20);
                if (unAuthorizedAllOperationsEvent3.getLastOperations().size() == i) {
                    unAuthorizedAllOperationsEvent3.getLastOperations().addAll(bankApiResponse.getResult());
                }
                if (bankApiResponse.getResult().size() < 20) {
                    unAuthorizedAllOperationsEvent3.setCanDownloadMore(false);
                }
            } else {
                unAuthorizedAllOperationsEvent3.setState(40);
                unAuthorizedAllOperationsEvent3.setErrorKey(bankApiResponse.getKey());
            }
            unAuthorizedAllOperationsEvent3.setStartDate(this.unAuthorizedAllOperationsEvent.getStartDate());
            unAuthorizedAllOperationsEvent3.setEndDate(this.unAuthorizedAllOperationsEvent.getEndDate());
            unAuthorizedAllOperationsEvent3.setOperations(this.unAuthorizedAllOperationsEvent.getLastOperations());
            this.unAuthorizedAllOperationsEvent = unAuthorizedAllOperationsEvent3;
            this.mEventBus.mo96184m(unAuthorizedAllOperationsEvent3);
        }
    }

    public void mapObjectDetailsResponse(MapObject mapObject, BankApiResponse<ArrayList<MapObjectDetail>> bankApiResponse) {
        MapObjectDetail mapObjectDetail;
        MapObjectDetailsEvent mapObjectDetailsEvent = new MapObjectDetailsEvent();
        this.lastMapObjectDetailsEvent = mapObjectDetailsEvent;
        mapObjectDetailsEvent.setMapObject(mapObject);
        if (bankApiResponse.isNetworkFailure()) {
            this.lastMapObjectDetailsEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.lastMapObjectDetailsEvent.setState(20);
            if (bankApiResponse.getResult().size() > 0) {
                mapObjectDetail = (MapObjectDetail) bankApiResponse.getResult().get(0);
            } else {
                mapObjectDetail = null;
            }
            mapObject.setDetails(mapObjectDetail);
        } else {
            this.lastMapObjectDetailsEvent.setState(40);
            this.lastMapObjectDetailsEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.lastMapObjectDetailsEvent);
    }

    public void mapObjectStatusResponse(MapObject mapObject, BankApiResponse<String> bankApiResponse) {
        MapObjectStatusEvent mapObjectStatusEvent2 = this.mapObjectStatusEvent;
        if (mapObjectStatusEvent2 != null && mapObjectStatusEvent2.getMapObject() != null && this.mapObjectStatusEvent.getMapObject().getObjectKey().equals(mapObject.getObjectKey()) && this.mapObjectStatusEvent.getMapObject().getObjectName().equals(mapObject.getObjectName()) && this.mapObjectStatusEvent.getMapObject().getObjectType().equals(mapObject.getObjectType())) {
            MapObjectStatusEvent mapObjectStatusEvent3 = new MapObjectStatusEvent();
            this.mapObjectStatusEvent = mapObjectStatusEvent3;
            mapObjectStatusEvent3.setMapObject(mapObject);
            if (bankApiResponse.isNetworkFailure()) {
                this.mapObjectStatusEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.mapObjectStatusEvent.setState(20);
                this.mapObjectStatusEvent.setStatus(bankApiResponse.getResult());
            } else {
                this.mapObjectStatusEvent.setState(40);
                this.mapObjectStatusEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.mapObjectStatusEvent);
        }
    }

    public void mapObjectsResponse(BankApiResponse<List<MapObject>> bankApiResponse) {
        this.mMapObjectsEvent = new MapObjectsEvent();
        if (bankApiResponse.isNetworkFailure()) {
            bankApiResponse.getNetworkFailure();
            this.mMapObjectsEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.mMapObjectsEvent.setState(20);
            MapObjectWrapper mapObjectWrapper = new MapObjectWrapper();
            mapObjectWrapper.setMapObjects(bankApiResponse.getResult());
            for (String str : C32312j.f79731a) {
                ArrayList arrayList = new ArrayList();
                for (MapObject next : mapObjectWrapper.getMapObjects()) {
                    if (next.getObjectType() != null && next.getObjectType().startsWith(str)) {
                        arrayList.add(next);
                    }
                }
                mapObjectWrapper.addMapObjectsByType(str, arrayList);
            }
            this.mMapObjectsEvent.setMapObjects(mapObjectWrapper);
        } else {
            this.mMapObjectsEvent.setState(40);
            this.mMapObjectsEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.mMapObjectsEvent);
    }

    public void mapRegionsLoaded(BankApiResponse<ArrayList<MapRegion>> bankApiResponse) {
        this.mapRegionsEvent = new MapRegionsEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.mapRegionsEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.mapRegionsEvent.setState(20);
            this.mapRegionsEvent.setMapRegions(bankApiResponse.getResult());
        } else {
            this.mapRegionsEvent.setState(40);
            this.mapRegionsEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.mapRegionsEvent);
    }

    public void modifyTemplate(boolean z, TemplateBasketItem templateBasketItem, PaymentProviderConfiguration paymentProviderConfiguration, File file, Long l, String str) {
        ModifyTemplateEvent modifyTemplateEvent;
        if (z || (modifyTemplateEvent = this.mLastModifyTemplateEvent) == null || modifyTemplateEvent.getTemplate().getId() != templateBasketItem.getId()) {
            TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
            if (templatesAndConfigEvent != null && templatesAndConfigEvent.getState() == 20) {
                this.mTemplatesAndConfigEvent.setState(10);
                if (!(paymentProviderConfiguration == null || paymentProviderConfiguration.getServiceId() == null)) {
                    this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().put(paymentProviderConfiguration.getServiceId(), paymentProviderConfiguration);
                }
                refreshTemplateList();
                ModifyTemplateEvent modifyTemplateEvent2 = new ModifyTemplateEvent();
                this.mLastModifyTemplateEvent = modifyTemplateEvent2;
                modifyTemplateEvent2.setTemplate(templateBasketItem);
                if (templateBasketItem.canGetDebt()) {
                    templateBasketItem.getTemplateDebtEvent().setState(10);
                    templateBasketItem.setDebtAmount(0);
                    templateBasketItem.getTemplateDebtEvent().setPaymentDebt(new PaymentDebtResponse());
                }
                TemplateBasketItem templateItemById = getTemplateItemById(templateBasketItem.getId());
                if (templateItemById != null && templateItemById.canGetDebt()) {
                    templateItemById.getTemplateDebtEvent().setState(10);
                    templateItemById.setDebtAmount(0);
                    templateItemById.getTemplateDebtEvent().setPaymentDebt(new PaymentDebtResponse());
                }
                this.mLastModifyTemplateEvent.setState(10);
                this.mEventBus.mo96184m(this.mLastModifyTemplateEvent);
                this.mBankApiManager.modifyTemplate(templateBasketItem, file, l, str);
                return;
            }
            return;
        }
        this.mEventBus.mo96184m(this.mLastModifyTemplateEvent);
    }

    public void modifyTemplateGroup(boolean z, TemplateGroup templateGroup, File file) {
        ModifyTemplateGroupEvent modifyTemplateGroupEvent;
        if (z || (modifyTemplateGroupEvent = this.mLastModifyTemplateGroupEvent) == null || modifyTemplateGroupEvent.getTemplateGroup().getId() != templateGroup.getId()) {
            TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
            if (templatesAndConfigEvent != null && templatesAndConfigEvent.getState() == 20) {
                this.mTemplatesAndConfigEvent.setState(10);
                refreshTemplateList();
                if (templateGroup.getGroupType() != null && templateGroup.getGroupType().equals("C")) {
                    templateGroup.getCtParkPenaltiesEvent().setState(10);
                    templateGroup.getCtParkPenaltiesEvent().setCTParkPenalties(new ArrayList());
                    templateGroup.getCtPark6MonthsEvent().setState(10);
                    templateGroup.getCtPark6MonthsEvent().setCTPark6Months(new ArrayList());
                }
                TemplateGroup templateGroup2 = getTemplateGroup(templateGroup.getId());
                if (!(templateGroup2 == null || templateGroup2.getGroupType() == null || !templateGroup2.getGroupType().equals("C"))) {
                    templateGroup2.getCtParkPenaltiesEvent().setState(10);
                    templateGroup2.getCtParkPenaltiesEvent().setCTParkPenalties(new ArrayList());
                    templateGroup2.getCtPark6MonthsEvent().setState(10);
                    templateGroup2.getCtPark6MonthsEvent().setCTPark6Months(new ArrayList());
                }
                ModifyTemplateGroupEvent modifyTemplateGroupEvent2 = new ModifyTemplateGroupEvent();
                this.mLastModifyTemplateGroupEvent = modifyTemplateGroupEvent2;
                modifyTemplateGroupEvent2.setTemplateGroup(templateGroup);
                this.mLastModifyTemplateGroupEvent.setState(10);
                this.mEventBus.mo96184m(this.mLastModifyTemplateGroupEvent);
                this.mBankApiManager.modifyTemplateGroup("", templateGroup, file);
                return;
            }
            return;
        }
        this.mEventBus.mo96184m(this.mLastModifyTemplateGroupEvent);
    }

    public void modifyTemplateGroupLinkResponse(BankApiResponse<Void> bankApiResponse, String str, long j, String str2) {
        this.modifyTemplateGroupLinkEvent = new ModifyTemplateGroupLinkEvent(j, str, str2);
        if (bankApiResponse.isNetworkFailure()) {
            this.modifyTemplateGroupLinkEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.modifyTemplateGroupLinkEvent.setState(20);
            TemplateGroup templateGroupById = getTemplateGroupById(j);
            if (templateGroupById != null) {
                for (String parseLong : str.split(",")) {
                    long parseLong2 = Long.parseLong(parseLong);
                    if (str2.equals("CREATE")) {
                        TemplateBasketItem templateItemById = getTemplateItemById(parseLong2);
                        if (templateGroupById.getTemplates() == null) {
                            templateGroupById.setTemplates(new ArrayList());
                        }
                        templateGroupById.getTemplates().add(templateItemById);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (TemplateBasketItem next : templateGroupById.getTemplates()) {
                            if (next.getId() == parseLong2) {
                                arrayList.add(next);
                            }
                        }
                        templateGroupById.getTemplates().removeAll(arrayList);
                    }
                }
            }
        } else {
            this.modifyTemplateGroupLinkEvent.setState(40);
            this.modifyTemplateGroupLinkEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mTemplatesAndConfigEvent.setState(20);
        refreshTemplateList();
        this.mEventBus.mo96184m(this.modifyTemplateGroupLinkEvent);
    }

    public void modifyTemplateGroupResponse(BankApiResponse<TemplateGroup> bankApiResponse) {
        TemplateGroup templateGroup;
        ModifyTemplateGroupEvent modifyTemplateGroupEvent = this.mLastModifyTemplateGroupEvent;
        if (modifyTemplateGroupEvent == null) {
            templateGroup = null;
        } else {
            templateGroup = modifyTemplateGroupEvent.getTemplateGroup();
        }
        this.mLastModifyTemplateGroupEvent = new ModifyTemplateGroupEvent();
        if (bankApiResponse.getResult() != null) {
            this.mLastModifyTemplateGroupEvent.setTemplateGroup(bankApiResponse.getResult());
        } else {
            this.mLastModifyTemplateGroupEvent.setTemplateGroup(templateGroup);
        }
        if (bankApiResponse.isNetworkFailure()) {
            this.mLastModifyTemplateGroupEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.mLastModifyTemplateGroupEvent.setState(20);
            int size = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().size();
            int size2 = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().size() - 1;
            while (true) {
                if (size2 < 0) {
                    break;
                } else if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().get(size2).getId() == this.mLastModifyTemplateGroupEvent.getTemplateGroup().getId()) {
                    this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().remove(size2);
                    size = size2;
                    break;
                } else {
                    size2--;
                }
            }
            this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().add(size, this.mLastModifyTemplateGroupEvent.getTemplateGroup());
            if (this.mLastModifyTemplateGroupEvent.getTemplateGroup().getGroupType().equals(PensionStatusResult.STATUS_INACTIVE) && this.mLastModifyTemplateGroupEvent.getTemplateGroup().getTemplates() == null) {
                this.mLastModifyTemplateGroupEvent.getTemplateGroup().setTemplates(new ArrayList());
            }
        } else {
            this.mLastModifyTemplateGroupEvent.setErrorKey(bankApiResponse.getKey());
            this.mLastModifyTemplateGroupEvent.setState(40);
            this.mLastModifyTemplateGroupEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mTemplatesAndConfigEvent.setState(20);
        refreshTemplateList();
        this.mEventBus.mo96184m(this.mLastModifyTemplateGroupEvent);
        this.mEventBus.mo96184m(this.mTemplatesAndConfigEvent);
        if (this.mLastModifyTemplateGroupEvent.getTemplateGroup() != null && getTemplateGroup(this.mLastModifyTemplateGroupEvent.getTemplateGroup().getId()) != null && this.mLastModifyTemplateGroupEvent.getTemplateGroup().getGroupType() != null && this.mLastModifyTemplateGroupEvent.getTemplateGroup().getGroupType().equals("C")) {
            refreshCarDebt(this.mLastModifyTemplateGroupEvent.getTemplateGroup());
        }
    }

    public void modifyTemplateResponse(BankApiResponse<TemplateBasketItem> bankApiResponse, TemplateBasketItem templateBasketItem, Long l) {
        boolean z;
        TemplateGroup templateGroupById;
        ModifyTemplateEvent modifyTemplateEvent = new ModifyTemplateEvent();
        this.mLastModifyTemplateEvent = modifyTemplateEvent;
        modifyTemplateEvent.setTemplate(templateBasketItem);
        if (bankApiResponse.isNetworkFailure()) {
            this.mLastModifyTemplateEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.mLastModifyTemplateEvent.setState(10);
            if (templateBasketItem.getId() == 0) {
                templateBasketItem.setId(bankApiResponse.getResult().getId());
                this.mLastModifyTemplateEvent.setState(20);
            }
            z = true;
            if (!(l == null || (templateGroupById = getTemplateGroupById(l.longValue())) == null || templateGroupById.getGroupType() == null || !"C".equals(templateGroupById.getGroupType()))) {
                refreshCarDebt(templateGroupById);
            }
            this.mTemplatesAndConfigEvent.setState(20);
            refreshTemplateList();
            requestTemplatesWithConfig(z);
            this.mEventBus.mo96184m(this.mLastModifyTemplateEvent);
        } else {
            this.mLastModifyTemplateEvent.setState(40);
            this.mLastModifyTemplateEvent.setErrorKey(bankApiResponse.getKey());
        }
        z = false;
        refreshCarDebt(templateGroupById);
        this.mTemplatesAndConfigEvent.setState(20);
        refreshTemplateList();
        requestTemplatesWithConfig(z);
        this.mEventBus.mo96184m(this.mLastModifyTemplateEvent);
    }

    public void modifyTransferTemplate(boolean z, TransferTemplateObject transferTemplateObject, File file, String str) {
        if (z || !shouldNotRefresh(this.modifyTransferTemplateEvent) || !C32359z0.m95598z(transferTemplateObject.getId(), this.modifyTransferTemplateEvent.template.getId())) {
            ModifyTransferTemplateEvent modifyTransferTemplateEvent2 = new ModifyTransferTemplateEvent();
            this.modifyTransferTemplateEvent = modifyTransferTemplateEvent2;
            modifyTransferTemplateEvent2.template = transferTemplateObject;
            modifyTransferTemplateEvent2.setState(10);
            this.mEventBus.mo96184m(this.modifyTransferTemplateEvent);
            this.mBankApiManager.modifyTransferTemplate(transferTemplateObject, file, str);
            return;
        }
        this.mEventBus.mo96184m(this.modifyTransferTemplateEvent);
    }

    public void onAccountLovDebits(BankApiResponse<AccountDebitLoveWrapper> bankApiResponse) {
        boolean z;
        boolean z2;
        if (this.accountLovEvent != null) {
            AccountLovEvent accountLovEvent2 = new AccountLovEvent();
            accountLovEvent2.setAccountLovContainer(this.accountLovEvent.getAccountLovContainer());
            this.accountLovEvent = accountLovEvent2;
            if (bankApiResponse.isNetworkFailure()) {
                this.accountLovEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.accountLovEvent.setState(20);
                if (bankApiResponse.getResult() != null && bankApiResponse.getResult() != null) {
                    this.accountLovEvent.setAccountDebitLoveWrapper(bankApiResponse.getResult());
                    if (!(this.accountLovEvent.getAccountLovContainer() == null || this.accountLovEvent.getAccountLovContainer().getDomestic() == null || this.accountLovEvent.getAccountLovContainer().getDomestic().getSrc() == null)) {
                        Iterator<AccountLoveDebit> it = this.accountLovEvent.getAccountDebitLoveWrapper().cardDebits.iterator();
                        while (it.hasNext()) {
                            AccountLoveDebit next = it.next();
                            Iterator<AccountLov> it2 = this.accountLovEvent.getAccountLovContainer().getDomestic().getSrc().iterator();
                            while (it2.hasNext()) {
                                AccountLov next2 = it2.next();
                                Iterator<AccountLov> it3 = next2.getSubAccounts().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (it3.next().getId() == next.acctKey) {
                                            next2.setForCreditSTO(true);
                                            z2 = true;
                                            continue;
                                            break;
                                        }
                                    } else {
                                        z2 = false;
                                        continue;
                                        break;
                                    }
                                }
                                if (z2) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!(this.accountLovEvent.getAccountLovContainer() == null || this.accountLovEvent.getAccountLovContainer().getConversion() == null || this.accountLovEvent.getAccountLovContainer().getConversion().getSrc() == null)) {
                        Iterator<AccountLoveDebit> it4 = this.accountLovEvent.getAccountDebitLoveWrapper().cardDebits.iterator();
                        while (it4.hasNext()) {
                            AccountLoveDebit next3 = it4.next();
                            Iterator<AccountLov> it5 = this.accountLovEvent.getAccountLovContainer().getConversion().getSrc().iterator();
                            while (it5.hasNext()) {
                                AccountLov next4 = it5.next();
                                Iterator<AccountLov> it6 = next4.getSubAccounts().iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (it6.next().getId() == next3.acctKey) {
                                            next4.setForCreditSTO(true);
                                            z = true;
                                            continue;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        continue;
                                        break;
                                    }
                                }
                                if (z) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.accountLovEvent.setAccountDebitLoveWrapper(new AccountDebitLoveWrapper());
                }
            } else {
                this.accountLovEvent.setState(40);
                this.accountLovEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.accountLovEvent);
        }
    }

    public void onAccountsLovResponse(BankApiResponse<AccountLovContainer> bankApiResponse, boolean z) {
        this.accountLovEvent = new AccountLovEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.accountLovEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            if (!z) {
                this.accountLovEvent.setState(20);
            } else {
                this.accountLovEvent.setState(10);
                this.mBankApiManager.getAccountLovDebits();
            }
            this.accountLovEvent.setAccountLovContainer(bankApiResponse.getResult());
        } else {
            this.accountLovEvent.setState(40);
            this.accountLovEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.accountLovEvent);
    }

    public void onAgreementTextTemplate(BankApiResponse<ContractEntity> bankApiResponse, String str) {
        String str2;
        String str3;
        this.agreementTemplateEvent = new AgreementTemplateEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.agreementTemplateEvent.setState(30);
            this.agreementTemplateEvent.setErrorKey(bankApiResponse.getKey());
        } else if (bankApiResponse.isSuccess()) {
            ContractEntity result = bankApiResponse.getResult();
            this.agreementTemplateEvent.setState(20);
            AgreementTemplateEvent agreementTemplateEvent2 = this.agreementTemplateEvent;
            String str4 = "";
            if (result.getContractText() == null) {
                str2 = str4;
            } else {
                str2 = result.getContractText();
            }
            agreementTemplateEvent2.setHtml(str2);
            AgreementTemplateEvent agreementTemplateEvent3 = this.agreementTemplateEvent;
            if (result.getContractTypeId() == null) {
                str3 = str4;
            } else {
                str3 = result.getContractTypeId();
            }
            agreementTemplateEvent3.setContractTypeId(str3);
            AgreementTemplateEvent agreementTemplateEvent4 = this.agreementTemplateEvent;
            if (result.getTemplateVersionId() != null) {
                str4 = result.getTemplateVersionId();
            }
            agreementTemplateEvent4.setTemplateVersionId(str4);
            this.agreementTemplateEvent.setRequestTag(str);
        } else {
            this.agreementTemplateEvent.setState(40);
            this.agreementTemplateEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.agreementTemplateEvent);
    }

    public void onBondsLoaded(BankApiResponse<BondsWrapper> bankApiResponse) {
        this.bondsEvent = new BondsEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.bondsEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.bondsEvent.setState(20);
            this.bondsEvent.setBondsWrapper(bankApiResponse.getResult());
        } else {
            this.bondsEvent.setState(40);
            this.bondsEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.bondsEvent);
    }

    public void onCardSecurityResponse(long j, String str, String str2, boolean z, BankApiResponse<Object> bankApiResponse) {
        CardSecurityUpdateEvent cardSecurityUpdateEvent = new CardSecurityUpdateEvent();
        if (bankApiResponse.isNetworkFailure()) {
            cardSecurityUpdateEvent.setState(30);
            this.mEventBus.mo96184m(cardSecurityUpdateEvent);
        } else if (bankApiResponse.isSuccess()) {
            C32306g0.m95220a("3d_security_activated");
            cardSecurityUpdateEvent.setState(20);
            cardSecurityUpdateEvent.setCardId(j);
            cardSecurityUpdateEvent.setPhone(str);
            cardSecurityUpdateEvent.setSmsLang(str2);
            cardSecurityUpdateEvent.setDigipassEnabled(z);
            this.mEventBus.mo96184m(cardSecurityUpdateEvent);
            this.compositeDisposable.mo95660b(this.cardsAndDetailsUseCase.mo65886c(true).mo95027o0(C40992a.m118827a()).mo94983G0(new C33268q(), new C33271r()));
        } else {
            cardSecurityUpdateEvent.setIsScaError(bankApiResponse.isScaError());
            cardSecurityUpdateEvent.setState(40);
            cardSecurityUpdateEvent.setErrorKey(bankApiResponse.getKey());
            this.mEventBus.mo96184m(cardSecurityUpdateEvent);
        }
    }

    public void onCashbackStatement(BankApiResponse<CashBackStatementWrapper> bankApiResponse) {
        if (this.accountStatementEvent.getType() == 10) {
            refreshAccountStatementEvent();
            if (bankApiResponse.isNetworkFailure()) {
                this.accountStatementEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.accountStatementEvent.setState(20);
                if (bankApiResponse.getResult().getList() == null) {
                    bankApiResponse.getResult().setList(new ArrayList());
                }
                if (this.accountStatementEvent.getCashBackStatementWrapper() == null || this.accountStatementEvent.getCashBackStatementWrapper().getList() == null) {
                    this.accountStatementEvent.setCashBackStatementWrapper(bankApiResponse.getResult());
                } else {
                    this.accountStatementEvent.getCashBackStatementWrapper().getList().addAll(bankApiResponse.getResult().getList());
                }
                if (bankApiResponse.getResult().getList().size() < 20) {
                    this.accountStatementEvent.setCanDownloadMore(false);
                }
            } else {
                this.accountStatementEvent.setState(40);
                this.accountStatementEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.accountStatementEvent);
        }
    }

    public void onChangeDeviceLanguage(boolean z) {
        this.preferencesApiManager.setShouldUpdateLanguage(!z);
    }

    public void onCountries(BankApiResponse<List<BogCountry>> bankApiResponse) {
        this.countriesEvent = new CountriesEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.countriesEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.countriesEvent.setState(20);
            this.countriesEvent.countries = bankApiResponse.getResult();
        } else {
            this.countriesEvent.setState(40);
            this.countriesEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.countriesEvent);
    }

    public void onCountryCodeBySwift(String str, String str2, BankApiResponse<ForeignBankList> bankApiResponse) {
        CountryCodeBySwiftEvent countryCodeBySwiftEvent = new CountryCodeBySwiftEvent();
        if (bankApiResponse.isNetworkFailure()) {
            countryCodeBySwiftEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            countryCodeBySwiftEvent.setState(20);
            if (bankApiResponse.getResult().getList() != null && bankApiResponse.getResult().getList().size() > 0) {
                countryCodeBySwiftEvent.foreignBank = bankApiResponse.getResult().getList().get(0);
            }
            countryCodeBySwiftEvent.tag = str2;
            countryCodeBySwiftEvent.swift = str;
        } else {
            countryCodeBySwiftEvent.setState(40);
            countryCodeBySwiftEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.countryCodeBySwiftEvents.put(str2, countryCodeBySwiftEvent);
        this.mEventBus.mo96184m(countryCodeBySwiftEvent);
    }

    public void onCreditCardsResponse(CreditCardsWrapper creditCardsWrapper) {
        CreditCardsEvent creditCardsEvent2 = new CreditCardsEvent();
        this.creditCardsEvent = creditCardsEvent2;
        creditCardsEvent2.setCreditCardsWrapper(creditCardsWrapper);
        this.creditCardsEvent.setState(20);
        if (this.creditCardsEvent.getCreditCardsWrapper() != null && this.creditCardsEvent.getCreditCardsWrapper().getCardsContainer() != null && this.creditCardsEvent.getCreditCardsWrapper().getCardsContainer().getAccounts() != null) {
            if (this.creditCardsEvent.getCreditCardsWrapper().getBillInfo() != null) {
                Iterator<BillInfo> it = this.creditCardsEvent.getCreditCardsWrapper().getBillInfo().iterator();
                while (it.hasNext()) {
                    BillInfo next = it.next();
                    Iterator<CreditCardAccount> it2 = this.creditCardsEvent.getCreditCardsWrapper().getCardsContainer().getAccounts().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        CreditCardAccount next2 = it2.next();
                        if (next.getAcctKey() == next2.getAcctKey()) {
                            next2.setBillInfo(next);
                            break;
                        }
                    }
                }
            }
            if (this.creditCardsEvent.getCreditCardsWrapper().getDetails() != null) {
                Iterator<CreditCardDetail> it3 = this.creditCardsEvent.getCreditCardsWrapper().getDetails().iterator();
                while (it3.hasNext()) {
                    CreditCardDetail next3 = it3.next();
                    Iterator<CreditCardAccount> it4 = this.creditCardsEvent.getCreditCardsWrapper().getCardsContainer().getAccounts().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        CreditCardAccount next4 = it4.next();
                        if (next3.getAcctKey() == next4.getAcctKey()) {
                            next4.setAtmPercent(next3.getAtmPercent());
                            next4.setPosPercent(next3.getPosPercent());
                            next4.setOverdraftLimit(next3.getOverdraftLimit());
                            next4.fileUrl = next3.fileUrl;
                            next4.fileId = next3.fileId;
                            break;
                        }
                    }
                }
            }
            this.compositeDisposable.mo95660b(this.cardsAndDetailsUseCase.mo65885b().mo95027o0(C40992a.m118827a()).mo94995O0(1).mo94983G0(new C33236h(this), new C33238i(this)));
        }
    }

    public void onDDAccounts(BankApiResponse<ArrayList<DDPaymentAccount>> bankApiResponse) {
        this.ddAccountsEvent = new DDAccountsEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.ddAccountsEvent.setState(30);
        } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null) {
            this.ddAccountsEvent.setState(40);
            this.ddAccountsEvent.setErrorKey(bankApiResponse.getKey());
        } else {
            this.ddAccountsEvent.setState(20);
            this.ddAccountsEvent.ddAccounts = bankApiResponse.getResult();
        }
        this.mEventBus.mo96184m(this.ddAccountsEvent);
    }

    public void onDDPeriodTypes(BankApiResponse<ArrayList<STOPeriodType>> bankApiResponse) {
        this.ddPeriodTypesEvent = new DDPeriodTypesEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.ddPeriodTypesEvent.setState(30);
        } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null) {
            this.ddPeriodTypesEvent.setState(40);
            this.ddPeriodTypesEvent.setErrorKey(bankApiResponse.getKey());
        } else {
            this.ddPeriodTypesEvent.setState(20);
            this.ddPeriodTypesEvent.ddPeriodTypes = bankApiResponse.getResult();
        }
        this.mEventBus.mo96184m(this.ddPeriodTypesEvent);
    }

    public void onDDProviders(BankApiResponse<ArrayList<DDProviderItem>> bankApiResponse) {
        this.ddProvidersListEvent = new DDProvidersListEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.ddProvidersListEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.ddProvidersListEvent.setState(20);
            this.ddProvidersListEvent.providerItems = bankApiResponse.getResult();
            HashSet<String> hashSet = new HashSet<>();
            Iterator<DDProviderItem> it = this.ddProvidersListEvent.providerItems.iterator();
            while (it.hasNext()) {
                String str = it.next().providerServiceId;
                if (str != null) {
                    hashSet.add(str);
                }
            }
            this.ddProvidersListEvent.ddProviders = hashSet;
        } else {
            this.ddProvidersListEvent.setState(40);
            this.ddProvidersListEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.ddProvidersListEvent);
    }

    public void onDDSTOList(BankApiResponse<ArrayList<DDSTO>> bankApiResponse) {
        this.ddstoListEvent = new DDSTOListEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.ddstoListEvent.setState(30);
        } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null) {
            this.ddstoListEvent.setState(40);
            this.ddstoListEvent.setErrorKey(bankApiResponse.getKey());
        } else {
            this.ddstoListEvent.setState(20);
            this.ddstoListEvent.setList(bankApiResponse.getResult());
        }
        this.mEventBus.mo96184m(this.ddstoListEvent);
    }

    public void onDeleteSavedCard(long j, BankApiResponse<Object> bankApiResponse) {
        DeleteSavedCardEvent deleteSavedCardEvent = new DeleteSavedCardEvent();
        deleteSavedCardEvent.setCardId(Long.valueOf(j));
        if (bankApiResponse.isNetworkFailure()) {
            deleteSavedCardEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            int i = -1;
            for (int i2 = 0; i2 < this.paymentCardsEvent.getPaymentCards().size(); i2++) {
                if (this.paymentCardsEvent.getPaymentCards().get(i2).getCardId() == j) {
                    i = i2;
                }
            }
            if (i != -1) {
                this.paymentCardsEvent.getPaymentCards().remove(i);
            }
            int i3 = -1;
            for (int i4 = 0; i4 < this.paymentCardsEvent.getSavedCards().size(); i4++) {
                if (this.paymentCardsEvent.getSavedCards().get(i4).getCardId() == j) {
                    i3 = i4;
                }
            }
            if (i3 != -1) {
                this.paymentCardsEvent.getSavedCards().remove(i3);
            }
            deleteSavedCardEvent.setState(20);
        } else {
            deleteSavedCardEvent.setState(40);
            deleteSavedCardEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(deleteSavedCardEvent);
    }

    public void onDepLoanAgreementsResponse(BankApiResponse<List<DepLoanAgreement>> bankApiResponse) {
        this.depLoanAgreementsEvent = new DepLoanAgreementsEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.depLoanAgreementsEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.depLoanAgreementsEvent.setState(20);
            this.depLoanAgreementsEvent.setAgreements(bankApiResponse.getResult());
        } else {
            this.depLoanAgreementsEvent.setState(40);
            this.depLoanAgreementsEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.depLoanAgreementsEvent);
    }

    /* renamed from: onDepositBondsResponse */
    public void lambda$requestDepositBonds$13(DepositBondsContainer depositBondsContainer) {
        DepositBondsEvent depositBondsEvent2 = new DepositBondsEvent();
        this.depositBondsEvent = depositBondsEvent2;
        depositBondsEvent2.setState(10);
        this.depositBondsEvent.setDepositBonds(depositBondsContainer);
        this.depositBondsEvent.setState(20);
        Iterator<Deposit> it = this.depositBondsEvent.getDepositBonds().getDeposits().getDeposits().iterator();
        while (it.hasNext()) {
            Deposit next = it.next();
            if (!next.isMaxima()) {
                Iterator<DepositDetails> it2 = this.depositBondsEvent.getDepositBonds().getDeposits().getDetails().iterator();
                while (it2.hasNext()) {
                    DepositDetails next2 = it2.next();
                    if (next.getAgreeKey() == next2.getAgreeKey()) {
                        next.setDepositDetails(next2);
                    }
                }
            } else {
                Iterator<DepositMaximaWrapper> it3 = this.depositBondsEvent.getDepositBonds().getDeposits().getMaximaDetails().iterator();
                while (it3.hasNext()) {
                    DepositMaximaWrapper next3 = it3.next();
                    if (next.getAgreeKey() == next3.getAgreeKey()) {
                        next.setMaximaDetails(next3);
                    }
                }
            }
        }
        this.compositeDisposable.mo95660b(this.cardsAndDetailsUseCase.mo65885b().mo95027o0(C40992a.m118827a()).mo94995O0(1).mo94983G0(new C33229e0(this), new C33231f0(this)));
    }

    public void onExpressProviders(String str, String str2, BankApiResponse<ArrayList<BonusProvider>> bankApiResponse) {
        BonusProvidersEvent bonusProvidersEvent2 = this.bonusProvidersEvent;
        if (bonusProvidersEvent2 != null && bonusProvidersEvent2.getProdType().equals(str2) && this.bonusProvidersEvent.getBonusType().equals(str)) {
            BonusProvidersEvent bonusProvidersEvent3 = new BonusProvidersEvent();
            this.bonusProvidersEvent = bonusProvidersEvent3;
            bonusProvidersEvent3.setProdType(str2);
            this.bonusProvidersEvent.setBonusType(str);
            if (bankApiResponse.isNetworkFailure()) {
                bankApiResponse.getNetworkFailure();
                this.bonusProvidersEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.bonusProvidersEvent.setState(20);
                this.bonusProvidersEvent.setBonusProviders(bankApiResponse.getResult());
                HashSet hashSet = new HashSet();
                Iterator<BonusProvider> it = this.bonusProvidersEvent.getBonusProviders().iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().getServiceId());
                }
                this.bonusProvidersEvent.setBonusProviderServiceIds(hashSet);
            } else {
                this.bonusProvidersEvent.setState(40);
                this.bonusProvidersEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.bonusProvidersEvent);
        }
    }

    public void onFeatureFeedback(BankApiResponse<List<FeatureFeedback>> bankApiResponse) {
        this.featureFeedback = new FeatureFeedBackEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.featureFeedback.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.featureFeedback.setState(20);
            this.featureFeedback.setFeatureFeedbacks((ArrayList) bankApiResponse.getResult());
        } else {
            this.featureFeedback.setState(40);
            this.featureFeedback.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.featureFeedback);
    }

    public void onInTransferDetails(long j, String str, String str2, BankApiResponse<List<InTransferDetail>> bankApiResponse) {
        InTransferDetailsEvent inTransferDetailsEvent2 = this.inTransferDetailsEvent;
        if (inTransferDetailsEvent2 != null && inTransferDetailsEvent2.getDocKey() == j && C32359z0.m95598z(str, this.inTransferDetailsEvent.getEssServiceId()) && str2.equals(this.inTransferDetailsEvent.getPrintFormType())) {
            InTransferDetailsEvent inTransferDetailsEvent3 = new InTransferDetailsEvent();
            this.inTransferDetailsEvent = inTransferDetailsEvent3;
            inTransferDetailsEvent3.setPrintFormType(str2);
            this.inTransferDetailsEvent.setEssServiceId(str);
            this.inTransferDetailsEvent.setDocKey(j);
            if (bankApiResponse.isNetworkFailure()) {
                this.inTransferDetailsEvent.setState(30);
            } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null || bankApiResponse.getResult().size() <= 0) {
                this.inTransferDetailsEvent.setState(40);
                this.inTransferDetailsEvent.setErrorKey(bankApiResponse.getKey());
            } else {
                this.inTransferDetailsEvent.setState(20);
                this.inTransferDetailsEvent.setInTransferDetail((InTransferDetail) bankApiResponse.getResult().get(0));
            }
            this.mEventBus.mo96184m(this.inTransferDetailsEvent);
        }
    }

    public void onLoanHistoryResponse(BankApiResponse<LoanHistoryWrapper> bankApiResponse, boolean z) {
        LoanHistoryEvent loanHistoryEvent2 = this.loanHistoryEvent;
        if (loanHistoryEvent2 != null) {
            long loanKey = loanHistoryEvent2.getLoanKey();
            LoanHistoryEvent loanHistoryEvent3 = new LoanHistoryEvent();
            this.loanHistoryEvent = loanHistoryEvent3;
            loanHistoryEvent3.setLoanKey(loanKey);
            this.loanHistoryEvent.setPln(z);
            if (bankApiResponse.isNetworkFailure()) {
                this.loanHistoryEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.loanHistoryEvent.setState(20);
                this.loanHistoryEvent.setLoanHistoryWrapper(bankApiResponse.getResult());
            } else {
                this.loanHistoryEvent.setState(40);
                this.loanHistoryEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.loanHistoryEvent);
        }
    }

    public void onLoanScheduleResponse(long j, BankApiResponse<LoanScheduleWrapper> bankApiResponse) {
        LoanScheduleEvent loanScheduleEvent2 = this.loanScheduleEvent;
        if (loanScheduleEvent2 != null && loanScheduleEvent2.getLoanKey() == j) {
            LoanScheduleEvent loanScheduleEvent3 = new LoanScheduleEvent();
            this.loanScheduleEvent = loanScheduleEvent3;
            loanScheduleEvent3.setLoanKey(j);
            if (bankApiResponse.isNetworkFailure()) {
                this.loanScheduleEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.loanScheduleEvent.setState(20);
                this.loanScheduleEvent.setLoanScheduleWrapper(bankApiResponse.getResult());
            } else {
                this.loanScheduleEvent.setState(40);
                this.loanScheduleEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.loanScheduleEvent);
        }
    }

    public void onLoansResponse(LoansWrapper loansWrapper) {
        LoansEvent loansEvent2 = new LoansEvent();
        this.loansEvent = loansEvent2;
        loansEvent2.setState(20);
        this.loansEvent.setLoansWrapper(loansWrapper);
        this.compositeDisposable.mo95660b(this.cardsAndDetailsUseCase.mo65885b().mo95027o0(C40992a.m118827a()).mo94995O0(1).mo94983G0(new C33278u(this), new C33279v(this)));
    }

    public void onModifyTransferTemplate(BankApiResponse<Boolean> bankApiResponse, Long l) {
        ModifyTransferTemplateEvent modifyTransferTemplateEvent2 = this.modifyTransferTemplateEvent;
        if (modifyTransferTemplateEvent2 != null && C32359z0.m95598z(modifyTransferTemplateEvent2.template.getId(), l)) {
            TransferTemplateObject transferTemplateObject = this.modifyTransferTemplateEvent.template;
            ModifyTransferTemplateEvent modifyTransferTemplateEvent3 = new ModifyTransferTemplateEvent();
            this.modifyTransferTemplateEvent = modifyTransferTemplateEvent3;
            modifyTransferTemplateEvent3.template = transferTemplateObject;
            if (bankApiResponse.isNetworkFailure()) {
                this.modifyTransferTemplateEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.modifyTransferTemplateEvent.setState(20);
            } else {
                this.modifyTransferTemplateEvent.setState(40);
                this.modifyTransferTemplateEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.modifyTransferTemplateEvent);
        }
    }

    public void onNotificationListResponse(BankApiResponse<NotificationList> bankApiResponse) {
        this.notificationListEvent = new NotificationListEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.notificationListEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.notificationListEvent.setState(20);
            NotificationList result = bankApiResponse.getResult();
            HashMap hashMap = new HashMap();
            for (NotificationDetails next : result.getDetails()) {
                hashMap.put(Long.valueOf(next.getId()), next.getContent());
            }
            for (Notification next2 : result.getNotifications()) {
                if (hashMap.containsKey(Long.valueOf(next2.getId()))) {
                    next2.setContent((String) hashMap.get(Long.valueOf(next2.getId())));
                }
            }
            this.notificationListEvent.setNotificationList(result);
        } else {
            this.notificationListEvent.setState(40);
            this.notificationListEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.notificationListEvent);
    }

    public void onNotificationsCount(BankApiResponse<NotificationCount> bankApiResponse) {
        this.notificationCountEvent = new NotificationCountEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.notificationCountEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.notificationCountEvent.setState(20);
            this.notificationCountEvent.setNotificationTotalCount(bankApiResponse.getResult().getTotalUnread());
            this.notificationCountEvent.setUnreadMessageCount(bankApiResponse.getResult().getMessageUnread());
            this.notificationCountEvent.setUnreadPushCount(bankApiResponse.getResult().getPushUnread());
        } else {
            this.notificationCountEvent.setState(40);
            this.notificationCountEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.notificationCountEvent);
    }

    public void onNotificationsProcessResponse(ProcessNotificationsRequest processNotificationsRequest, BankApiResponse<Object> bankApiResponse) {
        if (this.notificationListEvent != null) {
            ModifyNotificationsEvent modifyNotificationsEvent = new ModifyNotificationsEvent();
            if (bankApiResponse.isNetworkFailure()) {
                modifyNotificationsEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                modifyNotificationsEvent.setState(20);
                modifyNotificationsEvent.setProcessedNotifications(processNotificationsRequest.getRequests());
                this.notificationListEvent.updateNotifications(processNotificationsRequest.getRequests());
                requestNotificationsCount(this.preferencesApiManager.getFcmToken(), true);
            } else {
                modifyNotificationsEvent.setState(40);
                modifyNotificationsEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(modifyNotificationsEvent);
        }
    }

    public void onOperationDetails(long j, long j2, BankApiResponse<OperationResponse> bankApiResponse) {
        if (this.operationDetailsEvent.getEntryId() == j && this.operationDetailsEvent.getDocKey() == j2) {
            OperationDetailsEvent operationDetailsEvent2 = new OperationDetailsEvent();
            this.operationDetailsEvent = operationDetailsEvent2;
            operationDetailsEvent2.setEntryId(j);
            this.operationDetailsEvent.setDocKey(j2);
            if (bankApiResponse.isNetworkFailure()) {
                this.operationDetailsEvent.setState(30);
            } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null || bankApiResponse.getResult().getMyOperations().size() <= 0) {
                this.operationDetailsEvent.setState(40);
                this.operationDetailsEvent.setErrorKey(bankApiResponse.getKey());
            } else {
                this.operationDetailsEvent.setState(20);
                this.operationDetailsEvent.setAccountOperation(bankApiResponse.getResult().getMyOperations().get(0));
            }
            this.mEventBus.mo96184m(this.operationDetailsEvent);
        }
    }

    public void onOperationsResponse(int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2, BankApiResponse<OperationResponse> bankApiResponse) {
        if (bankApiResponse.isSuccess()) {
            C41204a aVar = this.compositeDisposable;
            C40762x B = this.getTransactionCategoriesUseCase.mo48784a().mo95063B(C40992a.m118827a());
            C33273s sVar = r0;
            C33273s sVar2 = new C33273s(this, bankApiResponse, i, l, l2, l3, l4, l5, l6, str, str2, i2);
            C41204a aVar2 = aVar;
            C33274t tVar = r0;
            C33274t tVar2 = new C33274t(this, i, l, l2, l3, l4, l5, l6, str, str2, i2, bankApiResponse);
            aVar2.mo95660b(B.mo95070I(sVar, tVar));
            return;
        }
        postOperationsResponse(i, l, l2, l3, l4, l5, l6, str, str2, i2, bankApiResponse);
    }

    public void onOutTransferDetails(long j, String str, String str2, BankApiResponse<TransferHistoryItem> bankApiResponse) {
        OutTransferDetailsEvent outTransferDetailsEvent2 = this.outTransferDetailsEvent;
        if (outTransferDetailsEvent2 != null && outTransferDetailsEvent2.getDocKey() == j && C32359z0.m95598z(str, this.outTransferDetailsEvent.getEssServiceId()) && str2.equals(this.outTransferDetailsEvent.getPrintFormType())) {
            OutTransferDetailsEvent outTransferDetailsEvent3 = new OutTransferDetailsEvent();
            this.outTransferDetailsEvent = outTransferDetailsEvent3;
            outTransferDetailsEvent3.setPrintFormType(str2);
            this.outTransferDetailsEvent.setEssServiceId(str);
            this.outTransferDetailsEvent.setDocKey(j);
            if (bankApiResponse.isNetworkFailure()) {
                this.outTransferDetailsEvent.setState(30);
            } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null) {
                this.outTransferDetailsEvent.setState(40);
                this.outTransferDetailsEvent.setErrorKey(bankApiResponse.getKey());
            } else {
                this.outTransferDetailsEvent.setState(20);
                this.outTransferDetailsEvent.setTransferHistoryItem(bankApiResponse.getResult());
            }
            this.mEventBus.mo96184m(this.outTransferDetailsEvent);
        }
    }

    public void onPaymentCardsResponse(BankApiResponse<ArrayList<PaymentsCard>> bankApiResponse, String str) {
        PaymentCardsEvent paymentCardsEvent2 = this.paymentCardsEvent;
        if (paymentCardsEvent2 != null && C32359z0.m95598z(paymentCardsEvent2.providerIds, str)) {
            PaymentCardsEvent paymentCardsEvent3 = new PaymentCardsEvent();
            this.paymentCardsEvent = paymentCardsEvent3;
            paymentCardsEvent3.providerIds = str;
            if (bankApiResponse.isNetworkFailure()) {
                this.paymentCardsEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.paymentCardsEvent.setState(20);
                this.paymentCardsEvent.setPaymentCards(bankApiResponse.getResult());
            } else {
                this.paymentCardsEvent.setState(40);
                this.paymentCardsEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.paymentCardsEvent);
        }
    }

    public void onPaymentDetails(long j, String str, String str2, BankApiResponse<List<PaymentDetail>> bankApiResponse) {
        PaymentDetailsEvent paymentDetailsEvent2 = this.paymentDetailsEvent;
        if (paymentDetailsEvent2 != null && paymentDetailsEvent2.getDocKey() == j && C32359z0.m95598z(str, this.paymentDetailsEvent.getEssServiceId()) && str2.equals(this.paymentDetailsEvent.getPrintFormType())) {
            PaymentDetailsEvent paymentDetailsEvent3 = new PaymentDetailsEvent();
            this.paymentDetailsEvent = paymentDetailsEvent3;
            paymentDetailsEvent3.setPrintFormType(str2);
            this.paymentDetailsEvent.setEssServiceId(str);
            this.paymentDetailsEvent.setDocKey(j);
            if (bankApiResponse.isNetworkFailure()) {
                this.paymentDetailsEvent.setState(30);
            } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null || bankApiResponse.getResult().size() <= 0) {
                this.paymentDetailsEvent.setState(40);
                this.paymentDetailsEvent.setErrorKey(bankApiResponse.getKey());
            } else {
                this.paymentDetailsEvent.setState(20);
                this.paymentDetailsEvent.setPaymentDetail((PaymentDetail) bankApiResponse.getResult().get(0));
            }
            this.mEventBus.mo96184m(this.paymentDetailsEvent);
        }
    }

    public void onPensionStatus(BankApiResponse<PensionStatusResult> bankApiResponse) {
        this.pensionStatusEvent = new PensionStatusEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.pensionStatusEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.pensionStatusEvent.setState(20);
            this.pensionStatusEvent.pensionStatus = bankApiResponse.getResult();
        } else {
            this.pensionStatusEvent.setState(40);
            this.pensionStatusEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.pensionStatusEvent);
    }

    public void onPensionsLoaded(PensionResult pensionResult) {
        PensionsEvent pensionsEvent2 = new PensionsEvent();
        this.pensionsEvent = pensionsEvent2;
        pensionsEvent2.setState(20);
        PensionsEvent pensionsEvent3 = this.pensionsEvent;
        pensionsEvent3.pensionResult = pensionResult;
        this.mEventBus.mo96184m(pensionsEvent3);
    }

    public void onReportingCodes(BankApiResponse<List<ReportingCode>> bankApiResponse) {
        this.reportingCodesEvent = new ReportingCodesEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.reportingCodesEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.reportingCodesEvent.setState(20);
            this.reportingCodesEvent.reportingCodes = bankApiResponse.getResult();
        } else {
            this.reportingCodesEvent.setState(40);
            this.reportingCodesEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.reportingCodesEvent);
    }

    public void onSMSNotificationsList(BankApiResponse<ArrayList<SMSContact>> bankApiResponse) {
        this.smsNotifListEvent = new SMSNotifListEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.smsNotifListEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.smsNotifListEvent.setState(20);
            ArrayList<SMSContact> arrayList = new ArrayList<>();
            ArrayList<SMSContact> arrayList2 = new ArrayList<>();
            if (bankApiResponse.getResult() != null) {
                Iterator it = bankApiResponse.getResult().iterator();
                while (it.hasNext()) {
                    SMSContact sMSContact = (SMSContact) it.next();
                    if ("DEVICE".equals(sMSContact.route)) {
                        arrayList2.add(sMSContact);
                    } else if ("PHONE".equals(sMSContact.route)) {
                        arrayList.add(sMSContact);
                    }
                }
            }
            SMSNotifListEvent sMSNotifListEvent = this.smsNotifListEvent;
            sMSNotifListEvent.smsContacts = arrayList;
            sMSNotifListEvent.pushContacts = arrayList2;
            sMSNotifListEvent.copiedSmsContacts = new ArrayList<>();
            this.smsNotifListEvent.copiedPushContacts = new ArrayList<>();
            Iterator<SMSContact> it2 = this.smsNotifListEvent.smsContacts.iterator();
            while (it2.hasNext()) {
                SMSContact next = it2.next();
                String str = next.contact;
                if (str != null && str.startsWith("995") && next.contact.length() > 9) {
                    next.contact = next.contact.substring(3);
                }
                this.smsNotifListEvent.copiedSmsContacts.add(next);
            }
            Iterator<SMSContact> it3 = this.smsNotifListEvent.pushContacts.iterator();
            while (it3.hasNext()) {
                this.smsNotifListEvent.copiedPushContacts.add(it3.next());
            }
        } else {
            this.smsNotifListEvent.setState(40);
            this.smsNotifListEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.smsNotifListEvent);
    }

    public void onSTOPeriodTypes(BankApiResponse<ArrayList<STOPeriodType>> bankApiResponse) {
        this.stoPeriodTypesEvent = new STOPeriodTypesEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.stoPeriodTypesEvent.setState(30);
        } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null) {
            this.stoPeriodTypesEvent.setState(40);
            this.stoPeriodTypesEvent.setErrorKey(bankApiResponse.getKey());
        } else {
            this.stoPeriodTypesEvent.setState(20);
            this.stoPeriodTypesEvent.stoPeriodTypes = bankApiResponse.getResult();
        }
        this.mEventBus.mo96184m(this.stoPeriodTypesEvent);
    }

    public void onSelectedPayments(BankApiResponse<ArrayList<SelectedPayment>> bankApiResponse) {
        this.selectedPaymentsEvent = new SelectedPaymentsEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.selectedPaymentsEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.selectedPaymentsEvent.setState(20);
            this.selectedPaymentsEvent.setSelectedPayments(bankApiResponse.getResult());
        } else {
            this.selectedPaymentsEvent.setState(40);
            this.selectedPaymentsEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.selectedPaymentsEvent);
    }

    public void onTerminateBill(long j, BankApiResponse<Object> bankApiResponse) {
        if (this.ddstoListEvent != null) {
            forceUpdateData();
            TerminateDDSTOEvent terminateDDSTOEvent2 = new TerminateDDSTOEvent();
            this.terminateDDSTOEvent = terminateDDSTOEvent2;
            terminateDDSTOEvent2.itemId = j;
            refreshDDSTOListEvent();
            this.ddstoListEvent.setState(20);
            if (bankApiResponse.isNetworkFailure()) {
                this.terminateDDSTOEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.terminateDDSTOEvent.setState(20);
                if (this.ddstoListEvent.getList() != null) {
                    int size = this.ddstoListEvent.getList().size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        } else if (this.ddstoListEvent.getList().get(size).paymentId == j) {
                            this.ddstoListEvent.getList().remove(size);
                            break;
                        } else {
                            size--;
                        }
                    }
                }
            } else {
                this.terminateDDSTOEvent.setState(40);
                this.terminateDDSTOEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.ddstoListEvent);
            this.mEventBus.mo96184m(this.terminateDDSTOEvent);
        }
    }

    public void onTerminatePayment(long j, BankApiResponse<Object> bankApiResponse) {
        if (this.ddstoListEvent != null) {
            forceUpdateData();
            TerminateDDSTOEvent terminateDDSTOEvent2 = new TerminateDDSTOEvent();
            this.terminateDDSTOEvent = terminateDDSTOEvent2;
            terminateDDSTOEvent2.itemId = j;
            refreshDDSTOListEvent();
            this.ddstoListEvent.setState(20);
            if (bankApiResponse.isNetworkFailure()) {
                this.terminateDDSTOEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.terminateDDSTOEvent.setState(20);
                if (this.ddstoListEvent.getList() != null) {
                    int size = this.ddstoListEvent.getList().size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        } else if (this.ddstoListEvent.getList().get(size).paymentId == j) {
                            this.ddstoListEvent.getList().remove(size);
                            break;
                        } else {
                            size--;
                        }
                    }
                }
            } else {
                this.terminateDDSTOEvent.setState(40);
                this.terminateDDSTOEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.ddstoListEvent);
            this.mEventBus.mo96184m(this.terminateDDSTOEvent);
        }
    }

    public void onTerminateSTO(long j, BankApiResponse<Object> bankApiResponse) {
        if (this.ddstoListEvent != null) {
            forceUpdateData();
            TerminateDDSTOEvent terminateDDSTOEvent2 = new TerminateDDSTOEvent();
            this.terminateDDSTOEvent = terminateDDSTOEvent2;
            terminateDDSTOEvent2.itemId = j;
            refreshDDSTOListEvent();
            this.ddstoListEvent.setState(20);
            if (bankApiResponse.isNetworkFailure()) {
                this.terminateDDSTOEvent.setState(30);
            } else if (bankApiResponse.isSuccess()) {
                this.terminateDDSTOEvent.setState(20);
                if (this.ddstoListEvent.getList() != null) {
                    int size = this.ddstoListEvent.getList().size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        } else if (this.ddstoListEvent.getList().get(size).paymentId == j) {
                            this.ddstoListEvent.getList().remove(size);
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.refreshSto.mo70587a();
            } else {
                this.terminateDDSTOEvent.setState(40);
                this.terminateDDSTOEvent.setErrorKey(bankApiResponse.getKey());
            }
            this.mEventBus.mo96184m(this.ddstoListEvent);
            this.mEventBus.mo96184m(this.terminateDDSTOEvent);
        }
    }

    public void onTransferBeneficiaries(BankApiResponse<ArrayList<Beneficiary>> bankApiResponse) {
        this.transferBeneficiaryEvent = new TransferBeneficiaryEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.transferBeneficiaryEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.transferBeneficiaryEvent.setState(20);
            this.transferBeneficiaryEvent.beneficiaries = bankApiResponse.getResult();
        } else {
            this.transferBeneficiaryEvent.setState(40);
            this.transferBeneficiaryEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.transferBeneficiaryEvent);
    }

    public void onTransferDetailsPfm(String str, BankApiResponse<TransferHistoryItem> bankApiResponse) {
        TransferHistoryEvent transferHistoryEvent2 = this.transferHistoryEvent;
        if (transferHistoryEvent2 != null && C32359z0.m95598z(transferHistoryEvent2.getDocKey(), str)) {
            TransferHistoryEvent transferHistoryEvent3 = new TransferHistoryEvent();
            this.transferHistoryEvent = transferHistoryEvent3;
            transferHistoryEvent3.setDocKey(str);
            if (bankApiResponse.isNetworkFailure()) {
                bankApiResponse.getNetworkFailure();
                this.transferHistoryEvent.setState(30);
            } else if (!bankApiResponse.isSuccess() || !C32359z0.m95598z(String.valueOf(bankApiResponse.getResult().getDocKey()), str)) {
                this.transferHistoryEvent.setState(40);
                this.transferHistoryEvent.setErrorKey(bankApiResponse.getKey());
            } else {
                this.transferHistoryEvent.setState(20);
                this.transferHistoryEvent.setTransferHistoryItem(bankApiResponse.getResult());
            }
            this.mEventBus.mo96184m(this.transferHistoryEvent);
        }
    }

    public void onUploadImage(int i, long j, BankApiResponse<Object> bankApiResponse) {
        if (i == 2) {
            this.creditCardsEvent.setState(20);
            requestCreditCards(true);
        } else if (i == 3) {
            this.loansEvent.setState(20);
            requestLoans(true);
        } else if (i == 4) {
            this.depositBondsEvent.setState(20);
            requestDepositBonds(true);
        }
        requestAccountLovs(true, false);
    }

    public void onUtilityPaymentDetails(long j, String str, String str2, BankApiResponse<List<LastOperation>> bankApiResponse) {
        UtilityPaymentDetailsEvent utilityPaymentDetailsEvent2 = this.utilityPaymentDetailsEvent;
        if (utilityPaymentDetailsEvent2 != null && utilityPaymentDetailsEvent2.getDocKey() == j && C32359z0.m95598z(str, this.utilityPaymentDetailsEvent.getEssServiceId()) && str2.equals(this.utilityPaymentDetailsEvent.getPrintFormType())) {
            UtilityPaymentDetailsEvent utilityPaymentDetailsEvent3 = new UtilityPaymentDetailsEvent();
            this.utilityPaymentDetailsEvent = utilityPaymentDetailsEvent3;
            utilityPaymentDetailsEvent3.setPrintFormType(str2);
            this.utilityPaymentDetailsEvent.setEssServiceId(str);
            this.utilityPaymentDetailsEvent.setDocKey(j);
            if (bankApiResponse.isNetworkFailure()) {
                this.utilityPaymentDetailsEvent.setState(30);
            } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null || bankApiResponse.getResult().size() <= 0) {
                this.utilityPaymentDetailsEvent.setState(40);
                this.utilityPaymentDetailsEvent.setErrorKey(bankApiResponse.getKey());
            } else {
                this.utilityPaymentDetailsEvent.setState(20);
                this.utilityPaymentDetailsEvent.setLastOperation((LastOperation) bankApiResponse.getResult().get(0));
            }
            this.mEventBus.mo96184m(this.utilityPaymentDetailsEvent);
        }
    }

    public void paymentProviderConfigurationResponse(BankApiResponse<List<PaymentProviderConfiguration>> bankApiResponse, String str) {
        Object obj;
        ProviderConfigurationEvent providerConfigurationEvent2 = this.providerConfigurationEvent;
        if (providerConfigurationEvent2 != null) {
            obj = providerConfigurationEvent2.getInstance();
        } else {
            obj = null;
        }
        ProviderConfigurationEvent providerConfigurationEvent3 = new ProviderConfigurationEvent();
        this.providerConfigurationEvent = providerConfigurationEvent3;
        providerConfigurationEvent3.setInstance(obj);
        if (bankApiResponse.isNetworkFailure()) {
            this.providerConfigurationEvent.setState(30);
        } else if (!bankApiResponse.isSuccess() || bankApiResponse.getResult().size() == 0) {
            this.providerConfigurationEvent.setState(40);
            this.providerConfigurationEvent.setErrorKey(bankApiResponse.getKey());
        } else {
            this.providerConfigurationEvent.setState(20);
            this.providerConfigurationEvent.setConfiguration((PaymentProviderConfiguration) bankApiResponse.getResult().get(0));
        }
        this.providerConfigurationEvent.setServiceId(str);
        this.mEventBus.mo96184m(this.providerConfigurationEvent);
    }

    @SuppressLint({"CheckResult"})
    public void refreshAvailableProductsEvent() {
        this.compositeDisposable.mo95660b(this.getProductTypeListUseCase.mo48088d(true).mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94983G0(new C33213c0(this), new C33217d0(this)));
        refreshLoansEvent();
        refreshDepositsEvent();
        refreshCreditCardsEvent();
        refreshBondsEvent();
    }

    public void refreshBondsEvent() {
        if (this.bondsEvent != null) {
            BondsEvent bondsEvent2 = new BondsEvent();
            BondsWrapper bondsWrapper = new BondsWrapper();
            if (this.bondsEvent.getBondsWrapper() != null) {
                bondsWrapper.setBonds(this.bondsEvent.getBondsWrapper().getBonds());
                bondsWrapper.setCashAgreements(this.bondsEvent.getBondsWrapper().getCashAgreements());
                bondsWrapper.setClientInfo(this.bondsEvent.getBondsWrapper().getClientInfo());
            }
            bondsEvent2.setBondsWrapper(bondsWrapper);
            bondsEvent2.setState(this.bondsEvent.getState());
            bondsEvent2.setErrorKey(this.bondsEvent.getErrorKey());
            this.bondsEvent = bondsEvent2;
        }
    }

    public void refreshCarDebt(TemplateGroup templateGroup) {
        TemplateGroup templateGroupById;
        if (templateGroup != null && this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig() != null && (templateGroupById = getTemplateGroupById(templateGroup.getId())) != null) {
            if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().containsKey("bog-comp-tbprkpenaltiespin")) {
                templateGroupById.getCtParkPenaltiesEvent().setState(10);
                templateGroupById.getCtParkPenaltiesEvent().setCTParkPenalties(new ArrayList());
            }
            if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().containsKey("bog-comp-tbprk1week")) {
                templateGroupById.getCtPark6MonthsEvent().setState(10);
                templateGroupById.getCtPark6MonthsEvent().setCTPark6Months(new ArrayList());
            }
            refreshTemplateList();
            this.mEventBus.mo96184m(templateGroupById);
            if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().containsKey("bog-comp-tbprkpenaltiespin")) {
                setUpCarParametersAndGetDebt("PAYMENTS_GET_CAR_FINES", "bog-comp-tbprkpenaltiespin", templateGroupById);
            }
            if (this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().containsKey("bog-comp-tbprk1week")) {
                setUpCarParametersAndGetDebt((String) null, "bog-comp-tbprk1week", templateGroupById);
            }
        }
    }

    public void refreshCreditCardsEvent() {
        if (this.creditCardsEvent != null) {
            CreditCardsEvent creditCardsEvent2 = new CreditCardsEvent();
            CreditCardsWrapper creditCardsWrapper = new CreditCardsWrapper();
            if (this.creditCardsEvent.getCreditCardsWrapper() != null) {
                creditCardsWrapper.setDetails(this.creditCardsEvent.getCreditCardsWrapper().getDetails());
                creditCardsWrapper.setBillInfo(this.creditCardsEvent.getCreditCardsWrapper().getBillInfo());
                creditCardsWrapper.setCardsContainer(this.creditCardsEvent.getCreditCardsWrapper().getCardsContainer());
            }
            creditCardsEvent2.setCreditCardsWrapper(creditCardsWrapper);
            creditCardsEvent2.setState(this.creditCardsEvent.getState());
            creditCardsEvent2.setErrorKey(this.creditCardsEvent.getErrorKey());
            this.creditCardsEvent = creditCardsEvent2;
        }
    }

    public void refreshDebt(long j) {
        TemplateBasketItem templateItemById;
        TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
        if (templatesAndConfigEvent != null && templatesAndConfigEvent.getTemplatesWithPaymentConfig() != null && (templateItemById = getTemplateItemById(j)) != null && templateItemById.canGetDebt()) {
            templateItemById.getTemplateDebtEvent().setState(10);
            templateItemById.setDebtAmount(0);
            refreshTemplateList();
            this.mEventBus.mo96184m(templateItemById);
            PaymentServiceConfig paymentServiceConfigOfItem = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getPaymentServiceConfigOfItem(templateItemById);
            this.mBankApiManager.getPaymentDebt("", this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().get(templateItemById.getServiceId()).getDebtServiceId(), new Gson().mo18181w(filterEmptyParams(TemplateBasketItemsWithPaymentConfig.getPaymentParams(TemplateBasketItemsWithPaymentConfig.getCustomConfigFromProviderConfig(this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getConfig().get(templateItemById.getServiceId()), templateItemById, (ArrayMap<String, String[]>) null), (PaymentWizardPlugin) null, templateItemById))), paymentServiceConfigOfItem, j);
        }
    }

    public void refreshDepositsEvent() {
        if (this.depositBondsEvent != null) {
            DepositBondsEvent depositBondsEvent2 = new DepositBondsEvent();
            DepositBondsContainer depositBondsContainer = new DepositBondsContainer();
            DepositsWrapper depositsWrapper = new DepositsWrapper();
            DepositBondsListWrapper depositBondsListWrapper = new DepositBondsListWrapper();
            DepositBondsSummary depositBondsSummary = new DepositBondsSummary();
            if (this.depositBondsEvent.getDepositBonds() != null) {
                depositBondsEvent2.setDepositBonds(this.depositBondsEvent.getDepositBonds());
                if (this.depositBondsEvent.getDepositBonds().getDeposits() != null) {
                    depositsWrapper.setDetails(this.depositBondsEvent.getDepositBonds().getDeposits().getDetails());
                    depositsWrapper.setDeposits(this.depositBondsEvent.getDepositBonds().getDeposits().getDeposits());
                    depositsWrapper.setMaximaDetails(this.depositBondsEvent.getDepositBonds().getDeposits().getMaximaDetails());
                    depositsWrapper.setSummary(this.depositBondsEvent.getDepositBonds().getDeposits().getSummary());
                    depositBondsContainer.setDeposits(depositsWrapper);
                }
                if (this.depositBondsEvent.getDepositBonds().getBonds() != null) {
                    depositBondsListWrapper.setBonds(this.depositBondsEvent.getDepositBonds().getBonds().getBonds());
                    depositBondsListWrapper.setDetails(this.depositBondsEvent.getDepositBonds().getBonds().getDetails());
                    depositBondsContainer.setBonds(depositBondsListWrapper);
                }
                if (this.depositBondsEvent.getDepositBonds().getSummary() != null) {
                    depositBondsSummary.setBalance(this.depositBondsEvent.getDepositBonds().getSummary().getBalance());
                    depositBondsSummary.setCcy(this.depositBondsEvent.getDepositBonds().getSummary().getCcy());
                    depositBondsContainer.setSummary(depositBondsSummary);
                }
            }
            depositBondsEvent2.setDepositBonds(depositBondsContainer);
            depositBondsEvent2.setState(this.depositBondsEvent.getState());
            depositBondsEvent2.setErrorKey(this.depositBondsEvent.getErrorKey());
            this.depositBondsEvent = depositBondsEvent2;
        }
    }

    public void refreshLoansEvent() {
        if (this.loansEvent != null) {
            LoansEvent loansEvent2 = new LoansEvent();
            LoansWrapper loansWrapper = new LoansWrapper();
            if (this.loansEvent.getLoansWrapper() != null) {
                loansWrapper.setDetails(this.loansEvent.getLoansWrapper().getDetails());
                loansWrapper.setLoans(this.loansEvent.getLoansWrapper().getLoans());
                loansWrapper.setOffsetAccounts(this.loansEvent.getLoansWrapper().getOffsetAccounts());
                loansWrapper.setSummary(this.loansEvent.getLoansWrapper().getSummary());
            }
            loansEvent2.setLoansWrapper(loansWrapper);
            loansEvent2.setState(this.loansEvent.getState());
            loansEvent2.setErrorKey(this.loansEvent.getErrorKey());
            this.loansEvent = loansEvent2;
        }
    }

    public void requestAccountLovs() {
        requestAccountLovs(false, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void requestAccountStatement(boolean r15, int r16, long r17, java.lang.Long r19, java.lang.Long r20, int r21, boolean r22) {
        /*
            r14 = this;
            r0 = r14
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r1 = r21
            r7 = r22
            r8 = 16
            r9 = 15
            r10 = 10
            r11 = 0
            if (r15 != 0) goto L_0x02bd
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r12 = r0.accountStatementEvent
            boolean r12 = r14.shouldNotRefresh(r12)
            if (r12 == 0) goto L_0x02bd
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r12 = r0.accountStatementEvent
            int r12 = r12.getType()
            if (r12 != r2) goto L_0x02bd
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r12 = r0.accountStatementEvent
            long r12 = r12.getItemKey()
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x02bd
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r12 = r0.accountStatementEvent
            boolean r12 = r12.isDefinetlyAccountsService()
            if (r12 != r7) goto L_0x02bd
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r12 = r0.accountStatementEvent
            java.lang.Long r12 = r12.getStartDate()
            boolean r12 = g91.C32359z0.m95598z(r12, r5)
            if (r12 == 0) goto L_0x02bd
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r12 = r0.accountStatementEvent
            java.lang.Long r12 = r12.getEndDate()
            boolean r12 = g91.C32359z0.m95598z(r12, r6)
            if (r12 == 0) goto L_0x02bd
            r12 = 1
            if (r2 == r9) goto L_0x012e
            if (r2 == r8) goto L_0x00f9
            switch(r2) {
                case 8: goto L_0x00f9;
                case 9: goto L_0x00c4;
                case 10: goto L_0x008e;
                default: goto L_0x0058;
            }
        L_0x0058:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.AccountStatementWrapper r13 = r13.getAccountStatementWrapper()
            if (r13 == 0) goto L_0x007c
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.AccountStatementWrapper r13 = r13.getAccountStatementWrapper()
            java.util.ArrayList r13 = r13.getStatement()
            if (r13 == 0) goto L_0x007c
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.AccountStatementWrapper r13 = r13.getAccountStatementWrapper()
            java.util.ArrayList r13 = r13.getStatement()
            int r13 = r13.size()
            if (r13 < r1) goto L_0x015b
        L_0x007c:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.AccountReportId r1 = r1.getReportID()
            if (r1 == 0) goto L_0x015b
            r14.refreshAccountStatementEvent()
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setState(r10)
            goto L_0x0165
        L_0x008e:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r13 = r13.getCashBackStatementWrapper()
            if (r13 == 0) goto L_0x00ba
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r13 = r13.getCashBackStatementWrapper()
            java.util.ArrayList r13 = r13.getList()
            if (r13 == 0) goto L_0x00ba
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r13 = r13.getCashBackStatementWrapper()
            java.util.ArrayList r13 = r13.getList()
            int r13 = r13.size()
            if (r13 < r1) goto L_0x015b
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            boolean r1 = r1.canDownloadMore()
            if (r1 == 0) goto L_0x015b
        L_0x00ba:
            r14.refreshAccountStatementEvent()
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setState(r10)
            goto L_0x0165
        L_0x00c4:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r13 = r13.getCasStatementWrapper()
            if (r13 == 0) goto L_0x00f0
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r13 = r13.getCasStatementWrapper()
            java.util.ArrayList r13 = r13.getList()
            if (r13 == 0) goto L_0x00f0
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r13 = r13.getCasStatementWrapper()
            java.util.ArrayList r13 = r13.getList()
            int r13 = r13.size()
            if (r13 < r1) goto L_0x015b
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            boolean r1 = r1.canDownloadMore()
            if (r1 == 0) goto L_0x015b
        L_0x00f0:
            r14.refreshAccountStatementEvent()
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setState(r10)
            goto L_0x0165
        L_0x00f9:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r13 = r13.getBonusStatementDetailsWrapper()
            if (r13 == 0) goto L_0x0125
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r13 = r13.getBonusStatementDetailsWrapper()
            java.util.ArrayList r13 = r13.getList()
            if (r13 == 0) goto L_0x0125
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r13 = r13.getBonusStatementDetailsWrapper()
            java.util.ArrayList r13 = r13.getList()
            int r13 = r13.size()
            if (r13 < r1) goto L_0x015b
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            boolean r1 = r1.canDownloadMore()
            if (r1 == 0) goto L_0x015b
        L_0x0125:
            r14.refreshAccountStatementEvent()
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setState(r10)
            goto L_0x0165
        L_0x012e:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r13 = r13.getScoolStatementWrapper()
            if (r13 == 0) goto L_0x015d
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r13 = r13.getScoolStatementWrapper()
            java.util.ArrayList r13 = r13.getList()
            if (r13 == 0) goto L_0x015d
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r13 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r13 = r13.getScoolStatementWrapper()
            java.util.ArrayList r13 = r13.getList()
            int r13 = r13.size()
            if (r13 < r1) goto L_0x015b
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            boolean r1 = r1.canDownloadMore()
            if (r1 == 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r12 = r11
            goto L_0x0165
        L_0x015d:
            r14.refreshAccountStatementEvent()
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setState(r10)
        L_0x0165:
            jg1.c r1 = r0.mEventBus
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r10 = r0.accountStatementEvent
            r1.mo96184m(r10)
            if (r12 == 0) goto L_0x0404
            if (r2 == r9) goto L_0x0289
            if (r2 == r8) goto L_0x0254
            switch(r2) {
                case 8: goto L_0x021f;
                case 9: goto L_0x01eb;
                case 10: goto L_0x01b5;
                default: goto L_0x0175;
            }
        L_0x0175:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.AccountReportId r2 = r2.getReportID()
            java.lang.String r3 = ""
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r4 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.AccountStatementWrapper r4 = r4.getAccountStatementWrapper()
            if (r4 == 0) goto L_0x01a3
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r4 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.AccountStatementWrapper r4 = r4.getAccountStatementWrapper()
            java.util.ArrayList r4 = r4.getStatement()
            if (r4 != 0) goto L_0x0194
            goto L_0x01a3
        L_0x0194:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r4 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.AccountStatementWrapper r4 = r4.getAccountStatementWrapper()
            java.util.ArrayList r4 = r4.getStatement()
            int r4 = r4.size()
            r11 = r4
        L_0x01a3:
            r4 = 20
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r11
            r19 = r4
            r20 = r22
            r15.getAccountStatement(r16, r17, r18, r19, r20)
            goto L_0x0404
        L_0x01b5:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r2 = r2.getCashBackStatementWrapper()
            if (r2 == 0) goto L_0x01dc
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r2 = r2.getCashBackStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x01cc
            goto L_0x01dc
        L_0x01cc:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r2 = r2.getCashBackStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            r4 = r2
            goto L_0x01dd
        L_0x01dc:
            r4 = r11
        L_0x01dd:
            r7 = 20
            r8 = 1
            r2 = r19
            r3 = r20
            r5 = r7
            r6 = r8
            r1.getCashbackStatement(r2, r3, r4, r5, r6)
            goto L_0x0404
        L_0x01eb:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r2 = r2.getCasStatementWrapper()
            if (r2 == 0) goto L_0x0211
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r2 = r2.getCasStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x0202
            goto L_0x0211
        L_0x0202:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r2 = r2.getCasStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            r11 = r2
        L_0x0211:
            r7 = 20
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r11
            r1.getCasStatement(r2, r4, r5, r6, r7)
            goto L_0x0404
        L_0x021f:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            if (r2 == 0) goto L_0x0245
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x0236
            goto L_0x0245
        L_0x0236:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            goto L_0x0246
        L_0x0245:
            r2 = r11
        L_0x0246:
            r3 = 20
            java.lang.String r4 = "AMEX"
            r7 = 1
            r5 = r19
            r6 = r20
            r1.getBonusStatementByType(r2, r3, r4, r5, r6, r7)
            goto L_0x0404
        L_0x0254:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            if (r2 == 0) goto L_0x027a
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x026b
            goto L_0x027a
        L_0x026b:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            goto L_0x027b
        L_0x027a:
            r2 = r11
        L_0x027b:
            r3 = 20
            java.lang.String r4 = "PLUS"
            r7 = 1
            r5 = r19
            r6 = r20
            r1.getBonusStatementByType(r2, r3, r4, r5, r6, r7)
            goto L_0x0404
        L_0x0289:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r2 = r2.getScoolStatementWrapper()
            if (r2 == 0) goto L_0x02af
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r2 = r2.getScoolStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x02a0
            goto L_0x02af
        L_0x02a0:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r2 = r2.getScoolStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            r11 = r2
        L_0x02af:
            r7 = 20
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r11
            r1.getScoolStatement(r2, r4, r5, r6, r7)
            goto L_0x0404
        L_0x02bd:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = new ge.bog.mobilebank.eventbus.events.AccountStatementEvent
            r1.<init>()
            r0.accountStatementEvent = r1
            r1.setItemKey(r3)
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setDefinetlyAccountsService(r7)
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setType(r2)
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setStartDate(r5)
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setEndDate(r6)
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r1 = r0.accountStatementEvent
            r1.setState(r10)
            jg1.c r1 = r0.mEventBus
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r10 = r0.accountStatementEvent
            r1.mo96184m(r10)
            if (r2 == r9) goto L_0x03d2
            if (r2 == r8) goto L_0x039e
            switch(r2) {
                case 8: goto L_0x0369;
                case 9: goto L_0x0335;
                case 10: goto L_0x02ff;
                default: goto L_0x02ee;
            }
        L_0x02ee:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r22
            r1.getAccountReportId(r2, r3, r5, r6, r7)
            goto L_0x0404
        L_0x02ff:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r2 = r2.getCashBackStatementWrapper()
            if (r2 == 0) goto L_0x0326
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r2 = r2.getCashBackStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x0316
            goto L_0x0326
        L_0x0316:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.CashBackStatementWrapper r2 = r2.getCashBackStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            r4 = r2
            goto L_0x0327
        L_0x0326:
            r4 = r11
        L_0x0327:
            r7 = 20
            r8 = 1
            r2 = r19
            r3 = r20
            r5 = r7
            r6 = r8
            r1.getCashbackStatement(r2, r3, r4, r5, r6)
            goto L_0x0404
        L_0x0335:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r2 = r2.getCasStatementWrapper()
            if (r2 == 0) goto L_0x035b
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r2 = r2.getCasStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x034c
            goto L_0x035b
        L_0x034c:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.CasStatementWrapper r2 = r2.getCasStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            r11 = r2
        L_0x035b:
            r7 = 20
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r11
            r1.getCasStatement(r2, r4, r5, r6, r7)
            goto L_0x0404
        L_0x0369:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            if (r2 == 0) goto L_0x038f
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x0380
            goto L_0x038f
        L_0x0380:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            goto L_0x0390
        L_0x038f:
            r2 = r11
        L_0x0390:
            r3 = 20
            java.lang.String r4 = "AMEX"
            r7 = 1
            r5 = r19
            r6 = r20
            r1.getBonusStatementByType(r2, r3, r4, r5, r6, r7)
            goto L_0x0404
        L_0x039e:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            if (r2 == 0) goto L_0x03c4
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x03b5
            goto L_0x03c4
        L_0x03b5:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper r2 = r2.getBonusStatementDetailsWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            goto L_0x03c5
        L_0x03c4:
            r2 = r11
        L_0x03c5:
            r3 = 20
            java.lang.String r4 = "PLUS"
            r7 = 1
            r5 = r19
            r6 = r20
            r1.getBonusStatementByType(r2, r3, r4, r5, r6, r7)
            goto L_0x0404
        L_0x03d2:
            ge.bog.mobilebank.rest.manager.BankApiManager r1 = r0.mBankApiManager
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r2 = r2.getScoolStatementWrapper()
            if (r2 == 0) goto L_0x03f8
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r2 = r2.getScoolStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            if (r2 != 0) goto L_0x03e9
            goto L_0x03f8
        L_0x03e9:
            ge.bog.mobilebank.eventbus.events.AccountStatementEvent r2 = r0.accountStatementEvent
            ge.bog.mobilebank.model.statement.ScoolStatementWrapper r2 = r2.getScoolStatementWrapper()
            java.util.ArrayList r2 = r2.getList()
            int r2 = r2.size()
            r11 = r2
        L_0x03f8:
            r7 = 20
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r11
            r1.getScoolStatement(r2, r4, r5, r6, r7)
        L_0x0404:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.Client.requestAccountStatement(boolean, int, long, java.lang.Long, java.lang.Long, int, boolean):void");
    }

    public void requestAllOperationsEvent() {
        if (isAuthorized()) {
            AllOperationsEvent allOperationsEvent2 = this.allOperationsEvent;
            if (allOperationsEvent2 != null) {
                this.mEventBus.mo96184m(allOperationsEvent2);
                return;
            }
            requestOperations(12, false, (Long) null, (Long) null, (Long) null, C32319m.m95286F(C32319m.m95314u(C32319m.m95306m(1))), (Long) null, (Long) null, (String) null, (String) null, 0);
            return;
        }
        UnAuthorizedAllOperationsEvent unAuthorizedAllOperationsEvent2 = this.unAuthorizedAllOperationsEvent;
        if (unAuthorizedAllOperationsEvent2 != null) {
            this.mEventBus.mo96184m(unAuthorizedAllOperationsEvent2);
        }
    }

    public void requestBeneficiaries(boolean z) {
        if (z || !shouldNotRefresh(this.transferBeneficiaryEvent)) {
            TransferBeneficiaryEvent transferBeneficiaryEvent2 = new TransferBeneficiaryEvent();
            this.transferBeneficiaryEvent = transferBeneficiaryEvent2;
            transferBeneficiaryEvent2.setState(10);
            this.mEventBus.mo96184m(this.transferBeneficiaryEvent);
            this.mBankApiManager.getTransferBeneficiaries();
            return;
        }
        this.mEventBus.mo96184m(this.transferBeneficiaryEvent);
    }

    public void requestBonds(boolean z) {
        if (z || !shouldNotRefresh(this.bondsEvent)) {
            BondsEvent bondsEvent2 = new BondsEvent();
            this.bondsEvent = bondsEvent2;
            bondsEvent2.setState(10);
            this.mEventBus.mo96184m(this.bondsEvent);
            this.mBankApiManager.getBonds();
            return;
        }
        this.mEventBus.mo96184m(this.bondsEvent);
    }

    public void requestBonusProviders(boolean z, String str, String str2) {
        if (z || !shouldNotRefresh(this.bonusProvidersEvent) || !this.bonusProvidersEvent.getProdType().equals(str2) || !this.bonusProvidersEvent.getBonusType().equals(str)) {
            BonusProvidersEvent bonusProvidersEvent2 = new BonusProvidersEvent();
            this.bonusProvidersEvent = bonusProvidersEvent2;
            bonusProvidersEvent2.setState(10);
            this.bonusProvidersEvent.setProdType(str2);
            this.bonusProvidersEvent.setBonusType(str);
            this.mEventBus.mo96184m(this.bonusProvidersEvent);
            this.mBankApiManager.getExpressProviders(str, str2);
            return;
        }
        this.mEventBus.mo96184m(this.bonusProvidersEvent);
    }

    public void requestBonuses() {
        C28113a aVar = this.loyaltyListRepository;
        if (aVar != null) {
            aVar.mo67401e3();
        }
    }

    public void requestCarDebts(boolean z) {
        TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
        if (templatesAndConfigEvent != null && templatesAndConfigEvent.getState() == 20 && this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig() != null && this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups() != null) {
            Iterator<TemplateGroup> it = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplateGroups().iterator();
            while (it.hasNext()) {
                TemplateGroup next = it.next();
                if (next.getGroupType() != null && next.getGroupType().equals("C")) {
                    refreshCarDebt(next);
                }
            }
        }
    }

    public void requestCreditCards(boolean z) {
        if (z || !shouldNotRefresh(this.creditCardsEvent)) {
            this.compositeDisposable.mo95660b(this.cardsAndDetailsUseCase.mo65885b().mo95027o0(C40992a.m118827a()).mo94980F(new C33209b(this)).mo94995O0(1).mo94998Q(new C33212c(this)).mo94983G0(new C33216d(this), new C33228e(this)));
        } else {
            this.mEventBus.mo96184m(this.creditCardsEvent);
        }
    }

    public void requestDDAccounts() {
        if (shouldNotRefresh(this.ddAccountsEvent)) {
            this.mEventBus.mo96184m(this.ddAccountsEvent);
            return;
        }
        DDAccountsEvent dDAccountsEvent = new DDAccountsEvent();
        this.ddAccountsEvent = dDAccountsEvent;
        dDAccountsEvent.setState(10);
        this.mEventBus.mo96184m(this.ddAccountsEvent);
        this.mBankApiManager.getDDAccounts();
    }

    public void requestDDPeriodTypes() {
        if (shouldNotRefresh(this.ddPeriodTypesEvent)) {
            this.mEventBus.mo96184m(this.ddPeriodTypesEvent);
            return;
        }
        DDPeriodTypesEvent dDPeriodTypesEvent = new DDPeriodTypesEvent();
        this.ddPeriodTypesEvent = dDPeriodTypesEvent;
        dDPeriodTypesEvent.setState(10);
        this.mEventBus.mo96184m(this.ddPeriodTypesEvent);
        this.mBankApiManager.getDDPeriodTypes();
    }

    public void requestDDProviders(boolean z) {
        if (z || !shouldNotRefresh(this.ddProvidersListEvent)) {
            DDProvidersListEvent dDProvidersListEvent = new DDProvidersListEvent();
            this.ddProvidersListEvent = dDProvidersListEvent;
            dDProvidersListEvent.setState(10);
            this.mEventBus.mo96184m(this.ddProvidersListEvent);
            this.mBankApiManager.getDDProviders();
            return;
        }
        this.mEventBus.mo96184m(this.ddProvidersListEvent);
    }

    public void requestDDSTO(boolean z) {
        if (z || !shouldNotRefresh(this.ddstoListEvent)) {
            DDSTOListEvent dDSTOListEvent = new DDSTOListEvent();
            this.ddstoListEvent = dDSTOListEvent;
            dDSTOListEvent.setState(10);
            this.mEventBus.mo96184m(this.ddstoListEvent);
            this.mBankApiManager.getDDSTOList();
            return;
        }
        this.mEventBus.mo96184m(this.ddstoListEvent);
    }

    public void requestDeleteTransferTemplateEvent() {
        TransferDeleteTemplateEvent transferDeleteTemplateEvent2 = this.transferDeleteTemplateEvent;
        if (transferDeleteTemplateEvent2 != null) {
            this.mEventBus.mo96184m(transferDeleteTemplateEvent2);
        }
    }

    public void requestDepLoanAgreements(boolean z) {
        if (z || !shouldNotRefresh(this.depLoanAgreementsEvent)) {
            DepLoanAgreementsEvent depLoanAgreementsEvent2 = new DepLoanAgreementsEvent();
            this.depLoanAgreementsEvent = depLoanAgreementsEvent2;
            depLoanAgreementsEvent2.setState(10);
            this.mEventBus.mo96184m(this.depLoanAgreementsEvent);
            this.mBankApiManager.getDepLoanAgreements();
            return;
        }
        this.mEventBus.mo96184m(this.depLoanAgreementsEvent);
    }

    public void requestDepositBonds(boolean z) {
        if (z || !shouldNotRefresh(this.depositBondsEvent)) {
            this.compositeDisposable.mo95660b(this.cardsAndDetailsUseCase.mo65885b().mo95027o0(C40992a.m118827a()).mo94980F(new C33253o0(this)).mo94995O0(1).mo94998Q(new C33260p0(this)).mo94983G0(new C33269q0(this), new C33272r0(this)));
        } else {
            this.mEventBus.mo96184m(this.depositBondsEvent);
        }
    }

    public void requestFeatureFeedback(boolean z) {
        if (z || !shouldNotRefresh(this.featureFeedback)) {
            FeatureFeedBackEvent featureFeedBackEvent = new FeatureFeedBackEvent();
            this.featureFeedback = featureFeedBackEvent;
            featureFeedBackEvent.setState(10);
            this.mEventBus.mo96184m(this.featureFeedback);
            this.mBankApiManager.getFeatureFeedback();
            return;
        }
        this.mEventBus.mo96184m(this.featureFeedback);
    }

    public void requestInTransferDetails(boolean z, long j, String str, String str2) {
        requestInTransferDetails(z, j, str, str2, (Long) null, (Long) null, (Long) null);
    }

    public void requestLastOperations(long j, Long l, int i) {
        if (!shouldNotRefresh(this.unAuthorizedAllOperationsEvent) || !C32359z0.m95598z(Long.valueOf(this.unAuthorizedAllOperationsEvent.getStartDate()), Long.valueOf(j)) || !C32359z0.m95598z(this.unAuthorizedAllOperationsEvent.getEndDate(), l) || (this.unAuthorizedAllOperationsEvent.getLastOperations().size() <= i && this.unAuthorizedAllOperationsEvent.canDownloadMore())) {
            List arrayList = new ArrayList();
            UnAuthorizedAllOperationsEvent unAuthorizedAllOperationsEvent2 = this.unAuthorizedAllOperationsEvent;
            if (unAuthorizedAllOperationsEvent2 != null && C32359z0.m95598z(Long.valueOf(unAuthorizedAllOperationsEvent2.getStartDate()), Long.valueOf(j)) && C32359z0.m95598z(this.unAuthorizedAllOperationsEvent.getEndDate(), l)) {
                arrayList = this.unAuthorizedAllOperationsEvent.getLastOperations();
            }
            UnAuthorizedAllOperationsEvent unAuthorizedAllOperationsEvent3 = new UnAuthorizedAllOperationsEvent();
            this.unAuthorizedAllOperationsEvent = unAuthorizedAllOperationsEvent3;
            unAuthorizedAllOperationsEvent3.setState(10);
            this.unAuthorizedAllOperationsEvent.setStartDate(j);
            this.unAuthorizedAllOperationsEvent.setEndDate(l);
            this.unAuthorizedAllOperationsEvent.setOperations(arrayList);
            this.mEventBus.mo96184m(this.unAuthorizedAllOperationsEvent);
            this.mBankApiManager.getPaymentsLastOperations(j, l, i, 20);
            return;
        }
        this.mEventBus.mo96184m(this.unAuthorizedAllOperationsEvent);
    }

    public void requestLoanHistory(boolean z, long j, boolean z2) {
        LoanHistoryEvent loanHistoryEvent2;
        if (z || (loanHistoryEvent2 = this.loanHistoryEvent) == null || loanHistoryEvent2.getLoanKey() != j) {
            LoanHistoryEvent loanHistoryEvent3 = new LoanHistoryEvent();
            this.loanHistoryEvent = loanHistoryEvent3;
            loanHistoryEvent3.setLoanKey(j);
            this.loanHistoryEvent.setState(10);
            this.mEventBus.mo96184m(this.loanHistoryEvent);
            this.mBankApiManager.getLoansHistory(j, z2);
            return;
        }
        this.mEventBus.mo96184m(this.loanHistoryEvent);
    }

    public void requestLoanSchedules(boolean z, long j) {
        LoanScheduleEvent loanScheduleEvent2;
        if (z || (loanScheduleEvent2 = this.loanScheduleEvent) == null || loanScheduleEvent2.getLoanKey() != j) {
            LoanScheduleEvent loanScheduleEvent3 = new LoanScheduleEvent();
            this.loanScheduleEvent = loanScheduleEvent3;
            loanScheduleEvent3.setLoanKey(j);
            this.loanScheduleEvent.setState(10);
            this.mEventBus.mo96184m(this.loanScheduleEvent);
            this.mBankApiManager.getLoansSchedule(j);
            return;
        }
        this.mEventBus.mo96184m(this.loanScheduleEvent);
    }

    public void requestLoans(boolean z) {
        if (z || !shouldNotRefresh(this.loansEvent)) {
            this.compositeDisposable.mo95660b(this.cardsAndDetailsUseCase.mo65885b().mo95027o0(C40992a.m118827a()).mo94995O0(1).mo94980F(new C33281x(this)).mo94998Q(new C33282y(this)).mo94983G0(new C33283z(this), new C33196a0(this)));
        } else {
            this.mEventBus.mo96184m(this.loansEvent);
        }
    }

    public void requestMapObjectDetails(boolean z, MapObject mapObject) {
        MapObjectDetailsEvent mapObjectDetailsEvent;
        if (z || (mapObjectDetailsEvent = this.lastMapObjectDetailsEvent) == null || !mapObjectDetailsEvent.getMapObject().getObjectKey().equals(mapObject.getObjectKey()) || !this.lastMapObjectDetailsEvent.getMapObject().getObjectName().equals(mapObject.getObjectName())) {
            MapObjectDetailsEvent mapObjectDetailsEvent2 = new MapObjectDetailsEvent();
            this.lastMapObjectDetailsEvent = mapObjectDetailsEvent2;
            mapObjectDetailsEvent2.setState(10);
            this.lastMapObjectDetailsEvent.setMapObject(mapObject);
            this.mEventBus.mo96184m(this.lastMapObjectDetailsEvent);
            this.mBankApiManager.getMapObjectDetails(mapObject);
            return;
        }
        this.mEventBus.mo96184m(this.lastMapObjectDetailsEvent);
    }

    public void requestMapObjectStatus(boolean z, MapObject mapObject) {
        MapObjectStatusEvent mapObjectStatusEvent2;
        if (z || (mapObjectStatusEvent2 = this.mapObjectStatusEvent) == null || mapObjectStatusEvent2.getMapObject() == null || !this.mapObjectStatusEvent.getMapObject().getObjectKey().equals(mapObject.getObjectKey()) || !this.mapObjectStatusEvent.getMapObject().getObjectName().equals(mapObject.getObjectName()) || !this.mapObjectStatusEvent.getMapObject().getObjectType().equals(mapObject.getObjectType())) {
            MapObjectStatusEvent mapObjectStatusEvent3 = new MapObjectStatusEvent();
            this.mapObjectStatusEvent = mapObjectStatusEvent3;
            mapObjectStatusEvent3.setState(10);
            this.mapObjectStatusEvent.setMapObject(mapObject);
            this.mEventBus.mo96184m(this.mapObjectStatusEvent);
            this.mBankApiManager.getMapObjectStatus(mapObject);
            return;
        }
        this.mEventBus.mo96184m(this.mapObjectStatusEvent);
    }

    public void requestMapObjects(boolean z) {
        if (z || !shouldNotRefresh(this.mMapObjectsEvent)) {
            MapObjectsEvent mapObjectsEvent = new MapObjectsEvent();
            this.mMapObjectsEvent = mapObjectsEvent;
            mapObjectsEvent.setState(10);
            this.mEventBus.mo96184m(this.mMapObjectsEvent);
            this.mBankApiManager.getMapObjects(false);
            return;
        }
        this.mEventBus.mo96184m(this.mMapObjectsEvent);
    }

    public void requestMapRegions() {
        MapRegionsEvent mapRegionsEvent2 = this.mapRegionsEvent;
        if (mapRegionsEvent2 == null || mapRegionsEvent2.getState() != 20) {
            MapRegionsEvent mapRegionsEvent3 = new MapRegionsEvent();
            this.mapRegionsEvent = mapRegionsEvent3;
            mapRegionsEvent3.setState(10);
            this.mEventBus.mo96184m(this.mapRegionsEvent);
            this.mBankApiManager.getMapRegions();
            return;
        }
        this.mEventBus.mo96184m(this.mapRegionsEvent);
    }

    public void requestModifyTemplateGroupLink(boolean z, String str, long j, String str2) {
        ModifyTemplateGroupLinkEvent modifyTemplateGroupLinkEvent2;
        if (z || (modifyTemplateGroupLinkEvent2 = this.modifyTemplateGroupLinkEvent) == null) {
            this.mTemplatesAndConfigEvent.setState(10);
            refreshTemplateList();
            ModifyTemplateGroupLinkEvent modifyTemplateGroupLinkEvent3 = new ModifyTemplateGroupLinkEvent(j, str, str2);
            this.modifyTemplateGroupLinkEvent = modifyTemplateGroupLinkEvent3;
            modifyTemplateGroupLinkEvent3.setState(10);
            this.mEventBus.mo96184m(this.modifyTemplateGroupLinkEvent);
            this.mBankApiManager.updateTemplatesLink(str, j, str2);
            return;
        }
        this.mEventBus.mo96184m(modifyTemplateGroupLinkEvent2);
    }

    public void requestModifyTransferTemplateEvent() {
        ModifyTransferTemplateEvent modifyTransferTemplateEvent2 = this.modifyTransferTemplateEvent;
        if (modifyTransferTemplateEvent2 != null) {
            this.mEventBus.mo96184m(modifyTransferTemplateEvent2);
        }
    }

    public void requestNotificationList(boolean z) {
        if (z || !shouldNotRefresh(this.notificationListEvent)) {
            NotificationListEvent notificationListEvent2 = new NotificationListEvent();
            this.notificationListEvent = notificationListEvent2;
            notificationListEvent2.setState(10);
            this.mEventBus.mo96184m(this.notificationListEvent);
            this.mBankApiManager.getNotificationList();
            return;
        }
        this.mEventBus.mo96184m(this.notificationListEvent);
    }

    public void requestNotificationsCount(String str, boolean z) {
        if (!isAuthorized()) {
            return;
        }
        if (z || !shouldNotRefresh(this.notificationCountEvent)) {
            NotificationCountEvent notificationCountEvent2 = new NotificationCountEvent();
            this.notificationCountEvent = notificationCountEvent2;
            notificationCountEvent2.setState(10);
            this.mEventBus.mo96184m(this.notificationCountEvent);
            this.mBankApiManager.requestNotificationsCount(str);
            return;
        }
        this.mEventBus.mo96184m(this.notificationCountEvent);
    }

    public void requestOperationDetails(boolean z, long j, long j2) {
        if (z || !shouldNotRefresh(this.operationDetailsEvent) || this.operationDetailsEvent.getEntryId() != j || this.operationDetailsEvent.getDocKey() != j2) {
            OperationDetailsEvent operationDetailsEvent2 = new OperationDetailsEvent();
            this.operationDetailsEvent = operationDetailsEvent2;
            operationDetailsEvent2.setState(10);
            this.operationDetailsEvent.setEntryId(j);
            this.operationDetailsEvent.setDocKey(j2);
            this.mEventBus.mo96184m(this.operationDetailsEvent);
            this.mBankApiManager.getOperationDetails(j, j2);
            return;
        }
        this.mEventBus.mo96184m(this.operationDetailsEvent);
    }

    public void requestOperations(int i, boolean z, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2) {
        CreditCardAccount creditAccountByKey;
        Deposit depositByAcctKey;
        int i3 = i;
        Long l7 = l2;
        Long l8 = l3;
        Long l9 = l5;
        Long l12 = l6;
        String str3 = str;
        String str4 = str2;
        int i4 = i2;
        if (i3 == 1) {
            Long l13 = l4;
            AccountOperationsEvent accountOperationsEvent = new AccountOperationsEvent();
            accountOperationsEvent.setAcctKey(l.longValue());
            accountOperationsEvent.setState(10);
            this.mEventBus.mo96184m(accountOperationsEvent);
            this.mBankApiManager.getOperations(i, l, l2, l3, l4, l5, l6, str, str2, 0, 50, (Integer) null);
        } else if (i3 == 2) {
            Long l14 = l4;
            CreditCardsEvent creditCardsEvent2 = this.creditCardsEvent;
            if (creditCardsEvent2 != null && creditCardsEvent2.getCreditCardsWrapper() != null && (creditAccountByKey = this.creditCardsEvent.getCreditCardsWrapper().getCreditAccountByKey(l7)) != null) {
                if (z || !shouldNotRefresh(creditAccountByKey.getOperationsEvent()) || (creditAccountByKey.getOperationsEvent().getOperations().size() <= i4 && creditAccountByKey.getOperationsEvent().canDownloadMore())) {
                    CreditAccountOperationsEvent creditAccountOperationsEvent = new CreditAccountOperationsEvent();
                    creditAccountOperationsEvent.setAcctKey(creditAccountByKey.getAcctKey());
                    creditAccountOperationsEvent.setState(10);
                    if (creditAccountByKey.getOperationsEvent() != null) {
                        creditAccountOperationsEvent.setOperations(creditAccountByKey.getOperationsEvent().getOperations());
                    }
                    creditAccountByKey.setOperationsEvent(creditAccountOperationsEvent);
                    this.mEventBus.mo96184m(creditAccountByKey.getOperationsEvent());
                    this.mBankApiManager.getOperations(i, (Long) null, l2, l3, l4, l5, l6, str, str2, creditAccountByKey.getOperationsEvent().getOperations().size(), 50, (Integer) null);
                    return;
                }
                this.mEventBus.mo96184m(creditAccountByKey.getOperationsEvent());
            }
        } else if (i3 == 4) {
            Long l15 = l4;
            DepositBondsEvent depositBondsEvent2 = this.depositBondsEvent;
            if (depositBondsEvent2 != null && depositBondsEvent2.getDepositBonds() != null && this.depositBondsEvent.getDepositBonds().getDeposits() != null && (depositByAcctKey = this.depositBondsEvent.getDepositBonds().getDeposits().getDepositByAcctKey(l7)) != null) {
                if (z || !shouldNotRefresh(depositByAcctKey.getOperationsEvent()) || (depositByAcctKey.getOperationsEvent().getOperations().size() <= i4 && depositByAcctKey.getOperationsEvent().canDownloadMore())) {
                    DepositOperationsEvent depositOperationsEvent = new DepositOperationsEvent();
                    depositOperationsEvent.setAcctKey(depositByAcctKey.getAccountKey());
                    depositOperationsEvent.setState(10);
                    if (depositByAcctKey.getOperationsEvent() != null) {
                        depositOperationsEvent.setOperations(depositByAcctKey.getOperationsEvent().getOperations());
                    }
                    depositByAcctKey.setOperationsEvent(depositOperationsEvent);
                    this.mEventBus.mo96184m(depositByAcctKey.getOperationsEvent());
                    this.mBankApiManager.getOperations(i, (Long) null, l2, l3, l4, l5, l6, str, str2, depositByAcctKey.getOperationsEvent().getOperations().size(), 50, (Integer) null);
                    return;
                }
                this.mEventBus.mo96184m(depositByAcctKey.getOperationsEvent());
            }
        } else if (i3 == 6) {
            Long l16 = l4;
            CardOperationsEvent cardOperationsEvent = new CardOperationsEvent();
            cardOperationsEvent.setCardId(l3.longValue());
            cardOperationsEvent.setState(10);
            this.mEventBus.mo96184m(cardOperationsEvent);
            this.mBankApiManager.getOperations(i, (Long) null, l2, l3, l4, l5, l6, str, str2, 0, 50, (Integer) null);
        } else if (i3 == 12) {
            if (z || !shouldNotRefresh(this.allOperationsEvent) || !C32359z0.m95598z(this.allOperationsEvent.getAcctKey(), l7) || !C32359z0.m95598z(this.allOperationsEvent.getCardId(), l8)) {
                Long l17 = l4;
            } else if (C32359z0.m95598z(Long.valueOf(this.allOperationsEvent.getStartDate()), l4) && C32359z0.m95598z(this.allOperationsEvent.getEndDate(), l9) && C32359z0.m95598z(this.allOperationsEvent.getOperationEntryGroupId(), l12) && C32359z0.m95598z(this.allOperationsEvent.getMerchantClientId(), str3) && C32359z0.m95598z(this.allOperationsEvent.getEssServiceId(), str4) && (this.allOperationsEvent.getOperations().size() > i4 || !this.allOperationsEvent.canDownloadMore())) {
                this.mEventBus.mo96184m(this.allOperationsEvent);
                return;
            }
            AllOperationsEvent allOperationsEvent2 = new AllOperationsEvent();
            allOperationsEvent2.setState(10);
            allOperationsEvent2.setAcctKey(l7);
            allOperationsEvent2.setCardId(l8);
            allOperationsEvent2.setStartDate(l4.longValue());
            allOperationsEvent2.setEndDate(l9);
            allOperationsEvent2.setOperationEntryGroupId(l12);
            allOperationsEvent2.setMerchantClientId(str3);
            allOperationsEvent2.setEssServiceId(str4);
            AllOperationsEvent allOperationsEvent3 = this.allOperationsEvent;
            if (allOperationsEvent3 != null && C32359z0.m95598z(allOperationsEvent3.getAcctKey(), allOperationsEvent2.getAcctKey()) && C32359z0.m95598z(this.allOperationsEvent.getCardId(), allOperationsEvent2.getCardId()) && C32359z0.m95598z(Long.valueOf(this.allOperationsEvent.getStartDate()), Long.valueOf(allOperationsEvent2.getStartDate())) && C32359z0.m95598z(this.allOperationsEvent.getEndDate(), allOperationsEvent2.getEndDate()) && C32359z0.m95598z(this.allOperationsEvent.getOperationEntryGroupId(), allOperationsEvent2.getOperationEntryGroupId()) && C32359z0.m95598z(this.allOperationsEvent.getMerchantClientId(), allOperationsEvent2.getMerchantClientId()) && C32359z0.m95598z(this.allOperationsEvent.getEssServiceId(), allOperationsEvent2.getEssServiceId())) {
                allOperationsEvent2.setOperations(this.allOperationsEvent.getOperations());
                allOperationsEvent2.setIncomeSum(this.allOperationsEvent.getIncomeSum());
                allOperationsEvent2.setOutcomeSum(this.allOperationsEvent.getOutcomeSum());
                allOperationsEvent2.setEndBalance(this.allOperationsEvent.getEndBalance());
                allOperationsEvent2.setStartBalance(this.allOperationsEvent.getStartBalance());
            }
            this.allOperationsEvent = allOperationsEvent2;
            this.mEventBus.mo96184m(allOperationsEvent2);
            this.mBankApiManager.getOperations(i, (Long) null, l2, l3, l4, l5, l6, str, str2, this.allOperationsEvent.getOperations().size(), 20, (Integer) null);
        }
    }

    public void requestOutTransferDetails(boolean z, long j, String str, String str2, Long l, Long l2, Long l3) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (z || !shouldNotRefresh(this.outTransferDetailsEvent) || this.outTransferDetailsEvent.getDocKey() != j2 || !C32359z0.m95598z(str, this.outTransferDetailsEvent.getEssServiceId()) || !str2.equals(this.outTransferDetailsEvent.getPrintFormType())) {
            OutTransferDetailsEvent outTransferDetailsEvent2 = new OutTransferDetailsEvent();
            this.outTransferDetailsEvent = outTransferDetailsEvent2;
            outTransferDetailsEvent2.setState(10);
            this.outTransferDetailsEvent.setDocKey(j);
            this.outTransferDetailsEvent.setEssServiceId(str);
            this.outTransferDetailsEvent.setPrintFormType(str2);
            this.mEventBus.mo96184m(this.outTransferDetailsEvent);
            this.mBankApiManager.getOutTransferDetails(j, str, str2, l, l2, l3);
            return;
        }
        this.mEventBus.mo96184m(this.outTransferDetailsEvent);
    }

    public void requestPaymentCards(String str, boolean z) {
        if (z || !shouldNotRefresh(this.paymentCardsEvent) || !C32359z0.m95598z(this.paymentCardsEvent.providerIds, str)) {
            PaymentCardsEvent paymentCardsEvent2 = new PaymentCardsEvent();
            this.paymentCardsEvent = paymentCardsEvent2;
            paymentCardsEvent2.providerIds = str;
            paymentCardsEvent2.setState(10);
            this.mEventBus.mo96184m(this.paymentCardsEvent);
            this.mBankApiManager.getSavedCards(str);
            return;
        }
        this.mEventBus.mo96184m(this.paymentCardsEvent);
    }

    public void requestPaymentDebt(String str, String str2, Object obj) {
        if (str == null) {
            PaymentDebtEvent paymentDebtEvent = this.mPaymentDebtEvent;
            if (paymentDebtEvent != null) {
                this.mEventBus.mo96184m(paymentDebtEvent);
                return;
            }
            return;
        }
        PaymentDebtEvent paymentDebtEvent2 = new PaymentDebtEvent();
        this.mPaymentDebtEvent = paymentDebtEvent2;
        paymentDebtEvent2.setInstance(obj);
        this.mPaymentDebtEvent.setState(10);
        this.mEventBus.mo96184m(this.mPaymentDebtEvent);
        this.mBankApiManager.getPaymentDebt("", str, str2, (PaymentServiceConfig) null, -1);
    }

    public void requestPaymentDetails(boolean z, long j, String str, String str2, Long l, Long l2, Long l3) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (z || !shouldNotRefresh(this.paymentDetailsEvent) || this.paymentDetailsEvent.getDocKey() != j2 || !C32359z0.m95598z(str, this.paymentDetailsEvent.getEssServiceId()) || !str2.equals(this.paymentDetailsEvent.getPrintFormType())) {
            PaymentDetailsEvent paymentDetailsEvent2 = new PaymentDetailsEvent();
            this.paymentDetailsEvent = paymentDetailsEvent2;
            paymentDetailsEvent2.setState(10);
            this.paymentDetailsEvent.setDocKey(j);
            this.paymentDetailsEvent.setEssServiceId(str);
            this.paymentDetailsEvent.setPrintFormType(str2);
            this.mEventBus.mo96184m(this.paymentDetailsEvent);
            this.mBankApiManager.getPaymentDetails(j, str, str2, l, l2, l3);
            return;
        }
        this.mEventBus.mo96184m(this.paymentDetailsEvent);
    }

    public void requestPaymentsProviderConfig(boolean z, String str, String str2, Object obj) {
        ProviderConfigurationEvent providerConfigurationEvent2;
        if (z || (providerConfigurationEvent2 = this.providerConfigurationEvent) == null || !str2.equals(providerConfigurationEvent2.getServiceId()) || obj != this.providerConfigurationEvent.getInstance()) {
            ProviderConfigurationEvent providerConfigurationEvent3 = new ProviderConfigurationEvent();
            this.providerConfigurationEvent = providerConfigurationEvent3;
            providerConfigurationEvent3.setInstance(obj);
            this.providerConfigurationEvent.setServiceId(str2);
            this.providerConfigurationEvent.setState(10);
            this.mEventBus.mo96184m(this.providerConfigurationEvent);
            this.mBankApiManager.getPaymentsProviderConfiguration(str, "", str2, BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
            return;
        }
        this.mEventBus.mo96184m(this.providerConfigurationEvent);
    }

    public void requestPensionStatus(boolean z) {
        if (z || !shouldNotRefresh(this.pensionStatusEvent)) {
            PensionStatusEvent pensionStatusEvent2 = new PensionStatusEvent();
            this.pensionStatusEvent = pensionStatusEvent2;
            pensionStatusEvent2.setState(10);
            this.mEventBus.mo96184m(this.pensionStatusEvent);
            this.mBankApiManager.getPensionStatus();
            return;
        }
        this.mEventBus.mo96184m(this.pensionStatusEvent);
    }

    public void requestPensions(boolean z) {
        this.compositeDisposable.mo95660b(C26186e.m81990h(this.getLegacyPensionAmount.mo63913a(z)).mo95083l(new C33240j(this)).mo95070I(new C33242k(this), new C33246m(this)));
    }

    public void requestProviderConfiguration(String str) {
        if (str == null) {
            PaymentCategoriesDownloadEvent paymentCategoriesDownloadEvent2 = this.paymentCategoriesDownloadEvent;
            if (paymentCategoriesDownloadEvent2 != null) {
                this.mEventBus.mo96184m(paymentCategoriesDownloadEvent2);
                return;
            }
            return;
        }
        PaymentCategoriesDownloadEvent paymentCategoriesDownloadEvent3 = new PaymentCategoriesDownloadEvent((PaymentProviderConfiguration[]) null);
        this.paymentCategoriesDownloadEvent = paymentCategoriesDownloadEvent3;
        paymentCategoriesDownloadEvent3.setState(10);
        this.mEventBus.mo96184m(this.paymentCategoriesDownloadEvent);
        this.mBankApiManager.getPaymentsProviderConfiguration("", "", str, BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
    }

    public void requestSMSNotificationsList(boolean z) {
        if (z || !shouldNotRefresh(this.smsNotifListEvent)) {
            SMSNotifListEvent sMSNotifListEvent = new SMSNotifListEvent();
            this.smsNotifListEvent = sMSNotifListEvent;
            sMSNotifListEvent.setState(10);
            this.mEventBus.mo96184m(this.smsNotifListEvent);
            this.mBankApiManager.getSMSNotificationsList();
            return;
        }
        this.mEventBus.mo96184m(this.smsNotifListEvent);
    }

    public void requestSTOPeriodTypes() {
        if (shouldNotRefresh(this.stoPeriodTypesEvent)) {
            this.mEventBus.mo96184m(this.stoPeriodTypesEvent);
            return;
        }
        STOPeriodTypesEvent sTOPeriodTypesEvent = new STOPeriodTypesEvent();
        this.stoPeriodTypesEvent = sTOPeriodTypesEvent;
        sTOPeriodTypesEvent.setState(10);
        this.mEventBus.mo96184m(this.stoPeriodTypesEvent);
        this.mBankApiManager.getSTOPeriodTypes();
    }

    public void requestSelected(boolean z) {
        if (z || !shouldNotRefresh(this.selectedPaymentsEvent)) {
            SelectedPaymentsEvent selectedPaymentsEvent2 = new SelectedPaymentsEvent();
            this.selectedPaymentsEvent = selectedPaymentsEvent2;
            selectedPaymentsEvent2.setState(10);
            this.mEventBus.mo96184m(this.selectedPaymentsEvent);
            this.mBankApiManager.getSelectedPayments();
            return;
        }
        this.mEventBus.mo96184m(this.selectedPaymentsEvent);
    }

    public void requestTemplateDebts(boolean z) {
        TemplatesAndConfigEvent templatesAndConfigEvent = this.mTemplatesAndConfigEvent;
        if (templatesAndConfigEvent != null && templatesAndConfigEvent.getState() == 20 && this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig() != null && this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates() != null) {
            Iterator<TemplateBasketItem> it = this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates().iterator();
            while (it.hasNext()) {
                TemplateBasketItem next = it.next();
                if (next.canGetDebt()) {
                    refreshDebt(next.getId());
                }
            }
        }
    }

    public void requestTemplatesWithConfig(boolean z) {
        if (z || !shouldNotRefresh(this.mTemplatesAndConfigEvent)) {
            TemplatesAndConfigEvent templatesAndConfigEvent = new TemplatesAndConfigEvent();
            this.mTemplatesAndConfigEvent = templatesAndConfigEvent;
            templatesAndConfigEvent.setState(10);
            this.mEventBus.mo96184m(this.mTemplatesAndConfigEvent);
            this.mBankApiManager.getTemplatesBasket(Boolean.valueOf(isAuthorized()), "I,S", 0, 400000, 1, "FULL");
            return;
        }
        this.mEventBus.mo96184m(this.mTemplatesAndConfigEvent);
    }

    public void requestTerminateDDSTOEvent() {
        TerminateDDSTOEvent terminateDDSTOEvent2 = this.terminateDDSTOEvent;
        if (terminateDDSTOEvent2 != null) {
            this.mEventBus.mo96184m(terminateDDSTOEvent2);
        }
    }

    public void requestTransferDetailsPfm(boolean z, String str, String str2, long j, Long l, String str3, Long l2) {
        String str4 = str;
        if (z || !shouldNotRefresh(this.transferHistoryEvent) || !C32359z0.m95598z(str, this.transferHistoryEvent.getDocKey()) || (this.transferHistoryEvent.getPfmId() != null && !C32359z0.m95598z(Long.valueOf(j), this.transferHistoryEvent.getPfmId()))) {
            TransferHistoryEvent transferHistoryEvent2 = new TransferHistoryEvent();
            this.transferHistoryEvent = transferHistoryEvent2;
            transferHistoryEvent2.setState(10);
            this.transferHistoryEvent.setDocKey(str);
            this.transferHistoryEvent.setPfmId(Long.valueOf(j));
            this.mEventBus.mo96184m(this.transferHistoryEvent);
            this.mBankApiManager.getTransferDetailsPfm(str, str2, j, l, str3, l2);
            return;
        }
        this.mEventBus.mo96184m(this.transferHistoryEvent);
    }

    public void requestTransferTemplates(boolean z) {
        if (z || !shouldNotRefresh(this.transfersTemplateEvent)) {
            TransferTemplatesEvent transferTemplatesEvent = new TransferTemplatesEvent();
            this.transfersTemplateEvent = transferTemplatesEvent;
            transferTemplatesEvent.setState(10);
            this.mEventBus.mo96184m(this.transfersTemplateEvent);
            this.mBankApiManager.getTemplatesByType("M,B,G,R,F", 0, 400000, 1);
            return;
        }
        this.mEventBus.mo96184m(this.transfersTemplateEvent);
    }

    public void requestUtilityPaymentDetails(boolean z, long j, String str, String str2, Long l, Long l2, Long l3) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (z || !shouldNotRefresh(this.utilityPaymentDetailsEvent) || this.utilityPaymentDetailsEvent.getDocKey() != j2 || !C32359z0.m95598z(str, this.utilityPaymentDetailsEvent.getEssServiceId()) || !str2.equals(this.utilityPaymentDetailsEvent.getPrintFormType())) {
            UtilityPaymentDetailsEvent utilityPaymentDetailsEvent2 = new UtilityPaymentDetailsEvent();
            this.utilityPaymentDetailsEvent = utilityPaymentDetailsEvent2;
            utilityPaymentDetailsEvent2.setState(10);
            this.utilityPaymentDetailsEvent.setDocKey(j);
            this.utilityPaymentDetailsEvent.setEssServiceId(str);
            this.utilityPaymentDetailsEvent.setPrintFormType(str2);
            this.mEventBus.mo96184m(this.utilityPaymentDetailsEvent);
            this.mBankApiManager.getUtilityPaymentDetails(j, str, str2, l, l2, l3);
            return;
        }
        this.mEventBus.mo96184m(this.utilityPaymentDetailsEvent);
    }

    public void resetDataForLanguage() {
        this.mLastOperationsEvent = null;
        this.loanScheduleEvent = null;
        this.loanHistoryEvent = null;
        this.accountStatementEvent = null;
        this.allOperationsEvent = null;
        this.unAuthorizedAllOperationsEvent = null;
        this.smsNotifListEvent = null;
    }

    public void resetOperations() {
        this.allOperationsEvent = null;
        this.unAuthorizedAllOperationsEvent = null;
    }

    public void setBankApiManager(BankApiManager bankApiManager, C41438c cVar) {
        this.mBankApiManager = bankApiManager;
        this.mEventBus = cVar;
    }

    public void setCcyHistoryWrapper(CcyHistoryWrapper ccyHistoryWrapper) {
        this.mCcyHistoryWrapper = ccyHistoryWrapper;
    }

    public void setDeleteTransferTemplateEvent(TransferDeleteTemplateEvent transferDeleteTemplateEvent2) {
        this.transferDeleteTemplateEvent = transferDeleteTemplateEvent2;
    }

    public void setLoginInfo(C37228a aVar) {
        this.loginInfo = aVar;
    }

    public void setModifyTemplateGroupLinkEvent(ModifyTemplateGroupLinkEvent modifyTemplateGroupLinkEvent2) {
        this.modifyTemplateGroupLinkEvent = modifyTemplateGroupLinkEvent2;
    }

    public void setModifyTransferTemplateEvent(ModifyTransferTemplateEvent modifyTransferTemplateEvent2) {
        this.modifyTransferTemplateEvent = modifyTransferTemplateEvent2;
    }

    public void setNullToEvents() {
        ProductProperties.cardsAndDetailsUIModel = null;
        this.registrationAnalyticEvent = null;
        this.transferDeleteTemplateEvent = null;
        this.mTemplatesAndConfigEvent = null;
        this.mLastOperationsEvent = null;
        this.loansEvent = null;
        this.loanScheduleEvent = null;
        this.loanHistoryEvent = null;
        this.depositBondsEvent = null;
        this.creditCardsEvent = null;
        this.pensionsEvent = null;
        this.bondsEvent = null;
        this.offerLimitDecisionEvent = null;
        this.accountStatementEvent = null;
        this.transfersTemplateEvent = null;
        this.allOperationsEvent = null;
        this.unAuthorizedAllOperationsEvent = null;
        this.selectedPaymentsEvent = null;
        this.mPaymentDebtEvent = null;
        this.mLastDeleteTemplateEvent = null;
        this.mLastModifyTemplateEvent = null;
        this.modifyTemplateGroupLinkEvent = null;
        this.mLastDeleteTemplateGroupEvent = null;
        this.notificationCountEvent = null;
        this.paymentCardsEvent = null;
        this.accountLovEvent = null;
        this.modifyTransferTemplateEvent = null;
        this.bonusProvidersEvent = null;
        this.utilityPaymentDetailsEvent = null;
        this.outTransferDetailsEvent = null;
        this.inTransferDetailsEvent = null;
        this.paymentDetailsEvent = null;
        this.ddstoListEvent = null;
        this.stoTypeListEvent = null;
        this.stoPeriodTypesEvent = null;
        this.ddPeriodTypesEvent = null;
        this.ddProvidersListEvent = null;
        this.ddAccountsEvent = null;
        this.smsNotifListEvent = null;
        this.transferBeneficiaryEvent = null;
        this.depLoanAgreementsEvent = null;
        this.featureFeedback = null;
        this.countriesEvent = null;
        this.reportingCodesEvent = null;
        this.countryCodeBySwiftEvents = new HashMap();
    }

    public void setSelectedEvent(SelectedPaymentsEvent selectedPaymentsEvent2) {
        this.selectedPaymentsEvent = selectedPaymentsEvent2;
    }

    public void setTerminateDDSTOEvent(TerminateDDSTOEvent terminateDDSTOEvent2) {
        this.terminateDDSTOEvent = terminateDDSTOEvent2;
    }

    public void setUnAuthorizedOperationsEvent(UnAuthorizedAllOperationsEvent unAuthorizedAllOperationsEvent2) {
        this.unAuthorizedAllOperationsEvent = unAuthorizedAllOperationsEvent2;
        this.mEventBus.mo96184m(unAuthorizedAllOperationsEvent2);
    }

    public void setUserInfo(ClientInfoWrapper clientInfoWrapper) {
        this.mUserInfo = clientInfoWrapper;
        setMedalliaParameters(clientInfoWrapper);
    }

    public void setUserRestrictions(UserRestrictions userRestrictions2) {
        this.userRestrictions = userRestrictions2;
    }

    public boolean shouldNotRefresh(RootEvent rootEvent) {
        return rootEvent != null && (rootEvent.getState() == 10 || rootEvent.getState() == 20);
    }

    public void templateByTypeResponse(BankApiResponse<ArrayList<TemplateBasketItem>> bankApiResponse) {
        this.transfersTemplateEvent = new TransferTemplatesEvent();
        if (bankApiResponse.isNetworkFailure()) {
            this.transfersTemplateEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.transfersTemplateEvent.setState(20);
            this.transfersTemplateEvent.setTemplates(bankApiResponse.getResult());
        } else {
            this.transfersTemplateEvent.setState(40);
            this.transfersTemplateEvent.setErrorKey(bankApiResponse.getKey());
        }
        this.mEventBus.mo96184m(this.transfersTemplateEvent);
    }

    public void templatesBasketResponse(BankApiResponse<TemplateBasketItemsWithPaymentConfig> bankApiResponse) {
        this.mTemplatesAndConfigEvent = new TemplatesAndConfigEvent();
        if (bankApiResponse.isNetworkFailure()) {
            bankApiResponse.getNetworkFailure();
            this.mTemplatesAndConfigEvent.setState(30);
        } else if (bankApiResponse.isSuccess()) {
            this.mTemplatesAndConfigEvent.setState(20);
            this.mTemplatesAndConfigEvent.setTemplatesWithPaymentConfig(bankApiResponse.getResult());
            if (!(bankApiResponse.getResult().getConfig() == null || bankApiResponse.getResult().getTemplates() == null)) {
                Iterator<TemplateBasketItem> it = bankApiResponse.getResult().getTemplates().iterator();
                while (it.hasNext()) {
                    TemplateBasketItem next = it.next();
                    if (next.getServiceId() != null && bankApiResponse.getResult().getConfig().containsKey(next.getServiceId())) {
                        if (bankApiResponse.getResult().getConfig().get(next.getServiceId()).getDebtServiceId() != null) {
                            next.setCanGetDebt(true);
                            TemplateDebtEvent templateDebtEvent = new TemplateDebtEvent();
                            templateDebtEvent.setState(10);
                            templateDebtEvent.setPaymentDebt(new PaymentDebtResponse());
                            next.setTemplateDebtEvent(templateDebtEvent);
                            next.setDebtAmount(0);
                        } else {
                            next.setCanGetDebt(false);
                        }
                        try {
                            C32315k0.m95251F(bankApiResponse.getResult().getConfig().get(next.getServiceId()), next);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (!(bankApiResponse.getResult().getConfig() == null || bankApiResponse.getResult().getTemplateGroups() == null || this.mTemplatesAndConfigEvent.getTemplatesWithPaymentConfig() == null)) {
                Iterator<TemplateGroup> it2 = bankApiResponse.getResult().getTemplateGroups().iterator();
                while (it2.hasNext()) {
                    TemplateGroup next2 = it2.next();
                    if (next2.getGroupType() != null && next2.getGroupType().equals("C")) {
                        CTParkPenaltiesEvent cTParkPenaltiesEvent = new CTParkPenaltiesEvent();
                        cTParkPenaltiesEvent.setCTParkPenalties(new ArrayList());
                        cTParkPenaltiesEvent.setState(10);
                        next2.setCtParkPenaltiesEvent(cTParkPenaltiesEvent);
                        CTPark6MonthsEvent cTPark6MonthsEvent = new CTPark6MonthsEvent();
                        cTPark6MonthsEvent.setCTPark6Months(new ArrayList());
                        cTPark6MonthsEvent.setState(10);
                        next2.setCtPark6MonthsEvent(cTPark6MonthsEvent);
                    }
                }
            }
        } else {
            this.mTemplatesAndConfigEvent.setState(40);
            this.mTemplatesAndConfigEvent.setErrorKey(bankApiResponse.getKey());
        }
        ModifyTemplateEvent modifyTemplateEvent = this.mLastModifyTemplateEvent;
        if (modifyTemplateEvent != null && modifyTemplateEvent.getState() == 10) {
            ModifyTemplateEvent modifyTemplateEvent2 = this.mLastModifyTemplateEvent;
            ModifyTemplateEvent modifyTemplateEvent3 = new ModifyTemplateEvent();
            this.mLastModifyTemplateEvent = modifyTemplateEvent3;
            modifyTemplateEvent3.setState(this.mTemplatesAndConfigEvent.getState());
            this.mLastModifyTemplateEvent.setErrorKey(this.mTemplatesAndConfigEvent.getErrorKey());
            this.mLastModifyTemplateEvent.setTemplate(getTemplateItemById(modifyTemplateEvent2.getTemplate().getId()));
            this.mEventBus.mo96184m(this.mLastModifyTemplateEvent);
        }
        this.mEventBus.mo96184m(this.mTemplatesAndConfigEvent);
        requestTemplateDebts(true);
        requestCarDebts(true);
    }

    public void terminateBill(long j, String str) {
        refreshDDSTOListEvent();
        this.ddstoListEvent.setState(10);
        TerminateDDSTOEvent terminateDDSTOEvent2 = new TerminateDDSTOEvent();
        this.terminateDDSTOEvent = terminateDDSTOEvent2;
        terminateDDSTOEvent2.setState(10);
        TerminateDDSTOEvent terminateDDSTOEvent3 = this.terminateDDSTOEvent;
        terminateDDSTOEvent3.itemId = j;
        this.mEventBus.mo96184m(terminateDDSTOEvent3);
        this.mEventBus.mo96184m(this.ddstoListEvent);
        this.mBankApiManager.terminateBill(j, str);
    }

    public void terminatePayment(long j, String str) {
        refreshDDSTOListEvent();
        this.ddstoListEvent.setState(10);
        TerminateDDSTOEvent terminateDDSTOEvent2 = new TerminateDDSTOEvent();
        this.terminateDDSTOEvent = terminateDDSTOEvent2;
        terminateDDSTOEvent2.setState(10);
        TerminateDDSTOEvent terminateDDSTOEvent3 = this.terminateDDSTOEvent;
        terminateDDSTOEvent3.itemId = j;
        this.mEventBus.mo96184m(terminateDDSTOEvent3);
        this.mEventBus.mo96184m(this.ddstoListEvent);
        this.mBankApiManager.terminatePayment(j, str);
    }

    public void terminateSTO(long j, String str) {
        refreshDDSTOListEvent();
        this.ddstoListEvent.setState(10);
        TerminateDDSTOEvent terminateDDSTOEvent2 = new TerminateDDSTOEvent();
        this.terminateDDSTOEvent = terminateDDSTOEvent2;
        terminateDDSTOEvent2.setState(10);
        TerminateDDSTOEvent terminateDDSTOEvent3 = this.terminateDDSTOEvent;
        terminateDDSTOEvent3.itemId = j;
        this.mEventBus.mo96184m(terminateDDSTOEvent3);
        this.mEventBus.mo96184m(this.ddstoListEvent);
        this.mBankApiManager.terminateSTO(j, str);
    }

    public void updateClientProducts() {
        updateClientProducts(true);
    }

    public void updateProductTypes(List<ProductType> list) {
        this.productTypes = list;
    }

    public void uploadProductImage(int i, long j, long j2, File file, String str) {
        int i2 = i;
        if (i2 == 2) {
            this.creditCardsEvent.setState(10);
            refreshCreditCardsEvent();
            this.mEventBus.mo96184m(this.creditCardsEvent);
        } else if (i2 == 3) {
            this.loansEvent.setState(10);
            refreshLoansEvent();
            this.mEventBus.mo96184m(this.loansEvent);
        } else if (i2 == 4) {
            this.depositBondsEvent.setState(10);
            refreshDepositsEvent();
            this.mEventBus.mo96184m(this.depositBondsEvent);
        }
        final int i3 = i;
        final long j3 = j;
        final long j4 = j2;
        final File file2 = file;
        final String str2 = str;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Client.this.mBankApiManager.uploadProductImage(i3, j3, j4, file2, str2);
            }
        }, 500);
    }

    public void userLoggedIn() {
        ClientEntryPoint clientEntryPoint = (ClientEntryPoint) C16919b.m59518a(this.appContext, ClientEntryPoint.class);
        this.getTransactionCategoriesUseCase = clientEntryPoint.getTransactionCategoriesUseCase();
        this.cardsAndDetailsUseCase = clientEntryPoint.cardsAndDetailsUseCase();
        this.getAccountsAndDetailsUseCase = clientEntryPoint.getAccountsAndDetailsUseCase();
        this.getProductTypeListUseCase = clientEntryPoint.getProductTypeListUseCase();
        this.refreshProductTypeListUseCase = clientEntryPoint.refreshProductTypeListUseCase();
        this.refreshAssetLiabilityUseCase = clientEntryPoint.refreshAssetLiabilityUseCase();
        this.refreshClientInfoPermission = clientEntryPoint.refreshClientInfoPermission();
        this.smsToPushManager = clientEntryPoint.smsToPushManager();
        this.loyaltyListRepository = clientEntryPoint.getLoyaltyListRepository();
        this.getLegacyDepositsAndBondsWithDetails = clientEntryPoint.getLegacyDepositsAndBondsWithDetails();
        this.getLegacyLoanWithDetails = clientEntryPoint.getLegacyLoanWithDetails();
        this.getLegacyCreditCardsAndDetails = clientEntryPoint.getLegacyCreditCardsAndDetails();
        this.getLegacyPensionAmount = clientEntryPoint.getLegacyPensionAmount();
        this.getDepositsAndBonds = clientEntryPoint.getDepositsAndBondsUseCase();
        this.getClientMail = clientEntryPoint.getClientFinancialMail();
        this.getClientPhone = clientEntryPoint.getClientFinancialPhone();
        this.compositeDisposable.mo95660b(clientEntryPoint.transactionPropertyUpdateEventPoster().mo48496c(new C33210b0(this)));
        getSmsToPushNotifications();
    }

    public void getAgreementTemplate(String str, String str2) {
        this.mBankApiManager.getAgreementTextTemplate(str, str2);
    }

    public void requestAccountLovs(boolean z, boolean z2) {
        if (!isAuthorized()) {
            return;
        }
        if (z || !shouldNotRefresh(this.accountLovEvent) || (this.accountLovEvent.getState() == 20 && z2 && this.accountLovEvent.getAccountDebitLoveWrapper() == null)) {
            AccountLovEvent accountLovEvent2 = new AccountLovEvent();
            this.accountLovEvent = accountLovEvent2;
            accountLovEvent2.setState(10);
            this.mEventBus.mo96184m(this.accountLovEvent);
            this.mBankApiManager.getAccountsLov(z2);
            return;
        }
        this.mEventBus.mo96184m(this.accountLovEvent);
    }

    public void requestInTransferDetails(boolean z, long j, String str, String str2, Long l, Long l2, Long l3) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (z || !shouldNotRefresh(this.inTransferDetailsEvent) || this.inTransferDetailsEvent.getDocKey() != j2 || !C32359z0.m95598z(str, this.inTransferDetailsEvent.getEssServiceId()) || !str2.equals(this.inTransferDetailsEvent.getPrintFormType())) {
            InTransferDetailsEvent inTransferDetailsEvent2 = new InTransferDetailsEvent();
            this.inTransferDetailsEvent = inTransferDetailsEvent2;
            inTransferDetailsEvent2.setState(10);
            this.inTransferDetailsEvent.setDocKey(j);
            this.inTransferDetailsEvent.setEssServiceId(str);
            this.inTransferDetailsEvent.setPrintFormType(str2);
            this.mEventBus.mo96184m(this.inTransferDetailsEvent);
            this.mBankApiManager.getInTransferDetails(j, str, str2, l, l2, l3);
            return;
        }
        this.mEventBus.mo96184m(this.inTransferDetailsEvent);
    }

    @SuppressLint({"CheckResult"})
    public void updateClientProducts(boolean z) {
        C19799c cVar = this.getProductTypeListUseCase;
        if (cVar != null) {
            this.compositeDisposable.mo95660b(cVar.mo48088d(z).mo94996P().mo95063B(C40992a.m118827a()).mo95070I(new C33195a(this, z), new C33244l(this, z)));
        }
        this.compositeDisposable.mo95660b(this.cardsAndDetailsUseCase.mo65886c(z).mo95027o0(C40992a.m118827a()).mo94983G0(new C33280w(), new C33237h0()));
        if (z) {
            this.refreshAssetLiabilityUseCase.mo48091a();
        }
        if (z) {
            this.refreshClientInfoPermission.mo70153a();
        }
        resetOperations();
        requestBonuses();
    }

    public void requestLastOperations(boolean z, Long l, String str) {
        if (str != null) {
            if (z || !shouldNotRefresh(this.operationHistoryEvent) || !C32359z0.m95598z(str, this.operationHistoryEvent.getEssId())) {
                OperationHistoryEvent operationHistoryEvent2 = new OperationHistoryEvent();
                this.operationHistoryEvent = operationHistoryEvent2;
                operationHistoryEvent2.setState(10);
                this.operationHistoryEvent.setEssId(str);
                this.mEventBus.mo96184m(this.operationHistoryEvent);
                this.mBankApiManager.getPaymentsLastOperations(str, (Long) null, 0, 1);
                return;
            }
            this.mEventBus.mo96184m(this.operationHistoryEvent);
        } else if (z || !shouldNotRefresh(this.mLastOperationsEvent) || this.mLastOperationsEvent.isLoggedIn() != isAuthorized()) {
            LastOperationsEvent lastOperationsEvent = new LastOperationsEvent();
            this.mLastOperationsEvent = lastOperationsEvent;
            lastOperationsEvent.setLoggedIn(isAuthorized());
            this.mLastOperationsEvent.setState(10);
            this.mEventBus.mo96184m(this.mLastOperationsEvent);
            this.mBankApiManager.getPaymentsLastOperations((String) null, l, 0, 50);
        } else {
            this.mEventBus.mo96184m(this.mLastOperationsEvent);
        }
    }

    public void lastOperationsResponse(Long l, BankApiResponse<List<LastOperation>> bankApiResponse) {
        if (this.mLastOperationsEvent != null && isAuthorized() == this.mLastOperationsEvent.isLoggedIn()) {
            LastOperationsEvent lastOperationsEvent = new LastOperationsEvent();
            this.mLastOperationsEvent = lastOperationsEvent;
            lastOperationsEvent.setLoggedIn(isAuthorized());
            if (bankApiResponse.isNetworkFailure()) {
                this.mLastOperationsEvent.setState(30);
                this.mEventBus.mo96184m(this.mLastOperationsEvent);
            } else if (bankApiResponse.isSuccess()) {
                this.mLastOperationsEvent.setState(20);
                this.mLastOperationsEvent.setLastOperations(bankApiResponse.getResult());
                if (isAuthorized()) {
                    this.compositeDisposable.mo95660b(this.getTransactionCategoriesUseCase.mo48784a().mo95063B(C40992a.m118827a()).mo95070I(new C33230f(this, bankApiResponse), new C33234g(this)));
                } else {
                    this.mEventBus.mo96184m(this.mLastOperationsEvent);
                }
            } else {
                this.mLastOperationsEvent.setState(40);
                this.mLastOperationsEvent.setErrorKey(bankApiResponse.getKey());
                this.mEventBus.mo96184m(this.mLastOperationsEvent);
            }
        }
    }
}
