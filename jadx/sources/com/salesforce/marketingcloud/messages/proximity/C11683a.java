package com.salesforce.marketingcloud.messages.proximity;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11509j;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.C11604b;
import com.salesforce.marketingcloud.messages.C11605c;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.proximity.C11709c;
import com.salesforce.marketingcloud.proximity.C11712e;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.C11801k;
import com.salesforce.marketingcloud.storage.C11802l;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.messages.proximity.a */
public final class C11683a implements C11605c, C11712e.C11713a, C11481c.C11484c {

    /* renamed from: j */
    static final String f33857j = C11461g.m41875a("ProximityMessageManager");

    /* renamed from: d */
    final C11800j f33858d;

    /* renamed from: e */
    final C11712e f33859e;

    /* renamed from: f */
    final C11605c.C11606a f33860f;

    /* renamed from: g */
    final C11481c f33861g;

    /* renamed from: h */
    private final C11513l f33862h;

    /* renamed from: i */
    private C11605c.C11607b f33863i;

    /* renamed from: com.salesforce.marketingcloud.messages.proximity.a$a */
    class C11684a implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a */
        final /* synthetic */ MarketingCloudConfig f33864a;

        /* renamed from: b */
        final /* synthetic */ String f33865b;

        /* renamed from: c */
        final /* synthetic */ LatLon f33866c;

        C11684a(MarketingCloudConfig marketingCloudConfig, String str, LatLon latLon) {
            this.f33864a = marketingCloudConfig;
            this.f33865b = str;
            this.f33866c = latLon;
        }

