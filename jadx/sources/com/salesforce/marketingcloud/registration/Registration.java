package com.salesforce.marketingcloud.registration;

import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.internal.C11516m;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.C41536l;
import org.json.JSONArray;
import org.json.JSONObject;

@MCKeep
public final class Registration {
    private final String appId;
    private final String appVersion;
    private final Map<String, String> attributes;
    private final String contactKey;
    private final String deviceId;
    private final boolean dst;
    private final String hwid;

    /* renamed from: id */
    private int f33961id;
    private final String locale;
    private final boolean locationEnabled;
    private final String platform;
    private final String platformVersion;
    private final boolean proximityEnabled;
    private final boolean pushEnabled;
    private final String sdkVersion;
    private final String signedString;
    private final String systemToken;
    private final Set<String> tags;
    private final int timeZone;

    public Registration(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, boolean z4, int i2, String str7, String str8, String str9, String str10, String str11, Set<String> set, Map<String, String> map) {
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str8;
        String str16 = str9;
        String str17 = str10;
        String str18 = str11;
        Set<String> set2 = set;
        Map<String, String> map2 = map;
        C41536l.m120489i(str2, "deviceId");
        C41536l.m120489i(str12, "sdkVersion");
        C41536l.m120489i(str13, "appVersion");
        C41536l.m120489i(str14, "platformVersion");
        C41536l.m120489i(str15, C11772k.C11773a.f34170b);
        C41536l.m120489i(str16, C11772k.C11773a.f34181m);
        C41536l.m120489i(str17, "appId");
        C41536l.m120489i(str18, C11772k.C11773a.f34182n);
        C41536l.m120489i(set2, C11772k.C11773a.f34175g);
        C41536l.m120489i(map2, C11772k.C11773a.f34176h);
        this.f33961id = i;
        this.signedString = str;
        this.deviceId = str2;
        this.systemToken = str3;
        this.sdkVersion = str12;
        this.appVersion = str13;
        this.dst = z;
        this.locationEnabled = z2;
        this.proximityEnabled = z3;
        this.platformVersion = str14;
        this.pushEnabled = z4;
        this.timeZone = i2;
        this.contactKey = str7;
        this.platform = str15;
        this.hwid = str16;
        this.appId = str17;
        this.locale = str18;
        this.tags = set2;
        this.attributes = map2;
    }

    public static /* synthetic */ Registration copy$default(Registration registration, int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, boolean z4, int i2, String str7, String str8, String str9, String str10, String str11, Set set, Map map, int i3, Object obj) {
        Registration registration2 = registration;
        int i4 = i3;
        return registration.copy((i4 & 1) != 0 ? registration2.f33961id : i, (i4 & 2) != 0 ? registration2.signedString : str, (i4 & 4) != 0 ? registration2.deviceId : str2, (i4 & 8) != 0 ? registration2.systemToken : str3, (i4 & 16) != 0 ? registration2.sdkVersion : str4, (i4 & 32) != 0 ? registration2.appVersion : str5, (i4 & 64) != 0 ? registration2.dst : z, (i4 & 128) != 0 ? registration2.locationEnabled : z2, (i4 & C11398b.f33139r) != 0 ? registration2.proximityEnabled : z3, (i4 & C11398b.f33140s) != 0 ? registration2.platformVersion : str6, (i4 & C11398b.f33141t) != 0 ? registration2.pushEnabled : z4, (i4 & C11398b.f33142u) != 0 ? registration2.timeZone : i2, (i4 & C11398b.f33143v) != 0 ? registration2.contactKey : str7, (i4 & 8192) != 0 ? registration2.platform : str8, (i4 & 16384) != 0 ? registration2.hwid : str9, (i4 & 32768) != 0 ? registration2.appId : str10, (i4 & 65536) != 0 ? registration2.locale : str11, (i4 & 131072) != 0 ? registration2.tags : set, (i4 & 262144) != 0 ? registration2.attributes : map);
    }

    /* renamed from: -deprecated_appId  reason: not valid java name */
    public final String m125001deprecated_appId() {
        return this.appId;
    }

