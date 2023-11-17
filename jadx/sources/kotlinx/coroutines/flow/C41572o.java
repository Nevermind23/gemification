package kotlinx.coroutines.flow;

import ef1.C40843o;
import ef1.C40854q;
import ef1.C40870v0;
import gf1.C41097e;
import he1.C41225n;
import he1.C41238w;
import hf1.C41240a;
import hf1.C41241b;
import hf1.C41242c;
import hf1.C41255i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.internal.C41584a0;
import me1.C41752f;
import oe1.C41853d;
import oe1.C41857h;

/* renamed from: kotlinx.coroutines.flow.o */
public class C41572o extends C41240a implements C41567j, C41556a, C41255i {

    /* renamed from: d */
    private final int f97735d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f97736e;

    /* renamed from: f */
    private final C41097e f97737f;

    /* renamed from: g */
    private Object[] f97738g;

    /* renamed from: h */
    private long f97739h;

    /* renamed from: i */
    private long f97740i;

    /* renamed from: j */
    private int f97741j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f97742k;

    /* renamed from: kotlinx.coroutines.flow.o$a */
    private static final class C41573a implements C40870v0 {

        /* renamed from: d */
        public final C41572o f97743d;

        /* renamed from: e */
        public long f97744e;

        /* renamed from: f */
        public final Object f97745f;

        /* renamed from: g */
        public final Continuation f97746g;

        public C41573a(C41572o oVar, long j, Object obj, Continuation continuation) {
            this.f97743d = oVar;
            this.f97744e = j;
            this.f97745f = obj;
            this.f97746g = continuation;
        }

        public void dispose() {
            this.f97743d.m120575x(this);
        }
    }

    /* renamed from: kotlinx.coroutines.flow.o$b */
    public /* synthetic */ class C41574b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97747a;

