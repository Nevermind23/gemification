package p035c4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C2381c;
import com.bumptech.glide.C2386d;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.engine.C2457j;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;
import p050d4.C5824h;
import p050d4.C5825i;
import p063e4.C6034e;
import p089g4.C6218g;
import p089g4.C6224l;
import p102h4.C6435b;
import p102h4.C6436c;
import p166m3.C7079a;
import p192o3.C7430c;
import p296w3.C8759i;

/* renamed from: c4.j */
public final class C2258j implements C2250d, C5824h, C2257i {

    /* renamed from: E */
    private static final boolean f7031E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    private int f7032A;

    /* renamed from: B */
    private int f7033B;

    /* renamed from: C */
    private boolean f7034C;

    /* renamed from: D */
    private RuntimeException f7035D;

    /* renamed from: a */
    private int f7036a;

    /* renamed from: b */
    private final String f7037b;

    /* renamed from: c */
    private final C6436c f7038c;

    /* renamed from: d */
    private final Object f7039d;

    /* renamed from: e */
    private final C2255g f7040e;

    /* renamed from: f */
    private final C2251e f7041f;

    /* renamed from: g */
    private final Context f7042g;

    /* renamed from: h */
    private final C2386d f7043h;

    /* renamed from: i */
    private final Object f7044i;

    /* renamed from: j */
    private final Class f7045j;

    /* renamed from: k */
    private final C2247a f7046k;

    /* renamed from: l */
    private final int f7047l;

    /* renamed from: m */
    private final int f7048m;

    /* renamed from: n */
    private final C2390g f7049n;

    /* renamed from: o */
    private final C5825i f7050o;

    /* renamed from: p */
    private final List f7051p;

    /* renamed from: q */
    private final C6034e f7052q;

    /* renamed from: r */
    private final Executor f7053r;

    /* renamed from: s */
    private C7430c f7054s;

    /* renamed from: t */
    private C2457j.C2463d f7055t;

    /* renamed from: u */
    private long f7056u;

    /* renamed from: v */
    private volatile C2457j f7057v;

    /* renamed from: w */
    private C2259a f7058w;

    /* renamed from: x */
    private Drawable f7059x;

    /* renamed from: y */
    private Drawable f7060y;

    /* renamed from: z */
    private Drawable f7061z;