    /* renamed from: -deprecated_appVersion  reason: not valid java name */
    public final String m125002deprecated_appVersion() {
        return this.appVersion;
    }

    /* renamed from: -deprecated_attributes  reason: not valid java name */
    public final Map<String, String> m125003deprecated_attributes() {
        return this.attributes;
    }

    /* renamed from: -deprecated_contactKey  reason: not valid java name */
    public final String m125004deprecated_contactKey() {
        return this.contactKey;
    }

    /* renamed from: -deprecated_deviceId  reason: not valid java name */
    public final String m125005deprecated_deviceId() {
        return this.deviceId;
    }

    /* renamed from: -deprecated_hwid  reason: not valid java name */
    public final String m125006deprecated_hwid() {
        return this.hwid;
    }

    /* renamed from: -deprecated_locale  reason: not valid java name */
    public final String m125007deprecated_locale() {
        return this.locale;
    }

    /* renamed from: -deprecated_locationEnabled  reason: not valid java name */
    public final boolean m125008deprecated_locationEnabled() {
        return this.locationEnabled;
    }

    /* renamed from: -deprecated_platform  reason: not valid java name */
    public final String m125009deprecated_platform() {
        return this.platform;
    }

    /* renamed from: -deprecated_platformVersion  reason: not valid java name */
    public final String m125010deprecated_platformVersion() {
        return this.platformVersion;
    }

    /* renamed from: -deprecated_proximityEnabled  reason: not valid java name */
    public final boolean m125011deprecated_proximityEnabled() {
        return this.proximityEnabled;
    }

    /* renamed from: -deprecated_pushEnabled  reason: not valid java name */
    public final boolean m125012deprecated_pushEnabled() {
        return this.pushEnabled;
    }

    /* renamed from: -deprecated_sdkVersion  reason: not valid java name */
    public final String m125013deprecated_sdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: -deprecated_signedString  reason: not valid java name */
    public final String m125014deprecated_signedString() {
        return this.signedString;
    }

    /* renamed from: -deprecated_systemToken  reason: not valid java name */
    public final String m125015deprecated_systemToken() {
        return this.systemToken;
    }

    /* renamed from: -deprecated_tags  reason: not valid java name */
    public final Set<String> m125016deprecated_tags() {
        return this.tags;
    }

    /* renamed from: -deprecated_timeZone  reason: not valid java name */
    public final int m125017deprecated_timeZone() {
        return this.timeZone;
    }

    /* renamed from: -id  reason: not valid java name */
    public final int m125018id() {
        return this.f33961id;
    }

    public final String appId() {
        return this.appId;
    }

    public final String appVersion() {
        return this.appVersion;
    }

    public final Map<String, String> attributes() {
        return this.attributes;
    }

    public final int component1$sdk_release() {
        return this.f33961id;
    }

    public final String component10() {
        return this.platformVersion;
    }

    public final boolean component11() {
        return this.pushEnabled;
    }

    public final int component12() {
        return this.timeZone;
    }

    public final String component13() {
        return this.contactKey;
    }

    public final String component14() {
        return this.platform;
    }

    public final String component15() {
        return this.hwid;
    }

    public final String component16() {
        return this.appId;
    }

    public final String component17() {
        return this.locale;
    }

    public final Set<String> component18() {
        return this.tags;
    }

    public final Map<String, String> component19() {
        return this.attributes;
    }

