package com.salesforce.marketingcloud.http;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Build;
import com.medallia.digital.mobilesdk.C10749b8;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.util.C11824l;
import java.net.URL;
import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.http.a */
public enum C11474a {
    ET_ANALYTICS("POST", 1, "/device/v1/event/analytic", "application/json", "application/json", "analytics_next_retry_time"),
    PI_ANALYTICS("POST", 2, "{0}", "application/json", "application/json", "piwama_next_retry_time"),
    INBOX_MESSAGE("GET", 1, "/device/v1/{0}/message/?deviceid={1}&messagetype=8&contenttype=2", "application/json", "application/json", "inbox_next_retry_time"),
    USER_INITIATED_INBOX_MESSAGE(r19.f33357f, r19.f33352a, r19.f33353b, r19.f33355d, r19.f33356e, r19.f33354c, C10749b8.C10751b.f30743b),
    INBOX_STATUS("PATCH", 1, "/device/v1/{0}/message", "application/json", "application/json", "inbox_status_next_retry_time"),
    GEOFENCE_MESSAGE("GET", 1, "/device/v1/location/{0}/fence/?latitude={1,number,#.########}&longitude={2,number,#.########}&deviceid={3}", "application/json", "application/json", "geofence_next_retry_time"),
    PROXIMITY_MESSAGES("GET", 1, "/device/v1/location/{0}/proximity/?latitude={1,number,#.########}&longitude={2,number,#.########}&deviceid={3}", "application/json", "application/json", "proximity_next_retry_time"),
    REGISTRATION("POST", 1, "/device/v1/registration", "application/json", "application/json", "registration_next_retry_time", C10749b8.C10751b.f30743b),
    SYNC("POST", 1, "/device/v1/{0}/sync/{1}", "application/json", "application/json", "sync_next_retry_time"),
    DEVICE_STATS("POST", 1, "/devicestatistics/v1/analytic", "application/json", "application/json", "et_device_stats_retry_after");
    

    /* renamed from: r */
    public static final String f33347r = "X-Subscriber-Token";

    /* renamed from: s */
    private static final String f33348s = "Bearer %s";

    /* renamed from: t */
    private static final String f33349t = null;

    /* renamed from: u */
    private static final long f33350u = 86400000;

    /* renamed from: a */
    public final int f33352a;

    /* renamed from: b */
    public final String f33353b;

    /* renamed from: c */
    public final String f33354c;

    /* renamed from: d */
    public final String f33355d;

    /* renamed from: e */
    public final String f33356e;

    /* renamed from: f */
    public final String f33357f;

    /* renamed from: g */
    public final long f33358g;

    /* renamed from: com.salesforce.marketingcloud.http.a$a */
    private static class C11475a {

        /* renamed from: a */
        static final int f33359a = 1;

        /* renamed from: b */
        static final int f33360b = 2;

        private C11475a() {
        }
    }

    static {
        f33349t = String.format(C11824l.f34333a, "MarketingCloudSdk/%s (Android %s; %%s; %s/%s) %%s/%%s", new Object[]{MarketingCloudSdk.getSdkVersionName(), Build.VERSION.RELEASE, Build.MANUFACTURER, Build.MODEL});
    }

    private C11474a(String str, int i, String str2, String str3, String str4, String str5) {
        this(r12, r13, str, i, str2, str3, str4, str5, 0);
    }

