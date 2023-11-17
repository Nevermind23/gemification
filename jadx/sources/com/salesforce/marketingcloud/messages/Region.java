package com.salesforce.marketingcloud.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

@MCKeep
public final class Region implements Parcelable, Comparable<Region> {
    public static final Parcelable.Creator<Region> CREATOR = new C11601c();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String MAGIC_REGION_ID = "~~m@g1c_f3nc3~~";
    public static final int REGION_TYPE_FENCE = 1;
    public static final int REGION_TYPE_PROXIMITY = 3;
    /* access modifiers changed from: private */
    public static final String TAG = C11461g.m41875a("Region");
    private final LatLon center;
    private final String description;

    /* renamed from: id */
    private final String f33663id;
    private boolean isInside;
    private final int major;
    private final List<Message> messages;
    private final int minor;
    private final String name;
    private final String proximityUuid;
    private final int radius;
    private final int regionType;

    @MCKeep
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: -TAG  reason: not valid java name */
        public final String m124906TAG() {
            return Region.TAG;
        }

        /* renamed from: -magicFence  reason: not valid java name */
        public final Region m124907magicFence(LatLon latLon, int i) {
            C41536l.m120489i(latLon, "center");
            return new Region(Region.MAGIC_REGION_ID, latLon, i, (String) null, 0, 0, -1, (String) null, (String) null, (List) null, 952, (DefaultConstructorMarker) null);
        }
    }

    @MCKeep
    @Retention(RetentionPolicy.SOURCE)
    public @interface RegionType {
    }

    /* renamed from: com.salesforce.marketingcloud.messages.Region$a */
    static final class C11599a extends C41537m implements C43064a {

        /* renamed from: a */
        public static final C11599a f33664a = new C11599a();

        C11599a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to parse Message from region payload.";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.Region$b */
    static final class C11600b extends C41537m implements C43064a {

        /* renamed from: a */
        public static final C11600b f33665a = new C11600b();

        C11600b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to parse region messages.";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.Region$c */
    public static final class C11601c implements Parcelable.Creator<Region> {
        /* renamed from: a */
        public final Region createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            LatLon createFromParcel = LatLon.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt5);
            for (int i = 0; i != readInt5; i++) {
                arrayList.add(Message.CREATOR.createFromParcel(parcel));
            }
            return new Region(readString, createFromParcel, readInt, readString2, readInt2, readInt3, readInt4, readString3, readString4, arrayList);
        }

        /* renamed from: a */
        public final Region[] newArray(int i) {
            return new Region[i];
        }
    }

    /* renamed from: -isInside$annotations  reason: not valid java name */
    public static /* synthetic */ void m124893isInside$annotations() {
    }

    public Region(String str, LatLon latLon, int i, String str2, int i2, int i3, int i4, String str3, String str4, List<Message> list) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(latLon, "center");
        C41536l.m120489i(list, C11769i.f34134e);
        this.f33663id = str;
        this.center = latLon;
        this.radius = i;
        this.proximityUuid = str2;
        this.major = i2;
        this.minor = i3;
        this.regionType = i4;
        this.name = str3;
        this.description = str4;
        this.messages = list;
    }

    public static /* synthetic */ Region copy$default(Region region, String str, LatLon latLon, int i, String str2, int i2, int i3, int i4, String str3, String str4, List list, int i5, Object obj) {
        Region region2 = region;
        int i6 = i5;
        return region.copy((i6 & 1) != 0 ? region2.f33663id : str, (i6 & 2) != 0 ? region2.center : latLon, (i6 & 4) != 0 ? region2.radius : i, (i6 & 8) != 0 ? region2.proximityUuid : str2, (i6 & 16) != 0 ? region2.major : i2, (i6 & 32) != 0 ? region2.minor : i3, (i6 & 64) != 0 ? region2.regionType : i4, (i6 & 128) != 0 ? region2.name : str3, (i6 & C11398b.f33139r) != 0 ? region2.description : str4, (i6 & C11398b.f33140s) != 0 ? region2.messages : list);
    }

    /* renamed from: -deprecated_center  reason: not valid java name */
    public final LatLon m124894deprecated_center() {
        return this.center;
    }

    /* renamed from: -deprecated_description  reason: not valid java name */
    public final String m124895deprecated_description() {
        return this.description;
    }

    /* renamed from: -deprecated_id  reason: not valid java name */
    public final String m124896deprecated_id() {
        return this.f33663id;
    }

    /* renamed from: -deprecated_major  reason: not valid java name */
    public final int m124897deprecated_major() {
        return this.major;
    }

    /* renamed from: -deprecated_messages  reason: not valid java name */
    public final List<Message> m124898deprecated_messages() {
        return this.messages;
    }

    /* renamed from: -deprecated_minor  reason: not valid java name */
    public final int m124899deprecated_minor() {
        return this.minor;
    }

    /* renamed from: -deprecated_name  reason: not valid java name */
    public final String m124900deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_proximityUuid  reason: not valid java name */
    public final String m124901deprecated_proximityUuid() {
        return this.proximityUuid;
    }

    /* renamed from: -deprecated_radius  reason: not valid java name */
    public final int m124902deprecated_radius() {
        return this.radius;
    }

    /* renamed from: -deprecated_regionType  reason: not valid java name */
    public final int m124903deprecated_regionType() {
        return this.regionType;
    }

    /* renamed from: -isInside  reason: not valid java name */
    public final void m124904isInside(boolean z) {
        this.isInside = z;
    }

    public final LatLon center() {
        return this.center;
    }

    public int compareTo(Region region) {
        C41536l.m120489i(region, "other");
        return this.f33663id.compareTo(region.f33663id);
    }

    public final String component1() {
        return this.f33663id;
    }

    public final List<Message> component10() {
        return this.messages;
    }

    public final LatLon component2() {
        return this.center;
    }

    public final int component3() {
        return this.radius;
    }

    public final String component4() {
        return this.proximityUuid;
    }

    public final int component5() {
        return this.major;
    }

    public final int component6() {
        return this.minor;
    }

    public final int component7() {
        return this.regionType;
    }

    public final String component8() {
        return this.name;
    }

    public final String component9() {
        return this.description;
    }

    public final Region copy(String str, LatLon latLon, int i, String str2, int i2, int i3, int i4, String str3, String str4, List<Message> list) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(latLon, "center");
        List<Message> list2 = list;
        C41536l.m120489i(list2, C11769i.f34134e);
        return new Region(str, latLon, i, str2, i2, i3, i4, str3, str4, list2);
    }

    public int describeContents() {
        return 0;
    }

    public final String description() {
        return this.description;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Region)) {
            return false;
        }
        Region region = (Region) obj;
        return C41536l.m120484d(this.f33663id, region.f33663id) && C41536l.m120484d(this.center, region.center) && this.radius == region.radius && C41536l.m120484d(this.proximityUuid, region.proximityUuid) && this.major == region.major && this.minor == region.minor && this.regionType == region.regionType && C41536l.m120484d(this.name, region.name) && C41536l.m120484d(this.description, region.description) && C41536l.m120484d(this.messages, region.messages);
    }

    public int hashCode() {
        int hashCode = ((((this.f33663id.hashCode() * 31) + this.center.hashCode()) * 31) + this.radius) * 31;
        String str = this.proximityUuid;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.major) * 31) + this.minor) * 31) + this.regionType) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.messages.hashCode();
    }

    /* renamed from: id */
    public final String mo30395id() {
        return this.f33663id;
    }

    public final int major() {
        return this.major;
    }

    public final List<Message> messages() {
        return this.messages;
    }

    public final int minor() {
        return this.minor;
    }

    public final String name() {
        return this.name;
    }

    public final String proximityUuid() {
        return this.proximityUuid;
    }

    public final int radius() {
        return this.radius;
    }

    public final int regionType() {
        return this.regionType;
    }

    public String toString() {
        return "Region(id=" + this.f33663id + ", center=" + this.center + ", radius=" + this.radius + ", proximityUuid=" + this.proximityUuid + ", major=" + this.major + ", minor=" + this.minor + ", regionType=" + this.regionType + ", name=" + this.name + ", description=" + this.description + ", messages=" + this.messages + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f33663id);
        this.center.writeToParcel(parcel, i);
        parcel.writeInt(this.radius);
        parcel.writeString(this.proximityUuid);
        parcel.writeInt(this.major);
        parcel.writeInt(this.minor);
        parcel.writeInt(this.regionType);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        List<Message> list = this.messages;
        parcel.writeInt(list.size());
        for (Message writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Region(java.lang.String r15, com.salesforce.marketingcloud.location.LatLon r16, int r17, java.lang.String r18, int r19, int r20, int r21, java.lang.String r22, java.lang.String r23, java.util.List r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r18
        L_0x000b:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r8 = r3
            goto L_0x0014
        L_0x0012:
            r8 = r19
        L_0x0014:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001a
            r9 = r3
            goto L_0x001c
        L_0x001a:
            r9 = r20
        L_0x001c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0022
            r11 = r2
            goto L_0x0024
        L_0x0022:
            r11 = r22
        L_0x0024:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002a
            r12 = r2
            goto L_0x002c
        L_0x002a:
            r12 = r23
        L_0x002c:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0036
            java.util.List r0 = ie1.C41341q.m119907j()
            r13 = r0
            goto L_0x0038
        L_0x0036:
            r13 = r24
        L_0x0038:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r10 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.Region.<init>(java.lang.String, com.salesforce.marketingcloud.location.LatLon, int, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: -isInside  reason: not valid java name */
    public final boolean m124905isInside() {
        return this.isInside;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Region(org.json.JSONObject r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            java.lang.String r2 = "json"
            kotlin.jvm.internal.C41536l.m120489i(r0, r2)
            java.lang.String r2 = "id"
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = "json.getString(\"id\")"
            kotlin.jvm.internal.C41536l.m120488h(r4, r2)
            com.salesforce.marketingcloud.location.LatLon r5 = new com.salesforce.marketingcloud.location.LatLon
            java.lang.String r2 = "center"
            org.json.JSONObject r2 = r0.getJSONObject(r2)
            java.lang.String r3 = "json.getJSONObject(\"center\")"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            r5.<init>(r2)
            java.lang.String r2 = "radius"
            int r6 = r0.optInt(r2)
            java.lang.String r2 = "proximityUuid"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r3 = "json.optString(\"proximityUuid\")"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.lang.String r7 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r2)
            java.lang.String r2 = "major"
            int r8 = r0.optInt(r2)
            java.lang.String r2 = "minor"
            int r9 = r0.optInt(r2)
            java.lang.String r2 = "locationType"
            int r10 = r0.getInt(r2)
            java.lang.String r2 = "name"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r3 = "json.optString(\"name\")"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.lang.String r11 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r2)
            java.lang.String r2 = "description"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r3 = "json.optString(\"description\")"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.lang.String r12 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r2)
            java.lang.String r2 = "messages"
            org.json.JSONArray r0 = r0.optJSONArray(r2)     // Catch:{ JSONException -> 0x0193 }
            if (r0 != 0) goto L_0x0074
            r2 = 0
            goto L_0x018a
        L_0x0074:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x0193 }
            r13 = 0
            ze1.e r3 = ze1.C43429k.m124596o(r13, r3)     // Catch:{ JSONException -> 0x0193 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0193 }
            r14 = 10
            int r14 = ie1.C41343r.m119925u(r3, r14)     // Catch:{ JSONException -> 0x0193 }
            r13.<init>(r14)     // Catch:{ JSONException -> 0x0193 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ JSONException -> 0x0193 }
        L_0x008c:
            boolean r14 = r3.hasNext()     // Catch:{ JSONException -> 0x0193 }
            if (r14 == 0) goto L_0x013e
            r14 = r3
            ie1.k0 r14 = (ie1.C41330k0) r14     // Catch:{ JSONException -> 0x0193 }
            int r14 = r14.nextInt()     // Catch:{ JSONException -> 0x0193 }
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ JSONException -> 0x0193 }
            af1.c r2 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ JSONException -> 0x0193 }
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r15, r2)     // Catch:{ JSONException -> 0x0193 }
            r16 = r1
            java.lang.String r1 = "null cannot be cast to non-null type org.json.JSONObject"
            if (r2 == 0) goto L_0x00b9
            org.json.JSONObject r2 = r0.getJSONObject(r14)     // Catch:{ JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x00b3
            goto L_0x0131
        L_0x00b3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ JSONException -> 0x0193 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0193 }
            throw r0     // Catch:{ JSONException -> 0x0193 }
        L_0x00b9:
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ JSONException -> 0x0193 }
            af1.c r2 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ JSONException -> 0x0193 }
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r15, r2)     // Catch:{ JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x00d1
            int r1 = r0.getInt(r14)     // Catch:{ JSONException -> 0x0193 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0193 }
        L_0x00cd:
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0193 }
            r2 = r1
            goto L_0x0131
        L_0x00d1:
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ JSONException -> 0x0193 }
            af1.c r2 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ JSONException -> 0x0193 }
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r15, r2)     // Catch:{ JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x00e6
            double r1 = r0.getDouble(r14)     // Catch:{ JSONException -> 0x0193 }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ JSONException -> 0x0193 }
            goto L_0x00cd
        L_0x00e6:
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ JSONException -> 0x0193 }
            af1.c r2 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ JSONException -> 0x0193 }
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r15, r2)     // Catch:{ JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x00fb
            long r1 = r0.getLong(r14)     // Catch:{ JSONException -> 0x0193 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ JSONException -> 0x0193 }
            goto L_0x00cd
        L_0x00fb:
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ JSONException -> 0x0193 }
            af1.c r2 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ JSONException -> 0x0193 }
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r15, r2)     // Catch:{ JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x0110
            boolean r1 = r0.getBoolean(r14)     // Catch:{ JSONException -> 0x0193 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ JSONException -> 0x0193 }
            goto L_0x00cd
        L_0x0110:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            af1.c r2 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ JSONException -> 0x0193 }
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r15, r2)     // Catch:{ JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x0129
            java.lang.String r2 = r0.getString(r14)     // Catch:{ JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x0123
            goto L_0x012f
        L_0x0123:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ JSONException -> 0x0193 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0193 }
            throw r0     // Catch:{ JSONException -> 0x0193 }
        L_0x0129:
            java.lang.Object r2 = r0.get(r14)     // Catch:{ JSONException -> 0x0193 }
            if (r2 == 0) goto L_0x0138
        L_0x012f:
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ JSONException -> 0x0193 }
        L_0x0131:
            r13.add(r2)     // Catch:{ JSONException -> 0x0193 }
            r1 = r16
            goto L_0x008c
        L_0x0138:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ JSONException -> 0x0193 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0193 }
            throw r0     // Catch:{ JSONException -> 0x0193 }
        L_0x013e:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0193 }
            r1.<init>()     // Catch:{ JSONException -> 0x0193 }
            java.util.Iterator r2 = r13.iterator()     // Catch:{ JSONException -> 0x0193 }
        L_0x0147:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x0193 }
            if (r0 == 0) goto L_0x016a
            java.lang.Object r0 = r2.next()     // Catch:{ JSONException -> 0x0193 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0193 }
            com.salesforce.marketingcloud.messages.Message r3 = new com.salesforce.marketingcloud.messages.Message     // Catch:{ Exception -> 0x0159 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0164
        L_0x0159:
            r0 = move-exception
            com.salesforce.marketingcloud.g r3 = com.salesforce.marketingcloud.C11461g.f33306a     // Catch:{ JSONException -> 0x0193 }
            java.lang.String r13 = TAG     // Catch:{ JSONException -> 0x0193 }
            com.salesforce.marketingcloud.messages.Region$a r14 = com.salesforce.marketingcloud.messages.Region.C11599a.f33664a     // Catch:{ JSONException -> 0x0193 }
            r3.mo29962b((java.lang.String) r13, (java.lang.Throwable) r0, (ue1.C43064a) r14)     // Catch:{ JSONException -> 0x0193 }
            r3 = 0
        L_0x0164:
            if (r3 == 0) goto L_0x0147
            r1.add(r3)     // Catch:{ JSONException -> 0x0193 }
            goto L_0x0147
        L_0x016a:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0193 }
            r2.<init>()     // Catch:{ JSONException -> 0x0193 }
            java.util.Iterator r0 = r1.iterator()     // Catch:{ JSONException -> 0x0193 }
        L_0x0173:
            boolean r1 = r0.hasNext()     // Catch:{ JSONException -> 0x0193 }
            if (r1 == 0) goto L_0x018a
            java.lang.Object r1 = r0.next()     // Catch:{ JSONException -> 0x0193 }
            r3 = r1
            com.salesforce.marketingcloud.messages.Message r3 = (com.salesforce.marketingcloud.messages.Message) r3     // Catch:{ JSONException -> 0x0193 }
            boolean r3 = com.salesforce.marketingcloud.messages.C11604b.m42349a(r3)     // Catch:{ JSONException -> 0x0193 }
            if (r3 == 0) goto L_0x0173
            r2.add(r1)     // Catch:{ JSONException -> 0x0193 }
            goto L_0x0173
        L_0x018a:
            if (r2 != 0) goto L_0x0191
            java.util.List r0 = ie1.C41341q.m119907j()     // Catch:{ JSONException -> 0x0193 }
            goto L_0x01a1
        L_0x0191:
            r13 = r2
            goto L_0x01a2
        L_0x0193:
            r0 = move-exception
            com.salesforce.marketingcloud.g r1 = com.salesforce.marketingcloud.C11461g.f33306a
            java.lang.String r2 = TAG
            com.salesforce.marketingcloud.messages.Region$b r3 = com.salesforce.marketingcloud.messages.Region.C11600b.f33665a
            r1.mo29962b((java.lang.String) r2, (java.lang.Throwable) r0, (ue1.C43064a) r3)
            java.util.List r0 = ie1.C41341q.m119907j()
        L_0x01a1:
            r13 = r0
        L_0x01a2:
            r3 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.Region.<init>(org.json.JSONObject):void");
    }
}
