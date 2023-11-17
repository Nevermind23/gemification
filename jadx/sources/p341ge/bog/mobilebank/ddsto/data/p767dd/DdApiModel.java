package p341ge.bog.mobilebank.ddsto.data.p767dd;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.ddsto.data.dd.DdApiModel */
public final class DdApiModel {
    private final Double amount;

    /* renamed from: id */
    private final Long f59991id;
    private final Long nextPayDate;
    private final String orderName;
    private final Long priority;
    private final String serviceId;

    public DdApiModel(Long l, String str, Long l2, Double d, String str2, Long l3) {
        this.f59991id = l;
        this.orderName = str;
        this.priority = l2;
        this.amount = d;
        this.serviceId = str2;
        this.nextPayDate = l3;
    }

    public static /* synthetic */ DdApiModel copy$default(DdApiModel ddApiModel, Long l, String str, Long l2, Double d, String str2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = ddApiModel.f59991id;
        }
        if ((i & 2) != 0) {
            str = ddApiModel.orderName;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            l2 = ddApiModel.priority;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            d = ddApiModel.amount;
        }
        Double d2 = d;
        if ((i & 16) != 0) {
            str2 = ddApiModel.serviceId;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            l3 = ddApiModel.nextPayDate;
        }
        return ddApiModel.copy(l, str3, l4, d2, str4, l3);
    }

    public final Long component1() {
        return this.f59991id;
    }

    public final String component2() {
        return this.orderName;
    }

    public final Long component3() {
        return this.priority;
    }

    public final Double component4() {
        return this.amount;
    }

    public final String component5() {
        return this.serviceId;
    }

    public final Long component6() {
        return this.nextPayDate;
    }

    public final DdApiModel copy(Long l, String str, Long l2, Double d, String str2, Long l3) {
        return new DdApiModel(l, str, l2, d, str2, l3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DdApiModel)) {
            return false;
        }
        DdApiModel ddApiModel = (DdApiModel) obj;
        return C41536l.m120484d(this.f59991id, ddApiModel.f59991id) && C41536l.m120484d(this.orderName, ddApiModel.orderName) && C41536l.m120484d(this.priority, ddApiModel.priority) && C41536l.m120484d(this.amount, ddApiModel.amount) && C41536l.m120484d(this.serviceId, ddApiModel.serviceId) && C41536l.m120484d(this.nextPayDate, ddApiModel.nextPayDate);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final Long getId() {
        return this.f59991id;
    }

    public final Long getNextPayDate() {
        return this.nextPayDate;
    }

    public final String getOrderName() {
        return this.orderName;
    }

    public final Long getPriority() {
        return this.priority;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        Long l = this.f59991id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.orderName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.priority;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.amount;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.serviceId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.nextPayDate;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        Long l = this.f59991id;
        String str = this.orderName;
        Long l2 = this.priority;
        Double d = this.amount;
        String str2 = this.serviceId;
        Long l3 = this.nextPayDate;
        return "DdApiModel(id=" + l + ", orderName=" + str + ", priority=" + l2 + ", amount=" + d + ", serviceId=" + str2 + ", nextPayDate=" + l3 + ")";
    }
}
