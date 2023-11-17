package p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarEntity */
public final class FinancialCalendarEntity {
    private final int confirmedPatterns;
    private final Map<String, FinancialCalendarDayEntity> days;

    public FinancialCalendarEntity(int i, Map<String, FinancialCalendarDayEntity> map) {
        C41536l.m120489i(map, "days");
        this.confirmedPatterns = i;
        this.days = map;
    }

    public static /* synthetic */ FinancialCalendarEntity copy$default(FinancialCalendarEntity financialCalendarEntity, int i, Map<String, FinancialCalendarDayEntity> map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = financialCalendarEntity.confirmedPatterns;
        }
        if ((i2 & 2) != 0) {
            map = financialCalendarEntity.days;
        }
        return financialCalendarEntity.copy(i, map);
    }

    public final int component1() {
        return this.confirmedPatterns;
    }

    public final Map<String, FinancialCalendarDayEntity> component2() {
        return this.days;
    }

    public final FinancialCalendarEntity copy(int i, Map<String, FinancialCalendarDayEntity> map) {
        C41536l.m120489i(map, "days");
        return new FinancialCalendarEntity(i, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialCalendarEntity)) {
            return false;
        }
        FinancialCalendarEntity financialCalendarEntity = (FinancialCalendarEntity) obj;
        return this.confirmedPatterns == financialCalendarEntity.confirmedPatterns && C41536l.m120484d(this.days, financialCalendarEntity.days);
    }

    public final int getConfirmedPatterns() {
        return this.confirmedPatterns;
    }

    public final Map<String, FinancialCalendarDayEntity> getDays() {
        return this.days;
    }

    public int hashCode() {
        return (this.confirmedPatterns * 31) + this.days.hashCode();
    }

    public String toString() {
        int i = this.confirmedPatterns;
        Map<String, FinancialCalendarDayEntity> map = this.days;
        return "FinancialCalendarEntity(confirmedPatterns=" + i + ", days=" + map + ")";
    }
}
