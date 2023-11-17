package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.internal.C11516m;
import he1.C41238w;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.events.h */
public final class C11440h {

    /* renamed from: a */
    private final String f33284a;

    /* renamed from: b */
    private final String f33285b;

    /* renamed from: c */
    private final Date f33286c;

    /* renamed from: d */
    private final List<C11437g> f33287d;

    /* renamed from: e */
    private final List<C11435e> f33288e;

    /* renamed from: f */
    private String f33289f;

    public C11440h(String str, String str2, Date date, List<C11437g> list, List<C11435e> list2, String str3) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "key");
        C41536l.m120489i(list2, "outcomes");
        this.f33284a = str;
        this.f33285b = str2;
        this.f33286c = date;
        this.f33287d = list;
        this.f33288e = list2;
        this.f33289f = str3;
    }

    /* renamed from: a */
    public static /* synthetic */ C11440h m41822a(C11440h hVar, String str, String str2, Date date, List<C11437g> list, List<C11435e> list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.f33284a;
        }
        if ((i & 2) != 0) {
            str2 = hVar.f33285b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            date = hVar.f33286c;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            list = hVar.f33287d;
        }
        List<C11437g> list3 = list;
        if ((i & 16) != 0) {
            list2 = hVar.f33288e;
        }
        List<C11435e> list4 = list2;
        if ((i & 32) != 0) {
            str3 = hVar.f33289f;
        }
        return hVar.mo29926a(str, str4, date2, list3, list4, str3);
    }

    /* renamed from: b */
    public final String mo29929b() {
        return this.f33285b;
    }

    /* renamed from: c */
    public final Date mo29930c() {
        return this.f33286c;
    }

    /* renamed from: d */
    public final List<C11437g> mo29931d() {
        return this.f33287d;
    }

    /* renamed from: e */
    public final List<C11435e> mo29932e() {
        return this.f33288e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11440h)) {
            return false;
        }
        C11440h hVar = (C11440h) obj;
        return C41536l.m120484d(this.f33284a, hVar.f33284a) && C41536l.m120484d(this.f33285b, hVar.f33285b) && C41536l.m120484d(this.f33286c, hVar.f33286c) && C41536l.m120484d(this.f33287d, hVar.f33287d) && C41536l.m120484d(this.f33288e, hVar.f33288e) && C41536l.m120484d(this.f33289f, hVar.f33289f);
    }

    /* renamed from: f */
    public final String mo29934f() {
        return this.f33289f;
    }

    /* renamed from: g */
    public final String mo29935g() {
        return this.f33289f;
    }

    /* renamed from: h */
    public final String mo29936h() {
        return this.f33284a;
    }

    public int hashCode() {
        int hashCode = ((this.f33284a.hashCode() * 31) + this.f33285b.hashCode()) * 31;
        Date date = this.f33286c;
        int i = 0;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        List<C11437g> list = this.f33287d;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f33288e.hashCode()) * 31;
        String str = this.f33289f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final String mo29938i() {
        return this.f33285b;
    }

    /* renamed from: j */
    public final List<C11435e> mo29939j() {
        return this.f33288e;
    }

    /* renamed from: k */
    public final List<C11437g> mo29940k() {
        return this.f33287d;
    }

    /* renamed from: l */
    public final Date mo29941l() {
        return this.f33286c;
    }

    /* renamed from: m */
    public final JSONObject mo29942m() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", mo29936h());
        jSONObject.put("key", mo29938i());
        if (mo29941l() != null) {
            jSONObject.put("startDateUtc", C11516m.m42082a(mo29941l()));
        }
        List<C11437g> k = mo29940k();
        if (k != null) {
            JSONArray jSONArray = new JSONArray();
            for (C11437g k2 : k) {
                jSONArray.put(k2.mo29924k());
            }
            C41238w wVar = C41238w.f97225a;
            jSONObject.put("rules", jSONArray);
        }
        JSONArray jSONArray2 = new JSONArray();
        for (C11435e g : mo29939j()) {
            jSONArray2.put(g.mo29907g());
        }
        C41238w wVar2 = C41238w.f97225a;
        jSONObject.put("outcomes", jSONArray2);
        String g2 = mo29935g();
        if (g2 != null) {
            jSONObject.put("evalLogic", g2);
        }
        return jSONObject;
    }

    public String toString() {
        return "Trigger(id=" + this.f33284a + ", key=" + this.f33285b + ", startDateUtc=" + this.f33286c + ", rules=" + this.f33287d + ", outcomes=" + this.f33288e + ", evalLogic=" + this.f33289f + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11440h(String str, String str2, Date date, List list, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : list, list2, (i & 32) != 0 ? null : str3);
    }

    /* renamed from: a */
    public final C11440h mo29926a(String str, String str2, Date date, List<C11437g> list, List<C11435e> list2, String str3) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "key");
        C41536l.m120489i(list2, "outcomes");
        return new C11440h(str, str2, date, list, list2, str3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11440h(org.json.JSONObject r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "json"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            java.lang.String r1 = "id"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "json.getString(\"id\")"
            kotlin.jvm.internal.C41536l.m120488h(r3, r1)
            java.lang.String r1 = "key"
            java.lang.String r4 = r0.getString(r1)
            java.lang.String r1 = "json.getString(\"key\")"
            kotlin.jvm.internal.C41536l.m120488h(r4, r1)
            java.lang.String r1 = "startDateUtc"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "json.optString(\"startDateUtc\")"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r1 = com.salesforce.marketingcloud.internal.C11516m.m42087b((java.lang.String) r1)
            r2 = 0
            if (r1 != 0) goto L_0x0031
            r5 = r2
            goto L_0x0036
        L_0x0031:
            java.util.Date r1 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r1)
            r5 = r1
        L_0x0036:
            java.lang.String r1 = "rules"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 10
            r8 = 0
            java.lang.Class<org.json.JSONObject> r9 = org.json.JSONObject.class
            java.lang.String r10 = "null cannot be cast to non-null type org.json.JSONObject"
            if (r1 != 0) goto L_0x004a
            r1 = r2
            goto L_0x0129
        L_0x004a:
            int r11 = r1.length()
            ze1.e r11 = ze1.C43429k.m124596o(r8, r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = ie1.C41343r.m119925u(r11, r7)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L_0x005f:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0107
            r13 = r11
            ie1.k0 r13 = (ie1.C41330k0) r13
            int r13 = r13.nextInt()
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r9)
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r9)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x0088
            org.json.JSONObject r13 = r1.getJSONObject(r13)
            if (r13 == 0) goto L_0x0082
            goto L_0x00fc
        L_0x0082:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r10)
            throw r0
        L_0x0088:
            java.lang.Class r15 = java.lang.Integer.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x009f
            int r13 = r1.getInt(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
        L_0x009c:
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            goto L_0x00fc
        L_0x009f:
            java.lang.Class r15 = java.lang.Double.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x00b4
            double r13 = r1.getDouble(r13)
            java.lang.Double r13 = java.lang.Double.valueOf(r13)
            goto L_0x009c
        L_0x00b4:
            java.lang.Class r15 = java.lang.Long.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x00c9
            long r13 = r1.getLong(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L_0x009c
        L_0x00c9:
            java.lang.Class r15 = java.lang.Boolean.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x00de
            boolean r13 = r1.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            goto L_0x009c
        L_0x00de:
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r14 == 0) goto L_0x00f5
            java.lang.String r13 = r1.getString(r13)
            if (r13 == 0) goto L_0x00ef
            goto L_0x00fb
        L_0x00ef:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r10)
            throw r0
        L_0x00f5:
            java.lang.Object r13 = r1.get(r13)
            if (r13 == 0) goto L_0x0101
        L_0x00fb:
            goto L_0x009c
        L_0x00fc:
            r12.add(r13)
            goto L_0x005f
        L_0x0101:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r10)
            throw r0
        L_0x0107:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r12.iterator()
        L_0x0110:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0129
            java.lang.Object r12 = r11.next()
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            com.salesforce.marketingcloud.events.g r13 = new com.salesforce.marketingcloud.events.g     // Catch:{ Exception -> 0x0122 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x0122 }
            goto L_0x0123
        L_0x0122:
            r13 = r2
        L_0x0123:
            if (r13 == 0) goto L_0x0110
            r1.add(r13)
            goto L_0x0110
        L_0x0129:
            java.lang.String r11 = "outcomes"
            org.json.JSONArray r11 = r0.getJSONArray(r11)
            java.lang.String r12 = "json.getJSONArray(\"outcomes\")"
            kotlin.jvm.internal.C41536l.m120488h(r11, r12)
            int r12 = r11.length()
            ze1.e r12 = ze1.C43429k.m124596o(r8, r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r7 = ie1.C41343r.m119925u(r12, r7)
            r13.<init>(r7)
            java.util.Iterator r7 = r12.iterator()
        L_0x0149:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x01f1
            r12 = r7
            ie1.k0 r12 = (ie1.C41330k0) r12
            int r12 = r12.nextInt()
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r9)
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r9)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x0172
            org.json.JSONObject r12 = r11.getJSONObject(r12)
            if (r12 == 0) goto L_0x016c
            goto L_0x01e6
        L_0x016c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r10)
            throw r0
        L_0x0172:
            java.lang.Class r15 = java.lang.Integer.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x0189
            int r12 = r11.getInt(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
        L_0x0186:
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            goto L_0x01e6
        L_0x0189:
            java.lang.Class r15 = java.lang.Double.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x019e
            double r14 = r11.getDouble(r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r14)
            goto L_0x0186
        L_0x019e:
            java.lang.Class r15 = java.lang.Long.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x01b3
            long r14 = r11.getLong(r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            goto L_0x0186
        L_0x01b3:
            java.lang.Class r15 = java.lang.Boolean.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x01c8
            boolean r12 = r11.getBoolean(r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            goto L_0x0186
        L_0x01c8:
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r14 == 0) goto L_0x01df
            java.lang.String r12 = r11.getString(r12)
            if (r12 == 0) goto L_0x01d9
            goto L_0x01e5
        L_0x01d9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r10)
            throw r0
        L_0x01df:
            java.lang.Object r12 = r11.get(r12)
            if (r12 == 0) goto L_0x01eb
        L_0x01e5:
            goto L_0x0186
        L_0x01e6:
            r13.add(r12)
            goto L_0x0149
        L_0x01eb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r10)
            throw r0
        L_0x01f1:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r13.iterator()
        L_0x01fa:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0213
            java.lang.Object r9 = r6.next()
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            com.salesforce.marketingcloud.events.e r10 = new com.salesforce.marketingcloud.events.e     // Catch:{ Exception -> 0x020c }
            r10.<init>(r9)     // Catch:{ Exception -> 0x020c }
            goto L_0x020d
        L_0x020c:
            r10 = r2
        L_0x020d:
            if (r10 == 0) goto L_0x01fa
            r7.add(r10)
            goto L_0x01fa
        L_0x0213:
            java.lang.String r6 = "evalLogic"
            java.lang.String r0 = com.salesforce.marketingcloud.extensions.C11458a.m41872a(r0, r6)
            if (r0 != 0) goto L_0x021e
            r8 = r2
            goto L_0x02ab
        L_0x021e:
            java.lang.String r2 = "&&"
            java.lang.String[] r10 = new java.lang.String[]{r2}
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r0
            java.util.List r2 = cf1.C40440x.m117182x0(r9, r10, r11, r12, r13, r14)
            java.lang.String r6 = "||"
            java.lang.String[] r10 = new java.lang.String[]{r6}
            java.util.List r6 = cf1.C40440x.m117182x0(r9, r10, r11, r12, r13, r14)
            boolean r9 = cf1.C40439w.m117118v(r0)
            if (r9 != 0) goto L_0x02ba
            int r9 = r2.size()
            r10 = 1
            if (r9 <= r10) goto L_0x024a
            int r9 = r6.size()
            if (r9 > r10) goto L_0x02ba
        L_0x024a:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r11 = r2.size()
            if (r11 <= r10) goto L_0x0259
            r9.addAll(r2)
            goto L_0x025c
        L_0x0259:
            r9.addAll(r6)
        L_0x025c:
            he1.w r2 = he1.C41238w.f97225a
            java.util.Iterator r2 = r9.iterator()
        L_0x0262:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x029c
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0294
            java.lang.CharSequence r6 = cf1.C40440x.m117146P0(r6)
            java.lang.String r6 = r6.toString()
            boolean r9 = cf1.C40439w.m117118v(r6)
            if (r9 != 0) goto L_0x0292
            java.lang.Long r9 = cf1.C40438v.m117100l(r6)
            if (r9 == 0) goto L_0x0292
            long r11 = java.lang.Long.parseLong(r6)
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x028f
            goto L_0x0292
        L_0x028f:
            he1.w r6 = he1.C41238w.f97225a
            goto L_0x0262
        L_0x0292:
            r10 = r8
            goto L_0x0262
        L_0x0294:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x029c:
            if (r10 == 0) goto L_0x02b2
            java.lang.String r10 = " "
            java.lang.String r11 = ""
            r12 = 0
            r13 = 4
            r14 = 0
            r9 = r0
            java.lang.String r0 = cf1.C40439w.m117103B(r9, r10, r11, r12, r13, r14)
            r8 = r0
        L_0x02ab:
            r2 = r16
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L_0x02b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "evalLogic contained non-numeric indexes."
            r0.<init>(r1)
            throw r0
        L_0x02ba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "evalLogic was blank or contained both && and || operators"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.C11440h.<init>(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final String mo29927a() {
        return this.f33284a;
    }

    /* renamed from: a */
    public final void mo29928a(String str) {
        this.f33289f = str;
    }
}
