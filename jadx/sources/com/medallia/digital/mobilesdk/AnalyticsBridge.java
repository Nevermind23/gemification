package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.medallia.digital.mobilesdk.C11013n2;
import com.medallia.digital.mobilesdk.C11089s6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

class AnalyticsBridge extends Observable implements C10769c8 {
    private static final String CLEAR_DATA = "clearData";
    private static final String JSON_ACTION_BUTTONS_ENABLED = "actionButtonsEnabled";
    private static final String JSON_ACTIVITY_NAME = "activityName";
    private static final String JSON_APPEARANCE_MODE = "appearanceMode";
    private static final String JSON_APP_RATING_ID = "appRatingId";
    private static final String JSON_CUSTOM_PARAMETER_NAME = "customParameterName";
    private static final String JSON_CUSTOM_PARAMETER_NAMES = "customParameterNames";
    private static final String JSON_DB_SIZE = "dbSize";
    private static final String JSON_DEFERRED_REASON = "deferredReason";
    private static final String JSON_DELAY = "delay";
    private static final String JSON_DELIVERED_TIMESTAMP = "deliveredTimestamp";
    private static final String JSON_DURATION = "duration";
    private static final String JSON_END_TIME = "endTime";
    private static final String JSON_ENGAGEMENT_ID = "engagementId";
    private static final String JSON_ENGAGEMENT_TYPE = "engagementType";
    private static final String JSON_ERROR_CODE = "errorCode";
    private static final String JSON_ERROR_MESSAGE = "errorMessage";
    private static final String JSON_EXTRA_TRE_LOGIC_UJ = "extraTreLogicUj";
    private static final String JSON_EXTRA_UJ_DISTINCT_COLLECTORS = "extraUjDistinctCollectors";
    private static final String JSON_EXTRA_UJ_FETCH = "extraUjFetch";
    private static final String JSON_EXTRA_UJ_UPDATE = "extraUjUpdate";
    private static final String JSON_FEEDBACK_CLIENT_CORRELATION_ID = "feedbackClientCorrelationId";
    private static final String JSON_FEEDBACK_UUID = "feedbackUUID";
    private static final String JSON_FILE_PATH = "filePath";
    private static final String JSON_FORMS_RESOURCES_SIZE = "formsResourcesSize";
    private static final String JSON_FORM_ID = "formId";
    private static final String JSON_FORM_LOADING_TIME = "formLoadingTime";
    private static final String JSON_FORM_LOCALE_DISPLAY = "formLocaleDisplay";
    private static final String JSON_FORM_LOCALE_SET = "formLocaleSet";
    private static final String JSON_FORM_STATUS = "formStatus";
    private static final String JSON_FORM_TIME_TO_DISPLAY = "timeToDisplay";
    private static final String JSON_FORM_TRIGGER_TYPE = "formTriggerType";
    private static final String JSON_FORM_VIEW_TYPE = "formViewType";
    private static final String JSON_ID = "id";
    private static final String JSON_INITIATOR = "initiator";
    private static final String JSON_INTERFACE_TYPE = "interfaceType";
    private static final String JSON_INVITATION_SKIPPED_REASON = "invitationSkippedReason";
    private static final String JSON_INVITATION_TYPE = "invitationType";
    private static final String JSON_INVITE_TYPE = "inviteType";
    private static final String JSON_IS_FAST_LOADING_FORM = "isFastLoadingForm";
    private static final String JSON_IS_USER_ID_EMPTY = "isUserIdEmpty";
    private static final String JSON_IS_VALID = "isValid";
    private static final String JSON_KILLED_OS_VERSION = "killedOsVersion";
    private static final String JSON_KILLED_SDK_VERSION = "killedSdkVersion";
    private static final String JSON_KILL_SDK_TIMESTAMP = "killSdkTimestamp";
    private static final String JSON_LAST_SUBMIT_TIMESTAMP = "lastSubmitTimestamp";
    private static final String JSON_LOCALE = "locale";
    private static final String JSON_LOG_LEVEL = "logLevel";
    private static final String JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID = "mediaCaptureClientCorrelationId";
    private static final String JSON_MEDIA_CHANNEL_ID = "channelId";
    private static final String JSON_MEDIA_TYPE_CAPTURE = "mediaTypeCapture";
    private static final String JSON_METHOD = "method";
    private static final String JSON_NUMBER_OF_FEEDBACKS = "numberOfFeedbacks";
    private static final String JSON_NUMBER_OF_RETRIES = "numberOfRetries";
    private static final String JSON_PAYLOAD_SIZE = "payloadSizeInKB";
    private static final String JSON_PREVIOUS_SESSION_ID = "previousSessionId";
    private static final String JSON_PRE_INIT = "preInit";
    private static final String JSON_REASON = "reason";
    private static final String JSON_RELOADING_FORM_NUMBER = "reloadingFormNumber";
    private static final String JSON_RESPONSE_CODE = "responseCode";
    private static final String JSON_RESTORE_TIME = "restoreTime";
    private static final String JSON_RESULT = "result";
    private static final String JSON_RESULT_FROM_JS = "resultFromJs";
    private static final String JSON_SESSION_INACTIVITY_TIME = "sessionInactivityTime";
    private static final String JSON_START_TIME = "startTime";
    private static final String JSON_STATUS = "status";
    private static final String JSON_STICKY_MODE = "stickyMode";
    private static final String JSON_SUBMITTED_TIMESTAMP = "submittedTimestamp";
    private static final String JSON_TARGET_ENGINE_SIZE = "targetEngineSize";
    private static final String JSON_TEMPLATES_SIZE = "templatesSize";
    private static final String JSON_TIMESTAMP_LAST_CACHED_DATA = "timestampLastCachedData";
    private static final String JSON_TIME_IN_BACKGROUND = "timeInBackground";
    private static final String JSON_TOTAL_DIRECTORY_SIZE = "totalDirectorySize";
    private static final String JSON_TYP_CLOSE_BUTTON = "closeButtonSelected";
    private static final String JSON_TYP_IMAGE = "image";
    private static final String JSON_URL = "url";
    private static AnalyticsBridge instance;
    private final C10925k analyticsV2Generator = new C10925k();
    private boolean isAnalyticsEnabled;
    private boolean isAnalyticsV2;
    private boolean isFormResourcesReady = false;
    private boolean isSdkRunning;
    private boolean isTreResourceReady = false;
    private final ArrayList<C10802f0> pendingEvents = new ArrayList<>();
    private final ArrayList<C10874i> pendingEventsV2 = new ArrayList<>();
    private final ArrayList<Pair<C10664b, JSONObject>> preInitEventsV2 = new ArrayList<>();

