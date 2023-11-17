package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

public class SDKConfigurationContract extends C10875i0 {
    private CollectorsConfigurationContract collectorsConfigurations;
    private C10844h eventsConfigurations;
    private JSONObject features;
    private FormConfigurations formConfigurations;
    private MedalliaDigitalBrainConfigurationContract medalliaDigitalBrain;
    private MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig;

    protected SDKConfigurationContract() {
    }

    SDKConfigurationContract(CollectorsConfigurationContract collectorsConfigurationContract, MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract, MedalliaDigitalBrainConfigurationContract medalliaDigitalBrainConfigurationContract) {
        this.collectorsConfigurations = collectorsConfigurationContract;
        this.medalliaDigitalClientConfig = medalliaDigitalClientConfigurationContract;
        this.medalliaDigitalBrain = medalliaDigitalBrainConfigurationContract;
    }

    /* access modifiers changed from: protected */
    public CollectorsConfigurationContract getCollectorsConfigurations() {
        return this.collectorsConfigurations;
    }

    /* access modifiers changed from: package-private */
    public C10844h getEventsConfigurations() {
        return this.eventsConfigurations;
    }

    public JSONObject getFeatures() {
        return this.features;
    }

    public FormConfigurations getFormConfigurations() {
        return this.formConfigurations;
    }

    /* access modifiers changed from: protected */
    public MedalliaDigitalBrainConfigurationContract getMedalliaDigitalBrain() {
        return this.medalliaDigitalBrain;
    }

    public MedalliaDigitalClientConfigurationContract getMedalliaDigitalClientConfig() {
        return this.medalliaDigitalClientConfig;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"collectorsConfigurations\":");
            CollectorsConfigurationContract collectorsConfigurationContract = this.collectorsConfigurations;
            String str = "null";
            sb.append(collectorsConfigurationContract == null ? str : collectorsConfigurationContract.toJsonString());
            sb.append(",\"medalliaDigitalClientConfig\":");
            MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract = this.medalliaDigitalClientConfig;
            sb.append(medalliaDigitalClientConfigurationContract == null ? str : medalliaDigitalClientConfigurationContract.toJsonString());
            sb.append(",\"medalliaDigitalBrain\":");
            MedalliaDigitalBrainConfigurationContract medalliaDigitalBrainConfigurationContract = this.medalliaDigitalBrain;
            sb.append(medalliaDigitalBrainConfigurationContract == null ? str : medalliaDigitalBrainConfigurationContract.toJsonString());
            sb.append(",\"formConfigurations\":");
            FormConfigurations formConfigurations2 = this.formConfigurations;
            sb.append(formConfigurations2 == null ? str : formConfigurations2.toJsonString());
            sb.append(",\"analyticsEventsConfigurationContract\":");
            C10844h hVar = this.eventsConfigurations;
            sb.append(hVar == null ? str : hVar.mo28386e());
            sb.append(",\"features\":");
            JSONObject jSONObject = this.features;
            if (jSONObject != null) {
                str = jSONObject.toString();
            }
            sb.append(str);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    SDKConfigurationContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("collectorsConfigurations") && !jSONObject.isNull("collectorsConfigurations")) {
                this.collectorsConfigurations = new CollectorsConfigurationContract(jSONObject.getJSONObject("collectorsConfigurations"));
            }
            if (jSONObject.has("medalliaDigitalClientConfig") && !jSONObject.isNull("medalliaDigitalClientConfig")) {
                this.medalliaDigitalClientConfig = new MedalliaDigitalClientConfigurationContract(jSONObject.getJSONObject("medalliaDigitalClientConfig"));
            }
            if (jSONObject.has("medalliaDigitalBrain") && !jSONObject.isNull("medalliaDigitalBrain")) {
                this.medalliaDigitalBrain = new MedalliaDigitalBrainConfigurationContract(jSONObject.getJSONObject("medalliaDigitalBrain"));
            }
            if (jSONObject.has("formConfigurations") && !jSONObject.isNull("formConfigurations")) {
                this.formConfigurations = new FormConfigurations(jSONObject.getJSONObject("formConfigurations"));
            }
            if (jSONObject.has("analyticsEventsConfigurationContract") && !jSONObject.isNull("analyticsEventsConfigurationContract")) {
                this.eventsConfigurations = new C10844h(jSONObject.getJSONObject("analyticsEventsConfigurationContract"));
            }
            if (jSONObject.has("features") && !jSONObject.isNull("features")) {
                this.features = jSONObject.getJSONObject("features");
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
