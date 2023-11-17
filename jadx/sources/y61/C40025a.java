package y61;

import g91.C32343x;
import java.util.Iterator;
import jg1.C41438c;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.eventbus.events.CountriesEvent;
import p341ge.bog.mobilebank.eventbus.events.CountryCodeBySwiftEvent;
import p341ge.bog.mobilebank.eventbus.events.CreditCardsEvent;
import p341ge.bog.mobilebank.eventbus.events.DDSTOListEvent;
import p341ge.bog.mobilebank.eventbus.events.InTransferDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.ReportingCodesEvent;
import p341ge.bog.mobilebank.eventbus.events.STOPeriodTypesEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferBeneficiaryEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferHistoryEvent;
import p341ge.bog.mobilebank.model.BogCountry;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PMIHistoryItem;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;
import p341ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode;
import r90.C27950a;

/* renamed from: y61.a */
public class C40025a {

    /* renamed from: A */
    private ReportingCodesEvent f95026A;

    /* renamed from: B */
    private CountryCodeBySwiftEvent f95027B;

    /* renamed from: C */
    private CountryCodeBySwiftEvent f95028C;

    /* renamed from: a */
    private C40026b f95029a;

    /* renamed from: b */
    private Client f95030b;

    /* renamed from: c */
    private C41438c f95031c;

    /* renamed from: d */
    private long f95032d;

    /* renamed from: e */
    private AccountOperation f95033e;

    /* renamed from: f */
    private boolean f95034f;

    /* renamed from: g */
    private PMIHistoryItem f95035g;

    /* renamed from: h */
    private TransferHistoryItem f95036h;

    /* renamed from: i */
    private Long f95037i;

    /* renamed from: j */
    private String f95038j;

    /* renamed from: k */
    private Long f95039k;

    /* renamed from: l */
    private boolean f95040l;

    /* renamed from: m */
    private boolean f95041m;

    /* renamed from: n */
    private boolean f95042n;

    /* renamed from: o */
    private boolean f95043o;

    /* renamed from: p */
    private boolean f95044p;

    /* renamed from: q */
    private boolean f95045q;

    /* renamed from: r */
    private boolean f95046r;

    /* renamed from: s */
    private boolean f95047s;

    /* renamed from: t */
    private AccountLovEvent f95048t;

    /* renamed from: u */
    private CreditCardsEvent f95049u;

    /* renamed from: v */
    private STOPeriodTypesEvent f95050v;

    /* renamed from: w */
    private DDSTOListEvent f95051w;

    /* renamed from: x */
    private TransferHistoryEvent f95052x;

    /* renamed from: y */
    private InTransferDetailsEvent f95053y;

    /* renamed from: z */
    private CountriesEvent f95054z;

    public C40025a(C40026b bVar, Client client, C41438c cVar, boolean z) {
        this.f95029a = bVar;
        this.f95030b = client;
        this.f95031c = cVar;
        this.f95034f = z;
    }

