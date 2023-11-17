package f51;

import cf1.C40412h;
import cf1.C40419j;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: f51.a */
public abstract class C31925a {

    /* renamed from: f51.a$a */
    static final class C31926a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C31926a f78681d = new C31926a();

        C31926a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C40412h hVar) {
            C41536l.m120489i(hVar, "codePoint");
            char[] chars = Character.toChars(Integer.parseInt(C40439w.m117103B(hVar.getValue(), "U+", "", false, 4, (Object) null), C40405b.m116976a(16)));
            C41536l.m120488h(chars, "toChars(unicodeInt)");
            return C40439w.m117110n(chars);
        }
    }

    /* renamed from: a */
    public static final String m94278a(String str) {
        C41536l.m120489i(str, "<this>");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (Character.isHighSurrogate(charAt)) {
                i++;
                String hexString = Integer.toHexString(Character.toCodePoint(charAt, str.charAt(i)));
                C41536l.m120488h(hexString, "toHexString(codePoint)");
                String upperCase = hexString.toUpperCase(Locale.ROOT);
                C41536l.m120488h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                sb.append("U+" + upperCase);
            } else {
                sb.append(charAt);
            }
            i++;
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "strBuilder.toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final String m94279b(String str) {
        C41536l.m120489i(str, "<this>");
        try {
            return new C40419j("U\\+[A-Fa-f0-9]{5}").mo94491h(str, C31926a.f78681d);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }
}
