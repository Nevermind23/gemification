package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasServiceInfoEntity */
public final class CasServiceInfoEntity {
    private final List<CasServiceProductEntity> clientServices;
    private final List<CasInfoSummaryEntity> summary;

    public CasServiceInfoEntity(List<CasInfoSummaryEntity> list, List<CasServiceProductEntity> list2) {
        this.summary = list;
        this.clientServices = list2;
    }

    public static /* synthetic */ CasServiceInfoEntity copy$default(CasServiceInfoEntity casServiceInfoEntity, List<CasInfoSummaryEntity> list, List<CasServiceProductEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = casServiceInfoEntity.summary;
        }
        if ((i & 2) != 0) {
            list2 = casServiceInfoEntity.clientServices;
        }
        return casServiceInfoEntity.copy(list, list2);
    }

    public final List<CasInfoSummaryEntity> component1() {
        return this.summary;
    }

    public final List<CasServiceProductEntity> component2() {
        return this.clientServices;
    }

    public final CasServiceInfoEntity copy(List<CasInfoSummaryEntity> list, List<CasServiceProductEntity> list2) {
        return new CasServiceInfoEntity(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasServiceInfoEntity)) {
            return false;
        }
        CasServiceInfoEntity casServiceInfoEntity = (CasServiceInfoEntity) obj;
        return C41536l.m120484d(this.summary, casServiceInfoEntity.summary) && C41536l.m120484d(this.clientServices, casServiceInfoEntity.clientServices);
    }

    public final List<CasServiceProductEntity> getClientServices() {
        return this.clientServices;
    }

    public final List<CasInfoSummaryEntity> getSummary() {
        return this.summary;
    }

    public int hashCode() {
        List<CasInfoSummaryEntity> list = this.summary;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CasServiceProductEntity> list2 = this.clientServices;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        List<CasInfoSummaryEntity> list = this.summary;
        List<CasServiceProductEntity> list2 = this.clientServices;
        return "CasServiceInfoEntity(summary=" + list + ", clientServices=" + list2 + ")";
    }
}
