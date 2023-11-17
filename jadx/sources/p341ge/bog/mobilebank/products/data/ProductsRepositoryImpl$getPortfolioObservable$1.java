package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.mapper.GTMapper;
import p341ge.bog.mobilebank.products.data.model.PortfolioOverviewApiModel;
import ue1.C43075l;
import xy0.C39950n;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getPortfolioObservable$1 */
/* synthetic */ class ProductsRepositoryImpl$getPortfolioObservable$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getPortfolioObservable$1(Object obj) {
        super(1, obj, GTMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/PortfolioOverviewApiModel;)Lge/bog/mobilebank/products/domain/model/GTWrapper;", 0);
    }

    public final C39950n invoke(PortfolioOverviewApiModel portfolioOverviewApiModel) {
        C41536l.m120489i(portfolioOverviewApiModel, "p0");
        return ((GTMapper) this.receiver).convert(portfolioOverviewApiModel);
    }
}
