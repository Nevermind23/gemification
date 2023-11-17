package gi0;

import kotlin.jvm.internal.C41536l;

/* renamed from: gi0.a */
public final class C24726a {
    /* renamed from: a */
    public final String mo63117a(String str) {
        String str2;
        C41536l.m120489i(str, "phoneNumber");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '+') {
                sb.append(charAt);
            } else {
                if (i % 3 != 0 || i <= 0) {
                    str2 = String.valueOf(charAt);
                } else {
                    str2 = " " + charAt;
                }
                sb.append(str2);
                i++;
            }
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "formattedPhoneContact.toString()");
        return sb2;
    }
}
