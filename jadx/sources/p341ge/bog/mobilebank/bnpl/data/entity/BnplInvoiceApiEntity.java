package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplInvoiceApiEntity */
public final class BnplInvoiceApiEntity {
    private final Double amount;
    private final List<BnplInvoiceItemApiEntity> list;
    private final Long paymentDate;

    public BnplInvoiceApiEntity(Long l, Double d, List<BnplInvoiceItemApiEntity> list2) {
        this.paymentDate = l;
        this.amount = d;
        this.list = list2;
    }

    public static /* synthetic */ BnplInvoiceApiEntity copy$default(BnplInvoiceApiEntity bnplInvoiceApiEntity, Long l, Double d, List<BnplInvoiceItemApiEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = bnplInvoiceApiEntity.paymentDate;
        }
        if ((i & 2) != 0) {
            d = bnplInvoiceApiEntity.amount;
        }
        if ((i & 4) != 0) {
            list2 = bnplInvoiceApiEntity.list;
        }
        return bnplInvoiceApiEntity.copy(l, d, list2);
    }

    public final Long component1() {
        return this.paymentDate;
    }

    public final Double component2() {
        return this.amount;
    }

    public final List<BnplInvoiceItemApiEntity> component3() {
        return this.list;
    }

    public final BnplInvoiceApiEntity copy(Long l, Double d, List<BnplInvoiceItemApiEntity> list2) {
        return new BnplInvoiceApiEntity(l, d, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplInvoiceApiEntity)) {
            return false;
        }
        BnplInvoiceApiEntity bnplInvoiceApiEntity = (BnplInvoiceApiEntity) obj;
        return C41536l.m120484d(this.paymentDate, bnplInvoiceApiEntity.paymentDate) && C41536l.m120484d(this.amount, bnplInvoiceApiEntity.amount) && C41536l.m120484d(this.list, bnplInvoiceApiEntity.list);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final List<BnplInvoiceItemApiEntity> getList() {
        return this.list;
    }

    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    public int hashCode() {
        Long l = this.paymentDate;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.amount;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        List<BnplInvoiceItemApiEntity> list2 = this.list;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.paymentDate;
        Double d = this.amount;
        List<BnplInvoiceItemApiEntity> list2 = this.list;
        return "BnplInvoiceApiEntity(paymentDate=" + l + ", amount=" + d + ", list=" + list2 + ")";
    }
}
