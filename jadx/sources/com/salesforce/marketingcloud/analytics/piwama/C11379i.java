package com.salesforce.marketingcloud.analytics.piwama;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.analytics.C11340a;
import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.analytics.C11344c;
import com.salesforce.marketingcloud.analytics.C11345d;
import com.salesforce.marketingcloud.analytics.C11363i;
import com.salesforce.marketingcloud.analytics.PiCart;
import com.salesforce.marketingcloud.analytics.PiOrder;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.registration.C11717d;
import com.salesforce.marketingcloud.storage.C11749a;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.util.C11821j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.analytics.piwama.i */
public class C11379i extends C11363i implements C11481c.C11484c {

    /* renamed from: h */
    static final String f33058h = "user_id";

    /* renamed from: i */
    static final String f33059i = "session_id";

    /* renamed from: j */
    static final int f33060j = 100;

    /* renamed from: k */
    private static final int f33061k = 30;

    /* renamed from: l */
    private static final String f33062l = "et_background_time_cache";

    /* renamed from: m */
    static final String f33063m = C11461g.m41875a("PiWamaAnalytic");

    /* renamed from: n */
    private static final int f33064n = 1;

    /* renamed from: o */
    private static C11385j f33065o;

    /* renamed from: d */
    final C11800j f33066d;

    /* renamed from: e */
    final C11481c f33067e;

    /* renamed from: f */
    private final MarketingCloudConfig f33068f;

    /* renamed from: g */
    final C11513l f33069g;

    /* renamed from: com.salesforce.marketingcloud.analytics.piwama.i$a */
    class C11380a extends C11505g {

