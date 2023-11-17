package p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarResponse */
public final class FinancialCalendarResponse {
    private final FinancialCalendarEntity pfmData;

    public FinancialCalendarResponse(FinancialCalendarEntity financialCalendarEntity) {
        C41536l.m120489i(financialCalendarEntity, "pfmData");
        this.pfmData = financialCalendarEntity;
    }

    public static /* synthetic */ FinancialCalendarResponse copy$default(FinancialCalendarResponse financialCalendarResponse, FinancialCalendarEntity financialCalendarEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            financialCalendarEntity = financialCalendarResponse.pfmData;
        }
        return financialCalendarResponse.copy(financialCalendarEntity);
    }

    public final FinancialCalendarEntity component1() {
        return this.pfmData;
    }

    public final FinancialCalendarResponse copy(FinancialCalendarEntity financialCalendarEntity) {
        C41536l.m120489i(financialCalendarEntity, "pfmData");
        return new FinancialCalendarResponse(financialCalendarEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FinancialCalendarResponse) && C41536l.m120484d(this.pfmData, ((FinancialCalendarResponse) obj).pfmData);
    }

    public final FinancialCalendarEntity getPfmData() {
        return this.pfmData;
    }

    public int hashCode() {
        return this.pfmData.hashCode();
    }

    public String toString() {
        FinancialCalendarEntity financialCalendarEntity = this.pfmData;
        return "FinancialCalendarResponse(pfmData=" + financialCalendarEntity + ")";
    }
}
