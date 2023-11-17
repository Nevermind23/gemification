package p341ge.bog.mobilebank.rest.manager;

import android.os.Handler;
import com.google.gson.C5490d;
import com.google.gson.Gson;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32306g0;
import g91.C32315k0;
import hd0.C24978b;
import iu0.C36546y;
import java.io.File;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import jg1.C41438c;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ContractEntity;
import p341ge.bog.mobilebank.eventbus.NetworkListener;
import p341ge.bog.mobilebank.eventbus.event.CcyHistoryWrapperSuccessEvent;
import p341ge.bog.mobilebank.eventbus.event.CcyRatesSuccessEvent;
import p341ge.bog.mobilebank.eventbus.event.ErrorEvent;
import p341ge.bog.mobilebank.eventbus.events.BonusPrizeHistoryEvent;
import p341ge.bog.mobilebank.eventbus.events.BonusPrizeOrderEvent;
import p341ge.bog.mobilebank.eventbus.events.BonusProgramRegisterEvent;
import p341ge.bog.mobilebank.eventbus.events.GetMerchantsByNameEvent;
import p341ge.bog.mobilebank.eventbus.events.MapObjectsEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyDDEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentBatchExecuteEvent;
import p341ge.bog.mobilebank.eventbus.events.PlusReferralRegistrationEvent;
import p341ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;
import p341ge.bog.mobilebank.eventbus.events.ScoolCardStatementEvent;
import p341ge.bog.mobilebank.eventbus.events.SearchDataEvent;
import p341ge.bog.mobilebank.eventbus.events.SelectedPaymentsEvent;
import p341ge.bog.mobilebank.eventbus.events.UsernameChangeEvent;
import p341ge.bog.mobilebank.model.Beneficiary;
import p341ge.bog.mobilebank.model.BogCountry;
import p341ge.bog.mobilebank.model.BondsWrapper;
import p341ge.bog.mobilebank.model.CashBackStatementWrapper;
import p341ge.bog.mobilebank.model.CcyHistoryWrapper;
import p341ge.bog.mobilebank.model.CcyRatesWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DepLoanAgreement;
import p341ge.bog.mobilebank.model.FeatureFeedback;
import p341ge.bog.mobilebank.model.InTransferDetail;
import p341ge.bog.mobilebank.model.Merchant;
import p341ge.bog.mobilebank.model.PaymentVoucher;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.TransferTemplateObject;
import p341ge.bog.mobilebank.model.account.AccountDebitLoveWrapper;
import p341ge.bog.mobilebank.model.account.AccountLovContainer;
import p341ge.bog.mobilebank.model.account.OperationResponse;
import p341ge.bog.mobilebank.model.bonus.BonusPrizeList;
import p341ge.bog.mobilebank.model.bonus.BonusStatementDetailsWrapper;
import p341ge.bog.mobilebank.model.bonus.BonusType;
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
import p341ge.bog.mobilebank.model.map.MapObjectWrapper;
import p341ge.bog.mobilebank.model.map.MapRegion;
import p341ge.bog.mobilebank.model.notification.NotificationCount;
import p341ge.bog.mobilebank.model.notification.NotificationList;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationsRequest;
import p341ge.bog.mobilebank.model.payment.BonusProvider;
import p341ge.bog.mobilebank.model.payment.LastOperation;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentDetail;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentResult;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.payment.SelectedPayment;
import p341ge.bog.mobilebank.model.search.SearchDataWrapper;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.model.statement.AccountReportId;
import p341ge.bog.mobilebank.model.statement.AccountStatementWrapper;
import p341ge.bog.mobilebank.model.statement.CasStatementWrapper;
import p341ge.bog.mobilebank.model.template.CarCTParkResponse;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.rest.manager.BankApiManager */
public class BankApiManager extends RootBankApiManager {
    /* access modifiers changed from: private */
    public HashMap<String, PointValueExchangeEvent> amountToPoints = new HashMap<>();
    /* access modifiers changed from: private */
    public Gson gsonExposed = new C5490d().mo18204c().mo18203b();
    /* access modifiers changed from: private */
    public NetworkListener mNetworkListener;
    private String serviceProviderId;

    public BankApiManager(C41438c cVar, BankApi bankApi, Client client) {
        super(cVar, bankApi, client);
        Client client2 = this.mClient;
        this.mNetworkListener = client2;
        client2.setBankApiManager(this, this.mEventBus);
    }

