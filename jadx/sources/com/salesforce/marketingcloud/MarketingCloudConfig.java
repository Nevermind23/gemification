package com.salesforce.marketingcloud;

import android.content.Context;
import android.text.TextUtils;
import cf1.C40419j;
import com.salesforce.marketingcloud.notifications.NotificationCustomizationOptions;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleConfig;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

@MCKeep
public final class MarketingCloudConfig extends PushModuleConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = C11461g.m41875a("MarketingCloudConfig");
    private final String accessToken;
    private final boolean analyticsEnabled;
    private final String appPackageName;
    private final String appVersionName;
    private final String applicationId;
    private final boolean delayRegistrationUntilContactKeyIsSet;
    private final boolean geofencingEnabled;
    private final boolean inboxEnabled;
    private final boolean markMessageReadOnInboxNotificationOpen;
    private final String marketingCloudServerUrl;
    private final String mid;
    private final NotificationCustomizationOptions notificationCustomizationOptions;
    private final boolean piAnalyticsEnabled;
    private final String predictiveIntelligenceServerUrl;
    private final boolean proximityEnabled;
    private final String senderId;
    private final UrlHandler urlHandler;
    private final boolean useLegacyPiIdentifier;

    @MCKeep
    public static final class Builder {
        private static final int ACCESS_TOKEN_LENGTH = 24;
        private static final C40419j APP_ID_REGEX = new C40419j("[0-9a-f]{8}-[a-f0-9]{4}-4[a-f0-9]{3}-[89aAbB][a-f0-9]{3}-[a-f0-9]{12}");
        public static final C11296a Companion = new C11296a((DefaultConstructorMarker) null);
        private static final String INITIAL_PI_VALUE = "";
        private static final String TSE_ERROR_MSG = "An App Endpoint (the Marketing Cloud Server URL) is required in order to configure the SDK. See http://salesforce-marketingcloud.github.io/MarketingCloudSDK-Android for more information.";
        private String accessToken;
        private boolean analyticsEnabled;
        private String applicationId;
        private boolean delayRegistrationUntilContactKeyIsSet;
        private boolean geofencingEnabled;
        private boolean inboxEnabled;
        private boolean markMessageReadOnInboxNotificationOpen;
        private String marketingCloudServerUrl;
        private String mid;
        private NotificationCustomizationOptions notificationCustomizationOptions;
        private boolean piAnalyticsEnabled;
        private String predictiveIntelligenceServerUrl;
        private boolean proximityEnabled;
        private String senderId;
        private UrlHandler urlHandler;
        private boolean useLegacyPiIdentifier;

        /* renamed from: com.salesforce.marketingcloud.MarketingCloudConfig$Builder$a */
        public static final class C11296a {
            private C11296a() {
            }

            public /* synthetic */ C11296a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Builder() {
            this.markMessageReadOnInboxNotificationOpen = true;
            this.useLegacyPiIdentifier = true;
            this.predictiveIntelligenceServerUrl = "";
        }

        private final String checkNotEmpty(String str, C43064a aVar) {
            if (str == null || TextUtils.getTrimmedLength(str) != 0) {
                return str;
            }
            throw new IllegalStateException(aVar.invoke().toString());
        }

        private final String checkNotNullOrEmpty(String str, C43064a aVar) {
            if (str != null && TextUtils.getTrimmedLength(str) != 0) {
                return str;
            }
            throw new IllegalStateException(aVar.invoke().toString());
        }

        /* renamed from: -setPredictiveIntelligenceServerUrl  reason: not valid java name */
        public final Builder m124843setPredictiveIntelligenceServerUrl(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.predictiveIntelligenceServerUrl = str;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
            if (r3 == null) goto L_0x00b5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.salesforce.marketingcloud.MarketingCloudConfig build(android.content.Context r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.String r1 = "null"
                java.lang.String r2 = "context"
                r3 = r24
                kotlin.jvm.internal.C41536l.m120489i(r3, r2)
                java.lang.String r2 = r24.getPackageName()
                r4 = 0
                android.content.pm.PackageManager r3 = r24.getPackageManager()     // Catch:{ Exception -> 0x0020 }
                android.content.pm.PackageInfo r3 = r3.getPackageInfo(r2, r4)     // Catch:{ Exception -> 0x0020 }
                java.lang.String r3 = r3.versionName     // Catch:{ Exception -> 0x0020 }
                if (r3 != 0) goto L_0x001d
                goto L_0x0020
            L_0x001d:
                r20 = r3
                goto L_0x0022
            L_0x0020:
                r20 = r1
            L_0x0022:
                java.lang.String r1 = r0.applicationId
                if (r1 == 0) goto L_0x0169
                java.util.Locale r3 = java.util.Locale.ENGLISH
                java.lang.String r5 = "ENGLISH"
                kotlin.jvm.internal.C41536l.m120488h(r3, r5)
                java.lang.String r6 = r1.toLowerCase(r3)
                java.lang.String r7 = "(this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.C41536l.m120488h(r6, r7)
                cf1.j r8 = APP_ID_REGEX
                boolean r6 = r8.mo94489f(r6)
                if (r6 == 0) goto L_0x015d
                java.lang.String r6 = r0.accessToken
                if (r6 == 0) goto L_0x0151
                int r8 = r6.length()
                r9 = 24
                if (r8 != r9) goto L_0x004c
                r8 = 1
                goto L_0x004d
            L_0x004c:
                r8 = r4
            L_0x004d:
                if (r8 == 0) goto L_0x0145
                java.lang.String r8 = r0.marketingCloudServerUrl
                java.lang.String r9 = "An App Endpoint (the Marketing Cloud Server URL) is required in order to configure the SDK. See http://salesforce-marketingcloud.github.io/MarketingCloudSDK-Android for more information."
                if (r8 == 0) goto L_0x013b
                int r10 = android.text.TextUtils.getTrimmedLength(r8)
                if (r10 == 0) goto L_0x013b
                boolean r10 = android.webkit.URLUtil.isNetworkUrl(r8)
                if (r10 == 0) goto L_0x0131
                java.lang.String r9 = r0.predictiveIntelligenceServerUrl
                java.lang.String r10 = ""
                boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
                if (r9 == 0) goto L_0x00b9
                java.lang.String r9 = r0.mid
                if (r9 != 0) goto L_0x0070
                goto L_0x00b5
            L_0x0070:
                kotlin.jvm.internal.C41536l.m120488h(r3, r5)
                java.lang.String r10 = r9.toLowerCase(r3)
                kotlin.jvm.internal.C41536l.m120488h(r10, r7)
                java.lang.String r11 = "-"
                r12 = 0
                r13 = 0
                r14 = 6
                r15 = 0
                int r3 = cf1.C40440x.m117156X(r10, r11, r12, r13, r14, r15)
                r5 = -1
                if (r3 == r5) goto L_0x0090
                java.lang.CharSequence r3 = r9.subSequence(r4, r3)
                java.lang.String r3 = r3.toString()
                goto L_0x0091
            L_0x0090:
                r3 = r9
            L_0x0091:
                r0.mid = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "https://"
                r3.append(r4)
                r3.append(r9)
                java.lang.String r4 = ".collect.igodigital.com/c2/"
                r3.append(r4)
                java.lang.String r4 = r0.mid
                r3.append(r4)
                java.lang.String r4 = "/process_batch.json"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                if (r3 != 0) goto L_0x00b7
            L_0x00b5:
                java.lang.String r3 = "https://app.igodigital.com/api/v1/collect/process_batch"
            L_0x00b7:
                r0.predictiveIntelligenceServerUrl = r3
            L_0x00b9:
                java.lang.String r7 = r0.senderId
                if (r7 == 0) goto L_0x00d0
                int r3 = android.text.TextUtils.getTrimmedLength(r7)
                if (r3 == 0) goto L_0x00c4
                goto L_0x00d0
            L_0x00c4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "The senderId cannot be empty."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00d0:
                java.lang.String r9 = r0.mid
                if (r9 == 0) goto L_0x00e7
                int r3 = android.text.TextUtils.getTrimmedLength(r9)
                if (r3 == 0) goto L_0x00db
                goto L_0x00e7
            L_0x00db:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "MID must not be empty."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00e7:
                boolean r10 = r0.analyticsEnabled
                boolean r11 = r0.geofencingEnabled
                boolean r12 = r0.inboxEnabled
                boolean r13 = r0.piAnalyticsEnabled
                boolean r14 = r0.proximityEnabled
                boolean r15 = r0.markMessageReadOnInboxNotificationOpen
                boolean r5 = r0.delayRegistrationUntilContactKeyIsSet
                boolean r4 = r0.useLegacyPiIdentifier
                com.salesforce.marketingcloud.notifications.NotificationCustomizationOptions r3 = r0.notificationCustomizationOptions
                if (r3 == 0) goto L_0x0125
                r16 = r3
                com.salesforce.marketingcloud.UrlHandler r3 = r0.urlHandler
                r18 = r3
                java.lang.String r3 = "packageName"
                kotlin.jvm.internal.C41536l.m120488h(r2, r3)
                java.lang.String r3 = r0.predictiveIntelligenceServerUrl
                r21 = r3
                com.salesforce.marketingcloud.MarketingCloudConfig r22 = new com.salesforce.marketingcloud.MarketingCloudConfig
                r17 = r16
                r3 = r22
                r16 = r4
                r4 = r1
                r1 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r15
                r15 = r1
                r19 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return r22
            L_0x0125:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "notificationCustomizationOptions == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0131:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r9.toString()
                r1.<init>(r2)
                throw r1
            L_0x013b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = r9.toString()
                r1.<init>(r2)
                throw r1
            L_0x0145:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "The accessToken must be 24 characters."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0151:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "accessToken == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x015d:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "The applicationId is not a valid UUID."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0169:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "applicationId == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MarketingCloudConfig.Builder.build(android.content.Context):com.salesforce.marketingcloud.MarketingCloudConfig");
        }

        public final Builder setAccessToken(String str) {
            C41536l.m120489i(str, "accessToken");
            this.accessToken = str;
            return this;
        }

        public final Builder setAnalyticsEnabled(boolean z) {
            this.analyticsEnabled = z;
            return this;
        }

        public final Builder setApplicationId(String str) {
            C41536l.m120489i(str, "applicationId");
            this.applicationId = str;
            return this;
        }

        public final Builder setDelayRegistrationUntilContactKeyIsSet(boolean z) {
            this.delayRegistrationUntilContactKeyIsSet = z;
            return this;
        }

        public final Builder setGeofencingEnabled(boolean z) {
            this.geofencingEnabled = z;
            return this;
        }

        public final Builder setInboxEnabled(boolean z) {
            this.inboxEnabled = z;
            return this;
        }

        public final Builder setMarkMessageReadOnInboxNotificationOpen(boolean z) {
            this.markMessageReadOnInboxNotificationOpen = z;
            return this;
        }

        public final Builder setMarketingCloudServerUrl(String str) {
            C41536l.m120489i(str, "marketingCloudServerUrl");
            this.marketingCloudServerUrl = str;
            return this;
        }

        public final Builder setMid(String str) {
            C41536l.m120489i(str, "mid");
            this.mid = str;
            return this;
        }

        public final Builder setNotificationCustomizationOptions(NotificationCustomizationOptions notificationCustomizationOptions2) {
            C41536l.m120489i(notificationCustomizationOptions2, "options");
            this.notificationCustomizationOptions = notificationCustomizationOptions2;
            return this;
        }

        public final Builder setPiAnalyticsEnabled(boolean z) {
            this.piAnalyticsEnabled = z;
            return this;
        }

        public final Builder setProximityEnabled(boolean z) {
            this.proximityEnabled = z;
            return this;
        }

        public final Builder setSenderId(String str) {
            C41536l.m120489i(str, "senderId");
            this.senderId = str;
            return this;
        }

        public final Builder setUrlHandler(UrlHandler urlHandler2) {
            C41536l.m120489i(urlHandler2, "urlHandler");
            this.urlHandler = urlHandler2;
            return this;
        }

        public final Builder setUseLegacyPiIdentifier(boolean z) {
            this.useLegacyPiIdentifier = z;
            return this;
        }

        public Builder(MarketingCloudConfig marketingCloudConfig) {
            C41536l.m120489i(marketingCloudConfig, "config");
            this.markMessageReadOnInboxNotificationOpen = true;
            this.useLegacyPiIdentifier = true;
            this.applicationId = marketingCloudConfig.applicationId();
            this.accessToken = marketingCloudConfig.accessToken();
            this.senderId = marketingCloudConfig.senderId();
            this.marketingCloudServerUrl = marketingCloudConfig.marketingCloudServerUrl();
            this.mid = marketingCloudConfig.mid();
            this.analyticsEnabled = marketingCloudConfig.analyticsEnabled();
            this.geofencingEnabled = marketingCloudConfig.geofencingEnabled();
            this.inboxEnabled = marketingCloudConfig.inboxEnabled();
            this.piAnalyticsEnabled = marketingCloudConfig.piAnalyticsEnabled();
            this.proximityEnabled = marketingCloudConfig.proximityEnabled();
            this.markMessageReadOnInboxNotificationOpen = marketingCloudConfig.markMessageReadOnInboxNotificationOpen();
            this.delayRegistrationUntilContactKeyIsSet = marketingCloudConfig.delayRegistrationUntilContactKeyIsSet();
            this.useLegacyPiIdentifier = marketingCloudConfig.useLegacyPiIdentifier();
            this.notificationCustomizationOptions = marketingCloudConfig.notificationCustomizationOptions();
            this.urlHandler = marketingCloudConfig.urlHandler();
            this.predictiveIntelligenceServerUrl = marketingCloudConfig.predictiveIntelligenceServerUrl();
        }
    }

    @MCKeep
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.MarketingCloudConfig$a */
    static final class C11297a extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ InitializationStatus f32851a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11297a(InitializationStatus initializationStatus) {
            super(0);
            this.f32851a = initializationStatus;
        }

        /* renamed from: a */
        public final String invoke() {
            return C41536l.m120497q("InitializationStatus: ", this.f32851a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarketingCloudConfig(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, NotificationCustomizationOptions notificationCustomizationOptions2, UrlHandler urlHandler2, String str6, String str7, String str8) {
        super(str);
        NotificationCustomizationOptions notificationCustomizationOptions3 = notificationCustomizationOptions2;
        String str9 = str6;
        String str10 = str7;
        String str11 = str8;
        C41536l.m120489i(str, "applicationId");
        C41536l.m120489i(str2, "accessToken");
        C41536l.m120489i(str4, "marketingCloudServerUrl");
        C41536l.m120489i(notificationCustomizationOptions3, "notificationCustomizationOptions");
        C41536l.m120489i(str9, "appPackageName");
        C41536l.m120489i(str10, "appVersionName");
        C41536l.m120489i(str11, "predictiveIntelligenceServerUrl");
        this.applicationId = str;
        this.accessToken = str2;
        this.senderId = str3;
        this.marketingCloudServerUrl = str4;
        this.mid = str5;
        this.analyticsEnabled = z;
        this.geofencingEnabled = z2;
        this.inboxEnabled = z3;
        this.piAnalyticsEnabled = z4;
        this.proximityEnabled = z5;
        this.markMessageReadOnInboxNotificationOpen = z6;
        this.delayRegistrationUntilContactKeyIsSet = z7;
        this.useLegacyPiIdentifier = z8;
        this.notificationCustomizationOptions = notificationCustomizationOptions3;
        this.urlHandler = urlHandler2;
        this.appPackageName = str9;
        this.appVersionName = str10;
        this.predictiveIntelligenceServerUrl = str11;
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public static /* synthetic */ MarketingCloudConfig copy$default(MarketingCloudConfig marketingCloudConfig, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, NotificationCustomizationOptions notificationCustomizationOptions2, UrlHandler urlHandler2, String str6, String str7, String str8, int i, Object obj) {
        MarketingCloudConfig marketingCloudConfig2 = marketingCloudConfig;
        int i2 = i;
        return marketingCloudConfig.copy((i2 & 1) != 0 ? marketingCloudConfig2.applicationId : str, (i2 & 2) != 0 ? marketingCloudConfig2.accessToken : str2, (i2 & 4) != 0 ? marketingCloudConfig2.senderId : str3, (i2 & 8) != 0 ? marketingCloudConfig2.marketingCloudServerUrl : str4, (i2 & 16) != 0 ? marketingCloudConfig2.mid : str5, (i2 & 32) != 0 ? marketingCloudConfig2.analyticsEnabled : z, (i2 & 64) != 0 ? marketingCloudConfig2.geofencingEnabled : z2, (i2 & 128) != 0 ? marketingCloudConfig2.inboxEnabled : z3, (i2 & C11398b.f33139r) != 0 ? marketingCloudConfig2.piAnalyticsEnabled : z4, (i2 & C11398b.f33140s) != 0 ? marketingCloudConfig2.proximityEnabled : z5, (i2 & C11398b.f33141t) != 0 ? marketingCloudConfig2.markMessageReadOnInboxNotificationOpen : z6, (i2 & C11398b.f33142u) != 0 ? marketingCloudConfig2.delayRegistrationUntilContactKeyIsSet : z7, (i2 & C11398b.f33143v) != 0 ? marketingCloudConfig2.useLegacyPiIdentifier : z8, (i2 & 8192) != 0 ? marketingCloudConfig2.notificationCustomizationOptions : notificationCustomizationOptions2, (i2 & 16384) != 0 ? marketingCloudConfig2.urlHandler : urlHandler2, (i2 & 32768) != 0 ? marketingCloudConfig2.appPackageName : str6, (i2 & 65536) != 0 ? marketingCloudConfig2.appVersionName : str7, (i2 & 131072) != 0 ? marketingCloudConfig2.predictiveIntelligenceServerUrl : str8);
    }

    /* access modifiers changed from: private */
    /* renamed from: init$lambda-1  reason: not valid java name */
    public static final void m124825init$lambda1(ModuleReadyListener moduleReadyListener, InitializationStatus initializationStatus) {
        C41536l.m120489i(moduleReadyListener, "$listener");
        C41536l.m120489i(initializationStatus, "it");
        C11461g.m41893e(C11461g.f33306a, TAG, (Throwable) null, new C11297a(initializationStatus), 2, (Object) null);
        MarketingCloudSdk.requestSdk(new C11536l(moduleReadyListener));
    }

    /* access modifiers changed from: private */
    /* renamed from: init$lambda-1$lambda-0  reason: not valid java name */
    public static final void m124826init$lambda1$lambda0(ModuleReadyListener moduleReadyListener, MarketingCloudSdk marketingCloudSdk) {
        C41536l.m120489i(moduleReadyListener, "$listener");
        C41536l.m120489i(marketingCloudSdk, "sdk");
        moduleReadyListener.ready(marketingCloudSdk);
    }

    /* renamed from: -applicationChanged  reason: not valid java name */
    public final boolean m124827applicationChanged(MarketingCloudConfig marketingCloudConfig) {
        C41536l.m120489i(marketingCloudConfig, "other");
        return !C41536l.m120484d(this.applicationId, marketingCloudConfig.applicationId) || !C41536l.m120484d(this.accessToken, marketingCloudConfig.accessToken);
    }

    /* renamed from: -deprecated_accessToken  reason: not valid java name */
    public final String m124828deprecated_accessToken() {
        return this.accessToken;
    }

    /* renamed from: -deprecated_analyticsEnabled  reason: not valid java name */
    public final boolean m124829deprecated_analyticsEnabled() {
        return this.analyticsEnabled;
    }

    /* renamed from: -deprecated_applicationId  reason: not valid java name */
    public final String m124830deprecated_applicationId() {
        return this.applicationId;
    }

    /* renamed from: -deprecated_delayRegistrationUntilContactKeyIsSet  reason: not valid java name */
    public final boolean m124831deprecated_delayRegistrationUntilContactKeyIsSet() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    /* renamed from: -deprecated_geofencingEnabled  reason: not valid java name */
    public final boolean m124832deprecated_geofencingEnabled() {
        return this.geofencingEnabled;
    }

    /* renamed from: -deprecated_inboxEnabled  reason: not valid java name */
    public final boolean m124833deprecated_inboxEnabled() {
        return this.inboxEnabled;
    }

    /* renamed from: -deprecated_markMessageReadOnInboxNotificationOpen  reason: not valid java name */
    public final boolean m124834deprecated_markMessageReadOnInboxNotificationOpen() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    /* renamed from: -deprecated_marketingCloudServerUrl  reason: not valid java name */
    public final String m124835deprecated_marketingCloudServerUrl() {
        return this.marketingCloudServerUrl;
    }

    /* renamed from: -deprecated_mid  reason: not valid java name */
    public final String m124836deprecated_mid() {
        return this.mid;
    }

    /* renamed from: -deprecated_notificationCustomizationOptions  reason: not valid java name */
    public final NotificationCustomizationOptions m124837deprecated_notificationCustomizationOptions() {
        return this.notificationCustomizationOptions;
    }

    /* renamed from: -deprecated_piAnalyticsEnabled  reason: not valid java name */
    public final boolean m124838deprecated_piAnalyticsEnabled() {
        return this.piAnalyticsEnabled;
    }

    /* renamed from: -deprecated_proximityEnabled  reason: not valid java name */
    public final boolean m124839deprecated_proximityEnabled() {
        return this.proximityEnabled;
    }

    /* renamed from: -deprecated_senderId  reason: not valid java name */
    public final String m124840deprecated_senderId() {
        return this.senderId;
    }

    /* renamed from: -deprecated_urlHandler  reason: not valid java name */
    public final UrlHandler m124841deprecated_urlHandler() {
        return this.urlHandler;
    }

    /* renamed from: -deprecated_useLegacyPiIdentifier  reason: not valid java name */
    public final boolean m124842deprecated_useLegacyPiIdentifier() {
        return this.useLegacyPiIdentifier;
    }

    public final String accessToken() {
        return this.accessToken;
    }

    public final boolean analyticsEnabled() {
        return this.analyticsEnabled;
    }

    public final String appPackageName() {
        return this.appPackageName;
    }

    public final String appVersionName() {
        return this.appVersionName;
    }

    public final String applicationId() {
        return this.applicationId;
    }

    public final String component1() {
        return this.applicationId;
    }

    public final boolean component10() {
        return this.proximityEnabled;
    }

    public final boolean component11() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    public final boolean component12() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    public final boolean component13() {
        return this.useLegacyPiIdentifier;
    }

    public final NotificationCustomizationOptions component14() {
        return this.notificationCustomizationOptions;
    }

    public final UrlHandler component15() {
        return this.urlHandler;
    }

    public final String component16$sdk_release() {
        return this.appPackageName;
    }

    public final String component17$sdk_release() {
        return this.appVersionName;
    }

    public final String component18$sdk_release() {
        return this.predictiveIntelligenceServerUrl;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final String component3() {
        return this.senderId;
    }

    public final String component4() {
        return this.marketingCloudServerUrl;
    }

    public final String component5() {
        return this.mid;
    }

    public final boolean component6() {
        return this.analyticsEnabled;
    }

    public final boolean component7() {
        return this.geofencingEnabled;
    }

    public final boolean component8() {
        return this.inboxEnabled;
    }

    public final boolean component9() {
        return this.piAnalyticsEnabled;
    }

    public final MarketingCloudConfig copy(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, NotificationCustomizationOptions notificationCustomizationOptions2, UrlHandler urlHandler2, String str6, String str7, String str8) {
        String str9 = str;
        C41536l.m120489i(str9, "applicationId");
        C41536l.m120489i(str2, "accessToken");
        C41536l.m120489i(str4, "marketingCloudServerUrl");
        C41536l.m120489i(notificationCustomizationOptions2, "notificationCustomizationOptions");
        C41536l.m120489i(str6, "appPackageName");
        C41536l.m120489i(str7, "appVersionName");
        C41536l.m120489i(str8, "predictiveIntelligenceServerUrl");
        return new MarketingCloudConfig(str9, str2, str3, str4, str5, z, z2, z3, z4, z5, z6, z7, z8, notificationCustomizationOptions2, urlHandler2, str6, str7, str8);
    }

    public final boolean delayRegistrationUntilContactKeyIsSet() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingCloudConfig)) {
            return false;
        }
        MarketingCloudConfig marketingCloudConfig = (MarketingCloudConfig) obj;
        return C41536l.m120484d(this.applicationId, marketingCloudConfig.applicationId) && C41536l.m120484d(this.accessToken, marketingCloudConfig.accessToken) && C41536l.m120484d(this.senderId, marketingCloudConfig.senderId) && C41536l.m120484d(this.marketingCloudServerUrl, marketingCloudConfig.marketingCloudServerUrl) && C41536l.m120484d(this.mid, marketingCloudConfig.mid) && this.analyticsEnabled == marketingCloudConfig.analyticsEnabled && this.geofencingEnabled == marketingCloudConfig.geofencingEnabled && this.inboxEnabled == marketingCloudConfig.inboxEnabled && this.piAnalyticsEnabled == marketingCloudConfig.piAnalyticsEnabled && this.proximityEnabled == marketingCloudConfig.proximityEnabled && this.markMessageReadOnInboxNotificationOpen == marketingCloudConfig.markMessageReadOnInboxNotificationOpen && this.delayRegistrationUntilContactKeyIsSet == marketingCloudConfig.delayRegistrationUntilContactKeyIsSet && this.useLegacyPiIdentifier == marketingCloudConfig.useLegacyPiIdentifier && C41536l.m120484d(this.notificationCustomizationOptions, marketingCloudConfig.notificationCustomizationOptions) && C41536l.m120484d(this.urlHandler, marketingCloudConfig.urlHandler) && C41536l.m120484d(this.appPackageName, marketingCloudConfig.appPackageName) && C41536l.m120484d(this.appVersionName, marketingCloudConfig.appVersionName) && C41536l.m120484d(this.predictiveIntelligenceServerUrl, marketingCloudConfig.predictiveIntelligenceServerUrl);
    }

    public final boolean geofencingEnabled() {
        return this.geofencingEnabled;
    }

    public int hashCode() {
        int hashCode = ((this.applicationId.hashCode() * 31) + this.accessToken.hashCode()) * 31;
        String str = this.senderId;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.marketingCloudServerUrl.hashCode()) * 31;
        String str2 = this.mid;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.analyticsEnabled;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.geofencingEnabled;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.inboxEnabled;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.piAnalyticsEnabled;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.proximityEnabled;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.markMessageReadOnInboxNotificationOpen;
        if (z7) {
            z7 = true;
        }
        int i7 = (i6 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.delayRegistrationUntilContactKeyIsSet;
        if (z8) {
            z8 = true;
        }
        int i8 = (i7 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.useLegacyPiIdentifier;
        if (!z9) {
            z2 = z9;
        }
        int hashCode4 = (((i8 + (z2 ? 1 : 0)) * 31) + this.notificationCustomizationOptions.hashCode()) * 31;
        UrlHandler urlHandler2 = this.urlHandler;
        if (urlHandler2 != null) {
            i = urlHandler2.hashCode();
        }
        return ((((((hashCode4 + i) * 31) + this.appPackageName.hashCode()) * 31) + this.appVersionName.hashCode()) * 31) + this.predictiveIntelligenceServerUrl.hashCode();
    }

    public final boolean inboxEnabled() {
        return this.inboxEnabled;
    }

    public void init(Context context, SFMCSdkComponents sFMCSdkComponents, ModuleReadyListener moduleReadyListener) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(sFMCSdkComponents, "components");
        C41536l.m120489i(moduleReadyListener, "listener");
        MarketingCloudSdk.m41401b(context, this, sFMCSdkComponents, new C11552m(moduleReadyListener));
    }

    public final boolean markMessageReadOnInboxNotificationOpen() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    public final String marketingCloudServerUrl() {
        return this.marketingCloudServerUrl;
    }

    public final String mid() {
        return this.mid;
    }

    public final NotificationCustomizationOptions notificationCustomizationOptions() {
        return this.notificationCustomizationOptions;
    }

    public final boolean piAnalyticsEnabled() {
        return this.piAnalyticsEnabled;
    }

    public final String predictiveIntelligenceServerUrl() {
        return this.predictiveIntelligenceServerUrl;
    }

    public final boolean proximityEnabled() {
        return this.proximityEnabled;
    }

    public final String senderId() {
        return this.senderId;
    }

    public final Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "MarketingCloudConfig(applicationId=" + this.applicationId + ", accessToken=" + this.accessToken + ", senderId=" + this.senderId + ", marketingCloudServerUrl=" + this.marketingCloudServerUrl + ", mid=" + this.mid + ", analyticsEnabled=" + this.analyticsEnabled + ", geofencingEnabled=" + this.geofencingEnabled + ", inboxEnabled=" + this.inboxEnabled + ", piAnalyticsEnabled=" + this.piAnalyticsEnabled + ", proximityEnabled=" + this.proximityEnabled + ", markMessageReadOnInboxNotificationOpen=" + this.markMessageReadOnInboxNotificationOpen + ", delayRegistrationUntilContactKeyIsSet=" + this.delayRegistrationUntilContactKeyIsSet + ", useLegacyPiIdentifier=" + this.useLegacyPiIdentifier + ", notificationCustomizationOptions=" + this.notificationCustomizationOptions + ", urlHandler=" + this.urlHandler + ", appPackageName=" + this.appPackageName + ", appVersionName=" + this.appVersionName + ", predictiveIntelligenceServerUrl=" + this.predictiveIntelligenceServerUrl + ')';
    }

    public final UrlHandler urlHandler() {
        return this.urlHandler;
    }

    public final boolean useLegacyPiIdentifier() {
        return this.useLegacyPiIdentifier;
    }
}
