package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.Broadcasts;
import org.json.JSONException;
import org.json.JSONObject;

public class FormCommunicatorPreviews extends BaseFormCommunicator {
    private final C11063q0 clientRequestData;
    private final String customParams;
    private final String features;
    private final C11099t4 mediaCaptureConfiguration;
    private final String provisions;
    private final String token;

    FormCommunicatorPreviews(C11013n2 n2Var, C11238z3 z3Var, C11085s2 s2Var, C10996m2 m2Var, C11099t4 t4Var, boolean z) {
        super(n2Var, m2Var, (FormTriggerType) null, (FormViewType) null, z3Var, z);
        this.clientRequestData = new C11063q0(s2Var.mo28969d());
        this.token = s2Var.mo28971e();
        this.provisions = s2Var.mo28967c();
        this.customParams = s2Var.mo28963a();
        this.mediaCaptureConfiguration = t4Var;
        this.features = s2Var.mo28965b();
    }

    /* access modifiers changed from: package-private */
    public String getCustomParamsString() {
        return this.customParams;
    }

    /* access modifiers changed from: protected */
    public C11099t4 getMediaCapture() {
        return this.mediaCaptureConfiguration;
    }

    /* access modifiers changed from: package-private */
    public String getProvisionsData() {
        return this.provisions;
    }

    /* access modifiers changed from: protected */
    public boolean isPreviewApp() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void notifySendFeedback() {
    }

    /* access modifiers changed from: package-private */
    public String provideDeviceData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("osVersion", C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getOSVersion()));
            jSONObject.put("sdkVersion", C11051p3.m40514a((Object) "4.1.5"));
            jSONObject.put("appVersion", C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getAppVersion()));
            jSONObject.put("osType", "Android");
            jSONObject.put("deviceId", C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getDeviceId()));
            jSONObject.put("deviceModel", C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getDeviceModel()));
            jSONObject.put("appId", C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getAppId()));
        } catch (JSONException e) {
            C10735b4.m39111c("FormId: " + this.formId + " failed to getDeviceData " + e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        C10735b4.m39109b("FormId: " + this.formId + " getDeviceData was called " + jSONObject2);
        return jSONObject2;
    }

    /* access modifiers changed from: package-private */
    public String provideSdkData() {
        return this.features;
    }

    /* access modifiers changed from: package-private */
    public void sendFeedback(C10826g2 g2Var) {
        Broadcasts.C10688d.m38937a(Broadcasts.C10688d.C10689a.formSubmitted, this.formId);
        new C11153v6(C10998m4.m40266h().mo28753k(), this.clientRequestData, g2Var, Boolean.TRUE, this.token, new C10697a()).mo28878c();
    }

    /* access modifiers changed from: protected */
    public void sendFeedbackPayloadAndUpdateRatingCollectors(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public void separateCustomParams(JSONObject jSONObject) {
    }

    /* renamed from: com.medallia.digital.mobilesdk.FormCommunicatorPreviews$a */
    class C10697a implements C10796e6<Void> {
        C10697a() {
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
        }

        /* renamed from: a */
        public void mo27797a(Void voidR) {
        }
    }
}
