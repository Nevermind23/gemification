package p341ge.bog.mobilebank.products.data;

import ed1.C40735b0;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.products.data.ProductsService;
import p341ge.bog.mobilebank.products.data.model.StatementsWrapperApiModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43075l;
import xy0.C39934a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getStatements$1 */
final class ProductsRepositoryImpl$getStatements$1 extends C41537m implements C43075l {
    final /* synthetic */ long $acctKey;
    final /* synthetic */ int $count;
    final /* synthetic */ long $endDate;
    final /* synthetic */ int $from;
    final /* synthetic */ long $startDate;
    final /* synthetic */ ProductsRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductsRepositoryImpl$getStatements$1(ProductsRepositoryImpl productsRepositoryImpl, long j, int i, int i2, long j2, long j3) {
        super(1);
        this.this$0 = productsRepositoryImpl;
        this.$acctKey = j;
        this.$count = i;
        this.$from = i2;
        this.$startDate = j2;
        this.$endDate = j3;
    }

    /* access modifiers changed from: private */
    public static final List invoke$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    public final C40735b0 invoke(Long l) {
        C41536l.m120489i(l, "reportId");
        C40762x statements$default = ProductsService.DefaultImpls.getStatements$default(this.this$0.service, this.$acctKey, l.longValue(), this.$count, this.$from, this.$startDate, this.$endDate, (String) null, 64, (Object) null);
        final ProductsRepositoryImpl productsRepositoryImpl = this.this$0;
        return statements$default.mo95062A(new C33800s(new C43075l() {
            public final List<C39934a> invoke(BankApiResponse<StatementsWrapperApiModel> bankApiResponse) {
                C41536l.m120489i(bankApiResponse, "data");
                StatementsWrapperApiModel result = bankApiResponse.getResult();
                if (result != null) {
                    return productsRepositoryImpl.statementsMapper.convert(result);
                }
                throw new IllegalArgumentException("getAccountReportId result shouldn't be nul".toString());
            }
        }));
    }
}