    /* renamed from: b */
    private String m41922b(MarketingCloudConfig marketingCloudConfig) {
        return String.format(C11824l.f34333a, f33349t, new Object[]{Locale.getDefault(), marketingCloudConfig.appPackageName(), marketingCloudConfig.appVersionName()});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo29977a(SharedPreferences sharedPreferences) {
        if (this.f33358g <= 0) {
            return 0;
        }
        return sharedPreferences.getLong(this.f33354c + "_device", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo29984c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong(this.f33354c, 0);
    }

    private C11474a(String str, int i, String str2, String str3, String str4, String str5, long j) {
        this.f33357f = str;
        this.f33352a = i;
        this.f33353b = str2;
        this.f33355d = str3;
        this.f33356e = str4;
        this.f33354c = str5;
        this.f33358g = j < 0 ? 0 : j;
    }

    /* renamed from: c */
    public static Object[] m41924c(String str, String str2) {
        return new Object[]{str, str2};
    }

    /* renamed from: a */
    public C11476b mo29978a(MarketingCloudConfig marketingCloudConfig, C11751c cVar, String str) {
        return m41916a(marketingCloudConfig, cVar, m41917a(marketingCloudConfig), this.f33353b, str, (Map<String, String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29983b(SharedPreferences sharedPreferences) {
        if (this.f33358g > 0) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(this.f33354c + "_device", this.f33358g + System.currentTimeMillis()).apply();
        }
    }

    /* renamed from: a */
    private C11476b m41916a(MarketingCloudConfig marketingCloudConfig, C11751c cVar, String str, String str2, String str3, Map<String, String> map) {
        try {
            String a = m41918a(str, str2);
            C11461g.m41891d("MCRequest", "Executing %s request ...", a);
            C11476b.C11477a d = C11476b.m41937b().mo30013b(this.f33357f).mo30008a(this).mo30009a(this.f33355d).mo30015d(a);
            if (str3 != null) {
                d.mo30014c(str3);
            }
            d.mo30010a("User-Agent", m41922b(marketingCloudConfig));
            d.mo30010a("Authorization", String.format(C11824l.f34333a, f33348s, new Object[]{marketingCloudConfig.accessToken()}));
            d.mo30010a("Accept", this.f33356e);
            d.mo30010a("X-SDK-Version", MarketingCloudSdk.getSdkVersionName());
            String b = cVar.mo31112b(C11751c.f34090j, (String) null);
            if (b != null) {
                d.mo30010a(f33347r, b);
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry next : map.entrySet()) {
                    d.mo30010a((String) next.getKey(), (String) next.getValue());
                }
            }
            return d.mo30011a();
        } catch (Exception e) {
            C11461g.m41885b("MCRequest", e, "Failed to execute request.", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static Object[] m41923b(String str, String str2) {
        return new Object[]{str, str2};
    }

    /* renamed from: a */
    public C11476b mo29979a(MarketingCloudConfig marketingCloudConfig, C11751c cVar, Object[] objArr) {
        return m41916a(marketingCloudConfig, cVar, m41917a(marketingCloudConfig), new MessageFormat(this.f33353b, C11824l.f34333a).format(objArr), (String) null, (Map<String, String>) null);
    }

    /* renamed from: a */
    public C11476b mo29980a(MarketingCloudConfig marketingCloudConfig, C11751c cVar, Object[] objArr, String str) {
        return m41916a(marketingCloudConfig, cVar, m41917a(marketingCloudConfig), new MessageFormat(this.f33353b, C11824l.f34333a).format(objArr), str, (Map<String, String>) null);
    }

    /* renamed from: a */
    public C11476b mo29981a(MarketingCloudConfig marketingCloudConfig, C11751c cVar, Object[] objArr, String str, Map<String, String> map) {
        return m41916a(marketingCloudConfig, cVar, m41917a(marketingCloudConfig), new MessageFormat(this.f33353b, C11824l.f34333a).format(objArr), str, map);
    }

    /* renamed from: a */
    private String m41917a(MarketingCloudConfig marketingCloudConfig) {
        return this.f33352a == 1 ? marketingCloudConfig.marketingCloudServerUrl() : marketingCloudConfig.predictiveIntelligenceServerUrl();
    }

    /* renamed from: a */
    private String m41918a(String str, String str2) {
        if (str.endsWith(C11110u2.f31950c)) {
            str = str.substring(0, str.length() - 1);
        }
        return new URL(String.format(C11824l.f34333a, "%s%s", new Object[]{str, str2})).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29982a(SharedPreferences sharedPreferences, C11486d dVar) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (dVar.mo30033g() && this.f33358g > 0) {
            edit.putLong(this.f33354c + "_device", dVar.mo30028c() + this.f33358g);
        }
        List list = dVar.mo30029d().get("Retry-After");
        if (list != null && !list.isEmpty()) {
            try {
                long parseLong = Long.parseLong((String) list.get(0)) * 1000;
                String str = this.f33354c;
                long c = dVar.mo30028c();
                if (parseLong > 86400000) {
                    parseLong = 86400000;
                }
                edit.putLong(str, c + parseLong);
            } catch (Exception e) {
                C11461g.m41881a("MCRequest", (Throwable) e, "Unable to parse Retry-After value.", new Object[0]);
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public static void m41919a(Map<String, List<String>> map, C11751c cVar) {
        List list;
        String str;
        if (map != null && !map.isEmpty() && (list = map.get(f33347r)) != null && !list.isEmpty() && (str = (String) list.get(0)) != null && !str.isEmpty()) {
            cVar.mo31111a(C11751c.f34090j, str);
        }
    }

    /* renamed from: a */
    public static Object[] m41920a(String str) {
        return new Object[]{str};
    }

    /* renamed from: a */
    public static Object[] m41921a(String str, String str2, LatLon latLon) {
        return new Object[]{str, Double.valueOf(latLon.latitude()), Double.valueOf(latLon.longitude()), str2};
    }
}
