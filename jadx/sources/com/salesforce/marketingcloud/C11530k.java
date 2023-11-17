package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.C11366l;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11403b;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.storage.C11800j;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.k */
public class C11530k implements C11419e, C11403b, C11481c.C11484c, C11327b.C11329b {

    /* renamed from: n */
    private static final String f33459n = C11461g.m41875a("SyncRouteComponent");

    /* renamed from: d */
    protected final MarketingCloudConfig f33460d;

    /* renamed from: e */
    protected final C11481c f33461e;

    /* renamed from: f */
    protected final C11800j f33462f;

    /* renamed from: g */
    protected final String f33463g;

    /* renamed from: h */
    private final C11513l f33464h;

    /* renamed from: i */
    private final C11404c f33465i;

    /* renamed from: j */
    private final C11327b f33466j;

    /* renamed from: k */
    private final C11366l f33467k;

    /* renamed from: l */
    protected Map<C11534d, C11535e> f33468l = new ArrayMap(C11534d.values().length);

    /* renamed from: m */
    private boolean f33469m;

    /* renamed from: com.salesforce.marketingcloud.k$a */
    class C11531a implements MarketingCloudSdk.WhenReadyListener {
        C11531a() {
        }

        public void ready(MarketingCloudSdk marketingCloudSdk) {
            C11530k kVar = C11530k.this;
            kVar.f33461e.mo30022a(C11474a.SYNC.mo29980a(kVar.f33460d, kVar.f33462f.mo31606c(), C11474a.m41924c(C11530k.this.f33460d.applicationId(), C11530k.this.f33463g), "{}"));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.k$b */
    class C11532b extends C11505g {

        /* renamed from: b */
        final /* synthetic */ C11534d f33471b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f33472c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11532b(String str, Object[] objArr, C11534d dVar, JSONObject jSONObject) {
            super(str, objArr);
            this.f33471b = dVar;
            this.f33472c = jSONObject;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11535e eVar = C11530k.this.f33468l.get(this.f33471b);
            if (eVar != null) {
                eVar.onSyncReceived(this.f33471b, this.f33472c);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.k$c */
    static /* synthetic */ class C11533c {

        /* renamed from: a */
        static final /* synthetic */ int[] f33474a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.salesforce.marketingcloud.behaviors.a[] r0 = com.salesforce.marketingcloud.behaviors.C11402a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33474a = r0
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_FOREGROUNDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33474a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_SDK_PUSH_RECEIVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.C11530k.C11533c.<clinit>():void");
        }
    }

    /* renamed from: com.salesforce.marketingcloud.k$d */
    public enum C11534d {
        blocked,
        inAppMessages,
        triggers,
        pushFeaturesInUse,
        appConfig
    }

    /* renamed from: com.salesforce.marketingcloud.k$e */
    public interface C11535e {
        void onSyncReceived(C11534d dVar, JSONObject jSONObject);
    }

    C11530k(String str, MarketingCloudConfig marketingCloudConfig, C11800j jVar, C11481c cVar, C11404c cVar2, C11327b bVar, C11366l lVar, C11513l lVar2) {
        this.f33463g = str;
        this.f33460d = marketingCloudConfig;
        this.f33462f = jVar;
        this.f33465i = cVar2;
        this.f33461e = cVar;
        this.f33466j = bVar;
        this.f33467k = lVar;
        this.f33464h = lVar2;
    }

    /* renamed from: a */
    private void m42116a() {
        if (m42121c()) {
            MarketingCloudSdk.requestSdk(mo30106b());
        }
    }

    /* renamed from: c */
    private boolean m42121c() {
        return !this.f33469m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public MarketingCloudSdk.WhenReadyListener mo30106b() {
        return new C11531a();
    }

    public String componentName() {
        return "SyncRoute";
    }

    public JSONObject componentState() {
        return null;
    }

    public void controlChannelInit(int i) {
        if (C11398b.m41709a(i, C11398b.C11401c.RTBF.f33155a)) {
            this.f33465i.mo29850a((C11403b) this);
            this.f33461e.mo30020a(C11474a.SYNC);
            C11327b bVar = this.f33466j;
            C11307a.C11309b bVar2 = C11307a.C11309b.SYNC;
            bVar.mo29681e(bVar2);
            this.f33466j.mo29680d(bVar2);
            this.f33469m = true;
        }
    }

    public void init(InitializationStatus.C11293a aVar, int i) {
        if (C11398b.m41709a(i, C11398b.C11401c.RTBF.f33155a)) {
            this.f33469m = true;
            return;
        }
        this.f33461e.mo30021a(C11474a.SYNC, (C11481c.C11484c) this);
        this.f33465i.mo29851a(this, EnumSet.of(C11402a.BEHAVIOR_APP_FOREGROUNDED, C11402a.BEHAVIOR_SDK_PUSH_RECEIVED));
        this.f33466j.mo29671a((C11327b.C11329b) this, C11307a.C11309b.SYNC);
    }

    public void onBehavior(C11402a aVar, Bundle bundle) {
        int i = C11533c.f33474a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (!bundle.containsKey("_sync")) {
                    if (bundle.containsKey("_nodes")) {
                        m42118a(bundle.getString("_nodes"));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        m42116a();
    }

    public void tearDown(boolean z) {
        this.f33465i.mo29850a((C11403b) this);
        this.f33461e.mo30020a(C11474a.SYNC);
        C11327b bVar = this.f33466j;
        C11307a.C11309b bVar2 = C11307a.C11309b.SYNC;
        bVar.mo29681e(bVar2);
        if (z) {
            this.f33466j.mo29680d(bVar2);
        }
    }

    /* renamed from: a */
    private void m42117a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            C11366l.C11367a aVar = C11366l.C11367a.SYNC_API;
            jSONObject.put(aVar.mo29808a(), j);
            this.f33467k.mo29801a(aVar, jSONObject);
        } catch (JSONException e) {
            C11461g.m41885b(f33459n, e, "Failed to log TelemetryEvent for Sync Route", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo29684a(C11307a.C11309b bVar) {
        if (bVar == C11307a.C11309b.SYNC) {
            m42116a();
        }
    }

    /* renamed from: a */
    public void mo29793a(C11476b bVar, C11486d dVar) {
        boolean z = true;
        if (dVar.mo30033g()) {
            this.f33466j.mo29680d(C11307a.C11309b.SYNC);
            C11474a.m41919a(dVar.mo30029d(), this.f33462f.mo31606c());
            m42117a(dVar.mo30034h());
            try {
                JSONArray jSONArray = new JSONObject(dVar.mo30026a()).getJSONArray("nodes");
                if (jSONArray != null) {
                    if (dVar.mo30027b() != 202) {
                        z = false;
                    }
                    m42119a(jSONArray, z);
                }
            } catch (Exception e) {
                C11461g.m41885b(f33459n, e, "Failed to parse /sync route response", new Object[0]);
            }
        } else {
            this.f33466j.mo29675b(C11307a.C11309b.SYNC);
            C11461g.m41884b(f33459n, "Sync route request failed with message: %s", dVar.mo30031e());
        }
    }

    /* renamed from: a */
    public void mo30104a(C11534d dVar, C11535e eVar) {
        C11535e eVar2 = this.f33468l.get(dVar);
        if (eVar2 == null || eVar == null || eVar2 == eVar) {
            this.f33468l.put(dVar, eVar);
            return;
        }
        C11461g.m41894e(f33459n, "Node %s already assigned to listener %s.  %s was not added for the Node.", dVar, eVar2, eVar);
    }

    /* renamed from: a */
    private void m42118a(String str) {
        if (str != null) {
            try {
                m42119a(new JSONArray(str), true);
            } catch (Exception e) {
                C11461g.m41885b(f33459n, e, "Failed to parse sync push message", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo30105a(EnumSet<C11534d> enumSet, C11535e eVar) {
        Iterator<C11534d> it = enumSet.iterator();
        while (it.hasNext()) {
            mo30104a(it.next(), eVar);
        }
    }

    /* renamed from: a */
    private void m42119a(JSONArray jSONArray, boolean z) {
        String str;
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            try {
                str = jSONObject.optString("name");
                try {
                    C11534d valueOf = C11534d.valueOf(str);
                    if (!z || valueOf == C11534d.blocked) {
                        this.f33464h.mo30088a().execute(new C11532b(str + "-sync_node_process", new Object[0], valueOf, jSONObject));
                        i++;
                    } else {
                        i++;
                    }
                } catch (Exception unused) {
                    C11461g.m41880a(f33459n, "Failed to process node %s sync route", str);
                    i++;
                }
            } catch (Exception unused2) {
                str = null;
                C11461g.m41880a(f33459n, "Failed to process node %s sync route", str);
                i++;
            }
        }
    }

    /* renamed from: a */
    public static boolean m42120a(Map<String, String> map) {
        return map.containsKey("_sync") || map.containsKey("_nodes");
    }
}
