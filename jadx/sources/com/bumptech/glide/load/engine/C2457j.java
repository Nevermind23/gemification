package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.C1005e;
import com.bumptech.glide.C2386d;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.engine.C2446h;
import com.bumptech.glide.load.engine.C2473o;
import java.util.Map;
import java.util.concurrent.Executor;
import p035c4.C2257i;
import p089g4.C6218g;
import p089g4.C6223k;
import p102h4.C6427a;
import p166m3.C7079a;
import p166m3.C7083e;
import p166m3.C7088h;
import p192o3.C7423a;
import p192o3.C7430c;
import p218q3.C7864a;
import p218q3.C7867b;
import p218q3.C7877h;
import p231r3.C8049a;

/* renamed from: com.bumptech.glide.load.engine.j */
public class C2457j implements C2470l, C7877h.C7878a, C2473o.C2474a {

    /* renamed from: i */
    private static final boolean f7783i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C2475p f7784a;

    /* renamed from: b */
    private final C2472n f7785b;

    /* renamed from: c */
    private final C7877h f7786c;

    /* renamed from: d */
    private final C2460b f7787d;

    /* renamed from: e */
    private final C2481u f7788e;

    /* renamed from: f */
    private final C2462c f7789f;

    /* renamed from: g */
    private final C2458a f7790g;

    /* renamed from: h */
    private final C2434a f7791h;

    /* renamed from: com.bumptech.glide.load.engine.j$a */
    static class C2458a {

        /* renamed from: a */
        final C2446h.C2451e f7792a;

        /* renamed from: b */
        final C1005e f7793b = C6427a.m25514d(150, new C2459a());

        /* renamed from: c */
        private int f7794c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a */
        class C2459a implements C6427a.C6431d {
            C2459a() {
            }

            /* renamed from: a */
            public C2446h create() {
                C2458a aVar = C2458a.this;
                return new C2446h(aVar.f7792a, aVar.f7793b);
            }
        }

