package ge0;

import p342j$.time.DayOfWeek;

/* renamed from: ge0.a */
public class C24703a implements C24710h {

    /* renamed from: b */
    private final CharSequence[] f63595b;

    public C24703a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Cannot be null");
        } else if (charSequenceArr.length == 7) {
            this.f63595b = charSequenceArr;
        } else {
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
    }

    /* renamed from: a */
    public CharSequence mo63108a(DayOfWeek dayOfWeek) {
        return this.f63595b[dayOfWeek.getValue() - 1];
    }
}
