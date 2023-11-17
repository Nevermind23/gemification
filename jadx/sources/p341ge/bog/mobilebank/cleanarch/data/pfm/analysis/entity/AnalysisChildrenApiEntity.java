package p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.AnalysisChildrenApiEntity */
public final class AnalysisChildrenApiEntity {
    private final List<AnalysisChildrenApiEntity> children;
    private final String color;

    /* renamed from: id */
    private final long f56452id;
    @C8664c("title")
    private final String titleKey;
    private final BigDecimal value;

    public AnalysisChildrenApiEntity(List<AnalysisChildrenApiEntity> list, String str, long j, String str2, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "color");
        C41536l.m120489i(str2, "titleKey");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        this.children = list;
        this.color = str;
        this.f56452id = j;
        this.titleKey = str2;
        this.value = bigDecimal;
    }

    public static /* synthetic */ AnalysisChildrenApiEntity copy$default(AnalysisChildrenApiEntity analysisChildrenApiEntity, List<AnalysisChildrenApiEntity> list, String str, long j, String str2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = analysisChildrenApiEntity.children;
        }
        if ((i & 2) != 0) {
            str = analysisChildrenApiEntity.color;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            j = analysisChildrenApiEntity.f56452id;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str2 = analysisChildrenApiEntity.titleKey;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bigDecimal = analysisChildrenApiEntity.value;
        }
        return analysisChildrenApiEntity.copy(list, str3, j2, str4, bigDecimal);
    }

    public final List<AnalysisChildrenApiEntity> component1() {
        return this.children;
    }

    public final String component2() {
        return this.color;
    }

    public final long component3() {
        return this.f56452id;
    }

    public final String component4() {
        return this.titleKey;
    }

    public final BigDecimal component5() {
        return this.value;
    }

    public final AnalysisChildrenApiEntity copy(List<AnalysisChildrenApiEntity> list, String str, long j, String str2, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "color");
        C41536l.m120489i(str2, "titleKey");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        return new AnalysisChildrenApiEntity(list, str, j, str2, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalysisChildrenApiEntity)) {
            return false;
        }
        AnalysisChildrenApiEntity analysisChildrenApiEntity = (AnalysisChildrenApiEntity) obj;
        return C41536l.m120484d(this.children, analysisChildrenApiEntity.children) && C41536l.m120484d(this.color, analysisChildrenApiEntity.color) && this.f56452id == analysisChildrenApiEntity.f56452id && C41536l.m120484d(this.titleKey, analysisChildrenApiEntity.titleKey) && C41536l.m120484d(this.value, analysisChildrenApiEntity.value);
    }

    public final List<AnalysisChildrenApiEntity> getChildren() {
        return this.children;
    }

    public final String getColor() {
        return this.color;
    }

    public final long getId() {
        return this.f56452id;
    }

    public final String getTitleKey() {
        return this.titleKey;
    }

    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        List<AnalysisChildrenApiEntity> list = this.children;
        return ((((((((list == null ? 0 : list.hashCode()) * 31) + this.color.hashCode()) * 31) + C7397t.m28148a(this.f56452id)) * 31) + this.titleKey.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        List<AnalysisChildrenApiEntity> list = this.children;
        String str = this.color;
        long j = this.f56452id;
        String str2 = this.titleKey;
        BigDecimal bigDecimal = this.value;
        return "AnalysisChildrenApiEntity(children=" + list + ", color=" + str + ", id=" + j + ", titleKey=" + str2 + ", value=" + bigDecimal + ")";
    }
}
