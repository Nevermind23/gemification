package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Location;
import com.salesforce.marketingcloud.C11460f;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.location.f */
public abstract class C11548f extends C11460f {

    /* renamed from: d */
    public static final String f33506d = "NO_GPS_HARDWARE";

    /* renamed from: e */
    public static final String f33507e = "RECEIVER_NOT_DECLARED_IN_MANIFEST";

    /* renamed from: f */
    public static final int f33508f = -1;

    /* renamed from: g */
    private static final String f33509g = "LocationManager";

    /* renamed from: h */
    static final String f33510h = C11461g.m41875a(f33509g);

    /* renamed from: i */
    protected static final String f33511i = "com.salesforce.marketingcloud.location.LOCATION_UPDATE";

    /* renamed from: j */
    protected static final String f33512j = "com.salesforce.marketingcloud.location.GEOFENCE_ERROR";

    /* renamed from: k */
    protected static final String f33513k = "com.salesforce.marketingcloud.location.GEOFENCE_EVENT";

    /* renamed from: l */
    protected static final String f33514l = "extra_location";

    /* renamed from: m */
    protected static final String f33515m = "extra_transition";

    /* renamed from: n */
    protected static final String f33516n = "extra_fence_ids";

    /* renamed from: o */
    protected static final String f33517o = "extra_error_code";

    /* renamed from: p */
    protected static final String f33518p = "extra_error_message";

    /* renamed from: a */
    public static Intent m42167a(int i, String str) {
        return new Intent(f33512j).putExtra(f33517o, i).putExtra(f33518p, str);
    }

    /* renamed from: a */
    public abstract void mo30124a(C11543c cVar);

    /* renamed from: a */
    public abstract void mo30125a(C11547e eVar);

    /* renamed from: a */
    public abstract void mo30126a(List<String> list);

    /* renamed from: a */
    public abstract void mo30127a(C11539b... bVarArr);

    /* renamed from: b */
    public abstract void mo30128b();

    /* renamed from: b */
    public abstract void mo30129b(C11543c cVar);

    /* renamed from: b */
    public abstract void mo30130b(C11547e eVar);

    public final String componentName() {
        return f33509g;
    }

    /* renamed from: a */
    public static Intent m42168a(int i, List<String> list, Location location) {
        Intent intent = new Intent(f33513k);
        intent.putExtra(f33515m, i);
        if (list instanceof ArrayList) {
            intent.putStringArrayListExtra(f33516n, (ArrayList) list);
        } else {
            intent.putStringArrayListExtra(f33516n, new ArrayList(list));
        }
        if (location != null) {
            intent.putExtra(f33514l, location);
        }
        return intent;
    }

    /* renamed from: a */
    public static Intent m42169a(Location location) {
        return new Intent(f33511i).putExtra(f33514l, location);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.salesforce.marketingcloud.location.C11548f m42170a(android.content.Context r6, com.salesforce.marketingcloud.MarketingCloudConfig r7) {
        /*
            boolean r0 = com.salesforce.marketingcloud.util.C11809d.m43209b()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x003b
            boolean r3 = com.salesforce.marketingcloud.location.LocationReceiver.m42133a((android.content.Context) r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r4 = r3.booleanValue()
            if (r4 == 0) goto L_0x0038
            boolean r4 = r7.geofencingEnabled()
            if (r4 != 0) goto L_0x0022
            boolean r4 = r7.proximityEnabled()
            if (r4 == 0) goto L_0x0038
        L_0x0022:
            com.salesforce.marketingcloud.location.h r2 = new com.salesforce.marketingcloud.location.h     // Catch:{ Exception -> 0x0028 }
            r2.<init>((android.content.Context) r6, (com.salesforce.marketingcloud.MarketingCloudConfig) r7)     // Catch:{ Exception -> 0x0028 }
            return r2
        L_0x0028:
            r6 = move-exception
            r2 = r6
            java.lang.String r6 = f33510h
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "LocationManager"
            r4[r1] = r5
            java.lang.String r1 = "Unable to create real instance of %s"
            com.salesforce.marketingcloud.C11461g.m41885b(r6, r2, r1, r4)
        L_0x0038:
            r6 = r2
            r2 = r3
            goto L_0x0045
        L_0x003b:
            java.lang.String r6 = f33510h
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "GooglePlayServices Location dependency missing from build."
            com.salesforce.marketingcloud.C11461g.m41894e((java.lang.String) r6, (java.lang.String) r3, (java.lang.Object[]) r1)
            r6 = r2
        L_0x0045:
            com.salesforce.marketingcloud.location.a r1 = new com.salesforce.marketingcloud.location.a
            r1.<init>(r7, r2, r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.location.C11548f.m42170a(android.content.Context, com.salesforce.marketingcloud.MarketingCloudConfig):com.salesforce.marketingcloud.location.f");
    }

    /* renamed from: a */
    private static JSONObject m42171a(MarketingCloudConfig marketingCloudConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("geofencingEnabled", marketingCloudConfig.geofencingEnabled());
            jSONObject.put("proximityEnabled", marketingCloudConfig.proximityEnabled());
        } catch (Exception e) {
            C11461g.m41885b(f33510h, e, "Error creating LocationManager state.", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: a */
    static JSONObject m42172a(MarketingCloudConfig marketingCloudConfig, int i, String str) {
        JSONObject a = m42171a(marketingCloudConfig);
        try {
            a.put("apiCode", i);
            a.put("apiMessage", str);
        } catch (Exception e) {
            C11461g.m41885b(f33510h, e, "Error creating LocationManager state.", new Object[0]);
        }
        return a;
    }

    /* renamed from: a */
    static JSONObject m42173a(MarketingCloudConfig marketingCloudConfig, Boolean bool, boolean z, Exception exc) {
        JSONObject a = m42171a(marketingCloudConfig);
        try {
            a.put("serviceAvailable", bool);
            a.put("gmsLocationDependencyAvailable", z);
            if (exc != null) {
                a.put("exceptionMessage", exc.getMessage());
            }
        } catch (JSONException e) {
            C11461g.m41885b(f33510h, e, "Error creating LocationManager state.", new Object[0]);
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo30155a() {
        return false;
    }
}
