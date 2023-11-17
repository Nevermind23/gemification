package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11195x0;

/* renamed from: com.medallia.digital.mobilesdk.s0 */
enum C11083s0 {
    Unknown("", -1, (String) null),
    AppId("AppId", 0, C11195x0.C11196a.f32212t.getLifetime()),
    AppName("AppName", 1, C11195x0.C11196a.f32211s.getLifetime()),
    AppVersion("AppVersion", 2, C11195x0.C11196a.f32213u.getLifetime()),
    BatteryPercentage("BatteryPercentage", 3, C11195x0.C11196a.f32168C.getLifetime()),
    CustomParameters("CustomParameters", 4, C11195x0.C11196a.f32175J.getLifetime()),
    DeviceFreeDiskSpace("DeviceFreeDiskSpace", 5, C11195x0.C11196a.f32192a.getLifetime()),
    DeviceFreeMemoryCollector("DeviceFreeMemory", 6, C11195x0.C11196a.f32194b.getLifetime()),
    DeviceId("DeviceId", 7, C11195x0.C11196a.f32210r.getLifetime()),
    DeviceModel("DeviceModel", 8, C11195x0.C11196a.f32195c.getLifetime()),
    DeviceResolution("DeviceResolution", 9, C11195x0.C11196a.f32196d.getLifetime()),
    DeviceUsedDiskSpace("DeviceUsedDiskSpace", 10, C11195x0.C11196a.f32197e.getLifetime()),
    DeviceUsedMemory("DeviceUsedMemory", 11, C11195x0.C11196a.f32198f.getLifetime()),
    DeviceVendor("DeviceVendor", 12, C11195x0.C11196a.f32199g.getLifetime()),
    ExternalDriveFreeSpace("ExternalDriveFreeSpace", 13, C11195x0.C11196a.f32201i.getLifetime()),
    ExternalDriveUsedSpace("ExternalDriveUsedSpace", 14, C11195x0.C11196a.f32200h.getLifetime()),
    InvitationDisplayed("InvitationDisplayed", 15, C11195x0.C11196a.f32176K.getLifetime()),
    InterceptEnabled("InterceptEnabled", 16, C11195x0.C11196a.f32179N.getLifetime()),
    InterceptDisabled("InterceptDisabled", 17, C11195x0.C11196a.f32180O.getLifetime()),
    IP("IP", 18, C11195x0.C11196a.f32208p.getLifetime()),
    Language("Language", 19, C11195x0.C11196a.f32206n.getLifetime()),
    LastDeclineTimestamp("LastDeclineTimestamp", 20, C11195x0.C11196a.f32170E.getLifetime()),
    LastSubmitTimestamp("LastSubmitTimestamp", 21, C11195x0.C11196a.f32171F.getLifetime()),
    TimeInBackground("TimeInBackground", 22, C11195x0.C11196a.f32177L.getLifetime()),
    TimeInForeground("TimeInForeground", 23, C11195x0.C11196a.f32178M.getLifetime()),
    NetworkCarrier("NetworkCarrier", 24, C11195x0.C11196a.f32205m.getLifetime()),
    NetworkProvider("NetworkProvider", 25, C11195x0.C11196a.f32204l.getLifetime()),
    NetworkSpeed("NetworkSpeed", 26, C11195x0.C11196a.f32209q.getLifetime()),
    NetworkType("NetworkType", 27, C11195x0.C11196a.f32218z.getLifetime()),
    Orientation("Orientation", 28, C11195x0.C11196a.f32169D.getLifetime()),
    OsName("OsName", 29, C11195x0.C11196a.f32202j.getLifetime()),
    OsVersion("OsVersion", 30, C11195x0.C11196a.f32203k.getLifetime()),
    PowerType("PowerType", 31, C11195x0.C11196a.f32166A.getLifetime()),
    PropertyId("PropertyId", 32, C11195x0.C11196a.f32167B.getLifetime()),
    SdkVersion("SdkVersion", 33, C11195x0.C11196a.f32214v.getLifetime()),
    SessionCalculatedPercentage("SessionCalculatedPercentage", 34, C11195x0.C11196a.f32215w.getLifetime()),
    SessionNumber("SessionNumber", 35, C11195x0.C11196a.f32216x.getLifetime()),
    SessionId("SessionId", 36, C11195x0.C11196a.f32217y.getLifetime()),
    Timezone("Timezone", 37, C11195x0.C11196a.f32207o.getLifetime()),
    UserEmail("UserEmail", 38, C11195x0.C11196a.f32173H.getLifetime()),
    UserId("UserId", 39, C11195x0.C11196a.f32172G.getLifetime()),
    UserName("UserName", 40, C11195x0.C11196a.f32174I.getLifetime()),
    NPS("NPS", 41, C11195x0.C11196a.f32181P.getLifetime()),
    CSAT("CSAT", 42, C11195x0.C11196a.f32182Q.getLifetime()),
    AppRatingLastDeclineTimestamp("AppRatingLastDeclineTimestamp", 43, C11195x0.C11196a.f32183R.getLifetime()),
    PromptDisplayed("PromptDisplayed", 44, C11195x0.C11196a.f32184S.getLifetime()),
    AppRatingLastAcceptedTimestamp("AppRatingLastAcceptedTimestamp", 45, C11195x0.C11196a.f32185T.getLifetime()),
    SDKAnalyticsVersion("SDKAnalyticsVersion", 46, C11195x0.C11196a.f32186U.getLifetime()),
    SDKFramework("SDKFrameworkCollector", 47, C11195x0.C11196a.f32187V.getLifetime()),
    AppRatingLastTriggerTimestamp("AppRatingLastTriggerTimestamp", 48, C11195x0.C11196a.f32188W.getLifetime()),
    IsOCQUserSet("IsOCQUserSet", 49, C11195x0.C11196a.f32189X.getLifetime()),
    IsOCQRulesValid("IsOCQRulesValid", 50, C11195x0.C11196a.f32190Y.getLifetime()),
    IsSessionSampledEvents("IsSessionSampledEvents", 51, C11195x0.C11196a.f32191Z.getLifetime()),
    SessionPercentageSampledEvents("SessionPercentageSampledEvents", 52, C11195x0.C11196a.f32193a0.getLifetime());
    

    /* renamed from: id */
    private final int f31861id;
    private final Lifetime lifetime;
    private final String name;

    private C11083s0(String str, int i, Lifetime lifetime2) {
        this.name = str;
        this.f31861id = i;
        this.lifetime = lifetime2;
    }

    /* access modifiers changed from: protected */
    public int getId() {
        return this.f31861id;
    }

    /* access modifiers changed from: protected */
    public Lifetime getLifetime() {
        return this.lifetime;
    }

    /* access modifiers changed from: protected */
    public String getName() {
        return this.name;
    }
}
