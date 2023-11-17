package ge0;

import android.text.SpannableStringBuilder;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;

/* renamed from: ge0.f */
public class C24708f implements C24709g {

    /* renamed from: b */
    private final CharSequence[] f63599b;

    public C24708f(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Label array cannot be null");
        } else if (charSequenceArr.length >= 12) {
            this.f63599b = charSequenceArr;
        } else {
            throw new IllegalArgumentException("Label array is too short");
        }
    }

    /* renamed from: a */
    public CharSequence mo63110a(CalendarDay calendarDay) {
        return new SpannableStringBuilder().append(this.f63599b[calendarDay.mo58864f() - 1]).append(" ").append(String.valueOf(calendarDay.mo58865g()));
    }
}
