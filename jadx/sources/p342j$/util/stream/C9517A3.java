package p342j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p342j$.util.C9371P;

/* renamed from: j$.util.stream.A3 */
abstract class C9517A3 {

    /* renamed from: a */
    protected final C9371P f26163a;

    /* renamed from: b */
    protected final boolean f26164b;

    /* renamed from: c */
    private final long f26165c;

    /* renamed from: d */
    private final AtomicLong f26166d;

    C9517A3(C9371P p, long j, long j2) {
        this.f26163a = p;
        long j3 = 0;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        this.f26164b = i < 0;
        this.f26165c = i >= 0 ? j2 : j3;
        this.f26166d = new AtomicLong(i >= 0 ? j + j2 : j);
    }

    C9517A3(C9371P p, C9517A3 a3) {
        this.f26163a = p;
        this.f26164b = a3.f26164b;
        this.f26166d = a3.f26166d;
        this.f26165c = a3.f26165c;
    }

    public final int characteristics() {
        return this.f26163a.characteristics() & -16465;
    }

    public final long estimateSize() {
        return this.f26163a.estimateSize();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo25687t(long r12) {
        /*
            r11 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLong r0 = r11.f26166d
            long r1 = r0.get()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r6 = r11.f26164b
            if (r5 != 0) goto L_0x0013
            if (r6 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r12 = r3
        L_0x0012:
            return r12
        L_0x0013:
            long r7 = java.lang.Math.min(r1, r12)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0023
            long r9 = r1 - r7
            boolean r0 = r0.compareAndSet(r1, r9)
            if (r0 == 0) goto L_0x0000
        L_0x0023:
            if (r6 == 0) goto L_0x002b
            long r12 = r12 - r7
            long r12 = java.lang.Math.max(r12, r3)
            return r12
        L_0x002b:
            long r12 = r11.f26165c
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            long r1 = r1 - r12
            long r7 = r7 - r1
            long r12 = java.lang.Math.max(r7, r3)
            return r12
        L_0x0038:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9517A3.mo25687t(long):long");
    }

    public final C9371P trySplit() {
        C9371P trySplit;
        if (this.f26166d.get() == 0 || (trySplit = this.f26163a.trySplit()) == null) {
            return null;
        }
        return mo25689u(trySplit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract C9371P mo25689u(C9371P p);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C9753z3 mo25690v() {
        return this.f26166d.get() > 0 ? C9753z3.MAYBE_MORE : this.f26164b ? C9753z3.UNLIMITED : C9753z3.NO_MORE;
    }
}
