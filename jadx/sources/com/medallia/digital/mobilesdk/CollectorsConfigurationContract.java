package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11195x0;
import org.json.JSONException;
import org.json.JSONObject;

class CollectorsConfigurationContract extends C10875i0 {
    private CollectorContract appIdCollector;
    private CollectorContract appNameCollector;
    private CollectorContract appRatingLastAcceptedTimestampCollector;
    private CollectorContract appRatingLastDeclineTimestampCollector;
    private CollectorContract appRatingLastTriggerTimestampCollector;
    private CollectorContract appVersionCollector;
    private CollectorContract batteryPercentageCollector;
    private CollectorContract csatCollector;
    private CollectorContract customParametersCollector;
    private CollectorContract deviceFreeDiskSpaceCollector;
    private CollectorContract deviceFreeMemoryCollector;
    private CollectorContract deviceIdCollector;
    private CollectorContract deviceModelCollector;
    private CollectorContract deviceResolutionCollector;
    private CollectorContract deviceUsedDiskSpaceCollector;
    private CollectorContract deviceUsedMemoryCollector;
    private CollectorContract deviceVendorCollector;
    private CollectorContract externalDriveFreeSpaceCollector;
    private CollectorContract externalDriveUsedSpaceCollector;
    private CollectorContract interceptDisabledCollector;
    private CollectorContract interceptEnabledCollector;
    private CollectorContract invitationDisplayedCollector;
    private CollectorContract ipCollector;
    private CollectorContract isOCQRulesValidCollector;
    private CollectorContract isOCQUserSetCollector;
    private CollectorContract isSessionSampledEventsCollector;
    private CollectorContract languageCollector;
    private CollectorContract lastDeclineTimestampCollector;
    private CollectorContract lastSubmitTimestampCollector;
    private CollectorContract networkCarrierCollector;
    private CollectorContract networkProviderCollector;
    private CollectorContract networkSpeedCollector;
    private CollectorContract networkTypeCollector;
    private CollectorContract npsCollector;
    private CollectorContract orientationCollector;
    private CollectorContract osNameCollector;
    private CollectorContract osVersionCollector;
    private CollectorContract powerTypeCollector;
    private CollectorContract promptDisplayedCollector;
    private CollectorContract propertyIdCollector;
    private CollectorContract sdkVersionCollector;
    private CollectorContract sessionCalculatedPercentageCollector;
    private CollectorContract sessionIdCollector;
    private CollectorContract sessionNumberCollector;
    private CollectorContract sessionPercentageSampledEventsCollector;
    private CollectorContract timezoneCollector;
    private CollectorContract userEmailCollector;
    private CollectorContract userIdCollector;
    private CollectorContract userNameCollector;

