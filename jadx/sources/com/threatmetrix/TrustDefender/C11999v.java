package com.threatmetrix.TrustDefender;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11969r1;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p585re.C17602s;

/* renamed from: com.threatmetrix.TrustDefender.v */
public class C11999v {

    /* renamed from: d */
    private static final String f35318d = C11907h.m43615j(C11999v.class);

    /* renamed from: e */
    private static final Pattern f35319e = Pattern.compile("^[a-zA-Z0-9]{8}$");

    /* renamed from: f */
    private static final Map f35320f;

    /* renamed from: g */
    public static final Map f35321g;

    /* renamed from: h */
    public static final String f35322h;

    /* renamed from: a */
    private final String f35323a;

    /* renamed from: b */
    public final String f35324b;

    /* renamed from: c */
    public final String f35325c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Cache-Control", "no-cache, no-store, must-revalidate, no-transform");
        f35321g = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap(hashMap);
        String m = C11914j.m43686m();
        f35322h = m;
        hashMap2.put("Accept-Language", m);
        f35320f = Collections.unmodifiableMap(hashMap2);
    }

    public C11999v(String str, String str2, String str3) {
        this.f35323a = str3;
        this.f35325c = str2;
        this.f35324b = str;
    }

    /* renamed from: e */
    public static boolean m44072e(String str) {
        if (str != null && !str.isEmpty() && f35319e.matcher(str).find()) {
            return true;
        }
        C11907h.m43609d(f35318d, "Invalid org_id");
        return false;
    }

    /* renamed from: f */
    public static Map m44073f(C11927l1 l1Var, String str, int i) {
        HashMap hashMap = new HashMap(f35320f);
        if (!C11921k0.m43732o(str)) {
            str = null;
        }
        if (l1Var != null) {
            hashMap.put("Referer", l1Var.f34904h);
            if (str == null && C11921k0.m43732o(l1Var.f34905i)) {
                str = l1Var.f34905i;
            }
            hashMap.put("Cookie", "thx_guid=" + l1Var.f34902f);
        }
        if (str != null) {
            hashMap.put("User-Agent", str);
        }
        if (i > 0) {
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
            hashMap.put("Content-Encoding", "gzip");
            hashMap.put("Content-Length", Integer.toString(i));
        }
        return hashMap;
    }

    /* renamed from: g */
    public static boolean m44074g(String str) {
        if (str == null) {
            str = "h-sdk.online-metrix.net";
        }
        try {
            new URL("https://" + str);
            return false;
        } catch (MalformedURLException e) {
            String str2 = f35318d;
            C11907h.m43619n(str2, "Invalid hostname " + str, e);
            return true;
        }
    }

    /* renamed from: a */
    public String mo32094a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(str);
        sb.append("/fp/");
        sb.append(str3);
        if (C11921k0.m43732o(str2)) {
            sb.append(";CIS3SID=");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public String mo32095b(String str, String str2, String str3) {
        String str4;
        String str5;
        StringBuilder sb = new StringBuilder(this.f35325c);
        if (C11921k0.m43739v(str2) || C11921k0.m43739v(str3)) {
            str4 = f35318d;
            str5 = "Failed to generate DNS domain: invalid nonce or dnsDomain";
        } else {
            String t = C11921k0.m43737t(str.getBytes());
            int indexOf = str3.indexOf(".");
            int length = this.f35325c.length() + (t != null ? t.length() : 0) + str2.length();
            if (indexOf < 0) {
                indexOf = str3.length();
            }
            if (length + indexOf >= 64) {
                str4 = f35318d;
                str5 = "Combined org id, session id, nonce (optional) and postfix is too long for host name fragment";
            } else {
                sb.append(t);
                sb.append(str2);
                sb.append(str3);
                String str6 = f35318d;
                C11907h.C11908a.m43624b(str6, "FQDN is " + sb.toString());
                return sb.toString();
            }
        }
        C11907h.C11908a.m43624b(str4, str5);
        return null;
    }

    /* renamed from: c */
    public C17602s mo32096c(String str) {
        C17602s sVar = new C17602s();
        sVar.mo45183c("org_id", this.f35325c);
        sVar.mo45183c("session_id", str);
        sVar.mo45183c("os", C11914j.m43671V());
        sVar.mo45183c("osVersion", C11969r1.C11983n.C11984a.f35245a);
        sVar.mo45183c(C11772k.C11773a.f34186r, "6.3-81");
        String str2 = this.f35323a;
        if (str2 != null && !str2.isEmpty()) {
            sVar.mo45183c("api_key", this.f35323a);
        }
        return sVar;
    }

    /* renamed from: d */
    public String mo32097d() {
        return "https://" + this.f35324b + "/fp/mobile/conf";
    }
}
