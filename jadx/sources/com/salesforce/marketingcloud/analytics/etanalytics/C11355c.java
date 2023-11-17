package com.salesforce.marketingcloud.analytics.etanalytics;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.analytics.C11344c;
import com.salesforce.marketingcloud.analytics.C11345d;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.util.C11821j;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.c */
public class C11355c implements C11481c.C11484c, C11327b.C11329b {

    /* renamed from: d */
    final MarketingCloudConfig f33016d;

    /* renamed from: e */
    final String f33017e;

    /* renamed from: f */
    final C11800j f33018f;

    /* renamed from: g */
    final C11481c f33019g;

    /* renamed from: h */
    final C11327b f33020h;

    /* renamed from: i */
    private final C11513l f33021i;

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.c$a */
    class C11356a extends C11505g {
        C11356a(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            List<C11341b> h = C11355c.this.f33018f.mo31616m().mo31506h();
            if (!h.isEmpty()) {
                C11474a aVar = C11474a.ET_ANALYTICS;
                C11355c cVar = C11355c.this;
                MarketingCloudConfig marketingCloudConfig = cVar.f33016d;
                C11751c c = cVar.f33018f.mo31606c();
                C11355c cVar2 = C11355c.this;
                C11476b a = aVar.mo29978a(marketingCloudConfig, c, cVar2.mo29791a(cVar2.f33016d.applicationId(), C11355c.this.f33017e, h).toString());
                a.mo29986a(C11344c.m41478a(h));
                C11355c.this.f33019g.mo30022a(a);
                return;
            }
            C11355c.this.f33020h.mo29680d(C11307a.C11309b.ET_ANALYTICS);
        }
    }

    public C11355c(MarketingCloudConfig marketingCloudConfig, String str, C11800j jVar, C11481c cVar, C11327b bVar, C11513l lVar) {
        this.f33016d = (MarketingCloudConfig) C11821j.m43272a(marketingCloudConfig, "Config is null");
        this.f33017e = (String) C11821j.m43272a(str, "DeviceId is null");
        this.f33018f = (C11800j) C11821j.m43272a(jVar, "MCStorage is null");
        this.f33019g = (C11481c) C11821j.m43272a(cVar, "RequestManager is null");
        this.f33020h = (C11327b) C11821j.m43272a(bVar, "AlarmScheduler is null");
        this.f33021i = lVar;
        cVar.mo30021a(C11474a.ET_ANALYTICS, (C11481c.C11484c) this);
        bVar.mo29671a((C11327b.C11329b) this, C11307a.C11309b.ET_ANALYTICS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo29791a(String str, String str2, List<C11341b> list) {
        JSONArray jSONArray = new JSONArray();
        for (C11341b next : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("etAppId", str);
                jSONObject.put("deviceId", str2);
                jSONObject.put("eventDate", C11824l.m43282a(next.mo29765b()));
                jSONObject.put(C11755a.C11756a.f34100b, next.mo29771f());
                jSONObject.put("analyticTypes", new JSONArray(Collections.singletonList(Integer.valueOf(next.mo29761a()))));
                jSONObject.put("objectIds", new JSONArray(next.mo29773h()));
                String j = next.mo29775j();
                if (!TextUtils.isEmpty(j)) {
                    jSONObject.put("requestId", j);
                }
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                C11461g.m41885b(AnalyticsManager.TAG, e, "Failed to update EtAnalyticItem or convert it to JSON for transmission.", new Object[0]);
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    public void mo29794b() {
        this.f33019g.mo30020a(C11474a.ET_ANALYTICS);
        C11327b bVar = this.f33020h;
        C11307a.C11309b bVar2 = C11307a.C11309b.ET_ANALYTICS;
        bVar.mo29680d(bVar2);
        this.f33020h.mo29681e(bVar2);
    }

    /* renamed from: a */
    public void mo29792a() {
        this.f33021i.mo30089b().execute(new C11356a("send_analytics", new Object[0]));
    }

    /* renamed from: a */
    public void mo29684a(C11307a.C11309b bVar) {
        if (bVar == C11307a.C11309b.ET_ANALYTICS) {
            mo29792a();
        }
    }

    /* renamed from: a */
    public void mo29793a(C11476b bVar, C11486d dVar) {
        if (dVar.mo30033g()) {
            this.f33020h.mo29676c(C11307a.C11309b.ET_ANALYTICS);
            if (bVar.mo30003q() != null) {
                this.f33021i.mo30089b().execute(new C11345d(this.f33018f.mo31616m(), C11344c.m41479a(bVar.mo30003q())));
                return;
            }
            return;
        }
        C11461g.m41888c(AnalyticsManager.TAG, "Request failed: %d - %s", Integer.valueOf(dVar.mo30027b()), dVar.mo30031e());
        this.f33020h.mo29675b(C11307a.C11309b.ET_ANALYTICS);
    }
}
