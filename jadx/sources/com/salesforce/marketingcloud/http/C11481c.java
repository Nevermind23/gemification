package com.salesforce.marketingcloud.http;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.C11460f;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.util.C11821j;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p189o0.C7357a;
import p261t7.C8420a;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.http.c */
public class C11481c extends C11460f {

    /* renamed from: j */
    public static final String f33385j = "com.salesforce.marketingcloud.http.RESPONSE";

    /* renamed from: k */
    public static final String f33386k = "http_response";

    /* renamed from: l */
    public static final String f33387l = "http_request";

    /* renamed from: m */
    private static final int f33388m = 10;

    /* renamed from: n */
    static final String f33389n = C11461g.m41875a("RequestManager");

    /* renamed from: d */
    final Map<C11474a, C11484c> f33390d = new ArrayMap();

    /* renamed from: e */
    private final Map<String, String> f33391e = new C11482a();

    /* renamed from: f */
    private final Context f33392f;

    /* renamed from: g */
    private final SharedPreferences f33393g;

    /* renamed from: h */
    private C11513l f33394h;

    /* renamed from: i */
    private BroadcastReceiver f33395i;

    /* renamed from: com.salesforce.marketingcloud.http.c$a */
    class C11482a extends LinkedHashMap<String, String> {
        C11482a() {
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 10;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.http.c$b */
    class C11483b extends C11505g {

        /* renamed from: b */
        final /* synthetic */ C11484c f33397b;

        /* renamed from: c */
        final /* synthetic */ C11476b f33398c;

        /* renamed from: d */
        final /* synthetic */ C11486d f33399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11483b(String str, Object[] objArr, C11484c cVar, C11476b bVar, C11486d dVar) {
            super(str, objArr);
            this.f33397b = cVar;
            this.f33398c = bVar;
            this.f33399d = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            this.f33397b.mo29793a(this.f33398c, this.f33399d);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.http.c$c */
    public interface C11484c {
        /* renamed from: a */
        void mo29793a(C11476b bVar, C11486d dVar);
    }

    /* renamed from: com.salesforce.marketingcloud.http.c$d */
    class C11485d extends BroadcastReceiver {
        C11485d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C11461g.m41891d(C11481c.f33389n, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                C11461g.m41891d(C11481c.f33389n, "Received null action", new Object[0]);
            } else if (!action.equals(C11481c.f33385j)) {
                C11461g.m41880a(C11481c.f33389n, "Received unknown action: %s", action);
            } else {
                C11476b a = C11476b.m41933a(intent.getBundleExtra(C11481c.f33387l));
                C11486d dVar = (C11486d) intent.getParcelableExtra(C11481c.f33386k);
                if (a == null || dVar == null) {
                    C11461g.m41891d(C11481c.f33389n, "Received null request/response", new Object[0]);
                } else {
                    C11481c.this.mo30023a(a, dVar);
                }
            }
        }
    }

    public C11481c(Context context, SharedPreferences sharedPreferences, C11513l lVar) {
        this.f33392f = (Context) C11821j.m43272a(context, "Context is null");
        this.f33393g = (SharedPreferences) C11821j.m43272a(sharedPreferences, "SharedPreferences is null");
        this.f33394h = lVar;
    }

    /* renamed from: a */
    private void m41970a() {
        C8420a.m31586a(this.f33392f);
    }

    public final String componentName() {
        return "RequestManager";
    }

    public final JSONObject componentState() {
        return new JSONObject(this.f33391e);
    }

    public final void tearDown(boolean z) {
        synchronized (this.f33390d) {
            this.f33390d.clear();
        }
        Context context = this.f33392f;
        if (context != null && this.f33395i != null) {
            C7357a.m28044b(context).mo21732e(this.f33395i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29669a(InitializationStatus.C11293a aVar) {
        try {
            m41970a();
        } catch (Exception e) {
            aVar.mo29537e(true);
            aVar.mo29530a("Failed to install providers: " + e.getMessage());
        }
        this.f33395i = new C11485d();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f33385j);
        C7357a.m28044b(this.f33392f).mo21730c(this.f33395i, intentFilter);
    }

    /* renamed from: a */
    public void mo30020a(C11474a aVar) {
        synchronized (this.f33390d) {
            this.f33390d.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo30021a(C11474a aVar, C11484c cVar) {
        synchronized (this.f33390d) {
            if (this.f33390d.put(aVar, cVar) != null) {
                C11461g.m41880a(f33389n, "%s replaces previous listener for $s requests", cVar.getClass().getName(), aVar.name());
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|3|4|5|6|7|8|(1:13)(1:12)|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo30022a(com.salesforce.marketingcloud.http.C11476b r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "request is null"
            com.salesforce.marketingcloud.util.C11821j.m43272a(r7, (java.lang.String) r0)     // Catch:{ all -> 0x0050 }
            r6.m41970a()     // Catch:{ Exception -> 0x000a }
            goto L_0x0014
        L_0x000a:
            java.lang.String r0 = f33389n     // Catch:{ all -> 0x0050 }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "Failed to verify SSL providers via Google Play Services."
            com.salesforce.marketingcloud.C11461g.m41894e((java.lang.String) r0, (java.lang.String) r2, (java.lang.Object[]) r1)     // Catch:{ all -> 0x0050 }
        L_0x0014:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0050 }
            com.salesforce.marketingcloud.http.a r2 = r7.mo30002p()     // Catch:{ all -> 0x0050 }
            android.content.SharedPreferences r3 = r6.f33393g     // Catch:{ all -> 0x0050 }
            long r2 = r2.mo29984c(r3)     // Catch:{ all -> 0x0050 }
            com.salesforce.marketingcloud.http.a r4 = r7.mo30002p()     // Catch:{ all -> 0x0050 }
            android.content.SharedPreferences r5 = r6.f33393g     // Catch:{ all -> 0x0050 }
            long r4 = r4.mo29977a((android.content.SharedPreferences) r5)     // Catch:{ all -> 0x0050 }
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0043
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            com.salesforce.marketingcloud.http.a r0 = r7.mo30002p()     // Catch:{ all -> 0x0050 }
            android.content.SharedPreferences r1 = r6.f33393g     // Catch:{ all -> 0x0050 }
            r0.mo29983b((android.content.SharedPreferences) r1)     // Catch:{ all -> 0x0050 }
            android.content.Context r0 = r6.f33392f     // Catch:{ all -> 0x0050 }
            com.salesforce.marketingcloud.MCService.m41381a((android.content.Context) r0, (com.salesforce.marketingcloud.http.C11476b) r7)     // Catch:{ all -> 0x0050 }
            goto L_0x004e
        L_0x0043:
            java.lang.String r0 = "Too Many Requests"
            r1 = 429(0x1ad, float:6.01E-43)
            com.salesforce.marketingcloud.http.d r0 = com.salesforce.marketingcloud.http.C11486d.m41978a(r0, r1)     // Catch:{ all -> 0x0050 }
            r6.mo30023a((com.salesforce.marketingcloud.http.C11476b) r7, (com.salesforce.marketingcloud.http.C11486d) r0)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r6)
            return
        L_0x0050:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.http.C11481c.mo30022a(com.salesforce.marketingcloud.http.b):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30023a(C11476b bVar, C11486d dVar) {
        C11474a p = bVar.mo30002p();
        C11461g.m41891d(f33389n, "%s request took %dms with code: %d", p.name(), Long.valueOf(dVar.mo30034h()), Integer.valueOf(dVar.mo30027b()));
        p.mo29982a(this.f33393g, dVar);
        try {
            this.f33391e.put(bVar.mo30004r(), String.format(Locale.ENGLISH, "%s - %d", new Object[]{dVar.mo30031e(), Integer.valueOf(dVar.mo30027b())}));
        } catch (Exception e) {
            C11461g.m41885b(f33389n, e, "Failed to record response.", new Object[0]);
        }
        synchronized (this.f33390d) {
            C11484c cVar = this.f33390d.get(p);
            if (cVar != null) {
                try {
                    this.f33394h.mo30088a().execute(new C11483b("onResponse", new Object[0], cVar, bVar, dVar));
                } catch (Exception e2) {
                    C11461g.m41885b(f33389n, e2, "Failed to deliver response.", new Object[0]);
                }
            } else {
                C11461g.m41884b(f33389n, "Request %s complete, but no listener was present to handle response %d.", bVar.mo30004r(), Integer.valueOf(dVar.mo30027b()));
            }
        }
    }
}
