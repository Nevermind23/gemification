package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0611b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlinx.coroutines.internal.q */
public final class C41615q {

    /* renamed from: e */
    public static final C41616a f97818e = new C41616a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f97819f;

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f97820g;

    /* renamed from: h */
    public static final C41584a0 f97821h = new C41584a0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f97822a;

    /* renamed from: b */
    private final boolean f97823b;

    /* renamed from: c */
    private final int f97824c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f97825d;

    /* renamed from: kotlinx.coroutines.internal.q$a */
    public static final class C41616a {
        private C41616a() {
        }

        public /* synthetic */ C41616a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo96410a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo96411b(long j, int i) {
            return mo96413d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo96412c(long j, int i) {
            return mo96413d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo96413d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.q$b */
    public static final class C41617b {

        /* renamed from: a */
        public final int f97826a;

        public C41617b(int i) {
            this.f97826a = i;
        }
    }

    static {
        Class<C41615q> cls = C41615q.class;
        f97819f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f97820g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C41615q(int i, boolean z) {
        boolean z2;
        this.f97822a = i;
        this.f97823b = z;
        int i2 = i - 1;
        this.f97824c = i2;
        this.f97825d = new AtomicReferenceArray(i);
        boolean z3 = false;
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!((i & i2) == 0 ? true : z3)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C41615q m120736b(long j) {
        C41615q qVar = new C41615q(this.f97822a * 2, this.f97823b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f97824c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f97825d.get(i3 & i);
                if (obj == null) {
                    obj = new C41617b(i);
                }
                qVar.f97825d.set(qVar.f97824c & i, obj);
                i++;
            } else {
                qVar._state = f97818e.mo96413d(j, 1152921504606846976L);
                return qVar;
            }
        }
    }

    /* renamed from: c */
    private final C41615q m120737c(long j) {
        while (true) {
            C41615q qVar = (C41615q) this._next;
            if (qVar != null) {
                return qVar;
            }
            C0611b.m2366a(f97819f, this, (Object) null, m120736b(j));
        }
    }

    /* renamed from: e */
    private final C41615q m120738e(int i, Object obj) {
        Object obj2 = this.f97825d.get(this.f97824c & i);
        if (!(obj2 instanceof C41617b) || ((C41617b) obj2).f97826a != i) {
            return null;
        }
        this.f97825d.set(i & this.f97824c, obj);
        return this;
    }

    /* renamed from: h */
    private final long m120739h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f97820g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C41615q m120740k(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return mo96408i();
            }
        } while (!f97820g.compareAndSet(this, j, f97818e.mo96411b(j, i2)));
        this.f97825d.set(i3 & this.f97824c, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[LOOP:1: B:19:0x0068->B:22:0x0079, LOOP_START, PHI: r0 
      PHI: (r0v13 kotlinx.coroutines.internal.q) = (r0v12 kotlinx.coroutines.internal.q), (r0v15 kotlinx.coroutines.internal.q) binds: [B:18:0x0060, B:22:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo96404a(java.lang.Object r13) {
        /*
            r12 = this;
        L_0x0000:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            kotlinx.coroutines.internal.q$a r13 = f97818e
            int r13 = r13.mo96410a(r2)
            return r13
        L_0x0012:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.f97824c
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L_0x002e
            return r5
        L_0x002e:
            boolean r1 = r12.f97823b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f97825d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L_0x004d
            int r1 = r12.f97822a
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L_0x004c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L_0x0000
        L_0x004c:
            return r5
        L_0x004d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f97820g
            kotlinx.coroutines.internal.q$a r4 = f97818e
            long r4 = r4.mo96412c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f97825d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0068:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x007b
            kotlinx.coroutines.internal.q r0 = r0.mo96408i()
            kotlinx.coroutines.internal.q r0 = r0.m120738e(r9, r13)
            if (r0 != 0) goto L_0x0068
        L_0x007b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C41615q.mo96404a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo96405d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f97820g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo96406f() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean mo96407g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C41615q mo96408i() {
        return m120737c(m120739h());
    }

    /* renamed from: j */
    public final Object mo96409j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f97821h;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.f97824c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f97825d.get(i2 & i);
            if (obj == null) {
                if (this.f97823b) {
                    return null;
                }
            } else if (obj instanceof C41617b) {
                return null;
            } else {
                int i3 = (i + 1) & 1073741823;
                if (f97820g.compareAndSet(this, j, f97818e.mo96411b(j, i3))) {
                    this.f97825d.set(this.f97824c & i, (Object) null);
                    return obj;
                } else if (this.f97823b) {
                    C41615q qVar = this;
                    do {
                        qVar = qVar.m120740k(i, i3);
                    } while (qVar != null);
                    return obj;
                }
            }
        }
    }
}
