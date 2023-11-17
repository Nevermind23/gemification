package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

class ConfigurationContract extends C10875i0 {
    ConfigurationUUID configurationUUID;
    KillStatus killStatus;
    C11238z3 localization;
    PropertyConfigurationContract propertyConfiguration;
    SDKConfigurationContract sdkConfiguration;
    C10727a7 targetEvaluatorContract;
    TargetRuleEngineContract targetRuleEngine;

    protected ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID2, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID2;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
    }

    /* access modifiers changed from: protected */
    public ConfigurationUUID getConfigurationUUID() {
        return this.configurationUUID;
    }

    /* access modifiers changed from: protected */
    public KillStatus getKillStatus() {
        return this.killStatus;
    }

    /* access modifiers changed from: protected */
    public C11238z3 getLocalization() {
        return this.localization;
    }

    /* access modifiers changed from: protected */
    public PropertyConfigurationContract getPropertyConfiguration() {
        return this.propertyConfiguration;
    }

    /* access modifiers changed from: protected */
    public SDKConfigurationContract getSdkConfiguration() {
        return this.sdkConfiguration;
    }

    /* access modifiers changed from: protected */
    public C10727a7 getTargetEvaluatorContract() {
        return this.targetEvaluatorContract;
    }

    /* access modifiers changed from: protected */
    public TargetRuleEngineContract getTargetRuleEngine() {
        return this.targetRuleEngine;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"propertyConfiguration\":");
            PropertyConfigurationContract propertyConfigurationContract = this.propertyConfiguration;
            String str = "null";
            sb.append(propertyConfigurationContract == null ? str : propertyConfigurationContract.toJsonString());
            sb.append(",\"configurationUUID\":");
            ConfigurationUUID configurationUUID2 = this.configurationUUID;
            sb.append(configurationUUID2 == null ? str : configurationUUID2.toJsonString());
            sb.append(",\"sdkConfiguration\":");
            SDKConfigurationContract sDKConfigurationContract = this.sdkConfiguration;
            sb.append(sDKConfigurationContract == null ? str : sDKConfigurationContract.toJsonString());
            sb.append(",\"targetRuleEngine\":");
            TargetRuleEngineContract targetRuleEngineContract = this.targetRuleEngine;
            sb.append(targetRuleEngineContract == null ? str : targetRuleEngineContract.toJsonString());
            sb.append(",\"killConfiguration\":");
            KillStatus killStatus2 = this.killStatus;
            sb.append(killStatus2 == null ? str : killStatus2.toJsonString());
            sb.append(",\"localization\":");
            C11238z3 z3Var = this.localization;
            sb.append(z3Var == null ? str : z3Var.toJsonString());
            sb.append(",\"targetEvaluatorContract\":");
            C10727a7 a7Var = this.targetEvaluatorContract;
            if (a7Var != null) {
                str = a7Var.toJsonString();
            }
            sb.append(str);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    protected ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID2, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract, KillStatus killStatus2) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID2;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
        this.killStatus = killStatus2;
    }

    protected ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID2, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract, KillStatus killStatus2, C11238z3 z3Var, C10727a7 a7Var) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID2;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
        this.killStatus = killStatus2;
        this.localization = z3Var;
        this.targetEvaluatorContract = a7Var;
    }

    protected ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
    }

    ConfigurationContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("propertyConfiguration") && !jSONObject.isNull("propertyConfiguration")) {
                this.propertyConfiguration = new PropertyConfigurationContract(jSONObject.getJSONObject("propertyConfiguration"));
            }
            if (jSONObject.has("configurationUUID") && !jSONObject.isNull("configurationUUID")) {
                this.configurationUUID = new ConfigurationUUID(jSONObject.getJSONObject("configurationUUID"));
            }
            if (jSONObject.has("sdkConfiguration") && !jSONObject.isNull("sdkConfiguration")) {
                this.sdkConfiguration = new SDKConfigurationContract(jSONObject.getJSONObject("sdkConfiguration"));
            }
            if (jSONObject.has("targetRuleEngine") && !jSONObject.isNull("targetRuleEngine")) {
                this.targetRuleEngine = new TargetRuleEngineContract(jSONObject.getJSONObject("targetRuleEngine"));
            }
            if (jSONObject.has("killConfiguration") && !jSONObject.isNull("killConfiguration")) {
                this.killStatus = new KillStatus(jSONObject.getJSONObject("killConfiguration"));
            }
            if (jSONObject.has("localization") && !jSONObject.isNull("localization")) {
                this.localization = new C11238z3(jSONObject.getJSONObject("localization"));
            }
            if (jSONObject.has("targetEvaluatorContract") && !jSONObject.isNull("targetEvaluatorContract")) {
                this.targetEvaluatorContract = new C10727a7(jSONObject.getJSONObject("targetEvaluatorContract"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
