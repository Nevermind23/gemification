package tf1;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.io.IOException;
import kotlin.jvm.internal.C41536l;
import of1.C41863a;
import of1.C41889f0;
import of1.C41917r;
import of1.C41931v;
import of1.C41944z;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import pf1.C42197d;
import tf1.C43016i;
import uf1.C43091d;
import uf1.C43094g;
import wf1.C43194a;

/* renamed from: tf1.d */
public final class C43001d {

    /* renamed from: a */
    private final C43012g f100366a;

    /* renamed from: b */
    private final C41863a f100367b;

    /* renamed from: c */
    private final C43002e f100368c;

    /* renamed from: d */
    private final C41917r f100369d;

    /* renamed from: e */
    private C43016i.C43018b f100370e;

    /* renamed from: f */
    private C43016i f100371f;

    /* renamed from: g */
    private int f100372g;

    /* renamed from: h */
    private int f100373h;

    /* renamed from: i */
    private int f100374i;

    /* renamed from: j */
    private C41889f0 f100375j;

    public C43001d(C43012g gVar, C41863a aVar, C43002e eVar, C41917r rVar) {
        C41536l.m120489i(gVar, "connectionPool");
        C41536l.m120489i(aVar, "address");
        C41536l.m120489i(eVar, "call");
        C41536l.m120489i(rVar, "eventListener");
        this.f100366a = gVar;
        this.f100367b = aVar;
        this.f100368c = eVar;
        this.f100369d = rVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0151  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final tf1.C43006f m123381b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
            tf1.e r0 = r1.f100368c
            boolean r0 = r0.mo96790x()
            if (r0 != 0) goto L_0x0179
            tf1.e r0 = r1.f100368c
            tf1.f r2 = r0.mo101542l()
            r0 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0065
            monitor-enter(r2)
            boolean r5 = r2.mo101574q()     // Catch:{ all -> 0x0062 }
            if (r5 != 0) goto L_0x0030
            of1.f0 r5 = r2.mo101562B()     // Catch:{ all -> 0x0062 }
            of1.a r5 = r5.mo96800a()     // Catch:{ all -> 0x0062 }
            of1.v r5 = r5.mo96668l()     // Catch:{ all -> 0x0062 }
            boolean r5 = r14.mo101532g(r5)     // Catch:{ all -> 0x0062 }
            if (r5 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r5 = r4
            goto L_0x0036
        L_0x0030:
            tf1.e r5 = r1.f100368c     // Catch:{ all -> 0x0062 }
            java.net.Socket r5 = r5.mo101552y()     // Catch:{ all -> 0x0062 }
        L_0x0036:
            he1.w r6 = he1.C41238w.f97225a     // Catch:{ all -> 0x0062 }
            monitor-exit(r2)
            tf1.e r6 = r1.f100368c
            tf1.f r6 = r6.mo101542l()
            if (r6 == 0) goto L_0x0054
            if (r5 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            if (r0 == 0) goto L_0x0048
            return r2
        L_0x0048:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0054:
            if (r5 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            pf1.C42197d.m122548n(r5)
        L_0x005a:
            of1.r r5 = r1.f100369d
            tf1.e r6 = r1.f100368c
            r5.mo96895k(r6, r2)
            goto L_0x0065
        L_0x0062:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0065:
            r1.f100372g = r3
            r1.f100373h = r3
            r1.f100374i = r3
            tf1.g r2 = r1.f100366a
            of1.a r5 = r1.f100367b
            tf1.e r6 = r1.f100368c
            boolean r2 = r2.mo101588a(r5, r6, r4, r3)
            if (r2 == 0) goto L_0x0088
            tf1.e r0 = r1.f100368c
            tf1.f r0 = r0.mo101542l()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            of1.r r2 = r1.f100369d
            tf1.e r3 = r1.f100368c
            r2.mo96894j(r3, r0)
            return r0
        L_0x0088:
            of1.f0 r2 = r1.f100375j
            if (r2 == 0) goto L_0x0093
            kotlin.jvm.internal.C41536l.m120486f(r2)
            r1.f100375j = r4
        L_0x0091:
            r5 = r4
            goto L_0x00f8
        L_0x0093:
            tf1.i$b r2 = r1.f100370e
            if (r2 == 0) goto L_0x00aa
            kotlin.jvm.internal.C41536l.m120486f(r2)
            boolean r2 = r2.mo101599b()
            if (r2 == 0) goto L_0x00aa
            tf1.i$b r2 = r1.f100370e
            kotlin.jvm.internal.C41536l.m120486f(r2)
            of1.f0 r2 = r2.mo101600c()
            goto L_0x0091
        L_0x00aa:
            tf1.i r2 = r1.f100371f
            if (r2 != 0) goto L_0x00c5
            tf1.i r2 = new tf1.i
            of1.a r5 = r1.f100367b
            tf1.e r6 = r1.f100368c
            of1.z r6 = r6.mo101541k()
            tf1.h r6 = r6.mo97061t()
            tf1.e r7 = r1.f100368c
            of1.r r8 = r1.f100369d
            r2.<init>(r5, r6, r7, r8)
            r1.f100371f = r2
        L_0x00c5:
            tf1.i$b r2 = r2.mo101596c()
            r1.f100370e = r2
            java.util.List r5 = r2.mo101598a()
            tf1.e r6 = r1.f100368c
            boolean r6 = r6.mo96790x()
            if (r6 != 0) goto L_0x0171
            tf1.g r6 = r1.f100366a
            of1.a r7 = r1.f100367b
            tf1.e r8 = r1.f100368c
            boolean r3 = r6.mo101588a(r7, r8, r5, r3)
            if (r3 == 0) goto L_0x00f4
            tf1.e r0 = r1.f100368c
            tf1.f r0 = r0.mo101542l()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            of1.r r2 = r1.f100369d
            tf1.e r3 = r1.f100368c
            r2.mo96894j(r3, r0)
            return r0
        L_0x00f4:
            of1.f0 r2 = r2.mo101600c()
        L_0x00f8:
            tf1.f r3 = new tf1.f
            tf1.g r6 = r1.f100366a
            r3.<init>(r6, r2)
            tf1.e r6 = r1.f100368c
            r6.mo101534A(r3)
            tf1.e r12 = r1.f100368c     // Catch:{ all -> 0x016a }
            of1.r r13 = r1.f100369d     // Catch:{ all -> 0x016a }
            r6 = r3
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.mo101570g(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x016a }
            tf1.e r6 = r1.f100368c
            r6.mo101534A(r4)
            tf1.e r4 = r1.f100368c
            of1.z r4 = r4.mo101541k()
            tf1.h r4 = r4.mo97061t()
            of1.f0 r6 = r3.mo101562B()
            r4.mo101592a(r6)
            tf1.g r4 = r1.f100366a
            of1.a r6 = r1.f100367b
            tf1.e r7 = r1.f100368c
            boolean r0 = r4.mo101588a(r6, r7, r5, r0)
            if (r0 == 0) goto L_0x0151
            tf1.e r0 = r1.f100368c
            tf1.f r0 = r0.mo101542l()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            r1.f100375j = r2
            java.net.Socket r2 = r3.mo101565F()
            pf1.C42197d.m122548n(r2)
            of1.r r2 = r1.f100369d
            tf1.e r3 = r1.f100368c
            r2.mo96894j(r3, r0)
            return r0
        L_0x0151:
            monitor-enter(r3)
            tf1.g r0 = r1.f100366a     // Catch:{ all -> 0x0167 }
            r0.mo101591e(r3)     // Catch:{ all -> 0x0167 }
            tf1.e r0 = r1.f100368c     // Catch:{ all -> 0x0167 }
            r0.mo101536c(r3)     // Catch:{ all -> 0x0167 }
            he1.w r0 = he1.C41238w.f97225a     // Catch:{ all -> 0x0167 }
            monitor-exit(r3)
            of1.r r0 = r1.f100369d
            tf1.e r2 = r1.f100368c
            r0.mo96894j(r2, r3)
            return r3
        L_0x0167:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x016a:
            r0 = move-exception
            tf1.e r2 = r1.f100368c
            r2.mo101534A(r4)
            throw r0
        L_0x0171:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0179:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.C43001d.m123381b(int, int, int, int, boolean):tf1.f");
    }

    /* renamed from: c */
    private final C43006f m123382c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        boolean z3;
        while (true) {
            C43006f b = m123381b(i, i2, i3, i4, z);
            if (b.mo101580v(z2)) {
                return b;
            }
            b.mo101561A();
            if (this.f100375j == null) {
                C43016i.C43018b bVar = this.f100370e;
                boolean z4 = true;
                if (bVar == null) {
                    z3 = true;
                } else {
                    z3 = bVar.mo101599b();
                }
                if (!z3) {
                    C43016i iVar = this.f100371f;
                    if (iVar != null) {
                        z4 = iVar.mo101595a();
                    }
                    if (!z4) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: f */
    private final C41889f0 m123383f() {
        C43006f l;
        if (this.f100372g > 1 || this.f100373h > 1 || this.f100374i > 0 || (l = this.f100368c.mo101542l()) == null) {
            return null;
        }
        synchronized (l) {
            if (l.mo101575r() != 0) {
                return null;
            }
            if (!C42197d.m122544j(l.mo101562B().mo96800a().mo96668l(), mo101530d().mo96668l())) {
                return null;
            }
            C41889f0 B = l.mo101562B();
            return B;
        }
    }

    /* renamed from: a */
    public final C43091d mo101529a(C41944z zVar, C43094g gVar) {
        boolean z;
        C41536l.m120489i(zVar, "client");
        C41536l.m120489i(gVar, "chain");
        try {
            int f = gVar.mo101665f();
            int h = gVar.mo101667h();
            int j = gVar.mo101669j();
            int D = zVar.mo97035D();
            boolean J = zVar.mo97041J();
            if (!C41536l.m120484d(gVar.mo101668i().mo96678g(), "GET")) {
                z = true;
            } else {
                z = false;
            }
            return m123382c(f, h, j, D, J, z).mo101582x(zVar, gVar);
        } catch (RouteException e) {
            mo101533h(e.mo97166c());
            throw e;
        } catch (IOException e2) {
            mo101533h(e2);
            throw new RouteException(e2);
        }
    }

    /* renamed from: d */
    public final C41863a mo101530d() {
        return this.f100367b;
    }

    /* renamed from: e */
    public final boolean mo101531e() {
        C43016i iVar;
        boolean z = false;
        if (this.f100372g == 0 && this.f100373h == 0 && this.f100374i == 0) {
            return false;
        }
        if (this.f100375j != null) {
            return true;
        }
        C41889f0 f = m123383f();
        if (f != null) {
            this.f100375j = f;
            return true;
        }
        C43016i.C43018b bVar = this.f100370e;
        if (bVar != null && bVar.mo101599b()) {
            z = true;
        }
        if (!z && (iVar = this.f100371f) != null) {
            return iVar.mo101595a();
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo101532g(C41931v vVar) {
        C41536l.m120489i(vVar, C11769i.C11770a.f34149l);
        C41931v l = this.f100367b.mo96668l();
        if (vVar.mo96959o() != l.mo96959o() || !C41536l.m120484d(vVar.mo96954i(), l.mo96954i())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo101533h(IOException iOException) {
        C41536l.m120489i(iOException, "e");
        this.f100375j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f98691d == C43194a.REFUSED_STREAM) {
            this.f100372g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f100373h++;
        } else {
            this.f100374i++;
        }
    }
}
