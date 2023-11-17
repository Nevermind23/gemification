package com.salesforce.marketingcloud.location;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.location.a */
final class C11538a extends C11548f {

    /* renamed from: q */
    private final JSONObject f33485q;

    /* renamed from: r */
    private final Boolean f33486r;

    /* renamed from: s */
    private final Exception f33487s;

    /* renamed from: t */
    private final boolean f33488t;

    /* renamed from: u */
    private final boolean f33489u;

    C11538a(MarketingCloudConfig marketingCloudConfig, Boolean bool, boolean z, Exception exc) {
        this.f33488t = marketingCloudConfig.geofencingEnabled();
        this.f33489u = marketingCloudConfig.proximityEnabled();
        this.f33486r = bool;
        this.f33487s = exc;
        this.f33485q = C11548f.m42173a(marketingCloudConfig, bool, z, exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29669a(InitializationStatus.C11293a aVar) {
        if (this.f33488t || this.f33489u) {
            aVar.mo29533b(true);
            Exception exc = this.f33487s;
            if (exc != null) {
                String message = exc.getMessage();
                if (message != null) {
                    aVar.mo29530a(message);
                }
                Exception exc2 = this.f33487s;
                if (exc2 instanceof C11549g) {
                    aVar.mo29528a(((C11549g) exc2).mo30156a());
                    return;
                }
                return;
            }
            Boolean bool = this.f33486r;
            if (bool != null && !bool.booleanValue()) {
                aVar.mo29530a(C11548f.f33507e);
                return;
            }
            return;
        }
        aVar.mo29533b(false);
    }

    /* renamed from: b */
    public void mo30128b() {
        C11461g.m41894e(C11548f.f33510h, "LocationManager unavailable. unmonitorAllGeofences ignored", new Object[0]);
    }

    public JSONObject componentState() {
        return this.f33485q;
    }

    /* renamed from: a */
    public void mo30124a(C11543c cVar) {
        C11461g.m41894e(C11548f.f33510h, "LocationManager unavailable. registerForGeofenceRegionEvents ignored", new Object[0]);
    }

    /* renamed from: b */
    public void mo30129b(C11543c cVar) {
        C11461g.m41894e(C11548f.f33510h, "LocationManager unavailable. unregisterForGeofenceRegionEvents ignored", new Object[0]);
    }

    /* renamed from: a */
    public void mo30125a(C11547e eVar) {
        C11461g.m41894e(C11548f.f33510h, "LocationManager unavailable. registerForLocationUpdate ignored", new Object[0]);
    }

    /* renamed from: b */
    public void mo30130b(C11547e eVar) {
        C11461g.m41894e(C11548f.f33510h, "LocationManager unavailable. unregisterForLocationUpdate ignored", new Object[0]);
    }

    /* renamed from: a */
    public void mo30126a(List<String> list) {
        C11461g.m41894e(C11548f.f33510h, "LocationManager unavailable. unmonitorGeofences ignored", new Object[0]);
    }

    /* renamed from: a */
    public void mo30127a(C11539b... bVarArr) {
        C11461g.m41894e(C11548f.f33510h, "LocationManager unavailable. monitorGeofences ignored", new Object[0]);
    }
}