    /* renamed from: c4.j$a */
    private enum C2259a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C2258j(Context context, C2386d dVar, Object obj, Object obj2, Class cls, C2247a aVar, int i, int i2, C2390g gVar, C5825i iVar, C2255g gVar2, List list, C2251e eVar, C2457j jVar, C6034e eVar2, Executor executor) {
        String str;
        if (f7031E) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f7037b = str;
        this.f7038c = C6436c.m25531a();
        this.f7039d = obj;
        this.f7042g = context;
        this.f7043h = dVar;
        this.f7044i = obj2;
        this.f7045j = cls;
        this.f7046k = aVar;
        this.f7047l = i;
        this.f7048m = i2;
        this.f7049n = gVar;
        this.f7050o = iVar;
        this.f7040e = gVar2;
        this.f7051p = list;
        this.f7041f = eVar;
        this.f7057v = jVar;
        this.f7052q = eVar2;
        this.f7053r = executor;
        this.f7058w = C2259a.PENDING;
        if (this.f7035D == null && dVar.mo7707g().mo7710a(C2381c.C2384c.class)) {
            this.f7035D = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    private void m8680A(GlideException glideException, int i) {
        boolean z;
        this.f7038c.mo20310c();
        synchronized (this.f7039d) {
            glideException.mo7826l(this.f7035D);
            int h = this.f7043h.mo7708h();
            if (h <= i) {
                Log.w("Glide", "Load failed for [" + this.f7044i + "] with dimensions [" + this.f7032A + "x" + this.f7033B + "]", glideException);
                if (h <= 4) {
                    glideException.mo7822g("Glide");
                }
            }
            this.f7055t = null;
            this.f7058w = C2259a.FAILED;
            m8696x();
            boolean z2 = true;
            this.f7034C = true;
            try {
                List<C2255g> list = this.f7051p;
                if (list != null) {
                    z = false;
                    for (C2255g onLoadFailed : list) {
                        z |= onLoadFailed.onLoadFailed(glideException, this.f7044i, this.f7050o, m8692t());
                    }
                } else {
                    z = false;
                }
                C2255g gVar = this.f7040e;
                if (gVar == null || !gVar.onLoadFailed(glideException, this.f7044i, this.f7050o, m8692t())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m8682C();
                }
                this.f7034C = false;
                C6435b.m25530f("GlideRequest", this.f7036a);
            } catch (Throwable th) {
                this.f7034C = false;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00aa A[Catch:{ all -> 0x00bf }] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8681B(p192o3.C7430c r10, java.lang.Object r11, p166m3.C7079a r12, boolean r13) {
        /*
            r9 = this;
            boolean r13 = r9.m8692t()
            c4.j$a r0 = p035c4.C2258j.C2259a.COMPLETE
            r9.f7058w = r0
            r9.f7054s = r10
            com.bumptech.glide.d r10 = r9.f7043h
            int r10 = r10.mo7708h()
            r0 = 3
            if (r10 > r0) goto L_0x006a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Finished loading "
            r10.append(r0)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            java.lang.String r0 = " from "
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " for "
            r10.append(r0)
            java.lang.Object r0 = r9.f7044i
            r10.append(r0)
            java.lang.String r0 = " with size ["
            r10.append(r0)
            int r0 = r9.f7032A
            r10.append(r0)
            java.lang.String r0 = "x"
            r10.append(r0)
            int r0 = r9.f7033B
            r10.append(r0)
            java.lang.String r0 = "] in "
            r10.append(r0)
            long r0 = r9.f7056u
            double r0 = p089g4.C6218g.m24713a(r0)
            r10.append(r0)
            java.lang.String r0 = " ms"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r10)
        L_0x006a:
            r9.m8697y()
            r10 = 1
            r9.f7034C = r10
            r6 = 0
            java.util.List r0 = r9.f7051p     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0093
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00bf }
            r8 = r6
        L_0x007a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00bf }
            c4.g r0 = (p035c4.C2255g) r0     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r9.f7044i     // Catch:{ all -> 0x00bf }
            d4.i r3 = r9.f7050o     // Catch:{ all -> 0x00bf }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bf }
            r8 = r8 | r0
            goto L_0x007a
        L_0x0093:
            r8 = r6
        L_0x0094:
            c4.g r0 = r9.f7040e     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r2 = r9.f7044i     // Catch:{ all -> 0x00bf }
            d4.i r3 = r9.f7050o     // Catch:{ all -> 0x00bf }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r10 = r6
        L_0x00a7:
            r10 = r10 | r8
            if (r10 != 0) goto L_0x00b5
            e4.e r10 = r9.f7052q     // Catch:{ all -> 0x00bf }
            e4.d r10 = r10.mo19522a(r12, r13)     // Catch:{ all -> 0x00bf }
            d4.i r12 = r9.f7050o     // Catch:{ all -> 0x00bf }
            r12.mo7276b(r11, r10)     // Catch:{ all -> 0x00bf }
        L_0x00b5:
            r9.f7034C = r6
            java.lang.String r10 = "GlideRequest"
            int r11 = r9.f7036a
            p102h4.C6435b.m25530f(r10, r11)
            return
        L_0x00bf:
            r10 = move-exception
            r9.f7034C = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c4.C2258j.m8681B(o3.c, java.lang.Object, m3.a, boolean):void");
    }

    /* renamed from: C */
    private void m8682C() {
        Drawable drawable;
        if (m8685m()) {
            if (this.f7044i == null) {
                drawable = m8690r();
            } else {
                drawable = null;
            }
            if (drawable == null) {
                drawable = m8689q();
            }
            if (drawable == null) {
                drawable = m8691s();
            }
            this.f7050o.mo7288k(drawable);
        }
    }

    /* renamed from: j */
    private void m8683j() {
        if (this.f7034C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m8684k() {
        C2251e eVar = this.f7041f;
        return eVar == null || eVar.mo7267h(this);
    }

    /* renamed from: m */
    private boolean m8685m() {
        C2251e eVar = this.f7041f;
        return eVar == null || eVar.mo7263d(this);
    }

    /* renamed from: n */
    private boolean m8686n() {
        C2251e eVar = this.f7041f;
        return eVar == null || eVar.mo7270j(this);
    }

    /* renamed from: o */
    private void m8687o() {
        m8683j();
        this.f7038c.mo20310c();
        this.f7050o.mo7278d(this);
        C2457j.C2463d dVar = this.f7055t;
        if (dVar != null) {
            dVar.mo7913a();
            this.f7055t = null;
        }
    }

    /* renamed from: p */
    private void m8688p(Object obj) {
        List<C2255g> list = this.f7051p;
        if (list != null) {
            for (C2255g gVar : list) {
            }
        }
    }

    /* renamed from: q */
    private Drawable m8689q() {
        if (this.f7059x == null) {
            Drawable o = this.f7046k.mo7241o();
            this.f7059x = o;
            if (o == null && this.f7046k.mo7239n() > 0) {
                this.f7059x = m8693u(this.f7046k.mo7239n());
            }
        }
        return this.f7059x;
    }

    /* renamed from: r */
    private Drawable m8690r() {
        if (this.f7061z == null) {
            Drawable p = this.f7046k.mo7243p();
            this.f7061z = p;
            if (p == null && this.f7046k.mo7245q() > 0) {
                this.f7061z = m8693u(this.f7046k.mo7245q());
            }
        }
        return this.f7061z;
    }

    /* renamed from: s */
    private Drawable m8691s() {
        if (this.f7060y == null) {
            Drawable y = this.f7046k.mo7256y();
            this.f7060y = y;
            if (y == null && this.f7046k.mo7258z() > 0) {
                this.f7060y = m8693u(this.f7046k.mo7258z());
            }
        }
        return this.f7060y;
    }

    /* renamed from: t */
    private boolean m8692t() {
        C2251e eVar = this.f7041f;
        return eVar == null || !eVar.mo7260b().mo7259a();
    }

    /* renamed from: u */
    private Drawable m8693u(int i) {
        Resources.Theme theme;
        if (this.f7046k.mo7197E() != null) {
            theme = this.f7046k.mo7197E();
        } else {
            theme = this.f7042g.getTheme();
        }
        return C8759i.m32587a(this.f7042g, i, theme);
    }

    /* renamed from: v */
    private void m8694v(String str) {
        Log.v("GlideRequest", str + " this: " + this.f7037b);
    }

    /* renamed from: w */
    private static int m8695w(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: x */
    private void m8696x() {
        C2251e eVar = this.f7041f;
        if (eVar != null) {
            eVar.mo7264e(this);
        }
    }

    /* renamed from: y */
    private void m8697y() {
        C2251e eVar = this.f7041f;
        if (eVar != null) {
            eVar.mo7271k(this);
        }
    }

    /* renamed from: z */
    public static C2258j m8698z(Context context, C2386d dVar, Object obj, Object obj2, Class cls, C2247a aVar, int i, int i2, C2390g gVar, C5825i iVar, C2255g gVar2, List list, C2251e eVar, C2457j jVar, C6034e eVar2, Executor executor) {
        return new C2258j(context, dVar, obj, obj2, cls, aVar, i, i2, gVar, iVar, gVar2, list, eVar, jVar, eVar2, executor);
    }

    /* renamed from: a */
    public boolean mo7259a() {
        boolean z;
        synchronized (this.f7039d) {
            if (this.f7058w == C2259a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo7296b(C7430c cVar, C7079a aVar, boolean z) {
        Object obj;
        String str;
        this.f7038c.mo20310c();
        C7430c cVar2 = null;
        try {
            synchronized (this.f7039d) {
                try {
                    this.f7055t = null;
                    if (cVar == null) {
                        mo7297d(new GlideException("Expected to receive a Resource<R> with an object of " + this.f7045j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = cVar.get();
                    if (obj2 != null) {
                        if (this.f7045j.isAssignableFrom(obj2.getClass())) {
                            if (!m8686n()) {
                                try {
                                    this.f7054s = null;
                                    this.f7058w = C2259a.COMPLETE;
                                    C6435b.m25530f("GlideRequest", this.f7036a);
                                    this.f7057v.mo7907k(cVar);
                                    return;
                                } catch (Throwable th) {
                                    cVar2 = cVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                m8681B(cVar, obj2, aVar, z);
                                return;
                            }
                        }
                    }
                    this.f7054s = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f7045j);
                    sb.append(" but instead got ");
                    if (obj2 != null) {
                        obj = obj2.getClass();
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    sb.append("{");
                    sb.append(obj2);
                    sb.append("} inside Resource{");
                    sb.append(cVar);
                    sb.append("}.");
                    if (obj2 != null) {
                        str = "";
                    } else {
                        str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                    }
                    sb.append(str);
                    mo7297d(new GlideException(sb.toString()));
                    this.f7057v.mo7907k(cVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (cVar2 != null) {
                this.f7057v.mo7907k(cVar2);
            }
            throw th3;
        }
    }

    /* renamed from: c */
    public void mo7261c() {
        synchronized (this.f7039d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r5.f7057v.mo7907k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7039d
            monitor-enter(r0)
            r5.m8683j()     // Catch:{ all -> 0x0040 }
            h4.c r1 = r5.f7038c     // Catch:{ all -> 0x0040 }
            r1.mo20310c()     // Catch:{ all -> 0x0040 }
            c4.j$a r1 = r5.f7058w     // Catch:{ all -> 0x0040 }
            c4.j$a r2 = p035c4.C2258j.C2259a.CLEARED     // Catch:{ all -> 0x0040 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0013:
            r5.m8687o()     // Catch:{ all -> 0x0040 }
            o3.c r1 = r5.f7054s     // Catch:{ all -> 0x0040 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f7054s = r3     // Catch:{ all -> 0x0040 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.m8684k()     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x002e
            d4.i r3 = r5.f7050o     // Catch:{ all -> 0x0040 }
            android.graphics.drawable.Drawable r4 = r5.m8691s()     // Catch:{ all -> 0x0040 }
            r3.mo7284i(r4)     // Catch:{ all -> 0x0040 }
        L_0x002e:
            java.lang.String r3 = "GlideRequest"
            int r4 = r5.f7036a     // Catch:{ all -> 0x0040 }
            p102h4.C6435b.m25530f(r3, r4)     // Catch:{ all -> 0x0040 }
            r5.f7058w = r2     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x003f
            com.bumptech.glide.load.engine.j r0 = r5.f7057v
            r0.mo7907k(r1)
        L_0x003f:
            return
        L_0x0040:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c4.C2258j.clear():void");
    }

    /* renamed from: d */
    public void mo7297d(GlideException glideException) {
        m8680A(glideException, 5);
    }

    /* renamed from: e */
    public void mo7299e(int i, int i2) {
        Object obj;
        this.f7038c.mo20310c();
        Object obj2 = this.f7039d;
        synchronized (obj2) {
            try {
                boolean z = f7031E;
                if (z) {
                    m8694v("Got onSizeReady in " + C6218g.m24713a(this.f7056u));
                }
                if (this.f7058w == C2259a.WAITING_FOR_SIZE) {
                    C2259a aVar = C2259a.RUNNING;
                    this.f7058w = aVar;
                    float D = this.f7046k.mo7196D();
                    this.f7032A = m8695w(i, D);
                    this.f7033B = m8695w(i2, D);
                    if (z) {
                        m8694v("finished setup for calling load in " + C6218g.m24713a(this.f7056u));
                    }
                    C2259a aVar2 = aVar;
                    boolean z2 = z;
                    C2259a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f7055t = this.f7057v.mo7906f(this.f7043h, this.f7044i, this.f7046k.mo7195C(), this.f7032A, this.f7033B, this.f7046k.mo7194B(), this.f7045j, this.f7049n, this.f7046k.mo7237m(), this.f7046k.mo7198F(), this.f7046k.mo7208S(), this.f7046k.mo7205M(), this.f7046k.mo7248s(), this.f7046k.mo7203K(), this.f7046k.mo7200H(), this.f7046k.mo7199G(), this.f7046k.mo7246r(), this, this.f7053r);
                        if (this.f7058w != aVar3) {
                            this.f7055t = null;
                        }
                        if (z2) {
                            m8694v("finished onSizeReady in " + C6218g.m24713a(this.f7056u));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public boolean mo7265f(C2250d dVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        C2247a aVar;
        C2390g gVar;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        C2247a aVar2;
        C2390g gVar2;
        int i6;
        C2250d dVar2 = dVar;
        if (!(dVar2 instanceof C2258j)) {
            return false;
        }
        synchronized (this.f7039d) {
            i = this.f7047l;
            i2 = this.f7048m;
            obj = this.f7044i;
            cls = this.f7045j;
            aVar = this.f7046k;
            gVar = this.f7049n;
            List list = this.f7051p;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        C2258j jVar = (C2258j) dVar2;
        synchronized (jVar.f7039d) {
            i4 = jVar.f7047l;
            i5 = jVar.f7048m;
            obj2 = jVar.f7044i;
            cls2 = jVar.f7045j;
            aVar2 = jVar.f7046k;
            gVar2 = jVar.f7049n;
            List list2 = jVar.f7051p;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5 && C6224l.m24734c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && i3 == i6) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo7266g() {
        boolean z;
        synchronized (this.f7039d) {
            if (this.f7058w == C2259a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: h */
    public Object mo7298h() {
        this.f7038c.mo20310c();
        return this.f7039d;
    }

    /* renamed from: i */
    public boolean mo7268i() {
        boolean z;
        synchronized (this.f7039d) {
            if (this.f7058w == C2259a.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f7039d) {
            C2259a aVar = this.f7058w;
            if (aVar != C2259a.RUNNING) {
                if (aVar != C2259a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7272l() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7039d
            monitor-enter(r0)
            r5.m8683j()     // Catch:{ all -> 0x00b3 }
            h4.c r1 = r5.f7038c     // Catch:{ all -> 0x00b3 }
            r1.mo20310c()     // Catch:{ all -> 0x00b3 }
            long r1 = p089g4.C6218g.m24714b()     // Catch:{ all -> 0x00b3 }
            r5.f7056u = r1     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r5.f7044i     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f7047l     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f7048m     // Catch:{ all -> 0x00b3 }
            boolean r1 = p089g4.C6224l.m24752u(r1, r2)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f7047l     // Catch:{ all -> 0x00b3 }
            r5.f7032A = r1     // Catch:{ all -> 0x00b3 }
            int r1 = r5.f7048m     // Catch:{ all -> 0x00b3 }
            r5.f7033B = r1     // Catch:{ all -> 0x00b3 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.m8690r()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
            r5.m8680A(r2, r1)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x003c:
            c4.j$a r2 = r5.f7058w     // Catch:{ all -> 0x00b3 }
            c4.j$a r3 = p035c4.C2258j.C2259a.RUNNING     // Catch:{ all -> 0x00b3 }
            if (r2 == r3) goto L_0x00ab
            c4.j$a r4 = p035c4.C2258j.C2259a.COMPLETE     // Catch:{ all -> 0x00b3 }
            if (r2 != r4) goto L_0x0050
            o3.c r1 = r5.f7054s     // Catch:{ all -> 0x00b3 }
            m3.a r2 = p166m3.C7079a.MEMORY_CACHE     // Catch:{ all -> 0x00b3 }
            r3 = 0
            r5.mo7296b(r1, r2, r3)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0050:
            r5.m8688p(r1)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "GlideRequest"
            int r1 = p102h4.C6435b.m25526b(r1)     // Catch:{ all -> 0x00b3 }
            r5.f7036a = r1     // Catch:{ all -> 0x00b3 }
            c4.j$a r1 = p035c4.C2258j.C2259a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b3 }
            r5.f7058w = r1     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f7047l     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f7048m     // Catch:{ all -> 0x00b3 }
            boolean r2 = p089g4.C6224l.m24752u(r2, r4)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0071
            int r2 = r5.f7047l     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f7048m     // Catch:{ all -> 0x00b3 }
            r5.mo7299e(r2, r4)     // Catch:{ all -> 0x00b3 }
            goto L_0x0076
        L_0x0071:
            d4.i r2 = r5.f7050o     // Catch:{ all -> 0x00b3 }
            r2.mo7275a(r5)     // Catch:{ all -> 0x00b3 }
        L_0x0076:
            c4.j$a r2 = r5.f7058w     // Catch:{ all -> 0x00b3 }
            if (r2 == r3) goto L_0x007c
            if (r2 != r1) goto L_0x008b
        L_0x007c:
            boolean r1 = r5.m8685m()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x008b
            d4.i r1 = r5.f7050o     // Catch:{ all -> 0x00b3 }
            android.graphics.drawable.Drawable r2 = r5.m8691s()     // Catch:{ all -> 0x00b3 }
            r1.mo7280g(r2)     // Catch:{ all -> 0x00b3 }
        L_0x008b:
            boolean r1 = f7031E     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            long r2 = r5.f7056u     // Catch:{ all -> 0x00b3 }
            double r2 = p089g4.C6218g.m24713a(r2)     // Catch:{ all -> 0x00b3 }
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b3 }
            r5.m8694v(r1)     // Catch:{ all -> 0x00b3 }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00b3 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c4.C2258j.mo7272l():void");
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f7039d) {
            obj = this.f7044i;
            cls = this.f7045j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