    protected CollectorsConfigurationContract() {
        this.deviceModelCollector = C11195x0.C11196a.f32195c;
        this.deviceVendorCollector = C11195x0.C11196a.f32199g;
        this.deviceResolutionCollector = C11195x0.C11196a.f32196d;
        this.deviceUsedMemoryCollector = C11195x0.C11196a.f32198f;
        this.deviceFreeMemoryCollector = C11195x0.C11196a.f32194b;
        this.deviceUsedDiskSpaceCollector = C11195x0.C11196a.f32197e;
        this.deviceFreeDiskSpaceCollector = C11195x0.C11196a.f32192a;
        this.externalDriveUsedSpaceCollector = C11195x0.C11196a.f32200h;
        this.externalDriveFreeSpaceCollector = C11195x0.C11196a.f32201i;
        this.osNameCollector = C11195x0.C11196a.f32202j;
        this.osVersionCollector = C11195x0.C11196a.f32203k;
        this.networkProviderCollector = C11195x0.C11196a.f32204l;
        this.networkCarrierCollector = C11195x0.C11196a.f32205m;
        this.languageCollector = C11195x0.C11196a.f32206n;
        this.timezoneCollector = C11195x0.C11196a.f32207o;
        this.ipCollector = C11195x0.C11196a.f32208p;
        this.networkSpeedCollector = C11195x0.C11196a.f32209q;
        this.deviceIdCollector = C11195x0.C11196a.f32210r;
        this.appNameCollector = C11195x0.C11196a.f32211s;
        this.appIdCollector = C11195x0.C11196a.f32212t;
        this.appVersionCollector = C11195x0.C11196a.f32213u;
        this.sdkVersionCollector = C11195x0.C11196a.f32214v;
        this.sessionCalculatedPercentageCollector = C11195x0.C11196a.f32215w;
        this.sessionNumberCollector = C11195x0.C11196a.f32216x;
        this.networkTypeCollector = C11195x0.C11196a.f32218z;
        this.powerTypeCollector = C11195x0.C11196a.f32166A;
        this.batteryPercentageCollector = C11195x0.C11196a.f32168C;
        this.orientationCollector = C11195x0.C11196a.f32169D;
        this.lastDeclineTimestampCollector = C11195x0.C11196a.f32170E;
        this.lastSubmitTimestampCollector = C11195x0.C11196a.f32171F;
        this.invitationDisplayedCollector = C11195x0.C11196a.f32176K;
        this.npsCollector = C11195x0.C11196a.f32181P;
        this.csatCollector = C11195x0.C11196a.f32182Q;
        this.appRatingLastDeclineTimestampCollector = C11195x0.C11196a.f32183R;
        this.promptDisplayedCollector = C11195x0.C11196a.f32184S;
        this.appRatingLastAcceptedTimestampCollector = C11195x0.C11196a.f32185T;
        this.appRatingLastTriggerTimestampCollector = C11195x0.C11196a.f32188W;
        this.isOCQUserSetCollector = C11195x0.C11196a.f32189X;
        this.isOCQRulesValidCollector = C11195x0.C11196a.f32190Y;
        this.isSessionSampledEventsCollector = C11195x0.C11196a.f32191Z;
        this.sessionPercentageSampledEventsCollector = C11195x0.C11196a.f32193a0;
        this.userIdCollector = C11195x0.C11196a.f32172G;
        this.userEmailCollector = C11195x0.C11196a.f32173H;
        this.userNameCollector = C11195x0.C11196a.f32174I;
        this.customParametersCollector = C11195x0.C11196a.f32175J;
        this.interceptEnabledCollector = C11195x0.C11196a.f32179N;
        this.interceptDisabledCollector = C11195x0.C11196a.f32180O;
    }

    private String collectorToJSonString(CollectorContract collectorContract) {
        return collectorContract == null ? "null" : collectorContract.toJsonString();
    }

