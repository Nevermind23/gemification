package p670xi;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xi.g */
public abstract class C18770g {
    /* renamed from: a */
    public static final String m63517a(String str) {
        C41536l.m120489i(str, "<this>");
        List x0 = C40440x.m117182x0(str, new String[]{"@"}, false, 0, 6, (Object) null);
        String str2 = "";
        if (x0.size() < 2) {
            return str2;
        }
        String str3 = (String) x0.get(0);
        int length = str3.length();
        for (int i = 0; i < length; i++) {
            if ((i != 0 || str3.length() <= 1) && (i != str3.length() - 1 || str3.length() <= 4)) {
                str2 = str2 + "*";
            } else {
                str2 = str2 + str3.charAt(i);
            }
        }
        return str2 + "@" + x0.get(1);
    }

    /* renamed from: b */
    public static final String m63518b(String str) {
        C41536l.m120489i(str, "<this>");
        String str2 = "";
        if (str.length() < 3) {
            return str2;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == str.length() - 1 || i == str.length() - 2 || str.charAt(i) == ' ') {
                str2 = str2 + str.charAt(i);
            } else {
                str2 = str2 + "*";
            }
        }
        return str2;
    }
}