        C2458a(C2446h.C2451e eVar) {
            this.f7792a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2446h mo7908a(C2386d dVar, Object obj, C2471m mVar, C7083e eVar, int i, int i2, Class cls, Class cls2, C2390g gVar, C7423a aVar, Map map, boolean z, boolean z2, boolean z3, C7088h hVar, C2446h.C2448b bVar) {
            C2446h hVar2 = (C2446h) C6223k.m24730d((C2446h) this.f7793b.mo3440b());
            int i3 = this.f7794c;
            int i4 = i3;
            this.f7794c = i3 + 1;
            return hVar2.mo7886s(dVar, obj, mVar, eVar, i, i2, cls, cls2, gVar, aVar, map, z, z2, z3, hVar, bVar, i4);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$b */
    static class C2460b {

        /* renamed from: a */
        final C8049a f7796a;

        /* renamed from: b */
        final C8049a f7797b;

        /* renamed from: c */
        final C8049a f7798c;

        /* renamed from: d */
        final C8049a f7799d;

        /* renamed from: e */
        final C2470l f7800e;

        /* renamed from: f */
        final C2473o.C2474a f7801f;

        /* renamed from: g */
        final C1005e f7802g = C6427a.m25514d(150, new C2461a());

        /* renamed from: com.bumptech.glide.load.engine.j$b$a */
        class C2461a implements C6427a.C6431d {
            C2461a() {
            }

            /* renamed from: a */
            public C2464k create() {
                C2460b bVar = C2460b.this;
                return new C2464k(bVar.f7796a, bVar.f7797b, bVar.f7798c, bVar.f7799d, bVar.f7800e, bVar.f7801f, bVar.f7802g);
            }
        }

        C2460b(C8049a aVar, C8049a aVar2, C8049a aVar3, C8049a aVar4, C2470l lVar, C2473o.C2474a aVar5) {
            this.f7796a = aVar;
            this.f7797b = aVar2;
            this.f7798c = aVar3;
            this.f7799d = aVar4;
            this.f7800e = lVar;
            this.f7801f = aVar5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2464k mo7911a(C7083e eVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C2464k) C6223k.m24730d((C2464k) this.f7802g.mo3440b())).mo7920l(eVar, z, z2, z3, z4);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$c */
    private static class C2462c implements C2446h.C2451e {

        /* renamed from: a */
        private final C7864a.C7865a f7804a;

        /* renamed from: b */
        private volatile C7864a f7805b;

        C2462c(C7864a.C7865a aVar) {
            this.f7804a = aVar;
        }

        /* renamed from: a */
        public C7864a mo7895a() {
            if (this.f7805b == null) {
                synchronized (this) {
                    if (this.f7805b == null) {
                        this.f7805b = this.f7804a.mo22835a();
                    }
                    if (this.f7805b == null) {
                        this.f7805b = new C7867b();
                    }
                }
            }
            return this.f7805b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$d */
    public class C2463d {

        /* renamed from: a */
        private final C2464k f7806a;

        /* renamed from: b */
        private final C2257i f7807b;

        C2463d(C2257i iVar, C2464k kVar) {
            this.f7807b = iVar;
            this.f7806a = kVar;
        }

        /* renamed from: a */
        public void mo7913a() {
            synchronized (C2457j.this) {
                this.f7806a.mo7924r(this.f7807b);
            }
        }
    }

    public C2457j(C7877h hVar, C7864a.C7865a aVar, C8049a aVar2, C8049a aVar3, C8049a aVar4, C8049a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (C2475p) null, (C2472n) null, (C2434a) null, (C2460b) null, (C2458a) null, (C2481u) null, z);
    }

    /* renamed from: e */
    private C2473o m9516e(C7083e eVar) {
        C7430c c = this.f7786c.mo22842c(eVar);
        if (c == null) {
            return null;
        }
        if (c instanceof C2473o) {
            return (C2473o) c;
        }
        return new C2473o(c, true, true, eVar, this);
    }

    /* renamed from: g */
    private C2473o m9517g(C7083e eVar) {
        C2473o e = this.f7791h.mo7837e(eVar);
        if (e != null) {
            e.mo7942b();
        }
        return e;
    }

    /* renamed from: h */
    private C2473o m9518h(C7083e eVar) {
        C2473o e = m9516e(eVar);
        if (e != null) {
            e.mo7942b();
            this.f7791h.mo7833a(eVar, e);
        }
        return e;
    }

    /* renamed from: i */
    private C2473o m9519i(C2471m mVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C2473o g = m9517g(mVar);
        if (g != null) {
            if (f7783i) {
                m9520j("Loaded resource from active resources", j, mVar);
            }
            return g;
        }
        C2473o h = m9518h(mVar);
        if (h == null) {
            return null;
        }
        if (f7783i) {
            m9520j("Loaded resource from cache", j, mVar);
        }
        return h;
    }

    /* renamed from: j */
    private static void m9520j(String str, long j, C7083e eVar) {
        Log.v("Engine", str + " in " + C6218g.m24713a(j) + "ms, key: " + eVar);
    }

    /* renamed from: l */
    private C2463d m9521l(C2386d dVar, Object obj, C7083e eVar, int i, int i2, Class cls, Class cls2, C2390g gVar, C7423a aVar, Map map, boolean z, boolean z2, C7088h hVar, boolean z3, boolean z4, boolean z5, boolean z6, C2257i iVar, Executor executor, C2471m mVar, long j) {
        C2257i iVar2 = iVar;
        Executor executor2 = executor;
        C2471m mVar2 = mVar;
        long j2 = j;
        C2464k a = this.f7784a.mo7950a(mVar2, z6);
        if (a != null) {
            a.mo7914e(iVar2, executor2);
            if (f7783i) {
                m9520j("Added to existing load", j2, mVar2);
            }
            return new C2463d(iVar2, a);
        }
        C2464k a2 = this.f7787d.mo7911a(mVar, z3, z4, z5, z6);
        C2464k kVar = a2;
        C2471m mVar3 = mVar2;
        C2446h a3 = this.f7790g.mo7908a(dVar, obj, mVar, eVar, i, i2, cls, cls2, gVar, aVar, map, z, z2, z6, hVar, a2);
        this.f7784a.mo7951c(mVar3, kVar);
        C2464k kVar2 = kVar;
        C2471m mVar4 = mVar3;
        C2257i iVar3 = iVar;
        kVar2.mo7914e(iVar3, executor);
        kVar2.mo7925s(a3);
        if (f7783i) {
            m9520j("Started new load", j, mVar4);
        }
        return new C2463d(iVar3, kVar2);
    }

    /* renamed from: a */
    public synchronized void mo7902a(C2464k kVar, C7083e eVar) {
        this.f7784a.mo7952d(eVar, kVar);
    }

    /* renamed from: b */
    public void mo7903b(C7430c cVar) {
        this.f7788e.mo7958a(cVar, true);
    }

    /* renamed from: c */
    public void mo7904c(C7083e eVar, C2473o oVar) {
        this.f7791h.mo7836d(eVar);
        if (oVar.mo7945e()) {
            this.f7786c.mo22843d(eVar, oVar);
        } else {
            this.f7788e.mo7958a(oVar, false);
        }
    }

    /* renamed from: d */
    public synchronized void mo7905d(C2464k kVar, C7083e eVar, C2473o oVar) {
        if (oVar != null) {
            if (oVar.mo7945e()) {
                this.f7791h.mo7833a(eVar, oVar);
            }
        }
        this.f7784a.mo7952d(eVar, kVar);
    }

    /* renamed from: f */
    public C2463d mo7906f(C2386d dVar, Object obj, C7083e eVar, int i, int i2, Class cls, Class cls2, C2390g gVar, C7423a aVar, Map map, boolean z, boolean z2, C7088h hVar, boolean z3, boolean z4, boolean z5, boolean z6, C2257i iVar, Executor executor) {
        long j;
        if (f7783i) {
            j = C6218g.m24714b();
        } else {
            j = 0;
        }
        long j2 = j;
        C2471m a = this.f7785b.mo7940a(obj, eVar, i, i2, map, cls, cls2, hVar);
        synchronized (this) {
            C2473o i3 = m9519i(a, z3, j2);
            if (i3 == null) {
                C2463d l = m9521l(dVar, obj, eVar, i, i2, cls, cls2, gVar, aVar, map, z, z2, hVar, z3, z4, z5, z6, iVar, executor, a, j2);
                return l;
            }
            iVar.mo7296b(i3, C7079a.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: k */
    public void mo7907k(C7430c cVar) {
        if (cVar instanceof C2473o) {
            ((C2473o) cVar).mo7946f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    C2457j(C7877h hVar, C7864a.C7865a aVar, C8049a aVar2, C8049a aVar3, C8049a aVar4, C8049a aVar5, C2475p pVar, C2472n nVar, C2434a aVar6, C2460b bVar, C2458a aVar7, C2481u uVar, boolean z) {
        this.f7786c = hVar;
        C7864a.C7865a aVar8 = aVar;
        C2462c cVar = new C2462c(aVar);
        this.f7789f = cVar;
        C2434a aVar9 = aVar6 == null ? new C2434a(z) : aVar6;
        this.f7791h = aVar9;
        aVar9.mo7838f(this);
        this.f7785b = nVar == null ? new C2472n() : nVar;
        this.f7784a = pVar == null ? new C2475p() : pVar;
        this.f7787d = bVar == null ? new C2460b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f7790g = aVar7 == null ? new C2458a(cVar) : aVar7;
        this.f7788e = uVar == null ? new C2481u() : uVar;
        hVar.mo22844e(this);
    }
}
