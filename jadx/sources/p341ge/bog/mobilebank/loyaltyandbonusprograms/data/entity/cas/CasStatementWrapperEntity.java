package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasStatementWrapperEntity */
public final class CasStatementWrapperEntity {
    private final List<CasStatementEntity> list;

    public CasStatementWrapperEntity(List<CasStatementEntity> list2) {
        C41536l.m120489i(list2, "list");
        this.list = list2;
    }

    public static /* synthetic */ CasStatementWrapperEntity copy$default(CasStatementWrapperEntity casStatementWrapperEntity, List<CasStatementEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list2 = casStatementWrapperEntity.list;
        }
        return casStatementWrapperEntity.copy(list2);
    }

    public final List<CasStatementEntity> component1() {
        return this.list;
    }

    public final CasStatementWrapperEntity copy(List<CasStatementEntity> list2) {
        C41536l.m120489i(list2, "list");
        return new CasStatementWrapperEntity(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CasStatementWrapperEntity) && C41536l.m120484d(this.list, ((CasStatementWrapperEntity) obj).list);
    }

    public final List<CasStatementEntity> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        List<CasStatementEntity> list2 = this.list;
        return "CasStatementWrapperEntity(list=" + list2 + ")";
    }
}
