package bg1;

import dg1.C40672b;
import dg1.C40681e;
import dg1.C40684f;
import dg1.C40705x;
import java.io.Closeable;
import java.util.zip.Deflater;

/* renamed from: bg1.a */
public final class C40367a implements Closeable {

    /* renamed from: d */
    private final boolean f95873d;

    /* renamed from: e */
    private final C40672b f95874e;

    /* renamed from: f */
    private final Deflater f95875f;

    /* renamed from: g */
    private final C40684f f95876g;

    public C40367a(boolean z) {
        this.f95873d = z;
        C40672b bVar = new C40672b();
        this.f95874e = bVar;
        Deflater deflater = new Deflater(-1, true);
        this.f95875f = deflater;
        this.f95876g = new C40684f((C40705x) bVar, deflater);
    }

    /* renamed from: c */
    private final boolean m116886c(C40672b bVar, C40681e eVar) {
        return bVar.mo94725a0(bVar.mo94709M0() - ((long) eVar.mo94793B()), eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        se1.C42550b.m123187a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94404a(dg1.C40672b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            dg1.b r0 = r6.f95874e
            long r0 = r0.mo94709M0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            if (r0 == 0) goto L_0x0068
            boolean r0 = r6.f95873d
            if (r0 == 0) goto L_0x0021
            java.util.zip.Deflater r0 = r6.f95875f
            r0.reset()
        L_0x0021:
            dg1.f r0 = r6.f95876g
            long r3 = r7.mo94709M0()
            r0.mo21301x1(r7, r3)
            dg1.f r0 = r6.f95876g
            r0.flush()
            dg1.b r0 = r6.f95874e
            dg1.e r3 = bg1.C40368b.f95877a
            boolean r0 = r6.m116886c(r0, r3)
            if (r0 == 0) goto L_0x0059
            dg1.b r0 = r6.f95874e
            long r2 = r0.mo94709M0()
            r0 = 4
            long r4 = (long) r0
            long r2 = r2 - r4
            dg1.b r0 = r6.f95874e
            r4 = 0
            dg1.b$a r0 = dg1.C40672b.m117576m0(r0, r4, r1, r4)
            r0.mo94779m(r2)     // Catch:{ all -> 0x0052 }
            se1.C42550b.m123187a(r0, r4)
            goto L_0x005e
        L_0x0052:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            se1.C42550b.m123187a(r0, r7)
            throw r1
        L_0x0059:
            dg1.b r0 = r6.f95874e
            r0.mo94715R0(r2)
        L_0x005e:
            dg1.b r0 = r6.f95874e
            long r1 = r0.mo94709M0()
            r7.mo21301x1(r0, r1)
            return
        L_0x0068:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bg1.C40367a.mo94404a(dg1.b):void");
    }

    public void close() {
        this.f95876g.close();
    }
}
