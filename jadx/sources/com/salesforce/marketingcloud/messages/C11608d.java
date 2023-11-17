package com.salesforce.marketingcloud.messages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.collection.ArraySet;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.C11419e;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11403b;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.internal.C11503f;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11506h;
import com.salesforce.marketingcloud.internal.C11509j;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.location.C11539b;
import com.salesforce.marketingcloud.location.C11543c;
import com.salesforce.marketingcloud.location.C11547e;
import com.salesforce.marketingcloud.location.C11548f;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.C11605c;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.geofence.C11617a;
import com.salesforce.marketingcloud.messages.geofence.GeofenceMessageResponse;
import com.salesforce.marketingcloud.messages.proximity.C11683a;
import com.salesforce.marketingcloud.messages.proximity.ProximityMessageResponse;
import com.salesforce.marketingcloud.notifications.C11695a;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.proximity.C11712e;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.C11802l;
import com.salesforce.marketingcloud.util.C11808c;
import com.salesforce.marketingcloud.util.C11819h;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.messages.d */
public class C11608d implements C11419e, RegionMessageManager, C11327b.C11329b, C11547e, C11403b, C11605c.C11607b, C11605c.C11606a, C11543c {

    /* renamed from: u */
    static final String f33667u = "et_geo_enabled_key";

    /* renamed from: v */
    static final String f33668v = "et_proximity_enabled_key";

    /* renamed from: w */
    static final int f33669w = 5000;

    /* renamed from: x */
    private static final String f33670x = "RegionMessageManager";

    /* renamed from: y */
    private static final float f33671y = 0.8f;

    /* renamed from: z */
    static final String f33672z = C11461g.m41875a(f33670x);

    /* renamed from: d */
    final C11800j f33673d;

    /* renamed from: e */
    private final C11327b f33674e;

    /* renamed from: f */
    private final C11548f f33675f;

    /* renamed from: g */
    private final C11712e f33676g;

    /* renamed from: h */
    private final MarketingCloudConfig f33677h;

    /* renamed from: i */
    private final String f33678i;

    /* renamed from: j */
    private final Context f33679j;

    /* renamed from: k */
    private final C11695a f33680k;

    /* renamed from: l */
    private final C11404c f33681l;

    /* renamed from: m */
    private final C11481c f33682m;

    /* renamed from: n */
    private final Set<RegionMessageManager.GeofenceMessageResponseListener> f33683n = new ArraySet();

    /* renamed from: o */
    private final Set<RegionMessageManager.ProximityMessageResponseListener> f33684o = new ArraySet();

    /* renamed from: p */
    private final Set<RegionMessageManager.RegionTransitionEventListener> f33685p;

    /* renamed from: q */
    private final AtomicBoolean f33686q;

    /* renamed from: r */
    private final C11513l f33687r;

    /* renamed from: s */
    private C11617a f33688s;

    /* renamed from: t */
    private C11683a f33689t;