    public final String component2() {
        return this.signedString;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final String component4() {
        return this.systemToken;
    }

    public final String component5() {
        return this.sdkVersion;
    }

    public final String component6() {
        return this.appVersion;
    }

    public final boolean component7() {
        return this.dst;
    }

    public final boolean component8() {
        return this.locationEnabled;
    }

    public final boolean component9() {
        return this.proximityEnabled;
    }

    public final String contactKey() {
        return this.contactKey;
    }

    public final Registration copy(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, boolean z4, int i2, String str7, String str8, String str9, String str10, String str11, Set<String> set, Map<String, String> map) {
        int i3 = i;
        C41536l.m120489i(str2, "deviceId");
        C41536l.m120489i(str4, "sdkVersion");
        C41536l.m120489i(str5, "appVersion");
        C41536l.m120489i(str6, "platformVersion");
        C41536l.m120489i(str8, C11772k.C11773a.f34170b);
        C41536l.m120489i(str9, C11772k.C11773a.f34181m);
        C41536l.m120489i(str10, "appId");
        C41536l.m120489i(str11, C11772k.C11773a.f34182n);
        C41536l.m120489i(set, C11772k.C11773a.f34175g);
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        return new Registration(i, str, str2, str3, str4, str5, z, z2, z3, str6, z4, i2, str7, str8, str9, str10, str11, set, map);
    }

    public final String deviceId() {
        return this.deviceId;
    }

    public final boolean dst() {
        return this.dst;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Registration)) {
            return false;
        }
        Registration registration = (Registration) obj;
        return this.f33961id == registration.f33961id && C41536l.m120484d(this.signedString, registration.signedString) && C41536l.m120484d(this.deviceId, registration.deviceId) && C41536l.m120484d(this.systemToken, registration.systemToken) && C41536l.m120484d(this.sdkVersion, registration.sdkVersion) && C41536l.m120484d(this.appVersion, registration.appVersion) && this.dst == registration.dst && this.locationEnabled == registration.locationEnabled && this.proximityEnabled == registration.proximityEnabled && C41536l.m120484d(this.platformVersion, registration.platformVersion) && this.pushEnabled == registration.pushEnabled && this.timeZone == registration.timeZone && C41536l.m120484d(this.contactKey, registration.contactKey) && C41536l.m120484d(this.platform, registration.platform) && C41536l.m120484d(this.hwid, registration.hwid) && C41536l.m120484d(this.appId, registration.appId) && C41536l.m120484d(this.locale, registration.locale) && C41536l.m120484d(this.tags, registration.tags) && C41536l.m120484d(this.attributes, registration.attributes);
    }

    public int hashCode() {
        int i = this.f33961id * 31;
        String str = this.signedString;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.deviceId.hashCode()) * 31;
        String str2 = this.systemToken;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.sdkVersion.hashCode()) * 31) + this.appVersion.hashCode()) * 31;
        boolean z = this.dst;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.locationEnabled;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.proximityEnabled;
        if (z4) {
            z4 = true;
        }
        int hashCode3 = (((i4 + (z4 ? 1 : 0)) * 31) + this.platformVersion.hashCode()) * 31;
        boolean z5 = this.pushEnabled;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (((hashCode3 + (z2 ? 1 : 0)) * 31) + this.timeZone) * 31;
        String str3 = this.contactKey;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((((((((((i5 + i2) * 31) + this.platform.hashCode()) * 31) + this.hwid.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.attributes.hashCode();
    }

    public final String hwid() {
        return this.hwid;
    }

    public final String locale() {
        return this.locale;
    }

    public final boolean locationEnabled() {
        return this.locationEnabled;
    }

    public final String platform() {
        return this.platform;
    }

    public final String platformVersion() {
        return this.platformVersion;
    }

    public final boolean proximityEnabled() {
        return this.proximityEnabled;
    }

    public final boolean pushEnabled() {
        return this.pushEnabled;
    }

    public final String sdkVersion() {
        return this.sdkVersion;
    }

    public final void setId$sdk_release(int i) {
        this.f33961id = i;
    }

    public final String signedString() {
        return this.signedString;
    }

    public final String systemToken() {
        return this.systemToken;
    }

    public final Set<String> tags() {
        return this.tags;
    }

    public final int timeZone() {
        return this.timeZone;
    }

    public final JSONObject toJson$sdk_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("signedString", signedString());
        jSONObject.put("deviceID", deviceId());
        if (systemToken() != null) {
            jSONObject.put("device_Token", systemToken());
        }
        jSONObject.put("sdk_Version", sdkVersion());
        jSONObject.put("app_Version", appVersion());
        jSONObject.put("dST", dst());
        jSONObject.put("location_Enabled", locationEnabled());
        jSONObject.put("proximity_Enabled", proximityEnabled());
        jSONObject.put("platform_Version", platformVersion());
        jSONObject.put("push_Enabled", pushEnabled());
        jSONObject.put("timeZone", String.valueOf(timeZone()));
        if (contactKey() != null) {
            jSONObject.put("subscriberKey", contactKey());
        }
        jSONObject.put(C11772k.C11773a.f34170b, platform());
        jSONObject.put(C11772k.C11773a.f34181m, hwid());
        jSONObject.put("etAppId", appId());
        jSONObject.put(C11772k.C11773a.f34182n, locale());
        jSONObject.put(C11772k.C11773a.f34175g, new JSONArray(new TreeSet(tags())));
        jSONObject.put(C11772k.C11773a.f34176h, C11516m.m42086a((Map<String, String>) C41342q0.m119924i(attributes())));
        return jSONObject;
    }

    public String toString() {
        return "Registration(id=" + this.f33961id + ", signedString=" + this.signedString + ", deviceId=" + this.deviceId + ", systemToken=" + this.systemToken + ", sdkVersion=" + this.sdkVersion + ", appVersion=" + this.appVersion + ", dst=" + this.dst + ", locationEnabled=" + this.locationEnabled + ", proximityEnabled=" + this.proximityEnabled + ", platformVersion=" + this.platformVersion + ", pushEnabled=" + this.pushEnabled + ", timeZone=" + this.timeZone + ", contactKey=" + this.contactKey + ", platform=" + this.platform + ", hwid=" + this.hwid + ", appId=" + this.appId + ", locale=" + this.locale + ", tags=" + this.tags + ", attributes=" + this.attributes + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Registration(int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, boolean r31, java.lang.String r32, boolean r33, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.Set r40, java.util.Map r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r3 = r1
            goto L_0x000b
        L_0x0009:
            r3 = r23
        L_0x000b:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r26
        L_0x0014:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x001a
            r15 = r2
            goto L_0x001c
        L_0x001a:
            r15 = r35
        L_0x001c:
            r2 = r22
            r4 = r24
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r20 = r40
            r21 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.registration.Registration.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Registration(org.json.JSONObject r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "json"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            java.lang.String r1 = "signedString"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"signedString\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r4 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "deviceID"
            java.lang.String r5 = r0.getString(r1)
            java.lang.String r1 = "json.getString(\"deviceID\")"
            kotlin.jvm.internal.C41536l.m120488h(r5, r1)
            java.lang.String r1 = "device_Token"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"device_Token\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r6 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "sdk_Version"
            java.lang.String r7 = r0.getString(r1)
            java.lang.String r1 = "json.getString(\"sdk_Version\")"
            kotlin.jvm.internal.C41536l.m120488h(r7, r1)
            java.lang.String r1 = "app_Version"
            java.lang.String r8 = r0.getString(r1)
            java.lang.String r1 = "json.getString(\"app_Version\")"
            kotlin.jvm.internal.C41536l.m120488h(r8, r1)
            java.lang.String r1 = "dST"
            boolean r9 = r0.getBoolean(r1)
            java.lang.String r1 = "location_Enabled"
            boolean r10 = r0.getBoolean(r1)
            java.lang.String r1 = "proximity_Enabled"
            boolean r11 = r0.getBoolean(r1)
            java.lang.String r1 = "platform_Version"
            java.lang.String r12 = r0.getString(r1)
            java.lang.String r1 = "json.getString(\"platform_Version\")"
            kotlin.jvm.internal.C41536l.m120488h(r12, r1)
            java.lang.String r1 = "push_Enabled"
            boolean r13 = r0.getBoolean(r1)
            java.lang.String r1 = "timeZone"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "json.getString(\"timeZone\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            int r14 = java.lang.Integer.parseInt(r1)
            java.lang.String r1 = "subscriberKey"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"subscriberKey\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r15 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            java.lang.String r1 = "platform"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "json.getString(\"platform\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r2 = "hwid"
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "json.getString(\"hwid\")"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.lang.String r3 = "etAppId"
            java.lang.String r3 = r0.getString(r3)
            r17 = r2
            java.lang.String r2 = "json.getString(\"etAppId\")"
            kotlin.jvm.internal.C41536l.m120488h(r3, r2)
            java.lang.String r2 = "locale"
            java.lang.String r2 = r0.getString(r2)
            r18 = r3
            java.lang.String r3 = "json.getString(\"locale\")"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.lang.String r3 = "tags"
            org.json.JSONArray r3 = r0.getJSONArray(r3)
            r19 = r2
            java.lang.String r2 = "json.getJSONArray(\"tags\")"
            kotlin.jvm.internal.C41536l.m120488h(r3, r2)
            int r2 = r3.length()
            r22 = r1
            r1 = 0
            ze1.e r1 = ze1.C43429k.m124596o(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r23 = r15
            r15 = 10
            int r15 = ie1.C41343r.m119925u(r1, r15)
            r2.<init>(r15)
            java.util.Iterator r1 = r1.iterator()
        L_0x00e0:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L_0x019a
            r15 = r1
            ie1.k0 r15 = (ie1.C41330k0) r15
            int r15 = r15.nextInt()
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r21 = r1
            af1.c r1 = kotlin.jvm.internal.C41520a0.m120436b(r20)
            java.lang.Class<org.json.JSONObject> r24 = org.json.JSONObject.class
            r25 = r14
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r24)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r1, r14)
            r24 = r13
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.String"
            if (r14 == 0) goto L_0x0115
            org.json.JSONObject r1 = r3.getJSONObject(r15)
            if (r1 == 0) goto L_0x010f
            goto L_0x0188
        L_0x010f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r13)
            throw r0
        L_0x0115:
            java.lang.Class r14 = java.lang.Integer.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r1, r14)
            if (r14 == 0) goto L_0x012c
            int r1 = r3.getInt(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0129:
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0189
        L_0x012c:
            java.lang.Class r14 = java.lang.Double.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r1, r14)
            if (r14 == 0) goto L_0x0141
            double r13 = r3.getDouble(r15)
            java.lang.Double r1 = java.lang.Double.valueOf(r13)
            goto L_0x0129
        L_0x0141:
            java.lang.Class r14 = java.lang.Long.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r1, r14)
            if (r14 == 0) goto L_0x0156
            long r13 = r3.getLong(r15)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            goto L_0x0129
        L_0x0156:
            java.lang.Class r14 = java.lang.Boolean.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r1, r14)
            if (r14 == 0) goto L_0x016b
            boolean r1 = r3.getBoolean(r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0129
        L_0x016b:
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r20)
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r14)
            if (r1 == 0) goto L_0x0182
            java.lang.String r1 = r3.getString(r15)
            if (r1 == 0) goto L_0x017c
            goto L_0x0189
        L_0x017c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r13)
            throw r0
        L_0x0182:
            java.lang.Object r1 = r3.get(r15)
            if (r1 == 0) goto L_0x0194
        L_0x0188:
            goto L_0x0129
        L_0x0189:
            r2.add(r1)
            r1 = r21
            r13 = r24
            r14 = r25
            goto L_0x00e0
        L_0x0194:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r13)
            throw r0
        L_0x019a:
            r24 = r13
            r25 = r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01a7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01be
            java.lang.Object r3 = r2.next()
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x01a7
            r1.add(r3)
            goto L_0x01a7
        L_0x01be:
            java.util.Set r20 = ie1.C41358y.m119993D0(r1)
            java.lang.String r1 = "attributes"
            org.json.JSONArray r0 = r0.getJSONArray(r1)
            java.lang.String r1 = "json.getJSONArray(\"attributes\")"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            java.util.Map r21 = com.salesforce.marketingcloud.internal.C11516m.m42089b((org.json.JSONArray) r0)
            r0 = r17
            r1 = r19
            r2 = r26
            r3 = 0
            r13 = r24
            r14 = r25
            r15 = r23
            r16 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.registration.Registration.<init>(org.json.JSONObject):void");
    }
}