        static {
            int[] iArr = new int[C41097e.values().length];
            iArr[C41097e.SUSPEND.ordinal()] = 1;
            iArr[C41097e.DROP_LATEST.ordinal()] = 2;
            iArr[C41097e.DROP_OLDEST.ordinal()] = 3;
            f97747a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.flow.o$c */
    static final class C41575c extends C41853d {

        /* renamed from: g */
        Object f97748g;

        /* renamed from: h */
        Object f97749h;

        /* renamed from: i */
        Object f97750i;

        /* renamed from: j */
        Object f97751j;

        /* renamed from: k */
        /* synthetic */ Object f97752k;

        /* renamed from: l */
        final /* synthetic */ C41572o f97753l;

        /* renamed from: m */
        int f97754m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41575c(C41572o oVar, Continuation continuation) {
            super(continuation);
            this.f97753l = oVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f97752k = obj;
            this.f97754m |= Integer.MIN_VALUE;
            return C41572o.m120577z(this.f97753l, (C41557b) null, this);
        }
    }

    public C41572o(int i, int i2, C41097e eVar) {
        this.f97735d = i;
        this.f97736e = i2;
        this.f97737f = eVar;
    }

    /* renamed from: A */
    private final void m120546A(long j) {
        C41242c[] f;
        if (!(this.f97229b == 0 || (f = this.f97228a) == null)) {
            for (C41242c cVar : f) {
                if (cVar != null) {
                    C41577q qVar = (C41577q) cVar;
                    long j2 = qVar.f97756a;
                    if (j2 >= 0 && j2 < j) {
                        qVar.f97756a = j;
                    }
                }
            }
        }
        this.f97740i = j;
    }

    /* renamed from: D */
    private final void m120547D() {
        Object[] objArr = this.f97738g;
        C41536l.m120486f(objArr);
        C41576p.m120595g(objArr, m120553J(), (Object) null);
        this.f97741j--;
        long J = m120553J() + 1;
        if (this.f97739h < J) {
            this.f97739h = J;
        }
        if (this.f97740i < J) {
            m120546A(J);
        }
    }

    /* renamed from: E */
    static /* synthetic */ Object m120548E(C41572o oVar, Object obj, Continuation continuation) {
        if (oVar.mo96335c(obj)) {
            return C41238w.f97225a;
        }
        Object F = oVar.m120549F(obj, continuation);
        if (F == C41793d.m121157c()) {
            return F;
        }
        return C41238w.f97225a;
    }

    /* renamed from: F */
    private final Object m120549F(Object obj, Continuation continuation) {
        Continuation[] continuationArr;
        C41573a aVar;
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95193C();
        Continuation[] continuationArr2 = C41241b.f97231a;
        synchronized (this) {
            if (m120559P(obj)) {
                C41225n.C41226a aVar2 = C41225n.f97210d;
                oVar.mo94382h(C41225n.m119478a(C41238w.f97225a));
                continuationArr = m120551H(continuationArr2);
                aVar = null;
            } else {
                C41573a aVar3 = new C41573a(this, ((long) m120557N()) + m120553J(), obj, oVar);
                m120550G(aVar3);
                this.f97742k = this.f97742k + 1;
                if (this.f97736e == 0) {
                    continuationArr2 = m120551H(continuationArr2);
                }
                continuationArr = continuationArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            C40854q.m118426a(oVar, aVar);
        }
        for (Continuation continuation2 : continuationArr) {
            if (continuation2 != null) {
                C41225n.C41226a aVar4 = C41225n.f97210d;
                continuation2.mo94382h(C41225n.m119478a(C41238w.f97225a));
            }
        }
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        if (x == C41793d.m121157c()) {
            return x;
        }
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m120550G(Object obj) {
        int N = m120557N();
        Object[] objArr = this.f97738g;
        if (objArr == null) {
            objArr = m120558O((Object[]) null, 0, 2);
        } else if (N >= objArr.length) {
            objArr = m120558O(objArr, N, objArr.length * 2);
        }
        C41576p.m120595g(objArr, m120553J() + ((long) N), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (kotlinx.coroutines.flow.C41577q) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.Continuation[] m120551H(kotlin.coroutines.Continuation[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f97229b
            if (r1 == 0) goto L_0x0047
            hf1.c[] r1 = r10.f97228a
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            kotlinx.coroutines.flow.q r4 = (kotlinx.coroutines.flow.C41577q) r4
            kotlin.coroutines.Continuation r5 = r4.f97757b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.m120561R(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C41536l.m120488h(r11, r6)
        L_0x0039:
            r6 = r11
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f97757b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            kotlin.coroutines.Continuation[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C41572o.m120551H(kotlin.coroutines.Continuation[]):kotlin.coroutines.Continuation[]");
    }

    /* renamed from: I */
    private final long m120552I() {
        return m120553J() + ((long) this.f97741j);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final long m120553J() {
        return Math.min(this.f97740i, this.f97739h);
    }

    /* renamed from: K */
    private final Object m120554K(long j) {
        Object[] objArr = this.f97738g;
        C41536l.m120486f(objArr);
        Object c = C41576p.m120594f(objArr, j);
        if (c instanceof C41573a) {
            return ((C41573a) c).f97745f;
        }
        return c;
    }

    /* renamed from: L */
    private final long m120555L() {
        return m120553J() + ((long) this.f97741j) + ((long) this.f97742k);
    }

    /* renamed from: M */
    private final int m120556M() {
        return (int) ((m120553J() + ((long) this.f97741j)) - this.f97739h);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final int m120557N() {
        return this.f97741j + this.f97742k;
    }

    /* renamed from: O */
    private final Object[] m120558O(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f97738g = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long J = m120553J();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + J;
                C41576p.m120595g(objArr2, j, C41576p.m120594f(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final boolean m120559P(Object obj) {
        if (mo95703k() == 0) {
            return m120560Q(obj);
        }
        if (this.f97741j >= this.f97736e && this.f97740i <= this.f97739h) {
            int i = C41574b.f97747a[this.f97737f.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m120550G(obj);
        int i2 = this.f97741j + 1;
        this.f97741j = i2;
        if (i2 > this.f97736e) {
            m120547D();
        }
        if (m120556M() > this.f97735d) {
            m120563T(this.f97739h + 1, this.f97740i, m120552I(), m120555L());
        }
        return true;
    }

    /* renamed from: Q */
    private final boolean m120560Q(Object obj) {
        if (this.f97735d == 0) {
            return true;
        }
        m120550G(obj);
        int i = this.f97741j + 1;
        this.f97741j = i;
        if (i > this.f97735d) {
            m120547D();
        }
        this.f97740i = m120553J() + ((long) this.f97741j);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final long m120561R(C41577q qVar) {
        long j = qVar.f97756a;
        if (j < m120552I()) {
            return j;
        }
        if (this.f97736e <= 0 && j <= m120553J() && this.f97742k != 0) {
            return j;
        }
        return -1;
    }

    /* renamed from: S */
    private final Object m120562S(C41577q qVar) {
        Object obj;
        Continuation[] continuationArr = C41241b.f97231a;
        synchronized (this) {
            long R = m120561R(qVar);
            if (R < 0) {
                obj = C41576p.f97755a;
            } else {
                long j = qVar.f97756a;
                Object K = m120554K(R);
                qVar.f97756a = R + 1;
                Object obj2 = K;
                continuationArr = mo96340U(j);
                obj = obj2;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                C41225n.C41226a aVar = C41225n.f97210d;
                continuation.mo94382h(C41225n.m119478a(C41238w.f97225a));
            }
        }
        return obj;
    }

    /* renamed from: T */
    private final void m120563T(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long J = m120553J(); J < min; J++) {
            Object[] objArr = this.f97738g;
            C41536l.m120486f(objArr);
            C41576p.m120595g(objArr, J, (Object) null);
        }
        this.f97739h = j;
        this.f97740i = j2;
        this.f97741j = (int) (j3 - min);
        this.f97742k = (int) (j4 - j3);
    }

    /* renamed from: w */
    private final Object m120574w(C41577q qVar, Continuation continuation) {
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95193C();
        synchronized (this) {
            if (m120561R(qVar) < 0) {
                qVar.f97757b = oVar;
            } else {
                C41225n.C41226a aVar = C41225n.f97210d;
                oVar.mo94382h(C41225n.m119478a(C41238w.f97225a));
            }
            C41238w wVar = C41238w.f97225a;
        }
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        if (x == C41793d.m121157c()) {
            return x;
        }
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m120575x(C41573a aVar) {
        synchronized (this) {
            if (aVar.f97744e >= m120553J()) {
                Object[] objArr = this.f97738g;
                C41536l.m120486f(objArr);
                if (C41576p.m120594f(objArr, aVar.f97744e) == aVar) {
                    C41576p.m120595g(objArr, aVar.f97744e, C41576p.f97755a);
                    m120576y();
                    C41238w wVar = C41238w.f97225a;
                }
            }
        }
    }

    /* renamed from: y */
    private final void m120576y() {
        if (this.f97736e != 0 || this.f97742k > 1) {
            Object[] objArr = this.f97738g;
            C41536l.m120486f(objArr);
            while (this.f97742k > 0 && C41576p.m120594f(objArr, (m120553J() + ((long) m120557N())) - 1) == C41576p.f97755a) {
                this.f97742k--;
                C41576p.m120595g(objArr, m120553J() + ((long) m120557N()), (Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: kotlinx.coroutines.flow.q} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab A[EDGE_INSN: B:48:0x00ab->B:38:0x00ab ?: BREAK  , SYNTHETIC] */
    /* renamed from: z */
    static /* synthetic */ java.lang.Object m120577z(kotlinx.coroutines.flow.C41572o r8, kotlinx.coroutines.flow.C41557b r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.C41572o.C41575c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.o$c r0 = (kotlinx.coroutines.flow.C41572o.C41575c) r0
            int r1 = r0.f97754m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f97754m = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.o$c r0 = new kotlinx.coroutines.flow.o$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f97752k
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f97754m
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L_0x0077
            r8 = 1
            if (r2 == r8) goto L_0x0061
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r8 = r0.f97751j
            ef1.o1 r8 = (ef1.C40845o1) r8
            java.lang.Object r9 = r0.f97750i
            kotlinx.coroutines.flow.q r9 = (kotlinx.coroutines.flow.C41577q) r9
            java.lang.Object r2 = r0.f97749h
            kotlinx.coroutines.flow.b r2 = (kotlinx.coroutines.flow.C41557b) r2
            java.lang.Object r5 = r0.f97748g
            kotlinx.coroutines.flow.o r5 = (kotlinx.coroutines.flow.C41572o) r5
            he1.C41228o.m119483b(r10)     // Catch:{ all -> 0x005e }
        L_0x003e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x008f
        L_0x0042:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004a:
            java.lang.Object r8 = r0.f97751j
            ef1.o1 r8 = (ef1.C40845o1) r8
            java.lang.Object r9 = r0.f97750i
            kotlinx.coroutines.flow.q r9 = (kotlinx.coroutines.flow.C41577q) r9
            java.lang.Object r2 = r0.f97749h
            kotlinx.coroutines.flow.b r2 = (kotlinx.coroutines.flow.C41557b) r2
            java.lang.Object r5 = r0.f97748g
            kotlinx.coroutines.flow.o r5 = (kotlinx.coroutines.flow.C41572o) r5
            he1.C41228o.m119483b(r10)     // Catch:{ all -> 0x005e }
            goto L_0x0092
        L_0x005e:
            r8 = move-exception
            goto L_0x00c4
        L_0x0061:
            java.lang.Object r8 = r0.f97750i
            r9 = r8
            kotlinx.coroutines.flow.q r9 = (kotlinx.coroutines.flow.C41577q) r9
            java.lang.Object r8 = r0.f97749h
            kotlinx.coroutines.flow.b r8 = (kotlinx.coroutines.flow.C41557b) r8
            java.lang.Object r2 = r0.f97748g
            kotlinx.coroutines.flow.o r2 = (kotlinx.coroutines.flow.C41572o) r2
            he1.C41228o.m119483b(r10)     // Catch:{ all -> 0x0074 }
            r10 = r8
            r8 = r2
            goto L_0x0083
        L_0x0074:
            r8 = move-exception
            r5 = r2
            goto L_0x00c4
        L_0x0077:
            he1.C41228o.m119483b(r10)
            hf1.c r10 = r8.mo95699g()
            kotlinx.coroutines.flow.q r10 = (kotlinx.coroutines.flow.C41577q) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0083:
            me1.f r2 = r0.mo94380b()     // Catch:{ all -> 0x00c1 }
            ef1.o1$b r5 = ef1.C40845o1.f96561d3     // Catch:{ all -> 0x00c1 }
            me1.f$b r2 = r2.mo23736c(r5)     // Catch:{ all -> 0x00c1 }
            ef1.o1 r2 = (ef1.C40845o1) r2     // Catch:{ all -> 0x00c1 }
        L_0x008f:
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0092:
            java.lang.Object r10 = r5.m120562S(r9)     // Catch:{ all -> 0x005e }
            kotlinx.coroutines.internal.a0 r6 = kotlinx.coroutines.flow.C41576p.f97755a     // Catch:{ all -> 0x005e }
            if (r10 != r6) goto L_0x00ab
            r0.f97748g = r5     // Catch:{ all -> 0x005e }
            r0.f97749h = r2     // Catch:{ all -> 0x005e }
            r0.f97750i = r9     // Catch:{ all -> 0x005e }
            r0.f97751j = r8     // Catch:{ all -> 0x005e }
            r0.f97754m = r4     // Catch:{ all -> 0x005e }
            java.lang.Object r10 = r5.m120574w(r9, r0)     // Catch:{ all -> 0x005e }
            if (r10 != r1) goto L_0x0092
            return r1
        L_0x00ab:
            if (r8 == 0) goto L_0x00b0
            ef1.C40859r1.m118443f(r8)     // Catch:{ all -> 0x005e }
        L_0x00b0:
            r0.f97748g = r5     // Catch:{ all -> 0x005e }
            r0.f97749h = r2     // Catch:{ all -> 0x005e }
            r0.f97750i = r9     // Catch:{ all -> 0x005e }
            r0.f97751j = r8     // Catch:{ all -> 0x005e }
            r0.f97754m = r3     // Catch:{ all -> 0x005e }
            java.lang.Object r10 = r2.mo95721b(r10, r0)     // Catch:{ all -> 0x005e }
            if (r10 != r1) goto L_0x003e
            return r1
        L_0x00c1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        L_0x00c4:
            r5.mo95702j(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C41572o.m120577z(kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C41577q mo95700h() {
        return new C41577q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C41577q[] mo95701i(int i) {
        return new C41577q[i];
    }

    /* renamed from: U */
    public final Continuation[] mo96340U(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        C41242c[] f;
        if (j > this.f97740i) {
            return C41241b.f97231a;
        }
        long J = m120553J();
        long j6 = ((long) this.f97741j) + J;
        if (this.f97736e == 0 && this.f97742k > 0) {
            j6++;
        }
        if (!(this.f97229b == 0 || (f = this.f97228a) == null)) {
            for (C41242c cVar : f) {
                if (cVar != null) {
                    long j7 = ((C41577q) cVar).f97756a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.f97740i) {
            return C41241b.f97231a;
        }
        long I = m120552I();
        if (mo95703k() > 0) {
            i = Math.min(this.f97742k, this.f97736e - ((int) (I - j6)));
        } else {
            i = this.f97742k;
        }
        Continuation[] continuationArr = C41241b.f97231a;
        long j8 = ((long) this.f97742k) + I;
        if (i > 0) {
            continuationArr = new Continuation[i];
            Object[] objArr = this.f97738g;
            C41536l.m120486f(objArr);
            long j9 = I;
            int i2 = 0;
            while (true) {
                if (I >= j8) {
                    j3 = j6;
                    j2 = j8;
                    break;
                }
                Object c = C41576p.m120594f(objArr, I);
                j3 = j6;
                C41584a0 a0Var = C41576p.f97755a;
                if (c == a0Var) {
                    j2 = j8;
                    j5 = 1;
                } else if (c != null) {
                    C41573a aVar = (C41573a) c;
                    int i3 = i2 + 1;
                    j2 = j8;
                    continuationArr[i2] = aVar.f97746g;
                    C41576p.m120595g(objArr, I, a0Var);
                    C41576p.m120595g(objArr, j9, aVar.f97745f);
                    j5 = 1;
                    j9++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                }
                I += j5;
                j6 = j3;
                j8 = j2;
            }
            I = j9;
        } else {
            j3 = j6;
            j2 = j8;
        }
        int i4 = (int) (I - J);
        if (mo95703k() == 0) {
            j4 = I;
        } else {
            j4 = j3;
        }
        long max = Math.max(this.f97739h, I - ((long) Math.min(this.f97735d, i4)));
        if (this.f97736e == 0 && max < j2) {
            Object[] objArr2 = this.f97738g;
            C41536l.m120486f(objArr2);
            if (C41536l.m120484d(C41576p.m120594f(objArr2, max), C41576p.f97755a)) {
                I++;
                max++;
            }
        }
        m120563T(max, j4, I, j2);
        m120576y();
        if (continuationArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return m120551H(continuationArr);
        }
        return continuationArr;
    }

    /* renamed from: V */
    public final long mo96341V() {
        long j = this.f97739h;
        if (j < this.f97740i) {
            this.f97740i = j;
        }
        return j;
    }

    /* renamed from: a */
    public Object mo95707a(C41557b bVar, Continuation continuation) {
        return m120577z(this, bVar, continuation);
    }

    /* renamed from: b */
    public Object mo95721b(Object obj, Continuation continuation) {
        return m120548E(this, obj, continuation);
    }

    /* renamed from: c */
    public boolean mo96335c(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArr = C41241b.f97231a;
        synchronized (this) {
            if (m120559P(obj)) {
                continuationArr = m120551H(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                C41225n.C41226a aVar = C41225n.f97210d;
                continuation.mo94382h(C41225n.m119478a(C41238w.f97225a));
            }
        }
        return z;
    }

    /* renamed from: d */
    public C41556a mo95708d(C41752f fVar, int i, C41097e eVar) {
        return C41576p.m120593e(this, fVar, i, eVar);
    }
}
