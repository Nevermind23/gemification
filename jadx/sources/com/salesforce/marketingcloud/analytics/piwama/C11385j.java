package com.salesforce.marketingcloud.analytics.piwama;

import android.os.Build;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.storage.C11800j;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.j */
abstract class C11385j {

    /* renamed from: c */
    static final String f33076c = "api_key";

    /* renamed from: d */
    static final String f33077d = "app_id";

    /* renamed from: e */
    static final String f33078e = "app_name";

    /* renamed from: f */
    static final String f33079f = "user_info";

    /* renamed from: g */
    static final String f33080g = "payload";

    /* renamed from: h */
    static final String f33081h = "849f26e2-2df6-11e4-ab12-14109fdc48df";

    /* renamed from: i */
    private static final Map<String, String> f33082i = Collections.unmodifiableMap(new C11386a());

    /* renamed from: j */
    private static final String f33083j = "device";

    /* renamed from: k */
    private static final String f33084k = "details";

    /* renamed from: l */
    private static final String f33085l = "manufacturer";

    /* renamed from: m */
    private static final String f33086m = "device_id";

    /* renamed from: n */
    private static final String f33087n = "push_enabled";

    /* renamed from: o */
    private static final String f33088o = "location";

    /* renamed from: p */
    private static final String f33089p = "latitude";

    /* renamed from: q */
    private static final String f33090q = "longitude";

    /* renamed from: r */
    private static final String f33091r = "platform";

    /* renamed from: s */
    private static final String f33092s = "platform_version";

    /* renamed from: t */
    private static final String f33093t = "device_type";

    /* renamed from: u */
    private static final String f33094u = "email";

    /* renamed from: a */
    final C11800j f33095a;

    /* renamed from: b */
    final MarketingCloudConfig f33096b;

    /* renamed from: com.salesforce.marketingcloud.analytics.piwama.j$a */
    class C11386a extends ArrayMap {
        C11386a() {
            put("Content-Type", "application/json; charset=utf-8");
            put("Connection", "close");
        }
    }

    C11385j(MarketingCloudConfig marketingCloudConfig, C11800j jVar) {
        this.f33096b = marketingCloudConfig;
        this.f33095a = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11476b mo29826a(RegistrationManager registrationManager, PushMessageManager pushMessageManager, RegionMessageManager regionMessageManager, List<C11341b> list) {
        return C11474a.PI_ANALYTICS.mo29981a(this.f33096b, this.f33095a.mo31606c(), mo29810b(), mo29827a(mo29809a(mo29831a(registrationManager, pushMessageManager, regionMessageManager, list.get(0).mo29770e())), list), f33082i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract JSONObject mo29809a(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Object[] mo29810b();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo29827a(JSONObject jSONObject, List<C11341b> list) {
        JSONObject optJSONObject = jSONObject.optJSONObject(f33080g);
        String str = "{}";
        if (optJSONObject != null) {
            JSONArray jSONArray = new JSONArray();
            for (C11341b next : list) {
                try {
                    if (next.mo29769d() != null) {
                        jSONArray.put(new JSONObject(next.mo29769d()));
                    }
                } catch (Exception e) {
                    C11461g.m41885b(C11379i.f33063m, e, "Failed to add the PI AnalyticItem Event to the event list.", new Object[0]);
                }
            }
            if (jSONArray.length() > 0) {
                try {
                    optJSONObject.put("events", jSONArray);
                    str = jSONObject.toString();
                } catch (Exception e2) {
                    C11461g.m41885b(C11379i.f33063m, e2, "Failed to add the PI AnalyticItem Events to the payload.", new Object[0]);
                }
                optJSONObject.remove("events");
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo29828a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f33085l, Build.MANUFACTURER);
        jSONObject.put("platform", "Android");
        jSONObject.put("platform_version", Build.VERSION.RELEASE);
        jSONObject.put(f33093t, Build.MODEL);
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo29829a(RegionMessageManager regionMessageManager) {
        LatLon e;
        if ((!regionMessageManager.isGeofenceMessagingEnabled() && !regionMessageManager.isProximityMessagingEnabled()) || (e = this.f33095a.mo31621r().mo31563e(this.f33095a.mo31604b())) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("latitude", e.latitude());
        jSONObject.put("longitude", e.longitude());
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo29830a(PushMessageManager pushMessageManager) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("push_enabled", pushMessageManager.isPushEnabled());
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo29831a(RegistrationManager registrationManager, PushMessageManager pushMessageManager, RegionMessageManager regionMessageManager, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", registrationManager.getDeviceId());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(f33094u, str);
            }
            jSONObject.put(f33084k, mo29830a(pushMessageManager));
            JSONObject a = mo29829a(regionMessageManager);
            if (a != null) {
                jSONObject.put(f33088o, a);
            }
            jSONObject.put(f33083j, mo29828a());
        } catch (JSONException e) {
            C11461g.m41885b(C11379i.f33063m, e, "Could not create User Info object.", new Object[0]);
        }
        return jSONObject;
    }
}
