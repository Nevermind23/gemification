package com.salesforce.marketingcloud.analytics.etanalytics;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.analytics.C11340a;
import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.analytics.C11363i;
import com.salesforce.marketingcloud.internal.C11495b;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.C11800j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.b */
public class C11349b extends C11363i {

    /* renamed from: f */
    private static final int f33003f = 0;

    /* renamed from: d */
    final C11800j f33004d;

    /* renamed from: e */
    private final C11513l f33005e;

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.b$a */
    class C11350a extends C11505g {

        /* renamed from: b */
        final /* synthetic */ C11800j f33006b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11350a(String str, Object[] objArr, C11800j jVar) {
            super(str, objArr);
            this.f33006b = jVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            this.f33006b.mo31616m().mo31497a(0);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.b$b */
    class C11351b extends C11505g {

        /* renamed from: b */
        final /* synthetic */ long f33007b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11351b(String str, Object[] objArr, long j) {
            super(str, objArr);
            this.f33007b = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            if (!C11349b.this.f33004d.mo31616m().mo31503c(0)) {
                try {
                    C11349b.this.f33004d.mo31616m().mo31498a(C11341b.m41460a(new Date(this.f33007b), 0, 4), C11349b.this.f33004d.mo31604b());
                } catch (Exception e) {
                    C11461g.m41885b(AnalyticsManager.TAG, e, "Failed to create our EtAnalyticItem for TimeInApp.", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.b$c */
    class C11352c extends C11505g {

        /* renamed from: b */
        final /* synthetic */ long f33009b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11352c(String str, Object[] objArr, long j) {
            super(str, objArr);
            this.f33009b = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            try {
                List<C11341b> f = C11349b.this.f33004d.mo31616m().mo31504f();
                if (!f.isEmpty()) {
                    for (C11341b next : f) {
                        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f33009b - next.mo29765b().getTime());
                        if (seconds > 0) {
                            next.mo29766b(seconds);
                            next.mo29764a(true);
                            C11349b.this.f33004d.mo31616m().mo31500b(next, C11349b.this.f33004d.mo31604b());
                        }
                    }
                }
            } catch (Exception e) {
                C11461g.m41885b(AnalyticsManager.TAG, e, "Failed to update our EtAnalytic TimeInApp.", new Object[0]);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.b$d */
    class C11353d extends C11505g {

        /* renamed from: b */
        final /* synthetic */ long f33011b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11353d(String str, Object[] objArr, long j) {
            super(str, objArr);
            this.f33011b = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            try {
                List<C11341b> k = C11349b.this.f33004d.mo31616m().mo31509k(C11349b.this.f33004d.mo31604b());
                if (!k.isEmpty()) {
                    for (C11341b next : k) {
                        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f33011b - next.mo29765b().getTime());
                        if (seconds > 0) {
                            next.mo29766b(seconds);
                            next.mo29764a(true);
                            C11349b.this.f33004d.mo31616m().mo31500b(next, C11349b.this.f33004d.mo31604b());
                        }
                    }
                }
            } catch (Exception e) {
                C11461g.m41885b(AnalyticsManager.TAG, e, "Failed to update local storage for stopTimeInAllRegions.", new Object[0]);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.b$e */
    class C11354e extends C11505g {

        /* renamed from: b */
        final /* synthetic */ Region f33013b;

        /* renamed from: c */
        final /* synthetic */ Date f33014c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11354e(String str, Object[] objArr, Region region, Date date) {
            super(str, objArr);
            this.f33013b = region;
            this.f33014c = date;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            try {
                List<C11341b> b = C11349b.this.f33004d.mo31616m().mo31502b(this.f33013b, C11349b.this.f33004d.mo31604b());
                if (!b.isEmpty()) {
                    for (C11341b next : b) {
                        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f33014c.getTime() - next.mo29765b().getTime());
                        if (seconds > 0) {
                            next.mo29766b(seconds);
                            next.mo29764a(true);
                            C11349b.this.f33004d.mo31616m().mo31500b(next, C11349b.this.f33004d.mo31604b());
                        }
                    }
                }
            } catch (Exception e) {
                C11461g.m41885b(AnalyticsManager.TAG, e, "Failed to record EtAnalyticItem for stopTimeInRegion.", new Object[0]);
            }
        }
    }

    public C11349b(C11800j jVar, C11513l lVar) {
        this.f33004d = jVar;
        this.f33005e = lVar;
    }

    /* renamed from: a */
    public void mo29785a(long j) {
        this.f33005e.mo30089b().execute(new C11352c("end_app_counter", new Object[0], j));
    }

    /* renamed from: b */
    public void mo29788b(long j) {
        this.f33005e.mo30089b().execute(new C11351b("start_app_counter", new Object[0], j));
    }

    /* renamed from: c */
    public void mo29790c(long j) {
        this.f33005e.mo30089b().execute(new C11353d("end_region_counter", new Object[0], j));
    }

    public void trackInboxOpenEvent(InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            C11461g.m41894e(AnalyticsManager.TAG, "InboxMessage was null. Call to trackInboxOpenEvent() ignored.", new Object[0]);
        } else {
            this.f33005e.mo30089b().execute(new C11340a(this.f33004d.mo31616m(), this.f33004d.mo31604b(), C11341b.m41461a(new Date(), 0, 15, Collections.singletonList(inboxMessage.mo30788id()), C11495b.m42010b(inboxMessage), true)));
        }
    }

    /* renamed from: a */
    private static void m41495a(C11513l lVar, C11800j jVar) {
        lVar.mo30089b().execute(new C11350a("delete_analytics", new Object[0], jVar));
    }

    /* renamed from: b */
    public void mo29789b(Region region) {
        Date date = new Date();
        m41498b(region, date);
        if (region.regionType() != 3) {
            this.f33005e.mo30089b().execute(new C11340a(this.f33004d.mo31616m(), this.f33004d.mo31604b(), C11341b.m41462a(date, 0, 7, Collections.singletonList(region.mo30395id()), true)));
        }
    }

    /* renamed from: b */
    private void m41498b(Region region, Date date) {
        this.f33005e.mo30089b().execute(new C11354e("end_region_counter", new Object[0], region, date));
    }

    /* renamed from: a */
    public void mo29786a(Region region) {
        Date date = new Date();
        m41496a(region, date);
        this.f33005e.mo30089b().execute(new C11340a(this.f33004d.mo31616m(), this.f33004d.mo31604b(), C11341b.m41462a(date, 0, region.regionType() == 1 ? 6 : 12, Collections.singletonList(region.mo30395id()), true)));
    }

    /* renamed from: a */
    private void m41496a(Region region, Date date) {
        this.f33005e.mo30089b().execute(new C11340a(this.f33004d.mo31616m(), this.f33004d.mo31604b(), C11341b.m41462a(date, 0, region.regionType() == 1 ? 11 : 13, Collections.singletonList(region.mo30395id()), false)));
    }

    /* renamed from: a */
    public void mo29787a(NotificationMessage notificationMessage) {
        mo29785a(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        arrayList.add(notificationMessage.mo30925id());
        Region region = notificationMessage.region();
        if (region != null) {
            arrayList.add(region.mo30395id());
        }
        this.f33005e.mo30089b().execute(new C11340a(this.f33004d.mo31616m(), this.f33004d.mo31604b(), C11341b.m41461a(new Date(), 0, 5, arrayList, notificationMessage.requestId(), false)));
    }

    /* renamed from: a */
    public static void m41497a(C11800j jVar, C11513l lVar, boolean z) {
        if (z) {
            m41495a(lVar, jVar);
        }
    }

    /* renamed from: a */
    public void mo29783a(boolean z) {
        if (z) {
            m41495a(this.f33005e, this.f33004d);
        }
    }
}
