package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.products.data.mapper.CreditCardsLegacyWrapperMapper;
import ue1.C43075l;
import xy0.C39948l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getCreditCardAccountsAndDetails$1 */
/* synthetic */ class ProductsRepositoryImpl$getCreditCardAccountsAndDetails$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getCreditCardAccountsAndDetails$1(Object obj) {
        super(1, obj, CreditCardsLegacyWrapperMapper.class, "convert", "convert(Lge/bog/mobilebank/model/credit/CreditCardsWrapper;)Lge/bog/mobilebank/products/domain/model/CreditCardsWrapper;", 0);
    }

    public final C39948l invoke(CreditCardsWrapper creditCardsWrapper) {
        C41536l.m120489i(creditCardsWrapper, "p0");
        return ((CreditCardsLegacyWrapperMapper) this.receiver).convert(creditCardsWrapper);
    }
}
