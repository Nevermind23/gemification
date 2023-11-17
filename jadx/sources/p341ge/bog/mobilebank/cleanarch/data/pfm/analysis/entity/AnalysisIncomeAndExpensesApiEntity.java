package p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.AnalysisIncomeAndExpensesApiEntity */
public final class AnalysisIncomeAndExpensesApiEntity {
    private final List<AnalysisChildrenApiEntity> children;
    private final BigDecimal value;

    public AnalysisIncomeAndExpensesApiEntity(List<AnalysisChildrenApiEntity> list, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "children");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        this.children = list;
        this.value = bigDecimal;
    }

    public static /* synthetic */ AnalysisIncomeAndExpensesApiEntity copy$default(AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity, List<AnalysisChildrenApiEntity> list, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = analysisIncomeAndExpensesApiEntity.children;
        }
        if ((i & 2) != 0) {
            bigDecimal = analysisIncomeAndExpensesApiEntity.value;
        }
        return analysisIncomeAndExpensesApiEntity.copy(list, bigDecimal);
    }

    public final List<AnalysisChildrenApiEntity> component1() {
        return this.children;
    }

    public final BigDecimal component2() {
        return this.value;
    }

    public final AnalysisIncomeAndExpensesApiEntity copy(List<AnalysisChildrenApiEntity> list, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "children");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        return new AnalysisIncomeAndExpensesApiEntity(list, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalysisIncomeAndExpensesApiEntity)) {
            return false;
        }
        AnalysisIncomeAndExpensesApiEntity analysisIncomeAndExpensesApiEntity = (AnalysisIncomeAndExpensesApiEntity) obj;
        return C41536l.m120484d(this.children, analysisIncomeAndExpensesApiEntity.children) && C41536l.m120484d(this.value, analysisIncomeAndExpensesApiEntity.value);
    }

    public final List<AnalysisChildrenApiEntity> getChildren() {
        return this.children;
    }

    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.children.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        List<AnalysisChildrenApiEntity> list = this.children;
        BigDecimal bigDecimal = this.value;
        return "AnalysisIncomeAndExpensesApiEntity(children=" + list + ", value=" + bigDecimal + ")";
    }
}
