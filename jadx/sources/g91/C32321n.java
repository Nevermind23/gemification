package g91;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: g91.n */
public class C32321n implements InputFilter {

    /* renamed from: a */
    private final int f79750a;

    /* renamed from: b */
    private final int f79751b;

    public C32321n(int i, int i2) {
        this.f79750a = i;
        this.f79751b = i2;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = spanned.length() - this.f79751b;
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                char charAt = spanned.charAt(i5);
                if (charAt == '.' || charAt == ',') {
                    break;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 < 0 || (!charSequence.equals(".") && !charSequence.equals(",") && (i4 <= i5 || length - i5 <= this.f79750a))) {
            return null;
        }
        return "";
    }
}
