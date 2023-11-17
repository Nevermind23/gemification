package com.medallia.digital.mobilesdk;

import android.webkit.URLUtil;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.medallia.digital.mobilesdk.u2 */
final class C11110u2 {

    /* renamed from: a */
    private static final String f31948a = "file://";

    /* renamed from: b */
    private static final int f31949b = 4;

    /* renamed from: c */
    public static final String f31950c = "/";

    C11110u2() {
    }

    /* renamed from: a */
    protected static String m40740a(String str) {
        String host;
        try {
            if (URLUtil.isValidUrl(str) && (host = new URL(str).getHost()) != null) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        return str;
    }

    /* renamed from: a */
    private static boolean m40741a(String str, String str2) {
        if (!str.equals(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(f31950c);
            return str.equals(sb.toString());
        }
    }

    /* renamed from: a */
    protected static boolean m40742a(String str, boolean z, ArrayList<String> arrayList, String str2, FormTriggerType formTriggerType) {
        if (str.startsWith(f31948a)) {
            return false;
        }
        if (z) {
            return true;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            String a = m40740a(str);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!m40741a(str, next)) {
                    if (a.endsWith(next)) {
                    }
                }
            }
            return true;
        }
        Broadcasts.C10688d.m38944a(Broadcasts.C10688d.C10689a.formLinkSelected, str2, formTriggerType, str);
        return false;
    }
}
