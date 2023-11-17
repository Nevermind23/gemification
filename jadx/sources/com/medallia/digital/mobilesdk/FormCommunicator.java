package com.medallia.digital.mobilesdk;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.C11089s6;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class FormCommunicator extends BaseFormCommunicator {
    public static final String NPS = "nps";

    FormCommunicator(String str, C10996m2 m2Var, FormTriggerType formTriggerType, FormViewType formViewType, C11238z3 z3Var, boolean z) {
        super(str, m2Var, formTriggerType, formViewType, z3Var, z);
    }

    /* access modifiers changed from: package-private */
    public String getCustomParamsString() {
        JSONObject jSONObject = new JSONObject();
        ArrayList<CustomParameter> customParameters = CollectorsInfrastructure.getInstance().getCustomParameters();
        if (customParameters != null) {
            try {
                Iterator<CustomParameter> it = customParameters.iterator();
                while (it.hasNext()) {
                    CustomParameter next = it.next();
                    jSONObject.put(next.mo27774b(), C11051p3.m40514a((Object) String.valueOf(next.mo27775c())));
                }
            } catch (Exception e) {
                C10735b4.m39111c("FormId: " + this.formId + " failed to getCustomParams " + e.getMessage());
            }
        }
        String jSONObject2 = jSONObject.toString();
        C10735b4.m39109b("FormId: " + this.formId + " getCustomParams was called " + jSONObject2);
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    public C11099t4 getMediaCapture() {
        if (C11208y0.m41106c().mo29204a() == null || C11208y0.m41106c().mo29204a().getSdkConfiguration() == null || C11208y0.m41106c().mo29204a().getSdkConfiguration().getMedalliaDigitalClientConfig() == null || C11208y0.m41106c().mo29204a().sdkConfiguration.getMedalliaDigitalClientConfig().getMediaCaptureConfiguration() == null) {
            return null;
        }
        return C11208y0.m41106c().mo29204a().sdkConfiguration.getMedalliaDigitalClientConfig().getMediaCaptureConfiguration();
    }

    /* access modifiers changed from: package-private */
    public String getProvisionsData() {
        HashMap<String, Boolean> h = C11138v2.m40821f().mo29079h();
        JSONObject jSONObject = new JSONObject();
        if (h != null) {
            try {
                for (Map.Entry next : h.entrySet()) {
                    jSONObject.put((String) next.getKey(), C11051p3.m40514a(next.getValue()));
                }
            } catch (Exception e) {
                C10735b4.m39111c("FormId: " + this.formId + " failed to getProvisions " + e.getMessage());
            }
        }
        String jSONObject2 = jSONObject.toString();
        C10735b4.m39109b("FormId: " + this.formId + " getProvisions was called " + jSONObject2);
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    public boolean isPreviewApp() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void notifySendFeedback() {
        long currentTimeMillis = System.currentTimeMillis();
        Intent intent = new Intent("com.medallia.digital.mobilesdk.LastSubmitTimestampCollectorFilter");
        intent.putExtra("com.medallia.digital.mobilesdk.LastSubmitTimestampCollector", currentTimeMillis);
        C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        C11089s6.m40668b().mo28984b(C11089s6.C11090a.LAST_SUBMIT_TIMESTAMP, String.valueOf(currentTimeMillis));
        C10735b4.m39109b("LastSubmitTimestamp: " + currentTimeMillis + " saved to SharedPreferences");
        Broadcasts.C10688d.m38940a(Broadcasts.C10688d.C10689a.formSubmitted, this.formId, this.formTriggerType, this.formViewType);
    }

    /* access modifiers changed from: package-private */
    public String provideDeviceData() {
        JSONObject jSONObject = new JSONObject();
        try {
            String sDKVersion = CollectorsInfrastructure.getInstance().getSDKVersion();
            C10735b4.m39109b("sdkVersion = " + sDKVersion);
            jSONObject.put("osVersion", C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getOSVersion()));
            jSONObject.put("sdkVersion", C11051p3.m40514a((Object) sDKVersion));
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
        JSONObject jSONObject;
        if (C11208y0.m41106c().mo29204a() == null || C11208y0.m41106c().mo29204a().getSdkConfiguration() == null || C11208y0.m41106c().mo29204a().getSdkConfiguration().getFeatures() == null) {
            jSONObject = null;
        } else {
            jSONObject = C11208y0.m41106c().mo29204a().getSdkConfiguration().getFeatures();
            C10735b4.m39109b("FormId: " + this.formId + " getSDKData was called " + jSONObject.toString());
        }
        try {
            PackageInfo packageInfo = C10884i4.m39721c().mo28483b().getPackageManager().getPackageInfo(C10884i4.m39721c().mo28483b().getPackageName(), C11398b.f33143v);
            if (packageInfo != null) {
                ArrayList arrayList = new ArrayList(Arrays.asList(packageInfo.requestedPermissions));
                if (!arrayList.contains("android.permission.CAMERA") && !arrayList.contains("android.permission.RECORD_AUDIO") && !arrayList.contains("android.permission.READ_EXTERNAL_STORAGE") && jSONObject != null && jSONObject.has("sdkSupportedFeatures")) {
                    try {
                        ArrayList<String> stringArray = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("sdkSupportedFeatures"));
                        if (stringArray.contains("mediaCapture")) {
                            stringArray.remove("mediaCapture");
                            jSONObject.put("sdkSupportedFeatures", new JSONArray(stringArray));
                        }
                    } catch (JSONException e) {
                        C10735b4.m39111c(e.getMessage());
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            C10735b4.m39111c(e2.getMessage());
        }
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void sendFeedback(C10826g2 g2Var) {
        C10998m4.m40266h().mo28739a(g2Var, (C10796e6<Void>) new C10696a());
    }

    /* access modifiers changed from: protected */
    public void sendFeedbackPayloadAndUpdateRatingCollectors(JSONObject jSONObject) {
        JSONObject a;
        if (jSONObject == null) {
            try {
                C10735b4.m39114f("feedbackContract is null");
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        } else {
            JSONObject jSONObject2 = (!jSONObject.has("dynamicData") || jSONObject.isNull("dynamicData")) ? null : jSONObject.getJSONObject("dynamicData");
            if (jSONObject2 != null && jSONObject2.has("pages")) {
                if (!jSONObject2.isNull("pages")) {
                    if (!jSONObject.has("uuid") || jSONObject.isNull("uuid")) {
                        jSONObject.put("uuid", UUID.randomUUID().toString());
                    }
                    JSONArray jSONArray = new JSONArray();
                    if (jSONObject2.has("pages")) {
                        if (!jSONObject2.isNull("pages")) {
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("pages");
                            for (int i = 0; i < jSONArray2.length(); i++) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                                if (jSONObject3 != null && jSONObject3.has("components") && !jSONObject3.isNull("components")) {
                                    JSONArray jSONArray3 = jSONObject3.getJSONArray("components");
                                    for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                                        jSONArray.put(jSONArray3.get(i2));
                                    }
                                }
                            }
                        }
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("components", C11051p3.m40514a((Object) jSONArray));
                    this.feedbackClientCorrelationId = jSONObject.getString("uuid");
                    if (C11208y0.m41106c().mo29204a() != null && C11208y0.m41106c().mo29204a().getSdkConfiguration() != null && C11208y0.m41106c().mo29204a().getSdkConfiguration().getFormConfigurations() != null && (a = C10879i2.m39714a(jSONObject4, C11208y0.m41106c().mo29204a().getSdkConfiguration().getFormConfigurations())) != null) {
                        updateRatingCollectors(a);
                        Broadcasts.C10688d.m38945a(Broadcasts.C10688d.C10689a.feedbackPayload, this.formId, this.formTriggerType, this.feedbackClientCorrelationId, a.toString());
                        return;
                    }
                    return;
                }
            }
            C10735b4.m39114f("dynamicData is null");
        }
    }

    /* access modifiers changed from: package-private */
    public void separateCustomParams(JSONObject jSONObject) {
        try {
            for (SDKConfigurationFormContract sDKConfigurationFormContract : C11208y0.m41106c().mo29204a().getPropertyConfiguration().getForms()) {
                if (sDKConfigurationFormContract.getFormId().equals(this.formId)) {
                    if (sDKConfigurationFormContract.getCustomParams() != null) {
                        JSONArray jSONArray = new JSONArray(C11051p3.m40520e(sDKConfigurationFormContract.getCustomParams()));
                        HashMap hashMap = new HashMap();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            hashMap.put(jSONObject2.getString("unique_name"), jSONObject2);
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator<CustomParameter> it = CollectorsInfrastructure.getInstance().getCustomParameters().iterator();
                        while (it.hasNext()) {
                            CustomParameter next = it.next();
                            if (hashMap.get(next.mo27774b()) != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("unique_name", next.mo27774b());
                                jSONObject3.put(C11755a.C11756a.f34100b, next.mo27775c());
                                jSONArray2.put(jSONObject3);
                            }
                        }
                        JSONObject jSONObject4 = jSONObject.getJSONObject("dynamicData");
                        jSONObject4.put("customParams", jSONArray2);
                        jSONObject.put("dynamicData", jSONObject4);
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void updateRatingCollectors(JSONObject jSONObject) {
        if (jSONObject.has("components") && !jSONObject.isNull("components")) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("components");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.has("type")) {
                        if (jSONObject2.has(C11755a.C11756a.f34100b)) {
                            if (NPS.equals(jSONObject2.getString("type")) && !jSONObject2.isNull(C11755a.C11756a.f34100b)) {
                                try {
                                    Intent intent = new Intent("com.medallia.digital.mobilesdk.NPSCollectorFilter");
                                    intent.putExtra("com.medallia.digital.mobilesdk.NPSCollector", jSONObject2.getInt(C11755a.C11756a.f34100b));
                                    C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
                                } catch (Exception e) {
                                    C10735b4.m39111c(e.getMessage());
                                }
                            }
                        }
                    }
                    if (jSONObject2.has("isCsat") && jSONObject2.has(C11755a.C11756a.f34100b) && !jSONObject2.isNull("isCsat") && jSONObject2.getBoolean("isCsat") && !jSONObject2.isNull(C11755a.C11756a.f34100b)) {
                        try {
                            Intent intent2 = new Intent("com.medallia.digital.mobilesdk.CSATCollectorFilter");
                            intent2.putExtra("com.medallia.digital.mobilesdk.CSATCollector", jSONObject2.getInt(C11755a.C11756a.f34100b));
                            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent2);
                        } catch (Exception e2) {
                            C10735b4.m39111c(e2.getMessage());
                        }
                    }
                }
            } catch (Exception e3) {
                C10735b4.m39111c(e3.getMessage());
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.FormCommunicator$a */
    class C10696a implements C10796e6<Void> {
        C10696a() {
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39111c("Submit feedback failed: " + h4Var.getMessage());
        }

        /* renamed from: a */
        public void mo27797a(Void voidR) {
            C10735b4.m39113e("Submit feedback sent successfully");
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(new Intent("com.medallia.digital.mobilesdk.sync_userjourney_action"));
        }
    }
}
