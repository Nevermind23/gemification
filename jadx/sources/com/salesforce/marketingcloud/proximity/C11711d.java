package com.salesforce.marketingcloud.proximity;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.proximity.C11712e;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.proximity.d */
class C11711d extends C11712e {

    /* renamed from: i */
    private final boolean f33954i;

    /* renamed from: j */
    private final JSONObject f33955j;

    public C11711d(boolean z, JSONObject jSONObject) {
        this.f33954i = z;
        this.f33955j = jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29669a(InitializationStatus.C11293a aVar) {
        aVar.mo29536d(this.f33954i);
    }

    /* renamed from: b */
    public void mo30980b(C11712e.C11713a aVar) {
        String str = C11712e.f33960h;
        Object[] objArr = new Object[1];
        objArr[0] = aVar != null ? aVar.getClass().getSimpleName() : "null";
        C11461g.m41891d(str, "unregisterProximityEventListener(%s) call ignored because of unsupported device.", objArr);
    }

    /* renamed from: c */
    public void mo30983c() {
        C11461g.m41891d(C11712e.f33960h, "stopMonitoringBeaconRegions() call ignored because of unsupported device.", new Object[0]);
    }

    public JSONObject componentState() {
        return this.f33955j;
    }

    /* renamed from: a */
    public void mo30977a(C11712e.C11713a aVar) {
        String str = C11712e.f33960h;
        Object[] objArr = new Object[1];
        objArr[0] = aVar != null ? aVar.getClass().getSimpleName() : "null";
        C11461g.m41891d(str, "registerProximityEventListener(%s) call ignored because of unsupported device.", objArr);
    }

    /* renamed from: b */
    public void mo30981b(List<C11709c> list) {
        C11461g.m41891d(C11712e.f33960h, "unmonitorBeaconRegions call ignored because of unsupported device.", new Object[0]);
    }

    /* renamed from: a */
    public void mo30978a(List<C11709c> list) {
        C11461g.m41891d(C11712e.f33960h, "monitorBeaconRegions call ignored because of unsupported device.", new Object[0]);
    }
}
