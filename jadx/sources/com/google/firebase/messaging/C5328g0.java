package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.g0 */
public class C5328g0 {

    /* renamed from: a */
    private final Bundle f17051a;

    public C5328g0(Bundle bundle) {
        if (bundle != null) {
            this.f17051a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    private static int m21071d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m21072s(String str) {
        if (str.startsWith("google.c.a.") || str.equals("from")) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m21073t(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m21075v("gcm.n.e")))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private static boolean m21074u(String str) {
        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private static String m21075v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m21076w(String str) {
        if (!this.f17051a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = m21075v(str);
            if (this.f17051a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m21077z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: a */
    public boolean mo17581a(String str) {
        String p = mo17595p(str);
        if ("1".equals(p) || Boolean.parseBoolean(p)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Integer mo17582b(String str) {
        String p = mo17595p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m21077z(str) + "(" + p + ") into an int");
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray mo17583c(String str) {
        String p = mo17595p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m21077z(str) + ": " + p + ", falling back to default");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo17584e() {
        JSONArray c = mo17583c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m21071d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri mo17585f() {
        String p = mo17595p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = mo17595p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] mo17586g(String str) {
        JSONArray c = mo17583c(str + "_loc_args");
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String mo17587h(String str) {
        return mo17595p(str + "_loc_key");
    }

    /* renamed from: i */
    public String mo17588i(Resources resources, String str, String str2) {
        String h = mo17587h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m21077z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g = mo17586g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m21077z(str2) + ": " + Arrays.toString(g) + " Default value will be used.", e);
            return null;
        }
    }

    /* renamed from: j */
    public Long mo17589j(String str) {
        String p = mo17595p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m21077z(str) + "(" + p + ") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String mo17590k() {
        return mo17595p("gcm.n.android_channel_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer mo17591l() {
        Integer b = mo17582b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b + ". Skipping setting notificationCount.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer mo17592m() {
        Integer b = mo17582b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String mo17593n(Resources resources, String str, String str2) {
        String p = mo17595p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return mo17588i(resources, str, str2);
    }

    /* renamed from: o */
    public String mo17594o() {
        String p = mo17595p("gcm.n.sound2");
        if (TextUtils.isEmpty(p)) {
            return mo17595p("gcm.n.sound");
        }
        return p;
    }

    /* renamed from: p */
    public String mo17595p(String str) {
        return this.f17051a.getString(m21076w(str));
    }

    /* renamed from: q */
    public long[] mo17596q() {
        JSONArray c = mo17583c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo17597r() {
        Integer b = mo17582b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: x */
    public Bundle mo17598x() {
        Bundle bundle = new Bundle(this.f17051a);
        for (String next : this.f17051a.keySet()) {
            if (!m21072s(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle mo17599y() {
        Bundle bundle = new Bundle(this.f17051a);
        for (String next : this.f17051a.keySet()) {
            if (m21074u(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}