    /* access modifiers changed from: protected */
    public CollectorContract getAppIdCollector() {
        return this.appIdCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getAppNameCollector() {
        return this.appNameCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getAppRatingLastAcceptedTimestampCollector() {
        return this.appRatingLastAcceptedTimestampCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getAppRatingLastDeclineTimestampCollector() {
        return this.appRatingLastDeclineTimestampCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getAppRatingLastTriggerTimestampCollector() {
        return this.appRatingLastTriggerTimestampCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getAppVersionCollector() {
        return this.appVersionCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getBatteryPercentageCollector() {
        return this.batteryPercentageCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getCsatCollector() {
        return this.csatCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getCustomParametersCollector() {
        return this.customParametersCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getDeviceFreeDiskSpaceCollector() {
        return this.deviceFreeDiskSpaceCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getDeviceFreeMemoryCollector() {
        return this.deviceFreeMemoryCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getDeviceIdCollector() {
        return this.deviceIdCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getDeviceModelCollector() {
        return this.deviceModelCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getDeviceResolutionCollector() {
        return this.deviceResolutionCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getDeviceUsedDiskSpaceCollector() {
        return this.deviceUsedDiskSpaceCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getDeviceUsedMemoryCollector() {
        return this.deviceUsedMemoryCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getDeviceVendorCollector() {
        return this.deviceVendorCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getExternalDriveFreeSpaceCollector() {
        return this.externalDriveFreeSpaceCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getExternalDriveUsedSpaceCollector() {
        return this.externalDriveUsedSpaceCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getInterceptDisabledCollector() {
        return this.interceptDisabledCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getInterceptEnabledCollector() {
        return this.interceptEnabledCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getInvitationDisplayedCollector() {
        return this.invitationDisplayedCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getIpCollector() {
        return this.ipCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getIsOCQRulesValidCollector() {
        return this.isOCQRulesValidCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getIsOCQUserSetCollector() {
        return this.isOCQUserSetCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getIsSessionSampledEventsCollector() {
        return this.isSessionSampledEventsCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getLanguageCollector() {
        return this.languageCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getLastDeclineTimestampCollector() {
        return this.lastDeclineTimestampCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getLastSubmitTimestampCollector() {
        return this.lastSubmitTimestampCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getNetworkCarrierCollector() {
        return this.networkCarrierCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getNetworkProviderCollector() {
        return this.networkProviderCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getNetworkSpeedCollector() {
        return this.networkSpeedCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getNetworkTypeCollector() {
        return this.networkTypeCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getNpsCollector() {
        return this.npsCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getOrientationCollector() {
        return this.orientationCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getOsNameCollector() {
        return this.osNameCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getOsVersionCollector() {
        return this.osVersionCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getPowerTypeCollector() {
        return this.powerTypeCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getPromptDisplayedCollector() {
        return this.promptDisplayedCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getPropertyIdCollector() {
        return this.propertyIdCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getSdkVersionCollector() {
        return this.sdkVersionCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getSessionCalculatedPercentageCollector() {
        return this.sessionCalculatedPercentageCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getSessionIdCollector() {
        return this.sessionIdCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getSessionNumberCollector() {
        return this.sessionNumberCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getSessionPercentageSampledEventsCollector() {
        return this.sessionPercentageSampledEventsCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getTimezoneCollector() {
        return this.timezoneCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getUserEmailCollector() {
        return this.userEmailCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getUserIdCollector() {
        return this.userIdCollector;
    }

    /* access modifiers changed from: protected */
    public CollectorContract getUserNameCollector() {
        return this.userNameCollector;
    }

    /* access modifiers changed from: protected */
    public String toJsonString() {
        try {
            return "{\"deviceModelCollector\":" + collectorToJSonString(this.deviceModelCollector) + ",\"deviceVendorCollector\":" + collectorToJSonString(this.deviceVendorCollector) + ",\"deviceResolutionCollector\":" + collectorToJSonString(this.deviceResolutionCollector) + ",\"deviceUsedMemoryCollector\":" + collectorToJSonString(this.deviceUsedMemoryCollector) + ",\"deviceFreeMemoryCollector\":" + collectorToJSonString(this.deviceFreeMemoryCollector) + ",\"deviceUsedDiskSpaceCollector\":" + collectorToJSonString(this.deviceUsedDiskSpaceCollector) + ",\"deviceFreeDiskSpaceCollector\":" + collectorToJSonString(this.deviceFreeDiskSpaceCollector) + ",\"externalDriveUsedSpaceCollector\":" + collectorToJSonString(this.externalDriveUsedSpaceCollector) + ",\"externalDriveFreeSpaceCollector\":" + collectorToJSonString(this.externalDriveFreeSpaceCollector) + ",\"osNameCollector\":" + collectorToJSonString(this.osNameCollector) + ",\"osVersionCollector\":" + collectorToJSonString(this.osVersionCollector) + ",\"networkProviderCollector\":" + collectorToJSonString(this.networkProviderCollector) + ",\"networkCarrierCollector\":" + collectorToJSonString(this.networkCarrierCollector) + ",\"languageCollector\":" + collectorToJSonString(this.languageCollector) + ",\"timezoneCollector\":" + collectorToJSonString(this.timezoneCollector) + ",\"ipCollector\":" + collectorToJSonString(this.ipCollector) + ",\"networkSpeedCollector\":" + collectorToJSonString(this.networkSpeedCollector) + ",\"deviceIdCollector\":" + collectorToJSonString(this.deviceIdCollector) + ",\"appNameCollector\":" + collectorToJSonString(this.appNameCollector) + ",\"appIdCollector\":" + collectorToJSonString(this.appIdCollector) + ",\"appVersionCollector\":" + collectorToJSonString(this.appVersionCollector) + ",\"sdkVersionCollector\":" + collectorToJSonString(this.sdkVersionCollector) + ",\"sessionCalculatedPercentageCollector\":" + collectorToJSonString(this.sessionCalculatedPercentageCollector) + ",\"sessionNumberCollector\":" + collectorToJSonString(this.sessionNumberCollector) + ",\"sessionIdCollector\":" + collectorToJSonString(this.sessionIdCollector) + ",\"networkTypeCollector\":" + collectorToJSonString(this.networkTypeCollector) + ",\"powerTypeCollector\":" + collectorToJSonString(this.powerTypeCollector) + ",\"batteryPercentageCollector\":" + collectorToJSonString(this.batteryPercentageCollector) + ",\"orientationCollector\":" + collectorToJSonString(this.orientationCollector) + ",\"lastDeclineTimestampCollector\":" + collectorToJSonString(this.lastDeclineTimestampCollector) + ",\"lastSubmitTimestampCollector\":" + collectorToJSonString(this.lastSubmitTimestampCollector) + ",\"invitationDisplayedCollector\":" + collectorToJSonString(this.invitationDisplayedCollector) + ",\"propertyIdCollector\":" + collectorToJSonString(this.propertyIdCollector) + ",\"npsCollector\":" + collectorToJSonString(this.npsCollector) + ",\"csatCollector\":" + collectorToJSonString(this.csatCollector) + ",\"appRatingLastDeclineTimestampCollector\":" + collectorToJSonString(this.appRatingLastDeclineTimestampCollector) + ",\"promptDisplayedCollector\":" + collectorToJSonString(this.promptDisplayedCollector) + ",\"appRatingLastAcceptedTimestampCollector\":" + collectorToJSonString(this.appRatingLastAcceptedTimestampCollector) + ",\"appRatingLastTriggerTimestampCollector\":" + collectorToJSonString(this.appRatingLastTriggerTimestampCollector) + ",\"isOCQUserSetCollector\":" + collectorToJSonString(this.isOCQUserSetCollector) + ",\"isOCQRulesValidCollector\":" + collectorToJSonString(this.isOCQRulesValidCollector) + ",\"isSessionSampledEventsCollector\":" + collectorToJSonString(this.isSessionSampledEventsCollector) + ",\"sessionPercentageSampledEventsCollector\":" + collectorToJSonString(this.sessionPercentageSampledEventsCollector) + ",\"userIdCollector\":" + collectorToJSonString(this.userIdCollector) + ",\"userEmailCollector\":" + collectorToJSonString(this.userEmailCollector) + ",\"userNameCollector\":" + collectorToJSonString(this.userNameCollector) + ",\"customParametersCollector\":" + collectorToJSonString(this.customParametersCollector) + ",\"interceptEnabledCollector\":" + collectorToJSonString(this.interceptEnabledCollector) + ",\"interceptDisabledCollector\":" + collectorToJSonString(this.interceptDisabledCollector) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    CollectorsConfigurationContract(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "sdkVersionCollector";
        String str3 = "appVersionCollector";
        String str4 = "appIdCollector";
        String str5 = "appNameCollector";
        String str6 = "deviceIdCollector";
        String str7 = "networkSpeedCollector";
        String str8 = "ipCollector";
        String str9 = "timezoneCollector";
        try {
            if (!jSONObject2.has("deviceModelCollector") || jSONObject2.isNull("deviceModelCollector")) {
                str = "languageCollector";
            } else {
                str = "languageCollector";
                this.deviceModelCollector = new CollectorContract(jSONObject2.getJSONObject("deviceModelCollector"));
            }
            if (jSONObject2.has("deviceVendorCollector") && !jSONObject2.isNull("deviceVendorCollector")) {
                this.deviceVendorCollector = new CollectorContract(jSONObject2.getJSONObject("deviceVendorCollector"));
            }
            if (jSONObject2.has("deviceResolutionCollector") && !jSONObject2.isNull("deviceResolutionCollector")) {
                this.deviceResolutionCollector = new CollectorContract(jSONObject2.getJSONObject("deviceResolutionCollector"));
            }
            if (jSONObject2.has("deviceUsedMemoryCollector") && !jSONObject2.isNull("deviceUsedMemoryCollector")) {
                this.deviceUsedMemoryCollector = new CollectorContract(jSONObject2.getJSONObject("deviceUsedMemoryCollector"));
            }
            if (jSONObject2.has("deviceFreeMemoryCollector") && !jSONObject2.isNull("deviceFreeMemoryCollector")) {
                this.deviceFreeMemoryCollector = new CollectorContract(jSONObject2.getJSONObject("deviceFreeMemoryCollector"));
            }
            if (jSONObject2.has("deviceUsedDiskSpaceCollector") && !jSONObject2.isNull("deviceUsedDiskSpaceCollector")) {
                this.deviceUsedDiskSpaceCollector = new CollectorContract(jSONObject2.getJSONObject("deviceUsedDiskSpaceCollector"));
            }
            if (jSONObject2.has("deviceFreeDiskSpaceCollector") && !jSONObject2.isNull("deviceFreeDiskSpaceCollector")) {
                this.deviceFreeDiskSpaceCollector = new CollectorContract(jSONObject2.getJSONObject("deviceFreeDiskSpaceCollector"));
            }
            if (jSONObject2.has("externalDriveUsedSpaceCollector") && !jSONObject2.isNull("externalDriveUsedSpaceCollector")) {
                this.externalDriveUsedSpaceCollector = new CollectorContract(jSONObject2.getJSONObject("externalDriveUsedSpaceCollector"));
            }
            if (jSONObject2.has("externalDriveFreeSpaceCollector") && !jSONObject2.isNull("externalDriveFreeSpaceCollector")) {
                this.externalDriveFreeSpaceCollector = new CollectorContract(jSONObject2.getJSONObject("externalDriveFreeSpaceCollector"));
            }
            if (jSONObject2.has("osNameCollector") && !jSONObject2.isNull("osNameCollector")) {
                this.osNameCollector = new CollectorContract(jSONObject2.getJSONObject("osNameCollector"));
            }
            if (jSONObject2.has("osVersionCollector") && !jSONObject2.isNull("osVersionCollector")) {
                this.osVersionCollector = new CollectorContract(jSONObject2.getJSONObject("osVersionCollector"));
            }
            if (jSONObject2.has("networkProviderCollector") && !jSONObject2.isNull("networkProviderCollector")) {
                this.networkProviderCollector = new CollectorContract(jSONObject2.getJSONObject("networkProviderCollector"));
            }
            if (jSONObject2.has("networkCarrierCollector") && !jSONObject2.isNull("networkCarrierCollector")) {
                this.networkCarrierCollector = new CollectorContract(jSONObject2.getJSONObject("networkCarrierCollector"));
            }
            String str10 = str;
            if (jSONObject2.has(str10) && !jSONObject2.isNull(str10)) {
                this.languageCollector = new CollectorContract(jSONObject2.getJSONObject(str10));
            }
            String str11 = str9;
            if (jSONObject2.has(str11) && !jSONObject2.isNull(str11)) {
                this.timezoneCollector = new CollectorContract(jSONObject2.getJSONObject(str11));
            }
            String str12 = str8;
            if (jSONObject2.has(str12) && !jSONObject2.isNull(str12)) {
                this.ipCollector = new CollectorContract(jSONObject2.getJSONObject(str12));
            }
            String str13 = str7;
            if (jSONObject2.has(str13) && !jSONObject2.isNull(str13)) {
                this.networkSpeedCollector = new CollectorContract(jSONObject2.getJSONObject(str13));
            }
            String str14 = str6;
            if (jSONObject2.has(str14) && !jSONObject2.isNull(str14)) {
                this.deviceIdCollector = new CollectorContract(jSONObject2.getJSONObject(str14));
            }
            String str15 = str5;
            if (jSONObject2.has(str15) && !jSONObject2.isNull(str15)) {
                this.appNameCollector = new CollectorContract(jSONObject2.getJSONObject(str15));
            }
            String str16 = str4;
            if (jSONObject2.has(str16) && !jSONObject2.isNull(str16)) {
                this.appIdCollector = new CollectorContract(jSONObject2.getJSONObject(str16));
            }
            String str17 = str3;
            if (jSONObject2.has(str17) && !jSONObject2.isNull(str17)) {
                this.appVersionCollector = new CollectorContract(jSONObject2.getJSONObject(str17));
            }
            String str18 = str2;
            if (jSONObject2.has(str18) && !jSONObject2.isNull(str18)) {
                this.sdkVersionCollector = new CollectorContract(jSONObject2.getJSONObject(str18));
            }
            if (jSONObject2.has("sessionNumberCollector") && !jSONObject2.isNull("sessionNumberCollector")) {
                this.sessionNumberCollector = new CollectorContract(jSONObject2.getJSONObject("sessionNumberCollector"));
            }
            if (jSONObject2.has("sessionIdCollector") && !jSONObject2.isNull("sessionIdCollector")) {
                this.sessionIdCollector = new CollectorContract(jSONObject2.getJSONObject("sessionIdCollector"));
            }
            if (jSONObject2.has("sessionCalculatedPercentageCollector") && !jSONObject2.isNull("sessionCalculatedPercentageCollector")) {
                this.sessionCalculatedPercentageCollector = new CollectorContract(jSONObject2.getJSONObject("sessionCalculatedPercentageCollector"));
            }
            if (jSONObject2.has("networkTypeCollector") && !jSONObject2.isNull("networkTypeCollector")) {
                this.networkTypeCollector = new CollectorContract(jSONObject2.getJSONObject("networkTypeCollector"));
            }
            if (jSONObject2.has("powerTypeCollector") && !jSONObject2.isNull("powerTypeCollector")) {
                this.powerTypeCollector = new CollectorContract(jSONObject2.getJSONObject("powerTypeCollector"));
            }
            if (jSONObject2.has("batteryPercentageCollector") && !jSONObject2.isNull("batteryPercentageCollector")) {
                this.batteryPercentageCollector = new CollectorContract(jSONObject2.getJSONObject("batteryPercentageCollector"));
            }
            if (jSONObject2.has("orientationCollector") && !jSONObject2.isNull("orientationCollector")) {
                this.orientationCollector = new CollectorContract(jSONObject2.getJSONObject("orientationCollector"));
            }
            if (jSONObject2.has("lastDeclineTimestampCollector") && !jSONObject2.isNull("lastDeclineTimestampCollector")) {
                this.lastDeclineTimestampCollector = new CollectorContract(jSONObject2.getJSONObject("lastDeclineTimestampCollector"));
            }
            if (jSONObject2.has("lastSubmitTimestampCollector") && !jSONObject2.isNull("lastSubmitTimestampCollector")) {
                this.lastSubmitTimestampCollector = new CollectorContract(jSONObject2.getJSONObject("lastSubmitTimestampCollector"));
            }
            if (jSONObject2.has("invitationDisplayedCollector") && !jSONObject2.isNull("invitationDisplayedCollector")) {
                this.invitationDisplayedCollector = new CollectorContract(jSONObject2.getJSONObject("invitationDisplayedCollector"));
            }
            if (jSONObject2.has("propertyIdCollector") && !jSONObject2.isNull("propertyIdCollector")) {
                this.propertyIdCollector = new CollectorContract(jSONObject2.getJSONObject("propertyIdCollector"));
            }
            if (jSONObject2.has("npsCollector") && !jSONObject2.isNull("npsCollector")) {
                this.npsCollector = new CollectorContract(jSONObject2.getJSONObject("npsCollector"));
            }
            if (jSONObject2.has("csatCollector") && !jSONObject2.isNull("csatCollector")) {
                this.csatCollector = new CollectorContract(jSONObject2.getJSONObject("csatCollector"));
            }
            if (jSONObject2.has("appRatingLastDeclineTimestampCollector") && !jSONObject2.isNull("appRatingLastDeclineTimestampCollector")) {
                this.appRatingLastDeclineTimestampCollector = new CollectorContract(jSONObject2.getJSONObject("appRatingLastDeclineTimestampCollector"));
            }
            if (jSONObject2.has("promptDisplayedCollector") && !jSONObject2.isNull("promptDisplayedCollector")) {
                this.promptDisplayedCollector = new CollectorContract(jSONObject2.getJSONObject("promptDisplayedCollector"));
            }
            if (jSONObject2.has("appRatingLastAcceptedTimestampCollector") && !jSONObject2.isNull("appRatingLastAcceptedTimestampCollector")) {
                this.appRatingLastAcceptedTimestampCollector = new CollectorContract(jSONObject2.getJSONObject("appRatingLastAcceptedTimestampCollector"));
            }
            if (jSONObject2.has("appRatingLastTriggerTimestampCollector") && !jSONObject2.isNull("appRatingLastTriggerTimestampCollector")) {
                this.appRatingLastTriggerTimestampCollector = new CollectorContract(jSONObject2.getJSONObject("appRatingLastTriggerTimestampCollector"));
            }
            if (jSONObject2.has("isOCQUserSetCollector") && !jSONObject2.isNull("isOCQUserSetCollector")) {
                this.isOCQUserSetCollector = new CollectorContract(jSONObject2.getJSONObject("isOCQUserSetCollector"));
            }
            if (jSONObject2.has("isOCQRulesValidCollector") && !jSONObject2.isNull("isOCQRulesValidCollector")) {
                this.isOCQRulesValidCollector = new CollectorContract(jSONObject2.getJSONObject("isOCQRulesValidCollector"));
            }
            if (jSONObject2.has("isSessionSampledEventsCollector") && !jSONObject2.isNull("isSessionSampledEventsCollector")) {
                this.isSessionSampledEventsCollector = new CollectorContract(jSONObject2.getJSONObject("isSessionSampledEventsCollector"));
            }
            if (jSONObject2.has("sessionPercentageSampledEventsCollector") && !jSONObject2.isNull("sessionPercentageSampledEventsCollector")) {
                this.sessionPercentageSampledEventsCollector = new CollectorContract(jSONObject2.getJSONObject("sessionPercentageSampledEventsCollector"));
            }
            if (jSONObject2.has("userIdCollector") && !jSONObject2.isNull("userIdCollector")) {
                this.userIdCollector = new CollectorContract(jSONObject2.getJSONObject("userIdCollector"));
            }
            if (jSONObject2.has("userEmailCollector") && !jSONObject2.isNull("userEmailCollector")) {
                this.userEmailCollector = new CollectorContract(jSONObject2.getJSONObject("userEmailCollector"));
            }
            if (jSONObject2.has("userNameCollector") && !jSONObject2.isNull("userNameCollector")) {
                this.userNameCollector = new CollectorContract(jSONObject2.getJSONObject("userNameCollector"));
            }
            if (jSONObject2.has("customParametersCollector") && !jSONObject2.isNull("customParametersCollector")) {
                this.customParametersCollector = new CollectorContract(jSONObject2.getJSONObject("customParametersCollector"));
            }
            if (jSONObject2.has("interceptEnabledCollector") && !jSONObject2.isNull("interceptEnabledCollector")) {
                this.interceptEnabledCollector = new CollectorContract(jSONObject2.getJSONObject("interceptEnabledCollector"));
            }
            if (jSONObject2.has("interceptDisabledCollector") && !jSONObject2.isNull("interceptDisabledCollector")) {
                this.interceptDisabledCollector = new CollectorContract(jSONObject2.getJSONObject("interceptDisabledCollector"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