    /* renamed from: k */
    private void m115974k() {
        String str;
        DDSTOListEvent dDSTOListEvent;
        STOPeriodTypesEvent sTOPeriodTypesEvent;
        InTransferDetailsEvent inTransferDetailsEvent;
        CreditCardsEvent creditCardsEvent;
        AccountLovEvent accountLovEvent;
        if (this.f95029a == null) {
            return;
        }
        if (this.f95040l && ((accountLovEvent = this.f95048t) == null || accountLovEvent.getState() == 10)) {
            this.f95029a.mo93883m(10);
        } else if (this.f95041m && ((creditCardsEvent = this.f95049u) == null || creditCardsEvent.getState() == 10)) {
            this.f95029a.mo93883m(10);
        } else if (!this.f95043o || !((inTransferDetailsEvent = this.f95053y) == null || inTransferDetailsEvent.getState() == 10)) {
            if (this.f95042n) {
                TransferHistoryEvent transferHistoryEvent = this.f95052x;
                if (transferHistoryEvent == null || transferHistoryEvent.getState() == 10) {
                    this.f95029a.mo93883m(10);
                    return;
                }
                TransferHistoryEvent transferHistoryEvent2 = this.f95052x;
                if (transferHistoryEvent2 != null && transferHistoryEvent2.getState() == 20 && this.f95052x.getTransferHistoryItem() != null && this.f95052x.getTransferHistoryItem().getDocType().equals("PAYMENT_FOREIGN") && !this.f95047s) {
                    this.f95035g = new PMIHistoryItem();
                    this.f95047s = true;
                    TransferHistoryItem transferHistoryItem = this.f95052x.getTransferHistoryItem();
                    this.f95036h = transferHistoryItem;
                    if (transferHistoryItem.getBenefCountry() != null && this.f95036h.getBenefCountry().length() > 0) {
                        this.f95035g.benefCountryNeeded = true;
                        this.f95030b.getCountries();
                    }
                    if (this.f95036h.getBenefBic() != null && this.f95036h.getBenefBic().length() > 0) {
                        this.f95035g.benefBankNeeded = true;
                        this.f95030b.getCountryCodeBySwift(this.f95036h.getBenefBic(), "PMI_BENEF_BANK_CODE");
                    }
                    if (this.f95036h.getIntermediarName() != null && this.f95036h.getIntermediarName().length() > 0) {
                        this.f95035g.intBankNeeded = true;
                        this.f95030b.getCountryCodeBySwift(this.f95036h.getIntermediarName(), "PMI_INT_BANK_CODE");
                        return;
                    }
                    return;
                }
            }
            if (this.f95047s && !this.f95035g.isAllSet()) {
                this.f95029a.mo93883m(10);
            } else if (this.f95044p && ((sTOPeriodTypesEvent = this.f95050v) == null || sTOPeriodTypesEvent.getState() == 10)) {
                this.f95029a.mo93883m(10);
            } else if (this.f95045q && ((dDSTOListEvent = this.f95051w) == null || dDSTOListEvent.getState() == 10)) {
                this.f95029a.mo93883m(10);
            } else if ((!this.f95040l || !(this.f95048t.getState() == 40 || this.f95048t.getState() == 30)) && ((!this.f95043o || !(this.f95053y.getState() == 40 || this.f95053y.getState() == 30)) && ((!this.f95041m || !(this.f95049u.getState() == 40 || this.f95049u.getState() == 30)) && ((!this.f95042n || !(this.f95052x.getState() == 40 || this.f95052x.getState() == 30)) && ((!this.f95047s || !this.f95035g.benefCountryNeeded || !(this.f95054z.getState() == 40 || this.f95054z.getState() == 30)) && ((!this.f95047s || !this.f95035g.reportingCodeNeeded || !(this.f95026A.getState() == 40 || this.f95026A.getState() == 30)) && ((!this.f95047s || !this.f95035g.benefBankNeeded || !(this.f95027B.getState() == 40 || this.f95027B.getState() == 30)) && ((!this.f95047s || !this.f95035g.intBankNeeded || !(this.f95028C.getState() == 40 || this.f95028C.getState() == 30)) && ((!this.f95044p || !(this.f95050v.getState() == 40 || this.f95050v.getState() == 30)) && (!this.f95045q || !(this.f95051w.getState() == 40 || this.f95051w.getState() == 30))))))))))) {
                this.f95029a.mo93882h(this.f95053y);
                this.f95029a.mo93888r(this.f95052x);
                this.f95029a.mo93879d();
                this.f95029a.mo93881g(this.f95048t);
                this.f95029a.mo93887q(this.f95050v);
                this.f95029a.mo93886p(this.f95051w);
                this.f95029a.mo93885o(this.f95035g);
                this.f95029a.mo93883m(20);
            } else {
                AccountLovEvent accountLovEvent2 = this.f95048t;
                if (accountLovEvent2 == null || accountLovEvent2.getState() != 40) {
                    CreditCardsEvent creditCardsEvent2 = this.f95049u;
                    if (creditCardsEvent2 == null || creditCardsEvent2.getState() != 40) {
                        InTransferDetailsEvent inTransferDetailsEvent2 = this.f95053y;
                        if (inTransferDetailsEvent2 == null || inTransferDetailsEvent2.getState() != 40) {
                            TransferHistoryEvent transferHistoryEvent3 = this.f95052x;
                            if (transferHistoryEvent3 == null || transferHistoryEvent3.getState() != 40) {
                                STOPeriodTypesEvent sTOPeriodTypesEvent2 = this.f95050v;
                                if (sTOPeriodTypesEvent2 == null || sTOPeriodTypesEvent2.getState() != 40) {
                                    DDSTOListEvent dDSTOListEvent2 = this.f95051w;
                                    if (dDSTOListEvent2 == null || dDSTOListEvent2.getState() != 40) {
                                        CountriesEvent countriesEvent = this.f95054z;
                                        if (countriesEvent == null || countriesEvent.getState() != 40) {
                                            ReportingCodesEvent reportingCodesEvent = this.f95026A;
                                            if (reportingCodesEvent == null || reportingCodesEvent.getState() != 40) {
                                                CountryCodeBySwiftEvent countryCodeBySwiftEvent = this.f95027B;
                                                if (countryCodeBySwiftEvent == null || countryCodeBySwiftEvent.getState() != 40) {
                                                    CountryCodeBySwiftEvent countryCodeBySwiftEvent2 = this.f95028C;
                                                    if (countryCodeBySwiftEvent2 == null || countryCodeBySwiftEvent2.getState() != 40) {
                                                        str = "";
                                                    } else {
                                                        str = C27950a.m86284a(this.f95028C.getErrorKey());
                                                    }
                                                } else {
                                                    str = C27950a.m86284a(this.f95027B.getErrorKey());
                                                }
                                            } else {
                                                str = C27950a.m86284a(this.f95026A.getErrorKey());
                                            }
                                        } else {
                                            str = C27950a.m86284a(this.f95054z.getErrorKey());
                                        }
                                    } else {
                                        str = C27950a.m86284a(this.f95051w.getErrorKey());
                                    }
                                } else {
                                    str = C27950a.m86284a(this.f95050v.getErrorKey());
                                }
                            } else {
                                str = C27950a.m86284a(this.f95052x.getErrorKey());
                            }
                        } else {
                            str = C27950a.m86284a(this.f95053y.getErrorKey());
                        }
                    } else {
                        str = C27950a.m86284a(this.f95053y.getErrorKey());
                    }
                } else {
                    str = C27950a.m86284a(this.f95048t.getErrorKey());
                }
                this.f95029a.mo93884n(40, str);
            }
        } else {
            this.f95029a.mo93883m(10);
        }
    }

