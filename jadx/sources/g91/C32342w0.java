package g91;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: g91.w0 */
public class C32342w0 implements InputFilter {
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (!Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '/' && charAt != '-' && charAt != '?' && charAt != ':' && charAt != '(' && charAt != ')' && charAt != '.' && charAt != ',' && charAt != '\'' && charAt != '+' && charAt != ' ') {
                return "";
            }
            i++;
        }
        return null;
    }
}
