package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class ResourceContract extends C10785e0 implements Serializable {
    private static final int HASH_CODE_MULT = 31;
    private String checksum;
    private String formId;
    private Boolean isGlobal;
    private String localUrl;
    private String remoteUrl;

    protected ResourceContract() {
        this.isGlobal = Boolean.FALSE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceContract resourceContract = (ResourceContract) obj;
        String str = this.formId;
        if (str == null ? resourceContract.formId != null : !str.equals(resourceContract.formId)) {
            return false;
        }
        String str2 = this.remoteUrl;
        if (str2 == null ? resourceContract.remoteUrl != null : !str2.equals(resourceContract.remoteUrl)) {
            return false;
        }
        String str3 = this.localUrl;
        if (str3 == null ? resourceContract.localUrl != null : !str3.equals(resourceContract.localUrl)) {
            return false;
        }
        Boolean bool = this.isGlobal;
        if (bool == null ? resourceContract.isGlobal != null : !bool.equals(resourceContract.isGlobal)) {
            return false;
        }
        String str4 = this.checksum;
        String str5 = resourceContract.checksum;
        return str4 != null ? str4.equals(str5) : str5 == null;
    }

    /* access modifiers changed from: protected */
    public String getChecksum() {
        return this.checksum;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.Resource;
    }

    /* access modifiers changed from: protected */
    public String getFormId() {
        return this.formId;
    }

    public String getLocalUrl() {
        return this.localUrl;
    }

    public String getRemoteUrl() {
        return this.remoteUrl;
    }

    public int hashCode() {
        String str = this.formId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.remoteUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.localUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.checksum;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.isGlobal;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    /* access modifiers changed from: protected */
    public Boolean isGlobal() {
        Boolean bool = this.isGlobal;
        return bool == null ? Boolean.FALSE : bool;
    }

    /* access modifiers changed from: protected */
    public void setFormId(String str) {
        this.formId = str;
    }

    /* access modifiers changed from: protected */
    public void setGlobal(Boolean bool) {
        this.isGlobal = bool;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            return "{\"formId\":" + C11051p3.m40518c(this.formId) + ",\"remoteUrl\":" + C11051p3.m40518c(this.remoteUrl) + ",\"localUrl\":" + C11051p3.m40518c(this.localUrl) + ",\"checksum\":" + C11051p3.m40518c(this.checksum) + ",\"isGlobal\":" + this.isGlobal + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    protected ResourceContract(String str, String str2, String str3, String str4) {
        Boolean bool = Boolean.FALSE;
        this.formId = str;
        this.remoteUrl = str2;
        this.localUrl = str3;
        this.checksum = str4;
        this.isGlobal = bool;
    }

    protected ResourceContract(String str, String str2, String str3, String str4, boolean z) {
        this.isGlobal = Boolean.FALSE;
        this.formId = str;
        this.remoteUrl = str2;
        this.localUrl = str3;
        this.checksum = str4;
        this.isGlobal = Boolean.valueOf(z);
    }

    ResourceContract(JSONObject jSONObject) {
        this.isGlobal = Boolean.FALSE;
        try {
            if (jSONObject.has("remoteUrl") && !jSONObject.isNull("remoteUrl")) {
                this.remoteUrl = jSONObject.getString("remoteUrl");
            }
            if (jSONObject.has("localUrl") && !jSONObject.isNull("localUrl")) {
                this.localUrl = jSONObject.getString("localUrl");
            }
            if (jSONObject.has("checksum") && !jSONObject.isNull("checksum")) {
                this.checksum = jSONObject.getString("checksum");
            }
            if (jSONObject.has("isGlobal") && !jSONObject.isNull("isGlobal")) {
                this.isGlobal = Boolean.valueOf(jSONObject.getBoolean("isGlobal"));
            }
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.formId = jSONObject.getString("formId");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
