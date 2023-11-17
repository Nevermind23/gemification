package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.StatementsWrapperApiModel */
public final class StatementsWrapperApiModel {
    private final List<AccountStatementApiModel> statement;

    public StatementsWrapperApiModel(List<AccountStatementApiModel> list) {
        C41536l.m120489i(list, "statement");
        this.statement = list;
    }

    public static /* synthetic */ StatementsWrapperApiModel copy$default(StatementsWrapperApiModel statementsWrapperApiModel, List<AccountStatementApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = statementsWrapperApiModel.statement;
        }
        return statementsWrapperApiModel.copy(list);
    }

    public final List<AccountStatementApiModel> component1() {
        return this.statement;
    }

    public final StatementsWrapperApiModel copy(List<AccountStatementApiModel> list) {
        C41536l.m120489i(list, "statement");
        return new StatementsWrapperApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatementsWrapperApiModel) && C41536l.m120484d(this.statement, ((StatementsWrapperApiModel) obj).statement);
    }

    public final List<AccountStatementApiModel> getStatement() {
        return this.statement;
    }

    public int hashCode() {
        return this.statement.hashCode();
    }

    public String toString() {
        List<AccountStatementApiModel> list = this.statement;
        return "StatementsWrapperApiModel(statement=" + list + ")";
    }
}
