package p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.AggregationsDtoApiEntity */
public final class AggregationsDtoApiEntity {
    private final List<DocDirection> docDirection;

    public AggregationsDtoApiEntity() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AggregationsDtoApiEntity copy$default(AggregationsDtoApiEntity aggregationsDtoApiEntity, List<DocDirection> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aggregationsDtoApiEntity.docDirection;
        }
        return aggregationsDtoApiEntity.copy(list);
    }

    public final List<DocDirection> component1() {
        return this.docDirection;
    }

    public final AggregationsDtoApiEntity copy(List<DocDirection> list) {
        return new AggregationsDtoApiEntity(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AggregationsDtoApiEntity) && C41536l.m120484d(this.docDirection, ((AggregationsDtoApiEntity) obj).docDirection);
    }

    public final List<DocDirection> getDocDirection() {
        return this.docDirection;
    }

    public int hashCode() {
        List<DocDirection> list = this.docDirection;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<DocDirection> list = this.docDirection;
        return "AggregationsDtoApiEntity(docDirection=" + list + ")";
    }

    public AggregationsDtoApiEntity(List<DocDirection> list) {
        this.docDirection = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AggregationsDtoApiEntity(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
