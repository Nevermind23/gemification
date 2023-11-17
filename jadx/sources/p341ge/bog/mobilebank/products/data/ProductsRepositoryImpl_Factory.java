package p341ge.bog.mobilebank.products.data;

import ge1.C41084a;
import j51.C36735g;
import p341ge.bog.mobilebank.model.Client;
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
import sy0.C38605a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl_Factory */
public final class ProductsRepositoryImpl_Factory implements C41084a {
    private final C41084a accountsMapperProvider;
    private final C41084a bondsWrapperApiModelMapperProvider;
    private final C41084a cardsAndDetailsApiModelMapperProvider;
    private final C41084a childMBankMapperProvider;
    private final C41084a clientProvider;
    private final C41084a contractApiModelMapperProvider;
    private final C41084a creditCardsWrapperApiMapperProvider;
    private final C41084a getLoginInfoProvider;
    private final C41084a gtMapperProvider;
    private final C41084a liabilityInfoMapperProvider;
    private final C41084a loansWrapperApiModelMapperProvider;
    private final C41084a pensionApiModelMapperProvider;
    private final C41084a preferencesManagerProvider;
    private final C41084a productTypeMapperProvider;
    private final C41084a serviceProvider;
    private final C41084a statementsMapperProvider;

    public ProductsRepositoryImpl_Factory(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6, C41084a aVar7, C41084a aVar8, C41084a aVar9, C41084a aVar10, C41084a aVar11, C41084a aVar12, C41084a aVar13, C41084a aVar14, C41084a aVar15, C41084a aVar16) {
        this.serviceProvider = aVar;
        this.clientProvider = aVar2;
        this.productTypeMapperProvider = aVar3;
        this.accountsMapperProvider = aVar4;
        this.cardsAndDetailsApiModelMapperProvider = aVar5;
        this.loansWrapperApiModelMapperProvider = aVar6;
        this.creditCardsWrapperApiMapperProvider = aVar7;
        this.bondsWrapperApiModelMapperProvider = aVar8;
        this.pensionApiModelMapperProvider = aVar9;
        this.contractApiModelMapperProvider = aVar10;
        this.gtMapperProvider = aVar11;
        this.statementsMapperProvider = aVar12;
        this.childMBankMapperProvider = aVar13;
        this.liabilityInfoMapperProvider = aVar14;
        this.preferencesManagerProvider = aVar15;
        this.getLoginInfoProvider = aVar16;
    }

    public static ProductsRepositoryImpl_Factory create(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5, C41084a aVar6, C41084a aVar7, C41084a aVar8, C41084a aVar9, C41084a aVar10, C41084a aVar11, C41084a aVar12, C41084a aVar13, C41084a aVar14, C41084a aVar15, C41084a aVar16) {
        return new ProductsRepositoryImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16);
    }

    public static ProductsRepositoryImpl newInstance(ProductsService productsService, Client client, ProductTypeApiModelMapper productTypeApiModelMapper, AccountsApiModelMapper accountsApiModelMapper, CardsAndDetailsApiModelMapper cardsAndDetailsApiModelMapper, LoansWrapperLegacyModelMapper loansWrapperLegacyModelMapper, CreditCardsLegacyWrapperMapper creditCardsLegacyWrapperMapper, BondsWrapperApiModelMapper bondsWrapperApiModelMapper, PensionApiModelMapper pensionApiModelMapper, ContractApiModelMapper contractApiModelMapper, GTMapper gTMapper, StatementsMapper statementsMapper, ChildMBankMapper childMBankMapper, LiabilityInfoMapper liabilityInfoMapper, C38605a aVar, C36735g gVar) {
        return new ProductsRepositoryImpl(productsService, client, productTypeApiModelMapper, accountsApiModelMapper, cardsAndDetailsApiModelMapper, loansWrapperLegacyModelMapper, creditCardsLegacyWrapperMapper, bondsWrapperApiModelMapper, pensionApiModelMapper, contractApiModelMapper, gTMapper, statementsMapper, childMBankMapper, liabilityInfoMapper, aVar, gVar);
    }

    public ProductsRepositoryImpl get() {
        return newInstance((ProductsService) this.serviceProvider.get(), (Client) this.clientProvider.get(), (ProductTypeApiModelMapper) this.productTypeMapperProvider.get(), (AccountsApiModelMapper) this.accountsMapperProvider.get(), (CardsAndDetailsApiModelMapper) this.cardsAndDetailsApiModelMapperProvider.get(), (LoansWrapperLegacyModelMapper) this.loansWrapperApiModelMapperProvider.get(), (CreditCardsLegacyWrapperMapper) this.creditCardsWrapperApiMapperProvider.get(), (BondsWrapperApiModelMapper) this.bondsWrapperApiModelMapperProvider.get(), (PensionApiModelMapper) this.pensionApiModelMapperProvider.get(), (ContractApiModelMapper) this.contractApiModelMapperProvider.get(), (GTMapper) this.gtMapperProvider.get(), (StatementsMapper) this.statementsMapperProvider.get(), (ChildMBankMapper) this.childMBankMapperProvider.get(), (LiabilityInfoMapper) this.liabilityInfoMapperProvider.get(), (C38605a) this.preferencesManagerProvider.get(), (C36735g) this.getLoginInfoProvider.get());
    }
}
