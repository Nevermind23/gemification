package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.products.data.model.AccountReportIdApiModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getAccountReportId$1 */
final class ProductsRepositoryImpl$getAccountReportId$1 extends C41537m implements C43075l {
    public static final ProductsRepositoryImpl$getAccountReportId$1 INSTANCE = new ProductsRepositoryImpl$getAccountReportId$1();

    ProductsRepositoryImpl$getAccountReportId$1() {
        super(1);
    }

    public final Long invoke(BankApiResponse<AccountReportIdApiModel> bankApiResponse) {
        C41536l.m120489i(bankApiResponse, "it");
        AccountReportIdApiModel result = bankApiResponse.getResult();
        if (result != null) {
            return Long.valueOf(result.getReportId());
        }
        throw new IllegalArgumentException("getAccountRepordId result shouldn't be nul".toString());
    }
}
