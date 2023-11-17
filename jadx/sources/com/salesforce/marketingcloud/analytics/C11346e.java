package com.salesforce.marketingcloud.analytics;

import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.registration.C11730f;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.e */
public final class C11346e {

    /* renamed from: a */
    private final C11730f f32995a;

    /* renamed from: b */
    private final PushMessageManager f32996b;

    /* renamed from: c */
    private final boolean f32997c;

    /* renamed from: d */
    private final Identity f32998d;

    public C11346e(C11730f fVar, PushMessageManager pushMessageManager, boolean z, Identity identity) {
        C41536l.m120489i(fVar, "registrationMeta");
        this.f32995a = fVar;
        this.f32996b = pushMessageManager;
        this.f32997c = z;
        this.f32998d = identity;
    }

    /* renamed from: a */
    public static /* synthetic */ C11346e m41481a(C11346e eVar, C11730f fVar, PushMessageManager pushMessageManager, boolean z, Identity identity, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = eVar.f32995a;
        }
        if ((i & 2) != 0) {
            pushMessageManager = eVar.f32996b;
        }
        if ((i & 4) != 0) {
            z = eVar.f32997c;
        }
        if ((i & 8) != 0) {
            identity = eVar.f32998d;
        }
        return eVar.mo29776a(fVar, pushMessageManager, z, identity);
    }

    /* renamed from: b */
    private final PushMessageManager m41483b() {
        return this.f32996b;
    }

    /* renamed from: c */
    private final boolean m41484c() {
        return this.f32997c;
    }

    /* renamed from: d */
    private final Identity m41485d() {
        return this.f32998d;
    }

    /* renamed from: e */
    public final JSONObject mo29777e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceID", this.f32995a.mo31137f());
        jSONObject.put("etAppId", this.f32995a.mo31134d());
        jSONObject.put(C11772k.C11773a.f34181m, this.f32995a.mo31138g());
        jSONObject.put(C11772k.C11773a.f34170b, this.f32995a.mo31139h());
        jSONObject.put("platform_Version", this.f32995a.mo31141i());
        jSONObject.put("sdk_Version", this.f32995a.mo31142j());
        jSONObject.put("app_Version", this.f32995a.mo31135e());
        jSONObject.put(C11772k.C11773a.f34182n, Locale.getDefault().toString());
        jSONObject.put("timeZone", C11824l.m43290b());
        jSONObject.put("location_Enabled", this.f32997c);
        PushMessageManager pushMessageManager = this.f32996b;
        if (pushMessageManager != null) {
            jSONObject.put("backgroundRefreshEnabled", pushMessageManager.isPushEnabled());
            jSONObject.put("push_Enabled", pushMessageManager.isPushEnabled());
        }
        Identity identity = this.f32998d;
        if (identity != null) {
            jSONObject.put("identity", identity.toJson());
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11346e)) {
            return false;
        }
        C11346e eVar = (C11346e) obj;
        return C41536l.m120484d(this.f32995a, eVar.f32995a) && C41536l.m120484d(this.f32996b, eVar.f32996b) && this.f32997c == eVar.f32997c && C41536l.m120484d(this.f32998d, eVar.f32998d);
    }

    public int hashCode() {
        int hashCode = this.f32995a.hashCode() * 31;
        PushMessageManager pushMessageManager = this.f32996b;
        int i = 0;
        int hashCode2 = (hashCode + (pushMessageManager == null ? 0 : pushMessageManager.hashCode())) * 31;
        boolean z = this.f32997c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Identity identity = this.f32998d;
        if (identity != null) {
            i = identity.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "EventMetaData(registrationMeta=" + this.f32995a + ", pushMessageManager=" + this.f32996b + ", locationEnabled=" + this.f32997c + ", identity=" + this.f32998d + ')';
    }

    /* renamed from: a */
    public final C11346e mo29776a(C11730f fVar, PushMessageManager pushMessageManager, boolean z, Identity identity) {
        C41536l.m120489i(fVar, "registrationMeta");
        return new C11346e(fVar, pushMessageManager, z, identity);
    }

    /* renamed from: a */
    private final C11730f m41482a() {
        return this.f32995a;
    }
}