    /* renamed from: com.medallia.digital.mobilesdk.AnalyticsBridge$a */
    static /* synthetic */ class C10663a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30410a;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.medallia.digital.mobilesdk.AnalyticsBridge$b[] r0 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30410a = r0
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.init     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.initCallback     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.initOfflineMechanism     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.disableIntercept     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.enableIntercept     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.logger     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setCustomParameter     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setCustomParameters     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.updateCustomLocale     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setCustomAppearance     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.internalError     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setActivity     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.stopSDK     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.revertStopSDK     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setFormListener     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setFeedbackListener     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setInvitationListener     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setInterceptListener     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setCustomInterceptListener     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.preloadMechanism     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.deleteStorage     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.restoreFromKillSDK     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.restClient     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f30410a     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.medallia.digital.mobilesdk.AnalyticsBridge$b r1 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10664b.setUserId     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.AnalyticsBridge.C10663a.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.AnalyticsBridge$b */
    protected enum C10664b {
        init,
        initCallback,
        initOfflineMechanism,
        disableIntercept,
        enableIntercept,
        logger,
        setCustomParameter,
        setCustomParameters,
        updateCustomLocale,
        internalError,
        crash,
        setActivity,
        stopSDK,
        revertStopSDK,
        setFormListener,
        setFeedbackListener,
        setInvitationListener,
        setInterceptListener,
        setCustomInterceptListener,
        preloadMechanism,
        deleteStorage,
        restoreFromKillSDK,
        setCustomAppearance,
        restClient,
        setUserId
    }

    /* renamed from: com.medallia.digital.mobilesdk.AnalyticsBridge$c */
    protected enum C10665c {
        success,
        failure,
        pending
    }

    AnalyticsBridge() {
    }