        public void ready(MarketingCloudSdk marketingCloudSdk) {
            C11683a aVar = C11683a.this;
            aVar.f33861g.mo30022a(C11474a.PROXIMITY_MESSAGES.mo29979a(this.f33864a, aVar.f33858d.mo31606c(), C11474a.m41921a(this.f33864a.applicationId(), this.f33865b, this.f33866c)));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.proximity.a$b */
    class C11685b extends C11505g {
        C11685b(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11683a.this.f33858d.mo31623t().mo31576d(3);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.proximity.a$c */
    class C11686c extends C11505g {

        /* renamed from: b */
        final /* synthetic */ C11709c f33869b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11686c(String str, Object[] objArr, C11709c cVar) {
            super(str, objArr);
            this.f33869b = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            try {
                C11802l t = C11683a.this.f33858d.mo31623t();
                Region a = t.mo31571a(this.f33869b.mo30993f(), C11683a.this.f33858d.mo31604b());
                if (a == null) {
                    C11461g.m41880a(C11683a.f33857j, "BeaconRegion [%s] did not have matching Region in storage.", this.f33869b);
                } else if (!C11509j.m42065a(a)) {
                    C11461g.m41891d(C11683a.f33857j, "Region [%s] was entered.  Will attempt to show associated message.", a.mo30395id());
                    C11509j.m42064a(a, true);
                    t.mo31575a(a.mo30395id(), true);
                    C11683a.this.f33860f.mo30433b(a);
                    List<String> a2 = t.mo31573a(a.mo30395id(), 5);
                    if (!a2.isEmpty()) {
                        C11801k s = C11683a.this.f33858d.mo31622s();
                        C11808c b = C11683a.this.f33858d.mo31604b();
                        for (String next : a2) {
                            Message a3 = s.mo31565a(next, b);
                            if (a3 != null) {
                                C11683a.this.f33860f.mo30432a(a, a3);
                            } else {
                                C11461g.m41880a(C11683a.f33857j, "Message with id [%s] not found", next);
                            }
                        }
                    }
                } else {
                    C11461g.m41880a(C11683a.f33857j, "Ignoring entry event.  Already inside Region [%s]", a);
                }
            } catch (Exception e) {
                C11461g.m41885b(C11683a.f33857j, e, "Proximity region (%s) was entered, but failed to check for associated message", this.f33869b.mo30993f());
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.proximity.a$d */
    class C11687d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11709c f33871a;

        C11687d(C11709c cVar) {
            this.f33871a = cVar;
        }

        public void run() {
            C11802l t = C11683a.this.f33858d.mo31623t();
            Region a = t.mo31571a(this.f33871a.mo30993f(), C11683a.this.f33858d.mo31604b());
            if (a == null) {
                C11461g.m41880a(C11683a.f33857j, "BeaconRegion [%s] did not have matching Region in storage.", this.f33871a);
            } else if (C11509j.m42065a(a)) {
                C11509j.m42064a(a, false);
                C11683a.this.f33860f.mo30431a(a);
                t.mo31575a(a.mo30395id(), false);
            } else {
                C11461g.m41880a(C11683a.f33857j, "Ignoring exit event.  Was not inside BeaconRegion [%s]", this.f33871a);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.proximity.a$e */
    class C11688e extends C11505g {

        /* renamed from: b */
        final /* synthetic */ ProximityMessageResponse f33873b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11688e(String str, Object[] objArr, ProximityMessageResponse proximityMessageResponse) {
            super(str, objArr);
            this.f33873b = proximityMessageResponse;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11808c b = C11683a.this.f33858d.mo31604b();
            C11802l t = C11683a.this.f33858d.mo31623t();
            List<Region> a = t.mo31572a(3, C11683a.this.f33858d.mo31604b());
            if (!a.isEmpty()) {
                Collections.sort(a);
            }
            t.mo31576d(3);
            C11801k s = C11683a.this.f33858d.mo31622s();
            if (!this.f33873b.beacons().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Region next : this.f33873b.beacons()) {
                    try {
                        boolean z = false;
                        for (Message next2 : next.messages()) {
                            C11604b.m42348a(next2, s, b);
                            s.mo31567a(next2, b);
                            z = true;
                        }
                        if (z) {
                            int binarySearch = Collections.binarySearch(a, next);
                            if (binarySearch >= 0) {
                                C11509j.m42064a(next, C11509j.m42065a(a.remove(binarySearch)));
                            }
                            t.mo31574a(next, b);
                            arrayList.add(new C11709c(next));
                        }
                    } catch (Exception e) {
                        C11461g.m41885b(C11683a.f33857j, e, "Unable to start monitoring proximity region: %s", next.mo30395id());
                    }
                }
                C11461g.m41880a(C11683a.f33857j, "Monitoring beacons from request [%s]", arrayList);
                C11683a.this.f33859e.mo30978a((List<C11709c>) arrayList);
            }
            if (!a.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(a.size());
                for (Region cVar : a) {
                    arrayList2.add(new C11709c(cVar));
                }
                C11461g.m41880a(C11683a.f33857j, "Unmonitoring beacons [%s]", arrayList2);
                C11683a.this.f33859e.mo30981b((List<C11709c>) arrayList2);
            }
        }
    }

    public C11683a(C11800j jVar, C11712e eVar, C11481c cVar, C11513l lVar, C11605c.C11606a aVar) {
        this.f33858d = jVar;
        this.f33859e = eVar;
        this.f33861g = cVar;
        this.f33862h = lVar;
        this.f33860f = aVar;
        cVar.mo30021a(C11474a.PROXIMITY_MESSAGES, (C11481c.C11484c) this);
    }

    /* renamed from: a */
    public void mo30427a() {
        this.f33859e.mo30977a((C11712e.C11713a) this);
    }

    /* renamed from: b */
    public void mo30429b() {
        C11461g.m41888c(f33857j, "monitorStoredRegions", new Object[0]);
        try {
            List<Region> a = this.f33858d.mo31623t().mo31572a(3, this.f33858d.mo31604b());
            if (!a.isEmpty()) {
                ArrayList arrayList = new ArrayList(a.size());
                for (Region cVar : a) {
                    arrayList.add(new C11709c(cVar));
                }
                C11461g.m41880a(f33857j, "Monitoring beacons [%s]", arrayList);
                this.f33859e.mo30978a((List<C11709c>) arrayList);
            }
        } catch (Exception unused) {
            C11461g.m41884b(f33857j, "Unable to monitor stored proximity regions.", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo30430c() {
        this.f33859e.mo30983c();
        this.f33859e.mo30980b((C11712e.C11713a) this);
        this.f33862h.mo30089b().execute(new C11685b("disable_beacon_tracking", new Object[0]));
    }

    /* renamed from: d */
    public boolean mo30854d() {
        return this.f33859e.mo30982b();
    }

    /* renamed from: a */
    public void mo29793a(C11476b bVar, C11486d dVar) {
        if (dVar.mo30033g()) {
            try {
                mo30851a(new ProximityMessageResponse(new JSONObject(dVar.mo30026a())));
            } catch (Exception e) {
                C11461g.m41885b(f33857j, e, "Error parsing response.", new Object[0]);
            }
        } else {
            C11461g.m41888c(f33857j, "Request failed: %d - %s", Integer.valueOf(dVar.mo30027b()), dVar.mo30031e());
        }
    }

    /* renamed from: b */
    public void mo30853b(C11709c cVar) {
        C11461g.m41891d(f33857j, "Proximity region (%s) entered.", cVar.mo30993f());
        this.f33862h.mo30089b().execute(new C11686c("", new Object[0], cVar));
    }

    /* renamed from: a */
    public void mo30428a(LatLon latLon, String str, MarketingCloudConfig marketingCloudConfig, C11605c.C11607b bVar) {
        this.f33863i = bVar;
        try {
            MarketingCloudSdk.requestSdk(new C11684a(marketingCloudConfig, str, latLon));
        } catch (Exception e) {
            C11461g.m41885b(f33857j, e, "Failed to update proximity messages", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30851a(ProximityMessageResponse proximityMessageResponse) {
        C11461g.m41888c(f33857j, "Proximity message request contained %d regions", Integer.valueOf(proximityMessageResponse.beacons().size()));
        C11605c.C11607b bVar = this.f33863i;
        if (bVar != null) {
            bVar.mo30434a(proximityMessageResponse);
        }
        this.f33862h.mo30089b().execute(new C11688e("beacon_response", new Object[0], proximityMessageResponse));
    }

    /* renamed from: a */
    public void mo30852a(C11709c cVar) {
        C11461g.m41891d(f33857j, "Proximity region (%s) exited.", cVar.mo30993f());
        this.f33862h.mo30089b().execute(new C11687d(cVar));
    }

    /* renamed from: a */
    public static void m42615a(C11800j jVar, C11712e eVar, C11481c cVar, boolean z) {
        eVar.mo30983c();
        if (z) {
            jVar.mo31623t().mo31576d(3);
            jVar.mo31622s().mo31570f(5);
        }
        cVar.mo30020a(C11474a.PROXIMITY_MESSAGES);
    }
}
