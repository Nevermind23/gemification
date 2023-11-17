package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

public abstract class ModuleIdentity {
    private final String applicationId;
    private Map<String, Object> customProperties = new LinkedHashMap();
    private String installationId;
    private final ModuleIdentifier moduleName;
    private String profileId;

    public ModuleIdentity(ModuleIdentifier moduleIdentifier, String str) {
        C41536l.m120489i(moduleIdentifier, "moduleName");
        C41536l.m120489i(str, "applicationId");
        this.moduleName = moduleIdentifier;
        this.applicationId = str;
    }

    public abstract JSONObject customPropertiesToJson(Map<String, ? extends Object> map);

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final Map<String, Object> getCustomProperties() {
        return this.customProperties;
    }

    public final String getInstallationId() {
        return this.installationId;
    }

    public final ModuleIdentifier getModuleName() {
        return this.moduleName;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final void setCustomProperties(Map<String, Object> map) {
        C41536l.m120489i(map, C11755a.C11756a.f34100b);
        if (!C41536l.m120484d(map, this.customProperties)) {
            this.customProperties = map;
        }
    }

    public final void setInstallationId(String str) {
        if (!C41536l.m120484d(str, this.installationId)) {
            this.installationId = str;
        }
    }

    public final void setProfileId(String str) {
        if (!C41536l.m120484d(str, this.profileId)) {
            this.profileId = str;
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("profileId", getProfileId());
        jSONObject.put("applicationId", getApplicationId());
        jSONObject.put("installationId", getInstallationId());
        jSONObject.put("customProperties", customPropertiesToJson(getCustomProperties()));
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJson().toString();
        C41536l.m120488h(jSONObject, "toJson().toString()");
        return jSONObject;
    }
}
