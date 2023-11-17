package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.q2 */
final class C9707q2 extends C9639d {

    /* renamed from: j */
    private final C9634c f26457j;

    /* renamed from: k */
    private final C9431J f26458k;

    /* renamed from: l */
    private final long f26459l;

    /* renamed from: m */
    private final long f26460m;

    /* renamed from: n */
    private long f26461n;

    /* renamed from: o */
    private volatile boolean f26462o;

    C9707q2(C9634c cVar, C9634c cVar2, C9371P p, C9431J j, long j2, long j3) {
        super((C9735w0) cVar2, p);
        this.f26457j = cVar;
        this.f26458k = j;
        this.f26459l = j2;
        this.f26460m = j3;
    }

    C9707q2(C9707q2 q2Var, C9371P p) {
        super((C9639d) q2Var, p);
        this.f26457j = q2Var.f26457j;
        this.f26458k = q2Var.f26458k;
        this.f26459l = q2Var.f26459l;
        this.f26460m = q2Var.f26460m;
    }

    /* renamed from: j */
    private long m35708j(long j) {
        if (this.f26462o) {
            return this.f26461n;
        }
        C9707q2 q2Var = (C9707q2) this.f26378d;
        C9707q2 q2Var2 = (C9707q2) this.f26379e;
        if (q2Var == null || q2Var2 == null) {
            return this.f26461n;
        }
        long j2 = q2Var.m35708j(j);
        return j2 >= j ? j2 : j2 + q2Var2.m35708j(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo25896a() {
        long j = -1;
        if (mo26050c() == null) {
            if (C9607V2.SIZED.mo26014h(this.f26457j.f26351j)) {
                j = this.f26457j.mo26034a1(this.f26376b);
            }
            C9514A0 r1 = this.f26457j.mo25730r1(j, this.f26458k);
            C9657g2 K1 = this.f26457j.mo25677K1(this.f26375a.mo26036g1(), r1);
            C9735w0 w0Var = this.f26375a;
            w0Var.mo26033W0(this.f26376b, w0Var.mo26038x1(K1));
            return r1.mo25682b();
        }
        C9735w0 w0Var2 = this.f26375a;
        C9514A0 r12 = w0Var2.mo25730r1(-1, this.f26458k);
        w0Var2.mo26037w1(this.f26376b, r12);
        C9539F0 b = r12.mo25682b();
        this.f26461n = b.count();
        this.f26462o = true;
        this.f26376b = null;
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C9649f mo25897d(C9371P p) {
        return new C9707q2(this, p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo26044g() {
        this.f26363i = true;
        if (this.f26462o) {
            mo26043e(mo25899i());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C9621Z0 mo25899i() {
        return C9735w0.m35810Z0(this.f26457j.mo25708D1());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCompletion(java.util.concurrent.CountedCompleter r15) {
        /*
            r14 = this;
            j$.util.stream.f r0 = r14.f26378d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            r4 = 0
            if (r3 != 0) goto L_0x0090
            j$.util.stream.q2 r0 = (p342j$.util.stream.C9707q2) r0
            long r6 = r0.f26461n
            j$.util.stream.f r0 = r14.f26379e
            j$.util.stream.q2 r0 = (p342j$.util.stream.C9707q2) r0
            long r8 = r0.f26461n
            long r6 = r6 + r8
            r14.f26461n = r6
            boolean r0 = r14.f26363i
            if (r0 == 0) goto L_0x0021
            r14.f26461n = r4
            goto L_0x0027
        L_0x0021:
            long r6 = r14.f26461n
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
        L_0x0027:
            j$.util.stream.Z0 r0 = r14.mo25899i()
        L_0x002b:
            r6 = r0
            goto L_0x0061
        L_0x002d:
            j$.util.stream.f r0 = r14.f26378d
            j$.util.stream.q2 r0 = (p342j$.util.stream.C9707q2) r0
            long r6 = r0.f26461n
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            j$.util.stream.f r0 = r14.f26379e
            j$.util.stream.q2 r0 = (p342j$.util.stream.C9707q2) r0
            java.lang.Object r0 = r0.mo26041b()
            j$.util.stream.F0 r0 = (p342j$.util.stream.C9539F0) r0
            goto L_0x002b
        L_0x0042:
            j$.util.stream.c r0 = r14.f26457j
            j$.util.stream.W2 r0 = r0.mo25708D1()
            j$.util.stream.f r3 = r14.f26378d
            j$.util.stream.q2 r3 = (p342j$.util.stream.C9707q2) r3
            java.lang.Object r3 = r3.mo26041b()
            j$.util.stream.F0 r3 = (p342j$.util.stream.C9539F0) r3
            j$.util.stream.f r6 = r14.f26379e
            j$.util.stream.q2 r6 = (p342j$.util.stream.C9707q2) r6
            java.lang.Object r6 = r6.mo26041b()
            j$.util.stream.F0 r6 = (p342j$.util.stream.C9539F0) r6
            j$.util.stream.H0 r0 = p342j$.util.stream.C9735w0.m35807U0(r0, r3, r6)
            goto L_0x002b
        L_0x0061:
            j$.util.stream.f r0 = r14.mo26050c()
            if (r0 != 0) goto L_0x0069
            r0 = r1
            goto L_0x006a
        L_0x0069:
            r0 = r2
        L_0x006a:
            if (r0 == 0) goto L_0x008b
            long r7 = r14.f26460m
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            long r7 = r6.count()
            long r9 = r14.f26459l
            long r11 = r14.f26460m
            long r9 = r9 + r11
            long r7 = java.lang.Math.min(r7, r9)
            goto L_0x0082
        L_0x0080:
            long r7 = r14.f26461n
        L_0x0082:
            r9 = r7
            long r7 = r14.f26459l
            j$.util.function.J r11 = r14.f26458k
            j$.util.stream.F0 r6 = r6.mo25799v(r7, r9, r11)
        L_0x008b:
            r14.mo26043e(r6)
            r14.f26462o = r1
        L_0x0090:
            long r6 = r14.f26460m
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e8
            j$.util.stream.f r0 = r14.mo26050c()
            if (r0 != 0) goto L_0x009e
            r0 = r1
            goto L_0x009f
        L_0x009e:
            r0 = r2
        L_0x009f:
            if (r0 != 0) goto L_0x00e8
            long r3 = r14.f26459l
            long r5 = r14.f26460m
            long r3 = r3 + r5
            boolean r0 = r14.f26462o
            if (r0 == 0) goto L_0x00ad
            long r5 = r14.f26461n
            goto L_0x00b1
        L_0x00ad:
            long r5 = r14.m35708j(r3)
        L_0x00b1:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00b6
            goto L_0x00e3
        L_0x00b6:
            j$.util.stream.f r0 = r14.mo26050c()
            j$.util.stream.q2 r0 = (p342j$.util.stream.C9707q2) r0
            r7 = r14
        L_0x00bd:
            if (r0 == 0) goto L_0x00dd
            j$.util.stream.f r8 = r0.f26379e
            if (r7 != r8) goto L_0x00d3
            j$.util.stream.f r7 = r0.f26378d
            j$.util.stream.q2 r7 = (p342j$.util.stream.C9707q2) r7
            if (r7 == 0) goto L_0x00d3
            long r7 = r7.m35708j(r3)
            long r5 = r5 + r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x00d3
            goto L_0x00e3
        L_0x00d3:
            j$.util.stream.f r7 = r0.mo26050c()
            j$.util.stream.q2 r7 = (p342j$.util.stream.C9707q2) r7
            r13 = r7
            r7 = r0
            r0 = r13
            goto L_0x00bd
        L_0x00dd:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r1 = r2
        L_0x00e3:
            if (r1 == 0) goto L_0x00e8
            r14.mo26046h()
        L_0x00e8:
            super.onCompletion(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9707q2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