    /* renamed from: a */
    public void mo93853a() {
        this.f95029a = null;
    }

    /* renamed from: b */
    public void mo93854b() {
        AccountOperation accountOperation;
        Client client = this.f95030b;
        if (client != null && this.f95029a != null) {
            if (this.f95040l) {
                client.requestAccountLovs(false, this.f95034f);
            }
            if (this.f95046r) {
                this.f95030b.requestBeneficiaries(false);
            }
            if (this.f95041m) {
                this.f95030b.requestCreditCards(false);
            }
            if (this.f95042n && this.f95032d > 0 && "OUT_TRANSFER".equals(this.f95038j)) {
                this.f95030b.requestTransferDetailsPfm(false, String.valueOf(this.f95032d), (String) null, this.f95037i.longValue(), (Long) null, this.f95038j, this.f95039k);
            }
            if (this.f95047s) {
                if (this.f95036h.getBenefBic() != null && this.f95036h.getBenefBic().length() > 0) {
                    this.f95035g.benefBankNeeded = true;
                    this.f95030b.getCountryCodeBySwift(this.f95036h.getBenefBic(), "PMI_BENEF_BANK_CODE");
                }
                if (this.f95036h.getIntermediarName() != null && this.f95036h.getIntermediarName().length() > 0) {
                    this.f95035g.intBankNeeded = true;
                    this.f95030b.getCountryCodeBySwift(this.f95036h.getIntermediarName(), "PMI_INT_BANK_CODE");
                }
                if (this.f95036h.getBenefCountry() != null && this.f95036h.getBenefCountry().length() > 0) {
                    this.f95035g.benefCountryNeeded = true;
                    this.f95030b.getCountries();
                }
            }
            if (this.f95043o && (accountOperation = this.f95033e) != null) {
                this.f95030b.requestInTransferDetails(false, accountOperation.getDocKey(), this.f95033e.getEssServiceId(), this.f95033e.getPrintFormType());
            }
            if (this.f95044p) {
                this.f95030b.requestSTOPeriodTypes();
            }
            if (this.f95045q) {
                this.f95030b.requestDDSTO(false);
            }
        }
    }

