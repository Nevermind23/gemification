package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facetec.sdk.jg */
public final class C3242jg {

    /* renamed from: a */
    public static final C3242jg f10577a = m13015d("TLS_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: b */
    static final Comparator<String> f10578b = new Comparator<String>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (i < min) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt == charAt2) {
                    i++;
                } else if (charAt < charAt2) {
                    return -1;
                } else {
                    return 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: c */
    public static final C3242jg f10579c = m13015d("TLS_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: d */
    public static final C3242jg f10580d = m13015d("TLS_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: e */
    public static final C3242jg f10581e = m13015d("SSL_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: f */
    public static final C3242jg f10582f = m13015d("TLS_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: g */
    public static final C3242jg f10583g = m13015d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: h */
    public static final C3242jg f10584h = m13015d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: i */
    public static final C3242jg f10585i = m13015d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: j */
    public static final C3242jg f10586j = m13015d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: k */
    public static final C3242jg f10587k = m13015d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: l */
    public static final C3242jg f10588l = m13015d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: m */
    public static final C3242jg f10589m = m13015d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: n */
    public static final C3242jg f10590n = m13015d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: o */
    public static final C3242jg f10591o = m13015d("TLS_AES_128_GCM_SHA256");

    /* renamed from: p */
    public static final C3242jg f10592p = m13015d("TLS_AES_128_CCM_SHA256");

    /* renamed from: q */
    public static final C3242jg f10593q = m13015d("TLS_CHACHA20_POLY1305_SHA256");

    /* renamed from: s */
    public static final C3242jg f10594s = m13015d("TLS_AES_256_CCM_8_SHA256");

    /* renamed from: t */
    public static final C3242jg f10595t = m13015d("TLS_AES_256_GCM_SHA384");

    /* renamed from: v */
    private static final Map<String, C3242jg> f10596v = new LinkedHashMap();

    /* renamed from: r */
    final String f10597r;

    static {
        m13015d("SSL_RSA_WITH_NULL_MD5");
        m13015d("SSL_RSA_WITH_NULL_SHA");
        m13015d("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m13015d("SSL_RSA_WITH_RC4_128_MD5");
        m13015d("SSL_RSA_WITH_RC4_128_SHA");
        m13015d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m13015d("SSL_RSA_WITH_DES_CBC_SHA");
        m13015d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m13015d("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m13015d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m13015d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m13015d("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m13015d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m13015d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m13015d("SSL_DH_anon_WITH_RC4_128_MD5");
        m13015d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m13015d("SSL_DH_anon_WITH_DES_CBC_SHA");
        m13015d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m13015d("TLS_KRB5_WITH_DES_CBC_SHA");
        m13015d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m13015d("TLS_KRB5_WITH_RC4_128_SHA");
        m13015d("TLS_KRB5_WITH_DES_CBC_MD5");
        m13015d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m13015d("TLS_KRB5_WITH_RC4_128_MD5");
        m13015d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m13015d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m13015d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m13015d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        m13015d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m13015d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m13015d("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        m13015d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        m13015d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m13015d("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m13015d("TLS_RSA_WITH_NULL_SHA256");
        m13015d("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m13015d("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m13015d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m13015d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m13015d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m13015d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m13015d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m13015d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m13015d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m13015d("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m13015d("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m13015d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m13015d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m13015d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m13015d("TLS_PSK_WITH_RC4_128_SHA");
        m13015d("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m13015d("TLS_PSK_WITH_AES_128_CBC_SHA");
        m13015d("TLS_PSK_WITH_AES_256_CBC_SHA");
        m13015d("TLS_RSA_WITH_SEED_CBC_SHA");
        m13015d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        m13015d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m13015d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m13015d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m13015d("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m13015d("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m13015d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m13015d("TLS_FALLBACK_SCSV");
        m13015d("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m13015d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m13015d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m13015d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m13015d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m13015d("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m13015d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m13015d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m13015d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        m13015d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m13015d("TLS_ECDH_RSA_WITH_NULL_SHA");
        m13015d("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m13015d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m13015d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m13015d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m13015d("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m13015d("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m13015d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m13015d("TLS_ECDH_anon_WITH_NULL_SHA");
        m13015d("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m13015d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m13015d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m13015d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m13015d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m13015d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m13015d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m13015d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m13015d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        m13015d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m13015d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m13015d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        m13015d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m13015d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        m13015d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m13015d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m13015d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m13015d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        m13015d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m13015d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    }

    private C3242jg(String str) {
        str.getClass();
        this.f10597r = str;
    }

    /* renamed from: a */
    static List<C3242jg> m13013a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b : strArr) {
            arrayList.add(m13014b(b));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public static synchronized C3242jg m13014b(String str) {
        C3242jg jgVar;
        String str2;
        synchronized (C3242jg.class) {
            Map<String, C3242jg> map = f10596v;
            jgVar = map.get(str);
            if (jgVar == null) {
                if (str.startsWith("TLS_")) {
                    StringBuilder sb = new StringBuilder("SSL_");
                    sb.append(str.substring(4));
                    str2 = sb.toString();
                } else if (str.startsWith("SSL_")) {
                    StringBuilder sb2 = new StringBuilder("TLS_");
                    sb2.append(str.substring(4));
                    str2 = sb2.toString();
                } else {
                    str2 = str;
                }
                jgVar = map.get(str2);
                if (jgVar == null) {
                    jgVar = new C3242jg(str);
                }
                map.put(str, jgVar);
            }
        }
        return jgVar;
    }

    /* renamed from: d */
    private static C3242jg m13015d(String str) {
        C3242jg jgVar = new C3242jg(str);
        f10596v.put(str, jgVar);
        return jgVar;
    }

    public final String toString() {
        return this.f10597r;
    }
}
