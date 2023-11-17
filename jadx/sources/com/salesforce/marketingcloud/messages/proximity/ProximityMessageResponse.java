package com.salesforce.marketingcloud.messages.proximity;

import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.MessageResponse;
import com.salesforce.marketingcloud.messages.Region;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

@MCKeep
public final class ProximityMessageResponse implements MessageResponse {
    private final List<Region> beacons;
    private final LatLon refreshCenter;
    private final int refreshRadius;

    /* renamed from: com.salesforce.marketingcloud.messages.proximity.ProximityMessageResponse$a */
    static final class C11682a extends C41537m implements C43064a {

        /* renamed from: a */
        public static final C11682a f33856a = new C11682a();

        C11682a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to parse Region from proximity message payload.";
        }
    }

    public ProximityMessageResponse(LatLon latLon, int i, List<Region> list) {
        C41536l.m120489i(latLon, "refreshCenter");
        C41536l.m120489i(list, "beacons");
        this.refreshCenter = latLon;
        this.refreshRadius = i;
        this.beacons = list;
    }

    /* renamed from: -deprecated_beacons  reason: not valid java name */
    public final List<Region> m124981deprecated_beacons() {
        return this.beacons;
    }

    /* renamed from: -deprecated_refreshCenter  reason: not valid java name */
    public final LatLon m124982deprecated_refreshCenter() {
        return getRefreshCenter();
    }

    /* renamed from: -deprecated_refreshRadius  reason: not valid java name */
    public final int m124983deprecated_refreshRadius() {
        return getRefreshRadius();
    }

    public final List<Region> beacons() {
        return this.beacons;
    }

    /* renamed from: refreshCenter */
    public LatLon getRefreshCenter() {
        return this.refreshCenter;
    }

    /* renamed from: refreshRadius */
    public int getRefreshRadius() {
        return this.refreshRadius;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProximityMessageResponse(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            com.salesforce.marketingcloud.location.LatLon r0 = com.salesforce.marketingcloud.messages.C11603a.m42345a(r10)
            int r1 = com.salesforce.marketingcloud.messages.C11603a.m42346b(r10)
            java.lang.String r2 = "beacons"
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            r2 = 0
            if (r10 != 0) goto L_0x0018
            goto L_0x010f
        L_0x0018:
            int r3 = r10.length()
            r4 = 0
            ze1.e r3 = ze1.C43429k.m124596o(r4, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = ie1.C41343r.m119925u(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0030:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00de
            r5 = r3
            ie1.k0 r5 = (ie1.C41330k0) r5
            int r5 = r5.nextInt()
            java.lang.Class<org.json.JSONObject> r6 = org.json.JSONObject.class
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r7, r6)
            java.lang.String r8 = "null cannot be cast to non-null type org.json.JSONObject"
            if (r6 == 0) goto L_0x005d
            org.json.JSONObject r5 = r10.getJSONObject(r5)
            if (r5 == 0) goto L_0x0057
            goto L_0x00d3
        L_0x0057:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r8)
            throw r10
        L_0x005d:
            java.lang.Class r6 = java.lang.Integer.TYPE
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r7, r6)
            if (r6 == 0) goto L_0x0074
            int r5 = r10.getInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x0071:
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            goto L_0x00d3
        L_0x0074:
            java.lang.Class r6 = java.lang.Double.TYPE
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r7, r6)
            if (r6 == 0) goto L_0x0089
            double r5 = r10.getDouble(r5)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            goto L_0x0071
        L_0x0089:
            java.lang.Class r6 = java.lang.Long.TYPE
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r7, r6)
            if (r6 == 0) goto L_0x009e
            long r5 = r10.getLong(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0071
        L_0x009e:
            java.lang.Class r6 = java.lang.Boolean.TYPE
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r7, r6)
            if (r6 == 0) goto L_0x00b3
            boolean r5 = r10.getBoolean(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x0071
        L_0x00b3:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r7, r6)
            if (r6 == 0) goto L_0x00cc
            java.lang.String r5 = r10.getString(r5)
            if (r5 == 0) goto L_0x00c6
            goto L_0x00d2
        L_0x00c6:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r8)
            throw r10
        L_0x00cc:
            java.lang.Object r5 = r10.get(r5)
            if (r5 == 0) goto L_0x00d8
        L_0x00d2:
            goto L_0x0071
        L_0x00d3:
            r4.add(r5)
            goto L_0x0030
        L_0x00d8:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r8)
            throw r10
        L_0x00de:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r4.iterator()
        L_0x00e7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x010e
            java.lang.Object r4 = r3.next()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            com.salesforce.marketingcloud.messages.Region r5 = new com.salesforce.marketingcloud.messages.Region     // Catch:{ Exception -> 0x00f9 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0108
        L_0x00f9:
            r4 = move-exception
            com.salesforce.marketingcloud.g r5 = com.salesforce.marketingcloud.C11461g.f33306a
            com.salesforce.marketingcloud.messages.Region$Companion r6 = com.salesforce.marketingcloud.messages.Region.Companion
            java.lang.String r6 = r6.m124906TAG()
            com.salesforce.marketingcloud.messages.proximity.ProximityMessageResponse$a r7 = com.salesforce.marketingcloud.messages.proximity.ProximityMessageResponse.C11682a.f33856a
            r5.mo29962b((java.lang.String) r6, (java.lang.Throwable) r4, (ue1.C43064a) r7)
            r5 = r2
        L_0x0108:
            if (r5 == 0) goto L_0x00e7
            r10.add(r5)
            goto L_0x00e7
        L_0x010e:
            r2 = r10
        L_0x010f:
            if (r2 != 0) goto L_0x0115
            java.util.List r2 = ie1.C41341q.m119907j()
        L_0x0115:
            r9.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.proximity.ProximityMessageResponse.<init>(org.json.JSONObject):void");
    }
}