    public void changeClientProductDefault(String str, String str2, boolean z, boolean z2) {
        this.mBankApi.changeClientProductDefault(str, str2, z ? "Y" : "N", new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.getAccountsLov(false);
            }
        });
    }

    public void changeDeviceLanguage() {
        this.mBankApi.changeDeviceLanguage(new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                BankApiManager.this.mNetworkListener.onChangeDeviceLanguage(false);
                super.onFailure(th);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onChangeDeviceLanguage(true);
                super.onResponse(bankApiResponse);
            }
        });
    }

    public void createOrUpdateDDPayment(HashMap<String, Object> hashMap, final Object obj) {
        this.mBankApi.useOtpForAction(hashMap, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                ModifyDDEvent modifyDDEvent = new ModifyDDEvent();
                modifyDDEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(modifyDDEvent);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                ModifyDDEvent modifyDDEvent = new ModifyDDEvent();
                modifyDDEvent.setInstance(obj);
                if (bankApiResponse.isSuccess()) {
                    C32306g0.m95220a("dd_created");
                    modifyDDEvent.setState(20);
                } else {
                    modifyDDEvent.setState(40);
                    modifyDDEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(modifyDDEvent);
            }
        });
    }

    public void deleteSavedCard(final long j) {
        this.mBankApi.deleteSavedCard(String.valueOf(j), new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onDeleteSavedCard(j, bankApiResponse);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onDeleteSavedCard(j, bankApiResponse);
            }
        });
    }

    public void deleteTemplate(final long j) {
        this.mBankApi.deleteTemplate(j, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.deleteTemplateResponse(bankApiResponse, j);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.deleteTemplateResponse(bankApiResponse, j);
            }
        });
    }

    public void deleteTemplateGroup(String str, final TemplateGroup templateGroup) {
        this.mBankApi.deleteTemplateGroup(str, templateGroup, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.deleteTemplateGroupResponse(bankApiResponse, templateGroup.getId());
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.deleteTemplateGroupResponse(bankApiResponse, templateGroup.getId());
            }
        });
    }

    public void deleteTransferTemplate(final long j) {
        this.mBankApi.deleteTemplate(j, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.deleteTransferTemplateResponse(bankApiResponse, j);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.deleteTransferTemplateResponse(bankApiResponse, j);
            }
        });
    }

    public void getAccountLovDebits() {
        this.mBankApi.getAccountLovDebits(new RestCallback<BankApiResponse<AccountDebitLoveWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mClient.onAccountLovDebits(bankApiResponse);
            }

            public void onResponse(BankApiResponse<AccountDebitLoveWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mClient.onAccountLovDebits(bankApiResponse);
            }
        });
    }

    public void getAccountReportId(int i, long j, Long l, Long l2, boolean z) {
        BankApiManager bankApiManager;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        int i2 = i;
        if (i2 == 1 || i2 == 2) {
            l6 = Long.valueOf(j);
            bankApiManager = this;
            l5 = l6;
            l4 = null;
        } else {
            if (i2 == 3) {
                bankApiManager = this;
                l3 = Long.valueOf(j);
                l5 = null;
                l4 = null;
            } else if (i2 != 4) {
                bankApiManager = this;
                l5 = null;
                l4 = null;
            } else if (z) {
                l6 = Long.valueOf(j);
                bankApiManager = this;
                l5 = l6;
                l4 = null;
            } else {
                bankApiManager = this;
                l4 = Long.valueOf(j);
                l5 = null;
                l3 = null;
            }
            final int i3 = i;
            final long j2 = j;
            final boolean z2 = z;
            bankApiManager.mBankApi.getAccountReportId(l5, l4, l3, l, l2, new RestCallback<BankApiResponse<AccountReportId>>() {
                public void onFailure(Throwable th) {
                    super.onFailure(th);
                    BankApiResponse bankApiResponse = new BankApiResponse();
                    bankApiResponse.setNetworkFailure(true);
                    bankApiResponse.setNetworkFailure(th);
                    BankApiManager.this.mNetworkListener.accountReportIDResponse(i3, j2, z2, bankApiResponse);
                }

                public void onResponse(BankApiResponse<AccountReportId> bankApiResponse) {
                    super.onResponse(bankApiResponse);
                    BankApiManager.this.mNetworkListener.accountReportIDResponse(i3, j2, z2, bankApiResponse);
                }
            });
        }
        l3 = l4;
        final int i32 = i;
        final long j22 = j;
        final boolean z22 = z;
        bankApiManager.mBankApi.getAccountReportId(l5, l4, l3, l, l2, new RestCallback<BankApiResponse<AccountReportId>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.accountReportIDResponse(i32, j22, z22, bankApiResponse);
            }

            public void onResponse(BankApiResponse<AccountReportId> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.accountReportIDResponse(i32, j22, z22, bankApiResponse);
            }
        });
    }

    public void getAccountStatement(final AccountReportId accountReportId, String str, int i, int i2, boolean z) {
        this.mBankApi.getAccountStatement(accountReportId.getAcctKey(), accountReportId.getReportId(), str, i, i2, new RestCallback<BankApiResponse<AccountStatementWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.accountStatementResponse(accountReportId, bankApiResponse);
            }

            public void onResponse(BankApiResponse<AccountStatementWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.accountStatementResponse(accountReportId, bankApiResponse);
            }
        });
    }

    public void getAccountsLov(final boolean z) {
        this.mBankApi.getAccountsLov(new RestCallback<BankApiResponse<AccountLovContainer>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mClient.onAccountsLovResponse(bankApiResponse, z);
            }

            public void onResponse(BankApiResponse<AccountLovContainer> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mClient.onAccountsLovResponse(bankApiResponse, z);
            }
        });
    }

    public void getAgreementTextTemplate(String str, final String str2) {
        this.mBankApi.getAgreementTextTemplate(str, new RestCallback<BankApiResponse<ContractEntity>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onAgreementTextTemplate(bankApiResponse, str2);
            }

            public void onResponse(BankApiResponse<ContractEntity> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onAgreementTextTemplate(bankApiResponse, str2);
            }
        });
    }

    public BankApi getBankApi() {
        return this.mBankApi;
    }

    public void getBonds() {
        this.mBankApi.getBonds(new RestCallback<BankApiResponse<BondsWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mClient.onBondsLoaded(bankApiResponse);
            }

            public void onResponse(BankApiResponse<BondsWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mClient.onBondsLoaded(bankApiResponse);
            }
        });
    }

    public void getBonusPrizeHistory(BonusType bonusType) {
        this.mBankApi.getBonusPrizeHistory(bonusType, new RestCallback<BankApiResponse<BonusPrizeList>>() {
            public void onFailure(Throwable th) {
                BonusPrizeHistoryEvent bonusPrizeHistoryEvent = new BonusPrizeHistoryEvent();
                bonusPrizeHistoryEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(bonusPrizeHistoryEvent);
            }

            public void onResponse(BankApiResponse<BonusPrizeList> bankApiResponse) {
                BonusPrizeHistoryEvent bonusPrizeHistoryEvent = new BonusPrizeHistoryEvent();
                if (bankApiResponse.isSuccess()) {
                    bonusPrizeHistoryEvent.setState(20);
                    bonusPrizeHistoryEvent.setBonusPrizeList(bankApiResponse.getResult());
                } else {
                    bonusPrizeHistoryEvent.setState(40);
                    bonusPrizeHistoryEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(bonusPrizeHistoryEvent);
            }
        });
    }

    public void getBonusStatementByType(int i, int i2, final String str, Long l, Long l2, int i3) {
        this.mBankApi.getBonusStatementByType(i, i2, str, l, l2, i3, new RestCallback<BankApiResponse<BonusStatementDetailsWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.bonusStatementResponse(str, bankApiResponse);
            }

            public void onResponse(BankApiResponse<BonusStatementDetailsWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.bonusStatementResponse(str, bankApiResponse);
            }
        });
    }

    public void getCarPaymentDebt(String str, String str2, String str3, String str4, String str5, final PaymentProviderConfiguration paymentProviderConfiguration, final long j) {
        if (str == null) {
            this.mBankApi.getPaymentDebt(str3, str4, str5, new RestCallback<BankApiResponse<PaymentDebtResponse>>() {
                public void onFailure(Throwable th) {
                    super.onFailure(th);
                    BankApiResponse bankApiResponse = new BankApiResponse();
                    bankApiResponse.setNetworkFailure(true);
                    bankApiResponse.setNetworkFailure(th);
                    BankApiManager.this.mNetworkListener.ctPark6MonthsResponse(bankApiResponse, j, paymentProviderConfiguration);
                }

                public void onResponse(BankApiResponse<PaymentDebtResponse> bankApiResponse) {
                    super.onResponse(bankApiResponse);
                    BankApiManager.this.mNetworkListener.ctPark6MonthsResponse(bankApiResponse, j, paymentProviderConfiguration);
                }
            });
            return;
        }
        this.mBankApi.getCTParkPaymentDebt(str, str2, str3, str4, str5, new RestCallback<BankApiResponse<CarCTParkResponse>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.ctParkPenaltiesResponse(bankApiResponse, j, paymentProviderConfiguration);
            }

            public void onResponse(BankApiResponse<CarCTParkResponse> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.ctParkPenaltiesResponse(bankApiResponse, j, paymentProviderConfiguration);
            }
        });
    }

    public void getCasStatement(final long j, Long l, Long l2, int i, int i2) {
        this.mBankApi.getCasStatement(j, l, l2, i, i2, new RestCallback<BankApiResponse<CasStatementWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.casStatementResponse(j, bankApiResponse);
            }

            public void onResponse(BankApiResponse<CasStatementWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.casStatementResponse(j, bankApiResponse);
            }
        });
    }

    public void getCashbackStatement(Long l, Long l2, int i, int i2, int i3) {
        this.mBankApi.getCashbackStatement(l, l2, i, i2, i3, new RestCallback<BankApiResponse<CashBackStatementWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onCashbackStatement(bankApiResponse);
            }

            public void onResponse(BankApiResponse<CashBackStatementWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onCashbackStatement(bankApiResponse);
            }
        });
    }

    public void getCcyRates(final boolean z) {
        this.mBankApi.getCcyRates(new RestCallback<BankApiResponse<CcyRatesWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                if (!z) {
                    BankApiManager.this.mEventBus.mo96184m(new RatesErrorEvent(""));
                }
            }

            public void onResponse(BankApiResponse<CcyRatesWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                if (bankApiResponse.isSuccess()) {
                    BankApiManager.this.mEventBus.mo96184m(new CcyRatesSuccessEvent(bankApiResponse.getResult()));
                } else if (!z) {
                    BankApiManager.this.mEventBus.mo96184m(new RatesErrorEvent(C27950a.m86284a(bankApiResponse.getKey())));
                }
            }
        });
    }

    public void getCountries() {
        this.mBankApi.foreignTransferGetCountries(new RestCallback<BankApiResponse<List<BogCountry>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onCountries(bankApiResponse);
            }

            public void onResponse(BankApiResponse<List<BogCountry>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onCountries(bankApiResponse);
            }
        });
    }

    public void getCountryCodeBySwift(final String str, final String str2) {
        this.mBankApi.getForeignBankList(str, 0, 1, new RestCallback<BankApiResponse<ForeignBankList>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onCountryCodeBySwift(str, str2, bankApiResponse);
            }

            public void onResponse(BankApiResponse<ForeignBankList> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onCountryCodeBySwift(str, str2, bankApiResponse);
            }
        });
    }

    public void getDDAccounts() {
        this.mBankApi.getDDAccounts(new RestCallback<BankApiResponse<ArrayList<DDPaymentAccount>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onDDAccounts(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<DDPaymentAccount>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onDDAccounts(bankApiResponse);
            }
        });
    }

    public void getDDPeriodTypes() {
        this.mBankApi.getDDPeriodTypes(new RestCallback<BankApiResponse<ArrayList<STOPeriodType>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onDDPeriodTypes(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<STOPeriodType>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onDDPeriodTypes(bankApiResponse);
            }
        });
    }

    public void getDDProviders() {
        this.mBankApi.getDDProviders(new RestCallback<BankApiResponse<ArrayList<DDProviderItem>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onDDProviders(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<DDProviderItem>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onDDProviders(bankApiResponse);
            }
        });
    }

    public void getDDSTOList() {
        this.mBankApi.getDDSTOList(new RestCallback<BankApiResponse<ArrayList<DDSTO>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onDDSTOList(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<DDSTO>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onDDSTOList(bankApiResponse);
            }
        });
    }

    public void getDepLoanAgreements() {
        this.mBankApi.getDepLoanAgreements(new RestCallback<BankApiResponse<List<DepLoanAgreement>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onDepLoanAgreementsResponse(bankApiResponse);
            }

            public void onResponse(BankApiResponse<List<DepLoanAgreement>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onDepLoanAgreementsResponse(bankApiResponse);
            }
        });
    }

    public void getExpressProviders(final String str, final String str2) {
        this.mBankApi.getExpressProviders(str, str2, new RestCallback<BankApiResponse<ArrayList<BonusProvider>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onExpressProviders(str, str2, bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<BonusProvider>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onExpressProviders(str, str2, bankApiResponse);
            }
        });
    }

    public void getFeatureFeedback() {
        this.mBankApi.getFeatureFeedback(new RestCallback<BankApiResponse<List<FeatureFeedback>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onFeatureFeedback(bankApiResponse);
            }

            public void onResponse(BankApiResponse<List<FeatureFeedback>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onFeatureFeedback(bankApiResponse);
            }
        });
    }

    public void getInTransferDetails(long j, String str, String str2, Long l, Long l2, Long l3) {
        final long j2 = j;
        final String str3 = str;
        final String str4 = str2;
        this.mBankApi.getInTransferDetails(j, str, str2, l, l2, l3, new RestCallback<BankApiResponse<List<InTransferDetail>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onInTransferDetails(j2, str3, str4, bankApiResponse);
            }

            public void onResponse(BankApiResponse<List<InTransferDetail>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onInTransferDetails(j2, str3, str4, bankApiResponse);
            }
        });
    }

    public void getLoansHistory(long j, final boolean z) {
        this.mBankApi.getLoanHistory(j, z, new RestCallback<BankApiResponse<LoanHistoryWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onLoanHistoryResponse(bankApiResponse, z);
            }

            public void onResponse(BankApiResponse<LoanHistoryWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onLoanHistoryResponse(bankApiResponse, z);
            }
        });
    }

    public void getLoansSchedule(final long j) {
        this.mBankApi.getLoanSchedules(j, new RestCallback<BankApiResponse<LoanScheduleWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onLoanScheduleResponse(j, bankApiResponse);
            }

            public void onResponse(BankApiResponse<LoanScheduleWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onLoanScheduleResponse(j, bankApiResponse);
            }
        });
    }

    public void getMapObjectDetails(final MapObject mapObject) {
        this.mBankApi.getMapObjectDetails(mapObject.getObjectName(), mapObject.getObjectKey(), new RestCallback<BankApiResponse<ArrayList<MapObjectDetail>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.mapObjectDetailsResponse(mapObject, bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<MapObjectDetail>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.mapObjectDetailsResponse(mapObject, bankApiResponse);
            }
        });
    }

    public void getMapObjectStatus(final MapObject mapObject) {
        this.mBankApi.getMapObjectStatus(mapObject.getObjectName(), mapObject.getObjectKey(), mapObject.getObjectType(), new RestCallback<BankApiResponse<String>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.mapObjectStatusResponse(mapObject, bankApiResponse);
            }

            public void onResponse(BankApiResponse<String> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.mapObjectStatusResponse(mapObject, bankApiResponse);
            }
        });
    }

    public void getMapObjects(final boolean z) {
        this.mBankApi.getMapObjects(new RestCallback<BankApiResponse<List<MapObject>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.mapObjectsResponse(bankApiResponse);
            }

            public void onResponse(BankApiResponse<List<MapObject>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                if (bankApiResponse == null) {
                    return;
                }
                if (!z) {
                    BankApiManager.this.mNetworkListener.mapObjectsResponse(bankApiResponse);
                } else if (bankApiResponse.isSuccess()) {
                    MapObjectsEvent mapObjectsEvent = new MapObjectsEvent();
                    mapObjectsEvent.setState(20);
                    MapObjectWrapper mapObjectWrapper = new MapObjectWrapper();
                    mapObjectWrapper.setMapObjects(bankApiResponse.getResult());
                    mapObjectsEvent.setMapObjects(mapObjectWrapper);
                    BankApiManager.this.mEventBus.mo96184m(mapObjectsEvent);
                }
            }
        });
    }

    public void getMapRegions() {
        this.mBankApi.getMapRegions(new RestCallback<BankApiResponse<ArrayList<MapRegion>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.mapRegionsLoaded(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<MapRegion>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.mapRegionsLoaded(bankApiResponse);
            }
        });
    }

    public void getMerchantsByName(String str, int i, int i2) {
        this.mBankApi.getMerchantsByName(str, i, i2, new RestCallback<BankApiResponse<List<Merchant>>>() {
            public void onFailure(Throwable th) {
                GetMerchantsByNameEvent getMerchantsByNameEvent = new GetMerchantsByNameEvent();
                getMerchantsByNameEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(getMerchantsByNameEvent);
            }

            public void onResponse(BankApiResponse<List<Merchant>> bankApiResponse) {
                GetMerchantsByNameEvent getMerchantsByNameEvent = new GetMerchantsByNameEvent();
                if (bankApiResponse.isSuccess()) {
                    getMerchantsByNameEvent.setState(20);
                    getMerchantsByNameEvent.setMerchantList(bankApiResponse.getResult());
                } else {
                    getMerchantsByNameEvent.setState(40);
                    getMerchantsByNameEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(getMerchantsByNameEvent);
            }
        });
    }

    public void getNotificationList() {
        this.mBankApi.getNotificationList(new RestCallback<BankApiResponse<NotificationList>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onNotificationListResponse(bankApiResponse);
            }

            public void onResponse(BankApiResponse<NotificationList> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onNotificationListResponse(bankApiResponse);
            }
        });
    }

    public void getOperationDetails(long j, long j2) {
        final long j3 = j;
        final long j4 = j2;
        this.mBankApi.getOperationDetails(j, j2, new RestCallback<BankApiResponse<OperationResponse>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onOperationDetails(j3, j4, bankApiResponse);
            }

            public void onResponse(BankApiResponse<OperationResponse> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onOperationDetails(j3, j4, bankApiResponse);
            }
        });
    }

    public void getOperations(int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2, int i3, Integer num) {
        final int i4 = i;
        final Long l7 = l;
        final Long l8 = l2;
        final Long l9 = l3;
        final Long l12 = l4;
        final Long l13 = l5;
        final Long l14 = l6;
        final String str3 = str;
        final String str4 = str2;
        final int i5 = i2;
        this.mBankApi.getAccountOperations(l, l2, l3, l4, l5, l6, str, str2, i2, i3, num, new RestCallback<BankApiResponse<OperationResponse>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onOperationsResponse(i4, l7, l8, l9, l12, l13, l14, str3, str4, i5, bankApiResponse);
            }

            public void onResponse(BankApiResponse<OperationResponse> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onOperationsResponse(i4, l7, l8, l9, l12, l13, l14, str3, str4, i5, bankApiResponse);
            }
        });
    }

    public void getOutTransferDetails(long j, String str, String str2, Long l, Long l2, Long l3) {
        final long j2 = j;
        final String str3 = str;
        final String str4 = str2;
        this.mBankApi.getOutTransferDetails(j, str, str2, l, l2, l3, new RestCallback<BankApiResponse<TransferHistoryItem>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onOutTransferDetails(j2, str3, str4, bankApiResponse);
            }

            public void onResponse(BankApiResponse<TransferHistoryItem> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onOutTransferDetails(j2, str3, str4, bankApiResponse);
            }
        });
    }

    public void getPaymentDebt(String str, String str2, String str3, PaymentServiceConfig paymentServiceConfig, final long j) {
        this.mBankApi.getPaymentDebt(str, str2, str3, new RestCallback<BankApiResponse<PaymentDebtResponse>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.debtResponse(bankApiResponse, j);
            }

            public void onResponse(BankApiResponse<PaymentDebtResponse> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.debtResponse(bankApiResponse, j);
            }
        });
    }

    public void getPaymentDetails(long j, String str, String str2, Long l, Long l2, Long l3) {
        final long j2 = j;
        final String str3 = str;
        final String str4 = str2;
        this.mBankApi.getPaymentDetails(j, str, str2, l, l2, l3, new RestCallback<BankApiResponse<List<PaymentDetail>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onPaymentDetails(j2, str3, str4, bankApiResponse);
            }

            public void onResponse(BankApiResponse<List<PaymentDetail>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onPaymentDetails(j2, str3, str4, bankApiResponse);
            }
        });
    }

    public void getPaymentsLastOperations(long j, Long l, int i, int i2) {
        final long j2 = j;
        final Long l2 = l;
        final int i3 = i;
        this.mBankApi.getPaymentsLastOperations(j, l, i, i2, this.mClient.isAuthorized(), new RestCallback<BankApiResponse<ArrayList<LastOperation>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.lastOperationsResponse(j2, l2, i3, bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<LastOperation>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.lastOperationsResponse(j2, l2, i3, bankApiResponse);
            }
        });
    }

    public void getPaymentsProviderConfiguration(String str, final String str2, final String str3, String str4) {
        this.mBankApi.getPaymentsProviderConfiguration(str, str2, str3, str4, new RestCallback<BankApiResponse<List<PaymentProviderConfiguration>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                if (!PensionStatusResult.STATUS_ACTIVE.equals(str2) && !"".equals(str3)) {
                    BankApiManager.this.mNetworkListener.paymentProviderConfigurationResponse(bankApiResponse, str3);
                }
            }

            public void onResponse(BankApiResponse<List<PaymentProviderConfiguration>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                if (!PensionStatusResult.STATUS_ACTIVE.equals(str2) && !"".equals(str3)) {
                    BankApiManager.this.mNetworkListener.paymentProviderConfigurationResponse(bankApiResponse, str3);
                }
            }
        });
    }

    public void getPaymentsProviderConfigurationForPoints(String str, Object obj) {
        final ProviderConfigurationEvent providerConfigurationEvent = new ProviderConfigurationEvent();
        providerConfigurationEvent.setInstance(obj);
        this.mBankApi.getPaymentsProviderConfiguration("", "", str, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, new RestCallback<BankApiResponse<List<PaymentProviderConfiguration>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                providerConfigurationEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(providerConfigurationEvent);
            }

            public void onResponse(BankApiResponse<List<PaymentProviderConfiguration>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null || bankApiResponse.getResult().size() <= 0) {
                    providerConfigurationEvent.setState(40);
                    providerConfigurationEvent.setErrorKey(bankApiResponse.getKey());
                } else {
                    providerConfigurationEvent.setConfiguration((PaymentProviderConfiguration) bankApiResponse.getResult().get(0));
                    "bog-comp-mobilepayments".equals(((PaymentProviderConfiguration) bankApiResponse.getResult().get(0)).getPaymentServiceId());
                    providerConfigurationEvent.setState(20);
                    providerConfigurationEvent.setConfiguration(C32315k0.m95272u(providerConfigurationEvent.getConfiguration()));
                }
                BankApiManager.this.mEventBus.mo96184m(providerConfigurationEvent);
            }
        });
    }

    public void getPaymentsProviderConfigurationWithVoucher(String str, Object obj, final String str2) {
        final ProviderConfigurationEvent providerConfigurationEvent = new ProviderConfigurationEvent();
        providerConfigurationEvent.setInstance(obj);
        this.mBankApi.getPaymentsProviderConfiguration("", "", str, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, new RestCallback<BankApiResponse<List<PaymentProviderConfiguration>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                providerConfigurationEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(providerConfigurationEvent);
            }

            public void onResponse(BankApiResponse<List<PaymentProviderConfiguration>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null || bankApiResponse.getResult().size() <= 0) {
                    providerConfigurationEvent.setState(40);
                    providerConfigurationEvent.setErrorKey(bankApiResponse.getKey());
                    BankApiManager.this.mEventBus.mo96184m(providerConfigurationEvent);
                    return;
                }
                providerConfigurationEvent.setConfiguration((PaymentProviderConfiguration) bankApiResponse.getResult().get(0));
                String paymentServiceId = ((PaymentProviderConfiguration) bankApiResponse.getResult().get(0)).getPaymentServiceId();
                if ("bog-comp-mobilepayments".equals(paymentServiceId)) {
                    paymentServiceId = "bog-comp-lailai-web";
                }
                BankApiManager.this.mBankApi.getVouchers(paymentServiceId, "", str2, new RestCallback<BankApiResponse<PaymentVoucher[]>>() {
                    public void onFailure(Throwable th) {
                        super.onFailure(th);
                        providerConfigurationEvent.setState(30);
                        C345217 r2 = C345217.this;
                        BankApiManager.this.mEventBus.mo96184m(providerConfigurationEvent);
                    }

                    public void onResponse(BankApiResponse<PaymentVoucher[]> bankApiResponse) {
                        super.onResponse(bankApiResponse);
                        if (bankApiResponse.isSuccess()) {
                            providerConfigurationEvent.setState(20);
                        } else {
                            providerConfigurationEvent.setState(40);
                            providerConfigurationEvent.setErrorKey(bankApiResponse.getKey());
                        }
                        C345217 r3 = C345217.this;
                        BankApiManager.this.mEventBus.mo96184m(providerConfigurationEvent);
                    }
                });
            }
        });
    }

    public void getPensionStatus() {
        this.mBankApi.getPensionStatus(new RestCallback<BankApiResponse<PensionStatusResult>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onPensionStatus(bankApiResponse);
            }

            public void onResponse(BankApiResponse<PensionStatusResult> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onPensionStatus(bankApiResponse);
            }
        });
    }

    public void getPointValueExchange(final String str, String str2, final String str3) {
        if (!str3.equals(this.serviceProviderId) || !this.amountToPoints.containsKey(str)) {
            if (!str3.equals(this.serviceProviderId)) {
                this.amountToPoints = new HashMap<>();
                this.serviceProviderId = str3;
            }
            PointValueExchangeEvent pointValueExchangeEvent = new PointValueExchangeEvent();
            pointValueExchangeEvent.amount = str;
            pointValueExchangeEvent.serviceProviderId = str3;
            pointValueExchangeEvent.setState(10);
            this.amountToPoints.put(str, pointValueExchangeEvent);
            this.mEventBus.mo96184m(pointValueExchangeEvent);
            this.mBankApi.getPaymentDebt("", "mob-bog-voucher-convert-amt", str2, new RestCallback<BankApiResponse<PaymentDebtResponse>>() {
                public void onFailure(Throwable th) {
                    super.onFailure(th);
                    PointValueExchangeEvent pointValueExchangeEvent = new PointValueExchangeEvent();
                    pointValueExchangeEvent.setState(30);
                    pointValueExchangeEvent.amount = str;
                    pointValueExchangeEvent.serviceProviderId = str3;
                    BankApiManager.this.amountToPoints.remove(str);
                    BankApiManager.this.mEventBus.mo96184m(pointValueExchangeEvent);
                }

                public void onResponse(BankApiResponse<PaymentDebtResponse> bankApiResponse) {
                    super.onResponse(bankApiResponse);
                    PointValueExchangeEvent pointValueExchangeEvent = new PointValueExchangeEvent();
                    pointValueExchangeEvent.amount = str;
                    pointValueExchangeEvent.serviceProviderId = str3;
                    if (bankApiResponse.isSuccess()) {
                        pointValueExchangeEvent.setState(20);
                        pointValueExchangeEvent.parameter = Arrays.asList(bankApiResponse.getResult().getParameter());
                        BankApiManager.this.amountToPoints.put(str, pointValueExchangeEvent);
                    } else {
                        pointValueExchangeEvent.setState(40);
                        pointValueExchangeEvent.setErrorKey(bankApiResponse.getKey());
                        BankApiManager.this.amountToPoints.remove(str);
                    }
                    BankApiManager.this.mEventBus.mo96184m(pointValueExchangeEvent);
                }
            });
            return;
        }
        this.mEventBus.mo96184m(this.amountToPoints.get(str));
    }

    public void getRatesHistory() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Calendar instance = Calendar.getInstance();
                long timeInMillis = instance.getTimeInMillis();
                instance.add(1, -1);
                BankApiManager.this.mBankApi.getRatesHistory(instance.getTimeInMillis(), timeInMillis, new RestCallback<BankApiResponse<CcyHistoryWrapper>>() {
                    public void onFailure(Throwable th) {
                        super.onFailure(th);
                        BankApiManager.this.mEventBus.mo96184m(new RatesErrorEvent(""));
                    }

                    public void onResponse(BankApiResponse<CcyHistoryWrapper> bankApiResponse) {
                        super.onResponse(bankApiResponse);
                        if (bankApiResponse.isSuccess()) {
                            BankApiManager.this.mEventBus.mo96184m(new CcyHistoryWrapperSuccessEvent(bankApiResponse.getResult()));
                        } else {
                            BankApiManager.this.mEventBus.mo96184m(new RatesErrorEvent(C27950a.m86284a(bankApiResponse.getKey())));
                        }
                    }
                });
            }
        }, 0);
    }

    public void getReportingCodes(String str) {
        this.mBankApi.foreignTransferGetReportingCodes(str, new RestCallback<BankApiResponse<List<ReportingCode>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onReportingCodes(bankApiResponse);
            }

            public void onResponse(BankApiResponse<List<ReportingCode>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onReportingCodes(bankApiResponse);
            }
        });
    }

    public void getSMSNotificationsList() {
        this.mBankApi.getSMSNotificationsList(new RestCallback<BankApiResponse<ArrayList<SMSContact>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onSMSNotificationsList(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<SMSContact>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onSMSNotificationsList(bankApiResponse);
            }
        });
    }

    public void getSTOPeriodTypes() {
        this.mBankApi.getSTOPeriodTypes(new RestCallback<BankApiResponse<ArrayList<STOPeriodType>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onSTOPeriodTypes(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<STOPeriodType>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onSTOPeriodTypes(bankApiResponse);
            }
        });
    }

    public void getSavedCards(final String str) {
        this.mBankApi.getSavedCards(str, new RestCallback<BankApiResponse<ArrayList<PaymentsCard>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onPaymentCardsResponse(bankApiResponse, str);
            }

            public void onResponse(BankApiResponse<ArrayList<PaymentsCard>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onPaymentCardsResponse(bankApiResponse, str);
            }
        });
    }

    public void getScoolCardStatement(final long j, long j2, long j3, Integer num, Integer num2) {
        this.mBankApi.getScoolCardStatement(j, j2, j3, num, num2, new RestCallback<BankApiResponse<ArrayList<ScoolCardStatementItem>>>() {
            public void onFailure(Throwable th) {
                ScoolCardStatementEvent scoolCardStatementEvent = new ScoolCardStatementEvent();
                scoolCardStatementEvent.setChildClientKey(j);
                scoolCardStatementEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(scoolCardStatementEvent);
            }

            public void onResponse(BankApiResponse<ArrayList<ScoolCardStatementItem>> bankApiResponse) {
                ScoolCardStatementEvent scoolCardStatementEvent = new ScoolCardStatementEvent();
                scoolCardStatementEvent.setChildClientKey(j);
                if (bankApiResponse.isSuccess()) {
                    scoolCardStatementEvent.setState(20);
                    scoolCardStatementEvent.setStatementItemList(bankApiResponse.getResult());
                } else {
                    scoolCardStatementEvent.setState(40);
                    scoolCardStatementEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(scoolCardStatementEvent);
            }
        });
    }

    public void getScoolStatement(final long j, Long l, Long l2, int i, int i2) {
        this.mBankApi.getScoolCardStatement(j, l.longValue(), l2.longValue(), Integer.valueOf(i), Integer.valueOf(i2), new RestCallback<BankApiResponse<ArrayList<ScoolCardStatementItem>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.ScoolStatementResponse(j, bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<ScoolCardStatementItem>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.ScoolStatementResponse(j, bankApiResponse);
            }
        });
    }

    public void getSelectedPayments() {
        this.mBankApi.getSelectedPayments(new RestCallback<BankApiResponse<ArrayList<SelectedPayment>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onSelectedPayments(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<SelectedPayment>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onSelectedPayments(bankApiResponse);
            }
        });
    }

    public void getTemplatesBasket(Boolean bool, String str, int i, int i2, int i3, String str2) {
        this.mBankApi.getTemplatesBasket(Boolean.valueOf(this.mClient.isAuthorized()), str, i, i2, i3, str2, new RestCallback<BankApiResponse<TemplateBasketItemsWithPaymentConfig>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.templatesBasketResponse(bankApiResponse);
            }

            public void onResponse(BankApiResponse<TemplateBasketItemsWithPaymentConfig> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.templatesBasketResponse(bankApiResponse);
            }
        });
    }

    public void getTemplatesByType(String str, int i, int i2, int i3) {
        this.mBankApi.getTemplatesByType(str, i, i2, i3, new RestCallback<BankApiResponse<ArrayList<TemplateBasketItem>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.templateByTypeResponse(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<TemplateBasketItem>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.templateByTypeResponse(bankApiResponse);
            }
        });
    }

    public void getTransferBeneficiaries() {
        this.mBankApi.getTransferBeneficiaries(new RestCallback<BankApiResponse<ArrayList<Beneficiary>>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiManager.this.mClient.requestTransferTemplates(true);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mClient.onTransferBeneficiaries(bankApiResponse);
            }

            public void onResponse(BankApiResponse<ArrayList<Beneficiary>> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mClient.onTransferBeneficiaries(bankApiResponse);
            }
        });
    }

    public void getTransferDetailsPfm(final String str, String str2, long j, Long l, String str3, Long l2) {
        this.mBankApi.getTransferDetailsPfm(str, str2, Long.valueOf(j), l, str3, l2, new RestCallback<BankApiResponse<TransferHistoryItem>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onTransferDetailsPfm(str, bankApiResponse);
            }

            public void onResponse(BankApiResponse<TransferHistoryItem> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onTransferDetailsPfm(str, bankApiResponse);
            }
        });
    }

    public void getUtilityPaymentDetails(long j, String str, String str2, Long l, Long l2, Long l3) {
        final long j2 = j;
        final String str3 = str;
        final String str4 = str2;
        this.mBankApi.getUtilityPaymentDetails(j, str, str2, l, l2, l3, new RestCallback<BankApiResponse<List<LastOperation>>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onUtilityPaymentDetails(j2, str3, str4, bankApiResponse);
            }

            public void onResponse(BankApiResponse<List<LastOperation>> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onUtilityPaymentDetails(j2, str3, str4, bankApiResponse);
            }
        });
    }

    public void hideClientProduct(String str, String str2, boolean z) {
        this.mBankApi.hideClientProduct(str, str2, z ? "Y" : "N", new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                super.onResponse(bankApiResponse);
            }
        });
    }

    public void joinBonusProgram() {
        this.mBankApi.joinBonusProgram(new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                BonusProgramRegisterEvent bonusProgramRegisterEvent = new BonusProgramRegisterEvent();
                bonusProgramRegisterEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(bonusProgramRegisterEvent);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                BonusProgramRegisterEvent bonusProgramRegisterEvent = new BonusProgramRegisterEvent();
                if (bankApiResponse.isSuccess()) {
                    BankApiManager.this.mClient.setSelectedEvent((SelectedPaymentsEvent) null);
                    bonusProgramRegisterEvent.setState(20);
                } else {
                    bonusProgramRegisterEvent.setState(40);
                    bonusProgramRegisterEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(bonusProgramRegisterEvent);
            }
        });
    }

    public void modifyTemplate(TemplateBasketItem templateBasketItem, File file, Long l, String str) {
        final TemplateBasketItem templateBasketItem2 = templateBasketItem;
        final Long l2 = l;
        final File file2 = file;
        final String str2 = str;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                templateBasketItem2.setModificationDate((String) null);
                BankApiManager.this.mBankApi.modifyTemplate(BankApiManager.this.gsonExposed.mo18181w(templateBasketItem2), l2, file2, str2, (RestCallback<BankApiResponse<TemplateBasketItem>>) new RestCallback<BankApiResponse<TemplateBasketItem>>() {
                    public void onFailure(Throwable th) {
                        super.onFailure(th);
                        BankApiResponse bankApiResponse = new BankApiResponse();
                        bankApiResponse.setNetworkFailure(true);
                        bankApiResponse.setNetworkFailure(th);
                        NetworkListener c = BankApiManager.this.mNetworkListener;
                        C3447126 r1 = C3447126.this;
                        c.modifyTemplateResponse(bankApiResponse, templateBasketItem2, l2);
                    }

                    public void onResponse(BankApiResponse<TemplateBasketItem> bankApiResponse) {
                        super.onResponse(bankApiResponse);
                        NetworkListener c = BankApiManager.this.mNetworkListener;
                        C3447126 r1 = C3447126.this;
                        c.modifyTemplateResponse(bankApiResponse, templateBasketItem2, l2);
                    }
                });
            }
        }, 0);
    }

    public void modifyTemplateGroup(String str, final TemplateGroup templateGroup, File file) {
        this.mBankApi.modifyTemplateGroup(str, templateGroup, file, new RestCallback<BankApiResponse<TemplateGroup>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiManager.this.mEventBus.mo96184m(new ErrorEvent(th.getMessage()));
                BankApiResponse bankApiResponse = new BankApiResponse(templateGroup);
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.modifyTemplateGroupResponse(bankApiResponse);
            }

            public void onResponse(BankApiResponse<TemplateGroup> bankApiResponse) {
                super.onResponse(bankApiResponse);
                if (bankApiResponse.isSuccess()) {
                    bankApiResponse.getResult().setComments(templateGroup.getComments());
                    bankApiResponse.getResult().setTemplates(templateGroup.getTemplates());
                    bankApiResponse.getResult().setCtPark6MonthsEvent(templateGroup.getCtPark6MonthsEvent());
                    bankApiResponse.getResult().setCtParkPenaltiesEvent(templateGroup.getCtParkPenaltiesEvent());
                    BankApiManager.this.mNetworkListener.modifyTemplateGroupResponse(bankApiResponse);
                    return;
                }
                BankApiManager.this.mEventBus.mo96184m(new ErrorEvent(bankApiResponse.getError()));
                BankApiManager.this.mNetworkListener.modifyTemplateGroupResponse(bankApiResponse);
            }
        });
    }

    public void modifyTransferTemplate(final TransferTemplateObject transferTemplateObject, File file, String str) {
        this.mBankApi.modifyTemplate(this.gsonExposed.mo18181w(transferTemplateObject), file, true, str, (RestCallback<BankApiResponse<Boolean>>) new RestCallback<BankApiResponse<Boolean>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiManager.this.mClient.requestTransferTemplates(true);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mClient.onModifyTransferTemplate(bankApiResponse, transferTemplateObject.getId());
            }

            public void onResponse(BankApiResponse<Boolean> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mClient.requestTransferTemplates(true);
                BankApiManager.this.mClient.onModifyTransferTemplate(bankApiResponse, transferTemplateObject.getId());
            }
        });
    }

    public void orderBonusPrize(HashMap<String, Object> hashMap) {
        this.mBankApi.orderBonusPrize(hashMap, new RestCallback<BankApiResponse<List<String>>>() {
            public void onFailure(Throwable th) {
                BonusPrizeOrderEvent bonusPrizeOrderEvent = new BonusPrizeOrderEvent();
                bonusPrizeOrderEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(bonusPrizeOrderEvent);
            }

            public void onResponse(BankApiResponse<List<String>> bankApiResponse) {
                BonusPrizeOrderEvent bonusPrizeOrderEvent = new BonusPrizeOrderEvent();
                if (bankApiResponse.isSuccess()) {
                    bonusPrizeOrderEvent.setState(20);
                    bonusPrizeOrderEvent.setVoucherCodes(bankApiResponse.getResult());
                } else {
                    bonusPrizeOrderEvent.setScaError(bankApiResponse.isScaError());
                    bonusPrizeOrderEvent.setState(40);
                    bonusPrizeOrderEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(bonusPrizeOrderEvent);
            }
        });
    }

    public void paymentsBatchExecute(String str, String str2, HashMap<String, Object> hashMap) {
        this.mBankApi.paymentsBatchExecute(str, str2, hashMap, new RestCallback<BankApiResponse<PaymentResult>>() {
            public void onFailure(Throwable th) {
                boolean z;
                super.onFailure(th);
                PaymentBatchExecuteEvent paymentBatchExecuteEvent = new PaymentBatchExecuteEvent();
                paymentBatchExecuteEvent.setState(30);
                if (th == null || !(th instanceof SocketTimeoutException)) {
                    z = false;
                } else {
                    z = true;
                }
                paymentBatchExecuteEvent.setTimeOut(z);
                BankApiManager.this.mEventBus.mo96184m(paymentBatchExecuteEvent);
            }

            public void onResponse(BankApiResponse<PaymentResult> bankApiResponse) {
                super.onResponse(bankApiResponse);
                PaymentBatchExecuteEvent paymentBatchExecuteEvent = new PaymentBatchExecuteEvent();
                paymentBatchExecuteEvent.setResult(bankApiResponse.getResult());
                if (bankApiResponse.isSuccess()) {
                    paymentBatchExecuteEvent.setState(20);
                } else {
                    paymentBatchExecuteEvent.setState(40);
                    paymentBatchExecuteEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(paymentBatchExecuteEvent);
            }
        });
    }

    public void processNotifications(final ProcessNotificationsRequest processNotificationsRequest) {
        this.mBankApi.processNotifications(processNotificationsRequest, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onNotificationsProcessResponse(processNotificationsRequest, bankApiResponse);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onNotificationsProcessResponse(processNotificationsRequest, bankApiResponse);
            }
        });
    }

    public void registerReferral(String str, String str2, String str3, String str4, C24978b bVar, C24978b bVar2, C24978b bVar3, C24978b bVar4, C24978b bVar5, C24978b bVar6) {
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        final C24978b bVar7 = bVar;
        final C24978b bVar8 = bVar2;
        final C24978b bVar9 = bVar3;
        final C24978b bVar10 = bVar4;
        final C24978b bVar11 = bVar5;
        final C24978b bVar12 = bVar6;
        this.mBankApi.registerReferral(str, str2, str3, str4, bVar, bVar2, bVar3, bVar4, bVar5, bVar6, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                PlusReferralRegistrationEvent plusReferralRegistrationEvent = new PlusReferralRegistrationEvent();
                plusReferralRegistrationEvent.setIdNumber(str5);
                plusReferralRegistrationEvent.setPhoneNumber(str6);
                plusReferralRegistrationEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(plusReferralRegistrationEvent);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                PlusReferralRegistrationEvent plusReferralRegistrationEvent = new PlusReferralRegistrationEvent();
                plusReferralRegistrationEvent.setIdNumber(str5);
                plusReferralRegistrationEvent.setPhoneNumber(str6);
                plusReferralRegistrationEvent.setFirstName(str7);
                plusReferralRegistrationEvent.setLastName(str8);
                plusReferralRegistrationEvent.setDeposit(bVar7);
                plusReferralRegistrationEvent.setLoan(bVar8);
                plusReferralRegistrationEvent.setCreditCard(bVar9);
                plusReferralRegistrationEvent.setIpo(bVar10);
                plusReferralRegistrationEvent.setSolo(bVar11);
                plusReferralRegistrationEvent.setSoloClub(bVar12);
                if (bankApiResponse.isSuccess()) {
                    plusReferralRegistrationEvent.setState(20);
                } else {
                    plusReferralRegistrationEvent.setState(40);
                    plusReferralRegistrationEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(plusReferralRegistrationEvent);
            }
        });
    }

    public void requestNotificationsCount(String str) {
        this.mBankApi.getNotificationsCount(str, new RestCallback<BankApiResponse<NotificationCount>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onNotificationsCount(bankApiResponse);
            }

            public void onResponse(BankApiResponse<NotificationCount> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onNotificationsCount(bankApiResponse);
            }
        });
    }

    public void searchData(String str, int i, int i2) {
        this.mBankApi.searchData(str, i, i2, new RestCallback<BankApiResponse<SearchDataWrapper>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                SearchDataEvent searchDataEvent = new SearchDataEvent();
                searchDataEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(searchDataEvent);
            }

            public void onResponse(BankApiResponse<SearchDataWrapper> bankApiResponse) {
                super.onResponse(bankApiResponse);
                SearchDataEvent searchDataEvent = new SearchDataEvent(bankApiResponse.getResult());
                if (bankApiResponse.isSuccess()) {
                    searchDataEvent.setState(20);
                } else {
                    searchDataEvent.setState(40);
                }
                BankApiManager.this.mEventBus.mo96184m(searchDataEvent);
            }
        });
    }

    public void setUsername(final String str) {
        UsernameChangeEvent usernameChangeEvent = new UsernameChangeEvent();
        usernameChangeEvent.setState(10);
        this.mEventBus.mo96184m(usernameChangeEvent);
        this.mBankApi.setUsername(str, (String) null, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                UsernameChangeEvent usernameChangeEvent = new UsernameChangeEvent();
                usernameChangeEvent.setState(30);
                BankApiManager.this.mEventBus.mo96184m(usernameChangeEvent);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                super.onResponse(bankApiResponse);
                UsernameChangeEvent usernameChangeEvent = new UsernameChangeEvent();
                if (bankApiResponse.isSuccess()) {
                    usernameChangeEvent.setState(20);
                    usernameChangeEvent.setUsername(str);
                } else {
                    usernameChangeEvent.setState(40);
                    usernameChangeEvent.setErrorKey(bankApiResponse.getKey());
                }
                BankApiManager.this.mEventBus.mo96184m(usernameChangeEvent);
            }
        });
    }

    public void terminateBill(final long j, String str) {
        this.mBankApi.terminateBill(j, str, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onTerminateBill(j, bankApiResponse);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onTerminateBill(j, bankApiResponse);
            }
        });
    }

    public void terminatePayment(final long j, String str) {
        this.mBankApi.terminatePayment(j, str, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onTerminatePayment(j, bankApiResponse);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onTerminatePayment(j, bankApiResponse);
            }
        });
    }

    public void terminateSTO(final long j, String str) {
        this.mBankApi.terminateSTO(j, str, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onTerminateSTO(j, bankApiResponse);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onTerminateSTO(j, bankApiResponse);
            }
        });
    }

    public void updateCardSecurity(long j, String str, String str2, boolean z, HashMap<String, Object> hashMap) {
        final long j2 = j;
        final String str3 = str;
        final String str4 = str2;
        final boolean z2 = z;
        this.mBankApi.useOtpForAction(hashMap, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onCardSecurityResponse(j2, str3, str4, z2, bankApiResponse);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                BankApiManager.this.mNetworkListener.onCardSecurityResponse(j2, str3, str4, z2, bankApiResponse);
            }
        });
    }

    public void updateTemplatesLink(String str, long j, String str2) {
        final String str3 = str;
        final long j2 = j;
        final String str4 = str2;
        this.mBankApi.updateTemplateGroupLink(j, str3, str2, new RestCallback<BankApiResponse<Void>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.modifyTemplateGroupLinkResponse(bankApiResponse, str3, j2, str4);
            }

            public void onResponse(BankApiResponse<Void> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.modifyTemplateGroupLinkResponse(bankApiResponse, str3, j2, str4);
            }
        });
    }

    public void uploadProductImage(final int i, long j, final long j2, File file, String str) {
        this.mBankApi.uploadProductImage(j, j2, file, str, new RestCallback<BankApiResponse<Object>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiManager.this.mEventBus.mo96184m(new ErrorEvent(th.getMessage()));
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.onUploadImage(i, j2, bankApiResponse);
            }

            public void onResponse(BankApiResponse<Object> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.onUploadImage(i, j2, bankApiResponse);
            }
        });
    }

    public void userLoggedInTruly(Boolean bool, String str) {
        MedalliaDigital.enableIntercept();
        if (bool.booleanValue()) {
            C36546y.m108282F().mo27141L();
        } else {
            C36546y.m108282F().mo27134E(str);
        }
    }

    public void getPaymentsLastOperations(final String str, final Long l, int i, int i2) {
        if (str == null) {
            this.mBankApi.getPaymentsLastOperations(l, i, i2, this.mClient.isAuthorized(), new RestCallback<BankApiResponse<List<LastOperation>>>() {
                public void onFailure(Throwable th) {
                    super.onFailure(th);
                    BankApiResponse bankApiResponse = new BankApiResponse();
                    bankApiResponse.setNetworkFailure(true);
                    bankApiResponse.setNetworkFailure(th);
                    BankApiManager.this.mNetworkListener.lastOperationsResponse(l, bankApiResponse);
                }

                public void onResponse(BankApiResponse<List<LastOperation>> bankApiResponse) {
                    super.onResponse(bankApiResponse);
                    BankApiManager.this.mNetworkListener.lastOperationsResponse(l, bankApiResponse);
                }
            });
            return;
        }
        this.mBankApi.getPaymentsLastOperationWithEssId(str, new RestCallback<BankApiResponse<LastOperation>>() {
            public void onFailure(Throwable th) {
                super.onFailure(th);
                BankApiResponse bankApiResponse = new BankApiResponse();
                bankApiResponse.setNetworkFailure(true);
                bankApiResponse.setNetworkFailure(th);
                BankApiManager.this.mNetworkListener.lastOperationResponse(str, bankApiResponse);
            }

            public void onResponse(BankApiResponse<LastOperation> bankApiResponse) {
                super.onResponse(bankApiResponse);
                BankApiManager.this.mNetworkListener.lastOperationResponse(str, bankApiResponse);
            }
        });
    }
}
