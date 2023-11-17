package com.salesforce.marketingcloud;

import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import he1.C41238w;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.i */
public final class C11491i extends ModuleIdentity {

    /* renamed from: b */
    public static final C11492a f33415b = new C11492a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ModuleIdentity f33416c;

    /* renamed from: a */
    private final RegistrationManager f33417a;

    /* renamed from: com.salesforce.marketingcloud.i$a */
    public static final class C11492a {
        private C11492a() {
        }

        public /* synthetic */ C11492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ModuleIdentity mo30050a(String str, RegistrationManager registrationManager) {
            C41536l.m120489i(str, "applicationId");
            C41536l.m120489i(registrationManager, "registrationManager");
            if (C11491i.f33416c == null) {
                C11491i.f33416c = new C11491i(str, registrationManager, (DefaultConstructorMarker) null);
            }
            return C11491i.f33416c;
        }
    }

    private C11491i(String str, RegistrationManager registrationManager) {
        super(ModuleIdentifier.PUSH, str);
        this.f33417a = registrationManager;
        if (registrationManager != null) {
            setProfileId(registrationManager.getContactKey());
            setInstallationId(registrationManager.getDeviceId());
            HashMap hashMap = new HashMap();
            hashMap.put("deviceId", registrationManager.getDeviceId());
            hashMap.put(C11772k.C11773a.f34176h, registrationManager.getAttributes());
            hashMap.put(C11772k.C11773a.f34175g, registrationManager.getTags());
            C41238w wVar = C41238w.f97225a;
            setCustomProperties(hashMap);
        }
    }

    public JSONObject customPropertiesToJson(Map<String, ? extends Object> map) {
        C41536l.m120489i(map, "customProperties");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", map.get("deviceId"));
            Object obj = map.get(C11772k.C11773a.f34176h);
            if (obj != null) {
                jSONObject.put(C11772k.C11773a.f34176h, new JSONObject(C41527d0.m120457d(obj)));
                jSONObject.put(C11772k.C11773a.f34175g, this.f33417a.getTags());
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any?, kotlin.Any?>");
        } catch (Exception e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", e.getMessage());
            return jSONObject2;
        }
    }

    public /* synthetic */ C11491i(String str, RegistrationManager registrationManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, registrationManager);
    }

    /* renamed from: a */
    public static final ModuleIdentity m41999a(String str, RegistrationManager registrationManager) {
        return f33415b.mo30050a(str, registrationManager);
    }
}
