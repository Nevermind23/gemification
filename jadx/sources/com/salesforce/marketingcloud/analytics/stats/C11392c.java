package com.salesforce.marketingcloud.analytics.stats;

import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.C11344c;
import com.salesforce.marketingcloud.analytics.C11346e;
import com.salesforce.marketingcloud.analytics.C11363i;
import com.salesforce.marketingcloud.analytics.C11366l;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11493a;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.C11754d;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.stats.c */
public class C11392c extends C11363i implements C11481c.C11484c, C11327b.C11329b {

    /* renamed from: k */
    static final String f33113k = C11461g.m41875a("DeviceStats");

    /* renamed from: l */
    private static final int f33114l = 1000;

    /* renamed from: m */
    private static final int f33115m = 1;

    /* renamed from: d */
    final String f33116d;

    /* renamed from: e */
    final C11800j f33117e;

    /* renamed from: f */
    final C11481c f33118f;

    /* renamed from: g */
    final MarketingCloudConfig f33119g;

    /* renamed from: h */
    final C11327b f33120h;

    /* renamed from: i */
    protected final C11513l f33121i;

    /* renamed from: j */
    public final boolean f33122j;

    /* renamed from: com.salesforce.marketingcloud.analytics.stats.c$a */
    class C11393a extends C11505g {
        C11393a(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11754d n = C11392c.this.f33117e.mo31617n();
            C11808c b = C11392c.this.f33117e.mo31604b();
            List<C11391b> m = n.mo31518m(b);
            if (!m.isEmpty()) {
                Date date = new Date();
                for (C11391b next : m) {
                    next.mo29833a(date);
                    try {
                        n.mo31514a(next, b);
                    } catch (Exception e) {
                        C11461g.m41885b(C11392c.f33113k, e, "Unable to update sync event analytic [%s]", Integer.valueOf(next.mo29837d()));
                    }
                }
            }
            C11461g.m41888c(C11392c.f33113k, "Handling app close and sending stats.", new Object[0]);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.stats.c$b */
    class C11394b extends C11505g {

        /* renamed from: b */
        final /* synthetic */ Event[] f33124b;

        /* renamed from: c */
        final /* synthetic */ Date f33125c;

        /* renamed from: d */
        final /* synthetic */ C11346e f33126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11394b(String str, Object[] objArr, Event[] eventArr, Date date, C11346e eVar) {
            super(str, objArr);
            this.f33124b = eventArr;
            this.f33125c = date;
            this.f33126d = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            for (Event event : this.f33124b) {
                try {
                    C11461g.m41888c(C11392c.f33113k, "Event tracked %s( %s ) with Attributes: %s", event.getClass().getSimpleName(), event.name(), event.attributes());
                    C11392c.this.f33121i.mo30089b().execute(new C11390a(C11392c.this.f33117e.mo31617n(), C11392c.this.f33117e.mo31604b(), C11391b.m41655a(105, this.f33125c, C11396d.m41689a(C11392c.this.f33119g.applicationId(), C11392c.this.f33116d, this.f33125c, event.name(), event.f34060id, event.toJson().getJSONObject(C11772k.C11773a.f34176h), this.f33126d.mo29777e()), true)));
                } catch (Exception e) {
                    C11461g.m41884b(C11392c.f33113k, "Failed to record event in devstats", e);
                }
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.stats.c$c */
    class C11395c extends C11505g {
        C11395c(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            List<C11391b> f = C11392c.this.f33117e.mo31617n().mo31517f(C11392c.this.f33117e.mo31604b());
            if (!f.isEmpty()) {
                C11461g.m41888c(C11392c.f33113k, "Preparing payload for device statistics.", new Object[0]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("applicationId", C11392c.this.f33119g.applicationId());
                    jSONObject.put("deviceId", C11392c.this.f33116d);
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONArray.put(jSONObject2);
                    jSONObject.put("nodes", jSONArray);
                    jSONObject2.put("version", 1);
                    jSONObject2.put("name", "event");
                    for (Map.Entry next : C11392c.this.mo29839a(f).entrySet()) {
                        jSONObject2.put("items", next.getValue());
                        C11474a aVar = C11474a.DEVICE_STATS;
                        C11392c cVar = C11392c.this;
                        C11476b a = aVar.mo29978a(cVar.f33119g, cVar.f33117e.mo31606c(), jSONObject.toString());
                        a.mo29986a((String) next.getKey());
                        C11392c.this.f33118f.mo30022a(a);
                    }
                } catch (Exception e) {
                    C11461g.m41885b(C11392c.f33113k, e, "Failed to start sync events request.", new Object[0]);
                }
            } else {
                C11392c.this.f33120h.mo29680d(C11307a.C11309b.DEVICE_STATS);
            }
        }
    }

    public C11392c(MarketingCloudConfig marketingCloudConfig, String str, boolean z, C11800j jVar, C11481c cVar, C11327b bVar, C11513l lVar) {
        this.f33119g = marketingCloudConfig;
        this.f33116d = str;
        this.f33122j = z;
        this.f33117e = jVar;
        this.f33118f = cVar;
        this.f33120h = bVar;
        this.f33121i = lVar;
        cVar.mo30021a(C11474a.DEVICE_STATS, (C11481c.C11484c) this);
        bVar.mo29671a((C11327b.C11329b) this, C11307a.C11309b.DEVICE_STATS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, JSONArray> mo29839a(List<C11391b> list) {
        int size = list.size();
        int ceil = (int) Math.ceil(((double) size) / 1000.0d);
        ArrayMap arrayMap = new ArrayMap(ceil);
        for (int i = 0; i < ceil; i++) {
            StringBuilder sb = new StringBuilder();
            JSONArray jSONArray = new JSONArray();
            int i2 = i * f33114l;
            boolean z = true;
            int i3 = i2;
            while (i3 < size && i3 < i2 + f33114l) {
                C11391b bVar = list.get(i3);
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(bVar.mo29835b());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventType", bVar.mo29837d());
                    jSONObject.put("event", bVar.mo29836c().f33129a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    C11461g.m41885b(f33113k, e, "Unable to add device stats to payload.", new Object[0]);
                }
                i3++;
            }
            arrayMap.put(sb.toString(), jSONArray);
        }
        return arrayMap;
    }

    /* renamed from: b */
    public void mo29799b(InAppMessage inAppMessage) {
        if (!this.f33122j) {
            C11461g.m41880a(f33113k, "Track user is false.  Ignoring onInAppMessageDownloaded event.", new Object[0]);
            return;
        }
        try {
            C11461g.m41888c(f33113k, "Creating download event stat for message id %s", inAppMessage.mo30522id());
            Date date = new Date();
            this.f33121i.mo30089b().execute(new C11390a(this.f33117e.mo31617n(), this.f33117e.mo31604b(), C11391b.m41655a(101, date, C11396d.m41694b(this.f33119g.applicationId(), this.f33116d, date, inAppMessage.mo30522id(), C11493a.m42003a(inAppMessage)), true)));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record analytic event for In App Message Downloaded", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo29840a() {
        this.f33121i.mo30089b().execute(new C11395c("send_stats", new Object[0]));
    }

    /* renamed from: b */
    public void mo29804b(JSONObject jSONObject) {
        try {
            Date date = new Date();
            this.f33121i.mo30089b().execute(new C11390a(this.f33117e.mo31617n(), this.f33117e.mo31604b(), C11391b.m41655a(106, date, C11396d.m41688a(this.f33119g.applicationId(), this.f33116d, date, (String) null, (String) null, jSONObject), true)));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record onInvalidConfig Event stat.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo29785a(long j) {
        this.f33121i.mo30089b().execute(new C11393a("stats_app_close", new Object[0]));
    }

    /* renamed from: a */
    public void mo29684a(C11307a.C11309b bVar) {
        if (bVar == C11307a.C11309b.DEVICE_STATS) {
            C11461g.m41888c(f33113k, "Handling alarm to send stats", new Object[0]);
            mo29840a();
        }
    }

    /* renamed from: a */
    public void mo29800a(C11346e eVar, Event... eventArr) {
        try {
            this.f33121i.mo30089b().execute(new C11394b("track_events", new Object[0], eventArr, new Date(), eVar));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record iam displayed event stat.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo29801a(C11366l.C11367a aVar, JSONObject jSONObject) {
        try {
            Date date = new Date();
            this.f33121i.mo30089b().execute(new C11390a(this.f33117e.mo31617n(), this.f33117e.mo31604b(), C11391b.m41655a(107, date, C11396d.m41690a(this.f33119g.applicationId(), this.f33116d, date, jSONObject), true)));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record onTelemetryEvent stat. %s", aVar.name());
        }
    }

    /* renamed from: a */
    public void mo29793a(C11476b bVar, C11486d dVar) {
        if (dVar.mo30033g()) {
            this.f33120h.mo29676c(C11307a.C11309b.DEVICE_STATS);
            if (bVar.mo30003q() != null) {
                String[] a = C11344c.m41479a(bVar.mo30003q());
                C11461g.m41888c(f33113k, "Removing events %s from DB", Arrays.toString(a));
                this.f33117e.mo31617n().mo31515a(a);
                return;
            }
            return;
        }
        C11461g.m41888c(f33113k, "Request failed: %d - %s", Integer.valueOf(dVar.mo30027b()), dVar.mo30031e());
        this.f33120h.mo29675b(C11307a.C11309b.DEVICE_STATS);
        if (bVar.mo30003q() != null) {
            this.f33117e.mo31617n().mo31516c(C11344c.m41479a(bVar.mo30003q()));
        }
    }

    /* renamed from: a */
    public void mo29795a(InAppMessage inAppMessage) {
        try {
            C11461g.m41888c(f33113k, "InAppMessage displayed event stat for message id %s", inAppMessage.mo30522id());
            Date date = new Date();
            this.f33121i.mo30089b().execute(new C11390a(this.f33117e.mo31617n(), this.f33117e.mo31604b(), C11391b.m41655a(104, date, C11396d.m41684a(this.f33119g.applicationId(), this.f33116d, date, inAppMessage.mo30522id(), C11493a.m42003a(inAppMessage)), true)));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record iam displayed event stat.", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[Catch:{ Exception -> 0x00b5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29796a(com.salesforce.marketingcloud.messages.iam.InAppMessage r16, com.salesforce.marketingcloud.messages.iam.C11651j r17) {
        /*
            r15 = this;
            r1 = r15
            boolean r0 = r1.f33122j
            r2 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = f33113k
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Track user is false.  Ignoring onInAppMessageCompleted event."
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r0, (java.lang.String) r3, (java.lang.Object[]) r2)
            return
        L_0x0010:
            java.lang.String r0 = f33113k     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r3 = "Creating display event stat for message id %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r6 = r16.mo30522id()     // Catch:{ Exception -> 0x00b5 }
            r5[r2] = r6     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.C11461g.m41888c((java.lang.String) r0, (java.lang.String) r3, (java.lang.Object[]) r5)     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.messages.iam.InAppMessage$Button r0 = r17.mo30701a()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r3 = r17.mo30704d()     // Catch:{ Exception -> 0x00b5 }
            int r5 = r3.hashCode()     // Catch:{ Exception -> 0x00b5 }
            r6 = -935167046(0xffffffffc8427bba, float:-199150.9)
            if (r5 == r6) goto L_0x0041
            r6 = 2117198997(0x7e31e495, float:5.9115055E37)
            if (r5 == r6) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            java.lang.String r5 = "buttonClicked"
            boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x00b5 }
            if (r3 == 0) goto L_0x004b
            r3 = r4
            goto L_0x004c
        L_0x0041:
            java.lang.String r5 = "autoDismissed"
            boolean r3 = r3.equals(r5)     // Catch:{ Exception -> 0x00b5 }
            if (r3 == 0) goto L_0x004b
            r3 = r2
            goto L_0x004c
        L_0x004b:
            r3 = -1
        L_0x004c:
            r5 = 0
            if (r3 == 0) goto L_0x005b
            if (r3 == r4) goto L_0x0053
            r4 = 3
            goto L_0x005b
        L_0x0053:
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.mo30569id()     // Catch:{ Exception -> 0x00b5 }
            r5 = r0
        L_0x005a:
            r4 = 2
        L_0x005b:
            r13 = r4
            r14 = r5
            java.util.Date r0 = new java.util.Date     // Catch:{ Exception -> 0x00b5 }
            java.util.Date r3 = r17.mo30703c()     // Catch:{ Exception -> 0x00b5 }
            long r3 = r3.getTime()     // Catch:{ Exception -> 0x00b5 }
            long r5 = r17.mo30702b()     // Catch:{ Exception -> 0x00b5 }
            long r3 = r3 + r5
            r0.<init>(r3)     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.MarketingCloudConfig r3 = r1.f33119g     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r6 = r3.applicationId()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = r1.f33116d     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r9 = r16.mo30522id()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r10 = com.salesforce.marketingcloud.internal.C11493a.m42003a(r16)     // Catch:{ Exception -> 0x00b5 }
            long r3 = r17.mo30702b()     // Catch:{ Exception -> 0x00b5 }
            double r3 = (double) r3     // Catch:{ Exception -> 0x00b5 }
            r11 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r11
            double r3 = java.lang.Math.ceil(r3)     // Catch:{ Exception -> 0x00b5 }
            long r11 = (long) r3     // Catch:{ Exception -> 0x00b5 }
            r8 = r0
            com.salesforce.marketingcloud.analytics.stats.d r3 = com.salesforce.marketingcloud.analytics.stats.C11396d.m41685a(r6, r7, r8, r9, r10, r11, r13, r14)     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.internal.l r4 = r1.f33121i     // Catch:{ Exception -> 0x00b5 }
            java.util.concurrent.ExecutorService r4 = r4.mo30089b()     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.analytics.stats.a r5 = new com.salesforce.marketingcloud.analytics.stats.a     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.storage.j r6 = r1.f33117e     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.storage.d r6 = r6.mo31617n()     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.storage.j r7 = r1.f33117e     // Catch:{ Exception -> 0x00b5 }
            com.salesforce.marketingcloud.util.c r7 = r7.mo31604b()     // Catch:{ Exception -> 0x00b5 }
            r8 = 100
            com.salesforce.marketingcloud.analytics.stats.b r0 = com.salesforce.marketingcloud.analytics.stats.C11391b.m41655a(r8, r0, r3, r2)     // Catch:{ Exception -> 0x00b5 }
            r5.<init>(r6, r7, r0)     // Catch:{ Exception -> 0x00b5 }
            r4.execute(r5)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bf
        L_0x00b5:
            r0 = move-exception
            java.lang.String r3 = f33113k
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Failed to record analytic event for In App Message Displayed"
            com.salesforce.marketingcloud.C11461g.m41885b(r3, r0, r4, r2)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.analytics.stats.C11392c.mo29796a(com.salesforce.marketingcloud.messages.iam.InAppMessage, com.salesforce.marketingcloud.messages.iam.j):void");
    }

    /* renamed from: a */
    public void mo29797a(InAppMessage inAppMessage, JSONObject jSONObject) {
        try {
            C11461g.m41888c(f33113k, "InAppMessage throttled event stat for message id %s", inAppMessage.mo30522id());
            Date date = new Date();
            this.f33121i.mo30089b().execute(new C11390a(this.f33117e.mo31617n(), this.f33117e.mo31604b(), C11391b.m41655a(106, date, C11396d.m41688a(this.f33119g.applicationId(), this.f33116d, date, inAppMessage.mo30522id(), C11493a.m42003a(inAppMessage), jSONObject), true)));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record iam throttled event stat.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m41663a(C11800j jVar, boolean z) {
        if (z) {
            jVar.mo31617n().mo31513a();
        }
    }

    /* renamed from: a */
    public void mo29802a(String str, String str2, String str3, String str4) {
        if (!this.f33122j) {
            C11461g.m41880a(f33113k, "Track user is false.  Ignoring onTriggerSuccessEvent event.", new Object[0]);
            return;
        }
        C11461g.m41888c(f33113k, "Creating trigger event stat for message id %s", str);
        try {
            Date date = new Date();
            this.f33121i.mo30089b().execute(new C11390a(this.f33117e.mo31617n(), this.f33117e.mo31604b(), C11391b.m41655a(102, date, C11396d.m41686a(this.f33119g.applicationId(), this.f33116d, date, str2, str4, str, str3), true)));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record device stat for successful trigger event", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo29798a(String str, String str2, List<String> list) {
        C11461g.m41888c(f33113k, "Creating message validation error event stat for message id %s", str);
        try {
            Date date = new Date();
            this.f33121i.mo30089b().execute(new C11390a(this.f33117e.mo31617n(), this.f33117e.mo31604b(), C11391b.m41655a(103, date, C11396d.m41687a(this.f33119g.applicationId(), this.f33116d, date, str, str2, list), true)));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record validation event stat.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo29803a(JSONObject jSONObject) {
        try {
            Date date = new Date();
            this.f33121i.mo30089b().execute(new C11390a(this.f33117e.mo31617n(), this.f33117e.mo31604b(), C11391b.m41655a(106, date, C11396d.m41688a(this.f33119g.applicationId(), this.f33116d, date, (String) null, (String) null, jSONObject), true)));
        } catch (Exception e) {
            C11461g.m41885b(f33113k, e, "Failed to record syncGateTimeOut Event stat.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo29783a(boolean z) {
        this.f33118f.mo30020a(C11474a.DEVICE_STATS);
        C11327b bVar = this.f33120h;
        C11307a.C11309b bVar2 = C11307a.C11309b.DEVICE_STATS;
        bVar.mo29681e(bVar2);
        if (z) {
            this.f33120h.mo29680d(bVar2);
        }
    }
}
