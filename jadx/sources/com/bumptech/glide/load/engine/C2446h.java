package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.util.C1005e;
import com.bumptech.glide.C2386d;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import com.bumptech.glide.load.data.C2417e;
import com.bumptech.glide.load.engine.C2443f;
import com.bumptech.glide.load.engine.C2455i;
import com.bumptech.glide.load.resource.bitmap.C2548u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p089g4.C6218g;
import p102h4.C6427a;
import p102h4.C6435b;
import p102h4.C6436c;
import p166m3.C7079a;
import p166m3.C7083e;
import p166m3.C7085g;
import p166m3.C7088h;
import p166m3.C7091k;
import p192o3.C7423a;
import p192o3.C7430c;
import p218q3.C7864a;

/* renamed from: com.bumptech.glide.load.engine.h */
class C2446h implements C2443f.C2444a, Runnable, Comparable, C6427a.C6433f {

    /* renamed from: A */
    private C7083e f7724A;

    /* renamed from: B */
    private C7083e f7725B;

    /* renamed from: C */
    private Object f7726C;

    /* renamed from: D */
    private C7079a f7727D;

    /* renamed from: E */
    private C2415d f7728E;

    /* renamed from: F */
    private volatile C2443f f7729F;

    /* renamed from: G */
    private volatile boolean f7730G;

    /* renamed from: H */
    private volatile boolean f7731H;

    /* renamed from: I */
    private boolean f7732I;

    /* renamed from: d */
    private final C2445g f7733d = new C2445g();

    /* renamed from: e */
    private final List f7734e = new ArrayList();

    /* renamed from: f */
    private final C6436c f7735f = C6436c.m25531a();

    /* renamed from: g */
    private final C2451e f7736g;

    /* renamed from: h */
    private final C1005e f7737h;

    /* renamed from: i */
    private final C2450d f7738i = new C2450d();

    /* renamed from: j */
    private final C2452f f7739j = new C2452f();

    /* renamed from: k */
    private C2386d f7740k;

    /* renamed from: l */
    private C7083e f7741l;

    /* renamed from: m */
    private C2390g f7742m;

    /* renamed from: n */
    private C2471m f7743n;

    /* renamed from: o */
    private int f7744o;

    /* renamed from: p */
    private int f7745p;

    /* renamed from: q */
    private C7423a f7746q;

    /* renamed from: r */
    private C7088h f7747r;

    /* renamed from: s */
    private C2448b f7748s;

    /* renamed from: t */
    private int f7749t;

    /* renamed from: u */
    private C2454h f7750u;

    /* renamed from: v */
    private C2453g f7751v;

    /* renamed from: w */
    private long f7752w;

    /* renamed from: x */
    private boolean f7753x;

    /* renamed from: y */
    private Object f7754y;

    /* renamed from: z */
    private Thread f7755z;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    static /* synthetic */ class C2447a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7756a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7757b;

        /* renamed from: c */
        static final /* synthetic */ int[] f7758c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                m3.c[] r0 = p166m3.C7081c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7758c = r0
                r1 = 1
                m3.c r2 = p166m3.C7081c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7758c     // Catch:{ NoSuchFieldError -> 0x001d }
                m3.c r3 = p166m3.C7081c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.h$h[] r2 = com.bumptech.glide.load.engine.C2446h.C2454h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7757b = r2
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.C2446h.C2454h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f7757b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.C2446h.C2454h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f7757b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C2446h.C2454h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f7757b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C2446h.C2454h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f7757b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C2446h.C2454h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.h$g[] r3 = com.bumptech.glide.load.engine.C2446h.C2453g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f7756a = r3
                com.bumptech.glide.load.engine.h$g r4 = com.bumptech.glide.load.engine.C2446h.C2453g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f7756a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.h$g r3 = com.bumptech.glide.load.engine.C2446h.C2453g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f7756a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.h$g r1 = com.bumptech.glide.load.engine.C2446h.C2453g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2446h.C2447a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$b */
    interface C2448b {
        /* renamed from: a */
        void mo7887a(C2446h hVar);

        /* renamed from: b */
        void mo7888b(C7430c cVar, C7079a aVar, boolean z);

