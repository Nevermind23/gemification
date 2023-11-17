package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11113u4;
import com.medallia.digital.mobilesdk.C11164w3;
import com.medallia.digital.mobilesdk.C11221y3;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p342j$.util.concurrent.ConcurrentHashMap;

public abstract class BaseFormCommunicator implements C11164w3.C11172h {
    static final int DELAY = 500;
    boolean audioRecording = false;
    String feedbackClientCorrelationId = null;
    C11013n2 formData;
    String formId;
    FormTriggerType formTriggerType;
    FormViewType formViewType;
    final Handler handler = new Handler(Looper.getMainLooper());
    boolean hasMediaData = false;
    private final boolean isFeedbackSubmitIndicatorEnabled;
    C10996m2 listener;
    C11238z3 localizationContract;
    C11173w4 mediaData;
    C11225y4 mediaDataFromJS;
    Map<String, JSONObject> runAsyncResults = new ConcurrentHashMap();
    ArrayList<String> unSupportedVideoFormats;
    String uniqueFunctionResult = null;

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$a */
    class C10666a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f30441a;

        C10666a(String str) {
            this.f30441a = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            Toast.makeText(C10884i4.m39721c().mo28483b(), this.f30441a, 0).show();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$b */
    class C10667b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ ArrayList f30443a;

        C10667b(ArrayList arrayList) {
            this.f30443a = arrayList;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10735b4.m39113e("List of Permissions Granted : " + this.f30443a);
            Activity activity = (Activity) C10884i4.m39721c().mo28484d().getBaseContext();
            String d = BaseFormCommunicator.this.mediaDataFromJS.mo29229d();
            String str = "android.permission.READ_EXTERNAL_STORAGE";
            if (this.f30443a.isEmpty() || d == null) {
                int i = C10668c.f30446b[C10721a5.m39049a(d).ordinal()];
                if (i == 1) {
                    str = "android.permission.CAMERA";
                } else if (i == 2) {
                    str = "android.permission.RECORD_AUDIO";
                } else if (i != 3) {
                    str = null;
                }
                C11113u4.m40748b().mo29032b(str);
                BaseFormCommunicator.this.handlePermissionsDenied();
                return;
            }
            int i2 = C10668c.f30446b[C10721a5.m39049a(d).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 && this.f30443a.contains(str)) {
                        C11113u4.m40748b().mo29025a(activity);
                    }
                } else if (this.f30443a.contains("android.permission.RECORD_AUDIO")) {
                    BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                    C11113u4 b = C11113u4.m40748b();
                    BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                    baseFormCommunicator.mediaData = b.mo29021a(d, baseFormCommunicator2.formId, baseFormCommunicator2.formData.mo28793b(), BaseFormCommunicator.this.mediaDataFromJS.mo29228c());
                    BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
                    baseFormCommunicator3.handleResponse(baseFormCommunicator3.mediaData, C11113u4.C11124k.allowAudioPermission);
                    BaseFormCommunicator.this.audioRecording = true;
                }
            } else if (this.f30443a.contains("android.permission.CAMERA")) {
                C11113u4.m40748b().mo29026a(activity, BaseFormCommunicator.this.mediaDataFromJS.mo29230e());
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$c */
    static /* synthetic */ class C10668c {

        /* renamed from: a */
        static final /* synthetic */ int[] f30445a;

        /* renamed from: b */
        static final /* synthetic */ int[] f30446b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.medallia.digital.mobilesdk.a5[] r0 = com.medallia.digital.mobilesdk.C10721a5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30446b = r0
                r1 = 1
                com.medallia.digital.mobilesdk.a5 r2 = com.medallia.digital.mobilesdk.C10721a5.video     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f30446b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.a5 r3 = com.medallia.digital.mobilesdk.C10721a5.audio     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f30446b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.a5 r3 = com.medallia.digital.mobilesdk.C10721a5.upload     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.medallia.digital.mobilesdk.r4[] r2 = com.medallia.digital.mobilesdk.C11076r4.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f30445a = r2
                com.medallia.digital.mobilesdk.r4 r3 = com.medallia.digital.mobilesdk.C11076r4.select     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f30445a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.medallia.digital.mobilesdk.r4 r2 = com.medallia.digital.mobilesdk.C11076r4.end     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.BaseFormCommunicator.C10668c.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$d */
    class C10669d extends C11033o4 {
        C10669d() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10735b4.m39109b("FormId: " + BaseFormCommunicator.this.formId + " ready");
            C10996m2 m2Var = BaseFormCommunicator.this.listener;
            if (m2Var != null) {
                m2Var.onReady();
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$e */
    class C10670e extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f30448a;

        C10670e(String str) {
            this.f30448a = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            String str;
            if (C11089s6.m40668b().mo28980a(C11089s6.C11090a.SDK_STOPPED, false)) {
                str = "Feedback can’t be sent because of stop sdk";
            } else if (new C11066q3().mo28940b()) {
                str = "Submit sdk was cancelled by sdk kill";
            } else {
                C10735b4.m39113e("FormId: " + BaseFormCommunicator.this.formId + " sendFeedbackToMobileSdk was called - feedbackData = " + this.f30448a);
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                if (baseFormCommunicator.mediaData != null) {
                    baseFormCommunicator.hasMediaData = true;
                }
                baseFormCommunicator.notifySendFeedback();
                C10887i7.m39741e().mo28489b(BaseFormCommunicator.this.formId);
                String str2 = this.f30448a;
                if (str2 == null || str2.equals("undefined") || this.f30448a.isEmpty()) {
                    str = "Submit feedback data - null";
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(this.f30448a);
                        JSONObject jSONObject2 = new JSONObject();
                        if (jSONObject.has("uuid") && !jSONObject.isNull("uuid")) {
                            BaseFormCommunicator.this.feedbackClientCorrelationId = jSONObject.getString("uuid");
                            jSONObject2.put("uuid", C11051p3.m40514a((Object) BaseFormCommunicator.this.feedbackClientCorrelationId));
                        }
                        if (jSONObject.has("dynamicData") && !jSONObject.isNull("dynamicData")) {
                            jSONObject2.put("dynamicData", C11051p3.m40514a((Object) jSONObject.getJSONObject("dynamicData")));
                        }
                        C11016n4 f = C11016n4.m40375f();
                        C11089s6.C11090a aVar = C11089s6.C11090a.OCQ_USER_ID;
                        if (f.mo28829a(aVar) != null && !C11016n4.m40375f().mo28829a(aVar).isEmpty()) {
                            jSONObject.put("cuid", C11016n4.m40375f().mo28829a(aVar));
                        }
                        BaseFormCommunicator.this.sendFeedbackPayloadAndUpdateRatingCollectors(jSONObject2);
                        BaseFormCommunicator.this.addMobileDeviceData(jSONObject);
                        BaseFormCommunicator.this.addFormMissingData(jSONObject);
                        BaseFormCommunicator.this.separateCustomParams(jSONObject);
                        jSONObject.put("appearanceMode", C10986l7.m40219c().mo28703a());
                        C11013n2 n2Var = BaseFormCommunicator.this.formData;
                        if (!(n2Var == null || n2Var.getInviteData() == null)) {
                            jSONObject.put("mobileInvitationType", BaseFormCommunicator.this.formData.getInviteData().getType());
                        }
                        BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                        String jSONObject3 = jSONObject.toString();
                        String string = jSONObject2.has("uuid") ? jSONObject2.getString("uuid") : null;
                        BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
                        baseFormCommunicator2.sendFeedback(new C10826g2(jSONObject3, string, baseFormCommunicator3.formId, baseFormCommunicator3.formTriggerType, System.currentTimeMillis(), 0));
                        BaseFormCommunicator baseFormCommunicator4 = BaseFormCommunicator.this;
                        C11173w4 w4Var = baseFormCommunicator4.mediaData;
                        if (w4Var == null) {
                            return;
                        }
                        if (baseFormCommunicator4.audioRecording) {
                            C11113u4.m40748b().mo29028a(BaseFormCommunicator.this.mediaData.mo29139e());
                            return;
                        }
                        w4Var.mo29134a(baseFormCommunicator4.feedbackClientCorrelationId);
                        C10916j4 b = C10916j4.m39856b();
                        BaseFormCommunicator baseFormCommunicator5 = BaseFormCommunicator.this;
                        b.mo28546a(baseFormCommunicator5.mediaData, baseFormCommunicator5.getMediaCapture(), Boolean.valueOf(BaseFormCommunicator.this.isPreviewApp()));
                        if (!BaseFormCommunicator.this.isPreviewApp()) {
                            AnalyticsBridge.getInstance().reportMediaCaptureCollectedEvent(BaseFormCommunicator.this.mediaData);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        C10735b4.m39111c(e.getMessage());
                        return;
                    }
                }
            }
            C10735b4.m39113e(str);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$f */
    class C10671f extends C11033o4 {
        C10671f() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10735b4.m39113e("FormId: " + BaseFormCommunicator.this.formId + " submitSuccess was called");
            BaseFormCommunicator.this.notifySendFeedback();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$g */
    class C10672g extends C11033o4 {
        C10672g() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10996m2 m2Var = BaseFormCommunicator.this.listener;
            if (m2Var != null) {
                m2Var.onClose();
                C10735b4.m39113e("FormId: " + BaseFormCommunicator.this.formId + " close was called");
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$h */
    class C10673h implements C11087s4<C11076r4> {
        C10673h() {
        }

        /* renamed from: a */
        public void mo27619a(C11076r4 r4Var) {
            BaseFormCommunicator.this.createMediaData();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$i */
    class C10674i extends C11033o4 {
        C10674i() {
        }

        /* renamed from: a */
        public void mo27617a() {
            BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
            C11113u4 b = C11113u4.m40748b();
            BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
            baseFormCommunicator.mediaData = b.mo29020a(baseFormCommunicator2.mediaDataFromJS, baseFormCommunicator2.formData, baseFormCommunicator2.isPreviewApp());
            BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
            if (baseFormCommunicator3.mediaData != null) {
                baseFormCommunicator3.handleResponse((C11173w4) null, C11113u4.C11124k.allowAudioPermission);
                BaseFormCommunicator.this.audioRecording = true;
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$j */
    class C10675j implements C11087s4<C11076r4> {
        C10675j() {
        }

        /* renamed from: a */
        public void mo27619a(C11076r4 r4Var) {
            try {
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                baseFormCommunicator.invokeJSResponse(baseFormCommunicator.uniqueFunctionResult, new JSONObject().put("response", r4Var));
                C11173w4 w4Var = BaseFormCommunicator.this.mediaData;
                if (w4Var != null) {
                    C10930k2.m39983c(w4Var.mo29139e());
                    BaseFormCommunicator.this.mediaData = null;
                }
            } catch (JSONException e) {
                C10735b4.m39111c("Message" + e.getMessage());
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$k */
    class C10676k extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ C11076r4 f30455a;

        /* renamed from: b */
        final /* synthetic */ C11087s4 f30456b;

        /* renamed from: c */
        final /* synthetic */ C11013n2 f30457c;

        C10676k(C11076r4 r4Var, C11087s4 s4Var, C11013n2 n2Var) {
            this.f30455a = r4Var;
            this.f30456b = s4Var;
            this.f30457c = n2Var;
        }

        /* renamed from: a */
        public void mo27617a() {
            C11113u4.m40748b().mo29027a(this.f30455a, (C11087s4<C11076r4>) this.f30456b, this.f30457c, BaseFormCommunicator.this.isPreviewApp());
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$l */
    class C10677l extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ Intent f30459a;

        /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$l$a */
        class C10678a extends C11033o4 {
            C10678a() {
            }

            /* renamed from: a */
            public void mo27617a() {
                C11113u4.m40748b().mo29033c();
            }
        }

        /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$l$b */
        class C10679b extends C11033o4 {

            /* renamed from: a */
            final /* synthetic */ String f30462a;

            /* renamed from: b */
            final /* synthetic */ String f30463b;

            /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$l$b$a */
            class C10680a implements C11087s4<C11076r4> {
                C10680a() {
                }

                /* renamed from: a */
                public void mo27619a(C11076r4 r4Var) {
                    if (C10679b.this.f30462a.equals(C10721a5.upload.toString())) {
                        C10930k2.m39983c(C10679b.this.f30463b);
                        C11113u4.m40748b().mo29025a((Activity) C10884i4.m39721c().mo28484d().getBaseContext());
                        return;
                    }
                    C10930k2.m39983c(C10679b.this.f30463b);
                    C11113u4.m40748b().mo29026a((Activity) C10884i4.m39721c().mo28484d().getBaseContext(), BaseFormCommunicator.this.mediaDataFromJS.mo29230e());
                }
            }

            C10679b(String str, String str2) {
                this.f30462a = str;
                this.f30463b = str2;
            }

            /* renamed from: a */
            public void mo27617a() {
                C11113u4.m40748b().mo29024a();
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                baseFormCommunicator.showCustomAlert(C11076r4.videoTimeLimitation, baseFormCommunicator.formData, new C10680a());
            }
        }

        C10677l(Intent intent) {
            this.f30459a = intent;
        }

        /* renamed from: a */
        public void mo27617a() {
            String uuid = UUID.randomUUID().toString();
            String d = BaseFormCommunicator.this.mediaDataFromJS.mo29229d();
            Intent intent = this.f30459a;
            if (intent == null || d == null || intent.getData() == null) {
                C10735b4.m39111c("Can not handle Video Media Capture");
                return;
            }
            BaseFormCommunicator.this.handler.postDelayed(new C10678a(), 1);
            try {
                boolean a = C11113u4.m40748b().mo29030a(this.f30459a.getData(), BaseFormCommunicator.this.unSupportedVideoFormats);
                String a2 = C11113u4.m40748b().mo29023a(this.f30459a.getData(), uuid, d);
                if (C11113u4.m40748b().mo29029a(this.f30459a.getData(), BaseFormCommunicator.this.mediaDataFromJS.mo29230e())) {
                    BaseFormCommunicator.this.handler.postDelayed(new C10679b(d, a2), 500);
                } else if (a2 != null) {
                    BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                    baseFormCommunicator.mediaData = new C11173w4(uuid, (String) null, a2, baseFormCommunicator.formId, baseFormCommunicator.formData.mo28793b(), C10721a5.m39050b(d), System.currentTimeMillis(), BaseFormCommunicator.this.mediaDataFromJS.mo29228c(), 0);
                    BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                    baseFormCommunicator2.handleResponse(baseFormCommunicator2.mediaData, a ? C11113u4.C11124k.finishMediaRecording : C11113u4.C11124k.unSupportedMediaFormat);
                }
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
                BaseFormCommunicator.this.handleResponse((C11173w4) null, C11113u4.C11124k.finishMediaRecording);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$m */
    public enum C10681m {
        MOBILE_DEVICE_DATA("mobileDeviceData"),
        DEVICE_RESOLUTION("deviceResolution"),
        DEVICE_LOCALE("deviceLocale"),
        DEVICE_VENDOR("deviceVendor");
        

        /* renamed from: a */
        private final String f30471a;

        private C10681m(String str) {
            this.f30471a = str;
        }

        /* renamed from: a */
        public String mo27622a() {
            return this.f30471a;
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.BaseFormCommunicator$n */
    public enum C10682n {
        FORM_LANGUAGE("formLanguage");
        

        /* renamed from: a */
        private final String f30474a;

        private C10682n(String str) {
            this.f30474a = str;
        }

        /* renamed from: a */
        public String mo27623a() {
            return this.f30474a;
        }
    }

    BaseFormCommunicator(C11013n2 n2Var, C10996m2 m2Var, FormTriggerType formTriggerType2, FormViewType formViewType2, C11238z3 z3Var, boolean z) {
        this.listener = m2Var;
        this.formData = n2Var;
        if (n2Var != null) {
            this.formId = n2Var.getFormId();
        }
        this.formTriggerType = formTriggerType2;
        this.formViewType = formViewType2;
        this.localizationContract = z3Var;
        this.isFeedbackSubmitIndicatorEnabled = z;
        C11164w3.m40939b().mo29113a((C11164w3.C11172h) this);
    }

    /* access modifiers changed from: private */
    public void showCustomAlert(C11076r4 r4Var, C11013n2 n2Var, C11087s4<C11076r4> s4Var) {
        C11004m7.m40304b().mo28763a().execute(new C10676k(r4Var, s4Var, n2Var));
    }

    /* access modifiers changed from: protected */
    public void addFormMissingData(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                C11013n2 n2Var = this.formData;
                if (n2Var == null) {
                    return;
                }
                if (n2Var.getFormLanguage() != null) {
                    jSONObject.put(C10682n.FORM_LANGUAGE.mo27623a(), C11051p3.m40514a((Object) this.formData.getFormLanguage()));
                }
            } catch (Exception e) {
                C10735b4.m39109b(e.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addMobileDeviceData(JSONObject jSONObject) {
        try {
            C10681m mVar = C10681m.MOBILE_DEVICE_DATA;
            JSONObject jSONObject2 = (!jSONObject.has(mVar.mo27622a()) || jSONObject.isNull(mVar.mo27622a())) ? null : jSONObject.getJSONObject(mVar.mo27622a());
            if (jSONObject2 != null) {
                jSONObject2.put(C10681m.DEVICE_RESOLUTION.mo27622a(), C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getDeviceResolution()));
                jSONObject2.put(C10681m.DEVICE_LOCALE.mo27622a(), C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getLanguage()));
                jSONObject2.put(C10681m.DEVICE_VENDOR.mo27622a(), C11051p3.m40514a((Object) CollectorsInfrastructure.getInstance().getDeviceVendor()));
                jSONObject.put(mVar.mo27622a(), jSONObject2);
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    @JavascriptInterface
    public String asyncMediaAlertResponse(String str) {
        return asyncMediaResultResponse(str);
    }

    @JavascriptInterface
    public String asyncMediaCaptureResult(String str) {
        return asyncMediaResultResponse(str);
    }

    /* access modifiers changed from: protected */
    public String asyncMediaResultResponse(String str) {
        JSONObject jSONObject = this.runAsyncResults.get(str);
        this.runAsyncResults.remove(str);
        C11113u4.m40748b().mo29024a();
        return jSONObject != null ? jSONObject.toString() : "";
    }

    /* access modifiers changed from: protected */
    public void checkWhichPermissionsGranted(ArrayList<String> arrayList) {
        C11004m7.m40304b().mo28763a().execute(new C10667b(arrayList));
    }

    @JavascriptInterface
    public void close() {
        C11004m7.m40304b().mo28763a().execute(new C10672g());
    }

    /* access modifiers changed from: protected */
    public void createMediaData() {
        C11004m7.m40304b().mo28763a().execute(new C10674i());
    }

    @JavascriptInterface
    public String getCustomParams() {
        return getCustomParamsString();
    }

    /* access modifiers changed from: package-private */
    public abstract String getCustomParamsString();

    @JavascriptInterface
    public String getDeviceData() {
        return provideDeviceData();
    }

    /* access modifiers changed from: protected */
    public boolean getHasMediaData() {
        return this.hasMediaData;
    }

    /* access modifiers changed from: protected */
    public abstract C11099t4 getMediaCapture();

    /* access modifiers changed from: protected */
    public C11173w4 getMediaData() {
        return this.mediaData;
    }

    @JavascriptInterface
    public String getProvisions() {
        return getProvisionsData();
    }

    /* access modifiers changed from: package-private */
    public abstract String getProvisionsData();

    @JavascriptInterface
    public String getSDKData() {
        return provideSdkData();
    }

    @JavascriptInterface
    public String getSecretToken() {
        C10730b a = C10718a3.m39038c().mo28069a();
        C10735b4.m39109b("FormId: " + this.formId + " getSecretToken was called");
        if (a != null) {
            return a.mo28827a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void handlePermissionsDenied() {
        JSONObject jSONObject = new JSONObject();
        try {
            showCustomAlert(C11076r4.permission, this.formData, (C11087s4<C11076r4>) null);
            jSONObject.put(UrlHandler.ACTION, C11113u4.C11124k.denyPermission.mo29042a());
            jSONObject.put("captureData", "");
            invokeJSResponse(this.uniqueFunctionResult, jSONObject);
            C10735b4.m39113e("No Permissions Granted - result: " + jSONObject);
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void handleResponse(C11173w4 w4Var, C11113u4.C11124k kVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = "";
        String b = getMediaCapture() == null ? str : getMediaCapture().mo29005b();
        try {
            jSONObject.put(UrlHandler.ACTION, kVar.mo29042a());
            JSONObject put = jSONObject2.put("path", w4Var != null ? w4Var.mo29139e() : str);
            if (w4Var != null) {
                str = w4Var.mo29138d();
            }
            jSONObject.put("captureData", put.put("mediaCaptureClientCorrelationId", str).put("llChannelId", b));
            invokeJSResponse(this.uniqueFunctionResult, jSONObject);
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void handleStopAudioMediaCapture() {
        try {
            this.audioRecording = false;
            C11113u4.m40748b().mo29034d();
            handleResponse(this.mediaData, C11113u4.C11124k.finishMediaRecording);
        } catch (Exception e) {
            C10735b4.m39111c("Failed to recording audio " + e.getMessage());
            C10930k2.m39983c(this.mediaData.mo29139e());
            handleResponse((C11173w4) null, C11113u4.C11124k.allowAudioPermission);
        }
    }

    public void handleVideoMediaCapture(Intent intent) {
        C11004m7.m40304b().mo28763a().execute(new C10677l(intent));
    }

    /* access modifiers changed from: protected */
    public void invokeJSResponse(String str, JSONObject jSONObject) {
        try {
            jsResolve(str, true, jSONObject);
        } catch (Exception e) {
            try {
                jsResolve(str, false, jSONObject.put("error", e.toString()));
            } catch (JSONException unused) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean isPreviewApp();

    /* access modifiers changed from: protected */
    public void jsResolve(String str, boolean z, JSONObject jSONObject) {
        this.runAsyncResults.put(str, jSONObject);
        this.listener.mediaCaptureResult("javascript:" + str + ".callback(" + z + ")");
    }

    @JavascriptInterface
    public void mediaCaptureDeleted(String str, String str2) {
        this.uniqueFunctionResult = str;
        try {
            C11225y4 y4Var = new C11225y4(new JSONObject(str2));
            this.mediaDataFromJS = y4Var;
            if (C11076r4.valueOf(y4Var.mo29226a()) == C11076r4.forceDelete) {
                C10930k2.m39983c(this.mediaData.mo29139e());
                this.mediaData = null;
                return;
            }
            showCustomAlert(C11076r4.valueOf(this.mediaDataFromJS.mo29226a()), this.formData, new C10675j());
        } catch (Exception e) {
            C10735b4.m39111c("Can not create response object " + e.getMessage());
        }
    }

    @JavascriptInterface
    public void mediaCaptureSelected(String str, String str2) {
        boolean z;
        C11099t4 mediaCaptureConfiguration;
        this.uniqueFunctionResult = str;
        boolean a = C10988l8.m40231a();
        if (isPreviewApp() || C11208y0.m41106c().mo29204a() == null || C11208y0.m41106c().mo29204a().getSdkConfiguration() == null) {
            z = true;
        } else {
            z = C11208y0.m41106c().mo29204a().getSdkConfiguration().getMedalliaDigitalBrain() != null ? C11208y0.m41106c().mo29204a().getSdkConfiguration().getMedalliaDigitalBrain().isRequestMediaCapturePermissions() : true;
            if (!(C11208y0.m41106c().mo29204a().getSdkConfiguration().getMedalliaDigitalClientConfig() == null || (mediaCaptureConfiguration = C11208y0.m41106c().mo29204a().getSdkConfiguration().getMedalliaDigitalClientConfig().getMediaCaptureConfiguration()) == null)) {
                this.unSupportedVideoFormats = mediaCaptureConfiguration.mo29010g();
            }
        }
        if (!z) {
            showCustomAlert(C11076r4.permission, this.formData, (C11087s4<C11076r4>) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(UrlHandler.ACTION, C11113u4.C11124k.denyPermission.mo29042a());
                jSONObject.put("captureData", "");
                invokeJSResponse(this.uniqueFunctionResult, jSONObject);
                C10735b4.m39113e("No Permissions Granted - result: " + jSONObject);
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        } else if (str2 == null || str2.equals("undefined") || str2.isEmpty()) {
            C10735b4.m39113e("Media Data is not valid");
        } else {
            C10735b4.m39109b("Media data: " + str2);
            try {
                C11225y4 y4Var = new C11225y4(new JSONObject(str2));
                this.mediaDataFromJS = y4Var;
                int i = C10668c.f30445a[C11076r4.valueOf(y4Var.mo29226a()).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (!this.audioRecording) {
                            handlePermissionsDenied();
                        } else {
                            handleStopAudioMediaCapture();
                        }
                    }
                } else if (a) {
                    showCustomAlert(C11076r4.select, this.formData, new C10673h());
                } else {
                    createMediaData();
                }
            } catch (Exception e2) {
                C10735b4.m39111c("Can not parse media data object " + e2.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void notifySendFeedback();

    public void onBackground() {
        C10735b4.m39113e("From is in background");
        if (this.audioRecording && this.mediaData != null) {
            C11113u4.m40748b().mo29028a(this.mediaData.mo29139e());
        }
    }

    public void onForeground() {
    }

    /* access modifiers changed from: package-private */
    public abstract String provideDeviceData();

    /* access modifiers changed from: package-private */
    public abstract String provideSdkData();

    @JavascriptInterface
    public void ready() {
        C11004m7.m40304b().mo28763a().execute(new C10669d());
    }

    @JavascriptInterface
    public void sendErrorToMobileSdk(String str) {
        C10735b4.m39111c("Live Form Error: " + str);
    }

    /* access modifiers changed from: package-private */
    public abstract void sendFeedback(C10826g2 g2Var);

    /* access modifiers changed from: package-private */
    public abstract void sendFeedbackPayloadAndUpdateRatingCollectors(JSONObject jSONObject);

    @JavascriptInterface
    public void sendFeedbackToMobileSdk(String str) {
        C11004m7.m40304b().mo28763a().execute(new C10670e(str));
    }

    /* access modifiers changed from: package-private */
    public abstract void separateCustomParams(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public void setListener(C10996m2 m2Var) {
        this.listener = m2Var;
    }

    /* access modifiers changed from: protected */
    public void showAccessibilityToastIfNeeded() {
        String str;
        C11238z3 z3Var;
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) C10884i4.m39721c().mo28483b().getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && this.isFeedbackSubmitIndicatorEnabled) {
                if (this.formData == null || (z3Var = this.localizationContract) == null) {
                    str = "Feedback Submitted Successfully";
                } else {
                    ResourceContract f = z3Var.mo29251f();
                    str = C11221y3.m41127d().mo29210a(f != null ? f.getLocalUrl() : null, this.formData.getFormLanguage(), C11221y3.C11224c.SUBMIT, (C11221y3.C11222a) null);
                }
                if (this.formData != null) {
                    C11004m7.m40304b().mo28764c().execute(new C10666a(str));
                }
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    @JavascriptInterface
    public void submitFailed() {
        C10735b4.m39113e("FormId: " + this.formId + " submitFailed was called");
    }

    @JavascriptInterface
    public void submitPending() {
        submitPending(true);
    }

    @JavascriptInterface
    public void submitSuccess() {
        C11004m7.m40304b().mo28763a().execute(new C10671f());
    }

    BaseFormCommunicator(String str, C10996m2 m2Var, FormTriggerType formTriggerType2, FormViewType formViewType2, C11238z3 z3Var, boolean z) {
        this.listener = m2Var;
        this.formId = str;
        this.formData = C11138v2.m40821f().mo29070c(str);
        this.formTriggerType = formTriggerType2;
        this.formViewType = formViewType2;
        this.localizationContract = z3Var;
        this.isFeedbackSubmitIndicatorEnabled = z;
        C11164w3.m40939b().mo29113a((C11164w3.C11172h) this);
    }

    @JavascriptInterface
    public void submitPending(boolean z) {
        C10996m2 m2Var;
        C10735b4.m39113e("FormId: " + this.formId + " submitPending was called - shouldClose = " + z);
        if (z && (m2Var = this.listener) != null) {
            m2Var.onClose();
        }
        showAccessibilityToastIfNeeded();
    }
}
