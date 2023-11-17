package p341ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity.CashFlowResponse */
public final class CashFlowResponse {
    private final List<CashFlowMonthEntity> pfmData;

    public CashFlowResponse(List<CashFlowMonthEntity> list) {
        C41536l.m120489i(list, "pfmData");
        this.pfmData = list;
    }

    public static /* synthetic */ CashFlowResponse copy$default(CashFlowResponse cashFlowResponse, List<CashFlowMonthEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cashFlowResponse.pfmData;
        }
        return cashFlowResponse.copy(list);
    }

    public final List<CashFlowMonthEntity> component1() {
        return this.pfmData;
    }

    public final CashFlowResponse copy(List<CashFlowMonthEntity> list) {
        C41536l.m120489i(list, "pfmData");
        return new CashFlowResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashFlowResponse) && C41536l.m120484d(this.pfmData, ((CashFlowResponse) obj).pfmData);
    }

    public final List<CashFlowMonthEntity> getPfmData() {
        return this.pfmData;
    }

    public int hashCode() {
        return this.pfmData.hashCode();
    }

    public String toString() {
        List<CashFlowMonthEntity> list = this.pfmData;
        return "CashFlowResponse(pfmData=" + list + ")";
    }
}
