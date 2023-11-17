package p018b0;

import android.text.Spanned;
import android.widget.TextView;

/* renamed from: b0.a */
public abstract class C2108a {
    /* renamed from: a */
    private static boolean m8159a(CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        boolean z2;
        if (charSequence == null) {
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m8160b(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!m8159a(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }
}