    /* renamed from: com.salesforce.marketingcloud.messages.d$a */
    class C11609a extends C11505g {
        C11609a(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            LatLon e;
            C11800j jVar = C11608d.this.f33673d;
            if (jVar != null && (e = jVar.mo31621r().mo31563e(C11608d.this.f33673d.mo31604b())) != null) {
                C11608d.this.mo30435a(e);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.d$b */
    class C11610b extends C11505g {
        C11610b(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            LatLon e;
            C11800j jVar = C11608d.this.f33673d;
            if (jVar != null && (e = jVar.mo31621r().mo31563e(C11608d.this.f33673d.mo31604b())) != null) {
                C11608d.this.mo30438b(e);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.d$c */
    class C11611c extends C11505g {
        C11611c(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11608d.this.f33673d.mo31623t().mo31579l();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.d$d */
    class C11612d extends C11505g {

        /* renamed from: b */
        final /* synthetic */ LatLon f33693b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11612d(String str, Object[] objArr, LatLon latLon) {
            super(str, objArr);
            this.f33693b = latLon;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            try {
                C11608d dVar = C11608d.this;
                boolean a = dVar.mo30437a(this.f33693b, dVar.f33673d.mo31623t().mo31578h(C11608d.this.f33673d.mo31604b()));
                C11608d.this.f33673d.mo31621r().mo31561a(this.f33693b, C11608d.this.f33673d.mo31604b());
                if (a) {
                    C11608d.this.mo30436a(this.f33693b, (int) C11608d.f33669w);
                    C11608d.this.mo30435a(this.f33693b);
                    C11608d.this.mo30438b(this.f33693b);
                }
            } catch (Exception e) {
                C11461g.m41885b(C11608d.f33672z, e, "Unable to store last location", new Object[0]);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.d$e */
    class C11613e extends C11505g {

        /* renamed from: b */
        final /* synthetic */ Region f33695b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11613e(String str, Object[] objArr, Region region) {
            super(str, objArr);
            this.f33695b = region;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            try {
                C11608d.this.f33673d.mo31623t().mo31574a(this.f33695b, C11608d.this.f33673d.mo31604b());
            } catch (Exception e) {
                C11461g.m41885b(C11608d.f33672z, e, "Unable to set magic region", new Object[0]);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.d$f */
    class C11614f implements C11695a.C11697b {

        /* renamed from: a */
        final /* synthetic */ Message f33697a;

        C11614f(Message message) {
            this.f33697a = message;
        }

        /* renamed from: a */
        public void mo30439a(int i) {
            if (i != -1) {
                try {
                    C11503f.m42035a(this.f33697a, i);
                    C11608d.this.f33673d.mo31622s().mo31567a(this.f33697a, C11608d.this.f33673d.mo31604b());
                } catch (Exception e) {
                    C11461g.m41885b(C11608d.f33672z, e, "Unable to update message id with notification id.", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.d$g */
    static /* synthetic */ class C11615g {

        /* renamed from: a */
        static final /* synthetic */ int[] f33699a;

        /* renamed from: b */
        static final /* synthetic */ int[] f33700b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|(2:7|8)|9|(3:11|12|14)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|(2:7|8)|9|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.salesforce.marketingcloud.behaviors.a[] r0 = com.salesforce.marketingcloud.behaviors.C11402a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33700b = r0
                r1 = 1
                com.salesforce.marketingcloud.behaviors.a r2 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_DEVICE_BOOT_COMPLETE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33700b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.behaviors.a r2 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_PACKAGE_REPLACED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33700b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.behaviors.a r2 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_DEVICE_SHUTDOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33700b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.salesforce.marketingcloud.behaviors.a r2 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_FOREGROUNDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.salesforce.marketingcloud.alarms.a$b[] r0 = com.salesforce.marketingcloud.alarms.C11307a.C11309b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33699a = r0
                com.salesforce.marketingcloud.alarms.a$b r2 = com.salesforce.marketingcloud.alarms.C11307a.C11309b.FETCH_REGION_MESSAGES_DAILY     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.C11608d.C11615g.<clinit>():void");
        }
    }

    public C11608d(Context context, MarketingCloudConfig marketingCloudConfig, C11800j jVar, String str, C11548f fVar, C11712e eVar, C11404c cVar, C11327b bVar, C11481c cVar2, C11695a aVar, C11513l lVar, RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        ArraySet arraySet = new ArraySet();
        this.f33685p = arraySet;
        this.f33686q = new AtomicBoolean(false);
        this.f33679j = context;
        this.f33673d = jVar;
        this.f33675f = fVar;
        this.f33676g = eVar;
        this.f33680k = aVar;
        this.f33674e = bVar;
        this.f33681l = cVar;
        this.f33682m = cVar2;
        this.f33678i = str;
        this.f33677h = marketingCloudConfig;
        arraySet.add(regionTransitionEventListener);
        this.f33687r = lVar;
    }

    /* renamed from: a */
    private void m42360a() {
        if (!isProximityMessagingEnabled() && !isGeofenceMessagingEnabled()) {
            this.f33674e.mo29680d(C11307a.C11309b.FETCH_REGION_MESSAGES_DAILY);
        }
    }

    /* renamed from: b */
    private void m42364b() {
        disableProximityMessaging();
        disableGeofenceMessaging();
    }

    /* renamed from: c */
    private static C11539b m42368c(Region region) {
        return new C11539b(region.mo30395id(), 0.8f * ((float) region.radius()), region.center().latitude(), region.center().longitude(), 2);
    }

    /* renamed from: d */
    private void m42371d() {
        if (Build.VERSION.SDK_INT < 29) {
            C11461g.m41880a(f33672z, "Missing %s", "android.permission.ACCESS_FINE_LOCATION");
            return;
        }
        C11461g.m41880a(f33672z, "Missing %s or %s", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    /* renamed from: e */
    private void m42374e() {
        if (isGeofenceMessagingEnabled() && m42363a(true)) {
            this.f33688s.mo30429b();
        }
        if (isProximityMessagingEnabled() && m42367b(true)) {
            this.f33689t.mo30429b();
        }
    }

    /* renamed from: f */
    private void m42375f() {
        this.f33687r.mo30089b().execute(new C11611c("reset_flags", new Object[0]));
    }

    /* renamed from: g */
    private void m42376g() {
        if (isGeofenceMessagingEnabled()) {
            this.f33687r.mo30089b().execute(new C11609a("update_geofence", new Object[0]));
        }
    }

    /* renamed from: h */
    private void m42377h() {
        if (isProximityMessagingEnabled()) {
            this.f33687r.mo30089b().execute(new C11610b("update_proximity", new Object[0]));
        }
    }

    public final String componentName() {
        return f33670x;
    }

    public final JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("geofenceMessagingEnabled", isGeofenceMessagingEnabled());
            jSONObject.put("proximityMessagingEnabled", isProximityMessagingEnabled());
            C11802l t = this.f33673d.mo31623t();
            C11808c b = this.f33673d.mo31604b();
            if (t != null) {
                Region h = t.mo31578h(b);
                if (h != null) {
                    jSONObject.put("magic_fence", h);
                }
                jSONObject.put("geofence_regions", t.mo31572a(1, b));
                jSONObject.put("geofence_region_messages", this.f33673d.mo31622s().mo31566a(b));
                jSONObject.put("proximity_regions", t.mo31572a(3, b));
                jSONObject.put("proximity_region_messages", this.f33673d.mo31622s().mo31569b(b));
                jSONObject.put("boot_complete_permission", C11819h.m43266a(this.f33679j, "android.permission.RECEIVE_BOOT_COMPLETED"));
            }
        } catch (Exception e) {
            C11461g.m41881a(f33672z, (Throwable) e, "Error creating RegionMessageManager state.", new Object[0]);
        }
        return jSONObject;
    }

    public final synchronized void controlChannelInit(int i) {
        if (C11398b.m41709a(i, 32)) {
            disableGeofenceMessaging();
            this.f33688s = null;
            C11617a.m42399a(this.f33673d, this.f33675f, this.f33682m, C11398b.m41711c(i, 32));
        } else if (this.f33688s == null && this.f33677h.geofencingEnabled()) {
            m42362a((InitializationStatus.C11293a) null);
        }
        if (C11398b.m41709a(i, 64)) {
            disableProximityMessaging();
            this.f33689t = null;
            C11683a.m42615a(this.f33673d, this.f33676g, this.f33682m, C11398b.m41711c(i, 64));
        } else if (this.f33689t == null && this.f33677h.proximityEnabled()) {
            m42365b((InitializationStatus.C11293a) null);
        }
        if (C11398b.m41709a(i, 96)) {
            this.f33675f.mo30129b((C11543c) this);
            this.f33675f.mo30130b((C11547e) this);
            this.f33681l.mo29850a((C11403b) this);
            this.f33673d.mo31621r().mo31562c();
            C11327b bVar = this.f33674e;
            C11307a.C11309b bVar2 = C11307a.C11309b.FETCH_REGION_MESSAGES_DAILY;
            bVar.mo29681e(bVar2);
            this.f33674e.mo29680d(bVar2);
        } else {
            this.f33681l.mo29851a(this, EnumSet.of(C11402a.BEHAVIOR_DEVICE_BOOT_COMPLETE, C11402a.BEHAVIOR_APP_PACKAGE_REPLACED, C11402a.BEHAVIOR_DEVICE_SHUTDOWN, C11402a.BEHAVIOR_APP_FOREGROUNDED));
            this.f33675f.mo30124a((C11543c) this);
        }
    }

    public final synchronized void disableGeofenceMessaging() {
        C11461g.m41880a(f33672z, "Disabling geofence messaging", new Object[0]);
        if (isGeofenceMessagingEnabled()) {
            C11800j jVar = this.f33673d;
            if (jVar != null) {
                jVar.mo31608f().edit().putBoolean(f33667u, false).apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, false);
            C11404c.m41719a(this.f33679j, C11402a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, bundle);
            C11617a aVar = this.f33688s;
            if (aVar != null) {
                aVar.mo30430c();
            }
        }
        m42360a();
    }

    public final synchronized void disableProximityMessaging() {
        C11461g.m41880a(f33672z, "Disabling proximity messaging", new Object[0]);
        if (isProximityMessagingEnabled()) {
            C11800j jVar = this.f33673d;
            if (jVar != null) {
                jVar.mo31608f().edit().putBoolean(f33668v, false).apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, false);
            C11404c.m41719a(this.f33679j, C11402a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, bundle);
            C11683a aVar = this.f33689t;
            if (aVar != null) {
                aVar.mo30430c();
            }
        }
        m42360a();
    }

    @SuppressLint({"MissingPermission"})
    public final synchronized boolean enableGeofenceMessaging() {
        return m42370c(false);
    }

    @SuppressLint({"MissingPermission"})
    public final synchronized boolean enableProximityMessaging() {
        return m42373d(false);
    }

    public final synchronized void init(InitializationStatus.C11293a aVar, int i) {
        if (!C11398b.m41710b(i, 32) || !this.f33677h.geofencingEnabled()) {
            this.f33688s = null;
        } else {
            m42362a(aVar);
        }
        if (!C11398b.m41710b(i, 64) || !this.f33677h.proximityEnabled()) {
            this.f33689t = null;
        } else {
            m42365b(aVar);
        }
        if (!(this.f33688s == null && this.f33689t == null)) {
            this.f33681l.mo29851a(this, EnumSet.of(C11402a.BEHAVIOR_DEVICE_BOOT_COMPLETE, C11402a.BEHAVIOR_APP_PACKAGE_REPLACED, C11402a.BEHAVIOR_DEVICE_SHUTDOWN, C11402a.BEHAVIOR_APP_FOREGROUNDED));
            this.f33675f.mo30124a((C11543c) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r3.f33673d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isGeofenceMessagingEnabled() {
        /*
            r3 = this;
            com.salesforce.marketingcloud.MarketingCloudConfig r0 = r3.f33677h
            boolean r0 = r0.geofencingEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.salesforce.marketingcloud.storage.j r0 = r3.f33673d
            if (r0 == 0) goto L_0x001a
            android.content.SharedPreferences r0 = r0.mo31608f()
            java.lang.String r2 = "et_geo_enabled_key"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.C11608d.isGeofenceMessagingEnabled():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r3.f33673d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isProximityMessagingEnabled() {
        /*
            r3 = this;
            com.salesforce.marketingcloud.MarketingCloudConfig r0 = r3.f33677h
            boolean r0 = r0.proximityEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.salesforce.marketingcloud.storage.j r0 = r3.f33673d
            if (r0 == 0) goto L_0x001a
            android.content.SharedPreferences r0 = r0.mo31608f()
            java.lang.String r2 = "et_proximity_enabled_key"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.C11608d.isProximityMessagingEnabled():boolean");
    }

    public final void onBehavior(C11402a aVar, Bundle bundle) {
        if (aVar != null) {
            int i = C11615g.f33700b[aVar.ordinal()];
            if (i == 1) {
                m42375f();
            } else if (i != 2) {
                if (i == 3) {
                    m42375f();
                    return;
                } else if (i == 4) {
                    m42376g();
                    m42377h();
                    if (isGeofenceMessagingEnabled() || isProximityMessagingEnabled()) {
                        C11327b bVar = this.f33674e;
                        C11307a.C11309b bVar2 = C11307a.C11309b.FETCH_REGION_MESSAGES_DAILY;
                        bVar.mo29680d(bVar2);
                        this.f33674e.mo29675b(bVar2);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            m42374e();
        }
    }

    public final void registerGeofenceMessageResponseListener(RegionMessageManager.GeofenceMessageResponseListener geofenceMessageResponseListener) {
        if (geofenceMessageResponseListener != null) {
            synchronized (this.f33683n) {
                this.f33683n.add(geofenceMessageResponseListener);
            }
        }
    }

    public final void registerProximityMessageResponseListener(RegionMessageManager.ProximityMessageResponseListener proximityMessageResponseListener) {
        if (proximityMessageResponseListener != null) {
            synchronized (this.f33684o) {
                this.f33684o.add(proximityMessageResponseListener);
            }
        }
    }

    public final void registerRegionTransitionEventListener(RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        if (regionTransitionEventListener != null) {
            synchronized (this.f33685p) {
                this.f33685p.add(regionTransitionEventListener);
            }
        }
    }

    public void tearDown(boolean z) {
    }

    public final void unregisterGeofenceMessageResponseListener(RegionMessageManager.GeofenceMessageResponseListener geofenceMessageResponseListener) {
        synchronized (this.f33683n) {
            this.f33683n.remove(geofenceMessageResponseListener);
        }
    }

    public final void unregisterProximityMessageResponseListener(RegionMessageManager.ProximityMessageResponseListener proximityMessageResponseListener) {
        synchronized (this.f33684o) {
            this.f33684o.remove(proximityMessageResponseListener);
        }
    }

    public final void unregisterRegionTransitionEventListener(RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        synchronized (this.f33685p) {
            this.f33685p.remove(regionTransitionEventListener);
        }
    }

    /* renamed from: a */
    private void m42361a(int i, Region region) {
        synchronized (this.f33685p) {
            if (!this.f33685p.isEmpty()) {
                for (RegionMessageManager.RegionTransitionEventListener next : this.f33685p) {
                    if (next != null) {
                        try {
                            next.onTransitionEvent(i, region);
                        } catch (Exception e) {
                            C11461g.m41885b(f33672z, e, "%s threw an exception while processing the region (%s) transition (%d)", next.getClass().getName(), region.mo30395id(), Integer.valueOf(i));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m42365b(InitializationStatus.C11293a aVar) {
        this.f33689t = new C11683a(this.f33673d, this.f33676g, this.f33682m, this.f33687r, this);
        this.f33674e.mo29671a((C11327b.C11329b) this, C11307a.C11309b.FETCH_REGION_MESSAGES_DAILY);
        if (isProximityMessagingEnabled()) {
            if (!m42373d(true)) {
                disableProximityMessaging();
            }
            if (aVar != null) {
                aVar.mo29535c(!C11819h.m43268b(this.f33679j));
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    private boolean m42369c() {
        if (this.f33688s == null && this.f33689t == null) {
            return false;
        }
        if (this.f33686q.compareAndSet(false, true)) {
            try {
                this.f33675f.mo30125a((C11547e) this);
            } catch (Exception e) {
                C11461g.m41885b(f33672z, e, "Unable to request location update", new Object[0]);
                m42364b();
                return false;
            }
        }
        this.f33674e.mo29675b(C11307a.C11309b.FETCH_REGION_MESSAGES_DAILY);
        return true;
    }

    /* renamed from: d */
    private void m42372d(Region region) {
        this.f33687r.mo30089b().execute(new C11613e("storing_fence", new Object[0], region));
    }

    /* renamed from: c */
    private synchronized boolean m42370c(boolean z) {
        if (!m42363a(z)) {
            return false;
        }
        C11461g.m41891d(f33672z, "Enabling geofence messaging", new Object[0]);
        if (!z) {
            C11800j jVar = this.f33673d;
            if (jVar != null) {
                jVar.mo31608f().edit().putBoolean(f33667u, true).apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, true);
            C11404c.m41719a(this.f33679j, C11402a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, bundle);
        }
        this.f33688s.mo30427a();
        return m42369c();
    }

    /* renamed from: d */
    private boolean m42373d(boolean z) {
        if (!m42367b(z)) {
            return false;
        }
        C11461g.m41891d(f33672z, "Enabling proximity messaging.", new Object[0]);
        if (!z) {
            C11800j jVar = this.f33673d;
            if (jVar != null) {
                jVar.mo31608f().edit().putBoolean(f33668v, true).apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, true);
            C11404c.m41719a(this.f33679j, C11402a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, bundle);
        } else {
            this.f33689t.mo30429b();
        }
        this.f33689t.mo30427a();
        return m42369c();
    }

    /* renamed from: a */
    public final void mo30145a(int i, String str) {
        C11461g.m41880a(f33672z, "Region error %d - %s", Integer.valueOf(i), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30438b(LatLon latLon) {
        C11683a aVar;
        if (!isProximityMessagingEnabled() || (aVar = this.f33689t) == null || latLon == null) {
            C11461g.m41880a(f33672z, "Tried to update proximity messages, but was not enabled.", new Object[0]);
        } else {
            aVar.mo30428a(latLon, this.f33678i, this.f33677h, (C11605c.C11607b) this);
        }
    }

    /* renamed from: b */
    private void m42366b(MessageResponse messageResponse) {
        if (messageResponse instanceof GeofenceMessageResponse) {
            synchronized (this.f33683n) {
                if (!this.f33683n.isEmpty()) {
                    for (RegionMessageManager.GeofenceMessageResponseListener next : this.f33683n) {
                        if (next != null) {
                            try {
                                next.onGeofenceMessageResponse((GeofenceMessageResponse) messageResponse);
                            } catch (Exception e) {
                                C11461g.m41885b(f33672z, e, "%s threw an exception while processing the geofence response", next.getClass().getName());
                            }
                        }
                    }
                }
            }
        } else if (messageResponse instanceof ProximityMessageResponse) {
            synchronized (this.f33684o) {
                if (!this.f33684o.isEmpty()) {
                    for (RegionMessageManager.ProximityMessageResponseListener next2 : this.f33684o) {
                        if (next2 != null) {
                            try {
                                next2.onProximityMessageResponse((ProximityMessageResponse) messageResponse);
                            } catch (Exception e2) {
                                C11461g.m41885b(f33672z, e2, "%s threw an exception while processing the proximity response", next2.getClass().getName());
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo30154a(Location location) {
        this.f33686q.set(false);
        if (location != null) {
            try {
                this.f33687r.mo30089b().execute(new C11612d("store_latlon", new Object[0], new LatLon(location.getLatitude(), location.getLongitude())));
            } catch (Exception e) {
                C11461g.m41885b(f33672z, e, "Unable to make geofence message request after location update", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private void m42362a(InitializationStatus.C11293a aVar) {
        this.f33688s = new C11617a(this.f33673d, this.f33675f, this.f33682m, this.f33687r, this);
        this.f33674e.mo29671a((C11327b.C11329b) this, C11307a.C11309b.FETCH_REGION_MESSAGES_DAILY);
        if (isGeofenceMessagingEnabled()) {
            if (!m42370c(true)) {
                disableGeofenceMessaging();
            }
            if (aVar != null) {
                aVar.mo29535c(!C11819h.m43268b(this.f33679j));
            }
        }
    }

    /* renamed from: b */
    public void mo30433b(Region region) {
        m42361a(1, region);
    }

    /* renamed from: b */
    private boolean m42367b(boolean z) {
        C11683a aVar;
        if (!z && isProximityMessagingEnabled()) {
            C11461g.m41880a(f33672z, "Proximity messaging is already enabled.", new Object[0]);
            return false;
        } else if (!this.f33677h.proximityEnabled() || (aVar = this.f33689t) == null) {
            C11461g.m41880a(f33672z, "Proximity messaging was not enabled while configuring the SDK.  Messaging will not be enabled.", new Object[0]);
            return false;
        } else if (!aVar.mo30854d() || !this.f33675f.mo30155a()) {
            C11461g.m41880a(f33672z, "Proximity messaging was not enabled due to device limitation.", new Object[0]);
            return false;
        } else if (C11819h.m43268b(this.f33679j)) {
            return true;
        } else {
            m42371d();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo29684a(C11307a.C11309b bVar) {
        if (C11615g.f33699a[bVar.ordinal()] == 1) {
            m42376g();
            m42377h();
            if (isGeofenceMessagingEnabled() || isProximityMessagingEnabled()) {
                this.f33674e.mo29675b(C11307a.C11309b.FETCH_REGION_MESSAGES_DAILY);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30435a(LatLon latLon) {
        C11617a aVar;
        if (!isGeofenceMessagingEnabled() || (aVar = this.f33688s) == null || latLon == null) {
            C11461g.m41880a(f33672z, "Tried to update geofence messages, but was not enabled.", new Object[0]);
        } else {
            aVar.mo30428a(latLon, this.f33678i, this.f33677h, (C11605c.C11607b) this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30436a(LatLon latLon, int i) {
        if (C11819h.m43268b(this.f33679j)) {
            Region a = C11509j.m42063a(latLon, i);
            m42372d(a);
            this.f33675f.mo30127a(m42368c(a));
        }
    }

    /* renamed from: a */
    public final void mo30434a(MessageResponse messageResponse) {
        if (messageResponse != null) {
            m42366b(messageResponse);
            try {
                Region a = C11509j.m42063a(messageResponse.getRefreshCenter(), messageResponse.getRefreshRadius());
                m42372d(a);
                this.f33675f.mo30127a(m42368c(a));
            } catch (Exception e) {
                C11461g.m41885b(f33672z, e, "Failed to updated radius for magic region.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo30431a(Region region) {
        m42361a(2, region);
    }

    /* renamed from: a */
    public final void mo30432a(Region region, Message message) {
        if (region != null && message != null) {
            C11461g.m41891d(f33672z, "showMessage(%s, %s)", region.mo30395id(), message.mo30330id());
            NotificationMessage a = C11506h.m42055a(message, region);
            if (a != null && C11604b.m42351c(message)) {
                try {
                    C11604b.m42347a(message, this.f33673d);
                    this.f33680k.mo30952a(a, new C11614f(message));
                } catch (Exception e) {
                    C11461g.m41885b(f33672z, e, "Failed to show message", new Object[0]);
                }
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public final void mo30146a(String str, int i, Location location) {
        if (i == 2 && Region.MAGIC_REGION_ID.equals(str)) {
            String str2 = f33672z;
            C11461g.m41891d(str2, "MagicRegion exited", new Object[0]);
            if (!C11819h.m43268b(this.f33679j)) {
                C11461g.m41880a(str2, "MagicRegion exited, but was missing location permission.", new Object[0]);
                m42364b();
            } else if (location != null) {
                mo30154a(location);
            } else {
                this.f33675f.mo30125a((C11547e) this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo30437a(LatLon latLon, Region region) {
        if (region == null) {
            return true;
        }
        try {
            float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
            Location.distanceBetween(latLon.latitude(), latLon.longitude(), region.center().latitude(), region.center().longitude(), fArr);
            return fArr[0] > ((float) region.radius()) * 0.8f;
        } catch (Exception unused) {
            C11461g.m41884b(f33672z, "An error occurred while calculating distance between last known location and the current location.", new Object[0]);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m42363a(boolean z) {
        C11617a aVar;
        if (!z && isGeofenceMessagingEnabled()) {
            C11461g.m41880a(f33672z, "Geofence messaging is already enabled", new Object[0]);
            return false;
        } else if (!this.f33677h.geofencingEnabled() || (aVar = this.f33688s) == null) {
            C11461g.m41880a(f33672z, "Geofence was not enabled while configuring the SDK.  Messaging will not be enabled", new Object[0]);
            return false;
        } else if (!aVar.mo30448d()) {
            C11461g.m41880a(f33672z, "Geofence messaging was not enabled due to device limitation.", new Object[0]);
            return false;
        } else if (C11819h.m43268b(this.f33679j)) {
            return true;
        } else {
            m42371d();
            return false;
        }
    }
}
