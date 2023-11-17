package p341ge.bog.mobilebank.products.data;

import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40762x;
import hd1.C41205b;
import iu0.C36546y;
import j51.C36735g;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import m70.C26156i;
import m70.C26157j;
import md0.C26186e;
import md0.C26191f;
import n70.C26374a;
import nd0.C26453c;
import o70.C26762a;
import o70.C26764c;
import o70.C26766e;
import od0.C26940a;
import od0.C26941b;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DepositBondsContainer;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.products.data.mapper.AccountsApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.BondsWrapperApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.CardsAndDetailsApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.ChildMBankMapper;
import p341ge.bog.mobilebank.products.data.mapper.ContractApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.CreditCardsLegacyWrapperMapper;
import p341ge.bog.mobilebank.products.data.mapper.GTMapper;
import p341ge.bog.mobilebank.products.data.mapper.LiabilityInfoMapper;
import p341ge.bog.mobilebank.products.data.mapper.LoansWrapperLegacyModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.PensionApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.ProductTypeApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.StatementsMapper;
import p341ge.bog.mobilebank.products.data.model.CreateClientUserApiModel;
import p341ge.bog.mobilebank.products.data.model.ExtServiceStatusApiModel;
import p341ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel;
import p70.C27239a;
import p707as.C19273c;
import pd0.C27503h;
import q70.C27686b;
import sy0.C38605a;
import sy0.C38606b;
import ue1.C43075l;
import xy0.C39934a;
import xy0.C39941e;
import xy0.C39944h;
import xy0.C39945i;
import xy0.C39950n;
import xy0.C39960x;
import xy0.C39961y;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl */
public final class ProductsRepositoryImpl implements C38606b, C26941b {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String PROCESS_REFERENCE = "processReference";
    private final /* synthetic */ C26940a $$delegate_0 = new C26940a();
    private final C27503h accountsAndDetailsStore = addToStores(new C27503h());
    /* access modifiers changed from: private */
    public final AccountsApiModelMapper accountsMapper;
    private final BondsWrapperApiModelMapper bondsWrapperApiModelMapper;
    /* access modifiers changed from: private */
    public final CardsAndDetailsApiModelMapper cardsAndDetailsApiModelMapper;
    private final C27503h cardsAndDetailsStore = addToStores(new C27503h());
    private final ChildMBankMapper childMBankMapper;
    private final Client client;
    private final C27503h closableAccountsStore = addToStores(new C27503h());
    private final ContractApiModelMapper contractApiModelMapper;
    private final C27503h creditCardsStore = addToStores(new C27503h());
    private final CreditCardsLegacyWrapperMapper creditCardsWrapperApiMapper;
    private final C27503h depositsStore = addToStores(new C27503h());
    private final C27503h galtsStore = addToStores(new C27503h());
    private final C36735g getLoginInfo;
    private final GTMapper gtMapper;
    private final C27503h gtsStore = addToStores(new C27503h());
    private final LiabilityInfoMapper liabilityInfoMapper;
    private final C27503h loansStore = addToStores(new C27503h());
    private final LoansWrapperLegacyModelMapper loansWrapperApiModelMapper;
    private final PensionApiModelMapper pensionApiModelMapper;
    private final C27503h pensionStore = addToStores(new C27503h());
    private final C38605a preferencesManager;
    private final ProductTypeApiModelMapper productTypeMapper;
    private final C27503h productTypeStore = addToStores(new C27503h());
    /* access modifiers changed from: private */
    public final ProductsService service;
    /* access modifiers changed from: private */
    public final StatementsMapper statementsMapper;

