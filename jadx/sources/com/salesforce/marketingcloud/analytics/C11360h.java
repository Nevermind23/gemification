package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.C11419e;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.C11366l;
import com.salesforce.marketingcloud.analytics.etanalytics.C11347a;
import com.salesforce.marketingcloud.analytics.etanalytics.C11349b;
import com.salesforce.marketingcloud.analytics.etanalytics.C11355c;
import com.salesforce.marketingcloud.analytics.piwama.C11379i;
import com.salesforce.marketingcloud.analytics.stats.C11392c;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11403b;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.util.C11821j;
import java.util.EnumSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.analytics.h */
public final class C11360h implements C11419e, C11403b, C11364j, RegionMessageManager.RegionTransitionEventListener, AnalyticsManager, C11359g, C11358f, C11368m, C11369n, C11366l {

    /* renamed from: d */
    private final C11404c f33023d;

    /* renamed from: e */
    private final EnumSet<C11402a> f33024e;

    /* renamed from: f */
    final C11800j f33025f;

    /* renamed from: g */
    private final C11481c f33026g;

    /* renamed from: h */
    private final String f33027h;

    /* renamed from: i */
    private final MarketingCloudConfig f33028i;

    /* renamed from: j */
    private final C11327b f33029j;

    /* renamed from: k */
    private C11355c f33030k;

    /* renamed from: l */
    C11349b f33031l;

    /* renamed from: m */
    C11347a f33032m;

    /* renamed from: n */
    C11379i f33033n;

    /* renamed from: o */
    C11392c f33034o;

    /* renamed from: p */
    private C11513l f33035p;

    /* renamed from: com.salesforce.marketingcloud.analytics.h$a */
    class C11361a extends C11505g {

