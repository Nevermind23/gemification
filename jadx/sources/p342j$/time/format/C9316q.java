package p342j$.time.format;

import p342j$.time.temporal.TemporalField;
import p342j$.time.temporal.WeekFields;

/* renamed from: j$.time.format.q */
final class C9316q implements C9306g {

    /* renamed from: a */
    private char f25814a;

    /* renamed from: b */
    private int f25815b;

    C9316q(char c, int i) {
        this.f25814a = c;
        this.f25815b = i;
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        C9310k kVar;
        TemporalField temporalField;
        WeekFields of = WeekFields.m34453of(vVar.mo25078c());
        char c = this.f25814a;
        if (c == 'W') {
            temporalField = of.weekOfMonth();
        } else if (c == 'Y') {
            TemporalField d = of.mo25118d();
            int i = this.f25815b;
            if (i == 2) {
                kVar = new C9313n(d, C9313n.f25806i, 0);
            } else {
                kVar = new C9310k(d, i, 19, i < 4 ? C9299A.NORMAL : C9299A.EXCEEDS_PAD, -1);
            }
            return kVar.mo25039a(vVar, sb);
        } else if (c == 'c' || c == 'e') {
            temporalField = of.dayOfWeek();
        } else if (c == 'w') {
            temporalField = of.mo25120e();
        } else {
            throw new IllegalStateException("unreachable");
        }
        kVar = new C9310k(temporalField, this.f25815b == 2 ? 2 : 1, 2, C9299A.NOT_NEGATIVE);
        return kVar.mo25039a(vVar, sb);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        char c = this.f25814a;
        if (c == 'Y') {
            int i = this.f25815b;
            if (i == 1) {
                sb.append("WeekBasedYear");
            } else if (i == 2) {
                sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb.append("WeekBasedYear,");
                sb.append(this.f25815b);
                sb.append(",19,");
                sb.append(this.f25815b < 4 ? C9299A.NORMAL : C9299A.EXCEEDS_PAD);
            }
        } else {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(this.f25815b);
        }
        sb.append(")");
        return sb.toString();
    }
}
