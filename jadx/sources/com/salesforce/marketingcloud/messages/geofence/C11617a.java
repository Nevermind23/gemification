package com.salesforce.marketingcloud.messages.geofence;

import android.annotation.SuppressLint;
import android.location.Location;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.location.C11539b;
import com.salesforce.marketingcloud.location.C11543c;
import com.salesforce.marketingcloud.location.C11548f;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.C11604b;
import com.salesforce.marketingcloud.messages.C11605c;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.C11801k;
import com.salesforce.marketingcloud.storage.C11802l;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.messages.geofence.a */
public final class C11617a implements C11605c, C11543c, C11481c.C11484c {

    /* renamed from: k */
    static final String f33702k = C11461g.m41875a("GeofenceMessageManager");

    /* renamed from: d */
    final C11548f f33703d;

    /* renamed from: e */
    final C11800j f33704e;

    /* renamed from: f */
    final C11605c.C11606a f33705f;

    /* renamed from: g */
    final C11481c f33706g;

    /* renamed from: h */
    private final C11513l f33707h;

    /* renamed from: i */
    AtomicBoolean f33708i = new AtomicBoolean(false);

    /* renamed from: j */
    private C11605c.C11607b f33709j;

    /* renamed from: com.salesforce.marketingcloud.messages.geofence.a$a */
    class C11618a implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a */
        final /* synthetic */ MarketingCloudConfig f33710a;

        /* renamed from: b */
        final /* synthetic */ String f33711b;

        /* renamed from: c */
        final /* synthetic */ LatLon f33712c;

        C11618a(MarketingCloudConfig marketingCloudConfig, String str, LatLon latLon) {
            this.f33710a = marketingCloudConfig;
            this.f33711b = str;
            this.f33712c = latLon;
        }

