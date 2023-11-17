package g91;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.C41536l;

/* renamed from: g91.f0 */
public final class C32304f0 implements InputFilter {
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            C41536l.m120486f(charSequence);
            char charAt = charSequence.charAt(i);
            if (Character.isLetter(charAt) || Character.isDigit(charAt) || C41536l.m120491k(charAt, 31) > 0 || C41536l.m120491k(charAt, C11051p3.f31760d) < 0) {
                return null;
            }
            i++;
        }
        return "";
    }
}