    /* renamed from: c */
    public void mo93855c(AccountOperation accountOperation) {
        this.f95043o = true;
        this.f95033e = accountOperation;
    }

    /* renamed from: d */
    public void mo93856d() {
        this.f95040l = true;
    }

    /* renamed from: e */
    public void mo93857e() {
        this.f95046r = true;
    }

    /* renamed from: f */
    public void mo93858f() {
        this.f95041m = true;
    }

    /* renamed from: g */
    public void mo93859g(TransferHistoryItem transferHistoryItem) {
        this.f95035g = new PMIHistoryItem();
        this.f95047s = true;
        this.f95036h = transferHistoryItem;
    }

    /* renamed from: h */
    public void mo93860h() {
        this.f95044p = true;
        this.f95045q = true;
    }

    /* renamed from: i */
    public void mo93861i(long j, Long l, String str, Long l2) {
        this.f95039k = l2;
        this.f95038j = str;
        this.f95037i = l;
        this.f95042n = true;
        this.f95032d = j;
    }

    /* renamed from: j */
    public void mo93862j() {
        this.f95040l = false;
        this.f95042n = false;
        this.f95047s = false;
        PMIHistoryItem pMIHistoryItem = this.f95035g;
        if (pMIHistoryItem != null) {
            pMIHistoryItem.reset();
        }
        this.f95043o = false;
        this.f95044p = false;
        this.f95045q = false;
        this.f95046r = false;
        this.f95041m = false;
    }

    /* renamed from: l */
    public void mo93863l() {
        C41438c cVar = this.f95031c;
        if (cVar != null) {
            C32343x.m95423W0(cVar, this);
        }
    }

    /* renamed from: m */
    public void mo93864m() {
        C41438c cVar = this.f95031c;
        if (cVar != null) {
            C32343x.m95489t1(cVar, this);
        }
    }

    @C41452l
    public void onAccountsLovEvent(AccountLovEvent accountLovEvent) {
        if (this.f95040l && this.f95048t != accountLovEvent) {
            this.f95048t = accountLovEvent;
            m115974k();
        }
    }

    @C41452l
    public void onBeneficiaries(TransferBeneficiaryEvent transferBeneficiaryEvent) {
    }