    /* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProductsRepositoryImpl(ProductsService productsService, Client client2, ProductTypeApiModelMapper productTypeApiModelMapper, AccountsApiModelMapper accountsApiModelMapper, CardsAndDetailsApiModelMapper cardsAndDetailsApiModelMapper2, LoansWrapperLegacyModelMapper loansWrapperLegacyModelMapper, CreditCardsLegacyWrapperMapper creditCardsLegacyWrapperMapper, BondsWrapperApiModelMapper bondsWrapperApiModelMapper2, PensionApiModelMapper pensionApiModelMapper2, ContractApiModelMapper contractApiModelMapper2, GTMapper gTMapper, StatementsMapper statementsMapper2, ChildMBankMapper childMBankMapper2, LiabilityInfoMapper liabilityInfoMapper2, C38605a aVar, C36735g gVar) {
        ProductsService productsService2 = productsService;
        Client client3 = client2;
        ProductTypeApiModelMapper productTypeApiModelMapper2 = productTypeApiModelMapper;
        AccountsApiModelMapper accountsApiModelMapper2 = accountsApiModelMapper;
        CardsAndDetailsApiModelMapper cardsAndDetailsApiModelMapper3 = cardsAndDetailsApiModelMapper2;
        LoansWrapperLegacyModelMapper loansWrapperLegacyModelMapper2 = loansWrapperLegacyModelMapper;
        CreditCardsLegacyWrapperMapper creditCardsLegacyWrapperMapper2 = creditCardsLegacyWrapperMapper;
        BondsWrapperApiModelMapper bondsWrapperApiModelMapper3 = bondsWrapperApiModelMapper2;
        PensionApiModelMapper pensionApiModelMapper3 = pensionApiModelMapper2;
        ContractApiModelMapper contractApiModelMapper3 = contractApiModelMapper2;
        GTMapper gTMapper2 = gTMapper;
        StatementsMapper statementsMapper3 = statementsMapper2;
        ChildMBankMapper childMBankMapper3 = childMBankMapper2;
        LiabilityInfoMapper liabilityInfoMapper3 = liabilityInfoMapper2;
        C41536l.m120489i(productsService2, "service");
        C41536l.m120489i(client3, "client");
        C41536l.m120489i(productTypeApiModelMapper2, "productTypeMapper");
        C41536l.m120489i(accountsApiModelMapper2, "accountsMapper");
        C41536l.m120489i(cardsAndDetailsApiModelMapper3, "cardsAndDetailsApiModelMapper");
        C41536l.m120489i(loansWrapperLegacyModelMapper2, "loansWrapperApiModelMapper");
        C41536l.m120489i(creditCardsLegacyWrapperMapper2, "creditCardsWrapperApiMapper");
        C41536l.m120489i(bondsWrapperApiModelMapper3, "bondsWrapperApiModelMapper");
        C41536l.m120489i(pensionApiModelMapper3, "pensionApiModelMapper");
        C41536l.m120489i(contractApiModelMapper3, "contractApiModelMapper");
        C41536l.m120489i(gTMapper2, "gtMapper");
        C41536l.m120489i(statementsMapper3, "statementsMapper");
        C41536l.m120489i(childMBankMapper3, "childMBankMapper");
        C41536l.m120489i(liabilityInfoMapper3, "liabilityInfoMapper");
        C41536l.m120489i(aVar, "preferencesManager");
        C36735g gVar2 = gVar;
        C41536l.m120489i(gVar2, "getLoginInfo");
        this.service = productsService2;
        this.client = client3;
        this.productTypeMapper = productTypeApiModelMapper2;
        this.accountsMapper = accountsApiModelMapper2;
        this.cardsAndDetailsApiModelMapper = cardsAndDetailsApiModelMapper3;
        this.loansWrapperApiModelMapper = loansWrapperLegacyModelMapper2;
        this.creditCardsWrapperApiMapper = creditCardsLegacyWrapperMapper2;
        this.bondsWrapperApiModelMapper = bondsWrapperApiModelMapper3;
        this.pensionApiModelMapper = pensionApiModelMapper3;
        this.contractApiModelMapper = contractApiModelMapper3;
        this.gtMapper = gTMapper2;
        this.statementsMapper = statementsMapper3;
        this.childMBankMapper = childMBankMapper3;
        this.liabilityInfoMapper = liabilityInfoMapper3;
        this.preferencesManager = aVar;
        this.getLoginInfo = gVar2;
    }

    /* access modifiers changed from: private */
    public static final CheckChildMBankActiveModel checkChildMBankActive$lambda$19(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (CheckChildMBankActiveModel) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final C26374a deactivateAccount$lambda$30(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26374a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final C40749p<C26156i> getAccountDetailsObservable() {
        return this.service.getAccountsAndDetails().mo95026k0(new C33790i(new ProductsRepositoryImpl$getAccountDetailsObservable$1(this.accountsMapper)));
    }

    /* access modifiers changed from: private */
    public static final C26156i getAccountDetailsObservable$lambda$25(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26156i) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final Long getAccountReportId$lambda$12(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Long) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final C40749p<C39941e> getAgreementDetailsObservable() {
        return this.service.getAgreementsAndDetails().mo95026k0(new C33786e(new ProductsRepositoryImpl$getAgreementDetailsObservable$1(this.bondsWrapperApiModelMapper)));
    }

    /* access modifiers changed from: private */
    public static final C39941e getAgreementDetailsObservable$lambda$23(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C39941e) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final C40749p<C26766e> getCardAndDetailsObservable() {
        return this.service.getCardsAndDetails().mo95026k0(new C33793l(new ProductsRepositoryImpl$getCardAndDetailsObservable$1(this.cardsAndDetailsApiModelMapper)));
    }

    /* access modifiers changed from: private */
    public static final C26766e getCardAndDetailsObservable$lambda$24(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26766e) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final C26762a getCardBlockStatus$lambda$4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26762a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final C26764c getCardExtraDetails$lambda$3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26764c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final C40749p<List<C26157j>> getClosableAccountsObservable() {
        return this.service.getClosableAccounts(getCustomerId()).mo95026k0(new C33797p(new ProductsRepositoryImpl$getClosableAccountsObservable$1(this)));
    }

    /* access modifiers changed from: private */
    public static final List getClosableAccountsObservable$lambda$28(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final List getCommonProductTypes$lambda$21(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final C39945i getContract$lambda$17(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C39945i) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final C39945i getContract$lambda$18(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C39945i) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final C40749p<CreditCardsWrapper> getCreditCardsObservable() {
        return this.service.getCreditCardAccountsAndDetails();
    }

    private final long getCustomerId() {
        C37228a a = this.getLoginInfo.mo89562a();
        if (a != null) {
            return a.mo90305b();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public final C40749p<DepositBondsContainer> getDepositsAndBondsObservable() {
        return this.service.getLegacyDepositsAndBondsWithDetails();
    }

    /* access modifiers changed from: private */
    public static final C27239a getLiabilitiesOverdueDetails$lambda$20(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27239a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final C40749p<LoansWrapper> getLoansWithDetailsObservable() {
        return this.service.getLoansWithDetails();
    }

    /* access modifiers changed from: private */
    public final C40749p<PensionResult> getPensionAmountObservable() {
        return this.service.getPensionAmount();
    }

    /* access modifiers changed from: private */
    public static final C39961y getPensionStatus$lambda$14(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C39961y) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final C40749p<C39950n> getPortfolioObservable() {
        return this.service.getPortfolioOverview().mo95026k0(new C33792k(new ProductsRepositoryImpl$getPortfolioObservable$1(this.gtMapper)));
    }

    /* access modifiers changed from: private */
    public static final C39950n getPortfolioObservable$lambda$22(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C39950n) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final C40749p<List<C27686b>> getProductTypesObservable() {
        return this.service.getProductTypesList().mo95026k0(new C33788g(new ProductsRepositoryImpl$getProductTypesObservable$1(this.productTypeMapper)));
    }

    /* access modifiers changed from: private */
    public static final List getProductTypesObservable$lambda$26(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final C40735b0 getStatements$lambda$13(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    private final void loadAccountsAndDetails(boolean z) {
        this.accountsAndDetailsStore.mo66814o(z, new ProductsRepositoryImpl$loadAccountsAndDetails$1(this)).mo94979E0();
        if (z) {
            this.client.requestAccountLovs(true, false);
        }
    }

    private final void loadAgreementDetails(boolean z) {
        this.galtsStore.mo66814o(z, new ProductsRepositoryImpl$loadAgreementDetails$1(this)).mo94979E0();
    }

    private final void loadCardsAndDetails(boolean z) {
        this.cardsAndDetailsStore.mo66814o(z, new ProductsRepositoryImpl$loadCardsAndDetails$1(this)).mo94979E0();
    }

    private final C41205b loadClosableAccounts(boolean z) {
        return this.closableAccountsStore.mo66814o(z, new ProductsRepositoryImpl$loadClosableAccounts$1(this)).mo94979E0();
    }

    private final void loadCreditCards(boolean z) {
        this.creditCardsStore.mo66814o(z, new ProductsRepositoryImpl$loadCreditCards$1(this)).mo94979E0();
    }

    private final void loadDepositsAndBonds(boolean z) {
        this.depositsStore.mo66814o(z, new ProductsRepositoryImpl$loadDepositsAndBonds$1(this)).mo94979E0();
    }

    private final void loadGTDetails(boolean z) {
        this.gtsStore.mo66814o(z, new ProductsRepositoryImpl$loadGTDetails$1(this)).mo94979E0();
    }

    private final void loadLoansWithDetails(boolean z) {
        this.loansStore.mo66814o(z, new ProductsRepositoryImpl$loadLoansWithDetails$1(this)).mo94979E0();
    }

    private final void loadPensionAmount(boolean z) {
        this.pensionStore.mo66814o(z, new ProductsRepositoryImpl$loadPensionAmount$1(this)).mo94979E0();
    }

    private final void loadProductTypes(boolean z) {
        this.productTypeStore.mo66814o(z, new ProductsRepositoryImpl$loadProductTypes$1(this)).mo94979E0();
    }

    /* access modifiers changed from: private */
    public static final C26374a validateAccountBeforeDeactivation$lambda$29(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26374a) lVar.invoke(obj);
    }

    public C40734b activateClientChannel(long j, long j2) {
        return this.service.activateClientChannel(j, j2);
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.$$delegate_0.addStore(hVar);
    }

    public <T> C27503h addToStores(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.$$delegate_0.mo66226a(hVar);
    }

    public C40734b changeAccountName(long j, String str) {
        C41536l.m120489i(str, "newName");
        return this.service.changeAccountName(j, str);
    }

    public C40734b changeCardName(long j, String str) {
        return this.service.changeCardName(j, str);
    }

    public C40734b changeProductDefault(String str, String str2, String str3) {
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(str2, "productKey");
        C41536l.m120489i(str3, "isDefault");
        return this.service.changeProductDefault(str, str2, str3);
    }

    public C40734b changeProductVisibility(String str, String str2, String str3) {
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(str2, "productKey");
        C41536l.m120489i(str3, "hide");
        return this.service.changeProductVisibility(str, str2, str3);
    }

    public C40762x<CheckChildMBankActiveModel> checkChildMBankActive(long j) {
        C40762x<CheckChildMBankActiveModel> A = this.service.checkChildMBankActive(j).mo95062A(new C33782a(new ProductsRepositoryImpl$checkChildMBankActive$1(this.childMBankMapper)));
        C41536l.m120488h(A, "service.checkChildMBankA…hildMBankMapper::convert)");
        return A;
    }

    public void clean() {
        cleanStores();
    }

    public void cleanStores() {
        this.$$delegate_0.mo66227b();
    }

    public C40734b confirmClientDocument(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "serviceKey");
        C41536l.m120489i(str2, "text");
        C41536l.m120489i(str3, "productReference");
        C41536l.m120489i(str4, "serviceStatus");
        C41536l.m120489i(str5, "clientType");
        return this.service.confirmClientDocument(str, str2, str3, str4, str5);
    }

    public C40762x<CreateClientUserApiModel> createClientUser(long j) {
        return this.service.createClientUser(j);
    }

    public C40762x<C26374a> deactivateAccount(long j) {
        C40762x<C26374a> A = this.service.deactivateAccount(getCustomerId(), j).mo95062A(new C33796o(new ProductsRepositoryImpl$deactivateAccount$1(this)));
        C41536l.m120488h(A, "override fun deactivateA…ountsMapper.convert(it) }");
        return A;
    }

    public C40762x<Long> getAccountReportId(long j, long j2, long j3) {
        C40762x<Long> A = this.service.getAccountRepordId(j, j2, j3).mo95062A(new C33794m(ProductsRepositoryImpl$getAccountReportId$1.INSTANCE));
        C41536l.m120488h(A, "service.getAccountRepord… }.reportId\n            }");
        return A;
    }

    public C40749p<C26191f> getAccountsAndDetails(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.accountsAndDetailsStore.mo66812m());
        loadAccountsAndDetails(z);
        return e;
    }

    public C40749p<C26191f> getAgreementsAndDetails(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.galtsStore.mo66812m());
        loadAgreementDetails(z);
        return e;
    }

    public C40762x<C26762a> getCardBlockStatus(long j) {
        C40762x<C26762a> A = this.service.getCardBlockStatus(j).mo95062A(new C33795n(new ProductsRepositoryImpl$getCardBlockStatus$1(this.cardsAndDetailsApiModelMapper)));
        C41536l.m120488h(A, "service.getCardBlockStat…sApiModelMapper::convert)");
        return A;
    }

    public C40762x<C26764c> getCardExtraDetails(HashMap<String, Object> hashMap) {
        C41536l.m120489i(hashMap, "params");
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.put(PROCESS_REFERENCE, C36546y.m108285N().mo89317P().getExtCustomerId());
        C40762x<C26764c> A = this.service.getCardExtraDetails(hashMap2).mo95062A(new C33789h(new ProductsRepositoryImpl$getCardExtraDetails$1(this)));
        C41536l.m120488h(A, "override fun getCardExtr…sult)\n            }\n    }");
        return A;
    }

    public C40749p<C26191f> getCardsAndDetails(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.cardsAndDetailsStore.mo66812m());
        loadCardsAndDetails(z);
        return e;
    }

    public C40749p<C26191f> getClosableAccounts(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.closableAccountsStore.mo66812m());
        loadClosableAccounts(z);
        return e;
    }

    public C40762x<List<C39944h>> getCommonProductTypes() {
        C40762x<List<C39944h>> A = this.service.getProductTypes().mo95062A(new C33799r(new ProductsRepositoryImpl$getCommonProductTypes$1(this.productTypeMapper)));
        C41536l.m120488h(A, "service.getProductTypes(…uctTypeMapper::transform)");
        return A;
    }

    public C40762x<C39945i> getContract(String str) {
        C41536l.m120489i(str, "contractType");
        C40762x<C39945i> A = this.service.getContract(str).mo95062A(new C33784c(new ProductsRepositoryImpl$getContract$1(this.contractApiModelMapper)));
        C41536l.m120488h(A, "service.getContract(cont…tApiModelMapper::convert)");
        return A;
    }

    public C40749p<C26191f> getCreditCardAccountsAndDetails(boolean z) {
        C40749p<C26191f> c = C26453c.m82745c(this.creditCardsStore.mo66812m(), new ProductsRepositoryImpl$getCreditCardAccountsAndDetails$1(this.creditCardsWrapperApiMapper));
        loadCreditCards(z);
        return c;
    }

    public C40762x<ExtServiceStatusApiModel> getExtServiceStatus(String str) {
        C41536l.m120489i(str, "serviceKey");
        return this.service.getExtServiceStatus(str);
    }

    public C40749p<C26191f> getGTDetails(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.gtsStore.mo66812m());
        loadGTDetails(z);
        return e;
    }

    public C40749p<C26191f> getLegacyCreditCardAccountsAndDetails(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.creditCardsStore.mo66812m());
        loadCreditCards(z);
        return e;
    }

    public C40749p<C26191f> getLegacyDepositsAndBondsWithDetails(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.depositsStore.mo66812m());
        loadDepositsAndBonds(z);
        return e;
    }

