package p259t5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p142k5.C6811b;
import p168m5.C7117h;
import p168m5.C7118i;
import p168m5.C7129p;
import p181n5.C7233e;
import p181n5.C7234f;
import p181n5.C7236g;
import p181n5.C7244m;
import p207p5.C7711a;
import p207p5.C7715c;
import p220q5.C7894a;
import p272u5.C8585c;
import p272u5.C8587d;
import p272u5.C8605k;
import p285v5.C8702a;
import p298w5.C8850a;

/* renamed from: t5.r */
public class C8392r {

    /* renamed from: a */
    private final Context f23822a;

    /* renamed from: b */
    private final C7233e f23823b;

    /* renamed from: c */
    private final C8587d f23824c;

    /* renamed from: d */
    private final C8398x f23825d;

    /* renamed from: e */
    private final Executor f23826e;

    /* renamed from: f */
    private final C8702a f23827f;

    /* renamed from: g */
    private final C8850a f23828g;

    /* renamed from: h */
    private final C8850a f23829h;

    /* renamed from: i */
    private final C8585c f23830i;

    public C8392r(Context context, C7233e eVar, C8587d dVar, C8398x xVar, Executor executor, C8702a aVar, C8850a aVar2, C8850a aVar3, C8585c cVar) {
        this.f23822a = context;
        this.f23823b = eVar;
        this.f23824c = dVar;
        this.f23825d = xVar;
        this.f23826e = executor;
        this.f23827f = aVar;
        this.f23828g = aVar2;
        this.f23829h = aVar3;
        this.f23830i = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m31496l(C7129p pVar) {
        return Boolean.valueOf(this.f23824c.mo23951g0(pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m31497m(C7129p pVar) {
        return this.f23824c.mo23950T0(pVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m31498n(Iterable iterable, C7129p pVar, long j) {
        this.f23824c.mo23945A0(iterable);
        this.f23824c.mo23953u1(pVar, this.f23828g.mo24276a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m31499o(Iterable iterable) {
        this.f23824c.mo23947H(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m31500p() {
        this.f23830i.mo23942a();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m31501q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f23830i.mo23943d((long) ((Integer) entry.getValue()).intValue(), C7715c.C7717b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m31502r(C7129p pVar, long j) {
        this.f23824c.mo23953u1(pVar, this.f23828g.mo24276a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m31503s(C7129p pVar, int i) {
        this.f23825d.mo23577b(pVar, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f23825d.mo23577b(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m31504t(p168m5.C7129p r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            v5.a r0 = r3.f23827f     // Catch:{ SynchronizationException -> 0x0026 }
            u5.d r1 = r3.f23824c     // Catch:{ SynchronizationException -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            t5.i r2 = new t5.i     // Catch:{ SynchronizationException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo23960c(r2)     // Catch:{ SynchronizationException -> 0x0026 }
            boolean r0 = r3.mo23587k()     // Catch:{ SynchronizationException -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            v5.a r0 = r3.f23827f     // Catch:{ SynchronizationException -> 0x0026 }
            t5.j r1 = new t5.j     // Catch:{ SynchronizationException -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo23960c(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo23588u(r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            t5.x r0 = r3.f23825d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo23577b(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p259t5.C8392r.m31504t(m5.p, int, java.lang.Runnable):void");
    }

    /* renamed from: j */
    public C7118i mo23586j(C7244m mVar) {
        C8702a aVar = this.f23827f;
        C8585c cVar = this.f23830i;
        Objects.requireNonNull(cVar);
        return mVar.mo11433b(C7118i.m27441a().mo21338i(this.f23828g.mo24276a()).mo21340k(this.f23829h.mo24276a()).mo21339j("GDT_CLIENT_METRICS").mo21337h(new C7117h(C6811b.m26540b("proto"), ((C7711a) aVar.mo23960c(new C8382h(cVar))).mo22446f())).mo21333d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo23587k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f23822a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public C7236g mo23588u(C7129p pVar, int i) {
        C7236g a;
        C7244m a2 = this.f23823b.mo21610a(pVar.mo21355b());
        long j = 0;
        C7236g e = C7236g.m27828e(0);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f23827f.mo23960c(new C8385k(this, pVar))).booleanValue()) {
                Iterable<C8605k> iterable = (Iterable) this.f23827f.mo23960c(new C8386l(this, pVar));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (a2 == null) {
                    C7894a.m29864b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    a = C7236g.m27826a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C8605k b : iterable) {
                        arrayList.add(b.mo23936b());
                    }
                    if (pVar.mo21386e()) {
                        arrayList.add(mo23586j(a2));
                    }
                    a = a2.mo11432a(C7234f.m27820a().mo21596b(arrayList).mo21597c(pVar.mo21356c()).mo21595a());
                }
                e = a;
                if (e.mo21599c() == C7236g.C7237a.TRANSIENT_ERROR) {
                    this.f23827f.mo23960c(new C8387m(this, iterable, pVar, j2));
                    this.f23825d.mo23576a(pVar, i + 1, true);
                    return e;
                }
                this.f23827f.mo23960c(new C8388n(this, iterable));
                if (e.mo21599c() == C7236g.C7237a.OK) {
                    j = Math.max(j2, e.mo21598b());
                    if (pVar.mo21386e()) {
                        this.f23827f.mo23960c(new C8389o(this));
                    }
                } else if (e.mo21599c() == C7236g.C7237a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C8605k b2 : iterable) {
                        String j3 = b2.mo23936b().mo21330j();
                        if (!hashMap.containsKey(j3)) {
                            hashMap.put(j3, 1);
                        } else {
                            hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                        }
                    }
                    this.f23827f.mo23960c(new C8390p(this, hashMap));
                }
            }
            this.f23827f.mo23960c(new C8391q(this, pVar, j2));
            return e;
        }
    }

    /* renamed from: v */
    public void mo23589v(C7129p pVar, int i, Runnable runnable) {
        this.f23826e.execute(new C8381g(this, pVar, i, runnable));
    }
}