    @C41452l
    public void onCountries(CountriesEvent countriesEvent) {
        if (this.f95035g.benefCountryNeeded && this.f95054z != countriesEvent) {
            this.f95054z = countriesEvent;
            if (countriesEvent.getState() == 20) {
                Iterator<BogCountry> it = countriesEvent.countries.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BogCountry next = it.next();
                    if (next.getCountryCode() != null && next.getCountryCode().equals(this.f95036h.getBenefCountry())) {
                        this.f95035g.benefCountry = next;
                        if (next.getCountryCode() != null) {
                            String countryCode = next.getCountryCode();
                            TransferCountryCode transferCountryCode = TransferCountryCode.COUNTRY_CODE_UNITED_ARAB_EMIRATES;
                            if (countryCode.equals(transferCountryCode.getValue())) {
                                this.f95035g.reportingCodeNeeded = true;
                                this.f95030b.getReportingCodes(transferCountryCode.getValue());
                            }
                        }
                    }
                }
            }
            m115974k();
        }
    }

    @C41452l
    public void onCountryCodeBySwift(CountryCodeBySwiftEvent countryCodeBySwiftEvent) {
        if (this.f95035g.benefBankNeeded && this.f95027B != countryCodeBySwiftEvent && "PMI_BENEF_BANK_CODE".equals(countryCodeBySwiftEvent.tag)) {
            this.f95027B = countryCodeBySwiftEvent;
            if (countryCodeBySwiftEvent.getState() == 20) {
                this.f95035g.benefBank = countryCodeBySwiftEvent.foreignBank;
            }
            m115974k();
        } else if (this.f95035g.intBankNeeded && this.f95028C != countryCodeBySwiftEvent && "PMI_INT_BANK_CODE".equals(countryCodeBySwiftEvent.tag)) {
            this.f95028C = countryCodeBySwiftEvent;
            if (countryCodeBySwiftEvent.getState() == 20) {
                this.f95035g.intBank = countryCodeBySwiftEvent.foreignBank;
            }
            m115974k();
        }
    }

    @C41452l
    public void onCreditCardsEvent(CreditCardsEvent creditCardsEvent) {
        if (this.f95041m && this.f95049u != creditCardsEvent) {
            this.f95049u = creditCardsEvent;
            m115974k();
        }
    }

    @C41452l
    public void onInTransferDetails(InTransferDetailsEvent inTransferDetailsEvent) {
        AccountOperation accountOperation;
        if (this.f95043o && (accountOperation = this.f95033e) != null && this.f95053y != inTransferDetailsEvent && accountOperation.getDocKey() == inTransferDetailsEvent.getDocKey()) {
            this.f95053y = inTransferDetailsEvent;
            m115974k();
        }
    }

    @C41452l
    public void onInTransferDetailsPfm(InTransferDetailsEvent inTransferDetailsEvent) {
        AccountOperation accountOperation;
        if (this.f95043o && (accountOperation = this.f95033e) != null && this.f95053y != inTransferDetailsEvent && accountOperation.getDocKey() == inTransferDetailsEvent.getDocKey()) {
            this.f95053y = inTransferDetailsEvent;
            m115974k();
        }
    }

    @C41452l
    public void onReportingCodes(ReportingCodesEvent reportingCodesEvent) {
        if (this.f95035g.reportingCodeNeeded && this.f95026A != reportingCodesEvent) {
            this.f95026A = reportingCodesEvent;
            if (reportingCodesEvent.getState() == 20) {
                Iterator<ReportingCode> it = reportingCodesEvent.reportingCodes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ReportingCode next = it.next();
                    if (next.getReportingCode() != null && next.getReportingCode().equals(this.f95036h.getRegReportingCode())) {
                        this.f95035g.reportingCode = next;
                        break;
                    }
                }
            }
            m115974k();
        }
    }

    @C41452l
    public void onSTOPeriodTypesEvent(STOPeriodTypesEvent sTOPeriodTypesEvent) {
        if (this.f95044p && this.f95050v != sTOPeriodTypesEvent) {
            this.f95050v = sTOPeriodTypesEvent;
            m115974k();
        }
    }

    @C41452l
    public void onStoListEvent(DDSTOListEvent dDSTOListEvent) {
        if (this.f95045q && this.f95051w != dDSTOListEvent) {
            this.f95051w = dDSTOListEvent;
            m115974k();
        }
    }

    @C41452l
    public void onTransferDetailsPfm(TransferHistoryEvent transferHistoryEvent) {
        if (this.f95042n && this.f95052x != transferHistoryEvent && String.valueOf(this.f95032d).equals(transferHistoryEvent.getDocKey())) {
            this.f95052x = transferHistoryEvent;
            m115974k();
        }
    }
}