    public C40749p<C26191f> getLegacyLoansWithDetails(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.loansStore.mo66812m());
        loadLoansWithDetails(z);
        return e;
    }

    public C40749p<C26191f> getLegacyPensionAmount(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.pensionStore.mo66812m());
        loadPensionAmount(z);
        return e;
    }

    public C40762x<C27239a> getLiabilitiesOverdueDetails() {
        C40762x<C27239a> A = this.service.getLiabilitiesOverdueDetails().mo95062A(new C33783b(new ProductsRepositoryImpl$getLiabilitiesOverdueDetails$1(this.liabilityInfoMapper)));
        C41536l.m120488h(A, "service.getLiabilitiesOv…ilityInfoMapper::convert)");
        return A;
    }

    public C40749p<C26191f> getLoansWithDetails(boolean z) {
        C40749p<C26191f> c = C26453c.m82745c(this.loansStore.mo66812m(), new ProductsRepositoryImpl$getLoansWithDetails$1(this.loansWrapperApiModelMapper));
        loadLoansWithDetails(z);
        return c;
    }

    public C40762x<C39960x> getPensionAmount() {
        C40762x<C39960x> h = C26186e.m81990h(C26453c.m82745c(this.pensionStore.mo66812m(), new ProductsRepositoryImpl$getPensionAmount$1(this.pensionApiModelMapper)));
        loadPensionAmount(false);
        return h;
    }

    public C40762x<C39961y> getPensionStatus() {
        C40762x<C39961y> A = this.service.getPensionStatus().mo95062A(new C33785d(new ProductsRepositoryImpl$getPensionStatus$1(this.pensionApiModelMapper)));
        C41536l.m120488h(A, "service.getPensionStatus…nApiModelMapper::convert)");
        return A;
    }

    public C40749p<C26191f> getProductTypes(boolean z) {
        C40749p<C26191f> e = C26453c.m82747e(this.productTypeStore.mo66812m());
        loadProductTypes(z);
        return e;
    }

    public C40762x<List<C39934a>> getStatements(long j, int i, int i2, long j2, long j3) {
        C40762x<List<C39934a>> r = getAccountReportId(j, j2, j3).mo95087r(new C33798q(new ProductsRepositoryImpl$getStatements$1(this, j, i2, i, j2, j3)));
        C41536l.m120488h(r, "override fun getStatemen…    }\n            }\n    }");
        return r;
    }

    public void hideCardsInsuranceBanner(long j) {
        this.preferencesManager.hideCardsInsuranceBanner(getCustomerId(), j);
    }

    public boolean isCardsInsuranceBannerHidden(long j) {
        return this.preferencesManager.isCardsInsuranceBannerHidden(getCustomerId(), j);
    }

    public void refreshAccountsAndDetails() {
        loadAccountsAndDetails(true);
    }

    public void refreshAgreementDetails() {
        loadAgreementDetails(true);
    }

    public void refreshCardsAndDetails() {
        loadCardsAndDetails(true);
    }

    public void refreshDepositsAndBonds() {
        loadDepositsAndBonds(true);
    }

    public void refreshLoansWithDetails() {
        loadLoansWithDetails(true);
    }

    public void refreshProductTypes() {
        loadProductTypes(true);
    }

    public C40734b sendClientContractConfirmation(String str, String str2, long j) {
        C41536l.m120489i(str, "route");
        C41536l.m120489i(str2, "contact");
        return this.service.sendClientContractConfirmation(str, str2, j);
    }

    public C40734b sendPensionAccess(boolean z) {
        return this.service.sendPensionAccess(z ? 1 : 0);
    }

    public C40734b toggleCardBlock(HashMap<String, Object> hashMap) {
        C41536l.m120489i(hashMap, "params");
        return C19273c.m64720f(this.service.useOtpForActionSingle(hashMap));
    }

    public C40734b useScaForAction(HashMap<String, Object> hashMap) {
        C41536l.m120489i(hashMap, "params");
        return this.service.useScaForAction(hashMap);
    }

    public C40762x<C26374a> validateAccountBeforeDeactivation(long j) {
        C40762x<C26374a> A = this.service.validateAccountBeforeDeactivation(getCustomerId(), j).mo95062A(new C33787f(new ProductsRepositoryImpl$validateAccountBeforeDeactivation$1(this)));
        C41536l.m120488h(A, "override fun validateAcc…ountsMapper.convert(it) }");
        return A;
    }

    public C40734b validateClientConfirmation(String str, String str2, long j, String str3) {
        C41536l.m120489i(str, "route");
        C41536l.m120489i(str2, "contact");
        C41536l.m120489i(str3, "confirmationCode");
        return this.service.validateContractConfirmation(str, str2, j, str3);
    }

    public C40762x<C39945i> getContract(String str, long j) {
        C41536l.m120489i(str, "contractType");
        C40762x<C39945i> A = this.service.getContract(str, j).mo95062A(new C33791j(new ProductsRepositoryImpl$getContract$2(this.contractApiModelMapper)));
        C41536l.m120488h(A, "service.getContract(cont…tApiModelMapper::convert)");
        return A;
    }
}