        /* renamed from: b */
        final /* synthetic */ C11800j f33070b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11380a(String str, Object[] objArr, C11800j jVar) {
            super(str, objArr);
            this.f33070b = jVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            this.f33070b.mo31616m().mo31505g(1);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.piwama.i$b */
    class C11381b implements Comparator<C11341b> {
        C11381b() {
        }

        /* renamed from: a */
        public int compare(C11341b bVar, C11341b bVar2) {
            if (bVar.mo29770e() == null) {
                return bVar2.mo29770e() == null ? 0 : -1;
            }
            if (bVar2.mo29770e() == null) {
                return 1;
            }
            return bVar.mo29770e().compareTo(bVar2.mo29770e());
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.piwama.i$c */
    class C11382c extends C11505g {

        /* renamed from: b */
        final /* synthetic */ long f33071b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11382c(String str, Object[] objArr, long j) {
            super(str, objArr);
            this.f33071b = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            try {
                C11749a m = C11379i.this.f33066d.mo31616m();
                for (C11341b next : m.mo31510l(C11379i.this.f33066d.mo31604b())) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f33071b - next.mo29765b().getTime());
                    if (seconds > 0) {
                        next.mo29766b(seconds);
                        next.mo29764a(true);
                        next.mo29767b(C11379i.this.mo29822a());
                        m.mo31500b(next, C11379i.this.f33066d.mo31604b());
                    }
                }
                C11341b a = C11341b.m41460a(new Date(this.f33071b), 1, 2);
                a.mo29767b(C11379i.this.mo29822a());
                a.mo29764a(true);
                a.mo29763a(new C11372b(new Date(this.f33071b)).mo29817e().toString());
                m.mo31498a(a, C11379i.this.f33066d.mo31604b());
            } catch (Exception e) {
                C11461g.m41885b(C11379i.f33063m, e, "Failed to update our PiWama TimeInApp.", new Object[0]);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.piwama.i$d */
    class C11383d extends C11505g {

        /* renamed from: b */
        final /* synthetic */ NotificationMessage f33073b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11383d(String str, Object[] objArr, NotificationMessage notificationMessage) {
            super(str, objArr);
            this.f33073b = notificationMessage;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            if (C11379i.this.f33066d.mo31616m().mo31503c(1)) {
                C11379i.this.mo29785a(System.currentTimeMillis());
            }
            Date date = new Date();
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f33073b.mo30925id());
            Region region = this.f33073b.region();
            if (region != null) {
                arrayList.add(region.mo30395id());
            }
            C11341b a = C11341b.m41462a(date, 1, 5, arrayList, false);
            a.mo29767b(C11379i.this.mo29822a());
            a.mo29763a(new C11375e(date, true, a.mo29773h()).mo29817e().toString());
            C11379i.this.f33069g.mo30089b().execute(new C11340a(C11379i.this.f33066d.mo31616m(), C11379i.this.f33066d.mo31604b(), a));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.piwama.i$e */
    class C11384e extends C11505g {
        C11384e(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11379i iVar = C11379i.this;
            C11379i.m41623a(iVar.f33067e, iVar.f33066d.mo31616m().mo31508j(C11379i.this.f33066d.mo31604b()));
        }
    }

    public C11379i(MarketingCloudConfig marketingCloudConfig, C11800j jVar, C11481c cVar, C11513l lVar) {
        C11821j.m43272a(marketingCloudConfig, "MarketingCloudConfig may not be null.");
        this.f33066d = (C11800j) C11821j.m43272a(jVar, "MCStorage may not be null.");
        this.f33067e = (C11481c) C11821j.m43272a(cVar, "RequestManager may not be null.");
        this.f33068f = marketingCloudConfig;
        f33065o = m41626a(marketingCloudConfig) ? new C11387k(marketingCloudConfig, jVar) : new C11371a(marketingCloudConfig, jVar);
        cVar.mo30021a(C11474a.PI_ANALYTICS, (C11481c.C11484c) this);
        this.f33069g = lVar;
    }

    /* renamed from: b */
    static List<List<C11341b>> m41627b(List<C11341b> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = size; i2 > 0; i2 -= 100) {
            int i3 = i * 100;
            i++;
            int i4 = i * 100;
            if (i4 > size) {
                i4 = i2 + i3;
            }
            arrayList.add(new ArrayList(list.subList(i3, i4)));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo29822a() {
        String piIdentifier = getPiIdentifier();
        return (piIdentifier != null || !this.f33068f.useLegacyPiIdentifier()) ? piIdentifier : C11717d.m42748a(this.f33066d);
    }

    /* renamed from: c */
    public void mo29823c() {
        this.f33069g.mo30089b().execute(new C11384e("send_pi_analytics", new Object[0]));
    }

    public String getPiIdentifier() {
        return this.f33066d.mo31606c().mo31112b("predictive_intelligence_identifier", (String) null);
    }

    public void setPiIdentifier(String str) {
        if (str == null) {
            this.f33066d.mo31606c().mo31110a("predictive_intelligence_identifier");
        } else {
            this.f33066d.mo31606c().mo31111a("predictive_intelligence_identifier", str.trim());
        }
    }

    public void trackCartContents(PiCart piCart) {
        if (piCart != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                m41622a((C11373c) new C11376f(piCart, new Date(currentTimeMillis)), currentTimeMillis);
            } catch (Exception e) {
                C11461g.m41885b(f33063m, e, "Failed to add PiWamaAnalytic for trackCartContents.  See LogCat for details.", new Object[0]);
            }
        }
    }

    public void trackCartConversion(PiOrder piOrder) {
        if (piOrder != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                m41622a((C11373c) new C11377g(piOrder, new Date(currentTimeMillis)), currentTimeMillis);
            } catch (IllegalArgumentException e) {
                C11461g.m41885b(f33063m, e, "Failed to add PiWamaAnalytic for trackCartConversion.  See LogCat for details.", new Object[0]);
            }
        }
    }

    public void trackPageView(String str, String str2, String str3, String str4) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            m41622a((C11373c) new C11378h(str, str2, str3, str4, new Date(currentTimeMillis)), currentTimeMillis);
        } catch (IllegalArgumentException e) {
            C11461g.m41885b(f33063m, e, "Failed to record PiWamaItem for trackPageView.", new Object[0]);
        }
    }

    /* renamed from: a */
    static List<List<C11341b>> m41621a(List<C11341b> list) {
        ArrayList arrayList = new ArrayList();
        Collections.sort(list, new C11381b());
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (C11341b next : list) {
            if ((str == null || !str.equals(next.mo29770e())) && next.mo29770e() != null) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                }
                str = next.mo29770e();
                arrayList2 = new ArrayList();
            }
            arrayList2.add(next);
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    /* renamed from: b */
    private void m41628b() {
        long j = this.f33066d.mo31608f().getLong(f33062l, -1);
        if (j != -1) {
            this.f33066d.mo31608f().edit().remove(f33062l).apply();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            Calendar instance2 = Calendar.getInstance();
            instance2.add(12, -30);
            if (instance.before(instance2)) {
                this.f33066d.mo31606c().mo31110a(C11751c.f34086f);
            }
        }
    }

    /* renamed from: a */
    public void mo29785a(long j) {
        this.f33066d.mo31608f().edit().putLong(f33062l, j).apply();
        this.f33069g.mo30089b().execute(new C11382c("end_time_in_app", new Object[0], j));
    }

    /* renamed from: b */
    public void mo29788b(long j) {
        Date date = new Date(j);
        m41628b();
        if (!this.f33066d.mo31616m().mo31503c(1)) {
            try {
                C11341b a = C11341b.m41460a(date, 1, 5);
                a.mo29763a(new C11375e(date, false, Collections.emptyList()).mo29817e().toString());
                this.f33069g.mo30089b().execute(new C11340a(this.f33066d.mo31616m(), this.f33066d.mo31604b(), a));
            } catch (Exception e) {
                C11461g.m41885b(f33063m, e, "Failed to create WamaItem for TimeInApp.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private void m41622a(C11373c cVar, long j) {
        JSONObject e = cVar.mo29817e();
        if (e != null) {
            try {
                C11341b a = C11341b.m41460a(new Date(j), 1, cVar.mo29815c());
                a.mo29767b(mo29822a());
                a.mo29763a(e.toString());
                a.mo29764a(true);
                if (!TextUtils.isEmpty(a.mo29769d())) {
                    this.f33069g.mo30089b().execute(new C11340a(this.f33066d.mo31616m(), this.f33066d.mo31604b(), a));
                }
            } catch (Exception e2) {
                C11461g.m41885b(f33063m, e2, "Failed to record PiWamaItem in local storage.", new Object[0]);
                throw new IllegalArgumentException("Failed to record PiWamaItem in local storage.");
            }
        } else {
            throw new IllegalArgumentException("Failed to convert your input type to a JSON Object.");
        }
    }

    /* renamed from: a */
    public void mo29793a(C11476b bVar, C11486d dVar) {
        if (dVar.mo30033g()) {
            try {
                JSONObject jSONObject = new JSONObject(dVar.mo30026a());
                m41625a(C11344c.m41479a(bVar.mo30003q() != null ? bVar.mo30003q() : ""), jSONObject.getString(f33058h), jSONObject.getString(f33059i));
            } catch (Exception e) {
                C11461g.m41885b(f33063m, e, "Error parsing response.", new Object[0]);
            }
        } else {
            C11461g.m41888c(f33063m, "Request failed: %d - %s", Integer.valueOf(dVar.mo30027b()), dVar.mo30031e());
        }
    }

    /* renamed from: a */
    static void m41623a(C11481c cVar, List<C11341b> list) {
        MarketingCloudSdk instance;
        if ((MarketingCloudSdk.isReady() || MarketingCloudSdk.isInitializing()) && (instance = MarketingCloudSdk.getInstance()) != null && !list.isEmpty()) {
            for (List<C11341b> b : m41621a(list)) {
                for (List next : m41627b(b)) {
                    C11476b a = f33065o.mo29826a(instance.getRegistrationManager(), instance.getPushMessageManager(), instance.getRegionMessageManager(), (List<C11341b>) next);
                    a.mo29986a(C11344c.m41478a((List<C11341b>) next));
                    cVar.mo30022a(a);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29787a(NotificationMessage notificationMessage) {
        try {
            this.f33069g.mo30089b().execute(new C11383d("notification_opened", new Object[0], notificationMessage));
        } catch (Exception e) {
            C11461g.m41885b(f33063m, e, "Failed to store our WamaItem for message opened.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m41624a(C11800j jVar, C11481c cVar, C11513l lVar, boolean z) {
        if (z) {
            lVar.mo30089b().execute(new C11380a("deleting_pi_analytics", new Object[0], jVar));
            jVar.mo31606c().mo31110a("predictive_intelligence_identifier");
        }
        cVar.mo30020a(C11474a.PI_ANALYTICS);
    }

    /* renamed from: a */
    public void mo29783a(boolean z) {
        C11481c cVar = this.f33067e;
        if (cVar != null) {
            cVar.mo30020a(C11474a.PI_ANALYTICS);
        }
    }

    /* renamed from: a */
    private void m41625a(String[] strArr, String str, String str2) {
        this.f33066d.mo31606c().mo31111a(C11751c.f34087g, str);
        this.f33066d.mo31606c().mo31111a(C11751c.f34086f, str2);
        if (strArr != null) {
            this.f33069g.mo30089b().execute(new C11345d(this.f33066d.mo31616m(), strArr));
        }
    }

    /* renamed from: a */
    private boolean m41626a(MarketingCloudConfig marketingCloudConfig) {
        String trim = marketingCloudConfig.predictiveIntelligenceServerUrl().toLowerCase(Locale.ENGLISH).trim();
        return !trim.startsWith("https://stage.app.igodigital.com/api/v1/collect/qa/qa1s1/process_batch") && !trim.startsWith("https://stage.app.igodigital.com/api/v1/collect/qa/qa3s1/process_batch") && !trim.startsWith("https://app.igodigital.com/api/v1/collect/process_batch");
    }
}
