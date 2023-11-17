package dg1;

import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.r */
public final class C40697r implements C40707z {

    /* renamed from: d */
    private final C40679d f96357d;

    /* renamed from: e */
    private final C40672b f96358e;

    /* renamed from: f */
    private C40701u f96359f;

    /* renamed from: g */
    private int f96360g;

    /* renamed from: h */
    private boolean f96361h;

    /* renamed from: i */
    private long f96362i;

    public C40697r(C40679d dVar) {
        int i;
        C41536l.m120489i(dVar, "upstream");
        this.f96357d = dVar;
        C40672b B = dVar.mo94690B();
        this.f96358e = B;
        C40701u uVar = B.f96314d;
        this.f96359f = uVar;
        if (uVar == null) {
            i = -1;
        } else {
            i = uVar.f96372b;
        }
        this.f96360g = i;
    }

    /* renamed from: C */
    public C40669a0 mo94678C() {
        return this.f96357d.mo94678C();
    }

    public void close() {
        this.f96361h = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f96372b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo21305g(dg1.C40672b r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f96361h
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x007b
            dg1.u r5 = r8.f96359f
            if (r5 == 0) goto L_0x002a
            dg1.b r6 = r8.f96358e
            dg1.u r6 = r6.f96314d
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f96360g
            kotlin.jvm.internal.C41536l.m120486f(r6)
            int r6 = r6.f96372b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x006f
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            dg1.d r0 = r8.f96357d
            long r1 = r8.f96362i
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo94739l(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            dg1.u r0 = r8.f96359f
            if (r0 != 0) goto L_0x0053
            dg1.b r0 = r8.f96358e
            dg1.u r0 = r0.f96314d
            if (r0 == 0) goto L_0x0053
            r8.f96359f = r0
            kotlin.jvm.internal.C41536l.m120486f(r0)
            int r0 = r0.f96372b
            r8.f96360g = r0
        L_0x0053:
            dg1.b r0 = r8.f96358e
            long r0 = r0.mo94709M0()
            long r2 = r8.f96362i
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            dg1.b r2 = r8.f96358e
            long r4 = r8.f96362i
            r3 = r9
            r6 = r10
            r2.mo94747p(r3, r4, r6)
            long r0 = r8.f96362i
            long r0 = r0 + r10
            r8.f96362i = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r9 = kotlin.jvm.internal.C41536l.m120497q(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dg1.C40697r.mo21305g(dg1.b, long):long");
    }
}