    private void deleteStorageV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28601g(jSONObject));
    }

    private void disableInterceptV2() {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28580a());
    }

    private void enableInterceptV2() {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28586b());
    }

    private void extraDataEventV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28602h(jSONObject));
    }

    private JSONArray getAndClearInitCallbackEventsFromStorage() {
        String a;
        SharedPreferences c = C11089s6.m40668b().mo28986c();
        C11089s6.C11090a aVar = C11089s6.C11090a.INIT_CALLBACK_EVENT;
        JSONArray jSONArray = null;
        if (!c.contains(aVar.toString()) || (a = C11089s6.m40668b().mo28975a(aVar, (String) null)) == null) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(a);
            try {
                C11089s6.m40668b().mo28978a(aVar);
                return jSONArray2;
            } catch (Exception e) {
                e = e;
                jSONArray = jSONArray2;
                C10735b4.m39111c(e.getMessage());
                return jSONArray;
            }
        } catch (Exception e2) {
            e = e2;
            C10735b4.m39111c(e.getMessage());
            return jSONArray;
        }
    }

    protected static AnalyticsBridge getInstance() {
        if (instance == null) {
            instance = new AnalyticsBridge();
        }
        return instance;
    }

    private void initCallbackV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28612r(jSONObject));
    }

    private void initOfflineMechanismV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28614t(jSONObject));
    }

    private void initV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28613s(jSONObject));
    }

    private void internalErrorV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28616v(jSONObject));
    }

    private void loggerV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28554A(jSONObject));
    }

    private void preloadMechanismV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28559F(jSONObject));
    }

    private void report(C10802f0 f0Var) {
        if (this.isAnalyticsEnabled) {
            setChanged();
            notifyObservers(f0Var);
        }
    }

    private void reportOrStashToPendingV2(C10874i iVar) {
        if (this.isAnalyticsV2 && iVar != null) {
            if (!this.isSdkRunning || !CollectorsInfrastructure.getInstance().isInitialized()) {
                this.pendingEventsV2.add(iVar);
            } else {
                report(iVar);
            }
        }
    }

    private void reportRestClientV2Event(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28567N(jSONObject));
    }

    private void restoreFromKillSDKV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28568O(jSONObject));
    }

    private void revertStopSDKV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28569P(jSONObject));
    }

    private void setActivityV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28570Q(jSONObject));
    }

    private void setCustomAppearanceV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28571R(jSONObject));
    }

    private void setCustomInterceptListenerV2() {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28589c());
    }

    private void setCustomParameterV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28573T(jSONObject));
    }

    private void setCustomParametersV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28574U(jSONObject));
    }

    private void setFeedbackListenerV2() {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28592d());
    }

    private void setFormListenerV2() {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28595e());
    }

    private void setInterceptListenerV2() {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28598f());
    }

    private void setInvitationListenerV2() {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28600g());
    }

    private void setUserIdV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28578Y(jSONObject));
    }

    private void stopSDKV2(JSONObject jSONObject) {
        C10876i1.m39698a().mo28468b((C10785e0) this.analyticsV2Generator.mo28588b0(jSONObject));
    }

    private void updateCustomLocaleV2(JSONObject jSONObject) {
        reportOrStashToPendingV2(this.analyticsV2Generator.mo28597e0(jSONObject));
    }

    /* access modifiers changed from: protected */
    public void addObserverToAnalyticsItems(Observer observer) {
        addObserver(observer);
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a(getClass().getSimpleName());
        deleteObservers();
        this.pendingEvents.clear();
        this.isSdkRunning = false;
        instance = null;
    }

    /* access modifiers changed from: protected */
    public String exportPendingEventsToJson() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<C10802f0> it = this.pendingEvents.iterator();
            while (it.hasNext()) {
                C10802f0 next = it.next();
                if (next.mo28278d() != null) {
                    jSONArray.put(next.mo28278d());
                }
            }
            return jSONArray.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public String exportPendingV2EventsToJson() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<C10874i> it = this.pendingEventsV2.iterator();
            while (it.hasNext()) {
                C10874i next = it.next();
                if (next != null) {
                    jSONArray.put(next.toJsonString());
                }
            }
            return jSONArray.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public void initAnalytics(boolean z, C10894j jVar, C10844h hVar, HashMap<String, Object> hashMap) {
        this.isAnalyticsEnabled = z;
        this.isSdkRunning = true;
        if (jVar != null) {
            this.isAnalyticsV2 = jVar.mo28503e();
        }
        this.analyticsV2Generator.mo28583a(hVar, hashMap, jVar);
    }

    /* access modifiers changed from: package-private */
    public void regeneratePreInitV2Events() {
        if (!this.preInitEventsV2.isEmpty()) {
            Iterator<Pair<C10664b, JSONObject>> it = this.preInitEventsV2.iterator();
            while (it.hasNext()) {
                Pair next = it.next();
                C10664b bVar = (C10664b) next.first;
                if (bVar != null) {
                    switch (C10663a.f30410a[bVar.ordinal()]) {
                        case 1:
                            initV2((JSONObject) next.second);
                            break;
                        case 2:
                            initCallbackV2((JSONObject) next.second);
                            break;
                        case 3:
                            initOfflineMechanismV2((JSONObject) next.second);
                            break;
                        case 4:
                            disableInterceptV2();
                            break;
                        case 5:
                            enableInterceptV2();
                            break;
                        case 6:
                            loggerV2((JSONObject) next.second);
                            break;
                        case 7:
                            setCustomParameterV2((JSONObject) next.second);
                            break;
                        case 8:
                            setCustomParametersV2((JSONObject) next.second);
                            break;
                        case 9:
                            updateCustomLocaleV2((JSONObject) next.second);
                            break;
                        case 10:
                            setCustomAppearanceV2((JSONObject) next.second);
                            break;
                        case 11:
                            internalErrorV2((JSONObject) next.second);
                            break;
                        case 12:
                            setActivityV2((JSONObject) next.second);
                            break;
                        case 13:
                            stopSDKV2((JSONObject) next.second);
                            break;
                        case 14:
                            revertStopSDKV2((JSONObject) next.second);
                            break;
                        case 15:
                            setFormListenerV2();
                            break;
                        case 16:
                            setFeedbackListenerV2();
                            break;
                        case 17:
                            setInvitationListenerV2();
                            break;
                        case 18:
                            setInterceptListenerV2();
                            break;
                        case 19:
                            setCustomInterceptListenerV2();
                            break;
                        case 20:
                            preloadMechanismV2((JSONObject) next.second);
                            break;
                        case 21:
                            deleteStorageV2((JSONObject) next.second);
                            break;
                        case 22:
                            restoreFromKillSDKV2((JSONObject) next.second);
                            break;
                        case 23:
                            reportRestClientV2Event((JSONObject) next.second);
                            break;
                        case 24:
                            setUserIdV2((JSONObject) next.second);
                            break;
                    }
                }
            }
            this.preInitEventsV2.clear();
        }
        JSONArray andClearInitCallbackEventsFromStorage = getAndClearInitCallbackEventsFromStorage();
        if (andClearInitCallbackEventsFromStorage != null) {
            for (int i = 0; i < andClearInitCallbackEventsFromStorage.length(); i++) {
                try {
                    initCallbackV2(andClearInitCallbackEventsFromStorage.getJSONObject(i));
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void reportCloseEngagementEvent(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INTERFACE_TYPE, str2);
            jSONObject.put(JSON_ENGAGEMENT_ID, str3);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Session, "CloseEngagement"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28581a(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportCustomInterceptAcceptedEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "CustomInterceptAccepted"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28587b(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportCustomInterceptDeclinedEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "CustomInterceptDeclined"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28590c(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportCustomInterceptDeferredEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "CustomInterceptDeferred"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28593d(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportCustomInterceptSkippedEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "CustomInterceptSkipped"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28596e(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportCustomInterceptTriggerCallbackEvent(C10665c cVar, String str, String str2, Integer num, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar);
            jSONObject.put("id", str);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str2);
            jSONObject.put(JSON_ERROR_CODE, num);
            jSONObject.put(JSON_ERROR_MESSAGE, str3);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.callback, Lifetime.Session, "CustomInterceptTriggerCallback"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28599f(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    public void reportDeleteStorageEvent(String str, boolean z) {
        C10665c cVar;
        if (z) {
            try {
                cVar = C10665c.success;
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
                return;
            }
        } else {
            cVar = C10665c.failure;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_FILE_PATH, str);
        jSONObject.put(JSON_STATUS, cVar);
        reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "DeleteStorage"));
        if (this.isSdkRunning) {
            if (CollectorsInfrastructure.getInstance().isInitialized()) {
                deleteStorageV2(jSONObject);
                return;
            }
        }
        this.preInitEventsV2.add(new Pair(C10664b.deleteStorage, jSONObject));
    }

    /* access modifiers changed from: protected */
    public void reportDisableInterceptEvent() {
        try {
            reportOrStashToPending(new C10802f0((JSONObject) null, GroupType.api, Lifetime.Application, "DisableIntercept"));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        if (!this.isSdkRunning || !CollectorsInfrastructure.getInstance().isInitialized()) {
            this.preInitEventsV2.add(new Pair(C10664b.disableIntercept, (Object) null));
        } else {
            disableInterceptV2();
        }
    }

    /* access modifiers changed from: protected */
    public void reportEnableInterceptEvent() {
        try {
            reportOrStashToPending(new C10802f0((JSONObject) null, GroupType.api, Lifetime.Application, "EnableIntercept"));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        if (!this.isSdkRunning || !CollectorsInfrastructure.getInstance().isInitialized()) {
            this.preInitEventsV2.add(new Pair(C10664b.enableIntercept, (Object) null));
        } else {
            enableInterceptV2();
        }
    }

    public void reportExtraDataEvent(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_EXTRA_UJ_UPDATE, str);
            jSONObject.put(JSON_EXTRA_UJ_FETCH, str2);
            jSONObject.put(JSON_EXTRA_UJ_DISTINCT_COLLECTORS, str3);
            jSONObject.put(JSON_EXTRA_TRE_LOGIC_UJ, str4);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "ExtraData"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    extraDataEventV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.deleteStorage, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportFeedbackRetryMechanismEvent(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_NUMBER_OF_FEEDBACKS, i);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "FeedbackRetryMechanism"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28603i(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportFormClosedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = null;
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            if (formViewType != null) {
                str2 = formViewType.toString();
            }
            jSONObject.put(JSON_FORM_VIEW_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "FormClosed"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28604j(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportFormDismissedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = null;
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            if (formViewType != null) {
                str2 = formViewType.toString();
            }
            jSONObject.put(JSON_FORM_VIEW_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "FormDismissed"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28605k(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportFormDisplayedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType, long j, String str2, String str3, MDAppearanceMode mDAppearanceMode) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str4 = null;
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            if (formViewType != null) {
                str4 = formViewType.toString();
            }
            jSONObject.put(JSON_FORM_VIEW_TYPE, str4);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_TIME_TO_DISPLAY, j);
            jSONObject.put(JSON_FORM_LOCALE_SET, str2);
            jSONObject.put(JSON_FORM_LOCALE_DISPLAY, str3);
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "FormDisplayed"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28606l(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportFormLoadSpinnerEvent(String str, Long l, FormViewType formViewType, FormTriggerType formTriggerType) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_DELAY, l);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "FormLoadSpinner"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28607m(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportFormLoadedEvent(String str, FormTriggerType formTriggerType, long j, FormViewType formViewType, boolean z, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = null;
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            if (formViewType != null) {
                str2 = formViewType.toString();
            }
            jSONObject.put(JSON_FORM_VIEW_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_LOADING_TIME, j);
            jSONObject.put(JSON_IS_FAST_LOADING_FORM, z ? 1 : 0);
            jSONObject.put(JSON_RELOADING_FORM_NUMBER, i);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "FormLoaded"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28608n(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportFormSubmittedEvent(String str, FormTriggerType formTriggerType, long j, FormViewType formViewType) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = null;
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            if (formViewType != null) {
                str2 = formViewType.toString();
            }
            jSONObject.put(JSON_FORM_VIEW_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_LAST_SUBMIT_TIMESTAMP, j);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "FormSubmitted"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28609o(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportFormThankYouPromptEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType, boolean z, boolean z2, MDAppearanceMode mDAppearanceMode) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = null;
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            if (formViewType != null) {
                str2 = formViewType.toString();
            }
            jSONObject.put(JSON_FORM_VIEW_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_TYP_CLOSE_BUTTON, z);
            jSONObject.put(JSON_TYP_IMAGE, z2);
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "ThankYouPromptDisplayed"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28610p(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportHandleNotificationEvent(String str, FormViewType formViewType, boolean z, C10665c cVar, MDExternalError mDExternalError) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = null;
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_PRE_INIT, z);
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_ERROR_CODE, mDExternalError != null ? Integer.valueOf(mDExternalError.getErrorCode()) : null);
            if (mDExternalError != null) {
                str2 = mDExternalError.getMessage();
            }
            jSONObject.put(JSON_ERROR_MESSAGE, str2);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Session, "HandleNotification"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28611q(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInitCallbackEvent(C10665c cVar, Integer num, String str, long j, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_ERROR_CODE, num);
            jSONObject.put(JSON_ERROR_MESSAGE, str);
            jSONObject.put(JSON_DURATION, j);
            jSONObject.put("networkAvailable", z);
            jSONObject.put("networkAvailableDeprecated", z2);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.callback, Lifetime.Session, "InitCallback"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    initCallbackV2(jSONObject);
                    return;
                }
            }
            if (cVar == C10665c.failure) {
                C11089s6 b = C11089s6.m40668b();
                C11089s6.C11090a aVar = C11089s6.C11090a.INIT_CALLBACK_EVENT;
                String a = b.mo28975a(aVar, (String) null);
                JSONArray jSONArray = a == null ? new JSONArray() : new JSONArray(a);
                jSONArray.put(jSONObject);
                C11089s6.m40668b().mo28984b(aVar, jSONArray.toString());
                return;
            }
            this.preInitEventsV2.add(new Pair(C10664b.initCallback, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInitEvent(boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("networkAvailable", z);
            jSONObject.put("networkAvailableDeprecated", z2);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Session, "Init"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    initV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.init, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInitOfflineMechanismEvent(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_TIMESTAMP_LAST_CACHED_DATA, j);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "InitOfflineMechanism"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    initOfflineMechanismV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.initOfflineMechanism, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInterceptMechanismEvent(long j, long j2, String str, Reason reason, C10665c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_FORM_ID, str);
            String str2 = null;
            jSONObject.put(JSON_INVITATION_SKIPPED_REASON, reason == null ? null : reason.name());
            if (cVar != null) {
                str2 = cVar.name();
            }
            jSONObject.put(JSON_STATUS, str2);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "InterceptMechanism"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28615u(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInternalErrorEvent(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ERROR_CODE, i);
            jSONObject.put(JSON_ERROR_MESSAGE, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.error, Lifetime.Session, "InternalError"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    internalErrorV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.internalError, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInvitationAcceptedEvent(String str, String str2, C10880i3 i3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "InvitationAccepted"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28617w(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInvitationDeclinedEvent(String str, String str2, C10880i3 i3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
            jSONObject.put(JSON_REASON, i3Var.mo28476a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "InvitationDeclined"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28618x(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInvitationDeferredEvent(String str, String str2, C10880i3 i3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
            jSONObject.put(JSON_REASON, i3Var.mo28476a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "InvitationDeferred"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28619y(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportInvitationDisplayedEvent(String str, String str2, C10880i3 i3Var, MDAppearanceMode mDAppearanceMode) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
            jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.feedback, Lifetime.Session, "InvitationDisplayed"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28620z(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportLoggerEvent(MDLogLevel mDLogLevel) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_LOG_LEVEL, mDLogLevel != null ? mDLogLevel.toString() : null);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Application, "Logger"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    loggerV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.logger, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public boolean reportMedalliaCrashEventImmediate(String str, long j, String str2, Long l) {
        C10785e0 f0Var;
        try {
            if (!this.isSdkRunning) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_REASON, str);
            jSONObject.put("propertyId", l);
            jSONObject.put("deviceId", C11089s6.m40668b().mo28975a(C11089s6.C11090a.DEVICE_ID, (String) null));
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("osName", "Android");
            jSONObject.put("sdkVersion", "4.1.5");
            if (this.isAnalyticsV2) {
                f0Var = this.analyticsV2Generator.mo28582a(jSONObject, str2, j);
                if (f0Var == null) {
                    return true;
                }
            } else {
                f0Var = new C10802f0(jSONObject, GroupType.error, Lifetime.Session, "MedalliaCrash");
            }
            return C10876i1.m39698a().mo28468b(f0Var);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void reportMediaCaptureCollectedEvent(C11173w4 w4Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_ID, w4Var.getFormId());
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, w4Var.mo29135b() != null ? w4Var.mo29135b() : UUID.randomUUID().toString());
            jSONObject.put(JSON_MEDIA_TYPE_CAPTURE, C10721a5.m39052d(w4Var.mo29141f()));
            jSONObject.put(JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID, w4Var.mo29138d());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "MediaCaptureCollected"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28555B(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportMediaCaptureSubmitEvent(C11173w4 w4Var, C10665c cVar, MDExternalError mDExternalError, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_ID, w4Var.getFormId());
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, w4Var.mo29135b() != null ? w4Var.mo29135b() : UUID.randomUUID().toString());
            String str2 = null;
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_MEDIA_CHANNEL_ID, str);
            jSONObject.put(JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID, w4Var.mo29138d());
            if (mDExternalError != null) {
                str2 = mDExternalError.getMessage();
            }
            jSONObject.put(JSON_ERROR_MESSAGE, str2);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "MediaCaptureSubmit"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28556C(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportMediaFeedbackRetryMechanismEvent(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_NUMBER_OF_FEEDBACKS, i);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "MediaFeedbackRetryMechanism"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28557D(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportNativeTargetEvaluatorEvent(long j, long j2, String str, C11013n2.C11014a aVar, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            jSONObject.put(JSON_RESULT, str2);
            jSONObject.put(JSON_INITIATOR, str3);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "NativeTargetEvaluator"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28558E(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void reportOrStashToPending(C10802f0 f0Var) {
        if (f0Var != null) {
            if (!this.isSdkRunning) {
                this.pendingEvents.add(f0Var);
            } else {
                report(f0Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void reportPreInitEvents() {
        if (!this.pendingEvents.isEmpty()) {
            Iterator<C10802f0> it = this.pendingEvents.iterator();
            while (it.hasNext()) {
                C10802f0 next = it.next();
                next.mo28286l();
                report(next);
            }
            this.pendingEvents.clear();
        }
    }

    /* access modifiers changed from: protected */
    public void reportPreloadMechanismEvent(long j, long j2, String str, C11013n2.C11014a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "PreloadMechanism"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    preloadMechanismV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.preloadMechanism, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportPromptAcceptedEvent(String str, String str2, C10880i3 i3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
            jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.appRating, Lifetime.Session, "PromptAccepted"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28560G(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportPromptDeclinedEvent(String str, String str2, C10880i3 i3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
            jSONObject.put(JSON_REASON, i3Var.mo28476a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.appRating, Lifetime.Session, "PromptDeclined"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28561H(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportPromptDeferredEvent(String str, String str2, C10880i3 i3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
            jSONObject.put(JSON_REASON, i3Var.mo28476a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.appRating, Lifetime.Session, "PromptDeferred"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28562I(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportPromptDisplayedEvent(String str, String str2, C10880i3 i3Var, MDAppearanceMode mDAppearanceMode) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
            jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.appRating, Lifetime.Session, "PromptDisplayed"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28563J(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportPromptTriggeredEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_APP_RATING_ID, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.appRating, Lifetime.Session, "PromptTriggered"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28564K(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportRefreshSessionEvent(long j, long j2, long j3, long j4, String str, C10665c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_TIME_IN_BACKGROUND, j3);
            jSONObject.put(JSON_SESSION_INACTIVITY_TIME, j4);
            jSONObject.put(JSON_PREVIOUS_SESSION_ID, str);
            jSONObject.put(JSON_STATUS, cVar != null ? cVar.name() : null);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "RefreshSession"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28565L(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportResourcesSizeEvent() {
        if (!this.isTreResourceReady || !this.isFormResourcesReady) {
            C10735b4.m39113e("Can't report ResourcesSizeEvent, Resources not ready yet");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_TARGET_ENGINE_SIZE, C10930k2.m39987e());
            jSONObject.put(JSON_FORMS_RESOURCES_SIZE, C10930k2.m39981c());
            jSONObject.put(JSON_TEMPLATES_SIZE, C10930k2.m39990f());
            jSONObject.put(JSON_TOTAL_DIRECTORY_SIZE, C10930k2.m39977b());
            jSONObject.put(JSON_DB_SIZE, C10876i1.m39698a().mo28469c());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "ResourcesSize"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28566M(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportRestClientEvent(long j, long j2, String str, int i, int i2, Double d) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put("url", str);
            jSONObject.put(JSON_RESPONSE_CODE, i);
            jSONObject.put(JSON_NUMBER_OF_RETRIES, i2);
            jSONObject.put(JSON_PAYLOAD_SIZE, d);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "RestClient"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    reportRestClientV2Event(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.restClient, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportRestoreFromKillSDKEvent(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_RESTORE_TIME, j);
            jSONObject.put(JSON_KILL_SDK_TIMESTAMP, C11089s6.m40668b().mo28974a(C11089s6.C11090a.SDK_KILL_TIMESTAMP, 0));
            jSONObject.put(JSON_KILLED_SDK_VERSION, C11089s6.m40668b().mo28975a(C11089s6.C11090a.LAST_SDK_VERSION, (String) null));
            jSONObject.put(JSON_KILLED_OS_VERSION, C11089s6.m40668b().mo28975a(C11089s6.C11090a.LAST_OS_VERSION, (String) null));
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "RestoreFromKillSDK"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    restoreFromKillSDKV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.restoreFromKillSDK, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportRevertStopSdkEvent() {
        try {
            JSONObject jSONObject = new JSONObject();
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Application, "RevertStopSDK"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    revertStopSDKV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.revertStopSDK, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetActivityEvent(Activity activity) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (activity != null) {
                jSONObject.put(JSON_ACTIVITY_NAME, activity.getClass().getSimpleName());
            }
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "SetActivity"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    setActivityV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.setActivity, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetCustomAppearanceEvent(MDAppearanceMode mDAppearanceMode) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Application, "SetCustomAppearance"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28571R(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetCustomInterceptCallbackEvent(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", str);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str2);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.callback, Lifetime.Session, "SetCustomInterceptCallback"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28572S(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetCustomInterceptListenerEvent() {
        try {
            reportOrStashToPending(new C10802f0((JSONObject) null, GroupType.api, Lifetime.Application, "SetCustomInterceptListener"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    setCustomInterceptListenerV2();
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.setCustomInterceptListener, (Object) null));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetCustomParameterEvent(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(JSON_CUSTOM_PARAMETER_NAME, str);
                reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Application, "SetCustomParameter"));
                if (this.isSdkRunning) {
                    if (CollectorsInfrastructure.getInstance().isInitialized()) {
                        setCustomParameterV2(jSONObject);
                        return;
                    }
                }
                this.preInitEventsV2.add(new Pair(C10664b.setCustomParameter, jSONObject));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetCustomParametersEvent(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            try {
                if (!hashMap.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(JSON_CUSTOM_PARAMETER_NAMES, hashMap);
                    reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Application, "SetCustomParameters"));
                    if (this.isSdkRunning) {
                        if (CollectorsInfrastructure.getInstance().isInitialized()) {
                            setCustomParametersV2(jSONObject);
                            return;
                        }
                    }
                    this.preInitEventsV2.add(new Pair(C10664b.setCustomParameters, jSONObject));
                }
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetFeedbackCallbackEvent(String str, String str2, FormTriggerType formTriggerType, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put(JSON_FORM_ID, str2);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, str3);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.callback, Lifetime.Session, "SetFeedbackCallback"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28575V(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetFeedbackListenerEvent() {
        try {
            reportOrStashToPending(new C10802f0((JSONObject) null, GroupType.api, Lifetime.Application, "SetFeedbackListener"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    setFeedbackListenerV2();
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.setFeedbackListener, (Object) null));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetFormCallbackEvent(String str, String str2, FormTriggerType formTriggerType) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put(JSON_FORM_ID, str2);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.callback, Lifetime.Session, "SetFormCallback"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28576W(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetFormListenerEvent() {
        try {
            reportOrStashToPending(new C10802f0((JSONObject) null, GroupType.api, Lifetime.Application, "SetFormListener"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    setFormListenerV2();
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.setFormListener, (Object) null));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetInterceptCallbackEvent(String str, String str2, String str3, String str4, C10880i3 i3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put("id", str2);
            jSONObject.put(JSON_INVITE_TYPE, str3);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str4);
            if (i3Var != null) {
                jSONObject.put(JSON_STICKY_MODE, i3Var.mo28477b());
                jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, i3Var.mo28478c());
                if (i3Var.mo28479d()) {
                    jSONObject.put(JSON_DEFERRED_REASON, i3Var.mo28476a());
                }
            }
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.callback, Lifetime.Session, "SetInterceptCallback"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28577X(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetInterceptListenerEvent() {
        try {
            reportOrStashToPending(new C10802f0((JSONObject) null, GroupType.api, Lifetime.Application, "SetInterceptListener"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    setInterceptListenerV2();
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.setInterceptListener, (Object) null));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void reportSetInvitationListenerEvent() {
        try {
            reportOrStashToPending(new C10802f0((JSONObject) null, GroupType.api, Lifetime.Application, "SetInvitationListener"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    setInvitationListenerV2();
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.setInvitationListener, (Object) null));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSetUserIdEvent(Boolean bool) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_IS_USER_ID_EMPTY, bool);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Application, "SetUserId"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28578Y(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportShowFormCallbackEvent(C10665c cVar, Integer num, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_ERROR_CODE, num);
            jSONObject.put(JSON_ERROR_MESSAGE, str);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.callback, Lifetime.Session, "ShowFormCallback"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28579Z(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportShowFormEvent(String str, FormViewType formViewType, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_IS_FAST_LOADING_FORM, z ? 1 : 0);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Session, "ShowForm"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28585a0(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportStopSDKEventImmediated(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CLEAR_DATA, z);
            C10876i1.m39698a().mo28468b((C10785e0) new C10802f0(jSONObject, GroupType.api, Lifetime.Application, "StopSDK"));
            if (this.isSdkRunning) {
                if (CollectorsInfrastructure.getInstance().isInitialized()) {
                    stopSDKV2(jSONObject);
                    return;
                }
            }
            this.preInitEventsV2.add(new Pair(C10664b.stopSDK, jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportSubmitFeedbackEvent(C10826g2 g2Var, long j, C10665c cVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, g2Var.mo28333b() != null ? g2Var.mo28333b() : UUID.randomUUID().toString());
            jSONObject.put(JSON_FEEDBACK_UUID, str);
            String str2 = null;
            jSONObject.put(JSON_STATUS, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_SUBMITTED_TIMESTAMP, g2Var.mo28336e());
            jSONObject.put(JSON_DELIVERED_TIMESTAMP, j);
            jSONObject.put(JSON_NUMBER_OF_RETRIES, g2Var.mo28335d());
            if (g2Var.mo28334c() != null) {
                str2 = g2Var.mo28334c().toString();
            }
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, g2Var.getFormId());
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "SubmitFeedback"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28591c0(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void reportTargetEvaluatorEvent(long j, long j2, String str, C11013n2.C11014a aVar, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            jSONObject.put(JSON_RESULT_FROM_JS, str2);
            jSONObject.put(JSON_INITIATOR, str3);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.internalSdk, Lifetime.Session, "TargetEvaluator"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28594d0(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    public void setFormResourcesReady(boolean z) {
        this.isFormResourcesReady = z;
    }

    public void setTreResourceReady(boolean z) {
        this.isTreResourceReady = z;
    }

    /* access modifiers changed from: protected */
    public void updateCustomLocaleEvent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("locale", str);
            jSONObject.put(JSON_IS_VALID, z);
            reportOrStashToPending(new C10802f0(jSONObject, GroupType.api, Lifetime.Session, "UpdateCustomLocale"));
            reportOrStashToPendingV2(this.analyticsV2Generator.mo28597e0(jSONObject));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    private void report(C10874i iVar) {
        if (this.isAnalyticsEnabled) {
            setChanged();
            notifyObservers(iVar);
        }
    }
}
