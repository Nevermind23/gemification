package p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsSumApiEntity */
public final class TransactionsSumApiEntity {
    private final AggregationsDtoApiEntity aggregationsDto;

    public TransactionsSumApiEntity() {
        this((AggregationsDtoApiEntity) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TransactionsSumApiEntity copy$default(TransactionsSumApiEntity transactionsSumApiEntity, AggregationsDtoApiEntity aggregationsDtoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            aggregationsDtoApiEntity = transactionsSumApiEntity.aggregationsDto;
        }
        return transactionsSumApiEntity.copy(aggregationsDtoApiEntity);
    }

    public final AggregationsDtoApiEntity component1() {
        return this.aggregationsDto;
    }

    public final TransactionsSumApiEntity copy(AggregationsDtoApiEntity aggregationsDtoApiEntity) {
        return new TransactionsSumApiEntity(aggregationsDtoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransactionsSumApiEntity) && C41536l.m120484d(this.aggregationsDto, ((TransactionsSumApiEntity) obj).aggregationsDto);
    }

    public final AggregationsDtoApiEntity getAggregationsDto() {
        return this.aggregationsDto;
    }

    public int hashCode() {
        AggregationsDtoApiEntity aggregationsDtoApiEntity = this.aggregationsDto;
        if (aggregationsDtoApiEntity == null) {
            return 0;
        }
        return aggregationsDtoApiEntity.hashCode();
    }

    public String toString() {
        AggregationsDtoApiEntity aggregationsDtoApiEntity = this.aggregationsDto;
        return "TransactionsSumApiEntity(aggregationsDto=" + aggregationsDtoApiEntity + ")";
    }

    public TransactionsSumApiEntity(AggregationsDtoApiEntity aggregationsDtoApiEntity) {
        this.aggregationsDto = aggregationsDtoApiEntity;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransactionsSumApiEntity(AggregationsDtoApiEntity aggregationsDtoApiEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aggregationsDtoApiEntity);
    }
}