        /* renamed from: d */
        void mo7889d(GlideException glideException);
    }

    /* renamed from: com.bumptech.glide.load.engine.h$c */
    private final class C2449c implements C2455i.C2456a {

        /* renamed from: a */
        private final C7079a f7759a;

        C2449c(C7079a aVar) {
            this.f7759a = aVar;
        }

        /* renamed from: a */
        public C7430c mo7890a(C7430c cVar) {
            return C2446h.this.mo7878A(this.f7759a, cVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$d */
    private static class C2450d {

        /* renamed from: a */
        private C7083e f7761a;

        /* renamed from: b */
        private C7091k f7762b;

        /* renamed from: c */
        private C2477r f7763c;

        C2450d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7891a() {
            this.f7761a = null;
            this.f7762b = null;
            this.f7763c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7892b(C2451e eVar, C7088h hVar) {
            C6435b.m25525a("DecodeJob.encode");
            try {
                eVar.mo7895a().mo22834b(this.f7761a, new C2442e(this.f7762b, this.f7763c, hVar));
            } finally {
                this.f7763c.mo7955g();
                C6435b.m25529e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo7893c() {
            return this.f7763c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7894d(C7083e eVar, C7091k kVar, C2477r rVar) {
            this.f7761a = eVar;
            this.f7762b = kVar;
            this.f7763c = rVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$e */
    interface C2451e {
        /* renamed from: a */
        C7864a mo7895a();
    }

    /* renamed from: com.bumptech.glide.load.engine.h$f */
    private static class C2452f {

        /* renamed from: a */
        private boolean f7764a;

        /* renamed from: b */
        private boolean f7765b;

        /* renamed from: c */
        private boolean f7766c;

        C2452f() {
        }

        /* renamed from: a */
        private boolean m9507a(boolean z) {
            return (this.f7766c || z || this.f7765b) && this.f7764a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo7896b() {
            this.f7765b = true;
            return m9507a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo7897c() {
            this.f7766c = true;
            return m9507a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized boolean mo7898d(boolean z) {
            this.f7764a = true;
            return m9507a(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo7899e() {
            this.f7765b = false;
            this.f7764a = false;
            this.f7766c = false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$g */
    private enum C2453g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h */
    private enum C2454h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C2446h(C2451e eVar, C1005e eVar2) {
        this.f7736g = eVar;
        this.f7737h = eVar2;
    }

    /* renamed from: C */
    private void m9468C() {
        this.f7739j.mo7899e();
        this.f7738i.mo7891a();
        this.f7733d.mo7853a();
        this.f7730G = false;
        this.f7740k = null;
        this.f7741l = null;
        this.f7747r = null;
        this.f7742m = null;
        this.f7743n = null;
        this.f7748s = null;
        this.f7750u = null;
        this.f7729F = null;
        this.f7755z = null;
        this.f7724A = null;
        this.f7726C = null;
        this.f7727D = null;
        this.f7728E = null;
        this.f7752w = 0;
        this.f7731H = false;
        this.f7754y = null;
        this.f7734e.clear();
        this.f7737h.mo3439a(this);
    }

    /* renamed from: D */
    private void m9469D(C2453g gVar) {
        this.f7751v = gVar;
        this.f7748s.mo7887a(this);
    }

    /* renamed from: E */
    private void m9470E() {
        this.f7755z = Thread.currentThread();
        this.f7752w = C6218g.m24714b();
        boolean z = false;
        while (!this.f7731H && this.f7729F != null && !(z = this.f7729F.mo7844d())) {
            this.f7750u = m9478o(this.f7750u);
            this.f7729F = m9477n();
            if (this.f7750u == C2454h.SOURCE) {
                m9469D(C2453g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f7750u == C2454h.FINISHED || this.f7731H) && !z) {
            m9485x();
        }
    }

    /* renamed from: F */
    private C7430c m9471F(Object obj, C7079a aVar, C2476q qVar) {
        C7088h q = m9479q(aVar);
        C2417e l = this.f7740k.mo7709i().mo7674l(obj);
        try {
            return qVar.mo7953a(l, q, this.f7744o, this.f7745p, new C2449c(aVar));
        } finally {
            l.mo7775b();
        }
    }

    /* renamed from: G */
    private void m9472G() {
        int i = C2447a.f7756a[this.f7751v.ordinal()];
        if (i == 1) {
            this.f7750u = m9478o(C2454h.INITIALIZE);
            this.f7729F = m9477n();
            m9470E();
        } else if (i == 2) {
            m9470E();
        } else if (i == 3) {
            m9476l();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f7751v);
        }
    }

    /* renamed from: H */
    private void m9473H() {
        Throwable th;
        this.f7735f.mo20310c();
        if (this.f7730G) {
            if (this.f7734e.isEmpty()) {
                th = null;
            } else {
                List list = this.f7734e;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f7730G = true;
    }

    /* renamed from: h */
    private C7430c m9474h(C2415d dVar, Object obj, C7079a aVar) {
        if (obj == null) {
            dVar.mo7786b();
            return null;
        }
        try {
            long b = C6218g.m24714b();
            C7430c j = m9475j(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m9481t("Decoded result " + j, b);
            }
            return j;
        } finally {
            dVar.mo7786b();
        }
    }

    /* renamed from: j */
    private C7430c m9475j(Object obj, C7079a aVar) {
        return m9471F(obj, aVar, this.f7733d.mo7860h(obj.getClass()));
    }

    /* renamed from: l */
    private void m9476l() {
        C7430c cVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f7752w;
            m9482u("Retrieved data", j, "data: " + this.f7726C + ", cache key: " + this.f7724A + ", fetcher: " + this.f7728E);
        }
        try {
            cVar = m9474h(this.f7728E, this.f7726C, this.f7727D);
        } catch (GlideException e) {
            e.mo7824i(this.f7725B, this.f7727D);
            this.f7734e.add(e);
            cVar = null;
        }
        if (cVar != null) {
            m9484w(cVar, this.f7727D, this.f7732I);
        } else {
            m9470E();
        }
    }

    /* renamed from: n */
    private C2443f m9477n() {
        int i = C2447a.f7757b[this.f7750u.ordinal()];
        if (i == 1) {
            return new C2479s(this.f7733d, this);
        }
        if (i == 2) {
            return new C2440c(this.f7733d, this);
        }
        if (i == 3) {
            return new C2483v(this.f7733d, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f7750u);
    }

    /* renamed from: o */
    private C2454h m9478o(C2454h hVar) {
        int i = C2447a.f7757b[hVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return C2454h.FINISHED;
                }
                if (i != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + hVar);
                } else if (this.f7746q.mo21830b()) {
                    return C2454h.RESOURCE_CACHE;
                } else {
                    return m9478o(C2454h.RESOURCE_CACHE);
                }
            } else if (this.f7753x) {
                return C2454h.FINISHED;
            } else {
                return C2454h.SOURCE;
            }
        } else if (this.f7746q.mo21829a()) {
            return C2454h.DATA_CACHE;
        } else {
            return m9478o(C2454h.DATA_CACHE);
        }
    }

    /* renamed from: q */
    private C7088h m9479q(C7079a aVar) {
        boolean z;
        C7088h hVar = this.f7747r;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        if (aVar == C7079a.RESOURCE_DISK_CACHE || this.f7733d.mo7876x()) {
            z = true;
        } else {
            z = false;
        }
        C7085g gVar = C2548u.f7995j;
        Boolean bool = (Boolean) hVar.mo21312c(gVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return hVar;
        }
        C7088h hVar2 = new C7088h();
        hVar2.mo21313d(this.f7747r);
        hVar2.mo21315f(gVar, Boolean.valueOf(z));
        return hVar2;
    }

    /* renamed from: r */
    private int m9480r() {
        return this.f7742m.ordinal();
    }

    /* renamed from: t */
    private void m9481t(String str, long j) {
        m9482u(str, j, (String) null);
    }

    /* renamed from: u */
    private void m9482u(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C6218g.m24713a(j));
        sb.append(", load key: ");
        sb.append(this.f7743n);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: v */
    private void m9483v(C7430c cVar, C7079a aVar, boolean z) {
        m9473H();
        this.f7748s.mo7888b(cVar, aVar, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: o3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.bumptech.glide.load.engine.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.bumptech.glide.load.engine.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: o3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.bumptech.glide.load.engine.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9484w(p192o3.C7430c r2, p166m3.C7079a r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "DecodeJob.notifyEncodeAndRelease"
            p102h4.C6435b.m25525a(r0)
            boolean r0 = r2 instanceof p192o3.C7429b     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000f
            r0 = r2
            o3.b r0 = (p192o3.C7429b) r0     // Catch:{ all -> 0x0049 }
            r0.mo7985b()     // Catch:{ all -> 0x0049 }
        L_0x000f:
            com.bumptech.glide.load.engine.h$d r0 = r1.f7738i     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.mo7893c()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x001d
            com.bumptech.glide.load.engine.r r2 = com.bumptech.glide.load.engine.C2477r.m9577e(r2)     // Catch:{ all -> 0x0049 }
            r0 = r2
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r1.m9483v(r2, r3, r4)     // Catch:{ all -> 0x0049 }
            com.bumptech.glide.load.engine.h$h r2 = com.bumptech.glide.load.engine.C2446h.C2454h.ENCODE     // Catch:{ all -> 0x0049 }
            r1.f7750u = r2     // Catch:{ all -> 0x0049 }
            com.bumptech.glide.load.engine.h$d r2 = r1.f7738i     // Catch:{ all -> 0x0042 }
            boolean r2 = r2.mo7893c()     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0036
            com.bumptech.glide.load.engine.h$d r2 = r1.f7738i     // Catch:{ all -> 0x0042 }
            com.bumptech.glide.load.engine.h$e r3 = r1.f7736g     // Catch:{ all -> 0x0042 }
            m3.h r4 = r1.f7747r     // Catch:{ all -> 0x0042 }
            r2.mo7892b(r3, r4)     // Catch:{ all -> 0x0042 }
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.mo7955g()     // Catch:{ all -> 0x0049 }
        L_0x003b:
            r1.m9486y()     // Catch:{ all -> 0x0049 }
            p102h4.C6435b.m25529e()
            return
        L_0x0042:
            r2 = move-exception
            if (r0 == 0) goto L_0x0048
            r0.mo7955g()     // Catch:{ all -> 0x0049 }
        L_0x0048:
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r2 = move-exception
            p102h4.C6435b.m25529e()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2446h.m9484w(o3.c, m3.a, boolean):void");
    }

    /* renamed from: x */
    private void m9485x() {
        m9473H();
        this.f7748s.mo7889d(new GlideException("Failed to load resource", (List) new ArrayList(this.f7734e)));
        m9487z();
    }

    /* renamed from: y */
    private void m9486y() {
        if (this.f7739j.mo7896b()) {
            m9468C();
        }
    }

    /* renamed from: z */
    private void m9487z() {
        if (this.f7739j.mo7897c()) {
            m9468C();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.engine.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.engine.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.engine.t} */
    /* JADX WARNING: type inference failed for: r12v5, types: [m3.e] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p192o3.C7430c mo7878A(p166m3.C7079a r12, p192o3.C7430c r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            m3.a r0 = p166m3.C7079a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.g r0 = r11.f7733d
            m3.l r0 = r0.mo7871s(r8)
            com.bumptech.glide.d r2 = r11.f7740k
            int r3 = r11.f7744o
            int r4 = r11.f7745p
            o3.c r2 = r0.mo8004a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.recycle()
        L_0x002b:
            com.bumptech.glide.load.engine.g r13 = r11.f7733d
            boolean r13 = r13.mo7875w(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.g r13 = r11.f7733d
            m3.k r1 = r13.mo7866n(r0)
            m3.h r13 = r11.f7747r
            m3.c r13 = r1.mo7976b(r13)
            goto L_0x0042
        L_0x0040:
            m3.c r13 = p166m3.C7081c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.engine.g r1 = r11.f7733d
            m3.e r2 = r11.f7724A
            boolean r1 = r1.mo7877y(r2)
            r2 = 1
            r1 = r1 ^ r2
            o3.a r3 = r11.f7746q
            boolean r12 = r3.mo21832d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.engine.C2446h.C2447a.f7758c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.engine.t r12 = new com.bumptech.glide.load.engine.t
            com.bumptech.glide.load.engine.g r13 = r11.f7733d
            p3.b r2 = r13.mo7854b()
            m3.e r3 = r11.f7724A
            m3.e r4 = r11.f7741l
            int r5 = r11.f7744o
            int r6 = r11.f7745p
            m3.h r9 = r11.f7747r
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.engine.d r12 = new com.bumptech.glide.load.engine.d
            m3.e r13 = r11.f7724A
            m3.e r1 = r11.f7741l
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.engine.r r0 = com.bumptech.glide.load.engine.C2477r.m9577e(r0)
            com.bumptech.glide.load.engine.h$d r13 = r11.f7738i
            r13.mo7894d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2446h.mo7878A(m3.a, o3.c):o3.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo7879B(boolean z) {
        if (this.f7739j.mo7898d(z)) {
            m9468C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo7880I() {
        C2454h o = m9478o(C2454h.INITIALIZE);
        if (o == C2454h.RESOURCE_CACHE || o == C2454h.DATA_CACHE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo7850a(C7083e eVar, Exception exc, C2415d dVar, C7079a aVar) {
        dVar.mo7786b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.mo7825k(eVar, aVar, dVar.mo7781a());
        this.f7734e.add(glideException);
        if (Thread.currentThread() != this.f7755z) {
            m9469D(C2453g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m9470E();
        }
    }

    /* renamed from: b */
    public void mo7851b(C7083e eVar, Object obj, C2415d dVar, C7079a aVar, C7083e eVar2) {
        this.f7724A = eVar;
        this.f7726C = obj;
        this.f7728E = dVar;
        this.f7727D = aVar;
        this.f7725B = eVar2;
        boolean z = false;
        if (eVar != this.f7733d.mo7855c().get(0)) {
            z = true;
        }
        this.f7732I = z;
        if (Thread.currentThread() != this.f7755z) {
            m9469D(C2453g.DECODE_DATA);
            return;
        }
        C6435b.m25525a("DecodeJob.decodeFromRetrievedData");
        try {
            m9476l();
        } finally {
            C6435b.m25529e();
        }
    }

    /* renamed from: c */
    public C6436c mo7881c() {
        return this.f7735f;
    }

    /* renamed from: e */
    public void mo7852e() {
        m9469D(C2453g.SWITCH_TO_SOURCE_SERVICE);
    }

    /* renamed from: f */
    public void mo7883f() {
        this.f7731H = true;
        C2443f fVar = this.f7729F;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: g */
    public int compareTo(C2446h hVar) {
        int r = m9480r() - hVar.m9480r();
        if (r == 0) {
            return this.f7749t - hVar.f7749t;
        }
        return r;
    }

    public void run() {
        C6435b.m25527c("DecodeJob#run(reason=%s, model=%s)", this.f7751v, this.f7754y);
        C2415d dVar = this.f7728E;
        try {
            if (this.f7731H) {
                m9485x();
                if (dVar != null) {
                    dVar.mo7786b();
                }
                C6435b.m25529e();
                return;
            }
            m9472G();
            if (dVar != null) {
                dVar.mo7786b();
            }
            C6435b.m25529e();
        } catch (C2439b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo7786b();
            }
            C6435b.m25529e();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C2446h mo7886s(C2386d dVar, Object obj, C2471m mVar, C7083e eVar, int i, int i2, Class cls, Class cls2, C2390g gVar, C7423a aVar, Map map, boolean z, boolean z2, boolean z3, C7088h hVar, C2448b bVar, int i3) {
        this.f7733d.mo7874v(dVar, obj, eVar, i, i2, aVar, cls, cls2, gVar, hVar, map, z, z2, this.f7736g);
        this.f7740k = dVar;
        this.f7741l = eVar;
        this.f7742m = gVar;
        this.f7743n = mVar;
        this.f7744o = i;
        this.f7745p = i2;
        this.f7746q = aVar;
        this.f7753x = z3;
        this.f7747r = hVar;
        this.f7748s = bVar;
        this.f7749t = i3;
        this.f7751v = C2453g.INITIALIZE;
        this.f7754y = obj;
        return this;
    }
}