        /* renamed from: b */
        final /* synthetic */ InboxMessage f33036b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11361a(String str, Object[] objArr, InboxMessage inboxMessage) {
            super(str, objArr);
            this.f33036b = inboxMessage;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            if (this.f33036b == null || !C11360h.this.f33025f.mo31620q().mo31556d(this.f33036b.mo30788id())) {
                C11461g.m41894e(AnalyticsManager.TAG, "InboxMessage is a Legacy message, null or unknown.  Call to trackInboxOpenEvent() ignored.", new Object[0]);
                return;
            }
            C11347a aVar = C11360h.this.f33032m;
            if (aVar != null) {
                aVar.trackInboxOpenEvent(this.f33036b);
            }
            C11349b bVar = C11360h.this.f33031l;
            if (bVar != null) {
                bVar.trackInboxOpenEvent(this.f33036b);
            }
            C11379i iVar = C11360h.this.f33033n;
            if (iVar != null) {
                iVar.trackInboxOpenEvent(this.f33036b);
            }
            C11392c cVar = C11360h.this.f33034o;
            if (cVar != null) {
                cVar.trackInboxOpenEvent(this.f33036b);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.h$b */
    static /* synthetic */ class C11362b {

        /* renamed from: a */
        static final /* synthetic */ int[] f33038a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.salesforce.marketingcloud.behaviors.a[] r0 = com.salesforce.marketingcloud.behaviors.C11402a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33038a = r0
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_BACKGROUNDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33038a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_FOREGROUNDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33038a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_DEVICE_SHUTDOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33038a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_DEVICE_BOOT_COMPLETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.analytics.C11360h.C11362b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C11360h(MarketingCloudConfig marketingCloudConfig, C11800j jVar, String str, C11327b bVar, C11404c cVar, C11481c cVar2, C11347a aVar, C11349b bVar2, C11379i iVar, C11513l lVar, C11392c cVar3, C11355c cVar4) {
        this(marketingCloudConfig, jVar, str, bVar, cVar, cVar2, lVar);
        this.f33032m = aVar;
        this.f33031l = bVar2;
        this.f33033n = iVar;
        this.f33034o = cVar3;
        this.f33030k = cVar4;
    }

    /* renamed from: a */
    private void m41523a(Bundle bundle) {
        long j = bundle.getLong("timestamp", 0);
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29785a(j);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29785a(j);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29785a(j);
            this.f33033n.mo29823c();
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29785a(j);
            this.f33034o.mo29840a();
        }
        C11355c cVar2 = this.f33030k;
        if (cVar2 != null) {
            cVar2.mo29792a();
        }
    }

    /* renamed from: b */
    private void m41524b(Bundle bundle) {
        long j = bundle.getLong("timestamp", System.currentTimeMillis());
        C11355c cVar = this.f33030k;
        if (cVar != null) {
            cVar.mo29792a();
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29788b(j);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29788b(j);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29823c();
            this.f33033n.mo29788b(j);
        }
        C11392c cVar2 = this.f33034o;
        if (cVar2 != null) {
            cVar2.mo29840a();
            this.f33034o.mo29788b(j);
        }
    }

    /* renamed from: c */
    private void m41525c(Bundle bundle) {
        long j = bundle.getLong("timestamp", 0);
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29790c(j);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29790c(j);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29790c(j);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29790c(j);
        }
    }

    public String componentName() {
        return "AnalyticsManager";
    }

    public JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = true;
            jSONObject.put("bet_analytics", this.f33032m != null);
            jSONObject.put("et_analytics", this.f33031l != null);
            jSONObject.put("pi_analytics", this.f33033n != null);
            if (this.f33034o == null) {
                z = false;
            }
            jSONObject.put("device_stats", z);
            C11379i iVar = this.f33033n;
            if (iVar != null) {
                jSONObject.put("predictive_intelligence_identifier", iVar.getPiIdentifier());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void controlChannelInit(int i) {
        int i2 = i;
        boolean a = C11398b.m41709a(i2, C11398b.f33139r);
        if (C11398b.m41709a(i2, C11398b.f33142u)) {
            C11347a aVar = this.f33032m;
            if (aVar != null) {
                aVar.mo29783a(false);
                this.f33032m = null;
            }
            C11347a.m41489a(this.f33025f, this.f33035p, C11398b.m41711c(i2, C11398b.f33142u));
            C11392c cVar = this.f33034o;
            if (cVar != null) {
                cVar.mo29783a(false);
                this.f33034o = null;
            }
            C11392c.m41663a(this.f33025f, C11398b.m41711c(i2, C11398b.f33142u));
        } else {
            this.f33032m = new C11347a(this.f33025f, this.f33035p);
            MarketingCloudConfig marketingCloudConfig = this.f33028i;
            this.f33034o = new C11392c(marketingCloudConfig, this.f33027h, marketingCloudConfig.analyticsEnabled() && !a, this.f33025f, this.f33026g, this.f33029j, this.f33035p);
        }
        if (a) {
            C11349b bVar = this.f33031l;
            if (bVar != null) {
                bVar.mo29783a(false);
                this.f33031l = null;
            }
            C11349b.m41497a(this.f33025f, this.f33035p, C11398b.m41711c(i2, C11398b.f33139r));
        } else if (this.f33031l == null && this.f33028i.analyticsEnabled()) {
            this.f33031l = new C11349b(this.f33025f, this.f33035p);
        }
        if (C11398b.m41709a(i2, C11398b.f33140s)) {
            C11379i iVar = this.f33033n;
            if (iVar != null) {
                iVar.mo29783a(false);
                this.f33033n = null;
            }
            C11379i.m41624a(this.f33025f, this.f33026g, this.f33035p, C11398b.m41711c(i2, C11398b.f33140s));
        } else if (this.f33033n == null && this.f33028i.piAnalyticsEnabled()) {
            this.f33033n = new C11379i(this.f33028i, this.f33025f, this.f33026g, this.f33035p);
        }
        if (this.f33032m == null && this.f33031l == null) {
            this.f33029j.mo29680d(C11307a.C11309b.ET_ANALYTICS);
            C11355c cVar2 = this.f33030k;
            if (cVar2 != null) {
                cVar2.mo29794b();
                this.f33030k = null;
            }
        } else if (this.f33030k == null) {
            this.f33030k = new C11355c(this.f33028i, this.f33027h, this.f33025f, this.f33026g, this.f33029j, this.f33035p);
        }
    }

    public String getPiIdentifier() {
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            return iVar.getPiIdentifier();
        }
        return null;
    }

    public void init(InitializationStatus.C11293a aVar, int i) {
        boolean z = C11398b.m41710b(i, C11398b.f33139r) && this.f33028i.analyticsEnabled();
        if (C11398b.m41710b(i, C11398b.f33142u)) {
            this.f33032m = new C11347a(this.f33025f, this.f33035p);
            this.f33034o = new C11392c(this.f33028i, this.f33027h, z, this.f33025f, this.f33026g, this.f33029j, this.f33035p);
        }
        if (z) {
            this.f33031l = new C11349b(this.f33025f, this.f33035p);
        }
        if (C11398b.m41710b(i, C11398b.f33140s) && this.f33028i.piAnalyticsEnabled()) {
            this.f33033n = new C11379i(this.f33028i, this.f33025f, this.f33026g, this.f33035p);
        }
        if (!(this.f33032m == null && this.f33031l == null)) {
            this.f33030k = new C11355c(this.f33028i, this.f33027h, this.f33025f, this.f33026g, this.f33029j, this.f33035p);
        }
        this.f33023d.mo29851a(this, this.f33024e);
    }

    public void onBehavior(C11402a aVar, Bundle bundle) {
        int i = C11362b.f33038a[aVar.ordinal()];
        if (i == 1) {
            m41523a(bundle);
        } else if (i == 2) {
            m41524b(bundle);
        } else if (i == 3 || i == 4) {
            m41525c(bundle);
        }
    }

    public void onTransitionEvent(int i, Region region) {
        if (i == 1) {
            C11347a aVar = this.f33032m;
            if (aVar != null) {
                aVar.mo29786a(region);
            }
            C11349b bVar = this.f33031l;
            if (bVar != null) {
                bVar.mo29786a(region);
            }
            C11379i iVar = this.f33033n;
            if (iVar != null) {
                iVar.mo29786a(region);
            }
            C11392c cVar = this.f33034o;
            if (cVar != null) {
                cVar.mo29786a(region);
            }
        } else if (i == 2) {
            C11347a aVar2 = this.f33032m;
            if (aVar2 != null) {
                aVar2.mo29789b(region);
            }
            C11349b bVar2 = this.f33031l;
            if (bVar2 != null) {
                bVar2.mo29789b(region);
            }
            C11379i iVar2 = this.f33033n;
            if (iVar2 != null) {
                iVar2.mo29789b(region);
            }
            C11392c cVar2 = this.f33034o;
            if (cVar2 != null) {
                cVar2.mo29789b(region);
            }
        }
    }

    public void setPiIdentifier(String str) {
        if (str == null || TextUtils.getTrimmedLength(str) != 0) {
            C11379i iVar = this.f33033n;
            if (iVar != null) {
                iVar.setPiIdentifier(str);
                return;
            }
            return;
        }
        C11461g.m41894e(AnalyticsManager.TAG, "Call to setPiIdentifier() ignored. Predictive Intelligence Identifier contained only whitespace.", new Object[0]);
    }

    public void tearDown(boolean z) {
        this.f33023d.mo29850a((C11403b) this);
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29783a(z);
            this.f33032m = null;
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29783a(z);
            this.f33031l = null;
        }
        C11355c cVar = this.f33030k;
        if (cVar != null) {
            cVar.mo29794b();
            this.f33030k = null;
        }
        C11392c cVar2 = this.f33034o;
        if (cVar2 != null) {
            cVar2.mo29783a(z);
            this.f33034o = null;
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29783a(z);
            this.f33033n = null;
        }
    }

