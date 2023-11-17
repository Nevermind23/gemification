package p115i4;

import android.os.Bundle;
import com.facebook.C2645k;
import com.facebook.FacebookException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import p167m4.C7093a;
import p180n4.C7226a;
import p193o4.C7438b;
import p232r4.C8061a;
import p297w4.C8769a0;
import p297w4.C8831r;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: i4.c */
public class C6535c implements Serializable {

    /* renamed from: i */
    private static final HashSet f19969i = new HashSet();
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final JSONObject f19970d;

    /* renamed from: e */
    private final boolean f19971e;

    /* renamed from: f */
    private final boolean f19972f;

    /* renamed from: g */
    private final String f19973g;

    /* renamed from: h */
    private final String f19974h;

    /* renamed from: i4.c$b */
    static class C6537b implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
    }

    /* renamed from: i4.c$c */
    static class C6538c implements Serializable {
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: d */
        private final String f19975d;

        /* renamed from: e */
        private final boolean f19976e;

        /* renamed from: f */
        private final boolean f19977f;

        /* renamed from: g */
        private final String f19978g;

        private Object readResolve() {
            return new C6535c(this.f19975d, this.f19976e, this.f19977f, this.f19978g);
        }

        private C6538c(String str, boolean z, boolean z2, String str2) {
            this.f19975d = str;
            this.f19976e = z;
            this.f19977f = z2;
            this.f19978g = str2;
        }
    }

    /* renamed from: a */
    private String m25808a() {
        return m25810g(this.f19970d.toString());
    }

    /* renamed from: d */
    private JSONObject m25809d(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        m25811h(str2);
        JSONObject jSONObject = new JSONObject();
        String e = C8061a.m30566e(str2);
        jSONObject.put("_eventName", e);
        jSONObject.put("_eventName_md5", m25810g(e));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map i = m25812i(bundle);
            for (String str3 : i.keySet()) {
                jSONObject.put(str3, i.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f19972f) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f19971e) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C8831r.m32867h(C2645k.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    /* renamed from: g */
    private static String m25810g(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return C7438b.m28294c(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C8769a0.m32648U("Failed to generate checksum: ", e);
            return BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        } catch (UnsupportedEncodingException e2) {
            C8769a0.m32648U("Failed to generate checksum: ", e2);
            return "1";
        }
    }

    /* renamed from: h */
    private static void m25811h(String str) {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, 40}));
        }
        HashSet hashSet = f19969i;
        synchronized (hashSet) {
            contains = hashSet.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (hashSet) {
                hashSet.add(str);
            }
            return;
        }
        throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    /* renamed from: i */
    private Map m25812i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            m25811h(next);
            Object obj = bundle.get(next);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(next, obj.toString());
            } else {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, next}));
            }
        }
        C7226a.m27806c(hashMap);
        C8061a.m30567f(hashMap, this.f19973g);
        C7093a.m27382c(hashMap, this.f19973g);
        return hashMap;
    }

    private Object writeReplace() {
        return new C6538c(this.f19970d.toString(), this.f19971e, this.f19972f, this.f19974h);
    }

    /* renamed from: b */
    public boolean mo20513b() {
        return this.f19971e;
    }

    /* renamed from: c */
    public JSONObject mo20514c() {
        return this.f19970d;
    }

    /* renamed from: e */
    public String mo20515e() {
        return this.f19973g;
    }

    /* renamed from: f */
    public boolean mo20516f() {
        if (this.f19974h == null) {
            return true;
        }
        return m25808a().equals(this.f19974h);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f19970d.optString("_eventName"), Boolean.valueOf(this.f19971e), this.f19970d.toString()});
    }

    public C6535c(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        this.f19971e = z;
        this.f19972f = z2;
        this.f19973g = str2;
        this.f19970d = m25809d(str, str2, d, bundle, uuid);
        this.f19974h = m25808a();
    }

    private C6535c(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f19970d = jSONObject;
        this.f19971e = z;
        this.f19973g = jSONObject.optString("_eventName");
        this.f19974h = str2;
        this.f19972f = z2;
    }
}