        public void ready(MarketingCloudSdk marketingCloudSdk) {
            C11617a aVar = C11617a.this;
            aVar.f33706g.mo30022a(C11474a.GEOFENCE_MESSAGE.mo29979a(this.f33710a, aVar.f33704e.mo31606c(), C11474a.m41921a(this.f33710a.applicationId(), this.f33711b, this.f33712c)));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.geofence.a$b */
    class C11619b extends C11505g {

        /* renamed from: b */
        final /* synthetic */ String f33714b;

        /* renamed from: c */
        final /* synthetic */ int f33715c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11619b(String str, Object[] objArr, String str2, int i) {
            super(str, objArr);
            this.f33714b = str2;
            this.f33715c = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            int i;
            try {
                C11802l t = C11617a.this.f33704e.mo31623t();
                Region a = t.mo31571a(this.f33714b, C11617a.this.f33704e.mo31604b());
                if (a == null) {
                    C11461g.m41888c(C11617a.f33702k, "Removing stale geofence from being monitored.", new Object[0]);
                    C11617a.this.f33703d.mo30126a((List<String>) Collections.singletonList(this.f33714b));
                    return;
                }
                int i2 = this.f33715c;
                if (i2 == 1) {
                    C11617a.this.f33705f.mo30433b(a);
                    i = 3;
                } else if (i2 == 2) {
                    C11617a.this.f33705f.mo30431a(a);
                    i = 4;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    List<String> a2 = t.mo31573a(a.mo30395id(), i);
                    if (!a2.isEmpty()) {
                        C11801k s = C11617a.this.f33704e.mo31622s();
                        C11808c b = C11617a.this.f33704e.mo31604b();
                        for (String next : a2) {
                            Message a3 = s.mo31565a(next, b);
                            if (a3 != null) {
                                C11617a.this.f33705f.mo30432a(a, a3);
                            } else {
                                C11461g.m41880a(C11617a.f33702k, "Message with id [%s] not found", next);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C11461g.m41885b(C11617a.f33702k, e, "Geofence (%s - %d) was tripped, but failed to check for associated message", this.f33714b, Integer.valueOf(this.f33715c));
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.geofence.a$c */
    class C11620c extends C11505g {
        C11620c(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            List<String> e = C11617a.this.f33704e.mo31623t().mo31577e(1);
            if (!e.isEmpty()) {
                C11617a.this.f33703d.mo30126a(e);
            }
            C11617a.this.f33704e.mo31623t().mo31576d(1);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.geofence.a$d */
    class C11621d extends C11505g {

        /* renamed from: b */
        final /* synthetic */ GeofenceMessageResponse f33718b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11621d(String str, Object[] objArr, GeofenceMessageResponse geofenceMessageResponse) {
            super(str, objArr);
            this.f33718b = geofenceMessageResponse;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11802l t = C11617a.this.f33704e.mo31623t();
            List<String> e = t.mo31577e(1);
            t.mo31576d(1);
            C11801k s = C11617a.this.f33704e.mo31622s();
            C11808c b = C11617a.this.f33704e.mo31604b();
            if (!this.f33718b.fences().isEmpty()) {
                ArrayList<Region> arrayList = new ArrayList<>();
                for (Region next : this.f33718b.fences()) {
                    try {
                        boolean z = false;
                        for (Message next2 : next.messages()) {
                            C11604b.m42348a(next2, s, b);
                            s.mo31567a(next2, b);
                            z = true;
                        }
                        if (z) {
                            if (!e.remove(next.mo30395id())) {
                                arrayList.add(next);
                            }
                            t.mo31574a(next, b);
                        }
                    } catch (Exception e2) {
                        C11461g.m41885b(C11617a.f33702k, e2, "Unable to start monitoring geofence region: %s", next.mo30395id());
                    }
                }
                for (Region a : arrayList) {
                    C11617a.this.f33703d.mo30127a(C11617a.m42398a(a));
                }
            }
            if (!e.isEmpty()) {
                C11617a.this.f33703d.mo30126a(e);
            }
            C11617a.this.f33708i.set(true);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.geofence.a$e */
    class C11622e extends C11505g {
        C11622e(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            if (C11617a.this.f33708i.get()) {
                C11461g.m41891d(C11617a.f33702k, "Attempt to monitor fences from DB ignored, because they're already monitored.", new Object[0]);
            }
            C11461g.m41891d(C11617a.f33702k, "monitorStoredRegions", new Object[0]);
            try {
                List<Region> a = C11617a.this.f33704e.mo31623t().mo31572a(1, C11617a.this.f33704e.mo31604b());
                if (!a.isEmpty()) {
                    for (Region a2 : a) {
                        C11617a.this.f33703d.mo30127a(C11617a.m42398a(a2));
                    }
                }
            } catch (Exception e) {
                C11461g.m41885b(C11617a.f33702k, e, "Unable to monitor stored geofence regions.", new Object[0]);
            }
        }
    }

    public C11617a(C11800j jVar, C11548f fVar, C11481c cVar, C11513l lVar, C11605c.C11606a aVar) {
        this.f33704e = jVar;
        this.f33703d = fVar;
        this.f33706g = cVar;
        this.f33705f = aVar;
        this.f33707h = lVar;
        cVar.mo30021a(C11474a.GEOFENCE_MESSAGE, (C11481c.C11484c) this);
    }

    /* renamed from: a */
    private static int m42397a(int i) {
        if (i < 100) {
            return 100;
        }
        return i;
    }

    /* renamed from: b */
    public void mo30429b() {
        this.f33707h.mo30089b().execute(new C11622e("monitor_stored_regions", new Object[0]));
    }

    /* renamed from: c */
    public void mo30430c() {
        C11548f fVar = this.f33703d;
        if (fVar != null) {
            fVar.mo30129b((C11543c) this);
            if (this.f33704e != null) {
                this.f33707h.mo30089b().execute(new C11620c("disable_fence_tracking", new Object[0]));
            }
        }
        this.f33708i.set(false);
    }

    /* renamed from: d */
    public boolean mo30448d() {
        return this.f33703d.mo30155a();
    }

    /* renamed from: a */
    static C11539b m42398a(Region region) {
        return new C11539b(region.mo30395id(), (float) m42397a(region.radius()), region.center().latitude(), region.center().longitude(), 3);
    }

    /* renamed from: a */
    public void mo30427a() {
        this.f33703d.mo30124a((C11543c) this);
    }

    /* renamed from: a */
    public void mo30145a(int i, String str) {
        C11461g.m41880a(f33702k, "Region error %d - %s", Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public void mo29793a(C11476b bVar, C11486d dVar) {
        if (dVar.mo30033g()) {
            try {
                mo30447a(new GeofenceMessageResponse(new JSONObject(dVar.mo30026a())));
            } catch (Exception e) {
                C11461g.m41885b(f33702k, e, "Error parsing response.", new Object[0]);
            }
        } else {
            C11461g.m41888c(f33702k, "Request failed: %d - %s", Integer.valueOf(dVar.mo30027b()), dVar.mo30031e());
        }
    }

    /* renamed from: a */
    public void mo30428a(LatLon latLon, String str, MarketingCloudConfig marketingCloudConfig, C11605c.C11607b bVar) {
        this.f33709j = bVar;
        try {
            MarketingCloudSdk.requestSdk(new C11618a(marketingCloudConfig, str, latLon));
        } catch (Exception e) {
            C11461g.m41885b(f33702k, e, "Failed to update geofence messages", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30447a(GeofenceMessageResponse geofenceMessageResponse) {
        C11461g.m41888c(f33702k, "Geofence message request contained %d regions", Integer.valueOf(geofenceMessageResponse.fences().size()));
        C11605c.C11607b bVar = this.f33709j;
        if (bVar != null) {
            bVar.mo30434a(geofenceMessageResponse);
        }
        this.f33707h.mo30089b().execute(new C11621d("fence_response", new Object[0], geofenceMessageResponse));
    }

    /* renamed from: a */
    public static void m42399a(C11800j jVar, C11548f fVar, C11481c cVar, boolean z) {
        List<String> e = jVar.mo31623t().mo31577e(1);
        if (!e.isEmpty()) {
            fVar.mo30126a(e);
        }
        if (z) {
            jVar.mo31623t().mo31576d(1);
            C11801k s = jVar.mo31622s();
            s.mo31570f(3);
            s.mo31570f(4);
        }
        cVar.mo30020a(C11474a.GEOFENCE_MESSAGE);
    }

    /* renamed from: a */
    public void mo30146a(String str, int i, Location location) {
        String str2 = f33702k;
        C11461g.m41891d(str2, "Geofence (%s - %s) was tripped.", str, Integer.valueOf(i));
        if (i == 4) {
            C11461g.m41891d(str2, "Dwell transition ignore for %s", str);
            return;
        }
        this.f33707h.mo30089b().execute(new C11619b("fence_event", new Object[0], str, i));
    }
}
