package com.salesforce.marketingcloud.proximity;

import android.annotation.SuppressLint;
import android.content.Context;
import com.salesforce.marketingcloud.C11460f;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.util.C11809d;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.proximity.e */
public abstract class C11712e extends C11460f {

    /* renamed from: d */
    public static final String f33956d = "com.salesforce.marketingcloud.proximity.BEACON_REGION_ENTERED";

    /* renamed from: e */
    public static final String f33957e = "com.salesforce.marketingcloud.proximity.BEACON_REGION_EXITED";

    /* renamed from: f */
    public static final String f33958f = "beaconRegion";

    /* renamed from: g */
    private static final String f33959g = "ProximityManager";

    /* renamed from: h */
    protected static final String f33960h = C11461g.m41875a(f33959g);

    /* renamed from: com.salesforce.marketingcloud.proximity.e$a */
    public interface C11713a {
        /* renamed from: a */
        void mo30852a(C11709c cVar);

        /* renamed from: b */
        void mo30853b(C11709c cVar);
    }

    /* renamed from: a */
    public static C11712e m42725a(Context context, MarketingCloudConfig marketingCloudConfig) {
        Boolean bool;
        String str;
        Boolean bool2 = null;
        if (marketingCloudConfig.proximityEnabled()) {
            Boolean valueOf = Boolean.valueOf(m42729a(context));
            if (!valueOf.booleanValue()) {
                bool = null;
                str = null;
            } else if (C11809d.m43208a()) {
                try {
                    return new C11707b(context);
                } catch (IllegalStateException e) {
                    str = e.getMessage();
                    C11461g.m41885b(f33960h, e, "Unable to create real instance of %s", f33959g);
                    bool = null;
                }
            } else {
                bool = Boolean.FALSE;
                C11461g.m41894e(f33960h, "If you wish to use proximity messenger then you need to add the AltBeacon dependency.", new Object[0]);
                str = null;
            }
            bool2 = valueOf;
        } else {
            bool = null;
            str = null;
        }
        return new C11711d(marketingCloudConfig.proximityEnabled(), m42728a(marketingCloudConfig.proximityEnabled(), bool2, bool, str));
    }

    /* renamed from: a */
    public abstract void mo30977a(C11713a aVar);

    /* renamed from: a */
    public abstract void mo30978a(List<C11709c> list);

    /* renamed from: b */
    public abstract void mo30980b(C11713a aVar);

    /* renamed from: b */
    public abstract void mo30981b(List<C11709c> list);

    /* renamed from: b */
    public boolean mo30982b() {
        return false;
    }

    /* renamed from: c */
    public abstract void mo30983c();

    public final String componentName() {
        return f33959g;
    }

    /* renamed from: a */
    protected static JSONObject m42726a() {
        JSONObject jSONObject = new JSONObject();
        m42727a(jSONObject, true);
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m42727a(JSONObject jSONObject, boolean z) {
        jSONObject.put("proximityEnabled", z);
        return jSONObject;
    }

    /* renamed from: a */
    protected static JSONObject m42728a(boolean z, Boolean bool, Boolean bool2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = m42727a(jSONObject, z);
            jSONObject.put("hardwareAvailable", bool);
            jSONObject.put("libraryDeclared", bool2);
            if (str != null) {
                jSONObject.put("serviceMissing", str);
            }
        } catch (JSONException e) {
            C11461g.m41885b(f33960h, e, "Error creating fake ProximityManager state.", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: a */
    protected static boolean m42729a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }
}
