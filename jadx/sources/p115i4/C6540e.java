package p115i4;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.C2642h;
import com.facebook.C2645k;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p115i4.C6549g;
import p297w4.C8817m;
import p297w4.C8819n;
import p297w4.C8831r;
import p334z4.C9207a;

/* renamed from: i4.e */
abstract class C6540e {

    /* renamed from: a */
    private static final String f19980a = "i4.e";

    /* renamed from: b */
    private static final Integer f19981b = 100;

    /* renamed from: c */
    private static volatile C6539d f19982c = new C6539d();

    /* renamed from: d */
    private static final ScheduledExecutorService f19983d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: e */
    private static ScheduledFuture f19984e;

    /* renamed from: f */
    private static final Runnable f19985f = new C6541a();

    /* renamed from: i4.e$a */
    static class C6541a implements Runnable {
        C6541a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C6540e.m25824b((ScheduledFuture) null);
                    if (C6549g.m25846d() != C6549g.C6550a.EXPLICIT_ONLY) {
                        C6540e.m25834l(C6561j.TIMER);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: i4.e$b */
    static class C6542b implements Runnable {
        C6542b() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C6547f.m25841b(C6540e.m25825c());
                    C6540e.m25826d(new C6539d());
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: i4.e$c */
    static class C6543c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C6561j f19986d;

        C6543c(C6561j jVar) {
            this.f19986d = jVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C6540e.m25834l(this.f19986d);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: i4.e$d */
    static class C6544d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C6530a f19987d;

        /* renamed from: e */
        final /* synthetic */ C6535c f19988e;

        C6544d(C6530a aVar, C6535c cVar) {
            this.f19987d = aVar;
            this.f19988e = cVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C6540e.m25825c().mo20518a(this.f19987d, this.f19988e);
                    if (C6549g.m25846d() != C6549g.C6550a.EXPLICIT_ONLY && C6540e.m25825c().mo20521d() > C6540e.m25827e().intValue()) {
                        C6540e.m25834l(C6561j.EVENT_THRESHOLD);
                    } else if (C6540e.m25823a() == null) {
                        C6540e.m25824b(C6540e.m25829g().schedule(C6540e.m25828f(), 15, TimeUnit.SECONDS));
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: i4.e$e */
    static class C6545e implements GraphRequest.C2612e {

        /* renamed from: a */
        final /* synthetic */ C6530a f19989a;

        /* renamed from: b */
        final /* synthetic */ GraphRequest f19990b;

        /* renamed from: c */
        final /* synthetic */ C6568o f19991c;

        /* renamed from: d */
        final /* synthetic */ C6563l f19992d;

        C6545e(C6530a aVar, GraphRequest graphRequest, C6568o oVar, C6563l lVar) {
            this.f19989a = aVar;
            this.f19990b = graphRequest;
            this.f19991c = oVar;
            this.f19992d = lVar;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            C6540e.m25836n(this.f19989a, this.f19990b, hVar, this.f19991c, this.f19992d);
        }
    }

    /* renamed from: i4.e$f */
    static class C6546f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C6530a f19993d;

        /* renamed from: e */
        final /* synthetic */ C6568o f19994e;

        C6546f(C6530a aVar, C6568o oVar) {
            this.f19993d = aVar;
            this.f19994e = oVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C6547f.m25840a(this.f19993d, this.f19994e);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ ScheduledFuture m25823a() {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f19984e;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ ScheduledFuture m25824b(ScheduledFuture scheduledFuture) {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            f19984e = scheduledFuture;
            return scheduledFuture;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ C6539d m25825c() {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f19982c;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ C6539d m25826d(C6539d dVar) {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            f19982c = dVar;
            return dVar;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    static /* synthetic */ Integer m25827e() {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f19981b;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ Runnable m25828f() {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f19985f;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    static /* synthetic */ ScheduledExecutorService m25829g() {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f19983d;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: h */
    public static void m25830h(C6530a aVar, C6535c cVar) {
        Class<C6540e> cls = C6540e.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f19983d.execute(new C6544d(aVar, cVar));
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: i */
    static GraphRequest m25831i(C6530a aVar, C6568o oVar, boolean z, C6563l lVar) {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            String b = aVar.mo20509b();
            boolean z2 = false;
            C8817m o = C8819n.m32848o(b, false);
            GraphRequest K = GraphRequest.m10013K((AccessToken) null, String.format("%s/activities", new Object[]{b}), (JSONObject) null, (GraphRequest.C2612e) null);
            Bundle y = K.mo8192y();
            if (y == null) {
                y = new Bundle();
            }
            y.putString("access_token", aVar.mo20508a());
            String d = C6564m.m25885d();
            if (d != null) {
                y.putString("device_token", d);
            }
            String g = C6551h.m25858g();
            if (g != null) {
                y.putString("install_referrer", g);
            }
            K.mo8181Z(y);
            if (o != null) {
                z2 = o.mo24250m();
            }
            int f = oVar.mo20563f(K, C2626d.m10134e(), z2, z);
            if (f == 0) {
                return null;
            }
            lVar.f20027a += f;
            K.mo8178V(new C6545e(aVar, K, oVar, lVar));
            return K;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    static List m25832j(C6539d dVar, C6563l lVar) {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            boolean q = C2626d.m10146q(C2626d.m10134e());
            ArrayList arrayList = new ArrayList();
            for (C6530a aVar : dVar.mo20522f()) {
                GraphRequest i = m25831i(aVar, dVar.mo20520c(aVar), q, lVar);
                if (i != null) {
                    arrayList.add(i);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    public static void m25833k(C6561j jVar) {
        Class<C6540e> cls = C6540e.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f19983d.execute(new C6543c(jVar));
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m25834l(p115i4.C6561j r4) {
        /*
            java.lang.Class<i4.e> r0 = p115i4.C6540e.class
            boolean r1 = p334z4.C9207a.m34024c(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            i4.n r1 = p115i4.C6547f.m25842c()     // Catch:{ all -> 0x0044 }
            i4.d r2 = f19982c     // Catch:{ all -> 0x0044 }
            r2.mo20519b(r1)     // Catch:{ all -> 0x0044 }
            i4.d r1 = f19982c     // Catch:{ Exception -> 0x003b }
            i4.l r4 = m25838p(r4, r1)     // Catch:{ Exception -> 0x003b }
            if (r4 == 0) goto L_0x003a
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSHED"
            r1.<init>(r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
            int r3 = r4.f20027a     // Catch:{ all -> 0x0044 }
            r1.putExtra(r2, r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
            i4.k r4 = r4.f20028b     // Catch:{ all -> 0x0044 }
            r1.putExtra(r2, r4)     // Catch:{ all -> 0x0044 }
            android.content.Context r4 = com.facebook.C2626d.m10134e()     // Catch:{ all -> 0x0044 }
            o0.a r4 = p189o0.C7357a.m28044b(r4)     // Catch:{ all -> 0x0044 }
            r4.mo21731d(r1)     // Catch:{ all -> 0x0044 }
        L_0x003a:
            return
        L_0x003b:
            r4 = move-exception
            java.lang.String r1 = f19980a     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "Caught unexpected exception while flushing app events: "
            android.util.Log.w(r1, r2, r4)     // Catch:{ all -> 0x0044 }
            return
        L_0x0044:
            r4 = move-exception
            p334z4.C9207a.m34023b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i4.C6540e.m25834l(i4.j):void");
    }

    /* renamed from: m */
    public static Set m25835m() {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f19982c.mo20522f();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: n */
    static void m25836n(C6530a aVar, GraphRequest graphRequest, C2642h hVar, C6568o oVar, C6563l lVar) {
        String str;
        Class<C6540e> cls = C6540e.class;
        if (!C9207a.m34024c(cls)) {
            try {
                FacebookRequestError g = hVar.mo8279g();
                String str2 = "Success";
                C6562k kVar = C6562k.SUCCESS;
                boolean z = true;
                if (g != null) {
                    if (g.mo8160d() == -1) {
                        str2 = "Failed: No Connectivity";
                        kVar = C6562k.NO_CONNECTIVITY;
                    } else {
                        str2 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{hVar.toString(), g.toString()});
                        kVar = C6562k.SERVER_ERROR;
                    }
                }
                if (C2626d.m10154y(C2645k.APP_EVENTS)) {
                    try {
                        str = new JSONArray((String) graphRequest.mo8175A()).toString(2);
                    } catch (JSONException unused) {
                        str = "<Can't encode events for debug logging>";
                    }
                    C8831r.m32867h(C2645k.APP_EVENTS, f19980a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.mo8188t().toString(), str2, str);
                }
                if (g == null) {
                    z = false;
                }
                oVar.mo20559b(z);
                C6562k kVar2 = C6562k.NO_CONNECTIVITY;
                if (kVar == kVar2) {
                    C2626d.m10142m().execute(new C6546f(aVar, oVar));
                }
                if (kVar != C6562k.SUCCESS && lVar.f20028b != kVar2) {
                    lVar.f20028b = kVar;
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: o */
    public static void m25837o() {
        Class<C6540e> cls = C6540e.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f19983d.execute(new C6542b());
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: p */
    private static C6563l m25838p(C6561j jVar, C6539d dVar) {
        Class<C6540e> cls = C6540e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            C6563l lVar = new C6563l();
            List<GraphRequest> j = m25832j(dVar, lVar);
            if (j.size() <= 0) {
                return null;
            }
            C8831r.m32867h(C2645k.APP_EVENTS, f19980a, "Flushing %d events due to %s.", Integer.valueOf(lVar.f20027a), jVar.toString());
            for (GraphRequest g : j) {
                g.mo8184g();
            }
            return lVar;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}
