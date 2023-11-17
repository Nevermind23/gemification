package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.products.data.mapper.LoansWrapperLegacyModelMapper;
import ue1.C43075l;
import xy0.C39959w;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getLoansWithDetails$1 */
/* synthetic */ class ProductsRepositoryImpl$getLoansWithDetails$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getLoansWithDetails$1(Object obj) {
        super(1, obj, LoansWrapperLegacyModelMapper.class, "convert", "convert(Lge/bog/mobilebank/model/loans/LoansWrapper;)Lge/bog/mobilebank/products/domain/model/LoansWrapper;", 0);
    }

    public final C39959w invoke(LoansWrapper loansWrapper) {
        C41536l.m120489i(loansWrapper, "p0");
        return ((LoansWrapperLegacyModelMapper) this.receiver).convert(loansWrapper);
    }
}
