package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.CalendarRangeComponent */
public final class CalendarRangeComponent extends Component {
    @C8664c("date_pattern")
    private final String datePattern;
    @C8664c("end_date_title")
    private final String endDateTitle;
    @C8664c("payload_format")
    private final String payloadFormat;
    @C8664c("start_date_title")
    private final String startDateTitle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarRangeComponent(String str, String str2, String str3, String str4) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(str, "startDateTitle");
        C41536l.m120489i(str2, "endDateTitle");
        C41536l.m120489i(str3, "payloadFormat");
        C41536l.m120489i(str4, "datePattern");
        this.startDateTitle = str;
        this.endDateTitle = str2;
        this.payloadFormat = str3;
        this.datePattern = str4;
    }

    public static /* synthetic */ CalendarRangeComponent copy$default(CalendarRangeComponent calendarRangeComponent, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarRangeComponent.startDateTitle;
        }
        if ((i & 2) != 0) {
            str2 = calendarRangeComponent.endDateTitle;
        }
        if ((i & 4) != 0) {
            str3 = calendarRangeComponent.payloadFormat;
        }
        if ((i & 8) != 0) {
            str4 = calendarRangeComponent.datePattern;
        }
        return calendarRangeComponent.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.startDateTitle;
    }

    public final String component2() {
        return this.endDateTitle;
    }

    public final String component3() {
        return this.payloadFormat;
    }

    public final String component4() {
        return this.datePattern;
    }

    public final CalendarRangeComponent copy(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "startDateTitle");
        C41536l.m120489i(str2, "endDateTitle");
        C41536l.m120489i(str3, "payloadFormat");
        C41536l.m120489i(str4, "datePattern");
        return new CalendarRangeComponent(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarRangeComponent)) {
            return false;
        }
        CalendarRangeComponent calendarRangeComponent = (CalendarRangeComponent) obj;
        return C41536l.m120484d(this.startDateTitle, calendarRangeComponent.startDateTitle) && C41536l.m120484d(this.endDateTitle, calendarRangeComponent.endDateTitle) && C41536l.m120484d(this.payloadFormat, calendarRangeComponent.payloadFormat) && C41536l.m120484d(this.datePattern, calendarRangeComponent.datePattern);
    }

    public final String getDatePattern() {
        return this.datePattern;
    }

    public final String getEndDateTitle() {
        return this.endDateTitle;
    }

    public final String getPayloadFormat() {
        return this.payloadFormat;
    }

    public final String getStartDateTitle() {
        return this.startDateTitle;
    }

    public int hashCode() {
        return (((((this.startDateTitle.hashCode() * 31) + this.endDateTitle.hashCode()) * 31) + this.payloadFormat.hashCode()) * 31) + this.datePattern.hashCode();
    }

    public String toString() {
        String str = this.startDateTitle;
        String str2 = this.endDateTitle;
        String str3 = this.payloadFormat;
        String str4 = this.datePattern;
        return "CalendarRangeComponent(startDateTitle=" + str + ", endDateTitle=" + str2 + ", payloadFormat=" + str3 + ", datePattern=" + str4 + ")";
    }
}
