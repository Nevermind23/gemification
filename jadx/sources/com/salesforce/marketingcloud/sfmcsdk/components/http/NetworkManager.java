package com.salesforce.marketingcloud.sfmcsdk.components.http;

import android.content.Context;
import android.content.SharedPreferences;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutorsKt;
import com.salesforce.marketingcloud.sfmcsdk.util.NetworkUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NetworkManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long MAX_SERVER_RETRY = 86400000;
    public static final String TAG = "~$NetworkManager";
    private final Authenticator authenticator;
    private final Context context;
    private final SdkExecutors executors;
    private final SharedPreferences networkPreferences;
    private final Map<String, AtomicBoolean> requestsInFlight;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getDeviceRetryKey$sfmcsdk_release(String str) {
            C41536l.m120489i(str, "requestName");
            return C41536l.m120497q("retry_device_", str);
        }

        public final String getServerRetryKey$sfmcsdk_release(String str) {
            C41536l.m120489i(str, "requestName");
            return C41536l.m120497q("retry_server_", str);
        }
    }

    public NetworkManager(Context context2, SdkExecutors sdkExecutors, SharedPreferences sharedPreferences, Authenticator authenticator2) {
        C41536l.m120489i(context2, "context");
        C41536l.m120489i(sdkExecutors, "executors");
        C41536l.m120489i(sharedPreferences, "networkPreferences");
        this.context = context2;
        this.executors = sdkExecutors;
        this.networkPreferences = sharedPreferences;
        this.authenticator = authenticator2;
        this.requestsInFlight = new LinkedHashMap();
    }

    public static /* synthetic */ void getRequestsInFlight$sfmcsdk_release$annotations() {
    }

    public static /* synthetic */ void recordDeviceRetryAfter$sfmcsdk_release$default(NetworkManager networkManager, Request request, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        networkManager.recordDeviceRetryAfter$sfmcsdk_release(request, j);
    }

    public final boolean canMakeRequest(String... strArr) {
        C41536l.m120489i(strArr, "requestNames");
        if (!NetworkUtils.hasConnectivity(this.context)) {
            return false;
        }
        for (String isBlockedByRetryAfter$sfmcsdk_release : strArr) {
            if (isBlockedByRetryAfter$sfmcsdk_release(isBlockedByRetryAfter$sfmcsdk_release)) {
                return false;
            }
        }
        return true;
    }

    public final long deviceRetryAfterTime$sfmcsdk_release(String str) {
        C41536l.m120489i(str, "requestName");
        return this.networkPreferences.getLong(Companion.getDeviceRetryKey$sfmcsdk_release(str), 0);
    }

    public final void executeAsync(Request request, Callback callback) {
        C41536l.m120489i(request, "request");
        C41536l.m120489i(callback, "callback");
        SdkExecutorsKt.namedRunnable(this.executors.getNetworkIO(), "network_manager_execute", new NetworkManager$executeAsync$1(callback, request, this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093 A[Catch:{ Exception -> 0x01cd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.salesforce.marketingcloud.sfmcsdk.components.http.Response executeSync(com.salesforce.marketingcloud.sfmcsdk.components.http.Request r12) {
        /*
            r11 = this;
            java.lang.String r0 = "~$NetworkManager"
            java.lang.String r1 = "request"
            kotlin.jvm.internal.C41536l.m120489i(r12, r1)
            kotlin.jvm.internal.z r1 = new kotlin.jvm.internal.z
            r1.<init>()
            r1.f97717d = r12
            r2 = 0
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r3 = r11.requestsInFlight     // Catch:{ Exception -> 0x01cd }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r12 = r3.get(r12)     // Catch:{ Exception -> 0x01cd }
            java.util.concurrent.atomic.AtomicBoolean r12 = (java.util.concurrent.atomic.AtomicBoolean) r12     // Catch:{ Exception -> 0x01cd }
            r3 = 429(0x1ad, float:6.01E-43)
            r4 = 1
            if (r12 == 0) goto L_0x0042
            boolean r5 = r12.get()     // Catch:{ Exception -> 0x01cd }
            if (r5 != 0) goto L_0x0027
            goto L_0x0042
        L_0x0027:
            boolean r12 = r12.get()     // Catch:{ Exception -> 0x01cd }
            if (r12 == 0) goto L_0x0054
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response$Companion r12 = com.salesforce.marketingcloud.sfmcsdk.components.http.Response.Companion     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r4 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r4 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r4     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = " request already in-flight"
            java.lang.String r4 = kotlin.jvm.internal.C41536l.m120497q(r4, r5)     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r12 = r12.error$sfmcsdk_release(r4, r3)     // Catch:{ Exception -> 0x01cd }
            return r12
        L_0x0042:
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r12 = r11.requestsInFlight     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r5 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r5 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r5     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x01cd }
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x01cd }
            r6.<init>(r4)     // Catch:{ Exception -> 0x01cd }
            r12.put(r5, r6)     // Catch:{ Exception -> 0x01cd }
        L_0x0054:
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r12 = r11.requestsInFlight     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r5 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r5 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r5     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r12 = r12.get(r5)     // Catch:{ Exception -> 0x01cd }
            java.util.concurrent.atomic.AtomicBoolean r12 = (java.util.concurrent.atomic.AtomicBoolean) r12     // Catch:{ Exception -> 0x01cd }
            if (r12 != 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r12.set(r4)     // Catch:{ Exception -> 0x01cd }
        L_0x006a:
            android.content.Context r12 = r11.context     // Catch:{ Exception -> 0x01cd }
            boolean r12 = com.salesforce.marketingcloud.sfmcsdk.util.NetworkUtils.hasConnectivity(r12)     // Catch:{ Exception -> 0x01cd }
            if (r12 != 0) goto L_0x0093
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r12 = r11.requestsInFlight     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r3 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r3 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r3     // Catch:{ Exception -> 0x01cd }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r12 = r12.get(r3)     // Catch:{ Exception -> 0x01cd }
            java.util.concurrent.atomic.AtomicBoolean r12 = (java.util.concurrent.atomic.AtomicBoolean) r12     // Catch:{ Exception -> 0x01cd }
            if (r12 != 0) goto L_0x0085
            goto L_0x0088
        L_0x0085:
            r12.set(r2)     // Catch:{ Exception -> 0x01cd }
        L_0x0088:
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response$Companion r12 = com.salesforce.marketingcloud.sfmcsdk.components.http.Response.Companion     // Catch:{ Exception -> 0x01cd }
            java.lang.String r3 = "Device has no network connectivity"
            r4 = 599(0x257, float:8.4E-43)
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r12 = r12.error$sfmcsdk_release(r3, r4)     // Catch:{ Exception -> 0x01cd }
            return r12
        L_0x0093:
            java.lang.Object r12 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r12 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r12     // Catch:{ Exception -> 0x01cd }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x01cd }
            boolean r12 = r11.isBlockedByRetryAfter$sfmcsdk_release(r12)     // Catch:{ Exception -> 0x01cd }
            if (r12 == 0) goto L_0x00dc
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r12 = r11.requestsInFlight     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r4 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r4 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r4     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r12 = r12.get(r4)     // Catch:{ Exception -> 0x01cd }
            java.util.concurrent.atomic.AtomicBoolean r12 = (java.util.concurrent.atomic.AtomicBoolean) r12     // Catch:{ Exception -> 0x01cd }
            if (r12 != 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r12.set(r2)     // Catch:{ Exception -> 0x01cd }
        L_0x00b7:
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response$Companion r12 = com.salesforce.marketingcloud.sfmcsdk.components.http.Response.Companion     // Catch:{ Exception -> 0x01cd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r4.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = "Too many requests. "
            r4.append(r5)     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r5 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r5 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r5     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x01cd }
            r4.append(r5)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = " request aborted."
            r4.append(r5)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r12 = r12.error$sfmcsdk_release(r4, r3)     // Catch:{ Exception -> 0x01cd }
            return r12
        L_0x00dc:
            android.content.Context r12 = r11.context     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.util.NetworkUtils.installProvidersIfNeeded(r12)     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r12 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            r6 = r12
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r6 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r6     // Catch:{ Exception -> 0x01cd }
            r7 = 0
            r9 = 2
            r10 = 0
            r5 = r11
            recordDeviceRetryAfter$sfmcsdk_release$default(r5, r6, r7, r9, r10)     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Authenticator r12 = r11.authenticator     // Catch:{ Exception -> 0x01cd }
            if (r12 == 0) goto L_0x0146
            r3 = 0
            he1.m r12 = com.salesforce.marketingcloud.sfmcsdk.components.http.Authenticator.getAuthTokenHeader$sfmcsdk_release$default(r12, r2, r4, r3)     // Catch:{ Exception -> 0x01cd }
            if (r12 != 0) goto L_0x0128
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response$Companion r12 = com.salesforce.marketingcloud.sfmcsdk.components.http.Response.Companion     // Catch:{ Exception -> 0x01cd }
            java.lang.String r3 = "Expectation Failed"
            r4 = 417(0x1a1, float:5.84E-43)
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r12 = r12.error$sfmcsdk_release(r3, r4)     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r3 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$executeSync$authHeader$1$1 r4 = com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$executeSync$authHeader$1$1.INSTANCE     // Catch:{ Exception -> 0x01cd }
            r3.mo31463w(r0, r4)     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Authenticator r3 = r11.authenticator     // Catch:{ Exception -> 0x01cd }
            r3.deleteCachedToken()     // Catch:{ Exception -> 0x01cd }
            java.util.Map r3 = r11.getRequestsInFlight$sfmcsdk_release()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r4 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r4 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r4     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x01cd }
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3     // Catch:{ Exception -> 0x01cd }
            if (r3 != 0) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r3.set(r2)     // Catch:{ Exception -> 0x01cd }
        L_0x0127:
            return r12
        L_0x0128:
            java.lang.Object r3 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r3 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r3     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request$Builder r3 = r3.toBuilder$sfmcsdk_release()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r4 = r12.mo95678e()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r12 = r12.mo95680f()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request$Builder r12 = r3.addOrReplaceHeader(r4, r12)     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r12 = r12.build()     // Catch:{ Exception -> 0x01cd }
            r1.f97717d = r12     // Catch:{ Exception -> 0x01cd }
        L_0x0146:
            kotlin.jvm.internal.z r12 = new kotlin.jvm.internal.z     // Catch:{ Exception -> 0x01cd }
            r12.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r3 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r3 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r3     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r3 = r11.makeRequest$sfmcsdk_release(r3)     // Catch:{ Exception -> 0x01cd }
            r12.f97717d = r3     // Catch:{ Exception -> 0x01cd }
            int r3 = r3.getCode()     // Catch:{ Exception -> 0x01cd }
            r4 = 401(0x191, float:5.62E-43)
            if (r3 != r4) goto L_0x019d
            com.salesforce.marketingcloud.sfmcsdk.components.http.Authenticator r3 = r11.authenticator     // Catch:{ Exception -> 0x01cd }
            if (r3 != 0) goto L_0x0162
            goto L_0x019d
        L_0x0162:
            r3.deleteCachedToken()     // Catch:{ Exception -> 0x01cd }
            he1.m r3 = r3.refreshAuthTokenHeader()     // Catch:{ Exception -> 0x01cd }
            if (r3 != 0) goto L_0x016c
            goto L_0x019d
        L_0x016c:
            java.lang.Object r5 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r5 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r5     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request$Builder r5 = r5.toBuilder$sfmcsdk_release()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r6 = r3.mo95678e()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r3 = r3.mo95680f()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request$Builder r3 = r5.addOrReplaceHeader(r6, r3)     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r3 = r3.build()     // Catch:{ Exception -> 0x01cd }
            r1.f97717d = r3     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r3 = r11.makeRequest$sfmcsdk_release(r3)     // Catch:{ Exception -> 0x01cd }
            int r5 = r3.getCode()     // Catch:{ Exception -> 0x01cd }
            if (r5 != r4) goto L_0x0199
            com.salesforce.marketingcloud.sfmcsdk.components.http.Authenticator r4 = r11.authenticator     // Catch:{ Exception -> 0x01cd }
            r4.deleteCachedToken()     // Catch:{ Exception -> 0x01cd }
        L_0x0199:
            he1.w r4 = he1.C41238w.f97225a     // Catch:{ Exception -> 0x01cd }
            r12.f97717d = r3     // Catch:{ Exception -> 0x01cd }
        L_0x019d:
            java.lang.Object r3 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r3 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r3     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r4 = r12.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r4 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Response) r4     // Catch:{ Exception -> 0x01cd }
            r11.recordRetryAfter$sfmcsdk_release(r3, r4)     // Catch:{ Exception -> 0x01cd }
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r3 = r11.requestsInFlight     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r4 = r1.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r4 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r4     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x01cd }
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3     // Catch:{ Exception -> 0x01cd }
            if (r3 != 0) goto L_0x01bb
            goto L_0x01be
        L_0x01bb:
            r3.set(r2)     // Catch:{ Exception -> 0x01cd }
        L_0x01be:
            com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r3 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$executeSync$2 r4 = new com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$executeSync$2     // Catch:{ Exception -> 0x01cd }
            r4.<init>(r1, r12)     // Catch:{ Exception -> 0x01cd }
            r3.mo31452d(r0, r4)     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r12 = r12.f97717d     // Catch:{ Exception -> 0x01cd }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r12 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Response) r12     // Catch:{ Exception -> 0x01cd }
            return r12
        L_0x01cd:
            r12 = move-exception
            com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r3 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE
            com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$executeSync$3 r4 = com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$executeSync$3.INSTANCE
            r3.mo31453e(r0, r12, r4)
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r12 = r11.requestsInFlight
            java.lang.Object r0 = r1.f97717d
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r0 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r0
            java.lang.String r0 = r0.getName()
            java.lang.Object r12 = r12.get(r0)
            java.util.concurrent.atomic.AtomicBoolean r12 = (java.util.concurrent.atomic.AtomicBoolean) r12
            if (r12 != 0) goto L_0x01e8
            goto L_0x01eb
        L_0x01e8:
            r12.set(r2)
        L_0x01eb:
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response$Companion r12 = com.salesforce.marketingcloud.sfmcsdk.components.http.Response.Companion
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "An unknown error occurred. The "
            r0.append(r2)
            java.lang.Object r2 = r1.f97717d
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r2 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r2
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = " request to "
            r0.append(r2)
            java.lang.Object r1 = r1.f97717d
            com.salesforce.marketingcloud.sfmcsdk.components.http.Request r1 = (com.salesforce.marketingcloud.sfmcsdk.components.http.Request) r1
            java.lang.String r1 = r1.getUrl()
            r0.append(r1)
            java.lang.String r1 = " could not be completed."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = -999(0xfffffffffffffc19, float:NaN)
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r12 = r12.error$sfmcsdk_release(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager.executeSync(com.salesforce.marketingcloud.sfmcsdk.components.http.Request):com.salesforce.marketingcloud.sfmcsdk.components.http.Response");
    }

    public final Map<String, AtomicBoolean> getRequestsInFlight$sfmcsdk_release() {
        return this.requestsInFlight;
    }

    public final boolean isBlockedByRetryAfter$sfmcsdk_release(String str) {
        C41536l.m120489i(str, "requestName");
        long currentTimeMillis = System.currentTimeMillis();
        long serverRetryAfterTime$sfmcsdk_release = serverRetryAfterTime$sfmcsdk_release(str);
        long deviceRetryAfterTime$sfmcsdk_release = deviceRetryAfterTime$sfmcsdk_release(str);
        if (currentTimeMillis > serverRetryAfterTime$sfmcsdk_release && currentTimeMillis > deviceRetryAfterTime$sfmcsdk_release) {
            return false;
        }
        SFMCSdkLogger.INSTANCE.mo31463w(TAG, new NetworkManager$isBlockedByRetryAfter$1$1(str));
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|(1:29)(1:30)) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6 = com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.readAll(((java.net.HttpURLConnection) r3.f97717d).getErrorStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010d, code lost:
        if (r6 == null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0110, code lost:
        r5.body(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0141, code lost:
        if (r14 == null) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        se1.C42550b.m123187a(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0183, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0101 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.salesforce.marketingcloud.sfmcsdk.components.http.Response makeRequest$sfmcsdk_release(com.salesforce.marketingcloud.sfmcsdk.components.http.Request r14) {
        /*
            r13 = this;
            java.lang.String r0 = "~$NetworkManager"
            java.lang.String r1 = "request"
            kotlin.jvm.internal.C41536l.m120489i(r14, r1)
            long r1 = java.lang.System.currentTimeMillis()
            kotlin.jvm.internal.z r3 = new kotlin.jvm.internal.z
            r3.<init>()
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0159 }
            java.lang.String r6 = r14.getUrl()     // Catch:{ Exception -> 0x0159 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0159 }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r5 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r5)     // Catch:{ Exception -> 0x0159 }
            java.net.URLConnection r5 = (java.net.URLConnection) r5     // Catch:{ Exception -> 0x0159 }
            if (r5 == 0) goto L_0x014f
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x0159 }
            r3.f97717d = r5     // Catch:{ Exception -> 0x0159 }
            java.lang.String r6 = r14.getMethod()     // Catch:{ Exception -> 0x0159 }
            r5.setRequestMethod(r6)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r5 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x0159 }
            r6 = 1
            r5.setDoInput(r6)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r5 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x0159 }
            r5.setUseCaches(r4)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r5 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x0159 }
            r5.setAllowUserInteraction(r4)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r5 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x0159 }
            int r7 = r14.getConnectionTimeout()     // Catch:{ Exception -> 0x0159 }
            r5.setConnectTimeout(r7)     // Catch:{ Exception -> 0x0159 }
            java.util.List r5 = r14.getHeaders()     // Catch:{ Exception -> 0x0159 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0159 }
            int r5 = r5 + -1
            r7 = 2
            int r5 = pe1.C42193c.m122497c(r4, r5, r7)     // Catch:{ Exception -> 0x0159 }
            if (r5 < 0) goto L_0x0088
            r7 = r4
        L_0x0064:
            int r8 = r7 + 2
            java.lang.Object r9 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Exception -> 0x0159 }
            java.util.List r10 = r14.getHeaders()     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r10 = r10.get(r7)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0159 }
            java.util.List r11 = r14.getHeaders()     // Catch:{ Exception -> 0x0159 }
            int r12 = r7 + 1
            java.lang.Object r11 = r11.get(r12)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0159 }
            r9.setRequestProperty(r10, r11)     // Catch:{ Exception -> 0x0159 }
            if (r7 != r5) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r7 = r8
            goto L_0x0064
        L_0x0088:
            java.lang.String r5 = r14.getRequestBody()     // Catch:{ Exception -> 0x0159 }
            if (r5 != 0) goto L_0x008f
            goto L_0x00be
        L_0x008f:
            java.lang.Object r7 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x0159 }
            r7.setDoOutput(r6)     // Catch:{ Exception -> 0x0159 }
            com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r6 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ Exception -> 0x0159 }
            com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$1$1 r7 = new com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$1$1     // Catch:{ Exception -> 0x0159 }
            r7.<init>(r14, r3)     // Catch:{ Exception -> 0x0159 }
            r6.mo31452d(r0, r7)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r6 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0159 }
            java.io.OutputStream r6 = r6.getOutputStream()     // Catch:{ Exception -> 0x0159 }
            java.nio.charset.Charset r7 = com.salesforce.marketingcloud.sfmcsdk.components.http.RequestKt.getUTF_8()     // Catch:{ all -> 0x0148 }
            byte[] r5 = r5.getBytes(r7)     // Catch:{ all -> 0x0148 }
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r7)     // Catch:{ all -> 0x0148 }
            r6.write(r5)     // Catch:{ all -> 0x0148 }
            he1.w r5 = he1.C41238w.f97225a     // Catch:{ all -> 0x0148 }
            r5 = 0
            se1.C42550b.m123187a(r6, r5)     // Catch:{ Exception -> 0x0159 }
        L_0x00be:
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response$Builder r5 = new com.salesforce.marketingcloud.sfmcsdk.components.http.Response$Builder     // Catch:{ Exception -> 0x0159 }
            r5.<init>()     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r6 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0159 }
            int r6 = r6.getResponseCode()     // Catch:{ Exception -> 0x0159 }
            r5.code(r6)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r6 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0159 }
            java.lang.String r6 = r6.getResponseMessage()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r7 = "connection.responseMessage"
            kotlin.jvm.internal.C41536l.m120488h(r6, r7)     // Catch:{ Exception -> 0x0159 }
            r5.message(r6)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r6 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0159 }
            java.util.Map r6 = r6.getHeaderFields()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r7 = "connection.headerFields"
            kotlin.jvm.internal.C41536l.m120488h(r6, r7)     // Catch:{ Exception -> 0x0159 }
            r5.headers(r6)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r6 = r3.f97717d     // Catch:{ IOException -> 0x0101 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0101 }
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x0101 }
            java.lang.String r6 = com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.readAll(r6)     // Catch:{ IOException -> 0x0101 }
            if (r6 != 0) goto L_0x00fd
            goto L_0x0113
        L_0x00fd:
            r5.body(r6)     // Catch:{ IOException -> 0x0101 }
            goto L_0x0113
        L_0x0101:
            java.lang.Object r6 = r3.f97717d     // Catch:{ Exception -> 0x0159 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0159 }
            java.io.InputStream r6 = r6.getErrorStream()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r6 = com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.readAll(r6)     // Catch:{ Exception -> 0x0159 }
            if (r6 != 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r5.body(r6)     // Catch:{ Exception -> 0x0159 }
        L_0x0113:
            r5.startTimeMillis(r1)     // Catch:{ Exception -> 0x0159 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0159 }
            r5.endTimeMillis(r1)     // Catch:{ Exception -> 0x0159 }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r1 = r5.build()     // Catch:{ Exception -> 0x0159 }
            com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r2 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ Exception -> 0x0159 }
            com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$3$1 r5 = new com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$3$1     // Catch:{ Exception -> 0x0159 }
            r5.<init>(r1, r14)     // Catch:{ Exception -> 0x0159 }
            r2.mo31452d(r0, r5)     // Catch:{ Exception -> 0x0159 }
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r0 = r13.requestsInFlight
            java.lang.String r14 = r14.getName()
            java.lang.Object r14 = r0.get(r14)
            java.util.concurrent.atomic.AtomicBoolean r14 = (java.util.concurrent.atomic.AtomicBoolean) r14
            if (r14 != 0) goto L_0x013a
            goto L_0x013d
        L_0x013a:
            r14.set(r4)
        L_0x013d:
            java.lang.Object r14 = r3.f97717d
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14
            if (r14 != 0) goto L_0x0144
            goto L_0x0183
        L_0x0144:
            r14.disconnect()
            goto L_0x0183
        L_0x0148:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014a }
        L_0x014a:
            r2 = move-exception
            se1.C42550b.m123187a(r6, r1)     // Catch:{ Exception -> 0x0159 }
            throw r2     // Catch:{ Exception -> 0x0159 }
        L_0x014f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0159 }
            java.lang.String r2 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0159 }
            throw r1     // Catch:{ Exception -> 0x0159 }
        L_0x0157:
            r0 = move-exception
            goto L_0x0184
        L_0x0159:
            r1 = move-exception
            com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger r2 = com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger.INSTANCE     // Catch:{ all -> 0x0157 }
            com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$4 r5 = com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$4.INSTANCE     // Catch:{ all -> 0x0157 }
            r2.mo31453e(r0, r1, r5)     // Catch:{ all -> 0x0157 }
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response$Companion r0 = com.salesforce.marketingcloud.sfmcsdk.components.http.Response.Companion     // Catch:{ all -> 0x0157 }
            java.lang.String r1 = "ERROR"
            r2 = -100
            com.salesforce.marketingcloud.sfmcsdk.components.http.Response r1 = r0.error$sfmcsdk_release(r1, r2)     // Catch:{ all -> 0x0157 }
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r0 = r13.requestsInFlight
            java.lang.String r14 = r14.getName()
            java.lang.Object r14 = r0.get(r14)
            java.util.concurrent.atomic.AtomicBoolean r14 = (java.util.concurrent.atomic.AtomicBoolean) r14
            if (r14 != 0) goto L_0x017a
            goto L_0x017d
        L_0x017a:
            r14.set(r4)
        L_0x017d:
            java.lang.Object r14 = r3.f97717d
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14
            if (r14 != 0) goto L_0x0144
        L_0x0183:
            return r1
        L_0x0184:
            java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicBoolean> r1 = r13.requestsInFlight
            java.lang.String r14 = r14.getName()
            java.lang.Object r14 = r1.get(r14)
            java.util.concurrent.atomic.AtomicBoolean r14 = (java.util.concurrent.atomic.AtomicBoolean) r14
            if (r14 != 0) goto L_0x0193
            goto L_0x0196
        L_0x0193:
            r14.set(r4)
        L_0x0196:
            java.lang.Object r14 = r3.f97717d
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14
            if (r14 != 0) goto L_0x019d
            goto L_0x01a0
        L_0x019d:
            r14.disconnect()
        L_0x01a0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager.makeRequest$sfmcsdk_release(com.salesforce.marketingcloud.sfmcsdk.components.http.Request):com.salesforce.marketingcloud.sfmcsdk.components.http.Response");
    }

    public final void recordDeviceRetryAfter$sfmcsdk_release(Request request, long j) {
        C41536l.m120489i(request, "request");
        if (request.getRateLimit() > 0) {
            SharedPreferences.Editor edit = this.networkPreferences.edit();
            edit.putLong(Companion.getDeviceRetryKey$sfmcsdk_release(request.getName()), request.getRateLimit() + j);
            edit.apply();
        }
    }

    public final void recordRetryAfter$sfmcsdk_release(Request request, Response response) {
        C41536l.m120489i(request, "request");
        C41536l.m120489i(response, "response");
        SharedPreferences.Editor edit = this.networkPreferences.edit();
        recordDeviceRetryAfter$sfmcsdk_release(request, response.getEndTimeMillis());
        List list = response.getHeaders().get("Retry-After");
        if (list != null && (!list.isEmpty())) {
            try {
                long parseLong = Long.parseLong((String) list.get(0)) * 1000;
                String serverRetryKey$sfmcsdk_release = Companion.getServerRetryKey$sfmcsdk_release(request.getName());
                long endTimeMillis = response.getEndTimeMillis();
                if (parseLong > 86400000) {
                    parseLong = 86400000;
                }
                edit.putLong(serverRetryKey$sfmcsdk_release, endTimeMillis + parseLong);
                edit.apply();
            } catch (Exception e) {
                SFMCSdkLogger.INSTANCE.mo31451d(TAG, e, NetworkManager$recordRetryAfter$1.INSTANCE);
            }
        }
    }

    public final long serverRetryAfterTime$sfmcsdk_release(String str) {
        C41536l.m120489i(str, "requestName");
        return this.networkPreferences.getLong(Companion.getServerRetryKey$sfmcsdk_release(str), 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkManager(Context context2, SdkExecutors sdkExecutors, SharedPreferences sharedPreferences, Authenticator authenticator2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, sdkExecutors, sharedPreferences, (i & 8) != 0 ? null : authenticator2);
    }
}
