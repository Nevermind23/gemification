package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.p3 */
final class C11051p3 {

    /* renamed from: a */
    public static final int f31757a = 2;

    /* renamed from: b */
    public static final int f31758b = 4095;

    /* renamed from: c */
    public static final int f31759c = 255;

    /* renamed from: d */
    public static final int f31760d = 127;

    /* renamed from: e */
    public static final int f31761e = 32;

    /* renamed from: f */
    public static final int f31762f = 15;

    C11051p3() {
    }

    /* renamed from: a */
    protected static Object m40514a(Object obj) {
        return obj != null ? obj : JSONObject.NULL;
    }

    /* renamed from: b */
    protected static String m40517b(String str) {
        String str2;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt > 4095) {
                str2 = "\\u";
            } else if (charAt > 255) {
                str2 = "\\u0";
            } else {
                if (charAt <= 127) {
                    if (charAt < ' ') {
                        switch (charAt) {
                            case 8:
                                sb.append('\\');
                                charAt = 'b';
                                break;
                            case 9:
                                sb.append('\\');
                                charAt = 't';
                                break;
                            case 10:
                                sb.append('\\');
                                charAt = 'n';
                                break;
                            case 12:
                                sb.append('\\');
                                charAt = 'f';
                                break;
                            case 13:
                                sb.append('\\');
                                charAt = 'r';
                                break;
                            default:
                                if (charAt <= 15) {
                                    str2 = "\\u000";
                                    break;
                                }
                                break;
                        }
                    } else {
                        char c = '\"';
                        if (charAt != '\"') {
                            c = '\'';
                            if (charAt != '\'') {
                                if (charAt == '\\') {
                                    sb.append('\\');
                                    sb.append('\\');
                                }
                            }
                        }
                        sb.append('\\');
                        sb.append(c);
                    }
                    sb.append(charAt);
                }
                str2 = "\\u00";
            }
            sb.append(str2);
            sb.append(Integer.toHexString(charAt));
        }
        return sb.toString();
    }

    /* renamed from: c */
    protected static String m40518c(String str) {
        if (str != null) {
            str = str.replace("\n", "\\n");
        }
        if (str == null) {
            return "null";
        }
        return "\"" + str + "\"";
    }

    /* renamed from: d */
    protected static String m40519d(String str) {
        if (str != null) {
            str = m40517b(str);
        }
        if (str == null) {
            return "null";
        }
        return "\"" + str + "\"";
    }

    /* renamed from: e */
    protected static String m40520e(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != '\\') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    protected static String m40515a(String str) {
        return str != null ? str.replace("\"", "\\\"") : str;
    }

    /* renamed from: a */
    protected static String m40516a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "'";
        String str3 = z ? str2 : "%27";
        if (z) {
            str2 = "%27";
        }
        return str.replace(str3, str2);
    }
}
