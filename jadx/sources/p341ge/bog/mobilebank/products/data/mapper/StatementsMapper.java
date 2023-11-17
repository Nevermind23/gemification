package p341ge.bog.mobilebank.products.data.mapper;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.model.AccountStatementApiModel;
import p341ge.bog.mobilebank.products.data.model.CurrencyApiModel;
import p341ge.bog.mobilebank.products.data.model.StatementsWrapperApiModel;
import xy0.C39934a;
import xy0.C39949m;

/* renamed from: ge.bog.mobilebank.products.data.mapper.StatementsMapper */
public final class StatementsMapper {
    public final List<C39934a> convert(StatementsWrapperApiModel statementsWrapperApiModel) {
        C41536l.m120489i(statementsWrapperApiModel, "data");
        List<AccountStatementApiModel> statement = statementsWrapperApiModel.getStatement();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(statement, 10));
        for (AccountStatementApiModel accountStatementApiModel : statement) {
            String postDate = accountStatementApiModel.getPostDate();
            String entryComment = accountStatementApiModel.getEntryComment();
            List<CurrencyApiModel> amounts = accountStatementApiModel.getAmounts();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(amounts, 10));
            for (CurrencyApiModel currencyApiModel : amounts) {
                arrayList2.add(new C39949m(currencyApiModel.getAmount(), currencyApiModel.getCurrency()));
            }
            arrayList.add(new C39934a(postDate, entryComment, arrayList2));
        }
        return arrayList;
    }
}
