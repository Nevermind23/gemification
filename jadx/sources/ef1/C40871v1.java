package ef1;

import androidx.concurrent.futures.C0611b;
import ef1.C40845o1;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.internal.C41609n;
import kotlinx.coroutines.internal.C41610o;
import kotlinx.coroutines.internal.C41624w;
import me1.C41752f;
import oe1.C41857h;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ef1.v1 */
public class C40871v1 implements C40845o1, C40869v, C40791c2 {

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f96578d = AtomicReferenceFieldUpdater.newUpdater(C40871v1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: ef1.v1$a */
    private static final class C40872a extends C40868u1 {

        /* renamed from: h */
        private final C40871v1 f96579h;

        /* renamed from: i */
        private final C40873b f96580i;

        /* renamed from: j */
        private final C40866u f96581j;

        /* renamed from: k */
        private final Object f96582k;

        public C40872a(C40871v1 v1Var, C40873b bVar, C40866u uVar, Object obj) {
            this.f96579h = v1Var;
            this.f96580i = bVar;
            this.f96581j = uVar;
            this.f96582k = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95134x((Throwable) obj);
            return C41238w.f97225a;
        }

        /* renamed from: x */
        public void mo95134x(Throwable th) {
            this.f96579h.m118491P(this.f96580i, this.f96581j, this.f96582k);
        }
    }

    /* renamed from: ef1.v1$b */
    private static final class C40873b implements C40824j1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: d */
        private final C40889z1 f96583d;

        public C40873b(C40889z1 z1Var, boolean z, Throwable th) {
            this.f96583d = z1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: b */
        private final ArrayList m118546b() {
            return new ArrayList(4);
        }

        /* renamed from: c */
        private final Object m118547c() {
            return this._exceptionsHolder;
        }

        /* renamed from: j */
        private final void m118548j(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void mo95246a(Throwable th) {
            Throwable d = mo95247d();
            if (d == null) {
                mo95253m(th);
            } else if (th != d) {
                Object c = m118547c();
                if (c == null) {
                    m118548j(th);
                } else if (c instanceof Throwable) {
                    if (th != c) {
                        ArrayList b = m118546b();
                        b.add(c);
                        b.add(th);
                        m118548j(b);
                    }
                } else if (c instanceof ArrayList) {
                    ((ArrayList) c).add(th);
                } else {
                    throw new IllegalStateException(("State is " + c).toString());
                }
            }
        }

        /* renamed from: d */
        public final Throwable mo95247d() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: e */
        public final boolean mo95248e() {
            return mo95247d() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: f */
        public final boolean mo95249f() {
            return this._isCompleting;
        }

        /* renamed from: g */
        public final boolean mo95250g() {
            return m118547c() == C40877w1.f96591e;
        }

        /* renamed from: h */
        public final List mo95251h(Throwable th) {
            ArrayList arrayList;
            Object c = m118547c();
            if (c == null) {
                arrayList = m118546b();
            } else if (c instanceof Throwable) {
                ArrayList b = m118546b();
                b.add(c);
                arrayList = b;
            } else if (c instanceof ArrayList) {
                arrayList = (ArrayList) c;
            } else {
                throw new IllegalStateException(("State is " + c).toString());
            }
            Throwable d = mo95247d();
            if (d != null) {
                arrayList.add(0, d);
            }
            if (th != null && !C41536l.m120484d(th, d)) {
                arrayList.add(th);
            }
            m118548j(C40877w1.f96591e);
            return arrayList;
        }

        /* renamed from: i */
        public final void mo95252i(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: k */
        public boolean mo95168k() {
            return mo95247d() == null;
        }

        /* renamed from: l */
        public C40889z1 mo95169l() {
            return this.f96583d;
        }

        /* renamed from: m */
        public final void mo95253m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo95248e() + ", completing=" + mo95249f() + ", rootCause=" + mo95247d() + ", exceptions=" + m118547c() + ", list=" + mo95169l() + ']';
        }
    }

    /* renamed from: ef1.v1$c */
    public static final class C40874c extends C41610o.C41611a {

        /* renamed from: d */
        final /* synthetic */ C40871v1 f96584d;

        /* renamed from: e */
        final /* synthetic */ Object f96585e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40874c(C41610o oVar, C40871v1 v1Var, Object obj) {
            super(oVar);
            this.f96584d = v1Var;
            this.f96585e = obj;
        }

        /* renamed from: i */
        public Object mo95255g(C41610o oVar) {
            if (this.f96584d.mo95236d0() == this.f96585e) {
                return null;
            }
            return C41609n.m120712a();
        }
    }

    public C40871v1(boolean z) {
        C40879x0 x0Var;
        if (z) {
            x0Var = C40877w1.f96593g;
        } else {
            x0Var = C40877w1.f96592f;
        }
        this._state = x0Var;
        this._parentHandle = null;
    }

    /* renamed from: A0 */
    private final int m118476A0(Object obj) {
        if (obj instanceof C40879x0) {
            if (((C40879x0) obj).mo95168k()) {
                return 0;
            }
            if (!C0611b.m2366a(f96578d, this, obj, C40877w1.f96593g)) {
                return -1;
            }
            mo95243v0();
            return 1;
        } else if (!(obj instanceof C40819i1)) {
            return 0;
        } else {
            if (!C0611b.m2366a(f96578d, this, obj, ((C40819i1) obj).mo95169l())) {
                return -1;
            }
            mo95243v0();
            return 1;
        }
    }

    /* renamed from: B0 */
    private final String m118477B0(Object obj) {
        if (obj instanceof C40873b) {
            C40873b bVar = (C40873b) obj;
            if (bVar.mo95248e()) {
                return "Cancelling";
            }
            if (bVar.mo95249f()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C40824j1) {
            if (((C40824j1) obj).mo95168k()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C40881y) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: D0 */
    public static /* synthetic */ CancellationException m118480D0(C40871v1 v1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return v1Var.mo95230C0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: E */
    private final boolean m118481E(Object obj, C40889z1 z1Var, C40868u1 u1Var) {
        int w;
        C40874c cVar = new C40874c(u1Var, this, obj);
        do {
            w = z1Var.mo96394o().mo96398w(u1Var, z1Var, cVar);
            if (w == 1) {
                return true;
            }
        } while (w != 2);
        return false;
    }

    /* renamed from: F */
    private final void m118482F(Throwable th, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C41211b.m119461a(th, th2);
                }
            }
        }
    }

    /* renamed from: F0 */
    private final boolean m118483F0(C40824j1 j1Var, Object obj) {
        if (!C0611b.m2366a(f96578d, this, j1Var, C40877w1.m118568g(obj))) {
            return false;
        }
        mo95241t0((Throwable) null);
        mo95133u0(obj);
        m118490O(j1Var, obj);
        return true;
    }

    /* renamed from: G0 */
    private final boolean m118484G0(C40824j1 j1Var, Throwable th) {
        C40889z1 b0 = m118497b0(j1Var);
        if (b0 == null) {
            return false;
        }
        if (!C0611b.m2366a(f96578d, this, j1Var, new C40873b(b0, false, th))) {
            return false;
        }
        m118503r0(b0, th);
        return true;
    }

    /* renamed from: H0 */
    private final Object m118485H0(Object obj, Object obj2) {
        if (!(obj instanceof C40824j1)) {
            return C40877w1.f96587a;
        }
        if ((!(obj instanceof C40879x0) && !(obj instanceof C40868u1)) || (obj instanceof C40866u) || (obj2 instanceof C40881y)) {
            return m118486I0((C40824j1) obj, obj2);
        }
        if (m118483F0((C40824j1) obj, obj2)) {
            return obj2;
        }
        return C40877w1.f96589c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        if (r2 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        m118503r0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0073, code lost:
        r9 = m118494V(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0077, code lost:
        if (r9 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007d, code lost:
        if (m118487J0(r1, r9, r10) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0081, code lost:
        return ef1.C40877w1.f96588b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0086, code lost:
        return m118493T(r1, r10);
     */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m118486I0(ef1.C40824j1 r9, java.lang.Object r10) {
        /*
            r8 = this;
            ef1.z1 r0 = r8.m118497b0(r9)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.a0 r9 = ef1.C40877w1.f96589c
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof ef1.C40871v1.C40873b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            ef1.v1$b r1 = (ef1.C40871v1.C40873b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            ef1.v1$b r1 = new ef1.v1$b
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.z r4 = new kotlin.jvm.internal.z
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.mo95249f()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x002f
            kotlinx.coroutines.internal.a0 r9 = ef1.C40877w1.f96587a     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.mo95252i(r5)     // Catch:{ all -> 0x0087 }
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f96578d     // Catch:{ all -> 0x0087 }
            boolean r6 = androidx.concurrent.futures.C0611b.m2366a(r6, r8, r9, r1)     // Catch:{ all -> 0x0087 }
            if (r6 != 0) goto L_0x0043
            kotlinx.coroutines.internal.a0 r9 = ef1.C40877w1.f96589c     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = r1.mo95248e()     // Catch:{ all -> 0x0087 }
            boolean r7 = r10 instanceof ef1.C40881y     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x004f
            r7 = r10
            ef1.y r7 = (ef1.C40881y) r7     // Catch:{ all -> 0x0087 }
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x0057
            java.lang.Throwable r7 = r7.f96602a     // Catch:{ all -> 0x0087 }
            r1.mo95246a(r7)     // Catch:{ all -> 0x0087 }
        L_0x0057:
            java.lang.Throwable r7 = r1.mo95247d()     // Catch:{ all -> 0x0087 }
            if (r6 != 0) goto L_0x005e
            r3 = r5
        L_0x005e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0087 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0069
            r2 = r7
        L_0x0069:
            r4.f97717d = r2     // Catch:{ all -> 0x0087 }
            he1.w r3 = he1.C41238w.f97225a     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0073
            r8.m118503r0(r0, r2)
        L_0x0073:
            ef1.u r9 = r8.m118494V(r9)
            if (r9 == 0) goto L_0x0082
            boolean r9 = r8.m118487J0(r1, r9, r10)
            if (r9 == 0) goto L_0x0082
            kotlinx.coroutines.internal.a0 r9 = ef1.C40877w1.f96588b
            return r9
        L_0x0082:
            java.lang.Object r9 = r8.m118493T(r1, r10)
            return r9
        L_0x0087:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40871v1.m118486I0(ef1.j1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: J0 */
    private final boolean m118487J0(C40873b bVar, C40866u uVar, Object obj) {
        while (C40845o1.C40846a.m118417d(uVar.f96572h, false, false, new C40872a(this, bVar, uVar, obj), 1, (Object) null) == C40780a2.f96511d) {
            uVar = m118502q0(uVar);
            if (uVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    private final Object m118488K(Object obj) {
        Object H0;
        do {
            Object d0 = mo95236d0();
            if (!(d0 instanceof C40824j1) || ((d0 instanceof C40873b) && ((C40873b) d0).mo95249f())) {
                return C40877w1.f96587a;
            }
            H0 = m118485H0(d0, new C40881y(m118492S(obj), false, 2, (DefaultConstructorMarker) null));
        } while (H0 == C40877w1.f96589c);
        return H0;
    }

    /* renamed from: L */
    private final boolean m118489L(Throwable th) {
        if (mo95159j0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C40863t c0 = mo95235c0();
        if (c0 == null || c0 == C40780a2.f96511d) {
            return z;
        }
        if (c0.mo95138b(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private final void m118490O(C40824j1 j1Var, Object obj) {
        C40881y yVar;
        C40863t c0 = mo95235c0();
        if (c0 != null) {
            c0.dispose();
            mo95245z0(C40780a2.f96511d);
        }
        Throwable th = null;
        if (obj instanceof C40881y) {
            yVar = (C40881y) obj;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            th = yVar.f96602a;
        }
        if (j1Var instanceof C40868u1) {
            try {
                ((C40868u1) j1Var).mo95134x(th);
            } catch (Throwable th2) {
                mo95130f0(new CompletionHandlerException("Exception in completion handler " + j1Var + " for " + this, th2));
            }
        } else {
            C40889z1 l = j1Var.mo95169l();
            if (l != null) {
                m118504s0(l, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m118491P(C40873b bVar, C40866u uVar, Object obj) {
        C40866u q0 = m118502q0(uVar);
        if (q0 == null || !m118487J0(bVar, q0, obj)) {
            mo95157G(m118493T(bVar, obj));
        }
    }

    /* renamed from: S */
    private final Throwable m118492S(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(mo95127M(), (Throwable) null, this);
            }
            return th;
        } else if (obj != null) {
            return ((C40791c2) obj).mo95144t();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: T */
    private final Object m118493T(C40873b bVar, Object obj) {
        C40881y yVar;
        Throwable th;
        boolean e;
        Throwable X;
        if (obj instanceof C40881y) {
            yVar = (C40881y) obj;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            th = yVar.f96602a;
        } else {
            th = null;
        }
        synchronized (bVar) {
            e = bVar.mo95248e();
            List h = bVar.mo95251h(th);
            X = m118496X(bVar, h);
            if (X != null) {
                m118482F(X, h);
            }
        }
        boolean z = false;
        if (!(X == null || X == th)) {
            obj = new C40881y(X, false, 2, (DefaultConstructorMarker) null);
        }
        if (X != null) {
            if (m118489L(X) || mo95166e0(X)) {
                z = true;
            }
            if (z) {
                if (obj != null) {
                    ((C40881y) obj).mo95266b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!e) {
            mo95241t0(X);
        }
        mo95133u0(obj);
        C0611b.m2366a(f96578d, this, bVar, C40877w1.m118568g(obj));
        m118490O(bVar, obj);
        return obj;
    }

    /* renamed from: V */
    private final C40866u m118494V(C40824j1 j1Var) {
        C40866u uVar = j1Var instanceof C40866u ? (C40866u) j1Var : null;
        if (uVar != null) {
            return uVar;
        }
        C40889z1 l = j1Var.mo95169l();
        if (l != null) {
            return m118502q0(l);
        }
        return null;
    }

    /* renamed from: W */
    private final Throwable m118495W(Object obj) {
        C40881y yVar = obj instanceof C40881y ? (C40881y) obj : null;
        if (yVar != null) {
            return yVar.f96602a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable m118496X(ef1.C40871v1.C40873b r6, java.util.List r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r6 = r6.mo95248e()
            if (r6 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r7 = r5.mo95127M()
            r6.<init>(r7, r1, r5)
            return r6
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r6 = r7.iterator()
        L_0x001c:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r6.next()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0036
            return r0
        L_0x0036:
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r3 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r3 == 0) goto L_0x0063
            java.util.Iterator r7 = r7.iterator()
        L_0x0045:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r0) goto L_0x005a
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L_0x005a
            r4 = r2
            goto L_0x005b
        L_0x005a:
            r4 = r6
        L_0x005b:
            if (r4 == 0) goto L_0x0045
            r1 = r3
        L_0x005e:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40871v1.m118496X(ef1.v1$b, java.util.List):java.lang.Throwable");
    }

    /* renamed from: b0 */
    private final C40889z1 m118497b0(C40824j1 j1Var) {
        C40889z1 l = j1Var.mo95169l();
        if (l != null) {
            return l;
        }
        if (j1Var instanceof C40879x0) {
            return new C40889z1();
        }
        if (j1Var instanceof C40868u1) {
            m118506x0((C40868u1) j1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + j1Var).toString());
    }

    /* renamed from: k0 */
    private final boolean m118498k0() {
        Object d0;
        do {
            d0 = mo95236d0();
            if (!(d0 instanceof C40824j1)) {
                return false;
            }
        } while (m118476A0(d0) < 0);
        return true;
    }

    /* renamed from: l0 */
    private final Object m118499l0(Continuation continuation) {
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95193C();
        C40854q.m118426a(oVar, mo95215s(new C40804e2(oVar)));
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        if (x == C41793d.m121157c()) {
            return x;
        }
        return C41238w.f97225a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        m118503r0(((ef1.C40871v1.C40873b) r2).mo95169l(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return ef1.C40877w1.m118562a();
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m118500m0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo95236d0()
            boolean r3 = r2 instanceof ef1.C40871v1.C40873b
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            ef1.v1$b r3 = (ef1.C40871v1.C40873b) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo95250g()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.a0 r7 = ef1.C40877w1.f96590d     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            ef1.v1$b r3 = (ef1.C40871v1.C40873b) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo95248e()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.m118492S(r7)     // Catch:{ all -> 0x004e }
        L_0x002b:
            r7 = r2
            ef1.v1$b r7 = (ef1.C40871v1.C40873b) r7     // Catch:{ all -> 0x004e }
            r7.mo95246a(r1)     // Catch:{ all -> 0x004e }
        L_0x0031:
            r7 = r2
            ef1.v1$b r7 = (ef1.C40871v1.C40873b) r7     // Catch:{ all -> 0x004e }
            java.lang.Throwable r7 = r7.mo95247d()     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            ef1.v1$b r2 = (ef1.C40871v1.C40873b) r2
            ef1.z1 r7 = r2.mo95169l()
            r6.m118503r0(r7, r0)
        L_0x0049:
            kotlinx.coroutines.internal.a0 r7 = ef1.C40877w1.f96587a
            return r7
        L_0x004e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0051:
            boolean r3 = r2 instanceof ef1.C40824j1
            if (r3 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r6.m118492S(r7)
        L_0x005b:
            r3 = r2
            ef1.j1 r3 = (ef1.C40824j1) r3
            boolean r4 = r3.mo95168k()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r6.m118484G0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.a0 r7 = ef1.C40877w1.f96587a
            return r7
        L_0x006f:
            ef1.y r3 = new ef1.y
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m118485H0(r2, r3)
            kotlinx.coroutines.internal.a0 r4 = ef1.C40877w1.f96587a
            if (r3 == r4) goto L_0x0087
            kotlinx.coroutines.internal.a0 r2 = ef1.C40877w1.f96589c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a2:
            kotlinx.coroutines.internal.a0 r7 = ef1.C40877w1.f96590d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40871v1.m118500m0(java.lang.Object):java.lang.Object");
    }

    /* renamed from: o0 */
    private final C40868u1 m118501o0(C43075l lVar, boolean z) {
        C40868u1 u1Var = null;
        if (z) {
            if (lVar instanceof C40851p1) {
                u1Var = (C40851p1) lVar;
            }
            if (u1Var == null) {
                u1Var = new C40837m1(lVar);
            }
        } else {
            if (lVar instanceof C40868u1) {
                u1Var = (C40868u1) lVar;
            }
            if (u1Var == null) {
                u1Var = new C40841n1(lVar);
            }
        }
        u1Var.mo95228z(this);
        return u1Var;
    }

    /* renamed from: q0 */
    private final C40866u m118502q0(C41610o oVar) {
        while (oVar.mo96388r()) {
            oVar = oVar.mo96394o();
        }
        while (true) {
            oVar = oVar.mo96393n();
            if (!oVar.mo96388r()) {
                if (oVar instanceof C40866u) {
                    return (C40866u) oVar;
                }
                if (oVar instanceof C40889z1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: r0 */
    private final void m118503r0(C40889z1 z1Var, Throwable th) {
        mo95241t0(th);
        CompletionHandlerException completionHandlerException = null;
        for (C41610o oVar = (C41610o) z1Var.mo96392m(); !C41536l.m120484d(oVar, z1Var); oVar = oVar.mo96393n()) {
            if (oVar instanceof C40851p1) {
                C40868u1 u1Var = (C40868u1) oVar;
                try {
                    u1Var.mo95134x(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C41211b.m119461a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + u1Var + " for " + this, th2);
                        C41238w wVar = C41238w.f97225a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo95130f0(completionHandlerException);
        }
        m118489L(th);
    }

    /* renamed from: s0 */
    private final void m118504s0(C40889z1 z1Var, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (C41610o oVar = (C41610o) z1Var.mo96392m(); !C41536l.m120484d(oVar, z1Var); oVar = oVar.mo96393n()) {
            if (oVar instanceof C40868u1) {
                C40868u1 u1Var = (C40868u1) oVar;
                try {
                    u1Var.mo95134x(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C41211b.m119461a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + u1Var + " for " + this, th2);
                        C41238w wVar = C41238w.f97225a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo95130f0(completionHandlerException);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ef1.i1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m118505w0(ef1.C40879x0 r3) {
        /*
            r2 = this;
            ef1.z1 r0 = new ef1.z1
            r0.<init>()
            boolean r1 = r3.mo95168k()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            ef1.i1 r1 = new ef1.i1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f96578d
            androidx.concurrent.futures.C0611b.m2366a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40871v1.m118505w0(ef1.x0):void");
    }

    /* renamed from: x0 */
    private final void m118506x0(C40868u1 u1Var) {
        u1Var.mo96391g(new C40889z1());
        C0611b.m2366a(f96578d, this, u1Var, u1Var.mo96393n());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final CancellationException mo95230C0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = mo95127M();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: E0 */
    public final String mo95231E0() {
        return mo95132p0() + '{' + m118477B0(mo95236d0()) + '}';
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo95157G(Object obj) {
    }

    /* renamed from: H */
    public final boolean mo95232H(Throwable th) {
        return mo95233I(th);
    }

    /* renamed from: I */
    public final boolean mo95233I(Object obj) {
        Object a = C40877w1.f96587a;
        if (mo95221Z() && (a = m118488K(obj)) == C40877w1.f96588b) {
            return true;
        }
        if (a == C40877w1.f96587a) {
            a = m118500m0(obj);
        }
        if (a == C40877w1.f96587a || a == C40877w1.f96588b) {
            return true;
        }
        if (a == C40877w1.f96590d) {
            return false;
        }
        mo95157G(a);
        return true;
    }

    /* renamed from: J */
    public void mo95234J(Throwable th) {
        mo95233I(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public String mo95127M() {
        return "Job was cancelled";
    }

    /* renamed from: N */
    public boolean mo95167N(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo95233I(th) || !mo95220Y()) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public Object mo23734U(Object obj, C43079p pVar) {
        return C40845o1.C40846a.m118415b(this, obj, pVar);
    }

    /* renamed from: Y */
    public boolean mo95220Y() {
        return true;
    }

    /* renamed from: Z */
    public boolean mo95221Z() {
        return false;
    }

    /* renamed from: a */
    public void mo95211a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo95127M(), (Throwable) null, this);
        }
        mo95234J(cancellationException);
    }

    /* renamed from: c */
    public C41752f.C41755b mo23736c(C41752f.C41757c cVar) {
        return C40845o1.C40846a.m118416c(this, cVar);
    }

    /* renamed from: c0 */
    public final C40863t mo95235c0() {
        return (C40863t) this._parentHandle;
    }

    /* renamed from: d0 */
    public final Object mo95236d0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C41624w)) {
                return obj;
            }
            ((C41624w) obj).mo96356c(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public boolean mo95166e0(Throwable th) {
        return false;
    }

    /* renamed from: f0 */
    public void mo95130f0(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public final void mo95237g0(C40845o1 o1Var) {
        if (o1Var == null) {
            mo95245z0(C40780a2.f96511d);
            return;
        }
        o1Var.start();
        C40863t p = o1Var.mo95214p(this);
        mo95245z0(p);
        if (mo95239i0()) {
            p.dispose();
            mo95245z0(C40780a2.f96511d);
        }
    }

    public final C41752f.C41757c getKey() {
        return C40845o1.f96561d3;
    }

    /* renamed from: h0 */
    public final boolean mo95238h0() {
        Object d0 = mo95236d0();
        if ((d0 instanceof C40881y) || ((d0 instanceof C40873b) && ((C40873b) d0).mo95248e())) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public final boolean mo95239i0() {
        return !(mo95236d0() instanceof C40824j1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public boolean mo95159j0() {
        return false;
    }

    /* renamed from: k */
    public boolean mo95131k() {
        Object d0 = mo95236d0();
        if (!(d0 instanceof C40824j1) || !((C40824j1) d0).mo95168k()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void mo95229m(C40791c2 c2Var) {
        mo95233I(c2Var);
    }

    /* renamed from: n */
    public final CancellationException mo95212n() {
        Object d0 = mo95236d0();
        if (d0 instanceof C40873b) {
            Throwable d = ((C40873b) d0).mo95247d();
            if (d != null) {
                CancellationException C0 = mo95230C0(d, C40832l0.m118329a(this) + " is cancelling");
                if (C0 != null) {
                    return C0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (d0 instanceof C40824j1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (d0 instanceof C40881y) {
            return m118480D0(this, ((C40881y) d0).f96602a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(C40832l0.m118329a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    /* renamed from: n0 */
    public final Object mo95240n0(Object obj) {
        Object H0;
        do {
            H0 = m118485H0(mo95236d0(), obj);
            if (H0 == C40877w1.f96587a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m118495W(obj));
            }
        } while (H0 == C40877w1.f96589c);
        return H0;
    }

    /* renamed from: o */
    public final C40870v0 mo95213o(boolean z, boolean z2, C43075l lVar) {
        C40881y yVar;
        C40868u1 o0 = m118501o0(lVar, z);
        while (true) {
            Object d0 = mo95236d0();
            if (d0 instanceof C40879x0) {
                C40879x0 x0Var = (C40879x0) d0;
                if (!x0Var.mo95168k()) {
                    m118505w0(x0Var);
                } else if (C0611b.m2366a(f96578d, this, d0, o0)) {
                    return o0;
                }
            } else {
                Throwable th = null;
                if (d0 instanceof C40824j1) {
                    C40889z1 l = ((C40824j1) d0).mo95169l();
                    if (l != null) {
                        C40870v0 v0Var = C40780a2.f96511d;
                        if (z && (d0 instanceof C40873b)) {
                            synchronized (d0) {
                                th = ((C40873b) d0).mo95247d();
                                if (th == null || ((lVar instanceof C40866u) && !((C40873b) d0).mo95249f())) {
                                    if (m118481E(d0, l, o0)) {
                                        if (th == null) {
                                            return o0;
                                        }
                                        v0Var = o0;
                                    }
                                }
                                C41238w wVar = C41238w.f97225a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return v0Var;
                        } else if (m118481E(d0, l, o0)) {
                            return o0;
                        }
                    } else if (d0 != null) {
                        m118506x0((C40868u1) d0);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z2) {
                        if (d0 instanceof C40881y) {
                            yVar = (C40881y) d0;
                        } else {
                            yVar = null;
                        }
                        if (yVar != null) {
                            th = yVar.f96602a;
                        }
                        lVar.invoke(th);
                    }
                    return C40780a2.f96511d;
                }
            }
        }
    }

    /* renamed from: p */
    public final C40863t mo95214p(C40869v vVar) {
        return (C40863t) C40845o1.C40846a.m118417d(this, true, false, new C40866u(vVar), 2, (Object) null);
    }

    /* renamed from: p0 */
    public String mo95132p0() {
        return C40832l0.m118329a(this);
    }

    /* renamed from: q */
    public C41752f mo23740q(C41752f.C41757c cVar) {
        return C40845o1.C40846a.m118418e(this, cVar);
    }

    /* renamed from: s */
    public final C40870v0 mo95215s(C43075l lVar) {
        return mo95213o(false, true, lVar);
    }

    public final boolean start() {
        int A0;
        do {
            A0 = m118476A0(mo95236d0());
            if (A0 == 0) {
                return false;
            }
        } while (A0 != 1);
        return true;
    }

    /* renamed from: t */
    public CancellationException mo95144t() {
        Throwable th;
        Object d0 = mo95236d0();
        CancellationException cancellationException = null;
        if (d0 instanceof C40873b) {
            th = ((C40873b) d0).mo95247d();
        } else if (d0 instanceof C40881y) {
            th = ((C40881y) d0).f96602a;
        } else if (!(d0 instanceof C40824j1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + m118477B0(d0), th, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public void mo95241t0(Throwable th) {
    }

    public String toString() {
        return mo95231E0() + '@' + C40832l0.m118330b(this);
    }

    /* renamed from: u */
    public C41752f mo23741u(C41752f fVar) {
        return C40845o1.C40846a.m118419f(this, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo95133u0(Object obj) {
    }

    /* renamed from: v */
    public final Object mo95217v(Continuation continuation) {
        if (!m118498k0()) {
            C40859r1.m118444g(continuation.mo94380b());
            return C41238w.f97225a;
        }
        Object l0 = m118499l0(continuation);
        if (l0 == C41793d.m121157c()) {
            return l0;
        }
        return C41238w.f97225a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo95243v0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95244y0(ef1.C40868u1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo95236d0()
            boolean r1 = r0 instanceof ef1.C40868u1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f96578d
            ef1.x0 r2 = ef1.C40877w1.f96593g
            boolean r0 = androidx.concurrent.futures.C0611b.m2366a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof ef1.C40824j1
            if (r1 == 0) goto L_0x0027
            ef1.j1 r0 = (ef1.C40824j1) r0
            ef1.z1 r0 = r0.mo95169l()
            if (r0 == 0) goto L_0x0027
            r4.mo95552t()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40871v1.mo95244y0(ef1.u1):void");
    }

    /* renamed from: z0 */
    public final void mo95245z0(C40863t tVar) {
        this._parentHandle = tVar;
    }
}