    public void trackCartContents(PiCart piCart) {
        if (piCart == null) {
            C11461g.m41894e(AnalyticsManager.TAG, "PiCart may not be null.  We could not complete your trackCartContents() request.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.trackCartContents(piCart);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.trackCartContents(piCart);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.trackCartContents(piCart);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.trackCartContents(piCart);
        }
    }

    public void trackCartConversion(PiOrder piOrder) {
        if (piOrder == null) {
            C11461g.m41894e(AnalyticsManager.TAG, "PiOrder may not be null.  We could not complete your trackCartConversion() request.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.trackCartConversion(piOrder);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.trackCartConversion(piOrder);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.trackCartConversion(piOrder);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.trackCartConversion(piOrder);
        }
    }

    public void trackInboxOpenEvent(InboxMessage inboxMessage) {
        this.f33035p.mo30089b().execute(new C11361a("track_inbox_open", new Object[0], inboxMessage));
    }

    public void trackPageView(String str) {
        trackPageView(str, (String) null, (String) null, (String) null);
    }

    public C11360h(MarketingCloudConfig marketingCloudConfig, C11800j jVar, String str, C11327b bVar, C11404c cVar, C11481c cVar2, C11513l lVar) {
        this.f33024e = EnumSet.of(C11402a.BEHAVIOR_APP_BACKGROUNDED, C11402a.BEHAVIOR_APP_FOREGROUNDED, C11402a.BEHAVIOR_DEVICE_SHUTDOWN, C11402a.BEHAVIOR_DEVICE_BOOT_COMPLETE);
        this.f33025f = (C11800j) C11821j.m43272a(jVar, "MCStorage may not be null.");
        this.f33023d = (C11404c) C11821j.m43272a(cVar, "BehaviorManager may not be null.");
        this.f33026g = cVar2;
        this.f33027h = str;
        this.f33028i = marketingCloudConfig;
        this.f33029j = bVar;
        this.f33035p = lVar;
    }

    /* renamed from: a */
    public void mo29800a(C11346e eVar, Event... eventArr) {
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29800a(eVar, eventArr);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29800a(eVar, eventArr);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29800a(eVar, eventArr);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29800a(eVar, eventArr);
        }
    }

    /* renamed from: b */
    public void mo29799b(InAppMessage inAppMessage) {
        if (inAppMessage == null) {
            C11461g.m41894e(AnalyticsManager.TAG, "InAppMessage is null.  Call to onInAppMessageDownloaded() ignored.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29799b(inAppMessage);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29799b(inAppMessage);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29799b(inAppMessage);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29799b(inAppMessage);
        }
    }

    public void trackPageView(String str, String str2) {
        trackPageView(str, str2, (String) null, (String) null);
    }

    /* renamed from: a */
    public void mo29801a(C11366l.C11367a aVar, JSONObject jSONObject) {
        C11347a aVar2 = this.f33032m;
        if (aVar2 != null) {
            aVar2.mo29801a(aVar, jSONObject);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29801a(aVar, jSONObject);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29801a(aVar, jSONObject);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29801a(aVar, jSONObject);
        }
    }

    /* renamed from: b */
    public void mo29784b(NotificationMessage notificationMessage) {
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29784b(notificationMessage);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29784b(notificationMessage);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29784b(notificationMessage);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29784b(notificationMessage);
        }
    }

    public void trackPageView(String str, String str2, String str3) {
        trackPageView(str, str2, str3, (String) null);
    }

    /* renamed from: a */
    public void mo29795a(InAppMessage inAppMessage) {
        if (inAppMessage == null) {
            C11461g.m41894e(AnalyticsManager.TAG, "InAppMessage is null.  Call to onIamDisplayed() ignored.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29795a(inAppMessage);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29795a(inAppMessage);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29795a(inAppMessage);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29795a(inAppMessage);
        }
    }

    /* renamed from: b */
    public void mo29804b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            C11461g.m41894e(AnalyticsManager.TAG, "Information not valid. Call to onInvalidConfigEvent() ignored", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29804b(jSONObject);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29804b(jSONObject);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29804b(jSONObject);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29804b(jSONObject);
        }
    }

    public void trackPageView(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            C11461g.m41894e(AnalyticsManager.TAG, "url may not be null or empty.  We could not complete your trackPageView() request.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.trackPageView(str, str2, str3, str4);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.trackPageView(str, str2, str3, str4);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.trackPageView(str, str2, str3, str4);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.trackPageView(str, str2, str3, str4);
        }
    }

    /* renamed from: a */
    public void mo29796a(InAppMessage inAppMessage, C11651j jVar) {
        if (inAppMessage == null || jVar == null) {
            C11461g.m41894e(AnalyticsManager.TAG, "InAppMessage or MessageCompletedEvent is null.  Call to onInAppMessageCompleted() ignored.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29796a(inAppMessage, jVar);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29796a(inAppMessage, jVar);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29796a(inAppMessage, jVar);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29796a(inAppMessage, jVar);
        }
    }

    /* renamed from: a */
    public void mo29797a(InAppMessage inAppMessage, JSONObject jSONObject) {
        if (inAppMessage == null || jSONObject == null || jSONObject.length() <= 0) {
            C11461g.m41894e(AnalyticsManager.TAG, "Message and/or Information not valid. Call to onInAppMessageThrottled() ignored", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29797a(inAppMessage, jSONObject);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29797a(inAppMessage, jSONObject);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29797a(inAppMessage, jSONObject);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29797a(inAppMessage, jSONObject);
        }
    }

    /* renamed from: a */
    public void mo29781a(InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            C11461g.m41894e(AnalyticsManager.TAG, "InboxMessage is null.  Call to onMessageDownloaded() ignored.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29781a(inboxMessage);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29781a(inboxMessage);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29781a(inboxMessage);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29781a(inboxMessage);
        }
    }

    /* renamed from: a */
    public void mo29787a(NotificationMessage notificationMessage) {
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29787a(notificationMessage);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29787a(notificationMessage);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29787a(notificationMessage);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29787a(notificationMessage);
        }
    }

    /* renamed from: a */
    public void mo29782a(NotificationMessage notificationMessage, boolean z) {
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29782a(notificationMessage, z);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29782a(notificationMessage, z);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29782a(notificationMessage, z);
        }
    }

    /* renamed from: a */
    public void mo29802a(String str, String str2, String str3, String str4) {
        if (str == null || str2 == null || str3 == null) {
            C11461g.m41894e(AnalyticsManager.TAG, "triggerId, outcomeId or outcomeType is null.  Call to onTriggerSuccessEvent() ignored.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29802a(str, str2, str3, str4);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29802a(str, str2, str3, str4);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29802a(str, str2, str3, str4);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29802a(str, str2, str3, str4);
        }
    }

    /* renamed from: a */
    public void mo29798a(String str, String str2, List<String> list) {
        if (str == null || str2 == null || list == null || list.isEmpty()) {
            C11461g.m41894e(AnalyticsManager.TAG, "messageId, activityInstanceId or reasons is null.  Call to onInAppMessageValidationError() ignored.", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29798a(str, str2, list);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29798a(str, str2, list);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29798a(str, str2, list);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29798a(str, str2, list);
        }
    }

    /* renamed from: a */
    public void mo29803a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            C11461g.m41894e(AnalyticsManager.TAG, "Information not valid. Call to onSyncGateTimeOutEvent() ignored", new Object[0]);
            return;
        }
        C11347a aVar = this.f33032m;
        if (aVar != null) {
            aVar.mo29803a(jSONObject);
        }
        C11349b bVar = this.f33031l;
        if (bVar != null) {
            bVar.mo29803a(jSONObject);
        }
        C11379i iVar = this.f33033n;
        if (iVar != null) {
            iVar.mo29803a(jSONObject);
        }
        C11392c cVar = this.f33034o;
        if (cVar != null) {
            cVar.mo29803a(jSONObject);
        }
    }
}
