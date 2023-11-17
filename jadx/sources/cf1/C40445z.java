package cf1;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;

/* renamed from: cf1.z */
abstract class C40445z extends C40444y {
    /* renamed from: S0 */
    public static String m117188S0(String str, int i) {
        boolean z;
        C41536l.m120489i(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(C43429k.m124588g(i, str.length()));
            C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: T0 */
    public static CharSequence m117189T0(CharSequence charSequence, int i) {
        boolean z;
        C41536l.m120489i(charSequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m117193X0(charSequence, C43429k.m124585d(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: U0 */
    public static String m117190U0(String str, int i) {
        boolean z;
        C41536l.m120489i(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m117194Y0(str, C43429k.m124585d(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: V0 */
    public static char m117191V0(CharSequence charSequence) {
        boolean z;
        C41536l.m120489i(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: W0 */
    public static Character m117192W0(CharSequence charSequence) {
        boolean z;
        C41536l.m120489i(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    /* renamed from: X0 */
    public static final CharSequence m117193X0(CharSequence charSequence, int i) {
        boolean z;
        C41536l.m120489i(charSequence, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charSequence.subSequence(0, C43429k.m124588g(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: Y0 */
    public static String m117194Y0(String str, int i) {
        boolean z;
        C41536l.m120489i(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(0, C43429k.m124588g(i, str.length()));
            C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: Z0 */
    public static String m117195Z0(String str, int i) {
        boolean z;
        C41536l.m120489i(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length();
            String substring = str.substring(length - C43429k.m124588g(i, length));
            C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
